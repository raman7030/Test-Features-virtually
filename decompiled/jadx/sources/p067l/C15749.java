package p067l;

import java.util.HashMap;
import java.util.Queue;

/* JADX INFO: renamed from: l.ܰ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15749 implements InterfaceC18452 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f45615 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C6383 f45616;

    public C15749(C6383 c6383) {
        this.f45616 = c6383;
    }

    @Override // p067l.InterfaceC18452
    /* JADX INFO: renamed from: ֫ */
    public final void mo35816(C11748 c11748) {
        ((Queue) C15525.computeIfAbsent(this.f45615, c11748.f32802.f8855.f20027.mo3350(), new C9668(8))).add(c11748);
    }

    @Override // p067l.InterfaceC18452
    /* JADX INFO: renamed from: ֫ */
    public final void mo35815(C4036 c4036) {
        HashMap map = this.f45615;
        if (map.isEmpty()) {
            return;
        }
        C6383 c6383 = this.f45616;
        InterfaceC18452 interfaceC18452 = c6383.f16524;
        try {
            c6383.f16524 = c6383.f16523;
            Queue queue = (Queue) map.get(c4036.f8855.f20027.mo3350());
            while (queue != null && !queue.isEmpty()) {
                c6383.m14598((C11748) queue.remove());
            }
            c6383.f16524 = interfaceC18452;
        } catch (Throwable th) {
            c6383.f16524 = interfaceC18452;
            throw th;
        }
    }
}
