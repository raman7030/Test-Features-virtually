package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0924 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f3548;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f3549;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f3550;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f3551;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f3552;

    public C0924(C7980 c7980, int i) {
        this.f3552 = c7980;
        this.f3550 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC21427 m3338(C0924 c0924) {
        C7980 c7980 = c0924.f3552;
        return new C18564(c0924, c7980.f24648, c0924.f3550, c7980.f24642);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m3335() {
        if (this.f3549 == 0) {
            C7980 c7980 = this.f3552;
            C18729 c18729M11939 = c7980.f24648.m31418().m11939(this.f3550);
            for (int i = 0; i < c7980.f24642; i++) {
                c18729M11939.m43368();
            }
            this.f3549 = c18729M11939.m43364();
        }
        return this.f3549;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m3336(C0924 c0924) {
        C7980 c7980 = c0924.f3552;
        return new C19270(c0924, c7980.f24648, c0924.m3335(), c7980.f24645);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m3332() {
        if (this.f3548 == 0) {
            C7980 c7980 = this.f3552;
            C18729 c18729M11939 = c7980.f24648.m31418().m11939(m3335());
            for (int i = 0; i < c7980.f24645; i++) {
                c18729M11939.m43368();
            }
            this.f3548 = c18729M11939.m43364();
        }
        return this.f3548;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterator m3333(C0924 c0924) {
        C7980 c7980 = c0924.f3552;
        return new C0218(c0924, c7980.f24648, c0924.m3332(), c7980.f24641);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Iterator m3340(C0924 c0924) {
        C7980 c7980 = c0924.f3552;
        C12918 c12918 = c7980.f24648;
        if (c0924.f3551 == 0) {
            C18729 c18729M11939 = c12918.m31418().m11939(c0924.m3332());
            for (int i = 0; i < c7980.f24641; i++) {
                c18729M11939.m43368();
            }
            c0924.f3551 = c18729M11939.m43364();
        }
        return new C5158(c12918, c0924.f3551, c7980.f24651);
    }
}
