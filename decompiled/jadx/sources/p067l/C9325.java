package p067l;

import java.util.LinkedHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9325 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25366;

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
        switch (this.f25366) {
            case 0:
                return ((C18551) obj).toString();
            default:
                return new LinkedHashMap();
        }
    }
}
