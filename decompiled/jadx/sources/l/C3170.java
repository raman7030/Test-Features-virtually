package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3170 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9974;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9975;

    public /* synthetic */ C3170(int i, Object obj) {
        this.f9974 = i;
        this.f9975 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f9974) {
            case 0:
                C15869 c15869 = (C15869) this.f9975;
                return "\tcell from " + (c15869.f20943 + 1) + " to " + c15869;
            default:
                return "token=" + ((C14559) this.f9975).f44587.f6341.f20355;
        }
    }
}
