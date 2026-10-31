package l;

/* JADX INFO: renamed from: l.۟ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7306 extends AbstractC15772 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13217 f22426;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13655 f22427;

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ۧ */
    public final int mo3385() {
        return 4;
    }

    public C7306(C13217 c13217) {
        if (c13217 == null) {
            throw new NullPointerException("value == null");
        }
        this.f22426 = c13217;
        this.f22427 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7306) {
            return this.f22426.equals(((C7306) obj).f22426);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22426.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f22426.compareTo(((C7306) obj).f22426);
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_STRING_ID_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        if (this.f22427 == null) {
            C4484 c4484M5619 = c1662.m5619();
            C13655 c13655 = new C13655(this.f22426);
            this.f22427 = c13655;
            c4484M5619.m13220((AbstractC3073) c13655);
        }
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        String str;
        int iM9390 = this.f22427.m9390();
        if (c18241.m42506()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m37189());
            sb.append(' ');
            String strMo2463 = this.f22426.mo2463();
            if (strMo2463.length() <= 98) {
                str = "";
            } else {
                strMo2463 = strMo2463.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo2463 + str + '\"');
            c18241.m42501(0, sb.toString());
            c18241.m42501(4, "  string_data_off: ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42514(iM9390);
    }

    public final C13217 getValue() {
        return this.f22426;
    }
}
