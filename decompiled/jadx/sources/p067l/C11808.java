package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۤ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11808 implements InterfaceC13819 {

    /* JADX INFO: renamed from: ܽ */
    public static final String f32963;

    /* JADX INFO: renamed from: ᩳ */
    public static final String f32964;

    /* JADX INFO: renamed from: ֫ */
    public final int f32965;

    /* JADX INFO: renamed from: ۧ */
    public final String f32966;

    static {
        String str = C5792.f14228;
        f32964 = Integer.toString(0, 36);
        f32963 = Integer.toString(1, 36);
    }

    public C11808(String str, int i) {
        this.f32966 = str;
        this.f32965 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m27058() {
        Bundle bundle = new Bundle();
        bundle.putString(f32964, this.f32966);
        bundle.putInt(f32963, this.f32965);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11808 m27057(Bundle bundle) {
        String string = bundle.getString(f32964);
        string.getClass();
        return new C11808(string, bundle.getInt(f32963));
    }
}
