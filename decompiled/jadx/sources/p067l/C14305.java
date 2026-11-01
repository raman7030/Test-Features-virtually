package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C14305 extends AbstractC4817 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: t */
    public final Object[] mo10213t() {
        return new double[8][];
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: p */
    public final void mo10209p(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: q */
    public final int mo10210q(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            mo4234g((DoubleConsumer) consumer);
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC17736.m40300b((C2905) spliterator(), consumer);
        }
    }

    @Override // p067l.AbstractC4817
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        m10214u();
        double[] dArr = (double[]) this.f10942e;
        int i = this.f65669b;
        this.f65669b = i + 1;
        dArr[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC10124 interfaceC10124Spliterator = spliterator();
        C12826.requireNonNull(interfaceC10124Spliterator);
        return new C5449(interfaceC10124Spliterator);
    }

    @Override // p067l.AbstractC4817, java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC10124 spliterator() {
        return new C2905(this, 0, this.f65670c, 0, this.f65669b);
    }

    public final String toString() {
        double[] dArr = (double[]) mo4230b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f65670c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f65670c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
