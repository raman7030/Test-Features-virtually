package l;

/* JADX INFO: renamed from: l.۠ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C8334 extends C15388 {
    @Override // l.C15388, l.AbstractC4806
    /* JADX INFO: renamed from: ֫ */
    public final void mo14018(C23690 c23690) throws C20329 {
        if (c23690.m52235().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM52234 = c23690.m52234();
        if (iM52234 == 0) {
            m36431(c23690.m52235());
            return;
        }
        if (iM52234 != 1) {
            if (iM52234 == 2) {
                m36429(c23690.m52235());
            } else {
                if (iM52234 == 3 || iM52234 == 4) {
                    return;
                }
                throw new C20329("Unknown Object Tag " + c23690.m52234() + " encountered.");
            }
        }
    }
}
