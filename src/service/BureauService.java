/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Bureau;

/**
 *
 * @author outah
 */
public class BureauService{
    
    public Bureau creer(){
        Bureau bureau = new Bureau(1, "info");
        return bureau;
    }
}
