package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۨ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11361 implements Closeable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0225 f33999 = new C0225(12);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0685 f34000;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7127 f34001;

    public C11361(C7127 c7127) {
        this.f34001 = c7127;
        C2803 c2803M8652 = C2803.m8652();
        c2803M8652.m8657(new C9950());
        c2803M8652.m8659(20971520L);
        c2803M8652.m8655(6);
        c2803M8652.m8658();
        this.f34000 = c2803M8652.m8653(new C5716(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1377 m28114(C11361 c11361) {
        InterfaceC1377 interfaceC1377 = (InterfaceC1377) c11361.f33999.m1479();
        if (interfaceC1377 != null) {
            return interfaceC1377;
        }
        C7127 c7127 = c11361.f34001;
        return c7127.f21864.mo9698(c7127.f21866);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28115(C11361 c11361, InterfaceC1377 interfaceC1377) {
        if (c11361.f33999.m1477(interfaceC1377)) {
            return;
        }
        C0349.m1793(interfaceC1377);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28116(long j, byte[] bArr, int i, int i2) throws IOException {
        int i3 = (int) (j % 102400);
        try {
            byte[] bArr2 = (byte[]) this.f34000.get(Long.valueOf(j / 102400));
            int iMin = Math.min(bArr2.length - i3, i2);
            if (iMin <= 0) {
                return -1;
            }
            System.arraycopy(bArr2, i3, bArr, i, iMin);
            return iMin;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(cause);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34000.mo24977();
        while (true) {
            InterfaceC1377 interfaceC1377 = (InterfaceC1377) this.f33999.m1479();
            if (interfaceC1377 == null) {
                return;
            } else {
                C0349.m1793(interfaceC1377);
            }
        }
    }
}
