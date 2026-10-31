package l;

/* JADX INFO: renamed from: l.ܰ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4K0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14104 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f42581;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14104 f42582;

    public AbstractC14104() {
        this(589824, null);
    }

    public AbstractC14104(int i, AbstractC14104 abstractC14104) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C9810.m24843(this);
        }
        this.f42581 = i;
        this.f42582 = abstractC14104;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20792(Object obj, String str) {
        AbstractC14104 abstractC14104 = this.f42582;
        if (abstractC14104 != null) {
            abstractC14104.mo20792(obj, str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20793(String str, String str2, String str3) {
        AbstractC14104 abstractC14104 = this.f42582;
        if (abstractC14104 != null) {
            abstractC14104.mo20793(str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo20789(String str, String str2) {
        AbstractC14104 abstractC14104 = this.f42582;
        if (abstractC14104 != null) {
            return abstractC14104.mo20789(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo20788(String str) {
        AbstractC14104 abstractC14104 = this.f42582;
        if (abstractC14104 != null) {
            return abstractC14104.mo20788(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20790() {
        AbstractC14104 abstractC14104 = this.f42582;
        if (abstractC14104 != null) {
            abstractC14104.mo20790();
        }
    }
}
