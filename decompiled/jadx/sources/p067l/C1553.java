package p067l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܳۛ */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1553 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1868 f46307;

    public C1553(ClipData clipData, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f46307 = new C1168(clipData, i);
            return;
        }
        C1308 c1308 = new C1308();
        c1308.f31464 = clipData;
        c1308.f31467 = i;
        this.f46307 = c1308;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36331(int i) {
        this.f46307.mo20034(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36332(Uri uri) {
        this.f46307.mo20035(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36333(Bundle bundle) {
        this.f46307.mo20036(bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1028 m36330() {
        return this.f46307.build();
    }
}
