package p067l;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18117 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54116;

    public /* synthetic */ C18117(int i) {
        this.f54116 = i;
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
        switch (this.f54116) {
            case 0:
                return C7480.stream(((C20391) obj).f63044);
            case 1:
                return (C3088) ((Supplier) obj).get();
            default:
                return (C13818) ((Map.Entry) obj).getValue();
        }
    }
}
