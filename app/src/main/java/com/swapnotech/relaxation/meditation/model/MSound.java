package com.swapnotech.relaxation.meditation.model;

/**
 * Created by Dev on 11/29/2017.
 */

public class MSound {
    private int id, repeater;
    private String file, icon;
    private boolean isDownload;

    public boolean isDownload() {
        return isDownload;
    }

    public void setDownload(boolean download) {
        isDownload = download;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepeater() {
        return repeater;
    }

    public void setRepeater(int repeater) {
        this.repeater = repeater;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
