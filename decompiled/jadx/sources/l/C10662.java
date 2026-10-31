package l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10662 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1489 f32071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC0489 f32073;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f32072 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7258 f32070 = new C7258(0);

    public C10662(AbstractC0489 abstractC0489) {
        this.f32073 = abstractC0489;
        this.f32071 = abstractC0489.mo2160();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0762 m26758(String str, String str2) {
        StringReader stringReader = new StringReader(str);
        AbstractC0489 abstractC0489 = this.f32073;
        abstractC0489.mo2154(stringReader, str2, this);
        abstractC0489.m2162();
        abstractC0489.f2107.m41793();
        abstractC0489.f2107 = null;
        abstractC0489.f2104 = null;
        abstractC0489.f2112 = null;
        abstractC0489.f2113 = null;
        return abstractC0489.f2109;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m26757(String str, C19814 c19814, String str2) {
        return this.f32073.mo2151(str, c19814, str2, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26760(String str) {
        return this.f32073.mo2161(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26761() {
        this.f32070.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7258 m26759() {
        return this.f32070;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26762() {
        return this.f32072;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26765() {
        this.f32072 = true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26764() {
        this.f32071 = C1489.f5329;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1489 m26763() {
        return this.f32071;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C10662 m26756() {
        return new C10662(new C1195());
    }
}
