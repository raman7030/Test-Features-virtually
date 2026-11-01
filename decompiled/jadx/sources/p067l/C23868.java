package p067l;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23868 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75798;

    public /* synthetic */ C23868(int i) {
        this.f75798 = i;
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
        switch (this.f75798) {
            case 0:
                return new ArrayList();
            case 1:
                return new AtomicInteger();
            case 2:
                return (C17450) ((Map.Entry) obj).getValue();
            default:
                int i = C16300.f47909;
                return "?";
        }
    }
}
