package p067l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19NA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18401 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC13038 f54939 = new C4320();

    /* JADX INFO: renamed from: ֫ */
    public static void m41882(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41880(Context context) {
        m41881(context, new ExecutorC24496(), f54939, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41881(Context context, Executor executor, InterfaceC13038 interfaceC13038, boolean z) {
        boolean zM33046;
        boolean z2;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z2 = j == packageInfo.lastUpdateTime;
                            if (z2) {
                                interfaceC13038.mo8864(2, null);
                            }
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    context.getPackageName();
                    C6332.m14486(context, false);
                    return;
                }
            }
            context.getPackageName();
            C14438 c14438 = new C14438(assets, executor, interfaceC13038, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (c14438.m33043()) {
                C14438 c14438M33044 = c14438.m33044();
                c14438M33044.m33045();
                zM33046 = c14438M33044.m33046();
                if (zM33046) {
                    m41882(packageInfo, filesDir);
                }
            } else {
                zM33046 = false;
            }
            if (zM33046 && z) {
                z3 = true;
            }
            C6332.m14486(context, z3);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC13038.mo8864(7, e);
            C6332.m14486(context, false);
        }
    }
}
