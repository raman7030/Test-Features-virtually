package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/* JADX INFO: renamed from: l.ۤۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E411 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12080 extends DexClassLoader {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ BaseDexClassLoader f33657;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12080(String str, String str2, DexClassLoader dexClassLoader, BaseDexClassLoader baseDexClassLoader) {
        super(str, str2, null, dexClassLoader);
        int i = -1047570170;
        int i2 = C1012.f81938;
        int i3 = C1964.f83032;
        this.f33657 = baseDexClassLoader;
        int iM55979 = C0946.m55979("ۤ᩺") ^ i3;
        int i4 = ((iM55979 ^ i2) * 20537) ^ (-1799108478);
        int i5 = -723536464;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i2) * (-30117)) >> 31));
            switch (i) {
                case -1847498008:
                case -905912316:
                    if (C1929.f83011 == 0) {
                        iM55979 = C0946.m55979("ۧۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8315) ^ (-1119967832);
                        i5 = 1924152186;
                    } else {
                        iM55979 = (C0873.m55680("ۛۜ") + i2) * 57;
                        i4 = ((iM55979 ^ i3) * (-27821)) ^ (-179093449);
                        i5 = 1710488393;
                    }
                    break;
                case -1784865906:
                case -1782830560:
                    return;
                case -769374941:
                case -461745891:
                    RunnableC0897.m55784();
                    iM55979 = C0946.m55979("ۙ֫") ^ i3;
                    i4 = ((iM55979 ^ i2) * 27469) ^ (-1880923465);
                    i5 = 1798105920;
                    break;
                case -516144315:
                case 1753566706:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("ۤۜ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i2) * 31587) ^ 575208155;
                        i5 = -1748293327;
                    } else {
                        iM55979 = C0946.m55979("ۙۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2145)) ^ 1709148821;
                        i5 = 547924518;
                    }
                    break;
                case -376638407:
                case 877322184:
                    C0912.m55833();
                    if (!RunnableC1014.m56177()) {
                        iM55979 = C0946.m55979("ۧۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8315) ^ (-1119967832);
                        i5 = 1924152186;
                    } else {
                        iM55979 = C0946.m55979("ۙ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27469) ^ (-1880923465);
                        i5 = 1798105920;
                    }
                    break;
                case -275067197:
                case 1590637649:
                    C0845.m55584();
                    throw new RuntimeException();
                default:
                    C1048.m56305();
                    if (C0873.m55678()) {
                        iM55979 = C0946.m55979("ۛۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5323)) ^ 1399484029;
                        i5 = 1731249495;
                    } else {
                        iM55979 = C0946.m55979("ۙ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27469) ^ (-1880923465);
                        i5 = 1798105920;
                    }
                    break;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.f33657.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.f33657.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        return this.f33657.getResources(str);
    }
}
