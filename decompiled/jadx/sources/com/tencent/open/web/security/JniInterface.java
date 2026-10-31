package com.tencent.open.web.security;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import l.C22927;
import l.C6322;
import l.C8045;
import l.C9145;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class JniInterface {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f907;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    public static native String d1(String str);

    public static native String d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m925() {
        if (f907) {
            return;
        }
        try {
            Context contextM51019 = C22927.m51019();
            if (contextM51019 == null) {
                C9145.m23518("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + C8045.f24802);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(contextM51019.getFilesDir().toString());
            sb.append("/");
            String str = C8045.f24802;
            sb.append(str);
            File file = new File(sb.toString());
            if (!file.exists()) {
                C9145.m23518("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + str);
            } else {
                if (!m926(contextM51019, file)) {
                    C9145.m23518("openSDK_LOG.JniInterface", "-->fail, because checkMD5 fail:" + str);
                    return;
                }
                System.load(contextM51019.getFilesDir().toString() + "/" + str);
                f907 = true;
                StringBuilder sb2 = new StringBuilder("-->load lib success:");
                sb2.append(str);
                C9145.m23518("openSDK_LOG.JniInterface", sb2.toString());
            }
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.JniInterface", "-->load lib error:" + C8045.f24802, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m926(Context context, File file) {
        Throwable th;
        FileInputStream fileInputStream;
        InputStream inputStream = null;
        strM17571 = null;
        strM17571 = null;
        String strM17571 = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(C8045.f24803);
            try {
                String strM17572 = C6322.m17571(inputStreamOpen);
                if (strM17572 == null || strM17572.isEmpty()) {
                    C9145.m23518("openSDK_LOG.JniInterface", "checkMD5 assets md5 is null");
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
                                strM17571 = C6322.m17571(fileInputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    C9145.m23514("MD5Utils", "md5 file error", th);
                                    if (fileInputStream != null) {
                                    }
                                    if (strM17571 != null) {
                                        boolean zEquals = strM17572.equals(strM17571);
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        return zEquals;
                                    }
                                    C9145.m23518("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
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
                    if (strM17571 != null && !strM17571.isEmpty()) {
                        boolean zEquals2 = strM17572.equals(strM17571);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return zEquals2;
                    }
                    C9145.m23518("openSDK_LOG.JniInterface", "checkMD5 file md5 is null");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                }
                return false;
            } catch (Throwable th5) {
                th = th5;
                inputStream = inputStreamOpen;
                try {
                    C9145.m23514("openSDK_LOG.JniInterface", "checkMD5 exception", th);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    C9145.m23516("openSDK_LOG.JniInterface", "checkMD5 return false");
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
