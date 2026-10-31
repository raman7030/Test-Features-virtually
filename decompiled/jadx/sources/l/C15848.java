package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܺۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4MG */
/* JADX INFO: loaded from: classes5.dex */
public final class C15848 extends AbstractC15945 implements InterfaceC3627 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14062 f48959;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f48960;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18672 f48961;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f48962;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7008 f48963;

    public C15848(C18672 c18672, int i, InterfaceC14062 interfaceC14062, C7008 c7008, Set set) {
        this.f48961 = c18672;
        this.f48962 = i;
        this.f48959 = interfaceC14062;
        this.f48963 = c7008;
        this.f48960 = set;
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ܽ */
    public final int mo11110() {
        return this.f48962;
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ۚ֫ */
    public final InterfaceC10410 mo11109() {
        return this.f48959;
    }

    @Override // l.InterfaceC3627
    public final Set getAnnotations() {
        return this.f48963;
    }

    @Override // l.InterfaceC18877
    /* JADX INFO: renamed from: ܳ */
    public final String mo8192() {
        return this.f48961.f59006.f76475.f22724;
    }

    @Override // l.InterfaceC18877
    public final String getName() {
        return this.f48961.f59004.f22724;
    }

    @Override // l.InterfaceC18877
    public final String getType() {
        return this.f48961.f59007.f76475.f22724;
    }

    @Override // l.InterfaceC3627
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo11111() {
        return this.f48960;
    }
}
