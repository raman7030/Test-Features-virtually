package p067l;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.۫۟ */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes4.dex */
public final class C1450 implements InterfaceC1135 {

    /* JADX INFO: renamed from: ֫ */
    public final InputContentInfo f39530;

    public C1450(Object obj) {
        this.f39530 = (InputContentInfo) obj;
    }

    public C1450(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f39530 = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ۧ */
    public final Uri mo18488() {
        return this.f39530.getContentUri();
    }

    @Override // p067l.InterfaceC1135
    public final ClipDescription getDescription() {
        return this.f39530.getDescription();
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ᩳ */
    public final Uri mo18490() {
        return this.f39530.getLinkUri();
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18487() {
        return this.f39530;
    }

    @Override // p067l.InterfaceC1135
    /* JADX INFO: renamed from: ܽ */
    public final void mo18489() {
        this.f39530.requestPermission();
    }
}
