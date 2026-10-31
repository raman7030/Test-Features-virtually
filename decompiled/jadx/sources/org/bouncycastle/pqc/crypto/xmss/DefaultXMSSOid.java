package org.bouncycastle.pqc.crypto.xmss;

import java.util.HashMap;
import java.util.Map;
import l.C20195;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultXMSSOid implements XMSSOid {
    public static final Map oidLookupTable;
    public final int oid;
    public final String stringRepresentation;

    static {
        HashMap map = new HashMap();
        map.put(createKey(XMSSKeyParameters.SHA_256, 32, 16, 67, 10), new DefaultXMSSOid(1, "XMSS_SHA2_10_256"));
        map.put(createKey(XMSSKeyParameters.SHA_256, 32, 16, 67, 16), new DefaultXMSSOid(2, "XMSS_SHA2_16_256"));
        map.put(createKey(XMSSKeyParameters.SHA_256, 32, 16, 67, 20), new DefaultXMSSOid(3, "XMSS_SHA2_20_256"));
        map.put(createKey(XMSSKeyParameters.SHA_512, 64, 16, 131, 10), new DefaultXMSSOid(4, "XMSS_SHA2_10_512"));
        map.put(createKey(XMSSKeyParameters.SHA_512, 64, 16, 131, 16), new DefaultXMSSOid(5, "XMSS_SHA2_16_512"));
        map.put(createKey(XMSSKeyParameters.SHA_512, 64, 16, 131, 20), new DefaultXMSSOid(6, "XMSS_SHA2_20_512"));
        map.put(createKey("SHAKE128", 32, 16, 67, 10), new DefaultXMSSOid(7, "XMSS_SHAKE_10_256"));
        map.put(createKey("SHAKE128", 32, 16, 67, 16), new DefaultXMSSOid(8, "XMSS_SHAKE_16_256"));
        map.put(createKey("SHAKE128", 32, 16, 67, 20), new DefaultXMSSOid(9, "XMSS_SHAKE_20_256"));
        map.put(createKey("SHAKE256", 64, 16, 131, 10), new DefaultXMSSOid(10, "XMSS_SHAKE_10_512"));
        map.put(createKey("SHAKE256", 64, 16, 131, 16), new DefaultXMSSOid(11, "XMSS_SHAKE_16_512"));
        map.put(createKey("SHAKE256", 64, 16, 131, 20), new DefaultXMSSOid(12, "XMSS_SHAKE_20_512"));
        oidLookupTable = C20195.unmodifiableMap(map);
    }

    public DefaultXMSSOid(int i, String str) {
        this.oid = i;
        this.stringRepresentation = str;
    }

    public static String createKey(String str, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public static DefaultXMSSOid lookup(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return (DefaultXMSSOid) oidLookupTable.get(createKey(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public int getOid() {
        return this.oid;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public String toString() {
        return this.stringRepresentation;
    }
}
