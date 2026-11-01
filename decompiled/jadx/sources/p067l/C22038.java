package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22038 {
    public static Function $default$compose(Function function, Function function2) {
        C12826.requireNonNull(function2);
        return new C22708(function, function2, 1);
    }

    public static Function $default$andThen(Function function, Function function2) {
        C12826.requireNonNull(function2);
        return new C22708(function, function2, 0);
    }

    public static Function identity() {
        return new C10500(11);
    }
}
