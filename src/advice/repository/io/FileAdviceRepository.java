package advice.repository.io;

import advice.repository.AdviceRepository;

import java.io.*;

public class FileAdviceRepository implements AdviceRepository {

    private final String file = "C:\\Users\\fazlu\\advicelist.txt";

    @Override
    public void write(String message) {

        try (Writer source = new FileWriter(file);
             BufferedWriter data = new BufferedWriter(source)) {
            data.append(message).flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String read() {
        final StringBuilder content = new StringBuilder();

        try (Reader source = new FileReader(file);
             BufferedReader data = new BufferedReader(source)) {
            while (data.ready()) {
                content.append(data.readLine()).append('\n');
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return content.toString();
    }
}
