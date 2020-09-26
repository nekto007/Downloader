package DownloadFile;

public class progressBar extends Thread {
    public void progress() throws InterruptedException {
        for (int i = 0; i < 101; i += 5) {
            System.out.println("Статус загрузки файла: " + i + "%");
            Thread.sleep(500);
        }
        System.out.println("Файл загружен успешно.");
    }

    @Override
    public void run() {
        try {
            progress();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}