package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21141 extends AbstractC21162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f68168;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Pattern f68169;

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        String str = this.f68168;
        return c19815.mo25052(str) && this.f68169.matcher(c19815.mo25048(str)).find();
    }

    public final String toString() {
        return C20087.m46306("[", this.f68168, "~=", this.f68169.toString(), "]");
    }
}
