import java.awt.Dimension;

public class CommonConstants {

    // frame //
    public static final Dimension GUI_SIZE = new Dimension(600, 760);

    // banner //
    public static final Dimension BANNER_SIZE = new Dimension(GUI_SIZE.width, 50);

    // task panel //
    public static final Dimension TASKPANEL_SIZE = new Dimension(GUI_SIZE.width - 30, GUI_SIZE.height - 175);

    // add task button //
    public static final Dimension ArButton_BUTTON_SIZE = new Dimension(GUI_SIZE.width, 50);

    // taskcomponent //
    public static final Dimension TASKFIELD_SIZE = new Dimension((int)(TASKPANEL_SIZE.width * 0.80), 45);
    public static final Dimension CHECKBOX_SIZE = new Dimension((int)(TASKFIELD_SIZE.width * 0.05), 45);
    public static final Dimension DELETE_BUTTON_SIZE = new Dimension((int)(TASKFIELD_SIZE.width * 0.12), 45);
}
