package p067l;

import java.nio.charset.Charset;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.۬ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14743 extends AbstractC6697 {
    static {
        InterfaceC24778[] interfaceC24778Arr = C16064.f47268;
    }

    public AbstractC14743() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: l.ۗۢ֡
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C17342.$default$andThen(this, intUnaryOperator);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C17342.$default$compose(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                this.f12634.getClass();
                if (i <= Integer.MAX_VALUE) {
                    return i;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.MAX_VALUE));
            }
        };
    }
}
