package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6795 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21084;

    public /* synthetic */ C6795(int i) {
        this.f21084 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f21084) {
            case 0:
                return new HashSet();
            default:
                return ((C20661) obj).f66499;
        }
    }
}
