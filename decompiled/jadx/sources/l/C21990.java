package l;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩹ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class C21990 extends C14268 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f70402;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9996 f70403;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC14974 f70404;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f70405;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21990(AbstractServiceC14974 abstractServiceC14974, Object obj, C9996 c9996, String str, Bundle bundle) {
        super(obj);
        this.f70404 = abstractServiceC14974;
        this.f70403 = c9996;
        this.f70405 = str;
        this.f70402 = bundle;
    }

    @Override // l.C14268
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8964() {
        Bundle bundle = this.f70402;
        C2727 c2727 = this.f70404.f45642;
        C9996 c9996 = this.f70403;
        InterfaceC5097 interfaceC5097 = c9996.f30113;
        if (c2727.getOrDefault(((C0863) interfaceC5097).f3353.getBinder(), null) != c9996) {
            int i = AbstractServiceC14974.f45638;
            return;
        }
        if ((m33912() & 1) != 0) {
            int i2 = AbstractServiceC14974.f45638;
        }
        try {
            ((C0863) interfaceC5097).m3174(this.f70405, null, bundle);
        } catch (RemoteException unused) {
        }
    }
}
