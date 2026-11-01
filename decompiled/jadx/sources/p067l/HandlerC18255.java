package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ܽܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18255 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AssistActivity f54525;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC18255(AssistActivity assistActivity, Looper looper) {
        super(looper);
        this.f54525 = assistActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            AssistActivity assistActivity = this.f54525;
            if (assistActivity.isFinishing()) {
                return;
            }
            C11060.m25470(assistActivity.f2089, "-->finish by timeout");
            assistActivity.finish();
        }
    }
}
