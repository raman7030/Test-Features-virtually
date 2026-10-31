package l;

/* JADX INFO: renamed from: l.ܳᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14698 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44893 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f44892 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44894 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34991() {
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        boolean z = this.f44893;
        ?? r1 = z;
        if (this.f44892) {
            r1 = (z ? 1 : 0) | 2;
        }
        int i = r1;
        if (this.f44894) {
            i = (r1 == true ? 1 : 0) | 4;
        }
        interfaceC13049Edit.mo25852((byte) i, "edfa");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34990() {
        byte bMo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "edfa");
        this.f44893 = (bMo18251 & 1) != 0;
        this.f44892 = (bMo18251 & 2) != 0;
        this.f44894 = (bMo18251 & 4) != 0;
    }
}
