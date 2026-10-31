package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۬ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13230 implements InterfaceC2648 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13935 f39596;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f39597;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16594 f39598;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC7983 f39599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f39600;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f39601;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f39602;

    public C13230(C13935 c13935, C16594 c16594, Set set, Set set2, Set set3, EnumC7983 enumC7983, Set set4) {
        this.f39596 = c13935;
        this.f39598 = c16594;
        this.f39597 = set;
        this.f39600 = set2;
        this.f39602 = set3;
        this.f39599 = enumC7983;
        this.f39601 = set4;
    }

    @Override // l.InterfaceC2648
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8320(C16594 c16594) {
        C13935 c13935 = this.f39596;
        C15346 c15346M36378 = c13935.f8420;
        C16594 c16595 = this.f39598;
        if (!c16595.m39093(c16594)) {
            c15346M36378 = c15346M36378.m36378(c16594);
        }
        if (!c16595.m39095(c16594)) {
            c13935 = (C13935) c15346M36378.m36376(c16594.m39096());
        }
        C13935 c13936 = c13935;
        if (c16595.equals(c16594)) {
            return null;
        }
        return C13935.m33366(c13936, c16594, this.f39597, this.f39600, this.f39602, this.f39599, this.f39601);
    }
}
