package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۛ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8N6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7784 implements InterfaceC13819 {

    /* JADX INFO: renamed from: ܳ */
    public static final String f20412;

    /* JADX INFO: renamed from: ܿ */
    public static final String f20413;

    /* JADX INFO: renamed from: ᩳ */
    public static final String f20414;

    /* JADX INFO: renamed from: ֫ */
    public int f20415;

    /* JADX INFO: renamed from: ۧ */
    public int f20416;

    /* JADX INFO: renamed from: ܽ */
    public final int f20417;

    static {
        String str = C5792.f14228;
        f20413 = Integer.toString(0, 36);
        f20414 = Integer.toString(1, 36);
        f20412 = Integer.toString(2, 36);
    }

    public C7784(int i, int i2, int i3) {
        this.f20416 = i;
        this.f20415 = i2;
        this.f20417 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m18028() {
        Bundle bundle = new Bundle();
        bundle.putInt(f20413, this.f20416);
        bundle.putInt(f20414, this.f20415);
        bundle.putInt(f20412, this.f20417);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7784 m18027(Bundle bundle) {
        return new C7784(bundle.getInt(f20413), bundle.getInt(f20414), bundle.getInt(f20412));
    }
}
