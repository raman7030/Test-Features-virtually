package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11762 implements Consumer {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f32877;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f32878;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ CharSequence f32879;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32880;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f32881;

    public /* synthetic */ C11762(int i, int i2, CharSequence charSequence, int i3, int i4) {
        this.f32880 = i;
        this.f32881 = i2;
        this.f32879 = charSequence;
        this.f32878 = i3;
        this.f32877 = i4;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((C17795) obj).m40406(this.f32880, this.f32881, this.f32879, this.f32878, this.f32877);
    }
}
