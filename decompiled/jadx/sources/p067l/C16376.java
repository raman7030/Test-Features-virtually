package p067l;

/* JADX INFO: renamed from: l.ܳ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2J */
/* JADX INFO: loaded from: classes5.dex */
public final class C16376 extends AbstractC14345 {

    /* JADX INFO: renamed from: ֡֫ */
    public InterfaceC10047 f48122;

    /* JADX INFO: renamed from: ᩴ֫ */
    public byte f48123;

    /* JADX INFO: renamed from: ᩵֫ */
    public byte f48124;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C16376(InterfaceC3341 interfaceC3341, byte b, byte b2) {
        super(interfaceC3341);
        this.f48124 = b;
        this.f48123 = b2;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final InterfaceC10047 m37189() throws C20777 {
        if (InterfaceC24323.class.isAssignableFrom(this.f48122.getClass())) {
            return this.f48122;
        }
        throw new C20777("Incompatible file information class");
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        InterfaceC10047 c21271;
        if (C3775.m7363(i, bArr) != 9) {
            throw new C19258("Expected structureSize = 9");
        }
        int iM12492 = m12492() + C3775.m7363(i + 2, bArr);
        int iM7365 = C3775.m7365(i + 4, bArr);
        int i2 = i + 8;
        byte b = this.f48124;
        byte b2 = this.f48123;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        throw new C19258(C20778.m46922(b, "Unknwon information type "));
                    }
                    throw new C19258(C20778.m46922(b2, "Unknown quota info class "));
                }
                c21271 = new C20600();
            } else if (b2 == 3) {
                c21271 = new C22612();
            } else {
                if (b2 != 7) {
                    throw new C19258(C20778.m46922(b2, "Unknown filesystem info class "));
                }
                c21271 = new C16575();
            }
        } else {
            if (b2 != 6) {
                throw new C19258(C20778.m46922(b2, "Unknown file info class "));
            }
            c21271 = new C21271();
        }
        c21271.mo4913(iM12492, iM7365, bArr);
        int iMax = Math.max(i2, iM12492 + iM7365);
        this.f48122 = c21271;
        return iMax - i;
    }
}
