package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23466 extends AbstractC22218 {

    /* JADX INFO: renamed from: ᩶ */
    public final C24787 f74727;

    /* JADX INFO: renamed from: ᩸ */
    public final C9029 f74728;

    /* JADX INFO: renamed from: ᩹ */
    public final C9384 f74729;

    public C23466(C24787 c24787, C9384 c9384, C9029 c9029) {
        this.f74727 = c24787;
        this.f74729 = c9384;
        this.f74728 = c9029;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return this.f74727.f79220.f25636;
    }

    @Override // p067l.InterfaceC2461, p067l.InterfaceC23250
    public final String getName() {
        C9384 c9384 = this.f74729;
        if (c9384 == null) {
            return null;
        }
        return c9384.f25636;
    }

    @Override // p067l.InterfaceC2461
    public final Set getAnnotations() {
        return this.f74728;
    }
}
