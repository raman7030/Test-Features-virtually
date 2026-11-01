package p067l;

/* JADX INFO: renamed from: l.ᩴᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA2L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20381 extends AbstractC19039 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f62994;

    /* JADX INFO: renamed from: ۢۧ */
    public int f62995;

    /* JADX INFO: renamed from: ܳۧ */
    public String f62996;

    /* JADX INFO: renamed from: ܿۧ */
    public boolean f62997;

    /* JADX INFO: renamed from: ᩳۧ */
    public int f62998;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f62999;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f63000;

    public C20381(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, 0);
    }

    /* JADX INFO: renamed from: ֨֫ */
    public final int m46007() {
        return this.f62995;
    }

    /* JADX INFO: renamed from: ۠֫ */
    public final boolean m46009() {
        return this.f62997;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final String m46006() {
        return this.f62996;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final int m46008() {
        return this.f62999;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        int i;
        if (m43260() == 1) {
            this.f62995 = C3775.m7363(0, bArr);
            i = 2;
        } else {
            i = 0;
        }
        m43256(C3775.m7363(i, bArr));
        this.f62997 = (bArr[i + 2] & 1) == 1;
        this.f62998 = C3775.m7363(i + 4, bArr);
        this.f62994 = C3775.m7363(i + 6, bArr);
        return i + 8;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) {
        this.f63000 = this.f62994 + i;
        InterfaceC15983[] interfaceC15983Arr = new C3164[m43258()];
        for (int i3 = 0; i3 < m43258(); i3++) {
            C3164 c3164 = new C3164(m30262(), m30259());
            interfaceC15983Arr[i3] = c3164;
            c3164.mo4913(i, i2, bArr);
            if (this.f63000 >= i && (c3164.m5426() == 0 || this.f63000 < c3164.m5426() + i)) {
                this.f62996 = c3164.m5428();
                this.f62999 = c3164.mo5427();
            }
            i += c3164.m5426();
        }
        m43251(interfaceC15983Arr);
        return m43255();
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sbM17248 = C7470.m17248(m43260() == 1 ? "Trans2FindFirst2Response[" : "Trans2FindNext2Response[");
        sbM17248.append(super.toString());
        sbM17248.append(",sid=");
        sbM17248.append(this.f62995);
        sbM17248.append(",searchCount=");
        sbM17248.append(m43258());
        sbM17248.append(",isEndOfSearch=");
        sbM17248.append(this.f62997);
        sbM17248.append(",eaErrorOffset=");
        sbM17248.append(this.f62998);
        sbM17248.append(",lastNameOffset=");
        sbM17248.append(this.f62994);
        sbM17248.append(",lastName=");
        return new String(C10965.m25286(sbM17248, this.f62996, "]"));
    }
}
