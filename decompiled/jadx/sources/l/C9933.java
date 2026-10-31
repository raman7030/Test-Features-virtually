package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۤ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9933 implements InterfaceC12049 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String f30005;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f30006;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30007;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f30008;

    static {
        String str = C3603.f11424;
        f30006 = Integer.toString(0, 36);
        f30005 = Integer.toString(1, 36);
    }

    public C9933(String str, int i) {
        this.f30008 = str;
        this.f30007 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m25041() {
        Bundle bundle = new Bundle();
        bundle.putString(f30006, this.f30008);
        bundle.putInt(f30005, this.f30007);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9933 m25040(Bundle bundle) {
        String string = bundle.getString(f30006);
        string.getClass();
        return new C9933(string, bundle.getInt(f30005));
    }
}
