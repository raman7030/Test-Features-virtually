package p067l;

import android.os.Bundle;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18937 extends C15486 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C23631 f56476;

    public C18937(C23631 c23631) {
        this.f56476 = c23631;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ۧ */
    public final String mo10449() {
        String string = this.f56476.f8386.getString("filePath");
        return string == null ? "untitled" : C11419.m26414(string);
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܽ */
    public final String mo24066() {
        String string = this.f56476.f8386.getString("filePath");
        if (string == null || !string.equals("untitled")) {
            return string;
        }
        return null;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo35233() {
        return this.f56476.m52507();
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ᩳ */
    public final int mo35234() {
        C23631 c23631 = this.f56476;
        if (c23631.m52507()) {
            return c23631.f75231.f38637.m34768();
        }
        return 0;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final int mo35231() {
        C23631 c23631 = this.f56476;
        if (c23631.m52507()) {
            return c23631.f75231.f38640;
        }
        return 0;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final void mo35232(int i, ResultCallback resultCallback) {
        C23631 c23631 = this.f56476;
        if (c23631.m52507()) {
            c23631.m52478(i, (Runnable) null).m12887((InterfaceC9988) new C17044(resultCallback));
        } else if (resultCallback != null) {
            resultCallback.onFailure(ResultCallback.ERROR_UNSUPPORTED_OPERATION);
        }
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24067() {
        return this.f56476.m7655();
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final void mo24065(ResultCallback resultCallback) {
        C23631 c23631 = this.f56476;
        if (c23631.m7639() && c23631.f75224 != null) {
            c23631.f75239 = resultCallback;
            c23631.f75224.m34411(null, R.string.MT_Protector, c23631.m7649().f17850.getName(), Bundle.EMPTY);
            return;
        }
        c23631.m52561((ActivityC17874) c23631.requireActivity(), resultCallback);
    }
}
