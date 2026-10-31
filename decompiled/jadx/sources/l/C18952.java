package l;

/* JADX INFO: renamed from: l.ᩴᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA2L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18952 extends AbstractC17540 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f59764;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f59765;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public String f59766;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f59767;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f59768;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f59769;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f59770;

    public C18952(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, 0);
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final int m43740() {
        return this.f59765;
    }

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final boolean m43742() {
        return this.f59767;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final String m43739() {
        return this.f59766;
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final int m43741() {
        return this.f59769;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        int i;
        if (m41015() == 1) {
            this.f59765 = C1480.m5121(0, bArr);
            i = 2;
        } else {
            i = 0;
        }
        m41011(C1480.m5121(i, bArr));
        this.f59767 = (bArr[i + 2] & 1) == 1;
        this.f59768 = C1480.m5121(i + 4, bArr);
        this.f59764 = C1480.m5121(i + 6, bArr);
        return i + 8;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) {
        this.f59770 = this.f59764 + i;
        InterfaceC14325[] interfaceC14325Arr = new C0837[m41013()];
        for (int i3 = 0; i3 < m41013(); i3++) {
            C0837 c0837 = new C0837(m28218(), m28215());
            interfaceC14325Arr[i3] = c0837;
            c0837.mo2557(i, i2, bArr);
            if (this.f59770 >= i && (c0837.m3112() == 0 || this.f59770 < c0837.m3112() + i)) {
                this.f59766 = c0837.m3114();
                this.f59769 = c0837.mo3113();
            }
            i += c0837.m3112();
        }
        m41006(interfaceC14325Arr);
        return m41010();
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        StringBuilder sbM15339 = C5368.m15339(m41015() == 1 ? "Trans2FindFirst2Response[" : "Trans2FindNext2Response[");
        sbM15339.append(super.toString());
        sbM15339.append(",sid=");
        sbM15339.append(this.f59765);
        sbM15339.append(",searchCount=");
        sbM15339.append(m41013());
        sbM15339.append(",isEndOfSearch=");
        sbM15339.append(this.f59767);
        sbM15339.append(",eaErrorOffset=");
        sbM15339.append(this.f59768);
        sbM15339.append(",lastNameOffset=");
        sbM15339.append(this.f59764);
        sbM15339.append(",lastName=");
        return new String(C9045.m23341(sbM15339, this.f59766, "]"));
    }
}
