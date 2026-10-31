package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class XMSSAddress {
    public final int keyAndMask;
    public final int layerAddress;
    public final long treeAddress;
    public final int type;

    public abstract class Builder {
        public final int type;
        public int layerAddress = 0;
        public long treeAddress = 0;
        public int keyAndMask = 0;

        public Builder(int i) {
            this.type = i;
        }

        public abstract XMSSAddress build();

        public abstract Builder getThis();

        public Builder withKeyAndMask(int i) {
            this.keyAndMask = i;
            return getThis();
        }

        public Builder withLayerAddress(int i) {
            this.layerAddress = i;
            return getThis();
        }

        public Builder withTreeAddress(long j) {
            this.treeAddress = j;
            return getThis();
        }
    }

    public XMSSAddress(Builder builder) {
        this.layerAddress = builder.layerAddress;
        this.treeAddress = builder.treeAddress;
        this.type = builder.type;
        this.keyAndMask = builder.keyAndMask;
    }

    public final int getKeyAndMask() {
        return this.keyAndMask;
    }

    public final int getLayerAddress() {
        return this.layerAddress;
    }

    public final long getTreeAddress() {
        return this.treeAddress;
    }

    public final int getType() {
        return this.type;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[32];
        Pack.intToBigEndian(this.layerAddress, bArr, 0);
        Pack.longToBigEndian(this.treeAddress, bArr, 4);
        Pack.intToBigEndian(this.type, bArr, 12);
        Pack.intToBigEndian(this.keyAndMask, bArr, 28);
        return bArr;
    }
}
