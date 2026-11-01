package p067l;

import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩶ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21503 implements BooleanSupplier {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f67811;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9768 f67812;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f67813;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18976 f67814;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f67815;

    public /* synthetic */ C21503(C18976 c18976, int i, int i2, InterfaceC9768 interfaceC9768, int i3) {
        this.f67814 = c18976;
        this.f67815 = i;
        this.f67813 = i2;
        this.f67812 = interfaceC9768;
        this.f67811 = i3;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        return C18976.m43112(this.f67814, this.f67815, this.f67813, this.f67812, this.f67811);
    }
}
