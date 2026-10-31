package l;

/* JADX INFO: renamed from: l.ܳۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14482 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44368;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f44369;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f44370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44371;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44372;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f44373;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f44374;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m34581() {
        return this.f44373;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m34578() {
        return this.f44370;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m34579() {
        return this.f44369;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34576() {
        if (this.f44374 == null) {
            return this.f44370;
        }
        return this.f44370 + " = " + this.f44374;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m34580() {
        return this.f44372;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34577() {
        return this.f44368;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m34582() {
        return this.f44373 + ":" + this.f44370;
    }

    public final String toString() {
        String str = this.f44373 + ":" + this.f44370;
        if (this.f44374 == null) {
            return str;
        }
        StringBuilder sbM19190 = C7166.m19190(str, " = ");
        sbM19190.append(this.f44374);
        return sbM19190.toString();
    }
}
