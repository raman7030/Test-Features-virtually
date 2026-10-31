package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14701 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f44903;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34992(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC14701) it.next()).f44903;
        }
        return i;
    }

    EnumC14701(int i) {
        this.f44903 = i;
    }
}
