/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranxactive.paymentprocessor.gateways;

/**
 *
 * @author ilyas <m.ilyas@live.com>
 */
public class GatewayFactory {

    public static Gateway getGateway(AvailableGateways availableGateways) {

        switch (availableGateways) {
            case AUTHORIZE:
                return new AuthorizeGateway();
        }

        return null;
    }

}