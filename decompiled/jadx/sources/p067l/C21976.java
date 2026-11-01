package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1FH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21976 {

    /* JADX INFO: renamed from: ܽ */
    public static Pattern f69054 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f69055;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f69056;

    /* JADX INFO: renamed from: ֫ */
    public final int m49531() {
        return this.f69055.size();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m49536(int i) {
        return ((Integer) this.f69056.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24657 m49534(int i) {
        return (C24657) this.f69055.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15939 m49532(int i) {
        return (C15939) this.f69055.get(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C8564 m49535(int i) {
        return (C8564) this.f69055.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21976 m49530(CharSequence charSequence) throws C3870, IOException {
        C9196 c9196 = new C9196();
        c9196.m21166(new C14723(charSequence));
        C21976 c21976 = new C21976();
        c21976.f69055 = new ArrayList();
        c21976.f69056 = new ArrayList();
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        while (true) {
            int iM21167 = c9196.m21167();
            if (iM21167 == 1) {
                return c21976;
            }
            if (iM21167 == 2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < c9196.m21163(); i++) {
                    String strM21164 = c9196.m21164(i);
                    String strM21181 = c9196.m21181(i);
                    String strM21179 = c9196.m21179(i);
                    if ("xmlns".equals(strM21181)) {
                        arrayList2.add(new C24657(c9196.m21174(i).m40851(), strM21164, strM21179));
                    } else {
                        arrayList.add(new C18622(c9196.m21177(i), strM21181, strM21164, strM21179, c9196.m21172(i).clone(), c9196.m21174(i).clone()));
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c21976.m49533(0, (C24657) it.next());
                }
                C15939 c15939 = new C15939(c9196.m21182(), c9196.m21183(), c9196.m21173(), arrayList);
                c21976.m49533(1, c15939);
                stack.push(c15939);
                stack2.push(arrayList2);
            } else if (iM21167 == 3) {
                c21976.m49533(2, stack.pop());
                Iterator it2 = C9468.m21992((ArrayList) stack2.pop()).iterator();
                while (it2.hasNext()) {
                    c21976.m49533(3, (C24657) it2.next());
                }
            } else if (iM21167 == 4) {
                String strM21175 = c9196.m21175();
                if (!f69054.matcher(strM21175).matches()) {
                    c21976.m49533(4, new C8564(strM21175, c9196.m21182()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49533(int i, Object obj) {
        this.f69056.add(Integer.valueOf(i));
        this.f69055.add(obj);
    }
}
