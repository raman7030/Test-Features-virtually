package p067l;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۙ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6653 implements IntFunction, BiConsumer {
    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        ((StringBuilder) obj).append((CharSequence) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C19355.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Double[i];
    }
}
