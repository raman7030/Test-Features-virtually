package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4IS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19758 extends AbstractC19535 {

    /* JADX INFO: renamed from: ۗ */
    public int f60106;

    /* JADX INFO: renamed from: ۙ */
    public final C24787 f60107;

    /* JADX INFO: renamed from: ᩶ */
    public int f60108 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final Set f60109;

    public C19758(int i, C24787 c24787, AbstractC8146 abstractC8146) {
        this.f60106 = i;
        this.f60107 = c24787;
        this.f60109 = abstractC8146;
    }

    @Override // p067l.InterfaceC21909
    public final int getVisibility() {
        return this.f60106;
    }

    @Override // p067l.InterfaceC21909
    public final String getType() {
        return this.f60107.f79220.f25636;
    }

    @Override // p067l.InterfaceC21909
    public final Set getElements() {
        return this.f60109;
    }
}
