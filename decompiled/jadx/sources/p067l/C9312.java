package p067l;

/* JADX INFO: renamed from: l.۟ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9312 extends AbstractC17358 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final C14930 f25317;

    /* JADX INFO: renamed from: ᩹ */
    public C15346 f25318;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 4;
    }

    public C9312(C14930 c14930) {
        if (c14930 == null) {
            throw new NullPointerException("value == null");
        }
        this.f25317 = c14930;
        this.f25318 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9312) {
            return this.f25317.equals(((C9312) obj).f25317);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25317.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f25317.compareTo(((C9312) obj).f25317);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_STRING_ID_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        if (this.f25318 == null) {
            C6630 c6630M7849 = c3948.m7849();
            C15346 c15346 = new C15346(this.f25317);
            this.f25318 = c15346;
            c6630M7849.m15102((AbstractC5289) c15346);
        }
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        String str;
        int iM11432 = this.f25318.m11432();
        if (c19705.m44765()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m39359());
            sb.append(' ');
            String strMo4819 = this.f25317.mo4819();
            if (strMo4819.length() <= 98) {
                str = "";
            } else {
                strMo4819 = strMo4819.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo4819 + str + '\"');
            c19705.m44760(0, sb.toString());
            c19705.m44760(4, "  string_data_off: ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44773(iM11432);
    }

    public final C14930 getValue() {
        return this.f25317;
    }
}
