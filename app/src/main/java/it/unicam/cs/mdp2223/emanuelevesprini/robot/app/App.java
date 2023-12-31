/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unicam.cs.mdp2223.emanuelevesprini.robot.app;

import it.unicam.cs.mdp2223.emanuelevesprini.robot.list.LinkedList;

import static it.unicam.cs.mdp2223.emanuelevesprini.robot.utilities.StringUtils.join;
import static it.unicam.cs.mdp2223.emanuelevesprini.robot.utilities.StringUtils.split;
import static it.unicam.cs.mdp2223.emanuelevesprini.robot.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
