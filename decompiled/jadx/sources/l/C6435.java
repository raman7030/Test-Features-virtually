package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ۜ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6435 extends C20547 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f19903;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Path f19904;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6435(C18430 c18430, Path path, float f) {
        super(c18430, f, 0.0f);
        this.f19903 = c18430;
        this.f19904 = path;
    }

    @Override // l.C20547, l.AbstractC2202
    /* JADX INFO: renamed from: ֫ */
    public final void mo7287(String str) {
        C18430 c18430 = this.f19903;
        if (c18430.m42893()) {
            if (c18430.f57191.f26150) {
                c18430.f57197.drawTextOnPath(str, this.f19904, this.f66196, this.f66197, c18430.f57191.f26148);
            }
            if (c18430.f57191.f26152) {
                c18430.f57197.drawTextOnPath(str, this.f19904, this.f66196, this.f66197, c18430.f57191.f26153);
            }
        }
        this.f66196 = c18430.f57191.f26148.measureText(str) + this.f66196;
    }
}
