package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܰᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13986 implements IntFunction {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41700;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f41700) {
            case 0:
                return new C21916[i];
            case 1:
                return String.format("#%08x", Integer.valueOf(i));
            default:
                return new InterfaceC8566[i];
        }
    }
}
