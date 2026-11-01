package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9995 extends C3289 implements InterfaceC16809, InterfaceC14185 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo9753((Character) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C10776.m24825(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo9756((Character) obj);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo9753(Character ch) {
        C10105.m23578((InterfaceC16809) this, ch);
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C10776.m24826((InterfaceC17480) this, interfaceC24857);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo9756(Character ch) {
        C10105.m23580((InterfaceC16809) this, ch);
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9757(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C23406, java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Character.valueOf(mo9758());
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ۧ */
    public final void mo9754(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C23406, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C10776.m24824(this);
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        return m52074().f56387;
    }

    @Override // p067l.InterfaceC16809
    /* JADX INFO: renamed from: ᩺֫ */
    public final char mo9758() {
        return m52075().f56387;
    }
}
