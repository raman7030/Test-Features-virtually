package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0730 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0730(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC12725) this.b).r0(0);
            default:
                return (InterfaceC15234) this.b;
        }
    }
}
