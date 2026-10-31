package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ۢ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9258 extends AbstractC2202 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Path f28054;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f28055;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f28056;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f28057;

    public C9258(C18430 c18430, float f, float f2, Path path) {
        this.f28055 = c18430;
        this.f28056 = f;
        this.f28057 = f2;
        this.f28054 = path;
    }

    @Override // l.AbstractC2202
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7288(AbstractC10088 abstractC10088) {
        return !(abstractC10088 instanceof C5854);
    }

    @Override // l.AbstractC2202
    /* JADX INFO: renamed from: ֫ */
    public final void mo7287(String str) {
        C18430 c18430 = this.f28055;
        if (c18430.m42893()) {
            Path path = new Path();
            c18430.f57191.f26148.getTextPath(str, 0, str.length(), this.f28056, this.f28057, path);
            this.f28054.addPath(path);
        }
        this.f28056 = c18430.f57191.f26148.measureText(str) + this.f28056;
    }
}
