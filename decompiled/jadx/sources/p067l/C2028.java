package p067l;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩻᩶ */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes.dex */
public final class C2028 {

    /* JADX INFO: renamed from: ֫ */
    public PendingIntent f80071;

    /* JADX INFO: renamed from: ۜ */
    public CharSequence f80072;

    /* JADX INFO: renamed from: ۧ */
    @Deprecated
    public int f80073;

    /* JADX INFO: renamed from: ܳ */
    public final C1726[] f80074;

    /* JADX INFO: renamed from: ܽ */
    public boolean f80075;

    /* JADX INFO: renamed from: ܿ */
    public C1073 f80076;

    /* JADX INFO: renamed from: ᩳ */
    public final Bundle f80077;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f80078;

    public C2028(C1073 c1073, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1726[] c1726Arr, C1726[] c1726Arr2, boolean z, boolean z2) {
        this.f80078 = true;
        this.f80076 = c1073;
        if (c1073 != null && c1073.m15511() == 2) {
            this.f80073 = c1073.m15507();
        }
        this.f80072 = C1888.m50320(charSequence);
        this.f80071 = pendingIntent;
        this.f80077 = bundle == null ? new Bundle() : bundle;
        this.f80074 = c1726Arr;
        this.f80075 = z;
        this.f80078 = z2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1073 m55078() {
        int i;
        if (this.f80076 == null && (i = this.f80073) != 0) {
            this.f80076 = C1073.m15500((Resources) null, "", i);
        }
        return this.f80076;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m55077() {
        return this.f80075;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1726[] m55079() {
        return this.f80074;
    }
}
