package p067l;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20345 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62834;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f62835;

    public /* synthetic */ C20345(int i, Object obj) {
        this.f62834 = i;
        this.f62835 = obj;
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
        int i = this.f62834;
        Object obj2 = this.f62835;
        switch (i) {
            case 0:
                return ((C5592) obj2).m26657(9, "exports").concat(String.format("%s;%n", ((C7604) ((Map.Entry) obj).getKey()).toString()));
            default:
                return Integer.valueOf(((C19009) obj2).f56672.size());
        }
    }
}
