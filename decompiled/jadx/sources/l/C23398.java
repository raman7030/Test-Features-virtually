package l;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4LG */
/* JADX INFO: loaded from: classes2.dex */
public final class C23398 extends AbstractC16342 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3643 f75157;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f75158;

    public C23398() {
        super("");
        this.f75158 = -1;
        mo4051((C3328) null);
    }

    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("MVS", "yyyy/MM/dd HH:mm", null);
    }

    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        int i = this.f75158;
        if (i == 0) {
            if (m38493(str)) {
                C10384 c10384 = new C10384();
                c10384.m26198(str);
                String strM38492 = m38492(2);
                String strM38493 = m38492(1);
                c10384.m26194(strM38492);
                if ("PS".equals(strM38493)) {
                    c10384.m26181(0);
                    return c10384;
                }
                if (!"PO".equals(strM38493) && !"PO-E".equals(strM38493)) {
                    return null;
                }
                c10384.m26181(1);
                return c10384;
            }
            boolean zStartsWith = str.startsWith("Migrated");
            if (!zStartsWith && !str.startsWith("ARCIVE")) {
                return null;
            }
            C10384 c10385 = new C10384();
            c10385.m26198(str);
            c10385.m26181(3);
            c10385.m26194(str.split("\\s+")[zStartsWith ? (char) 1 : (char) 5]);
            return c10385;
        }
        if (i != 1) {
            if (i == 2) {
                return this.f75157.mo11134(str);
            }
            if (i == 3) {
                return m51845(3, str);
            }
            if (i != 4) {
                return null;
            }
            return m51845(4, str);
        }
        C10384 c10386 = new C10384();
        if (m38493(str)) {
            c10386.m26198(str);
            String strM38494 = m38492(1);
            String str2 = m38492(2) + " " + m38492(3);
            c10386.m26194(strM38494);
            c10386.m26181(0);
            try {
                c10386.m26185(m38494(str2));
            } catch (ParseException unused) {
            }
            return c10386;
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        c10386.m26198(str);
        c10386.m26194(str.split(" ")[0]);
        c10386.m26181(0);
        return c10386;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10384 m51845(int i, String str) {
        if (!m38493(str)) {
            return null;
        }
        C10384 c10384 = new C10384();
        if (!m38492(i).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        c10384.m26198(str);
        c10384.m26194(m38492(2));
        c10384.m26181(0);
        return c10384;
    }

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final List mo11132(LinkedList linkedList) {
        if (linkedList != null && !linkedList.isEmpty()) {
            String str = (String) linkedList.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                this.f75158 = 0;
                m38495("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?\\S+\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (str.contains("Name") && str.contains("Id")) {
                this.f75158 = 1;
                m38495("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (str.startsWith("total")) {
                this.f75158 = 2;
                this.f75157 = new C3643(null, false);
            } else if (str.indexOf("Spool Files") >= 30) {
                this.f75158 = 3;
                m38495("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (!str.startsWith("JOBNAME") || str.indexOf("JOBID") <= 8) {
                this.f75158 = -1;
            } else {
                this.f75158 = 4;
                m38495("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            }
            if (this.f75158 != 3) {
                linkedList.remove(0);
            }
        }
        return linkedList;
    }
}
