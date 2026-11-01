package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11796 implements InterfaceC18698 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C3748 f32952;

    @Override // p067l.InterfaceC18698
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo27042() {
    }

    public C11796(C3748 c3748) {
        this.f32952 = c3748;
    }

    @Override // p067l.InterfaceC18698
    /* JADX INFO: renamed from: ܽ */
    public final void mo27045() {
        Iterator it = this.f32952.f7948.iterator();
        while (it.hasNext()) {
            ((InterfaceC6431) it.next()).mo10836();
        }
    }

    @Override // p067l.InterfaceC18698
    /* JADX INFO: renamed from: ܳ */
    public final void mo27044() {
        Iterator it = this.f32952.f7948.iterator();
        while (it.hasNext()) {
            ((InterfaceC6431) it.next()).mo10835();
        }
    }

    @Override // p067l.InterfaceC18698
    /* JADX INFO: renamed from: ֫ */
    public final void mo27043(C8454 c8454) {
        Iterator it = this.f32952.f7948.iterator();
        while (it.hasNext()) {
            ((InterfaceC6431) it.next()).mo10823(c8454);
        }
    }
}
