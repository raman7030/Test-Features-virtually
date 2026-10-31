package l;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public class C15444 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f47298;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5652 f47299;

    public C15444(C5652 c5652) {
        this.f47299 = c5652;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36541(String str) {
        this.f47298 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36539() {
        this.f47299.m15939();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36540(int i, int i2, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(C4925.m14335(), (Class<?>) ViewOnClickListenerC19121.class);
        String str3 = this.f47298;
        intent.putExtra("type", i);
        intent.putExtra("title", i2);
        if (bundle != null) {
            intent.putExtra("extra", bundle);
        }
        if (str != null) {
            intent.putExtra("initPath", str);
        }
        if (str3 != null) {
            intent.putExtra("initPathKey", str3);
        }
        if (str2 != null) {
            intent.putExtra("initFilename", str2);
        }
        if (strArr != null && strArr.length != 0) {
            intent.putExtra("suffixes", strArr);
        }
        this.f47299.m15940(intent);
    }
}
