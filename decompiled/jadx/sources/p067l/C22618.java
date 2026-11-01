package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22618 {

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC10348 f71372;

    /* JADX INFO: renamed from: ۢ */
    public Set f71373;

    /* JADX INFO: renamed from: ܿ */
    public C22618 f71377;

    /* JADX INFO: renamed from: ᩷ */
    public Set f71379 = null;

    /* JADX INFO: renamed from: ᩳ */
    public Set f71378 = null;

    /* JADX INFO: renamed from: ۜ */
    public Set f71371 = null;

    /* JADX INFO: renamed from: ֫ */
    public Set f71370 = null;

    /* JADX INFO: renamed from: ܳ */
    public Set f71375 = null;

    /* JADX INFO: renamed from: ۧ */
    public Set f71374 = null;

    /* JADX INFO: renamed from: ܽ */
    public EnumC5714 f71376 = EnumC5714.UNKNOWN;

    /* JADX INFO: renamed from: ᩻ */
    public String f71380 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m50674(C22618 c22618) {
        C22618 c22618M50672 = c22618.m50672();
        if (this == c22618M50672) {
            return;
        }
        c22618M50672.f71377 = this;
        m50670(this, c22618M50672, EnumC9876.f27396);
        m50670(this, c22618M50672, EnumC9876.f27395);
        m50670(this, c22618M50672, EnumC9876.f27397);
        m50670(this, c22618M50672, EnumC9876.f27400);
        m50670(this, c22618M50672, EnumC9876.f27394);
        m50670(this, c22618M50672, EnumC9876.f27398);
        String str = this.f71380;
        if (str == null) {
            this.f71380 = c22618M50672.f71380;
        } else {
            String str2 = c22618M50672.f71380;
            if (str2 != null) {
                this.f71380 = C16581.m37582(str, str2);
            }
        }
        c22618M50672.f71380 = null;
        Set set = c22618M50672.f71373;
        if (set != null) {
            Set set2 = this.f71373;
            if (set2 == null) {
                this.f71373 = set;
            } else {
                set2.addAll(set);
            }
            c22618M50672.f71373 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50670(C22618 c22618, C22618 c22619, EnumC9876 enumC9876) {
        Set setMo3620 = enumC9876.mo3620(c22619);
        if (setMo3620 != null) {
            Set setMo3621 = enumC9876.mo3620(c22618);
            if (setMo3621 == null) {
                enumC9876.mo3621(c22618, setMo3620);
            } else {
                setMo3621.addAll(setMo3620);
                setMo3620 = setMo3621;
            }
            setMo3620.remove(c22618);
            setMo3620.remove(c22619);
            enumC9876.mo3621(c22619, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public C22618 m50672() {
        C22618 c22618 = this;
        while (true) {
            C22618 c22619 = c22618.f71377;
            if (c22619 == null) {
                break;
            }
            c22618 = c22619;
        }
        if (c22618 != this) {
            this.f71377 = c22618;
        }
        return c22618;
    }

    public C22618(AbstractC10348 abstractC10348) {
        this.f71372 = abstractC10348;
    }

    public final String toString() {
        C22618 c22618M50672 = m50672();
        Set set = c22618M50672.f71373;
        String string = set == null ? "[]" : set.toString();
        return c22618M50672.f71376 + "::" + this.f71372 + ": " + c22618M50672.f71380 + " > {" + string.substring(1, string.length() - 1) + C0249l.f1198d;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m50676() {
        C22618 c22618M50672 = m50672();
        EnumC5714 enumC5714 = c22618M50672.f71376;
        if (enumC5714 == EnumC5714.OBJECT) {
            return c22618M50672.f71380.length() == 1 ? "Ljava/lang/Object;" : c22618M50672.f71380;
        }
        if (enumC5714.f14004 && enumC5714 != EnumC5714.INT) {
            String str = c22618M50672.f71380;
            if (str != null) {
                return str;
            }
            throw new RuntimeException();
        }
        if (enumC5714 == EnumC5714.JD) {
            return "J";
        }
        if (c22618M50672.f71373 != null) {
            String[] strArr = C23288.f73279;
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (c22618M50672.f71373.contains(str2)) {
                    return str2;
                }
            }
        }
        switch (C4512.f10120[enumC5714.ordinal()]) {
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50675(EnumC5714 enumC5714) {
        EnumC5714 enumC5715 = this.f71376;
        EnumC5714 enumC5714M12711 = EnumC5714.m12711(enumC5715, enumC5714);
        if (enumC5714M12711 == enumC5715) {
            return false;
        }
        this.f71376 = enumC5714M12711;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50673() {
        return m50672().f71380;
    }
}
