package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۨ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C13166 implements Closeable {

    /* JADX INFO: renamed from: ᩶ */
    public final C2582 f36996 = new C2582(12);

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3020 f36997;

    /* JADX INFO: renamed from: ᩹ */
    public final C9142 f36998;

    public C13166(C9142 c9142) {
        this.f36998 = c9142;
        C5033 c5033M10712 = C5033.m10712();
        c5033M10712.m10717(new C11825());
        c5033M10712.m10719(20971520L);
        c5033M10712.m10715(6);
        c5033M10712.m10718();
        this.f36997 = c5033M10712.m10713(new C7801(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC3678 m30158(C13166 c13166) {
        InterfaceC3678 interfaceC3678 = (InterfaceC3678) c13166.f36996.m3892();
        if (interfaceC3678 != null) {
            return interfaceC3678;
        }
        C9142 c9142 = c13166.f36998;
        return c9142.f24743.mo11742(c9142.f24745);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30159(C13166 c13166, InterfaceC3678 interfaceC3678) {
        if (c13166.f36996.m3890(interfaceC3678)) {
            return;
        }
        C2700.m4192(interfaceC3678);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m30160(long j, byte[] bArr, int i, int i2) throws IOException {
        int i3 = (int) (j % 102400);
        try {
            byte[] bArr2 = (byte[]) this.f36997.get(Long.valueOf(j / 102400));
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
        this.f36997.mo26992();
        while (true) {
            InterfaceC3678 interfaceC3678 = (InterfaceC3678) this.f36996.m3892();
            if (interfaceC3678 == null) {
                return;
            } else {
                C2700.m4192(interfaceC3678);
            }
        }
    }
}
