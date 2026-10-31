package l;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAO9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5108 extends ArrayList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16016 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Pattern f16017 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5108 m14654(C7184 c7184, boolean z) {
        C19220 c19220;
        C5108 c5108 = new C5108(1);
        Stack stack = new Stack();
        Matcher matcher = f16017.matcher("");
        while (true) {
            int iM19220 = c7184.m19220();
            if (iM19220 == 1) {
                return c5108;
            }
            if (iM19220 == 2) {
                if (stack.isEmpty()) {
                    c19220 = new C19220();
                    c5108.add(c19220);
                } else {
                    c19220 = new C19220();
                    ((C19220) stack.peek()).f60521.add(c19220);
                }
                stack.push(c19220);
                c19220.f26372 = c7184.m19223();
                c19220.f26370 = c7184.m19233();
                c19220.f60523 = c7184.m19226();
                c19220.f26371 = c7184.m19235();
                c19220.f26369 = c7184.m19221();
                int iM19216 = c7184.m19216();
                ArrayList arrayList = c19220.f60522;
                arrayList.ensureCapacity(iM19216);
                for (int i = 0; i < c7184.m19216(); i++) {
                    if (!"xmlns".equals(c7184.m19234(i))) {
                        C18514 c18514 = new C18514();
                        c18514.f57373 = c7184.m19217(i);
                        c18514.f57377 = c7184.m19232(i);
                        C16396 c16396M19225 = c7184.m19225(i);
                        c18514.f57380 = c16396M19225.m38634();
                        c18514.f57376 = c16396M19225.m38625();
                        c18514.f57379 = c16396M19225.m38632();
                        c18514.f57378 = c16396M19225.m38630();
                        C16396 c16396M19227 = c7184.m19227(i);
                        c18514.f57381 = c16396M19227.m38634();
                        c18514.f57382 = c16396M19227.m38625();
                        c18514.f57375 = c16396M19227.m38632();
                        c18514.f57374 = c16396M19227.m38630();
                        arrayList.add(c18514);
                    }
                }
            } else if (iM19220 == 3) {
                ((C19220) stack.pop()).f26370 = c7184.m19233();
            } else if (iM19220 == 4 && (!z || !matcher.reset(c7184.m19228()).matches())) {
                C0874 c0874 = new C0874();
                c0874.f3437 = c7184.m19228();
                c0874.f26371 = c7184.m19235();
                c0874.f26369 = c7184.m19221();
                c0874.f26372 = c7184.m19223();
                c0874.f26370 = c7184.m19233();
                if (stack.isEmpty()) {
                    throw new C1580("Unexpected text: " + c0874.f3437.toString().trim(), c7184);
                }
                ((C19220) stack.peek()).f60521.add(c0874);
            }
        }
    }
}
