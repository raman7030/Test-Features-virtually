package org.bouncycastle.pqc.crypto.xmss;

/* JADX INFO: loaded from: classes2.dex */
public class XMSSVerifierUtil {
    public static XMSSNode getRootNodeFromSignature(WOTSPlus wOTSPlus, int i, byte[] bArr, XMSSReducedSignature xMSSReducedSignature, OTSHashAddress oTSHashAddress, int i2) {
        if (bArr.length != wOTSPlus.getParams().getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (xMSSReducedSignature == null) {
            throw new NullPointerException("signature == null");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        LTreeAddress lTreeAddress = (LTreeAddress) ((LTreeAddress.Builder) ((LTreeAddress.Builder) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress())).withTreeAddress(oTSHashAddress.getTreeAddress())).withLTreeAddress(oTSHashAddress.getOTSAddress()).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress())).withTreeAddress(oTSHashAddress.getTreeAddress())).withTreeIndex(oTSHashAddress.getOTSAddress()).build();
        XMSSNode[] xMSSNodeArr = new XMSSNode[2];
        xMSSNodeArr[0] = XMSSNodeUtil.lTree(wOTSPlus, wOTSPlus.getPublicKeyFromSignature(bArr, xMSSReducedSignature.getWOTSPlusSignature(), oTSHashAddress), lTreeAddress);
        for (int i3 = 0; i3 < i; i3++) {
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(i3).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(hashTreeAddress.getKeyAndMask())).build();
            double dFloor = Math.floor(i2 / (1 << i3)) % 2.0d;
            HashTreeAddress.Builder builderWithTreeHeight = ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress())).withTreeAddress(hashTreeAddress2.getTreeAddress())).withTreeHeight(hashTreeAddress2.getTreeHeight());
            int treeIndex = hashTreeAddress2.getTreeIndex();
            if (dFloor == 0.0d) {
                hashTreeAddress = (HashTreeAddress) ((HashTreeAddress.Builder) builderWithTreeHeight.withTreeIndex(treeIndex / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask())).build();
                XMSSNode xMSSNodeRandomizeHash = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSNodeArr[0], (XMSSNode) xMSSReducedSignature.getAuthPath().get(i3), hashTreeAddress);
                xMSSNodeArr[1] = xMSSNodeRandomizeHash;
                xMSSNodeArr[1] = new XMSSNode(xMSSNodeRandomizeHash.getHeight() + 1, xMSSNodeArr[1].getValue());
            } else {
                hashTreeAddress = (HashTreeAddress) ((HashTreeAddress.Builder) builderWithTreeHeight.withTreeIndex((treeIndex - 1) / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask())).build();
                XMSSNode xMSSNodeRandomizeHash2 = XMSSNodeUtil.randomizeHash(wOTSPlus, (XMSSNode) xMSSReducedSignature.getAuthPath().get(i3), xMSSNodeArr[0], hashTreeAddress);
                xMSSNodeArr[1] = xMSSNodeRandomizeHash2;
                xMSSNodeArr[1] = new XMSSNode(xMSSNodeRandomizeHash2.getHeight() + 1, xMSSNodeArr[1].getValue());
            }
            xMSSNodeArr[0] = xMSSNodeArr[1];
        }
        return xMSSNodeArr[0];
    }
}
