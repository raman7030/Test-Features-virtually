package p067l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۨ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5DU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13731 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f38730 = true;

    /* JADX INFO: renamed from: ۧ */
    public Object f38731;

    /* JADX INFO: renamed from: ܽ */
    public EnumC8366 f38732;

    /* JADX INFO: renamed from: ᩴ */
    public final void m31252() {
        this.f38731 = null;
        this.f38732 = null;
    }

    public final String toString() {
        return this.f38731.toString();
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m31220() {
        return this.f38731 == null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m31251(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367;
        EnumC8366 enumC8368 = this.f38732;
        EnumC8366 enumC8369 = EnumC8366.STRING;
        if (enumC8368 == enumC8369 || (enumC8366 = c13731.f38732) == enumC8369 || enumC8368 == (enumC8367 = EnumC8366.OBJECT) || enumC8366 == enumC8367) {
            c13732.m31214(this.f38731.equals(c13731.f38731));
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.BOOLEAN;
        if (enumC8368 == enumC83610 && enumC8366 == enumC83610) {
            c13732.m31214(m31245() == c13731.m31245());
        } else {
            c13732.m31214(m31197() == c13731.m31197());
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m31231(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367;
        EnumC8366 enumC8368 = this.f38732;
        EnumC8366 enumC8369 = EnumC8366.STRING;
        if (enumC8368 == enumC8369 || (enumC8366 = c13731.f38732) == enumC8369 || enumC8368 == (enumC8367 = EnumC8366.OBJECT) || enumC8366 == enumC8367) {
            c13732.m31214(!this.f38731.equals(c13731.f38731));
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.BOOLEAN;
        if (enumC8368 == enumC83610 && enumC8366 == enumC83610) {
            c13732.m31214(m31245() != c13731.m31245());
        } else {
            c13732.m31214(m31197() != c13731.m31197());
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m31238(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.STRING;
        if (enumC8366 == enumC8367 && c13731.f38732 == enumC8367) {
            c13732.m31214(((String) this.f38731).compareTo((String) c13731.f38731) > 0);
        } else {
            c13732.m31214(m31197() > c13731.m31197());
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m31224(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.STRING;
        if (enumC8366 == enumC8367 && c13731.f38732 == enumC8367) {
            c13732.m31214(((String) this.f38731).compareTo((String) c13731.f38731) < 0);
        } else {
            c13732.m31214(m31197() < c13731.m31197());
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m31248(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.STRING;
        if (enumC8366 == enumC8367 && c13731.f38732 == enumC8367) {
            c13732.m31214(((String) this.f38731).compareTo((String) c13731.f38731) >= 0);
        } else {
            c13732.m31214(m31197() >= c13731.m31197());
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m31262(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.STRING;
        if (enumC8366 == enumC8367 && c13731.f38732 == enumC8367) {
            c13732.m31214(((String) this.f38731).compareTo((String) c13731.f38731) <= 0);
        } else {
            c13732.m31214(m31197() <= c13731.m31197());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31212(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367 = this.f38732;
        EnumC8366 enumC8368 = EnumC8366.STRING;
        if (enumC8367 == enumC8368 || (enumC8366 = c13731.f38732) == enumC8368) {
            c13732.m31209(this.f38731.toString() + c13731.f38731.toString());
            return;
        }
        EnumC8366 enumC8369 = EnumC8366.DOUBLE;
        if (enumC8367 == enumC8369 || enumC8366 == enumC8369) {
            c13732.m31204(m31197() + c13731.m31197());
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.FLOAT;
        if (enumC8367 == enumC83610 || enumC8366 == enumC83610) {
            c13732.m31205(m31193() + c13731.m31193());
            return;
        }
        EnumC8366 enumC83611 = EnumC8366.LONG;
        if (enumC8367 == enumC83611 || enumC8366 == enumC83611) {
            c13732.m31207(m31194() + c13731.m31194());
        } else {
            c13732.m31206(m31195() + c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31210(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 9) {
            this.f38731 = this.f38731.toString() + c13731.f38731.toString();
            return;
        }
        switch (iOrdinal) {
            case 0:
                this.f38731 = Byte.valueOf((byte) (c13731.m31196().byteValue() + m31249()));
                break;
            case 1:
                this.f38731 = Character.valueOf((char) (c13731.m31196().intValue() + m31246()));
                break;
            case 2:
                this.f38731 = Short.valueOf((short) (c13731.m31196().shortValue() + m31226()));
                break;
            case 3:
                this.f38731 = Integer.valueOf(c13731.m31196().intValue() + m31222());
                break;
            case 4:
                this.f38731 = Long.valueOf(c13731.m31196().longValue() + m31257());
                break;
            case 5:
                this.f38731 = Float.valueOf(c13731.m31196().floatValue() + m31260());
                break;
            case 6:
                this.f38731 = Double.valueOf(c13731.m31196().doubleValue() + m31236());
                break;
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m31256(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367 = this.f38732;
        EnumC8366 enumC8368 = EnumC8366.DOUBLE;
        if (enumC8367 == enumC8368 || (enumC8366 = c13731.f38732) == enumC8368) {
            c13732.m31204(m31197() - c13731.m31197());
            return;
        }
        EnumC8366 enumC8369 = EnumC8366.FLOAT;
        if (enumC8367 == enumC8369 || enumC8366 == enumC8369) {
            c13732.m31205(m31193() - c13731.m31193());
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.LONG;
        if (enumC8367 == enumC83610 || enumC8366 == enumC83610) {
            c13732.m31207(m31194() - c13731.m31194());
        } else {
            c13732.m31206(m31195() - c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m31225(C13731 c13731) {
        switch (this.f38732) {
            case BYTE:
                this.f38731 = Byte.valueOf((byte) (m31249() - c13731.m31196().byteValue()));
                break;
            case CHAR:
                this.f38731 = Character.valueOf((char) (m31246() - c13731.m31196().intValue()));
                break;
            case SHORT:
                this.f38731 = Short.valueOf((short) (m31226() - c13731.m31196().shortValue()));
                break;
            case INT:
                this.f38731 = Integer.valueOf(m31222() - c13731.m31196().intValue());
                break;
            case LONG:
                this.f38731 = Long.valueOf(m31257() - c13731.m31196().longValue());
                break;
            case FLOAT:
                this.f38731 = Float.valueOf(m31260() - c13731.m31196().floatValue());
                break;
            case DOUBLE:
                this.f38731 = Double.valueOf(m31236() - c13731.m31196().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31244(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367 = this.f38732;
        EnumC8366 enumC8368 = EnumC8366.DOUBLE;
        if (enumC8367 == enumC8368 || (enumC8366 = c13731.f38732) == enumC8368) {
            c13732.m31204(m31197() / c13731.m31197());
            return;
        }
        EnumC8366 enumC8369 = EnumC8366.FLOAT;
        if (enumC8367 == enumC8369 || enumC8366 == enumC8369) {
            c13732.m31205(m31193() / c13731.m31193());
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.LONG;
        if (enumC8367 == enumC83610 || enumC8366 == enumC83610) {
            c13732.m31207(m31194() / c13731.m31194());
        } else {
            c13732.m31206(m31195() / c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m31227(C13731 c13731) {
        switch (this.f38732) {
            case BYTE:
                this.f38731 = Byte.valueOf((byte) (m31249() / c13731.m31196().byteValue()));
                break;
            case CHAR:
                this.f38731 = Character.valueOf((char) (m31246() / c13731.m31196().intValue()));
                break;
            case SHORT:
                this.f38731 = Short.valueOf((short) (m31226() / c13731.m31196().shortValue()));
                break;
            case INT:
                this.f38731 = Integer.valueOf(m31222() / c13731.m31196().intValue());
                break;
            case LONG:
                this.f38731 = Long.valueOf(m31257() / c13731.m31196().longValue());
                break;
            case FLOAT:
                this.f38731 = Float.valueOf(m31260() / c13731.m31196().floatValue());
                break;
            case DOUBLE:
                this.f38731 = Double.valueOf(m31236() / c13731.m31196().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m31259(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367 = this.f38732;
        EnumC8366 enumC8368 = EnumC8366.DOUBLE;
        if (enumC8367 == enumC8368 || (enumC8366 = c13731.f38732) == enumC8368) {
            c13732.m31204(m31197() * c13731.m31197());
            return;
        }
        EnumC8366 enumC8369 = EnumC8366.FLOAT;
        if (enumC8367 == enumC8369 || enumC8366 == enumC8369) {
            c13732.m31205(m31193() * c13731.m31193());
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.LONG;
        if (enumC8367 == enumC83610 || enumC8366 == enumC83610) {
            c13732.m31207(m31194() * c13731.m31194());
        } else {
            c13732.m31206(m31195() * c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m31241(C13731 c13731) {
        switch (this.f38732) {
            case BYTE:
                this.f38731 = Byte.valueOf((byte) (c13731.m31196().byteValue() * m31249()));
                break;
            case CHAR:
                this.f38731 = Character.valueOf((char) (c13731.m31196().intValue() * m31246()));
                break;
            case SHORT:
                this.f38731 = Short.valueOf((short) (c13731.m31196().shortValue() * m31226()));
                break;
            case INT:
                this.f38731 = Integer.valueOf(c13731.m31196().intValue() * m31222());
                break;
            case LONG:
                this.f38731 = Long.valueOf(c13731.m31196().longValue() * m31257());
                break;
            case FLOAT:
                this.f38731 = Float.valueOf(c13731.m31196().floatValue() * m31260());
                break;
            case DOUBLE:
                this.f38731 = Double.valueOf(c13731.m31196().doubleValue() * m31236());
                break;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m31242(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366;
        EnumC8366 enumC8367 = this.f38732;
        EnumC8366 enumC8368 = EnumC8366.DOUBLE;
        if (enumC8367 == enumC8368 || (enumC8366 = c13731.f38732) == enumC8368) {
            c13732.m31204(m31197() % c13731.m31197());
            return;
        }
        EnumC8366 enumC8369 = EnumC8366.FLOAT;
        if (enumC8367 == enumC8369 || enumC8366 == enumC8369) {
            c13732.m31205(m31193() % c13731.m31193());
            return;
        }
        EnumC8366 enumC83610 = EnumC8366.LONG;
        if (enumC8367 == enumC83610 || enumC8366 == enumC83610) {
            c13732.m31207(m31194() % c13731.m31194());
        } else {
            c13732.m31206(m31195() % c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m31255(C13731 c13731) {
        switch (this.f38732) {
            case BYTE:
                this.f38731 = Byte.valueOf((byte) (m31249() % c13731.m31196().byteValue()));
                break;
            case CHAR:
                this.f38731 = Character.valueOf((char) (m31246() % c13731.m31196().intValue()));
                break;
            case SHORT:
                this.f38731 = Short.valueOf((short) (m31226() % c13731.m31196().shortValue()));
                break;
            case INT:
                this.f38731 = Integer.valueOf(m31222() % c13731.m31196().intValue());
                break;
            case LONG:
                this.f38731 = Long.valueOf(m31257() % c13731.m31196().longValue());
                break;
            case FLOAT:
                this.f38731 = Float.valueOf(m31260() % c13731.m31196().floatValue());
                break;
            case DOUBLE:
                this.f38731 = Double.valueOf(m31236() % c13731.m31196().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31235(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.LONG;
        if (enumC8366 == enumC8367 || c13731.f38732 == enumC8367) {
            c13732.m31207(m31194() & c13731.m31194());
        } else {
            c13732.m31206(c13731.m31195() & m31195());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31233(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (c13731.m31196().byteValue() & m31249()));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (c13731.m31196().shortValue() & m31226()));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(c13731.m31196().intValue() & m31222());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f38731 = Long.valueOf(m31257() & c13731.m31196().longValue());
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m31228(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.LONG;
        if (enumC8366 == enumC8367 || c13731.f38732 == enumC8367) {
            c13732.m31207(m31194() | c13731.m31194());
        } else {
            c13732.m31206(c13731.m31195() | m31195());
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m31253(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (c13731.m31196().byteValue() | m31249()));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (c13731.m31196().shortValue() | m31226()));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(c13731.m31196().intValue() | m31222());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f38731 = Long.valueOf(m31257() | c13731.m31196().longValue());
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m31199(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.LONG;
        if (enumC8366 == enumC8367 || c13731.f38732 == enumC8367) {
            c13732.m31207(m31194() ^ c13731.m31194());
        } else {
            c13732.m31206(c13731.m31195() ^ m31195());
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m31239(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (c13731.m31196().byteValue() ^ m31249()));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (c13731.m31196().shortValue() ^ m31226()));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(c13731.m31196().intValue() ^ m31222());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f38731 = Long.valueOf(m31257() ^ c13731.m31196().longValue());
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m31217(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.LONG;
        if (enumC8366 == enumC8367 || c13731.f38732 == enumC8367) {
            c13732.m31207(m31194() << ((int) c13731.m31194()));
        } else {
            c13732.m31206(m31195() << c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m31198(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (m31249() << c13731.m31196().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (m31226() << c13731.m31196().byteValue()));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(m31222() << c13731.m31196().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f38731 = Long.valueOf(m31257() << c13731.m31196().byteValue());
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m31219(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.LONG;
        if (enumC8366 == enumC8367 || c13731.f38732 == enumC8367) {
            c13732.m31207(m31194() >> ((int) c13731.m31194()));
        } else {
            c13732.m31206(m31195() >> c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m31221(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (m31249() >> c13731.m31196().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (m31226() >> c13731.m31196().byteValue()));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(m31222() >> c13731.m31196().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f38731 = Long.valueOf(m31257() >> c13731.m31196().byteValue());
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m31254(C13731 c13731, C13731 c13732) {
        EnumC8366 enumC8366 = this.f38732;
        EnumC8366 enumC8367 = EnumC8366.LONG;
        if (enumC8366 == enumC8367 || c13731.f38732 == enumC8367) {
            c13732.m31207(m31194() >>> ((int) c13731.m31194()));
        } else {
            c13732.m31206(m31195() >>> c13731.m31195());
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m31200(C13731 c13731) {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (m31249() >>> c13731.m31196().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (m31226() >>> c13731.m31196().byteValue()));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(m31222() >>> c13731.m31196().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f38731 = Long.valueOf(m31257() >>> c13731.m31196().byteValue());
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m31218(C13731 c13731) {
        if (this.f38732 == EnumC8366.LONG) {
            c13731.m31207(~m31194());
        } else {
            c13731.m31206(~m31195());
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m31216(C13731 c13731) {
        if (this.f38732 == EnumC8366.BOOLEAN) {
            c13731.m31214(!m31245());
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31234(C13731 c13731, int i) {
        Object obj = this.f38731;
        if (obj instanceof int[]) {
            Array.setInt(obj, i, c13731.m31222());
            return;
        }
        if (obj instanceof byte[]) {
            Array.setByte(obj, i, c13731.m31249());
            return;
        }
        if (obj instanceof String[]) {
            Array.set(obj, i, c13731.m31240());
            return;
        }
        if (obj instanceof char[]) {
            Array.setChar(obj, i, c13731.m31246());
            return;
        }
        if (obj instanceof boolean[]) {
            Array.setBoolean(obj, i, c13731.m31245());
            return;
        }
        if (obj instanceof short[]) {
            Array.setShort(obj, i, c13731.m31226());
            return;
        }
        if (obj instanceof float[]) {
            Array.setFloat(obj, i, c13731.m31260());
        } else if (obj instanceof double[]) {
            Array.setDouble(obj, i, c13731.m31236());
        } else {
            Array.set(obj, i, c13731.f38731);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31232() {
        return Array.getLength(this.f38731);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31211(C13731 c13731, int i) {
        Object obj = this.f38731;
        if (obj instanceof int[]) {
            c13731.m31206(Array.getInt(obj, i));
            return;
        }
        if (obj instanceof byte[]) {
            c13731.m31202(Array.getByte(obj, i));
            return;
        }
        if (obj instanceof String[]) {
            c13731.m31209((String) Array.get(obj, i));
            return;
        }
        if (obj instanceof long[]) {
            c13731.m31207(Array.getLong(obj, i));
            return;
        }
        if (obj instanceof char[]) {
            c13731.m31203(Array.getChar(obj, i));
            return;
        }
        if (obj instanceof boolean[]) {
            c13731.m31214(Array.getBoolean(obj, i));
            return;
        }
        if (obj instanceof short[]) {
            c13731.m31213(Array.getShort(obj, i));
            return;
        }
        if (obj instanceof float[]) {
            c13731.m31205(Array.getFloat(obj, i));
        } else if (obj instanceof double[]) {
            c13731.m31204(Array.getDouble(obj, i));
        } else {
            c13731.m31208(Array.get(obj, i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31209(String str) {
        this.f38732 = EnumC8366.STRING;
        this.f38731 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31213(short s) {
        this.f38732 = EnumC8366.SHORT;
        this.f38731 = Short.valueOf(s);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31206(int i) {
        this.f38732 = EnumC8366.INT;
        this.f38731 = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31207(long j) {
        this.f38732 = EnumC8366.LONG;
        this.f38731 = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31214(boolean z) {
        this.f38732 = EnumC8366.BOOLEAN;
        this.f38731 = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31202(byte b) {
        this.f38732 = EnumC8366.BYTE;
        this.f38731 = Byte.valueOf(b);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31203(char c) {
        this.f38732 = EnumC8366.CHAR;
        this.f38731 = Character.valueOf(c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31205(float f) {
        this.f38732 = EnumC8366.FLOAT;
        this.f38731 = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31204(double d) {
        this.f38732 = EnumC8366.DOUBLE;
        this.f38731 = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31208(Object obj) {
        this.f38732 = EnumC8366.OBJECT;
        this.f38731 = obj;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m31240() {
        Object obj = this.f38731;
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۡ */
    public final short m31226() {
        Object obj = this.f38731;
        if (obj == null) {
            return (short) 0;
        }
        return ((Short) obj).shortValue();
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m31222() {
        Object obj = this.f38731;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m31257() {
        Object obj = this.f38731;
        if (obj == null) {
            return 0L;
        }
        return ((Long) obj).longValue();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final float m31260() {
        Object obj = this.f38731;
        if (obj == null) {
            return 0.0f;
        }
        return ((Float) obj).floatValue();
    }

    /* JADX INFO: renamed from: ܳ */
    public final double m31236() {
        Object obj = this.f38731;
        if (obj == null) {
            return 0.0d;
        }
        return ((Double) obj).doubleValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m31245() {
        Object obj = this.f38731;
        return obj != null && ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte m31249() {
        Object obj = this.f38731;
        if (obj == null) {
            return (byte) 0;
        }
        return ((Byte) obj).byteValue();
    }

    /* JADX INFO: renamed from: ܿ */
    public final char m31246() {
        Object obj = this.f38731;
        if (obj == null) {
            return (char) 0;
        }
        return ((Character) obj).charValue();
    }

    /* JADX INFO: renamed from: ۢ */
    public final Object m31229() {
        return this.f38731;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m31215() {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (((Byte) this.f38731).byteValue() + 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f38731 = Character.valueOf((char) (((Character) this.f38731).charValue() + 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (((Short) this.f38731).shortValue() + 1));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(((Integer) this.f38731).intValue() + 1);
        } else {
            if (iOrdinal == 4) {
                this.f38731 = Long.valueOf(((Long) this.f38731).longValue() + 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31201() {
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            this.f38731 = Byte.valueOf((byte) (((Byte) this.f38731).byteValue() - 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f38731 = Character.valueOf((char) (((Character) this.f38731).charValue() - 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f38731 = Short.valueOf((short) (((Short) this.f38731).shortValue() - 1));
        } else if (iOrdinal == 3) {
            this.f38731 = Integer.valueOf(((Integer) this.f38731).intValue() - 1);
        } else {
            if (iOrdinal == 4) {
                this.f38731 = Long.valueOf(((Long) this.f38731).longValue() - 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۠ */
    private Number m31196() {
        if (this.f38731 == null) {
            return Double.valueOf(0.0d);
        }
        switch (this.f38732) {
            case BYTE:
                Byte b = (Byte) this.f38731;
                b.byteValue();
                return b;
            case CHAR:
            case INT:
                Integer num = (Integer) this.f38731;
                num.intValue();
                return num;
            case SHORT:
                Short sh = (Short) this.f38731;
                sh.shortValue();
                return sh;
            case LONG:
                Long l2 = (Long) this.f38731;
                l2.longValue();
                return l2;
            case FLOAT:
                Float f = (Float) this.f38731;
                f.floatValue();
                return f;
            case DOUBLE:
                Double d = (Double) this.f38731;
                d.doubleValue();
                return d;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    private double m31197() {
        if (this.f38731 == null) {
            return 0.0d;
        }
        switch (this.f38732) {
            case BYTE:
                return ((Byte) this.f38731).byteValue();
            case CHAR:
                return ((Character) this.f38731).charValue();
            case SHORT:
                return ((Short) this.f38731).shortValue();
            case INT:
                return ((Integer) this.f38731).intValue();
            case LONG:
                return ((Long) this.f38731).longValue();
            case FLOAT:
                return ((Float) this.f38731).floatValue();
            case DOUBLE:
                return ((Double) this.f38731).doubleValue();
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private float m31193() {
        if (this.f38731 == null) {
            return 0.0f;
        }
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f38731).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f38731).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f38731).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f38731).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f38731).longValue();
        }
        if (iOrdinal == 5) {
            return ((Float) this.f38731).floatValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֨ */
    private long m31194() {
        if (this.f38731 == null) {
            return 0L;
        }
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f38731).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f38731).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f38731).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f38731).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f38731).longValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۚ */
    private int m31195() {
        if (this.f38731 == null) {
            return 0;
        }
        int iOrdinal = this.f38732.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f38731).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f38731).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f38731).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f38731).intValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m31258(C13731 c13731) {
        if (this.f38732 == EnumC8366.VOID) {
            throw new RuntimeException();
        }
        c13731.m31208(this.f38731);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31243(C13731 c13731) {
        c13731.m31202((byte) m31197());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m31250(C13731 c13731) {
        c13731.m31203((char) m31197());
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m31230(C13731 c13731) {
        c13731.m31213((short) m31197());
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m31261(C13731 c13731) {
        c13731.m31206((int) m31197());
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m31223(C13731 c13731) {
        c13731.m31207((long) m31197());
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m31237(C13731 c13731) {
        c13731.m31205((float) m31197());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m31247(C13731 c13731) {
        c13731.m31204(m31197());
    }
}
