package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۫ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12338 extends C14454 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f36938;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f36939;

    public C12338(C10222 c10222) {
        super(c10222);
        this.f36938 = new HashSet();
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        this.f36938.add(c17698);
        super.mo1414(c17698);
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        this.f36938.add(c8672);
        super.mo1389(c8672);
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        this.f36938.add(c11907);
        super.mo1397(c11907);
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        this.f36938.add(c4851);
        super.mo1378(c4851);
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        this.f36938.add(c20374);
        super.mo1421(c20374);
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        this.f36939 |= this.f44296 == EnumC3166.f9968 && !this.f36938.contains(c4146.f13546);
        super.mo1377(c4146);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m29942() {
        return this.f36939;
    }
}
