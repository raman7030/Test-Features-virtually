package p067l;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.֡᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2993 extends AbstractC7465 implements InterfaceC10509 {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC24891 f5298;

    /* JADX INFO: renamed from: ۛ */
    public final SortedSet f5300;

    /* JADX INFO: renamed from: ۟ */
    public final AbstractC24891 f5301;

    /* JADX INFO: renamed from: ۤ */
    public final C9384 f5302;

    /* JADX INFO: renamed from: ۨ */
    public final C14393 f5303;

    /* JADX INFO: renamed from: ۫ */
    public final C4000 f5304;

    /* JADX INFO: renamed from: ۬ */
    public final SortedSet f5305;

    /* JADX INFO: renamed from: ܰ */
    public final C24787 f5306;

    /* JADX INFO: renamed from: ᩶ */
    public final C9029 f5307;

    /* JADX INFO: renamed from: ᩸ */
    public int f5308;

    /* JADX INFO: renamed from: ᩺ */
    public C24787 f5310;

    /* JADX INFO: renamed from: ۙ */
    public int f5299 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f5309 = 0;

    public C2993(C24787 c24787, int i, C24787 c24788, C4000 c4000, C9384 c9384, C9029 c9029, AbstractC24891 abstractC24891, AbstractC24891 abstractC24892, Iterable iterable, C14393 c14393) {
        iterable = iterable == null ? AbstractC16192.m36872of() : iterable;
        abstractC24891 = abstractC24891 == null ? AbstractC24891.m54644of() : abstractC24891;
        abstractC24892 = abstractC24892 == null ? AbstractC24891.m54644of() : abstractC24892;
        this.f5306 = c24787;
        this.f5308 = i;
        this.f5310 = c24788;
        this.f5304 = c4000;
        this.f5302 = c9384;
        this.f5307 = c9029;
        this.f5300 = abstractC24891;
        this.f5305 = abstractC24892;
        this.f5298 = AbstractC24891.m54646(C10810.m24925(iterable, C18693.f55824));
        this.f5301 = AbstractC24891.m54646(C10810.m24925(iterable, C18693.f55825));
        this.f5303 = c14393;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return this.f5306.f79220.f25636;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܽ */
    public final int mo5039() {
        return this.f5308;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۜܽ */
    public final String mo5034() {
        C24787 c24787 = this.f5310;
        if (c24787 == null) {
            return null;
        }
        return c24787.f79220.f25636;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۜ */
    public final String mo5033() {
        C9384 c9384 = this.f5302;
        if (c9384 == null) {
            return null;
        }
        return c9384.f25636;
    }

    @Override // p067l.InterfaceC10509
    public final Set getAnnotations() {
        return this.f5307;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۨ֫ */
    public final Iterable mo5036() {
        return this.f5300;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۨ֫ */
    public final SortedSet mo5036() {
        return this.f5300;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܰۧ */
    public final Iterable mo5037() {
        return this.f5305;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۧܽ */
    public final Iterable mo5035() {
        return this.f5298;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۧܽ */
    public final AbstractC24891 mo5035() {
        return this.f5298;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܿܽ */
    public final Iterable mo5040() {
        return this.f5301;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5032(C24787 c24787) {
        this.f5310 = c24787;
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܳ֫ */
    public final List mo5038() {
        return C9468.m21989(this.f5304, C18934.m43028());
    }

    @Override // p067l.InterfaceC10509
    public final Iterable getFields() {
        return new C20429(this);
    }

    @Override // p067l.InterfaceC10509
    public final Iterable getMethods() {
        return new C21100(this);
    }

    @Override // p067l.InterfaceC10509
    public final Collection getMethods() {
        return new C21100(this);
    }
}
