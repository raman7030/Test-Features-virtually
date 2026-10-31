package bin.mt.plugin.api.ui;

/* JADX INFO: loaded from: classes.dex */
public interface PluginButton extends PluginTextView {

    public enum Style {
        DEFAULT,
        FILLED,
        OUTLINED
    }

    Style getStyle();
}
