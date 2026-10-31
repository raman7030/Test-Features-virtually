package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۙ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C4964 extends AbstractC2576 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC2576
    public final Object[] t() {
        return new long[8][];
    }

    @Override // l.AbstractC2576
    public final void p(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // l.AbstractC2576
    public final int q(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            C19470.a((C4259) spliterator(), consumer);
        }
    }

    @Override // l.AbstractC2576
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        u();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC0418 interfaceC0418Spliterator = spliterator();
        C11003.requireNonNull(interfaceC0418Spliterator);
        return new C23058(interfaceC0418Spliterator);
    }

    @Override // l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC0418 spliterator() {
        return new C4259(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
