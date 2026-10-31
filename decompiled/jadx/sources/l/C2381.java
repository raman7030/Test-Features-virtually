package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C2381 extends C22136 implements InterfaceC15194, InterfaceC12433 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7692((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7695((Character) obj);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo7692(Character ch) {
        C8140.m21610((InterfaceC15194) this, ch);
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C8846.m22856((InterfaceC15900) this, interfaceC23662);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo7695(Character ch) {
        C8140.m21612((InterfaceC15194) this, ch);
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo7696(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C22136, java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Character.valueOf(mo7697());
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7693(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C22136, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C8846.m22854(this);
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final char mo7691() {
        return m49736().f53201;
    }

    @Override // l.InterfaceC15194
    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final char mo7697() {
        return m49737().f53201;
    }
}
