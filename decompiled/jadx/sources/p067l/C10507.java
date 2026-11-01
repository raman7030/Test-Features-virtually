package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10507 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: ֫ */
    public static C11178 m24246(InterfaceC14919 interfaceC14919, EnumC21907 enumC21907) {
        ?? arrayDeque = new ArrayDeque();
        InterfaceC14919 interfaceC14919M24247 = m24247((ArrayDeque) arrayDeque, interfaceC14919);
        if (enumC21907 == EnumC21907.YES) {
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            for (List list : arrayDeque) {
                if (!list.isEmpty()) {
                    AbstractC7257 abstractC7257 = (AbstractC7257) list.get(0);
                    abstractC7257.getClass();
                    int iM21421 = C9268.m21421(abstractC7257);
                    if (iM21421 < i) {
                        ArrayList arrayList = new ArrayList((Collection) arrayDeque);
                        Collections.rotate(arrayList, -(i2 + 1));
                        arrayDeque = arrayList;
                        break;
                    }
                    i2 = i3;
                    i = iM21421;
                }
                i3++;
            }
        }
        return new C11178(interfaceC14919M24247, AbstractC16192.m36879((Iterable) arrayDeque));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC14919 m24247(ArrayDeque arrayDeque, InterfaceC14919 interfaceC14919) {
        int i = C8495.f22806[interfaceC14919.mo3381().ordinal()];
        if (i == 1) {
            return m24247(arrayDeque, ((InterfaceC9380) interfaceC14919).getType());
        }
        if (i == 2) {
            InterfaceC13404 interfaceC13404 = (InterfaceC13404) interfaceC14919;
            if (interfaceC13404.mo30555().mo3381() == EnumC5532.ARRAY_TYPE) {
                InterfaceC14919 interfaceC14919M24247 = m24247(arrayDeque, interfaceC13404.mo30555());
                arrayDeque.addFirst(AbstractC16192.copyOf((Collection) interfaceC13404.getAnnotations()));
                return interfaceC14919M24247;
            }
        }
        return interfaceC14919;
    }
}
