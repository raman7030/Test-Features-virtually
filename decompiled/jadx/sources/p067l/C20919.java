package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1MK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20919 implements InterfaceC20248 {

    /* JADX INFO: renamed from: ֫ */
    public int f65703;

    /* JADX INFO: renamed from: ۧ */
    public int f65704;

    /* JADX INFO: renamed from: ܽ */
    public int f65705;

    /* JADX INFO: renamed from: ᩳ */
    public int f65706;

    public C20919(int i, int i2, int i3, int i4) {
        this.f65705 = i;
        this.f65703 = i2;
        this.f65706 = i3;
        this.f65704 = i4;
        if (i == i2 && i3 == i4) {
            System.err.println("DiffFragmentImpl should not be empty: " + toString());
        }
        if (this.f65705 > this.f65703 || this.f65706 > this.f65704) {
            System.err.println("DiffFragmentImpl is invalid: " + toString());
        }
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ֫ */
    public final int mo17389(boolean z) {
        return z ? mo17398() : mo17396();
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܽ */
    public final int mo17394(boolean z) {
        return z ? mo17388() : mo17400();
    }

    public C20919(C14677 c14677) {
        this.f65705 = c14677.readInt();
        this.f65703 = c14677.readInt();
        this.f65706 = c14677.readInt();
        this.f65704 = c14677.readInt();
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ۧ */
    public final void mo17392(int i, boolean z) {
        if (z) {
            mo17397(i);
        } else {
            mo17393(i);
        }
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ᩳ */
    public final int mo17398() {
        return this.f65705;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17399(int i, boolean z) {
        if (z) {
            mo17395(i);
        } else {
            mo17391(i);
        }
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ֫ */
    public final int mo17388() {
        return this.f65703;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܿ */
    public final int mo17396() {
        return this.f65706;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17400() {
        return this.f65704;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܿ */
    public final void mo17397(int i) {
        this.f65705 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܽ */
    public final void mo17395(int i) {
        this.f65703 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ܳ */
    public final void mo17393(int i) {
        this.f65706 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ۧ */
    public final void mo17391(int i) {
        this.f65704 = i;
    }

    @Override // p067l.InterfaceC20248
    /* JADX INFO: renamed from: ֫ */
    public final void mo17390(C11996 c11996) {
        c11996.writeInt(this.f65705);
        c11996.writeInt(this.f65703);
        c11996.writeInt(this.f65706);
        c11996.writeInt(this.f65704);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffFragmentImpl [");
        sb.append(this.f65705);
        sb.append(", ");
        sb.append(this.f65703);
        sb.append(") - [");
        sb.append(this.f65706);
        sb.append(", ");
        return C5410.m11876(this.f65704, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
