package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1666 extends C8722 implements InterfaceC15132, InterfaceC12433 {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo5653(int i) {
        C8078.m21443();
        throw null;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // l.C8722, java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return m22540().f17057;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int mo5655() {
        return m22541().f17057;
    }
}
