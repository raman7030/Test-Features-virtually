package p067l;

/* JADX INFO: renamed from: l.ܰ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4K0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15773 {

    /* JADX INFO: renamed from: ֫ */
    public final int f45667;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC15773 f45668;

    public AbstractC15773() {
        this(589824, null);
    }

    public AbstractC15773(int i, AbstractC15773 abstractC15773) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C11692.m26858(this);
        }
        this.f45667 = i;
        this.f45668 = abstractC15773;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22773(Object obj, String str) {
        AbstractC15773 abstractC15773 = this.f45668;
        if (abstractC15773 != null) {
            abstractC15773.mo22773(obj, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22774(String str, String str2, String str3) {
        AbstractC15773 abstractC15773 = this.f45668;
        if (abstractC15773 != null) {
            abstractC15773.mo22774(str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo22770(String str, String str2) {
        AbstractC15773 abstractC15773 = this.f45668;
        if (abstractC15773 != null) {
            return abstractC15773.mo22770(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo22769(String str) {
        AbstractC15773 abstractC15773 = this.f45668;
        if (abstractC15773 != null) {
            return abstractC15773.mo22769(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22771() {
        AbstractC15773 abstractC15773 = this.f45668;
        if (abstractC15773 != null) {
            abstractC15773.mo22771();
        }
    }
}
