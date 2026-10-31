package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9947 extends AbstractC22750 implements InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30031;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30032;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo7199();

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo7201(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo7203(int i);

    public AbstractC9947(int i) {
        this.f30032 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30032 < mo7199();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f30032;
        this.f30032 = i + 1;
        this.f30031 = i;
        return mo7201(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f30031;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo7203(i);
        int i2 = this.f30031;
        int i3 = this.f30032;
        if (i2 < i3) {
            this.f30032 = i3 - 1;
        }
        this.f30031 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public void forEachRemaining(Consumer consumer) {
        while (this.f30032 < mo7199()) {
            int i = this.f30032;
            this.f30032 = i + 1;
            this.f30031 = i;
            consumer.accept(mo7201(i));
        }
    }
}
