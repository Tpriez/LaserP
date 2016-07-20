package com.jayco.laserprinting;

/**
 * Created by Mengly on 2016-07-19.
 */
import android.content.pm.ActivityInfo;

public class PainterSettings {
    public BrushPreset preset = null;
    public String lastPicture = null;
    public boolean forceOpenFile = false;
    public int orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
}