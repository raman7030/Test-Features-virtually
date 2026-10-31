package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۨ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11344 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f33938;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f33939;

    static {
        String str = C3603.f11424;
        f33938 = Integer.toString(0, 36);
    }

    public C11344(String str) {
        this.f33939 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m28052() {
        Bundle bundle = new Bundle();
        bundle.putString(f33938, this.f33939);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11344 m28051(Bundle bundle) {
        String string = bundle.getString(f33938);
        string.getClass();
        return new C11344(string);
    }
}
