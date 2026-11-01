package p067l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۢۛ */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1308 implements InterfaceC1868 {

    /* JADX INFO: renamed from: ֫ */
    public ClipData f31464;

    /* JADX INFO: renamed from: ۧ */
    public Bundle f31465;

    /* JADX INFO: renamed from: ܽ */
    public int f31466;

    /* JADX INFO: renamed from: ܿ */
    public int f31467;

    /* JADX INFO: renamed from: ᩳ */
    public Uri f31468;

    @Override // p067l.InterfaceC1868
    /* JADX INFO: renamed from: ֫ */
    public final void mo20034(int i) {
        this.f31466 = i;
    }

    @Override // p067l.InterfaceC1868
    /* JADX INFO: renamed from: ֫ */
    public final void mo20035(Uri uri) {
        this.f31468 = uri;
    }

    @Override // p067l.InterfaceC1868
    /* JADX INFO: renamed from: ֫ */
    public final void mo20036(Bundle bundle) {
        this.f31465 = bundle;
    }

    @Override // p067l.InterfaceC1868
    public final C1028 build() {
        return new C1028(new C0958(this));
    }
}
