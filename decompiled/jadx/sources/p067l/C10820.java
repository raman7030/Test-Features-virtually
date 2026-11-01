package p067l;

/* JADX INFO: renamed from: l.ۡ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10820 implements InterfaceC23996 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f29980;

    /* JADX INFO: renamed from: ۙ */
    public C4963 f29981 = C4963.f11302;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC17980 f29982;

    /* JADX INFO: renamed from: ᩸ */
    public long f29983;

    /* JADX INFO: renamed from: ᩹ */
    public long f29984;

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean mo15351() {
        return false;
    }

    public C10820(InterfaceC17980 interfaceC17980) {
        this.f29982 = interfaceC17980;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24937() {
        if (this.f29980) {
            return;
        }
        this.f29983 = this.f29982.mo35966();
        this.f29980 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24939() {
        if (this.f29980) {
            m24938(mo15359());
            this.f29980 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24938(long j) {
        this.f29984 = j;
        if (this.f29980) {
            this.f29983 = this.f29982.mo35966();
        }
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15359() {
        long jM10512;
        long j = this.f29984;
        if (!this.f29980) {
            return j;
        }
        long jMo35966 = this.f29982.mo35966() - this.f29983;
        C4963 c4963 = this.f29981;
        if (c4963.f11305 == 1.0f) {
            jM10512 = C5792.m12990(jMo35966);
        } else {
            jM10512 = c4963.m10512(jMo35966);
        }
        return jM10512 + j;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ֫ */
    public final void mo15343(C4963 c4963) {
        if (this.f29980) {
            m24938(mo15359());
        }
        this.f29981 = c4963;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ܽ */
    public final C4963 mo15356() {
        return this.f29981;
    }
}
