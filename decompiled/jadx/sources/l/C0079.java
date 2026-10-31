package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M445 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0079 extends C8547 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC19131 f1001;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f1002;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumMap f1003;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0079(C11781 c11781) {
        EnumC19131 enumC19131;
        EnumC21989 enumC21989 = EnumC21989.SUMMARY;
        EnumC21989 enumC219810 = EnumC21989.DETAILS;
        EnumC21989 enumC219811 = EnumC21989.SUBDIAGNOSTICS;
        EnumC21989 enumC219812 = EnumC21989.SOURCE;
        super(c11781, EnumSet.of(enumC21989, enumC219810, enumC219811, enumC219812));
        this.f1003 = new EnumMap(EnumC18425.class);
        EnumC18425 enumC18425 = EnumC18425.DEFAULT_POS_FORMAT;
        m1040(enumC18425, "%f:%l:%_%p%L%m");
        EnumC18425 enumC18426 = EnumC18425.DEFAULT_NO_POS_FORMAT;
        m1040(enumC18426, "%p%L%m");
        EnumC18425 enumC18427 = EnumC18425.DEFAULT_CLASS_FORMAT;
        m1040(enumC18427, "%f:%_%p%L%m");
        m1038();
        if (c11781.m28831("diags.legacy")) {
            this.f1003 = new EnumMap(EnumC18425.class);
            m1040(enumC18425, "%f:%l:%_%t%L%m");
            m1040(enumC18426, "%p%L%m");
            m1040(enumC18427, "%f:%_%t%L%m");
        }
        String strM28824 = c11781.m28824("diags.layout");
        if (strM28824 != null) {
            if (strM28824.equals("OLD")) {
                this.f1003 = new EnumMap(EnumC18425.class);
                m1040(enumC18425, "%f:%l:%_%t%L%m");
                m1040(enumC18426, "%p%L%m");
                m1040(enumC18427, "%f:%_%t%L%m");
            } else {
                String[] strArrSplit = strM28824.split("\\|");
                int length = strArrSplit.length;
                if (length == 2) {
                    m1040(enumC18426, strArrSplit[1]);
                } else if (length == 3) {
                    m1040(enumC18427, strArrSplit[2]);
                    m1040(enumC18426, strArrSplit[1]);
                }
                m1040(enumC18425, strArrSplit[0]);
            }
        }
        String strM28825 = c11781.m28824("diags.sourcePosition");
        if (strM28825 != null && strM28825.equals("bottom")) {
            enumC19131 = EnumC19131.BOTTOM;
        } else {
            enumC19131 = EnumC19131.AFTER_SUMMARY;
        }
        this.f1001 = enumC19131;
        String strM28826 = c11781.m28824("diags.indent");
        if (strM28826 != null) {
            String[] strArrSplit2 = strM28826.split("\\|");
            try {
                int length2 = strArrSplit2.length;
                if (length2 != 2) {
                    if (length2 != 3) {
                        if (length2 != 4) {
                            if (length2 == 5) {
                                m1041(EnumC21989.JLS, Integer.parseInt(strArrSplit2[4]));
                            }
                        }
                        m1041(enumC219811, Integer.parseInt(strArrSplit2[3]));
                    }
                    m1041(enumC219812, Integer.parseInt(strArrSplit2[2]));
                    m1041(enumC219810, Integer.parseInt(strArrSplit2[1]));
                } else {
                    m1041(enumC219810, Integer.parseInt(strArrSplit2[1]));
                }
                m1041(enumC21989, Integer.parseInt(strArrSplit2[0]));
            } catch (NumberFormatException unused) {
                m1038();
            }
        }
    }

    public C0079() {
        super(EnumSet.of(EnumC21989.SUMMARY, EnumC21989.DETAILS, EnumC21989.SUBDIAGNOSTICS, EnumC21989.SOURCE));
        this.f1003 = new EnumMap(EnumC18425.class);
        m1040(EnumC18425.DEFAULT_POS_FORMAT, "%f:%l:%_%p%L%m");
        m1040(EnumC18425.DEFAULT_NO_POS_FORMAT, "%p%L%m");
        m1040(EnumC18425.DEFAULT_CLASS_FORMAT, "%f:%_%p%L%m");
        m1038();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1038() {
        this.f1002 = new HashMap();
        m1041(EnumC21989.SUMMARY, 0);
        m1041(EnumC21989.DETAILS, 2);
        m1041(EnumC21989.SUBDIAGNOSTICS, 4);
        m1041(EnumC21989.SOURCE, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1039(EnumC21989 enumC21989) {
        return ((Integer) this.f1002.get(enumC21989)).intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1041(EnumC21989 enumC21989, int i) {
        this.f1002.put(enumC21989, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1040(EnumC18425 enumC18425, String str) {
        this.f1003.put(enumC18425, str);
    }
}
