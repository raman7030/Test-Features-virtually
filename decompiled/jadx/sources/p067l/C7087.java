package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۙ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C7087 extends AbstractC4817 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: t */
    public final Object[] mo10213t() {
        return new long[8][];
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: p */
    public final void mo10209p(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: q */
    public final int mo10210q(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            mo4234g((LongConsumer) consumer);
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            C20873.m47164a((C6417) spliterator(), consumer);
        }
    }

    @Override // p067l.AbstractC4817
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        m10214u();
        long[] jArr = (long[]) this.f10942e;
        int i = this.f65669b;
        this.f65669b = i + 1;
        jArr[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC2766 interfaceC2766Spliterator = spliterator();
        C12826.requireNonNull(interfaceC2766Spliterator);
        return new C24283(interfaceC2766Spliterator);
    }

    @Override // p067l.AbstractC4817, java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC2766 spliterator() {
        return new C6417(this, 0, this.f65670c, 0, this.f65669b);
    }

    public final String toString() {
        long[] jArr = (long[]) mo4230b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f65670c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f65670c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
