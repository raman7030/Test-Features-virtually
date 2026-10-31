package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۛ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public class C6351 extends WeakReference implements InterfaceC23927 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC3529 f19668;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f19669;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 f19670;

    public C6351(int i, InterfaceC23927 interfaceC23927, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.f19668 = ConcurrentMapC14754.f45044;
        this.f19669 = i;
        this.f19670 = interfaceC23927;
    }

    @Override // l.InterfaceC23927
    public final Object getKey() {
        return get();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long mo17638() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo17635(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC23927 mo17647() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo17641(InterfaceC23927 interfaceC23927) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23927 mo17634() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo17637(InterfaceC23927 interfaceC23927) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long mo17639() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo17642(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC23927 mo17640() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo17643(InterfaceC23927 interfaceC23927) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC23927 mo17646() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo17645(InterfaceC23927 interfaceC23927) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3529 mo17644() {
        return this.f19668;
    }

    @Override // l.InterfaceC23927
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17636(InterfaceC3529 interfaceC3529) {
        this.f19668 = interfaceC3529;
    }

    @Override // l.InterfaceC23927
    public final int getHash() {
        return this.f19669;
    }

    @Override // l.InterfaceC23927
    public final InterfaceC23927 getNext() {
        return this.f19670;
    }
}
