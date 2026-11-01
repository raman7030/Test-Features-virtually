package com.tencent.open.web.security;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p067l.C10014;
import p067l.C11060;
import p067l.C24158;
import p067l.C8377;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class JniInterface {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f2141;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    /* JADX INFO: renamed from: d1 */
    public static native String m2040d1(String str);

    /* JADX INFO: renamed from: d2 */
    public static native String m2041d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    /* JADX INFO: renamed from: ֫ */
    public static void m2042() {
        if (f2141) {
            return;
        }
        try {
            Context contextM53410 = C24158.m53410();
            if (contextM53410 == null) {
                C11060.m25469("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + C10014.f27716);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(contextM53410.getFilesDir().toString());
            sb.append("/");
            String str = C10014.f27716;
            sb.append(str);
            File file = new File(sb.toString());
            if (!file.exists()) {
                C11060.m25469("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + str);
            } else {
                if (!m2043(contextM53410, file)) {
                    C11060.m25469("openSDK_LOG.JniInterface", "-->fail, because checkMD5 fail:" + str);
                    return;
                }
                System.load(contextM53410.getFilesDir().toString() + "/" + str);
                f2141 = true;
                StringBuilder sb2 = new StringBuilder("-->load lib success:");
                sb2.append(str);
                C11060.m25469("openSDK_LOG.JniInterface", sb2.toString());
            }
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.JniInterface", "-->load lib error:" + C10014.f27716, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m2043(Context context, File file) {
        Throwable th;
        FileInputStream fileInputStream;
        InputStream inputStream = null;
        strM19511 = null;
        strM19511 = null;
        String strM19511 = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(C10014.f27717);
            try {
                String strM19512 = C8377.m19511(inputStreamOpen);
                if (strM19512 == null || strM19512.isEmpty()) {
                    C11060.m25469("openSDK_LOG.JniInterface", "checkMD5 assets md5 is null");
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                } else {
                    if (file.exists()) {
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                strM19511 = C8377.m19511(fileInputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    C11060.m25465("MD5Utils", "md5 file error", th);
                                    if (fileInputStream != null) {
                                    }
                                    if (strM19511 != null) {
                                        boolean zEquals = strM19512.equals(strM19511);
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        return zEquals;
                                    }
                                    C11060.m25469("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                    return false;
                                } catch (Throwable th3) {
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = null;
                        }
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    if (strM19511 != null && !strM19511.isEmpty()) {
                        boolean zEquals2 = strM19512.equals(strM19511);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return zEquals2;
                    }
                    C11060.m25469("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                }
                return false;
            } catch (Throwable th5) {
                th = th5;
                inputStream = inputStreamOpen;
                try {
                    C11060.m25465("openSDK_LOG.JniInterface", "checkMD5 exception", th);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    C11060.m25467("openSDK_LOG.JniInterface", "checkMD5 return false");
                    return false;
                } catch (Throwable th6) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
