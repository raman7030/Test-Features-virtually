package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۖۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4589 extends C15987 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8769 f10290;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4589(C8769 c8769, C3108 c3108, AbstractC6462 abstractC6462, EnumC20544 enumC20544) {
        super(c8769, c3108, abstractC6462, new C10624(), new C17328(), enumC20544);
        this.f10290 = c8769;
    }

    @Override // p067l.C15987, p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22694 mo9673(C3108 c3108) {
        return new C4589(this.f10290, c3108, this.f71579, this.f46313);
    }

    @Override // p067l.C15987
    /* JADX INFO: renamed from: ֫ */
    public final EnumSet mo9672() {
        EnumC20544 enumC20544 = EnumC20544.f63507;
        if (this.f46313 == enumC20544) {
            return EnumSet.allOf(EnumC20544.class);
        }
        return EnumSet.of(enumC20544);
    }
}
