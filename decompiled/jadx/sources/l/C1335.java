package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.֨᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1335 extends InputStream implements InterfaceC23060, InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15445 f4803;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LongSupplier f4804;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9097 f4805;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f4806;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2747 f4807;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9803 f4808;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC9097 f4809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4810;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC11772 f4811 = EnumC11772.FAILURE;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f4812;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC8391 f4813;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C1335(C15445 c15445, long j, LongSupplier longSupplier, InterfaceC8391 interfaceC8391, InterfaceC9803 interfaceC9803, InterfaceC2747 interfaceC2747, InterfaceC9097 interfaceC9097, InterfaceC9097 interfaceC9098, boolean z) {
        this.f4803 = c15445;
        this.f4806 = j;
        this.f4804 = longSupplier;
        this.f4813 = interfaceC8391;
        this.f4808 = interfaceC9803;
        this.f4807 = interfaceC2747;
        this.f4805 = interfaceC9097;
        this.f4809 = interfaceC9098;
        this.f4812 = z;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iIntValue;
        C11003.checkFromIndexSize(i, i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        if (!this.f4810) {
            C5569 c5569 = new C5569(this, bArr, i, i2);
            try {
                iIntValue = this.f4803.m36543().read(bArr, i, i2);
            } catch (IOException e) {
                iIntValue = ((Integer) this.f4808.mo24841(e, c5569)).intValue();
            } catch (C1092 e2) {
                throw new IOException(e2.getMessage(), e2);
            } catch (C10951 e3) {
                iIntValue = ((Integer) this.f4813.mo6709(e3, c5569)).intValue();
            } catch (RuntimeException e4) {
                throw e4;
            }
            if (iIntValue > 0) {
                this.f4806 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m4669(C1335 c1335, byte[] bArr, int i, int i2) {
        InputStream inputStreamM36543 = c1335.f4803.m36543();
        if (inputStreamM36543 != null) {
            try {
                inputStreamM36543.close();
            } catch (IOException unused) {
            }
        }
        long jMax = Math.max(0L, c1335.f4804.getAsLong() - c1335.f4806);
        if (jMax <= 0) {
            c1335.f4811 = EnumC11772.NORMAL_COMPLETE;
            return -1;
        }
        C15445 c15445 = (C15445) c1335.f4807.mo8492(c1335.f4806, jMax);
        c1335.f4803 = c15445;
        return Integer.valueOf(c15445.m36543().read(bArr, i, i2));
    }

    @Override // l.InterfaceC23060
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4670(EnumC11772 enumC11772) {
        this.f4811 = enumC11772;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4810) {
            return;
        }
        try {
            this.f4803.m36542();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        boolean z = this.f4812;
        try {
            ((!z || this.f4811 == EnumC11772.NORMAL_COMPLETE) ? this.f4805 : this.f4809).run();
        } catch (IOException e2) {
            e = C4863.m14183(e, e2);
        }
        this.f4810 = true;
        if (e == null && z) {
            EnumC11772 enumC11772 = EnumC11772.NORMAL_COMPLETE;
        }
        EnumC22799 enumC22799 = EnumC22799.SMB2_NEGOTIATE;
        if (z) {
            this.f4811.name();
        }
        Set set = C4863.f15369;
        if (e != null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f4810) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f4803.m36543().skip(j);
        if (jSkip > 0) {
            this.f4806 += jSkip;
        }
        return jSkip;
    }
}
