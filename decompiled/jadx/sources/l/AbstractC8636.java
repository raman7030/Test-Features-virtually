package l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8636 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26369;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f26370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26371;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26372;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3216(C10130 c10130, HashMap map);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3217(C12951 c12951, SparseArray sparseArray);

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo3218();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19220 m22400() {
        if (!mo3218()) {
            throw new UnsupportedOperationException();
        }
        return (C19220) this;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m22404() {
        return this.f26371;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22401() {
        return this.f26369;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m22403() {
        return this.f26372;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22402() {
        return this.f26370;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22399(C10130 c10130, HashMap map, String str) {
        C11003.requireNonNull(str);
        Integer numValueOf = (Integer) map.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(map.size());
            map.put(str, numValueOf);
        }
        c10130.m25441(numValueOf.intValue());
    }
}
