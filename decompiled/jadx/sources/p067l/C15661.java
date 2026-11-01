package p067l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܰᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15661 implements IntFunction {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f44783;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f44783) {
            case 0:
                return new C23198[i];
            case 1:
                return String.format("#%08x", Integer.valueOf(i));
            default:
                return new InterfaceC10509[i];
        }
    }
}
