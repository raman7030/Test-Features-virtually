package p067l;

import android.graphics.Bitmap;
import bin.p000mt.plugin.api.p002ui.PluginTextView;
import bin.p000mt.plugin.api.util.Consumer;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21764 implements InterfaceC9934, InterfaceC6782, Consumer, InterfaceC6141 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f68520;

    public /* synthetic */ C21764(Object obj) {
        this.f68520 = obj;
    }

    public /* synthetic */ C21764(C2772 c2772, C12782 c12782, C8758 c8758, IOException iOException, boolean z) {
        this.f68520 = c8758;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        ((PluginTextView) this.f68520).setText((CharSequence) obj);
    }

    @Override // p067l.InterfaceC6141
    /* JADX INFO: renamed from: ۧ */
    public String mo13935() {
        C8362 c8362 = (C8362) this.f68520;
        return c8362.m19361(c8362.f22385, c8362.f22373);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).mo6108((C8758) this.f68520);
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        return C18950.m43040((InterfaceC12916) this.f68520);
    }
}
