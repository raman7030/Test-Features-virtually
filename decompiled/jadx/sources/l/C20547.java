package l;

/* JADX INFO: renamed from: l.᩷֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes5.dex */
public class C20547 extends AbstractC2202 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f66195;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f66196;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f66197;

    @Override // l.AbstractC2202
    /* JADX INFO: renamed from: ֫ */
    public void mo7287(String str) {
        C18430 c18430 = this.f66195;
        if (c18430.m42893()) {
            if (c18430.f57191.f26150) {
                c18430.f57197.drawText(str, this.f66196, this.f66197, c18430.f57191.f26148);
            }
            if (c18430.f57191.f26152) {
                c18430.f57197.drawText(str, this.f66196, this.f66197, c18430.f57191.f26153);
            }
        }
        this.f66196 = c18430.f57191.f26148.measureText(str) + this.f66196;
    }

    public C20547(C18430 c18430, float f, float f2) {
        this.f66195 = c18430;
        this.f66196 = f;
        this.f66197 = f2;
    }
}
