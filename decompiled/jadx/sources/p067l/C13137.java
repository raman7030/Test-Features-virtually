package p067l;

import android.content.ContextWrapper;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۧ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13137 {

    /* JADX INFO: renamed from: ֫ */
    public long f36902;

    /* JADX INFO: renamed from: ۧ */
    public boolean f36903;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC18027 f36904;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC15531 f36905;

    /* JADX INFO: renamed from: ܿ */
    public Handler f36906;

    /* JADX INFO: renamed from: ᩳ */
    public final ContextWrapper f36907;

    /* JADX INFO: renamed from: ᩻ */
    public int f36908;

    public C13137(ContextWrapper contextWrapper) {
        this.f36907 = contextWrapper;
        this.f36905 = new C14191(contextWrapper);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30058(InterfaceC15531 interfaceC15531) {
        this.f36905 = interfaceC15531;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30060() {
        this.f36902 = 5000L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30057(Handler handler) {
        this.f36906 = handler;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30059(InterfaceC18027 interfaceC18027) {
        this.f36904 = interfaceC18027;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30061() {
        this.f36908 = 50;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19171 m30056() {
        C23877.m52960(!this.f36903);
        Handler handler = this.f36906;
        C23877.m52960((handler == null && this.f36904 == null) || !(handler == null || this.f36904 == null));
        this.f36903 = true;
        return new C19171(this);
    }
}
