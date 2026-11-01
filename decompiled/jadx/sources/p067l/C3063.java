package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3063 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5524b;

    public /* synthetic */ C3063(int i, Object obj) {
        this.f5523a = i;
        this.f5524b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f5523a) {
            case 0:
                return ((AbstractC14463) this.f5524b).m33096r0(0);
            default:
                return (InterfaceC16847) this.f5524b;
        }
    }
}
