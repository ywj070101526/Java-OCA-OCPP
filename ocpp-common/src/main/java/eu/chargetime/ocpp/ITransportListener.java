package eu.chargetime.ocpp;

import eu.chargetime.ocpp.model.SessionInformation;

/**
 * @author ywj
 */
public interface ITransportListener {

    void rawMessageReceived(SessionInformation sessionInformation, String action, String payload);

    void rawMessageSent(SessionInformation sessionInformation, String action, String payload);

}
