package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22199 extends AbstractC20886 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23589 f72006;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7008 f72007;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7382 f72008;

    public C22199(C23589 c23589, C7382 c7382, C7008 c7008) {
        this.f72006 = c23589;
        this.f72008 = c7382;
        this.f72007 = c7008;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return this.f72006.f76475.f22724;
    }

    @Override // l.InterfaceC0098, l.InterfaceC21972
    public final String getName() {
        C7382 c7382 = this.f72008;
        if (c7382 == null) {
            return null;
        }
        return c7382.f22724;
    }

    @Override // l.InterfaceC0098
    public final Set getAnnotations() {
        return this.f72007;
    }
}
