package l;

import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import bin.mt.plus.Features;
import java.io.File;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩴۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5CH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18494 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18494 f57326 = new C18494();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler f57327;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18494 m42990() {
        return f57326;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42991() {
        f57327 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        C19926.m45877();
        if (th != null && f57327 != null) {
            String strM42989 = m42989(th);
            try {
                File file = new File("/data/data/bin.mt.plus/DEBUG.log");
                Charset charsetDefaultCharset = Charset.defaultCharset();
                int i = C15843.f48947;
                String string = C11003.toString(strM42989, null);
                OutputStream outputStreamM37504 = C15843.m37504(file);
                try {
                    byte[] bArr = C22194.f71991;
                    if (string != null) {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(outputStreamM37504);
                        int i2 = C8789.f26773;
                        if (charsetDefaultCharset == null) {
                            charsetDefaultCharset = Charset.defaultCharset();
                        }
                        writableByteChannelNewChannel.write(charsetDefaultCharset.encode(string));
                    }
                    if (outputStreamM37504 != null) {
                        outputStreamM37504.close();
                    }
                } catch (Throwable th2) {
                    if (outputStreamM37504 != null) {
                        try {
                            outputStreamM37504.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable unused) {
            }
            try {
                C16293.m38327().m36526("DEBUG.log").m36510(strM42989);
            } catch (Throwable unused2) {
            }
            if (C13630.f40644) {
                try {
                    Intent intent = new Intent();
                    intent.setClass(C4925.m14335(), ActivityC12833.class);
                    intent.setFlags(268435456);
                    C4925.m14335().startActivity(intent);
                    Process.killProcess(Process.myPid());
                    return;
                } catch (Throwable unused3) {
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f57327;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            System.out.println("use DefaultHandler");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42989(Throwable th) {
        String str;
        th.getClass();
        if (C9255.m23780()) {
            str = "ROOT";
        } else {
            str = C9255.m23770() ? "SHELL" : "APP";
        }
        StringBuilder sb = new StringBuilder("VER: ");
        sb.append("2.26.10(26101061)\nPERMISSION: ");
        sb.append(str);
        sb.append("\nABI: ");
        sb.append(Features.getABI());
        sb.append("\nMODEL: ");
        sb.append(Build.MODEL);
        sb.append("\nSDK: ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\nRELEASE: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append('\n');
        try {
            sb.append("TARGET_SDK: ");
            sb.append(C4925.m14303().targetSdkVersion);
            sb.append('\n');
        } catch (Throwable unused) {
        }
        if (C9255.m23770() && (th instanceof C1245) && TextUtils.indexOf(sb, "at android.os.BinderProxy.transactNative(Native Method)") != -1) {
            sb.append("===============================================\n该错误可能是由 Shizuku 导致的，请尝试进入 Shizuku 中\n关掉 MT 管理器的授权，然后再重新打开 MT 管理器！\n===============================================\nThis error may be caused by Shizuku. Please try to enter Shizuku,\nturn off the authorization of MT and then reopen MT!\n===============================================\n");
        }
        sb.append("---StackTrace---");
        sb.append('\n');
        C3939.m11989(sb, th);
        return sb.toString();
    }
}
