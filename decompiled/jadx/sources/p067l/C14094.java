package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۫ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14094 extends C16105 {

    /* JADX INFO: renamed from: ܿ */
    public final HashSet f39951;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f39952;

    public C14094(C12083 c12083) {
        super(c12083);
        this.f39951 = new HashSet();
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        this.f39951.add(c19188);
        super.mo3827(c19188);
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        this.f39951.add(c10610);
        super.mo3802(c10610);
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        this.f39951.add(c13685);
        super.mo3810(c13685);
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        this.f39951.add(c6979);
        super.mo3791(c6979);
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        this.f39951.add(c21732);
        super.mo3834(c21732);
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        this.f39952 |= this.f47390 == EnumC5377.f12771 && !this.f39951.contains(c6309.f16360);
        super.mo3790(c6309);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m32002() {
        return this.f39952;
    }
}
