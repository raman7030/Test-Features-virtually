package l;

/* JADX INFO: renamed from: l.ۡܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8985 extends AbstractC15333 {
    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "field";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8985 m23220(C7573 c7573) {
        C12512 c12512;
        C12512 c12513 = C12512.f37597;
        switch (c7573.mo5255()) {
            case 0:
                c12512 = C12512.f37600;
                break;
            case 1:
                c12512 = C12512.f37599;
                break;
            case 2:
                c12512 = C12512.f37583;
                break;
            case 3:
                c12512 = C12512.f37592;
                break;
            case 4:
                c12512 = C12512.f37585;
                break;
            case 5:
                c12512 = C12512.f37601;
                break;
            case 6:
                c12512 = C12512.f37587;
                break;
            case 7:
                c12512 = C12512.f37590;
                break;
            case 8:
                c12512 = C12512.f37595;
                break;
            default:
                throw new IllegalArgumentException("not primitive: " + c7573);
        }
        return new C8985(c12512, C20274.f65518);
    }

    public C8985(C12512 c12512, C20274 c20274) {
        super(c12512, c20274);
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return m36364().m46533();
    }

    @Override // l.AbstractC15333, l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        int iMo2228 = super.mo2228(abstractC13717);
        return iMo2228 != 0 ? iMo2228 : m36364().m46532().compareTo(((C8985) abstractC13717).m36364().m46532());
    }
}
