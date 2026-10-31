package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 590L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16132 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f49698;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f49699;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f49700;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49701;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16132 f49702;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final char f49703;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16132 f49704;

    public C16132(ArrayList arrayList, char c, boolean z, boolean z2, C16132 c16132) {
        this.f49701 = arrayList;
        this.f49703 = c;
        this.f49699 = z;
        this.f49698 = z2;
        this.f49704 = c16132;
        this.f49700 = arrayList.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38042() {
        return this.f49699;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38040() {
        return this.f49698;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m38044() {
        return this.f49700;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12897 m38043() {
        return (C12897) C18566.m43105(this.f49701, 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m38041(int i) {
        ArrayList arrayList = this.f49701;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(arrayList.size() - i, arrayList.size());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m38039(int i) {
        ArrayList arrayList = this.f49701;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(0, i);
    }
}
