package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public class C17262 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f52913;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f52914;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17262(C14439 c14439, AbstractC5698 abstractC5698) {
        super(c14439, C1365.m4782(abstractC5698.mo16091(c14439.f44256)));
        this.f52914 = c14439;
        this.f52913 = abstractC5698;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public AbstractC7715 mo5817() {
        C14439 c14439 = this.f52914;
        C1365 c1365 = c14439.f44254;
        C13028 c13028 = c1365.f4968.f36883;
        AbstractC5698 abstractC5698 = this.f52913;
        c1365.m4805(178, C13028.m31613(c13028, abstractC5698), abstractC5698);
        return c14439.f44255[this.f23845];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܳ */
    public void mo5815() {
        C1365 c1365 = this.f52914.f44254;
        C13028 c13028 = c1365.f4968.f36883;
        AbstractC5698 abstractC5698 = this.f52913;
        c1365.m4805(179, C13028.m31613(c13028, abstractC5698), abstractC5698);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܽ */
    public AbstractC7715 mo20666() {
        C14439 c14439 = this.f52914;
        C6319 c6319 = c14439.f44256;
        AbstractC5698 abstractC5698 = this.f52913;
        C10658 c10658 = (C10658) abstractC5698.mo16091(c6319);
        int iM4782 = C1365.m4782(c10658.f32060);
        c14439.f44254.m4826(abstractC5698, c10658);
        return c14439.f44255[iM4782];
    }

    public String toString() {
        return "static(" + this.f52913 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
