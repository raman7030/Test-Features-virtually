package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes2.dex */
public class View {
    public final byte[] communicatedBits;
    public final int[] inputShare;
    public final int[] outputShare;

    public View(PicnicEngine picnicEngine) {
        int i = picnicEngine.stateSizeWords;
        this.inputShare = new int[i];
        this.communicatedBits = new byte[picnicEngine.andSizeBytes];
        this.outputShare = new int[i];
    }
}
