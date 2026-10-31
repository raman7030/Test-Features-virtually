package bin.mt.plugin.api;

import android.content.SharedPreferences;
import java.io.File;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface PluginContext {
    public static final int SDK_VERSION = 3;

    void cancelToast();

    @Deprecated
    LocalString getAssetLocalString(String str);

    InputStream getAssetsAsStream(String str);

    CharSequence getClipboardText();

    String getCountry();

    @Deprecated
    LocalString getFileLocalString(File file, String str);

    File getFilesDir();

    String getHostPackageName();

    int getHostVersionCode();

    String getHostVersionName();

    String getLanguage();

    String getLanguageCountry();

    @Deprecated
    LocalString getLanguageNameLocalString();

    @Deprecated
    LocalString getLocalString();

    String getPluginId();

    String getPluginName();

    int getPluginSdkVersion();

    int getPluginVersionCode();

    String getPluginVersionName();

    SharedPreferences getPreferences();

    String getString(String str);

    String getString(String str, Object... objArr);

    String[] getStringArray(String... strArr);

    List getStringList(String... strArr);

    String getStringNullable(String str);

    boolean hasClipboardText();

    void log(String str);

    void log(String str, Throwable th);

    void log(Throwable th);

    void openBrowser(String str);

    void openBuiltinBrowser(String str, boolean z);

    void openLogViewer();

    void openPreference(Class cls);

    boolean setClipboardText(CharSequence charSequence);

    boolean setClipboardText(CharSequence charSequence, String str);

    void showToast(CharSequence charSequence);

    void showToast(CharSequence charSequence, Object... objArr);

    void showToastL(CharSequence charSequence);

    void showToastL(CharSequence charSequence, Object... objArr);
}
