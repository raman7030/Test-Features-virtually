package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۖۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C2337 extends C14330 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f7499;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2337(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308, EnumC19125 enumC19125) {
        super(c6735, c0779, abstractC4308, new C8687(), new C15741(), enumC19125);
        this.f7499 = c6735;
    }

    @Override // l.C14330, l.AbstractC21387
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21387 mo7602(C0779 c0779) {
        return new C2337(this.f7499, c0779, this.f68884, this.f43221);
    }

    @Override // l.C14330
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet mo7601() {
        EnumC19125 enumC19125 = EnumC19125.f60275;
        if (this.f43221 == enumC19125) {
            return EnumSet.allOf(EnumC19125.class);
        }
        return EnumSet.of(enumC19125);
    }
}
