package l;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1900 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6413;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f6414;

    public String toString() {
        switch (this.f6413) {
            case 1:
                return ((Field) this.f6414).toString();
            default:
                return super.toString();
        }
    }

    public C1900() {
        this.f6413 = 0;
        this.f6414 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m6251(int i) {
        if (i < 0 || i > 6) {
            return;
        }
        ((LinkedHashMap) this.f6414).put(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m6252() {
        return ((LinkedHashMap) this.f6414).containsValue(4);
    }

    public C1900(Field field) {
        this.f6413 = 1;
        C11003.requireNonNull(field);
        this.f6414 = field;
    }
}
