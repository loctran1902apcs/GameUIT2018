package apcs.chillme;

public class PictureInfo {
    int picresource;
    String picName;

    public PictureInfo(String name,int res)
    {
        this.picName=name;
        picresource=res;
    }

    public int getPicresource() {
        return picresource;
    }

    public String getPicName() {
        return picName;
    }
}
