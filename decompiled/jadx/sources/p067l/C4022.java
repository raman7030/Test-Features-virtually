package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4022 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public int f8792;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC6462 f8793;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16091 f8794;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022(C16091 c16091, AbstractC6462 abstractC6462, int i) {
        super(c16091, C3666.m7020(abstractC6462));
        this.f8794 = c16091;
        C1446.m31704(i >= 0);
        this.f8793 = abstractC6462;
        this.f8792 = i;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        int i = this.f26759;
        C16091 c16091 = this.f8794;
        int i2 = this.f8792;
        if (i2 <= 3) {
            c16091.f47348.m7062((C3666.m7033(i) * 4) + 26 + i2);
        } else {
            c16091.f47348.m7040(C3666.m7033(i) + 21, i2);
        }
        return c16091.f47349[i];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܳ */
    public final void mo8025() {
        int i = this.f26759;
        C16091 c16091 = this.f8794;
        int i2 = this.f8792;
        if (i2 <= 3) {
            c16091.f47348.m7062((C3666.m7033(i) * 4) + 59 + i2);
        } else {
            c16091.f47348.m7040(C3666.m7033(i) + 54, i2);
        }
        c16091.f47348.m7073(i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8026(int i) {
        C16091 c16091 = this.f8794;
        int i2 = this.f26759;
        if (i2 == 0 && i >= -32768 && i <= 32767) {
            c16091.f47348.m7056(this.f8792, i);
            return;
        }
        mo8027();
        if (i >= 0) {
            new C24453(c16091, c16091.f47353.f69134, Integer.valueOf(i)).mo8027();
            c16091.f47348.m7062(96);
        } else {
            new C24453(c16091, c16091.f47353.f69134, Integer.valueOf(-i)).mo8027();
            c16091.f47348.m7062(100);
        }
        c16091.m36601(c16091.f47353.f69134).mo22645(i2);
        mo8025();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("localItem(type=");
        sb.append(this.f8793);
        sb.append("; reg=");
        return C5410.m11876(this.f8792, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
