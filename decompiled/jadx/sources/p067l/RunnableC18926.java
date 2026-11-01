package p067l;

import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ܿܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18926 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AssistActivity f56470;

    public RunnableC18926(AssistActivity assistActivity) {
        this.f56470 = assistActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AssistActivity assistActivity = this.f56470;
        C11060.m25469(assistActivity.f2089, "onActivityResult finish delay");
        assistActivity.finish();
    }
}
