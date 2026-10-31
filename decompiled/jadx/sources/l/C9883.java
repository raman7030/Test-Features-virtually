package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9883 implements Consumer {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29920;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29921;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f29922;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29923;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29924;

    public /* synthetic */ C9883(int i, int i2, CharSequence charSequence, int i3, int i4) {
        this.f29923 = i;
        this.f29924 = i2;
        this.f29922 = charSequence;
        this.f29921 = i3;
        this.f29920 = i4;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((C16231) obj).m38194(this.f29923, this.f29924, this.f29922, this.f29921, this.f29920);
    }
}
