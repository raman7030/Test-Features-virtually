package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4IS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18297 extends AbstractC18063 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f56888;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23589 f56889;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56890 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Set f56891;

    public C18297(int i, C23589 c23589, AbstractC6079 abstractC6079) {
        this.f56888 = i;
        this.f56889 = c23589;
        this.f56891 = abstractC6079;
    }

    @Override // l.InterfaceC20561
    public final int getVisibility() {
        return this.f56888;
    }

    @Override // l.InterfaceC20561
    public final String getType() {
        return this.f56889.f76475.f22724;
    }

    @Override // l.InterfaceC20561
    public final Set getElements() {
        return this.f56891;
    }
}
