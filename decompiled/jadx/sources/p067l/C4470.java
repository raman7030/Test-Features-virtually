package p067l;

/* JADX INFO: renamed from: l.ۖ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4470 extends C11176 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f10048;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f10049;

    @Override // p067l.C11176
    /* JADX INFO: renamed from: ᩹ */
    public final String mo5335() {
        int i = this.f10049;
        int i2 = this.f10048;
        StringBuilder sb = new StringBuilder();
        EnumC9462 enumC9462 = EnumC9462.AE_ENUM;
        EnumC9462 enumC9463 = this.f31025;
        if (enumC9463 == enumC9462) {
            String name = this.f38266.getName(i2);
            String name2 = this.f38266.getName(i);
            sb.append(enumC9463.m21973());
            sb.append(' ');
            if (this.f32275) {
                sb.append(String.format("#%d.#%d", Integer.valueOf(i2), Integer.valueOf(i)));
                if (!this.f32292) {
                    sb.append(C21459.m48622(" /* ", name, ".", name2, " */"));
                }
            } else {
                C21545.m48729(sb, name, ".", name2);
            }
        }
        return sb.toString();
    }

    @Override // p067l.C11176
    public final String toString() {
        return C21459.m48622("<", this.f38254, " ", mo5335(), ">");
    }

    @Override // p067l.C11176, p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        if (m30951() == EnumC8234.HAS_DEFAULT_VALUE) {
            m26660(C10965.m25286(new StringBuilder(), m30955(), "%s }"), mo5335());
        } else {
            m26668(mo5335());
        }
    }
}
