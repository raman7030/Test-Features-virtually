package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I9O8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15314 {

    /* JADX INFO: renamed from: ֫ */
    public long f43703;

    /* JADX INFO: renamed from: ۧ */
    public String f43704;

    /* JADX INFO: renamed from: ܽ */
    public C10895 f43705;

    /* JADX INFO: renamed from: ᩳ */
    public long f43706;

    public C15314(C10895 c10895, long j) {
        this.f43705 = c10895;
        this.f43704 = c10895.getPartitionName() + ".img";
        long dataLength = 0;
        long numBlocks = 0L;
        for (C4189 c4189 : c10895.getOperationsList()) {
            dataLength += c4189.getDataLength();
            Iterator it = c4189.getDstExtentsList().iterator();
            while (it.hasNext()) {
                numBlocks += ((C14052) it.next()).getNumBlocks() * j;
            }
        }
        this.f43703 = dataLength;
        this.f43706 = numBlocks;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m34854() {
        return this.f43704;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m34853() {
        return this.f43703;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m34855() {
        return this.f43706;
    }

    public final String toString() {
        return "PayloadEntry{name='" + this.f43704 + "', size=" + this.f43706 + ", cSize=" + this.f43703 + '}';
    }
}
