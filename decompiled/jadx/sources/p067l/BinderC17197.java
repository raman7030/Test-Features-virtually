package p067l;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.system.Os;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0708d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ܺ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D98Y */
/* JADX INFO: loaded from: classes5.dex */
public class BinderC17197 extends AbstractBinderC15304 {
    @InterfaceC1080
    public BinderC17197() {
        attachInterface(this, "bin.mt.shell.IShizukuCommand");
    }

    @Override // p067l.InterfaceC9270
    /* JADX INFO: renamed from: ֫ */
    public final int mo21447() {
        return Os.getuid();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38946(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38947(Process process) {
        if (process == null) {
            return;
        }
        try {
            process.destroy();
        } catch (Exception unused) {
        }
        try {
            if (Build.VERSION.SDK_INT < 26 || !process.isAlive()) {
                return;
            }
            process.destroyForcibly();
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0075 A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:16:0x003a, B:18:0x0075, B:20:0x007c, B:25:0x0092, B:24:0x008f), top: B:56:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:20:0x007c A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TRY_LEAVE, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:16:0x003a, B:18:0x0075, B:20:0x007c, B:25:0x0092, B:24:0x008f), top: B:56:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008f A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TRY_ENTER, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:16:0x003a, B:18:0x0075, B:20:0x007c, B:25:0x0092, B:24:0x008f), top: B:56:0x003a }] */
    @Override // p067l.InterfaceC9270
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo21448(int i, String str, String str2) {
        InputStream inputStream;
        Process processExec;
        Closeable closeable;
        Closeable closeable2;
        OutputStream outputStream;
        Bundle bundleM38948;
        InputStream inputStream2 = null;
        try {
            processExec = Runtime.getRuntime().exec(str);
            try {
                if (str2 != null) {
                    try {
                        if (str2.length() > 0) {
                            outputStream = processExec.getOutputStream();
                            try {
                                outputStream.write(str2.getBytes(C0233a.f1077D));
                                outputStream.flush();
                            } catch (InterruptedException e) {
                                e = e;
                                closeable2 = null;
                                try {
                                    Thread.currentThread().interrupt();
                                    bundleM38948 = m38948(2, "", e.toString());
                                    m38946(outputStream);
                                    m38946(inputStream2);
                                    m38946(closeable2);
                                    m38947(processExec);
                                    return bundleM38948;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = closeable2;
                                    inputStream = inputStream2;
                                    inputStream2 = outputStream;
                                    m38946(inputStream2);
                                    m38946(inputStream);
                                    m38946(closeable);
                                    m38947(processExec);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                                closeable = null;
                                inputStream2 = outputStream;
                                try {
                                    bundleM38948 = m38948(2, "", th.toString());
                                    m38946(inputStream2);
                                    m38946(inputStream);
                                    m38946(closeable);
                                    m38947(processExec);
                                    return bundleM38948;
                                } catch (Throwable th3) {
                                    th = th3;
                                    m38946(inputStream2);
                                    m38946(inputStream);
                                    m38946(closeable);
                                    m38947(processExec);
                                    throw th;
                                }
                            }
                        }
                        inputStream = processExec.getInputStream();
                        InputStream errorStream = processExec.getErrorStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Thread thread = new Thread(new RunnableC10493(inputStream, byteArrayOutputStream));
                        thread.setDaemon(true);
                        thread.setName("ShizukuCommand-stdout");
                        thread.start();
                        Thread thread2 = new Thread(new RunnableC10493(errorStream, byteArrayOutputStream2));
                        thread2.setDaemon(true);
                        thread2.setName("ShizukuCommand-stderr");
                        thread2.start();
                        if (i > 0) {
                            if (!C24711.m54350(processExec, i)) {
                                bundleM38948 = m38948(1, "", "Process timeout");
                            }
                            m38946(outputStream);
                            m38946(inputStream);
                            m38946(errorStream);
                            m38947(processExec);
                            return bundleM38948;
                        }
                        processExec.waitFor();
                        thread.join();
                        thread2.join();
                        bundleM38948 = m38948(0, byteArrayOutputStream.toString(C0233a.f1077D), byteArrayOutputStream2.toString(C0233a.f1077D));
                        m38946(outputStream);
                        m38946(inputStream);
                        m38946(errorStream);
                    } catch (InterruptedException e2) {
                        e = e2;
                        closeable2 = null;
                        outputStream = null;
                        Thread.currentThread().interrupt();
                        bundleM38948 = m38948(2, "", e.toString());
                        m38946(outputStream);
                        m38946(inputStream2);
                        m38946(closeable2);
                        m38947(processExec);
                        return bundleM38948;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        closeable = null;
                        bundleM38948 = m38948(2, "", th.toString());
                        m38946(inputStream2);
                        m38946(inputStream);
                        m38946(closeable);
                    }
                    m38947(processExec);
                    return bundleM38948;
                }
                InputStream errorStream2 = processExec.getErrorStream();
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                Thread thread3 = new Thread(new RunnableC10493(inputStream, byteArrayOutputStream3));
                thread3.setDaemon(true);
                thread3.setName("ShizukuCommand-stdout");
                thread3.start();
                Thread thread4 = new Thread(new RunnableC10493(errorStream2, byteArrayOutputStream4));
                thread4.setDaemon(true);
                thread4.setName("ShizukuCommand-stderr");
                thread4.start();
                if (i > 0) {
                    if (!C24711.m54350(processExec, i)) {
                        bundleM38948 = m38948(1, "", "Process timeout");
                    }
                    m38946(outputStream);
                    m38946(inputStream);
                    m38946(errorStream2);
                    m38947(processExec);
                    return bundleM38948;
                }
                processExec.waitFor();
                thread3.join();
                thread4.join();
                bundleM38948 = m38948(0, byteArrayOutputStream3.toString(C0233a.f1077D), byteArrayOutputStream4.toString(C0233a.f1077D));
                m38946(outputStream);
                m38946(inputStream);
                m38946(errorStream2);
            } catch (InterruptedException e3) {
                e = e3;
                inputStream2 = inputStream;
                closeable2 = null;
                Thread.currentThread().interrupt();
                bundleM38948 = m38948(2, "", e.toString());
                m38946(outputStream);
                m38946(inputStream2);
                m38946(closeable2);
            } catch (Throwable th5) {
                th = th5;
                closeable = null;
                inputStream2 = outputStream;
                bundleM38948 = m38948(2, "", th.toString());
                m38946(inputStream2);
                m38946(inputStream);
                m38946(closeable);
            }
            outputStream = null;
            inputStream = processExec.getInputStream();
        } catch (InterruptedException e4) {
            e = e4;
            closeable2 = null;
            processExec = null;
            outputStream = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            processExec = null;
            closeable = null;
        }
        m38947(processExec);
        return bundleM38948;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bundle m38948(int i, String str, String str2) {
        Bundle bundleM38944 = m38944(str, i, str2, false);
        long length = 16;
        long length2 = ((str == null || str.length() == 0) ? 16L : (((long) str.length()) * 2) + 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (str2 != null && str2.length() != 0) {
            length = 16 + (((long) str2.length()) * 2);
        }
        if (length2 + length > Math.max(0, 245760)) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                bundleM38944.writeToParcel(parcelObtain, 0);
                int iDataSize = parcelObtain.dataSize();
                parcelObtain.recycle();
                if (iDataSize > 262144) {
                    Bundle bundleM38945 = m38944(str, i, str2, true);
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        bundleM38945.writeToParcel(parcelObtain2, 0);
                        int iDataSize2 = parcelObtain2.dataSize();
                        parcelObtain2.recycle();
                        return iDataSize2 <= 262144 ? bundleM38945 : m38944("", 2, "Command output too large after compression", false);
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        return bundleM38944;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m38944(String str, int i, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0172c.f705a, i);
        m38945(bundle, "output", "output_gzip", str, z);
        m38945(bundle, C0708d.f2599O, "error_gzip", str2, z);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38945(Bundle bundle, String str, String str2, String str3, boolean z) {
        if (str3 == null) {
            str3 = "";
        }
        if (!z || str3.length() == 0) {
            bundle.putString(str, str3);
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(str3.getBytes(StandardCharsets.UTF_8));
                gZIPOutputStream.close();
                bundle.putByteArray(str2, byteArrayOutputStream.toByteArray());
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            bundle.putString(str, "Command output too large after compression");
        }
    }
}
