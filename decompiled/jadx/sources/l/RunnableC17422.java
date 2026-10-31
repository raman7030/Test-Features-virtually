package l;

import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ܿܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17422 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f53282;

    public RunnableC17422(AssistActivity assistActivity) {
        this.f53282 = assistActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AssistActivity assistActivity = this.f53282;
        C9145.m23518(assistActivity.f892, "onActivityResult finish delay");
        assistActivity.finish();
    }
}
