package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes5.dex */
public final class C17466 extends AbstractC11145 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21916[] f53377;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f53378;

    @Override // l.InterfaceC3571
    public final int[] getStyle() {
        return null;
    }

    public C17466(String str, C21916[] c21916Arr) {
        this.f53378 = str;
        this.f53377 = (C21916[]) Arrays.copyOf(c21916Arr, c21916Arr.length);
    }

    @Override // l.InterfaceC3571
    public final String getValue() {
        return this.f53378;
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ᩶֫ */
    public final C21916[] mo10322() {
        C21916[] c21916Arr = this.f53377;
        if (c21916Arr == null) {
            return null;
        }
        return (C21916[]) Arrays.copyOf(c21916Arr, c21916Arr.length);
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ܰ֫ */
    public final C21916[] mo10320() {
        return m27656(mo10322());
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ᩺֫ */
    public final boolean mo10323() {
        C21916[] c21916Arr = this.f53377;
        return c21916Arr != null && c21916Arr.length > 0;
    }
}
