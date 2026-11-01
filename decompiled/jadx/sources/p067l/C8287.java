package p067l;

/* JADX INFO: renamed from: l.ۛᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8287 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f21939;

    /* JADX INFO: renamed from: ۧ */
    public final String f21940;

    /* JADX INFO: renamed from: ܽ */
    public final C1349 f21941;

    /* JADX INFO: renamed from: ܿ */
    public final String f21942;

    /* JADX INFO: renamed from: ᩳ */
    public final String f21943;

    public C8287() {
        throw null;
    }

    public C8287(String str, String str2, String str3, String str4, C1349 c1349) {
        this.f21943 = str;
        this.f21942 = str2;
        this.f21939 = str3;
        this.f21940 = str4;
        this.f21941 = c1349;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8287)) {
            return false;
        }
        C8287 c8287 = (C8287) obj;
        return C12826.equals(this.f21943, c8287.f21943) && C12826.equals(this.f21942, c8287.f21942) && C12826.equals(this.f21939, c8287.f21939) && C12826.equals(this.f21940, c8287.f21940) && C12826.equals(this.f21941, c8287.f21941);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f21941) + C21720.m49003(C21720.m49003(C21720.m49003(C12826.hashCode(this.f21943) * 31, 31, this.f21942), 31, this.f21939), 31, this.f21940);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1349 m19083() {
        return this.f21941;
    }

    public final String toString() {
        return "[" + this.f21942 + "] " + this.f21940;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m19081() {
        return this.f21943 + "/" + this.f21939;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19082(String str, String str2) {
        return this.f21943.equals(str) && this.f21939.equals(str2);
    }
}
