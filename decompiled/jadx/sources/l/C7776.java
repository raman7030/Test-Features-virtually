package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07FG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7776 extends C1860 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f24025;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f24026;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f24027;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f24028;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC15204 enumC15204 = EnumC15204.f46586;
        sb.append(enumC15204.m35967());
        EnumC15204 enumC15205 = EnumC15204.f46504;
        sb.append(enumC15205.m35967());
        EnumC15204 enumC15206 = EnumC15204.f46492;
        sb.append(enumC15206.m35967());
        EnumC15204 enumC15207 = EnumC15204.f46449;
        sb.append(enumC15207.m35967());
        sb.append(EnumC15204.f46482.m35967());
        String string = sb.toString();
        f24027 = string;
        String str = enumC15204.m35967() + enumC15205.m35967() + enumC15206.m35967() + enumC15207.m35967() + EnumC15204.f46530.m35967();
        f24025 = str;
        f24026 = string.length();
        f24028 = str.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m20804(boolean z) {
        short s;
        short s2;
        short s3;
        C15869 c15869M9312;
        String str = z ? "LocalVariableTypeTable" : "LocalVariableTable";
        String strM35967 = (z ? EnumC15204.f46530 : EnumC15204.f46482).m35967();
        String str2 = z ? f24025 : f24027;
        int i = z ? f24028 : f24026;
        ArrayList arrayList = new ArrayList();
        this.f6341.m18126();
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46597) {
            c6615.m18126();
        }
        String str3 = "";
        C15869 c15869 = null;
        short s4 = -1;
        short s5 = -1;
        short s6 = -1;
        while (true) {
            EnumC15204 enumC15204 = this.f6341.f20355;
            if (enumC15204 != EnumC15204.f46554 && enumC15204 != EnumC15204.f46442) {
                switch (C14125.f42606[enumC15204.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        short s7 = s6;
                        short s8 = s5;
                        short s9 = s4;
                        if (str3.length() != i && !str3.contains(this.f6341.f20350)) {
                            StringBuilder sbM15339 = C5368.m15339(str3);
                            sbM15339.append(this.f6341.f20350);
                            String string = sbM15339.toString();
                            if (!str2.startsWith(string)) {
                                this.f6339.m11951(this.f6341.f20363, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM35967);
                                throw null;
                            }
                            s6 = s7;
                            str3 = string;
                            s5 = s8;
                            s4 = s9;
                            this.f6341.m18126();
                        }
                        break;
                    case 7:
                        short s10 = s4;
                        short s11 = s5;
                        short s12 = s6;
                        if (str3.length() != i) {
                            this.f6339.m11951(this.f6341.f20363, "The table header is expected: \"Start Length Slot Name {0}\"", strM35967);
                            throw null;
                        }
                        if (s12 == -1) {
                            s6 = (short) this.f6341.f20360;
                            s4 = s10;
                            s5 = s11;
                        } else if (s11 == -1) {
                            s6 = s12;
                            s5 = (short) this.f6341.f20360;
                            s4 = s10;
                        } else {
                            if (s10 != -1) {
                                if (c15869 != null) {
                                    this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str, C4860.m14172("\"", strM35967, "\""));
                                    throw null;
                                }
                                this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str, C21639.m48906(EnumC15204.f46449, new StringBuilder("\""), "\""));
                                throw null;
                            }
                            s6 = s12;
                            s5 = s11;
                            s4 = (short) this.f6341.f20360;
                        }
                        this.f6341.m18126();
                        break;
                        break;
                    case 8:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m20803(str3, i, str, strM35967, s3, s5, s);
                        String str4 = this.f6341.f20350;
                        if (c15869 != null) {
                            arrayList.add(new C3211(s3, s2, s, c15869, this.f6340.f35012.m9312(str4)));
                            c15869 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f6341.m18126();
                        } else {
                            c15869M9312 = this.f6340.f35012.m9312(str4);
                            c15869 = c15869M9312;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f6341.m18126();
                        }
                        break;
                    case 9:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m20803(str3, i, str, strM35967, s6, s5, s);
                        String str5 = this.f6341.f20350;
                        if (c15869 != null) {
                            arrayList.add(new C3211(s3, s2, s, c15869, this.f6340.f35012.m9312(str5)));
                            c15869 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f6341.m18126();
                        } else {
                            c15869M9312 = this.f6340.f35012.m9312(str5);
                            c15869 = c15869M9312;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f6341.m18126();
                        }
                        break;
                    default:
                        short s13 = s6;
                        short s14 = s5;
                        short s15 = s4;
                        if (str3.length() != i) {
                            this.f6339.m11951(this.f6341.f20363, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM35967);
                            throw null;
                        }
                        if (s15 != -1 || s13 != -1 || s14 != -1 || c15869 != null) {
                            this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str, " either the line {start_pc length slot \"name\" \"descriptor\"} or {start_pc length slot name_index descriptor_index}");
                            throw null;
                        }
                        break;
                }
            }
            return arrayList;
        }
        this.f6339.m11951(this.f6341.f20363, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM35967);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20803(String str, int i, String str2, String str3, short s, short s2, short s3) {
        if (str.length() != i) {
            this.f6339.m11951(this.f6341.f20363, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", str3);
            throw null;
        }
        if (s == -1) {
            this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str2, "\"start_pc\"");
            throw null;
        }
        if (s2 == -1) {
            this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str2, "\"length\"");
            throw null;
        }
        if (s3 != -1) {
            return;
        }
        this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str2, "\"slot\"");
        throw null;
    }
}
