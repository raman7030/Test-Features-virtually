package l;

/* JADX INFO: renamed from: l.ۖ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2212 extends C9268 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f7260;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f7261;

    @Override // l.C9268
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3022() {
        int i = this.f7261;
        int i2 = this.f7260;
        StringBuilder sb = new StringBuilder();
        EnumC7464 enumC7464 = EnumC7464.AE_ENUM;
        EnumC7464 enumC7465 = this.f28077;
        if (enumC7465 == enumC7464) {
            String name = this.f35264.getName(i2);
            String name2 = this.f35264.getName(i);
            sb.append(enumC7465.m19998());
            sb.append(' ');
            if (this.f29326) {
                sb.append(String.format("#%d.#%d", Integer.valueOf(i2), Integer.valueOf(i)));
                if (!this.f29343) {
                    sb.append(C20087.m46306(" /* ", name, ".", name2, " */"));
                }
            } else {
                C20177.m46410(sb, name, ".", name2);
            }
        }
        return sb.toString();
    }

    @Override // l.C9268
    public final String toString() {
        return C20087.m46306("<", this.f35252, " ", mo3022(), ">");
    }

    @Override // l.C9268, l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        if (m28902() == EnumC6172.HAS_DEFAULT_VALUE) {
            m24646(C9045.m23341(new StringBuilder(), m28906(), "%s }"), mo3022());
        } else {
            m24654(mo3022());
        }
    }
}
