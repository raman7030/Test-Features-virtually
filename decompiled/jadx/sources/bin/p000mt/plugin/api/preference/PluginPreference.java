package bin.p000mt.plugin.api.preference;

import bin.p000mt.plugin.api.LocalString;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.PluginUI;

/* JADX INFO: loaded from: classes.dex */
public interface PluginPreference {

    public interface Builder {
        Header addHeader(CharSequence charSequence);

        Header addHeader(CharSequence charSequence, String str);

        Input addInput(CharSequence charSequence, String str);

        List addList(CharSequence charSequence, String str);

        Switch addSwitch(CharSequence charSequence, String str);

        Text addText(CharSequence charSequence);

        Text addText(CharSequence charSequence, String str);

        Builder onCreated(OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener);

        Builder onPreferenceChange(OnPreferenceChangeListener onPreferenceChangeListener);

        @Deprecated
        void setLocalString(LocalString localString);

        Builder subtitle(CharSequence charSequence);

        Builder title(CharSequence charSequence);
    }

    public interface Header {
        Header enable(boolean z);

        Header visible(boolean z);
    }

    public interface Input {

        public interface Validator {
            String validate(String str);
        }

        Input defaultValue(CharSequence charSequence);

        Input enable(boolean z);

        Input hint(CharSequence charSequence);

        Input inputType(int i);

        Input interceptClick(OnClickInterceptListener onClickInterceptListener);

        Input summary(CharSequence charSequence);

        Input validator(Validator validator);

        Input valueAsSummary();

        Input visible(boolean z);
    }

    public interface List {

        public interface Item {
            Item addItem(CharSequence charSequence, String str);

            Item summary(CharSequence charSequence);
        }

        Item addItem(CharSequence charSequence, String str);

        List defaultValue(String str);

        List enable(boolean z);

        List interceptClick(OnClickInterceptListener onClickInterceptListener);

        List summary(CharSequence charSequence);

        List visible(boolean z);
    }

    public interface OnClickInterceptListener {
        boolean onClick(PluginUI pluginUI, PreferenceItem preferenceItem);
    }

    public interface OnPreferenceChangeListener {
        void onChange(PluginUI pluginUI, PreferenceItem preferenceItem, Object obj);
    }

    public interface OnPreferenceScreenCreatedListener {
        void onPreferenceScreenCreated(PluginUI pluginUI, PreferenceScreen preferenceScreen);
    }

    public interface OnTextItemClickListener {
        void onClick(PluginUI pluginUI, PreferenceItem preferenceItem);
    }

    public interface PreferenceHeader {
        String getKey();

        PreferenceScreen getPreferenceScreen();

        CharSequence getTitle();

        boolean isEnabled();

        boolean isVisible();

        void setEnabled(boolean z);

        void setTitle(CharSequence charSequence);

        void setVisible(boolean z);
    }

    public interface PreferenceItem {
        String getKey();

        PreferenceScreen getPreferenceScreen();

        CharSequence getSummary();

        CharSequence getTitle();

        boolean isEnabled();

        boolean isVisible();

        void setEnabled(boolean z);

        void setSummary(CharSequence charSequence);

        void setTitle(CharSequence charSequence);

        void setVisible(boolean z);
    }

    public interface PreferenceScreen {
        PreferenceHeader findHeader(String str);

        PreferenceItem findPreference(String str);

        CharSequence getSubtitle();

        CharSequence getTitle();

        void recreate();

        PreferenceHeader requireHeader(String str);

        PreferenceItem requirePreference(String str);

        void setSubtitle(CharSequence charSequence);

        void setTitle(CharSequence charSequence);
    }

    public interface Switch {
        Switch defaultValue(boolean z);

        Switch enable(boolean z);

        Switch interceptClick(OnClickInterceptListener onClickInterceptListener);

        Switch summary(CharSequence charSequence);

        Switch summaryOff(CharSequence charSequence);

        Switch summaryOn(CharSequence charSequence);

        Switch visible(boolean z);
    }

    public interface Text {
        Text enable(boolean z);

        Text interceptClick(OnClickInterceptListener onClickInterceptListener);

        Text onClick(OnTextItemClickListener onTextItemClickListener);

        Text summary(CharSequence charSequence);

        Text url(String str);

        Text visible(boolean z);
    }

    void onBuild(PluginContext pluginContext, Builder builder);
}
