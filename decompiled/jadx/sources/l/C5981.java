package l;

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
public class C5981 extends ContextWrapper {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final Handler f18366 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorC12331 f18367 = new ExecutorC12331();

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18368 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final File f18369;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Signature f18370;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f18371;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final File f18372;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10215 f18373;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final File f18374;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final File f18375;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f18376;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f18377;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final File f18378;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final File f18379;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f18380;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final File f18381;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f18382;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5981 f18383;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f18384;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ApplicationInfo f18385;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final File f18386;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File f18387;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final File f18388;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final File f18389;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f18390;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ContentResolver f18391;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final File f18392;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final File f18393;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Context f18394;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final WindowManagerC7392 f18395;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11626 f18396;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AssetManager f18397;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13741 f18398;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Resources f18399;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f18400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File f18401;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final File f18402;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final File f18403;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final File f18404;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C5981 f18405;

    @InterfaceC4801
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

    @InterfaceC4801
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

    @InterfaceC4801
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
    @InterfaceC4801
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

    @InterfaceC4801
    public boolean stopServiceAsUser(Intent intent, UserHandle userHandle) {
        return false;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unbindService(ServiceConnection serviceConnection) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }

    @InterfaceC4801
    public void updateDisplay(int i) {
    }

    public C5981(Context context, File file, Signature signature, C11626 c11626, File file2, File file3, String str) {
        this(C10215.m25638(context, file), file, signature, c11626, file2, file3, str, false);
    }

    public C5981(C10215 c10215, File file, Signature signature, C11626 c11626, File file2, File file3, String str, boolean z) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        String str2;
        int i;
        int iIndexOf;
        super(null);
        this.f18377 = new ConcurrentMapC10942();
        this.f18373 = c10215;
        this.f18396 = c11626;
        this.f18370 = signature;
        this.f18382 = z;
        File canonicalFile = file.getCanonicalFile();
        this.f18371 = canonicalFile;
        this.f18375 = file2.getCanonicalFile();
        File canonicalFile2 = file3.getCanonicalFile();
        this.f18369 = canonicalFile2;
        canonicalFile2 = z ? new File(canonicalFile2, "device_protected").getCanonicalFile() : canonicalFile2;
        this.f18379 = canonicalFile2;
        File file4 = new File(canonicalFile2, "files");
        this.f18393 = file4;
        File file5 = new File(canonicalFile2, "no_backup");
        File file6 = new File(canonicalFile2, "cache");
        File file7 = new File(canonicalFile2, "code_cache");
        File file8 = new File(canonicalFile2, "obb");
        File file9 = new File(canonicalFile2, "databases");
        this.f18401 = file9;
        File file10 = new File(canonicalFile2, "shared_prefs");
        m16789(canonicalFile2);
        m16789(file4);
        m16789(file5);
        m16789(file6);
        m16789(file7);
        m16789(file8);
        m16789(file9);
        m16789(file10);
        PackageInfo packageInfoM25640 = C10215.m25640(c10215);
        ApplicationInfo applicationInfo = packageInfoM25640.applicationInfo;
        this.f18385 = applicationInfo;
        applicationInfo.flags |= 8388608;
        String str3 = applicationInfo.packageName;
        this.f18381 = new File(C4860.m14172("/data/app/", str3, "-1/base.apk"));
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
                this.f18380 = str2;
                File file11 = new File(C19462.m44858("/data/app/", str3, "-1/lib/", str2));
                File file12 = new File(C20094.m46315("/data/data/", str3));
                this.f18400 = file12;
                File file13 = new File(C20094.m46315("/data/user/0/", str3));
                this.f18403 = file13;
                File file14 = new File(C20094.m46315("/data/user_de/0/", str3));
                this.f18404 = file14;
                this.f18390 = new File(file12, "files");
                this.f18372 = new File(file12, "no_backup");
                this.f18392 = new File(file12, "cache");
                this.f18402 = new File(file12, "code_cache");
                this.f18386 = new File(file12, "obb");
                this.f18376 = new File(file12, "databases");
                this.f18384 = new File(file14, "files");
                this.f18378 = new File(file14, "no_backup");
                this.f18374 = new File(file14, "cache");
                this.f18389 = new File(file14, "code_cache");
                this.f18387 = new File(file14, "obb");
                this.f18388 = new File(file14, "databases");
                this.f18385.uid = Process.myUid();
                ApplicationInfo applicationInfo2 = this.f18385;
                applicationInfo2.processName = str3;
                applicationInfo2.nativeLibraryDir = file11.getPath();
                this.f18385.sourceDir = this.f18381.getPath();
                this.f18385.publicSourceDir = this.f18381.getPath();
                this.f18385.dataDir = (this.f18382 ? file14 : file12).getPath();
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f18385.deviceProtectedDataDir = file14.getPath();
                    ApplicationInfo applicationInfo3 = this.f18385;
                    String path = file13.getPath();
                    try {
                        Field declaredField = ApplicationInfo.class.getDeclaredField("credentialProtectedDataDir");
                        declaredField.setAccessible(true);
                        declaredField.set(applicationInfo3, path);
                    } catch (Throwable unused) {
                    }
                }
                c11626.m28517(this.f18385);
                if (signature != null) {
                    i = 1;
                    packageInfoM25640.signatures = new Signature[]{signature};
                } else {
                    i = 1;
                }
                AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
                this.f18397 = assetManager;
                Class[] clsArr = new Class[i];
                clsArr[0] = String.class;
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", clsArr);
                Object[] objArr = new Object[i];
                objArr[0] = this.f18371.getPath();
                declaredMethod.invoke(assetManager, objArr);
                Resources resources = new Resources(assetManager, C10215.m25639(c10215), C10215.m25637(c10215));
                this.f18399 = resources;
                this.f18398 = new C13741(packageInfoM25640, this.f18385, resources, str3);
                this.f18391 = new C22914(this);
                this.f18395 = new WindowManagerC7392();
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m16795() {
        return this.f18380;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.f18397;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f18399;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.f18398;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ContentResolver getContentResolver() {
        return this.f18391;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Looper getMainLooper() {
        return Looper.getMainLooper();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Executor getMainExecutor() {
        return f18367;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16793(Context context) {
        this.f18394 = context;
        C5981 c5981 = this.f18383;
        if (c5981 != null) {
            c5981.f18394 = context;
        }
        C5981 c5982 = this.f18405;
        if (c5982 != null) {
            c5982.f18394 = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context context = this.f18394;
        return context != null ? context : this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File m16792() {
        return this.f18403;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File m16794() {
        return this.f18404;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.f18399.newTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.f18396;
    }

    @InterfaceC4801
    public Context createApplicationContext(ApplicationInfo applicationInfo, int i) throws PackageManager.NameNotFoundException {
        if (applicationInfo == null || !this.f18385.packageName.equals(applicationInfo.packageName)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createPackageContext(String str, int i) throws PackageManager.NameNotFoundException {
        if (this.f18385.packageName.equals(str)) {
            return this;
        }
        throw new PackageManager.NameNotFoundException(str);
    }

    @InterfaceC4801
    public String getBasePackageName() {
        return this.f18385.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC4801
    public String getOpPackageName() {
        return this.f18385.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return this.f18385.packageName;
    }

    @InterfaceC4801
    public String reloadSharedPreferences() {
        return this.f18385.packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        return this.f18385;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageResourcePath() {
        return this.f18381.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageCodePath() {
        return this.f18381.getPath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileInputStream openFileInput(String str) {
        return new FileInputStream(m16787(this.f18393, str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final FileOutputStream openFileOutput(String str, int i) {
        File fileM16787 = m16787(this.f18393, str);
        File parentFile = fileM16787.getParentFile();
        if (parentFile != null) {
            m16789(parentFile);
        }
        return new FileOutputStream(fileM16787, (i & 32768) != 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteFile(String str) {
        return m16787(this.f18393, str).delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] fileList() {
        String[] list = this.f18393.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        String strM46315 = C20094.m46315("app_", str);
        m16789(m16787(this.f18379, strM46315));
        return m16787(this.f18382 ? this.f18404 : this.f18400, strM46315);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        m16789(this.f18401);
        return m16787(this.f18382 ? this.f18388 : this.f18376, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String[] databaseList() {
        String[] list = this.f18401.list();
        return list != null ? list : new String[0];
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteDatabase(String str) {
        File file = this.f18401;
        m16789(file);
        File fileM16787 = m16787(file, str);
        return new File(fileM16787.getPath() + "-shm").delete() | fileM16787.delete() | new File(fileM16787.getPath() + "-journal").delete() | new File(fileM16787.getPath() + "-wal").delete();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        File file = this.f18401;
        m16789(file);
        return SQLiteDatabase.openOrCreateDatabase(m16787(file, str), cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        File file = this.f18401;
        m16789(file);
        return SQLiteDatabase.openOrCreateDatabase(m16787(file, str).getPath(), cursorFactory, databaseErrorHandler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return this.f18382 ? this.f18374 : this.f18392;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCodeCacheDir() {
        return this.f18382 ? this.f18389 : this.f18402;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDataDir() {
        return this.f18382 ? this.f18404 : this.f18400;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalCacheDir() {
        return this.f18382 ? this.f18374 : this.f18392;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalCacheDirs() {
        return new File[]{this.f18382 ? this.f18374 : this.f18392};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalFilesDir(String str) {
        return this.f18382 ? this.f18384 : this.f18390;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(String str) {
        return new File[]{this.f18382 ? this.f18384 : this.f18390};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalMediaDirs() {
        return new File[]{this.f18382 ? this.f18384 : this.f18390};
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFileStreamPath(String str) {
        return m16787(this.f18382 ? this.f18384 : this.f18390, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return this.f18382 ? this.f18384 : this.f18390;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getNoBackupFilesDir() {
        return this.f18382 ? this.f18378 : this.f18372;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getObbDir() {
        return this.f18382 ? this.f18387 : this.f18386;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getObbDirs() {
        return new File[]{this.f18382 ? this.f18387 : this.f18386};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInfo m16786(PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr;
        ProviderInfo[] providerInfoArr;
        long jLongValue;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m16791(packageInfo.activities);
        packageInfo2.receivers = m16791(packageInfo.receivers);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActivityInfo[] m16791(ActivityInfo[] activityInfoArr) {
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
        throw m16788("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        throw m16788("startActivity");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        throw m16788("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        throw m16788("startActivities");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        throw m16788("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        throw m16788("startIntentSender");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent) {
        throw m16788("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent, String str) {
        throw m16788("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str) {
        throw m16788("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m16788("sendOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m16788("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
        throw m16788("sendBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        throw m16788("sendOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcast(Intent intent) {
        throw m16788("sendStickyBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m16788("sendStickyOrderedBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        throw m16788("sendStickyBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        throw m16788("sendStickyOrderedBroadcastAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        throw m16788("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        throw m16788("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        throw m16788("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        throw m16788("registerReceiver");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startService(Intent intent) {
        throw m16788("startService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ComponentName startForegroundService(Intent intent) {
        throw m16788("startForegroundService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        throw m16788("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags) {
        throw m16788("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        throw m16788("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, Context.BindServiceFlags bindServiceFlags, Executor executor, ServiceConnection serviceConnection) {
        throw m16788("bindService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindIsolatedService(Intent intent, int i, String str, Executor executor, ServiceConnection serviceConnection) {
        throw m16788("bindIsolatedService");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void updateServiceGroup(ServiceConnection serviceConnection, int i, int i2) {
        throw m16788("updateServiceGroup");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
        throw m16788("startInstrumentation");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (str.equals("window")) {
            return this.f18395;
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
        throw m16788("enforcePermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingPermission(String str, String str2) {
        throw m16788("enforceCallingPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfPermission(String str, String str2) {
        throw m16788("enforceCallingOrSelfPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void grantUriPermission(String str, Uri uri, int i) {
        throw m16788("grantUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(Uri uri, int i) {
        throw m16788("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeUriPermission(String str, Uri uri, int i) {
        throw m16788("revokeUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void revokeSelfPermissionsOnKill(Collection collection) {
        throw m16788("revokeSelfPermissionsOnKill");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, int i, int i2, int i3, String str) {
        throw m16788("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingUriPermission(Uri uri, int i, String str) {
        throw m16788("enforceCallingUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
        throw m16788("enforceCallingOrSelfUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
        throw m16788("enforceUriPermission");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContextForSplit(String str) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDeviceProtectedStorageContext() {
        if (!this.f18382) {
            if (this.f18383 == null) {
                try {
                    C5981 c5981 = new C5981(this.f18373, this.f18371, this.f18370, this.f18396, this.f18375, this.f18369, this.f18380, true);
                    this.f18383 = c5981;
                    c5981.f18405 = this;
                    Context context = this.f18394;
                    if (context != null) {
                        c5981.f18394 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f18383;
        }
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return this.f18382;
    }

    @InterfaceC4801
    public File getPreloadsFileCache() {
        return getCacheDir();
    }

    @InterfaceC4801
    public void startActivityAsUser(Intent intent, UserHandle userHandle) {
        throw m16788("startActivityAsUser");
    }

    @InterfaceC4801
    public void startActivityAsUser(Intent intent, Bundle bundle, UserHandle userHandle) {
        throw m16788("startActivityAsUser");
    }

    @InterfaceC4801
    public void startActivityForResult(String str, Intent intent, int i, Bundle bundle) {
        throw m16788("startActivityForResult");
    }

    @InterfaceC4801
    public int startActivitiesAsUser(Intent[] intentArr, Bundle bundle, UserHandle userHandle) {
        throw m16788("startActivitiesAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC4801
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, UserHandle userHandle) {
        throw m16788("bindServiceAsUser");
    }

    @InterfaceC4801
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, Handler handler, UserHandle userHandle) {
        throw m16788("bindServiceAsUser");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC4801
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, UserHandle userHandle) {
        throw m16788("bindServiceAsUser");
    }

    @InterfaceC4801
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, Context.BindServiceFlags bindServiceFlags, Handler handler, UserHandle userHandle) {
        throw m16788("bindServiceAsUser");
    }

    @InterfaceC4801
    public void sendBroadcastMultiplePermissions(Intent intent, String[] strArr) {
        throw m16788("sendBroadcastMultiplePermissions");
    }

    @InterfaceC4801
    public void sendBroadcastAsUserMultiplePermissions(Intent intent, UserHandle userHandle, String[] strArr) {
        throw m16788("sendBroadcastAsUserMultiplePermissions");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC4801
    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        throw m16788("sendBroadcast");
    }

    @InterfaceC4801
    public void sendBroadcast(Intent intent, String str, int i) {
        throw m16788("sendBroadcast");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @InterfaceC4801
    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        throw m16788("sendOrderedBroadcast");
    }

    @InterfaceC4801
    public void sendOrderedBroadcast(Intent intent, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m16788("sendOrderedBroadcast");
    }

    @InterfaceC4801
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, Bundle bundle) {
        throw m16788("sendBroadcastAsUser");
    }

    @InterfaceC4801
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i) {
        throw m16788("sendBroadcastAsUser");
    }

    @InterfaceC4801
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
        throw m16788("sendOrderedBroadcastAsUser");
    }

    @InterfaceC4801
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, int i, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle2) {
        throw m16788("sendOrderedBroadcastAsUser");
    }

    @InterfaceC4801
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle, Bundle bundle) {
        throw m16788("sendStickyBroadcastAsUser");
    }

    @InterfaceC4801
    public Intent registerReceiverAsUser(BroadcastReceiver broadcastReceiver, UserHandle userHandle, IntentFilter intentFilter, String str, Handler handler) {
        throw m16788("registerReceiverAsUser");
    }

    @InterfaceC4801
    public ComponentName startForegroundServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m16788("startForegroundServiceAsUser");
    }

    @InterfaceC4801
    public ComponentName startServiceAsUser(Intent intent, UserHandle userHandle) {
        throw m16788("startServiceAsUser");
    }

    @InterfaceC4801
    public Context createPackageContextAsUser(String str, int i, UserHandle userHandle) throws PackageManager.NameNotFoundException {
        createPackageContext(str, i);
        return this;
    }

    @InterfaceC4801
    public Context createCredentialProtectedStorageContext() {
        if (this.f18382) {
            if (this.f18405 == null) {
                try {
                    C5981 c5981 = new C5981(this.f18373, this.f18371, this.f18370, this.f18396, this.f18375, this.f18369, this.f18380, false);
                    this.f18405 = c5981;
                    c5981.f18383 = this;
                    Context context = this.f18394;
                    if (context != null) {
                        c5981.f18394 = context;
                    }
                } catch (Exception unused) {
                }
            }
            return this.f18405;
        }
        return this;
    }

    @InterfaceC4801
    public boolean isCredentialProtectedStorage() {
        return !this.f18382;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SecurityException m16788(String str) {
        return new SecurityException("Decryptor context denied: ".concat(str));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return this.f18377.remove(str) != null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = "default";
        }
        return (SharedPreferences) C17997.computeIfAbsent(this.f18377, str, new C11213(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16789(File file) {
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r3.startsWith(r2 + java.io.File.separator) != false) goto L6;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m16787(File file, String str) {
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
