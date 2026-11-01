package p067l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8826 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23962;

    public /* synthetic */ C8826(int i) {
        this.f23962 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f23962) {
            case 0:
                return new HashSet();
            default:
                return ((C22004) obj).f69181;
        }
    }
}
