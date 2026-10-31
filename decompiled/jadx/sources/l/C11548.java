package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: l.ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11548 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5903 f34474;

    public C11548(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f34474 = new C12253(uri, clipDescription, uri2);
        } else {
            this.f34474 = new C10137(uri, clipDescription, uri2);
        }
    }

    public C11548(C12253 c12253) {
        this.f34474 = c12253;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri m28427() {
        return this.f34474.mo16562();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ClipDescription m28428() {
        return this.f34474.getDescription();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri m28429() {
        return this.f34474.mo16564();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11548 m28426(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C11548(new C12253(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m28430() {
        return this.f34474.mo16561();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m28431() {
        this.f34474.mo16563();
    }
}
