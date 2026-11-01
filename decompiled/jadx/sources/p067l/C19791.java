package p067l;

import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ᩳ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19791 extends AbstractC21283 {

    /* JADX INFO: renamed from: ᩸᩵᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f82306 = {1787, 9919, -9816, -13200};

    /* JADX INFO: renamed from: ֫ */
    public final ViewOnClickListenerC9062 f60198;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewOnClickListenerC9062 f60199;

    /* JADX WARN: Code duplicated, block: B:59:0x020a A[PHI: r2 r6 r7 r8 r9 r11 r19
      0x020a: PHI (r2v5 android.view.LayoutInflater) = 
      (r2v2 android.view.LayoutInflater)
      (r2v2 android.view.LayoutInflater)
      (r2v2 android.view.LayoutInflater)
      (r2v4 android.view.LayoutInflater)
      (r2v2 android.view.LayoutInflater)
     binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v4 short[]) = (r7v3 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int), (r9v2 int) binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r19v12 int) = (r19v3 int), (r19v4 int), (r19v5 int), (r19v10 int), (r19v13 int) binds: [B:58:0x0208, B:54:0x01ea, B:50:0x01cb, B:39:0x0148, B:31:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0239 A[PHI: r12 r19
      0x0239: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:62:0x0237, B:35:0x0121, B:19:0x0085, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r19v18 int) = (r19v2 int), (r19v11 int), (r19v16 int), (r19v19 int) binds: [B:62:0x0237, B:35:0x0121, B:19:0x0085, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x026c A[PHI: r3 r4 r19
      0x026c: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:66:0x026a, B:27:0x00db, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r4v4 boolean) = (r4v2 boolean), (r4v3 boolean), (r4v2 boolean) binds: [B:66:0x026a, B:27:0x00db, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r19v17 int) = (r19v1 int), (r19v14 int), (r19v20 int) binds: [B:66:0x026a, B:27:0x00db, B:14:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C1044.f81959;
        int i5 = C1124.f82007;
        int iM559710 = C0946.m55979("ᩳ᩶") ^ i4;
        int i6 = ((iM559710 ^ i5) * 3525) ^ 651389419;
        View viewInflate = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ 1530610774;
        LayoutInflater layoutInflaterFrom = null;
        int i8 = 0;
        boolean z = false;
        int iM559711 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1260402826;
        while (true) {
            int i13 = i7 ^ (i6 & (((i12 ^ i5) * 18953) >> 31));
            switch (i13) {
                case -2052178743:
                case 854031519:
                    i13 = i13;
                    i9 = 363512356 + (s * s);
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("۟۟") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-5481)) ^ 1457385729;
                        i3 = -2067942205;
                    } else {
                        iM55979 = C0873.m55680("ܰ۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * 26009) ^ 109707872;
                        i3 = 247021608;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -2031963041:
                case 231985439:
                    C0890.m55740();
                    if (C1048.f81963) {
                        i13 = i13;
                        int iM55680 = C0873.m55680("ۖۡ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 16551) ^ 375637109;
                        i7 = iM55680 ^ (-508830946);
                        i12 = i13;
                    }
                    iM55979 = C0873.m55680("֨ۗ") ^ i5;
                    i13 = i13;
                    i2 = ((iM55979 ^ i4) * (-7083)) ^ 993462189;
                    i3 = -430277635;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -2026671722:
                case 571836282:
                    if (C1028.m56247() >= 0) {
                        i13 = i13;
                        iM55979 = (i5 - C0946.m55979("ۧۛ")) * 7;
                        i2 = ((iM55979 ^ i4) * 14605) ^ 1947852076;
                        i3 = -377334774;
                    } else {
                        iM55979 = C0873.m55680("֨ۗ") ^ i5;
                        i13 = i13;
                        i2 = ((iM55979 ^ i4) * (-7083)) ^ 993462189;
                        i3 = -430277635;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -1687824917:
                case -1388819409:
                    i13 = i13;
                    i11 = 1;
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ۚۙ") + i5) * (-9);
                        i2 = ((iM55979 ^ i4) * 7077) ^ (-1503792699);
                        i3 = -1113108791;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ۧۛ")) * 7;
                        i2 = ((iM55979 ^ i4) * 14605) ^ 1947852076;
                        i3 = -377334774;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -1584893183:
                case 849222590:
                    i10 = 44726;
                    iM55979 = (i5 - C0946.m55979("֨۫")) * (-105);
                    i2 = ((iM55979 ^ i4) * 4163) ^ (-219815395);
                    i3 = -673667628;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -1554407962:
                case 1834181653:
                    return new ViewOnClickListenerC25155(this.f60199, viewInflate);
                case -892876566:
                case 77141465:
                    i13 = i13;
                    i8 = iM559711 ^ 2097182832;
                    z = false;
                    if (C0877.m55696()) {
                        iM55979 = C0946.m55979("۫ۧ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-24447)) ^ (-1805849686);
                        i3 = -930095926;
                    } else {
                        iM55979 = C0873.m55680("֫۠") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-623)) ^ (-1983528618);
                        i3 = 258528987;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -748479507:
                case 1308368538:
                    i13 = i13;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("֫۠") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-623)) ^ (-1983528618);
                        i3 = 258528987;
                    } else {
                        iM55979 = (i4 - C0946.m55979("᩸᩻")) * (-21);
                        i2 = ((iM55979 ^ i5) * (-13881)) ^ 724368085;
                        i3 = -1785182187;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -613436615:
                case 1668732952:
                    i13 = i13;
                    layoutInflaterFrom = LayoutInflater.from(this.f60198);
                    sArr2 = f82306;
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("ܰ۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * 26009) ^ 109707872;
                        i3 = 247021608;
                    } else {
                        iM55979 = C0873.m55680("ᩴܺ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 2267) ^ 134813751;
                        i3 = 322830197;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -392416907:
                case 789638697:
                    i13 = i13;
                    sArr = f82306;
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ᩴ᩻") ^ i5;
                        i2 = ((iM55979 ^ i4) * 11575) ^ 1640190500;
                        i3 = -837834767;
                    } else {
                        iM55979 = C0873.m55680("ܰ۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * 26009) ^ 109707872;
                        i3 = 247021608;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -320855888:
                case 929131535:
                    i10 = 11222;
                    iM55979 = (i5 - C0946.m55979("֨۫")) * (-105);
                    i2 = ((iM55979 ^ i4) * 4163) ^ (-219815395);
                    i3 = -673667628;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -219087816:
                case 632824257:
                    i13 = i13;
                    viewInflate = layoutInflaterFrom.inflate(i8, viewGroup, z);
                    if (C0861.f81831) {
                        iM55979 = (i4 - C0946.m55979("ۧܽ")) * (-93);
                        i2 = ((iM55979 ^ i5) * (-11223)) ^ (-2130807062);
                        i3 = 443122995;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                    } else {
                        int iM55681 = C0873.m55680("ۖۡ") ^ i5;
                        i6 = ((iM55681 ^ i4) * 16551) ^ 375637109;
                        i7 = iM55681 ^ (-508830946);
                    }
                    i12 = i13;
                    break;
                case -206767204:
                case 347040115:
                    i13 = i13;
                    iM559711 = C0946.m55979(C1046.m56293(sArr2, i11, 3, i10));
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0873.m55680("ܰ۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * 26009) ^ 109707872;
                        i3 = 247021608;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩵") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-32611)) ^ 170351821;
                        i3 = 1117533739;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case -26648056:
                case 191753605:
                    i13 = i13;
                    C1929.m56553();
                    iM55979 = (i5 - C0946.m55979("ۧۛ")) * 7;
                    i2 = ((iM55979 ^ i4) * 14605) ^ 1947852076;
                    i3 = -377334774;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case 32529399:
                case 1163218066:
                    i13 = i13;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i5 - C0946.m55979("ۧۛ")) * 7;
                        i2 = ((iM55979 ^ i4) * 14605) ^ 1947852076;
                        i3 = -377334774;
                    } else {
                        iM55979 = (C0946.m55979("ۗۨ") + i5) * C0254q.f1218h;
                        i2 = ((iM55979 ^ i4) * 19605) ^ 716994028;
                        i3 = 1019839325;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case 211558786:
                case 2116132011:
                    C0967.m56074();
                    if (C0949.f81897 < 0) {
                        i13 = i13;
                        iM55979 = C0873.m55680("֫۠") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-623)) ^ (-1983528618);
                        i3 = 258528987;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        i12 = i13;
                    }
                    i13 = i13;
                    iM55979 = (i5 - C0946.m55979("ۧۛ")) * 7;
                    i2 = ((iM55979 ^ i4) * 14605) ^ 1947852076;
                    i3 = -377334774;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case 591120673:
                case 649079229:
                    i13 = i13;
                    s = sArr[0];
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ܰ۟") ^ i4;
                        i2 = ((iM55979 ^ i5) * 26009) ^ 109707872;
                        i3 = 247021608;
                    } else {
                        iM55979 = C0946.m55979("ܶ֫") ^ i4;
                        i2 = ((iM55979 ^ i5) * 15081) ^ 1333166364;
                        i3 = 234211364;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                case 1213137676:
                case 1770671988:
                    i13 = i13;
                    if (i9 - (38132 * s) < 0) {
                        iM55979 = (C0946.m55979("ۧᩴ") + i4) * 73;
                        i2 = ((iM55979 ^ i5) * (-28221)) ^ (-1389433903);
                        i3 = 249333021;
                    } else {
                        iM55979 = (C0946.m55979("ۧۗ") ^ i4) * (-69);
                        i2 = ((iM55979 ^ i5) * 20561) ^ 996299136;
                        i3 = 232761190;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i12 = i13;
                    break;
                default:
                    C0927.m55873();
                    C1053.m56327();
                    return null;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC25155 viewOnClickListenerC25155 = null;
        ImageView imageView = null;
        ImageView imageView2 = null;
        Drawable drawable = null;
        PorterDuffColorFilter porterDuffColorFilterM35830 = null;
        int i2 = -260635009;
        int i3 = C0866.f81837;
        int i4 = C1003.f81929;
        int iM55680 = (i4 - C0873.m55680("ۖ᩶")) * 25;
        int i5 = ((iM55680 ^ i3) * 5045) ^ 255860789;
        int i6 = 615292769;
        while (true) {
            i2 = ((((i2 ^ i3) * 28433) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2120695387:
                case -47852765:
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0946.m55979("۬᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-26115)) ^ (-1333071520);
                        i6 = 2015356894;
                    } else {
                        iM55680 = (C0946.m55979("ۛۘ") ^ i3) * (-79);
                        i5 = ((iM55680 ^ i4) * (-21855)) ^ (-2037376905);
                        i6 = 991362746;
                    }
                    break;
                case -2021197304:
                case 102004165:
                    C0946.m55976(viewOnClickListenerC25155.f80487, ViewOnClickListenerC9062.f24573[i]);
                    break;
                case -1778768855:
                case -1698320471:
                    C0854.m55595();
                    C1053.m56327();
                    iM55680 = C0873.m55680("ᩴۖ") ^ i4;
                    i5 = ((iM55680 ^ i3) * (-5901)) ^ (-442487101);
                    i6 = -460234433;
                    break;
                case -1758770561:
                case 183528648:
                    drawable = imageView2.getDrawable();
                    porterDuffColorFilterM35830 = C15766.m35830(C23223.f72995);
                    if (C0863.m55643()) {
                        iM55680 = C0873.m55680("ܳܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 11885) ^ (-1659394398);
                        i6 = -1069304380;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1501)) ^ 1680474223;
                        i6 = -1935736446;
                    }
                    break;
                case -1489223468:
                case -778353554:
                    C0861.m55626();
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("۠ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-25705)) ^ (-1800271308);
                        i6 = 1255779885;
                    } else {
                        iM55680 = C0873.m55680("ᩴۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-5901)) ^ (-442487101);
                        i6 = -460234433;
                    }
                    break;
                case -1456256519:
                case 111571718:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("۬᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-26115)) ^ (-1333071520);
                        i6 = 2015356894;
                    } else {
                        iM55680 = C0946.m55979("ۛ᩸") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-11665)) ^ 1029674733;
                        i6 = 1914397657;
                    }
                    break;
                case -1304827011:
                case -321575603:
                    imageView2 = viewOnClickListenerC25155.f80486;
                    if (C0989.m56095() <= 0) {
                        iM55680 = C0873.m55680("ۜ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1501)) ^ 1680474223;
                        i6 = -1935736446;
                    } else {
                        iM55680 = C0873.m55680("ܳ۬") ^ i4;
                        i5 = ((iM55680 ^ i3) * 1045) ^ (-1446117395);
                        i6 = 680121017;
                    }
                    break;
                case -1246580297:
                case 1404876957:
                    if (C1003.f81929 > 0) {
                        iM55680 = (C0873.m55680("ۜ֡") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * (-13517)) ^ 545513541;
                        i6 = 1204895140;
                    } else {
                        iM55680 = C0873.m55680("۠ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-25705)) ^ (-1800271308);
                        i6 = 1255779885;
                    }
                    break;
                case -1231966981:
                case 1859227032:
                    imageView.setImageResource(ViewOnClickListenerC9062.f24575[i]);
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ᩴۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-5901)) ^ (-442487101);
                        i6 = -460234433;
                    } else {
                        iM55680 = C0946.m55979("۫᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * 27791) ^ (-1210165185);
                        i6 = 1830440340;
                    }
                    break;
                case -957676619:
                case 1032530813:
                    ServiceConnectionC1013.m56157();
                    break;
                case -499512378:
                case 1246321417:
                    drawable.setColorFilter(porterDuffColorFilterM35830);
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ᩴۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-5901)) ^ (-442487101);
                        i6 = -460234433;
                    } else {
                        iM55680 = C0946.m55979("֫֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 2417) ^ (-2079490794);
                        i6 = -650668378;
                    }
                    break;
                case -349098325:
                case 1348654412:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("ۜ֡") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * (-13517)) ^ 545513541;
                        i6 = 1204895140;
                    } else {
                        iM55680 = (C0946.m55979("۬ܳ") ^ i3) * (-41);
                        i5 = ((iM55680 ^ i4) * 30367) ^ 1010287466;
                        i6 = 1862087325;
                    }
                    break;
                case -150415338:
                case 1712991405:
                    if (!C0967.m56074()) {
                        iM55680 = C0873.m55680("ᩴۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-5901)) ^ (-442487101);
                        i6 = -460234433;
                    } else {
                        iM55680 = C0946.m55979("۬᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-26115)) ^ (-1333071520);
                        i6 = 2015356894;
                    }
                    break;
                case 124126951:
                case 766750465:
                    viewOnClickListenerC25155 = (ViewOnClickListenerC25155) abstractC5462;
                    imageView = viewOnClickListenerC25155.f80486;
                    if (C0930.m55885() <= 0) {
                        iM55680 = C0873.m55680("ۜ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1501)) ^ 1680474223;
                        i6 = -1935736446;
                    } else {
                        iM55680 = C0946.m55979("֡᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 329) ^ 1105813613;
                        i6 = -1796719514;
                    }
                    break;
                case 1262483739:
                case 2037302697:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("۬᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-26115)) ^ (-1333071520);
                        i6 = 2015356894;
                    } else {
                        iM55680 = (C0873.m55680("ۛ۬") ^ i4) * (-89);
                        i5 = ((iM55680 ^ i3) * (-32019)) ^ 1476625114;
                        i6 = -18563220;
                    }
                    break;
                default:
                    if (C1003.m56123() != 0) {
                        iM55680 = C0873.m55680("ۜ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1501)) ^ 1680474223;
                        i6 = -1935736446;
                    } else {
                        iM55680 = (C0946.m55979("֫ܳ") + i3) * 91;
                        i5 = ((iM55680 ^ i4) * 32487) ^ 1562274040;
                        i6 = 1467409551;
                    }
                    break;
            }
            return;
        }
    }

    public C19791(ViewOnClickListenerC9062 viewOnClickListenerC9062, ViewOnClickListenerC9062 viewOnClickListenerC9063) {
        int i = -685426093;
        int i2 = C0967.f81910;
        int i3 = C0989.f81920;
        this.f60199 = viewOnClickListenerC9062;
        int iM55680 = (C0873.m55680("۬᩹") ^ i2) * 39;
        int i4 = ((iM55680 ^ i3) * (-9725)) ^ 1269606466;
        int i5 = -564935689;
        while (true) {
            i = ((((i ^ i3) * 32259) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2037062897:
                case -490035169:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("ۖ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25583)) ^ 460396470;
                        i5 = 383364355;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩷ܰ")) * 57;
                        i4 = ((iM55680 ^ i3) * (-23783)) ^ (-567692176);
                        i5 = -473815699;
                    }
                    break;
                case -2012379406:
                case -1013652675:
                    if (C1929.m56553()) {
                        iM55680 = (C0873.m55680("᩶ܶ") ^ i3) * (-123);
                        i4 = ((iM55680 ^ i2) * 3121) ^ (-1432393577);
                        i5 = -1717863306;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۗ") ^ i3) * 7;
                        i4 = ((iM55680 ^ i2) * 17123) ^ (-584883422);
                        i5 = -1594976012;
                    }
                    break;
                case -1944017570:
                case -474851727:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("᩶ܶ") ^ i3) * (-123);
                        i4 = ((iM55680 ^ i2) * 3121) ^ (-1432393577);
                        i5 = -1717863306;
                    } else {
                        iM55680 = C0873.m55680("۬᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-30673)) ^ (-728918734);
                        i5 = 8357357;
                    }
                    break;
                case -1836058139:
                case -1591499387:
                    C0949.m56012();
                    if (C0946.f81894 == 0) {
                        iM55680 = (C0873.m55680("᩺۬") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i3) * 17047) ^ 141894850;
                        i5 = 178984469;
                    } else {
                        iM55680 = (C0873.m55680("۬ۙ") + i3) * 35;
                        i4 = ((iM55680 ^ i2) * (-13719)) ^ 1531410421;
                        i5 = 1841787102;
                    }
                    break;
                case -1739096200:
                case -1246726798:
                    this.f60198 = viewOnClickListenerC9063;
                    if (C0947.m55997()) {
                        iM55680 = (C0946.m55979("ۡ᩸") + i2) * (-37);
                        i4 = ((iM55680 ^ i3) * 9835) ^ 1830565477;
                        i5 = -97815623;
                    } else {
                        iM55680 = (C0873.m55680("᩻۫") + i2) * (-81);
                        i4 = ((iM55680 ^ i3) * (-12689)) ^ (-1730498294);
                        i5 = 1205548654;
                    }
                    break;
                case -1501284056:
                case -734649743:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("۬ۙ") + i3) * 35;
                        i4 = ((iM55680 ^ i2) * (-13719)) ^ 1531410421;
                        i5 = 1841787102;
                    } else {
                        iM55680 = C0946.m55979("ܿ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19681)) ^ 9123955;
                        i5 = 2025840262;
                    }
                    break;
                case -1501101338:
                case 601326720:
                    if (C1024.m56209() >= 0) {
                        iM55680 = (C0873.m55680("۬ۙ") + i3) * 35;
                        i4 = ((iM55680 ^ i2) * (-13719)) ^ 1531410421;
                        i5 = 1841787102;
                    } else {
                        iM55680 = (C0873.m55680("ۨ᩹") ^ i3) * (-107);
                        i4 = ((iM55680 ^ i2) * 16559) ^ (-2081278311);
                        i5 = 1762277647;
                    }
                    break;
                case -993622209:
                case -299542446:
                    C1003.m56123();
                    throw new RuntimeException();
                case -567434587:
                case -178409872:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("۬ۙ") + i3) * 35;
                        i4 = ((iM55680 ^ i2) * (-13719)) ^ 1531410421;
                        i5 = 1841787102;
                    } else {
                        iM55680 = C0946.m55979("֫ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-21869)) ^ 514483156;
                        i5 = 1603427513;
                    }
                    break;
                case -470050319:
                case 1422876993:
                    C0863.m55643();
                    if (!C0861.m55626()) {
                        iM55680 = (C0946.m55979("ۡ᩸") + i2) * (-37);
                        i4 = ((iM55680 ^ i3) * 9835) ^ 1830565477;
                        i5 = -97815623;
                    } else {
                        iM55680 = (C0873.m55680("᩺۬") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i3) * 17047) ^ 141894850;
                        i5 = 178984469;
                    }
                    break;
                case -247341910:
                case -180719410:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("ۖ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25583)) ^ 460396470;
                        i5 = 383364355;
                    } else {
                        iM55680 = (C0946.m55979("ۚۗ") ^ i3) * 53;
                        i4 = ((iM55680 ^ i2) * (-22969)) ^ (-488999425);
                        i5 = -1275074000;
                    }
                    break;
                case -216273467:
                case 1301371162:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("᩺۬") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i3) * 17047) ^ 141894850;
                        i5 = 178984469;
                    } else {
                        iM55680 = C0946.m55979("ۤ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 28957) ^ (-1154035125);
                        i5 = 1941358988;
                    }
                    break;
                case 147411363:
                case 2133017878:
                    C1964.m56597();
                    iM55680 = (C0873.m55680("۬ۙ") + i3) * 35;
                    i4 = ((iM55680 ^ i2) * (-13719)) ^ 1531410421;
                    i5 = 1841787102;
                    break;
                case 260700087:
                case 1945481730:
                    return;
                case 723981776:
                case 1236111775:
                    C0947.m55997();
                    if (!C0947.f81895) {
                        iM55680 = (C0873.m55680("᩶ܶ") ^ i3) * (-123);
                        i4 = ((iM55680 ^ i2) * 3121) ^ (-1432393577);
                        i5 = -1717863306;
                    } else {
                        iM55680 = (C0873.m55680("᩺۬") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i3) * 17047) ^ 141894850;
                        i5 = 178984469;
                    }
                    break;
                default:
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("۬ۙ") + i3) * 35;
                        i4 = ((iM55680 ^ i2) * (-13719)) ^ 1531410421;
                        i5 = 1841787102;
                    } else {
                        iM55680 = C0946.m55979("۠ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5111)) ^ 1671700918;
                        i5 = 757277985;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        int[] unused = ViewOnClickListenerC9062.f24575;
        return 15;
    }
}
