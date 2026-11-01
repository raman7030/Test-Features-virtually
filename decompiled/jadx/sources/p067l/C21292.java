package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 179R */
/* JADX INFO: loaded from: classes4.dex */
public final class C21292 {
    /* JADX INFO: renamed from: ֫ */
    public static int m48115() {
        int i = ApplicationC21448.f67649.getInt("amsl", 5);
        if (i < 1 || i > 100) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C18483 m48118() {
        String string = ApplicationC21448.f67649.getString("amsk", "");
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        EnumC10104 enumC10104 = EnumC10104.V1_V2_V3;
        int i = interfaceC14100.getInt("amss", enumC10104.ordinal());
        EnumC10104[] enumC10104ArrValues = EnumC10104.values();
        if (i >= 0 && i < enumC10104ArrValues.length) {
            enumC10104 = enumC10104ArrValues[i];
        }
        return m48116(new C18483(string, enumC10104, ApplicationC21448.f67649.getString("amv1sf", null), ApplicationC21448.f67649.getBoolean("amkv1sd", false)));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m48119(C18483 c18483) {
        C18483 c18483M48116 = m48116(c18483);
        InterfaceC14770 interfaceC14770PutBoolean = ApplicationC21448.f67649.edit().putString("amsk", c18483M48116.m42021()).mo27875(c18483M48116.m42022().ordinal(), "amss").putBoolean("amkv1sd", c18483M48116.m42019());
        if (c18483M48116.m42020() == null) {
            interfaceC14770PutBoolean.remove("amv1sf");
        } else {
            interfaceC14770PutBoolean.putString("amv1sf", c18483M48116.m42020());
        }
        interfaceC14770PutBoolean.apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ֫ */
    public static C18483 m48116(C18483 c18483) {
        String strM42021 = c18483.m42021();
        if (TextUtils.isEmpty(strM42021)) {
            strM42021 = "";
        } else {
            C16984.m38573().getClass();
            if (C7050.m16224(R.string.MT_Protector).equals(strM42021)) {
                strM42021 = "";
            }
        }
        return new C18483(strM42021, c18483.m42022(), TextUtils.isEmpty(c18483.m42020()) ? null : c18483.m42020(), c18483.m42019());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48117(String str) {
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
            ApplicationC21448.f67649.edit().mo27875(numValueOf.intValue(), "amsl").apply();
        }
    }
}
