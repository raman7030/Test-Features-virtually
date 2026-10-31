package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes2.dex */
public final class C1740 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6015;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f6016;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f6017;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740(C14439 c14439, AbstractC4308 abstractC4308, int i) {
        super(c14439, C1365.m4782(abstractC4308));
        this.f6017 = c14439;
        C12171.m29642(i >= 0);
        this.f6016 = abstractC4308;
        this.f6015 = i;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC7715 mo5817() {
        int i = this.f23845;
        C14439 c14439 = this.f6017;
        int i2 = this.f6015;
        if (i2 <= 3) {
            c14439.f44254.m4824((C1365.m4795(i) * 4) + 26 + i2);
        } else {
            c14439.f44254.m4802(C1365.m4795(i) + 21, i2);
        }
        return c14439.f44255[i];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo5815() {
        int i = this.f23845;
        C14439 c14439 = this.f6017;
        int i2 = this.f6015;
        if (i2 <= 3) {
            c14439.f44254.m4824((C1365.m4795(i) * 4) + 59 + i2);
        } else {
            c14439.f44254.m4802(C1365.m4795(i) + 54, i2);
        }
        c14439.f44254.m4835(i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5816(int i) {
        C14439 c14439 = this.f6017;
        int i2 = this.f23845;
        if (i2 == 0 && i >= -32768 && i <= 32767) {
            c14439.f44254.m4818(this.f6015, i);
            return;
        }
        mo5817();
        if (i >= 0) {
            new C23237(c14439, c14439.f44259.f66452, Integer.valueOf(i)).mo5817();
            c14439.f44254.m4824(96);
        } else {
            new C23237(c14439, c14439.f44259.f66452, Integer.valueOf(-i)).mo5817();
            c14439.f44254.m4824(100);
        }
        c14439.m34468(c14439.f44259.f66452).mo20665(i2);
        mo5815();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("localItem(type=");
        sb.append(this.f6016);
        sb.append("; reg=");
        return C3200.m9831(this.f6015, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
