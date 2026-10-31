package l;

/* JADX INFO: renamed from: l.ܿܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB9P */
/* JADX INFO: loaded from: classes5.dex */
public final class C17409 extends AbstractC1181 {
    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final String mo2080() {
        return null;
    }

    public C17409(C10191 c10191) {
        super(c10191, C20069.f65002);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ۧ */
    public final int mo2084() {
        return m13990() & 1;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final void mo2082(C18241 c18241) {
        if (mo2084() != 0) {
            c18241.m42511(AbstractC11849.m28948(0, 0));
        }
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C17409(m13983());
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܺ */
    public final String mo2085() {
        if (mo2084() == 0) {
            return null;
        }
        return "nop // spacer";
    }
}
