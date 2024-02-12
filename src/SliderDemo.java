import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame = new JFrame("Slider Demo");
    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    JSlider slider = new JSlider(0,100,50);

    SliderDemo() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());




        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,25));

        //slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("°C = "+ slider.getValue());
        slider.addChangeListener(this);


        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = "+ slider.getValue());

    }
}
