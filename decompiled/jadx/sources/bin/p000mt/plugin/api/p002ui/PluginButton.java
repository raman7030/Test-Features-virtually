package bin.p000mt.plugin.api.p002ui;

/* JADX INFO: loaded from: classes.dex */
public interface PluginButton extends PluginTextView {

    public enum Style {
        DEFAULT,
        FILLED,
        OUTLINED
    }

    Style getStyle();
}
