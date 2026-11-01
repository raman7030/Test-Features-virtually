package p067l;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4174 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f9194;

    /* JADX INFO: renamed from: ۧ */
    public final Object f9195;

    public String toString() {
        switch (this.f9194) {
            case 1:
                return ((Field) this.f9195).toString();
            default:
                return super.toString();
        }
    }

    public C4174() {
        this.f9194 = 0;
        this.f9195 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public void m8453(int i) {
        if (i < 0 || i > 6) {
            return;
        }
        ((LinkedHashMap) this.f9195).put(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m8454() {
        return ((LinkedHashMap) this.f9195).containsValue(4);
    }

    public C4174(Field field) {
        this.f9194 = 1;
        C12826.requireNonNull(field);
        this.f9195 = field;
    }
}
