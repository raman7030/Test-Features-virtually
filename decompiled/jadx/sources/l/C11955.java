package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۨ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5DU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11955 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f35719 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f35720;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC6310 f35721;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29198() {
        this.f35720 = null;
        this.f35721 = null;
    }

    public final String toString() {
        return this.f35720.toString();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m29166() {
        return this.f35720 == null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29197(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311;
        EnumC6310 enumC6312 = this.f35721;
        EnumC6310 enumC6313 = EnumC6310.STRING;
        if (enumC6312 == enumC6313 || (enumC6310 = c11955.f35721) == enumC6313 || enumC6312 == (enumC6311 = EnumC6310.OBJECT) || enumC6310 == enumC6311) {
            c11956.m29160(this.f35720.equals(c11955.f35720));
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.BOOLEAN;
        if (enumC6312 == enumC6314 && enumC6310 == enumC6314) {
            c11956.m29160(m29191() == c11955.m29191());
        } else {
            c11956.m29160(m29143() == c11955.m29143());
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m29177(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311;
        EnumC6310 enumC6312 = this.f35721;
        EnumC6310 enumC6313 = EnumC6310.STRING;
        if (enumC6312 == enumC6313 || (enumC6310 = c11955.f35721) == enumC6313 || enumC6312 == (enumC6311 = EnumC6310.OBJECT) || enumC6310 == enumC6311) {
            c11956.m29160(!this.f35720.equals(c11955.f35720));
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.BOOLEAN;
        if (enumC6312 == enumC6314 && enumC6310 == enumC6314) {
            c11956.m29160(m29191() != c11955.m29191());
        } else {
            c11956.m29160(m29143() != c11955.m29143());
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29184(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.STRING;
        if (enumC6310 == enumC6311 && c11955.f35721 == enumC6311) {
            c11956.m29160(((String) this.f35720).compareTo((String) c11955.f35720) > 0);
        } else {
            c11956.m29160(m29143() > c11955.m29143());
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m29170(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.STRING;
        if (enumC6310 == enumC6311 && c11955.f35721 == enumC6311) {
            c11956.m29160(((String) this.f35720).compareTo((String) c11955.f35720) < 0);
        } else {
            c11956.m29160(m29143() < c11955.m29143());
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m29194(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.STRING;
        if (enumC6310 == enumC6311 && c11955.f35721 == enumC6311) {
            c11956.m29160(((String) this.f35720).compareTo((String) c11955.f35720) >= 0);
        } else {
            c11956.m29160(m29143() >= c11955.m29143());
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m29208(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.STRING;
        if (enumC6310 == enumC6311 && c11955.f35721 == enumC6311) {
            c11956.m29160(((String) this.f35720).compareTo((String) c11955.f35720) <= 0);
        } else {
            c11956.m29160(m29143() <= c11955.m29143());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29158(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311 = this.f35721;
        EnumC6310 enumC6312 = EnumC6310.STRING;
        if (enumC6311 == enumC6312 || (enumC6310 = c11955.f35721) == enumC6312) {
            c11956.m29155(this.f35720.toString() + c11955.f35720.toString());
            return;
        }
        EnumC6310 enumC6313 = EnumC6310.DOUBLE;
        if (enumC6311 == enumC6313 || enumC6310 == enumC6313) {
            c11956.m29150(m29143() + c11955.m29143());
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.FLOAT;
        if (enumC6311 == enumC6314 || enumC6310 == enumC6314) {
            c11956.m29151(m29139() + c11955.m29139());
            return;
        }
        EnumC6310 enumC6315 = EnumC6310.LONG;
        if (enumC6311 == enumC6315 || enumC6310 == enumC6315) {
            c11956.m29153(m29140() + c11955.m29140());
        } else {
            c11956.m29152(m29141() + c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29156(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 9) {
            this.f35720 = this.f35720.toString() + c11955.f35720.toString();
            return;
        }
        switch (iOrdinal) {
            case 0:
                this.f35720 = Byte.valueOf((byte) (c11955.m29142().byteValue() + m29195()));
                break;
            case 1:
                this.f35720 = Character.valueOf((char) (c11955.m29142().intValue() + m29192()));
                break;
            case 2:
                this.f35720 = Short.valueOf((short) (c11955.m29142().shortValue() + m29172()));
                break;
            case 3:
                this.f35720 = Integer.valueOf(c11955.m29142().intValue() + m29168());
                break;
            case 4:
                this.f35720 = Long.valueOf(c11955.m29142().longValue() + m29203());
                break;
            case 5:
                this.f35720 = Float.valueOf(c11955.m29142().floatValue() + m29206());
                break;
            case 6:
                this.f35720 = Double.valueOf(c11955.m29142().doubleValue() + m29182());
                break;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m29202(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311 = this.f35721;
        EnumC6310 enumC6312 = EnumC6310.DOUBLE;
        if (enumC6311 == enumC6312 || (enumC6310 = c11955.f35721) == enumC6312) {
            c11956.m29150(m29143() - c11955.m29143());
            return;
        }
        EnumC6310 enumC6313 = EnumC6310.FLOAT;
        if (enumC6311 == enumC6313 || enumC6310 == enumC6313) {
            c11956.m29151(m29139() - c11955.m29139());
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.LONG;
        if (enumC6311 == enumC6314 || enumC6310 == enumC6314) {
            c11956.m29153(m29140() - c11955.m29140());
        } else {
            c11956.m29152(m29141() - c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m29171(C11955 c11955) {
        switch (this.f35721) {
            case BYTE:
                this.f35720 = Byte.valueOf((byte) (m29195() - c11955.m29142().byteValue()));
                break;
            case CHAR:
                this.f35720 = Character.valueOf((char) (m29192() - c11955.m29142().intValue()));
                break;
            case SHORT:
                this.f35720 = Short.valueOf((short) (m29172() - c11955.m29142().shortValue()));
                break;
            case INT:
                this.f35720 = Integer.valueOf(m29168() - c11955.m29142().intValue());
                break;
            case LONG:
                this.f35720 = Long.valueOf(m29203() - c11955.m29142().longValue());
                break;
            case FLOAT:
                this.f35720 = Float.valueOf(m29206() - c11955.m29142().floatValue());
                break;
            case DOUBLE:
                this.f35720 = Double.valueOf(m29182() - c11955.m29142().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29190(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311 = this.f35721;
        EnumC6310 enumC6312 = EnumC6310.DOUBLE;
        if (enumC6311 == enumC6312 || (enumC6310 = c11955.f35721) == enumC6312) {
            c11956.m29150(m29143() / c11955.m29143());
            return;
        }
        EnumC6310 enumC6313 = EnumC6310.FLOAT;
        if (enumC6311 == enumC6313 || enumC6310 == enumC6313) {
            c11956.m29151(m29139() / c11955.m29139());
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.LONG;
        if (enumC6311 == enumC6314 || enumC6310 == enumC6314) {
            c11956.m29153(m29140() / c11955.m29140());
        } else {
            c11956.m29152(m29141() / c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m29173(C11955 c11955) {
        switch (this.f35721) {
            case BYTE:
                this.f35720 = Byte.valueOf((byte) (m29195() / c11955.m29142().byteValue()));
                break;
            case CHAR:
                this.f35720 = Character.valueOf((char) (m29192() / c11955.m29142().intValue()));
                break;
            case SHORT:
                this.f35720 = Short.valueOf((short) (m29172() / c11955.m29142().shortValue()));
                break;
            case INT:
                this.f35720 = Integer.valueOf(m29168() / c11955.m29142().intValue());
                break;
            case LONG:
                this.f35720 = Long.valueOf(m29203() / c11955.m29142().longValue());
                break;
            case FLOAT:
                this.f35720 = Float.valueOf(m29206() / c11955.m29142().floatValue());
                break;
            case DOUBLE:
                this.f35720 = Double.valueOf(m29182() / c11955.m29142().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29205(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311 = this.f35721;
        EnumC6310 enumC6312 = EnumC6310.DOUBLE;
        if (enumC6311 == enumC6312 || (enumC6310 = c11955.f35721) == enumC6312) {
            c11956.m29150(m29143() * c11955.m29143());
            return;
        }
        EnumC6310 enumC6313 = EnumC6310.FLOAT;
        if (enumC6311 == enumC6313 || enumC6310 == enumC6313) {
            c11956.m29151(m29139() * c11955.m29139());
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.LONG;
        if (enumC6311 == enumC6314 || enumC6310 == enumC6314) {
            c11956.m29153(m29140() * c11955.m29140());
        } else {
            c11956.m29152(m29141() * c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m29187(C11955 c11955) {
        switch (this.f35721) {
            case BYTE:
                this.f35720 = Byte.valueOf((byte) (c11955.m29142().byteValue() * m29195()));
                break;
            case CHAR:
                this.f35720 = Character.valueOf((char) (c11955.m29142().intValue() * m29192()));
                break;
            case SHORT:
                this.f35720 = Short.valueOf((short) (c11955.m29142().shortValue() * m29172()));
                break;
            case INT:
                this.f35720 = Integer.valueOf(c11955.m29142().intValue() * m29168());
                break;
            case LONG:
                this.f35720 = Long.valueOf(c11955.m29142().longValue() * m29203());
                break;
            case FLOAT:
                this.f35720 = Float.valueOf(c11955.m29142().floatValue() * m29206());
                break;
            case DOUBLE:
                this.f35720 = Double.valueOf(c11955.m29142().doubleValue() * m29182());
                break;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m29188(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310;
        EnumC6310 enumC6311 = this.f35721;
        EnumC6310 enumC6312 = EnumC6310.DOUBLE;
        if (enumC6311 == enumC6312 || (enumC6310 = c11955.f35721) == enumC6312) {
            c11956.m29150(m29143() % c11955.m29143());
            return;
        }
        EnumC6310 enumC6313 = EnumC6310.FLOAT;
        if (enumC6311 == enumC6313 || enumC6310 == enumC6313) {
            c11956.m29151(m29139() % c11955.m29139());
            return;
        }
        EnumC6310 enumC6314 = EnumC6310.LONG;
        if (enumC6311 == enumC6314 || enumC6310 == enumC6314) {
            c11956.m29153(m29140() % c11955.m29140());
        } else {
            c11956.m29152(m29141() % c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m29201(C11955 c11955) {
        switch (this.f35721) {
            case BYTE:
                this.f35720 = Byte.valueOf((byte) (m29195() % c11955.m29142().byteValue()));
                break;
            case CHAR:
                this.f35720 = Character.valueOf((char) (m29192() % c11955.m29142().intValue()));
                break;
            case SHORT:
                this.f35720 = Short.valueOf((short) (m29172() % c11955.m29142().shortValue()));
                break;
            case INT:
                this.f35720 = Integer.valueOf(m29168() % c11955.m29142().intValue());
                break;
            case LONG:
                this.f35720 = Long.valueOf(m29203() % c11955.m29142().longValue());
                break;
            case FLOAT:
                this.f35720 = Float.valueOf(m29206() % c11955.m29142().floatValue());
                break;
            case DOUBLE:
                this.f35720 = Double.valueOf(m29182() % c11955.m29142().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29181(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.LONG;
        if (enumC6310 == enumC6311 || c11955.f35721 == enumC6311) {
            c11956.m29153(m29140() & c11955.m29140());
        } else {
            c11956.m29152(c11955.m29141() & m29141());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29179(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (c11955.m29142().byteValue() & m29195()));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (c11955.m29142().shortValue() & m29172()));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(c11955.m29142().intValue() & m29168());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f35720 = Long.valueOf(m29203() & c11955.m29142().longValue());
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m29174(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.LONG;
        if (enumC6310 == enumC6311 || c11955.f35721 == enumC6311) {
            c11956.m29153(m29140() | c11955.m29140());
        } else {
            c11956.m29152(c11955.m29141() | m29141());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29199(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (c11955.m29142().byteValue() | m29195()));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (c11955.m29142().shortValue() | m29172()));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(c11955.m29142().intValue() | m29168());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f35720 = Long.valueOf(m29203() | c11955.m29142().longValue());
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m29145(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.LONG;
        if (enumC6310 == enumC6311 || c11955.f35721 == enumC6311) {
            c11956.m29153(m29140() ^ c11955.m29140());
        } else {
            c11956.m29152(c11955.m29141() ^ m29141());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m29185(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (c11955.m29142().byteValue() ^ m29195()));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (c11955.m29142().shortValue() ^ m29172()));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(c11955.m29142().intValue() ^ m29168());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f35720 = Long.valueOf(m29203() ^ c11955.m29142().longValue());
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29163(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.LONG;
        if (enumC6310 == enumC6311 || c11955.f35721 == enumC6311) {
            c11956.m29153(m29140() << ((int) c11955.m29140()));
        } else {
            c11956.m29152(m29141() << c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m29144(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (m29195() << c11955.m29142().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (m29172() << c11955.m29142().byteValue()));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(m29168() << c11955.m29142().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f35720 = Long.valueOf(m29203() << c11955.m29142().byteValue());
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m29165(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.LONG;
        if (enumC6310 == enumC6311 || c11955.f35721 == enumC6311) {
            c11956.m29153(m29140() >> ((int) c11955.m29140()));
        } else {
            c11956.m29152(m29141() >> c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29167(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (m29195() >> c11955.m29142().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (m29172() >> c11955.m29142().byteValue()));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(m29168() >> c11955.m29142().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f35720 = Long.valueOf(m29203() >> c11955.m29142().byteValue());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29200(C11955 c11955, C11955 c11956) {
        EnumC6310 enumC6310 = this.f35721;
        EnumC6310 enumC6311 = EnumC6310.LONG;
        if (enumC6310 == enumC6311 || c11955.f35721 == enumC6311) {
            c11956.m29153(m29140() >>> ((int) c11955.m29140()));
        } else {
            c11956.m29152(m29141() >>> c11955.m29141());
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m29146(C11955 c11955) {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (m29195() >>> c11955.m29142().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (m29172() >>> c11955.m29142().byteValue()));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(m29168() >>> c11955.m29142().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f35720 = Long.valueOf(m29203() >>> c11955.m29142().byteValue());
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m29164(C11955 c11955) {
        if (this.f35721 == EnumC6310.LONG) {
            c11955.m29153(~m29140());
        } else {
            c11955.m29152(~m29141());
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29162(C11955 c11955) {
        if (this.f35721 == EnumC6310.BOOLEAN) {
            c11955.m29160(!m29191());
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29180(C11955 c11955, int i) {
        Object obj = this.f35720;
        if (obj instanceof int[]) {
            Array.setInt(obj, i, c11955.m29168());
            return;
        }
        if (obj instanceof byte[]) {
            Array.setByte(obj, i, c11955.m29195());
            return;
        }
        if (obj instanceof String[]) {
            Array.set(obj, i, c11955.m29186());
            return;
        }
        if (obj instanceof char[]) {
            Array.setChar(obj, i, c11955.m29192());
            return;
        }
        if (obj instanceof boolean[]) {
            Array.setBoolean(obj, i, c11955.m29191());
            return;
        }
        if (obj instanceof short[]) {
            Array.setShort(obj, i, c11955.m29172());
            return;
        }
        if (obj instanceof float[]) {
            Array.setFloat(obj, i, c11955.m29206());
        } else if (obj instanceof double[]) {
            Array.setDouble(obj, i, c11955.m29182());
        } else {
            Array.set(obj, i, c11955.f35720);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29178() {
        return Array.getLength(this.f35720);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29157(C11955 c11955, int i) {
        Object obj = this.f35720;
        if (obj instanceof int[]) {
            c11955.m29152(Array.getInt(obj, i));
            return;
        }
        if (obj instanceof byte[]) {
            c11955.m29148(Array.getByte(obj, i));
            return;
        }
        if (obj instanceof String[]) {
            c11955.m29155((String) Array.get(obj, i));
            return;
        }
        if (obj instanceof long[]) {
            c11955.m29153(Array.getLong(obj, i));
            return;
        }
        if (obj instanceof char[]) {
            c11955.m29149(Array.getChar(obj, i));
            return;
        }
        if (obj instanceof boolean[]) {
            c11955.m29160(Array.getBoolean(obj, i));
            return;
        }
        if (obj instanceof short[]) {
            c11955.m29159(Array.getShort(obj, i));
            return;
        }
        if (obj instanceof float[]) {
            c11955.m29151(Array.getFloat(obj, i));
        } else if (obj instanceof double[]) {
            c11955.m29150(Array.getDouble(obj, i));
        } else {
            c11955.m29154(Array.get(obj, i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29155(String str) {
        this.f35721 = EnumC6310.STRING;
        this.f35720 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29159(short s) {
        this.f35721 = EnumC6310.SHORT;
        this.f35720 = Short.valueOf(s);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29152(int i) {
        this.f35721 = EnumC6310.INT;
        this.f35720 = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29153(long j) {
        this.f35721 = EnumC6310.LONG;
        this.f35720 = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29160(boolean z) {
        this.f35721 = EnumC6310.BOOLEAN;
        this.f35720 = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29148(byte b) {
        this.f35721 = EnumC6310.BYTE;
        this.f35720 = Byte.valueOf(b);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29149(char c) {
        this.f35721 = EnumC6310.CHAR;
        this.f35720 = Character.valueOf(c);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29151(float f) {
        this.f35721 = EnumC6310.FLOAT;
        this.f35720 = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29150(double d) {
        this.f35721 = EnumC6310.DOUBLE;
        this.f35720 = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29154(Object obj) {
        this.f35721 = EnumC6310.OBJECT;
        this.f35720 = obj;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m29186() {
        Object obj = this.f35720;
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final short m29172() {
        Object obj = this.f35720;
        if (obj == null) {
            return (short) 0;
        }
        return ((Short) obj).shortValue();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m29168() {
        Object obj = this.f35720;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m29203() {
        Object obj = this.f35720;
        if (obj == null) {
            return 0L;
        }
        return ((Long) obj).longValue();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m29206() {
        Object obj = this.f35720;
        if (obj == null) {
            return 0.0f;
        }
        return ((Float) obj).floatValue();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m29182() {
        Object obj = this.f35720;
        if (obj == null) {
            return 0.0d;
        }
        return ((Double) obj).doubleValue();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29191() {
        Object obj = this.f35720;
        return obj != null && ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte m29195() {
        Object obj = this.f35720;
        if (obj == null) {
            return (byte) 0;
        }
        return ((Byte) obj).byteValue();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char m29192() {
        Object obj = this.f35720;
        if (obj == null) {
            return (char) 0;
        }
        return ((Character) obj).charValue();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object m29175() {
        return this.f35720;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29161() {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (((Byte) this.f35720).byteValue() + 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f35720 = Character.valueOf((char) (((Character) this.f35720).charValue() + 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (((Short) this.f35720).shortValue() + 1));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(((Integer) this.f35720).intValue() + 1);
        } else {
            if (iOrdinal == 4) {
                this.f35720 = Long.valueOf(((Long) this.f35720).longValue() + 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29147() {
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            this.f35720 = Byte.valueOf((byte) (((Byte) this.f35720).byteValue() - 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f35720 = Character.valueOf((char) (((Character) this.f35720).charValue() - 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f35720 = Short.valueOf((short) (((Short) this.f35720).shortValue() - 1));
        } else if (iOrdinal == 3) {
            this.f35720 = Integer.valueOf(((Integer) this.f35720).intValue() - 1);
        } else {
            if (iOrdinal == 4) {
                this.f35720 = Long.valueOf(((Long) this.f35720).longValue() - 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private Number m29142() {
        if (this.f35720 == null) {
            return Double.valueOf(0.0d);
        }
        switch (this.f35721) {
            case BYTE:
                Byte b = (Byte) this.f35720;
                b.byteValue();
                return b;
            case CHAR:
            case INT:
                Integer num = (Integer) this.f35720;
                num.intValue();
                return num;
            case SHORT:
                Short sh = (Short) this.f35720;
                sh.shortValue();
                return sh;
            case LONG:
                Long l2 = (Long) this.f35720;
                l2.longValue();
                return l2;
            case FLOAT:
                Float f = (Float) this.f35720;
                f.floatValue();
                return f;
            case DOUBLE:
                Double d = (Double) this.f35720;
                d.doubleValue();
                return d;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private double m29143() {
        if (this.f35720 == null) {
            return 0.0d;
        }
        switch (this.f35721) {
            case BYTE:
                return ((Byte) this.f35720).byteValue();
            case CHAR:
                return ((Character) this.f35720).charValue();
            case SHORT:
                return ((Short) this.f35720).shortValue();
            case INT:
                return ((Integer) this.f35720).intValue();
            case LONG:
                return ((Long) this.f35720).longValue();
            case FLOAT:
                return ((Float) this.f35720).floatValue();
            case DOUBLE:
                return ((Double) this.f35720).doubleValue();
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private float m29139() {
        if (this.f35720 == null) {
            return 0.0f;
        }
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f35720).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f35720).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f35720).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f35720).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f35720).longValue();
        }
        if (iOrdinal == 5) {
            return ((Float) this.f35720).floatValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private long m29140() {
        if (this.f35720 == null) {
            return 0L;
        }
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f35720).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f35720).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f35720).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f35720).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f35720).longValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m29141() {
        if (this.f35720 == null) {
            return 0;
        }
        int iOrdinal = this.f35721.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f35720).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f35720).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f35720).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f35720).intValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29204(C11955 c11955) {
        if (this.f35721 == EnumC6310.VOID) {
            throw new RuntimeException();
        }
        c11955.m29154(this.f35720);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29189(C11955 c11955) {
        c11955.m29148((byte) m29143());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29196(C11955 c11955) {
        c11955.m29149((char) m29143());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m29176(C11955 c11955) {
        c11955.m29159((short) m29143());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m29207(C11955 c11955) {
        c11955.m29152((int) m29143());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m29169(C11955 c11955) {
        c11955.m29153((long) m29143());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29183(C11955 c11955) {
        c11955.m29151((float) m29143());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m29193(C11955 c11955) {
        c11955.m29150(m29143());
    }
}
