package l;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.system.Os;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
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
public class BinderC15603 extends AbstractBinderC13611 {
    @InterfaceC4801
    public BinderC15603() {
        attachInterface(this, "bin.mt.shell.IShizukuCommand");
    }

    @Override // l.InterfaceC7262
    /* JADX INFO: renamed from: ֫ */
    public final int mo19481() {
        return Os.getuid();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36785(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36786(Process process) {
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
    @Override // l.InterfaceC7262
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo19482(int i, String str, String str2) {
        InputStream inputStream;
        Process processExec;
        Closeable closeable;
        Closeable closeable2;
        OutputStream outputStream;
        Bundle bundleM36787;
        InputStream inputStream2 = null;
        try {
            processExec = Runtime.getRuntime().exec(str);
            try {
                if (str2 != null) {
                    try {
                        if (str2.length() > 0) {
                            outputStream = processExec.getOutputStream();
                            try {
                                outputStream.write(str2.getBytes(a.D));
                                outputStream.flush();
                            } catch (InterruptedException e) {
                                e = e;
                                closeable2 = null;
                                try {
                                    Thread.currentThread().interrupt();
                                    bundleM36787 = m36787(2, "", e.toString());
                                    m36785(outputStream);
                                    m36785(inputStream2);
                                    m36785(closeable2);
                                    m36786(processExec);
                                    return bundleM36787;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = closeable2;
                                    inputStream = inputStream2;
                                    inputStream2 = outputStream;
                                    m36785(inputStream2);
                                    m36785(inputStream);
                                    m36785(closeable);
                                    m36786(processExec);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                                closeable = null;
                                inputStream2 = outputStream;
                                try {
                                    bundleM36787 = m36787(2, "", th.toString());
                                    m36785(inputStream2);
                                    m36785(inputStream);
                                    m36785(closeable);
                                    m36786(processExec);
                                    return bundleM36787;
                                } catch (Throwable th3) {
                                    th = th3;
                                    m36785(inputStream2);
                                    m36785(inputStream);
                                    m36785(closeable);
                                    m36786(processExec);
                                    throw th;
                                }
                            }
                        }
                        inputStream = processExec.getInputStream();
                        InputStream errorStream = processExec.getErrorStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Thread thread = new Thread(new RunnableC8549(inputStream, byteArrayOutputStream));
                        thread.setDaemon(true);
                        thread.setName("ShizukuCommand-stdout");
                        thread.start();
                        Thread thread2 = new Thread(new RunnableC8549(errorStream, byteArrayOutputStream2));
                        thread2.setDaemon(true);
                        thread2.setName("ShizukuCommand-stderr");
                        thread2.start();
                        if (i > 0) {
                            if (!C23509.m51948(processExec, i)) {
                                bundleM36787 = m36787(1, "", "Process timeout");
                            }
                            m36785(outputStream);
                            m36785(inputStream);
                            m36785(errorStream);
                            m36786(processExec);
                            return bundleM36787;
                        }
                        processExec.waitFor();
                        thread.join();
                        thread2.join();
                        bundleM36787 = m36787(0, byteArrayOutputStream.toString(a.D), byteArrayOutputStream2.toString(a.D));
                        m36785(outputStream);
                        m36785(inputStream);
                        m36785(errorStream);
                    } catch (InterruptedException e2) {
                        e = e2;
                        closeable2 = null;
                        outputStream = null;
                        Thread.currentThread().interrupt();
                        bundleM36787 = m36787(2, "", e.toString());
                        m36785(outputStream);
                        m36785(inputStream2);
                        m36785(closeable2);
                        m36786(processExec);
                        return bundleM36787;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        closeable = null;
                        bundleM36787 = m36787(2, "", th.toString());
                        m36785(inputStream2);
                        m36785(inputStream);
                        m36785(closeable);
                    }
                    m36786(processExec);
                    return bundleM36787;
                }
                InputStream errorStream2 = processExec.getErrorStream();
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                Thread thread3 = new Thread(new RunnableC8549(inputStream, byteArrayOutputStream3));
                thread3.setDaemon(true);
                thread3.setName("ShizukuCommand-stdout");
                thread3.start();
                Thread thread4 = new Thread(new RunnableC8549(errorStream2, byteArrayOutputStream4));
                thread4.setDaemon(true);
                thread4.setName("ShizukuCommand-stderr");
                thread4.start();
                if (i > 0) {
                    if (!C23509.m51948(processExec, i)) {
                        bundleM36787 = m36787(1, "", "Process timeout");
                    }
                    m36785(outputStream);
                    m36785(inputStream);
                    m36785(errorStream2);
                    m36786(processExec);
                    return bundleM36787;
                }
                processExec.waitFor();
                thread3.join();
                thread4.join();
                bundleM36787 = m36787(0, byteArrayOutputStream3.toString(a.D), byteArrayOutputStream4.toString(a.D));
                m36785(outputStream);
                m36785(inputStream);
                m36785(errorStream2);
            } catch (InterruptedException e3) {
                e = e3;
                inputStream2 = inputStream;
                closeable2 = null;
                Thread.currentThread().interrupt();
                bundleM36787 = m36787(2, "", e.toString());
                m36785(outputStream);
                m36785(inputStream2);
                m36785(closeable2);
            } catch (Throwable th5) {
                th = th5;
                closeable = null;
                inputStream2 = outputStream;
                bundleM36787 = m36787(2, "", th.toString());
                m36785(inputStream2);
                m36785(inputStream);
                m36785(closeable);
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
        m36786(processExec);
        return bundleM36787;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m36787(int i, String str, String str2) {
        Bundle bundleM36783 = m36783(str, i, str2, false);
        long length = 16;
        long length2 = ((str == null || str.length() == 0) ? 16L : (((long) str.length()) * 2) + 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (str2 != null && str2.length() != 0) {
            length = 16 + (((long) str2.length()) * 2);
        }
        if (length2 + length > Math.max(0, 245760)) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                bundleM36783.writeToParcel(parcelObtain, 0);
                int iDataSize = parcelObtain.dataSize();
                parcelObtain.recycle();
                if (iDataSize > 262144) {
                    Bundle bundleM36784 = m36783(str, i, str2, true);
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        bundleM36784.writeToParcel(parcelObtain2, 0);
                        int iDataSize2 = parcelObtain2.dataSize();
                        parcelObtain2.recycle();
                        return iDataSize2 <= 262144 ? bundleM36784 : m36783("", 2, "Command output too large after compression", false);
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
        return bundleM36783;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m36783(String str, int i, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt(c.a, i);
        m36784(bundle, "output", "output_gzip", str, z);
        m36784(bundle, d.O, "error_gzip", str2, z);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36784(Bundle bundle, String str, String str2, String str3, boolean z) {
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
