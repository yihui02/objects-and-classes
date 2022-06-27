package tv;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;
    
    // This is a no-arg constructor
    public TV() {
        this.channel = 5;
        this.volumeLevel = 97;
        on = true;
    }
    
    // This method changes the on variable to true
    public void turnOn() { on = true; }
    
    // This method changes the on variable to false
    public void turnOff() { on = false; }
    
    // This is a setter / mutator method for channel
    public void setChannel(int newChannel) { channel = newChannel; }
    
    // This is a setter / mutator method for volumeLevel
    public void setVolume(int newVolumeLevel) { volumeLevel = newVolumeLevel; }
    
    // This is a getter / accessor method for channel
    public int getChannel() { return channel; }
    
    // This is a getter / accessor method for volumeLevel
    public int getVolume() { return volumeLevel; }
    
    // This is a getter / accessor method for on
    public boolean getOn() { return on; }
    
    // This method increases channel value
    public void channelUp() { channel++; }
    
    // This method decreases channel value
    public void channelDown() { channel--; }
    
    // This method increases volumeLevel value
    public void volumeUp() { volumeLevel++; }
    
    // This method decreases volumeLevel value
    public void volumeDown() { volumeLevel--; }
    
    public void TVInfo() {
        if (this.channel == 0 || this.channel == 10) {
            channel = 1;
        }
        
        System.out.println("****************************************************");
        System.out.println("The TV is currently " + ((this.on)? "on": "off") + ".");
        System.out.println("You are watching channel " + this.channel + ".");
        System.out.println("The volume is " + this.volumeLevel + ".");
        System.out.println("****************************************************");
        
        /*
            (this.on)? "on": "off") is a shorthand if-else statement
            It is equivalent to:
            if(this.on) {
                System.out.print("on");
            } else {
                System.out.print("off");
            }
        */
    }
}
