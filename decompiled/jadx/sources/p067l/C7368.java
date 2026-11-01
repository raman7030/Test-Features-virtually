package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7368 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f19302;

    public /* synthetic */ C7368(int i) {
        this.f19302 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f19302) {
            case 0:
                return new char[8192];
            case 1:
                return new C23948();
            default:
                int i = AbstractC16192.f47662;
                return new C4123();
        }
    }
}
