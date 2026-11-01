package p067l;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: l.ۨ۟ */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1415 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1135 f37471;

    public C1415(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f37471 = new C1450(uri, clipDescription, uri2);
        } else {
            this.f37471 = new C1345(uri, clipDescription, uri2);
        }
    }

    public C1415(C1450 c1450) {
        this.f37471 = c1450;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Uri m30473() {
        return this.f37471.mo18488();
    }

    /* JADX INFO: renamed from: ۧ */
    public final ClipDescription m30474() {
        return this.f37471.getDescription();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Uri m30475() {
        return this.f37471.mo18490();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1415 m30472(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C1415(new C1450(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m30476() {
        return this.f37471.mo18487();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m30477() {
        this.f37471.mo18489();
    }
}
