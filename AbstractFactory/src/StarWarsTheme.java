import javax.swing.*;

/**
 * Created by Adrien-PC on 07/01/2017.
 */
public class StarWarsTheme extends JButton implements IThemeFactory
{
    public JButton GetButton(){
        return new StarWarsThemeButton().createButton();
    }
}
