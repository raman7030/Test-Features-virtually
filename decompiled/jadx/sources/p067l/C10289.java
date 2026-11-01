package p067l;

/* JADX INFO: renamed from: l.۠ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10289 extends C16993 {
    @Override // p067l.C16993, p067l.AbstractC6936
    /* JADX INFO: renamed from: ֫ */
    public final void mo15898(C24883 c24883) throws C21689 {
        if (c24883.m54638().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM54637 = c24883.m54637();
        if (iM54637 == 0) {
            m38589(c24883.m54638());
            return;
        }
        if (iM54637 != 1) {
            if (iM54637 == 2) {
                m38587(c24883.m54638());
            } else {
                if (iM54637 == 3 || iM54637 == 4) {
                    return;
                }
                throw new C21689("Unknown Object Tag " + c24883.m54637() + " encountered.");
            }
        }
    }
}
