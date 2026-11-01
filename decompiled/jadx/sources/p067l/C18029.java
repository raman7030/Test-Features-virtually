package p067l;

/* JADX INFO: renamed from: l.ܽۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBEW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18029 extends AbstractC19371 implements Comparable {

    /* JADX INFO: renamed from: ᩹ */
    public final C10908 f53843;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f53843.compareTo(((C18029) obj).f53843);
    }

    public C18029(C10908 c10908, int i) {
        super(i);
        this.f53843 = c10908;
    }

    public final int hashCode() {
        return this.f53843.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18029) && this.f53843.compareTo(((C18029) obj).f53843) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C18029.class.getName());
        sb.append('{');
        sb.append(C16351.m37153(m44104()));
        sb.append(' ');
        sb.append(this.f53843);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41071(C3948 c3948) {
        c3948.m7856().m20056(this.f53843);
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f53843.mo4819();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10908 m41072() {
        return this.f53843;
    }

    @Override // p067l.AbstractC19371
    /* JADX INFO: renamed from: ֫ */
    public final int mo41070(C3948 c3948, C19705 c19705, int i, int i2) {
        C8642 c8642M7856 = c3948.m7856();
        C10908 c10908 = this.f53843;
        int iM20054 = c8642M7856.m20054(c10908);
        int i3 = iM20054 - i;
        int iM44104 = m44104();
        if (c19705.m44765()) {
            c19705.m44760(0, String.format("  [%x] %s", Integer.valueOf(i2), c10908.mo4819()));
            c19705.m44760(C3395.m5939(i3), "    field_idx:    ".concat(C16351.m37155(iM20054)));
            c19705.m44760(C3395.m5939(iM44104), "    access_flags: " + C4007.m7984(iM44104));
        }
        c19705.m44766(i3);
        c19705.m44766(iM44104);
        return iM20054;
    }
}
