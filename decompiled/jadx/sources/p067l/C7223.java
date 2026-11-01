package p067l;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAO9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7223 extends ArrayList {

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ int f18850 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public static Pattern f18851 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ֫ */
    public static C7223 m16562(C9196 c9196, boolean z) {
        C20635 c20635;
        C7223 c7223 = new C7223(1);
        Stack stack = new Stack();
        Matcher matcher = f18851.matcher("");
        while (true) {
            int iM21167 = c9196.m21167();
            if (iM21167 == 1) {
                return c7223;
            }
            if (iM21167 == 2) {
                if (stack.isEmpty()) {
                    c20635 = new C20635();
                    c7223.add(c20635);
                } else {
                    c20635 = new C20635();
                    ((C20635) stack.peek()).f63752.add(c20635);
                }
                stack.push(c20635);
                c20635.f29290 = c9196.m21170();
                c20635.f29288 = c9196.m21180();
                c20635.f63754 = c9196.m21173();
                c20635.f29289 = c9196.m21182();
                c20635.f29287 = c9196.m21168();
                int iM21163 = c9196.m21163();
                ArrayList arrayList = c20635.f63753;
                arrayList.ensureCapacity(iM21163);
                for (int i = 0; i < c9196.m21163(); i++) {
                    if (!"xmlns".equals(c9196.m21181(i))) {
                        C19964 c19964 = new C19964();
                        c19964.f60594 = c9196.m21164(i);
                        c19964.f60598 = c9196.m21179(i);
                        C17951 c17951M21172 = c9196.m21172(i);
                        c19964.f60601 = c17951M21172.m40851();
                        c19964.f60597 = c17951M21172.m40842();
                        c19964.f60600 = c17951M21172.m40849();
                        c19964.f60599 = c17951M21172.m40847();
                        C17951 c17951M21174 = c9196.m21174(i);
                        c19964.f60602 = c17951M21174.m40851();
                        c19964.f60603 = c17951M21174.m40842();
                        c19964.f60596 = c17951M21174.m40849();
                        c19964.f60595 = c17951M21174.m40847();
                        arrayList.add(c19964);
                    }
                }
            } else if (iM21167 == 3) {
                ((C20635) stack.pop()).f29288 = c9196.m21180();
            } else if (iM21167 == 4 && (!z || !matcher.reset(c9196.m21175()).matches())) {
                C3199 c3199 = new C3199();
                c3199.f6210 = c9196.m21175();
                c3199.f29289 = c9196.m21182();
                c3199.f29287 = c9196.m21168();
                c3199.f29290 = c9196.m21170();
                c3199.f29288 = c9196.m21180();
                if (stack.isEmpty()) {
                    throw new C3870("Unexpected text: " + c3199.f6210.toString().trim(), c9196);
                }
                ((C20635) stack.peek()).f63752.add(c3199);
            }
        }
    }
}
