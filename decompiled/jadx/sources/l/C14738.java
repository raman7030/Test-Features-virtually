package l;

/* JADX INFO: renamed from: l.ܳ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2J */
/* JADX INFO: loaded from: classes5.dex */
public final class C14738 extends AbstractC12601 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public InterfaceC8079 f45009;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public byte f45010;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public byte f45011;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C14738(InterfaceC1023 interfaceC1023, byte b, byte b2) {
        super(interfaceC1023);
        this.f45011 = b;
        this.f45010 = b2;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8079 m35042() throws C19369 {
        if (InterfaceC23100.class.isAssignableFrom(this.f45009.getClass())) {
            return this.f45009;
        }
        throw new C19369("Incompatible file information class");
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        InterfaceC8079 c19889;
        if (C1480.m5121(i, bArr) != 9) {
            throw new C17771("Expected structureSize = 9");
        }
        int iM10453 = m10453() + C1480.m5121(i + 2, bArr);
        int iM5123 = C1480.m5123(i + 4, bArr);
        int i2 = i + 8;
        byte b = this.f45011;
        byte b2 = this.f45010;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        throw new C17771(C19370.m44628(b, "Unknwon information type "));
                    }
                    throw new C17771(C19370.m44628(b2, "Unknown quota info class "));
                }
                c19889 = new C19183();
            } else if (b2 == 3) {
                c19889 = new C21300();
            } else {
                if (b2 != 7) {
                    throw new C17771(C19370.m44628(b2, "Unknown filesystem info class "));
                }
                c19889 = new C14948();
            }
        } else {
            if (b2 != 6) {
                throw new C17771(C19370.m44628(b2, "Unknown file info class "));
            }
            c19889 = new C19889();
        }
        c19889.mo2557(iM10453, iM5123, bArr);
        int iMax = Math.max(i2, iM10453 + iM5123);
        this.f45009 = c19889;
        return iMax - i;
    }
}
