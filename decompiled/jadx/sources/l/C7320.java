package l;

import java.util.LinkedHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7320 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22475;

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
        switch (this.f22475) {
            case 0:
                return ((C17028) obj).toString();
            default:
                return new LinkedHashMap();
        }
    }
}
