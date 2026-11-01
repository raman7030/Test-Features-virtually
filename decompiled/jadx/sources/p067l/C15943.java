package p067l;

/* JADX INFO: renamed from: l.ܳۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PA1K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15943 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۗ֫ */
    public byte f46140;

    /* JADX INFO: renamed from: ۙ֫ */
    public long f46141;

    /* JADX INFO: renamed from: ۬֫ */
    public C23952[] f46142;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f46143;

    /* JADX INFO: renamed from: ᩶֫ */
    public byte f46144;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f46145;

    /* JADX INFO: renamed from: ᩹֫ */
    public C23952[] f46146;

    public C15943(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f46143, i, bArr);
        bArr[i + 2] = this.f46140;
        bArr[i + 3] = this.f46144;
        C3775.m7366(this.f46141, i + 4, bArr);
        int i2 = i + 8;
        C23952[] c23952Arr = this.f46142;
        C3775.m7364(c23952Arr != null ? c23952Arr.length : 0L, i2, bArr);
        int i3 = i + 10;
        C23952[] c23952Arr2 = this.f46146;
        C3775.m7364(c23952Arr2 != null ? c23952Arr2.length : 0L, i3, bArr);
        return i - (i + 12);
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f46143 = C3775.m7363(i, bArr);
        byte b = bArr[i + 2];
        this.f46140 = b;
        if ((b & 16) == 16) {
            this.f46145 = true;
        }
        this.f46144 = bArr[i + 3];
        this.f46141 = C3775.m7365(i + 4, bArr);
        this.f46142 = new C23952[C3775.m7363(i + 8, bArr)];
        this.f46146 = new C23952[C3775.m7363(i + 10, bArr)];
        return i - (i + 12);
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int iMo11078;
        C23952[] c23952Arr = this.f46142;
        if (c23952Arr != null) {
            iMo11078 = i;
            for (C23952 c23952 : c23952Arr) {
                iMo11078 += c23952.mo11078(iMo11078, bArr);
            }
        } else {
            iMo11078 = i;
        }
        C23952[] c23952Arr2 = this.f46146;
        if (c23952Arr2 != null) {
            for (C23952 c23953 : c23952Arr2) {
                iMo11078 += c23953.mo11078(iMo11078, bArr);
            }
        }
        return i - iMo11078;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        int iMo4913 = i;
        while (true) {
            C23952[] c23952Arr = this.f46142;
            if (i3 >= c23952Arr.length) {
                break;
            }
            C23952 c23952 = new C23952(this.f46145);
            c23952Arr[i3] = c23952;
            iMo4913 += c23952.mo4913(iMo4913, bArr.length, bArr);
            i3++;
        }
        while (true) {
            C23952[] c23952Arr2 = this.f46146;
            if (i2 >= c23952Arr2.length) {
                return i - iMo4913;
            }
            C23952 c23953 = new C23952(this.f46145);
            c23952Arr2[i2] = c23953;
            iMo4913 += c23953.mo4913(iMo4913, bArr.length, bArr);
            i2++;
        }
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComLockingAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f46143);
        sb.append(",typeOfLock=");
        sb.append((int) this.f46140);
        sb.append(",newOplockLevel=");
        return new String(C5410.m11876(this.f46144, "]", sb));
    }
}
