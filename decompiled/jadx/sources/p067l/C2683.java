package p067l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֡ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28II */
/* JADX INFO: loaded from: classes2.dex */
public final class C2683 {

    /* JADX INFO: renamed from: ֫ */
    public int f4498;

    /* JADX INFO: renamed from: ۧ */
    public int f4499;

    /* JADX INFO: renamed from: ܳ */
    public boolean f4500;

    /* JADX INFO: renamed from: ܽ */
    public int f4501;

    /* JADX INFO: renamed from: ܿ */
    public long f4502;

    /* JADX INFO: renamed from: ᩳ */
    public int f4503;

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] f4504 = new byte[10];

    /* JADX INFO: renamed from: ֫ */
    public final void m4148() {
        this.f4500 = false;
        this.f4501 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4149(InterfaceC10375 interfaceC10375) {
        if (this.f4500) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f4504;
        interfaceC10375.mo24031(0, 10, bArr);
        interfaceC10375.mo24036();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & UTF8.S_ERR) == 186) {
                i = 40 << (7 & (bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4));
            }
        }
        if (i == 0) {
            return;
        }
        this.f4500 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4150(InterfaceC20790 interfaceC20790, long j, int i, int i2, int i3, C20119 c20119) {
        C23877.m52959("TrueHD chunk samples must be contiguous in the sample queue.", this.f4499 <= i2 + i3);
        if (this.f4500) {
            int i4 = this.f4501;
            int i5 = i4 + 1;
            this.f4501 = i5;
            if (i4 == 0) {
                this.f4502 = j;
                this.f4498 = i;
                this.f4503 = 0;
            }
            this.f4503 += i2;
            this.f4499 = i3;
            if (i5 >= 16) {
                m4151(interfaceC20790, c20119);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4151(InterfaceC20790 interfaceC20790, C20119 c20119) {
        if (this.f4501 > 0) {
            interfaceC20790.mo10502(this.f4502, this.f4498, this.f4503, this.f4499, c20119);
            this.f4501 = 0;
        }
    }
}
