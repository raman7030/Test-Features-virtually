package p067l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۧۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12803 {
    /* JADX INFO: renamed from: ֫ */
    public static int m29352(List list, InterfaceC18263 interfaceC18263, Comparable comparable, Comparator comparator, EnumC4085 enumC4085, EnumC11975 enumC11975) {
        AbstractList abstractListM21989 = C9468.m21989(list, interfaceC18263);
        comparator.getClass();
        enumC4085.getClass();
        enumC11975.getClass();
        if (!(abstractListM21989 instanceof RandomAccess)) {
            abstractListM21989 = new ArrayList(abstractListM21989);
        }
        int size = abstractListM21989.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(comparable, abstractListM21989.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + enumC4085.mo8220(comparator, comparable, abstractListM21989.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return enumC11975.mo11395(i);
    }
}
