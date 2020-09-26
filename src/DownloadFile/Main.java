package DownloadFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Downloader downloader = new Downloader();
        Thread thread = new Thread(downloader);
        thread.start();

        progressBar progressBar = new progressBar();
        Thread thread1 = new Thread(progressBar);
        thread1.start();
    }
}
