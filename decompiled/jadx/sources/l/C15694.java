package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ܺۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WA10 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15694 extends AbstractC10011 {

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f48377;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f48378;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f48379;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f48380;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    public C15694(int i, int i2, int i3, int i4, String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 45, str);
        this.f48379 = i4;
        int i5 = i & 3;
        this.f48377 = i5;
        if (i5 == 3) {
            this.f48377 = 2;
        }
        int i6 = i2 & 1;
        if (i6 != 0 && (i2 & 2) != 0) {
            this.f48377 |= 64;
        } else if (i2 == 0) {
            this.f48377 |= 16;
        } else if ((i2 & 2) == 0) {
            this.f48377 |= 32;
        } else if (i6 == 0) {
            this.f48377 |= 48;
        } else {
            this.f48377 |= 16;
        }
        this.f48377 &= -2;
        this.f48378 = 22;
        if ((i3 & 64) == 64) {
            if ((i3 & 16) == 16) {
                this.f48380 = 18;
                return;
            } else {
                this.f48380 = 2;
                return;
            }
        }
        if ((i3 & 16) != 16) {
            this.f48380 = 1;
        } else if ((i3 & 32) == 32) {
            this.f48380 = 16;
        } else {
            this.f48380 = 17;
        }
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        long j = 0;
        C1480.m5122(j, i, bArr);
        C1480.m5122(this.f48377, i + 2, bArr);
        C1480.m5122(this.f48378, i + 4, bArr);
        C1480.m5122(this.f48379, i + 6, bArr);
        C1480.m5124(j, i + 8, bArr);
        C1480.m5122(this.f48380, i + 12, bArr);
        C1480.m5124(j, i + 14, bArr);
        int i2 = i + 18;
        int i3 = 0;
        while (i3 < 8) {
            bArr[i2] = 0;
            i3++;
            i2++;
        }
        return i2 - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int i2;
        if (m28215()) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + m28197(this.f34156, i2, bArr)) - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        sb.append(C12085.m29467(0, 2));
        sb.append(",desiredAccess=0x");
        C19033.m43886(this.f48377, 4, ",searchAttributes=0x", sb);
        C19033.m43886(this.f48378, 4, ",fileAttributes=0x", sb);
        sb.append(C12085.m29467(this.f48379, 4));
        sb.append(",creationTime=");
        sb.append(new Date(0));
        sb.append(",openFunction=0x");
        C19033.m43886(this.f48380, 2, ",allocationSize=0,fileName=", sb);
        return new String(C9045.m23341(sb, this.f34156, "]"));
    }
}
