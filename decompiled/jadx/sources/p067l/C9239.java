package p067l;

/* JADX INFO: renamed from: l.۟ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9239 extends AbstractC19039 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final InterfaceC4410 f25011 = C13128.m30022(C9239.class);

    /* JADX INFO: renamed from: ܳۧ */
    public int f25012;

    /* JADX INFO: renamed from: ܿۧ */
    public String f25013;

    /* JADX INFO: renamed from: ᩳۧ */
    public int f25014;

    public C9239(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final String m21279() {
        return this.f25013;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        m43254(C3775.m7363(0, bArr));
        this.f25014 = C3775.m7363(2, bArr);
        m43256(C3775.m7363(4, bArr));
        this.f25012 = C3775.m7363(6, bArr);
        return 8;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) {
        InterfaceC15983[] interfaceC15983Arr = new C15273[m43258()];
        int i3 = i;
        C15273 c15273 = null;
        for (int i4 = 0; i4 < m43258(); i4++) {
            c15273 = new C15273();
            interfaceC15983Arr[i4] = c15273;
            c15273.f43590 = m30243(false, i3, 16, bArr);
            c15273.f43587 = bArr[i3 + 16] & 255;
            c15273.f43586 = bArr[i3 + 17] & 255;
            c15273.f43588 = C3775.m7365(i3 + 18, bArr);
            int iM7365 = C3775.m7365(i3 + 22, bArr);
            i3 += 26;
            c15273.f43589 = m30243(false, ((iM7365 & 65535) - this.f25014) + i, 48, bArr);
            InterfaceC4410 interfaceC4410 = f25011;
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196(c15273.toString());
            }
        }
        m43251(interfaceC15983Arr);
        this.f25013 = c15273 != null ? c15273.f43590 : null;
        return i3 - i;
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2Response[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m43253());
        sb.append(",converter=");
        sb.append(this.f25014);
        sb.append(",entriesReturned=");
        sb.append(m43258());
        sb.append(",totalAvailableEntries=");
        sb.append(this.f25012);
        sb.append(",lastName=");
        return new String(C10965.m25286(sb, this.f25013, "]"));
    }
}
