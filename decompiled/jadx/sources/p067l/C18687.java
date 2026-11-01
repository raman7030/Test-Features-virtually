package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18687 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f55803;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f55804;

    public /* synthetic */ C18687(int i, Object obj) {
        this.f55803 = i;
        this.f55804 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f55803) {
            case 0:
                return C16004.m36376((C5947) this.f55804);
            default:
                return ((C7205[]) this.f55804)[0];
        }
    }
}
