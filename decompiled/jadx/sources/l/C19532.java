package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C19532 extends AbstractC2576 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC2576
    public final Object[] t() {
        return new int[8][];
    }

    @Override // l.AbstractC2576
    public final void p(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC2576
    public final int q(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            C3947.a((C17414) spliterator(), consumer);
        }
    }

    @Override // l.AbstractC2576
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        u();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC18764 interfaceC18764Spliterator = spliterator();
        C11003.requireNonNull(interfaceC18764Spliterator);
        return new C6125(interfaceC18764Spliterator);
    }

    @Override // l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC18764 spliterator() {
        return new C17414(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
