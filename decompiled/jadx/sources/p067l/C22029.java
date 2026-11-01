package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C22029 {
    /* JADX INFO: renamed from: ֫ */
    public static void m49626(String str, C15992 c15992) {
        C24710 c24710;
        C15992 c15992M49628 = m49628(c15992);
        if (str.isEmpty() || c15992M49628 == null) {
            m49629(str);
            return;
        }
        ArrayList arrayListM49623 = m49623();
        Iterator it = arrayListM49623.iterator();
        do {
            if (!it.hasNext()) {
                c24710 = null;
                break;
            }
            c24710 = (C24710) it.next();
        } while (!c24710.f78205.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c24710 != null) {
            c24710.f78206 = c15992M49628;
            c24710.f78204 = jCurrentTimeMillis;
        } else {
            arrayListM49623.add(new C24710(str, c15992M49628, jCurrentTimeMillis));
        }
        if (arrayListM49623.size() > 100) {
            Collections.sort(arrayListM49623, new C19346());
            while (arrayListM49623.size() > 100) {
                C19925.m45229(arrayListM49623, 1);
            }
        }
        m49627(arrayListM49623);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15992 m49624(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList<C24710> arrayListM49623 = m49623();
        for (C24710 c24710 : arrayListM49623) {
            if (c24710.f78205.equals(str)) {
                C15992 c15992M49628 = m49628(c24710.f78206);
                if (c15992M49628 == null) {
                    return null;
                }
                c24710.f78204 = System.currentTimeMillis();
                m49627(arrayListM49623);
                return c15992M49628;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m49629(String str) {
        if (str.isEmpty()) {
            return;
        }
        ArrayList arrayListM49623 = m49623();
        for (int i = 0; i < arrayListM49623.size(); i++) {
            if (((C24710) arrayListM49623.get(i)).f78205.equals(str)) {
                arrayListM49623.remove(i);
                m49627(arrayListM49623);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15992 m49628(C15992 c15992) {
        int i = C18675.f55746[c15992.m36342().ordinal()];
        if (i == 1) {
            return new C15992(EnumC8617.OFF, -1, null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IncompatibleClassChangeError();
            }
            if (c15992.m36341() != null && !c15992.m36341().isEmpty()) {
                return new C15992(EnumC8617.FILE, -1, c15992.m36341());
            }
        } else if (c15992.m36340() >= 0) {
            return new C15992(EnumC8617.TRACK, c15992.m36340(), null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m49623() {
        byte[] bArrMo20201;
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
            if (interfaceC14100 != null && (bArrMo20201 = interfaceC14100.mo20201("vsts", (byte[]) null)) != null && bArrMo20201.length != 0) {
                C14677 c14677M33572 = C14677.m33572(bArrMo20201);
                c14677M33572.m33577(1699025495);
                int i = c14677M33572.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(C24710.m54349(c14677M33572));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49627(ArrayList arrayList) {
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        if (interfaceC14100 == null) {
            return;
        }
        C11996 c11996M45308 = C19965.m45308(1699025495);
        c11996M45308.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24710 c24710 = (C24710) it.next();
            c11996M45308.m27459(c24710.f78205);
            int i = C18675.f55746[c24710.f78206.m36342().ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    continue;
                }
            }
            c11996M45308.writeByte(i2);
            c11996M45308.writeInt(c24710.f78206.m36340());
            c11996M45308.m27444(c24710.f78206.m36341());
            c11996M45308.m27451(c24710.f78204);
        }
        interfaceC14100.edit().mo27877("vsts", c11996M45308.m27447()).apply();
    }
}
