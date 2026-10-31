package l;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18915 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59603;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59604;

    public /* synthetic */ C18915(int i, Object obj) {
        this.f59603 = i;
        this.f59604 = obj;
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
        int i = this.f59603;
        Object obj2 = this.f59604;
        switch (i) {
            case 0:
                return ((C3392) obj2).m24643(9, "exports").concat(String.format("%s;%n", ((C5509) ((Map.Entry) obj).getKey()).toString()));
            default:
                return Integer.valueOf(((C17509) obj2).f53482.size());
        }
    }
}
