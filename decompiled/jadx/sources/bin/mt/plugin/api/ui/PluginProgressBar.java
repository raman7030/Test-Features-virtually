package bin.mt.plugin.api.ui;

/* JADX INFO: loaded from: classes.dex */
public interface PluginProgressBar extends PluginView {

    public enum Style {
        HORIZONTAL,
        CIRCULAR,
        CIRCULAR_SMALL,
        CIRCULAR_LARGE
    }

    int getMaxProgress();

    int getProgress();

    int getSecondaryProgress();

    Style getStyle();

    boolean isIndeterminate();

    void setIndeterminate(boolean z);

    void setMaxProgress(int i);

    void setProgress(int i);

    void setSecondaryProgress(int i);
}
