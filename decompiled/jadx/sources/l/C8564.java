package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8564 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9270 m22277(InterfaceC13206 interfaceC13206, EnumC20559 enumC20559) {
        ?? arrayDeque = new ArrayDeque();
        InterfaceC13206 interfaceC13206M22278 = m22278((ArrayDeque) arrayDeque, interfaceC13206);
        if (enumC20559 == EnumC20559.YES) {
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            for (List list : arrayDeque) {
                if (!list.isEmpty()) {
                    AbstractC5144 abstractC5144 = (AbstractC5144) list.get(0);
                    abstractC5144.getClass();
                    int iM19455 = C7260.m19455(abstractC5144);
                    if (iM19455 < i) {
                        ArrayList arrayList = new ArrayList((Collection) arrayDeque);
                        Collections.rotate(arrayList, -(i2 + 1));
                        arrayDeque = arrayList;
                        break;
                    }
                    i2 = i3;
                    i = iM19455;
                }
                i3++;
            }
        }
        return new C9270(interfaceC13206M22278, AbstractC14545.m34730((Iterable) arrayDeque));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC13206 m22278(ArrayDeque arrayDeque, InterfaceC13206 interfaceC13206) {
        int i = C6447.f19933[interfaceC13206.mo987().ordinal()];
        if (i == 1) {
            return m22278(arrayDeque, ((InterfaceC7378) interfaceC13206).getType());
        }
        if (i == 2) {
            InterfaceC11612 interfaceC11612 = (InterfaceC11612) interfaceC13206;
            if (interfaceC11612.mo28509().mo987() == EnumC3329.ARRAY_TYPE) {
                InterfaceC13206 interfaceC13206M22278 = m22278(arrayDeque, interfaceC11612.mo28509());
                arrayDeque.addFirst(AbstractC14545.copyOf((Collection) interfaceC11612.getAnnotations()));
                return interfaceC13206M22278;
            }
        }
        return interfaceC13206;
    }
}
