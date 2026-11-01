package p067l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9718 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f26845 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static ConcurrentMapC12768 f26846 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public static String m22691(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        if (i != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22694(Context context, String str) {
        String strM22690 = m22690();
        if (context != null && str != null && strM22690 != null && !"com.tencent.mobileqq".equals(str)) {
            "com.tencent.tim".equals(str);
        }
        PackageInfo packageInfoM22698 = m22698(context, str);
        if (packageInfoM22698 == null) {
            C11060.m25467("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
            return null;
        }
        return packageInfoM22698.versionName;
    }

    /* JADX INFO: renamed from: ۧ */
    public static PackageInfo m22698(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (C9718.class) {
            ConcurrentMapC12768 concurrentMapC12768 = f26846;
            if (concurrentMapC12768.containsKey(str)) {
                C22280 c22280 = (C22280) concurrentMapC12768.get(str);
                if (c22280 == null) {
                    C11060.m25467("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = c22280.f70406;
                if (packageInfo == null) {
                    C11060.m25467("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            }
            PackageInfo packageInfoM22700 = m22700(context, str);
            concurrentMapC12768.put(str, new C22280(packageInfoM22700));
            return packageInfoM22700;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static PackageInfo m22700(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                C11060.m25467("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            }
            return packageInfo;
        } catch (Exception e) {
            if (e instanceof PackageManager.NameNotFoundException) {
                C11060.m25467("openSDK_LOG.SystemUtils", "realGetPackageInfo NameNotFoundException. packageName= " + str);
                return null;
            }
            C11060.m25465("openSDK_LOG.SystemUtils", "realGetPackageInfo Exception. packageName= " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22689(String str, String str2) {
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i) {
            return 1;
        }
        return strArrSplit2.length > i ? -1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22697(Context context, Intent intent) {
        boolean z = false;
        if (context != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                C11060.m25469("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String strM22694 = m22694(context, packageName);
            if (strM22694 != null && !strM22694.isEmpty()) {
                z = true;
            }
            C11060.m25469("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + strM22694);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22693(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.SystemUtils", "getAppName exception", th);
            try {
                int i = applicationInfo.labelRes;
                return i <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
            } catch (Throwable th2) {
                C11060.m25465("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th2);
                return "";
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m22696(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        C11060.m25469("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: ".concat(str));
        Context contextM53410 = C24158.m53410();
        if (contextM53410 == null) {
            C11060.m25469("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
            return;
        }
        SharedPreferences sharedPreferences = contextM53410.getSharedPreferences("secure_lib", 0);
        File file = new File(contextM53410.getFilesDir(), str2);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        } else {
            int i = sharedPreferences.getInt("version", 0);
            C11060.m25469("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: 6 | oldVersion: " + i);
            if (6 == i) {
                return;
            }
        }
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpen = contextM53410.getAssets().open(str);
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = contextM53410.openFileOutput(str2, 0);
                    try {
                        m22695(inputStreamOpen, fileOutputStreamOpenFileOutput);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putInt("version", 6);
                        editorEdit.commit();
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStreamOpenFileOutput;
                        FileOutputStream fileOutputStream4 = fileOutputStream2;
                        inputStream = inputStreamOpen;
                        fileOutputStream = fileOutputStream4;
                        try {
                            C11060.m25465("openSDK_LOG.SystemUtils", "-->extractSecureLib, when copy lib execption.", e);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (fileOutputStream == null) {
                            } else {
                                fileOutputStream.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException unused5) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream3 = fileOutputStreamOpenFileOutput;
                        FileOutputStream fileOutputStream5 = fileOutputStream3;
                        inputStream = inputStreamOpen;
                        fileOutputStream = fileOutputStream5;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException unused6) {
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22695(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                fileOutputStream.write(bArr, 0, i);
                j += (long) i;
            } else {
                C11060.m25469("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m22699(Context context) {
        m22690();
        boolean z = m22698(context, "com.tencent.mobileqq") != null;
        C11060.m25469("openSDK_LOG.SystemUtils", "isQQInstalled " + z);
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22692(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            C11060.m25469("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            C11060.m25465("openSDK_LOG.SystemUtils", "NameNotFoundException", e);
            return null;
        } catch (Exception e2) {
            C11060.m25465("openSDK_LOG.SystemUtils", "Exception", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22690() {
        String strM30864 = C13562.m30864();
        if (strM30864 != null && !strM30864.isEmpty()) {
            return strM30864;
        }
        C11060.m25467("openSDK_LOG.SystemUtils", "getAppId error: " + strM30864);
        return strM30864;
    }
}
