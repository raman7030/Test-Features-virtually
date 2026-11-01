package p067l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22117 extends AbstractC23692 {

    /* JADX INFO: renamed from: ᩸ */
    public int f69976;

    /* JADX INFO: renamed from: ᩹ */
    public int f69977;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo34297();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo34298(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo34299(int i);

    public AbstractC22117(int i) {
        this.f69977 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69977 < mo34297();
    }

    @Override // p067l.InterfaceC16177
    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f69977;
        this.f69977 = i + 1;
        this.f69976 = i;
        return mo34298(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f69976;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo34299(i);
        int i2 = this.f69976;
        int i3 = this.f69977;
        if (i2 < i3) {
            this.f69977 = i3 - 1;
        }
        this.f69976 = -1;
    }

    @Override // p067l.AbstractC23692, p067l.InterfaceC16177
    public void forEachRemaining(IntConsumer intConsumer) {
        while (this.f69977 < mo34297()) {
            int i = this.f69977;
            this.f69977 = i + 1;
            this.f69976 = i;
            intConsumer.accept(mo34298(i));
        }
    }
}
