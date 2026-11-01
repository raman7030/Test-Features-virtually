package p067l;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: renamed from: l.ۧ᩺ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class OnReceiveContentListenerC1402 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1736 f36838;

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C1028 c1028 = new C1028(new C1273(contentInfo));
        C1028 c1028Mo10982 = this.f36838.mo10982(view, c1028);
        if (c1028Mo10982 == null) {
            return null;
        }
        return c1028Mo10982 == c1028 ? contentInfo : c1028Mo10982.m13311();
    }

    public OnReceiveContentListenerC1402(InterfaceC1736 interfaceC1736) {
        this.f36838 = interfaceC1736;
    }
}
