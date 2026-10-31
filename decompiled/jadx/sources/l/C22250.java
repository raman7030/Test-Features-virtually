package l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩹ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes.dex */
public final class C22250 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f72204;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC20134 f72205;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15193 f72206;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15193 f72207 = new C15193(true);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15193 f72208;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15193 f72209;

    public C22250() {
        int i = Build.VERSION.SDK_INT;
        this.f72209 = new C15193(i >= 24);
        this.f72208 = new C15193(i >= 28);
        this.f72206 = new C15193(i >= 33);
        this.f72205 = EnumC20134.FAIL;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49967() {
        return this.f72207.f46410.m48705() && this.f72209.f46410.m48705() && this.f72208.f46410.m48705() && this.f72206.f46410.m48705();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20134 m49966() {
        return this.f72205;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m49968() {
        return this.f72204;
    }
}
