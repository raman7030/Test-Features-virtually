package p067l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: l.ۜۛ */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1168 implements InterfaceC1868 {

    /* JADX INFO: renamed from: ֫ */
    public final ContentInfo.Builder f23143;

    public C1168(ClipData clipData, int i) {
        this.f23143 = C2008.m54348(clipData, i);
    }

    @Override // p067l.InterfaceC1868
    /* JADX INFO: renamed from: ֫ */
    public final void mo20034(int i) {
        this.f23143.setFlags(i);
    }

    @Override // p067l.InterfaceC1868
    /* JADX INFO: renamed from: ֫ */
    public final void mo20035(Uri uri) {
        this.f23143.setLinkUri(uri);
    }

    @Override // p067l.InterfaceC1868
    /* JADX INFO: renamed from: ֫ */
    public final void mo20036(Bundle bundle) {
        this.f23143.setExtras(bundle);
    }

    @Override // p067l.InterfaceC1868
    public final C1028 build() {
        return new C1028(new C1273(this.f23143.build()));
    }
}
