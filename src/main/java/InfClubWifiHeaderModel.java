
import com.api.InformationClubWifi.model.InfClubWifiReplyToModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APerez
 */
public class InfClubWifiHeaderModel {
    
    @JsonProperty("MessageID")
    private String messageID;
    
    @JsonProperty("ReplyTo")
    private List<InfClubWifiReplyToModel> replyTo = null;

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public List<InfClubWifiReplyToModel> getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(List<InfClubWifiReplyToModel> replyTo) {
        this.replyTo = replyTo;
    }
  
}
