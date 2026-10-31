package l;

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
public final class C16869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11226 f51759 = new C2053();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39646(PackageInfo packageInfo, File file) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39644(Context context) {
        m39645(context, new ExecutorC23282(), f51759, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39645(Context context, Executor executor, InterfaceC11226 interfaceC11226, boolean z) {
        boolean zM30968;
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
                                interfaceC11226.mo6738(2, null);
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
                    C4170.m12611(context, false);
                    return;
                }
            }
            context.getPackageName();
            C12699 c12699 = new C12699(assets, executor, interfaceC11226, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (c12699.m30965()) {
                C12699 c12699M30966 = c12699.m30966();
                c12699M30966.m30967();
                zM30968 = c12699M30966.m30968();
                if (zM30968) {
                    m39646(packageInfo, filesDir);
                }
            } else {
                zM30968 = false;
            }
            if (zM30968 && z) {
                z3 = true;
            }
            C4170.m12611(context, z3);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC11226.mo6738(7, e);
            C4170.m12611(context, false);
        }
    }
}
