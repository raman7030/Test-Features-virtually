package l;

import android.view.MenuItem;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۡ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9092 implements InterfaceC7961, InterfaceC12766, InterfaceC18862, InterfaceC18303, InterfaceC14930, InterfaceC7159, InterfaceC8755 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27558;

    public /* synthetic */ C9092(Object obj) {
        this.f27558 = obj;
    }

    @Override // l.InterfaceC18303
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        C12285 c12285 = (C12285) this.f27558;
        C5935.m16664(c12285.f36596, c12285);
        return true;
    }

    @Override // l.InterfaceC7159
    /* JADX INFO: renamed from: ֫ */
    public void mo19184(InterfaceC13508 interfaceC13508) {
        ((ConcurrentLinkedQueue) this.f27558).add(interfaceC13508);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC0612) obj).mo2501((C11902) this.f27558);
    }

    @Override // l.InterfaceC8755
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo22653(int i) {
        return new ByteArrayInputStream((byte[]) this.f27558);
    }

    @Override // l.InterfaceC12061
    /* JADX INFO: renamed from: ֫ */
    public void mo8487(AbstractC15440 abstractC15440) {
        abstractC15440.m36510((String) this.f27558);
    }

    @Override // l.InterfaceC18303
    /* JADX INFO: renamed from: ۧ */
    public AbstractC16891 mo4620(int i) {
        return new C21965(((AbstractC15440) this.f27558).mo23554(), i, 0L, 0L);
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        new C3178(((C16560) this.f27558).m39056(), abstractC15440).m9742();
    }
}
