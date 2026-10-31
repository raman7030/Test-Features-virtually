package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۫ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12525 implements InterfaceC2648 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13935 f37641;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f37642;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16594 f37643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC7983 f37644;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f37645;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f37646;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f37647;

    public C12525(C13935 c13935, C16594 c16594, Set set, Set set2, Set set3, EnumC7983 enumC7983, Set set4) {
        this.f37641 = c13935;
        this.f37643 = c16594;
        this.f37642 = set;
        this.f37645 = set2;
        this.f37647 = set3;
        this.f37644 = enumC7983;
        this.f37646 = set4;
    }

    @Override // l.InterfaceC2648
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8320(C16594 c16594) {
        C13935 c13935 = this.f37641;
        C15346 c15346M36378 = c13935.f8420;
        C16594 c16595 = this.f37643;
        if (!c16595.m39093(c16594)) {
            c15346M36378 = c15346M36378.m36378(c16594);
        }
        if (!c16595.m39095(c16594)) {
            c13935 = (C13935) c15346M36378.m36376(c16594.m39096());
        }
        return C13935.m33366(c13935, c16594, this.f37642, this.f37645, this.f37647, this.f37644, this.f37646);
    }
}
