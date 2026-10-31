package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܶ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15441 implements InterfaceC15071, InterfaceC8017 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47295;

    public /* synthetic */ C15441(Object obj) {
        this.f47295 = obj;
    }

    @Override // l.InterfaceC15071
    /* JADX INFO: renamed from: ֫ */
    public Object mo25124(Object obj, Throwable th) {
        return C11915.m29066((Throwable) this.f47295, th);
    }

    @Override // l.InterfaceC8017
    /* JADX INFO: renamed from: ۧ */
    public void mo4663(Object obj, Throwable th) {
        ResultCallback resultCallback = (ResultCallback) this.f47295;
        if (resultCallback == null) {
            return;
        }
        if (th == null) {
            resultCallback.onSuccess();
        } else {
            resultCallback.onFailure(C18321.m42696(th));
        }
    }
}
