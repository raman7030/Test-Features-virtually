package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes.dex */
public final class C23237 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f74665;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1034 f74666;

    /* JADX WARN: Illegal instructions before constructor call */
    public C23237(C14439 c14439, AbstractC4308 abstractC4308, Object obj) {
        this.f74665 = c14439;
        int iM4782 = C1365.m4782(abstractC4308);
        super(c14439, iM4782);
        switch (iM4782) {
            case 0:
            case 5:
            case 6:
            case 7:
                Integer num = (Integer) obj;
                num.getClass();
                this.f74666 = new C1034(3, num);
                return;
            case 1:
                Long l2 = (Long) obj;
                l2.getClass();
                this.f74666 = new C1034(5, l2);
                return;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                this.f74666 = new C1034(4, f);
                return;
            case 3:
                Double d = (Double) obj;
                d.getClass();
                this.f74666 = new C1034(6, d);
                return;
            case 4:
                this.f74666 = C5268.m15194((String) obj);
                return;
            default:
                throw new UnsupportedOperationException(C19370.m44628(iM4782, "unsupported tag: "));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m51561() {
        C1034 c1034 = this.f74666;
        C14439 c14439 = this.f74665;
        int i = this.f23845;
        if (i == 1 || i == 3) {
            C1365 c1365 = c14439.f44254;
            c1365.m4805(20, c1365.f4968.m29891((InterfaceC8090) c1034), (InterfaceC21496) c1034);
        } else {
            c14439.f44254.m4809(c1034);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Number m51562() {
        return (Number) this.f74666.f3779;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        C14439 c14439 = this.f74665;
        int i = this.f23845;
        switch (i) {
            case 0:
            case 5:
            case 6:
            case 7:
                int iIntValue = m51562().intValue();
                if (-1 <= iIntValue && iIntValue <= 5) {
                    c14439.f44254.m4824(iIntValue + 3);
                } else if (-128 <= iIntValue && iIntValue <= 127) {
                    c14439.f44254.m4804(16, iIntValue, (InterfaceC8090) null);
                } else if (-32768 > iIntValue || iIntValue > 32767) {
                    m51561();
                } else {
                    c14439.f44254.m4805(17, iIntValue, (InterfaceC21496) null);
                }
                break;
            case 1:
                long jLongValue = m51562().longValue();
                if (jLongValue == 0 || jLongValue == 1) {
                    c14439.f44254.m4824(((int) jLongValue) + 9);
                } else {
                    m51561();
                }
                break;
            case 2:
                float fFloatValue = m51562().floatValue();
                if (fFloatValue == 0.0f && 1.0f / fFloatValue > 0.0f) {
                    c14439.f44254.m4824(((int) fFloatValue) + 11);
                } else {
                    double d = fFloatValue;
                    if (d == 1.0d || d == 2.0d) {
                        c14439.f44254.m4824(((int) fFloatValue) + 11);
                    } else {
                        m51561();
                    }
                }
                break;
            case 3:
                double dDoubleValue = m51562().doubleValue();
                if ((dDoubleValue == 0.0d && 1.0d / dDoubleValue > 0.0d) || dDoubleValue == 1.0d) {
                    c14439.f44254.m4824(((int) dDoubleValue) + 14);
                } else {
                    m51561();
                }
                break;
            case 4:
                m51561();
                break;
            default:
                C12171.m29636();
                throw null;
        }
        return c14439.f44255[i];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܿ */
    public final C6304 mo17363() {
        return this.f74665.m34467(m51562().intValue() != 0 ? 167 : 168);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7715 mo20665(int i) {
        int i2 = this.f23845;
        if (i2 != i) {
            C14439 c14439 = this.f74665;
            if (i != 0) {
                if (i == 1) {
                    return new C23237(c14439, c14439.f44259.f66470, Long.valueOf(m51562().longValue()));
                }
                if (i == 2) {
                    return new C23237(c14439, c14439.f44259.f66483, Float.valueOf(m51562().floatValue()));
                }
                if (i == 3) {
                    return new C23237(c14439, c14439.f44259.f66499, Double.valueOf(m51562().doubleValue()));
                }
                if (i == 5) {
                    return new C23237(c14439, c14439.f44259.f66502, Integer.valueOf((byte) m51562().intValue()));
                }
                if (i == 6) {
                    return new C23237(c14439, c14439.f44259.f66454, Integer.valueOf((char) m51562().intValue()));
                }
                if (i == 7) {
                    return new C23237(c14439, c14439.f44259.f66513, Integer.valueOf((short) m51562().intValue()));
                }
                return super.mo20665(i);
            }
            if (C1365.m4795(i2) != 0) {
                return new C23237(c14439, c14439.f44259.f66452, Integer.valueOf(m51562().intValue()));
            }
        }
        return this;
    }

    public final String toString() {
        return "immediate(" + this.f74666 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
