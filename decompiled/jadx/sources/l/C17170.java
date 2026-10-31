package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17170 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52622;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52623;

    public /* synthetic */ C17170(int i, Object obj) {
        this.f52622 = i;
        this.f52623 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f52622) {
            case 0:
                return C14347.m34243((C3765) this.f52623);
            default:
                return ((C5089[]) this.f52623)[0];
        }
    }
}
