package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܶ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17044 implements InterfaceC16692, InterfaceC9988 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f50424;

    public /* synthetic */ C17044(Object obj) {
        this.f50424 = obj;
    }

    @Override // p067l.InterfaceC16692
    /* JADX INFO: renamed from: ֫ */
    public Object mo27141(Object obj, Throwable th) {
        return C13693.m31118((Throwable) this.f50424, th);
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public void mo6895(Object obj, Throwable th) {
        ResultCallback resultCallback = (ResultCallback) this.f50424;
        if (resultCallback == null) {
            return;
        }
        if (th == null) {
            resultCallback.onSuccess();
        } else {
            resultCallback.onFailure(C19781.m44958(th));
        }
    }
}
