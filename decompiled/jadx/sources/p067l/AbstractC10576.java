package p067l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10576 {

    /* JADX INFO: renamed from: ֫ */
    public int f29287;

    /* JADX INFO: renamed from: ۧ */
    public int f29288;

    /* JADX INFO: renamed from: ܽ */
    public int f29289;

    /* JADX INFO: renamed from: ᩳ */
    public int f29290;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5530(C11996 c11996, HashMap map);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5531(C14677 c14677, SparseArray sparseArray);

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo5532();

    /* JADX INFO: renamed from: ֫ */
    public final C20635 m24369() {
        if (!mo5532()) {
            throw new UnsupportedOperationException();
        }
        return (C20635) this;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m24373() {
        return this.f29289;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m24370() {
        return this.f29287;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m24372() {
        return this.f29290;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24371() {
        return this.f29288;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24368(C11996 c11996, HashMap map, String str) {
        C12826.requireNonNull(str);
        Integer numValueOf = (Integer) map.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(map.size());
            map.put(str, numValueOf);
        }
        c11996.m27461(numValueOf.intValue());
    }
}
