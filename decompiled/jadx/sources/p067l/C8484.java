package p067l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ۜ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C8484 extends C21896 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C19884 f22775;

    /* JADX INFO: renamed from: ᩳ */
    public Path f22776;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8484(C19884 c19884, Path path, float f) {
        super(c19884, f, 0.0f);
        this.f22775 = c19884;
        this.f22776 = path;
    }

    @Override // p067l.C21896, p067l.AbstractC4461
    /* JADX INFO: renamed from: ֫ */
    public final void mo9366(String str) {
        C19884 c19884 = this.f22775;
        if (c19884.m45166()) {
            if (c19884.f60409.f29065) {
                c19884.f60415.drawTextOnPath(str, this.f22776, this.f68873, this.f68874, c19884.f60409.f29063);
            }
            if (c19884.f60409.f29067) {
                c19884.f60415.drawTextOnPath(str, this.f22776, this.f68873, this.f68874, c19884.f60409.f29068);
            }
        }
        this.f68873 = c19884.f60409.f29063.measureText(str) + this.f68873;
    }
}
