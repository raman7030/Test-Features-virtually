package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 179R */
/* JADX INFO: loaded from: classes4.dex */
public final class C19911 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45803() {
        int i = ApplicationC20075.f65008.getInt("amsl", 5);
        if (i < 1 || i > 100) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16955 m45806() {
        String string = ApplicationC20075.f65008.getString("amsk", "");
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        EnumC8139 enumC8139 = EnumC8139.V1_V2_V3;
        int i = interfaceC12344.getInt("amss", enumC8139.ordinal());
        EnumC8139[] enumC8139ArrValues = EnumC8139.values();
        if (i >= 0 && i < enumC8139ArrValues.length) {
            enumC8139 = enumC8139ArrValues[i];
        }
        return m45804(new C16955(string, enumC8139, ApplicationC20075.f65008.getString("amv1sf", null), ApplicationC20075.f65008.getBoolean("amkv1sd", false)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45807(C16955 c16955) {
        C16955 c16955M45804 = m45804(c16955);
        InterfaceC13049 interfaceC13049PutBoolean = ApplicationC20075.f65008.edit().putString("amsk", c16955M45804.m39780()).mo25853(c16955M45804.m39781().ordinal(), "amss").putBoolean("amkv1sd", c16955M45804.m39778());
        if (c16955M45804.m39779() == null) {
            interfaceC13049PutBoolean.remove("amv1sf");
        } else {
            interfaceC13049PutBoolean.putString("amv1sf", c16955M45804.m39779());
        }
        interfaceC13049PutBoolean.apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16955 m45804(C16955 c16955) {
        String strM39780 = c16955.m39780();
        if (TextUtils.isEmpty(strM39780)) {
            strM39780 = "";
        } else {
            C15378.m36415().getClass();
            if (C4925.m14327(R.string.MT_Protector).equals(strM39780)) {
                strM39780 = "";
            }
        }
        return new C16955(strM39780, c16955.m39781(), TextUtils.isEmpty(c16955.m39779()) ? null : c16955.m39779(), c16955.m39778());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45805(String str) {
        Integer numValueOf = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                int i = Integer.parseInt(str.trim());
                boolean z = true;
                if (i < 1 || i > 100) {
                    z = false;
                }
                if (z) {
                    numValueOf = Integer.valueOf(i);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (numValueOf != null) {
            ApplicationC20075.f65008.edit().mo25853(numValueOf.intValue(), "amsl").apply();
        }
    }
}
