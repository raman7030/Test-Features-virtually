package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11822 extends AbstractC23990 implements InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f32988;

    /* JADX INFO: renamed from: ᩹ */
    public int f32989;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9278();

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo9280(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo9282(int i);

    public AbstractC11822(int i) {
        this.f32989 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32989 < mo9278();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f32989;
        this.f32989 = i + 1;
        this.f32988 = i;
        return mo9280(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f32988;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo9282(i);
        int i2 = this.f32988;
        int i3 = this.f32989;
        if (i2 < i3) {
            this.f32989 = i3 - 1;
        }
        this.f32988 = -1;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public void forEachRemaining(Consumer consumer) {
        while (this.f32989 < mo9278()) {
            int i = this.f32989;
            this.f32989 = i + 1;
            this.f32988 = i;
            consumer.accept(mo9280(i));
        }
    }
}
