package p067l;

import android.view.MenuItem;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۡ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11010 implements InterfaceC9934, InterfaceC14501, InterfaceC20295, InterfaceC19764, InterfaceC1583, InterfaceC9172, InterfaceC10689 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f30495;

    public /* synthetic */ C11010(Object obj) {
        this.f30495 = obj;
    }

    @Override // p067l.InterfaceC19764
    public /* synthetic */ void cancel() {
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        C14044 c14044 = (C14044) this.f30495;
        C8009.m18590(c14044.f39612, c14044);
        return true;
    }

    @Override // p067l.InterfaceC9172
    /* JADX INFO: renamed from: ֫ */
    public void mo21127(InterfaceC15206 interfaceC15206) {
        ((ConcurrentLinkedQueue) this.f30495).add(interfaceC15206);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC2950) obj).mo4857((C13680) this.f30495);
    }

    @Override // p067l.InterfaceC10689
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo24623(int i) {
        return new ByteArrayInputStream((byte[]) this.f30495);
    }

    @Override // p067l.InterfaceC13831
    /* JADX INFO: renamed from: ֫ */
    public void mo10534(AbstractC17043 abstractC17043) {
        abstractC17043.m38668((String) this.f30495);
    }

    @Override // p067l.InterfaceC19764
    /* JADX INFO: renamed from: ۧ */
    public AbstractC18422 mo6852(int i) {
        return new C23244(((AbstractC17043) this.f30495).mo25505(), i, 0L, 0L);
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        new C5389(((C18107) this.f30495).m41282(), abstractC17043).m11786();
    }
}
