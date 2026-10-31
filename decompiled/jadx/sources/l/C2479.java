package l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2479 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f7895;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f7896;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f7897;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f7898;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f7899;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f7900;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f7901;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f7902;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7903;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f7904;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Bundle f7905;

    public C2479() {
        this.f7903 = new ArrayList();
        this.f7899 = -1L;
    }

    public C2479(C19413 c19413) {
        ArrayList arrayList = new ArrayList();
        this.f7903 = arrayList;
        this.f7899 = -1L;
        this.f7898 = c19413.f62803;
        this.f7896 = c19413.f62802;
        this.f7904 = c19413.f62801;
        this.f7897 = c19413.f62806;
        this.f7901 = c19413.f62807;
        this.f7895 = c19413.f62808;
        this.f7902 = c19413.f62799;
        this.f7900 = c19413.f62805;
        ArrayList arrayList2 = c19413.f62800;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        this.f7899 = c19413.f62809;
        this.f7905 = c19413.f62804;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7956(int i, long j, float f, long j2) {
        this.f7898 = i;
        this.f7896 = j;
        this.f7897 = j2;
        this.f7904 = f;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7957() {
        this.f7895 = 822L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19413 m7955() {
        return new C19413(this.f7898, this.f7896, this.f7901, this.f7904, this.f7895, this.f7902, this.f7900, this.f7897, this.f7903, this.f7899, this.f7905);
    }
}
