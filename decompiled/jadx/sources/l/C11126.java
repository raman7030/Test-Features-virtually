package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes3.dex */
public final class C11126 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f33398;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f33399;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33400;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33401;

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public C11126(ArrayList arrayList, int i, int i2) {
        String strM6422;
        this.f33401 = i;
        this.f33400 = i2;
        if (arrayList.isEmpty()) {
            strM6422 = null;
        } else {
            C1953 c1953 = (C1953) arrayList.get(0);
            if ("Name".equalsIgnoreCase(c1953.m6421())) {
                strM6422 = c1953.m6422();
            } else {
                strM6422 = null;
            }
        }
        this.f33399 = strM6422;
        this.f33398 = C20195.unmodifiableList(new ArrayList(arrayList));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m27608() {
        return this.f33399;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27610() {
        return this.f33401;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27609() {
        return this.f33400;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m27607() {
        return this.f33398;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27606(String str) {
        for (C1953 c1953 : this.f33398) {
            if (c1953.m6421().equalsIgnoreCase(str)) {
                return c1953.m6422();
            }
        }
        return null;
    }
}
