package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ܽܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC16716 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f51341;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC16716(AssistActivity assistActivity, Looper looper) {
        super(looper);
        this.f51341 = assistActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            AssistActivity assistActivity = this.f51341;
            if (assistActivity.isFinishing()) {
                return;
            }
            C9145.m23519(assistActivity.f892, "-->finish by timeout");
            assistActivity.finish();
        }
    }
}
