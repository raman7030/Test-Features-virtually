package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9058 {
    TRANSITIVE(32),
    STATIC_PHASE(64),
    SYNTHETIC(4096),
    MANDATED(32768),
    EXTRA(65536);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f27475;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23386(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC9058) it.next()).f27475;
        }
        return i;
    }

    EnumC9058(int i) {
        this.f27475 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("ACC_%s (0x%04x", name(), Integer.valueOf(this.f27475));
    }
}
