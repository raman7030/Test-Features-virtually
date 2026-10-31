package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: l.ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6568 implements InterfaceC20680 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentInfo.Builder f20265;

    public C6568(ClipData clipData, int i) {
        this.f20265 = C23501.m51946(clipData, i);
    }

    @Override // l.InterfaceC20680
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18084(int i) {
        this.f20265.setFlags(i);
    }

    @Override // l.InterfaceC20680
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18085(Uri uri) {
        this.f20265.setLinkUri(uri);
    }

    @Override // l.InterfaceC20680
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18086(Bundle bundle) {
        this.f20265.setExtras(bundle);
    }

    @Override // l.InterfaceC20680
    public final C3746 build() {
        return new C3746(new C8685(this.f20265.build()));
    }
}
