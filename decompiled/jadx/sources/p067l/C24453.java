package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes.dex */
public final class C24453 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C16091 f77408;

    /* JADX INFO: renamed from: ᩳ */
    public final C3351 f77409;

    /* JADX WARN: Illegal instructions before constructor call */
    public C24453(C16091 c16091, AbstractC6462 abstractC6462, Object obj) {
        this.f77408 = c16091;
        int iM7020 = C3666.m7020(abstractC6462);
        super(c16091, iM7020);
        switch (iM7020) {
            case 0:
            case 5:
            case 6:
            case 7:
                Integer num = (Integer) obj;
                num.getClass();
                this.f77409 = new C3351(3, num);
                return;
            case 1:
                Long l2 = (Long) obj;
                l2.getClass();
                this.f77409 = new C3351(5, l2);
                return;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                this.f77409 = new C3351(4, f);
                return;
            case 3:
                Double d = (Double) obj;
                d.getClass();
                this.f77409 = new C3351(6, d);
                return;
            case 4:
                this.f77409 = C7375.m17097((String) obj);
                return;
            default:
                throw new UnsupportedOperationException(C20778.m46922(iM7020, "unsupported tag: "));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m53958() {
        C3351 c3351 = this.f77409;
        C16091 c16091 = this.f77408;
        int i = this.f26759;
        if (i == 1 || i == 3) {
            C3666 c3666 = c16091.f47348;
            c3666.m7043(20, c3666.f7740.m31951((InterfaceC10057) c3351), (InterfaceC22798) c3351);
        } else {
            c16091.f47348.m7047(c3351);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private Number m53959() {
        return (Number) this.f77409.f6551;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        C16091 c16091 = this.f77408;
        int i = this.f26759;
        switch (i) {
            case 0:
            case 5:
            case 6:
            case 7:
                int iIntValue = m53959().intValue();
                if (-1 <= iIntValue && iIntValue <= 5) {
                    c16091.f47348.m7062(iIntValue + 3);
                } else if (-128 <= iIntValue && iIntValue <= 127) {
                    c16091.f47348.m7042(16, iIntValue, (InterfaceC10057) null);
                } else if (-32768 > iIntValue || iIntValue > 32767) {
                    m53958();
                } else {
                    c16091.f47348.m7043(17, iIntValue, (InterfaceC22798) null);
                }
                break;
            case 1:
                long jLongValue = m53959().longValue();
                if (jLongValue == 0 || jLongValue == 1) {
                    c16091.f47348.m7062(((int) jLongValue) + 9);
                } else {
                    m53958();
                }
                break;
            case 2:
                float fFloatValue = m53959().floatValue();
                if (fFloatValue == 0.0f && 1.0f / fFloatValue > 0.0f) {
                    c16091.f47348.m7062(((int) fFloatValue) + 11);
                } else {
                    double d = fFloatValue;
                    if (d == 1.0d || d == 2.0d) {
                        c16091.f47348.m7062(((int) fFloatValue) + 11);
                    } else {
                        m53958();
                    }
                }
                break;
            case 3:
                double dDoubleValue = m53959().doubleValue();
                if ((dDoubleValue == 0.0d && 1.0d / dDoubleValue > 0.0d) || dDoubleValue == 1.0d) {
                    c16091.f47348.m7062(((int) dDoubleValue) + 14);
                } else {
                    m53958();
                }
                break;
            case 4:
                m53958();
                break;
            default:
                C1446.m31698();
                throw null;
        }
        return c16091.f47349[i];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܿ */
    public final C8360 mo19303() {
        return this.f77408.m36600(m53959().intValue() != 0 ? 167 : 168);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 mo22645(int i) {
        int i2 = this.f26759;
        if (i2 != i) {
            C16091 c16091 = this.f77408;
            if (i != 0) {
                if (i == 1) {
                    return new C24453(c16091, c16091.f47353.f69152, Long.valueOf(m53959().longValue()));
                }
                if (i == 2) {
                    return new C24453(c16091, c16091.f47353.f69165, Float.valueOf(m53959().floatValue()));
                }
                if (i == 3) {
                    return new C24453(c16091, c16091.f47353.f69181, Double.valueOf(m53959().doubleValue()));
                }
                if (i == 5) {
                    return new C24453(c16091, c16091.f47353.f69184, Integer.valueOf((byte) m53959().intValue()));
                }
                if (i == 6) {
                    return new C24453(c16091, c16091.f47353.f69136, Integer.valueOf((char) m53959().intValue()));
                }
                if (i == 7) {
                    return new C24453(c16091, c16091.f47353.f69195, Integer.valueOf((short) m53959().intValue()));
                }
                return super.mo22645(i);
            }
            if (C3666.m7033(i2) != 0) {
                return new C24453(c16091, c16091.f47353.f69134, Integer.valueOf(m53959().intValue()));
            }
        }
        return this;
    }

    public final String toString() {
        return "immediate(" + this.f77409 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
