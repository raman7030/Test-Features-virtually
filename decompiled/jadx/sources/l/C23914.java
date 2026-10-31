package l;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩻᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes.dex */
public final class C23914 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PendingIntent f77320;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f77321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public int f77322;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17815[] f77323;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f77324;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4656 f77325;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Bundle f77326;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f77327;

    public C23914(C4656 c4656, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C17815[] c17815Arr, C17815[] c17815Arr2, boolean z, boolean z2) {
        this.f77327 = true;
        this.f77325 = c4656;
        if (c4656 != null && c4656.m13636() == 2) {
            this.f77322 = c4656.m13632();
        }
        this.f77321 = C21093.m47990(charSequence);
        this.f77320 = pendingIntent;
        this.f77326 = bundle == null ? new Bundle() : bundle;
        this.f77323 = c17815Arr;
        this.f77324 = z;
        this.f77327 = z2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4656 m52672() {
        int i;
        if (this.f77325 == null && (i = this.f77322) != 0) {
            this.f77325 = C4656.m13625((Resources) null, "", i);
        }
        return this.f77325;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52671() {
        return this.f77324;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17815[] m52673() {
        return this.f77323;
    }
}
