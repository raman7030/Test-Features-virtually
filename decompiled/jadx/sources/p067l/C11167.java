package p067l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ۢ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11167 extends AbstractC4461 {

    /* JADX INFO: renamed from: ֫ */
    public Path f31000;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C19884 f31001;

    /* JADX INFO: renamed from: ܽ */
    public float f31002;

    /* JADX INFO: renamed from: ᩳ */
    public float f31003;

    public C11167(C19884 c19884, float f, float f2, Path path) {
        this.f31001 = c19884;
        this.f31002 = f;
        this.f31003 = f2;
        this.f31000 = path;
    }

    @Override // p067l.AbstractC4461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9367(AbstractC11956 abstractC11956) {
        return !(abstractC11956 instanceof C7932);
    }

    @Override // p067l.AbstractC4461
    /* JADX INFO: renamed from: ֫ */
    public final void mo9366(String str) {
        C19884 c19884 = this.f31001;
        if (c19884.m45166()) {
            Path path = new Path();
            c19884.f60409.f29063.getTextPath(str, 0, str.length(), this.f31002, this.f31003, path);
            this.f31000.addPath(path);
        }
        this.f31002 = c19884.f60409.f29063.measureText(str) + this.f31002;
    }
}
