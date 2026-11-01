package p067l;

/* JADX INFO: renamed from: l.᩷֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes5.dex */
public class C21896 extends AbstractC4461 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19884 f68872;

    /* JADX INFO: renamed from: ۧ */
    public float f68873;

    /* JADX INFO: renamed from: ܽ */
    public float f68874;

    @Override // p067l.AbstractC4461
    /* JADX INFO: renamed from: ֫ */
    public void mo9366(String str) {
        C19884 c19884 = this.f68872;
        if (c19884.m45166()) {
            if (c19884.f60409.f29065) {
                c19884.f60415.drawText(str, this.f68873, this.f68874, c19884.f60409.f29063);
            }
            if (c19884.f60409.f29067) {
                c19884.f60415.drawText(str, this.f68873, this.f68874, c19884.f60409.f29068);
            }
        }
        this.f68873 = c19884.f60409.f29063.measureText(str) + this.f68873;
    }

    public C21896(C19884 c19884, float f, float f2) {
        this.f68872 = c19884;
        this.f68873 = f;
        this.f68874 = f2;
    }
}
