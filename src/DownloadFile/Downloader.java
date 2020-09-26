package DownloadFile;

import java.io.*;
import java.net.URL;

public class Downloader extends Thread {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    final String FILE_URL;
    public Downloader() throws IOException {
        System.out.println("Введите ссылку на файл: ");
        FILE_URL = bf.readLine();
    }
    @Override
    public void run() {

        downloader();
    }
    public void downloader() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream("edp.txt")) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}