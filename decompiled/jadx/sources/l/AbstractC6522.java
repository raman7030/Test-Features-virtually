package l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6522 extends AbstractC20278 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f20156;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f20157;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo18034();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract long mo18035(int i);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo18036(int i);

    public AbstractC6522(int i) {
        this.f20157 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20157 < mo18034();
    }

    @Override // l.InterfaceC6769
    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f20157;
        this.f20157 = i + 1;
        this.f20156 = i;
        return mo18035(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f20156;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo18036(i);
        int i2 = this.f20156;
        int i3 = this.f20157;
        if (i2 < i3) {
            this.f20157 = i3 - 1;
        }
        this.f20156 = -1;
    }

    @Override // l.AbstractC20278, l.InterfaceC6769
    public void forEachRemaining(LongConsumer longConsumer) {
        while (this.f20157 < mo18034()) {
            int i = this.f20157;
            this.f20157 = i + 1;
            this.f20156 = i;
            longConsumer.accept(mo18035(i));
        }
    }
}
