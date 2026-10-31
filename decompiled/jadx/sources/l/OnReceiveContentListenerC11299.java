package l;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: renamed from: l.ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class OnReceiveContentListenerC11299 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18022 f33838;

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C3746 c3746 = new C3746(new C8685(contentInfo));
        C3746 c3746Mo8914 = this.f33838.mo8914(view, c3746);
        if (c3746Mo8914 == null) {
            return null;
        }
        return c3746Mo8914 == c3746 ? contentInfo : c3746Mo8914.m11375();
    }

    public OnReceiveContentListenerC11299(InterfaceC18022 interfaceC18022) {
        this.f33838 = interfaceC18022;
    }
}
