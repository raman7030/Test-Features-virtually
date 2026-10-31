package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA06 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3660 implements InterfaceC8079 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f11537;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11538;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f11539;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f11540;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f11541;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f11542;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f11543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f11544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f11545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String[] f11546;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f11547;

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        int iM5121 = C1480.m5121(i, bArr);
        this.f11547 = iM5121;
        if (iM5121 != 3 && iM5121 != 1) {
            throw new C13017(C3200.m9831(this.f11547, " referral not supported. Please report this to jcifs at samba dot org.", new StringBuilder("Version ")));
        }
        this.f11540 = C1480.m5121(i + 2, bArr);
        this.f11542 = C1480.m5121(i + 4, bArr);
        this.f11537 = C1480.m5121(i + 6, bArr);
        int i3 = i + 8;
        int i4 = this.f11547;
        if (i4 == 3) {
            this.f11538 = C1480.m5121(i3, bArr);
            this.f11541 = C1480.m5121(i + 10, bArr);
            int i5 = i + 12;
            if ((this.f11537 & 2) == 0) {
                int iM5122 = C1480.m5121(i5, bArr);
                int iM5123 = C1480.m5121(i + 14, bArr);
                int iM5124 = C1480.m5121(i + 16, bArr);
                if (iM5122 > 0) {
                    this.f11543 = m11159(iM5122 + i, i2, bArr);
                }
                if (iM5124 > 0) {
                    this.f11544 = m11159(iM5124 + i, i2, bArr);
                }
                if (iM5123 > 0) {
                    this.f11545 = m11159(i + iM5123, i2, bArr);
                }
            } else {
                int iM5125 = C1480.m5121(i5, bArr);
                int iM5126 = C1480.m5121(i + 14, bArr);
                int iM5127 = C1480.m5121(i + 16, bArr);
                if (iM5125 > 0) {
                    this.f11539 = m11159(iM5125 + i, i2, bArr);
                }
                if (iM5127 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < iM5126; i6++) {
                        String strM11159 = m11159(i + iM5127, i2, bArr);
                        arrayList.add(strM11159);
                        iM5127 += (strM11159.length() * 2) + 2;
                    }
                    this.f11546 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (i4 == 1) {
            this.f11544 = m11159(i3, i2, bArr);
        }
        return this.f11540;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11159(int i, int i2, byte[] bArr) {
        if (i % 2 != 0) {
            i++;
        }
        return C9969.m25131(i, C9969.m25129(i, i2, bArr), bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Referral[version=");
        sb.append(this.f11547);
        sb.append(",size=");
        sb.append(this.f11540);
        sb.append(",serverType=");
        sb.append(this.f11542);
        sb.append(",flags=");
        sb.append(this.f11537);
        sb.append(",proximity=");
        sb.append(this.f11538);
        sb.append(",ttl=");
        sb.append(this.f11541);
        sb.append(",path=");
        sb.append(this.f11543);
        sb.append(",altPath=");
        sb.append(this.f11545);
        sb.append(",node=");
        return new String(C9045.m23341(sb, this.f11544, "]"));
    }
}
