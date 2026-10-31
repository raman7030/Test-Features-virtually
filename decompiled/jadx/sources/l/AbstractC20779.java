package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20779 extends AbstractC22436 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67292;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67293;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo32198();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo32199(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo32200(int i);

    public AbstractC20779(int i) {
        this.f67293 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67293 < mo32198();
    }

    @Override // l.InterfaceC14529
    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f67293;
        this.f67293 = i + 1;
        this.f67292 = i;
        return mo32199(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f67292;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo32200(i);
        int i2 = this.f67292;
        int i3 = this.f67293;
        if (i2 < i3) {
            this.f67293 = i3 - 1;
        }
        this.f67292 = -1;
    }

    @Override // l.AbstractC22436, l.InterfaceC14529
    public void forEachRemaining(IntConsumer intConsumer) {
        while (this.f67293 < mo32198()) {
            int i = this.f67293;
            this.f67293 = i + 1;
            this.f67292 = i;
            intConsumer.accept(mo32199(i));
        }
    }
}
