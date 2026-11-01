package p067l;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public class C17047 {

    /* JADX INFO: renamed from: ֫ */
    public String f50427;

    /* JADX INFO: renamed from: ۧ */
    public final C7741 f50428;

    public C17047(C7741 c7741) {
        this.f50428 = c7741;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38699(String str) {
        this.f50427 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38697() {
        this.f50428.m17867();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38698(int i, int i2, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(C7050.m16232(), (Class<?>) ViewOnClickListenerC20541.class);
        String str3 = this.f50427;
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
        this.f50428.m17868(intent);
    }
}
