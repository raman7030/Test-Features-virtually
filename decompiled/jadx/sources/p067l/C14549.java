package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۬ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C14549 {

    /* JADX INFO: renamed from: ֫ */
    public final Bundle f41502;

    /* JADX INFO: renamed from: ۧ */
    public final String f41503;

    public C14549(Bundle bundle, String str) {
        if (str == null) {
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        this.f41503 = str;
        this.f41502 = bundle;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m33222() {
        return this.f41503;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m33221() {
        return this.f41502;
    }
}
