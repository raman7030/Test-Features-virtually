package l;

/* JADX INFO: renamed from: l.ۨ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AR1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12039 extends AbstractC9693 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f36025;

    public C12039(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        C22124.m49721(c12951, 20228);
        c12951.readInt();
        this.f36025 = c12951.m31506();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20228);
        c10130.m25436();
        c10130.m25439(this.f36025);
        c10130.m25418();
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        try {
            C7017.m18952(this.f29307, this.f36025);
        } catch (RuntimeException e) {
            throw new C3781(this.f29308, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29413(String str) {
        this.f36025 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m29414() {
        return this.f36025;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        C12039 c12039 = new C12039(abstractC9693);
        c12039.f29308 = this.f29308;
        c12039.f36025 = this.f36025;
        return c12039;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append(C9679.m24608(i, "\t"));
        sb.append("{\n");
        sb.append(C9679.m24608(i + 1, "\t"));
        sb.append("builtIn: ");
        sb.append(this.f36025);
        sb.append("\n");
        sb.append(C9679.m24608(i, "\t"));
        sb.append("}\n");
    }
}
