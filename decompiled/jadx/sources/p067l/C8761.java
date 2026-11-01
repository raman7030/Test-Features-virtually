package p067l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۜۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8761 implements InterfaceC16136 {

    /* JADX INFO: renamed from: ֫ */
    public final C7164 f23755;

    /* JADX INFO: renamed from: ۧ */
    public final C18819 f23756;

    /* JADX INFO: renamed from: ܽ */
    public final C24854 f23757;

    public C8761(C7164 c7164, C24854 c24854, C18819 c18819) {
        this.f23755 = c7164;
        this.f23757 = c24854;
        this.f23756 = c18819;
        if (c7164.m16474() == 0 && c7164.m16470() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c7164.m16471() != 0 && c7164.m16472() != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // p067l.InterfaceC13200
    /* JADX INFO: renamed from: ֫ */
    public final Rect mo20251() {
        return this.f23755.m16473();
    }

    @Override // p067l.InterfaceC16136
    /* JADX INFO: renamed from: ܽ */
    public final C19490 mo20253() {
        C7164 c7164 = this.f23755;
        if (c7164.m16474() > c7164.m16470()) {
            return C19490.f59380;
        }
        return C19490.f59381;
    }

    public final String toString() {
        return "HardwareFoldingFeature { " + this.f23755 + ", type=" + this.f23757 + ", state=" + this.f23756 + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8761.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C8761 c8761 = (C8761) obj;
            return C13045.m29864(this.f23755, c8761.f23755) && C13045.m29864(this.f23757, c8761.f23757) && C13045.m29864(this.f23756, c8761.f23756);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    public final int hashCode() {
        return this.f23756.hashCode() + ((this.f23757.hashCode() + (this.f23755.hashCode() * 31)) * 31);
    }

    @Override // p067l.InterfaceC16136
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo20252() {
        C24854 c24854 = C24854.f79397;
        C24854 c24855 = this.f23757;
        if (C13045.m29864(c24855, c24854)) {
            return true;
        }
        return C13045.m29864(c24855, C24854.f79396) && C13045.m29864(this.f23756, C18819.f56199);
    }
}
