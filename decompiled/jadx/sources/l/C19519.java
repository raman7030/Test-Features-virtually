package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1MK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19519 implements InterfaceC18813 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63083;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f63084;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f63085;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f63086;

    public C19519(int i, int i2, int i3, int i4) {
        this.f63085 = i;
        this.f63083 = i2;
        this.f63086 = i3;
        this.f63084 = i4;
        if (i == i2 && i3 == i4) {
            System.err.println("DiffFragmentImpl should not be empty: " + toString());
        }
        if (this.f63085 > this.f63083 || this.f63086 > this.f63084) {
            System.err.println("DiffFragmentImpl is invalid: " + toString());
        }
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ֫ */
    public final int mo15478(boolean z) {
        return z ? mo15487() : mo15485();
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܽ */
    public final int mo15483(boolean z) {
        return z ? mo15477() : mo15489();
    }

    public C19519(C12951 c12951) {
        this.f63085 = c12951.readInt();
        this.f63083 = c12951.readInt();
        this.f63086 = c12951.readInt();
        this.f63084 = c12951.readInt();
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ۧ */
    public final void mo15481(int i, boolean z) {
        if (z) {
            mo15486(i);
        } else {
            mo15482(i);
        }
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ᩳ */
    public final int mo15487() {
        return this.f63085;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15488(int i, boolean z) {
        if (z) {
            mo15484(i);
        } else {
            mo15480(i);
        }
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ֫ */
    public final int mo15477() {
        return this.f63083;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܿ */
    public final int mo15485() {
        return this.f63086;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ᩻ */
    public final int mo15489() {
        return this.f63084;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܿ */
    public final void mo15486(int i) {
        this.f63085 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܽ */
    public final void mo15484(int i) {
        this.f63083 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ܳ */
    public final void mo15482(int i) {
        this.f63086 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ۧ */
    public final void mo15480(int i) {
        this.f63084 = i;
    }

    @Override // l.InterfaceC18813
    /* JADX INFO: renamed from: ֫ */
    public final void mo15479(C10130 c10130) {
        c10130.writeInt(this.f63085);
        c10130.writeInt(this.f63083);
        c10130.writeInt(this.f63086);
        c10130.writeInt(this.f63084);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffFragmentImpl [");
        sb.append(this.f63085);
        sb.append(", ");
        sb.append(this.f63083);
        sb.append(") - [");
        sb.append(this.f63086);
        sb.append(", ");
        return C3200.m9831(this.f63084, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
