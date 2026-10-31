package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5261 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16465;

    public /* synthetic */ C5261(int i) {
        this.f16465 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f16465) {
            case 0:
                return new char[8192];
            case 1:
                return new C22706();
            default:
                int i = AbstractC14545.f44556;
                return new C1846();
        }
    }
}
