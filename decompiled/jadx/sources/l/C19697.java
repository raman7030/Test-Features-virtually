package l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import bin.mt.plus.Features3;
import com.alipay.sdk.m.w.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.᩵᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C19697 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f63628;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f63629;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f63630;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4921 f63632;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile long f63634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63635;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f63637;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f63638;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f63633 = new ReentrantLock();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63631 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63639 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f63636 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45311(C19697 c19697, String str) throws IOException {
        c19697.getClass();
        byte[] bArrM45320 = m45320(str);
        c19697.m45306((byte) 41);
        c19697.m45337(bArrM45320);
        c19697.f63630.flush();
        c19697.m45323(60, "Remove empty directory failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45316(C19697 c19697, String str, String str2, boolean z, IntConsumer intConsumer) throws IOException {
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        byte[] bArrM45320 = m45320(str2);
        c19697.m45306((byte) 34);
        c19697.m45337(bArrM45340);
        c19697.m45337(bArrM45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        boolean z2 = false;
        while (true) {
            int iM45323 = c19697.m45323(60, "Copy failed");
            if (iM45323 <= 0) {
                return;
            }
            if (intConsumer != null) {
                try {
                    intConsumer.accept(iM45323);
                } catch (CancellationException unused) {
                    if (!z2) {
                        c19697.m45306((byte) 118);
                        dataOutputStream.flush();
                        z2 = true;
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        try {
                            c19697.m45306((byte) 118);
                            dataOutputStream.flush();
                        } catch (IOException e) {
                            th.addSuppressed(e);
                        }
                    }
                    c19697.f63631.set(false);
                    c19697.m45344();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static long m45322(C19697 c19697, String str) throws IOException {
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 38);
        c19697.m45337(bArrM45340);
        c19697.f63630.flush();
        c19697.m45323(5, "get file actual size failed");
        return c19697.m45347();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45329(C19697 c19697, String str, String str2) throws IOException {
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        byte[] bArrM45320 = m45320(str2);
        c19697.m45306((byte) 23);
        c19697.m45337(bArrM45340);
        c19697.m45337(bArrM45320);
        c19697.f63630.flush();
        c19697.m45323(5, "Symlink failed");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45330(C19697 c19697, String str, boolean z) throws IOException {
        c19697.getClass();
        byte[] bArrM45320 = m45320(str);
        c19697.m45306(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB);
        c19697.m45337(bArrM45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c19697.m45323(5, "Mkdir failed");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45331(C19697 c19697, String str) throws IOException {
        c19697.getClass();
        byte[] bArrM45320 = m45320(str);
        c19697.m45306((byte) 40);
        c19697.m45337(bArrM45320);
        c19697.f63630.flush();
        c19697.m45323(60, "Unlink file or link failed");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m45334(C19697 c19697, String str) throws IOException {
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 24);
        c19697.m45337(bArrM45340);
        c19697.f63630.flush();
        c19697.m45323(5, "realPath failed");
        return c19697.m45345();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45336(C19697 c19697, String str, String str2) throws IOException {
        c19697.getClass();
        byte[] bArrM45320 = m45320(str);
        byte[] bArrM45321 = m45320(str2);
        c19697.m45306((byte) 29);
        c19697.m45337(bArrM45320);
        c19697.m45337(bArrM45321);
        c19697.f63630.flush();
        c19697.m45323(60, "Move failed");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Boolean m45349(C19697 c19697, String str) throws IOException {
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 25);
        c19697.m45337(bArrM45340);
        c19697.f63630.flush();
        c19697.m45323(5, "Check exists failed");
        try {
            return Boolean.valueOf(c19697.f63628.readByte() != 0);
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45317(C19697 c19697, byte[] bArr) throws IOException {
        C4879.m14234("Path", bArr);
        c19697.m45306((byte) 30);
        c19697.m45337(bArr);
        c19697.f63630.flush();
        c19697.m45323(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45318(C19697 c19697, byte[] bArr, byte[] bArr2) throws IOException {
        C4879.m14234("Path", bArr);
        C4879.m14234("Path", bArr2);
        c19697.m45306((byte) 29);
        c19697.m45337(bArr);
        c19697.m45337(bArr2);
        c19697.f63630.flush();
        c19697.m45323(60, "Move failed");
    }

    public C19697(InterfaceC4921 interfaceC4921, boolean z) throws IOException {
        this.f63632 = interfaceC4921;
        this.f63629 = z;
        DataInputStream dataInputStream = new DataInputStream(new C4174(this, interfaceC4921.getInputStream()));
        this.f63628 = dataInputStream;
        this.f63630 = new DataOutputStream(new C18991(this, new BufferedOutputStream(interfaceC4921.getOutputStream(), interfaceC4921.getSendBufferSize())));
        byte[] bArr = new byte[4];
        try {
            dataInputStream.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C22518.f72868)) {
                throw new IOException("Magic error");
            }
            this.f63637 = m45332();
            this.f63635 = m45332();
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45389() {
        this.f63634 = 0L;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45381() {
        String.format("[%08x]", Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45307(IOException iOException) {
        m45381();
        this.f63631.set(false);
        m45344();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private IOException m45343(String str) {
        IOException iOException = new IOException(str);
        m45381();
        this.f63631.set(false);
        m45344();
        return iOException;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m45344() {
        if (this.f63639.compareAndSet(false, true)) {
            this.f63631.set(false);
            C0349.m1793(this.f63632);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m45348() throws IOException {
        try {
            int i = this.f63628.read();
            if (i >= 0) {
                return i;
            }
            EOFException eOFException = new EOFException("Connection closed");
            m45307(eOFException);
            throw eOFException;
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m45298(C19697 c19697) throws IOException {
        try {
            return c19697.f63628.readByte();
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private int m45332() throws IOException {
        try {
            return this.f63628.readInt();
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private long m45347() throws IOException {
        try {
            return this.f63628.readLong();
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InputStream m45390(String str) {
        String str2 = "r";
        ParcelFileDescriptor parcelFileDescriptorM45372 = m45372(str, "r");
        if (parcelFileDescriptorM45372 != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorM45372);
        }
        return new BufferedInputStream(new C1351((C5585) m45303((InterfaceC7059) new C21876(this, str, str2), true)), this.f63637);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream m45380(String str, boolean z) {
        String strM50489 = C22518.m50489(str);
        ParcelFileDescriptor parcelFileDescriptorM45372 = m45372(strM50489, z ? am.av : "w");
        if (parcelFileDescriptorM45372 != null) {
            return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorM45372);
        }
        return new BufferedOutputStream(new C8407((C5585) m45303((InterfaceC7059) new C21876(this, strM50489, z ? am.av : "w"), true)), this.f63637);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 m45388(String str, String str2) {
        if (C22518.m50485(str2)) {
            str = C22518.m50489(str);
        }
        ParcelFileDescriptor parcelFileDescriptorM45372 = m45372(str, str2);
        if (parcelFileDescriptorM45372 != null) {
            return new C21813(parcelFileDescriptorM45372, str, str2, this.f63629);
        }
        return new C15461((C5585) m45303((InterfaceC7059) new C21876(this, str, str2), true), str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m45378() {
        return this.f63633.isLocked() || this.f63636.get() > 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor m45372(final String str, final String str2) {
        InterfaceC4921 interfaceC4921 = this.f63632;
        if (!interfaceC4921.mo14297()) {
            return null;
        }
        final String strSubstring = str.substring(0, str.lastIndexOf(47) + 1);
        if (C22518.f72870.contains(strSubstring)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (str.startsWith("/storage/emulated/999/Android/")) {
                String strSubstring2 = str.substring(30);
                if (strSubstring2.startsWith("data/") || strSubstring2.startsWith("obb/")) {
                    return null;
                }
            }
            if (str.startsWith("/mnt/user/999/self/primary/Android/")) {
                String strSubstring3 = str.substring(35);
                if (strSubstring3.startsWith("data/") || strSubstring3.startsWith("obb/")) {
                    return null;
                }
            }
        }
        final int iMo14299 = interfaceC4921.mo14299();
        if (iMo14299 < 0) {
            return null;
        }
        return (ParcelFileDescriptor) m45303(new InterfaceC7059() { // from class: l.ۙ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45302(this.f15574, str, str2, iMo14299, strSubstring);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m45302(final C19697 c19697, String str, String str2, final int i, String str3) throws IOException {
        byte bM50487 = C22518.m50487(str2);
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 10);
        c19697.m45337(bArrM45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeByte(bM50487);
        dataOutputStream.flush();
        AtomicBoolean atomicBoolean = c19697.f63631;
        Future futureSubmit = C1802.f6208.submit(new Callable() { // from class: l.ܽ᩶ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C19697.m45333(this.f51779, i);
            }
        });
        for (int i2 = 0; i2 < 10; i2++) {
            try {
                long jLongValue = ((Long) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).longValue();
                byte b = (byte) ((jLongValue >>> 32) & 255);
                if (b == -1) {
                    String strM45345 = c19697.m45345();
                    if (strM45345.isEmpty()) {
                        strM45345 = "Open fd failed";
                    }
                    throw new IOException(strM45345);
                }
                if (b != 0) {
                    throw c19697.m45343(C19370.m44628(b, "Unknown open fd result code: "));
                }
                int i3 = (int) jLongValue;
                if (i3 >= 0) {
                    return ParcelFileDescriptor.adoptFd(i3);
                }
                C22518.f72870.add(str3);
                return null;
            } catch (InterruptedException e) {
                atomicBoolean.set(false);
                c19697.m45344();
                throw new IOException(e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(cause);
            } catch (TimeoutException unused) {
            }
        }
        atomicBoolean.set(false);
        c19697.m45344();
        futureSubmit.cancel(true);
        throw new C19401("Open fd failed, timeout after 5 seconds");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5585 m45305(C19697 c19697, String str, String str2) throws IOException {
        byte bM50487 = C22518.m50487(str2);
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 11);
        c19697.m45337(bArrM45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeByte(bM50487);
        dataOutputStream.flush();
        c19697.m45323(5, "Open failed");
        try {
            C5585 c5585 = new C5585(c19697, c19697.f63628.readUnsignedShort());
            c19697.f63636.incrementAndGet();
            return c5585;
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45299(C19697 c19697, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c19697.f63630;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, c19697.f63637);
        c19697.m45306((byte) 12);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(iMin);
        dataOutputStream.flush();
        c19697.m45323(8, "Read failed");
        int iM45332 = c19697.m45332();
        if (iM45332 < 0 || iM45332 > iMin || iM45332 > bArr.length - i3) {
            throw c19697.m45343(C19370.m44628(iM45332, "Invalid read size: "));
        }
        try {
            c19697.f63628.readFully(bArr, i3, iM45332);
            if (iM45332 == 0) {
                return -1;
            }
            return iM45332;
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45374(final int i, final byte[] bArr, final int i2, final int i3) {
        m45308(new InterfaceC14819() { // from class: l.᩺᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45327(this.f74766, i, i3, i2, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45327(C19697 c19697, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c19697.f63630;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        c19697.m45306(cb.k);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.write(bArr, i3, i2);
        dataOutputStream.flush();
        c19697.m45323(8, "Write failed");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45382(final int i) {
        m45308(new InterfaceC14819() { // from class: l.ۧ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45342(this.f33673, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45342(C19697 c19697, int i) throws IOException {
        c19697.m45306(cb.f77931l);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c19697.m45323(8, "Sync failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45352(final int i) {
        m45308(new InterfaceC14819() { // from class: l.֫᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45326(this.f6860, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45326(C19697 c19697, int i) {
        AtomicInteger atomicInteger = c19697.f63636;
        DataOutputStream dataOutputStream = c19697.f63630;
        try {
            try {
                c19697.m45306((byte) 15);
                dataOutputStream.writeShort(i);
                dataOutputStream.flush();
                c19697.m45323(8, "Close failed");
                atomicInteger.decrementAndGet();
            } catch (IOException e) {
                c19697.f63631.set(false);
                c19697.m45344();
                throw e;
            }
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m45386(final int i) {
        return m45301(new InterfaceC23992() { // from class: l.ܿ᩶ܿ
            @Override // l.InterfaceC23992
            public final long call() {
                return C19697.m45338(this.f53729, i);
            }
        });
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m45338(C19697 c19697, int i) throws IOException {
        c19697.m45306((byte) 16);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c19697.m45323(5, "Tell failed");
        return c19697.m45347();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45353(final int i, final long j) {
        m45308(new InterfaceC14819() { // from class: l.ܰ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45328(this.f42592, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45328(C19697 c19697, int i, long j) throws IOException {
        c19697.m45306((byte) 17);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c19697.m45323(5, "Seek failed");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m45370(final int i) {
        return m45301(new InterfaceC23992() { // from class: l.ۤ᩹ܿ
            @Override // l.InterfaceC23992
            public final long call() {
                return C19697.m45300(this.f31785, i);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m45300(C19697 c19697, int i) throws IOException {
        c19697.m45306((byte) 18);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c19697.m45323(5, "Length failed");
        return c19697.m45347();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45373(final int i, final long j) {
        m45308(new InterfaceC14819() { // from class: l.ۛ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45309(this.f19673, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45309(C19697 c19697, int i, long j) throws IOException {
        c19697.m45306((byte) 19);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c19697.m45323(5, "Truncate failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m45350(final String str, final boolean z) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ۚ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45304(this.f17433, str, z);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m45387(final String str) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ۗ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45339(this.f11211, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m45384(final String str) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ܳ᩶ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45324(this.f45070, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m45377(final String str) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ۘ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45346(this.f13747, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17642 m45366(final String str) {
        return (C17642) m45303(new InterfaceC7059() { // from class: l.ܺ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45341(this.f49964, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m45371(final String str) {
        return m45301(new InterfaceC23992() { // from class: l.᩶᩹ܿ
            @Override // l.InterfaceC23992
            public final long call() {
                return C19697.m45322(this.f65973, str);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45357(final String str, final String str2) {
        m45308(new InterfaceC14819() { // from class: l.ᩳ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45329(this.f56855, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m45369(final String str) {
        return (String) m45303(new InterfaceC7059() { // from class: l.ۖ᩶ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45334(this.f8585, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45361(final String str) {
        return ((Boolean) m45303(new InterfaceC7059() { // from class: l.᩷᩶ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45349(this.f68095, str);
            }
        }, true)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] m45362(final String str, final ArrayList arrayList) throws IOException {
        if (arrayList.size() > 65535) {
            throw new IOException("Too many names");
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return (boolean[]) m45303(new InterfaceC7059() { // from class: l.ᩴ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45319(this.f60020, str, arrayList);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean[] m45319(C19697 c19697, String str, ArrayList arrayList) throws IOException {
        DataOutputStream dataOutputStream = c19697.f63630;
        byte[] bArrM45340 = m45340(str, "Base path");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArrM45341 = m45340((String) it.next(), "Name");
            if (bArrM45340.length + bArrM45341.length + 1 > 4097) {
                throw new IOException("Combined path too long");
            }
            arrayList2.add(bArrM45341);
        }
        c19697.m45306((byte) 36);
        c19697.m45337(bArrM45340);
        dataOutputStream.writeShort(arrayList.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c19697.m45337((byte[]) it2.next());
        }
        dataOutputStream.flush();
        c19697.m45323(5, "Check batch exists failed");
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            try {
                zArr[i] = c19697.f63628.readByte() != 0;
            } catch (IOException e) {
                c19697.m45307(e);
                throw e;
            }
        }
        return zArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45356(final String str, final int i, final boolean z, final boolean z2) {
        m45308(new InterfaceC14819() { // from class: l.ۨ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45314(this.f35922, str, i, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45314(C19697 c19697, String str, int i, boolean z, boolean z2) throws IOException {
        byte[] bArrM45320 = m45320(str);
        c19697.m45306((byte) 26);
        c19697.m45337(bArrM45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c19697.m45323(5, "Chmod failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45355(final String str, final int i, final int i2, final boolean z, final boolean z2) {
        m45308(new InterfaceC14819() { // from class: l.ۖ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45313(this.f9046, str, i, i2, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45313(C19697 c19697, String str, int i, int i2, boolean z, boolean z2) throws IOException {
        byte[] bArrM45320 = m45320(str);
        c19697.m45306((byte) 27);
        c19697.m45337(bArrM45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeInt(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c19697.m45323(5, "Chown failed");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45375(final String str, final boolean z) {
        m45308(new InterfaceC14819() { // from class: l.֡᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45330(this.f2683, str, z);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45383(final String str, final String str2) {
        m45308(new InterfaceC14819() { // from class: l.ܺ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45336(this.f49803, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45360(final byte[] bArr, final byte[] bArr2) {
        m45308(new InterfaceC14819() { // from class: l.ۢ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45318(this.f29673, bArr, bArr2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m45368(final String str) {
        m45308(new InterfaceC14819() { // from class: l.ۡ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45321(this.f27610, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45321(C19697 c19697, String str) throws IOException {
        byte[] bArrM45320 = m45320(str);
        c19697.m45306((byte) 30);
        c19697.m45337(bArrM45320);
        c19697.f63630.flush();
        c19697.m45323(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45376(final byte[] bArr) {
        m45308(new InterfaceC14819() { // from class: l.۠᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45317(this.f25900, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45363(final String str) {
        m45308(new InterfaceC14819() { // from class: l.᩻᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45331(this.f77605, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m45379(final String str) {
        m45308(new InterfaceC14819() { // from class: l.۟᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45311(this.f24005, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45354(final long j, final String str) {
        m45308(new InterfaceC14819() { // from class: l.ۜ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45315(this.f21596, str, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45315(C19697 c19697, String str, long j) throws IOException {
        byte[] bArrM45320 = m45320(str);
        c19697.m45306(bo.j);
        c19697.m45337(bArrM45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c19697.m45323(5, "Set time failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45359(final String str, EnumC3510... enumC3510Arr) {
        final int i = 0;
        for (EnumC3510 enumC3510 : enumC3510Arr) {
            i |= enumC3510.f11155;
        }
        m45308(new InterfaceC14819() { // from class: l.ܶ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45312(this.f47454, str, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45312(C19697 c19697, String str, int i) throws IOException {
        byte[] bArrM45320 = m45320(str);
        c19697.m45306(PublicSuffixDatabase.EXCEPTION_MARKER);
        c19697.m45337(bArrM45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeByte(1);
        dataOutputStream.writeInt(i);
        dataOutputStream.flush();
        c19697.m45323(5, "Remove attr failed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45358(final String str, final String str2, final boolean z, final IntConsumer intConsumer) {
        m45308(new InterfaceC14819() { // from class: l.ۢ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() throws IOException {
                C19697.m45316(this.f29915, str, str2, z, intConsumer);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m45365() throws IOException {
        try {
            m45308(new InterfaceC14819() { // from class: l.ۡ᩹ܿ
                @Override // l.InterfaceC14819
                public final void call() throws IOException {
                    C19697.m45325(this.f27791);
                }
            }, true);
        } catch (IOException e) {
            m45344();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45325(C19697 c19697) throws IOException {
        c19697.m45306((byte) 39);
        c19697.f63630.flush();
        c19697.m45323(5, "Ping failed");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45335(C19697 c19697) throws IOException {
        c19697.m45306((byte) 35);
        c19697.f63630.flush();
        c19697.f63631.set(false);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C17642 m45297() throws IOException {
        String str;
        int unsignedShort;
        DataInputStream dataInputStream = this.f63628;
        String strM45345 = m45345();
        try {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            int iM45332 = m45332();
            int iM45333 = m45332();
            long jM45347 = m45347();
            long jM45348 = m45347();
            long jM45349 = m45347();
            if ((61440 & unsignedShort2) == 40960) {
                String strM45346 = m45345();
                try {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    str = strM45346;
                } catch (IOException e) {
                    m45307(e);
                    throw e;
                }
            } else {
                str = null;
                unsignedShort = 0;
            }
            return new C17642(strM45345, unsignedShort2, iM45332, iM45333, jM45347, jM45348, jM45349, str, unsignedShort);
        } catch (IOException e2) {
            m45307(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private String m45345() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iM45348 = m45348();
            if (iM45348 > 0) {
                byteArrayOutputStream.write(iM45348);
            } else {
                return byteArrayOutputStream.toString(a.D);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m45304(C19697 c19697, String str, boolean z) throws IOException {
        int iM45348;
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 20);
        c19697.m45337(bArrM45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c19697.m45323(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM45348 = c19697.m45348();
            if (iM45348 != 254) {
                break;
            }
            arrayList.add(c19697.m45297());
        }
        if (iM45348 == 239) {
            return arrayList;
        }
        c19697.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45324(C19697 c19697, String str) throws IOException {
        int iM45348;
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 21);
        c19697.m45337(bArrM45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c19697.m45323(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM45348 = c19697.m45348();
            if (iM45348 != 254) {
                break;
            }
            arrayList.add(c19697.m45345());
        }
        if (iM45348 == 239) {
            return arrayList;
        }
        c19697.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45339(C19697 c19697, String str) throws IOException {
        int iM45348;
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 42);
        c19697.m45337(bArrM45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c19697.m45323(30, "Checked list dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM45348 = c19697.m45348();
            if (iM45348 != 254) {
                break;
            }
            arrayList.add(c19697.m45297());
        }
        if (iM45348 == 255) {
            String strM45345 = c19697.m45345();
            throw new IOException(strM45345.isEmpty() ? "Checked list dir failed" : strM45345);
        }
        if (iM45348 == 239) {
            return arrayList;
        }
        throw c19697.m45343(C19370.m44628(iM45348, "Invalid checked directory stream marker: "));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C17642 m45341(C19697 c19697, String str) throws IOException {
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 22);
        c19697.m45337(bArrM45340);
        c19697.f63630.flush();
        c19697.m45323(5, "Read file info failed");
        return c19697.m45297();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m45346(C19697 c19697, String str) throws IOException {
        int iM45348;
        c19697.getClass();
        byte[] bArrM45340 = m45340(str, "Path");
        c19697.m45306((byte) 37);
        c19697.m45337(bArrM45340);
        c19697.f63630.flush();
        c19697.m45323(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM45348 = c19697.m45348();
            if (iM45348 != 254) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int iM45349 = c19697.m45348();
                if (iM45349 > 0) {
                    byteArrayOutputStream.write(iM45349);
                }
            }
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        if (iM45348 == 239) {
            return arrayList;
        }
        c19697.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static byte[] m45320(String str) {
        return m45340(C22518.m50489(str), "Path");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m45340(String str, String str2) throws IOException {
        byte[] bytes = str.getBytes(C22518.f72872);
        C4879.m14234(str2, bytes);
        return bytes;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45337(byte[] bArr) throws IOException {
        int length = bArr.length + 1;
        DataOutputStream dataOutputStream = this.f63630;
        dataOutputStream.writeShort(length);
        dataOutputStream.write(bArr);
        dataOutputStream.write(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45306(byte b) throws IOException {
        if (!this.f63631.get()) {
            throw new IOException("Connection closed");
        }
        this.f63630.writeByte(b);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m45323(int i, String str) throws IOException {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        Future futureSubmit = C1802.f6208.submit(new CallableC14029(1, this));
        int i2 = i * 2;
        int i3 = 0;
        while (true) {
            AtomicBoolean atomicBoolean = this.f63631;
            if (i3 < i2) {
                try {
                    byte bByteValue = ((Byte) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).byteValue();
                    if (bByteValue == -1) {
                        String strM45345 = m45345();
                        if (strM45345.isEmpty()) {
                            strM45345 = str;
                        }
                        throw new IOException(strM45345);
                    }
                    if (bByteValue != 0) {
                        if (bByteValue == 1) {
                            return m45332();
                        }
                        if (bByteValue != 2) {
                            throw m45343("Unknown result code: " + ((int) bByteValue));
                        }
                    }
                    return 0;
                } catch (InterruptedException e) {
                    atomicBoolean.set(false);
                    m45344();
                    throw new IOException(e);
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new IOException(cause);
                } catch (TimeoutException unused) {
                    i3++;
                }
            } else {
                atomicBoolean.set(false);
                m45344();
                futureSubmit.cancel(true);
                throw new C19401(str + ", timeout after " + i + " seconds");
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Long m45333(C19697 c19697, int i) throws IOException {
        try {
            return Long.valueOf(Features3.receiveFdResponse(i));
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m45367() {
        return this.f63635 == 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45364() {
        return this.f63635 == 2000;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45391() {
        int i = this.f63635;
        return i == 0 || i == 2000;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m45385() {
        return this.f63635;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f63638 = true;
        if (this.f63639.get()) {
            return;
        }
        try {
            if (this.f63631.get()) {
                m45308(new InterfaceC14819() { // from class: l.᩷᩹ܿ
                    @Override // l.InterfaceC14819
                    public final void call() throws IOException {
                        C19697.m45335(this.f68233);
                    }
                }, false);
            }
        } finally {
            m45344();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45351() {
        this.f63638 = true;
        if (m45378()) {
            C1802.f6208.submit(new Runnable() { // from class: l.᩵᩹ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C19697 c19697 = this.f63818;
                    c19697.getClass();
                    for (int i = 0; i < 100; i++) {
                        SystemClock.sleep(100L);
                        if (!c19697.m45378()) {
                            break;
                        }
                    }
                    C0349.m1793(c19697);
                    c19697.f63631.set(false);
                }
            });
        } else {
            C0349.m1793(this);
            this.f63631.set(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45308(final InterfaceC14819 interfaceC14819, boolean z) {
        this.f63633.lock();
        try {
            if (!this.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f63632.mo14298() && C10975.m27284()) {
                try {
                    C1802.f6208.submit(new Callable() { // from class: l.֨᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            interfaceC14819.call();
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    C22518.m50482(th);
                    throw null;
                }
            } else {
                interfaceC14819.call();
            }
            this.f63634 = z ? System.currentTimeMillis() : 0L;
            this.f63633.unlock();
        } catch (Throwable th2) {
            try {
                C22518.m50482(th2);
                throw null;
            } catch (Throwable th3) {
                this.f63634 = z ? System.currentTimeMillis() : 0L;
                this.f63633.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45301(final InterfaceC23992 interfaceC23992) {
        long jCall;
        this.f63633.lock();
        try {
            if (!this.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f63632.mo14298() && C10975.m27284()) {
                try {
                    jCall = ((Long) C1802.f6208.submit(new Callable() { // from class: l.۫᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(interfaceC23992.call());
                        }
                    }).get()).longValue();
                } catch (Throwable th) {
                    C22518.m50482(th);
                    throw null;
                }
            } else {
                jCall = interfaceC23992.call();
            }
            this.f63633.unlock();
            this.f63634 = 0L;
            return jCall;
        } catch (Throwable th2) {
            try {
                C22518.m50482(th2);
                throw null;
            } catch (Throwable th3) {
                this.f63633.unlock();
                this.f63634 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m45303(final InterfaceC7059 interfaceC7059, boolean z) {
        Object objCall;
        this.f63633.lock();
        try {
            if (!this.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f63632.mo14298() && C10975.m27284()) {
                try {
                    objCall = C1802.f6208.submit(new Callable() { // from class: l.᩹᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return interfaceC7059.call();
                        }
                    }).get();
                } catch (Throwable th) {
                    C22518.m50482(th);
                    throw null;
                }
            } else {
                objCall = interfaceC7059.call();
            }
            this.f63633.unlock();
            this.f63634 = 0L;
            return objCall;
        } catch (Throwable th2) {
            try {
                if (!z) {
                    C22518.m50482(th2);
                    throw null;
                }
                C22518.m50482(th2);
                throw null;
            } catch (Throwable th3) {
                this.f63633.unlock();
                this.f63634 = 0L;
                throw th3;
            }
        }
    }
}
