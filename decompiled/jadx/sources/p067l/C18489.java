package p067l;

/* JADX INFO: renamed from: l.ܽ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18489 {

    /* JADX INFO: renamed from: ֫ */
    public final C6215 f55223 = new C6215();

    /* JADX INFO: renamed from: ֫ */
    public final void m42031(String str) {
        C6215 c6215 = this.f55223;
        if (str != null) {
            c6215.getClass();
            if (str.length() >= 2 && str.charAt(0) == 'L' && C9417.m21911(1, str) == ';') {
                c6215.m14082(str);
                return;
            }
        }
        c6215.m14084(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13126 m42030(C24729 c24729, C12954 c12954) throws C5276 {
        C18317 c18317 = c24729.f78294;
        boolean zEquals = "exact".equals(c18317.f54723);
        C6215 c6215 = this.f55223;
        if (zEquals) {
            C4236 c4236M29685 = c12954.m29685(c6215.m14074(), "dexClassSimpleName");
            if (c4236M29685 != null) {
                return m42028(c24729, c4236M29685);
            }
            C4236 c4236M29686 = c12954.m29685(c6215.m14085(), "dexClassSimpleName");
            if (c4236M29686 != null) {
                return m42028(c24729, c4236M29686);
            }
            C4236 c4236M29687 = c12954.m29685(c6215.m14070(), "dexClassName");
            if (c4236M29687 != null) {
                return m42028(c24729, c4236M29687);
            }
            C4236 c4236M29688 = c12954.m29685(c6215.m14072(), "dexClassName");
            if (c4236M29688 != null) {
                return m42028(c24729, c4236M29688);
            }
            C4236 c4236M29689 = c12954.m29685(c6215.m14086(), "dexClassName");
            if (c4236M29689 != null) {
                return m42028(c24729, c4236M29689);
            }
            C4236 c4236M296810 = c12954.m29685(c6215.m14073(), "dexClassName");
            if (c4236M296810 == null) {
                return null;
            }
            return m42028(c24729, c4236M296810);
        }
        if (c18317.f54722) {
            C4236 c4236M296811 = c12954.m29685(c6215.m14070(), "dexClassName");
            if (c4236M296811 != null) {
                return m42028(c24729, c4236M296811);
            }
            C4236 c4236M296812 = c12954.m29685(c6215.m14072(), "dexClassName");
            if (c4236M296812 != null) {
                return m42028(c24729, c4236M296812);
            }
            C4236 c4236M296813 = c12954.m29685(c6215.m14073(), "dexClassName");
            if (c4236M296813 != null) {
                return m42028(c24729, c4236M296813);
            }
            C4236 c4236M296814 = c12954.m29685(c6215.m14086(), "dexClassName");
            if (c4236M296814 == null) {
                return null;
            }
            return m42028(c24729, c4236M296814);
        }
        C4236 c4236M29684 = c12954.m29684(c6215.m14077(), c6215.m14081(), c6215.m14070());
        if (c4236M29684 != null) {
            return m42028(c24729, c4236M29684);
        }
        C4236 c4236M296815 = c12954.m29684(c6215.m14083(), c6215.m14079(), c6215.m14072());
        if (c4236M296815 != null) {
            return m42028(c24729, c4236M296815);
        }
        C4236 c4236M296816 = c12954.m29684(c6215.m14083(), c6215.m14079(), c6215.m14073());
        if (c4236M296816 != null) {
            return m42028(c24729, c4236M296816);
        }
        C4236 c4236M296817 = c12954.m29684(c6215.m14083(), c6215.m14079(), c6215.m14086());
        if (c4236M296817 == null) {
            return null;
        }
        return m42028(c24729, c4236M296817);
    }

    /* JADX INFO: renamed from: ֫ */
    private C13126 m42028(C24729 c24729, C4236 c4236) {
        if (c24729.f78287) {
            c4236.m8616();
        } else {
            c4236 = null;
        }
        return new C13126(this.f55223.m14075(), c4236);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m42029() {
        return this.f55223.m14075();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42032(C16011 c16011) {
        String str = c16011.f46376;
        if ("none".equals(str)) {
            return true;
        }
        String str2 = c16011.f46377;
        boolean zEquals = "descriptorExact".equals(str);
        C6215 c6215 = this.f55223;
        if (zEquals) {
            return str2 != null && c6215.m14071(str2);
        }
        return str2 == null || str2.isEmpty() || c6215.m14076(str2) || c6215.m14078(str2) || c6215.m14080(str2);
    }
}
