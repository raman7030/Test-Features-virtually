package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C20932 extends AbstractC4817 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: t */
    public final Object[] mo10213t() {
        return new int[8][];
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: p */
    public final void mo10209p(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // p067l.AbstractC4817
    /* JADX INFO: renamed from: q */
    public final int mo10210q(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo4234g((IntConsumer) consumer);
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            C6120.m13914a((C18919) spliterator(), consumer);
        }
    }

    @Override // p067l.AbstractC4817
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        m10214u();
        int[] iArr = (int[]) this.f10942e;
        int i2 = this.f65669b;
        this.f65669b = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC20202 interfaceC20202Spliterator = spliterator();
        C12826.requireNonNull(interfaceC20202Spliterator);
        return new C8190(interfaceC20202Spliterator);
    }

    @Override // p067l.AbstractC4817, java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC20202 spliterator() {
        return new C18919(this, 0, this.f65670c, 0, this.f65669b);
    }

    public final String toString() {
        int[] iArr = (int[]) mo4230b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f65670c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f65670c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
