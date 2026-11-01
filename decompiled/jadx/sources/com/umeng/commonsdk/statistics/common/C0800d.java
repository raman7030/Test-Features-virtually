package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.d */
/* JADX INFO: compiled from: E6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800d {

    /* JADX INFO: renamed from: a */
    public static C0800d f3379a = null;

    /* JADX INFO: renamed from: b */
    public static Context f3380b = null;

    /* JADX INFO: renamed from: c */
    public static String f3381c = null;

    /* JADX INFO: renamed from: e */
    public static final String f3382e = "mobclick_agent_user_";

    /* JADX INFO: renamed from: f */
    public static final String f3383f = "mobclick_agent_header_";

    /* JADX INFO: renamed from: g */
    public static final String f3384g = "mobclick_agent_cached_";

    /* JADX INFO: renamed from: d */
    public a f3385d;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.d$b */
    /* JADX INFO: compiled from: E6B4 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m3031a(File file);

        /* JADX INFO: renamed from: b */
        boolean m3032b(File file);

        /* JADX INFO: renamed from: c */
        void m3033c(File file);
    }

    public C0800d(Context context) {
        this.f3385d = new a(context);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0800d m3016a(Context context) {
        f3380b = context.getApplicationContext();
        f3381c = context.getPackageName();
        if (f3379a == null) {
            f3379a = new C0800d(context);
        }
        return f3379a;
    }

    /* JADX INFO: renamed from: a */
    public void m3019a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3380b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3018a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3380b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public String m3022b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3380b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m3020a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3380b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m3023c() {
        return UMFrUtils.envelopeFileNumber(f3380b) > 0;
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.d$a */
    /* JADX INFO: compiled from: E6B4 */
    public class a {

        /* JADX INFO: renamed from: a */
        public final int f3386a;

        /* JADX INFO: renamed from: b */
        public File f3387b;

        /* JADX INFO: renamed from: c */
        public FilenameFilter f3388c;

        public a(Context context) {
            this(context, ".um");
        }

        public a(Context context, String str) {
            this.f3386a = 10;
            this.f3388c = new FilenameFilter() { // from class: com.umeng.commonsdk.statistics.common.d.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return str2.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f3387b = file;
            if (file.exists() && this.f3387b.isDirectory()) {
                return;
            }
            this.f3387b.mkdir();
        }

        /* JADX INFO: renamed from: a */
        public boolean m3028a() {
            File[] fileArrListFiles = this.f3387b.listFiles();
            return fileArrListFiles != null && fileArrListFiles.length > 0;
        }

        /* JADX INFO: renamed from: a */
        public void m3026a(b bVar) {
            File file;
            File[] fileArrListFiles = this.f3387b.listFiles(this.f3388c);
            if (fileArrListFiles != null && fileArrListFiles.length >= 10) {
                Arrays.sort(fileArrListFiles);
                int length = fileArrListFiles.length - 10;
                for (int i = 0; i < length; i++) {
                    fileArrListFiles[i].delete();
                }
            }
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            bVar.m3031a(this.f3387b);
            int length2 = fileArrListFiles.length;
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                    if (bVar.m3032b(fileArrListFiles[i2])) {
                        file = fileArrListFiles[i2];
                        file.delete();
                    }
                } catch (Throwable unused) {
                    file = fileArrListFiles[i2];
                }
            }
            bVar.m3033c(this.f3387b);
        }

        /* JADX INFO: renamed from: a */
        public void m3027a(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                return;
            }
            Locale locale = Locale.US;
            try {
                HelperUtils.writeFile(new File(this.f3387b, "um_cache_" + System.currentTimeMillis() + ".env"), bArr);
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3029b() {
            File[] fileArrListFiles = this.f3387b.listFiles(this.f3388c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }

        /* JADX INFO: renamed from: c */
        public int m3030c() {
            File[] fileArrListFiles = this.f3387b.listFiles(this.f3388c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return 0;
            }
            return fileArrListFiles.length;
        }
    }

    /* JADX INFO: renamed from: f */
    private SharedPreferences m3017f() {
        return f3380b.getSharedPreferences("mobclick_agent_user_" + f3381c, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m3021a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m3017f().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: d */
    public String[] m3024d() {
        try {
            SharedPreferences sharedPreferencesM3017f = m3017f();
            String string = sharedPreferencesM3017f.getString("au_p", null);
            String string2 = sharedPreferencesM3017f.getString("au_u", null);
            if (string == null || string2 == null) {
                return null;
            }
            return new String[]{string, string2};
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3025e() {
        m3017f().edit().remove("au_p").remove("au_u").commit();
    }
}
