package p067l;

import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import bin.p000mt.plus.Features;
import java.io.File;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩴۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5CH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19945 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ֫ */
    public static final C19945 f60545 = new C19945();

    /* JADX INFO: renamed from: ۧ */
    public static Thread.UncaughtExceptionHandler f60546;

    /* JADX INFO: renamed from: ۧ */
    public static C19945 m45266() {
        return f60545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45267() {
        f60546 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        C21306.m48190();
        if (th != null && f60546 != null) {
            String strM45265 = m45265(th);
            try {
                File file = new File("/data/data/bin.mt.plus/DEBUG.log");
                Charset charsetDefaultCharset = Charset.defaultCharset();
                int i = C17425.f52085;
                String string = C12826.toString(strM45265, null);
                OutputStream outputStreamM39676 = C17425.m39676(file);
                try {
                    byte[] bArr = C23461.f74712;
                    if (string != null) {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(outputStreamM39676);
                        int i2 = C10721.f29698;
                        if (charsetDefaultCharset == null) {
                            charsetDefaultCharset = Charset.defaultCharset();
                        }
                        writableByteChannelNewChannel.write(charsetDefaultCharset.encode(string));
                    }
                    if (outputStreamM39676 != null) {
                        outputStreamM39676.close();
                    }
                } catch (Throwable th2) {
                    if (outputStreamM39676 != null) {
                        try {
                            outputStreamM39676.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable unused) {
            }
            try {
                C17853.m40542().m38684("DEBUG.log").m38668(strM45265);
            } catch (Throwable unused2) {
            }
            if (C15322.f43724) {
                try {
                    Intent intent = new Intent();
                    intent.setClass(C7050.m16232(), ActivityC14565.class);
                    intent.setFlags(268435456);
                    C7050.m16232().startActivity(intent);
                    Process.killProcess(Process.myPid());
                    return;
                } catch (Throwable unused3) {
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f60546;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            System.out.println("use DefaultHandler");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45265(Throwable th) {
        String str;
        th.getClass();
        if (C11164.m25781()) {
            str = "ROOT";
        } else {
            str = C11164.m25771() ? "SHELL" : "APP";
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
            sb.append(C7050.m16200().targetSdkVersion);
            sb.append('\n');
        } catch (Throwable unused) {
        }
        if (C11164.m25771() && (th instanceof C3552) && TextUtils.indexOf(sb, "at android.os.BinderProxy.transactNative(Native Method)") != -1) {
            sb.append("===============================================\n该错误可能是由 Shizuku 导致的，请尝试进入 Shizuku 中\n关掉 MT 管理器的授权，然后再重新打开 MT 管理器！\n===============================================\nThis error may be caused by Shizuku. Please try to enter Shizuku,\nturn off the authorization of MT and then reopen MT!\n===============================================\n");
        }
        sb.append("---StackTrace---");
        sb.append('\n');
        C6112.m13909(sb, th);
        return sb.toString();
    }
}
