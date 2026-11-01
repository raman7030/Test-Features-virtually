package p067l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.᩻֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes.dex */
public final class C24577 implements InterfaceC14499 {

    /* JADX INFO: renamed from: ֫ */
    public float f77808;

    /* JADX INFO: renamed from: ۧ */
    public float f77809;

    /* JADX INFO: renamed from: ܽ */
    public Path f77810 = new Path();

    public C24577(C5112 c5112) {
        if (c5112 == null) {
            return;
        }
        c5112.m10894(this);
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10890(float f, float f2) {
        this.f77810.moveTo(f, f2);
        this.f77808 = f;
        this.f77809 = f2;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ۧ */
    public final void mo10895(float f, float f2) {
        this.f77810.lineTo(f, f2);
        this.f77808 = f;
        this.f77809 = f2;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10892(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f77810.cubicTo(f, f2, f3, f4, f5, f6);
        this.f77808 = f5;
        this.f77809 = f6;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10891(float f, float f2, float f3, float f4) {
        this.f77810.quadTo(f, f2, f3, f4);
        this.f77808 = f3;
        this.f77809 = f4;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10893(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C19884.m45136(this.f77808, this.f77809, f, f2, f3, z, z2, f4, f5, this);
        this.f77808 = f4;
        this.f77809 = f5;
    }

    @Override // p067l.InterfaceC14499
    public final void close() {
        this.f77810.close();
    }
}
