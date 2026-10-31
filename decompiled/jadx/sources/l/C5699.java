package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۛ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8N6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5699 implements InterfaceC12049 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f17566;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String f17567;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f17568;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f17569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17570;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17571;

    static {
        String str = C3603.f11424;
        f17567 = Integer.toString(0, 36);
        f17568 = Integer.toString(1, 36);
        f17566 = Integer.toString(2, 36);
    }

    public C5699(int i, int i2, int i3) {
        this.f17570 = i;
        this.f17569 = i2;
        this.f17571 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m16109() {
        Bundle bundle = new Bundle();
        bundle.putInt(f17567, this.f17570);
        bundle.putInt(f17568, this.f17569);
        bundle.putInt(f17566, this.f17571);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5699 m16108(Bundle bundle) {
        return new C5699(bundle.getInt(f17567), bundle.getInt(f17568), bundle.getInt(f17566));
    }
}
