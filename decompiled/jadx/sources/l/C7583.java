package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۟ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7583 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23454;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23455;

    public /* synthetic */ C7583(int i, int i2) {
        this.f23454 = i2;
        this.f23455 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f23454;
        int i2 = this.f23455;
        switch (i) {
            case 0:
                return String.format("MethodParametersAttr[%d]", Integer.valueOf(i2));
            default:
                return C19370.m44628(i2, "wr.pool:size=");
        }
    }
}
