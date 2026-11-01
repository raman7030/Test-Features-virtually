package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAXS */
/* JADX INFO: loaded from: classes5.dex */
public class C22293 extends C24974 {
    /* JADX INFO: renamed from: ֫ */
    public static final void m50113(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC17797 interfaceC17797) {
        C13045.m29867(iterable, "<this>");
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (interfaceC17797 != null) {
                sb.append((CharSequence) interfaceC17797.invoke(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }
}
