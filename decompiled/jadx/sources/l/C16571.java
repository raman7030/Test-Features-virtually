package l;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16571 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50939;

    public /* synthetic */ C16571(int i) {
        this.f50939 = i;
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
        switch (this.f50939) {
            case 0:
                return C5378.stream(((C18963) obj).f59815);
            case 1:
                return (C0758) ((Supplier) obj).get();
            default:
                return (C12048) ((Map.Entry) obj).getValue();
        }
    }
}
