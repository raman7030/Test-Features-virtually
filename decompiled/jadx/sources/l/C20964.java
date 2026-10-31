package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAXS */
/* JADX INFO: loaded from: classes5.dex */
public class C20964 extends C23785 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m47783(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC16233 interfaceC16233) {
        C11233.m27805(iterable, "<this>");
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (interfaceC16233 != null) {
                sb.append((CharSequence) interfaceC16233.invoke(next));
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
