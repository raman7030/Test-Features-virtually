package l;

import com.alipay.sdk.m.y.l;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21307 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC8396 f68681;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Set f68682;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21307 f68686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f68688 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Set f68687 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Set f68680 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f68679 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f68684 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f68683 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC3520 f68685 = EnumC3520.UNKNOWN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f68689 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48339(C21307 c21307) {
        C21307 c21307M48337 = c21307.m48337();
        if (this == c21307M48337) {
            return;
        }
        c21307M48337.f68686 = this;
        m48335(this, c21307M48337, EnumC7900.f24480);
        m48335(this, c21307M48337, EnumC7900.f24479);
        m48335(this, c21307M48337, EnumC7900.f24481);
        m48335(this, c21307M48337, EnumC7900.f24484);
        m48335(this, c21307M48337, EnumC7900.f24478);
        m48335(this, c21307M48337, EnumC7900.f24482);
        String str = this.f68689;
        if (str == null) {
            this.f68689 = c21307M48337.f68689;
        } else {
            String str2 = c21307M48337.f68689;
            if (str2 != null) {
                this.f68689 = C14955.m35430(str, str2);
            }
        }
        c21307M48337.f68689 = null;
        Set set = c21307M48337.f68682;
        if (set != null) {
            Set set2 = this.f68682;
            if (set2 == null) {
                this.f68682 = set;
            } else {
                set2.addAll(set);
            }
            c21307M48337.f68682 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48335(C21307 c21307, C21307 c21308, EnumC7900 enumC7900) {
        Set setMo1218 = enumC7900.mo1218(c21308);
        if (setMo1218 != null) {
            Set setMo1219 = enumC7900.mo1218(c21307);
            if (setMo1219 == null) {
                enumC7900.mo1219(c21307, setMo1218);
            } else {
                setMo1219.addAll(setMo1218);
                setMo1218 = setMo1219;
            }
            setMo1218.remove(c21307);
            setMo1218.remove(c21308);
            enumC7900.mo1219(c21308, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21307 m48337() {
        C21307 c21307 = this;
        while (true) {
            C21307 c21308 = c21307.f68686;
            if (c21308 == null) {
                break;
            }
            c21307 = c21308;
        }
        if (c21307 != this) {
            this.f68686 = c21307;
        }
        return c21307;
    }

    public C21307(AbstractC8396 abstractC8396) {
        this.f68681 = abstractC8396;
    }

    public final String toString() {
        C21307 c21307M48337 = m48337();
        Set set = c21307M48337.f68682;
        String string = set == null ? "[]" : set.toString();
        return c21307M48337.f68685 + "::" + this.f68681 + ": " + c21307M48337.f68689 + " > {" + string.substring(1, string.length() - 1) + l.d;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48341() {
        C21307 c21307M48337 = m48337();
        EnumC3520 enumC3520 = c21307M48337.f68685;
        if (enumC3520 == EnumC3520.OBJECT) {
            return c21307M48337.f68689.length() == 1 ? "Ljava/lang/Object;" : c21307M48337.f68689;
        }
        if (enumC3520.f11198 && enumC3520 != EnumC3520.INT) {
            String str = c21307M48337.f68689;
            if (str != null) {
                return str;
            }
            throw new RuntimeException();
        }
        if (enumC3520 == EnumC3520.JD) {
            return "J";
        }
        if (c21307M48337.f68682 != null) {
            String[] strArr = C22012.f70566;
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (c21307M48337.f68682.contains(str2)) {
                    return str2;
                }
            }
        }
        switch (C2256.f7332[enumC3520.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "I";
            case 4:
            case 5:
            case 6:
                return "Z";
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48340(EnumC3520 enumC3520) {
        EnumC3520 enumC3521 = this.f68685;
        EnumC3520 enumC3520M10715 = EnumC3520.m10715(enumC3521, enumC3520);
        if (enumC3520M10715 == enumC3521) {
            return false;
        }
        this.f68685 = enumC3520M10715;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48338() {
        return m48337().f68689;
    }
}
