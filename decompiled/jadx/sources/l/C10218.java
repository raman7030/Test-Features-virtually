package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/* JADX INFO: renamed from: l.ۤۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E411 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10218 extends DexClassLoader {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseDexClassLoader f30696;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10218(String str, String str2, DexClassLoader dexClassLoader, BaseDexClassLoader baseDexClassLoader) {
        super(str, str2, null, dexClassLoader);
        int i = -1047570170;
        int i2 = C3432.f10845;
        int i3 = C22628.f73083;
        this.f30696 = baseDexClassLoader;
        int iM6981 = C2105.m6981("ۤ᩺") ^ i3;
        int i4 = ((iM6981 ^ i2) * 20537) ^ (-1799108478);
        int i5 = -723536464;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i2) * (-30117)) >> 31));
            switch (i) {
                case -1847498008:
                case -905912316:
                    if (C21923.f70183 == 0) {
                        iM6981 = C2105.m6981("ۧۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8315) ^ (-1119967832);
                        i5 = 1924152186;
                    } else {
                        iM6981 = (C0630.m2566("ۛۜ") + i2) * 57;
                        i4 = ((iM6981 ^ i3) * (-27821)) ^ (-179093449);
                        i5 = 1710488393;
                    }
                    break;
                case -1784865906:
                case -1782830560:
                    return;
                case -769374941:
                case -461745891:
                    RunnableC1108.m3790();
                    iM6981 = C2105.m6981("ۙ֫") ^ i3;
                    i4 = ((iM6981 ^ i2) * 27469) ^ (-1880923465);
                    i5 = 1798105920;
                    break;
                case -516144315:
                case 1753566706:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("ۤۜ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i2) * 31587) ^ 575208155;
                        i5 = -1748293327;
                    } else {
                        iM6981 = C2105.m6981("ۙۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2145)) ^ 1709148821;
                        i5 = 547924518;
                    }
                    break;
                case -376638407:
                case 877322184:
                    C1420.m4913();
                    if (!RunnableC3474.m10630()) {
                        iM6981 = C2105.m6981("ۧۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8315) ^ (-1119967832);
                        i5 = 1924152186;
                    } else {
                        iM6981 = C2105.m6981("ۙ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27469) ^ (-1880923465);
                        i5 = 1798105920;
                    }
                    break;
                case -275067197:
                case 1590637649:
                    C0050.m940();
                    throw new RuntimeException();
                default:
                    C4159.m12565();
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۛۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5323)) ^ 1399484029;
                        i5 = 1731249495;
                    } else {
                        iM6981 = C2105.m6981("ۙ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27469) ^ (-1880923465);
                        i5 = 1798105920;
                    }
                    break;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.f30696.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.f30696.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        return this.f30696.getResources(str);
    }
}
