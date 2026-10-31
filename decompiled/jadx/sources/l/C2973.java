package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2973 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9419;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9420;

    public /* synthetic */ C2973(int i, Object obj) {
        this.f9419 = i;
        this.f9420 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f9419) {
            case 0:
                return ((C5089[]) this.f9420)[0];
            default:
                return ((AbstractC5698) this.f9420).toString();
        }
    }
}
