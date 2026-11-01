package p067l;

import android.media.metrics.PlaybackStateEvent;
import android.widget.TextView;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: l.᩵۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20876 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f65582;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65583;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f65584;

    public /* synthetic */ RunnableC20876(int i, Object obj, Object obj2) {
        this.f65583 = i;
        this.f65584 = obj;
        this.f65582 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f65583) {
            case 0:
                DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f65584;
                DialogInterfaceC2564 dialogInterfaceC2565 = (DialogInterfaceC2564) this.f65582;
                dialogInterfaceC2564.dismiss();
                dialogInterfaceC2565.dismiss();
                break;
            case 1:
                ((C13502) this.f65584).f37960.reportPlaybackStateEvent((PlaybackStateEvent) this.f65582);
                break;
            case 2:
                TextView textView = (TextView) this.f65584;
                C23515 c23515 = (C23515) this.f65582;
                textView.setText(c23515.m52294().m48696());
                if (c23515.m52294() != EnumC21504.SUCCESS) {
                    textView.setTextColor(c23515.m52296() ? C23223.f72975 : C23223.f73004);
                }
                break;
            case 3:
                C21898.m49404((AbstractActivityC5549) this.f65584, (AbstractC17043) this.f65582, (List) null);
                break;
            case 4:
                C19504.m44343((C19504) this.f65584, (InputStream) this.f65582);
                break;
            default:
                ((C23623) this.f65584).m52441((C13565) this.f65582);
                break;
        }
    }
}
