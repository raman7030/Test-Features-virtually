package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10977 {
    TRANSITIVE(32),
    STATIC_PHASE(64),
    SYNTHETIC(4096),
    MANDATED(32768),
    EXTRA(65536);


    /* JADX INFO: renamed from: ᩸ */
    public final int f30413;

    /* JADX INFO: renamed from: ֫ */
    public static int m25331(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC10977) it.next()).f30413;
        }
        return i;
    }

    EnumC10977(int i) {
        this.f30413 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("ACC_%s (0x%04x", name(), Integer.valueOf(this.f30413));
    }
}
