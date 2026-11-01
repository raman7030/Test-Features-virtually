package p067l;

import android.content.AttributionSource;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextParams;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.UserHandle;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: l.ۛۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes2.dex */
public class C8053 extends ContextWrapper {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final Handler f21218 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܿ֫ */
    public static final ExecutorC14088 f21219 = new ExecutorC14088();

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final /* synthetic */ int f21220 = 0;

    /* JADX INFO: renamed from: ֡ */
    public final File f21221;

    /* JADX INFO: renamed from: ֨ */
    public final Signature f21222;

    /* JADX INFO: renamed from: ֫ */
    public final File f21223;

    /* JADX INFO: renamed from: ֫֫ */
    public final File f21224;

    /* JADX INFO: renamed from: ۖ */
    public final C12077 f21225;

    /* JADX INFO: renamed from: ۗ */
    public final File f21226;

    /* JADX INFO: renamed from: ۘ */
    public final File f21227;

    /* JADX INFO: renamed from: ۙ */
    public final File f21228;

    /* JADX INFO: renamed from: ۚ */
    public final ConcurrentMapC12768 f21229;

    /* JADX INFO: renamed from: ۛ */
    public final File f21230;

    /* JADX INFO: renamed from: ۜ */
    public final File f21231;

    /* JADX INFO: renamed from: ۟ */
    public final String f21232;

    /* JADX INFO: renamed from: ۠ */
    public final File f21233;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f21234;

    /* JADX INFO: renamed from: ۢ */
    public C8053 f21235;

    /* JADX INFO: renamed from: ۤ */
    public final File f21236;

    /* JADX INFO: renamed from: ۧ */
    public final ApplicationInfo f21237;

    /* JADX INFO: renamed from: ۧ֫ */
    public final File f21238;

    /* JADX INFO: renamed from: ۨ */
    public final File f21239;

    /* JADX INFO: renamed from: ۫ */
    public final File f21240;

    /* JADX INFO: renamed from: ۬ */
    public final File f21241;

    /* JADX INFO: renamed from: ܰ */
    public final File f21242;

    /* JADX INFO: renamed from: ܳ */
    public final ContentResolver f21243;

    /* JADX INFO: renamed from: ܶ */
    public final File f21244;

    /* JADX INFO: renamed from: ܺ */
    public final File f21245;

    /* JADX INFO: renamed from: ܽ */
    public Context f21246;

    /* JADX INFO: renamed from: ܽ֫ */
    public final WindowManagerC9394 f21247;

    /* JADX INFO: renamed from: ܿ */
    public final C13418 f21248;

    /* JADX INFO: renamed from: ᩳ */
    public final AssetManager f21249;

    /* JADX INFO: renamed from: ᩴ */
    public final C15428 f21250;

    /* JADX INFO: renamed from: ᩵ */
    public final Resources f21251;

    /* JADX INFO: renamed from: ᩶ */
    public final File f21252;

    /* JADX INFO: renamed from: ᩷ */
    public final File f21253;

    /* JADX INFO: renamed from: ᩸ */
    public final File f21254;

    /* JADX INFO: renamed from: ᩹ */
    public final File f21255;

    /* JADX INFO: renamed from: ᩺ */
    public final File f21256;

    /* JADX INFO: renamed from: ᩻ */
    public C8053 f21257;

    @InterfaceC1080
    public boolean canLoadUnsafeResources() {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingOrSelfPermission(String str) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingOrSelfUriPermission(Uri uri, int i) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingPermission(String str) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkCallingUriPermission(Uri uri, int i) {
        return -1;
    }

    public final int checkContentUriPermissionFull(Uri uri, int i, int i2, int i3) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkPermission(String str, int i, int i2) {
        return -1;
    }

    @InterfaceC1080
    public int checkPermission(String str, int i, int i2, IBinder iBinder) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkSelfPermission(String str) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkUriPermission(Uri uri, int i, int i2, int i3) {
        return -1;
    }

    @InterfaceC1080
    public int checkUriPermission(Uri uri, int i, int i2, int i3, IBinder iBinder) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int checkUriPermission(Uri uri, String str, String str2, int i, int i2, int i3) {
        return -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void clearWallpaper() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createAttributionContext(String str) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContext(ContextParams contextParams) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceContext(int i) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createWindowContext(int i, Bundle bundle) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createWindowContext(Display display, int i, Bundle bundle) {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AttributionSource getAttributionSource() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getAttributionTag() {
        return null;
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC1080
    public Display getDisplay() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isRestricted() {
        return true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveDatabaseFrom(Context context, String str) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveSharedPreferencesFrom(Context context, String str) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void removeStickyBroadcast(Intent intent) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setWallpaper(Bitmap bitmap) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setWallpaper(InputStream inputStream) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean stopService(Intent intent) {
        return false;
    }

    @InterfaceC1080
    public boolean stopServiceAsUser(Intent intent, UserHandle userHandle) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unbindService(ServiceConnection serviceConnection) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }

    @InterfaceC1080
    public void updateDisplay(int i) {
    }

    public C8053(Context context, File file, Signature signature, C13418 c13418, File file2, File file3, String str) {
        this(C12077.m27660(context, file), file, signature, c13418, file2, file3, str, false);
    }

    public C8053(C12077 c12077, File file, Signature signature, C13418 c13418, File file2, File file3, String str, boolean z) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        String str2;
        int i;
        int iIndexOf;
        super(null);
        this.f21229 = new ConcurrentMapC12768();
        this.f21225 = c12077;
        this.f21248 = c13418;
        this.f21222 = signature;
        this.f21234 = z;
        File canonicalFile = file.getCanonicalFile();
        this.f21223 = canonicalFile;
        this.f21227 = file2.getCanonicalFile();
        File canonicalFile2 = file3.getCanonicalFile();
        this.f21221 = canonicalFile2;
        canonicalFile2 = z ? new File(canonicalFile2, "device_protected").getCanonicalFile() : canonicalFile2;
        this.f21231 = canonicalFile2;
        File file4 = new File(canonicalFile2, "files");
        this.f21245 = file4;
        File file5 = new File(canonicalFile2, "no_backup");
        File file6 = new File(canonicalFile2, "cache");
        File file7 = new File(canonicalFile2, "code_cache");
        File file8 = new File(canonicalFile2, "obb");
        File file9 = new File(canonicalFile2, "databases");
        this.f21253 = file9;
        File file10 = new File(canonicalFile2, "shared_prefs");
        m18715(canonicalFile2);
        m18715(file4);
        m18715(file5);
        m18715(file6);
        m18715(file7);
        m18715(file8);
        m18715(file9);
        m18715(file10);
        PackageInfo packageInfoM27662 = C12077.m27662(c12077);
        ApplicationInfo applicationInfo = packageInfoM27662.applicationInfo;
        this.f21237 = applicationInfo;
        applicationInfo.flags |= 8388608;
        String str3 = applicationInfo.packageName;
        this.f21233 = new File(C6988.m16053("/data/app/", str3, "-1/base.apk"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ZipFile zipFile = new ZipFile(canonicalFile);
            try {
                for (ZipEntry zipEntry : Collections.list(zipFile.entries())) {
                    if (!zipEntry.isDirectory()) {
                        String name = zipEntry.getName();
                        if (name.startsWith("lib/") && (iIndexOf = name.indexOf(47, 4)) > 4) {
                            String strSubstring = name.substring(4, iIndexOf);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "mips64":
                                case "x86_64":
                                case "armeabi":
                                case "x86":
                                case "mips":
                                case "armeabi-v7a":
                                case "arm64-v8a":
                                    linkedHashSet.add(strSubstring);
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                        }
                    }
                }
                zipFile.close();
                if (str != null && linkedHashSet.contains(str)) {
                    str2 = str;
                } else if (linkedHashSet.isEmpty()) {
                    String[] strArr = Build.SUPPORTED_ABIS;
                    str2 = strArr.length > 0 ? strArr[0] : "arm64-v8a";
                } else {
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    int length = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            String str4 = strArr2[i2];
                            if (linkedHashSet.contains(str4)) {
                                str2 = str4;
                            } else {
                                i2++;
                            }
                        } else {
                            str2 = (String) linkedHashSet.iterator().next();
                        }
                    }
                }
                this.f21232 = str2;
                File file11 = new File(C20865.m47154("/data/app/", str3, "-1/lib/", str2));
                File file12 = new File(C21466.m48631("/data/data/", str3));
                this.f21252 = file12;
                File file13 = new File(C21466.m48631("/data/user/0/", str3));
                this.f21255 = file13;
                File file14 = new File(C21466.m48631("/data/user_de/0/", str3));
                this.f21256 = file14;
                this.f21242 = new File(file12, "files");
                this.f21224 = new File(file12, "no_backup");
                this.f21244 = new File(file12, "cache");
                this.f21254 = new File(file12, "code_cache");
                this.f21238 = new File(file12, "obb");
                this.f21228 = new File(file12, "databases");
                this.f21236 = new File(file14, "files");
                this.f21230 = new File(file14, "no_backup");
                this.f21226 = new File(file14, "cache");
                this.f21241 = new File(file14, "code_cache");
                this.f21239 = new File(file14, "obb");
                this.f21240 = new File(file14, "databases");
                this.f21237.uid = Process.myUid();
                ApplicationInfo applicationInfo2 = this.f21237;
                applicationInfo2.processName = str3;
                applicationInfo2.nativeLibraryDir = file11.getPath();
                this.f21237.sourceDir = this.f21233.getPath();
                this.f21237.publicSourceDir = this.f21233.getPath();
                this.f21237.dataDir = (this.f21234 ? file14 : file12).getPath();
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f21237.deviceProtectedDataDir = file14.getPath();
                    ApplicationInfo applicationInfo3 = this.f21237;
                    String path = file13.getPath();
                    try {
                        Field declaredField = ApplicationInfo.class.getDeclaredField("credentialProtectedDataDir");
                        declaredField.setAccessible(true);
                        declaredField.set(applicationInfo3, path);
                    } catch (Throwable unused) {
                    }
                }
                c13418.m30563(this.f21237);
                if (signature != null) {
                    i = 1;
                    packageInfoM27662.signatures = new Signature[]{signature};
                } else {
                    i = 1;
                }
                AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
                this.f21249 = assetManager;
                Class[] clsArr = new Class[i];
                clsArr[0] = String.class;
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", clsArr);
                Object[] objArr = new Object[i];
                objArr[0] = this.f21223.getPath();
                declaredMethod.invoke(assetManager, objArr);
                Resources resources = new Resources(assetManager, C12077.m27661(c12077), C12077.m27659(c12077));
                this.f21251 = resources;
                this.f21250 = new C15428(packageInfoM27662, this.f21237, resources, str3);
                this.f21243 = new C24146(this);
                this.f21247 = new WindowManagerC9394();
            } catch (Throwable th) {
                try {
                    zipFile.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m18721() {
        return this.f21232;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.f21249;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f21251;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.f21250;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ContentResolver getContentResolver() {
        return this.f21243;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Looper getMainLooper() {
        return Looper.getMainLooper();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Executor getMainExecutor() {
        return f21219;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18719(Context context) {
        this.f21246 = context;
        C8053 c8053 = this.f21235;
        if (c8053 != null) {
            c8053.f21246 = context;
        }
        C8053 c8054 = this.f21257;
        if (c8054 != null) {
            c8054.f21246 = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context context = this.f21246;
        return context != null ? context : this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final File m18718() {
        return this.f21255;
    }

    /* JADX INFO: renamed from: ۧ */
    public final File m18720() {
        return this.f21256;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.f21251.newTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.f21248;
    }

    @InterfaceC1080
    public Context createApplicationContext(ApplicationInfo applicationInfo, int i) throws PackageManager.NameNotFoundException {
        if (applicationInfo == null || !this.f21237.packageName.equals(applicationInfo.packageName)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createPackageContext(String str, int i) throws PackageManager.NameNotFoundException {
        if (this.f21237.packageName.equals(str)) {
            return this;
        }
        throw new PackageManager.NameNotFoundException(str);
    }

    @InterfaceC1080
    public String getBasePackageName() {
        return this.f21237.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC1080
    public String getOpPackageName() {
        return this.f21237.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return this.f21237.packageName;
    }

    @InterfaceC1080
    public String reloadSharedPreferences() {
        return this.f21237.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        return this.f21237;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageResourcePath() {
        return this.f21233.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageCodePath() {
        return this.f21233.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileInputStream openFileInput(String str) {
        return new FileInputStream(m18713(this.f21245, str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileOutputStream openFileOutput(String str, int i) {
        File fileM18713 = m18713(this.f21245, str);
        File parentFile = fileM18713.getParentFile();
        if (parentFile != null) {
            m18715(parentFile);
        }
        return new FileOutputStream(fileM18713, (i & 32768) != 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteFile(String str) {
        return m18713(this.f21245, str).delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] fileList() {
        String[] list = this.f21245.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        String strM48631 = C21466.m48631("app_", str);
        m18715(m18713(this.f21231, strM48631));
        return m18713(this.f21234 ? this.f21256 : this.f21252, strM48631);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        m18715(this.f21253);
        return m18713(this.f21234 ? this.f21240 : this.f21228, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] databaseList() {
        String[] list = this.f21253.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteDatabase(String str) {
        File file = this.f21253;
        m18715(file);
        File fileM18713 = m18713(file, str);
        return new File(fileM18713.getPath() + "-shm").delete() | fileM18713.delete() | new File(fileM18713.getPath() + "-journal").delete() | new File(fileM18713.getPath() + "-wal").delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        File file = this.f21253;
        m18715(file);
        return SQLiteDatabase.openOrCreateDatabase(m18713(file, str), cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        File file = this.f21253;
        m18715(file);
        return SQLiteDatabase.openOrCreateDatabase(m18713(file, str).getPath(), cursorFactory, databaseErrorHandler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return this.f21234 ? this.f21226 : this.f21244;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCodeCacheDir() {
        return this.f21234 ? this.f21241 : this.f21254;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDataDir() {
        return this.f21234 ? this.f21256 : this.f21252;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalCacheDir() {
        return this.f21234 ? this.f21226 : this.f21244;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalCacheDirs() {
        return new File[]{this.f21234 ? this.f21226 : this.f21244};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalFilesDir(String str) {
        return this.f21234 ? this.f21236 : this.f21242;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(String str) {
        return new File[]{this.f21234 ? this.f21236 : this.f21242};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalMediaDirs() {
        return new File[]{this.f21234 ? this.f21236 : this.f21242};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFileStreamPath(String str) {
        return m18713(this.f21234 ? this.f21236 : this.f21242, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return this.f21234 ? this.f21236 : this.f21242;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getNoBackupFilesDir() {
        return this.f21234 ? this.f21230 : this.f21224;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getObbDir() {
        return this.f21234 ? this.f21239 : this.f21238;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getObbDirs() {
        return new File[]{this.f21234 ? this.f21239 : this.f21238};
    }

    /* JADX INFO: renamed from: ֫ */
    public static PackageInfo m18712(PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr;
        ProviderInfo[] providerInfoArr;
        long jLongValue;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m18717(packageInfo.activities);
        packageInfo2.receivers = m18717(packageInfo.receivers);
        ServiceInfo[] serviceInfoArr2 = packageInfo.services;
        if (serviceInfoArr2 == null) {
            serviceInfoArr = null;
        } else {
            serviceInfoArr = new ServiceInfo[serviceInfoArr2.length];
            for (int i = 0; i < serviceInfoArr2.length; i++) {
                serviceInfoArr[i] = serviceInfoArr2[i] == null ? null : new ServiceInfo(serviceInfoArr2[i]);
            }
        }
        packageInfo2.services = serviceInfoArr;
        ProviderInfo[] providerInfoArr2 = packageInfo.providers;
        if (providerInfoArr2 == null) {
            providerInfoArr = null;
        } else {
            providerInfoArr = new ProviderInfo[providerInfoArr2.length];
            for (int i2 = 0; i2 < providerInfoArr2.length; i2++) {
                providerInfoArr[i2] = providerInfoArr2[i2] == null ? null : new ProviderInfo(providerInfoArr2[i2]);
            }
        }
        packageInfo2.providers = providerInfoArr;
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        packageInfo2.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
        String[] strArr = packageInfo.requestedPermissions;
        packageInfo2.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
        int[] iArr = packageInfo.requestedPermissionsFlags;
        packageInfo2.requestedPermissionsFlags = iArr == null ? null : (int[]) iArr.clone();
        int[] iArr2 = packageInfo.gids;
        packageInfo2.gids = iArr2 == null ? null : (int[]) iArr2.clone();
        Signature[] signatureArr = packageInfo.signatures;
        packageInfo2.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.versionCode = packageInfo.versionCode;
        packageInfo2.versionName = packageInfo.versionName;
        try {
            Field field = PackageInfo.class.getField("signingInfo");
            field.set(packageInfo2, field.get(packageInfo));
        } catch (Throwable unused) {
        }
        try {
            Field field2 = PackageInfo.class.getField("baseRevisionCode");
            field2.setInt(packageInfo2, field2.getInt(packageInfo));
        } catch (Throwable unused2) {
        }
        try {
            jLongValue = ((Number) PackageInfo.class.getMethod("getLongVersionCode", null).invoke(packageInfo, null)).longValue();
        } catch (Throwable unused3) {
            jLongValue = packageInfo.versionCode;
        }
        try {
            PackageInfo.class.getMethod("setLongVersionCode", Long.TYPE).invoke(packageInfo2, Long.valueOf(jLongValue));
        } catch (Throwable unused4) {
            packageInfo2.versionCode = (int) jLongValue;
        }
        return packageInfo2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ActivityInfo[] m18717(ActivityInfo[] activityInfoArr) {
        if (activityInfoArr == null) {
            return null;
        }
        ActivityInfo[] activityInfoArr2 = new ActivityInfo[activityInfoArr.length];
        for (int i = 0; i < activityInfoArr.length; i++) {
            activityInfoArr2[i] = activityInfoArr[i] == null ? null : new ActivityInfo(activityInfoArr[i]);
        }
        return activityInfoArr2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        throw m18714("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        throw m18714("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        throw m18714("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        throw m18714("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        throw m18714("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        throw m18714("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent) {
        throw m18714("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent, String str) {
        throw m18714("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str) {
        throw m18714("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m18714("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m18714("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
        throw m18714("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m18714("sendOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcast(Intent intent) {
        throw m18714("sendStickyBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m18714("sendStickyOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m18714("sendStickyBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m18714("sendStickyOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        throw m18714("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        throw m18714("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        throw m18714("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        throw m18714("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startService(Intent intent) {
        throw m18714("startService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startForegroundService(Intent intent) {
        throw m18714("startForegroundService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        throw m18714("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags) {
        throw m18714("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        throw m18714("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, Context.BindServiceFlags bindServiceFlags, Executor executor, ServiceConnection serviceConnection) {
        throw m18714("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindIsolatedService(Intent intent, int i, String str, Executor executor, ServiceConnection serviceConnection) {
        throw m18714("bindIsolatedService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void updateServiceGroup(ServiceConnection serviceConnection, int i, int i2) {
        throw m18714("updateServiceGroup");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
        throw m18714("startInstrumentation");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (str.equals("window")) {
            return this.f21247;
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getSystemServiceName(Class cls) {
        if (WindowManager.class.isAssignableFrom(cls)) {
            return "window";
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforcePermission(String str, int i, int i2, String str2) {
        throw m18714("enforcePermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingPermission(String str, String str2) {
        throw m18714("enforceCallingPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfPermission(String str, String str2) {
        throw m18714("enforceCallingOrSelfPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void grantUriPermission(String str, Uri uri, int i) {
        throw m18714("grantUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(Uri uri, int i) {
        throw m18714("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(String str, Uri uri, int i) {
        throw m18714("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeSelfPermissionsOnKill(Collection collection) {
        throw m18714("revokeSelfPermissionsOnKill");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, int i, int i2, int i3, String str) {
        throw m18714("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingUriPermission(Uri uri, int i, String str) {
        throw m18714("enforceCallingUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
        throw m18714("enforceCallingOrSelfUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
        throw m18714("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContextForSplit(String str) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        if (!this.f21234) {
            if (this.f21235 == null) {
                try {
                    C8053 c8053 = new C8053(this.f21225, this.f21223, this.f21222, this.f21248, this.f21227, this.f21221, this.f21232, true);
                    this.f21235 = c8053;
                    c8053.f21257 = this;
                    Context context = this.f21246;
                    if (context != null) {
                        c8053.f21246 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f21235;
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return this.f21234;
    }

    @InterfaceC1080
    public File getPreloadsFileCache() {
        return getCacheDir();
    }

    @InterfaceC1080
    public void startActivityAsUser(Intent intent, UserHandle userHandle) {
        throw m18714("startActivityAsUser");
    }

    @InterfaceC1080
    public void startActivityAsUser(Intent intent, Bundle bundle, UserHandle userHandle) {
        throw m18714("startActivityAsUser");
    }

    @InterfaceC1080
    public void startActivityForResult(String str, Intent intent, int i, Bundle bundle) {
        throw m18714("startActivityForResult");
    }

    @InterfaceC1080
    public int startActivitiesAsUser(Intent[] intentArr, Bundle bundle, UserHandle userHandle) {
        throw m18714("startActivitiesAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC1080
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, UserHandle userHandle) {
        throw m18714("bindServiceAsUser");
    }

    @InterfaceC1080
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, Handler handler, UserHandle userHandle) {
        throw m18714("bindServiceAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC1080
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, UserHandle userHandle) {
        throw m18714("bindServiceAsUser");
    }

    @InterfaceC1080
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, Handler handler, UserHandle userHandle) {
        throw m18714("bindServiceAsUser");
    }

    @InterfaceC1080
    public void sendBroadcastMultiplePermissions(Intent intent, String[] strArr) {
        throw m18714("sendBroadcastMultiplePermissions");
    }

    @InterfaceC1080
    public void sendBroadcastAsUserMultiplePermissions(Intent intent, UserHandle userHandle, String[] strArr) {
        throw m18714("sendBroadcastAsUserMultiplePermissions");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC1080
    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        throw m18714("sendBroadcast");
    }

    @InterfaceC1080
    public void sendBroadcast(Intent intent, String str, int i) {
        throw m18714("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC1080
    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        throw m18714("sendOrderedBroadcast");
    }

    @InterfaceC1080
    public void sendOrderedBroadcast(Intent intent, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m18714("sendOrderedBroadcast");
    }

    @InterfaceC1080
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, Bundle bundle) {
        throw m18714("sendBroadcastAsUser");
    }

    @InterfaceC1080
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i) {
        throw m18714("sendBroadcastAsUser");
    }

    @InterfaceC1080
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m18714("sendOrderedBroadcastAsUser");
    }

    @InterfaceC1080
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle2) {
        throw m18714("sendOrderedBroadcastAsUser");
    }

    @InterfaceC1080
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle, Bundle bundle) {
        throw m18714("sendStickyBroadcastAsUser");
    }

    @InterfaceC1080
    public Intent registerReceiverAsUser(BroadcastReceiver broadcastReceiver, UserHandle userHandle, IntentFilter intentFilter, String str, Handler handler) {
        throw m18714("registerReceiverAsUser");
    }

    @InterfaceC1080
    public ComponentName startForegroundServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m18714("startForegroundServiceAsUser");
    }

    @InterfaceC1080
    public ComponentName startServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m18714("startServiceAsUser");
    }

    @InterfaceC1080
    public Context createPackageContextAsUser(String str, int i, UserHandle userHandle) throws PackageManager.NameNotFoundException {
        createPackageContext(str, i);
        return this;
    }

    @InterfaceC1080
    public Context createCredentialProtectedStorageContext() {
        if (this.f21234) {
            if (this.f21257 == null) {
                try {
                    C8053 c8053 = new C8053(this.f21225, this.f21223, this.f21222, this.f21248, this.f21227, this.f21221, this.f21232, false);
                    this.f21257 = c8053;
                    c8053.f21235 = this;
                    Context context = this.f21246;
                    if (context != null) {
                        c8053.f21246 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f21257;
        }
        return this;
    }

    @InterfaceC1080
    public boolean isCredentialProtectedStorage() {
        return !this.f21234;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int[] checkCallingOrSelfUriPermissions(List list, int i) {
        int[] iArr = new int[list.size()];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int[] checkCallingUriPermissions(List list, int i) {
        int[] iArr = new int[list.size()];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final int[] checkUriPermissions(List list, int i, int i2, int i3) {
        int[] iArr = new int[list.size()];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static SecurityException m18714(String str) {
        return new SecurityException("Decryptor context denied: ".concat(str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return this.f21229.remove(str) != null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return (SharedPreferences) C19473.computeIfAbsent(this.f21229, str, new C13026(1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18715(File file) {
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r3.startsWith(r2 + java.io.File.separator) != false) goto L6;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m18713(File file, String str) {
        try {
            File canonicalFile = new File(file, str).getCanonicalFile();
            File canonicalFile2 = file.getCanonicalFile();
            String path = canonicalFile2.getPath();
            String path2 = canonicalFile.getPath();
            if (!canonicalFile.equals(canonicalFile2)) {
            }
            return canonicalFile;
        } catch (Exception unused) {
        }
        return new File(file, str == null ? "" : new File(str).getName());
    }
}
