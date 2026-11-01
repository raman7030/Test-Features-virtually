package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07FG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9759 extends C4136 {

    /* JADX INFO: renamed from: ܳ */
    public static final String f26941;

    /* JADX INFO: renamed from: ܿ */
    public static final int f26942;

    /* JADX INFO: renamed from: ᩳ */
    public static final String f26943;

    /* JADX INFO: renamed from: ᩻ */
    public static final int f26944;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC16818 enumC16818 = EnumC16818.f49711;
        sb.append(enumC16818.m38127());
        EnumC16818 enumC16819 = EnumC16818.f49629;
        sb.append(enumC16819.m38127());
        EnumC16818 enumC168110 = EnumC16818.f49617;
        sb.append(enumC168110.m38127());
        EnumC16818 enumC168111 = EnumC16818.f49574;
        sb.append(enumC168111.m38127());
        sb.append(EnumC16818.f49607.m38127());
        String string = sb.toString();
        f26943 = string;
        String str = enumC16818.m38127() + enumC16819.m38127() + enumC168110.m38127() + enumC168111.m38127() + EnumC16818.f49655.m38127();
        f26941 = str;
        f26942 = string.length();
        f26944 = str.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m22785(boolean z) {
        short s;
        short s2;
        short s3;
        C17450 c17450M11354;
        String str = z ? "LocalVariableTypeTable" : "LocalVariableTable";
        String strM38127 = (z ? EnumC16818.f49655 : EnumC16818.f49607).m38127();
        String str2 = z ? f26941 : f26943;
        int i = z ? f26944 : f26942;
        ArrayList arrayList = new ArrayList();
        this.f9122.m20078();
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49722) {
            c8655.m20078();
        }
        String str3 = "";
        C17450 c17450 = null;
        short s4 = -1;
        short s5 = -1;
        short s6 = -1;
        while (true) {
            EnumC16818 enumC16818 = this.f9122.f23232;
            if (enumC16818 != EnumC16818.f49679 && enumC16818 != EnumC16818.f49567) {
                switch (C15793.f45692[enumC16818.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        short s7 = s6;
                        short s8 = s5;
                        short s9 = s4;
                        if (str3.length() != i && !str3.contains(this.f9122.f23227)) {
                            StringBuilder sbM17248 = C7470.m17248(str3);
                            sbM17248.append(this.f9122.f23227);
                            String string = sbM17248.toString();
                            if (!str2.startsWith(string)) {
                                this.f9120.m13871(this.f9122.f23240, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM38127);
                                throw null;
                            }
                            s6 = s7;
                            str3 = string;
                            s5 = s8;
                            s4 = s9;
                            this.f9122.m20078();
                        }
                        break;
                    case 7:
                        short s10 = s4;
                        short s11 = s5;
                        short s12 = s6;
                        if (str3.length() != i) {
                            this.f9120.m13871(this.f9122.f23240, "The table header is expected: \"Start Length Slot Name {0}\"", strM38127);
                            throw null;
                        }
                        if (s12 == -1) {
                            s6 = (short) this.f9122.f23237;
                            s4 = s10;
                            s5 = s11;
                        } else if (s11 == -1) {
                            s6 = s12;
                            s5 = (short) this.f9122.f23237;
                            s4 = s10;
                        } else {
                            if (s10 != -1) {
                                if (c17450 != null) {
                                    this.f9120.m13871(this.f9122.f23240, "The {0} format is incorrect; {1} is expected", str, C6988.m16053("\"", strM38127, "\""));
                                    throw null;
                                }
                                this.f9120.m13871(this.f9122.f23240, "The {0} format is incorrect; {1} is expected", str, C22934.m51254(EnumC16818.f49574, new StringBuilder("\""), "\""));
                                throw null;
                            }
                            s6 = s12;
                            s5 = s11;
                            s4 = (short) this.f9122.f23237;
                        }
                        this.f9122.m20078();
                        break;
                        break;
                    case 8:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m22784(str3, i, str, strM38127, s3, s5, s);
                        String str4 = this.f9122.f23227;
                        if (c17450 != null) {
                            arrayList.add(new C5420(s3, s2, s, c17450, this.f9121.f38012.m11354(str4)));
                            c17450 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f9122.m20078();
                        } else {
                            c17450M11354 = this.f9121.f38012.m11354(str4);
                            c17450 = c17450M11354;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f9122.m20078();
                        }
                        break;
                    case 9:
                        s = s4;
                        s2 = s5;
                        s3 = s6;
                        m22784(str3, i, str, strM38127, s6, s5, s);
                        String str5 = this.f9122.f23227;
                        if (c17450 != null) {
                            arrayList.add(new C5420(s3, s2, s, c17450, this.f9121.f38012.m11354(str5)));
                            c17450 = null;
                            s4 = -1;
                            s5 = -1;
                            s6 = -1;
                            this.f9122.m20078();
                        } else {
                            c17450M11354 = this.f9121.f38012.m11354(str5);
                            c17450 = c17450M11354;
                            s4 = s;
                            s5 = s2;
                            s6 = s3;
                            this.f9122.m20078();
                        }
                        break;
                    default:
                        short s13 = s6;
                        short s14 = s5;
                        short s15 = s4;
                        if (str3.length() != i) {
                            this.f9120.m13871(this.f9122.f23240, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM38127);
                            throw null;
                        }
                        if (s15 != -1 || s13 != -1 || s14 != -1 || c17450 != null) {
                            this.f9120.m13871(this.f9122.f23240, "The {0} format is incorrect; {1} is expected", str, " either the line {start_pc length slot \"name\" \"descriptor\"} or {start_pc length slot name_index descriptor_index}");
                            throw null;
                        }
                        break;
                }
            }
            return arrayList;
        }
        this.f9120.m13871(this.f9122.f23240, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", strM38127);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22784(String str, int i, String str2, String str3, short s, short s2, short s3) {
        if (str.length() != i) {
            this.f9120.m13871(this.f9122.f23240, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", str3);
            throw null;
        }
        if (s == -1) {
            this.f9120.m13871(this.f9122.f23240, "The {0} format is incorrect; {1} is expected", str2, "\"start_pc\"");
            throw null;
        }
        if (s2 == -1) {
            this.f9120.m13871(this.f9122.f23240, "The {0} format is incorrect; {1} is expected", str2, "\"length\"");
            throw null;
        }
        if (s3 != -1) {
            return;
        }
        this.f9120.m13871(this.f9122.f23240, "The {0} format is incorrect; {1} is expected", str2, "\"slot\"");
        throw null;
    }
}
