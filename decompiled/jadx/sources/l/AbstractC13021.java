package l;

import java.nio.charset.Charset;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.۬ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13021 extends AbstractC4555 {
    static {
        InterfaceC23579[] interfaceC23579Arr = C14411.f44174;
    }

    public AbstractC13021() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: l.ۗۢ֡
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C15755.$default$andThen(this, intUnaryOperator);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C15755.$default$compose(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                this.f9831.getClass();
                if (i <= Integer.MAX_VALUE) {
                    return i;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.MAX_VALUE));
            }
        };
    }
}
