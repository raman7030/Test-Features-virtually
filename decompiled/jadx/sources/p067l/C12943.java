package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes3.dex */
public final class C12943 {

    /* JADX INFO: renamed from: ֫ */
    public final List f36398;

    /* JADX INFO: renamed from: ۧ */
    public final String f36399;

    /* JADX INFO: renamed from: ܽ */
    public final int f36400;

    /* JADX INFO: renamed from: ᩳ */
    public final int f36401;

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public C12943(ArrayList arrayList, int i, int i2) {
        String strM8579;
        this.f36401 = i;
        this.f36400 = i2;
        if (arrayList.isEmpty()) {
            strM8579 = null;
        } else {
            C4225 c4225 = (C4225) arrayList.get(0);
            if ("Name".equalsIgnoreCase(c4225.m8578())) {
                strM8579 = c4225.m8579();
            } else {
                strM8579 = null;
            }
        }
        this.f36399 = strM8579;
        this.f36398 = C21562.unmodifiableList(new ArrayList(arrayList));
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m29670() {
        return this.f36399;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m29672() {
        return this.f36401;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m29671() {
        return this.f36400;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m29669() {
        return this.f36398;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m29668(String str) {
        for (C4225 c4225 : this.f36398) {
            if (c4225.m8578().equalsIgnoreCase(str)) {
                return c4225.m8579();
            }
        }
        return null;
    }
}
