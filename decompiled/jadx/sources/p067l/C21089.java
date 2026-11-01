package p067l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import bin.p000mt.plus.Features3;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
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
public final class C21089 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final DataInputStream f66249;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f66250;

    /* JADX INFO: renamed from: ۛ */
    public final DataOutputStream f66251;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC7046 f66253;

    /* JADX INFO: renamed from: ۬ */
    public volatile long f66255;

    /* JADX INFO: renamed from: ܰ */
    public final int f66256;

    /* JADX INFO: renamed from: ᩸ */
    public final int f66258;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f66259;

    /* JADX INFO: renamed from: ۫ */
    public final ReentrantLock f66254 = new ReentrantLock();

    /* JADX INFO: renamed from: ۤ */
    public final AtomicBoolean f66252 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩺ */
    public final AtomicBoolean f66260 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶ */
    public final AtomicInteger f66257 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47608(C21089 c21089, String str) throws IOException {
        c21089.getClass();
        byte[] bArrM47617 = m47617(str);
        c21089.m47603((byte) 41);
        c21089.m47634(bArrM47617);
        c21089.f66251.flush();
        c21089.m47620(60, "Remove empty directory failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47613(C21089 c21089, String str, String str2, boolean z, IntConsumer intConsumer) throws IOException {
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        byte[] bArrM47617 = m47617(str2);
        c21089.m47603((byte) 34);
        c21089.m47634(bArrM47637);
        c21089.m47634(bArrM47617);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        boolean z2 = false;
        while (true) {
            int iM47620 = c21089.m47620(60, "Copy failed");
            if (iM47620 <= 0) {
                return;
            }
            if (intConsumer != null) {
                try {
                    intConsumer.accept(iM47620);
                } catch (CancellationException unused) {
                    if (!z2) {
                        c21089.m47603((byte) 118);
                        dataOutputStream.flush();
                        z2 = true;
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        try {
                            c21089.m47603((byte) 118);
                            dataOutputStream.flush();
                        } catch (IOException e) {
                            th.addSuppressed(e);
                        }
                    }
                    c21089.f66252.set(false);
                    c21089.m47641();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static long m47619(C21089 c21089, String str) throws IOException {
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 38);
        c21089.m47634(bArrM47637);
        c21089.f66251.flush();
        c21089.m47620(5, "get file actual size failed");
        return c21089.m47644();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m47626(C21089 c21089, String str, String str2) throws IOException {
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        byte[] bArrM47617 = m47617(str2);
        c21089.m47603((byte) 23);
        c21089.m47634(bArrM47637);
        c21089.m47634(bArrM47617);
        c21089.f66251.flush();
        c21089.m47620(5, "Symlink failed");
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47627(C21089 c21089, String str, boolean z) throws IOException {
        c21089.getClass();
        byte[] bArrM47617 = m47617(str);
        c21089.m47603(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB);
        c21089.m47634(bArrM47617);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c21089.m47620(5, "Mkdir failed");
    }

    /* JADX INFO: renamed from: ܳ */
    public static /* synthetic */ void m47628(C21089 c21089, String str) throws IOException {
        c21089.getClass();
        byte[] bArrM47617 = m47617(str);
        c21089.m47603((byte) 40);
        c21089.m47634(bArrM47617);
        c21089.f66251.flush();
        c21089.m47620(60, "Unlink file or link failed");
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m47631(C21089 c21089, String str) throws IOException {
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 24);
        c21089.m47634(bArrM47637);
        c21089.f66251.flush();
        c21089.m47620(5, "realPath failed");
        return c21089.m47642();
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m47633(C21089 c21089, String str, String str2) throws IOException {
        c21089.getClass();
        byte[] bArrM47617 = m47617(str);
        byte[] bArrM47618 = m47617(str2);
        c21089.m47603((byte) 29);
        c21089.m47634(bArrM47617);
        c21089.m47634(bArrM47618);
        c21089.f66251.flush();
        c21089.m47620(60, "Move failed");
    }

    /* JADX INFO: renamed from: ᩻ */
    public static Boolean m47646(C21089 c21089, String str) throws IOException {
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 25);
        c21089.m47634(bArrM47637);
        c21089.f66251.flush();
        c21089.m47620(5, "Check exists failed");
        try {
            return Boolean.valueOf(c21089.f66249.readByte() != 0);
        } catch (IOException e) {
            c21089.m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47614(C21089 c21089, byte[] bArr) throws IOException {
        C7006.m16116("Path", bArr);
        c21089.m47603((byte) 30);
        c21089.m47634(bArr);
        c21089.f66251.flush();
        c21089.m47620(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47615(C21089 c21089, byte[] bArr, byte[] bArr2) throws IOException {
        C7006.m16116("Path", bArr);
        C7006.m16116("Path", bArr2);
        c21089.m47603((byte) 29);
        c21089.m47634(bArr);
        c21089.m47634(bArr2);
        c21089.f66251.flush();
        c21089.m47620(60, "Move failed");
    }

    public C21089(InterfaceC7046 interfaceC7046, boolean z) throws IOException {
        this.f66253 = interfaceC7046;
        this.f66250 = z;
        DataInputStream dataInputStream = new DataInputStream(new C6336(this, interfaceC7046.getInputStream()));
        this.f66249 = dataInputStream;
        this.f66251 = new DataOutputStream(new C20418(this, new BufferedOutputStream(interfaceC7046.getOutputStream(), interfaceC7046.getSendBufferSize())));
        byte[] bArr = new byte[4];
        try {
            dataInputStream.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C23770.f75594)) {
                throw new IOException("Magic error");
            }
            this.f66258 = m47629();
            this.f66256 = m47629();
        } catch (IOException e) {
            m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m47686() {
        this.f66255 = 0L;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47678() {
        String.format("[%08x]", Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m47604(IOException iOException) {
        m47678();
        this.f66252.set(false);
        m47641();
    }

    /* JADX INFO: renamed from: ᩴ */
    private IOException m47640(String str) {
        IOException iOException = new IOException(str);
        m47678();
        this.f66252.set(false);
        m47641();
        return iOException;
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m47641() {
        if (this.f66260.compareAndSet(false, true)) {
            this.f66252.set(false);
            C2700.m4192(this.f66253);
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    private int m47645() throws IOException {
        try {
            int i = this.f66249.read();
            if (i >= 0) {
                return i;
            }
            EOFException eOFException = new EOFException("Connection closed");
            m47604(eOFException);
            throw eOFException;
        } catch (IOException e) {
            m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte m47595(C21089 c21089) throws IOException {
        try {
            return c21089.f66249.readByte();
        } catch (IOException e) {
            c21089.m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    private int m47629() throws IOException {
        try {
            return this.f66249.readInt();
        } catch (IOException e) {
            m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    private long m47644() throws IOException {
        try {
            return this.f66249.readLong();
        } catch (IOException e) {
            m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InputStream m47687(String str) {
        String str2 = "r";
        ParcelFileDescriptor parcelFileDescriptorM47669 = m47669(str, "r");
        if (parcelFileDescriptorM47669 != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorM47669);
        }
        return new BufferedInputStream(new C3653((C7677) m47600((InterfaceC9078) new C23160(this, str, str2), true)), this.f66258);
    }

    /* JADX INFO: renamed from: ܽ */
    public final OutputStream m47677(String str, boolean z) {
        String strM52831 = C23770.m52831(str);
        ParcelFileDescriptor parcelFileDescriptorM47669 = m47669(strM52831, z ? C0655am.f2320av : "w");
        if (parcelFileDescriptorM47669 != null) {
            return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorM47669);
        }
        return new BufferedOutputStream(new C10359((C7677) m47600((InterfaceC9078) new C23160(this, strM52831, z ? C0655am.f2320av : "w"), true)), this.f66258);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC4502 m47685(String str, String str2) {
        if (C23770.m52827(str2)) {
            str = C23770.m52831(str);
        }
        ParcelFileDescriptor parcelFileDescriptorM47669 = m47669(str, str2);
        if (parcelFileDescriptorM47669 != null) {
            return new C23100(parcelFileDescriptorM47669, str, str2, this.f66250);
        }
        return new C17063((C7677) m47600((InterfaceC9078) new C23160(this, str, str2), true), str, str2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m47675() {
        return this.f66254.isLocked() || this.f66257.get() > 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ParcelFileDescriptor m47669(final String str, final String str2) {
        InterfaceC7046 interfaceC7046 = this.f66253;
        if (!interfaceC7046.mo16194()) {
            return null;
        }
        final String strSubstring = str.substring(0, str.lastIndexOf(47) + 1);
        if (C23770.f75596.contains(strSubstring)) {
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
        final int iMo16196 = interfaceC7046.mo16196();
        if (iMo16196 < 0) {
            return null;
        }
        return (ParcelFileDescriptor) m47600(new InterfaceC9078() { // from class: l.ۙ᩹ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47599(this.f18406, str, str2, iMo16196, strSubstring);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ParcelFileDescriptor m47599(final C21089 c21089, String str, String str2, final int i, String str3) throws IOException {
        byte bM52829 = C23770.m52829(str2);
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 10);
        c21089.m47634(bArrM47637);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeByte(bM52829);
        dataOutputStream.flush();
        AtomicBoolean atomicBoolean = c21089.f66252;
        Future futureSubmit = C4081.f8987.submit(new Callable() { // from class: l.ܽ᩶ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C21089.m47630(this.f54958, i);
            }
        });
        for (int i2 = 0; i2 < 10; i2++) {
            try {
                long jLongValue = ((Long) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).longValue();
                byte b = (byte) ((jLongValue >>> 32) & 255);
                if (b == -1) {
                    String strM47642 = c21089.m47642();
                    if (strM47642.isEmpty()) {
                        strM47642 = "Open fd failed";
                    }
                    throw new IOException(strM47642);
                }
                if (b != 0) {
                    throw c21089.m47640(C20778.m46922(b, "Unknown open fd result code: "));
                }
                int i3 = (int) jLongValue;
                if (i3 >= 0) {
                    return ParcelFileDescriptor.adoptFd(i3);
                }
                C23770.f75596.add(str3);
                return null;
            } catch (InterruptedException e) {
                atomicBoolean.set(false);
                c21089.m47641();
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
        c21089.m47641();
        futureSubmit.cancel(true);
        throw new C20807("Open fd failed, timeout after 5 seconds");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7677 m47602(C21089 c21089, String str, String str2) throws IOException {
        byte bM52829 = C23770.m52829(str2);
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 11);
        c21089.m47634(bArrM47637);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeByte(bM52829);
        dataOutputStream.flush();
        c21089.m47620(5, "Open failed");
        try {
            C7677 c7677 = new C7677(c21089, c21089.f66249.readUnsignedShort());
            c21089.f66257.incrementAndGet();
            return c7677;
        } catch (IOException e) {
            c21089.m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47596(C21089 c21089, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c21089.f66251;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, c21089.f66258);
        c21089.m47603((byte) 12);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(iMin);
        dataOutputStream.flush();
        c21089.m47620(8, "Read failed");
        int iM47629 = c21089.m47629();
        if (iM47629 < 0 || iM47629 > iMin || iM47629 > bArr.length - i3) {
            throw c21089.m47640(C20778.m46922(iM47629, "Invalid read size: "));
        }
        try {
            c21089.f66249.readFully(bArr, i3, iM47629);
            if (iM47629 == 0) {
                return -1;
            }
            return iM47629;
        } catch (IOException e) {
            c21089.m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47671(final int i, final byte[] bArr, final int i2, final int i3) {
        m47605(new InterfaceC16453() { // from class: l.᩺᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47624(this.f77510, i, i3, i2, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47624(C21089 c21089, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c21089.f66251;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        c21089.m47603(C0698cb.f2569k);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.write(bArr, i3, i2);
        dataOutputStream.flush();
        c21089.m47620(8, "Write failed");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47679(final int i) {
        m47605(new InterfaceC16453() { // from class: l.ۧ᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47639(this.f36672, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m47639(C21089 c21089, int i) throws IOException {
        c21089.m47603(C0698cb.f2570l);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c21089.m47620(8, "Sync failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47649(final int i) {
        m47605(new InterfaceC16453() { // from class: l.֫᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() {
                C21089.m47623(this.f9643, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47623(C21089 c21089, int i) {
        AtomicInteger atomicInteger = c21089.f66257;
        DataOutputStream dataOutputStream = c21089.f66251;
        try {
            try {
                c21089.m47603((byte) 15);
                dataOutputStream.writeShort(i);
                dataOutputStream.flush();
                c21089.m47620(8, "Close failed");
                atomicInteger.decrementAndGet();
            } catch (IOException e) {
                c21089.f66252.set(false);
                c21089.m47641();
                throw e;
            }
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m47683(final int i) {
        return m47598(new InterfaceC25171() { // from class: l.ܿ᩶ܿ
            @Override // p067l.InterfaceC25171
            public final long call() {
                return C21089.m47635(this.f56919, i);
            }
        });
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ long m47635(C21089 c21089, int i) throws IOException {
        c21089.m47603((byte) 16);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c21089.m47620(5, "Tell failed");
        return c21089.m47644();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47650(final int i, final long j) {
        m47605(new InterfaceC16453() { // from class: l.ܰ᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47625(this.f45678, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47625(C21089 c21089, int i, long j) throws IOException {
        c21089.m47603((byte) 17);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c21089.m47620(5, "Seek failed");
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m47667(final int i) {
        return m47598(new InterfaceC25171() { // from class: l.ۤ᩹ܿ
            @Override // p067l.InterfaceC25171
            public final long call() {
                return C21089.m47597(this.f34755, i);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ long m47597(C21089 c21089, int i) throws IOException {
        c21089.m47603((byte) 18);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c21089.m47620(5, "Length failed");
        return c21089.m47644();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47670(final int i, final long j) {
        m47605(new InterfaceC16453() { // from class: l.ۛ᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47606(this.f22545, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47606(C21089 c21089, int i, long j) throws IOException {
        c21089.m47603((byte) 19);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c21089.m47620(5, "Truncate failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m47647(final String str, final boolean z) {
        return (List) m47600(new InterfaceC9078() { // from class: l.ۚ᩹ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47601(this.f20279, str, z);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m47684(final String str) {
        return (List) m47600(new InterfaceC9078() { // from class: l.ۗ᩹ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47636(this.f14017, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m47681(final String str) {
        return (List) m47600(new InterfaceC9078() { // from class: l.ܳ᩶ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47621(this.f48183, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m47674(final String str) {
        return (List) m47600(new InterfaceC9078() { // from class: l.ۘ᩹ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47643(this.f16560, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۜ */
    public final C19136 m47663(final String str) {
        return (C19136) m47600(new InterfaceC9078() { // from class: l.ܺ᩹ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47638(this.f53134, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m47668(final String str) {
        return m47598(new InterfaceC25171() { // from class: l.᩶᩹ܿ
            @Override // p067l.InterfaceC25171
            public final long call() {
                return C21089.m47619(this.f68649, str);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47654(final String str, final String str2) {
        m47605(new InterfaceC16453() { // from class: l.ᩳ᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47626(this.f60072, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m47666(final String str) {
        return (String) m47600(new InterfaceC9078() { // from class: l.ۖ᩶ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47631(this.f11379, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47658(final String str) {
        return ((Boolean) m47600(new InterfaceC9078() { // from class: l.᩷᩶ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47646(this.f70777, str);
            }
        }, true)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean[] m47659(final String str, final ArrayList arrayList) throws IOException {
        if (arrayList.size() > 65535) {
            throw new IOException("Too many names");
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return (boolean[]) m47600(new InterfaceC9078() { // from class: l.ᩴ᩹ܿ
            @Override // p067l.InterfaceC9078
            public final Object call() {
                return C21089.m47616(this.f63249, str, arrayList);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean[] m47616(C21089 c21089, String str, ArrayList arrayList) throws IOException {
        DataOutputStream dataOutputStream = c21089.f66251;
        byte[] bArrM47637 = m47637(str, "Base path");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArrM47638 = m47637((String) it.next(), "Name");
            if (bArrM47637.length + bArrM47638.length + 1 > 4097) {
                throw new IOException("Combined path too long");
            }
            arrayList2.add(bArrM47638);
        }
        c21089.m47603((byte) 36);
        c21089.m47634(bArrM47637);
        dataOutputStream.writeShort(arrayList.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c21089.m47634((byte[]) it2.next());
        }
        dataOutputStream.flush();
        c21089.m47620(5, "Check batch exists failed");
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            try {
                zArr[i] = c21089.f66249.readByte() != 0;
            } catch (IOException e) {
                c21089.m47604(e);
                throw e;
            }
        }
        return zArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47653(final String str, final int i, final boolean z, final boolean z2) {
        m47605(new InterfaceC16453() { // from class: l.ۨ᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47611(this.f38932, str, i, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47611(C21089 c21089, String str, int i, boolean z, boolean z2) throws IOException {
        byte[] bArrM47617 = m47617(str);
        c21089.m47603((byte) 26);
        c21089.m47634(bArrM47617);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c21089.m47620(5, "Chmod failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47652(final String str, final int i, final int i2, final boolean z, final boolean z2) {
        m47605(new InterfaceC16453() { // from class: l.ۖ᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47610(this.f11840, str, i, i2, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47610(C21089 c21089, String str, int i, int i2, boolean z, boolean z2) throws IOException {
        byte[] bArrM47617 = m47617(str);
        c21089.m47603((byte) 27);
        c21089.m47634(bArrM47617);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeInt(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c21089.m47620(5, "Chown failed");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47672(final String str, final boolean z) {
        m47605(new InterfaceC16453() { // from class: l.֡᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47627(this.f5456, str, z);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47680(final String str, final String str2) {
        m47605(new InterfaceC16453() { // from class: l.ܺ᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47633(this.f52969, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47657(final byte[] bArr, final byte[] bArr2) {
        m47605(new InterfaceC16453() { // from class: l.ۢ᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47615(this.f32624, bArr, bArr2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m47665(final String str) {
        m47605(new InterfaceC16453() { // from class: l.ۡ᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47618(this.f30547, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۜ */
    public static /* synthetic */ void m47618(C21089 c21089, String str) throws IOException {
        byte[] bArrM47617 = m47617(str);
        c21089.m47603((byte) 30);
        c21089.m47634(bArrM47617);
        c21089.f66251.flush();
        c21089.m47620(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47673(final byte[] bArr) {
        m47605(new InterfaceC16453() { // from class: l.۠᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47614(this.f28813, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m47660(final String str) {
        m47605(new InterfaceC16453() { // from class: l.᩻᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47628(this.f80356, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m47676(final String str) {
        m47605(new InterfaceC16453() { // from class: l.۟᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47608(this.f26919, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47651(final long j, final String str) {
        m47605(new InterfaceC16453() { // from class: l.ۜ᩶ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47612(this.f24476, str, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47612(C21089 c21089, String str, long j) throws IOException {
        byte[] bArrM47617 = m47617(str);
        c21089.m47603(C0684bo.f2505j);
        c21089.m47634(bArrM47617);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c21089.m47620(5, "Set time failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47656(final String str, EnumC5705... enumC5705Arr) {
        final int i = 0;
        for (EnumC5705 enumC5705 : enumC5705Arr) {
            i |= enumC5705.f13960;
        }
        m47605(new InterfaceC16453() { // from class: l.ܶ᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47609(this.f50586, str, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47609(C21089 c21089, String str, int i) throws IOException {
        byte[] bArrM47617 = m47617(str);
        c21089.m47603(PublicSuffixDatabase.EXCEPTION_MARKER);
        c21089.m47634(bArrM47617);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeByte(1);
        dataOutputStream.writeInt(i);
        dataOutputStream.flush();
        c21089.m47620(5, "Remove attr failed");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47655(final String str, final String str2, final boolean z, final IntConsumer intConsumer) {
        m47605(new InterfaceC16453() { // from class: l.ۢ᩹ܿ
            @Override // p067l.InterfaceC16453
            public final void call() throws IOException {
                C21089.m47613(this.f32872, str, str2, z, intConsumer);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m47662() throws IOException {
        try {
            m47605(new InterfaceC16453() { // from class: l.ۡ᩹ܿ
                @Override // p067l.InterfaceC16453
                public final void call() throws IOException {
                    C21089.m47622(this.f30731);
                }
            }, true);
        } catch (IOException e) {
            m47641();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47622(C21089 c21089) throws IOException {
        c21089.m47603((byte) 39);
        c21089.f66251.flush();
        c21089.m47620(5, "Ping failed");
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m47632(C21089 c21089) throws IOException {
        c21089.m47603((byte) 35);
        c21089.f66251.flush();
        c21089.f66252.set(false);
    }

    /* JADX INFO: renamed from: ֡ */
    private C19136 m47594() throws IOException {
        String str;
        int unsignedShort;
        DataInputStream dataInputStream = this.f66249;
        String strM47642 = m47642();
        try {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            int iM47629 = m47629();
            int iM476210 = m47629();
            long jM47644 = m47644();
            long jM47645 = m47644();
            long jM47646 = m47644();
            if ((61440 & unsignedShort2) == 40960) {
                String strM47643 = m47642();
                try {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    str = strM47643;
                } catch (IOException e) {
                    m47604(e);
                    throw e;
                }
            } else {
                str = null;
                unsignedShort = 0;
            }
            return new C19136(strM47642, unsignedShort2, iM47629, iM476210, jM47644, jM47645, jM47646, str, unsignedShort);
        } catch (IOException e2) {
            m47604(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    private String m47642() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iM47645 = m47645();
            if (iM47645 > 0) {
                byteArrayOutputStream.write(iM47645);
            } else {
                return byteArrayOutputStream.toString(C0233a.f1077D);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m47601(C21089 c21089, String str, boolean z) throws IOException {
        int iM47645;
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 20);
        c21089.m47634(bArrM47637);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c21089.m47620(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM47645 = c21089.m47645();
            if (iM47645 != 254) {
                break;
            }
            arrayList.add(c21089.m47594());
        }
        if (iM47645 == 239) {
            return arrayList;
        }
        c21089.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m47621(C21089 c21089, String str) throws IOException {
        int iM47645;
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 21);
        c21089.m47634(bArrM47637);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c21089.m47620(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM47645 = c21089.m47645();
            if (iM47645 != 254) {
                break;
            }
            arrayList.add(c21089.m47642());
        }
        if (iM47645 == 239) {
            return arrayList;
        }
        c21089.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ܿ */
    public static ArrayList m47636(C21089 c21089, String str) throws IOException {
        int iM47645;
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 42);
        c21089.m47634(bArrM47637);
        DataOutputStream dataOutputStream = c21089.f66251;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c21089.m47620(30, "Checked list dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM47645 = c21089.m47645();
            if (iM47645 != 254) {
                break;
            }
            arrayList.add(c21089.m47594());
        }
        if (iM47645 == 255) {
            String strM47642 = c21089.m47642();
            throw new IOException(strM47642.isEmpty() ? "Checked list dir failed" : strM47642);
        }
        if (iM47645 == 239) {
            return arrayList;
        }
        throw c21089.m47640(C20778.m46922(iM47645, "Invalid checked directory stream marker: "));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C19136 m47638(C21089 c21089, String str) throws IOException {
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 22);
        c21089.m47634(bArrM47637);
        c21089.f66251.flush();
        c21089.m47620(5, "Read file info failed");
        return c21089.m47594();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static ArrayList m47643(C21089 c21089, String str) throws IOException {
        int iM47645;
        c21089.getClass();
        byte[] bArrM47637 = m47637(str, "Path");
        c21089.m47603((byte) 37);
        c21089.m47634(bArrM47637);
        c21089.f66251.flush();
        c21089.m47620(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM47645 = c21089.m47645();
            if (iM47645 != 254) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int iM47646 = c21089.m47645();
                if (iM47646 > 0) {
                    byteArrayOutputStream.write(iM47646);
                }
            }
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        if (iM47645 == 239) {
            return arrayList;
        }
        c21089.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۘ */
    public static byte[] m47617(String str) {
        return m47637(C23770.m52831(str), "Path");
    }

    /* JADX INFO: renamed from: ܿ */
    public static byte[] m47637(String str, String str2) throws IOException {
        byte[] bytes = str.getBytes(C23770.f75598);
        C7006.m16116(str2, bytes);
        return bytes;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m47634(byte[] bArr) throws IOException {
        int length = bArr.length + 1;
        DataOutputStream dataOutputStream = this.f66251;
        dataOutputStream.writeShort(length);
        dataOutputStream.write(bArr);
        dataOutputStream.write(0);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47603(byte b) throws IOException {
        if (!this.f66252.get()) {
            throw new IOException("Connection closed");
        }
        this.f66251.writeByte(b);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m47620(int i, String str) throws IOException {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        Future futureSubmit = C4081.f8987.submit(new CallableC15702(1, this));
        int i2 = i * 2;
        int i3 = 0;
        while (true) {
            AtomicBoolean atomicBoolean = this.f66252;
            if (i3 < i2) {
                try {
                    byte bByteValue = ((Byte) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).byteValue();
                    if (bByteValue == -1) {
                        String strM47642 = m47642();
                        if (strM47642.isEmpty()) {
                            strM47642 = str;
                        }
                        throw new IOException(strM47642);
                    }
                    if (bByteValue != 0) {
                        if (bByteValue == 1) {
                            return m47629();
                        }
                        if (bByteValue != 2) {
                            throw m47640("Unknown result code: " + ((int) bByteValue));
                        }
                    }
                    return 0;
                } catch (InterruptedException e) {
                    atomicBoolean.set(false);
                    m47641();
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
                m47641();
                futureSubmit.cancel(true);
                throw new C20807(str + ", timeout after " + i + " seconds");
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ Long m47630(C21089 c21089, int i) throws IOException {
        try {
            return Long.valueOf(Features3.receiveFdResponse(i));
        } catch (IOException e) {
            c21089.m47604(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m47664() {
        return this.f66256 == 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m47661() {
        return this.f66256 == 2000;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m47688() {
        int i = this.f66256;
        return i == 0 || i == 2000;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m47682() {
        return this.f66256;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f66259 = true;
        if (this.f66260.get()) {
            return;
        }
        try {
            if (this.f66252.get()) {
                m47605(new InterfaceC16453() { // from class: l.᩷᩹ܿ
                    @Override // p067l.InterfaceC16453
                    public final void call() throws IOException {
                        C21089.m47632(this.f70916);
                    }
                }, false);
            }
        } finally {
            m47641();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47648() {
        this.f66259 = true;
        if (m47675()) {
            C4081.f8987.submit(new Runnable() { // from class: l.᩵᩹ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C21089 c21089 = this.f66453;
                    c21089.getClass();
                    for (int i = 0; i < 100; i++) {
                        SystemClock.sleep(100L);
                        if (!c21089.m47675()) {
                            break;
                        }
                    }
                    C2700.m4192(c21089);
                    c21089.f66252.set(false);
                }
            });
        } else {
            C2700.m4192(this);
            this.f66252.set(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47605(final InterfaceC16453 interfaceC16453, boolean z) {
        this.f66254.lock();
        try {
            if (!this.f66252.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f66253.mo16195() && C12799.m29346()) {
                try {
                    C4081.f8987.submit(new Callable() { // from class: l.֨᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            interfaceC16453.call();
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    C23770.m52824(th);
                    throw null;
                }
            } else {
                interfaceC16453.call();
            }
            this.f66255 = z ? System.currentTimeMillis() : 0L;
            this.f66254.unlock();
        } catch (Throwable th2) {
            try {
                C23770.m52824(th2);
                throw null;
            } catch (Throwable th3) {
                this.f66255 = z ? System.currentTimeMillis() : 0L;
                this.f66254.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m47598(final InterfaceC25171 interfaceC25171) {
        long jCall;
        this.f66254.lock();
        try {
            if (!this.f66252.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f66253.mo16195() && C12799.m29346()) {
                try {
                    jCall = ((Long) C4081.f8987.submit(new Callable() { // from class: l.۫᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(interfaceC25171.call());
                        }
                    }).get()).longValue();
                } catch (Throwable th) {
                    C23770.m52824(th);
                    throw null;
                }
            } else {
                jCall = interfaceC25171.call();
            }
            this.f66254.unlock();
            this.f66255 = 0L;
            return jCall;
        } catch (Throwable th2) {
            try {
                C23770.m52824(th2);
                throw null;
            } catch (Throwable th3) {
                this.f66254.unlock();
                this.f66255 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m47600(final InterfaceC9078 interfaceC9078, boolean z) {
        Object objCall;
        this.f66254.lock();
        try {
            if (!this.f66252.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f66253.mo16195() && C12799.m29346()) {
                try {
                    objCall = C4081.f8987.submit(new Callable() { // from class: l.᩹᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return interfaceC9078.call();
                        }
                    }).get();
                } catch (Throwable th) {
                    C23770.m52824(th);
                    throw null;
                }
            } else {
                objCall = interfaceC9078.call();
            }
            this.f66254.unlock();
            this.f66255 = 0L;
            return objCall;
        } catch (Throwable th2) {
            try {
                if (!z) {
                    C23770.m52824(th2);
                    throw null;
                }
                C23770.m52824(th2);
                throw null;
            } catch (Throwable th3) {
                this.f66254.unlock();
                this.f66255 = 0L;
                throw th3;
            }
        }
    }
}
