package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5194 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12218;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f12219;

    public /* synthetic */ C5194(int i, Object obj) {
        this.f12218 = i;
        this.f12219 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f12218) {
            case 0:
                return ((C7205[]) this.f12219)[0];
            default:
                return ((AbstractC7783) this.f12219).toString();
        }
    }
}
