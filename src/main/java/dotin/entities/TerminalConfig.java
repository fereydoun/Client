package dotin.entities;

/**
 * Created by Dotin school 5 on 2/7/2015.
 */
public class TerminalConfig {

    private String terminalID;
    private String terminalType;
    private String terminalIP;
    private int terminalPort;

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalIP() {
        return terminalIP;
    }

    public void setTerminalIP(String terminalIP) {
        this.terminalIP = terminalIP;
    }

    public int getTerminalPort() {
        return terminalPort;
    }

    public void setTerminalPort(int terminalPort) {
        this.terminalPort = terminalPort;
    }
}
