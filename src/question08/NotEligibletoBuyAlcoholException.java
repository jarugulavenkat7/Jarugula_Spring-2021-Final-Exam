/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class NotEligibletoBuyAlcoholException extends Exception {

    /**
     * Creates a new instance of <code>NotEligibletoBuyAlcoholException</code>
     * without detail message.
     */
    public NotEligibletoBuyAlcoholException() {
    }

    /**
     * Constructs an instance of <code>NotEligibletoBuyAlcoholException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NotEligibletoBuyAlcoholException(String msg) {
        super(msg);
    }
}
