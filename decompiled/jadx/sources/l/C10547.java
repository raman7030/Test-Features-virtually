package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10547 extends C12663 implements InterfaceC15132, InterfaceC12433 {
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

    @Override // l.C23246, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // l.C23246, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return m51565().f17057;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        return m51566().f17057;
    }
}
