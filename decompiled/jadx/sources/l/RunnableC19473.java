package l;

import android.media.metrics.PlaybackStateEvent;
import android.widget.TextView;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: l.᩵۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19473 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62965;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62966;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62967;

    public /* synthetic */ RunnableC19473(int i, Object obj, Object obj2) {
        this.f62966 = i;
        this.f62967 = obj;
        this.f62965 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62966) {
            case 0:
                DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f62967;
                DialogInterfaceC0206 dialogInterfaceC0207 = (DialogInterfaceC0206) this.f62965;
                dialogInterfaceC0206.dismiss();
                dialogInterfaceC0207.dismiss();
                break;
            case 1:
                ((C11715) this.f62967).f34960.reportPlaybackStateEvent((PlaybackStateEvent) this.f62965);
                break;
            case 2:
                TextView textView = (TextView) this.f62967;
                C22250 c22250 = (C22250) this.f62965;
                textView.setText(c22250.m49966().m46380());
                if (c22250.m49966() != EnumC20134.SUCCESS) {
                    textView.setTextColor(c22250.m49968() ? C21943.f70263 : C21943.f70293);
                }
                break;
            case 3:
                C20549.m47081((AbstractActivityC3346) this.f62967, (AbstractC15440) this.f62965, (List) null);
                break;
            case 4:
                C18030.m42092((C18030) this.f62967, (InputStream) this.f62965);
                break;
            default:
                ((C22364) this.f62967).m50101((C11781) this.f62965);
                break;
        }
    }
}
