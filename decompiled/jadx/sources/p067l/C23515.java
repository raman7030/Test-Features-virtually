package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩹ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23515 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f74929;

    /* JADX INFO: renamed from: ۧ */
    public EnumC21504 f74930;

    /* JADX INFO: renamed from: ܳ */
    public final C16808 f74931;

    /* JADX INFO: renamed from: ܽ */
    public final C16808 f74932 = new C16808(true);

    /* JADX INFO: renamed from: ܿ */
    public final C16808 f74933;

    /* JADX INFO: renamed from: ᩳ */
    public final C16808 f74934;

    public C23515() {
        int i = Build.VERSION.SDK_INT;
        this.f74934 = new C16808(i >= 24);
        this.f74933 = new C16808(i >= 28);
        this.f74931 = new C16808(i >= 33);
        this.f74930 = EnumC21504.FAIL;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m52295() {
        return this.f74932.f49535.m51050() && this.f74934.f49535.m51050() && this.f74933.f49535.m51050() && this.f74931.f49535.m51050();
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC21504 m52294() {
        return this.f74930;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m52296() {
        return this.f74929;
    }
}
