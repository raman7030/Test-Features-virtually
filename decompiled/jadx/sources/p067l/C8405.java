package p067l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۛ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public class C8405 extends WeakReference implements InterfaceC25109 {

    /* JADX INFO: renamed from: ᩶ */
    public volatile InterfaceC5723 f22540;

    /* JADX INFO: renamed from: ᩸ */
    public final int f22541;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC25109 f22542;

    public C8405(int i, InterfaceC25109 interfaceC25109, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.f22540 = ConcurrentMapC16391.f48157;
        this.f22541 = i;
        this.f22542 = interfaceC25109;
    }

    @Override // p067l.InterfaceC25109
    public final Object getKey() {
        return get();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ۡ */
    public long mo19578() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ֫ */
    public void mo19575(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC25109 mo19587() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ۧ */
    public void mo19581(InterfaceC25109 interfaceC25109) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC25109 mo19574() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ֫ */
    public void mo19577(InterfaceC25109 interfaceC25109) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ۢ */
    public long mo19579() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ܽ */
    public void mo19582(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC25109 mo19580() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ܽ */
    public void mo19583(InterfaceC25109 interfaceC25109) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC25109 mo19586() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ᩳ */
    public void mo19585(InterfaceC25109 interfaceC25109) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC5723 mo19584() {
        return this.f22540;
    }

    @Override // p067l.InterfaceC25109
    /* JADX INFO: renamed from: ֫ */
    public final void mo19576(InterfaceC5723 interfaceC5723) {
        this.f22540 = interfaceC5723;
    }

    @Override // p067l.InterfaceC25109
    public final int getHash() {
        return this.f22541;
    }

    @Override // p067l.InterfaceC25109
    public final InterfaceC25109 getNext() {
        return this.f22542;
    }
}
