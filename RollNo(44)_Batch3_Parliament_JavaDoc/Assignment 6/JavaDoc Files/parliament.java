public class parliament {
    private String chairman;
    private int members;
    private String session;
    
    //constructor
    public parliament(String chairman, int members, String session) {
        this.chairman = chairman;
        this.members = members;
        this.session = session;
    }

    public String getChairman(){
        return chairman;
    }

    public void  setChairman(String chairman) {
        this.chairman = chairman;
    }

    public int getMembers(){
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getSession(){
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    }
