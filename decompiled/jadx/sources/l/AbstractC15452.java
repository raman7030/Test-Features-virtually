package l;

/* JADX INFO: renamed from: l.ܶ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L57K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15452 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f47310;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15452 f47311;

    public AbstractC15452() {
        this(589824, null);
    }

    public AbstractC15452(int i, AbstractC15452 abstractC15452) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C9810.m24843(this);
        }
        this.f47310 = i;
        this.f47311 = abstractC15452;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo28291(int i, String str) {
        if (this.f47310 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28291(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo26963() {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26963();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo26968(String str, boolean z) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26968(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC14104 mo26977(int i, C23214 c23214, String str, boolean z) {
        if (this.f47310 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26977(i, c23214, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28283(int i, boolean z) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28283(i, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo26964(int i, String str, boolean z) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26964(i, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28288(C16864 c16864) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28288(c16864);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo28289() {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28289();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26969(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26969(i, i2, i3, objArr, objArr2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28279(int i) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28279(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo28290(int i, int i2) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28290(i, i2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo28295(int i, int i2) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28295(i, i2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo26978(int i, String str) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26978(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26972(String str, int i, String str2, String str3) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26972(str, i, str2, str3);
        }
    }

    @Deprecated(forRemoval = false)
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36545(String str, int i, String str2, String str3) {
        mo12089(i | (this.f47310 < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12089(int i, String str, String str2, String str3, boolean z) {
        if (this.f47310 < 327680 && (i & 256) == 0) {
            if (z != (i == 185)) {
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            m36545(str, i, str2, str3);
        } else {
            AbstractC15452 abstractC15452 = this.f47311;
            if (abstractC15452 != null) {
                abstractC15452.mo12089(i & (-257), str, str2, str3, z);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26974(String str, String str2, C0636 c0636, Object... objArr) {
        if (this.f47310 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26974(str, str2, c0636, objArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28282(int i, C1342 c1342) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28282(i, c1342);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28284(C1342 c1342) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28284(c1342);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26971(Object obj) {
        int i = this.f47310;
        if (i < 327680 && ((obj instanceof C0636) || ((obj instanceof C11926) && ((C11926) obj).m29102() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (i < 458752 && (obj instanceof C21099)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26971(obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28280(int i, int i2) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28280(i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28281(int i, int i2, C1342 c1342, C1342... c1342Arr) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28281(i, i2, c1342, c1342Arr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28285(C1342 c1342, int[] iArr, C1342[] c1342Arr) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28285(c1342, iArr, c1342Arr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26970(int i, String str) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26970(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo26965(int i, C23214 c23214, String str, boolean z) {
        if (this.f47310 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26965(i, c23214, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26975(C1342 c1342, C1342 c1343, C1342 c1344, String str) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26975(c1342, c1343, c1344, str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC14104 mo26976(int i, C23214 c23214, String str, boolean z) {
        if (this.f47310 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26976(i, c23214, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26973(String str, String str2, String str3, C1342 c1342, C1342 c1343, int i) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo26973(str, str2, str3, c1342, c1343, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo26966(int i, C23214 c23214, C1342[] c1342Arr, C1342[] c1342Arr2, int[] iArr, String str, boolean z) {
        if (this.f47310 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            return abstractC15452.mo26966(i, c23214, c1342Arr, c1342Arr2, iArr, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo28292(int i, C1342 c1342) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28292(i, c1342);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo28294(int i, int i2) {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28294(i, i2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo28293() {
        AbstractC15452 abstractC15452 = this.f47311;
        if (abstractC15452 != null) {
            abstractC15452.mo28293();
        }
    }
}
