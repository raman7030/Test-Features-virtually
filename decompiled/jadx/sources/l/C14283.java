package l;

/* JADX INFO: renamed from: l.ܳۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PA1K */
/* JADX INFO: loaded from: classes4.dex */
public final class C14283 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public byte f43048;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public long f43049;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public C22710[] f43050;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f43051;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public byte f43052;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f43053;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C22710[] f43054;

    public C14283(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f43051, i, bArr);
        bArr[i + 2] = this.f43048;
        bArr[i + 3] = this.f43052;
        C1480.m5124(this.f43049, i + 4, bArr);
        int i2 = i + 8;
        C22710[] c22710Arr = this.f43050;
        C1480.m5122(c22710Arr != null ? c22710Arr.length : 0L, i2, bArr);
        int i3 = i + 10;
        C22710[] c22710Arr2 = this.f43054;
        C1480.m5122(c22710Arr2 != null ? c22710Arr2.length : 0L, i3, bArr);
        return i - (i + 12);
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f43051 = C1480.m5121(i, bArr);
        byte b = bArr[i + 2];
        this.f43048 = b;
        if ((b & 16) == 16) {
            this.f43053 = true;
        }
        this.f43052 = bArr[i + 3];
        this.f43049 = C1480.m5123(i + 4, bArr);
        this.f43050 = new C22710[C1480.m5121(i + 8, bArr)];
        this.f43054 = new C22710[C1480.m5121(i + 10, bArr)];
        return i - (i + 12);
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int iMo9010;
        C22710[] c22710Arr = this.f43050;
        if (c22710Arr != null) {
            iMo9010 = i;
            for (C22710 c22710 : c22710Arr) {
                iMo9010 += c22710.mo9010(iMo9010, bArr);
            }
        } else {
            iMo9010 = i;
        }
        C22710[] c22710Arr2 = this.f43054;
        if (c22710Arr2 != null) {
            for (C22710 c22711 : c22710Arr2) {
                iMo9010 += c22711.mo9010(iMo9010, bArr);
            }
        }
        return i - iMo9010;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        int iMo2557 = i;
        while (true) {
            C22710[] c22710Arr = this.f43050;
            if (i3 >= c22710Arr.length) {
                break;
            }
            C22710 c22710 = new C22710(this.f43053);
            c22710Arr[i3] = c22710;
            iMo2557 += c22710.mo2557(iMo2557, bArr.length, bArr);
            i3++;
        }
        while (true) {
            C22710[] c22710Arr2 = this.f43054;
            if (i2 >= c22710Arr2.length) {
                return i - iMo2557;
            }
            C22710 c22711 = new C22710(this.f43053);
            c22710Arr2[i2] = c22711;
            iMo2557 += c22711.mo2557(iMo2557, bArr.length, bArr);
            i2++;
        }
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComLockingAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f43051);
        sb.append(",typeOfLock=");
        sb.append((int) this.f43048);
        sb.append(",newOplockLevel=");
        return new String(C3200.m9831(this.f43052, "]", sb));
    }
}
