package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1HS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3585 extends AbstractC9936 {
    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۧ */
    public final void mo7190(Appendable appendable, int i, C0056 c0056) {
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 mo10980() {
        return this;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܺ */
    public final String mo2915() {
        return "#comment";
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ int mo10981() {
        return 0;
    }

    public C3585(String str) {
        this.f30009 = str;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m10978() {
        String strM25053 = m25053();
        if (strM25053.length() > 1) {
            return strM25053.startsWith("!") || strM25053.startsWith("?");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16430 m10979() {
        String strM25053 = m25053();
        String strM36561 = C15472.m36561(1, 1, strM25053);
        if (strM36561.length() > 1 && (strM36561.startsWith("!") || strM36561.startsWith("?"))) {
            return null;
        }
        String strM14172 = C4860.m14172("<", strM36561, ">");
        C10662 c10662 = new C10662(new C17136());
        c10662.m26764();
        C0762 c0762M26758 = c10662.m26758(strM14172, super.mo25050());
        if (c0762M26758.m2917().m45579().size() <= 0) {
            return null;
        }
        C19814 c19814M45589 = c0762M26758.m2917().m45589();
        C16430 c16430 = new C16430(C22635.m50637(c0762M26758).m26763().m5156(c19814M45589.m45591()), strM25053.startsWith("!"));
        c16430.mo25045().m36730(c19814M45589.mo25045());
        return c16430;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public final void mo7189(Appendable appendable, int i, C0056 c0056) throws IOException {
        if (c0056.m979() && this.f33970 == 0) {
            AbstractC11347 abstractC11347 = this.f33969;
            if ((abstractC11347 instanceof C19814) && ((C19814) abstractC11347).m45571().m38359()) {
                AbstractC11347.m28084(appendable, i, c0056);
            }
        }
        appendable.append("<!--").append(m25053()).append("-->");
    }

    @Override // l.AbstractC11347
    public final String toString() {
        return mo2910();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final Object mo2918clone() {
        return (C3585) super.mo2918clone();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final AbstractC11347 mo2918clone() {
        return (C3585) super.mo2918clone();
    }
}
