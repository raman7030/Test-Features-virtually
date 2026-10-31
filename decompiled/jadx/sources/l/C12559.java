package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C12559 extends AbstractC2576 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.AbstractC2576
    public final Object[] t() {
        return new double[8][];
    }

    @Override // l.AbstractC2576
    public final void p(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC2576
    public final int q(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC16169.b((C0564) spliterator(), consumer);
        }
    }

    @Override // l.AbstractC2576
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        u();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC8160 interfaceC8160Spliterator = spliterator();
        C11003.requireNonNull(interfaceC8160Spliterator);
        return new C3241(interfaceC8160Spliterator);
    }

    @Override // l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC8160 spliterator() {
        return new C0564(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
