package l;

/* JADX INFO: renamed from: l.ܽ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16961 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4047 f52043 = new C4047();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39788(String str) {
        C4047 c4047 = this.f52043;
        if (str != null) {
            c4047.getClass();
            if (str.length() >= 2 && str.charAt(0) == 'L' && C7416.m19937(1, str) == ';') {
                c4047.m12161(str);
                return;
            }
        }
        c4047.m12163(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11318 m39787(C23528 c23528, C11138 c11138) throws C3059 {
        C16781 c16781 = c23528.f75548;
        boolean zEquals = "exact".equals(c16781.f51541);
        C4047 c4047 = this.f52043;
        if (zEquals) {
            C1965 c1965M27623 = c11138.m27623(c4047.m12153(), "dexClassSimpleName");
            if (c1965M27623 != null) {
                return m39785(c23528, c1965M27623);
            }
            C1965 c1965M27624 = c11138.m27623(c4047.m12164(), "dexClassSimpleName");
            if (c1965M27624 != null) {
                return m39785(c23528, c1965M27624);
            }
            C1965 c1965M27625 = c11138.m27623(c4047.m12149(), "dexClassName");
            if (c1965M27625 != null) {
                return m39785(c23528, c1965M27625);
            }
            C1965 c1965M27626 = c11138.m27623(c4047.m12151(), "dexClassName");
            if (c1965M27626 != null) {
                return m39785(c23528, c1965M27626);
            }
            C1965 c1965M27627 = c11138.m27623(c4047.m12165(), "dexClassName");
            if (c1965M27627 != null) {
                return m39785(c23528, c1965M27627);
            }
            C1965 c1965M27628 = c11138.m27623(c4047.m12152(), "dexClassName");
            if (c1965M27628 == null) {
                return null;
            }
            return m39785(c23528, c1965M27628);
        }
        if (c16781.f51540) {
            C1965 c1965M27629 = c11138.m27623(c4047.m12149(), "dexClassName");
            if (c1965M27629 != null) {
                return m39785(c23528, c1965M27629);
            }
            C1965 c1965M276210 = c11138.m27623(c4047.m12151(), "dexClassName");
            if (c1965M276210 != null) {
                return m39785(c23528, c1965M276210);
            }
            C1965 c1965M276211 = c11138.m27623(c4047.m12152(), "dexClassName");
            if (c1965M276211 != null) {
                return m39785(c23528, c1965M276211);
            }
            C1965 c1965M276212 = c11138.m27623(c4047.m12165(), "dexClassName");
            if (c1965M276212 == null) {
                return null;
            }
            return m39785(c23528, c1965M276212);
        }
        C1965 c1965M27622 = c11138.m27622(c4047.m12156(), c4047.m12160(), c4047.m12149());
        if (c1965M27622 != null) {
            return m39785(c23528, c1965M27622);
        }
        C1965 c1965M276213 = c11138.m27622(c4047.m12162(), c4047.m12158(), c4047.m12151());
        if (c1965M276213 != null) {
            return m39785(c23528, c1965M276213);
        }
        C1965 c1965M276214 = c11138.m27622(c4047.m12162(), c4047.m12158(), c4047.m12152());
        if (c1965M276214 != null) {
            return m39785(c23528, c1965M276214);
        }
        C1965 c1965M276215 = c11138.m27622(c4047.m12162(), c4047.m12158(), c4047.m12165());
        if (c1965M276215 == null) {
            return null;
        }
        return m39785(c23528, c1965M276215);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11318 m39785(C23528 c23528, C1965 c1965) {
        if (c23528.f75541) {
            c1965.m6475();
        } else {
            c1965 = null;
        }
        return new C11318(this.f52043.m12154(), c1965);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m39786() {
        return this.f52043.m12154();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39789(C14355 c14355) {
        String str = c14355.f43285;
        if ("none".equals(str)) {
            return true;
        }
        String str2 = c14355.f43286;
        boolean zEquals = "descriptorExact".equals(str);
        C4047 c4047 = this.f52043;
        if (zEquals) {
            return str2 != null && c4047.m12150(str2);
        }
        return str2 == null || str2.isEmpty() || c4047.m12155(str2) || c4047.m12157(str2) || c4047.m12159(str2);
    }
}
