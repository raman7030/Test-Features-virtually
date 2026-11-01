package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9962 implements Function {
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
        C6177 c6177 = (C6177) obj;
        int iM32025 = C14103.m32025(c6177);
        if (iM32025 == 0) {
            return null;
        }
        return new C6609(c6177.m14002(), c6177.m14000(), C14103.m32024(c6177), (int) c6177.m13994(), iM32025);
    }
}
