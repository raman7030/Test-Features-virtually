package l;

/* JADX INFO: renamed from: l.ۧۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10699 extends AbstractC11795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6150 f32210 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6150[] f32211;

    public C10699(InterfaceC6150[] interfaceC6150Arr) {
        this.f32211 = interfaceC6150Arr;
    }

    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        InterfaceC6150 interfaceC6150 = this.f32210;
        if (interfaceC6150 != null) {
            return interfaceC6150.mo11134(str);
        }
        for (InterfaceC6150 interfaceC6151 : this.f32211) {
            C10384 c10384Mo11134 = interfaceC6151.mo11134(str);
            if (c10384Mo11134 != null) {
                this.f32210 = interfaceC6151;
                return c10384Mo11134;
            }
        }
        return null;
    }
}
