public class CycleFactory{
    public String createCycle(String channel){
        if (channel==null || channel.isEmpty())
            return null;
        if ("Unicycle".equals(channel))
            return new Unicycle().factories();
        else if ("Bicycle".equals(channel))
            return new Bicycle().factories();
        else if ("Tricycle".equals(channel))
            return new Tricycle().factories();
        return null;
    }
}