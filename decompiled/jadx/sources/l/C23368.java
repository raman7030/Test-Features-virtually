package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.᩻֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes.dex */
public final class C23368 implements InterfaceC12764 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f75062;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f75063;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Path f75064 = new Path();

    public C23368(C2887 c2887) {
        if (c2887 == null) {
            return;
        }
        c2887.m8827(this);
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8823(float f, float f2) {
        this.f75064.moveTo(f, f2);
        this.f75062 = f;
        this.f75063 = f2;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ۧ */
    public final void mo8828(float f, float f2) {
        this.f75064.lineTo(f, f2);
        this.f75062 = f;
        this.f75063 = f2;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8825(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f75064.cubicTo(f, f2, f3, f4, f5, f6);
        this.f75062 = f5;
        this.f75063 = f6;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8824(float f, float f2, float f3, float f4) {
        this.f75064.quadTo(f, f2, f3, f4);
        this.f75062 = f3;
        this.f75063 = f4;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8826(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C18430.m42863(this.f75062, this.f75063, f, f2, f3, z, z2, f4, f5, this);
        this.f75062 = f4;
        this.f75063 = f5;
    }

    @Override // l.InterfaceC12764
    public final void close() {
        this.f75064.close();
    }
}
