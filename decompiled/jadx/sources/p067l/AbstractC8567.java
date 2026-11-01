package p067l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8567 extends AbstractC21641 {

    /* JADX INFO: renamed from: ᩸ */
    public int f23034;

    /* JADX INFO: renamed from: ᩹ */
    public int f23035;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo19983();

    /* JADX INFO: renamed from: ۧ */
    public abstract long mo19984(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo19985(int i);

    public AbstractC8567(int i) {
        this.f23035 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23035 < mo19983();
    }

    @Override // p067l.InterfaceC8802
    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23035;
        this.f23035 = i + 1;
        this.f23034 = i;
        return mo19984(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f23034;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo19985(i);
        int i2 = this.f23034;
        int i3 = this.f23035;
        if (i2 < i3) {
            this.f23035 = i3 - 1;
        }
        this.f23034 = -1;
    }

    @Override // p067l.AbstractC21641, p067l.InterfaceC8802
    public void forEachRemaining(LongConsumer longConsumer) {
        while (this.f23035 < mo19983()) {
            int i = this.f23035;
            this.f23035 = i + 1;
            this.f23034 = i;
            longConsumer.accept(mo19984(i));
        }
    }
}
