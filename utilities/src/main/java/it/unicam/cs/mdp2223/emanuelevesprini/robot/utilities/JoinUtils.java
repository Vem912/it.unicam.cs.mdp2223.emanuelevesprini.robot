/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unicam.cs.mdp2223.emanuelevesprini.robot.utilities;

import it.unicam.cs.mdp2223.emanuelevesprini.robot.list.LinkedList;

class JoinUtils {
    public static String join(LinkedList source) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.size(); ++i) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(source.get(i));
        }

        return result.toString();
    }
}
