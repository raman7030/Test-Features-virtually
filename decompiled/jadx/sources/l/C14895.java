package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14895 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC7840 f45444 = EnumC7840.UNKNOWN;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f45445 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f45446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f45447;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f45446) {
            return;
        }
        this.f45446 = true;
        m35340();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized List m35341(EnumC0784 enumC0784, C0078 c0078) {
        EnumC7840 enumC7840;
        List list;
        if (!this.f45446 && (enumC7840 = this.f45444) != EnumC7840.LIVE) {
            if (enumC0784 == EnumC0784.LIVE) {
                m35340();
                return Collections.EMPTY_LIST;
            }
            if (enumC0784 != EnumC0784.VOD) {
                if (c0078 == null) {
                    return Collections.EMPTY_LIST;
                }
                if (enumC7840 == EnumC7840.VOD) {
                    return Collections.singletonList(c0078);
                }
                this.f45445.add(c0078);
                return Collections.EMPTY_LIST;
            }
            m35339();
            if (c0078 != null) {
                this.f45445.add(c0078);
            }
            ArrayList arrayList = this.f45445;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m35342(C4951 c4951) {
        if (!this.f45446 && c4951 != null && this.f45444 != EnumC7840.LIVE) {
            if (c4951.f15612) {
                m35339();
            } else {
                m35340();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m35343() {
        if (!this.f45446 && this.f45444 != EnumC7840.LIVE) {
            m35339();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001d  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m35344(long j) {
        boolean z;
        if (j < 0) {
            z = false;
        } else if (!this.f45446 && this.f45444 == EnumC7840.VOD && this.f45447 == j) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m35345() {
        return (this.f45446 || this.f45444 != EnumC7840.VOD) ? -1L : this.f45447;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized List m35346() {
        List list;
        if (!this.f45446 && this.f45444 == EnumC7840.VOD) {
            ArrayList arrayList = this.f45445;
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized EnumC7840 m35347() {
        return this.f45444;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m35340() {
        EnumC7840 enumC7840 = this.f45444;
        EnumC7840 enumC7841 = EnumC7840.LIVE;
        if (enumC7840 != enumC7841) {
            this.f45444 = enumC7841;
            this.f45447++;
        }
        this.f45445.clear();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m35339() {
        EnumC7840 enumC7840 = this.f45444;
        EnumC7840 enumC7841 = EnumC7840.VOD;
        if (enumC7840 != enumC7841) {
            this.f45444 = enumC7841;
            this.f45447++;
        }
    }
}
