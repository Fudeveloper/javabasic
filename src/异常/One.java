package 异常;

/**
 * Class One ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class One {
    public static void main(String[] args) {
        try{
            throw new ServerExcption("reason",80);
        }catch (ServerExcption excption){
            System.out.println(excption);
        }
    }
}

class ServerExcption extends Exception{
    private String reason;
    private int port;

    public ServerExcption(String reason, int port) {
        this.reason = reason;
        this.port = port;
    }

    @Override
    public String toString() {
        return "ServerExcption{" +
                "reason='" + reason + '\'' +
                ", port=" + port +
                '}';
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}