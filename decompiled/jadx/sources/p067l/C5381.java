package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5381 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12777;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f12778;

    public /* synthetic */ C5381(int i, Object obj) {
        this.f12777 = i;
        this.f12778 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f12777) {
            case 0:
                C17450 c17450 = (C17450) this.f12778;
                return "\tcell from " + (c17450.f23817 + 1) + " to " + c17450;
            default:
                return "token=" + ((C16205) this.f12778).f47694.f9122.f23232;
        }
    }
}
