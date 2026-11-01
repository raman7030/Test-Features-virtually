package bin.p000mt.plugin.api.p002ui;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginRadioGroup extends PluginLinearLayout {

    /* JADX INFO: loaded from: classes.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(PluginRadioGroup pluginRadioGroup, PluginRadioButton pluginRadioButton, int i);
    }

    void check(int i);

    void check(String str);

    void clearCheck();

    PluginRadioButton getCheckedRadioButton();

    String getCheckedRadioButtonId();

    int getCheckedRadioButtonPosition();

    void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener);
}
