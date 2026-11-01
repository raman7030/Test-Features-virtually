package p067l;

import android.view.MenuItem;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۚᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7638 implements InterfaceC9934, InterfaceC14792, InterfaceC9988, InterfaceC1583, InterfaceC4595, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f19991;

    public /* synthetic */ C7638(Object obj) {
        this.f19991 = obj;
    }

    public /* synthetic */ C7638(InterfaceC12260 interfaceC12260, Type type) {
        this.f19991 = interfaceC12260;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        C7534.m17437((C7534) this.f19991, menuItem);
        return true;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C21034) this.f19991).mo13474(i);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC2950) obj).mo4863((C25079) this.f19991);
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return ((InterfaceC12260) this.f19991).m28284();
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public void mo6895(Object obj, Throwable th) {
        ((C23731) this.f19991).m52769((Throwable) null);
    }
}
