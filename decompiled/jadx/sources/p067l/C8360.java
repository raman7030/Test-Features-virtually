package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8360 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܳ */
    public AbstractC7257 f22360;

    /* JADX INFO: renamed from: ܽ */
    public C11714 f22361;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C16091 f22362;

    /* JADX INFO: renamed from: ᩳ */
    public int f22363;

    /* JADX INFO: renamed from: ᩻ */
    public C11714 f22364;

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܿ */
    public final C8360 mo19303() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8360(C16091 c16091, int i, C11714 c11714, C11714 c11715) {
        super(c16091, 5);
        this.f22362 = c16091;
        this.f22363 = i;
        this.f22364 = c11714;
        this.f22361 = c11715;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        C11714 c11714M7038;
        C11714 c11714M19304 = m19304();
        boolean zM19299 = m19299();
        C16091 c16091 = this.f22362;
        if (zM19299) {
            c11714M7038 = null;
        } else {
            c16091.f47348.m7049(this.f22364);
            c16091.f47348.m7062(4);
            c11714M7038 = c16091.f47348.m7038(167);
        }
        if (c11714M19304 != null) {
            c16091.f47348.m7049(c11714M19304);
            c16091.f47348.m7062(3);
        }
        c16091.f47348.m7049(c11714M7038);
        return c16091.f47349[this.f26759];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19301() {
        mo8027().mo19301();
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ֫ */
    public final void mo19298() {
        mo8027().mo19298();
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19302(int i) {
        C1446.m31698();
        throw null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C11714 m19300() {
        AbstractC7257 abstractC7257 = this.f22360;
        int i = this.f22363;
        C11714 c11714 = this.f22364;
        C16091 c16091 = this.f22362;
        if (abstractC7257 == null) {
            return C3666.m7021(c11714, c16091.f47348.m7038(i));
        }
        int iM7054 = c16091.f47348.m7054();
        C11714 c11714M7021 = C3666.m7021(c11714, c16091.f47348.m7038(i));
        C3666 c3666 = c16091.f47348;
        c3666.f7758.m30040(this.f22360, 128, iM7054, c3666.m7054());
        return c11714M7021;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C11714 m19304() {
        AbstractC7257 abstractC7257 = this.f22360;
        int i = this.f22363;
        C11714 c11714 = this.f22361;
        C16091 c16091 = this.f22362;
        if (abstractC7257 == null) {
            return C3666.m7021(c11714, c16091.f47348.m7038(C3666.m7025(i)));
        }
        int iM7054 = c16091.f47348.m7054();
        C11714 c11714M7021 = C3666.m7021(c11714, c16091.f47348.m7038(C3666.m7025(i)));
        C3666 c3666 = c16091.f47348;
        c3666.f7758.m30040(this.f22360, 256, iM7054, c3666.m7054());
        return c11714M7021;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19305() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m19299() {
        return this.f22364 == null && this.f22363 == 168;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("cond(");
        int i = C3666.f7732;
        return C10965.m25286(sb, C5008.f11448[this.f22363], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
