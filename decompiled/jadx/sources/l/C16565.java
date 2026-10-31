package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes5.dex */
public class C16565 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14448 f50925;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10922 f50926;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10922 f50927;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10922 f50928;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f50929 = 0;

    @Override // l.InterfaceC15132
    public final /* synthetic */ void add(int i) {
        C8078.m21440();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // l.InterfaceC20881
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // l.InterfaceC14529
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17352.$default$forEachRemaining((InterfaceC14529) this, intConsumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo5656((Integer) obj);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5653(int i) {
        C8078.m21443();
        throw null;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    public C16565(C14448 c14448) {
        this.f50925 = c14448;
        this.f50927 = c14448.f44289;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f50927 != null;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f50926 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo39071() {
        this.f50927 = this.f50927.m27236();
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C10922 c10922 = this.f50927;
        this.f50926 = c10922;
        this.f50928 = c10922;
        this.f50929++;
        mo39071();
        return this.f50928.f32829;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo39072() {
        this.f50926 = this.f50926.m27238();
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C10922 c10922 = this.f50926;
        this.f50927 = c10922;
        this.f50928 = c10922;
        this.f50929--;
        mo39072();
        return this.f50928.f32829;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f50929;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f50929 - 1;
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C10922 c10922 = this.f50928;
        if (c10922 == null) {
            throw new IllegalStateException();
        }
        if (c10922 == this.f50926) {
            this.f50929--;
        }
        this.f50926 = c10922;
        this.f50927 = c10922;
        mo39072();
        mo39071();
        this.f50925.remove(this.f50928.f32829);
        this.f50928 = null;
    }
}
