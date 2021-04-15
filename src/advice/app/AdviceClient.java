package advice.app;

import advice.app.view.AdviceView;

import javax.swing.*;

public class AdviceClient {

    public static void main(String[] args) {
        System.out.println("Client running...");

        SwingUtilities.invokeLater(() -> {
            final JFrame window = new AdviceView();

            window.setVisible(true);
        });
    }
}
