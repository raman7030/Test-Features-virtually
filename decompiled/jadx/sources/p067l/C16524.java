package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes4.dex */
public final class C16524 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public EnumC9819 f48559 = EnumC9819.UNKNOWN;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f48560 = new ArrayList();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f48561;

    /* JADX INFO: renamed from: ᩹ */
    public long f48562;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f48561) {
            return;
        }
        this.f48561 = true;
        m37492();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized List m37493(EnumC3113 enumC3113, C2442 c2442) {
        EnumC9819 enumC9819;
        List list;
        if (!this.f48561 && (enumC9819 = this.f48559) != EnumC9819.LIVE) {
            if (enumC3113 == EnumC3113.LIVE) {
                m37492();
                return Collections.EMPTY_LIST;
            }
            if (enumC3113 != EnumC3113.VOD) {
                if (c2442 == null) {
                    return Collections.EMPTY_LIST;
                }
                if (enumC9819 == EnumC9819.VOD) {
                    return Collections.singletonList(c2442);
                }
                this.f48560.add(c2442);
                return Collections.EMPTY_LIST;
            }
            m37491();
            if (c2442 != null) {
                this.f48560.add(c2442);
            }
            ArrayList arrayList = this.f48560;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m37494(C7074 c7074) {
        if (!this.f48561 && c7074 != null && this.f48559 != EnumC9819.LIVE) {
            if (c7074.f18446) {
                m37491();
            } else {
                m37492();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m37495() {
        if (!this.f48561 && this.f48559 != EnumC9819.LIVE) {
            m37491();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001d  */
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m37496(long j) {
        boolean z;
        if (j < 0) {
            z = false;
        } else if (!this.f48561 && this.f48559 == EnumC9819.VOD && this.f48562 == j) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized long m37497() {
        return (this.f48561 || this.f48559 != EnumC9819.VOD) ? -1L : this.f48562;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized List m37498() {
        List list;
        if (!this.f48561 && this.f48559 == EnumC9819.VOD) {
            ArrayList arrayList = this.f48560;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized EnumC9819 m37499() {
        return this.f48559;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m37492() {
        EnumC9819 enumC9819 = this.f48559;
        EnumC9819 enumC98110 = EnumC9819.LIVE;
        if (enumC9819 != enumC98110) {
            this.f48559 = enumC98110;
            this.f48562++;
        }
        this.f48560.clear();
    }

    /* JADX INFO: renamed from: ۜ */
    private void m37491() {
        EnumC9819 enumC9819 = this.f48559;
        EnumC9819 enumC98110 = EnumC9819.VOD;
        if (enumC9819 != enumC98110) {
            this.f48559 = enumC98110;
            this.f48562++;
        }
    }
}
