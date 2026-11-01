package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۟ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9575 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f26365;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f26366;

    public /* synthetic */ C9575(int i, int i2) {
        this.f26365 = i2;
        this.f26366 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f26365;
        int i2 = this.f26366;
        switch (i) {
            case 0:
                return String.format("MethodParametersAttr[%d]", Integer.valueOf(i2));
            default:
                return C20778.m46922(i2, "wr.pool:size=");
        }
    }
}
