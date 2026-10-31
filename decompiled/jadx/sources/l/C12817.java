package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۬ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12817 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle f38459;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f38460;

    public C12817(Bundle bundle, String str) {
        if (str == null) {
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        this.f38460 = str;
        this.f38459 = bundle;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m31133() {
        return this.f38460;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m31132() {
        return this.f38459;
    }
}
