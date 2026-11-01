package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA06 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5847 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ۗ */
    public int f14343;

    /* JADX INFO: renamed from: ۙ */
    public int f14344;

    /* JADX INFO: renamed from: ۛ */
    public String f14345;

    /* JADX INFO: renamed from: ۤ */
    public int f14346;

    /* JADX INFO: renamed from: ۨ */
    public int f14347;

    /* JADX INFO: renamed from: ۫ */
    public int f14348;

    /* JADX INFO: renamed from: ۬ */
    public String f14349;

    /* JADX INFO: renamed from: ᩶ */
    public String f14350;

    /* JADX INFO: renamed from: ᩸ */
    public String f14351;

    /* JADX INFO: renamed from: ᩹ */
    public String[] f14352;

    /* JADX INFO: renamed from: ᩺ */
    public int f14353;

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        int iM7363 = C3775.m7363(i, bArr);
        this.f14353 = iM7363;
        if (iM7363 != 3 && iM7363 != 1) {
            throw new C14740(C5410.m11876(this.f14353, " referral not supported. Please report this to jcifs at samba dot org.", new StringBuilder("Version ")));
        }
        this.f14346 = C3775.m7363(i + 2, bArr);
        this.f14348 = C3775.m7363(i + 4, bArr);
        this.f14343 = C3775.m7363(i + 6, bArr);
        int i3 = i + 8;
        int i4 = this.f14353;
        if (i4 == 3) {
            this.f14344 = C3775.m7363(i3, bArr);
            this.f14347 = C3775.m7363(i + 10, bArr);
            int i5 = i + 12;
            if ((this.f14343 & 2) == 0) {
                int iM7364 = C3775.m7363(i5, bArr);
                int iM7365 = C3775.m7363(i + 14, bArr);
                int iM7366 = C3775.m7363(i + 16, bArr);
                if (iM7364 > 0) {
                    this.f14349 = m13135(iM7364 + i, i2, bArr);
                }
                if (iM7366 > 0) {
                    this.f14350 = m13135(iM7366 + i, i2, bArr);
                }
                if (iM7365 > 0) {
                    this.f14351 = m13135(i + iM7365, i2, bArr);
                }
            } else {
                int iM7367 = C3775.m7363(i5, bArr);
                int iM7368 = C3775.m7363(i + 14, bArr);
                int iM7369 = C3775.m7363(i + 16, bArr);
                if (iM7367 > 0) {
                    this.f14345 = m13135(iM7367 + i, i2, bArr);
                }
                if (iM7369 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < iM7368; i6++) {
                        String strM13135 = m13135(i + iM7369, i2, bArr);
                        arrayList.add(strM13135);
                        iM7369 += (strM13135.length() * 2) + 2;
                    }
                    this.f14352 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (i4 == 1) {
            this.f14350 = m13135(i3, i2, bArr);
        }
        return this.f14346;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m13135(int i, int i2, byte[] bArr) {
        if (i % 2 != 0) {
            i++;
        }
        return C11843.m27148(i, C11843.m27146(i, i2, bArr), bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Referral[version=");
        sb.append(this.f14353);
        sb.append(",size=");
        sb.append(this.f14346);
        sb.append(",serverType=");
        sb.append(this.f14348);
        sb.append(",flags=");
        sb.append(this.f14343);
        sb.append(",proximity=");
        sb.append(this.f14344);
        sb.append(",ttl=");
        sb.append(this.f14347);
        sb.append(",path=");
        sb.append(this.f14349);
        sb.append(",altPath=");
        sb.append(this.f14351);
        sb.append(",node=");
        return new String(C10965.m25286(sb, this.f14350, "]"));
    }
}
