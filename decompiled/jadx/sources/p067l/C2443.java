package p067l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2443 extends C10491 {

    /* JADX INFO: renamed from: ܳ */
    public EnumC20550 f3775;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f3776;

    /* JADX INFO: renamed from: ᩳ */
    public EnumMap f3777;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2443(C13565 c13565) {
        EnumC20550 enumC20550;
        EnumC23266 enumC23266 = EnumC23266.SUMMARY;
        EnumC23266 enumC23267 = EnumC23266.DETAILS;
        EnumC23266 enumC23268 = EnumC23266.SUBDIAGNOSTICS;
        EnumC23266 enumC23269 = EnumC23266.SOURCE;
        super(c13565, EnumSet.of(enumC23266, enumC23267, enumC23268, enumC23269));
        this.f3777 = new EnumMap(EnumC19879.class);
        EnumC19879 enumC19879 = EnumC19879.DEFAULT_POS_FORMAT;
        m3436(enumC19879, "%f:%l:%_%p%L%m");
        EnumC19879 enumC198710 = EnumC19879.DEFAULT_NO_POS_FORMAT;
        m3436(enumC198710, "%p%L%m");
        EnumC19879 enumC198711 = EnumC19879.DEFAULT_CLASS_FORMAT;
        m3436(enumC198711, "%f:%_%p%L%m");
        m3434();
        if (c13565.m30879("diags.legacy")) {
            this.f3777 = new EnumMap(EnumC19879.class);
            m3436(enumC19879, "%f:%l:%_%t%L%m");
            m3436(enumC198710, "%p%L%m");
            m3436(enumC198711, "%f:%_%t%L%m");
        }
        String strM30872 = c13565.m30872("diags.layout");
        if (strM30872 != null) {
            if (strM30872.equals("OLD")) {
                this.f3777 = new EnumMap(EnumC19879.class);
                m3436(enumC19879, "%f:%l:%_%t%L%m");
                m3436(enumC198710, "%p%L%m");
                m3436(enumC198711, "%f:%_%t%L%m");
            } else {
                String[] strArrSplit = strM30872.split("\\|");
                int length = strArrSplit.length;
                if (length == 2) {
                    m3436(enumC198710, strArrSplit[1]);
                } else if (length == 3) {
                    m3436(enumC198711, strArrSplit[2]);
                    m3436(enumC198710, strArrSplit[1]);
                }
                m3436(enumC19879, strArrSplit[0]);
            }
        }
        String strM30873 = c13565.m30872("diags.sourcePosition");
        if (strM30873 != null && strM30873.equals("bottom")) {
            enumC20550 = EnumC20550.BOTTOM;
        } else {
            enumC20550 = EnumC20550.AFTER_SUMMARY;
        }
        this.f3775 = enumC20550;
        String strM30874 = c13565.m30872("diags.indent");
        if (strM30874 != null) {
            String[] strArrSplit2 = strM30874.split("\\|");
            try {
                int length2 = strArrSplit2.length;
                if (length2 != 2) {
                    if (length2 != 3) {
                        if (length2 != 4) {
                            if (length2 == 5) {
                                m3437(EnumC23266.JLS, Integer.parseInt(strArrSplit2[4]));
                            }
                        }
                        m3437(enumC23268, Integer.parseInt(strArrSplit2[3]));
                    }
                    m3437(enumC23269, Integer.parseInt(strArrSplit2[2]));
                    m3437(enumC23267, Integer.parseInt(strArrSplit2[1]));
                } else {
                    m3437(enumC23267, Integer.parseInt(strArrSplit2[1]));
                }
                m3437(enumC23266, Integer.parseInt(strArrSplit2[0]));
            } catch (NumberFormatException unused) {
                m3434();
            }
        }
    }

    public C2443() {
        super(EnumSet.of(EnumC23266.SUMMARY, EnumC23266.DETAILS, EnumC23266.SUBDIAGNOSTICS, EnumC23266.SOURCE));
        this.f3777 = new EnumMap(EnumC19879.class);
        m3436(EnumC19879.DEFAULT_POS_FORMAT, "%f:%l:%_%p%L%m");
        m3436(EnumC19879.DEFAULT_NO_POS_FORMAT, "%p%L%m");
        m3436(EnumC19879.DEFAULT_CLASS_FORMAT, "%f:%_%p%L%m");
        m3434();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m3434() {
        this.f3776 = new HashMap();
        m3437(EnumC23266.SUMMARY, 0);
        m3437(EnumC23266.DETAILS, 2);
        m3437(EnumC23266.SUBDIAGNOSTICS, 4);
        m3437(EnumC23266.SOURCE, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m3435(EnumC23266 enumC23266) {
        return ((Integer) this.f3776.get(enumC23266)).intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3437(EnumC23266 enumC23266, int i) {
        this.f3776.put(enumC23266, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3436(EnumC19879 enumC19879, String str) {
        this.f3777.put(enumC19879, str);
    }
}
