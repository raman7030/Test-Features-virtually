package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M73F */
/* JADX INFO: loaded from: classes.dex */
public final class C22142 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C20177 f71844 = new C20177();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f71845;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f71846;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f71847;

    public C22142(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, boolean z) {
        this.f71845 = abstractC15440;
        this.f71847 = abstractC15441;
        this.f71846 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22142 m49744(AbstractC15440 abstractC15440, boolean z) {
        AbstractC15440 abstractC15440M36520;
        if (z) {
            abstractC15440M36520 = abstractC15440.m36520(".compress" + abstractC15440.m36505());
        } else {
            abstractC15440M36520 = abstractC15440;
        }
        return new C22142(abstractC15440, abstractC15440M36520, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m49751() {
        return this.f71847;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m49750(List list, EnumC21437 enumC21437) throws IOException {
        if (!this.f71846) {
            return list;
        }
        try {
            ArrayList arrayListM49748 = m49748(list, enumC21437);
            m49749(arrayListM49748);
            m49745(arrayListM49748);
            m49746(list, enumC21437, null);
            ArrayList arrayList = new ArrayList(arrayListM49748.size());
            Iterator it = arrayListM49748.iterator();
            while (it.hasNext()) {
                arrayList.add(((C15085) it.next()).f46080);
            }
            return arrayList;
        } catch (IOException e) {
            m49746(list, enumC21437, e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m49748(List list, EnumC21437 enumC21437) throws IOException {
        boolean z;
        if (list.isEmpty()) {
            throw new IOException("Compression output list is empty");
        }
        EnumC21437 enumC21438 = EnumC21437.NONE;
        AbstractC15440 abstractC15440 = this.f71847;
        if (enumC21437 == enumC21438 && (list.size() != 1 || !abstractC15440.equals(list.get(0)))) {
            throw new IOException("Unexpected non-split compression output");
        }
        ArrayList arrayList = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean zEquals = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC15440 abstractC15441 = (AbstractC15440) it.next();
            AbstractC15440 abstractC15440M49743 = m49743(abstractC15441, enumC21437);
            if (!hashSet.add(abstractC15440M49743.mo23554())) {
                throw new IOException(C4153.m12552(abstractC15440M49743, new StringBuilder("Duplicate compression output target: ")));
            }
            arrayList.add(new C15085(abstractC15441, abstractC15440M49743));
            zEquals |= abstractC15441.equals(abstractC15440);
            if (enumC21437 == EnumC21437.SEVEN_ZIP) {
                if (abstractC15441.getName().equals(abstractC15440.getName() + ".001")) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            z2 |= z;
        }
        if (enumC21437 == EnumC21437.ZIP && !zEquals) {
            throw new IOException("ZIP split output is missing the final volume");
        }
        if (enumC21437 != EnumC21437.SEVEN_ZIP || z2) {
            return arrayList;
        }
        throw new IOException("7z split output is missing the first volume");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC15440 m49743(AbstractC15440 abstractC15440, EnumC21437 enumC21437) throws IOException {
        AbstractC15440 abstractC15441 = this.f71847;
        if (!C11003.equals(abstractC15441.getParent(), abstractC15440.getParent())) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Compression output is outside the working directory: ")));
        }
        EnumC21437 enumC21438 = EnumC21437.NONE;
        AbstractC15440 abstractC15442 = this.f71845;
        if (enumC21437 == enumC21438) {
            if (abstractC15441.equals(abstractC15440)) {
                return abstractC15442;
            }
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unexpected non-split compression output: ")));
        }
        if (enumC21437 != EnumC21437.ZIP) {
            String strM49742 = m49742(abstractC15440.getName(), 3, abstractC15441.getName(), ".");
            return abstractC15442.m36514().m36526(abstractC15442.getName() + strM49742);
        }
        if (abstractC15441.equals(abstractC15440)) {
            return abstractC15442;
        }
        String strM49743 = m49742(abstractC15440.getName(), 2, C2439.m7878(abstractC15441.getName()), ".z");
        String strM7878 = C2439.m7878(abstractC15442.getName());
        return abstractC15442.m36514().m36526(strM7878 + strM49743);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49742(String str, int i, String str2, String str3) throws IOException {
        boolean z;
        String strM37867 = C16014.m37867(str2, str3);
        if (!str.startsWith(strM37867)) {
            throw new IOException("Unexpected compression volume name: ".concat(str));
        }
        String strSubstring = str.substring(strM37867.length());
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49749(ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15085 c15085 = (C15085) it.next();
            AbstractC15440 abstractC15440 = c15085.f46077;
            AbstractC15440 abstractC15441 = c15085.f46080;
            if (!abstractC15440.mo23120() || !abstractC15440.mo23119()) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Compression output file is missing: ")));
            }
            boolean zMo23120 = abstractC15441.mo23120();
            c15085.f46079 = zMo23120;
            if (zMo23120 && abstractC15441.mo23113()) {
                throw new IOException(C4153.m12552(abstractC15441, new StringBuilder("Compression output target is a directory: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49745(ArrayList arrayList) throws IOException {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C15085 c15085 = (C15085) it.next();
                boolean z = c15085.f46079;
                AbstractC15440 abstractC15440 = c15085.f46080;
                if (z) {
                    if (abstractC15440.mo27917() || (abstractC15440 instanceof C13198) || (abstractC15440 instanceof C12993)) {
                        C17558 c17558 = new C17558();
                        c15085.f46076 = c17558;
                        c17558.m41050(abstractC15440);
                    }
                    AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".compress_rollback");
                    if (!abstractC15440.mo23551(abstractC15440M36520)) {
                        throw new IOException("Unable to move compression target to rollback file: " + abstractC15440.mo23554());
                    }
                    c15085.f46078 = abstractC15440M36520;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C15085 c15086 = (C15085) it2.next();
                c15086.f46075 = true;
                AbstractC15440 abstractC15441 = c15086.f46080;
                c15086.f46077.m36498(abstractC15441, (Runnable) null);
                C17558 c17559 = c15086.f46076;
                if (c17559 != null) {
                    c17559.m41052(abstractC15441);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C15085 c15087 = (C15085) it3.next();
                AbstractC15440 abstractC15442 = c15087.f46078;
                if (abstractC15442 != null && abstractC15442.mo23120()) {
                    c15087.f46078.mo23552();
                }
            }
        } catch (IOException e) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C15085 c15088 = (C15085) arrayList.get(size);
                AbstractC15440 abstractC15443 = c15088.f46078;
                AbstractC15440 abstractC15444 = c15088.f46080;
                if (abstractC15443 != null) {
                    if (abstractC15443.mo23120()) {
                        if (c15088.f46075) {
                            m49747(c15088, e);
                        }
                        try {
                            c15088.f46078.m36501(abstractC15444, false, false, null);
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else {
                        e.addSuppressed(new IOException(C4153.m12552(abstractC15444, new StringBuilder("Compression rollback file is missing: "))));
                    }
                } else if (!c15088.f46079 && c15088.f46075) {
                    m49747(c15088, e);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49747(C15085 c15085, IOException iOException) {
        AbstractC15440 abstractC15440 = c15085.f46080;
        if (!abstractC15440.mo23120() || abstractC15440.mo23552()) {
            return;
        }
        iOException.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete published compression output: "))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49746(List list, EnumC21437 enumC21437, IOException iOException) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            try {
                m49743(abstractC15440, enumC21437);
                if (abstractC15440.mo23120() && !abstractC15440.mo23552() && iOException != null) {
                    iOException.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete temporary compression output: "))));
                }
            } catch (IOException unused) {
            }
        }
    }
}
