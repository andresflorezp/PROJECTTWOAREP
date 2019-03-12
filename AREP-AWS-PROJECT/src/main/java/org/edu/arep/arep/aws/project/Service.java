/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edu.arep.arep.aws.project;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Service implements RequestHandler<Integer, String>{
    
    public String myHandler(int myCount, Context context) {
        return String.valueOf(myCount);
    }

    @Override
    public String handleRequest(Integer i, Context cntxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}