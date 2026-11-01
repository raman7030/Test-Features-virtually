package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M73F */
/* JADX INFO: loaded from: classes.dex */
public final class C23412 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C21545 f74565 = new C21545();

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f74566;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f74567;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f74568;

    public C23412(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z) {
        this.f74566 = abstractC17043;
        this.f74568 = abstractC17044;
        this.f74567 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23412 m52082(AbstractC17043 abstractC17043, boolean z) {
        AbstractC17043 abstractC17043M38678;
        if (z) {
            abstractC17043M38678 = abstractC17043.m38678(".compress" + abstractC17043.m38663());
        } else {
            abstractC17043M38678 = abstractC17043;
        }
        return new C23412(abstractC17043, abstractC17043M38678, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m52089() {
        return this.f74568;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m52088(List list, EnumC22742 enumC22742) throws IOException {
        if (!this.f74567) {
            return list;
        }
        try {
            ArrayList arrayListM52086 = m52086(list, enumC22742);
            m52087(arrayListM52086);
            m52083(arrayListM52086);
            m52084(list, enumC22742, null);
            ArrayList arrayList = new ArrayList(arrayListM52086.size());
            Iterator it = arrayListM52086.iterator();
            while (it.hasNext()) {
                arrayList.add(((C16705) it.next()).f49198);
            }
            return arrayList;
        } catch (IOException e) {
            m52084(list, enumC22742, e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX INFO: renamed from: ۧ */
    private ArrayList m52086(List list, EnumC22742 enumC22742) throws IOException {
        boolean z;
        if (list.isEmpty()) {
            throw new IOException("Compression output list is empty");
        }
        EnumC22742 enumC22743 = EnumC22742.NONE;
        AbstractC17043 abstractC17043 = this.f74568;
        if (enumC22742 == enumC22743 && (list.size() != 1 || !abstractC17043.equals(list.get(0)))) {
            throw new IOException("Unexpected non-split compression output");
        }
        ArrayList arrayList = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean zEquals = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC17043 abstractC17044 = (AbstractC17043) it.next();
            AbstractC17043 abstractC17043M52081 = m52081(abstractC17044, enumC22742);
            if (!hashSet.add(abstractC17043M52081.mo25505())) {
                throw new IOException(C6316.m14442(abstractC17043M52081, new StringBuilder("Duplicate compression output target: ")));
            }
            arrayList.add(new C16705(abstractC17044, abstractC17043M52081));
            zEquals |= abstractC17044.equals(abstractC17043);
            if (enumC22742 == EnumC22742.SEVEN_ZIP) {
                if (abstractC17044.getName().equals(abstractC17043.getName() + ".001")) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            z2 |= z;
        }
        if (enumC22742 == EnumC22742.ZIP && !zEquals) {
            throw new IOException("ZIP split output is missing the final volume");
        }
        if (enumC22742 != EnumC22742.SEVEN_ZIP || z2) {
            return arrayList;
        }
        throw new IOException("7z split output is missing the first volume");
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC17043 m52081(AbstractC17043 abstractC17043, EnumC22742 enumC22742) throws IOException {
        AbstractC17043 abstractC17044 = this.f74568;
        if (!C12826.equals(abstractC17044.getParent(), abstractC17043.getParent())) {
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Compression output is outside the working directory: ")));
        }
        EnumC22742 enumC22743 = EnumC22742.NONE;
        AbstractC17043 abstractC17045 = this.f74566;
        if (enumC22742 == enumC22743) {
            if (abstractC17044.equals(abstractC17043)) {
                return abstractC17045;
            }
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unexpected non-split compression output: ")));
        }
        if (enumC22742 != EnumC22742.ZIP) {
            String strM52080 = m52080(abstractC17043.getName(), 3, abstractC17044.getName(), ".");
            return abstractC17045.m38672().m38684(abstractC17045.getName() + strM52080);
        }
        if (abstractC17044.equals(abstractC17043)) {
            return abstractC17045;
        }
        String strM52081 = m52080(abstractC17043.getName(), 2, C4686.m9926(abstractC17044.getName()), ".z");
        String strM9926 = C4686.m9926(abstractC17045.getName());
        return abstractC17045.m38672().m38684(strM9926 + strM52081);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52080(String str, int i, String str2, String str3) throws IOException {
        boolean z;
        String strM40053 = C17588.m40053(str2, str3);
        if (!str.startsWith(strM40053)) {
            throw new IOException("Unexpected compression volume name: ".concat(str));
        }
        String strSubstring = str.substring(strM40053.length());
        if (strSubstring.length() >= i) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                z = true;
                if (i2 >= strSubstring.length()) {
                    z = true ^ z2;
                    break;
                }
                char cCharAt = strSubstring.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if (cCharAt == '0') {
                    z = false;
                }
                z2 |= z;
                i2++;
            }
            if (!z) {
                return str3.concat(strSubstring);
            }
        }
        throw new IOException("Unexpected compression volume name: ".concat(str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m52087(ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16705 c16705 = (C16705) it.next();
            AbstractC17043 abstractC17043 = c16705.f49195;
            AbstractC17043 abstractC17044 = c16705.f49198;
            if (!abstractC17043.mo25094() || !abstractC17043.mo25093()) {
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Compression output file is missing: ")));
            }
            boolean zMo25094 = abstractC17044.mo25094();
            c16705.f49197 = zMo25094;
            if (zMo25094 && abstractC17044.mo25087()) {
                throw new IOException(C6316.m14442(abstractC17044, new StringBuilder("Compression output target is a directory: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52083(ArrayList arrayList) throws IOException {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16705 c16705 = (C16705) it.next();
                boolean z = c16705.f49197;
                AbstractC17043 abstractC17043 = c16705.f49198;
                if (z) {
                    if (abstractC17043.mo29978() || (abstractC17043 instanceof C14912) || (abstractC17043 instanceof C14717)) {
                        C19056 c19056 = new C19056();
                        c16705.f49194 = c19056;
                        c19056.m43296(abstractC17043);
                    }
                    AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".compress_rollback");
                    if (!abstractC17043.mo25502(abstractC17043M38678)) {
                        throw new IOException("Unable to move compression target to rollback file: " + abstractC17043.mo25505());
                    }
                    c16705.f49196 = abstractC17043M38678;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C16705 c16706 = (C16705) it2.next();
                c16706.f49193 = true;
                AbstractC17043 abstractC17044 = c16706.f49198;
                c16706.f49195.m38656(abstractC17044, (Runnable) null);
                C19056 c19057 = c16706.f49194;
                if (c19057 != null) {
                    c19057.m43298(abstractC17044);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C16705 c16707 = (C16705) it3.next();
                AbstractC17043 abstractC17045 = c16707.f49196;
                if (abstractC17045 != null && abstractC17045.mo25094()) {
                    c16707.f49196.mo25503();
                }
            }
        } catch (IOException e) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C16705 c16708 = (C16705) arrayList.get(size);
                AbstractC17043 abstractC17046 = c16708.f49196;
                AbstractC17043 abstractC17047 = c16708.f49198;
                if (abstractC17046 != null) {
                    if (abstractC17046.mo25094()) {
                        if (c16708.f49193) {
                            m52085(c16708, e);
                        }
                        try {
                            c16708.f49196.m38659(abstractC17047, false, false, null);
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else {
                        e.addSuppressed(new IOException(C6316.m14442(abstractC17047, new StringBuilder("Compression rollback file is missing: "))));
                    }
                } else if (!c16708.f49197 && c16708.f49193) {
                    m52085(c16708, e);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52085(C16705 c16705, IOException iOException) {
        AbstractC17043 abstractC17043 = c16705.f49198;
        if (!abstractC17043.mo25094() || abstractC17043.mo25503()) {
            return;
        }
        iOException.addSuppressed(new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete published compression output: "))));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52084(List list, EnumC22742 enumC22742, IOException iOException) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
            try {
                m52081(abstractC17043, enumC22742);
                if (abstractC17043.mo25094() && !abstractC17043.mo25503() && iOException != null) {
                    iOException.addSuppressed(new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete temporary compression output: "))));
                }
            } catch (IOException unused) {
            }
        }
    }
}
