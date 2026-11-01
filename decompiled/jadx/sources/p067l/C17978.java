package p067l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17978 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f53694 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final Class f53695 = C5909.class;

    /* JADX INFO: renamed from: ֫ */
    public final Class m40921() {
        return this.f53695;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40924(C17978 c17978) {
        for (Map.Entry entry : c17978.f53694.entrySet()) {
            C15525.putIfAbsent(this.f53694, (String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40923(String str, C5909 c5909) {
        C15525.putIfAbsent(this.f53694, C13817.m31481(str), c5909);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m40922(String str) {
        return this.f53694.get(C13817.m31481(str));
    }
}
