package p067l;

/* JADX INFO: renamed from: l.֨۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes2.dex */
public class C3289 extends C23406 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C22736 f6406;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3289(C22736 c22736) {
        super(c22736.f71697);
        this.f6406 = c22736;
        this.f74555 = c22736.firstEntry();
    }

    @Override // p067l.C23406
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5724() {
        C10666 c10666M24536 = this.f74554.m24536();
        this.f74554 = c10666M24536;
        C22736 c22736 = this.f6406;
        if (c22736.f71703 || c10666M24536 == null || Character.compare(c10666M24536.f56387, c22736.f71702) >= 0) {
            return;
        }
        this.f74554 = null;
    }

    @Override // p067l.C23406
    /* JADX INFO: renamed from: ܽ */
    public final void mo5723() {
        C10666 c10666M24541 = this.f74555.m24541();
        this.f74555 = c10666M24541;
        C22736 c22736 = this.f6406;
        if (c22736.f71700 || c10666M24541 == null || Character.compare(c10666M24541.f56387, c22736.f71701) < 0) {
            return;
        }
        this.f74555 = null;
    }
}
