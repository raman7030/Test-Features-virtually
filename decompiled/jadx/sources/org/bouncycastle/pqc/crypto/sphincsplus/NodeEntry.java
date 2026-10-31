package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes2.dex */
public class NodeEntry {
    public final int nodeHeight;
    public final byte[] nodeValue;

    public NodeEntry(byte[] bArr, int i) {
        this.nodeValue = bArr;
        this.nodeHeight = i;
    }
}
