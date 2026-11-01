package p067l;

/* JADX INFO: renamed from: l.ܶ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L57K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17054 {

    /* JADX INFO: renamed from: ֫ */
    public final int f50439;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC17054 f50440;

    public AbstractC17054() {
        this(589824, null);
    }

    public AbstractC17054(int i, AbstractC17054 abstractC17054) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C11692.m26858(this);
        }
        this.f50439 = i;
        this.f50440 = abstractC17054;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo30335(int i, String str) {
        if (this.f50439 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30335(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo29008() {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29008();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo29013(String str, boolean z) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29013(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC15773 mo29022(int i, C24431 c24431, String str, boolean z) {
        if (this.f50439 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29022(i, c24431, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30327(int i, boolean z) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30327(i, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo29009(int i, String str, boolean z) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29009(i, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30332(C18396 c18396) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30332(c18396);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo30333() {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30333();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29014(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29014(i, i2, i3, objArr, objArr2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30323(int i) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30323(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo30334(int i, int i2) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30334(i, i2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo30339(int i, int i2) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30339(i, i2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo29023(int i, String str) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29023(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29017(String str, int i, String str2, String str3) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29017(str, i, str2, str3);
        }
    }

    @Deprecated(forRemoval = false)
    /* JADX INFO: renamed from: ۧ */
    public final void m38704(String str, int i, String str2, String str3) {
        mo14009(i | (this.f50439 < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14009(int i, String str, String str2, String str3, boolean z) {
        if (this.f50439 < 327680 && (i & 256) == 0) {
            if (z != (i == 185)) {
                throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
            }
            m38704(str, i, str2, str3);
        } else {
            AbstractC17054 abstractC17054 = this.f50440;
            if (abstractC17054 != null) {
                abstractC17054.mo14009(i & (-257), str, str2, str3, z);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29019(String str, String str2, C2973 c2973, Object... objArr) {
        if (this.f50439 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29019(str, str2, c2973, objArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30326(int i, C3644 c3644) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30326(i, c3644);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30328(C3644 c3644) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30328(c3644);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29016(Object obj) {
        int i = this.f50439;
        if (i < 327680 && ((obj instanceof C2973) || ((obj instanceof C13703) && ((C13703) obj).m31155() == 11))) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        if (i < 458752 && (obj instanceof C22421)) {
            throw new UnsupportedOperationException("This feature requires ASM7");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29016(obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30324(int i, int i2) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30324(i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30325(int i, int i2, C3644 c3644, C3644... c3644Arr) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30325(i, i2, c3644, c3644Arr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30329(C3644 c3644, int[] iArr, C3644[] c3644Arr) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30329(c3644, iArr, c3644Arr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29015(int i, String str) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29015(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo29010(int i, C24431 c24431, String str, boolean z) {
        if (this.f50439 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29010(i, c24431, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29020(C3644 c3644, C3644 c3645, C3644 c3646, String str) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29020(c3644, c3645, c3646, str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC15773 mo29021(int i, C24431 c24431, String str, boolean z) {
        if (this.f50439 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29021(i, c24431, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29018(String str, String str2, String str3, C3644 c3644, C3644 c3645, int i) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo29018(str, str2, str3, c3644, c3645, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo29011(int i, C24431 c24431, C3644[] c3644Arr, C3644[] c3644Arr2, int[] iArr, String str, boolean z) {
        if (this.f50439 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            return abstractC17054.mo29011(i, c24431, c3644Arr, c3644Arr2, iArr, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo30336(int i, C3644 c3644) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30336(i, c3644);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo30338(int i, int i2) {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30338(i, i2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo30337() {
        AbstractC17054 abstractC17054 = this.f50440;
        if (abstractC17054 != null) {
            abstractC17054.mo30337();
        }
    }
}
