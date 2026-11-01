package p067l;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4LG */
/* JADX INFO: loaded from: classes2.dex */
public final class C24605 extends AbstractC17899 {

    /* JADX INFO: renamed from: ܳ */
    public C5830 f77903;

    /* JADX INFO: renamed from: ܿ */
    public int f77904;

    public C24605() {
        super("");
        this.f77904 = -1;
        mo6295((C5531) null);
    }

    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("MVS", "yyyy/MM/dd HH:mm", null);
    }

    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        int i = this.f77904;
        if (i == 0) {
            if (m40709(str)) {
                C12237 c12237 = new C12237();
                c12237.m28227(str);
                String strM40708 = m40708(2);
                String strM40709 = m40708(1);
                c12237.m28223(strM40708);
                if ("PS".equals(strM40709)) {
                    c12237.m28210(0);
                    return c12237;
                }
                if (!"PO".equals(strM40709) && !"PO-E".equals(strM40709)) {
                    return null;
                }
                c12237.m28210(1);
                return c12237;
            }
            boolean zStartsWith = str.startsWith("Migrated");
            if (!zStartsWith && !str.startsWith("ARCIVE")) {
                return null;
            }
            C12237 c12238 = new C12237();
            c12238.m28227(str);
            c12238.m28210(3);
            c12238.m28223(str.split("\\s+")[zStartsWith ? (char) 1 : (char) 5]);
            return c12238;
        }
        if (i != 1) {
            if (i == 2) {
                return this.f77903.mo13110(str);
            }
            if (i == 3) {
                return m54243(3, str);
            }
            if (i != 4) {
                return null;
            }
            return m54243(4, str);
        }
        C12237 c12239 = new C12237();
        if (m40709(str)) {
            c12239.m28227(str);
            String strM407010 = m40708(1);
            String str2 = m40708(2) + " " + m40708(3);
            c12239.m28223(strM407010);
            c12239.m28210(0);
            try {
                c12239.m28214(m40710(str2));
            } catch (ParseException unused) {
            }
            return c12239;
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        c12239.m28227(str);
        c12239.m28223(str.split(" ")[0]);
        c12239.m28210(0);
        return c12239;
    }

    /* JADX INFO: renamed from: ֫ */
    private C12237 m54243(int i, String str) {
        if (!m40709(str)) {
            return null;
        }
        C12237 c12237 = new C12237();
        if (!m40708(i).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        c12237.m28227(str);
        c12237.m28223(m40708(2));
        c12237.m28210(0);
        return c12237;
    }

    @Override // p067l.AbstractC13578, p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final List mo13108(LinkedList linkedList) {
        if (linkedList != null && !linkedList.isEmpty()) {
            String str = (String) linkedList.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                this.f77904 = 0;
                m40711("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?\\S+\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (str.contains("Name") && str.contains("Id")) {
                this.f77904 = 1;
                m40711("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (str.startsWith("total")) {
                this.f77904 = 2;
                this.f77903 = new C5830(null, false);
            } else if (str.indexOf("Spool Files") >= 30) {
                this.f77904 = 3;
                m40711("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (!str.startsWith("JOBNAME") || str.indexOf("JOBID") <= 8) {
                this.f77904 = -1;
            } else {
                this.f77904 = 4;
                m40711("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            }
            if (this.f77904 != 3) {
                linkedList.remove(0);
            }
        }
        return linkedList;
    }
}
