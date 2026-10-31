package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1FH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20631 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Pattern f66373 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f66374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f66375;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47204() {
        return this.f66374.size();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47209(int i) {
        return ((Integer) this.f66375.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23452 m47207(int i) {
        return (C23452) this.f66374.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14279 m47205(int i) {
        return (C14279) this.f66374.get(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6519 m47208(int i) {
        return (C6519) this.f66374.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20631 m47203(CharSequence charSequence) throws C1580, IOException {
        C7184 c7184 = new C7184();
        c7184.m19219(new C13000(charSequence));
        C20631 c20631 = new C20631();
        c20631.f66374 = new ArrayList();
        c20631.f66375 = new ArrayList();
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        while (true) {
            int iM19220 = c7184.m19220();
            if (iM19220 == 1) {
                return c20631;
            }
            if (iM19220 == 2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < c7184.m19216(); i++) {
                    String strM19217 = c7184.m19217(i);
                    String strM19234 = c7184.m19234(i);
                    String strM19232 = c7184.m19232(i);
                    if ("xmlns".equals(strM19234)) {
                        arrayList2.add(new C23452(c7184.m19227(i).m38634(), strM19217, strM19232));
                    } else {
                        arrayList.add(new C17102(c7184.m19230(i), strM19234, strM19217, strM19232, c7184.m19225(i).clone(), c7184.m19227(i).clone()));
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c20631.m47206(0, (C23452) it.next());
                }
                C14279 c14279 = new C14279(c7184.m19235(), c7184.m19236(), c7184.m19226(), arrayList);
                c20631.m47206(1, c14279);
                stack.push(c14279);
                stack2.push(arrayList2);
            } else if (iM19220 == 3) {
                c20631.m47206(2, stack.pop());
                Iterator it2 = C7470.m20017((ArrayList) stack2.pop()).iterator();
                while (it2.hasNext()) {
                    c20631.m47206(3, (C23452) it2.next());
                }
            } else if (iM19220 == 4) {
                String strM19228 = c7184.m19228();
                if (!f66373.matcher(strM19228).matches()) {
                    c20631.m47206(4, new C6519(strM19228, c7184.m19235()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47206(int i, Object obj) {
        this.f66375.add(Integer.valueOf(i));
        this.f66374.add(obj);
    }
}
