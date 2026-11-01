package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.C0814a;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p067l.C10965;
import p067l.C13853;

/* JADX INFO: loaded from: classes.dex */
public class UMFrUtils {
    public static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    public static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    public static String mDefaultEnvelopeDir = "envelope";
    public static String mDefaultEnvelopeDirPath = null;
    public static Object mEnvelopeBuildTimeLock = new Object();
    public static Object mEnvelopeFileLock = new Object();
    public static String sCurrentProcessName = "";

    public static String getProcessName(int i) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                return line;
            } catch (Throwable unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
    }

    public static String getCurrentProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(sCurrentProcessName)) {
            try {
                String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
                if (TextUtils.isEmpty(processName)) {
                    int iMyPid = Process.myPid();
                    String processName2 = getProcessName(iMyPid);
                    if (!TextUtils.isEmpty(processName2)) {
                        sCurrentProcessName = processName2;
                    } else {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.pid == iMyPid) {
                                    sCurrentProcessName = runningAppProcessInfo.processName;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    sCurrentProcessName = processName;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context.getApplicationContext(), th);
            }
        }
        return sCurrentProcessName;
    }

    public static String getSubProcessName(Context context) {
        String strSubstring = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int iIndexOf = currentProcessName.indexOf(":");
            strSubstring = iIndexOf >= 0 ? currentProcessName.substring(iIndexOf + 1) : "";
            if (iIndexOf >= 0) {
                return strSubstring;
            }
            String packageName = context.getPackageName();
            return currentProcessName.length() > packageName.length() ? currentProcessName.substring(packageName.length() + 1, currentProcessName.length()) : currentProcessName;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return strSubstring;
        }
    }

    public static boolean checkPermission(Context context, String str) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(applicationContext, th);
                }
            } else {
                try {
                    if (applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) == 0) {
                        return true;
                    }
                } catch (Throwable th2) {
                    UMCrashManager.reportCrash(applicationContext, th2);
                }
            }
        }
        return false;
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return false;
        }
    }

    public static int envelopeFileNumber(Context context) {
        String[] list;
        if (context != null) {
            try {
                File file = new File(getEnvelopeDirPath(context));
                synchronized (mEnvelopeFileLock) {
                    if (file.isDirectory() && (list = file.list()) != null) {
                        return list.length;
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
        return 0;
    }

    public static long getDistanceDays(long j, long j2) {
        return (j < j2 ? j2 - j : j - j2) / 86400000;
    }

    public static void removeRedundantEnvelopeFiles(Context context, int i) {
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > i) {
                Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.umeng.commonsdk.framework.UMFrUtils.1
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long jLastModified = file2.lastModified() - file3.lastModified();
                        if (jLastModified > 0) {
                            return 1;
                        }
                        return jLastModified == 0 ? 0 : -1;
                    }
                });
                if (fileArrListFiles.length > i) {
                    for (int i2 = 0; i2 < fileArrListFiles.length - i; i2++) {
                        try {
                            if (!fileArrListFiles[i2].delete()) {
                                ULog.m2971d("--->>> remove [" + i2 + "] file fail.");
                            }
                        } catch (Throwable th) {
                            UMCrashManager.reportCrash(context, th);
                        }
                    }
                }
            }
        }
    }

    public static File getEnvelopeFile(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.umeng.commonsdk.framework.UMFrUtils.2
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long jLastModified = file2.lastModified() - file3.lastModified();
                        if (jLastModified > 0) {
                            return 1;
                        }
                        return jLastModified == 0 ? 0 : -1;
                    }
                });
                return fileArrListFiles[0];
            }
            return null;
        }
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context == null) {
            return;
        }
        try {
            String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
            if (!TextUtils.isEmpty(legacyEnvelopeDir) && !legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                File file = new File(context.getFilesDir().getAbsolutePath() + "/." + legacyEnvelopeDir);
                if (file.exists()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        try {
                            if (file.isDirectory()) {
                                file.delete();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            UMCrashManager.reportCrash(context, th);
                            return;
                        }
                    }
                    try {
                        String envelopeDirPath = getEnvelopeDirPath(context);
                        for (int i = 0; i < fileArrListFiles.length; i++) {
                            fileArrListFiles[i].renameTo(new File(envelopeDirPath + File.separator + fileArrListFiles[i].getName()));
                        }
                        if (file.isDirectory()) {
                            file.delete();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        UMCrashManager.reportCrash(context, th2);
                        return;
                    }
                    UMCrashManager.reportCrash(context, th);
                }
            }
        } catch (Throwable th3) {
            UMCrashManager.reportCrash(context, th3);
        }
    }

    public static String getLegacyEnvelopeDir(Context context) {
        try {
            String currentProcessName = getCurrentProcessName(context);
            if (!TextUtils.isEmpty(currentProcessName)) {
                String strReplace = currentProcessName.replace(':', '_');
                ULog.m2971d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                return strReplace;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return mDefaultEnvelopeDir;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    mDefaultEnvelopeDirPath = context.getFilesDir().getAbsolutePath() + File.separator + "." + mDefaultEnvelopeDir;
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.m2971d("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
            str = mDefaultEnvelopeDirPath;
        }
        return str;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_SUCC_BUILD_TIME, 0L);
        }
        return j;
    }

    public static long getLastInstantBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, 0L);
        }
        return j;
    }

    public static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    public static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    public static int saveEnvelopeFile(Context context, String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            return 101;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getEnvelopeDirPath(context));
        File file = new File(C10965.m25286(sb, File.separator, str));
        synchronized (mEnvelopeFileLock) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                        boolean zM3092a = C0814a.m3088a(context).m3092a(str);
                        boolean zM3094b = C0814a.m3088a(context).m3094b(str);
                        if (zM3092a) {
                            updateLastSuccessfulBuildTime(context);
                        }
                        if (zM3094b) {
                            updateLastInstantBuildTime(context);
                        }
                        return 0;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        UMCrashManager.reportCrash(context, e);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                        }
                        return 101;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                UMCrashManager.reportCrash(context, th3);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
            }
        }
    }

    public static boolean removeEnvelopeFile(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        return file.delete();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
            return true;
        }
    }

    public static byte[] toByteArray(String str) {
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
            try {
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(str, "r").getChannel());
                    MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size()).load();
                    bArr = new byte[(int) fileChannelConvertMaybeLegacyFileChannelFromLibrary.size()];
                    if (mappedByteBufferLoad.remaining() > 0) {
                        mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                        try {
                            fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                        } catch (Throwable th) {
                            UMCrashManager.reportCrash(appContext, th);
                        }
                    } else {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    }
                } catch (IOException e) {
                    UMCrashManager.reportCrash(appContext, e);
                    throw e;
                }
            } catch (Throwable th2) {
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                } catch (Throwable th3) {
                    UMCrashManager.reportCrash(appContext, th3);
                }
                throw th2;
            }
            throw th;
        }
        return bArr;
    }

    public static boolean hasEnvelopeFile(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        String str = C0655am.f2320av;
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
            str = C0655am.f2275aC;
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_ZeroEnv) {
            str = C0655am.f2276aD;
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_Silent) {
            str = C0655am.f2279aG;
        }
        String str2 = str;
        String envelopeDirPath = getEnvelopeDirPath(context);
        if (envelopeDirPath == null) {
            return false;
        }
        File file = new File(envelopeDirPath);
        synchronized (mEnvelopeFileLock) {
            try {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.getName().startsWith(str2)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
