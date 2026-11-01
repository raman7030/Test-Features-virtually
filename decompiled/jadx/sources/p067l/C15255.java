package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15255 {

    /* JADX INFO: renamed from: ֫ */
    public final Exception f43541;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f43542;

    public C15255(ArrayList arrayList, Exception exc) {
        this.f43542 = arrayList;
        this.f43541 = exc;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15255 m34714(ArrayList arrayList) {
        return new C15255(arrayList, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15255 m34713(Exception exc) {
        return new C15255(new ArrayList(), exc);
    }
}
