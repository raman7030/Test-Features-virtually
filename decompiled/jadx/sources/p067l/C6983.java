package p067l;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۙ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6983 implements InterfaceC15563 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C4598 f18179;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AtomicInteger f18180;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ List f18181;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3237 f18182;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AtomicReference f18183;

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo9234() {
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ void mo9236() {
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo16034() {
        return null;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo9237(int i) {
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩻֫ */
    public final /* synthetic */ boolean mo9240() {
        return true;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩸ */
    public final String mo9239() {
        return C12248.m28241(mo9232());
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ֫ */
    public final void mo9231(String str) {
        C12248.m28246(mo9232(), str);
    }

    public C6983(C4598 c4598, List list, AtomicReference atomicReference, C3237 c3237, AtomicInteger atomicInteger) {
        this.f18179 = c4598;
        this.f18181 = list;
        this.f18183 = atomicReference;
        this.f18182 = c3237;
        this.f18180 = atomicInteger;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۜ */
    public final String mo9232() {
        return this.f18179.m9721();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩳ֫ */
    public final IInArchive mo9238() {
        return this.f18179.m9730();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۧ */
    public final void mo9235(IInArchive iInArchive) {
        this.f18179.m9722(iInArchive);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16036(int i) {
        AtomicReference atomicReference = this.f18183;
        if (i >= 0) {
            List list = this.f18181;
            if (i < list.size()) {
                atomicReference.set(((C6177) list.get(i)).m14002());
                return;
            }
        }
        atomicReference.set(null);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo9233(int i) {
        if (i < 0) {
            return false;
        }
        List list = this.f18181;
        return i < list.size() && ((C6177) list.get(i)).m13995();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩹ */
    public final void mo16037() {
        this.f18183.set(null);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܽ */
    public final void mo16035() {
        this.f18182.cancel();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f18182.m5590();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ֫ */
    public final void mo16033(int i) {
        this.f18180.set(i);
    }
}
