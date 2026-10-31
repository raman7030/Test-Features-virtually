package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes2.dex */
public class IndexedDigest {
    public final byte[] digest;
    public final int idx_leaf;
    public final long idx_tree;

    public IndexedDigest(long j, int i, byte[] bArr) {
        this.idx_tree = j;
        this.idx_leaf = i;
        this.digest = bArr;
    }
}
