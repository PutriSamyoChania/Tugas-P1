public class PesawatTelpon {
    String speaker, microphone, transmiter;

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public void setTransmiter(String transmiter) {
        this.transmiter = transmiter;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getMicrophone() {
        return microphone;
    }

    public String getTransmiter() {
        return transmiter;
    }

    void menelepon(String p) {
        System.out.println("tekan untuk menelepon");
    }
    
    void meengangkat() {
        System.out.println("hallo dengan siapa");
    }
}