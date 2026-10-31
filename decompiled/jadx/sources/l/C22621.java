package l;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22621 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73070;

    public /* synthetic */ C22621(int i) {
        this.f73070 = i;
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
        switch (this.f73070) {
            case 0:
                return new ArrayList();
            case 1:
                return new AtomicInteger();
            case 2:
                return (C15869) ((Map.Entry) obj).getValue();
            default:
                int i = C14659.f44799;
                return "?";
        }
    }
}
