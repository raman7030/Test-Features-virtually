package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.֨᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3638 extends InputStream implements InterfaceC24285, InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public C17048 f7573;

    /* JADX INFO: renamed from: ۙ */
    public final LongSupplier f7574;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC11015 f7575;

    /* JADX INFO: renamed from: ۤ */
    public long f7576;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC4980 f7577;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC11686 f7578;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC11015 f7579;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f7580;

    /* JADX INFO: renamed from: ᩸ */
    public EnumC13557 f7581 = EnumC13557.FAILURE;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f7582;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC10344 f7583;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C3638(C17048 c17048, long j, LongSupplier longSupplier, InterfaceC10344 interfaceC10344, InterfaceC11686 interfaceC11686, InterfaceC4980 interfaceC4980, InterfaceC11015 interfaceC11015, InterfaceC11015 interfaceC11016, boolean z) {
        this.f7573 = c17048;
        this.f7576 = j;
        this.f7574 = longSupplier;
        this.f7583 = interfaceC10344;
        this.f7578 = interfaceC11686;
        this.f7577 = interfaceC4980;
        this.f7575 = interfaceC11015;
        this.f7579 = interfaceC11016;
        this.f7582 = z;
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
        C12826.checkFromIndexSize(i, i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        if (!this.f7580) {
            C7662 c7662 = new C7662(this, bArr, i, i2);
            try {
                iIntValue = this.f7573.m38701().read(bArr, i, i2);
            } catch (IOException e) {
                iIntValue = ((Integer) this.f7578.mo26856(e, c7662)).intValue();
            } catch (C3406 e2) {
                throw new IOException(e2.getMessage(), e2);
            } catch (C12776 e3) {
                iIntValue = ((Integer) this.f7583.mo8835(e3, c7662)).intValue();
            } catch (RuntimeException e4) {
                throw e4;
            }
            if (iIntValue > 0) {
                this.f7576 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m6901(C3638 c3638, byte[] bArr, int i, int i2) {
        InputStream inputStreamM38701 = c3638.f7573.m38701();
        if (inputStreamM38701 != null) {
            try {
                inputStreamM38701.close();
            } catch (IOException unused) {
            }
        }
        long jMax = Math.max(0L, c3638.f7574.getAsLong() - c3638.f7576);
        if (jMax <= 0) {
            c3638.f7581 = EnumC13557.NORMAL_COMPLETE;
            return -1;
        }
        C17048 c17048 = (C17048) c3638.f7577.mo10539(c3638.f7576, jMax);
        c3638.f7573 = c17048;
        return Integer.valueOf(c17048.m38701().read(bArr, i, i2));
    }

    @Override // p067l.InterfaceC24285
    /* JADX INFO: renamed from: ֫ */
    public final void mo6902(EnumC13557 enumC13557) {
        this.f7581 = enumC13557;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7580) {
            return;
        }
        try {
            this.f7573.m38700();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        boolean z = this.f7582;
        try {
            ((!z || this.f7581 == EnumC13557.NORMAL_COMPLETE) ? this.f7575 : this.f7579).run();
        } catch (IOException e2) {
            e = C6991.m16064(e, e2);
        }
        this.f7580 = true;
        if (e == null && z) {
            EnumC13557 enumC13557 = EnumC13557.NORMAL_COMPLETE;
        }
        EnumC24036 enumC24036 = EnumC24036.SMB2_NEGOTIATE;
        if (z) {
            this.f7581.name();
        }
        Set set = C6991.f18200;
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
        if (this.f7580) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f7573.m38701().skip(j);
        if (jSkip > 0) {
            this.f7576 += jSkip;
        }
        return jSkip;
    }
}
