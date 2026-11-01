package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۨ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13149 {

    /* JADX INFO: renamed from: ۧ */
    public static final String f36936;

    /* JADX INFO: renamed from: ֫ */
    public final String f36937;

    static {
        String str = C5792.f14228;
        f36936 = Integer.toString(0, 36);
    }

    public C13149(String str) {
        this.f36937 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m30097() {
        Bundle bundle = new Bundle();
        bundle.putString(f36936, this.f36937);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13149 m30096(Bundle bundle) {
        String string = bundle.getString(f36936);
        string.getClass();
        return new C13149(string);
    }
}
