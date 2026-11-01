package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38SD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5919 {

    /* JADX INFO: renamed from: ֫ */
    public final int f14611;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f14612;

    /* JADX INFO: renamed from: ܽ */
    public final List f14613;

    /* JADX INFO: renamed from: ᩳ */
    public final String f14614;

    /* JADX INFO: renamed from: ֫ */
    public final int m13304() {
        int i = this.f14611;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public C5919(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f14614 = str;
        this.f14611 = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        this.f14613 = listUnmodifiableList;
        this.f14612 = bArr;
    }
}
