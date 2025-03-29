/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

/**
 *
 * @author Dell
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class Scanner {
    public static void main(String[] args) throws SocketException {
        String subnet = getSubnet();
        if (subnet == null) {
            System.out.println("No se pudo determinar la subred.");
            return;
        }
        System.out.println("Escaneando: " + subnet + "0/24");

        int activeDevices = 0; // Contador de dispositivos activos
        for (int i = 1; i < 255; i++) {
            String host = subnet + i;
            if (isHostAlive(host)) {
                System.out.println("Activo: " + host);
                activeDevices++;
            }
        }
        System.out.println("Total de dispositivos activos: " + activeDevices);
    }

    private static String getSubnet() throws SocketException {
        for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            for (InetAddress addr : Collections.list(ni.getInetAddresses())) {
                if (addr.isSiteLocalAddress()) {
                    return addr.getHostAddress().replaceAll("\\d+$", "");
                }
            }
        }
        return null;
    }

    private static boolean isHostAlive(String host) {
        try {
            return InetAddress.getByName(host).isReachable(200);
        } catch (IOException e) {
            return false;
        }
    }
}
