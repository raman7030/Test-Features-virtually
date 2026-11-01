package p067l;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62Z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractActivityC14026 extends AbstractActivityC5549 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۜۜܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f82167 = {2107, -26692, -26694, -26711, -26714, -26693, -26632, 3167, 19834, -19102, -17270, 2959, 28667, 28502, -26127, 127, 3324, 7627, 3024, 6947, 6232, 2343, 30256, 30250, 6973, -19625, -19618, -19645, -19629, -19624, -19627, -19602, -19643, -19624, -19647, -19602, -19630, -19623, -19628, -19630, -19622, -19602, -19643, -19645, -19632, -19617, -19646, -19619, -19632, -19643, -19624, -19618, -19617, -19602, -19625, -19618, -19645, -19620, -19632, -19643, -19602, -19630, -19618, -19617, -19643, -19645, -19618, -19619, -10827, -10229, -7689, 9949, -22664, -29216, -19949, 17676, 22151, 21644, 2376, 1430, 11809, -8820, 7664, 706, 12065, -2445, 9564, 4372, 12043, -7360, 8153, -665, -3149, 3239, -7145, -4693, 11427, 3540, 8824, 11404, 10016, 8048, 7273, 4565, 6223, -270, -7033, -15586, -6400, 4045, 1648, 846, -4824, 2557, 5797, -4311, 1744, 5258, -881, -13885, 3240, 24389, -18756, 24551, 20596, -20522, 18390, -18236, -21297, -19017, 18720, -20789, 22996, -18938, 21377, -23668, -17849, 24032, 20305, -19095, 22769, -21248, 25306, 31340, 27051, -23215, -21878, 19329, 13331, 13332, 13313, 13332, 13317, 13359, 13355, 13332, 13330, 13313, 13326, 13331, 13324, 13313, 13332, 13321, 13327, 13326, 13375, 13325, 13327, 13316, 13317, 13375, 13331, 13327, 13330, 13332, 13317, 13316, 161, 24140, -19308, -20369, 22585, -16923, -19562, 28814, 23437, -21786, 370, -3934, -5933, -2828, 6410, -4116, 6495, -13903, -992, -12942, 6010, -15349, 5234, -13315, -7791, 8055, -1423, 611, 4074, -13876, -5833, -13009, 3603, -692, 4987, -14262, -6459, 5403, 6786, -10139, -6120, -13991, -8172, 448, -1529, -13543, 4597, -7493, 5043, 7076, -2761, 4674, -9734, -14477, 6788, -6305, -16154, -5366, -15920, 3171, 2984, 7883, -27056, -27045, -27050, -27056, -27048, -27028, -27065, -27071, -27054, -27043, -27072, -27041, -27054, -27065, -27046, -27044, -27043, -27028, -27051, -27044, -27071, -27042, -27054, -27065, -27028, -27056, -27044, -27043, -27065, -27071, -27044, -27041, -27051, -27044, -27071, -27055, -27046, -27049, -27028, -27065, -27046, -27069, -27028, 7463, 2380, 609, 5670, -12943, 6657, -5878, 4895, -12739, 2429, 700, 4349, 543, -4130, -5468, 5641, 7868, 2241, -27065, -27071, -27054, -27043, -27072, -27041, -27054, -27065, -27046, -27044, -27043, -27028, -27042, -27044, -27049, -27050, -27028, -27072, -27044, -27071, -27065, -27050, -27049, 253, -12654, 5491, 4804, -30134, -30131, -30120, -30131, -30116, -30090, -30094, 1551, 8139, 8132, 8137, 8132, 83, -24172, 24095, -32252};

    /* JADX INFO: renamed from: ᩸ۧ */
    public static final /* synthetic */ int f39540 = 0;

    /* JADX INFO: renamed from: ᩹ۧ */
    public static final AbstractC17043 f39541;

    /* JADX INFO: renamed from: ֡ۧ */
    public boolean f39542;

    /* JADX INFO: renamed from: ֨ۧ */
    public String f39543;

    /* JADX INFO: renamed from: ۖۧ */
    public ArrayList f39544;

    /* JADX INFO: renamed from: ۘۧ */
    public int f39545;

    /* JADX INFO: renamed from: ۚۧ */
    public ArrayList f39546;

    /* JADX INFO: renamed from: ۜۧ */
    public int[] f39547;

    /* JADX INFO: renamed from: ۠ۧ */
    public DialogInterfaceOnDismissListenerC7422 f39548;

    /* JADX INFO: renamed from: ۡۧ */
    public boolean f39549;

    /* JADX INFO: renamed from: ۢۧ */
    public int f39550;

    /* JADX INFO: renamed from: ܳۧ */
    public int f39551;

    /* JADX INFO: renamed from: ܶۧ */
    public int f39552;

    /* JADX INFO: renamed from: ܺۧ */
    public ArrayList f39553;

    /* JADX INFO: renamed from: ܿۧ */
    public C21103 f39554;

    /* JADX INFO: renamed from: ᩳۧ */
    public C14696 f39555;

    /* JADX INFO: renamed from: ᩴۧ */
    public boolean f39556;

    /* JADX INFO: renamed from: ᩵ۧ */
    public C7350 f39557;

    /* JADX INFO: renamed from: ᩷ۧ */
    public boolean f39558;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f39559;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21645(RunnableC20062 runnableC20062);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21646(boolean z);

    /* JADX INFO: renamed from: ֫֫ */
    public String mo21647() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo21648() {
        return false;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public abstract void mo21649();

    /* JADX INFO: renamed from: ܽ */
    public boolean mo21650(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean mo21651() {
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public CharSequence mo21653(String str) {
        return str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo31858(int i) {
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo21655() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03be A[PHI: r18
      0x03be: PHI (r18v39 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v40 int) binds: [B:100:0x03bc, B:96:0x03a0, B:92:0x0382, B:88:0x0366, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x040f A[PHI: r18
      0x040f: PHI (r18v10 int) = (r18v3 int), (r18v11 int) binds: [B:108:0x040d, B:80:0x0317] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x0442 A[PHI: r18
      0x0442: PHI (r18v38 int) = (r18v2 int), (r18v4 int), (r18v36 int), (r18v40 int) binds: [B:112:0x0440, B:104:0x03ef, B:18:0x0086, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[PHI: r18
      0x00b3: PHI (r18v42 int) = (r18v34 int), (r18v36 int), (r18v43 int) binds: [B:25:0x00af, B:18:0x0086, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0124 A[PHI: r12 r18
      0x0124: PHI (r12v5 l.ۡ۟ܽ) = (r12v4 l.ۡ۟ܽ), (r12v2 l.ۡ۟ܽ), (r12v2 l.ۡ۟ܽ) binds: [B:36:0x010b, B:32:0x00de, B:30:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r18v32 int) = (r18v28 int), (r18v31 int), (r18v33 int) binds: [B:36:0x010b, B:32:0x00de, B:30:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0336 A[PHI: r18
      0x0336: PHI (r18v46 int) = (r18v9 int), (r18v34 int), (r18v35 int), (r18v47 int) binds: [B:84:0x0334, B:25:0x00af, B:21:0x0092, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C0863.f81833;
        int i5 = C1044.f81959;
        int iM55680 = (C0873.m55680("ᩳۨ") ^ i5) * (-125);
        int i6 = ((iM55680 ^ i4) * (-18711)) ^ (-659303054);
        ArrayList arrayList = null;
        C10674 c10674 = null;
        int i7 = iM55680 ^ 1318286552;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        int iM55598 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1370546266;
        while (true) {
            int i14 = i7 ^ (i6 & (((i13 ^ i4) * (-15675)) >> 31));
            switch (i14) {
                case -1938115565:
                case 390562650:
                    i14 = i14;
                    this.f39551 = i;
                    if (((C10674) C1017.m56196(this.f39553, i8)).m24570()) {
                        iM55979 = C0873.m55680("֡᩺") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-12639)) ^ (-213021315);
                        i3 = -202651384;
                    } else {
                        iM55979 = (C0946.m55979("֨᩹") ^ i4) * (-91);
                        i2 = ((iM55979 ^ i5) * 10199) ^ (-1942639121);
                        i3 = -152572127;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1921775096:
                case 1651015800:
                    i14 = i14;
                    this.f39551 = i10;
                    this.f39555.notifyDataSetChanged();
                    iM55979 = C0873.m55680("֡᩺") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-12639)) ^ (-213021315);
                    i3 = -202651384;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1904806698:
                case 1225893759:
                    i11++;
                    iM55979 = (i5 - C0946.m55979("ۢ۠")) * (-89);
                    i2 = ((iM55979 ^ i4) * 16967) ^ (-1888309773);
                    i3 = -981979508;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1791737859:
                case 161151623:
                    i14 = i14;
                    if (C1044.f81959 < 0) {
                        iM55979 = (C0873.m55680("ܽۗ") ^ i4) * 87;
                        i2 = ((iM55979 ^ i5) * 16877) ^ (-1198479393);
                        i3 = 386114170;
                    } else {
                        iM55979 = C0873.m55680("᩻ۛ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-24491)) ^ (-1233226170);
                        i3 = 500225554;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1778148608:
                case 301248034:
                    i14 = i14;
                    if (C0890.f81849 != 0) {
                        iM55979 = (i4 - C0946.m55979("ܿܶ")) * (-47);
                        i2 = ((iM55979 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩷") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-16387)) ^ (-783209024);
                        i3 = -868716040;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1732550227:
                case -352304400:
                    return z;
                case -1649181865:
                case 1262037276:
                    i14 = i14;
                    c10674 = (C10674) C1017.m56196(arrayList, i12);
                    if (c10674.m24570()) {
                        iM55979 = C0873.m55680("ۖۘ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25293)) ^ 1240465352;
                        i3 = -1052087195;
                    } else {
                        iM55979 = (C0873.m55680("ᩴܰ") ^ i5) * 59;
                        i2 = ((iM55979 ^ i4) * (-29115)) ^ (-51372053);
                        i3 = 1680926593;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1545043320:
                case 868335324:
                    i14 = i14;
                    i12 = this.f39547[i11];
                    iM55979 = (i4 - C0873.m55680("۫ᩴ")) * 99;
                    i2 = ((iM55979 ^ i5) * 1203) ^ (-718529285);
                    i3 = -375089580;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1451806425:
                case 775770371:
                    i14 = i14;
                    C1044.m56286();
                    if (C1044.m56286() > 0) {
                        iM55979 = (C0873.m55680("ܽۗ") ^ i4) * 87;
                        i2 = ((iM55979 ^ i5) * 16877) ^ (-1198479393);
                        i3 = 386114170;
                    } else {
                        iM55979 = C0873.m55680("ۡ۟") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-28149)) ^ (-963484169);
                        i3 = 493875771;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1404782670:
                case -632837467:
                    i14 = i14;
                    if (C0967.m56074()) {
                        iM55979 = C0946.m55979("۠֡") ^ i4;
                        i2 = ((iM55979 ^ i5) * 21869) ^ 1995624214;
                        i3 = -338941857;
                    } else {
                        iM55979 = C0946.m55979("᩶ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-2337)) ^ (-883167641);
                        i3 = -727464049;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1388432981:
                case 524281832:
                    i14 = i14;
                    if (C1003.f81929 > 0) {
                        iM55979 = C0873.m55680("᩻ۛ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-24491)) ^ (-1233226170);
                        i3 = 500225554;
                    } else {
                        iM55979 = C0946.m55979("ᩴܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1383479006:
                case 1592897132:
                    i14 = i14;
                    m31842(z);
                    m31852(i8, view);
                    this.f39551 = i;
                    iM55979 = C0873.m55680("֡᩺") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-12639)) ^ (-213021315);
                    i3 = -202651384;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1362240537:
                case 140576013:
                    i14 = i14;
                    if (c10674.m24565(z)) {
                        iM55979 = (i4 - C0873.m55680("ۖ᩹")) * 85;
                        i2 = ((iM55979 ^ i5) * 2345) ^ 1589548730;
                        i3 = -2067254616;
                    } else {
                        iM55979 = C0873.m55680("ۖۘ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25293)) ^ 1240465352;
                        i3 = -1052087195;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1267036098:
                case -21818217:
                    return false;
                case -1249044806:
                case -1056560418:
                    i14 = i14;
                    this.f39545 += z ? 1 : 0;
                    iM55979 = C0873.m55680("ۖۘ") ^ i5;
                    i2 = ((iM55979 ^ i4) * (-25293)) ^ 1240465352;
                    i3 = -1052087195;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1114860367:
                case -215502433:
                    C1044.m56286();
                    if (AbstractC0942.m55971()) {
                        i14 = i14;
                        iM55979 = C0873.m55680("ۧ᩵") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-2039)) ^ (-1896165016);
                        i3 = 2086575846;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        i13 = i14;
                    }
                    i14 = i14;
                    iM55979 = C0873.m55680("᩻ۛ") ^ i5;
                    i2 = ((iM55979 ^ i4) * (-24491)) ^ (-1233226170);
                    i3 = 500225554;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1049778405:
                case 576818815:
                    i14 = i14;
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۧ᩵") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-2039)) ^ (-1896165016);
                        i3 = 2086575846;
                    } else {
                        iM55979 = C0946.m55979("۫ۤ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-9805)) ^ (-1694228546);
                        i3 = 1797598950;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -867451127:
                case 221990284:
                    i14 = i14;
                    if (this.f39549) {
                        iM55979 = (C0946.m55979("ܳ۫") + i4) * 93;
                        i2 = ((iM55979 ^ i5) * 4633) ^ 1605698147;
                        i3 = 350734317;
                    } else {
                        i8 = i;
                        iM55979 = (C0873.m55680("ۡ᩺") + i5) * (-7);
                        i2 = ((iM55979 ^ i4) * (-24659)) ^ (-1378953207);
                        i3 = 1100227949;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -856624379:
                case 82825316:
                    i14 = i14;
                    if (((C10674) C0992.m56115(this.f39553, i8)).m24569()) {
                        iM55979 = (C0946.m55979("᩶۟") + i4) * (-87);
                        i2 = ((iM55979 ^ i5) * (-9909)) ^ (-71119841);
                        i3 = 2017463085;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ᩴۚ")) * (-123);
                        i2 = ((iM55979 ^ i4) * 18167) ^ (-138317037);
                        i3 = 1388707700;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -761116879:
                case 1653380134:
                    i14 = i14;
                    m31852(i8, view);
                    iM55979 = C0873.m55680("֡᩺") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-12639)) ^ (-213021315);
                    i3 = -202651384;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -724313017:
                case 458685260:
                    i14 = i14;
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ܿܶ")) * (-47);
                        i2 = ((iM55979 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    } else {
                        iM55979 = C0873.m55680("᩸ۘ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-25409)) ^ (-1847055504);
                        i3 = -1591530056;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -672116548:
                case 2027561578:
                    i14 = i14;
                    if (C1036.f81953 >= 0) {
                        iM55979 = (i4 - C0946.m55979("ܿܶ")) * (-47);
                        i2 = ((iM55979 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    } else {
                        iM55979 = C0873.m55680("᩹ۗ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-6945)) ^ (-2052294405);
                        i3 = -2107345730;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -483728742:
                case 171728408:
                    i14 = i14;
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ܽۗ") ^ i4) * 87;
                        i2 = ((iM55979 ^ i5) * 16877) ^ (-1198479393);
                        i3 = 386114170;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩶") ^ i5;
                        i2 = ((iM55979 ^ i4) * 22961) ^ 79313996;
                        i3 = 606033528;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -478223769:
                case 1038953305:
                    i14 = i14;
                    if (C0866.m55645()) {
                        iM55979 = (i4 - C0946.m55979("ܽۤ")) * (-53);
                        i2 = ((iM55979 ^ i5) * (-15401)) ^ (-1447868893);
                        i3 = -1465277568;
                    } else {
                        iM55979 = C0946.m55979("ᩴܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -383773257:
                case 2144510462:
                    i14 = i14;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0946.m55979("۠֡") ^ i4;
                        i2 = ((iM55979 ^ i5) * 21869) ^ 1995624214;
                        i3 = -338941857;
                    } else {
                        iM55979 = (C0873.m55680("ۢܽ") ^ i4) * 115;
                        i2 = ((iM55979 ^ i5) * 28399) ^ (-236611620);
                        i3 = 913692540;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -380692066:
                case 62989982:
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ۡۜ") ^ i5;
                        i14 = i14;
                        i2 = ((iM55979 ^ i4) * (-28559)) ^ 763098593;
                        i3 = 627440744;
                    } else {
                        i14 = i14;
                        iM55979 = C0873.m55680("᩻ۛ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-24491)) ^ (-1233226170);
                        i3 = 500225554;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -337662377:
                case -200966320:
                    i14 = i14;
                    if (C0927.m55873() > 0) {
                        iM55979 = C0946.m55979("ᩴܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܿܶ")) * (-47);
                        i2 = ((iM55979 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -109904120:
                case 1574663162:
                    i14 = i14;
                    if (i11 <= iM55598) {
                        iM55979 = (i5 - C0873.m55680("᩵᩵")) * (-61);
                        i2 = ((iM55979 ^ i4) * (-17553)) ^ 842158641;
                        i3 = -1583141196;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۗۨ")) * 101;
                        i2 = ((iM55979 ^ i4) * 3081) ^ (-1522443966);
                        i3 = -1442895525;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 128804178:
                case 873542692:
                    i14 = i14;
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("ᩴܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    } else {
                        iM55979 = C0873.m55680("۟ܶ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 2643) ^ 1227134472;
                        i3 = -1716558899;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 161894046:
                case 422390264:
                    i14 = i14;
                    i8 = this.f39547[i];
                    iM55979 = (C0873.m55680("ۡ᩺") + i5) * (-7);
                    i2 = ((iM55979 ^ i4) * (-24659)) ^ (-1378953207);
                    i3 = 1100227949;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 386610195:
                case 1483811256:
                    i14 = i14;
                    i9 = this.f39551;
                    i10 = -1;
                    if (i9 == -1) {
                        iM55979 = C0873.m55680("ۤ۫") ^ i4;
                        i2 = ((iM55979 ^ i5) * 12515) ^ (-66917869);
                        i3 = 262937820;
                    } else {
                        iM55979 = C0873.m55680("ܰۙ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-1043)) ^ (-15801228);
                        i3 = -1590509726;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 582309148:
                case 1912669034:
                    i14 = i14;
                    arrayList = this.f39553;
                    if (this.f39549) {
                        iM55979 = C0946.m55979("۫֡") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-15725)) ^ (-1025318263);
                        i3 = -1157423713;
                    } else {
                        i12 = i11;
                        iM55979 = (i4 - C0873.m55680("۫ᩴ")) * 99;
                        i2 = ((iM55979 ^ i5) * 1203) ^ (-718529285);
                        i3 = -375089580;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 694766355:
                case 1449332183:
                    int iM55777 = RunnableC0897.m55777(i9, i);
                    iM55598 = C0854.m55598(this.f39551, i);
                    i11 = iM55777;
                    iM55979 = (i5 - C0946.m55979("ۢ۠")) * (-89);
                    i2 = ((iM55979 ^ i4) * 16967) ^ (-1888309773);
                    i3 = -981979508;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 695928576:
                case 1478275447:
                    i14 = i14;
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("ܳ᩷") + i4) * (-33);
                        i2 = ((iM55979 ^ i5) * 23373) ^ (-26463471);
                        i3 = -1319760687;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܿܶ")) * (-47);
                        i2 = ((iM55979 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 789464782:
                case 1336818096:
                    i14 = i14;
                    z = true;
                    z = true;
                    if (this.f39556) {
                        iM55979 = (i4 - C0873.m55680("ۙۗ")) * (-95);
                        i2 = ((iM55979 ^ i5) * (-31827)) ^ 657250196;
                        i3 = -704100656;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ܿ۬")) * 35;
                        i2 = ((iM55979 ^ i4) * 29297) ^ (-2012246002);
                        i3 = -90020307;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 1837781657:
                case 1863807607:
                    RunnableC0897.m55784();
                    C0967.m56074();
                    return false;
                default:
                    i14 = i14;
                    RunnableC0938.m55938();
                    iM55979 = (C0873.m55680("ܽۗ") ^ i4) * 87;
                    i2 = ((iM55979 ^ i5) * 16877) ^ (-1198479393);
                    i3 = 386114170;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9 A[PHI: r7
      0x00d9: PHI (r7v9 l.ۚۡ֫) = (r7v4 l.ۚۡ֫), (r7v7 l.ۚۡ֫), (r7v4 l.ۚۡ֫), (r7v4 l.ۚۡ֫) binds: [B:34:0x00d7, B:30:0x00bc, B:15:0x0061, B:6:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    public AbstractActivityC14026() {
        int iM55680;
        int i;
        boolean z = false;
        int i2 = -139350319;
        int i3 = C1028.f81950;
        int i4 = C1229.f82066;
        int iM55681 = (i3 - C0873.m55680("ܳۨ")) * (-19);
        int i5 = ((iM55681 ^ i4) * 10497) ^ 175996826;
        int i6 = -1397683382;
        while (true) {
            int i7 = iM55681 ^ i6;
            C7350 c7350 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 22903) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1985436601:
                    case -8320478:
                        AbstractC0942.m55971();
                        if (C0894.f81854 >= 0) {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM55680 = (i3 - C0946.m55979("ܿۧ")) * 39;
                            i5 = ((iM55680 ^ i4) * (-1733)) ^ (-1955570117);
                            i = 416728194;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1636826900:
                    case 313171210:
                        this.f39545 = z ? 1 : 0;
                        if (C1929.f83011 != 0) {
                            iM55680 = C0873.m55680("ܶ᩷") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23837)) ^ 123972227;
                            i = 1535512375;
                        } else {
                            iM55680 = C0946.m55979("ۗܿ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-27925)) ^ (-1994064897);
                            i = -486798404;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1406623456:
                    case -1387716884:
                        this.f39551 = -1;
                        return;
                    case -1306521175:
                    case 916626294:
                        C1048.m56305();
                        if (RunnableC1014.f81941 > 0) {
                            iM55680 = (C0946.m55979("ۨۜ") + i4) * (-91);
                            i5 = ((iM55680 ^ i3) * (-29289)) ^ 670195940;
                            i = 1526498744;
                        } else {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1278418279:
                    case 1887741597:
                        if (C0906.m55809() <= 0) {
                            iM55680 = C0873.m55680("ܶ᩷") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-23837)) ^ 123972227;
                            i = 1535512375;
                        } else {
                            iM55680 = (C0946.m55979("ۨۜ") + i4) * (-91);
                            i5 = ((iM55680 ^ i3) * (-29289)) ^ 670195940;
                            i = 1526498744;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -870469048:
                    case 1594797351:
                        this.f39557 = c7350;
                        if (AbstractC0942.m55971()) {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM55680 = (i3 - C0946.m55979("ۨ᩺")) * 33;
                            i5 = ((iM55680 ^ i4) * (-5681)) ^ 1521245568;
                            i = -324371361;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -629138794:
                    case -268108657:
                        if (C1929.f83011 != 0) {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM55680 = C0946.m55979("ᩴ᩷") ^ i3;
                            i5 = ((iM55680 ^ i4) * 21215) ^ (-1407576487);
                            i = 1953536876;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -610802656:
                    case 640969993:
                        if (C0894.m55769() >= 0) {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM55680 = C0873.m55680("ۙۗ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32277)) ^ 711965837;
                            i = 1106567894;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -497848934:
                    case 774860994:
                        if (C0863.f81833 <= 0) {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM55680 = (i4 - C0946.m55979("ܿ᩶")) * (-53);
                            i5 = ((iM55680 ^ i3) * 927) ^ 350945794;
                            i = 258951449;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -361353103:
                    case 1656922491:
                        C0882.m55710();
                        throw new RuntimeException();
                    case -247356966:
                    case 114622615:
                        z = false;
                        z = false;
                        this.f39556 = false;
                        if (ServiceConnectionC1013.f81940 < 0) {
                            iM55680 = (i4 - C0873.m55680("᩶ۡ")) * 71;
                            i5 = ((iM55680 ^ i3) * (-4689)) ^ 376169984;
                            i = 249066679;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case 532206076:
                    case 1446590835:
                        if (C0877.f81843 >= 0) {
                            iM55680 = (i3 - C0873.m55680("᩵ۙ")) * 123;
                            i5 = ((iM55680 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM55680 = (C0873.m55680("᩷ܽ") ^ i3) * (-93);
                            i5 = ((iM55680 ^ i4) * (-19117)) ^ 83875659;
                            i = -234684553;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 829479615:
                    case 1353113566:
                        if (C1046.f81962 > 0) {
                            iM55680 = (i3 - C0946.m55979("᩺᩵")) * 63;
                            i5 = ((iM55680 ^ i4) * (-13663)) ^ 738297705;
                            i = -1392829108;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case 1393300915:
                    case 1706218114:
                        this.f39549 = z;
                        if (C1964.f83032 > 0) {
                            c7350 = new C7350(C1003.m56119(z));
                            if (C0912.f81867 <= 0) {
                                iM55680 = C0873.m55680("ܶ᩷") ^ i4;
                                i5 = ((iM55680 ^ i3) * (-23837)) ^ 123972227;
                                i = 1535512375;
                            } else {
                                iM55680 = C0946.m55979("ᩴۜ") ^ i3;
                                i5 = ((iM55680 ^ i4) * 2629) ^ 985617821;
                                i = 970252074;
                            }
                            i7 = iM55680 ^ i;
                        }
                        break;
                    default:
                        C1053.m56327();
                        C0882.m55710();
                        iM55680 = C0873.m55680("ܶ᩷") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23837)) ^ 123972227;
                        i = 1535512375;
                        i7 = iM55680 ^ i;
                        break;
                }
            }
            iM55681 = (C0873.m55680("ᩴۛ") + i4) * (-105);
            i5 = ((iM55681 ^ i3) * (-9037)) ^ (-2043658176);
            i6 = -43325696;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[PHI: r6
      0x00a7: PHI (r6v5 l.ۧ᩺ᩴ) = (r6v3 l.ۧ᩺ᩴ), (r6v2 l.ۧ᩺ᩴ) binds: [B:30:0x00a5, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0108 A[PHI: r3 r4
      0x0108: PHI (r3v4 l.ۧ᩺ᩴ) = (r3v3 l.ۧ᩺ᩴ), (r3v2 l.ۧ᩺ᩴ), (r3v2 l.ۧ᩺ᩴ) binds: [B:40:0x0106, B:22:0x006c, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r4v4 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v2 java.util.ArrayList), (r4v2 java.util.ArrayList) binds: [B:40:0x0106, B:22:0x006c, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۟ */
    public final List m31855() {
        int iM55680;
        int i;
        int iM55979;
        int i2;
        int i3 = 0;
        InterfaceC13123 interfaceC13123Range = null;
        InterfaceC13123 map = null;
        final ArrayList arrayList = null;
        IntFunction intFunction = null;
        InterfaceC13123 map2 = null;
        int i4 = -1463725107;
        int i5 = C0967.f81910;
        int i6 = C0912.f81867;
        int iM559710 = (C0946.m55979("ۤܿ") + i6) * 53;
        int i7 = ((iM559710 ^ i5) * (-5195)) ^ 117809970;
        int i8 = 354972497;
        while (true) {
            int i9 = iM559710 ^ i8;
            IntUnaryOperator intUnaryOperator = null;
            while (true) {
                i4 = ((((i4 ^ i5) * 20045) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -1970732768:
                    case -1368947102:
                        interfaceC13123Range = C15487.range(i3, this.f39550);
                        if (!RunnableC0897.m55784()) {
                            intUnaryOperator = new IntUnaryOperator() { // from class: l.ۘ۟ܽ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C17342.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i10) {
                                    return AbstractActivityC14026.m31823(this.f14793, i10);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C17342.$default$compose(this, intUnaryOperator2);
                                }
                            };
                            if (!C0892.f81851) {
                            }
                            iM55680 = (C0946.m55979("᩶ܳ") ^ i6) * 21;
                            i7 = ((iM55680 ^ i5) * (-3461)) ^ (-777360953);
                            i = 1431176114;
                            i9 = iM55680 ^ i;
                            break;
                        }
                        break;
                    case -1956813282:
                    case -1737278801:
                        final ArrayList arrayList2 = this.f39553;
                        C1017.m56190(arrayList2);
                        if (ServiceConnectionC1013.f81940 < 0) {
                            InterfaceC19157 interfaceC19157MapToObj = map2.mapToObj(new IntFunction() { // from class: l.ۖ۟ܽ
                                @Override // java.util.function.IntFunction
                                public final Object apply(int i10) {
                                    ArrayList arrayList3 = null;
                                    int i11 = 599159505;
                                    int i12 = C0912.f81867;
                                    int i13 = C1012.f81938;
                                    int iM559711 = C0946.m55979("֨ۨ") ^ i13;
                                    int i14 = ((iM559711 ^ i12) * (-9745)) ^ 1470785999;
                                    int i15 = 704289462;
                                    while (true) {
                                        i11 = ((((i11 ^ i12) * 18539) >> 31) & i14) ^ (iM559711 ^ i15);
                                        switch (i11) {
                                            case -1789606628:
                                            case -159656202:
                                                C1012.m56134();
                                                C1194.m56396();
                                                return null;
                                            case -1709554895:
                                            case 1975300139:
                                                if (RunnableC0897.f81856) {
                                                    iM559711 = (C0946.m55979("ܽܿ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                    i14 = ((iM559711 ^ i12) * (-26001)) ^ (-848471234);
                                                    i15 = -450786936;
                                                } else {
                                                    iM559711 = (C0873.m55680("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM559711 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                }
                                                break;
                                            case -1662093346:
                                            case 1414590293:
                                                if (C0882.f81846) {
                                                    iM559711 = C0946.m55979("ܶ᩵") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                } else {
                                                    iM559711 = (i13 - C0946.m55979("᩸ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                    i14 = ((iM559711 ^ i12) * (-14619)) ^ (-1133127215);
                                                    i15 = 1189143193;
                                                }
                                                break;
                                            case -1621434546:
                                            case -686487683:
                                                if (C1229.m56410() != 0) {
                                                    iM559711 = (C0873.m55680("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM559711 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                } else {
                                                    iM559711 = C0873.m55680("ۡ۬") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * 6433) ^ (-1379169166);
                                                    i15 = 1786589636;
                                                }
                                                break;
                                            case -1567032186:
                                            case -1161304849:
                                                if (C0917.f81868) {
                                                    iM559711 = (i13 - C0946.m55979("֨ۚ")) * 35;
                                                    i14 = ((iM559711 ^ i12) * 27629) ^ 811842169;
                                                    i15 = -287880606;
                                                } else {
                                                    iM559711 = (C0946.m55979("ۤ᩶") ^ i13) * (-69);
                                                    i14 = ((iM559711 ^ i12) * 32585) ^ 1671754368;
                                                    i15 = 1154574709;
                                                }
                                                break;
                                            case -385302442:
                                            case 1938486298:
                                                if (C1036.m56257() <= 0) {
                                                    iM559711 = (C0873.m55680("᩶ۢ") + i13) * 7;
                                                    i14 = ((iM559711 ^ i12) * (-9777)) ^ 251382212;
                                                    i15 = 413493077;
                                                } else {
                                                    iM559711 = C0946.m55979("ܶ᩵") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                }
                                                break;
                                            case -352290023:
                                            case 1191910773:
                                                if (C1929.m56553()) {
                                                    iM559711 = C0946.m55979("ۨܺ") ^ i13;
                                                    i14 = ((iM559711 ^ i12) * (-3745)) ^ 209180024;
                                                    i15 = 1113382299;
                                                } else {
                                                    iM559711 = C0946.m55979("ܶ᩵") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                }
                                                break;
                                            case -146252831:
                                            case 1849452491:
                                                RunnableC1014.m56177();
                                                iM559711 = C0946.m55979("ܶ᩵") ^ i12;
                                                i14 = ((iM559711 ^ i13) * 19981) ^ 823230861;
                                                i15 = -1246628707;
                                                break;
                                            case 48687622:
                                            case 754678016:
                                                if (C0992.f81922 >= 0) {
                                                    iM559711 = (C0873.m55680("᩶ۢ") + i13) * 7;
                                                    i14 = ((iM559711 ^ i12) * (-9777)) ^ 251382212;
                                                    i15 = 413493077;
                                                } else {
                                                    iM559711 = C0946.m55979("ۖۤ") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * (-13537)) ^ (-1111338939);
                                                    i15 = 1281078659;
                                                }
                                                break;
                                            case 230825031:
                                            case 796444608:
                                                C0866.m55645();
                                                if (!C1024.f81946) {
                                                    iM559711 = (C0873.m55680("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM559711 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                } else {
                                                    iM559711 = C0946.m55979("ܶ᩵") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                }
                                                break;
                                            case 231216254:
                                            case 699872891:
                                                if (C0946.f81894 != 0) {
                                                    iM559711 = C0946.m55979("ܶ᩵") ^ i12;
                                                    i14 = ((iM559711 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                } else {
                                                    iM559711 = (C0946.m55979("᩻ۙ") ^ i12) * (-71);
                                                    i14 = ((iM559711 ^ i13) * (-5115)) ^ (-1016791725);
                                                    i15 = -1852167972;
                                                }
                                                break;
                                            case 261207257:
                                            case 1851833682:
                                                if (C1046.m56302() != 0) {
                                                    iM559711 = (C0873.m55680("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM559711 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                } else {
                                                    iM559711 = C0946.m55979("۟ۧ") ^ i13;
                                                    i14 = ((iM559711 ^ i12) * 5621) ^ (-939224233);
                                                    i15 = 1644267453;
                                                }
                                                break;
                                            case 280540561:
                                            case 1181961007:
                                                arrayList3 = arrayList2;
                                                if (C0894.f81854 >= 0) {
                                                    iM559711 = (i13 - C0946.m55979("֨ۚ")) * 35;
                                                    i14 = ((iM559711 ^ i12) * 27629) ^ 811842169;
                                                    i15 = -287880606;
                                                } else {
                                                    iM559711 = (C0946.m55979("ۗ᩷") ^ i12) * 23;
                                                    i14 = ((iM559711 ^ i13) * 20695) ^ (-1285672142);
                                                    i15 = 352752267;
                                                }
                                                break;
                                            case 1148861397:
                                            case 1307795895:
                                                if (C0967.f81910 >= 0) {
                                                    iM559711 = (i13 - C0946.m55979("֨ۚ")) * 35;
                                                    i14 = ((iM559711 ^ i12) * 27629) ^ 811842169;
                                                    i15 = -287880606;
                                                } else {
                                                    iM559711 = (C0946.m55979("᩻ܰ") ^ i13) * (-49);
                                                    i14 = ((iM559711 ^ i12) * 17789) ^ (-1476612971);
                                                    i15 = 1178437826;
                                                }
                                                break;
                                            case 1628863518:
                                            case 2047410686:
                                                if (RunnableC0938.f81886 >= 0) {
                                                    iM559711 = (C0873.m55680("᩶ۢ") + i13) * 7;
                                                    i14 = ((iM559711 ^ i12) * (-9777)) ^ 251382212;
                                                    i15 = 413493077;
                                                } else {
                                                    iM559711 = (C0946.m55979("֡ۙ") + i12) * 13;
                                                    i14 = ((iM559711 ^ i13) * 25455) ^ (-1753674354);
                                                    i15 = 1017461323;
                                                }
                                                break;
                                            default:
                                                return (C10674) C0992.m56115(arrayList3, i10);
                                        }
                                    }
                                }
                            });
                            int i10 = 1;
                            if (!C0955.m56025()) {
                                return interfaceC19157MapToObj.filter(new C17653(i10)).toList();
                            }
                            iM55680 = C0946.m55979("۟ۢ") ^ i5;
                            i7 = ((iM55680 ^ i6) * 23523) ^ 1787064497;
                            i = -2013467150;
                            i9 = iM55680 ^ i;
                        }
                        break;
                    case -1893362482:
                    case -1831514592:
                        InterfaceC13123 interfaceC13123Range2 = C15487.range(i3, this.f39550);
                        if (C0912.f81867 <= 0) {
                            iM55680 = C0946.m55979("ۖ֫") ^ i6;
                            i7 = ((iM55680 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            map2 = interfaceC13123Range2.map(new IntUnaryOperator() { // from class: l.ܺ۟ܽ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C17342.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i11) {
                                    return AbstractActivityC14026.m31833(this.f51860, i11);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C17342.$default$compose(this, intUnaryOperator2);
                                }
                            });
                            if (C0854.f81826 != 0) {
                                iM55680 = C0873.m55680("ܶۧ") ^ i6;
                                i7 = ((iM55680 ^ i5) * (-4117)) ^ (-1158989231);
                                i = 179503604;
                            } else {
                                iM55680 = (C0873.m55680("᩵ܽ") ^ i5) * 75;
                                i7 = ((iM55680 ^ i6) * (-26993)) ^ (-1695339599);
                                i = 1634280586;
                            }
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1827229233:
                    case 1703785644:
                        if (this.f39556) {
                            iM55979 = C0946.m55979("֨۠") ^ i6;
                            i7 = ((iM55979 ^ i5) * 24899) ^ 2083044614;
                            i2 = -786488436;
                        } else {
                            iM55979 = (i5 - C0946.m55979("᩹۠")) * (-99);
                            i7 = ((iM55979 ^ i6) * (-24989)) ^ (-372704475);
                            i2 = -1360983333;
                        }
                        i9 = iM55979 ^ i2;
                        i3 = 0;
                        break;
                    case -1750079621:
                    case -624856913:
                        map = interfaceC13123Range.map(intUnaryOperator);
                        arrayList = this.f39553;
                        if (C0930.f81879 <= 0) {
                            iM55680 = C0946.m55979("۟ۢ") ^ i5;
                            i7 = ((iM55680 ^ i6) * 23523) ^ 1787064497;
                            i = -2013467150;
                        } else {
                            iM55680 = (C0946.m55979("ۙ֫") ^ i6) * (-7);
                            i7 = ((iM55680 ^ i5) * 22291) ^ (-208188914);
                            i = -1894768414;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case -1435906092:
                    case 2066923420:
                        C0992.m56109(arrayList);
                        intFunction = new IntFunction() { // from class: l.ۖ۟ܽ
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i11) {
                                ArrayList arrayList3 = null;
                                int i12 = 599159505;
                                int i13 = C0912.f81867;
                                int i14 = C1012.f81938;
                                int iM559711 = C0946.m55979("֨ۨ") ^ i14;
                                int i15 = ((iM559711 ^ i13) * (-9745)) ^ 1470785999;
                                int i16 = 704289462;
                                while (true) {
                                    i12 = ((((i12 ^ i13) * 18539) >> 31) & i15) ^ (iM559711 ^ i16);
                                    switch (i12) {
                                        case -1789606628:
                                        case -159656202:
                                            C1012.m56134();
                                            C1194.m56396();
                                            return null;
                                        case -1709554895:
                                        case 1975300139:
                                            if (RunnableC0897.f81856) {
                                                iM559711 = (C0946.m55979("ܽܿ") + i14) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i15 = ((iM559711 ^ i13) * (-26001)) ^ (-848471234);
                                                i16 = -450786936;
                                            } else {
                                                iM559711 = (C0873.m55680("ۡۡ") + i13) * (-105);
                                                i15 = ((iM559711 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            }
                                            break;
                                        case -1662093346:
                                        case 1414590293:
                                            if (C0882.f81846) {
                                                iM559711 = C0946.m55979("ܶ᩵") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            } else {
                                                iM559711 = (i14 - C0946.m55979("᩸ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i15 = ((iM559711 ^ i13) * (-14619)) ^ (-1133127215);
                                                i16 = 1189143193;
                                            }
                                            break;
                                        case -1621434546:
                                        case -686487683:
                                            if (C1229.m56410() != 0) {
                                                iM559711 = (C0873.m55680("ۡۡ") + i13) * (-105);
                                                i15 = ((iM559711 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            } else {
                                                iM559711 = C0873.m55680("ۡ۬") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 6433) ^ (-1379169166);
                                                i16 = 1786589636;
                                            }
                                            break;
                                        case -1567032186:
                                        case -1161304849:
                                            if (C0917.f81868) {
                                                iM559711 = (i14 - C0946.m55979("֨ۚ")) * 35;
                                                i15 = ((iM559711 ^ i13) * 27629) ^ 811842169;
                                                i16 = -287880606;
                                            } else {
                                                iM559711 = (C0946.m55979("ۤ᩶") ^ i14) * (-69);
                                                i15 = ((iM559711 ^ i13) * 32585) ^ 1671754368;
                                                i16 = 1154574709;
                                            }
                                            break;
                                        case -385302442:
                                        case 1938486298:
                                            if (C1036.m56257() <= 0) {
                                                iM559711 = (C0873.m55680("᩶ۢ") + i14) * 7;
                                                i15 = ((iM559711 ^ i13) * (-9777)) ^ 251382212;
                                                i16 = 413493077;
                                            } else {
                                                iM559711 = C0946.m55979("ܶ᩵") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            }
                                            break;
                                        case -352290023:
                                        case 1191910773:
                                            if (C1929.m56553()) {
                                                iM559711 = C0946.m55979("ۨܺ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-3745)) ^ 209180024;
                                                i16 = 1113382299;
                                            } else {
                                                iM559711 = C0946.m55979("ܶ᩵") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            }
                                            break;
                                        case -146252831:
                                        case 1849452491:
                                            RunnableC1014.m56177();
                                            iM559711 = C0946.m55979("ܶ᩵") ^ i13;
                                            i15 = ((iM559711 ^ i14) * 19981) ^ 823230861;
                                            i16 = -1246628707;
                                            break;
                                        case 48687622:
                                        case 754678016:
                                            if (C0992.f81922 >= 0) {
                                                iM559711 = (C0873.m55680("᩶ۢ") + i14) * 7;
                                                i15 = ((iM559711 ^ i13) * (-9777)) ^ 251382212;
                                                i16 = 413493077;
                                            } else {
                                                iM559711 = C0946.m55979("ۖۤ") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-13537)) ^ (-1111338939);
                                                i16 = 1281078659;
                                            }
                                            break;
                                        case 230825031:
                                        case 796444608:
                                            C0866.m55645();
                                            if (!C1024.f81946) {
                                                iM559711 = (C0873.m55680("ۡۡ") + i13) * (-105);
                                                i15 = ((iM559711 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            } else {
                                                iM559711 = C0946.m55979("ܶ᩵") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            }
                                            break;
                                        case 231216254:
                                        case 699872891:
                                            if (C0946.f81894 != 0) {
                                                iM559711 = C0946.m55979("ܶ᩵") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            } else {
                                                iM559711 = (C0946.m55979("᩻ۙ") ^ i13) * (-71);
                                                i15 = ((iM559711 ^ i14) * (-5115)) ^ (-1016791725);
                                                i16 = -1852167972;
                                            }
                                            break;
                                        case 261207257:
                                        case 1851833682:
                                            if (C1046.m56302() != 0) {
                                                iM559711 = (C0873.m55680("ۡۡ") + i13) * (-105);
                                                i15 = ((iM559711 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            } else {
                                                iM559711 = C0946.m55979("۟ۧ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * 5621) ^ (-939224233);
                                                i16 = 1644267453;
                                            }
                                            break;
                                        case 280540561:
                                        case 1181961007:
                                            arrayList3 = arrayList;
                                            if (C0894.f81854 >= 0) {
                                                iM559711 = (i14 - C0946.m55979("֨ۚ")) * 35;
                                                i15 = ((iM559711 ^ i13) * 27629) ^ 811842169;
                                                i16 = -287880606;
                                            } else {
                                                iM559711 = (C0946.m55979("ۗ᩷") ^ i13) * 23;
                                                i15 = ((iM559711 ^ i14) * 20695) ^ (-1285672142);
                                                i16 = 352752267;
                                            }
                                            break;
                                        case 1148861397:
                                        case 1307795895:
                                            if (C0967.f81910 >= 0) {
                                                iM559711 = (i14 - C0946.m55979("֨ۚ")) * 35;
                                                i15 = ((iM559711 ^ i13) * 27629) ^ 811842169;
                                                i16 = -287880606;
                                            } else {
                                                iM559711 = (C0946.m55979("᩻ܰ") ^ i14) * (-49);
                                                i15 = ((iM559711 ^ i13) * 17789) ^ (-1476612971);
                                                i16 = 1178437826;
                                            }
                                            break;
                                        case 1628863518:
                                        case 2047410686:
                                            if (RunnableC0938.f81886 >= 0) {
                                                iM559711 = (C0873.m55680("᩶ۢ") + i14) * 7;
                                                i15 = ((iM559711 ^ i13) * (-9777)) ^ 251382212;
                                                i16 = 413493077;
                                            } else {
                                                iM559711 = (C0946.m55979("֡ۙ") + i13) * 13;
                                                i15 = ((iM559711 ^ i14) * 25455) ^ (-1753674354);
                                                i16 = 1017461323;
                                            }
                                            break;
                                        default:
                                            return (C10674) C0992.m56115(arrayList3, i11);
                                    }
                                }
                            }
                        };
                        if (!C0947.f81895) {
                            iM55680 = (C0946.m55979("᩵ۙ") + i5) * (-61);
                            i7 = ((iM55680 ^ i6) * 29721) ^ 1080715384;
                            i = -1237735293;
                            i9 = iM55680 ^ i;
                        }
                        break;
                    case -1394624094:
                    case -61535523:
                        C0882.m55710();
                        C0873.m55678();
                        return null;
                    case -795020749:
                    case 1516160351:
                        InterfaceC19157 interfaceC19157M55701 = C0877.m55701(this.f39553);
                        if (C1053.m56327() < 0) {
                            int i11 = 1;
                            if (!C1048.f81963) {
                                break;
                            }
                            return interfaceC19157M55701.filter(new C17653(i11)).toList();
                        }
                        iM55680 = (C0873.m55680("ۧۨ") ^ i5) * 75;
                        i7 = ((iM55680 ^ i6) * (-24577)) ^ 887195557;
                        i = 278565693;
                        i9 = iM55680 ^ i;
                        break;
                    case -683941169:
                    case 248421515:
                        return map.mapToObj(intFunction).toList();
                    case -527220701:
                    case 470113706:
                        if (this.f39549) {
                            iM55680 = C0946.m55979("ܶ֫") ^ i6;
                            i7 = ((iM55680 ^ i5) * (-21895)) ^ (-2081984850);
                            i = 642222605;
                        } else {
                            iM55680 = C0873.m55680("᩷ܺ") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-21887)) ^ 144825096;
                            i = -1308447436;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case 25418628:
                    case 1624650799:
                        return this.f39553;
                    case 207158853:
                    case 2105763581:
                        C1024.m56209();
                        iM55680 = C0946.m55979("ۖ֫") ^ i6;
                        i7 = ((iM55680 ^ i5) * 7383) ^ 598182428;
                        i = -1080096548;
                        i9 = iM55680 ^ i;
                        break;
                    case 967139011:
                    case 1651806760:
                        if (this.f39556) {
                            iM55680 = C0873.m55680("᩹ܽ") ^ i5;
                            i7 = ((iM55680 ^ i6) * (-21217)) ^ 1811285808;
                            i = 1530593667;
                        } else {
                            iM55680 = (C0946.m55979("ۜۘ") + i6) * (-35);
                            i7 = ((iM55680 ^ i5) * 32341) ^ (-778830721);
                            i = -604779265;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case 1232682001:
                    case 1813564987:
                        if (C1229.f82066 < 0) {
                            iM55680 = C0946.m55979("ۖ֫") ^ i6;
                            i7 = ((iM55680 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            iM55680 = C0946.m55979("۟ۢ") ^ i5;
                            i7 = ((iM55680 ^ i6) * 23523) ^ 1787064497;
                            i = -2013467150;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    case 1240330175:
                    case 1940856145:
                        C1025.m56230();
                        if (C0845.m55584() > 0) {
                            iM55680 = C0946.m55979("ۖ֫") ^ i6;
                            i7 = ((iM55680 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            iM55680 = (C0873.m55680("ۧۨ") ^ i5) * 75;
                            i7 = ((iM55680 ^ i6) * (-24577)) ^ 887195557;
                            i = 278565693;
                        }
                        i9 = iM55680 ^ i;
                        break;
                    default:
                        C0937.m55918();
                        if (C0890.f81849 == 0) {
                            iM55680 = C0946.m55979("ۖ֫") ^ i6;
                            i7 = ((iM55680 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            iM55680 = C0873.m55680("ܶۧ") ^ i6;
                            i7 = ((iM55680 ^ i5) * (-4117)) ^ (-1158989231);
                            i = 179503604;
                        }
                        i9 = iM55680 ^ i;
                        break;
                }
            }
            iM559710 = C0946.m55979("۟ۚ") ^ i5;
            i7 = ((iM559710 ^ i6) * (-24421)) ^ (-364119369);
            i8 = -1035338704;
        }
    }

    static {
        AbstractC17043 abstractC17043 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1159760954;
        int i7 = C0898.f81858;
        int i8 = C1028.f81950;
        int iM55680 = (C0873.m55680("ۛۤ") ^ i8) * (-13);
        int i9 = ((iM55680 ^ i7) * (-19207)) ^ 866237809;
        int i10 = 1665997497;
        while (true) {
            i6 = ((((i6 ^ i7) * (-11871)) >> 31) & i9) ^ (iM55680 ^ i10);
            switch (i6) {
                case -1917890018:
                case 40907422:
                    f39541 = C1024.m56217(abstractC17043, C1964.m56584(sArr2, i4, i5, i3));
                    return;
                case -1912698471:
                case 1495497545:
                    i2 = i * i;
                    s2 = 36096;
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ۙ۬") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        iM55680 = (C0946.m55979("ۜۘ") + i8) * (-79);
                        i9 = ((iM55680 ^ i7) * (-6481)) ^ (-720021226);
                        i10 = -199696591;
                    }
                    break;
                case -1864431450:
                case -483252525:
                    i5 = 6;
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("ۛ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    } else {
                        iM55680 = (C0946.m55979("ܿۧ") ^ i8) * (-31);
                        i9 = ((iM55680 ^ i7) * 7777) ^ (-728105627);
                        i10 = 101487571;
                    }
                    break;
                case -1766050085:
                case 1793954577:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("ۧ֡") + i7) * (-103);
                        i9 = ((iM55680 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM55680 = (C0873.m55680("ۚ᩺") ^ i8) * 127;
                        i9 = ((iM55680 ^ i7) * 12981) ^ (-1771433130);
                        i10 = 805563330;
                    }
                    break;
                case -1514235043:
                case -1066182944:
                    sArr = f82167;
                    c = 0;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ۧ֡") + i7) * (-103);
                        i9 = ((iM55680 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM55680 = (C0873.m55680("ۧܳ") ^ i7) * (-85);
                        i9 = ((iM55680 ^ i8) * (-2293)) ^ (-212618402);
                        i10 = -1918724625;
                    }
                    break;
                case -1508216992:
                case 905623481:
                    if (C0949.f81897 < 0) {
                        iM55680 = (C0873.m55680("ۧ֡") + i7) * (-103);
                        i9 = ((iM55680 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM55680 = C0946.m55979("ۛ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    }
                    break;
                case -1505638493:
                case 329072830:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("ۛ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM55680 = (C0946.m55979("᩷֨") + i8) * (-97);
                        i9 = ((iM55680 ^ i7) * 323) ^ (-641349883);
                        i10 = -510887060;
                    }
                    break;
                case -1326620288:
                case 995190875:
                    abstractC17043 = C17853.f53284;
                    sArr2 = f82167;
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0873.m55680("ۙ۬") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        iM55680 = (C0873.m55680("ۖܳ") + i7) * 81;
                        i9 = ((iM55680 ^ i8) * (-23393)) ^ (-1860901729);
                        i10 = -1922012804;
                    }
                    break;
                case -1229580000:
                case 942225761:
                    if (i2 - (s * s2) < 0) {
                        iM55680 = C0873.m55680("᩶۫") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-13179)) ^ (-1501453135);
                        i10 = 825262515;
                    } else {
                        iM55680 = (C0946.m55979("ۘܰ") + i7) * 27;
                        i9 = ((iM55680 ^ i8) * (-20823)) ^ 2027049039;
                        i10 = -1918137173;
                    }
                    break;
                case -988907167:
                case -560757112:
                    s = sArr[c];
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("ۛ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM55680 = (C0873.m55680("۟֡") ^ i8) * (-31);
                        i9 = ((iM55680 ^ i7) * 7163) ^ (-69023048);
                        i10 = 1128759285;
                    }
                    break;
                case -924830062:
                case 2145937087:
                    i = s + 9024;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("ۛ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM55680 = C0873.m55680("᩹ۛ") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-25357)) ^ 180982989;
                        i10 = 1369720579;
                    }
                    break;
                case -703191382:
                case 1475015267:
                    i3 = 16744;
                    iM55680 = C0873.m55680("᩸ܺ") ^ i7;
                    i9 = ((iM55680 ^ i8) * 25937) ^ (-1145486524);
                    i10 = -1200988790;
                    break;
                case -636418864:
                case 1046502345:
                    if (!C1048.f81963) {
                        iM55680 = C0873.m55680("ۙ۬") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        iM55680 = C0946.m55979("ۛ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    }
                    break;
                case -556258523:
                case -402777178:
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("ܳ֡") + i8) * (-7);
                        i9 = ((iM55680 ^ i7) * (-16523)) ^ (-317515707);
                        i10 = 959977129;
                    } else {
                        iM55680 = (C0873.m55680("ۧ֡") + i7) * (-103);
                        i9 = ((iM55680 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    }
                    break;
                case -38203752:
                case 154195634:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("ۧ֡") + i7) * (-103);
                        i9 = ((iM55680 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۧ᩵")) * 19;
                        i9 = ((iM55680 ^ i8) * 24091) ^ (-1585591040);
                        i10 = 2133409062;
                    }
                    break;
                case 137891527:
                case 2082322127:
                    C1048.m56305();
                    throw new RuntimeException();
                case 326758729:
                case 1806203083:
                    i3 = 38856;
                    iM55680 = C0873.m55680("᩸ܺ") ^ i7;
                    i9 = ((iM55680 ^ i8) * 25937) ^ (-1145486524);
                    i10 = -1200988790;
                    break;
                case 700190950:
                case 1065067273:
                    i4 = 1;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ۛ۬") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM55680 = C0946.m55979("᩷۠") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-18005)) ^ (-180540231);
                        i10 = -2048371329;
                    }
                    break;
                default:
                    C1071.m56343();
                    C1028.m56247();
                    iM55680 = C0946.m55979("ۛ۫") ^ i7;
                    i9 = ((iM55680 ^ i8) * (-10391)) ^ 867913005;
                    i10 = 12374655;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0280 A[PHI: r3 r7
      0x0280: PHI (r3v5 l.ۗ۟ܽ) = (r3v2 l.ۗ۟ܽ), (r3v2 l.ۗ۟ܽ), (r3v3 l.ۗ۟ܽ), (r3v2 l.ۗ۟ܽ), (r3v2 l.ۗ۟ܽ) binds: [B:72:0x027e, B:64:0x0242, B:40:0x0151, B:29:0x00d7, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r7v5 l.֡ۚۢ) = (r7v2 l.֡ۚۢ), (r7v2 l.֡ۚۢ), (r7v2 l.֡ۚۢ), (r7v3 l.֡ۚۢ), (r7v2 l.֡ۚۢ) binds: [B:72:0x027e, B:64:0x0242, B:40:0x0151, B:29:0x00d7, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0304 A[PHI: r4 r5 r6
      0x0304: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:84:0x0302, B:80:0x02e4, B:60:0x0223, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0304: PHI (r5v3 l.ۤۤᩳ) = (r5v2 l.ۤۤᩳ), (r5v2 l.ۤۤᩳ), (r5v2 l.ۤۤᩳ), (r5v4 l.ۤۤᩳ) binds: [B:84:0x0302, B:80:0x02e4, B:60:0x0223, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0304: PHI (r6v3 boolean) = (r6v2 boolean), (r6v2 boolean), (r6v2 boolean), (r6v4 boolean) binds: [B:84:0x0302, B:80:0x02e4, B:60:0x0223, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int iM55979;
        int i2;
        int i3;
        int i4 = 0;
        final C10674 c10674 = null;
        final C5309 c5309 = null;
        String str = null;
        C12096 c12096 = null;
        boolean z = false;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        String str2 = null;
        C12096 c12097 = null;
        int i5 = -1299363156;
        int i6 = AbstractC0942.f81890;
        int i7 = C0877.f81843;
        int iM55680 = C0873.m55680("ۚ֨") ^ i7;
        int i8 = ((iM55680 ^ i6) * 30147) ^ (-1313049031);
        int i9 = -83044687;
        while (true) {
            int i10 = iM55680 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * (-29063)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2006008532:
                    case -953220651:
                        str = c10674.f29534;
                        c12096 = c5309.f12475;
                        C1929.m56555(c12096, str);
                        z = true;
                        if (C1046.m56302() != 0) {
                            iM55979 = C0873.m55680("ۜ᩹") ^ i7;
                            i2 = ((iM55979 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM55979 = (C0946.m55979("ܽ۟") ^ i6) * (-65);
                            i2 = ((iM55979 ^ i7) * (-7907)) ^ 2043919401;
                            i3 = -1023920360;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1900373990:
                    case 1033651315:
                        i4 = this.f39547[i];
                        iM55979 = C0873.m55680("ܿᩳ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 9633) ^ (-1453078870);
                        i3 = 1302010640;
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1865511019:
                    case 2124183591:
                        if (this.f39549) {
                            iM55979 = C0946.m55979("ᩳۜ") ^ i7;
                            i2 = ((iM55979 ^ i6) * (-18983)) ^ (-183828522);
                            i3 = 16169166;
                        } else {
                            i4 = i;
                            iM55979 = C0873.m55680("ܿᩳ") ^ i6;
                            i2 = ((iM55979 ^ i7) * 9633) ^ (-1453078870);
                            i3 = 1302010640;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1830244957:
                    case 668517328:
                        this.f39551 = -1;
                        m31852(i4, view);
                        break;
                    case -1615694473:
                    case 895806000:
                        ServiceConnectionC1013.m56157();
                        if (!C0873.m55678()) {
                            iM55680 = C0946.m55979("ܽۢ") ^ i7;
                            i8 = ((iM55680 ^ i6) * (-13303)) ^ (-1613093226);
                            i9 = -1359248534;
                        } else {
                            iM55979 = C0946.m55979("۟ۛ") ^ i6;
                            i2 = ((iM55979 ^ i7) * (-1257)) ^ (-954969392);
                            i3 = -1354567148;
                            i10 = iM55979 ^ i3;
                            i8 = i2;
                        }
                        break;
                    case -1572638933:
                    case -1015339652:
                        C1003.m56123();
                        ServiceConnectionC1013.m56157();
                        break;
                    case -1503263806:
                    case 287074939:
                        C1048.m56305();
                        iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                        i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                        i3 = -2071181861;
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1155833373:
                    case 1069983792:
                        c5309 = new C5309(this);
                        C0894.m55771(c5309.f12477, c10674.m24566());
                        if (C0873.f81841 <= 0) {
                            iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                            i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        } else {
                            iM55979 = (i7 - C0873.m55680("۬ۖ")) * (-83);
                            i2 = ((iM55979 ^ i6) * (-18477)) ^ 1923217765;
                            i3 = 1422716123;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1143810793:
                    case 548699698:
                        if (!C0947.f81895) {
                            iM55680 = C0873.m55680("᩶֨") ^ i7;
                            i8 = ((iM55680 ^ i6) * 29999) ^ (-2007143827);
                            i9 = -1622128236;
                        }
                        iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                        i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                        i3 = -2071181861;
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1082603522:
                    case -1050292420:
                        if (RunnableC0897.f81856) {
                            iM55979 = (C0873.m55680("ۢ֨") + i7) * (-29);
                            i2 = ((iM55979 ^ i6) * 15985) ^ (-1783763885);
                            i3 = -2123173504;
                        } else {
                            iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                            i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -1057551829:
                    case 1967330978:
                        if (C0894.f81854 >= 0) {
                            iM55979 = C0873.m55680("ۜ᩹") ^ i7;
                            i2 = ((iM55979 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM55979 = (C0946.m55979("ۜ᩸") + i6) * 95;
                            i2 = ((iM55979 ^ i7) * 10647) ^ (-85775801);
                            i3 = -152504420;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -814863481:
                    case -363124593:
                        if (this.f39556) {
                            iM55979 = (i7 - C0873.m55680("ۛۨ")) * 3;
                            i2 = ((iM55979 ^ i6) * (-17635)) ^ (-261138732);
                            i3 = 939659699;
                        } else {
                            iM55979 = (C0873.m55680("֡ܽ") ^ i7) * (-117);
                            i2 = ((iM55979 ^ i6) * (-27381)) ^ (-2024635349);
                            i3 = 1318050440;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -762191021:
                    case 1269617121:
                        C1929.m56555(c12097, str);
                        C0898.m55802(C1229.m56405(dialogInterfaceC2564), 8);
                        iM55680 = (i6 - C0873.m55680("ۡۘ")) * 57;
                        i8 = ((iM55680 ^ i7) * 11473) ^ 1917421488;
                        i9 = 1998905520;
                        break;
                    case -669520546:
                    case -548730211:
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                            iM55979 = C0873.m55680("ۜ᩹") ^ i7;
                            i2 = ((iM55979 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM55979 = (i7 - C0946.m55979("᩸ܳ")) * (-65);
                            i2 = ((iM55979 ^ i6) * 21515) ^ 1277715680;
                            i3 = -256782363;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case -291395859:
                    case 1022104508:
                        c12097.mo27944(0, c12097.m32590());
                        C7050.m16226(c12097);
                        break;
                    case -130274161:
                    case 82750830:
                        mo31858(c10674.f29535);
                        break;
                    case 92452688:
                    case 2048386133:
                        if (C0863.f81833 <= 0) {
                            iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                            i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        } else {
                            iM55979 = (i6 - C0873.m55680("ܽ۠")) * 101;
                            i2 = ((iM55979 ^ i7) * 12557) ^ 1487138002;
                            i3 = 1751195971;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case 296087045:
                    case 642981789:
                        C1964.m56598(c12097, str2);
                        C1048.m56304(C1229.m56405(dialogInterfaceC2564), new View.OnClickListener() { // from class: l.᩶۟ܽ
                            {
                                int i11 = 434316898;
                                int i12 = C1124.f82007;
                                int i13 = C1017.f81942;
                                int iM559710 = (i12 - C0946.m55979("ܿۚ")) * (-75);
                                int i14 = ((iM559710 ^ i13) * 23797) ^ (-410926004);
                                int i15 = 1479672326;
                                while (true) {
                                    i11 = ((((i11 ^ i13) * 11179) >> 31) & i14) ^ (iM559710 ^ i15);
                                    switch (i11) {
                                        case -2031327845:
                                        case -181390582:
                                            C1028.m56247();
                                            iM559710 = (C0946.m55979("ۤۜ") + i12) * 3;
                                            i14 = ((iM559710 ^ i13) * 23875) ^ 233911378;
                                            i15 = -50645245;
                                            break;
                                        case -1949665300:
                                        case 1180596678:
                                            if (!AbstractC0942.m55971()) {
                                                iM559710 = (i12 - C0946.m55979("ۤᩳ")) * 95;
                                                i14 = ((iM559710 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM559710 = C0946.m55979("ᩳ۫") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            }
                                            break;
                                        case -1811771157:
                                        case -845033576:
                                            if (C0912.f81867 <= 0) {
                                                iM559710 = (i12 - C0946.m55979("ۛۧ")) * 115;
                                                i14 = ((iM559710 ^ i13) * 23295) ^ (-782053105);
                                                i15 = 78283389;
                                            } else {
                                                iM559710 = (C0873.m55680("᩺᩸") + i12) * (-9);
                                                i14 = ((iM559710 ^ i13) * 16089) ^ 1445371586;
                                                i15 = -456810223;
                                            }
                                            break;
                                        case -1683239728:
                                        case -838108108:
                                            if (C1012.f81938 >= 0) {
                                                iM559710 = C0873.m55680("ᩳ᩷") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 23041) ^ 55680639;
                                                i15 = 943638593;
                                            } else {
                                                iM559710 = (C0946.m55979("֡᩸") ^ i13) * 33;
                                                i14 = ((iM559710 ^ i12) * 16255) ^ (-1798635680);
                                                i15 = 1584196050;
                                            }
                                            break;
                                        case -1333168364:
                                        case 1367275389:
                                            if (C1028.f81950 <= 0) {
                                                iM559710 = (i12 - C0946.m55979("ۤᩳ")) * 95;
                                                i14 = ((iM559710 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM559710 = C0946.m55979("ۨۨ") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 11809) ^ 610473422;
                                                i15 = 471342802;
                                            }
                                            break;
                                        case -1329994515:
                                        case 1362967557:
                                            if (C1028.m56247() >= 0) {
                                                iM559710 = C0946.m55979("ᩳ۫") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            } else {
                                                iM559710 = C0946.m55979("ۢ۫") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 13273) ^ 445392711;
                                                i15 = 446899070;
                                            }
                                            break;
                                        case -1241531519:
                                        case 117107519:
                                            if (C0912.f81867 <= 0) {
                                                iM559710 = (i12 - C0946.m55979("ۤᩳ")) * 95;
                                                i14 = ((iM559710 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM559710 = C0946.m55979("᩵ܳ") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 8077) ^ 975592451;
                                                i15 = 591357757;
                                            }
                                            break;
                                        case -1026104379:
                                        case 524127634:
                                            if (C0854.f81826 == 0) {
                                                iM559710 = C0873.m55680("ᩳ᩷") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 23041) ^ 55680639;
                                                i15 = 943638593;
                                            } else {
                                                iM559710 = C0946.m55979("ᩳ۫") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            }
                                            break;
                                        case -812984253:
                                        case 1284199511:
                                            return;
                                        case -651209334:
                                        case 15232440:
                                            if (C1046.f81962 <= 0) {
                                                iM559710 = (C0946.m55979("ۤۜ") + i12) * 3;
                                                i14 = ((iM559710 ^ i13) * 23875) ^ 233911378;
                                                i15 = -50645245;
                                            } else {
                                                iM559710 = C0873.m55680("ۜ۬") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 1781) ^ (-1353205864);
                                                i15 = 1572768979;
                                            }
                                            break;
                                        case -523155239:
                                        case -85625066:
                                            if (C0930.f81879 <= 0) {
                                                iM559710 = (C0946.m55979("ۤۜ") + i12) * 3;
                                                i14 = ((iM559710 ^ i13) * 23875) ^ 233911378;
                                                i15 = -50645245;
                                            } else {
                                                iM559710 = (C0946.m55979("ܿۖ") + i13) * (-95);
                                                i14 = ((iM559710 ^ i12) * (-14167)) ^ (-1364498920);
                                                i15 = -1644089120;
                                            }
                                            break;
                                        case -377189777:
                                        case 469694569:
                                            C1012.m56134();
                                            if (C1024.m56209() < 0) {
                                                iM559710 = C0946.m55979("ᩳ۫") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            } else {
                                                iM559710 = (C0946.m55979("ۤۜ") + i12) * 3;
                                                i14 = ((iM559710 ^ i13) * 23875) ^ 233911378;
                                                i15 = -50645245;
                                            }
                                            break;
                                        case -141238432:
                                        case 571640595:
                                            if (RunnableC1014.m56177()) {
                                                iM559710 = (C0946.m55979("ۢۢ") + i13) * (-67);
                                                i14 = ((iM559710 ^ i12) * 16409) ^ (-674950983);
                                                i15 = 1356036021;
                                            } else {
                                                iM559710 = (i12 - C0946.m55979("ۛۧ")) * 115;
                                                i14 = ((iM559710 ^ i13) * 23295) ^ (-782053105);
                                                i15 = 78283389;
                                            }
                                            break;
                                        case 406963505:
                                        case 1278718674:
                                            if (C0894.f81854 >= 0) {
                                                iM559710 = (i12 - C0946.m55979("ۤᩳ")) * 95;
                                                i14 = ((iM559710 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM559710 = C0946.m55979("ۧۖ") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 32523) ^ (-1716995895);
                                                i15 = 828938332;
                                            }
                                            break;
                                        case 995934574:
                                        case 1012291081:
                                            C1028.m56247();
                                            throw new RuntimeException();
                                        default:
                                            if (C0955.f81898) {
                                                iM559710 = (i12 - C0946.m55979("ۤᩳ")) * 95;
                                                i14 = ((iM559710 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM559710 = (C0946.m55979("ܶۡ") ^ i12) * (-79);
                                                i14 = ((iM559710 ^ i13) * (-13175)) ^ (-661347570);
                                                i15 = 2070951825;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C10674 c10675 = null;
                                String str3 = null;
                                C5309 c53010 = null;
                                AbstractActivityC14026 abstractActivityC14026 = null;
                                C14696 c14696 = null;
                                int i11 = -1206866439;
                                int i12 = C0967.f81910;
                                int i13 = C0930.f81879;
                                int iM559710 = (C0946.m55979("᩹ۢ") ^ i12) * 93;
                                int i14 = ((iM559710 ^ i13) * 7073) ^ 1343526256;
                                int i15 = 405710216;
                                while (true) {
                                    i11 = ((((i11 ^ i13) * 12807) >> 31) & i14) ^ (iM559710 ^ i15);
                                    switch (i11) {
                                        case -1847030786:
                                        case 2007557633:
                                            c14696.notifyDataSetChanged();
                                            if (C1025.f81947 >= 0) {
                                                iM559710 = (C0946.m55979("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM559710 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            } else {
                                                iM559710 = C0946.m55979("ܶۤ") ^ i13;
                                                i14 = ((iM559710 ^ i12) * 16011) ^ (-1470545745);
                                                i15 = 829678834;
                                            }
                                            break;
                                        case -1708723026:
                                        case -1540541759:
                                            if (C0967.m56074()) {
                                                iM559710 = C0946.m55979("ۢ۬") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            } else {
                                                iM559710 = (i13 - C0946.m55979("ۗ᩷")) * 29;
                                                i14 = ((iM559710 ^ i12) * 19277) ^ 1196446929;
                                                i15 = 95449220;
                                            }
                                            break;
                                        case -1347186021:
                                        case -205507621:
                                            c10675 = c10674;
                                            if (C1048.m56305() >= 0) {
                                                iM559710 = C0946.m55979("ۢ۬") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            } else {
                                                iM559710 = (C0946.m55979("ܰܰ") ^ i12) * 97;
                                                i14 = ((iM559710 ^ i13) * 531) ^ (-116683928);
                                                i15 = -1493898896;
                                            }
                                            break;
                                        case -1241882068:
                                        case 835148473:
                                            C1964.m56597();
                                            iM559710 = C0946.m55979("ۢ۬") ^ i12;
                                            i14 = ((iM559710 ^ i13) * 3629) ^ 169170384;
                                            i15 = 1429897079;
                                            break;
                                        case -1117300879:
                                        case -560043159:
                                            C0873.m55678();
                                            break;
                                        case -1044716794:
                                        case 1011990912:
                                            if (C0955.f81898) {
                                                iM559710 = (i13 - C0946.m55979("᩸ۡ")) * 3;
                                                i14 = ((iM559710 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM559710 = C0873.m55680("᩺ۢ") ^ i12;
                                                i14 = ((iM559710 ^ i13) * (-29353)) ^ (-1376204608);
                                                i15 = 1118764915;
                                            }
                                            break;
                                        case -1032361609:
                                        case 278295544:
                                            c10675.m24562(str3);
                                            c53010 = c5309;
                                            if (RunnableC0938.f81886 >= 0) {
                                                iM559710 = (C0946.m55979("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM559710 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            } else {
                                                iM559710 = C0873.m55680("۫ܿ") ^ i13;
                                                i14 = ((iM559710 ^ i12) * (-2703)) ^ (-2120860466);
                                                i15 = 940662274;
                                            }
                                            break;
                                        case -999382102:
                                        case -431527288:
                                            if (C0917.f81868) {
                                                iM559710 = (C0946.m55979("ۙ۟") + i13) * 39;
                                                i14 = ((iM559710 ^ i12) * (-23877)) ^ (-88282423);
                                                i15 = 925643500;
                                            } else {
                                                iM559710 = C0946.m55979("ۢ۬") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            }
                                            break;
                                        case -922153841:
                                        case 1218242345:
                                            if (C1046.f81962 <= 0) {
                                                iM559710 = (i13 - C0946.m55979("᩸ۡ")) * 3;
                                                i14 = ((iM559710 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM559710 = (C0873.m55680("᩻ۖ") + i13) * 15;
                                                i14 = ((iM559710 ^ i12) * 16625) ^ 1865797147;
                                                i15 = 1317604996;
                                            }
                                            break;
                                        case -633053231:
                                        case 701988264:
                                            C0949.m56012();
                                            if (C1036.f81953 >= 0) {
                                                iM559710 = (i13 - C0946.m55979("᩸ۡ")) * 3;
                                                i14 = ((iM559710 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM559710 = C0946.m55979("ۢ۬") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            }
                                            break;
                                        case 380428864:
                                        case 1594201400:
                                            abstractActivityC14026 = c53010.f12478;
                                            c14696 = abstractActivityC14026.f39555;
                                            if (C0917.f81868) {
                                                iM559710 = (i13 - C0946.m55979("᩸ۡ")) * 3;
                                                i14 = ((iM559710 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM559710 = C0946.m55979("ۜܿ") ^ i12;
                                                i14 = ((iM559710 ^ i13) * (-16053)) ^ (-48883724);
                                                i15 = -66259530;
                                            }
                                            break;
                                        case 533619562:
                                        case 1904646145:
                                            abstractActivityC14026.m31854();
                                            C1024.m56208(c53010.f12474);
                                            break;
                                        case 1323918554:
                                        case 1651191049:
                                            if (C0955.f81898) {
                                                iM559710 = C0873.m55680("ܶۖ") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 11879) ^ (-609600980);
                                                i15 = 1338674590;
                                            } else {
                                                iM559710 = C0946.m55979("᩻ۘ") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 19801) ^ (-1835405483);
                                                i15 = -2049864161;
                                            }
                                            break;
                                        case 1338074276:
                                        case 1472931146:
                                            str3 = null;
                                            if (C1017.m56187() <= 0) {
                                                iM559710 = (C0946.m55979("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM559710 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            } else {
                                                iM559710 = C0946.m55979("ܺ᩻") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 14481) ^ (-546921380);
                                                i15 = -1691205331;
                                            }
                                            break;
                                        case 1473076243:
                                        case 1746975242:
                                            if (C0912.f81867 <= 0) {
                                                iM559710 = C0873.m55680("ܶۖ") ^ i12;
                                                i14 = ((iM559710 ^ i13) * 11879) ^ (-609600980);
                                                i15 = 1338674590;
                                            } else {
                                                iM559710 = (i13 - C0946.m55979("᩸ۡ")) * 3;
                                                i14 = ((iM559710 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            }
                                            break;
                                        default:
                                            if (C0917.m55854()) {
                                                iM559710 = (i13 - C0873.m55680("ۗᩴ")) * (-117);
                                                i14 = ((iM559710 ^ i12) * 23985) ^ (-109573839);
                                                i15 = -1618020301;
                                            } else {
                                                iM559710 = (C0946.m55979("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM559710 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM55680 = (i6 - C0873.m55680("ۡۘ")) * 57;
                        i8 = ((iM55680 ^ i7) * 11473) ^ 1917421488;
                        i9 = 1998905520;
                        break;
                        break;
                    case 456224647:
                    case 588701671:
                        c10674 = (C10674) C0992.m56115(this.f39553, i4);
                        if (c10674.m24569()) {
                            iM55979 = C0946.m55979("᩹۟") ^ i6;
                            i2 = ((iM55979 ^ i7) * 20881) ^ 728543865;
                            i3 = 1380391275;
                        } else {
                            iM55979 = (C0873.m55680("۟ۚ") + i6) * (-79);
                            i2 = ((iM55979 ^ i7) * (-7229)) ^ 1061194209;
                            i3 = -1421675151;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case 772622075:
                    case 1899556516:
                        if (C0912.f81867 <= 0) {
                            iM55979 = C0946.m55979("۟ۛ") ^ i6;
                            i2 = ((iM55979 ^ i7) * (-1257)) ^ (-954969392);
                            i3 = -1354567148;
                        } else {
                            iM55979 = (C0946.m55979("ܶۘ") + i7) * (-121);
                            i2 = ((iM55979 ^ i6) * 23627) ^ (-484676421);
                            i3 = -1179814743;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case 1011044839:
                    case 1963076180:
                        c12096.m32471(z);
                        dialogInterfaceC2564 = c5309.f12474;
                        dialogInterfaceC2564.m3862();
                        Button buttonM56567 = C1929.m56567(dialogInterfaceC2564);
                        if (C0892.m55749()) {
                            C0947.m55996(buttonM56567, new View.OnClickListener() { // from class: l.᩹۟ܽ

                                /* JADX INFO: renamed from: ۛ֡ۜ, reason: not valid java name and contains not printable characters */
                                private static final short[] f83018 = {9072, -24500, -26522, -22631};

                                {
                                    int i11 = 927090723;
                                    int i12 = ViewOnClickListenerC0939.f81888;
                                    int i13 = C0863.f81833;
                                    int iM559710 = (C0946.m55979("ۖܽ") ^ i13) * (-119);
                                    int i14 = ((iM559710 ^ i12) * 16127) ^ 441251135;
                                    int i15 = -693521931;
                                    while (true) {
                                        i11 = ((((i11 ^ i12) * (-4799)) >> 31) & i14) ^ (iM559710 ^ i15);
                                        switch (i11) {
                                            case -2012546230:
                                            case 488692249:
                                                if (C0866.f81837 >= 0) {
                                                    iM559710 = (C0873.m55680("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM559710 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM559710 = (C0946.m55979("ۨ᩷") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                    i14 = ((iM559710 ^ i13) * 5645) ^ 1717471222;
                                                    i15 = 1872005417;
                                                }
                                                break;
                                            case -1913286193:
                                            case 1462533512:
                                                return;
                                            case -1801237731:
                                            case 159385286:
                                                if (C0949.f81897 >= 0) {
                                                    iM559710 = (C0946.m55979("᩺֨") ^ i13) * 101;
                                                    i14 = ((iM559710 ^ i12) * (-25795)) ^ 1261811619;
                                                    i15 = -1096867894;
                                                } else {
                                                    iM559710 = (C0873.m55680("ۜ᩶") ^ i12) * (-45);
                                                    i14 = ((iM559710 ^ i13) * (-25429)) ^ 1799846233;
                                                    i15 = -592855119;
                                                }
                                                break;
                                            case -1793063293:
                                            case 1292834876:
                                                if (C0967.m56074()) {
                                                    iM559710 = C0873.m55680("֨᩶") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-32115)) ^ 313192778;
                                                    i15 = -69177869;
                                                } else {
                                                    iM559710 = C0873.m55680("᩷۬") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-28499)) ^ 1870754464;
                                                    i15 = -1793201765;
                                                }
                                                break;
                                            case -1247568095:
                                            case 125964194:
                                                if (C0967.f81910 >= 0) {
                                                    iM559710 = (C0873.m55680("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM559710 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM559710 = (C0946.m55979("᩺֨") ^ i13) * 101;
                                                    i14 = ((iM559710 ^ i12) * (-25795)) ^ 1261811619;
                                                    i15 = -1096867894;
                                                }
                                                break;
                                            case -1183277567:
                                            case 1524010698:
                                                if (C0947.f81895) {
                                                    iM559710 = (C0873.m55680("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM559710 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM559710 = C0946.m55979("ᩳᩳ") ^ i12;
                                                    i14 = ((iM559710 ^ i13) * (-31447)) ^ (-482118784);
                                                    i15 = -2103989198;
                                                }
                                                break;
                                            case -1126828125:
                                            case -53674493:
                                                if (C1024.f81946) {
                                                    iM559710 = C0873.m55680("֨᩶") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-32115)) ^ 313192778;
                                                    i15 = -69177869;
                                                } else {
                                                    iM559710 = C0873.m55680("ۡܺ") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * 31677) ^ 134000280;
                                                    i15 = -1584201351;
                                                }
                                                break;
                                            case -1064827358:
                                            case 1651359543:
                                                C1003.m56123();
                                                iM559710 = (C0946.m55979("᩺֨") ^ i13) * 101;
                                                i14 = ((iM559710 ^ i12) * (-25795)) ^ 1261811619;
                                                i15 = -1096867894;
                                                break;
                                            case -692631963:
                                            case 1203108131:
                                                if (C0912.f81867 <= 0) {
                                                    iM559710 = C0946.m55979("ۘܶ") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-31079)) ^ (-473388165);
                                                    i15 = -1864277227;
                                                } else {
                                                    iM559710 = (C0873.m55680("ܳ᩸") + i12) * (-103);
                                                    i14 = ((iM559710 ^ i13) * 17051) ^ 1941266725;
                                                    i15 = 884545052;
                                                }
                                                break;
                                            case -485759172:
                                            case 847436014:
                                                RunnableC0871.m55672();
                                                if (C1003.f81929 <= 0) {
                                                    iM559710 = C0946.m55979("ۘܶ") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-31079)) ^ (-473388165);
                                                    i15 = -1864277227;
                                                } else {
                                                    iM559710 = (C0873.m55680("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM559710 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                }
                                                break;
                                            case -449732118:
                                            case 301820512:
                                                if (C1124.f82007 >= 0) {
                                                    iM559710 = C0873.m55680("֨᩶") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-32115)) ^ 313192778;
                                                    i15 = -69177869;
                                                } else {
                                                    iM559710 = (C0873.m55680("֫۟") ^ i13) * (-87);
                                                    i14 = ((iM559710 ^ i12) * 25601) ^ 92576905;
                                                    i15 = -1661210833;
                                                }
                                                break;
                                            case -379423066:
                                            case -319902899:
                                                if (C1964.m56597() != 0) {
                                                    iM559710 = (C0873.m55680("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM559710 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM559710 = (C0946.m55979("ܶ۟") ^ i13) * 5;
                                                    i14 = ((iM559710 ^ i12) * 20593) ^ (-1340955104);
                                                    i15 = 1572119549;
                                                }
                                                break;
                                            case -303321938:
                                            case 1831401217:
                                                ViewOnClickListenerC0939.m55941();
                                                throw new RuntimeException();
                                            case 146632593:
                                            case 456418674:
                                                if (C0894.f81854 >= 0) {
                                                    iM559710 = (C0873.m55680("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM559710 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM559710 = (C0946.m55979("ۗ᩺") ^ i13) * 37;
                                                    i14 = ((iM559710 ^ i12) * (-27387)) ^ (-197618390);
                                                    i15 = 246634711;
                                                }
                                                break;
                                            case 1186164365:
                                            case 2108360843:
                                                if (C1044.f81959 >= 0) {
                                                    iM559710 = C0946.m55979("ۘܶ") ^ i13;
                                                    i14 = ((iM559710 ^ i12) * (-31079)) ^ (-473388165);
                                                    i15 = -1864277227;
                                                } else {
                                                    iM559710 = C0946.m55979("ᩳ᩷") ^ i12;
                                                    i14 = ((iM559710 ^ i13) * 22661) ^ 808204581;
                                                    i15 = -1056903984;
                                                }
                                                break;
                                            default:
                                                if (C0989.m56095() <= 0) {
                                                    iM559710 = (C0946.m55979("᩺֨") ^ i13) * 101;
                                                    i14 = ((iM559710 ^ i12) * (-25795)) ^ 1261811619;
                                                    i15 = -1096867894;
                                                } else {
                                                    iM559710 = C0946.m55979("ۙۤ") ^ i12;
                                                    i14 = ((iM559710 ^ i13) * (-3613)) ^ 1629486257;
                                                    i15 = 311431569;
                                                }
                                                break;
                                        }
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:31:0x00d8 A[PHI: r9
                                  0x00d8: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:30:0x00d6, B:17:0x0084, B:15:0x0081, B:109:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:33:0x0104 A[PHI: r11 r12 r13
                                  0x0104: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:15:0x0081, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
                                  0x0104: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:15:0x0081, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
                                  0x0104: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:15:0x0081, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:69:0x028c A[PHI: r16 r17
                                  0x028c: PHI (r16v6 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:68:0x028a, B:56:0x0226, B:107:0x028c] A[DONT_GENERATE, DONT_INLINE]
                                  0x028c: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:68:0x028a, B:56:0x0226, B:107:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int iM55681;
                                    int i11;
                                    int i12;
                                    int iM55682;
                                    int i13;
                                    short[] sArr;
                                    ViewOnClickListenerC23414 viewOnClickListenerC23414 = this;
                                    int i14 = 853964741;
                                    int i15 = C1012.f81938;
                                    int i16 = C1028.f81950;
                                    int iM55683 = (C0873.m55680("ᩳ᩺") ^ i15) * (-29);
                                    int i17 = ((iM55683 ^ i16) * (-23729)) ^ 167432371;
                                    int i18 = iM55683 ^ 425494260;
                                    String str3 = null;
                                    short[] sArr2 = null;
                                    short[] sArr3 = null;
                                    int iM559710 = 0;
                                    int i19 = 0;
                                    int i20 = 0;
                                    int i21 = 0;
                                    int i22 = 0;
                                    int i23 = 0;
                                    char c = 0;
                                    short s = 0;
                                    short s2 = 0;
                                    short s3 = 0;
                                    C10674 c10675 = null;
                                    AbstractActivityC14026 abstractActivityC14026 = null;
                                    String strM55591 = null;
                                    InterfaceC9768 interfaceC9768M56467 = null;
                                    C12096 c12098 = null;
                                    C5309 c53010 = null;
                                    while (true) {
                                        i14 = i18 ^ (i17 & (((i14 ^ i16) * (-29125)) >> 31));
                                        switch (i14) {
                                            case -1971716384:
                                            case 1808330608:
                                                i19 = 51149;
                                                iM55681 = (C0873.m55680("᩹ۧ") + i15) * 41;
                                                i11 = ((iM55681 ^ i16) * (-19731)) ^ (-727870107);
                                                i12 = -1417041878;
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1965122721:
                                            case 2106514124:
                                                C1053.m56327();
                                                if (C0937.f81884) {
                                                    iM55681 = (C0873.m55680("᩺۟") ^ i16) * 73;
                                                    i11 = ((iM55681 ^ i15) * (-12691)) ^ 1885641771;
                                                    i12 = 1216008584;
                                                } else {
                                                    iM55681 = C0946.m55979("۫ۨ") ^ i15;
                                                    i11 = ((iM55681 ^ i16) * (-1425)) ^ (-468453997);
                                                    i12 = -497236945;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1824833070:
                                            case 1698566393:
                                                if (C0946.f81894 != 0) {
                                                    iM55682 = C0873.m55680("ܺ۫") ^ i15;
                                                    i17 = ((iM55682 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                } else {
                                                    iM55682 = C0873.m55680("᩹ܰ") ^ i15;
                                                    i17 = ((iM55682 ^ i16) * (-14737)) ^ 1450338643;
                                                    i13 = -1685033673;
                                                }
                                                i18 = iM55682 ^ i13;
                                                viewOnClickListenerC23414 = this;
                                                break;
                                            case -1683327363:
                                            case 1041421333:
                                                c10675 = c10674;
                                                if (ViewOnClickListenerC0939.m55949(strM55591, c10675.f29534)) {
                                                    iM55681 = (C0873.m55680("۫ܽ") + i16) * 71;
                                                    i11 = ((iM55681 ^ i15) * 29591) ^ (-1931050998);
                                                    i12 = -1836647625;
                                                } else {
                                                    str3 = strM55591;
                                                    iM55681 = C0946.m55979("ۘᩳ") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * (-6055)) ^ (-1801321479);
                                                    i12 = -1143002906;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1502396094:
                                            case -1099284320:
                                                C0917.m55842(2122484687 ^ iM559710);
                                                C0882.m55722(c12098);
                                                break;
                                            case -1502308526:
                                            case 35700761:
                                                C0892.m55749();
                                                if (C0845.f81821 < 0) {
                                                    sArr = sArr2;
                                                    int iM559711 = C0946.m55979("᩶ۨ") ^ i15;
                                                    i18 = iM559711 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM559711 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC23414 = this;
                                                } else {
                                                    iM55681 = C0946.m55979("۫ۨ") ^ i15;
                                                    i11 = ((iM55681 ^ i16) * (-1425)) ^ (-468453997);
                                                    i12 = -497236945;
                                                    i18 = iM55681 ^ i12;
                                                    i17 = i11;
                                                }
                                                break;
                                            case -1471758712:
                                            case 211926356:
                                                if (i22 - (i23 * i23) <= 0) {
                                                    iM55681 = C0873.m55680("᩹۟") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * (-20077)) ^ (-515838079);
                                                    i12 = 219323411;
                                                } else {
                                                    iM55681 = C0946.m55979("ۜ۟") ^ i15;
                                                    i11 = ((iM55681 ^ i16) * (-31429)) ^ 1585462585;
                                                    i12 = -1593301854;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1420915956:
                                            case 981944302:
                                                c53010 = c5309;
                                                c12098 = c53010.f12476;
                                                interfaceC9768M56467 = C1404.m56467(c12098);
                                                if (C0898.f81858 > 0) {
                                                    iM55681 = C0873.m55680("ۜۨ") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * 23277) ^ 1736215459;
                                                    i12 = -648410682;
                                                    i18 = iM55681 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM559712 = C0946.m55979("᩶ۨ") ^ i15;
                                                    i18 = iM559712 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM559712 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC23414 = this;
                                                }
                                                break;
                                            case -1338079303:
                                            case 1464353370:
                                                C0992.m56107();
                                                break;
                                            case -1256837343:
                                            case -1081894225:
                                                strM55591 = C0845.m55591(interfaceC9768M56467);
                                                abstractActivityC14026 = c53010.f12478;
                                                if (abstractActivityC14026.mo21650(strM55591)) {
                                                    iM55681 = C0873.m55680("᩹۬") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * (-13823)) ^ (-218958282);
                                                    i12 = 1489545059;
                                                } else {
                                                    iM55681 = C0873.m55680("۟ۙ") ^ i15;
                                                    i11 = ((iM55681 ^ i16) * (-13735)) ^ (-925412237);
                                                    i12 = -783609641;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1145882934:
                                            case 337421321:
                                                i19 = 38397;
                                                iM55681 = (C0873.m55680("᩹ۧ") + i15) * 41;
                                                i11 = ((iM55681 ^ i16) * (-19731)) ^ (-727870107);
                                                i12 = -1417041878;
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1145090359:
                                            case 179276085:
                                                iM559710 = C0946.m55979(ServiceConnectionC1013.m56161(sArr3, i21, i20, i19));
                                                if (C1003.f81929 <= 0) {
                                                    iM55681 = C0946.m55979("۫ۨ") ^ i15;
                                                    i11 = ((iM55681 ^ i16) * (-1425)) ^ (-468453997);
                                                    i12 = -497236945;
                                                } else {
                                                    iM55681 = C0873.m55680("᩵ۨ") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * 2791) ^ 882281904;
                                                    i12 = -660589738;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1104761799:
                                            case 227123024:
                                                s2 = sArr2[c];
                                                s = 65008;
                                                if (!AbstractC0942.m55971()) {
                                                    iM55681 = C0873.m55680("ܺ֫") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * (-28393)) ^ (-966083310);
                                                    i12 = 1788319077;
                                                    i18 = iM55681 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    iM55682 = C0873.m55680("ܺ۫") ^ i15;
                                                    i17 = ((iM55682 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                    i18 = iM55682 ^ i13;
                                                    viewOnClickListenerC23414 = this;
                                                }
                                                break;
                                            case -913878701:
                                            case 335956182:
                                                str3 = null;
                                                iM55681 = C0946.m55979("ۘᩳ") ^ i16;
                                                i11 = ((iM55681 ^ i15) * (-6055)) ^ (-1801321479);
                                                i12 = -1143002906;
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -586772840:
                                            case 460951431:
                                                c10675.m24562(str3);
                                                abstractActivityC14026.f39555.notifyDataSetChanged();
                                                if (C0906.f81862 < 0) {
                                                    iM55681 = (C0946.m55979("᩺ۛ") + i15) * (-123);
                                                    i11 = ((iM55681 ^ i16) * 13751) ^ (-1417356023);
                                                    i12 = 217390753;
                                                    i18 = iM55681 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    iM55682 = C0873.m55680("ܺ۫") ^ i15;
                                                    i17 = ((iM55682 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                    i18 = iM55682 ^ i13;
                                                    viewOnClickListenerC23414 = this;
                                                }
                                                break;
                                            case -245394484:
                                            case 1299976957:
                                                abstractActivityC14026.m31854();
                                                C0917.m55847(c53010.f12474);
                                                break;
                                            case -63230421:
                                            case 301829985:
                                                C0863.m55643();
                                                if (C1964.m56597() == 0) {
                                                    iM55681 = C0946.m55979("ۗۖ") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * 16701) ^ 474098689;
                                                    i12 = 1694061091;
                                                    i18 = iM55681 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM559713 = C0946.m55979("᩶ۨ") ^ i15;
                                                    i18 = iM559713 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM559713 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC23414 = this;
                                                }
                                                break;
                                            case 206452785:
                                            case 1938154503:
                                                i22 = s2 * s;
                                                s3 = 16252;
                                                if (!C0866.m55645()) {
                                                    iM55682 = C0873.m55680("ܺ۫") ^ i15;
                                                    i17 = ((iM55682 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                    i18 = iM55682 ^ i13;
                                                    viewOnClickListenerC23414 = this;
                                                } else {
                                                    iM55681 = (i16 - C0946.m55979("ۛۡ")) * 7;
                                                    i11 = ((iM55681 ^ i15) * (-15021)) ^ 449439314;
                                                    i12 = -1669226659;
                                                    i18 = iM55681 ^ i12;
                                                    i17 = i11;
                                                }
                                                break;
                                            case 313162411:
                                            case 472911048:
                                                RunnableC0897.m55784();
                                                iM55681 = C0946.m55979("۫ۨ") ^ i15;
                                                i11 = ((iM55681 ^ i16) * (-1425)) ^ (-468453997);
                                                i12 = -497236945;
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case 780602824:
                                            case 1505237981:
                                                sArr = f83018;
                                                if (C1229.m56410() == 0) {
                                                    int iM55684 = (C0873.m55680("۬ۛ") + i16) * (-89);
                                                    i11 = ((iM55684 ^ i15) * (-869)) ^ 1589904155;
                                                    i18 = iM55684 ^ 1941998556;
                                                    viewOnClickListenerC23414 = this;
                                                    sArr2 = sArr;
                                                    i17 = i11;
                                                } else {
                                                    int iM559714 = C0946.m55979("᩶ۨ") ^ i15;
                                                    i18 = iM559714 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM559714 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC23414 = this;
                                                }
                                                break;
                                            case 1227268871:
                                            case 1307059984:
                                                c = 0;
                                                if (RunnableC0871.m55672() >= 0) {
                                                    iM55681 = C0946.m55979("ۗۖ") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * 16701) ^ 474098689;
                                                    i12 = 1694061091;
                                                } else {
                                                    iM55681 = (i15 - C0873.m55680("᩹᩵")) * (-35);
                                                    i11 = ((iM55681 ^ i16) * (-837)) ^ 1621621322;
                                                    i12 = 857916684;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            case 1399546148:
                                            case 2044160309:
                                                i23 = s2 + s3;
                                                if (RunnableC1014.m56177()) {
                                                    iM55681 = C0946.m55979("ۗۘ") ^ i15;
                                                    i11 = ((iM55681 ^ i16) * (-29633)) ^ 1151046152;
                                                    i12 = 491929409;
                                                } else {
                                                    iM55681 = C0946.m55979("ۗۖ") ^ i16;
                                                    i11 = ((iM55681 ^ i15) * 16701) ^ 474098689;
                                                    i12 = 1694061091;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                            default:
                                                sArr3 = f83018;
                                                i21 = 1;
                                                i20 = 3;
                                                if (C0877.f81843 >= 0) {
                                                    iM55681 = (C0873.m55680("᩺۟") ^ i16) * 73;
                                                    i11 = ((iM55681 ^ i15) * (-12691)) ^ 1885641771;
                                                    i12 = 1216008584;
                                                } else {
                                                    iM55681 = (C0873.m55680("ۘܶ") ^ i15) * (-63);
                                                    i11 = ((iM55681 ^ i16) * (-23875)) ^ (-2114596357);
                                                    i12 = 1700522947;
                                                }
                                                i18 = iM55681 ^ i12;
                                                i17 = i11;
                                                break;
                                        }
                                        return;
                                    }
                                }
                            });
                            str2 = c10674.f29536;
                            c12097 = c5309.f12476;
                            if (str2 == null) {
                                iM55979 = (i7 - C0873.m55680("᩶ۨ")) * (-55);
                                i2 = ((iM55979 ^ i6) * 26855) ^ 554286770;
                                i3 = 639617634;
                            } else {
                                iM55979 = (C0873.m55680("᩻ܿ") ^ i6) * 7;
                                i2 = ((iM55979 ^ i7) * 28281) ^ (-1487686476);
                                i3 = 1325795220;
                            }
                        } else {
                            iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                            i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case 1075460656:
                    case 1636027017:
                        if (C0894.m55769() >= 0) {
                            iM55979 = C0873.m55680("ۜ᩹") ^ i7;
                            i2 = ((iM55979 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM55979 = (C0873.m55680("ܺۨ") + i7) * 65;
                            i2 = ((iM55979 ^ i6) * (-12687)) ^ 1218243706;
                            i3 = 1556888556;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    case 1485717507:
                    case 1710144616:
                        if (C1012.m56134() <= 0) {
                            iM55979 = C0946.m55979("۟ۛ") ^ i6;
                            i2 = ((iM55979 ^ i7) * (-1257)) ^ (-954969392);
                            i3 = -1354567148;
                        } else {
                            iM55979 = C0946.m55979("۠ܳ") ^ i6;
                            i2 = ((iM55979 ^ i7) * (-7545)) ^ (-60887591);
                            i3 = -1748001556;
                        }
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                    default:
                        if (C1964.f83032 > 0) {
                            iM55680 = C0946.m55979("ܽۢ") ^ i7;
                            i8 = ((iM55680 ^ i6) * (-13303)) ^ (-1613093226);
                            i9 = -1359248534;
                        }
                        iM55979 = (i6 - C0946.m55979("ۢ᩵")) * (-35);
                        i2 = ((iM55979 ^ i7) * 10393) ^ (-579203086);
                        i3 = -2071181861;
                        i10 = iM55979 ^ i3;
                        i8 = i2;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0a48 A[PHI: r9 r10 r16 r17 r18 r21 r23 r24 r26 r27 r28 r30 r31 r32 r36 r37 r39
      0x0a48: PHI (r9v109 int) = (r9v24 int), (r9v31 int), (r9v110 int) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r10v58 l.ۗۡ) = (r10v21 l.ۗۡ), (r10v26 l.ۗۡ), (r10v59 l.ۗۡ) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r16v23 int) = (r16v9 int), (r16v2 int), (r16v2 int) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r17v44 l.ۧۤ᩷) = (r17v19 l.ۧۤ᩷), (r17v26 l.ۧۤ᩷), (r17v45 l.ۧۤ᩷) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r18v43 short[]) = (r18v18 short[]), (r18v25 short[]), (r18v44 short[]) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r21v9 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r23v60 int) = (r23v20 int), (r23v27 int), (r23v61 int) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r24v54 java.lang.String) = (r24v19 java.lang.String), (r24v26 java.lang.String), (r24v55 java.lang.String) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r26v51 l.᩶ۡۡ) = (r26v19 l.᩶ۡۡ), (r26v26 l.᩶ۡۡ), (r26v52 l.᩶ۡۡ) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r27v52 java.lang.String) = (r27v18 java.lang.String), (r27v23 java.lang.String), (r27v53 java.lang.String) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r28v55 short[]) = (r28v18 short[]), (r28v25 short[]), (r28v56 short[]) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r30v75 l.ۖ۫ۜ) = (r30v30 l.ۖ۫ۜ), (r30v35 l.ۖ۫ۜ), (r30v76 l.ۖ۫ۜ) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r31v52 l.ۗ᩻ᩳ) = (r31v18 l.ۗ᩻ᩳ), (r31v23 l.ۗ᩻ᩳ), (r31v53 l.ۗ᩻ᩳ) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r32v26 int) = (r32v15 int), (r32v20 int), (r32v27 int) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r36v57 l.᩵ۚۢ) = (r36v24 l.᩵ۚۢ), (r36v32 l.᩵ۚۢ), (r36v58 l.᩵ۚۢ) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r37v24 int) = (r37v14 int), (r37v18 int), (r37v25 int) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0a48: PHI (r39v14 short[]) = (r39v6 short[]), (r39v1 short[]), (r39v1 short[]) binds: [B:171:0x0a46, B:144:0x080c, B:19:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0148, code lost:
    
        if (p067l.C1929.f83011 == 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v36 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v38 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r31v57 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.AttributeSet, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM55680;
        int i;
        int i2;
        DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4770;
        String strM55638;
        String str;
        int i3;
        int i4;
        int iM55979;
        int i5;
        int i6;
        DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4771;
        short[] sArr;
        short[] sArr2;
        int i7;
        int i8;
        short[] sArr3;
        int iM55681;
        int i9;
        int i10;
        int iM559710;
        int i11;
        int i12;
        int i13;
        int iM55682;
        int i14;
        ?? r8;
        int i15;
        DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4772;
        DialogInterfaceOnClickListenerC12770 dialogInterfaceOnClickListenerC12770;
        short[] sArr4;
        int i16;
        int i17;
        String str2;
        String str3;
        int i18;
        C21438 c21438;
        short[] sArr5;
        C20671 c20671;
        int iM55683;
        int iM559711;
        int i19;
        int i20;
        DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4773;
        C20671 c20672;
        C21438 c21439;
        short[] sArr6;
        int iM559712;
        int i21;
        int i22;
        int i23;
        DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4774;
        int iM55684;
        int i24;
        int i25;
        int iM559713;
        int i26;
        int i27;
        int i28;
        int iM55685;
        int i29;
        int i30;
        ?? r9;
        ?? r31;
        int iM559714;
        int i31;
        int i32;
        ?? r10;
        AbstractActivityC14026 abstractActivityC14026 = this;
        int i33 = 585808498;
        int i34 = C0877.f81843;
        int i35 = C1071.f81975;
        int iM559715 = (C0946.m55979("ۜ֨") + i35) * (-11);
        int i36 = ((iM559715 ^ i34) * 11177) ^ 2016438742;
        int i37 = iM559715 ^ (-685466002);
        DialogInterfaceOnClickListenerC12770 dialogInterfaceOnClickListenerC12771 = null;
        String str4 = null;
        C21438 c214310 = null;
        C20671 c20673 = null;
        DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4775 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int iM55998 = 0;
        boolean z = false;
        boolean z2 = false;
        int i38 = 0;
        int i39 = 0;
        int iM55686 = 0;
        int i40 = 0;
        int i41 = 0;
        int iM559716 = 0;
        int iM55687 = 0;
        int i42 = 0;
        int iM559717 = 0;
        int i43 = 0;
        int i44 = 0;
        C0997 c0997 = null;
        String str5 = null;
        DialogInterfaceOnClickListenerC5765 dialogInterfaceOnClickListenerC5765 = null;
        int i45 = 0;
        C20671 c20674 = null;
        ?? r11 = 0;
        int i46 = 0;
        while (true) {
            i33 = i37 ^ (i36 & (((i33 ^ i34) * 31167) >> 31));
            switch (i33) {
                case -2101308910:
                case 977595085:
                    z = z ? 1 : 0;
                    i46 = i46;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i43 = i43;
                    i44 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr9 = sArr9;
                    short s = f82167[188];
                    if ((s * 18842) - ((s * s) + 88755241) <= 0) {
                        iM55979 = (C0946.m55979("᩻۟") + i34) * (-101);
                        i36 = ((iM55979 ^ i35) * 13005) ^ (-1481448002);
                        i5 = -329508848;
                    } else {
                        iM55979 = (C0946.m55979("ۚ֡") ^ i35) * 5;
                        i36 = ((iM55979 ^ i34) * (-26571)) ^ (-503195385);
                        i5 = -1151644524;
                    }
                    i10 = iM55979 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4775;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -2008027017:
                case 1338913573:
                    i46 = i46;
                    abstractActivityC14026.m31842(z2);
                    if (abstractActivityC14026.f39549) {
                        iM559714 = C0946.m55979("֫ᩳ") ^ i34;
                        i31 = ((iM559714 ^ i35) * 27981) ^ 1568069754;
                        i32 = 1546082767;
                    } else {
                        iM559714 = (C0946.m55979("ۖۛ") ^ i35) * (-67);
                        i31 = ((iM559714 ^ i34) * (-331)) ^ (-1148070600);
                        i32 = -457923608;
                    }
                    i37 = iM559714 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -1984254323:
                case 936036935:
                    C1044.m56284(abstractActivityC14026, new Intent(abstractActivityC14026, (Class<?>) ActivityC21758.class));
                    return z;
                case -1931616586:
                case -480452707:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    iM55686 = C0873.m55680(C1053.m56325(f82167, 201, 3, i38)) ^ 2120559360;
                    sArr7 = f82167;
                    if (C0882.f81846) {
                        iM55682 = C0873.m55680("ۖ֨") ^ i34;
                        i11 = ((iM55682 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                    } else {
                        iM55682 = C0873.m55680("ܿۚ") ^ i35;
                        i11 = ((iM55682 ^ i34) * 22223) ^ (-613119380);
                        i14 = 686050199;
                    }
                    i13 = iM55682 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -1917592805:
                case -1621236421:
                    C1024.m56209();
                    if (!C0882.f81846) {
                        iM55680 = C0873.m55680("۬᩵") ^ i35;
                        i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM55680 ^ i2;
                        i36 = i;
                    } else {
                        i6 = i46;
                        dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                        c20674 = c20674;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                        c0997 = c0997;
                        sArr2 = sArr8;
                        i7 = i43;
                        i8 = i44;
                        str4 = str4;
                        str5 = str5;
                        i42 = i42;
                        c214310 = c214310;
                        sArr3 = sArr9;
                        iM55682 = C0873.m55680("ۖ֨") ^ i34;
                        i11 = ((iM55682 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                        i13 = iM55682 ^ i14;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                        c214310 = c214310;
                        c20674 = c20674;
                        i37 = i13;
                        i36 = i11;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c0997 = c0997;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    }
                    break;
                case -1856838507:
                case -722952549:
                    C1024.m56202(C0873.m55680(C1036.m56252(f82167, 298, 3, i38)) ^ 2128642199);
                    i46 = i46;
                    r9 = r11;
                    dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                    iM559713 = (i35 - C0873.m55680("֡ᩴ")) * (-61);
                    i26 = ((iM559713 ^ i34) * 22409) ^ (-154142375);
                    i27 = -960648158;
                    r10 = r9;
                    i37 = iM559713 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    break;
                case -1838660019:
                case -895870147:
                    C1024.m56202(iM55687);
                    return z;
                case -1824048558:
                case -1745657219:
                    i4 = iM559717;
                    C0861.m55627(c20673, i4);
                    C0992.m56104(c20673, mo21654());
                    dialogInterfaceOnClickListenerC4775 = new DialogInterfaceOnClickListenerC4770(abstractActivityC14026, z ? 1 : 0);
                    sArr11 = f82167;
                    i39 = 289;
                    i45 = 3;
                    if (C1124.m56367() < 0) {
                        iM559717 = i4;
                        iM55680 = (i35 - C0873.m55680("۟᩻")) * (-61);
                        i = ((iM55680 ^ i34) * (-17241)) ^ 915254838;
                        i2 = 452743046;
                        i37 = iM55680 ^ i2;
                        i36 = i;
                    } else {
                        int iM55688 = (C0873.m55680("ۧ᩸") + i34) * (-123);
                        iM559717 = i4;
                        i36 = ((iM55688 ^ i35) * 7745) ^ 921560606;
                        i37 = iM55688 ^ 744016823;
                    }
                    break;
                case -1756570000:
                case 2109099044:
                    if (C0937.m55918() < 0) {
                        iM55680 = C0873.m55680("۬᩵") ^ i35;
                        i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                    } else {
                        iM55680 = C0946.m55979("᩹ۙ") ^ i35;
                        i = ((iM55680 ^ i34) * 8615) ^ 593276043;
                        i2 = -1176174469;
                    }
                    i37 = iM55680 ^ i2;
                    i36 = i;
                    break;
                case -1619925492:
                case -1459278818:
                    C0967.m56074();
                    break;
                case -1584048009:
                case -484527476:
                    i28 = i46;
                    abstractActivityC14026.f39542 = (abstractActivityC14026.f39542 ? 1 : 0) ^ (z ? 1 : 0);
                    ?? r32 = r11;
                    C1194.m56383(C1229.m56401(ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649), C0892.m55750(f82167, 301, 23, i38), abstractActivityC14026.f39542));
                    C1048.m56306(menuItem, abstractActivityC14026.f39542);
                    if (abstractActivityC14026.f39542) {
                        iM55685 = (C0873.m55680("᩻ܺ") ^ i35) * (-5);
                        i29 = ((iM55685 ^ i34) * (-21171)) ^ (-1596392050);
                        i30 = -589291868;
                        r31 = r32;
                    } else {
                        iM55685 = C0873.m55680("ۨ᩵") ^ i34;
                        i29 = ((iM55685 ^ i35) * (-19415)) ^ 488772372;
                        i30 = -633944971;
                        r31 = r32;
                    }
                    i37 = iM55685 ^ i30;
                    i36 = i29;
                    i46 = i28;
                    r11 = r31;
                    break;
                case -1569387733:
                case 1366346773:
                    dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                    r9 = r11;
                    if (abstractActivityC14026.m31836(z)) {
                        iM559713 = C0946.m55979("ۡܿ") ^ i34;
                        i26 = ((iM559713 ^ i35) * (-21451)) ^ (-1479940175);
                        i27 = 1520916728;
                        r10 = r11;
                    } else {
                        iM559713 = (i35 - C0873.m55680("֡ᩴ")) * (-61);
                        i26 = ((iM559713 ^ i34) * 22409) ^ (-154142375);
                        i27 = -960648158;
                        r10 = r9;
                    }
                    i37 = iM559713 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    break;
                case -1557111792:
                case -900710428:
                    dialogInterfaceOnClickListenerC4773 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c0997 = c0997;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c21439 = c214310;
                    sArr6 = sArr9;
                    if (iM55998 == (C0946.m55979(C1003.m56132(f82167, 222, 3, i38)) ^ 2125200465)) {
                        iM559712 = (C0873.m55680("ۖܺ") ^ i35) * (-99);
                        i21 = ((iM559712 ^ i34) * (-355)) ^ (-571674563);
                        i22 = 100028965;
                    } else {
                        iM559712 = (C0946.m55979("ܿ᩷") ^ i34) * 79;
                        i21 = ((iM559712 ^ i35) * (-27909)) ^ (-276821813);
                        i22 = -827064746;
                    }
                    i37 = iM559712 ^ i22;
                    i36 = i21;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4773;
                    c214310 = c21439;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -1477754429:
                case -520107746:
                    C3968.m7913(abstractActivityC14026, new RunnableC22041(2, abstractActivityC14026));
                    return z;
                case -1415565409:
                case 605392605:
                    dialogInterfaceOnClickListenerC4773 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    String str6 = str4;
                    c0997 = c0997;
                    str5 = str5;
                    i42 = i42;
                    c21439 = c214310;
                    sArr6 = sArr9;
                    str4 = str6;
                    if (iM55998 == (C0873.m55680(C0873.m55689(f82167, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i38)) ^ 2127309232)) {
                        iM559712 = C0946.m55979("ܰ᩹") ^ i35;
                        i21 = ((iM559712 ^ i34) * (-20281)) ^ 1746252711;
                        i22 = 476207635;
                    } else {
                        iM559712 = (i35 - C0946.m55979("ۛᩳ")) * 67;
                        i21 = ((iM559712 ^ i34) * 27113) ^ (-414934248);
                        i22 = 1166017717;
                    }
                    i37 = iM559712 ^ i22;
                    i36 = i21;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4773;
                    c214310 = c21439;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -1363522385:
                case 79498874:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        dialogInterfaceOnClickListenerC4773 = dialogInterfaceOnClickListenerC4775;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                        c20672 = c20674;
                        c0997 = c0997;
                        str4 = str4;
                        str5 = str5;
                        i42 = i42;
                        c21439 = c214310;
                        sArr6 = sArr9;
                        int iM55689 = C0873.m55680("ۤ᩷") ^ i35;
                        i37 = iM55689 ^ 1609742930;
                        c20674 = c20672;
                        i36 = ((iM55689 ^ i34) * (-11477)) ^ 824378909;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4773;
                        c214310 = c21439;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c0997 = c0997;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    } else {
                        iM55680 = C0873.m55680("۬᩵") ^ i35;
                        i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM55680 ^ i2;
                        i36 = i;
                    }
                    break;
                case -1351049287:
                case 84676960:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    if (RunnableC0938.m55924()) {
                        iM559710 = (C0946.m55979("ۢᩳ") ^ i35) * (-119);
                        i11 = ((iM559710 ^ i34) * 13299) ^ 366199814;
                        i12 = -919143586;
                    } else {
                        iM559710 = (C0873.m55680("᩵ܽ") ^ i34) * (-121);
                        i11 = ((iM559710 ^ i35) * 17025) ^ 738856323;
                        i12 = 1956525198;
                    }
                    i13 = iM559710 ^ i12;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -1336406104:
                case 1274365637:
                    C0967.m56080(c20673, C0946.m55979(RunnableC0897.m55783(sArr12, 292, 3, i38)) ^ 2105183637, dialogInterfaceOnClickListenerC5765);
                    RunnableC0871.m55669(c20673);
                    return z;
                case -1332224779:
                case 2023476055:
                    C0894.m55769();
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("᩺᩵") ^ i35) * (-49);
                        i = ((iM55680 ^ i34) * (-2207)) ^ (-765651437);
                        i2 = -1942286365;
                        i37 = iM55680 ^ i2;
                        i36 = i;
                    } else {
                        i15 = i46;
                        dialogInterfaceOnClickListenerC4772 = dialogInterfaceOnClickListenerC4775;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                        iM55683 = i40;
                        c0997 = c0997;
                        i16 = i43;
                        i17 = i44;
                        c20671 = c20674;
                        dialogInterfaceOnClickListenerC12770 = dialogInterfaceOnClickListenerC12771;
                        str2 = str4;
                        sArr4 = sArr8;
                        str3 = str5;
                        i18 = i42;
                        c21438 = c214310;
                        sArr5 = sArr9;
                        iM559711 = C0873.m55680("ۛ᩷") ^ i34;
                        i19 = ((iM559711 ^ i35) * (-5649)) ^ 1714233114;
                        i20 = 552974414;
                        i37 = iM559711 ^ i20;
                        i44 = i17;
                        sArr8 = sArr4;
                        sArr9 = sArr5;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4772;
                        i43 = i16;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12770;
                        c20674 = c20671;
                        c214310 = c21438;
                        i40 = iM55683;
                        i36 = i19;
                        i42 = i18;
                        str5 = str3;
                        str4 = str2;
                        i46 = i15;
                        r8 = r11;
                        c0997 = c0997;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    }
                    break;
                case -1278073231:
                case 1279748329:
                    if (C0890.f81849 == 0) {
                        dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                        iM559713 = C0946.m55979("֫ᩴ") ^ i35;
                        i26 = ((iM559713 ^ i34) * (-17367)) ^ (-773388480);
                        i27 = -1309160807;
                        r10 = r11;
                        i37 = iM559713 ^ i27;
                        i36 = i26;
                        r11 = r10;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    } else {
                        i6 = i46;
                        dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                        c20674 = c20674;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                        c0997 = c0997;
                        sArr2 = sArr8;
                        i7 = i43;
                        i8 = i44;
                        str4 = str4;
                        str5 = str5;
                        i42 = i42;
                        c214310 = c214310;
                        sArr3 = sArr9;
                        iM55682 = C0873.m55680("ۖ֨") ^ i34;
                        i11 = ((iM55682 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                        i13 = iM55682 ^ i14;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                        c214310 = c214310;
                        c20674 = c20674;
                        i37 = i13;
                        i36 = i11;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c0997 = c0997;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    }
                    break;
                case -1241997306:
                case -359186096:
                    abstractActivityC14026.mo21645(new RunnableC20062(abstractActivityC14026, z2));
                    return z;
                case -1214108917:
                case 1572536423:
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    C20671 c20675 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    C1012.m56146(c20675, i40 ^ i41);
                    c20674 = c20675;
                    i6 = i46;
                    iM559716 = C0946.m55979(C1929.m56558(f82167, 216, 3, i38));
                    if (RunnableC1014.f81941 <= 0) {
                        iM55682 = C0873.m55680("ۖ֨") ^ i34;
                        i11 = ((iM55682 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                    } else {
                        iM55682 = C0873.m55680("᩻ۚ") ^ i34;
                        i11 = ((iM55682 ^ i35) * (-14371)) ^ (-1598642414);
                        i14 = -723808342;
                    }
                    i13 = iM55682 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -1173752938:
                case 1134755251:
                    i15 = i46;
                    dialogInterfaceOnClickListenerC4772 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    dialogInterfaceOnClickListenerC12770 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr4 = sArr8;
                    i16 = i43;
                    i17 = i44;
                    str2 = str4;
                    str3 = str5;
                    i18 = i42;
                    c21438 = c214310;
                    sArr5 = sArr9;
                    int i47 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(abstractActivityC14026);
                    iM55683 = C0873.m55680(C0927.m55863(f82167, 213, 3, i38));
                    i41 = 2120408656;
                    if (C0989.f81920 >= 0) {
                        iM559711 = C0873.m55680("ۛ᩷") ^ i34;
                        i19 = ((iM559711 ^ i35) * (-5649)) ^ 1714233114;
                        i20 = 552974414;
                    } else {
                        iM559711 = (C0946.m55979("ۙۘ") + i34) * 17;
                        i19 = ((iM559711 ^ i35) * 14567) ^ (-91645112);
                        i20 = 787761307;
                    }
                    i37 = iM559711 ^ i20;
                    i44 = i17;
                    sArr8 = sArr4;
                    sArr9 = sArr5;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4772;
                    i43 = i16;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12770;
                    c20674 = c20671;
                    c214310 = c21438;
                    i40 = iM55683;
                    i36 = i19;
                    i42 = i18;
                    str5 = str3;
                    str4 = str2;
                    i46 = i15;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -1057156598:
                case 956813725:
                    return z2;
                case -1010756821:
                case -544689334:
                    ViewOnClickListenerC0939.m55953(c20673, C0873.m55680(C0947.m55993(sArr11, i39, i45, i38)) ^ 2130446929, dialogInterfaceOnClickListenerC4775);
                    i46 = i46;
                    C1124.m56374(c20673, i46, r11);
                    dialogInterfaceOnClickListenerC5765 = new DialogInterfaceOnClickListenerC5765(z ? 1 : 0, abstractActivityC14026);
                    sArr12 = f82167;
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("۬᩵") ^ i35;
                        i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                    } else {
                        iM55680 = C0873.m55680("۬ۗ") ^ i34;
                        i = ((iM55680 ^ i35) * (-7827)) ^ (-1686331117);
                        i2 = -977632845;
                    }
                    i37 = iM55680 ^ i2;
                    i36 = i;
                    break;
                case -987764432:
                case 1978038262:
                    DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4776 = dialogInterfaceOnClickListenerC4775;
                    DialogInterfaceOnClickListenerC5765 dialogInterfaceOnClickListenerC5766 = dialogInterfaceOnClickListenerC5765;
                    String str7 = str5;
                    C0997 c0998 = c0997;
                    C21438 c214311 = c214310;
                    short[] sArr13 = sArr9;
                    String strM55639 = C0863.m55638(abstractActivityC14026, C0873.m55680(C1044.m56276(sArr13, 231, 3, i38)) ^ 2119204616);
                    sArr10 = f82167;
                    if (C1012.m56134() <= 0) {
                        int iM559718 = C0946.m55979("ۘۗ") ^ i34;
                        i37 = iM559718 ^ 1054350359;
                        sArr9 = sArr13;
                        i36 = ((iM559718 ^ i35) * 25925) ^ 295935624;
                        c0997 = c0998;
                        str5 = str7;
                        c214310 = c214311;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4776;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5766;
                        i42 = 234;
                        str4 = strM55639;
                    } else {
                        int iM559719 = (C0946.m55979("ۚᩴ") ^ i34) * 73;
                        i36 = ((iM559719 ^ i35) * 3407) ^ 166546084;
                        i37 = iM559719 ^ (-1831178742);
                        c0997 = c0998;
                        str5 = str7;
                        sArr9 = sArr13;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4776;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5766;
                        str4 = strM55639;
                        c214310 = c214311;
                        i42 = 234;
                    }
                    break;
                case -959472351:
                case 1417228005:
                    abstractActivityC14026.f39553 = abstractActivityC14026.f39544;
                    iM559714 = (i34 - C0873.m55680("۠ܶ")) * 69;
                    i31 = ((iM559714 ^ i35) * 3533) ^ (-1266176747);
                    i32 = -749119788;
                    i37 = iM559714 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -920012375:
                case 1153070697:
                    m31850();
                    return z;
                case -834523945:
                case -494694655:
                    i46 = i46;
                    if (abstractActivityC14026.f39546 == null) {
                        iM559714 = C0946.m55979("ۛ᩹") ^ i34;
                        i31 = ((iM559714 ^ i35) * 30281) ^ 1453471341;
                        i32 = -1303861824;
                    } else {
                        iM559714 = C0873.m55680("ۗ۫") ^ i35;
                        i31 = ((iM559714 ^ i34) * (-18319)) ^ 984652927;
                        i32 = -137328578;
                    }
                    i37 = iM559714 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -822260289:
                case 1622114641:
                    C0917.m55842(iM55687);
                    return z;
                case -822230812:
                case 1148774610:
                    i28 = i46;
                    ?? r33 = r11;
                    if (iM55998 == (C0873.m55680(C1024.m56203(f82167, 295, 3, i38)) ^ 2100394739)) {
                        iM55685 = (C0873.m55680("᩹ۡ") ^ i35) * (-95);
                        i29 = ((iM55685 ^ i34) * 23203) ^ 1916142308;
                        i30 = 16233023;
                        r31 = r33;
                    } else {
                        iM55685 = C0873.m55680("֫ܿ") ^ i34;
                        i29 = ((iM55685 ^ i35) * 31195) ^ (-353777276);
                        i30 = 1320337123;
                        r31 = r33;
                    }
                    i37 = iM55685 ^ i30;
                    i36 = i29;
                    i46 = i28;
                    r11 = r31;
                    break;
                case -781480950:
                case 10410092:
                    abstractActivityC14026.f39553 = abstractActivityC14026.f39546;
                    iM559714 = (i34 - C0873.m55680("۠ܶ")) * 69;
                    i31 = ((iM559714 ^ i35) * 3533) ^ (-1266176747);
                    i32 = -749119788;
                    i37 = iM559714 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -764900870:
                case 886604081:
                    abstractActivityC14026.f39549 = z2;
                    abstractActivityC14026.f39551 = -1;
                    i46 = i46;
                    C0890.m55736(abstractActivityC14026, C0946.m55979(C1028.m56235(f82167, 324, 3, i38)) ^ 2102612123);
                    abstractActivityC14026.f39543 = r11;
                    m31854();
                    iM559714 = (C0946.m55979("ۖۛ") ^ i35) * (-67);
                    i31 = ((iM559714 ^ i34) * (-331)) ^ (-1148070600);
                    i32 = -457923608;
                    i37 = iM559714 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -743882059:
                case 1007112483:
                    i46 = i46;
                    ArrayList arrayList = new ArrayList(abstractActivityC14026.f39544);
                    abstractActivityC14026.f39546 = arrayList;
                    Collections.sort(arrayList, C10162.comparing(new C12272(z ? 1 : 0)));
                    iM559714 = C0873.m55680("ۗ۫") ^ i35;
                    i31 = ((iM559714 ^ i34) * (-18319)) ^ 984652927;
                    i32 = -137328578;
                    i37 = iM559714 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -735918281:
                case 1023885542:
                    C0997 c0999 = c0997;
                    c0999.setAdapter((SpinnerAdapter) c214310);
                    c0999.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    c0999.setSelection(abstractActivityC14026.f39552);
                    new C10003(abstractActivityC14026, abstractActivityC14026, abstractActivityC14026.f39549, c0999);
                    return z;
                case -725710264:
                case -94173491:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    if (iM55998 == (C0873.m55680(C1053.m56325(f82167, 198, 3, i38)) ^ 2128988521)) {
                        iM55681 = C0946.m55979("ܰۙ") ^ i34;
                        i36 = ((iM55681 ^ i35) * (-23303)) ^ 2098254953;
                        i9 = 1343466874;
                    } else {
                        iM55681 = C0873.m55680("ۤᩴ") ^ i35;
                        i36 = ((iM55681 ^ i34) * (-27761)) ^ 175060136;
                        i9 = -1436094362;
                    }
                    i10 = iM55681 ^ i9;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -700874696:
                case 1735181805:
                    dialogInterfaceOnClickListenerC4774 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    if (iM55998 == (C0946.m55979(C1229.m56403(f82167, 237, 3, i38)) ^ 2103240319)) {
                        iM55684 = (C0946.m55979("ܺܽ") ^ i34) * 47;
                        i24 = ((iM55684 ^ i35) * (-4315)) ^ 2124848173;
                        i25 = 656607020;
                    } else {
                        iM55684 = (C0873.m55680("ۨۗ") + i34) * (-39);
                        i24 = ((iM55684 ^ i35) * 29569) ^ 477266917;
                        i25 = 1287856239;
                    }
                    i37 = iM55684 ^ i25;
                    i36 = i24;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4774;
                    r11 = r11;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -631919107:
                case 968446297:
                    m31859();
                    return z;
                case -576309274:
                case 2063358839:
                    i38 = 10020;
                    iM55979 = (i34 - C0946.m55979("ۙ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i36 = ((iM55979 ^ i35) * (-26001)) ^ (-1523589984);
                    i5 = 658426457;
                    i10 = iM55979 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4775;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -564374834:
                case 975331187:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    if (RunnableC0938.m55924()) {
                        iM55682 = C0946.m55979("֫ܳ") ^ i35;
                        i11 = ((iM55682 ^ i34) * (-1707)) ^ 1484824283;
                        i14 = 1536992825;
                    } else {
                        iM55682 = (C0946.m55979("ۖ۟") + i34) * (-91);
                        i11 = ((iM55682 ^ i35) * 23881) ^ (-2069899648);
                        i14 = 154956655;
                    }
                    i13 = iM55682 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -555525751:
                case 5958385:
                    dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    str = str4;
                    i3 = i42;
                    C21438 c214312 = c214310;
                    C0997 c09910 = new C0997(abstractActivityC14026, r11);
                    strM55638 = C0863.m55638(abstractActivityC14026, C0873.m55680(C0892.m55750(f82167, 228, 3, i38)) ^ 2123761830);
                    sArr9 = f82167;
                    if (C0946.m55980() != 0) {
                        c0997 = c09910;
                        c214310 = c214312;
                        int iM559720 = C0946.m55979("ۤۨ") ^ i34;
                        i23 = ((iM559720 ^ i35) * (-28707)) ^ 1664520717;
                        i37 = iM559720 ^ (-706949829);
                    } else {
                        int iM556810 = (C0873.m55680("ᩳ۬") + i35) * 119;
                        i23 = ((iM556810 ^ i34) * 8067) ^ 1739566528;
                        i37 = iM556810 ^ (-942993617);
                        c0997 = c09910;
                        c214310 = c214312;
                    }
                    str4 = str;
                    i42 = i3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    str5 = strM55638;
                    i36 = i23;
                    r11 = r11;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -420654411:
                case 809686648:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    if (mo21648()) {
                        iM55681 = (C0873.m55680("ܿۖ") + i34) * (-107);
                        i36 = ((iM55681 ^ i35) * (-2077)) ^ (-1432661184);
                        i9 = -1913740224;
                    } else {
                        iM55681 = C0873.m55680("۠ۛ") ^ i35;
                        i36 = ((iM55681 ^ i34) * 12907) ^ 326209972;
                        i9 = -869514133;
                    }
                    i10 = iM55681 ^ i9;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -257835857:
                case 631887091:
                    i46 = i46;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i43 = i43;
                    i44 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr9 = sArr9;
                    int iM559721 = C0946.m55979(C0967.m56077(f82167, 192, 3, i38)) ^ 2099443039;
                    short[] sArr14 = f82167;
                    z = z ? 1 : 0;
                    iM55687 = C0873.m55680(C0989.m56092(sArr14, 195, 3, i38)) ^ 2120334791;
                    if (iM55998 == iM559721) {
                        iM55979 = (i34 - C0946.m55979("֡ۛ")) * 51;
                        i36 = ((iM55979 ^ i35) * (-7589)) ^ 1861226554;
                        i5 = -152662688;
                    } else {
                        iM55979 = C0873.m55680("᩷ܺ") ^ i34;
                        i36 = ((iM55979 ^ i35) * 24687) ^ 1837796135;
                        i5 = 1525853174;
                    }
                    i10 = iM55979 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4775;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -239504086:
                case 135063483:
                    C0955.m56025();
                    C0882.m55710();
                    return false;
                case -139158212:
                case 1345958167:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    iM55998 = C0947.m55998(menuItem);
                    z = true;
                    z = true;
                    z2 = false;
                    if (iM55998 == (C0873.m55680(ServiceConnectionC1013.m56161(f82167, 189, 3, i38)) ^ 2124072269)) {
                        iM55681 = C0873.m55680("᩸ۖ") ^ i35;
                        i36 = ((iM55681 ^ i34) * (-12709)) ^ 1995422044;
                        i9 = 385496038;
                    } else {
                        iM55681 = C0873.m55680("ܳ᩸") ^ i35;
                        i36 = ((iM55681 ^ i34) * (-133)) ^ (-334202636);
                        i9 = -702899254;
                    }
                    i10 = iM55681 ^ i9;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case -50412651:
                case 1676177769:
                    int i48 = DialogInterfaceC2564.f4230;
                    c20673 = new C20671(abstractActivityC14026);
                    dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                    iM559717 = C0946.m55979(C0890.m55726(f82167, 286, 3, i38)) ^ 2130602348;
                    if (C0967.f81910 >= 0) {
                        iM559713 = C0946.m55979("֫ᩴ") ^ i35;
                        i26 = ((iM559713 ^ i34) * (-17367)) ^ (-773388480);
                        i27 = -1309160807;
                        r10 = r11;
                    } else {
                        iM559713 = C0946.m55979("ܳᩴ") ^ i35;
                        i26 = ((iM559713 ^ i34) * (-25245)) ^ (-434599205);
                        i27 = -1241768653;
                        r10 = r11;
                    }
                    i37 = iM559713 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    break;
                case -3904119:
                case 126649198:
                    new C16707(abstractActivityC14026, abstractActivityC14026);
                    return z;
                case 64381445:
                case 1338823254:
                    return z;
                case 76514122:
                case 487750979:
                    dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                    if (iM55998 == (C0873.m55680(RunnableC0897.m55783(f82167, 283, 3, i38)) ^ 2098723143)) {
                        iM559713 = (i34 - C0873.m55680("ܺۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i26 = ((iM559713 ^ i35) * (-26935)) ^ 964479064;
                        i27 = 335770334;
                        r10 = r11;
                    } else {
                        iM559713 = (C0946.m55979("ۡۚ") ^ i35) * (-75);
                        i26 = ((iM559713 ^ i34) * (-4777)) ^ (-1827533274);
                        i27 = -481377601;
                        r10 = r11;
                    }
                    i37 = iM559713 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    break;
                case 102146741:
                case 290766880:
                    dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    C0997 c09911 = c0997;
                    short[] sArr15 = sArr10;
                    int i49 = i42;
                    String strM556310 = C0863.m55638(abstractActivityC14026, C0946.m55979(C1124.m56373(sArr15, i49, 3, i38)) ^ 2118612099);
                    sArr10 = sArr15;
                    String str8 = str5;
                    i3 = i49;
                    str = str4;
                    C21438 c214313 = new C21438(abstractActivityC14026, C9468.m21991(str8, str, strM556310));
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        int iM559722 = (i34 - C0946.m55979("᩶ۤ")) * 57;
                        i37 = iM559722 ^ 2059822080;
                        i36 = ((iM559722 ^ i35) * 3169) ^ (-818689722);
                        c0997 = c09911;
                        c214310 = c214313;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                        i42 = i3;
                        str5 = str8;
                        str4 = str;
                        r11 = r11;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                    } else {
                        c214310 = c214313;
                        c0997 = c09911;
                        strM55638 = str8;
                        int iM559723 = C0946.m55979("ۤۨ") ^ i34;
                        i23 = ((iM559723 ^ i35) * (-28707)) ^ 1664520717;
                        i37 = iM559723 ^ (-706949829);
                        str4 = str;
                        i42 = i3;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                        str5 = strM55638;
                        i36 = i23;
                        r11 = r11;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    }
                    break;
                case 157414244:
                case 1481105672:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    int i50 = iM55686;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    if (!abstractActivityC14026.m31836(z2)) {
                        iM559710 = C0946.m55979("ܽܿ") ^ i35;
                        iM55686 = i50;
                        i11 = ((iM559710 ^ i34) * (-18975)) ^ (-1686596505);
                        i12 = 1666179999;
                        i13 = iM559710 ^ i12;
                        sArr7 = sArr;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                        c214310 = c214310;
                        c20674 = c20674;
                        i37 = i13;
                        i36 = i11;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c0997 = c0997;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    } else {
                        iM55686 = i50;
                        iM55681 = C0873.m55680("۠ۛ") ^ i35;
                        i36 = ((iM55681 ^ i34) * 12907) ^ 326209972;
                        i9 = -869514133;
                        i10 = iM55681 ^ i9;
                        sArr7 = sArr;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                        c214310 = c214310;
                        c20674 = c20674;
                        i37 = i10;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        abstractActivityC14026 = this;
                        r8 = r11;
                        c0997 = c0997;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    }
                    break;
                case 241136172:
                case 1950969722:
                    DialogInterfaceOnClickListenerC4770 dialogInterfaceOnClickListenerC4777 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    C20671 c20676 = c20674;
                    DialogInterfaceOnClickListenerC12770 dialogInterfaceOnClickListenerC12772 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    short[] sArr16 = sArr8;
                    int i51 = i43;
                    int i52 = i44;
                    String str9 = str4;
                    String str10 = str5;
                    int i53 = i42;
                    C21438 c214314 = c214310;
                    short[] sArr17 = sArr9;
                    short[] sArr18 = sArr7;
                    int iM559724 = C0946.m55979(C1028.m56235(sArr18, 204, 3, i38)) ^ 2126180885;
                    int i54 = iM55686;
                    if (iM55998 == i54) {
                        int iM556811 = (i35 - C0873.m55680("ۤۧ")) * (-31);
                        sArr7 = sArr18;
                        i44 = i52;
                        sArr8 = sArr16;
                        sArr9 = sArr17;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4777;
                        i43 = i51;
                        i46 = iM559724;
                        i36 = ((iM556811 ^ i34) * (-32131)) ^ 1530613925;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12772;
                        c214310 = c214314;
                        c20674 = c20676;
                        r8 = 0;
                        i37 = iM556811 ^ (-179091189);
                        i42 = i53;
                        str5 = str10;
                        str4 = str9;
                        iM55686 = i54;
                    } else {
                        int iM559725 = C0946.m55979("ۡۙ") ^ i34;
                        i36 = ((iM559725 ^ i35) * (-17269)) ^ (-1014247345);
                        sArr7 = sArr18;
                        i44 = i52;
                        i46 = iM559724;
                        sArr8 = sArr16;
                        sArr9 = sArr17;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4777;
                        i43 = i51;
                        iM55686 = i54;
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12772;
                        c214310 = c214314;
                        c20674 = c20676;
                        i37 = iM559725 ^ (-1486011184);
                        i42 = i53;
                        str5 = str10;
                        str4 = str9;
                        r8 = 0;
                    }
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case 257707117:
                case 690127573:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC4771 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20674 = c20674;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c0997 = c0997;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c214310 = c214310;
                    sArr3 = sArr9;
                    if (iM55998 == (C0946.m55979(C0955.m56029(f82167, 210, 3, i38)) ^ 2101517045)) {
                        iM55682 = C0946.m55979("۬᩺") ^ i35;
                        i11 = ((iM55682 ^ i34) * (-22477)) ^ 1001782985;
                        i14 = -275605913;
                    } else {
                        iM55682 = (C0946.m55979("᩺ۗ") + i34) * (-59);
                        i11 = ((iM55682 ^ i35) * (-18557)) ^ (-1838562734);
                        i14 = -111803962;
                    }
                    i13 = iM55682 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4771;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case 459829903:
                case 543168306:
                    C20671 c20677 = c20674;
                    C0906.m55817(c20677, C0873.m55680(C1036.m56252(sArr8, i43, i44, i38)) ^ 2120684269, dialogInterfaceOnClickListenerC12771);
                    C1124.m56374(c20677, i46, r11);
                    RunnableC0871.m55669(c20677);
                    return z;
                case 593240698:
                case 1536363426:
                    C1028.m56247();
                    if (!C0955.f81898) {
                        i4 = iM559717;
                        int iM556812 = (C0873.m55680("ۧ᩸") + i34) * (-123);
                        iM559717 = i4;
                        i36 = ((iM556812 ^ i35) * 7745) ^ 921560606;
                        i37 = iM556812 ^ 744016823;
                    } else {
                        iM55680 = C0873.m55680("۬᩵") ^ i35;
                        i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM55680 ^ i2;
                        i36 = i;
                    }
                    break;
                case 648065797:
                case 1173674749:
                    C0927.m55865(C0873.m55680(AbstractC0942.m55970(f82167, 207, 3, i38)) ^ 2120883409);
                    return z;
                case 903349803:
                case 1272212842:
                    i38 = 38451;
                    iM55979 = (i34 - C0946.m55979("ۙ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i36 = ((iM55979 ^ i35) * (-26001)) ^ (-1523589984);
                    i5 = 658426457;
                    i10 = iM55979 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4775;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12771;
                    c214310 = c214310;
                    c20674 = c20674;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC14026 = this;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case 987331994:
                case 1347506225:
                    dialogInterfaceOnClickListenerC4774 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    if (C0890.m55727(ApplicationC21448.f67649, C0989.m56096(RunnableC0871.m55667(f82167, 272, 11, i38), C1053.m56325(f82167, 240, 32, i38)), z2)) {
                        iM55684 = (i35 - C0946.m55979("ۤ֨")) * (-93);
                        i24 = ((iM55684 ^ i34) * 25889) ^ 456133431;
                        i25 = 1283109087;
                    } else {
                        iM55684 = (C0873.m55680("ۧ᩹") ^ i34) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i24 = ((iM55684 ^ i35) * (-22579)) ^ 1569006033;
                        i25 = -682698936;
                    }
                    i37 = iM55684 ^ i25;
                    i36 = i24;
                    dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4774;
                    r11 = r11;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                case 1003895302:
                case 2034865281:
                    C0989.m56095();
                    C1025.m56230();
                    iM55680 = C0873.m55680("۬᩵") ^ i35;
                    i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                    i2 = 783796338;
                    i37 = iM55680 ^ i2;
                    i36 = i;
                    break;
                case 1336748115:
                case 2099760657:
                    new C3297(abstractActivityC14026, abstractActivityC14026);
                    return z;
                case 1519889928:
                case 1545317504:
                    dialogInterfaceOnClickListenerC4773 = dialogInterfaceOnClickListenerC4775;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    c20672 = c20674;
                    c0997 = c0997;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c21439 = c214310;
                    sArr6 = sArr9;
                    C1194.m56390(c20672, iM559716 ^ 2097684097);
                    DialogInterfaceOnClickListenerC12770 dialogInterfaceOnClickListenerC12773 = new DialogInterfaceOnClickListenerC12770(z ? 1 : 0, abstractActivityC14026);
                    sArr8 = f82167;
                    i43 = 219;
                    i44 = 3;
                    if (RunnableC0871.m55672() >= 0) {
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12773;
                        int iM556813 = C0873.m55680("ۤ᩷") ^ i35;
                        i37 = iM556813 ^ 1609742930;
                        c20674 = c20672;
                        i36 = ((iM556813 ^ i34) * (-11477)) ^ 824378909;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4773;
                    } else {
                        int iM559726 = (i35 - C0946.m55979("ۡ֡")) * (-81);
                        i36 = ((iM559726 ^ i34) * 17059) ^ 1605341546;
                        i37 = iM559726 ^ (-1632382702);
                        dialogInterfaceOnClickListenerC12771 = dialogInterfaceOnClickListenerC12773;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4773;
                        c20674 = c20672;
                    }
                    c214310 = c21439;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c0997 = c0997;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    break;
                default:
                    ServiceConnectionC1013.m56157();
                    if (!C0882.f81846) {
                        dialogInterfaceOnClickListenerC4770 = dialogInterfaceOnClickListenerC4775;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                        strM55638 = str5;
                        str = str4;
                        i3 = i42;
                        int iM559727 = C0946.m55979("ۤۨ") ^ i34;
                        i23 = ((iM559727 ^ i35) * (-28707)) ^ 1664520717;
                        i37 = iM559727 ^ (-706949829);
                        str4 = str;
                        i42 = i3;
                        dialogInterfaceOnClickListenerC4775 = dialogInterfaceOnClickListenerC4770;
                        str5 = strM55638;
                        i36 = i23;
                        r11 = r11;
                        dialogInterfaceOnClickListenerC5765 = dialogInterfaceOnClickListenerC5765;
                    } else {
                        iM55680 = C0873.m55680("۬᩵") ^ i35;
                        i = ((iM55680 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM55680 ^ i2;
                        i36 = i;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0138, code lost:
    
        if (p067l.C0912.f81867 > 0) goto L14;
     */
    /* JADX INFO: renamed from: ۜ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31854() {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        C10674 c10674;
        int i7;
        int iM559711;
        int i8;
        StringBuilder sb;
        String str;
        int iM55681;
        int i9;
        int i10;
        int i11;
        String str2;
        int iM55682;
        int i12;
        int i13 = -1665758572;
        int i14 = C0989.f81920;
        int i15 = RunnableC1014.f81941;
        int iM559712 = (i14 - C0946.m55979("֡᩸")) * 27;
        int i16 = ((iM559712 ^ i15) * 19311) ^ 171582390;
        int i17 = iM559712 ^ (-567845588);
        int[] iArr = null;
        C10674 c10675 = null;
        StringBuilder sb2 = null;
        String strM55639 = null;
        String strM56102 = null;
        String strM556310 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        char c = 0;
        short s = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        ArrayList arrayList = null;
        int i32 = 0;
        String strM55986 = null;
        Iterator itM56292 = null;
        StringBuilder sb3 = null;
        C10674 c10676 = null;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-253)) >> 31));
            switch (i13) {
                case -1942518098:
                case 1663151346:
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb4 = sb3;
                    i28 = i28;
                    sb3 = sb4;
                    i30 = i29 * i29;
                    i31 = s * 2;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ᩴ֨") ^ i14;
                        i3 = ((iM55680 ^ i15) * 23131) ^ 1901306183;
                        i4 = 934941712;
                    } else {
                        iM55680 = C0946.m55979("֡᩺") ^ i14;
                        i3 = ((iM55680 ^ i15) * (-15859)) ^ 803538593;
                        i4 = -808816591;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i36 = i28;
                    sb3 = sb3;
                    i28 = i36;
                    break;
                case -1851079962:
                case 229123801:
                    strM56102 = C0992.m56102(sArr3, i18, i20, i19);
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ۨۨ") ^ i14;
                        i = ((iM55979 ^ i15) * (-6487)) ^ (-2067993145);
                        i2 = -619948667;
                    } else {
                        iM55979 = C0946.m55979("ܽ֨") ^ i15;
                        i = ((iM55979 ^ i14) * (-8373)) ^ (-577114793);
                        i2 = 1981079779;
                    }
                    i17 = iM55979 ^ i2;
                    i16 = i;
                    break;
                case -1807385931:
                case 1415055521:
                    sArr3 = f82167;
                    i18 = 337;
                    i20 = 3;
                    if (!C0937.f81884) {
                        arrayList = arrayList;
                        iM55682 = (C0873.m55680("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM55682 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM55682 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        iM55979 = (C0873.m55680("ۗۙ") + i14) * (-67);
                        i = ((iM55979 ^ i15) * 6159) ^ 1908156087;
                        i2 = 1175274419;
                        i17 = iM55979 ^ i2;
                        i16 = i;
                    }
                    break;
                case -1716738039:
                case -616978357:
                    i34++;
                    i23 = i25;
                    i33 = i26;
                    i7 = i28;
                    int iM55683 = (C0873.m55680("۠᩷") + i15) * 115;
                    i28 = i7;
                    i16 = ((iM55683 ^ i14) * 5329) ^ (-34994253);
                    i17 = iM55683 ^ (-536349508);
                    i18 = i18;
                    arrayList = arrayList;
                    int i37 = i28;
                    sb3 = sb3;
                    i28 = i37;
                    break;
                case -1696907293:
                case -1566035892:
                    sb3 = sb3;
                    i19 = 8164;
                    iM55680 = C0873.m55680("ۜۛ") ^ i14;
                    i3 = ((iM55680 ^ i15) * (-13187)) ^ (-1690222544);
                    i4 = -2130340454;
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i38 = i28;
                    sb3 = sb3;
                    i28 = i38;
                    break;
                case -1549290098:
                case -898239238:
                    i27 = i33 + 1;
                    if (c10676.f29536 == null) {
                        i25 = i23;
                        i26 = i27;
                        arrayList = arrayList;
                        iM55682 = (C0873.m55680("ᩳܽ") + i14) * (-7);
                        i9 = ((iM55682 ^ i15) * (-4573)) ^ (-892610306);
                        i12 = -1865625614;
                        i17 = iM55682 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        iM55979 = (i14 - C0946.m55979("ܰ۠")) * (-101);
                        i = ((iM55979 ^ i15) * (-9179)) ^ (-1662017761);
                        i2 = 2022830243;
                        i17 = iM55979 ^ i2;
                        i16 = i;
                    }
                    break;
                case -1537391345:
                case 421209810:
                    i21++;
                    i22 = i24;
                    arrayList = arrayList;
                    i18 = i18;
                    sb3 = sb3;
                    iM559711 = (C0873.m55680("۬۬") + i15) * (-99);
                    i3 = ((iM559711 ^ i14) * (-30783)) ^ (-1405393916);
                    i8 = 608721658;
                    i17 = iM559711 ^ i8;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i39 = i28;
                    sb3 = sb3;
                    i28 = i39;
                    break;
                case -1529310127:
                case 1295091035:
                    str2 = strM55986;
                    StringBuilder sb5 = sb2;
                    C0912.m55825(sb5, str2);
                    C0863.m55629(sb5, i33);
                    strM556310 = C0845.m55591(sb5);
                    sb = sb3;
                    int iM559713 = (i15 - C0946.m55979("᩸ۜ")) * (-89);
                    strM55986 = str2;
                    i16 = ((iM559713 ^ i14) * 8717) ^ (-2139274337);
                    i17 = iM559713 ^ (-1907482688);
                    sb3 = sb;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case -1417416792:
                case -307006880:
                    C1929.m56564(this.f13392, this.f39543);
                    break;
                case -1344873671:
                case -1135955947:
                    str2 = strM55986;
                    sb = sb3;
                    C1003.m56121(sb, str2);
                    C0845.m55589(sb, i22);
                    strM556310 = C0863.m55639(sb);
                    int iM559714 = (i15 - C0946.m55979("᩸ۜ")) * (-89);
                    strM55986 = str2;
                    i16 = ((iM559714 ^ i14) * 8717) ^ (-2139274337);
                    i17 = iM559714 ^ (-1907482688);
                    sb3 = sb;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case -1316292041:
                case 1364935697:
                    break;
                case -1172064376:
                case 484569392:
                    int i40 = i28;
                    arrayList = arrayList;
                    i18 = i18;
                    sb = sb3;
                    if (i34 >= i40) {
                        i28 = i40;
                        iM559711 = C0946.m55979("ᩴܽ") ^ i15;
                        sb3 = sb;
                        i3 = ((iM559711 ^ i14) * (-31295)) ^ (-1715941993);
                        i8 = 443322022;
                        i17 = iM559711 ^ i8;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i310 = i28;
                        sb3 = sb3;
                        i28 = i310;
                    } else {
                        int iM559715 = C0946.m55979("۟ۜ") ^ i14;
                        i16 = ((iM559715 ^ i15) * (-20235)) ^ (-1857772895);
                        i17 = iM559715 ^ (-645956017);
                        i28 = i40;
                        sb3 = sb;
                        i18 = i18;
                        arrayList = arrayList;
                    }
                    break;
                case -1165082304:
                case 885398726:
                    if (!C0947.f81895) {
                        iM55979 = C0873.m55680("ۨۨ") ^ i14;
                        i = ((iM55979 ^ i15) * (-6487)) ^ (-2067993145);
                        i2 = -619948667;
                        i17 = iM55979 ^ i2;
                        i16 = i;
                    } else {
                        c10676 = c10676;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i32 = i32;
                        i18 = i18;
                        StringBuilder sb6 = sb3;
                        i28 = i28;
                        sb3 = sb6;
                        iM55680 = C0946.m55979("᩸ۨ") ^ i14;
                        i3 = ((iM55680 ^ i15) * 11815) ^ 773212168;
                        i4 = -1878775493;
                        i11 = iM55680 ^ i4;
                        i32 = i32;
                        c10676 = c10676;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i311 = i28;
                        sb3 = sb3;
                        i28 = i311;
                    }
                    break;
                case -1008688244:
                case -983526474:
                    C1012.m56134();
                    if (!C0917.f81868) {
                        iM55979 = C0873.m55680("ۨۨ") ^ i14;
                        i = ((iM55979 ^ i15) * (-6487)) ^ (-2067993145);
                        i2 = -619948667;
                        i17 = iM55979 ^ i2;
                        i16 = i;
                    } else {
                        arrayList = arrayList;
                        iM55682 = (C0873.m55680("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM55682 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM55682 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    }
                    break;
                case -998051475:
                case 1391960528:
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb7 = sb3;
                    i28 = i28;
                    sb3 = sb7;
                    i29 = s + 1;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ۤۡ") ^ i15) * (-61);
                        i3 = ((iM55680 ^ i14) * (-18243)) ^ 1415773197;
                        i4 = 297238576;
                    } else {
                        iM55680 = (C0873.m55680("ܽᩴ") ^ i14) * (-7);
                        i3 = ((iM55680 ^ i15) * (-6569)) ^ (-501687849);
                        i4 = 791720626;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i312 = i28;
                    sb3 = sb3;
                    i28 = i312;
                    break;
                case -837299834:
                case 160360375:
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb8 = sb3;
                    i28 = i28;
                    sb3 = sb8;
                    s = sArr[c];
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ᩳۜ") ^ i15;
                        i3 = ((iM55680 ^ i14) * 30171) ^ (-768451150);
                        i4 = 1634795618;
                    } else {
                        iM55680 = C0946.m55979("֫᩶") ^ i15;
                        i3 = ((iM55680 ^ i14) * (-28139)) ^ 1930003672;
                        i4 = -1519847701;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i313 = i28;
                    sb3 = sb3;
                    i28 = i313;
                    break;
                case -754568983:
                case 93624163:
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb9 = sb3;
                    i28 = i28;
                    sb3 = sb9;
                    if (C0866.m55647(itM56292)) {
                        iM559711 = C0873.m55680("۠᩹") ^ i15;
                        i3 = ((iM559711 ^ i14) * 3599) ^ (-1508643132);
                        i8 = 1767981410;
                    } else {
                        iM559711 = (i14 - C0946.m55979("᩷ۛ")) * (-95);
                        i3 = ((iM559711 ^ i15) * 27155) ^ 2026766434;
                        i8 = -453892036;
                    }
                    i17 = iM559711 ^ i8;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i314 = i28;
                    sb3 = sb3;
                    i28 = i314;
                    break;
                case -741899333:
                case -616925360:
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb10 = sb3;
                    i28 = i28;
                    sb3 = sb10;
                    c = 335;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("᩸ۨ") ^ i14;
                        i3 = ((iM55680 ^ i15) * 11815) ^ 773212168;
                        i4 = -1878775493;
                    } else {
                        iM55680 = (C0946.m55979("۫ۤ") + i14) * (-79);
                        i3 = ((iM55680 ^ i15) * (-1181)) ^ (-1638943802);
                        i4 = 1349835591;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i315 = i28;
                    sb3 = sb3;
                    i28 = i315;
                    break;
                case -739810905:
                case 1926263519:
                    sb3 = sb3;
                    i19 = 49368;
                    iM55680 = C0873.m55680("ۜۛ") ^ i14;
                    i3 = ((iM55680 ^ i15) * (-13187)) ^ (-1690222544);
                    i4 = -2130340454;
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i316 = i28;
                    sb3 = sb3;
                    i28 = i316;
                    break;
                case -368071523:
                case 52061042:
                    i24 = i22 + 1;
                    C10674 c10677 = c10675;
                    if (c10677.f29536 != null) {
                        int iM559716 = (i14 - C0946.m55979("ۗۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        c10675 = c10677;
                        i16 = ((iM559716 ^ i15) * 24017) ^ 438425242;
                        i17 = iM559716 ^ (-1179204376);
                    } else {
                        c10675 = c10677;
                        i22 = i24;
                        arrayList = arrayList;
                        i18 = i18;
                        sb3 = sb3;
                        iM559711 = (C0873.m55680("۬۬") + i15) * (-99);
                        i3 = ((iM559711 ^ i14) * (-30783)) ^ (-1405393916);
                        i8 = 608721658;
                        i17 = iM559711 ^ i8;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i317 = i28;
                        sb3 = sb3;
                        i28 = i317;
                    }
                    break;
                case -307116017:
                case 1141769943:
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb11 = new StringBuilder();
                    C0845.m55589(sb11, i21);
                    if (C1229.f82066 >= 0) {
                        sb3 = sb11;
                        i18 = i18;
                        iM55682 = (C0873.m55680("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM55682 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM55682 ^ i12;
                        i16 = i9;
                    } else {
                        int iM55684 = C0873.m55680("۠֡") ^ i14;
                        sb3 = sb11;
                        i16 = ((iM55684 ^ i15) * (-30233)) ^ (-85042351);
                        i17 = iM55684 ^ 1231597635;
                    }
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case -241394856:
                case -15032842:
                    arrayList = arrayList;
                    i18 = i18;
                    sb3 = sb3;
                    itM56292 = C1046.m56292(arrayList);
                    i21 = i35;
                    i22 = 0;
                    iM559711 = (C0873.m55680("۬۬") + i15) * (-99);
                    i3 = ((iM559711 ^ i14) * (-30783)) ^ (-1405393916);
                    i8 = 608721658;
                    i17 = iM559711 ^ i8;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i318 = i28;
                    sb3 = sb3;
                    i28 = i318;
                    break;
                case -142936235:
                case 10024710:
                    C1025.m56230();
                    C0937.m55918();
                    break;
                case -122474669:
                case 1148939757:
                    C0947.m55997();
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb12 = sb3;
                    i28 = i28;
                    sb3 = sb12;
                    iM55680 = C0946.m55979("ᩳۜ") ^ i15;
                    i3 = ((iM55680 ^ i14) * 30171) ^ (-768451150);
                    i4 = 1634795618;
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i319 = i28;
                    sb3 = sb3;
                    i28 = i319;
                    break;
                case -49330663:
                case 988308063:
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb13 = sb3;
                    i28 = i28;
                    sb3 = sb13;
                    if ((i31 + 1) - i30 <= 0) {
                        iM55680 = (C0946.m55979("ۚ۬") ^ i15) * 79;
                        i3 = ((iM55680 ^ i14) * 28629) ^ 1911032881;
                        i4 = -1785386755;
                    } else {
                        iM55680 = (i15 - C0946.m55979("᩷ۖ")) * (-31);
                        i3 = ((iM55680 ^ i14) * (-13241)) ^ (-945922377);
                        i4 = -149805815;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i3110 = i28;
                    sb3 = sb3;
                    i28 = i3110;
                    break;
                case -28336359:
                case 78677708:
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb14 = sb3;
                    i28 = i28;
                    sb3 = sb14;
                    sArr = f82167;
                    if (C0873.m55678()) {
                        iM55680 = (C0873.m55680("ۢۘ") ^ i14) * (-101);
                        i3 = ((iM55680 ^ i15) * 2935) ^ (-338735012);
                        i4 = -132540340;
                    } else {
                        iM55680 = (C0873.m55680("ܿ᩷") ^ i15) * 59;
                        i3 = ((iM55680 ^ i14) * 13955) ^ (-1281628277);
                        i4 = 1270934759;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i3111 = i28;
                    sb3 = sb3;
                    i28 = i3111;
                    break;
                case 143352662:
                case 466089503:
                    str = strM55986;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb15 = sb2;
                    c10675 = (C10674) RunnableC0897.m55785(itM56292);
                    if (!c10675.m24569()) {
                        iM55681 = C0873.m55680("ܿܽ") ^ i15;
                        sb2 = sb15;
                        i9 = ((iM55681 ^ i14) * (-9417)) ^ 89064211;
                        i10 = -1947891986;
                        i17 = iM55681 ^ i10;
                        strM55986 = str;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        sb2 = sb15;
                        strM55986 = str;
                        sb3 = sb3;
                        iM559711 = (C0873.m55680("۬۬") + i15) * (-99);
                        i3 = ((iM559711 ^ i14) * (-30783)) ^ (-1405393916);
                        i8 = 608721658;
                        i17 = iM559711 ^ i8;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i3112 = i28;
                        sb3 = sb3;
                        i28 = i3112;
                    }
                    break;
                case 191201603:
                case 559860207:
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb16 = sb3;
                    i28 = i28;
                    sb3 = sb16;
                    c10676 = c10676;
                    short[] sArr4 = sArr2;
                    i32 = i32;
                    strM55986 = C0946.m55986(sArr4, i32, 1, i19);
                    i35 = 0;
                    if (z) {
                        iM55680 = (C0873.m55680("᩵ۗ") + i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        sArr2 = sArr4;
                        i3 = ((iM55680 ^ i15) * (-25665)) ^ (-2146370813);
                        i4 = -144057234;
                    } else {
                        sArr2 = sArr4;
                        iM55680 = C0873.m55680("᩵᩶") ^ i15;
                        i3 = ((iM55680 ^ i14) * (-30897)) ^ (-1008704133);
                        i4 = -1871374252;
                    }
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i3113 = i28;
                    sb3 = sb3;
                    i28 = i3113;
                    break;
                case 229324647:
                case 1424813900:
                    C1929.m56564(this.f13392, strM55639);
                    break;
                case 359483960:
                case 678029631:
                    i7 = this.f39550;
                    iArr = this.f39547;
                    i34 = i35;
                    i33 = 0;
                    i23 = 0;
                    int iM55685 = (C0873.m55680("۠᩷") + i15) * 115;
                    i28 = i7;
                    i16 = ((iM55685 ^ i14) * 5329) ^ (-34994253);
                    i17 = iM55685 ^ (-536349508);
                    i18 = i18;
                    arrayList = arrayList;
                    int i3114 = i28;
                    sb3 = sb3;
                    i28 = i3114;
                    break;
                case 402574149:
                case 1705016905:
                    StringBuilder sbM21133 = C9179.m21133(strM556310, strM56102);
                    C1003.m56121(sbM21133, this.f39543);
                    strM55639 = C0863.m55639(sbM21133);
                    iM55979 = (i14 - C0873.m55680("ᩳܳ")) * 17;
                    i = ((iM55979 ^ i15) * (-29431)) ^ 1439444913;
                    i2 = 334854571;
                    i17 = iM55979 ^ i2;
                    i16 = i;
                    break;
                case 423244983:
                case 744324869:
                    arrayList = arrayList;
                    c10676 = (C10674) C1017.m56196(arrayList, iArr[i34]);
                    if (c10676.m24569()) {
                        i26 = i33;
                        i25 = i23;
                        iM55682 = (C0873.m55680("ᩳܽ") + i14) * (-7);
                        i9 = ((iM55682 ^ i15) * (-4573)) ^ (-892610306);
                        i12 = -1865625614;
                    } else {
                        iM55682 = (C0873.m55680("᩶᩷") + i15) * (-21);
                        i18 = i18;
                        i9 = ((iM55682 ^ i14) * 8837) ^ (-427580459);
                        i12 = 1023565312;
                    }
                    i17 = iM55682 ^ i12;
                    i16 = i9;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case 559885537:
                case 785874752:
                    c10674 = c10676;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb17 = sb3;
                    i28 = i28;
                    sb3 = sb17;
                    boolean z2 = this.f39549;
                    sArr2 = f82167;
                    i32 = 336;
                    if (C1053.m56327() >= 0) {
                        z = z2;
                        int iM55686 = C0873.m55680("ܶ᩻") ^ i15;
                        i3 = ((iM55686 ^ i14) * 9451) ^ 1762059883;
                        i11 = iM55686 ^ 630282821;
                        c10676 = c10674;
                        i17 = i11;
                        i16 = i3;
                    } else {
                        int iM559717 = (C0946.m55979("ܽۧ") ^ i15) * 49;
                        z = z2;
                        i16 = ((iM559717 ^ i14) * 23039) ^ 1074011084;
                        c10676 = c10674;
                        i17 = iM559717 ^ (-1668481064);
                    }
                    i18 = i18;
                    arrayList = arrayList;
                    int i3115 = i28;
                    sb3 = sb3;
                    i28 = i3115;
                    break;
                case 774787602:
                case 2123441055:
                    if (C1964.f83032 <= 0) {
                        arrayList = arrayList;
                        iM55682 = (C0873.m55680("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM55682 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM55682 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        c10674 = c10676;
                        arrayList = arrayList;
                        i18 = i18;
                        StringBuilder sb18 = sb3;
                        i28 = i28;
                        sb3 = sb18;
                        int iM55687 = C0873.m55680("ܶ᩻") ^ i15;
                        i3 = ((iM55687 ^ i14) * 9451) ^ 1762059883;
                        i11 = iM55687 ^ 630282821;
                        c10676 = c10674;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i3116 = i28;
                        sb3 = sb3;
                        i28 = i3116;
                    }
                    break;
                case 822841470:
                case 1375821393:
                    i25 = i23 + 1;
                    i26 = i27;
                    arrayList = arrayList;
                    iM55682 = (C0873.m55680("ᩳܽ") + i14) * (-7);
                    i9 = ((iM55682 ^ i15) * (-4573)) ^ (-892610306);
                    i12 = -1865625614;
                    i17 = iM55682 ^ i12;
                    i16 = i9;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case 871067123:
                case 1948750962:
                    int i41 = i18;
                    C10674 c10678 = c10676;
                    short[] sArr5 = sArr2;
                    int i42 = i32;
                    StringBuilder sb19 = sb3;
                    i28 = i28;
                    sb3 = sb19;
                    ArrayList arrayList2 = this.f39553;
                    if (arrayList2 == null) {
                        iM559710 = (C0873.m55680("ܿ֨") + i14) * 95;
                        i5 = ((iM559710 ^ i15) * (-25917)) ^ (-803910993);
                        i6 = 368566592;
                    } else {
                        iM559710 = C0946.m55979("ۧܽ") ^ i14;
                        i5 = ((iM559710 ^ i15) * 6735) ^ 1106493973;
                        i6 = -604669727;
                    }
                    i32 = i42;
                    c10676 = c10678;
                    sArr2 = sArr5;
                    i17 = iM559710 ^ i6;
                    i18 = i41;
                    arrayList = arrayList2;
                    i16 = i5;
                    int i3117 = i28;
                    sb3 = sb3;
                    i28 = i3117;
                    break;
                case 1204274993:
                case 1590516469:
                    if (C0989.f81920 >= 0) {
                        c10676 = c10676;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i32 = i32;
                        i18 = i18;
                        StringBuilder sb20 = sb3;
                        i28 = i28;
                        sb3 = sb20;
                        iM55680 = C0946.m55979("ᩴ֨") ^ i14;
                        i3 = ((iM55680 ^ i15) * 23131) ^ 1901306183;
                        i4 = 934941712;
                        i11 = iM55680 ^ i4;
                        i32 = i32;
                        c10676 = c10676;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i3118 = i28;
                        sb3 = sb3;
                        i28 = i3118;
                    }
                    c10676 = c10676;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb110 = sb3;
                    i28 = i28;
                    sb3 = sb110;
                    iM55680 = C0946.m55979("ᩳۜ") ^ i15;
                    i3 = ((iM55680 ^ i14) * 30171) ^ (-768451150);
                    i4 = 1634795618;
                    i11 = iM55680 ^ i4;
                    i32 = i32;
                    c10676 = c10676;
                    sArr2 = sArr2;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i3119 = i28;
                    sb3 = sb3;
                    i28 = i3119;
                    break;
                case 1696975068:
                case 1742375826:
                    C0955.m56025();
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۘ۫") ^ i15;
                        i = ((iM55979 ^ i14) * (-14697)) ^ 1118769685;
                        i2 = -1576356558;
                        i17 = iM55979 ^ i2;
                        i16 = i;
                    } else {
                        c10676 = c10676;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i32 = i32;
                        i18 = i18;
                        StringBuilder sb111 = sb3;
                        i28 = i28;
                        sb3 = sb111;
                        iM55680 = C0946.m55979("ᩳۜ") ^ i15;
                        i3 = ((iM55680 ^ i14) * 30171) ^ (-768451150);
                        i4 = 1634795618;
                        i11 = iM55680 ^ i4;
                        i32 = i32;
                        c10676 = c10676;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i31110 = i28;
                        sb3 = sb3;
                        i28 = i31110;
                    }
                    break;
                case 1827468390:
                case 2072344642:
                    str = strM55986;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb21 = new StringBuilder();
                    C0863.m55629(sb21, i23);
                    if (C1012.f81938 < 0) {
                        iM55681 = C0946.m55979("ܳ᩹") ^ i14;
                        sb2 = sb21;
                        i9 = ((iM55681 ^ i15) * (-14291)) ^ (-621363098);
                        i10 = 1375385440;
                        i17 = iM55681 ^ i10;
                        strM55986 = str;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        strM55986 = str;
                        sb2 = sb21;
                        StringBuilder sb22 = sb3;
                        i28 = i28;
                        sb3 = sb22;
                        iM55680 = (C0873.m55680("ۢۘ") ^ i14) * (-101);
                        i3 = ((iM55680 ^ i15) * 2935) ^ (-338735012);
                        i4 = -132540340;
                        i11 = iM55680 ^ i4;
                        i32 = i32;
                        c10676 = c10676;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i31111 = i28;
                        sb3 = sb3;
                        i28 = i31111;
                    }
                    break;
                case 2016426847:
                case 2100858536:
                    if (this.f39543 != null) {
                        iM55979 = C0873.m55680("ۛ֡") ^ i15;
                        i = ((iM55979 ^ i14) * 10539) ^ (-426861152);
                        i2 = 900865834;
                    } else {
                        strM55639 = strM556310;
                        iM55979 = (i14 - C0873.m55680("ᩳܳ")) * 17;
                        i = ((iM55979 ^ i15) * (-29431)) ^ 1439444913;
                        i2 = 334854571;
                    }
                    i17 = iM55979 ^ i2;
                    i16 = i;
                    break;
                default:
                    C0967.m56074();
                    if (C1025.f81947 >= 0) {
                        arrayList = arrayList;
                        i18 = i18;
                        StringBuilder sb23 = sb3;
                        i28 = i28;
                        sb3 = sb23;
                        iM55680 = (C0873.m55680("ۢۘ") ^ i14) * (-101);
                        i3 = ((iM55680 ^ i15) * 2935) ^ (-338735012);
                        i4 = -132540340;
                        i11 = iM55680 ^ i4;
                        i32 = i32;
                        c10676 = c10676;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i31112 = i28;
                        sb3 = sb3;
                        i28 = i31112;
                    }
                    c10674 = c10676;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb112 = sb3;
                    i28 = i28;
                    sb3 = sb112;
                    int iM55688 = C0873.m55680("ܶ᩻") ^ i15;
                    i3 = ((iM55688 ^ i14) * 9451) ^ 1762059883;
                    i11 = iM55688 ^ 630282821;
                    c10676 = c10674;
                    i17 = i11;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i31113 = i28;
                    sb3 = sb3;
                    i28 = i31113;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x021e A[PHI: r5 r12 r16
      0x021e: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:61:0x021c, B:28:0x00bd, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:61:0x021c, B:28:0x00bd, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r16v22 int) = (r16v8 int), (r16v18 int), (r16v23 int) binds: [B:61:0x021c, B:28:0x00bd, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0251 A[PHI: r4 r7 r8 r16 r17
      0x0251: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:65:0x024f, B:53:0x01cb, B:49:0x01a8, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:65:0x024f, B:53:0x01cb, B:49:0x01a8, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r8v3 short) = (r8v1 short), (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:65:0x024f, B:53:0x01cb, B:49:0x01a8, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v24 int) = (r16v7 int), (r16v10 int), (r16v11 int), (r16v25 int) binds: [B:65:0x024f, B:53:0x01cb, B:49:0x01a8, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r17v3 java.lang.String) = (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v4 java.lang.String) binds: [B:65:0x024f, B:53:0x01cb, B:49:0x01a8, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (p067l.C1404.m56468() == false) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m31824(AbstractActivityC14026 abstractActivityC14026) {
        int iM55979;
        int i;
        int i2;
        int iM55680 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1337847134;
        int i10 = C1404.f82149;
        int i11 = C0906.f81862;
        int iM559710 = (C0946.m55979("۫ۧ") ^ i10) * (-27);
        int i12 = ((iM559710 ^ i11) * (-6443)) ^ (-645121172);
        int i13 = iM559710 ^ 1038585672;
        String strM55792 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-2085)) >> 31));
            switch (i9) {
                case -1567614808:
                case 189029411:
                    iM55680 = iM55680;
                    sArr = f82167;
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("۠᩷") ^ i11;
                        i = ((iM55979 ^ i10) * 20683) ^ 2126405221;
                        i2 = 1637645059;
                    } else {
                        iM55979 = C0946.m55979("֡ۢ") ^ i11;
                        i = ((iM55979 ^ i10) * (-18539)) ^ 1548328858;
                        i2 = 496648549;
                    }
                    int i14 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i14;
                    break;
                case -1307646869:
                case 136623157:
                    break;
                case -1299037649:
                case 10637083:
                    ViewOnClickListenerC0939.m55941();
                    if (C0992.f81922 < 0) {
                        iM55680 = iM55680;
                        iM55979 = C0873.m55680("ۚ۟") ^ i10;
                        i = ((iM55979 ^ i11) * 365) ^ (-965422760);
                        i2 = -1828012928;
                        int i15 = iM55680;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        iM55680 = i15;
                    }
                    iM55680 = iM55680;
                    iM55979 = C0946.m55979("۬ۙ") ^ i11;
                    i = ((iM55979 ^ i10) * (-12285)) ^ (-2112848291);
                    i2 = -1748065260;
                    int i16 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i16;
                    break;
                case -1298862943:
                case 899445951:
                    iM55680 = iM55680;
                    s2 = 1;
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("۬ۙ") ^ i11;
                        i = ((iM55979 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM55979 = (C0946.m55979("ۤۤ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i10) * 20369) ^ (-56101540);
                        i2 = -30162732;
                    }
                    int i17 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i17;
                    break;
                case -1178160031:
                case 952553298:
                    C0863.m55643();
                    ServiceConnectionC1013.m56157();
                    break;
                case -1177334432:
                case 1882840702:
                    iM55680 = iM55680;
                    i8 = 3;
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ۚ۟") ^ i10;
                        i = ((iM55979 ^ i11) * 365) ^ (-965422760);
                        i2 = -1828012928;
                    } else {
                        iM55979 = C0873.m55680("ۛۙ") ^ i10;
                        i = ((iM55979 ^ i11) * 1709) ^ (-1975708729);
                        i2 = 1772108438;
                    }
                    int i18 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i18;
                    break;
                case -1114978572:
                case 878591078:
                    strM55792 = C0898.m55792(sArr2, i7, i8, i6);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = iM55680;
                        iM55979 = C0946.m55979("۬ۙ") ^ i11;
                        i = ((iM55979 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ۖܺ")) * (-67);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * 28451) ^ (-1038250591);
                        i2 = 1815376233;
                    }
                    int i19 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i19;
                    break;
                case -1073616380:
                case 1169527303:
                    iM55680 = iM55680;
                    int i20 = s + s2;
                    if ((i20 * i20) - i5 < 0) {
                        iM55979 = C0873.m55680("ۜ᩺") ^ i11;
                        i = ((iM55979 ^ i10) * 29875) ^ (-1487549567);
                        i2 = 1986555584;
                    } else {
                        iM55979 = C0873.m55680("ۧۨ") ^ i10;
                        i = ((iM55979 ^ i11) * (-12179)) ^ 162194176;
                        i2 = -313967096;
                    }
                    int i110 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i110;
                    break;
                case -1005598657:
                case -648005643:
                    i6 = 469;
                    iM55979 = C0946.m55979("ܰܰ") ^ i10;
                    i = ((iM55979 ^ i11) * (-5599)) ^ 100891571;
                    i2 = -1010206278;
                    int i111 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i111;
                    break;
                case -993563313:
                case -560371968:
                    break;
                case -835438741:
                case 962840021:
                    i6 = 57274;
                    iM55979 = C0946.m55979("ܰܰ") ^ i10;
                    i = ((iM55979 ^ i11) * (-5599)) ^ 100891571;
                    i2 = -1010206278;
                    int i112 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i112;
                    break;
                case -829152577:
                case -607636646:
                    iM55680 = iM55680;
                    c = 7;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("۬ۙ") ^ i11;
                        i = ((iM55979 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM55979 = C0873.m55680("᩵᩷") ^ i10;
                        i = ((iM55979 ^ i11) * 11617) ^ (-315998018);
                        i2 = -342737789;
                    }
                    int i113 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i113;
                    break;
                case -689802684:
                case 720114827:
                    C0917.m55842(iM55680 ^ i3);
                    iM55680 = iM55680;
                    iM55979 = (i11 - C0873.m55680("ܳۘ")) * (-27);
                    i = ((iM55979 ^ i10) * 18587) ^ (-391077063);
                    i2 = 1323984561;
                    int i114 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i114;
                    break;
                case -689259764:
                case -142264606:
                    iM55680 = iM55680;
                    sArr2 = f82167;
                    i7 = 8;
                    if (C1024.f81946) {
                        iM55680 = iM55680;
                        iM55979 = (C0946.m55979("ۚۗ") + i11) * (-35);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * 12009) ^ 77317962;
                        i2 = 429239037;
                    } else {
                        iM55979 = (i10 - C0873.m55680("ۖᩳ")) * C0254q.f1218h;
                        i = ((iM55979 ^ i11) * (-1905)) ^ 1173048998;
                        i2 = 569608579;
                    }
                    int i115 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i115;
                    break;
                case -465859642:
                case 1556470850:
                    iM55680 = C0873.m55680(strM55792);
                    if (C0949.f81897 >= 0) {
                        i3 = 2099656562;
                        iM55979 = (C0946.m55979("ۚۗ") + i11) * (-35);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * 12009) ^ 77317962;
                        i2 = 429239037;
                        int i116 = iM55680;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        iM55680 = i116;
                    } else {
                        int iM559711 = C0946.m55979("᩵ۙ") ^ i10;
                        i13 = iM559711 ^ 46886524;
                        i12 = ((iM559711 ^ i11) * (-3329)) ^ 859125794;
                        i3 = 2099656562;
                    }
                    break;
                case -246958163:
                case 1158409856:
                    iM55680 = iM55680;
                    i4 = s * 2;
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ۗۚ") ^ i10;
                        i = ((iM55979 ^ i11) * 12951) ^ (-153593936);
                        i2 = -163111621;
                    } else {
                        iM55979 = C0873.m55680("ܺ۬") ^ i10;
                        i = ((iM55979 ^ i11) * (-32327)) ^ 209062419;
                        i2 = 703745196;
                    }
                    int i117 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i117;
                    break;
                case -120218430:
                case 400799878:
                    iM55680 = iM55680;
                    if (abstractActivityC14026.m31836(true)) {
                        iM55979 = C0946.m55979("ۡ۠") ^ i11;
                        i = ((iM55979 ^ i10) * 5017) ^ 39332902;
                        i2 = 1485659350;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ܳۘ")) * (-27);
                        i = ((iM55979 ^ i10) * 18587) ^ (-391077063);
                        i2 = 1323984561;
                    }
                    int i118 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i118;
                    break;
                case -36139678:
                case 331386380:
                    iM55680 = iM55680;
                    i5 = i4 + 1;
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("۬ۙ") ^ i11;
                        i = ((iM55979 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM55979 = C0873.m55680("ۖۧ") ^ i10;
                        i = ((iM55979 ^ i11) * 7647) ^ (-1568802972);
                        i2 = 1723732300;
                    }
                    int i119 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i119;
                    break;
                case 246900555:
                case 1193296121:
                    C0927.m55873();
                    RunnableC0897.m55784();
                    iM55680 = iM55680;
                    iM55979 = C0946.m55979("۬ۙ") ^ i11;
                    i = ((iM55979 ^ i10) * (-12285)) ^ (-2112848291);
                    i2 = -1748065260;
                    int i1110 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i1110;
                    break;
                case 1069241629:
                case 1320780086:
                    iM55680 = iM55680;
                    s = sArr[c];
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۚ۟") ^ i10;
                        i = ((iM55979 ^ i11) * 365) ^ (-965422760);
                        i2 = -1828012928;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ۚۘ")) * 109;
                        i = ((iM55979 ^ i10) * 32417) ^ 1254643160;
                        i2 = 1998553412;
                    }
                    int i1111 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i1111;
                    break;
                default:
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("ۚۗ") + i11) * (-35);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * 12009) ^ 77317962;
                        i2 = 429239037;
                    } else {
                        iM55680 = iM55680;
                        iM55979 = C0946.m55979("֡ۢ") ^ i11;
                        i = ((iM55979 ^ i10) * (-18539)) ^ 1548328858;
                        i2 = 496648549;
                    }
                    int i1112 = iM55680;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = i1112;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0443 A[PHI: r3 r4 r17 r18 r20 r21
      0x0443: PHI (r3v33 boolean) = (r3v32 boolean), (r3v1 boolean), (r3v1 boolean) binds: [B:76:0x0440, B:69:0x02ce, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0443: PHI (r4v10 l.ܶ᩵ܿ) = (r4v8 l.ܶ᩵ܿ), (r4v1 l.ܶ᩵ܿ), (r4v1 l.ܶ᩵ܿ) binds: [B:76:0x0440, B:69:0x02ce, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0443: PHI (r17v24 int) = (r17v18 int), (r17v21 int), (r17v25 int) binds: [B:76:0x0440, B:69:0x02ce, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0443: PHI (r18v4 int) = (r18v2 int), (r18v1 int), (r18v1 int) binds: [B:76:0x0440, B:69:0x02ce, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0443: PHI (r20v20 l.۬ۜܽ) = (r20v16 l.۬ۜܽ), (r20v18 l.۬ۜܽ), (r20v21 l.۬ۜܽ) binds: [B:76:0x0440, B:69:0x02ce, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0443: PHI (r21v8 java.lang.Exception) = (r21v4 java.lang.Exception), (r21v6 java.lang.Exception), (r21v9 java.lang.Exception) binds: [B:76:0x0440, B:69:0x02ce, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int iM55979;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        boolean z = false;
        AbstractC17043 abstractC17043 = null;
        boolean z2 = false;
        Exception exc = null;
        C14677 c14677M33572 = null;
        Exception exc2 = null;
        int iM56070 = 0;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 121685618;
        int i9 = C0967.f81910;
        int i10 = C1053.f81965;
        int iM559711 = (i10 - C0946.m55979("ۤۛ")) * (-19);
        int i11 = ((iM559711 ^ i9) * 24609) ^ 172385143;
        int i12 = iM559711 ^ (-1914213825);
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            int i14 = i12 ^ (i11 & (((i8 ^ i9) * 23887) >> 31));
            switch (i14) {
                case -1864489758:
                case -430313412:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    short s = f82167[120];
                    if ((s * 10844) - ((s * s) + 29398084) > 0) {
                        iM559710 = C0873.m55680("ܽۚ") ^ i9;
                        i4 = ((iM559710 ^ i10) * (-3359)) ^ (-1845827602);
                        i5 = 2032960828;
                    } else {
                        iM559710 = C0946.m55979("۬ۡ") ^ i10;
                        i4 = ((iM559710 ^ i9) * (-3925)) ^ (-816776694);
                        i5 = -675432750;
                    }
                    int i15 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i15;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -1760537428:
                case 603710308:
                    i = i14;
                    mo21649();
                    iM55979 = (i10 - C0946.m55979("᩶ܺ")) * (-11);
                    i2 = ((iM55979 ^ i9) * 30331) ^ 514195243;
                    i3 = 503200428;
                    int i16 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i16;
                    break;
                case -1682034042:
                case -471776625:
                    i7 = 13408;
                    iM559710 = C0873.m55680("۠ۨ") ^ i10;
                    i4 = ((iM559710 ^ i9) * 21439) ^ (-1029003607);
                    i5 = -274244047;
                    int i17 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i17;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -1665416758:
                case -617367182:
                    i = i14;
                    if (z3) {
                        iM55979 = C0946.m55979("ᩳۘ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-29957)) ^ 62470107;
                        i3 = -1242022256;
                    } else {
                        iM55979 = C0946.m55979("۫ۜ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-18225)) ^ 1985938745;
                        i3 = -1119394053;
                    }
                    int i18 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i18;
                    break;
                case -1497113343:
                case 203758321:
                    i = i14;
                    C23395.m52060((InterfaceC21384) c14677M33572, -1985229329);
                    this.f39556 = C1053.m56323(c14677M33572);
                    this.f39545 = C0967.m56070(c14677M33572);
                    this.f39549 = C1053.m56323(c14677M33572);
                    this.f39547 = c14677M33572.m33578();
                    this.f39550 = C0967.m56070(c14677M33572);
                    this.f39552 = C0967.m56070(c14677M33572);
                    this.f39559 = C0890.m55733(c14677M33572);
                    this.f39558 = C0890.m55733(c14677M33572);
                    setTitle(c14677M33572.m33593());
                    this.f39543 = c14677M33572.m33590();
                    z3 = this.f39556;
                    iM55979 = C0873.m55680("ۡۤ") ^ i10;
                    i2 = ((iM55979 ^ i9) * 8757) ^ (-251450861);
                    i3 = -277918599;
                    int i19 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i19;
                    break;
                case -1397976478:
                case 776603124:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    if (C0892.m55752(bundle, ServiceConnectionC1013.m56161(f82167, 148, 7, i7))) {
                        iM559710 = (C0873.m55680("۬֨") ^ i10) * (-17);
                        i4 = ((iM559710 ^ i9) * (-6021)) ^ 1928255210;
                        i5 = 1065616453;
                    } else {
                        iM559710 = C0873.m55680("ۢ᩹") ^ i9;
                        i4 = ((iM559710 ^ i10) * 25045) ^ 1691968835;
                        i5 = -1870470940;
                    }
                    int i110 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i110;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -1351387084:
                case -604263663:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    super.onCreate(bundle);
                    m12250();
                    C1053.m56321(this, C0946.m55979(C0861.m55618(f82167, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i7)) ^ 2125429319);
                    C0890.m55736(this, C0873.m55680(RunnableC0871.m55667(f82167, 124, 3, i7)) ^ 2123953986);
                    C1326 c1326 = (C1326) C1053.m56321(this, C0873.m55680(C0927.m55863(f82167, 127, 3, i7)) ^ 2099836054);
                    this.f13392 = c1326;
                    C0955.m56037(this, c1326);
                    C0930.m55891(this);
                    C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C7321 c7321 = new C7321(this);
                    AbstractC0942.m55962(onBackPressedDispatcher);
                    onBackPressedDispatcher.m30940(c7321);
                    RunnableC1014.m56172(this.f13392, new ViewOnClickListenerC3234(1, this));
                    C21103 c21103 = (C21103) C0890.m55736(this, C0946.m55979(C0930.m55893(f82167, 130, 3, i7)) ^ 2128827711);
                    this.f39554 = c21103;
                    c21103.m47726(C0873.m55680(ViewOnClickListenerC0939.m55947(f82167, 133, 3, i7)) ^ 2130620369, 0);
                    this.f39554.m47726(C0873.m55680(C1025.m56233(f82167, 136, 3, i7)) ^ 2099962074, 0);
                    this.f39554.m47726(C0873.m55680(C1017.m56189(f82167, 139, 3, i7)) ^ 2130322180, 45);
                    this.f39554.m47726(C0946.m55979(C1929.m56558(f82167, 142, 3, i7)) ^ 2118607793, 0);
                    this.f39554.m47726(C0946.m55979(C0882.m55717(f82167, 145, 3, i7)) ^ 2101134825, 0);
                    ListView listView = (ListView) C0890.m55736(this, R.id.list);
                    z = true;
                    listView.setFastScrollEnabled(true);
                    listView.setOnItemClickListener(this);
                    listView.setOnItemLongClickListener(this);
                    C14696 c14696 = new C14696(this);
                    this.f39555 = c14696;
                    listView.setAdapter((ListAdapter) c14696);
                    listView.setOnItemClickListener(this);
                    this.f39548 = new DialogInterfaceOnDismissListenerC7422(this);
                    AbstractC17043 abstractC17044 = f39541;
                    if (bundle != null) {
                        int iM55680 = (C0873.m55680("᩻᩵") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        abstractC17043 = abstractC17044;
                        i11 = ((iM55680 ^ i10) * 21385) ^ (-958033328);
                        i8 = i14;
                        exc2 = exc2;
                        i13 = 0;
                        i12 = iM55680 ^ (-1361075364);
                    } else {
                        abstractC17043 = abstractC17044;
                        i13 = 0;
                        iM559710 = C0873.m55680("ۢ᩹") ^ i9;
                        i4 = ((iM559710 ^ i10) * 25045) ^ 1691968835;
                        i5 = -1870470940;
                        int i111 = iM559710 ^ i5;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i111;
                        i11 = i4;
                    }
                    c14677M33572 = c14677M33572;
                    break;
                case -1293579373:
                case -573312168:
                    C0947.m55996(this.f39554, new ViewOnClickListenerC6577(2, this));
                    this.f39554.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡۟ܽ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            AbstractActivityC14026 abstractActivityC14026 = null;
                            int i20 = -239256275;
                            int i21 = C0863.f81833;
                            int i22 = C0989.f81920;
                            int iM559712 = C0946.m55979("᩸᩻") ^ i21;
                            int i23 = ((iM559712 ^ i22) * (-15945)) ^ 978615468;
                            int i24 = 236945957;
                            while (true) {
                                i20 = ((((i20 ^ i22) * 30577) >> 31) & i23) ^ (iM559712 ^ i24);
                                switch (i20) {
                                    case -2035064495:
                                    case 2019208868:
                                        AbstractActivityC14026.m31851(abstractActivityC14026);
                                        return true;
                                    case -1937552691:
                                    case -1303052549:
                                        C1194.m56396();
                                        if (C1929.f83011 == 0) {
                                            iM559712 = (C0873.m55680("ۚ᩺") + i21) * 115;
                                            i23 = ((iM559712 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        } else {
                                            iM559712 = (C0873.m55680("ۚۜ") + i22) * 41;
                                            i23 = ((iM559712 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        }
                                        break;
                                    case -1873167891:
                                    case -120648246:
                                        C1046.m56302();
                                        C0894.m55769();
                                        return false;
                                    case -1758194141:
                                    case 2055009915:
                                        if (!C0947.f81895) {
                                            iM559712 = C0873.m55680("ۡ۫") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-32011)) ^ (-371490613);
                                            i24 = -534474015;
                                        } else {
                                            iM559712 = (C0873.m55680("ۚۜ") + i22) * 41;
                                            i23 = ((iM559712 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        }
                                        break;
                                    case -1332750795:
                                    case -258273841:
                                        C0967.m56074();
                                        C0930.m55885();
                                        iM559712 = C0873.m55680("ۡ۫") ^ i21;
                                        i23 = ((iM559712 ^ i22) * (-32011)) ^ (-371490613);
                                        i24 = -534474015;
                                        break;
                                    case -1313729905:
                                    case 1733885650:
                                        if (C1929.f83011 != 0) {
                                            iM559712 = (C0946.m55979("ۚܰ") + i21) * 15;
                                            i23 = ((iM559712 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM559712 = (C0873.m55680("ܽ֫") + i21) * 45;
                                            i23 = ((iM559712 ^ i22) * (-1015)) ^ 697981635;
                                            i24 = -1554651008;
                                        }
                                        break;
                                    case -1043063865:
                                    case 2130768362:
                                        if (C1003.f81929 <= 0) {
                                            iM559712 = (C0873.m55680("ۚۜ") + i22) * 41;
                                            i23 = ((iM559712 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        } else {
                                            iM559712 = C0946.m55979("۫ܶ") ^ i22;
                                            i23 = ((iM559712 ^ i21) * 9067) ^ 113414837;
                                            i24 = 282403282;
                                        }
                                        break;
                                    case -1026105565:
                                    case 1521484596:
                                        if (C0863.m55643()) {
                                            iM559712 = C0873.m55680("ۘ֫") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-25975)) ^ (-1346171712);
                                            i24 = -650149611;
                                        } else {
                                            iM559712 = C0873.m55680("ۢܳ") ^ i22;
                                            i23 = ((iM559712 ^ i21) * 21641) ^ 189327173;
                                            i24 = 1169018931;
                                        }
                                        break;
                                    case -1023575342:
                                    case -165769050:
                                        abstractActivityC14026 = this.f4368;
                                        if (C1036.f81953 >= 0) {
                                            iM559712 = (C0946.m55979("ۚܰ") + i21) * 15;
                                            i23 = ((iM559712 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM559712 = (C0873.m55680("ܽ۫") + i22) * 81;
                                            i23 = ((iM559712 ^ i21) * (-20989)) ^ 1431431337;
                                            i24 = 383989796;
                                        }
                                        break;
                                    case -911791860:
                                    case -459764810:
                                        if (C0861.f81831) {
                                            iM559712 = (C0873.m55680("᩷֨") ^ i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i23 = ((iM559712 ^ i21) * (-31723)) ^ 1316919771;
                                            i24 = -480380086;
                                        } else {
                                            iM559712 = (C0873.m55680("ۚ᩺") + i21) * 115;
                                            i23 = ((iM559712 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        }
                                        break;
                                    case -759497599:
                                    case -398785694:
                                        C1404.m56468();
                                        if (C1964.f83032 <= 0) {
                                            iM559712 = C0873.m55680("ۢܳ") ^ i22;
                                            i23 = ((iM559712 ^ i21) * 21641) ^ 189327173;
                                            i24 = 1169018931;
                                        } else {
                                            iM559712 = C0873.m55680("ۡ۫") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-32011)) ^ (-371490613);
                                            i24 = -534474015;
                                        }
                                        break;
                                    case -574169819:
                                    case 36481408:
                                        if (C1124.m56367() >= 0) {
                                            iM559712 = (C0873.m55680("ۚۜ") + i22) * 41;
                                            i23 = ((iM559712 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        } else {
                                            iM559712 = (C0946.m55979("ܳۨ") ^ i22) * 25;
                                            i23 = ((iM559712 ^ i21) * (-22933)) ^ (-549357717);
                                            i24 = 349135620;
                                        }
                                        break;
                                    case -436787474:
                                    case 71723044:
                                        if (C0845.f81821 >= 0) {
                                            iM559712 = (C0946.m55979("ۚܰ") + i21) * 15;
                                            i23 = ((iM559712 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM559712 = (C0946.m55979("ܶ᩹") ^ i21) * (-111);
                                            i23 = ((iM559712 ^ i22) * (-765)) ^ (-1570507925);
                                            i24 = -214453520;
                                        }
                                        break;
                                    case -206954027:
                                    case 1141766654:
                                        if (C1025.m56230()) {
                                            iM559712 = (C0873.m55680("ۚ᩺") + i21) * 115;
                                            i23 = ((iM559712 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        } else {
                                            iM559712 = (C0873.m55680("֫ۗ") ^ i22) * (-105);
                                            i23 = ((iM559712 ^ i21) * (-22229)) ^ (-1186823943);
                                            i24 = -984368542;
                                        }
                                        break;
                                    case 385322535:
                                    case 1033063176:
                                        if (C0947.m55997()) {
                                            iM559712 = (C0946.m55979("ۚܰ") + i21) * 15;
                                            i23 = ((iM559712 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM559712 = C0946.m55979("֫ܳ") ^ i21;
                                            i23 = ((iM559712 ^ i22) * 13469) ^ 1844301027;
                                            i24 = 449272937;
                                        }
                                        break;
                                    default:
                                        if (C0937.f81884) {
                                            iM559712 = C0946.m55979("᩻ۡ") ^ i21;
                                            i23 = ((iM559712 ^ i22) * 21019) ^ 1274766939;
                                            i24 = -347973358;
                                        } else {
                                            iM559712 = (C0873.m55680("ۚ᩺") + i21) * 115;
                                            i23 = ((iM559712 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -1168654871:
                case 135129387:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    if (C1003.m56124(abstractC17043)) {
                        iM559710 = (C0946.m55979("ܽۗ") + i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM559710 ^ i10) * 31877) ^ 380135518;
                        i5 = 1614262775;
                    } else {
                        iM559710 = C0873.m55680("ۢ᩹") ^ i9;
                        i4 = ((iM559710 ^ i10) * 25045) ^ 1691968835;
                        i5 = -1870470940;
                    }
                    int i112 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i112;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -1092153279:
                case 10710186:
                    i14 = i14;
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    this.f39542 = C0890.m55727(ApplicationC21448.f67649, C0930.m55893(f82167, 155, 23, i7), z);
                    iM559710 = (C0946.m55979("۬ܺ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM559710 ^ i9) * 21789) ^ (-1466083373);
                    i5 = 1319983687;
                    int i113 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i113;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -989559803:
                case -246191146:
                    i = i14;
                    c14677M33572 = C14677.m33572(C0906.m55816(abstractC17043));
                    iM56070 = C0967.m56070(c14677M33572);
                    try {
                        arrayList = new ArrayList(iM56070);
                        this.f39553 = arrayList;
                        this.f39544 = arrayList;
                        i6 = i13;
                        iM55979 = (i9 - C0946.m55979("᩷ۖ")) * (-99);
                        i2 = ((iM55979 ^ i10) * 31899) ^ (-961042540);
                        i3 = 1781974962;
                    } catch (Exception e) {
                        exc2 = e;
                        arrayList = null;
                        iM55979 = C0946.m55979("᩺ᩴ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 9159) ^ 343925359;
                        i3 = -248277778;
                    }
                    int i114 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i114;
                    break;
                case -921871005:
                case 455526247:
                    z2 = false;
                    iM559710 = C0946.m55979("᩻ܶ") ^ i10;
                    i4 = ((iM559710 ^ i9) * (-29487)) ^ (-1626045139);
                    i5 = -895396323;
                    int i115 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i115;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -879494267:
                case 2056524672:
                    m12260(exc2, z);
                    break;
                case -635138454:
                case 933553617:
                    m12260(exc, z);
                    break;
                case -253916616:
                case 1607193293:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    if (z2) {
                        iM559710 = (i9 - C0946.m55979("᩵᩹")) * 127;
                        i4 = ((iM559710 ^ i10) * (-5501)) ^ (-417710661);
                        i5 = -1270336122;
                    } else {
                        iM559710 = C0873.m55680("ۤܳ") ^ i10;
                        i4 = ((iM559710 ^ i9) * (-32147)) ^ 985636095;
                        i5 = 396826243;
                    }
                    int i116 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i116;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -225924523:
                case 1272429722:
                    i7 = 17773;
                    iM559710 = C0873.m55680("۠ۨ") ^ i10;
                    i4 = ((iM559710 ^ i9) * 21439) ^ (-1029003607);
                    i5 = -274244047;
                    int i117 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i117;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -77065209:
                case 1787829154:
                    i = i14;
                    C0937.m55917(arrayList, new C10674(c14677M33572));
                    iM55979 = C0946.m55979("۠ۗ") ^ i9;
                    i2 = ((iM55979 ^ i10) * 21707) ^ 1859825927;
                    i3 = -672163135;
                    int i118 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i118;
                    break;
                case -56960567:
                case 1048039853:
                    z2 = true;
                    iM559710 = C0946.m55979("᩻ܶ") ^ i10;
                    i4 = ((iM559710 ^ i9) * (-29487)) ^ (-1626045139);
                    i5 = -895396323;
                    int i119 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i119;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case -39333100:
                case -16891090:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    try {
                        mo21646(z2);
                        iM559710 = C0946.m55979("᩷۫") ^ i9;
                        i4 = ((iM559710 ^ i10) * 9995) ^ (-1297474455);
                        i5 = -440956805;
                        int i1110 = iM559710 ^ i5;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i1110;
                    } catch (Exception e2) {
                        int iM55681 = C0873.m55680("ۤܰ") ^ i10;
                        i4 = ((iM55681 ^ i9) * 32145) ^ 473533195;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = iM55681 ^ 66588725;
                        exc = e2;
                    }
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case 424661945:
                case 1046465537:
                    try {
                        this.f39554.m47723();
                        i = i14;
                        iM55979 = C0946.m55979("۫ۜ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-18225)) ^ 1985938745;
                        i3 = -1119394053;
                    } catch (Exception e3) {
                        exc2 = e3;
                        i = i14;
                        iM55979 = C0946.m55979("᩺ᩴ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 9159) ^ 343925359;
                        i3 = -248277778;
                    }
                    int i1111 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i1111;
                    break;
                case 678459044:
                case 920876030:
                    try {
                        i = i14;
                        try {
                            this.f39557.mo4067(C1003.m56119(this.f39556));
                            m31854();
                            iM55979 = (i10 - C0946.m55979("᩶ܺ")) * (-11);
                            i2 = ((iM55979 ^ i9) * 30331) ^ 514195243;
                            i3 = 503200428;
                        } catch (Exception e4) {
                            e = e4;
                            exc2 = e;
                            iM55979 = C0946.m55979("᩺ᩴ") ^ i9;
                            i2 = ((iM55979 ^ i10) * 9159) ^ 343925359;
                            i3 = -248277778;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i = i14;
                    }
                    int i1112 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i1112;
                    break;
                case 1119097002:
                case 1846573947:
                    c14677M33572 = c14677M33572;
                    exc2 = exc2;
                    i14 = i14;
                    if (mo21651()) {
                        iM559710 = C0946.m55979("ܳۙ") ^ i9;
                        i4 = ((iM559710 ^ i10) * (-4013)) ^ 45527141;
                        i5 = 893599251;
                    } else {
                        iM559710 = (C0946.m55979("۬ܺ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM559710 ^ i9) * 21789) ^ (-1466083373);
                        i5 = 1319983687;
                    }
                    int i1113 = iM559710 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1113;
                    i11 = i4;
                    c14677M33572 = c14677M33572;
                    break;
                case 1789966163:
                case 1874241652:
                    i = i14;
                    if (i6 < iM56070) {
                        iM55979 = (C0946.m55979("۬᩺") ^ i10) * 7;
                        i2 = ((iM55979 ^ i9) * 12857) ^ 1181271627;
                        i3 = 68809384;
                    } else {
                        iM55979 = C0946.m55979("᩷᩵") ^ i10;
                        i2 = ((iM55979 ^ i9) * (-8345)) ^ 1719209950;
                        i3 = 947551495;
                    }
                    int i1114 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i1114;
                    break;
                default:
                    i = i14;
                    i6++;
                    iM55979 = (i9 - C0946.m55979("᩷ۖ")) * (-99);
                    i2 = ((iM55979 ^ i10) * 31899) ^ (-961042540);
                    i3 = 1781974962;
                    int i1115 = i;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    i8 = i1115;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01ba A[PHI: r6 r8 r21 r24
      0x01ba: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:53:0x01b8, B:45:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r8v2 java.lang.CharSequence) = (r8v1 java.lang.CharSequence), (r8v3 java.lang.CharSequence) binds: [B:53:0x01b8, B:45:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r21v27 l.ܶ᩵ܿ) = (r21v25 l.ܶ᩵ܿ), (r21v28 l.ܶ᩵ܿ) binds: [B:53:0x01b8, B:45:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r24v17 java.lang.String) = (r24v15 java.lang.String), (r24v18 java.lang.String) binds: [B:53:0x01b8, B:45:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x023b A[PHI: r4 r7 r21 r24
      0x023b: PHI (r4v3 boolean) = (r4v2 boolean), (r4v1 boolean), (r4v1 boolean) binds: [B:61:0x0239, B:49:0x0190, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r7v3 boolean) = (r7v1 boolean), (r7v2 boolean), (r7v1 boolean) binds: [B:61:0x0239, B:49:0x0190, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r21v37 l.ܶ᩵ܿ) = (r21v22 l.ܶ᩵ܿ), (r21v26 l.ܶ᩵ܿ), (r21v40 l.ܶ᩵ܿ) binds: [B:61:0x0239, B:49:0x0190, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r24v24 java.lang.String) = (r24v12 java.lang.String), (r24v16 java.lang.String), (r24v27 java.lang.String) binds: [B:61:0x0239, B:49:0x0190, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x03d6 A[PHI: r13 r14 r15 r16 r21 r24
      0x03d6: PHI (r13v3 short) = (r13v2 short), (r13v1 short), (r13v1 short) binds: [B:91:0x03d4, B:87:0x03ae, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:91:0x03d4, B:87:0x03ae, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:91:0x03d4, B:87:0x03ae, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r16v3 int) = (r16v1 int), (r16v2 int), (r16v1 int) binds: [B:91:0x03d4, B:87:0x03ae, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r21v38 l.ܶ᩵ܿ) = (r21v11 l.ܶ᩵ܿ), (r21v12 l.ܶ᩵ܿ), (r21v39 l.ܶ᩵ܿ) binds: [B:91:0x03d4, B:87:0x03ae, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r24v25 java.lang.String) = (r24v2 java.lang.String), (r24v3 java.lang.String), (r24v26 java.lang.String) binds: [B:91:0x03d4, B:87:0x03ae, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x040e A[PHI: r17 r21 r23 r24
      0x040e: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:95:0x040c, B:65:0x027c, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r21v34 l.ܶ᩵ܿ) = (r21v10 l.ܶ᩵ܿ), (r21v21 l.ܶ᩵ܿ), (r21v35 l.ܶ᩵ܿ) binds: [B:95:0x040c, B:65:0x027c, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r23v5 char) = (r23v4 char), (r23v3 char), (r23v3 char) binds: [B:95:0x040c, B:65:0x027c, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r24v22 java.lang.String) = (r24v1 java.lang.String), (r24v11 java.lang.String), (r24v23 java.lang.String) binds: [B:95:0x040c, B:65:0x027c, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (p067l.C1964.f83032 > 0) goto L16;
     */
    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        int iM55680;
        int i;
        int i2;
        AbstractC17043 abstractC17043;
        int i3;
        int i4;
        int iM55979;
        C11996 c11996 = null;
        Iterator itM56090 = null;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        CharSequence title = null;
        String str = null;
        AbstractC17043 abstractC17044 = null;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1738294509;
        int i11 = RunnableC0871.f81839;
        int i12 = C1003.f81929;
        int iM559710 = (C0946.m55979("֡ۛ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i13 = ((iM559710 ^ i12) * (-27327)) ^ (-1062036591);
        int i14 = iM559710 ^ 14919817;
        short[] sArr = null;
        int i15 = 0;
        ArrayList arrayList = null;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-10305)) >> 31));
            switch (i10) {
                case -1896438956:
                case -1624271689:
                    str = str;
                    abstractC17044 = abstractC17044;
                    C1929.m56566(c11996, -1985229329);
                    c11996.m27445(this.f39556);
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0946.m55979("֫ᩴ") + i12) * 39;
                        i = ((iM55680 ^ i11) * 30595) ^ 1390955533;
                        i2 = -1652511487;
                    } else {
                        iM55680 = C0873.m55680("֨ۖ") ^ i11;
                        i = ((iM55680 ^ i12) * 7207) ^ 1625120212;
                        i2 = -381558182;
                    }
                    int i16 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i16;
                    i13 = i;
                    str = str;
                    break;
                case -1693414573:
                case -520137526:
                    C0898.m55800();
                    str = str;
                    abstractC17044 = abstractC17044;
                    iM55680 = (C0946.m55979("֫ᩴ") + i12) * 39;
                    i = ((iM55680 ^ i11) * 30595) ^ 1390955533;
                    i2 = -1652511487;
                    int i17 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i17;
                    i13 = i;
                    str = str;
                    break;
                case -1686290190:
                case -653408080:
                    c11996.m27444(str);
                    abstractC17044 = f39541;
                    AbstractC0942.m55966(abstractC17044);
                    int iM55681 = C0873.m55680("᩻ܿ") ^ i11;
                    str = str;
                    i = ((iM55681 ^ i12) * 3371) ^ (-1935970247);
                    i14 = iM55681 ^ (-576211568);
                    i13 = i;
                    str = str;
                    break;
                case -1678817676:
                case -934348630:
                    str = str;
                    abstractC17044 = abstractC17044;
                    C1964.m56589(c11996, i6);
                    c11996.m27445(this.f39559);
                    z2 = this.f39558;
                    if (C0947.m55997()) {
                        iM55680 = (C0946.m55979("۠ܳ") ^ i12) * 69;
                        i = ((iM55680 ^ i11) * (-30599)) ^ (-202938335);
                        i2 = -1549395035;
                    } else {
                        iM55680 = (i11 - C0873.m55680("᩸ۤ")) * (-63);
                        i = ((iM55680 ^ i12) * (-28281)) ^ 1255217660;
                        i2 = -967420124;
                    }
                    int i18 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i18;
                    i13 = i;
                    str = str;
                    break;
                case -1615636764:
                case 1109473824:
                    str = str;
                    abstractC17044 = abstractC17044;
                    C1964.m56589(c11996, i5);
                    i6 = this.f39552;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ܽۡ") + i11) * (-69);
                        i = ((iM55680 ^ i12) * (-14457)) ^ (-856727243);
                        i2 = 602623320;
                    } else {
                        iM55680 = (C0946.m55979("ۧ᩸") ^ i12) * 15;
                        i = ((iM55680 ^ i11) * 15781) ^ 35667942;
                        i2 = -1630560509;
                    }
                    int i19 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i19;
                    i13 = i;
                    str = str;
                    break;
                case -1389947646:
                case 1134378344:
                    C11996 c11997 = new C11996();
                    C1964.m56589(c11997, C1012.m56137(arrayList));
                    itM56090 = C0989.m56090(arrayList);
                    c11996 = c11997;
                    iM55680 = C0946.m55979("ۘ᩻") ^ i11;
                    i = ((iM55680 ^ i12) * 7939) ^ (-1486711873);
                    i2 = -1439211833;
                    int i110 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i110;
                    i13 = i;
                    str = str;
                    break;
                case -1363181864:
                case 546732987:
                    str = str;
                    abstractC17044 = abstractC17044;
                    super.onSaveInstanceState(bundle);
                    ArrayList arrayList2 = this.f39544;
                    if (arrayList2 == null) {
                        arrayList = arrayList2;
                        iM55680 = C0946.m55979("۟ۢ") ^ i12;
                        i = ((iM55680 ^ i11) * (-2855)) ^ 748672706;
                        i2 = 1016441682;
                        int i111 = iM55680 ^ i2;
                        abstractC17044 = abstractC17044;
                        i14 = i111;
                        i13 = i;
                    } else {
                        int iM559711 = (C0946.m55979("ۜۤ") ^ i12) * (-9);
                        arrayList = arrayList2;
                        i13 = ((iM559711 ^ i11) * 27679) ^ (-2042811589);
                        abstractC17044 = abstractC17044;
                        i14 = iM559711 ^ (-1977130936);
                    }
                    str = str;
                    break;
                case -1234578743:
                case 386685179:
                    i15 = 35385;
                    iM55680 = (C0873.m55680("ۗۢ") ^ i11) * (-45);
                    i = ((iM55680 ^ i12) * 2485) ^ (-439536425);
                    i2 = 1080364500;
                    int i112 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i112;
                    i13 = i;
                    str = str;
                    break;
                case -1148569204:
                case -962043730:
                    abstractC17043 = abstractC17044;
                    c11996.m27459(C0863.m55639(title));
                    str = this.f39543;
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("᩷֡") + i11) * 3;
                        i4 = ((iM55979 ^ i12) * (-27985)) ^ 1426651197;
                        i3 = -726310404;
                    } else {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i11;
                        i4 = ((iM55979 ^ i12) * (-5443)) ^ 2043316253;
                        i3 = 1089914771;
                    }
                    AbstractC17043 abstractC17045 = abstractC17043;
                    i14 = iM55979 ^ i3;
                    i13 = i4;
                    abstractC17044 = abstractC17045;
                    break;
                case -1137626573:
                case -585373418:
                    C0877.m55696();
                    C1053.m56327();
                    break;
                case -987008843:
                case 740627161:
                    C0927.m55873();
                    if (C0949.f81897 >= 0) {
                        int iM559712 = (C0946.m55979("ۢۘ") ^ i11) * (-17);
                        i14 = iM559712 ^ (-2082878012);
                        i13 = ((iM559712 ^ i12) * 3673) ^ (-58467351);
                    } else {
                        str = str;
                        abstractC17044 = abstractC17044;
                        iM55680 = (C0946.m55979("֫ᩴ") + i12) * 39;
                        i = ((iM55680 ^ i11) * 30595) ^ 1390955533;
                        i2 = -1652511487;
                        int i113 = iM55680 ^ i2;
                        abstractC17044 = abstractC17044;
                        i14 = i113;
                        i13 = i;
                        str = str;
                    }
                    break;
                case -963777813:
                case 1049380967:
                    ((C10674) C0955.m56035(itM56090)).m24563(c11996);
                    iM55680 = C0946.m55979("ۘ᩻") ^ i11;
                    i = ((iM55680 ^ i12) * 7939) ^ (-1486711873);
                    i2 = -1439211833;
                    int i114 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i114;
                    i13 = i;
                    str = str;
                    break;
                case -806062791:
                case 1450310258:
                    i15 = 26056;
                    iM55680 = (C0873.m55680("ۗۢ") ^ i11) * (-45);
                    i = ((iM55680 ^ i12) * 2485) ^ (-439536425);
                    i2 = 1080364500;
                    int i115 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i115;
                    i13 = i;
                    str = str;
                    break;
                case -692000217:
                case 424201431:
                    C0949.m56012();
                    break;
                case -626933648:
                case 1891281883:
                    str = str;
                    abstractC17044 = abstractC17044;
                    C1929.m56566(c11996, this.f39545);
                    z = this.f39549;
                    if (C0845.m55584() <= 0) {
                        iM55680 = (C0946.m55979("۠ܳ") ^ i12) * 69;
                        i = ((iM55680 ^ i11) * (-30599)) ^ (-202938335);
                        i2 = -1549395035;
                    } else {
                        iM55680 = (C0873.m55680("ܺ᩷") ^ i12) * (-35);
                        i = ((iM55680 ^ i11) * (-15663)) ^ 1823127807;
                        i2 = 775889708;
                    }
                    int i116 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i116;
                    i13 = i;
                    str = str;
                    break;
                case -613699581:
                case 1147106843:
                    try {
                        C1003.m56117(abstractC17044, c11996.m27447());
                        abstractC17044 = abstractC17044;
                        try {
                            try {
                                C0906.m55819(bundle, C1404.m56462(f82167, 328, 7, i15), true);
                                break;
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (IOException unused3) {
                        abstractC17044 = abstractC17044;
                    }
                    str = str;
                    iM55680 = C0946.m55979("۟ۢ") ^ i12;
                    i = ((iM55680 ^ i11) * (-2855)) ^ 748672706;
                    i2 = 1016441682;
                    int i117 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i117;
                    i13 = i;
                    str = str;
                    break;
                case -577641305:
                case 1008959158:
                    str = str;
                    abstractC17044 = abstractC17044;
                    c11996.m27445(z2);
                    title = getTitle();
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("ܽۡ") + i11) * (-69);
                        i = ((iM55680 ^ i12) * (-14457)) ^ (-856727243);
                        i2 = 602623320;
                    } else {
                        iM55680 = C0873.m55680("᩺֫") ^ i12;
                        i = ((iM55680 ^ i11) * 16745) ^ (-1407796092);
                        i2 = -455998793;
                    }
                    int i118 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i118;
                    i13 = i;
                    str = str;
                    break;
                case -567381061:
                case -515432325:
                    str = str;
                    abstractC17044 = abstractC17044;
                    if ((i9 + 1) - i8 > 0) {
                        iM55680 = C0873.m55680("ᩴ᩻") ^ i12;
                        i = ((iM55680 ^ i11) * 4965) ^ 118835467;
                        i2 = -309435434;
                    } else {
                        iM55680 = C0946.m55979("ۗܰ") ^ i12;
                        i = ((iM55680 ^ i11) * (-31335)) ^ (-7658500);
                        i2 = -1810869864;
                    }
                    int i119 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i119;
                    i13 = i;
                    str = str;
                    break;
                case -517395149:
                case 1564380633:
                    C0892.m55749();
                    if (C0912.f81867 > 0) {
                        str = str;
                        abstractC17044 = abstractC17044;
                        iM55680 = (C0946.m55979("۠ܳ") ^ i12) * 69;
                        i = ((iM55680 ^ i11) * (-30599)) ^ (-202938335);
                        i2 = -1549395035;
                        int i1110 = iM55680 ^ i2;
                        abstractC17044 = abstractC17044;
                        i14 = i1110;
                        i13 = i;
                        str = str;
                    }
                    str = str;
                    abstractC17044 = abstractC17044;
                    iM55680 = C0873.m55680("۟ۨ") ^ i12;
                    i = ((iM55680 ^ i11) * 1441) ^ 43196791;
                    i2 = -1184298798;
                    int i1111 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i1111;
                    i13 = i;
                    str = str;
                    break;
                case -379144126:
                case 424480363:
                    if (C0890.f81849 != 0) {
                        str = str;
                        abstractC17044 = abstractC17044;
                        iM55680 = C0946.m55979("ᩳܺ") ^ i12;
                        i = ((iM55680 ^ i11) * 2107) ^ (-1429715508);
                        i2 = -414116870;
                        int i1112 = iM55680 ^ i2;
                        abstractC17044 = abstractC17044;
                        i14 = i1112;
                        i13 = i;
                        str = str;
                    } else {
                        int iM559713 = (C0946.m55979("ۢۘ") ^ i11) * (-17);
                        i14 = iM559713 ^ (-2082878012);
                        i13 = ((iM559713 ^ i12) * 3673) ^ (-58467351);
                    }
                    break;
                case 34089629:
                case 1166765843:
                    C0845.m55584();
                    if (C1229.f82066 < 0) {
                        abstractC17043 = abstractC17044;
                        iM55979 = (C0946.m55979("᩷֡") + i11) * 3;
                        i4 = ((iM55979 ^ i12) * (-27985)) ^ 1426651197;
                        i3 = -726310404;
                        AbstractC17043 abstractC17046 = abstractC17043;
                        i14 = iM55979 ^ i3;
                        i13 = i4;
                        abstractC17044 = abstractC17046;
                    } else {
                        str = str;
                        abstractC17044 = abstractC17044;
                        iM55680 = C0873.m55680("۟ۨ") ^ i12;
                        i = ((iM55680 ^ i11) * 1441) ^ 43196791;
                        i2 = -1184298798;
                        int i1113 = iM55680 ^ i2;
                        abstractC17044 = abstractC17044;
                        i14 = i1113;
                        i13 = i;
                        str = str;
                    }
                    break;
                case 436020165:
                case 1586453300:
                    str = str;
                    abstractC17044 = abstractC17044;
                    s = sArr[c];
                    i7 = s + 1;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("۟ۨ") ^ i12;
                        i = ((iM55680 ^ i11) * 1441) ^ 43196791;
                        i2 = -1184298798;
                    } else {
                        iM55680 = (i11 - C0946.m55979("ܺܺ")) * (-89);
                        i = ((iM55680 ^ i12) * 24067) ^ (-1091866793);
                        i2 = 1135280935;
                    }
                    int i1114 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i1114;
                    i13 = i;
                    str = str;
                    break;
                case 501416986:
                case 874480206:
                    str = str;
                    abstractC17044 = abstractC17044;
                    i8 = i7 * i7;
                    i9 = s * 2;
                    if (C0930.m55885() <= 0) {
                        iM55680 = C0873.m55680("۟ۨ") ^ i12;
                        i = ((iM55680 ^ i11) * 1441) ^ 43196791;
                        i2 = -1184298798;
                    } else {
                        iM55680 = (C0873.m55680("ۛۗ") ^ i11) * 25;
                        i = ((iM55680 ^ i12) * 20449) ^ (-1504679245);
                        i2 = -389956672;
                    }
                    int i1115 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i1115;
                    i13 = i;
                    str = str;
                    break;
                case 771276208:
                case 1551630922:
                    str = str;
                    abstractC17044 = abstractC17044;
                    sArr = f82167;
                    c = 327;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("֫ᩴ") + i12) * 39;
                        i = ((iM55680 ^ i11) * 30595) ^ 1390955533;
                        i2 = -1652511487;
                    } else {
                        iM55680 = C0873.m55680("᩺ۢ") ^ i12;
                        i = ((iM55680 ^ i11) * (-11589)) ^ (-354210844);
                        i2 = 2096445684;
                    }
                    int i1116 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i1116;
                    i13 = i;
                    str = str;
                    break;
                case 869027787:
                case 1841767512:
                    str = str;
                    abstractC17044 = abstractC17044;
                    if (C0930.m55886(itM56090)) {
                        iM55680 = C0946.m55979("ۢ᩸") ^ i12;
                        i = ((iM55680 ^ i11) * (-8725)) ^ (-1464044009);
                        i2 = 485883865;
                    } else {
                        iM55680 = C0873.m55680("ۚ֫") ^ i11;
                        i = ((iM55680 ^ i12) * 3623) ^ (-1575229319);
                        i2 = 114602249;
                    }
                    int i1117 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i1117;
                    i13 = i;
                    str = str;
                    break;
                case 1556675356:
                case 1734472717:
                    str = str;
                    abstractC17044 = abstractC17044;
                    c11996.m27445(z);
                    c11996.m27455(this.f39547);
                    i5 = this.f39550;
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ᩳܺ") ^ i12;
                        i = ((iM55680 ^ i11) * 2107) ^ (-1429715508);
                        i2 = -414116870;
                    } else {
                        iM55680 = (C0946.m55979("֨ᩴ") + i11) * (-17);
                        i = ((iM55680 ^ i12) * (-7807)) ^ (-1095749895);
                        i2 = -2078825227;
                    }
                    int i1118 = iM55680 ^ i2;
                    abstractC17044 = abstractC17044;
                    i14 = i1118;
                    i13 = i;
                    str = str;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce A[PHI: r2 r13 r15
      0x01ce: PHI (r2v115 short[]) = (r2v114 short[]), (r2v2 short[]) binds: [B:57:0x01cc, B:53:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:57:0x01cc, B:53:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v4 java.lang.String) binds: [B:57:0x01cc, B:53:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0288 A[PHI: r11 r12 r16
      0x0288: PHI (r11v4 java.util.ArrayList) = (r11v3 java.util.ArrayList), (r11v2 java.util.ArrayList), (r11v2 java.util.ArrayList) binds: [B:73:0x0286, B:49:0x0183, B:252:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:73:0x0286, B:49:0x0183, B:252:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:73:0x0286, B:49:0x0183, B:252:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0391 A[PHI: r9 r27
      0x0391: PHI (r9v15 int) = (r9v14 int), (r9v16 int) binds: [B:96:0x0379, B:93:0x0357] A[DONT_GENERATE, DONT_INLINE]
      0x0391: PHI (r27v11 short[]) = (r27v10 short[]), (r27v12 short[]) binds: [B:96:0x0379, B:93:0x0357] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܿ */
    public static void m31843(AbstractActivityC14026 abstractActivityC14026) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int iM55682;
        int i6;
        int i7;
        int iM55979;
        int i8;
        int i9;
        int i10 = C0949.f81897;
        int i11 = C0877.f81843;
        int iM559710 = (i10 - C0946.m55979("ۛۗ")) * (-53);
        int i12 = ((iM559710 ^ i11) * 23775) ^ 2009327530;
        Iterator itM56292 = null;
        ArrayList arrayList = null;
        String strM55597 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i13 = iM559710 ^ (-2030129400);
        boolean z = false;
        boolean z2 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iM559711 = 0;
        int iM559712 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i18 = 0;
        short s3 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -749235298;
        Iterator itM56090 = null;
        ArrayList arrayList2 = null;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            i22 = i13 ^ (i12 & (((i22 ^ i11) * 31603) >> 31));
            switch (i22) {
                case -2123493403:
                case -112572009:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i25 = i19;
                    arrayList2 = arrayList2;
                    i5 = i25;
                    if (i21 != z2) {
                        iM55682 = C0946.m55979("ۚᩴ") ^ i11;
                        i6 = ((iM55682 ^ i10) * (-22859)) ^ 266570757;
                        i7 = -1763244042;
                    } else {
                        iM55682 = (C0873.m55680("ܶ۫") ^ i10) * (-115);
                        i6 = ((iM55682 ^ i11) * 29135) ^ (-1829805591);
                        i7 = 1809731803;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList3 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList3;
                    break;
                case -2089616783:
                case -1798906673:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i26 = i19;
                    arrayList2 = arrayList2;
                    i5 = i26;
                    int i27 = s + s2;
                    i18 = i27 * i27;
                    s3 = 54596;
                    if (C1229.f82066 >= 0) {
                        iM55682 = (C0873.m55680("ܿۨ") + i10) * (-73);
                        i6 = ((iM55682 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                    } else {
                        iM55682 = C0873.m55680("ۙ᩺") ^ i11;
                        i6 = ((iM55682 ^ i10) * (-10141)) ^ (-483554685);
                        i7 = 1412560304;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList4 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList4;
                    break;
                case -2061587743:
                case -2017670874:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i28 = i19;
                    arrayList2 = arrayList2;
                    i5 = i28;
                    sArr = f82167;
                    c = 'G';
                    if (C0890.f81849 != 0) {
                        iM55682 = (C0873.m55680("ۚ᩵") + i11) * 13;
                        i6 = ((iM55682 ^ i10) * 85) ^ (-756712849);
                        i7 = -1314311422;
                    } else {
                        iM55682 = (i10 - C0873.m55680("ܿۘ")) * (-13);
                        i6 = ((iM55682 ^ i11) * (-11917)) ^ 1508421892;
                        i7 = -1451074624;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList5 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList5;
                    break;
                case -2042885163:
                case -1486383126:
                    i5 = i19;
                    i14 = 55380;
                    iM55682 = C0873.m55680("ۤۛ") ^ i11;
                    i6 = ((iM55682 ^ i10) * 9839) ^ 1755930727;
                    i7 = -1081137081;
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList6 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList6;
                    break;
                case -1990189670:
                case -161019158:
                    i5 = i19;
                    i14 = 52386;
                    iM55682 = C0873.m55680("ۤۛ") ^ i11;
                    i6 = ((iM55682 ^ i10) * 9839) ^ 1755930727;
                    i7 = -1081137081;
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList7 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList7;
                    break;
                case -1969147071:
                case -629276308:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i29 = i19;
                    arrayList2 = arrayList2;
                    i5 = i29;
                    if (i18 - (s * s3) >= 0) {
                        iM55682 = C0873.m55680("ܳۡ") ^ i10;
                        i6 = ((iM55682 ^ i11) * (-9255)) ^ 100921298;
                        i7 = 1600807421;
                    } else {
                        iM55682 = (C0946.m55979("ۢ۠") + i10) * 69;
                        i6 = ((iM55682 ^ i11) * 6725) ^ (-997189699);
                        i7 = 502218606;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList8 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList8;
                    break;
                case -1950791782:
                case 801942243:
                    C0955.m56025();
                    if (C0906.f81862 < 0) {
                        i21 = i21;
                        sArr3 = sArr3;
                        iM55681 = (C0873.m55680("ۙۡ") + i10) * (-19);
                        i3 = ((iM55681 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    } else {
                        iM55680 = C0946.m55979("֡ᩴ") ^ i11;
                        i = ((iM55680 ^ i10) * (-30359)) ^ (-2138438129);
                        i2 = -1742244562;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1930074187:
                case 971967464:
                    if (!C0873.m55678()) {
                        iM55680 = (C0946.m55979("᩵ܽ") + i10) * (-65);
                        i = ((iM55680 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        iM55681 = (C0873.m55680("ۙۡ") + i10) * (-19);
                        i3 = ((iM55681 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    }
                    break;
                case -1913885805:
                case -991689722:
                    RunnableC0897.m55784();
                    if (C0845.f81821 >= 0) {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i30 = i19;
                        arrayList2 = arrayList2;
                        i5 = i30;
                        iM55682 = (C0873.m55680("۫᩶") + i11) * 65;
                        i6 = ((iM55682 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList9 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList9;
                    } else {
                        iM55680 = (C0946.m55979("᩵ܽ") + i10) * (-65);
                        i = ((iM55680 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1825267265:
                case 144964289:
                    break;
                case -1648792269:
                case 618935764:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i31 = i19;
                    arrayList2 = arrayList2;
                    i5 = i31;
                    int i32 = abstractActivityC14026.f39550;
                    int i33 = i20 == true ? 1 : 0;
                    if (i33 < i32) {
                        iM55682 = C0946.m55979("ۗܿ") ^ i11;
                        i20 = i33 == true ? 1 : 0;
                        i6 = ((iM55682 ^ i10) * (-5529)) ^ 1430353853;
                        i7 = 779720154;
                    } else {
                        i20 = i33 == true ? 1 : 0;
                        iM55682 = C0873.m55680("ۙܰ") ^ i10;
                        i6 = ((iM55682 ^ i11) * (-4059)) ^ (-1041646249);
                        i7 = 1181986638;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList10 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList10;
                    break;
                case -1624901601:
                case 1595879092:
                    abstractActivityC14026.m31842(z2);
                    abstractActivityC14026.f39555.notifyDataSetChanged();
                    break;
                case -1607052145:
                case 737240183:
                    i21 = i21;
                    sArr3 = sArr3;
                    ArrayList arrayList11 = abstractActivityC14026.f39553;
                    i19 = abstractActivityC14026.f39547[i20 == true ? 1 : 0];
                    if (C0892.f81851) {
                        int iM55683 = C0873.m55680("۫ۨ") ^ i10;
                        arrayList2 = arrayList11;
                        i12 = ((iM55683 ^ i11) * (-1127)) ^ 657319183;
                        i13 = iM55683 ^ (-1380477793);
                    } else {
                        arrayList2 = arrayList11;
                        iM55681 = (C0873.m55680("ۙۡ") + i10) * (-19);
                        i3 = ((iM55681 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                    }
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -1557778784:
                case 321280788:
                    i17 = iM559711 ^ 2130322989;
                    sArr3 = f82167;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ܺۗ") + i11) * 101;
                        i = ((iM55680 ^ i10) * 19637) ^ 756170748;
                        i2 = 2036093383;
                    } else {
                        iM55680 = (C0873.m55680("ᩴܰ") + i10) * (-13);
                        i = ((iM55680 ^ i11) * 5871) ^ 1432856957;
                        i2 = -1182831524;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -1552481460:
                case 310104399:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0946.m55979("᩵ܽ") + i10) * (-65);
                        i = ((iM55680 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                    } else {
                        iM55680 = C0946.m55979("ۧ᩷") ^ i11;
                        i = ((iM55680 ^ i10) * (-26669)) ^ 1885452994;
                        i2 = 1781057980;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -1427923611:
                case 1261375080:
                    if (!((C10674) RunnableC0897.m55785(itM56292)).m24571()) {
                        iM55681 = (i11 - C0946.m55979("ۧۤ")) * (-81);
                        i3 = ((iM55681 ^ i10) * 9391) ^ (-405813789);
                        i4 = 515928501;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    } else {
                        iM55680 = C0873.m55680("ۡܽ") ^ i10;
                        i = ((iM55680 ^ i11) * 32283) ^ 934619083;
                        i2 = 466063929;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1404070249:
                case 1554979506:
                    i21 = i21;
                    sArr3 = sArr3;
                    abstractActivityC14026.f39545 += z2 ? 1 : 0;
                    int i34 = i19;
                    arrayList2 = arrayList2;
                    i5 = i34;
                    iM55682 = (i11 - C0873.m55680("֫ۢ")) * 99;
                    i6 = ((iM55682 ^ i10) * (-6443)) ^ (-1096112717);
                    i7 = -1204488943;
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList12 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList12;
                    break;
                case -1367618891:
                case -82745241:
                    if (!C1404.m56468()) {
                        iM55680 = C0946.m55979("֡ᩴ") ^ i11;
                        i = ((iM55680 ^ i10) * (-30359)) ^ (-2138438129);
                        i2 = -1742244562;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i35 = i19;
                        arrayList2 = arrayList2;
                        i5 = i35;
                        iM55682 = (C0873.m55680("ۚ᩵") + i11) * 13;
                        i6 = ((iM55682 ^ i10) * 85) ^ (-756712849);
                        i7 = -1314311422;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList13 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList13;
                    }
                    break;
                case -1335588413:
                case 948150132:
                    i21 = i21;
                    sArr3 = sArr3;
                    i20 = (i20 == true ? 1 : 0) + 1;
                    int i36 = i19;
                    arrayList2 = arrayList2;
                    i5 = i36;
                    iM55682 = (C0946.m55979("֨ۧ") + i11) * 71;
                    i6 = ((iM55682 ^ i10) * (-29461)) ^ 1064557393;
                    i7 = 1556544592;
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList14 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList14;
                    break;
                case -1261063141:
                case -1217422293:
                    abstractActivityC14026.f39548.m17165();
                    break;
                case -1245636293:
                case 568629844:
                    abstractActivityC14026.f39545 += z2 ? 1 : 0;
                    i21 = i21;
                    sArr3 = sArr3;
                    i5 = i19;
                    iM55682 = (C0946.m55979("᩶ܺ") + i11) * 101;
                    i6 = ((iM55682 ^ i10) * (-4323)) ^ (-1020884064);
                    i7 = 1199732378;
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList15 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList15;
                    break;
                case -1230250035:
                case 1556886373:
                    RunnableC0938.m55938();
                    if (C1071.f81975 > 0) {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i37 = i19;
                        arrayList2 = arrayList2;
                        i5 = i37;
                        iM55682 = (C0873.m55680("ܿۨ") + i10) * (-73);
                        i6 = ((iM55682 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList16 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList16;
                    } else {
                        iM55680 = (C0946.m55979("᩵ܽ") + i10) * (-65);
                        i = ((iM55680 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1211620831:
                case 413725489:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i38 = i19;
                    arrayList2 = arrayList2;
                    i5 = i38;
                    if (i21 != 2) {
                        iM55682 = C0873.m55680("ܶ᩻") ^ i10;
                        i6 = ((iM55682 ^ i11) * 28387) ^ (-397102967);
                        i7 = -256858175;
                    } else {
                        iM55682 = (C0873.m55680("֨᩸") ^ i11) * (-45);
                        i6 = ((iM55682 ^ i10) * (-31013)) ^ 1805882866;
                        i7 = 1118531432;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList17 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList17;
                    break;
                case -1185109089:
                case 297438886:
                    abstractActivityC14026.m31842(abstractActivityC14026.f39554.m47727());
                    break;
                case -1095213586:
                case 870679910:
                    abstractActivityC14026.m31842(z2);
                    abstractActivityC14026.f39555.notifyDataSetChanged();
                    break;
                case -1089149937:
                case 736375744:
                    iM559712 = C0946.m55979(strM55597);
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("֡᩶") ^ i10;
                        i = ((iM55680 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                    } else {
                        iM55680 = (C0946.m55979("ܽܿ") + i11) * 73;
                        i = ((iM55680 ^ i10) * (-23145)) ^ (-281406979);
                        i2 = -1851183652;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -1030634909:
                case 1461527253:
                    abstractActivityC14026.f39545 += z2 ? 1 : 0;
                    iM55681 = (i11 - C0946.m55979("ۧۤ")) * (-81);
                    i3 = ((iM55681 ^ i10) * 9391) ^ (-405813789);
                    i4 = 515928501;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -963476798:
                case -299226483:
                    if (((C10674) C0992.m56115(arrayList, i16)).m24571()) {
                        iM55680 = (C0946.m55979("᩵ۗ") + i10) * 93;
                        i = ((iM55680 ^ i11) * 15753) ^ 66205015;
                        i2 = -1117094625;
                    } else {
                        iM55680 = C0946.m55979("᩺ۤ") ^ i11;
                        i = ((iM55680 ^ i10) * (-16889)) ^ (-1544940840);
                        i2 = -403827462;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -947896077:
                case 904948844:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i39 = i19;
                    arrayList2 = arrayList2;
                    i5 = i39;
                    abstractActivityC14026.f39545 = z ? 1 : 0;
                    if (abstractActivityC14026.f39549) {
                        iM55682 = (C0946.m55979("ᩴܳ") + i10) * 115;
                        i6 = ((iM55682 ^ i11) * (-19495)) ^ 1375116752;
                        i7 = 1888588920;
                    } else {
                        iM55682 = C0873.m55680("ܶ֨") ^ i11;
                        i6 = ((iM55682 ^ i10) * (-31443)) ^ (-6631949);
                        i7 = -66349754;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList18 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList18;
                    break;
                case -906204756:
                case -402722955:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (C0930.m55886(itM56292)) {
                        iM55681 = C0946.m55979("ܰܽ") ^ i11;
                        i3 = ((iM55681 ^ i10) * (-12565)) ^ 497280671;
                        i4 = 615276917;
                    } else {
                        iM55681 = C0873.m55680("᩸᩷") ^ i10;
                        i3 = ((iM55681 ^ i11) * 30347) ^ (-687382957);
                        i4 = -1629408634;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -889449022:
                case -463002671:
                    if (C0917.f81868) {
                        iM55680 = (C0946.m55979("᩵ܽ") + i10) * (-65);
                        i = ((iM55680 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                    } else {
                        iM55680 = (C0946.m55979("֨ۢ") ^ i10) * 49;
                        i = ((iM55680 ^ i11) * (-12307)) ^ (-2139344709);
                        i2 = -863503220;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -742062553:
                case 1986608645:
                    i15 = 0;
                    iM55681 = (C0946.m55979("֫ܳ") ^ i10) * (-7);
                    i3 = ((iM55681 ^ i11) * (-18995)) ^ 815231853;
                    i4 = -74508259;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -721873149:
                case 1498941853:
                    arrayList = abstractActivityC14026.f39553;
                    i16 = abstractActivityC14026.f39547[i15];
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("֡᩶") ^ i10;
                        i = ((iM55680 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                    } else {
                        iM55680 = C0946.m55979("ᩴ۬") ^ i11;
                        i = ((iM55680 ^ i10) * (-18149)) ^ (-513897506);
                        i2 = 1617300072;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -705199057:
                case -286113175:
                    C0912.m55833();
                    C1017.m56187();
                    iM55680 = C0946.m55979("֡ᩴ") ^ i11;
                    i = ((iM55680 ^ i10) * (-30359)) ^ (-2138438129);
                    i2 = -1742244562;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -649006062:
                case 1326419034:
                    strM55597 = C0854.m55597(sArr3, 75, 3, i14);
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0946.m55979("ܺۗ") + i11) * 101;
                        i = ((iM55680 ^ i10) * 19637) ^ 756170748;
                        i2 = 2036093383;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ۙ᩸")) * 101;
                        i = ((iM55680 ^ i11) * (-3499)) ^ 939789785;
                        i2 = -1792857501;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case -597085923:
                case 1960953316:
                    ArrayList arrayList19 = arrayList2;
                    i21 = i21;
                    sArr3 = sArr3;
                    int i40 = i19;
                    arrayList2 = arrayList19;
                    if (((C10674) C0992.m56115(arrayList19, i40)).m24565(z2)) {
                        iM55682 = C0873.m55680("ۙ֡") ^ i10;
                        i5 = i40;
                        i6 = ((iM55682 ^ i11) * 7737) ^ (-1424100386);
                        i7 = -2047258756;
                    } else {
                        i5 = i40;
                        iM55682 = (i11 - C0873.m55680("֫ۢ")) * 99;
                        i6 = ((iM55682 ^ i10) * (-6443)) ^ (-1096112717);
                        i7 = -1204488943;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList110 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList110;
                    break;
                case -577244994:
                case 834727469:
                    short[] sArr4 = sArr3;
                    int i41 = i19;
                    arrayList2 = arrayList2;
                    i5 = i41;
                    int iM47731 = abstractActivityC14026.f39554.m47731();
                    z = false;
                    z2 = true;
                    if (iM47731 != 0) {
                        iM55979 = (C0946.m55979("ܳܰ") ^ i10) * 95;
                        i8 = ((iM55979 ^ i11) * 1513) ^ (-130103798);
                        i9 = 1583073842;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩷") ^ i11;
                        i8 = ((iM55979 ^ i10) * (-30907)) ^ (-1554136896);
                        i9 = -1405555182;
                    }
                    i13 = iM55979 ^ i9;
                    sArr3 = sArr4;
                    i21 = iM47731;
                    i12 = i8;
                    ArrayList arrayList111 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList111;
                    break;
                case -373293167:
                case 702992866:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (i21 != 3) {
                        iM55681 = C0946.m55979("ۗ᩶") ^ i11;
                        i3 = ((iM55681 ^ i10) * 20093) ^ 1708305681;
                        i4 = -711380851;
                    } else {
                        iM55681 = C0873.m55680("ۖ۟") ^ i11;
                        i3 = ((iM55681 ^ i10) * 21555) ^ (-1527540730);
                        i4 = 958422271;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -181699517:
                case -81103479:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (i15 < abstractActivityC14026.f39550) {
                        iM55681 = (i10 - C0946.m55979("֡۫")) * 9;
                        i3 = ((iM55681 ^ i11) * 24161) ^ 1246132863;
                        i4 = -44268287;
                    } else {
                        iM55681 = C0873.m55680("᩸᩷") ^ i10;
                        i3 = ((iM55681 ^ i11) * 30347) ^ (-687382957);
                        i4 = -1629408634;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -110666044:
                case 578225280:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i42 = i19;
                    arrayList2 = arrayList2;
                    i5 = i42;
                    abstractActivityC14026.f39545 = z ? 1 : 0;
                    if (abstractActivityC14026.f39549) {
                        i20 = z ? 1 : 0;
                        iM55682 = (C0946.m55979("֨ۧ") + i11) * 71;
                        i6 = ((iM55682 ^ i10) * (-29461)) ^ 1064557393;
                        i7 = 1556544592;
                    } else {
                        iM55682 = C0946.m55979("ۗ۫") ^ i10;
                        i6 = ((iM55682 ^ i11) * 12859) ^ 653536617;
                        i7 = -723772992;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList112 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList112;
                    break;
                case -11454214:
                case 1932649142:
                    iM559711 = C0946.m55979(RunnableC0897.m55783(sArr2, i23, i24, i14));
                    if (C1017.f81942 < 0) {
                        iM55680 = (C0873.m55680("᩹ܰ") ^ i11) * (-23);
                        i = ((iM55680 ^ i10) * 1925) ^ (-317538984);
                        i2 = -1810966406;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i310 = i19;
                        arrayList2 = arrayList2;
                        i5 = i310;
                        iM55682 = (C0873.m55680("ܿۨ") + i10) * (-73);
                        i6 = ((iM55682 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList113 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList113;
                    }
                    break;
                case 25673140:
                case 100065093:
                    abstractActivityC14026.m31842(z);
                    break;
                case 91837099:
                case 676919953:
                    abstractActivityC14026.m12253(i17, iM559712 ^ 2104653483, z);
                    break;
                case 227168018:
                case 682312654:
                    i21 = i21;
                    sArr3 = sArr3;
                    i5 = i19;
                    itM56090 = C0989.m56090(abstractActivityC14026.f39553);
                    iM55682 = (C0946.m55979("᩶ܺ") + i11) * 101;
                    i6 = ((iM55682 ^ i10) * (-4323)) ^ (-1020884064);
                    i7 = 1199732378;
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList114 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList114;
                    break;
                case 375957440:
                case 2025474503:
                    C0927.m55873();
                    break;
                case 379959933:
                case 1224156311:
                    abstractActivityC14026.f39545 += z2 ? 1 : 0;
                    iM55680 = C0946.m55979("᩺ۤ") ^ i11;
                    i = ((iM55680 ^ i10) * (-16889)) ^ (-1544940840);
                    i2 = -403827462;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case 565201921:
                case 735888845:
                    sArr2 = f82167;
                    i23 = 72;
                    i24 = 3;
                    if (C0898.f81858 > 0) {
                        iM55680 = (C0873.m55680("ۖۙ") + i10) * (-61);
                        i = ((iM55680 ^ i11) * (-7647)) ^ (-1813798038);
                        i2 = -914537855;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i311 = i19;
                        arrayList2 = arrayList2;
                        i5 = i311;
                        iM55682 = (C0873.m55680("۫᩶") + i11) * 65;
                        i6 = ((iM55682 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList115 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList115;
                    }
                    break;
                case 811896753:
                case 1364647728:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (!((C10674) C0955.m56035(itM56090)).m24565(z2)) {
                        i5 = i19;
                        iM55682 = (C0946.m55979("᩶ܺ") + i11) * 101;
                        i6 = ((iM55682 ^ i10) * (-4323)) ^ (-1020884064);
                        i7 = 1199732378;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList116 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList116;
                    } else {
                        iM55681 = (C0946.m55979("ܽۨ") ^ i10) * 57;
                        i3 = ((iM55681 ^ i11) * (-22971)) ^ 1544003543;
                        i4 = 1171878161;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    }
                    break;
                case 1003332704:
                case 1203040351:
                    if (abstractActivityC14026.f39545 == 0) {
                        iM55680 = C0873.m55680("ۙۛ") ^ i11;
                        i = ((iM55680 ^ i10) * (-26129)) ^ 652773798;
                        i2 = -1882686325;
                    } else {
                        iM55680 = C0873.m55680("᩺᩵") ^ i11;
                        i = ((iM55680 ^ i10) * (-4195)) ^ 777244040;
                        i2 = -1112944576;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    break;
                case 1146013384:
                case 1643757087:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (!C0866.m55647(itM56090)) {
                        int i43 = i19;
                        arrayList2 = arrayList2;
                        i5 = i43;
                        iM55682 = C0873.m55680("ۙܰ") ^ i10;
                        i6 = ((iM55682 ^ i11) * (-4059)) ^ (-1041646249);
                        i7 = 1181986638;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList117 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList117;
                    } else {
                        iM55681 = C0873.m55680("ۚۘ") ^ i10;
                        i3 = ((iM55681 ^ i11) * (-1679)) ^ (-1606579020);
                        i4 = -382543703;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    }
                    break;
                case 1253276514:
                case 1772238157:
                    i15++;
                    iM55681 = (C0946.m55979("֫ܳ") ^ i10) * (-7);
                    i3 = ((iM55681 ^ i11) * (-18995)) ^ 815231853;
                    i4 = -74508259;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case 1338228550:
                case 1426514896:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("֡᩶") ^ i10;
                        i = ((iM55680 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i312 = i19;
                        arrayList2 = arrayList2;
                        i5 = i312;
                        iM55682 = (C0873.m55680("۫᩶") + i11) * 65;
                        i6 = ((iM55682 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = iM55682 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList118 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList118;
                    }
                    break;
                case 1540801775:
                case 1947211978:
                    i21 = i21;
                    if (i21 != 4) {
                        iM55681 = C0873.m55680("ۧۡ") ^ i10;
                        sArr3 = sArr3;
                        i3 = ((iM55681 ^ i11) * 6743) ^ (-1331423479);
                        i4 = 1247998275;
                    } else {
                        sArr3 = sArr3;
                        iM55681 = C0873.m55680("۟ܳ") ^ i11;
                        i3 = ((iM55681 ^ i10) * (-15967)) ^ (-2017367133);
                        i4 = -1342207448;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case 1596258551:
                case 1630748205:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i44 = i19;
                    arrayList2 = arrayList2;
                    i5 = i44;
                    s = sArr[c];
                    s2 = 13649;
                    if (C0927.f81875) {
                        iM55682 = (C0873.m55680("۫᩶") + i11) * 65;
                        i6 = ((iM55682 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                    } else {
                        iM55682 = C0873.m55680("ܳ᩹") ^ i11;
                        i6 = ((iM55682 ^ i10) * (-20973)) ^ 1184290841;
                        i7 = 222108106;
                    }
                    i13 = iM55682 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList119 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList119;
                    break;
                default:
                    itM56292 = C1046.m56292(abstractActivityC14026.f39553);
                    iM55681 = (i11 - C0946.m55979("ۧۤ")) * (-81);
                    i3 = ((iM55681 ^ i10) * 9391) ^ (-405813789);
                    i4 = 515928501;
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (p067l.C0947.f81895 == false) goto L13;
     */
    /* JADX INFO: renamed from: ᩻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m31851(AbstractActivityC14026 abstractActivityC14026) {
        int i;
        C21103 c21103;
        short[] sArr;
        int i2;
        C21103 c21104;
        int iM55680;
        int i3;
        C21103 c21105;
        int i4;
        int i5;
        int i6;
        int iM55979;
        int i7;
        int i8;
        int iM559710;
        int i9;
        short[] sArr2;
        int iM559711;
        int i10;
        int i11;
        abstractActivityC14026 = abstractActivityC14026;
        int i12 = C1025.f81947;
        int i13 = C1053.f81965;
        int iM559712 = (C0946.m55979("ۢ᩷") ^ i12) * C0254q.f1218h;
        int i14 = ((iM559712 ^ i13) * (-12345)) ^ (-699571265);
        C21103 c21106 = null;
        C21103 c21107 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i15 = iM559712 ^ 339766664;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1149534794;
        int i23 = 0;
        C21103 c21108 = null;
        C21103 c21109 = null;
        String strM55970 = null;
        int i24 = 0;
        C21103 c211010 = null;
        String strM55667 = null;
        int i25 = 0;
        String strM56373 = null;
        String strM55810 = null;
        String strM56016 = null;
        C21103 c211011 = null;
        int i26 = 0;
        while (true) {
            i22 = i15 ^ (i14 & (((i22 ^ i13) * 16041) >> 31));
            switch (i22) {
                case -1986867163:
                case -199641362:
                    c21106.m47729(i17, C0873.m55680(strM56016) ^ 2122839841);
                    break;
                case -1971612880:
                case 520846330:
                    i26 = i26;
                    i18 = 2;
                    if (i24 != 2) {
                        iM559710 = C0873.m55680("ۚܳ") ^ i12;
                        i7 = ((iM559710 ^ i13) * (-32513)) ^ (-1535510339);
                        i9 = -1618223384;
                    } else {
                        iM559710 = C0873.m55680("ܶۨ") ^ i12;
                        i7 = ((iM559710 ^ i13) * (-25073)) ^ (-1196212943);
                        i9 = 1221424636;
                    }
                    i11 = iM559710 ^ i9;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -1886223423:
                case 543189501:
                    c211011 = abstractActivityC14026.f39554;
                    i26 = i26;
                    strM55970 = AbstractC0942.m55970(f82167, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i16);
                    if (C0882.m55710() == 0) {
                        iM559710 = (i13 - C0946.m55979("۠᩶")) * 127;
                        i7 = ((iM559710 ^ i12) * (-9557)) ^ (-1183613221);
                        i9 = -613856701;
                        i11 = iM559710 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    }
                    sArr2 = sArr5;
                    i6 = i23;
                    iM55979 = (i12 - C0873.m55680("ۜ֫")) * (-81);
                    sArr5 = sArr2;
                    i7 = ((iM55979 ^ i13) * (-25829)) ^ (-32697272);
                    i8 = 1917158584;
                    i11 = iM55979 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -1870476084:
                case -1189205052:
                    c21104 = c21108;
                    i16 = 38544;
                    iM55680 = C0946.m55979("ۡۢ") ^ i12;
                    i14 = ((iM55680 ^ i13) * (-22791)) ^ 254014328;
                    i3 = 830780538;
                    i4 = iM55680 ^ i3;
                    i20 = i20;
                    i23 = i23;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c21108 = c21104;
                    i24 = i5;
                    break;
                case -1862911076:
                case -753585222:
                    C0947.m55997();
                    C0949.m56012();
                    i26 = i26;
                    i20 = i20;
                    C21103 c211012 = c21108;
                    i24 = i24;
                    c21104 = c211012;
                    int iM55681 = C0873.m55680("ۖ᩻") ^ i12;
                    i14 = ((iM55681 ^ i13) * (-6519)) ^ (-206793318);
                    i4 = iM55681 ^ (-635707163);
                    i20 = i20;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c21108 = c21104;
                    i24 = i5;
                    break;
                case -1787058637:
                case -1590259585:
                    c21107.m47729(i25, C0873.m55680(strM55667) ^ 2128778644);
                    break;
                case -1736277199:
                case 114752464:
                    c21104 = c21108;
                    i16 = 21203;
                    iM55680 = C0946.m55979("ۡۢ") ^ i12;
                    i14 = ((iM55680 ^ i13) * (-22791)) ^ 254014328;
                    i3 = 830780538;
                    i4 = iM55680 ^ i3;
                    i20 = i20;
                    i23 = i23;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c21108 = c21104;
                    i24 = i5;
                    break;
                case -1601233200:
                case 303760026:
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    C21103 c211013 = c21108;
                    i24 = i24;
                    c21104 = c211013;
                    if ((s * s2) - ((s * s) + 96727225) <= 0) {
                        iM55680 = (C0873.m55680("ۤۙ") + i13) * 77;
                        i14 = ((iM55680 ^ i12) * (-11139)) ^ 1697432460;
                        i3 = 115645437;
                    } else {
                        iM55680 = (C0873.m55680("ܳܳ") ^ i12) * 91;
                        i14 = ((iM55680 ^ i13) * (-27147)) ^ 3861826;
                        i3 = 1955171374;
                    }
                    i4 = iM55680 ^ i3;
                    i20 = i20;
                    i23 = i23;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c21108 = c21104;
                    i24 = i5;
                    break;
                case -1303350237:
                case 642975131:
                    break;
                case -1300205441:
                case 1916927184:
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    C21103 c211014 = c21108;
                    i24 = i24;
                    c21104 = c211014;
                    sArr3 = f82167;
                    c = 'e';
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0873.m55680("ۜۢ") ^ i12) * 45;
                        i14 = ((iM55680 ^ i13) * 10471) ^ (-1380718415);
                        i3 = -1582398640;
                        i4 = iM55680 ^ i3;
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    } else {
                        i23 = i23;
                        int iM55682 = C0873.m55680("ۖ᩻") ^ i12;
                        i14 = ((iM55682 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM55682 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    }
                    break;
                case -1135979933:
                case 1976213995:
                    i26 = i26;
                    if (abstractActivityC14026.f39554.m47727()) {
                        iM559710 = C0946.m55979("ۧۚ") ^ i13;
                        i7 = ((iM559710 ^ i12) * 2947) ^ 1209581969;
                        i9 = 1946302530;
                    } else {
                        iM559710 = C0873.m55680("۠ۖ") ^ i13;
                        i7 = ((iM559710 ^ i12) * 19841) ^ 1381999208;
                        i9 = 1821963779;
                    }
                    i11 = iM559710 ^ i9;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -1034732740:
                case -301936122:
                    break;
                case -989615690:
                case 1321079562:
                    i26 = i26;
                    c21104 = c21108;
                    i20 = i20;
                    i23 = i23;
                    int iM47731 = abstractActivityC14026.f39554.m47731();
                    if (iM47731 != 0) {
                        int iM559713 = C0946.m55979("۬ۧ") ^ i13;
                        int i27 = ((iM559713 ^ i12) * (-17383)) ^ (-1650451962);
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = iM559713 ^ 2005025841;
                        c21108 = c21104;
                        i24 = iM47731;
                        i14 = i27;
                        abstractActivityC14026 = abstractActivityC14026;
                    } else {
                        iM55680 = (C0873.m55680("۬ܿ") ^ i13) * (-3);
                        i24 = iM47731;
                        i14 = ((iM55680 ^ i12) * (-4925)) ^ (-2044329827);
                        i3 = 2116397890;
                        i4 = iM55680 ^ i3;
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    }
                    break;
                case -793206687:
                case 467230949:
                    c211010.m47729(i18, C0946.m55979(strM55810) ^ 2125427181);
                    break;
                case -752620449:
                case 1511073695:
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    C21103 c211015 = c21108;
                    i24 = i24;
                    c21104 = c211015;
                    s = sArr3[c];
                    s2 = 19670;
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = (C0946.m55979("ۙ۬") ^ i13) * (-75);
                        i14 = ((iM55680 ^ i12) * 31331) ^ 877199844;
                        i3 = 139070663;
                        i4 = iM55680 ^ i3;
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    } else {
                        c21105 = c21104;
                        int iM55683 = (C0873.m55680("֨ܿ") + i12) * (-83);
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = iM55683 ^ (-1039252500);
                        i5 = i24;
                        c21108 = c21105;
                        i14 = ((iM55683 ^ i13) * (-12713)) ^ (-1992614590);
                        i24 = i5;
                    }
                    break;
                case -647786868:
                case 1388850109:
                    if (C0946.f81894 == 0) {
                        i26 = i26;
                        sArr2 = sArr5;
                        i6 = i23;
                        iM55979 = (i12 - C0873.m55680("ۜ֫")) * (-81);
                        sArr5 = sArr2;
                        i7 = ((iM55979 ^ i13) * (-25829)) ^ (-32697272);
                        i8 = 1917158584;
                        i11 = iM55979 ^ i8;
                        i23 = i6;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    } else {
                        i26 = i26;
                        i20 = i20;
                        C21103 c211016 = c21108;
                        i24 = i24;
                        c21104 = c211016;
                        int iM55684 = C0873.m55680("ۖ᩻") ^ i12;
                        i14 = ((iM55684 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM55684 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    }
                    break;
                case -628437204:
                case 1132698278:
                    i = i26;
                    c21103 = c21108;
                    sArr = sArr4;
                    i2 = i23;
                    i20 = IShizukuService.Stub.TRANSACTION_attachUserService;
                    i21 = 3;
                    if (C0912.m55833()) {
                        int iM559714 = (C0946.m55979("֡ۗ") ^ i13) * 109;
                        sArr4 = sArr;
                        i14 = ((iM559714 ^ i12) * (-7695)) ^ 1146714273;
                        i23 = i2;
                        i26 = i;
                        i15 = iM559714 ^ (-1992451430);
                    } else {
                        sArr4 = sArr;
                        int iM559715 = (C0946.m55979("ܽܳ") + i13) * 31;
                        i23 = i2;
                        i26 = i;
                        i15 = iM559715 ^ 1501811986;
                        i14 = ((iM559715 ^ i12) * (-17699)) ^ (-1849135287);
                        i24 = i24;
                    }
                    c21108 = c21103;
                    break;
                case -458712821:
                case 1569911182:
                    i26 = i26;
                    c21107 = abstractActivityC14026.f39554;
                    strM55667 = RunnableC0871.m55667(f82167, 114, 3, i16);
                    if (C0992.m56107() > 0) {
                        iM559710 = C0946.m55979("ܺᩳ") ^ i12;
                        i7 = ((iM559710 ^ i13) * (-9027)) ^ (-1487449472);
                        i9 = 1437707243;
                        i11 = iM559710 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    }
                    sArr2 = sArr5;
                    i6 = i23;
                    iM55979 = (i12 - C0873.m55680("ۜ֫")) * (-81);
                    sArr5 = sArr2;
                    i7 = ((iM55979 ^ i13) * (-25829)) ^ (-32697272);
                    i8 = 1917158584;
                    i11 = iM55979 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -418603490:
                case 1976479448:
                    C1053.m56327();
                    if (C0890.f81849 != 0) {
                        i = i26;
                        c21103 = c21108;
                        sArr = sArr4;
                        i2 = i23;
                        int iM559716 = (C0946.m55979("֡ۗ") ^ i13) * 109;
                        sArr4 = sArr;
                        i14 = ((iM559716 ^ i12) * (-7695)) ^ 1146714273;
                        i23 = i2;
                        i26 = i;
                        i15 = iM559716 ^ (-1992451430);
                        c21108 = c21103;
                    } else {
                        iM559711 = (C0946.m55979("ۤ۫") + i13) * 59;
                        i7 = ((iM559711 ^ i12) * (-11683)) ^ (-2065535511);
                        i10 = 1136157928;
                        i15 = iM559711 ^ i10;
                        i14 = i7;
                    }
                    break;
                case 300360273:
                case 1975666220:
                    c21109.m47729(i18, C0873.m55680(strM56373) ^ 2102409270);
                    break;
                case 321820010:
                case 1079954873:
                    i26 = i26;
                    c21109 = abstractActivityC14026.f39554;
                    strM56373 = C1124.m56373(f82167, UMErrorCode.E_UM_BE_CREATE_FAILED, 3, i16);
                    if (C1003.f81929 > 0) {
                        iM559710 = C0946.m55979("֫᩺") ^ i13;
                        i7 = ((iM559710 ^ i12) * 21409) ^ 839366487;
                        i9 = 1100916011;
                        i11 = iM559710 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    }
                    sArr2 = sArr5;
                    i6 = i23;
                    iM55979 = (i12 - C0873.m55680("ۜ֫")) * (-81);
                    sArr5 = sArr2;
                    i7 = ((iM55979 ^ i13) * (-25829)) ^ (-32697272);
                    i8 = 1917158584;
                    i11 = iM55979 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case 373327110:
                case 1489241309:
                    i26 = i26;
                    c211010 = abstractActivityC14026.f39554;
                    strM55810 = C0906.m55810(f82167, 108, 3, i16);
                    if (RunnableC1014.f81941 > 0) {
                        iM559710 = C0946.m55979("ۧ۟") ^ i12;
                        i7 = ((iM559710 ^ i13) * 4119) ^ (-846021089);
                        i9 = -279020080;
                        i11 = iM559710 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    } else {
                        i20 = i20;
                        C21103 c211017 = c21108;
                        i24 = i24;
                        c21104 = c211017;
                        int iM55685 = C0873.m55680("ۖ᩻") ^ i12;
                        i14 = ((iM55685 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM55685 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    }
                    break;
                case 451618977:
                case 673068372:
                    i26 = 4;
                    if (i24 != 4) {
                        iM559711 = (C0946.m55979("ۜۛ") + i13) * 127;
                        i7 = ((iM559711 ^ i12) * 3965) ^ 1069582812;
                        i10 = -596227262;
                    } else {
                        iM559711 = C0946.m55979("᩹ۘ") ^ i12;
                        i7 = ((iM559711 ^ i13) * 255) ^ (-1207432070);
                        i10 = 2065070419;
                    }
                    i15 = iM559711 ^ i10;
                    i14 = i7;
                    break;
                case 483166797:
                case 1980313334:
                    i24 = i24;
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    c21105 = abstractActivityC14026.f39554;
                    i19 = 0;
                    sArr4 = f82167;
                    if (C0937.f81884) {
                        int iM55686 = C0873.m55680("ᩴ᩺") ^ i12;
                        i14 = ((iM55686 ^ i13) * 3071) ^ (-317385);
                        i23 = i23;
                        i26 = i26;
                        i15 = iM55686 ^ (-1224272435);
                        i24 = i24;
                        c21108 = c21105;
                        i20 = i20;
                    } else {
                        int iM55687 = (C0873.m55680("֨ܿ") + i12) * (-83);
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = iM55687 ^ (-1039252500);
                        i5 = i24;
                        c21108 = c21105;
                        i14 = ((iM55687 ^ i13) * (-12713)) ^ (-1992614590);
                        i24 = i5;
                    }
                    break;
                case 573097261:
                case 1486177399:
                    c211011.m47729(i26, C0946.m55979(strM55970) ^ 2129106364);
                    break;
                case 733614423:
                case 782028653:
                    C1003.m56123();
                    break;
                case 795042153:
                case 1193647857:
                    i26 = i26;
                    c21106 = abstractActivityC14026.f39554;
                    sArr5 = f82167;
                    i23 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    if (C1124.f82007 < 0) {
                        iM559710 = C0946.m55979("֡ۤ") ^ i13;
                        i7 = ((iM559710 ^ i12) * (-24809)) ^ 711557393;
                        i9 = 1075446071;
                        i11 = iM559710 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    } else {
                        i20 = i20;
                        C21103 c211018 = c21108;
                        i24 = i24;
                        c21104 = c211018;
                        int iM55688 = C0873.m55680("ۖ᩻") ^ i12;
                        i14 = ((iM55688 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM55688 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c21108 = c21104;
                        i24 = i5;
                    }
                    break;
                case 1138667618:
                case 1163881962:
                    i26 = i26;
                    i6 = i23;
                    i17 = 1;
                    if (i24 != 1) {
                        iM55979 = C0873.m55680("ܽ᩺") ^ i13;
                        i7 = ((iM55979 ^ i12) * 30943) ^ 975235618;
                        i8 = 727164943;
                    } else {
                        iM55979 = (i12 - C0946.m55979("᩸ۧ")) * (-61);
                        i7 = ((iM55979 ^ i13) * (-4731)) ^ (-142481790);
                        i8 = -1828154733;
                    }
                    i11 = iM55979 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case 1340019845:
                case 1795998876:
                    i26 = i26;
                    i25 = 3;
                    if (i24 != 3) {
                        iM559710 = C0873.m55680("᩶ۧ") ^ i13;
                        i7 = ((iM559710 ^ i12) * (-9305)) ^ 1143283161;
                        i9 = 474031949;
                    } else {
                        iM559710 = (i12 - C0946.m55979("᩷ᩴ")) * 77;
                        i7 = ((iM559710 ^ i13) * (-10485)) ^ (-1116630995);
                        i9 = -700159394;
                    }
                    i11 = iM559710 ^ i9;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case 1796644743:
                case 1950784892:
                    i26 = i26;
                    sArr2 = sArr5;
                    i6 = i23;
                    strM56016 = C0949.m56016(sArr2, i6, 3, i16);
                    if (C0906.f81862 >= 0) {
                        iM55979 = (i12 - C0873.m55680("ۜ֫")) * (-81);
                        sArr5 = sArr2;
                        i7 = ((iM55979 ^ i13) * (-25829)) ^ (-32697272);
                        i8 = 1917158584;
                    } else {
                        sArr5 = sArr2;
                        iM55979 = C0873.m55680("ۗ᩻") ^ i12;
                        i7 = ((iM55979 ^ i13) * (-7691)) ^ 1984986110;
                        i8 = 10393991;
                    }
                    i11 = iM55979 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                default:
                    c21108.m47729(i19, C0946.m55979(RunnableC0938.m55936(sArr4, i20, i21, i16)) ^ 2097719778);
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f39548.m17164();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0142 A[PHI: r16
      0x0142: PHI (r16v20 int) = (r16v19 int), (r16v21 int) binds: [B:44:0x012a, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x022b A[PHI: r4 r5 r12 r16
      0x022b: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:66:0x0229, B:62:0x020a, B:102:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:66:0x0229, B:62:0x020a, B:102:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:66:0x0229, B:62:0x020a, B:102:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r16v25 int) = (r16v7 int), (r16v8 int), (r16v26 int) binds: [B:66:0x0229, B:62:0x020a, B:102:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x025c A[PHI: r3 r8 r10 r11 r16
      0x025c: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:70:0x025a, B:56:0x01c2, B:10:0x004b, B:103:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:70:0x025a, B:56:0x01c2, B:10:0x004b, B:103:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r10v2 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v3 short[]) binds: [B:70:0x025a, B:56:0x01c2, B:10:0x004b, B:103:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:70:0x025a, B:56:0x01c2, B:10:0x004b, B:103:0x025c] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r16v23 int) = (r16v6 int), (r16v9 int), (r16v15 int), (r16v24 int) binds: [B:70:0x025a, B:56:0x01c2, B:10:0x004b, B:103:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (p067l.C0917.f81868 != false) goto L14;
     */
    /* JADX INFO: renamed from: ᩳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m31844(AbstractActivityC14026 abstractActivityC14026) {
        int i;
        int iM55680;
        int i2;
        int iM55681;
        int i3;
        int i4;
        AbstractActivityC14026 abstractActivityC14027 = abstractActivityC14026;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 2069923277;
        int i13 = RunnableC0871.f81839;
        int i14 = C0949.f81897;
        int iM55979 = C0946.m55979("۫ᩴ") ^ i13;
        int i15 = ((iM55979 ^ i14) * (-13111)) ^ (-1844754487);
        int i16 = iM55979 ^ 1353995253;
        String strM55783 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * (-4461)) >> 31));
            switch (i12) {
                case -2083920898:
                case 524461568:
                    i = i9;
                    i8 = 9604;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0873.m55680("᩹᩹") ^ i13;
                        i15 = ((iM55680 ^ i14) * (-2739)) ^ 1485764292;
                        i2 = 1740150594;
                    } else {
                        iM55680 = C0946.m55979("ۛ᩵") ^ i13;
                        i15 = ((iM55680 ^ i14) * 20273) ^ (-550678416);
                        i2 = -427500857;
                    }
                    int i17 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i17;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case -1999553831:
                case -467881499:
                    i = i9;
                    i5 = s + 98;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (i13 - C0946.m55979("۫ܰ")) * 123;
                        i15 = ((iM55680 ^ i14) * 26593) ^ (-509248707);
                        i2 = 18011086;
                    } else {
                        iM55680 = (C0873.m55680("ۗ۠") + i14) * 23;
                        i15 = ((iM55680 ^ i13) * 10933) ^ (-528303459);
                        i2 = -141970975;
                    }
                    int i18 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i18;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case -1952038850:
                case 1034223332:
                    strM55783 = RunnableC0897.m55783(sArr2, i10, i11, i9);
                    if (C0861.f81831) {
                        i = i9;
                        iM55681 = C0946.m55979("ۧᩳ") ^ i14;
                        i3 = ((iM55681 ^ i13) * 21789) ^ 1892372768;
                        i4 = -886068051;
                    } else {
                        iM55681 = (C0946.m55979("֫֨") ^ i14) * (-91);
                        i = i9;
                        i3 = ((iM55681 ^ i13) * (-24443)) ^ 1084551069;
                        i4 = -1268022764;
                    }
                    int i19 = i;
                    i16 = iM55681 ^ i4;
                    i15 = i3;
                    i9 = i19;
                    break;
                case -1832880074:
                case 309973223:
                    C0927.m55865(C0946.m55979(strM55783) ^ 2116156096);
                    break;
                case -1762994141:
                case 305567127:
                    i = i9;
                    c = 'N';
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("᩹᩹") ^ i13;
                        i15 = ((iM55680 ^ i14) * (-2739)) ^ 1485764292;
                        i2 = 1740150594;
                    } else {
                        iM55680 = (C0873.m55680("֨᩵") + i14) * 65;
                        i15 = ((iM55680 ^ i13) * 10835) ^ (-298472275);
                        i2 = 658624460;
                    }
                    int i110 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i110;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case -1571224532:
                case 32218258:
                    C0861.m55626();
                    if (C0854.f81826 == 0) {
                        iM55681 = (C0946.m55979("֫֨") ^ i14) * (-91);
                        i = i9;
                        i3 = ((iM55681 ^ i13) * (-24443)) ^ 1084551069;
                        i4 = -1268022764;
                        int i111 = i;
                        i16 = iM55681 ^ i4;
                        i15 = i3;
                        i9 = i111;
                    } else {
                        i = i9;
                        iM55680 = C0873.m55680("᩵ۙ") ^ i13;
                        i15 = ((iM55680 ^ i14) * 10075) ^ (-1254870940);
                        i2 = -1405040850;
                        int i112 = iM55680 ^ i2;
                        i9 = i;
                        i16 = i112;
                        abstractActivityC14027 = abstractActivityC14026;
                    }
                    break;
                case -1476597955:
                case 312878524:
                    i = i9;
                    if (abstractActivityC14026.mo21648()) {
                        iM55681 = (C0873.m55680("᩵֡") ^ i13) * 123;
                        i3 = ((iM55681 ^ i14) * (-15181)) ^ 1894701803;
                        i4 = 575306641;
                    } else {
                        iM55681 = (C0873.m55680("ۨ᩷") + i13) * (-7);
                        i3 = ((iM55681 ^ i14) * (-31213)) ^ 1478336355;
                        i4 = -2058820848;
                    }
                    int i113 = i;
                    i16 = iM55681 ^ i4;
                    i15 = i3;
                    i9 = i113;
                    break;
                case -1454519339:
                case -88372992:
                    if (C0992.m56107() > 0) {
                        i = i9;
                        iM55680 = C0873.m55680("᩶ܿ") ^ i14;
                        i15 = ((iM55680 ^ i13) * (-1221)) ^ 594542782;
                        i2 = -658625731;
                        int i114 = iM55680 ^ i2;
                        i9 = i;
                        i16 = i114;
                        abstractActivityC14027 = abstractActivityC14026;
                    }
                    i = i9;
                    iM55680 = C0873.m55680("᩹᩹") ^ i13;
                    i15 = ((iM55680 ^ i14) * (-2739)) ^ 1485764292;
                    i2 = 1740150594;
                    int i115 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i115;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case -1286307785:
                case -867329784:
                    i9 = 51567;
                    int iM55682 = C0873.m55680("ܰۙ") ^ i14;
                    i16 = iM55682 ^ 2125106866;
                    i15 = ((iM55682 ^ i13) * (-28611)) ^ (-1024194783);
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case -917545805:
                case -758596326:
                    i = i9;
                    sArr = f82167;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("᩵ۙ") ^ i13;
                        i15 = ((iM55680 ^ i14) * 10075) ^ (-1254870940);
                        i2 = -1405040850;
                    } else {
                        iM55680 = C0873.m55680("ۡᩴ") ^ i13;
                        i15 = ((iM55680 ^ i14) * 23141) ^ 163007318;
                        i2 = 252823615;
                    }
                    int i116 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i116;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case -657643008:
                case 1944375838:
                    i = i9;
                    if (abstractActivityC14027.m31836(false)) {
                        iM55681 = (C0873.m55680("ۨ᩷") + i13) * (-7);
                        i3 = ((iM55681 ^ i14) * (-31213)) ^ 1478336355;
                        i4 = -2058820848;
                    } else {
                        iM55681 = C0873.m55680("ۨܶ") ^ i14;
                        i3 = ((iM55681 ^ i13) * 20519) ^ (-299829791);
                        i4 = -357803689;
                    }
                    int i117 = i;
                    i16 = iM55681 ^ i4;
                    i15 = i3;
                    i9 = i117;
                    break;
                case -413507002:
                case 171053907:
                    RunnableC1014.m56177();
                    break;
                case -53924465:
                case 872024127:
                    i = i9;
                    sArr2 = f82167;
                    i10 = 79;
                    if (C1028.f81950 > 0) {
                        iM55681 = (i13 - C0946.m55979("ۚܺ")) * (-105);
                        i3 = ((iM55681 ^ i14) * 12343) ^ (-2083337024);
                        i4 = -2119740507;
                        int i118 = i;
                        i16 = iM55681 ^ i4;
                        i15 = i3;
                        i9 = i118;
                    } else {
                        iM55680 = C0873.m55680("᩹᩹") ^ i13;
                        i15 = ((iM55680 ^ i14) * (-2739)) ^ 1485764292;
                        i2 = 1740150594;
                        int i119 = iM55680 ^ i2;
                        i9 = i;
                        i16 = i119;
                        abstractActivityC14027 = abstractActivityC14026;
                    }
                    break;
                case -29349939:
                case 1359096540:
                    C0898.m55800();
                    i = i9;
                    iM55680 = C0873.m55680("᩵ۙ") ^ i13;
                    i15 = ((iM55680 ^ i14) * 10075) ^ (-1254870940);
                    i2 = -1405040850;
                    int i1110 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i1110;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case 56897413:
                case 1331531102:
                    i = i9;
                    boolean z = true;
                    if (C1194.f82045 == 0) {
                        abstractActivityC14027.mo21645(new RunnableC20062(abstractActivityC14027, z));
                    }
                    iM55680 = C0873.m55680("᩵ۙ") ^ i13;
                    i15 = ((iM55680 ^ i14) * 10075) ^ (-1254870940);
                    i2 = -1405040850;
                    int i1111 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i1111;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case 141368703:
                case 1936886214:
                    i = i9;
                    s = sArr[c];
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i13 - C0946.m55979("۫ܰ")) * 123;
                        i15 = ((iM55680 ^ i14) * 26593) ^ (-509248707);
                        i2 = 18011086;
                    } else {
                        iM55680 = C0873.m55680("۬֡") ^ i13;
                        i15 = ((iM55680 ^ i14) * (-10151)) ^ 874591072;
                        i2 = 287971651;
                    }
                    int i1112 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i1112;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case 193820414:
                case 901251973:
                    C1124.m56367();
                    break;
                case 366505023:
                case 373658653:
                    i9 = 19255;
                    int iM55683 = C0873.m55680("ܰۙ") ^ i14;
                    i16 = iM55683 ^ 2125106866;
                    i15 = ((iM55683 ^ i13) * (-28611)) ^ (-1024194783);
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                case 479489909:
                case 1448699516:
                    i = i9;
                    i11 = 3;
                    if (C0906.f81862 < 0) {
                        iM55681 = (C0873.m55680("ۙ᩷") ^ i14) * 41;
                        i3 = ((iM55681 ^ i13) * 12465) ^ 1192435997;
                        i4 = 1165199974;
                        int i1113 = i;
                        i16 = iM55681 ^ i4;
                        i15 = i3;
                        i9 = i1113;
                    } else {
                        iM55680 = (i13 - C0946.m55979("۫ܰ")) * 123;
                        i15 = ((iM55680 ^ i14) * 26593) ^ (-509248707);
                        i2 = 18011086;
                        int i1114 = iM55680 ^ i2;
                        i9 = i;
                        i16 = i1114;
                        abstractActivityC14027 = abstractActivityC14026;
                    }
                    break;
                case 1417886689:
                case 2139081618:
                    i = i9;
                    int i20 = i7 + i8;
                    if (i6 - (i20 + i20) > 0) {
                        iM55680 = (C0873.m55680("᩶ܶ") ^ i14) * (-29);
                        i15 = ((iM55680 ^ i13) * (-20875)) ^ (-897599490);
                        i2 = -1392006342;
                    } else {
                        iM55680 = (C0946.m55979("֫ۘ") + i13) * 109;
                        i15 = ((iM55680 ^ i14) * (-10637)) ^ 786592124;
                        i2 = -2059273293;
                    }
                    int i1115 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i1115;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
                default:
                    i = i9;
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0873.m55680("᩶ܿ") ^ i14;
                        i15 = ((iM55680 ^ i13) * (-1221)) ^ 594542782;
                        i2 = -658625731;
                    } else {
                        iM55680 = (C0946.m55979("᩷ܺ") ^ i14) * 69;
                        i15 = ((iM55680 ^ i13) * 24457) ^ (-2093080616);
                        i2 = 399742247;
                    }
                    int i1116 = iM55680 ^ i2;
                    i9 = i;
                    i16 = i1116;
                    abstractActivityC14027 = abstractActivityC14026;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public String mo31857() {
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x024e A[PHI: r5 r12 r16 r18
      0x024e: PHI (r5v3 short) = (r5v2 short), (r5v1 short) binds: [B:59:0x024c, B:35:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:59:0x024c, B:35:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r16v18 int) = (r16v10 int), (r16v19 int) binds: [B:59:0x024c, B:35:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r18v15 int) = (r18v7 int), (r18v16 int) binds: [B:59:0x024c, B:35:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02aa A[PHI: r3 r4 r7 r8 r16 r18
      0x02aa: PHI (r3v3 short[]) = (r3v1 short[]), (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:15:0x005f, B:68:0x02a8, B:64:0x0287, B:51:0x01eb, B:20:0x0093, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r4v3 char) = (r4v1 char), (r4v1 char), (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:15:0x005f, B:68:0x02a8, B:64:0x0287, B:51:0x01eb, B:20:0x0093, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:15:0x005f, B:68:0x02a8, B:64:0x0287, B:51:0x01eb, B:20:0x0093, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r8v2 short) = (r8v1 short), (r8v1 short), (r8v1 short), (r8v1 short), (r8v1 short), (r8v5 short) binds: [B:15:0x005f, B:68:0x02a8, B:64:0x0287, B:51:0x01eb, B:20:0x0093, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r16v31 int) = (r16v5 int), (r16v8 int), (r16v9 int), (r16v12 int), (r16v25 int), (r16v35 int) binds: [B:15:0x005f, B:68:0x02a8, B:64:0x0287, B:51:0x01eb, B:20:0x0093, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r18v24 int) = (r18v2 int), (r18v5 int), (r18v6 int), (r18v9 int), (r18v20 int), (r18v26 int) binds: [B:15:0x005f, B:68:0x02a8, B:64:0x0287, B:51:0x01eb, B:20:0x0093, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩺ */
    public String mo21654() {
        int iM55979;
        int i;
        int i2;
        int iM55680 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -193345948;
        int i10 = C0894.f81854;
        int i11 = ServiceConnectionC1013.f81940;
        int iM55681 = C0873.m55680("ܽܺ") ^ i11;
        int i12 = ((iM55681 ^ i10) * (-18197)) ^ 374024919;
        int i13 = iM55681 ^ (-11676758);
        String strM56252 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * 12395) >> 31));
            switch (i14) {
                case -2125556784:
                case 1757775400:
                    i14 = i14;
                    C0894.m55769();
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i11 - C0873.m55680("ۛܽ")) * (-73);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                    } else {
                        iM55680 = iM55680;
                        iM55979 = (C0946.m55979("۠ۨ") ^ i10) * 101;
                        i = ((iM55979 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -2102383350:
                case -1280722612:
                    iM55680 = iM55680;
                    i14 = i14;
                    int i15 = s + s2;
                    if ((i15 * i15) - i5 < 0) {
                        iM55979 = C0873.m55680("᩻֨") ^ i11;
                        i = ((iM55979 ^ i10) * (-15139)) ^ (-1964577599);
                        i2 = -812988481;
                    } else {
                        iM55979 = (C0873.m55680("ܶܶ") ^ i10) * 69;
                        i = ((iM55979 ^ i11) * 3379) ^ (-1887268212);
                        i2 = -580370208;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -1815181300:
                case -1721849470:
                    ViewOnClickListenerC0939.m55941();
                    C1194.m56396();
                    return null;
                case -1676603987:
                case 2083469965:
                    iM55680 = iM55680;
                    i14 = i14;
                    i8 = 3;
                    if (C0894.f81854 >= 0) {
                        iM55680 = iM55680;
                        iM55979 = (i11 - C0873.m55680("ۛܽ")) * (-73);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                    } else {
                        iM55979 = C0946.m55979("ܿܳ") ^ i10;
                        i = ((iM55979 ^ i11) * (-30839)) ^ 495843898;
                        i2 = 1801146046;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -1640613754:
                case -50520979:
                    i6 = 54418;
                    iM55979 = C0873.m55680("᩹᩸") ^ i11;
                    i = ((iM55979 ^ i10) * (-18835)) ^ (-224278306);
                    i2 = -1258686988;
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -1635199673:
                case 595462210:
                    i6 = 38568;
                    iM55979 = C0873.m55680("᩹᩸") ^ i11;
                    i = ((iM55979 ^ i10) * (-18835)) ^ (-224278306);
                    i2 = -1258686988;
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -1604336165:
                case 269301090:
                    iM55680 = iM55680;
                    i14 = i14;
                    i5 = i4 + 1;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("۠ۨ") ^ i10) * 101;
                        i = ((iM55979 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM55979 = C0873.m55680("ᩴ۫") ^ i10;
                        i = ((iM55979 ^ i11) * (-26665)) ^ 2008938539;
                        i2 = -349897733;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -1448975630:
                case -1266240781:
                    C1229.m56410();
                    if (C0992.f81922 < 0) {
                        iM55680 = iM55680;
                        i14 = i14;
                        iM55979 = (C0946.m55979("۠ۨ") ^ i10) * 101;
                        i = ((iM55979 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                        i9 = i14;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        iM55680 = iM55680;
                    } else {
                        int iM55682 = C0873.m55680("᩸ۘ") ^ i11;
                        i13 = iM55682 ^ (-2077145032);
                        i12 = ((iM55682 ^ i10) * 1745) ^ 423487025;
                        i9 = i14;
                    }
                    break;
                case -1307578976:
                case 953938044:
                    return C0845.m55590(this, iM55680 ^ i3);
                case -1029069046:
                case 1240308015:
                    iM55680 = iM55680;
                    i14 = i14;
                    c = 340;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("۠ۨ") ^ i10) * 101;
                        i = ((iM55979 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM55979 = C0946.m55979("᩺ܰ") ^ i10;
                        i = ((iM55979 ^ i11) * (-1031)) ^ 2056876298;
                        i2 = -1769607013;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -476093550:
                case 396990476:
                    C0989.m56095();
                    if (C1017.f81942 < 0) {
                        iM55680 = iM55680;
                        i14 = i14;
                        iM55979 = C0946.m55979("ۛۛ") ^ i11;
                        i = ((iM55979 ^ i10) * (-1569)) ^ 211967846;
                        i2 = 1483840739;
                        i9 = i14;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        iM55680 = iM55680;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ۛܽ")) * (-73);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                        i9 = i14;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        iM55680 = iM55680;
                    }
                    break;
                case -433869821:
                case 1761444236:
                    i14 = i14;
                    strM56252 = C1036.m56252(sArr2, i7, i8, i6);
                    if (C0894.f81854 >= 0) {
                        iM55680 = iM55680;
                        iM55979 = (i10 - C0873.m55680("ۢۡ")) * (-127);
                        i = ((iM55979 ^ i11) * 24355) ^ (-1120252208);
                        i2 = -968160218;
                    } else {
                        iM55979 = (C0946.m55979("᩹᩻") ^ i11) * 97;
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * 2291) ^ 88315818;
                        i2 = -472725927;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case -150098052:
                case 1477449959:
                    iM55680 = iM55680;
                    i14 = i14;
                    i4 = s * 2;
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i10 - C0873.m55680("ۢۡ")) * (-127);
                        i = ((iM55979 ^ i11) * 24355) ^ (-1120252208);
                        i2 = -968160218;
                    } else {
                        iM55979 = (i10 - C0873.m55680("۬۟")) * (-39);
                        i = ((iM55979 ^ i11) * (-13169)) ^ 2050868691;
                        i2 = 1658182884;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case 331006279:
                case 1246535100:
                    iM55680 = iM55680;
                    i14 = i14;
                    sArr = f82167;
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("۠ۨ") ^ i10) * 101;
                        i = ((iM55979 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM55979 = C0946.m55979("᩷ܳ") ^ i11;
                        i = ((iM55979 ^ i10) * (-10093)) ^ (-1891095686);
                        i2 = -1525065789;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case 469683716:
                case 1083248505:
                    iM55680 = iM55680;
                    i14 = i14;
                    s = sArr[c];
                    if (C1053.m56327() >= 0) {
                        iM55680 = iM55680;
                        iM55979 = (i11 - C0873.m55680("ۛܽ")) * (-73);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                    } else {
                        iM55979 = C0946.m55979("۬֨") ^ i11;
                        i = ((iM55979 ^ i10) * (-23253)) ^ (-783878996);
                        i2 = -1259916885;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case 728260427:
                case 1656072224:
                    i14 = i14;
                    iM55680 = C0873.m55680(strM56252);
                    if (C0967.f81910 >= 0) {
                        i3 = 2128242756;
                        iM55979 = (i11 - C0873.m55680("ۛܽ")) * (-73);
                        iM55680 = iM55680;
                        i = ((iM55979 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                        i9 = i14;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        iM55680 = iM55680;
                    } else {
                        int iM55683 = C0873.m55680("۟ᩴ") ^ i10;
                        i9 = i14;
                        i13 = iM55683 ^ (-1247602080);
                        i12 = ((iM55683 ^ i11) * 249) ^ 1860275664;
                        i3 = 2128242756;
                    }
                    break;
                case 855720474:
                case 1514616088:
                    C0955.m56025();
                    iM55979 = (i11 - C0873.m55680("ۛܽ")) * (-73);
                    iM55680 = iM55680;
                    i = ((iM55979 ^ i10) * (-10027)) ^ 1818179753;
                    i2 = -187235104;
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                case 1477267355:
                case 1931026123:
                    iM55680 = iM55680;
                    i14 = i14;
                    sArr2 = f82167;
                    i7 = 341;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0946.m55979("ۛۛ") ^ i11;
                        i = ((iM55979 ^ i10) * (-1569)) ^ 211967846;
                        i2 = 1483840739;
                    } else {
                        iM55979 = C0946.m55979("᩺᩷") ^ i10;
                        i = ((iM55979 ^ i11) * (-27783)) ^ (-837143772);
                        i2 = 292177913;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
                default:
                    iM55680 = iM55680;
                    i14 = i14;
                    s2 = 1;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("۠ۨ") ^ i10) * 101;
                        i = ((iM55979 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM55979 = (C0946.m55979("ۤܳ") + i11) * (-87);
                        i = ((iM55979 ^ i10) * 30959) ^ 1606316132;
                        i2 = -992397861;
                    }
                    i9 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    iM55680 = iM55680;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:50:0x013e A[PHI: r1
      0x013e: PHI (r1v6 int[]) = (r1v4 int[]), (r1v2 int[]), (r1v2 int[]), (r1v2 int[]), (r1v2 int[]) binds: [B:49:0x013c, B:45:0x011a, B:19:0x0075, B:13:0x0052, B:96:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0189  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c8 A[PHI: r9
      0x01c8: PHI (r9v5 java.util.ArrayList) = (r9v4 java.util.ArrayList), (r9v6 java.util.ArrayList) binds: [B:10:0x004a, B:60:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final void m31853(ArrayList arrayList) {
        int iM55979;
        int i;
        int[] iArr = null;
        int i2 = -1189755882;
        int i3 = C1044.f81959;
        int i4 = C1071.f81975;
        int iM559710 = C0946.m55979("֡ۛ") ^ i4;
        int i5 = ((iM559710 ^ i3) * 11047) ^ (-166729707);
        int i6 = iM559710 ^ 1405876364;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            C17024 c17024 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-5079)) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -2133383842:
                    case -170228477:
                        C1044.m56286();
                        break;
                    case -1877374065:
                    case 289671315:
                        this.f39553 = arrayList2;
                        this.f39544 = arrayList2;
                        if (mo21651()) {
                            iM55979 = (i3 - C0946.m55979("ۜܽ")) * (-43);
                            i5 = ((iM55979 ^ i4) * 10027) ^ (-164062864);
                            i = -416769988;
                        } else {
                            iM55979 = C0873.m55680("ۜۛ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 30503) ^ (-135206951);
                            i = 906134916;
                        }
                        i6 = iM55979 ^ i;
                        break;
                    case -1523350970:
                    case 1200828670:
                        m31859();
                        m31854();
                        break;
                    case -1510554859:
                    case -1208127796:
                        this.f39547 = iArr;
                        if (C0927.f81875) {
                            iM55979 = (C0873.m55680("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM55979 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                        } else {
                            iM55979 = (i4 - C0873.m55680("ۖ֨")) * 13;
                            i5 = ((iM55979 ^ i3) * 28449) ^ (-1042643722);
                            i = -1326681176;
                        }
                        i6 = iM55979 ^ i;
                        break;
                    case -1131399997:
                    case -975889835:
                        if (this.f39546 == null) {
                            iM55979 = C0873.m55680("۟ۨ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-31725)) ^ (-1597061903);
                            i = -1972468708;
                        } else {
                            iM55979 = C0946.m55979("ܽۚ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-19623)) ^ 1412115156;
                            i = 1905062987;
                        }
                        i6 = iM55979 ^ i;
                        break;
                    case -1033271206:
                    case 1950113975:
                        this.f39546 = arrayList3;
                        if (!RunnableC0897.f81856) {
                        }
                        c17024 = new C17024(1);
                        if (C0937.m55918() < 0) {
                            iM55979 = (C0946.m55979("᩵᩸") ^ i3) * 37;
                            i5 = ((iM55979 ^ i4) * 12303) ^ (-1775685621);
                            i = -862280876;
                            i6 = iM55979 ^ i;
                        }
                        break;
                        break;
                        break;
                    case -954799450:
                    case 233639808:
                        C1025.m56230();
                        if (C1964.f83032 > 0) {
                            iM55979 = (C0873.m55680("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM55979 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                        } else {
                            iM55979 = C0873.m55680("᩸ܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-7957)) ^ 1554248649;
                            i = 1795540801;
                        }
                        i6 = iM55979 ^ i;
                        break;
                    case -930775501:
                    case 368781889:
                        if (!C0861.f81831) {
                        }
                        iM55979 = (C0946.m55979("ᩳۨ") + i3) * 11;
                        i5 = ((iM55979 ^ i4) * 27625) ^ (-849593784);
                        i = -618135357;
                        i6 = iM55979 ^ i;
                        break;
                        break;
                    case -762881217:
                    case 37047853:
                        ArrayList arrayList4 = this.f39544;
                        if (C1028.f81950 > 0) {
                            arrayList3 = new ArrayList(arrayList4);
                            if (C1048.f81963) {
                                iM55979 = C0946.m55979("ۘᩳ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 3761) ^ (-1667646082);
                                i = 1384599788;
                                i6 = iM55979 ^ i;
                                break;
                            }
                        }
                        int iM55680 = (i4 - C0873.m55680("ܿᩴ")) * 109;
                        i5 = ((iM55680 ^ i3) * (-16843)) ^ (-1111172178);
                        i6 = iM55680 ^ 1255081781;
                        arrayList2 = null;
                        arrayList3 = null;
                        break;
                    case -692977167:
                    case 2019520403:
                        Collections.sort(arrayList3, C10162.comparing(c17024));
                        iM55979 = C0946.m55979("ܽۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-19623)) ^ 1412115156;
                        i = 1905062987;
                        i6 = iM55979 ^ i;
                        break;
                    case -607859443:
                    case 1970311958:
                        if (!C0947.m55997()) {
                            iM55979 = (C0946.m55979("ۙ᩶") + i4) * 13;
                            i5 = ((iM55979 ^ i3) * 2425) ^ 2095908747;
                            i = -496155368;
                            i6 = iM55979 ^ i;
                        }
                        break;
                    case -497080202:
                    case 476078304:
                        C0947.m55997();
                        if (C1036.f81953 < 0) {
                            iM55979 = C0873.m55680("᩸ܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-7957)) ^ 1554248649;
                            i = 1795540801;
                        } else {
                            iM55979 = (C0873.m55680("ܶᩴ") ^ i3) * (-103);
                            i5 = ((iM55979 ^ i4) * 7973) ^ 368286760;
                            i = 786994998;
                        }
                        i6 = iM55979 ^ i;
                        break;
                    case 119884716:
                    case 1254559907:
                        if (!C0866.m55645()) {
                            int iM55681 = (i4 - C0873.m55680("ܿᩴ")) * 109;
                            i5 = ((iM55681 ^ i3) * (-16843)) ^ (-1111172178);
                            i6 = iM55681 ^ 1255081781;
                            arrayList2 = null;
                            arrayList3 = null;
                        } else {
                            arrayList2 = new ArrayList(arrayList);
                            if (C1003.m56123() != 0) {
                                iM55979 = (C0873.m55680("ܶᩴ") ^ i3) * (-103);
                                i5 = ((iM55979 ^ i4) * 7973) ^ 368286760;
                                i = 786994998;
                            } else {
                                iM55979 = (C0873.m55680("᩵ۨ") ^ i3) * (-83);
                                i5 = ((iM55979 ^ i4) * (-11137)) ^ 1644291981;
                                i = -634509124;
                            }
                            i6 = iM55979 ^ i;
                        }
                        break;
                    case 280592443:
                    case 718773075:
                        iArr = new int[C1012.m56137(arrayList)];
                        if (C1003.f81929 <= 0) {
                            iM55979 = (C0873.m55680("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM55979 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                        } else {
                            iM55979 = C0873.m55680("֫᩵") ^ i3;
                            i5 = ((iM55979 ^ i4) * 26507) ^ 129129983;
                            i = 766318823;
                        }
                        i6 = iM55979 ^ i;
                        break;
                    case 498661202:
                    case 1304240708:
                        C1028.m56247();
                        if (C1024.m56209() < 0) {
                            int iM55682 = (i4 - C0873.m55680("ܿᩴ")) * 109;
                            i5 = ((iM55682 ^ i3) * (-16843)) ^ (-1111172178);
                            i6 = iM55682 ^ 1255081781;
                            arrayList2 = null;
                            arrayList3 = null;
                        } else {
                            iM55979 = (C0873.m55680("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM55979 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                            i6 = iM55979 ^ i;
                        }
                        break;
                    case 928901370:
                    case 1171693463:
                        C0992.m56107();
                        C0866.m55645();
                        iM55979 = (C0873.m55680("᩸ܿ") ^ i3) * 55;
                        i5 = ((iM55979 ^ i4) * 25637) ^ (-1811100304);
                        i = -1087665750;
                        i6 = iM55979 ^ i;
                        break;
                    case 1463274934:
                    case 1556493503:
                        this.f39553 = this.f39546;
                        iM55979 = C0873.m55680("ۜۛ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30503) ^ (-135206951);
                        i = 906134916;
                        i6 = iM55979 ^ i;
                        break;
                    default:
                        if (this.f39542) {
                            iM55979 = (C0946.m55979("ܶܿ") ^ i4) * (-41);
                            i5 = ((iM55979 ^ i3) * 13183) ^ (-1516779585);
                            i = 1888760396;
                        } else {
                            iM55979 = C0873.m55680("ۜۛ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 30503) ^ (-135206951);
                            i = 906134916;
                        }
                        i6 = iM55979 ^ i;
                        break;
                }
                return;
            }
            int iM55683 = (i3 - C0873.m55680("ۜ᩺")) * 109;
            i5 = ((iM55683 ^ i4) * (-28663)) ^ 1795604244;
            i6 = iM55683 ^ (-331357884);
        }
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final void m31859() {
        this.f39555.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m31842(boolean z) {
        C7350 c7350 = null;
        boolean z2 = false;
        int i = 0;
        Iterator itM56090 = null;
        int i2 = -75859335;
        int i3 = C0992.f81922;
        int i4 = C0898.f81858;
        int iM55680 = C0873.m55680("ۧᩴ") ^ i4;
        int i5 = ((iM55680 ^ i3) * (-29043)) ^ 1409446133;
        int i6 = -300709710;
        while (true) {
            int i7 = iM55680 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-29803)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2140366186:
                    case 960120957:
                        if (C1012.m56134() > 0) {
                            iM55680 = (C0946.m55979("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM55680 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        } else {
                            iM55680 = C0946.m55979("۫᩹") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                        }
                        break;
                    case -2135878778:
                    case 1101290770:
                        if (C1017.f81942 < 0) {
                            iM55680 = (C0873.m55680("ۜۚ") ^ i3) * (-95);
                            i5 = ((iM55680 ^ i4) * 31391) ^ (-829811951);
                            i6 = 175676010;
                        } else {
                            iM55680 = (C0946.m55979("ܳ۠") + i4) * 127;
                            i5 = ((iM55680 ^ i3) * 31713) ^ (-705814969);
                            i6 = 252380924;
                        }
                        break;
                    case -2020284238:
                    case 1170563118:
                        break;
                    case -1930483251:
                    case -1345613302:
                        i = -1;
                        if (!C0892.f81851) {
                            iM55680 = (C0946.m55979("ܳ۠") + i4) * 127;
                            i5 = ((iM55680 ^ i3) * 31713) ^ (-705814969);
                            i6 = 252380924;
                            break;
                        }
                        iM55680 = C0946.m55979("ۚ᩹") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-25047)) ^ (-1262284839);
                        i6 = 2004146767;
                        break;
                    case -1833904775:
                    case 1555157132:
                        this.f39555.notifyDataSetChanged();
                        if (C0946.f81894 == 0) {
                            iM55680 = C0873.m55680("ۢ۠") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-31465)) ^ (-2066364595);
                            i6 = -1487975940;
                        } else {
                            iM55680 = (C0946.m55979("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM55680 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        }
                        break;
                    case -1777633536:
                    case -760832170:
                        if (RunnableC0871.f81839 < 0) {
                            iM55680 = (C0946.m55979("ۤ᩺") ^ i4) * 15;
                            i5 = ((iM55680 ^ i3) * (-26605)) ^ 1500532690;
                            i6 = 387102194;
                        } else {
                            iM55680 = C0946.m55979("۫᩹") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                        }
                        break;
                    case -1609745941:
                    case 922417751:
                        if (C0845.m55584() > 0) {
                            iM55680 = (C0873.m55680("ۜܰ") ^ i3) * (-91);
                            i5 = ((iM55680 ^ i4) * 29635) ^ (-1524366561);
                            i6 = -1096972983;
                        } else {
                            iM55680 = (C0946.m55979("ܿ᩵") + i3) * (-65);
                            i5 = ((iM55680 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                        }
                        break;
                    case -1462293890:
                    case 2146448216:
                        this.f39551 = i;
                        this.f39545 = z2 ? 1 : 0;
                        iM55680 = C0873.m55680("֨ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3515)) ^ 2074091716;
                        i6 = 1296159142;
                    case -1266284659:
                    case 1687034626:
                        C1025.m56230();
                        break;
                    case -1130271154:
                    case 1836816764:
                        ((C10674) C0955.m56035(itM56090)).m24565(z2);
                        iM55680 = C0946.m55979("ܿۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-19585)) ^ (-2003103280);
                        i6 = -772058476;
                        break;
                    case -992841850:
                    case 2099744316:
                        if (!C1048.f81963) {
                            iM55680 = C0946.m55979("۫᩹") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                            break;
                        }
                        iM55680 = C0873.m55680("᩵᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * 19645) ^ (-362351376);
                        i6 = 2074718294;
                        break;
                    case -950716148:
                    case 1238255996:
                        itM56090 = C0989.m56090(this.f39553);
                        iM55680 = C0946.m55979("ܿۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-19585)) ^ (-2003103280);
                        i6 = -772058476;
                        break;
                        break;
                    case -932234992:
                    case -18933897:
                        if (this.f39556 != z) {
                            iM55680 = (i4 - C0946.m55979("ۜܶ")) * (-119);
                            i5 = ((iM55680 ^ i3) * (-22503)) ^ (-1753933248);
                            i6 = 1664948153;
                        } else {
                            iM55680 = C0873.m55680("֨ۨ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-3515)) ^ 2074091716;
                            i6 = 1296159142;
                        }
                        break;
                    case -645942746:
                    case 1023606344:
                        if (!C0930.m55886(itM56090)) {
                            iM55680 = C0946.m55979("۠᩻") ^ i3;
                            i5 = ((iM55680 ^ i4) * 985) ^ 1658169822;
                            i6 = 2131866386;
                        } else {
                            iM55680 = C0873.m55680("ܳ᩹") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-4127)) ^ 958813420;
                            i6 = -2133137110;
                        }
                        break;
                    case -614807772:
                    case 1621541135:
                        if (C1964.f83032 > 0) {
                            iM55680 = C0946.m55979("᩸ܰ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 5911) ^ 330478627;
                            i6 = 319749845;
                        } else {
                            iM55680 = (C0946.m55979("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM55680 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        }
                        break;
                    case -426279145:
                    case 837924147:
                        if (C0906.f81862 < 0) {
                            iM55680 = C0946.m55979("ۡ᩸") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-30977)) ^ (-699668789);
                            i6 = -866744327;
                        } else {
                            iM55680 = C0946.m55979("۫᩹") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                        }
                        break;
                    case -347042727:
                    case 1748730855:
                        this.f39556 = z;
                        c7350 = this.f39557;
                        if (C0967.f81910 < 0) {
                            iM55680 = C0946.m55979("᩵ܶ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-16205)) ^ (-1729820029);
                            i6 = 1556991381;
                        } else {
                            iM55680 = (C0946.m55979("ܿ᩵") + i3) * (-65);
                            i5 = ((iM55680 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                        }
                        break;
                    case -311661678:
                    case 1693593140:
                        this.f39554.m47732();
                        iM55680 = (C0873.m55680("ܰۤ") ^ i3) * 15;
                        i5 = ((iM55680 ^ i4) * 20805) ^ 494278351;
                        i6 = -119136651;
                        break;
                    case 109989186:
                    case 345196937:
                        if (!z) {
                            iM55680 = C0946.m55979("ۘ۟") ^ i4;
                            i5 = ((iM55680 ^ i3) * 28335) ^ (-1881721428);
                            i6 = 1452399609;
                        } else {
                            iM55680 = C0873.m55680("֨ۨ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-3515)) ^ 2074091716;
                            i6 = 1296159142;
                        }
                        break;
                    case 418625542:
                    case 462013093:
                        if (C0912.f81867 > 0) {
                            iM55680 = C0946.m55979("֨᩶") ^ i3;
                            i5 = ((iM55680 ^ i4) * 4033) ^ (-958233583);
                            i6 = 327046985;
                        } else {
                            iM55680 = (C0946.m55979("ܿ᩵") + i3) * (-65);
                            i5 = ((iM55680 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                        }
                        break;
                    case 1075148420:
                    case 1414197564:
                        c7350.mo4067(C0912.m55831(z));
                        if (!z) {
                            iM55680 = C0873.m55680("ۗ᩸") ^ i3;
                            i5 = ((iM55680 ^ i4) * 2947) ^ 1423324173;
                            i6 = -1991030459;
                        } else {
                            iM55680 = C0946.m55979("ۡܳ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 14847) ^ (-1274174248);
                            i6 = -1411119366;
                        }
                        break;
                    case 1178948472:
                    case 2100790806:
                        this.f39554.m47723();
                        iM55680 = (C0873.m55680("ܰۤ") ^ i3) * 15;
                        i5 = ((iM55680 ^ i4) * 20805) ^ 494278351;
                        i6 = -119136651;
                        break;
                        break;
                    case 1221065311:
                    case 1793565465:
                        C0890.m55740();
                        C1404.m56468();
                        iM55680 = C0946.m55979("۫᩹") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-26819)) ^ (-387879311);
                        i6 = 1812655140;
                        break;
                    case 1741783164:
                    case 2060897234:
                        C0894.m55769();
                        if (C1044.f81959 < 0) {
                            iM55680 = (C0946.m55979("ܿ᩵") + i3) * (-65);
                            i5 = ((iM55680 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                            break;
                        }
                        iM55680 = C0946.m55979("۫᩹") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-26819)) ^ (-387879311);
                        i6 = 1812655140;
                        break;
                    case 1758999536:
                    case 1860149972:
                        if (C0873.f81841 > 0) {
                            iM55680 = (C0873.m55680("ܽۜ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM55680 ^ i4) * 777) ^ 886810043;
                            i6 = -1525176147;
                        } else {
                            iM55680 = (C0946.m55979("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM55680 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        }
                        break;
                    default:
                        if (this.f39545 <= 0) {
                            z2 = false;
                            iM55680 = C0946.m55979("۠᩻") ^ i3;
                            i5 = ((iM55680 ^ i4) * 985) ^ 1658169822;
                            i6 = 2131866386;
                        }
                        int iM55979 = C0946.m55979("ۡۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-22363)) ^ 1380575029;
                        i7 = iM55979 ^ (-1536222059);
                        z2 = false;
                        break;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷֫ */
    public void m31850() {
        String str;
        String str2;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int iM55680;
        int i7;
        DialogInterfaceOnClickListenerC23805 dialogInterfaceOnClickListenerC23805;
        String str3;
        int i8;
        int iM55681;
        int i9;
        int i10;
        AbstractActivityC14026 abstractActivityC14026 = this;
        C20671 c20671 = null;
        int i11 = 0;
        boolean z = false;
        DialogInterfaceC2564 dialogInterfaceC2564M55669 = null;
        String strMo31857 = null;
        ViewGroup viewGroup = null;
        int iIndexOfChild = 0;
        int i12 = 0;
        int iM559711 = 0;
        String strM55667 = null;
        int iM55682 = 0;
        String strM56102 = null;
        short s = 0;
        short s2 = 0;
        int i13 = 586814579;
        int i14 = C0877.f81843;
        int i15 = C0866.f81837;
        int iM55683 = (i15 - C0873.m55680("ܳۤ")) * (-79);
        int i16 = ((iM55683 ^ i14) * (-15319)) ^ (-1276222585);
        int i17 = iM55683 ^ (-840863315);
        Iterator itM56292 = null;
        short[] sArr = null;
        DialogInterfaceOnClickListenerC23805 dialogInterfaceOnClickListenerC23806 = null;
        int i18 = 0;
        DialogInterfaceOnClickListenerC21541 dialogInterfaceOnClickListenerC21541 = null;
        int i19 = 0;
        ArrayList arrayList = null;
        int i20 = 0;
        int iM55684 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-20055)) >> 31));
            switch (i13) {
                case -2131036088:
                case -79159200:
                    str = strMo31857;
                    C0967.m56080(c20671, iM55682 ^ 2102298975, null);
                    iM559710 = (C0946.m55979("ۙ۠") + i15) * 97;
                    i5 = ((iM559710 ^ i14) * 21731) ^ (-440084496);
                    i6 = 2025733575;
                    str2 = str;
                    i17 = iM559710 ^ i6;
                    i16 = i5;
                    strMo31857 = str2;
                    break;
                case -2063228968:
                case -200762067:
                    str = strMo31857;
                    dialogInterfaceC2564M55669 = RunnableC0871.m55669(c20671);
                    if (z) {
                        iM559710 = (C0873.m55680("᩸ۤ") + i14) * 75;
                        i5 = ((iM559710 ^ i15) * 15197) ^ 30323274;
                        i6 = -304872549;
                    } else {
                        iM559710 = (C0946.m55979("ۨۤ") + i15) * (-107);
                        i5 = ((iM559710 ^ i14) * 11459) ^ (-906081222);
                        i6 = 162962141;
                    }
                    str2 = str;
                    i17 = iM559710 ^ i6;
                    i16 = i5;
                    strMo31857 = str2;
                    break;
                case -2023689448:
                case -1905362504:
                    if (C0989.f81920 < 0) {
                        str = strMo31857;
                        i19 = i19;
                        i2 = i20;
                        iM55979 = C0946.m55979("ۖܿ") ^ i15;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        i3 = ((iM55979 ^ i14) * 11477) ^ (-456181855);
                        i4 = 298979272;
                        int i21 = iM55979 ^ i4;
                        i20 = i2;
                        str2 = str;
                        i17 = i21;
                        i16 = i3;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        i19 = i19;
                        strMo31857 = str2;
                    } else {
                        iM55681 = (C0873.m55680("ۧۧ") ^ i15) * 99;
                        i9 = ((iM55681 ^ i14) * (-18935)) ^ 1481597197;
                        i10 = 1314838682;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                    }
                    break;
                case -1882356577:
                case -809906583:
                    str = strMo31857;
                    C0906.m55817(c20671, 2099769225 ^ iM559711, dialogInterfaceOnClickListenerC23806);
                    if (ServiceConnectionC1013.m56157() > 0) {
                        dialogInterfaceOnClickListenerC21541 = new DialogInterfaceOnClickListenerC21541(i11, abstractActivityC14026);
                        strM55667 = RunnableC0871.m55667(f82167, 92, 3, i18);
                        if (C0930.f81879 > 0) {
                            iM559710 = C0873.m55680("۬ܿ") ^ i14;
                            i5 = ((iM559710 ^ i15) * (-23829)) ^ (-1099377334);
                            i6 = 944514734;
                            str2 = str;
                            i17 = iM559710 ^ i6;
                            i16 = i5;
                            strMo31857 = str2;
                            break;
                        }
                    }
                    strMo31857 = str;
                    int iM55685 = C0873.m55680("ܺܶ") ^ i14;
                    i17 = iM55685 ^ (-2147071595);
                    i16 = ((iM55685 ^ i15) * 15067) ^ 2010946710;
                    dialogInterfaceOnClickListenerC23806 = null;
                    dialogInterfaceOnClickListenerC21541 = null;
                    break;
                case -1748080348:
                case -1209308980:
                    C0955.m56027(this);
                    break;
                case -1576169080:
                case 2131086172:
                    RunnableC0897.m55775(this);
                    break;
                case -1564739218:
                case -1301793354:
                    break;
                case -1418352456:
                case 159302391:
                    str = strMo31857;
                    iM55682 = C0873.m55680(C0898.m55792(f82167, 95, 3, i18));
                    iM559710 = (i15 - C0873.m55680("ۛۧ")) * (-27);
                    i5 = ((iM559710 ^ i14) * (-22737)) ^ 238044346;
                    i6 = -1944767885;
                    str2 = str;
                    i17 = iM559710 ^ i6;
                    i16 = i5;
                    strMo31857 = str2;
                    break;
                case -1241259680:
                case -379869947:
                    str = strMo31857;
                    C0967.m56076(c20671, C0946.m55979(strM55667) ^ 2129461435, dialogInterfaceOnClickListenerC21541);
                    z = abstractActivityC14026 instanceof ActivityC20908;
                    if (z) {
                        iM559710 = C0946.m55979("᩺۬") ^ i14;
                        i5 = ((iM559710 ^ i15) * (-29853)) ^ 778224075;
                        i6 = -2026708136;
                    } else {
                        iM559710 = (C0946.m55979("ۙ۠") + i15) * 97;
                        i5 = ((iM559710 ^ i14) * 21731) ^ (-440084496);
                        i6 = 2025733575;
                    }
                    str2 = str;
                    i17 = iM559710 ^ i6;
                    i16 = i5;
                    strMo31857 = str2;
                    break;
                case -1208731047:
                case -304054129:
                    str = strMo31857;
                    i19 = i19;
                    i2 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    if (((C10674) C0955.m56035(itM56292)).m24568()) {
                        iM55979 = (C0873.m55680("ۡۙ") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55979 ^ i15) * 17521) ^ (-251820074);
                        i4 = 1597013255;
                    } else {
                        iM55979 = C0946.m55979("֡ܺ") ^ i15;
                        i3 = ((iM55979 ^ i14) * (-8895)) ^ 1759524138;
                        i4 = 1013138195;
                    }
                    int i22 = iM55979 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i22;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = str2;
                    break;
                case -1177681755:
                case 1991967599:
                    C1028.m56247();
                    C0937.m55918();
                    break;
                case -1168371613:
                case 308540622:
                    i18 = 62922;
                    iM55680 = C0873.m55680("᩶᩻") ^ i14;
                    i16 = ((iM55680 ^ i15) * 12443) ^ (-1808411966);
                    i7 = 1865212596;
                    i = iM55680 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = strMo31857;
                    i17 = i;
                    abstractActivityC14026 = this;
                    break;
                case -915177902:
                case 1607142584:
                    strMo31857 = mo31857();
                    Button buttonM56405 = C1229.m56405(dialogInterfaceC2564M55669);
                    viewGroup = (ViewGroup) buttonM56405.getParent();
                    iIndexOfChild = viewGroup.indexOfChild(buttonM56405);
                    if (!C0917.m55854()) {
                        int iM55686 = C0873.m55680("ܺܶ") ^ i14;
                        i17 = iM55686 ^ (-2147071595);
                        i16 = ((iM55686 ^ i15) * 15067) ^ 2010946710;
                        dialogInterfaceOnClickListenerC23806 = null;
                        dialogInterfaceOnClickListenerC21541 = null;
                    } else {
                        iM55681 = C0873.m55680("ܰ۬") ^ i15;
                        i9 = ((iM55681 ^ i14) * (-25099)) ^ 2115499950;
                        i10 = -1464521321;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                    }
                    break;
                case -823033118:
                case 1131016576:
                    if (!C0892.f81851) {
                        iM55681 = (C0873.m55680("ۧۧ") ^ i15) * 99;
                        i9 = ((iM55681 ^ i14) * (-18935)) ^ 1481597197;
                        i10 = 1314838682;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                    } else {
                        strMo31857 = strMo31857;
                        i19 = i19;
                        i20 = i20;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        iM55680 = (C0946.m55979("֡᩸") + i14) * 67;
                        i16 = ((iM55680 ^ i15) * 30421) ^ 1165481377;
                        i7 = 1213427027;
                        i = iM55680 ^ i7;
                        i20 = i20;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        i19 = i19;
                        strMo31857 = strMo31857;
                        i17 = i;
                        abstractActivityC14026 = this;
                    }
                    break;
                case -775916586:
                case 1951009476:
                    str = strMo31857;
                    C0937.m55908(c20671, iM55684 ^ i12);
                    i11 = 1;
                    if (C0946.f81894 == 0) {
                        dialogInterfaceOnClickListenerC23806 = new DialogInterfaceOnClickListenerC23805(i11, abstractActivityC14026);
                        iM559711 = C0946.m55979(C1404.m56462(f82167, 89, 3, i18));
                        if (C1053.f81965 > 0) {
                            iM559710 = C0873.m55680("֫ۗ") ^ i14;
                            i5 = ((iM559710 ^ i15) * (-24175)) ^ (-305531836);
                            i6 = 1106666232;
                            str2 = str;
                            i17 = iM559710 ^ i6;
                            i16 = i5;
                            strMo31857 = str2;
                            break;
                        }
                    }
                    strMo31857 = str;
                    int iM55687 = C0873.m55680("ܺܶ") ^ i14;
                    i17 = iM55687 ^ (-2147071595);
                    i16 = ((iM55687 ^ i15) * 15067) ^ 2010946710;
                    dialogInterfaceOnClickListenerC23806 = null;
                    dialogInterfaceOnClickListenerC21541 = null;
                    break;
                case -723703374:
                case 33261242:
                    dialogInterfaceOnClickListenerC23805 = dialogInterfaceOnClickListenerC23806;
                    str3 = strMo31857;
                    int i23 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(abstractActivityC14026);
                    sArr = f82167;
                    i8 = 83;
                    i20 = 3;
                    if (C0854.m55595() >= 0) {
                        int iM55688 = (i14 - C0873.m55680("ۖ֨")) * (-121);
                        DialogInterfaceOnClickListenerC23805 dialogInterfaceOnClickListenerC23807 = dialogInterfaceOnClickListenerC23805;
                        i19 = i8;
                        i16 = ((iM55688 ^ i15) * (-30993)) ^ 1105133170;
                        strMo31857 = str3;
                        i17 = iM55688 ^ 862783477;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23807;
                    } else {
                        int iM559712 = (C0946.m55979("۠ܰ") + i15) * (-49);
                        i16 = ((iM559712 ^ i14) * (-18535)) ^ (-332341909);
                        strMo31857 = str3;
                        i17 = iM559712 ^ (-1154652115);
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23805;
                        i19 = 83;
                    }
                    break;
                case -564768933:
                case -247515600:
                    str = strMo31857;
                    i19 = i19;
                    i2 = i20;
                    C0861.m55627(c20671, C0873.m55680(AbstractC0942.m55970(sArr, i19, i2, i18)) ^ 2125200366);
                    if (C1229.m56410() != 0) {
                        iM55979 = C0946.m55979("ۖܿ") ^ i15;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        i3 = ((iM55979 ^ i14) * 11477) ^ (-456181855);
                        i4 = 298979272;
                    } else {
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        iM55979 = (C0946.m55979("֡֨") + i14) * 69;
                        i3 = ((iM55979 ^ i15) * 8437) ^ (-943308735);
                        i4 = -2078398606;
                    }
                    int i24 = iM55979 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i24;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = str2;
                    break;
                case -543375578:
                case 822060580:
                    str = strMo31857;
                    iM55684 = C0873.m55680(C0845.m55592(f82167, 86, 3, i18));
                    i12 = 2119803576;
                    if (!C0861.m55626()) {
                        iM559710 = (C0946.m55979("۬ۙ") ^ i15) * 93;
                        i5 = ((iM559710 ^ i14) * (-2763)) ^ 149781173;
                        i6 = -567683808;
                        str2 = str;
                        i17 = iM559710 ^ i6;
                        i16 = i5;
                        strMo31857 = str2;
                    }
                    i19 = i19;
                    i2 = i20;
                    iM55979 = C0946.m55979("ۖܿ") ^ i15;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i3 = ((iM55979 ^ i14) * 11477) ^ (-456181855);
                    i4 = 298979272;
                    int i25 = iM55979 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i25;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = str2;
                    break;
                case -528261490:
                case 1522464202:
                    i18 = 28737;
                    iM55680 = C0873.m55680("᩶᩻") ^ i14;
                    i16 = ((iM55680 ^ i15) * 12443) ^ (-1808411966);
                    i7 = 1865212596;
                    i = iM55680 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = strMo31857;
                    i17 = i;
                    abstractActivityC14026 = this;
                    break;
                case -513755540:
                case 1810542135:
                    strMo31857 = strMo31857;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    ArrayList arrayList2 = abstractActivityC14026.f39553;
                    if (arrayList2 != null) {
                        int iM55689 = C0873.m55680("᩹᩹") ^ i14;
                        int i26 = ((iM55689 ^ i15) * (-23621)) ^ 832762067;
                        i = iM55689 ^ (-1510926815);
                        arrayList = arrayList2;
                        i16 = i26;
                        i20 = i20;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        i19 = i19;
                        strMo31857 = strMo31857;
                        i17 = i;
                        abstractActivityC14026 = this;
                    } else {
                        int iM556810 = C0873.m55680("᩹ۤ") ^ i15;
                        arrayList = arrayList2;
                        i20 = i20;
                        i16 = ((iM556810 ^ i14) * 14455) ^ 484192171;
                        abstractActivityC14026 = this;
                        str2 = strMo31857;
                        i17 = iM556810 ^ 1223558316;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                        i19 = i19;
                        strMo31857 = str2;
                    }
                    break;
                case -373422593:
                case 949436639:
                    strMo31857 = strMo31857;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    s = f82167[82];
                    s2 = 13594;
                    if (C0917.f81868) {
                        iM55680 = (C0946.m55979("֡᩸") + i14) * 67;
                        i16 = ((iM55680 ^ i15) * 30421) ^ 1165481377;
                        i7 = 1213427027;
                    } else {
                        iM55680 = (C0873.m55680("ۗۨ") ^ i14) * (-61);
                        i16 = ((iM55680 ^ i15) * 17) ^ (-1904267292);
                        i7 = -269325288;
                    }
                    i = iM55680 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = strMo31857;
                    i17 = i;
                    abstractActivityC14026 = this;
                    break;
                case -286925940:
                case 2006359592:
                    str = strMo31857;
                    strM56102 = C0992.m56102(f82167, 98, 3, i18);
                    if (!C1024.f81946) {
                        iM559710 = C0946.m55979("ܿۧ") ^ i14;
                        i5 = ((iM559710 ^ i15) * (-617)) ^ (-1589740207);
                        i6 = -683086051;
                        str2 = str;
                        i17 = iM559710 ^ i6;
                        i16 = i5;
                        strMo31857 = str2;
                    } else {
                        strMo31857 = str;
                        int iM556811 = C0873.m55680("ܺܶ") ^ i14;
                        i17 = iM556811 ^ (-2147071595);
                        i16 = ((iM556811 ^ i15) * 15067) ^ 2010946710;
                        dialogInterfaceOnClickListenerC23806 = null;
                        dialogInterfaceOnClickListenerC21541 = null;
                    }
                    break;
                case -116560932:
                case 282274319:
                    strMo31857 = strMo31857;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    if ((s * s2) - ((s * s) + 46199209) > 0) {
                        iM55680 = C0946.m55979("۬֨") ^ i15;
                        i16 = ((iM55680 ^ i14) * 509) ^ 1290106679;
                        i7 = 1702861404;
                    } else {
                        iM55680 = (i15 - C0873.m55680("ܰۤ")) * (-103);
                        i16 = ((iM55680 ^ i14) * (-31973)) ^ 211450666;
                        i7 = -643330375;
                    }
                    i = iM55680 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = strMo31857;
                    i17 = i;
                    abstractActivityC14026 = this;
                    break;
                case 81816915:
                case 1392831018:
                    C0863.m55643();
                    strMo31857 = strMo31857;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    iM55680 = (C0946.m55979("֡᩸") + i14) * 67;
                    i16 = ((iM55680 ^ i15) * 30421) ^ 1165481377;
                    i7 = 1213427027;
                    i = iM55680 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = strMo31857;
                    i17 = i;
                    abstractActivityC14026 = this;
                    break;
                case 239711412:
                case 1059664436:
                    AbstractC0942.m55971();
                    if (C1929.f83011 == 0) {
                        str3 = strMo31857;
                        i8 = i19;
                        dialogInterfaceOnClickListenerC23805 = dialogInterfaceOnClickListenerC23806;
                        int iM556812 = (i14 - C0873.m55680("ۖ֨")) * (-121);
                        DialogInterfaceOnClickListenerC23805 dialogInterfaceOnClickListenerC23808 = dialogInterfaceOnClickListenerC23805;
                        i19 = i8;
                        i16 = ((iM556812 ^ i15) * (-30993)) ^ 1105133170;
                        strMo31857 = str3;
                        i17 = iM556812 ^ 862783477;
                        dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23808;
                    } else {
                        iM55681 = (C0873.m55680("ۧۧ") ^ i15) * 99;
                        i9 = ((iM55681 ^ i14) * (-18935)) ^ 1481597197;
                        i10 = 1314838682;
                        i17 = iM55681 ^ i10;
                        i16 = i9;
                    }
                    break;
                case 733823772:
                case 1039559557:
                    str = strMo31857;
                    i19 = i19;
                    i2 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    itM56292 = C1046.m56292(arrayList);
                    iM55979 = C0946.m55979("֡ܺ") ^ i15;
                    i3 = ((iM55979 ^ i14) * (-8895)) ^ 1759524138;
                    i4 = 1013138195;
                    int i27 = iM55979 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i27;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = str2;
                    break;
                case 959388835:
                case 1493635720:
                    CheckBox checkBox = (CheckBox) C1017.m56181(abstractActivityC14026, C0873.m55680(strM56102) ^ 2118991330);
                    viewGroup.removeViewAt(iIndexOfChild);
                    viewGroup.addView(checkBox, iIndexOfChild);
                    C11896.m27211(abstractActivityC14026, checkBox, strMo31857);
                    str = strMo31857;
                    iM559710 = (C0946.m55979("ۨۤ") + i15) * (-107);
                    i5 = ((iM559710 ^ i14) * 11459) ^ (-906081222);
                    i6 = 162962141;
                    str2 = str;
                    i17 = iM559710 ^ i6;
                    i16 = i5;
                    strMo31857 = str2;
                    break;
                default:
                    str = strMo31857;
                    i19 = i19;
                    i2 = i20;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    if (C0866.m55647(itM56292)) {
                        iM55979 = (C0946.m55979("᩻᩸") + i15) * (-35);
                        i3 = ((iM55979 ^ i14) * 7699) ^ 1671956753;
                        i4 = -1873288337;
                    } else {
                        iM55979 = C0946.m55979("ۧۙ") ^ i14;
                        i3 = ((iM55979 ^ i15) * 26409) ^ 1705844344;
                        i4 = -246805101;
                    }
                    int i28 = iM55979 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i28;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC23806 = dialogInterfaceOnClickListenerC23806;
                    i19 = i19;
                    strMo31857 = str2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0128 A[PHI: r10 r11 r13 r14
      0x0128: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:34:0x0126, B:30:0x0102, B:15:0x0086, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:34:0x0126, B:30:0x0102, B:15:0x0086, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:34:0x0126, B:30:0x0102, B:15:0x0086, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:34:0x0126, B:30:0x0102, B:15:0x0086, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x029a A[PHI: r9 r16 r17 r18
      0x029a: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:46:0x01c5, B:12:0x007e, B:6:0x006d, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r16v5 int) = (r16v2 int), (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:46:0x01c5, B:12:0x007e, B:6:0x006d, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r17v5 int) = (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:46:0x01c5, B:12:0x007e, B:6:0x006d, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r18v5 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:46:0x01c5, B:12:0x007e, B:6:0x006d, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        AbstractActivityC14026 abstractActivityC14026 = this;
        int i4 = C1071.f81975;
        int i5 = C0967.f81910;
        int iM559710 = C0946.m55979("ܰۨ") ^ i4;
        int i6 = ((iM559710 ^ i5) * 4763) ^ 1335410694;
        String strM56102 = null;
        short[] sArr = null;
        int i7 = iM559710 ^ 1959663332;
        MenuInflater menuInflater = null;
        int iM559711 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 766016607;
        int i14 = 0;
        String strM55986 = null;
        short[] sArr2 = null;
        int i15 = 0;
        MenuItem menuItemM55911 = null;
        C7350 c7350 = null;
        C20733 c20733 = null;
        int iM55681 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * (-15683)) >> 31));
            switch (i13) {
                case -1690519696:
                case -310437595:
                    if (C1012.m56134() > 0) {
                        iM55680 = C0946.m55979("ۨۨ") ^ i4;
                        i = ((iM55680 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    } else {
                        iM55680 = C0873.m55680("ۧۛ") ^ i5;
                        i = ((iM55680 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1488758547:
                case 1160393417:
                    int i16 = i11 + i12;
                    if (i10 - (i16 + i16) > 0) {
                        iM55680 = (i4 - C0946.m55979("ۨᩳ")) * 47;
                        i = ((iM55680 ^ i5) * 1715) ^ (-659955074);
                        i2 = -1538288920;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۤ") ^ i4) * (-81);
                        i = ((iM55680 ^ i5) * (-7605)) ^ 1201705980;
                        i2 = -205382003;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1205982893:
                case 1642094896:
                    i8 = 19065;
                    iM55680 = (C0873.m55680("᩸ۗ") + i5) * (-93);
                    i = ((iM55680 ^ i4) * (-9555)) ^ 416547675;
                    i2 = -1544798309;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1099358559:
                case 1287463231:
                    i8 = 10376;
                    iM55680 = (C0873.m55680("᩸ۗ") + i5) * (-93);
                    i = ((iM55680 ^ i4) * (-9555)) ^ 416547675;
                    i2 = -1544798309;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1053045133:
                case 1059279827:
                    menuInflater.inflate(C0946.m55979(strM55986) ^ 2128500269, menu);
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("᩹᩺") ^ i5;
                        i = ((iM55680 ^ i4) * 18469) ^ (-934168926);
                        i2 = -1950569751;
                    } else {
                        iM55680 = C0873.m55680("ۧܿ") ^ i4;
                        i = ((iM55680 ^ i5) * 1323) ^ (-1921419665);
                        i2 = 265801890;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -929717558:
                case 1258332833:
                    return true;
                case -926389599:
                case 1137712565:
                    if (C0906.m55809() > 0) {
                        iM55680 = C0946.m55979("᩹᩺") ^ i5;
                        i = ((iM55680 ^ i4) * 18469) ^ (-934168926);
                        i2 = -1950569751;
                    } else {
                        iM55680 = C0946.m55979("ۨۨ") ^ i4;
                        i = ((iM55680 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -842192885:
                case -617874873:
                    iM559711 = C0946.m55979(C1229.m56403(sArr, i9, 3, i8));
                    i15 = 2119359754;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ۨۨ") ^ i4;
                        i = ((iM55680 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    } else {
                        iM55680 = (C0946.m55979("᩹ܳ") ^ i4) * (-13);
                        i = ((iM55680 ^ i5) * 13617) ^ 501647526;
                        i2 = 924111338;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -657883765:
                case -100304088:
                    ViewOnClickListenerC0939.m55941();
                    C0890.m55740();
                    iM55680 = C0946.m55979("᩹᩺") ^ i5;
                    i = ((iM55680 ^ i4) * 18469) ^ (-934168926);
                    i2 = -1950569751;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -656677973:
                case -223524631:
                    C0863.m55633(menuItemM55911, false);
                    iM55680 = C0946.m55979("۬ۢ") ^ i5;
                    i = ((iM55680 ^ i4) * 16601) ^ 830034681;
                    i2 = 1127331816;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -558287941:
                case 1457320246:
                    MenuItem menuItemM55912 = C0937.m55911(menu, iM55681);
                    C0992.m56109(menuItemM55912);
                    c20733 = new C20733(menuItemM55912);
                    c7350 = abstractActivityC14026.f39557;
                    if (!C0947.f81895) {
                        iM55680 = C0946.m55979("֫᩸") ^ i4;
                        i = ((iM55680 ^ i5) * (-25725)) ^ 1823499434;
                        i2 = 1658453494;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM55979 ^ i3;
                        abstractActivityC14026 = this;
                    }
                    break;
                case -535127966:
                case 227733180:
                    menuInflater = getMenuInflater();
                    strM55986 = C0946.m55986(f82167, 179, 3, i8);
                    if (C0894.f81854 < 0) {
                        iM55680 = C0946.m55979("۠᩶") ^ i5;
                        i = ((iM55680 ^ i4) * (-2223)) ^ 1497639426;
                        i2 = 1251994033;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM55979 ^ i3;
                        abstractActivityC14026 = this;
                    }
                    break;
                case -445312847:
                case 626723003:
                    C0890.m55740();
                    if (C0898.f81858 > 0) {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM55979 ^ i3;
                        abstractActivityC14026 = this;
                    } else {
                        iM55680 = C0873.m55680("ۧۛ") ^ i5;
                        i = ((iM55680 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    }
                    break;
                case -158371272:
                case 1065913412:
                    menuItemM55911 = C0937.m55911(menu, iM559711 ^ i15);
                    if (mo21651()) {
                        iM55680 = C0873.m55680("᩻ۨ") ^ i4;
                        i = ((iM55680 ^ i5) * (-7393)) ^ (-35895988);
                        i2 = 1552491433;
                    } else {
                        iM55680 = C0873.m55680("۟ۡ") ^ i5;
                        i = ((iM55680 ^ i4) * 29575) ^ (-1083707272);
                        i2 = 2030656351;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -104385756:
                case 1846637336:
                    short s2 = sArr2[c];
                    int i17 = s2 + 11286;
                    if (C0989.f81920 >= 0) {
                        s = s2;
                        i14 = i17;
                        iM55979 = C0946.m55979("ܶ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM55979 ^ i3;
                    } else {
                        int iM55682 = C0873.m55680("ۨۧ") ^ i5;
                        int i18 = ((iM55682 ^ i4) * (-19613)) ^ 2109091890;
                        i7 = iM55682 ^ 1003485743;
                        s = s2;
                        i14 = i17;
                        i6 = i18;
                    }
                    abstractActivityC14026 = this;
                    break;
                case 1781148:
                case 907625495:
                    C1012.m56134();
                    C1048.m56305();
                    return false;
                case 211598910:
                case 1383411100:
                    sArr2 = f82167;
                    c = 178;
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("֡۠") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-28145)) ^ 464461529;
                        i3 = 1219106951;
                    } else {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                    }
                    i7 = iM55979 ^ i3;
                    abstractActivityC14026 = this;
                    break;
                case 390345937:
                case 694997850:
                    strM56102 = C0992.m56102(f82167, 182, 3, i8);
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ۧۛ") ^ i5;
                        i = ((iM55680 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                    } else {
                        iM55680 = (C0873.m55680("᩷ۛ") ^ i5) * C0254q.f1218h;
                        i = ((iM55680 ^ i4) * (-29049)) ^ 101753555;
                        i2 = 375633325;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 660740989:
                case 1545290206:
                    iM55681 = 2125707506 ^ C0873.m55680(strM56102);
                    if (C0873.m55678()) {
                        iM55680 = (i4 - C0946.m55979("ۚ۟")) * 41;
                        i = ((iM55680 ^ i5) * 14059) ^ 1631373319;
                        i2 = 380143112;
                    } else {
                        iM55680 = C0873.m55680("ۙۧ") ^ i4;
                        i = ((iM55680 ^ i5) * (-16533)) ^ (-1049952205);
                        i2 = 1885861080;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 770340890:
                case 1147332891:
                    C0955.m56030(c7350, abstractActivityC14026, c20733);
                    sArr = f82167;
                    i9 = 185;
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("ۨۨ") ^ i4;
                        i = ((iM55680 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    } else {
                        iM55680 = C0873.m55680("ۡۧ") ^ i5;
                        i = ((iM55680 ^ i4) * (-30125)) ^ 1862695418;
                        i2 = 1351609909;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 1118563119:
                case 2050082468:
                    C1048.m56306(menuItemM55911, abstractActivityC14026.f39542);
                    iM55680 = C0946.m55979("۬ۢ") ^ i5;
                    i = ((iM55680 ^ i4) * 16601) ^ 830034681;
                    i2 = 1127331816;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                default:
                    i10 = i14 * i14;
                    i11 = s * s;
                    i12 = 127373796;
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("ۧۛ") ^ i5;
                        i = ((iM55680 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩺") ^ i5) * (-39);
                        i = ((iM55680 ^ i4) * 25555) ^ (-1971836896);
                        i2 = -52966555;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m31850();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x025a A[PHI: r6 r13 r17
      0x025a: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:61:0x0258, B:38:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:61:0x0258, B:38:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v18 int) = (r17v10 int), (r17v19 int) binds: [B:61:0x0258, B:38:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b4 A[PHI: r1 r3 r4 r5 r9 r17
      0x02b4: PHI (r1v3 java.lang.String) = 
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
      (r1v2 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
     binds: [B:69:0x02b2, B:65:0x0291, B:53:0x0210, B:34:0x013b, B:18:0x0076, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:69:0x02b2, B:65:0x0291, B:53:0x0210, B:34:0x013b, B:18:0x0076, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:69:0x02b2, B:65:0x0291, B:53:0x0210, B:34:0x013b, B:18:0x0076, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:69:0x02b2, B:65:0x0291, B:53:0x0210, B:34:0x013b, B:18:0x0076, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:69:0x02b2, B:65:0x0291, B:53:0x0210, B:34:0x013b, B:18:0x0076, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r17v29 int) = (r17v8 int), (r17v9 int), (r17v12 int), (r17v20 int), (r17v27 int), (r17v30 int) binds: [B:69:0x02b2, B:65:0x0291, B:53:0x0210, B:34:0x013b, B:18:0x0076, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0303 A[PHI: r2 r7 r8 r17
      0x0303: PHI (r2v5 short[]) = (r2v1 short[]), (r2v2 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:77:0x0301, B:73:0x02e5, B:57:0x0236, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r7v5 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:77:0x0301, B:73:0x02e5, B:57:0x0236, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r8v5 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:77:0x0301, B:73:0x02e5, B:57:0x0236, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r17v35 int) = (r17v6 int), (r17v7 int), (r17v11 int), (r17v36 int) binds: [B:77:0x0301, B:73:0x02e5, B:57:0x0236, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (p067l.ServiceConnectionC1013.f81940 >= 0) goto L13;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m31826(AbstractActivityC14026 abstractActivityC14026, boolean z) {
        int iM55979;
        int i;
        int i2;
        int i3;
        String strM55936 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1293260533;
        int i12 = C1044.f81959;
        int i13 = C1025.f81947;
        int iM55680 = (i13 - C0873.m55680("ᩴ۫")) * 11;
        int i14 = ((iM55680 ^ i12) * 9665) ^ 1870133755;
        int i15 = iM55680 ^ 701588022;
        Iterator itM56090 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i12) * 20659) >> 31));
            switch (i16) {
                case -1831416586:
                case 1080932343:
                    i8 = 7693;
                    iM55979 = (C0946.m55979("᩵ۖ") + i12) * 13;
                    i = ((iM55979 ^ i13) * (-20431)) ^ (-1473263381);
                    i2 = -806626335;
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1791433887:
                case 24831239:
                    i16 = i16;
                    int i17 = i6 + i7;
                    if ((i17 + i17) - i5 < 0) {
                        iM55979 = (C0946.m55979("۟ᩴ") ^ i13) * (-57);
                        i = ((iM55979 ^ i12) * 26297) ^ (-1347471844);
                        i2 = -1887599886;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ۖܽ")) * (-83);
                        i = ((iM55979 ^ i13) * 15761) ^ (-2081079439);
                        i2 = -1968311446;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1618923195:
                case 631482658:
                    itM56090 = C0989.m56090(abstractActivityC14026.f39544);
                    int iM559710 = (C0946.m55979("۠᩷") ^ i13) * (-93);
                    i14 = ((iM559710 ^ i12) * (-3861)) ^ 1597785701;
                    i3 = i16;
                    i15 = iM559710 ^ 14416337;
                    i11 = i3;
                    break;
                case -1543486916:
                case 740286747:
                    i16 = i16;
                    sArr = f82167;
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ܳ۫") ^ i13;
                        i = ((iM55979 ^ i12) * 26683) ^ (-1436668247);
                        i2 = 1218601480;
                    } else {
                        iM55979 = C0946.m55979("ۨܳ") ^ i13;
                        i = ((iM55979 ^ i12) * 5217) ^ (-1079642632);
                        i2 = -684306849;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1533762552:
                case -549536662:
                    C1194.m56396();
                    break;
                case -1470058844:
                case -1424240235:
                    i16 = i16;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ܳ۫") ^ i13;
                        i = ((iM55979 ^ i12) * 26683) ^ (-1436668247);
                        i2 = 1218601480;
                    } else {
                        iM55979 = (C0946.m55979("᩵۟") + i12) * 11;
                        i = ((iM55979 ^ i13) * (-8511)) ^ (-1580197444);
                        i2 = -267211603;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1312749977:
                case 589446372:
                    i16 = i16;
                    sArr2 = f82167;
                    i9 = 12;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("֨᩻") + i12) * 77;
                        i = ((iM55979 ^ i13) * 13605) ^ (-1177787480);
                        i2 = -593515003;
                    } else {
                        iM55979 = C0946.m55979("۟᩷") ^ i12;
                        i = ((iM55979 ^ i13) * 3141) ^ 1182598205;
                        i2 = 1413268542;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1138407939:
                case 716812043:
                    C0892.m55749();
                    if (C0967.f81910 < 0) {
                        i16 = i16;
                        iM55979 = (i12 - C0946.m55979("ۧۛ")) * (-113);
                        i = ((iM55979 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM55979 = C0873.m55680("֫ۘ") ^ i13;
                        i16 = i16;
                        i = ((iM55979 ^ i12) * 3841) ^ 1678604237;
                        i2 = 705387750;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1025792741:
                case 1323327988:
                    i16 = i16;
                    i7 = 148225;
                    if (C0955.f81898) {
                        iM55979 = (i12 - C0946.m55979("ۧۛ")) * (-113);
                        i = ((iM55979 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM55979 = (i13 - C0946.m55979("֡ۢ")) * 109;
                        i = ((iM55979 ^ i12) * (-425)) ^ (-1564844166);
                        i2 = -2001160963;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1025132440:
                case 493483906:
                    C0882.m55710();
                    C1012.m56134();
                    break;
                case -979619775:
                case -233121246:
                    i16 = i16;
                    i4 = s + s2;
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("ܶۢ") ^ i12;
                        i = ((iM55979 ^ i13) * 671) ^ 858138347;
                        i2 = -2107190639;
                    } else {
                        iM55979 = (i13 - C0946.m55979("᩵᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i12) * 18411) ^ 2015421906;
                        i2 = 702476233;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -814609701:
                case 765336897:
                    i16 = i16;
                    s = sArr[c];
                    s2 = 385;
                    if (C1003.m56123() != 0) {
                        iM55979 = (i12 - C0946.m55979("ۧۛ")) * (-113);
                        i = ((iM55979 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩷") + i13) * (-37);
                        i = ((iM55979 ^ i12) * (-29679)) ^ 467276387;
                        i2 = 1512354810;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -774032020:
                case 1372665635:
                    break;
                case -750440345:
                case 444776487:
                    if (C1071.m56343() != 0) {
                        i16 = i16;
                        iM55979 = (C0946.m55979("֨᩻") + i12) * 77;
                        i = ((iM55979 ^ i13) * 13605) ^ (-1177787480);
                        i2 = -593515003;
                        i3 = i16;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                        i11 = i3;
                    }
                    i16 = i16;
                    iM55979 = C0946.m55979("ܳ۫") ^ i13;
                    i = ((iM55979 ^ i12) * 26683) ^ (-1436668247);
                    i2 = 1218601480;
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -597658893:
                case -561239162:
                    i16 = i16;
                    C0890.m55740();
                    C0947.m55997();
                    iM55979 = (i12 - C0946.m55979("ۧۛ")) * (-113);
                    i = ((iM55979 ^ i13) * 19571) ^ 1643953673;
                    i2 = -850956610;
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -597214562:
                case 1615762786:
                    i16 = i16;
                    i10 = 3;
                    if (C1404.f82149 >= 0) {
                        iM55979 = (i13 - C0946.m55979("᩵᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i12) * 18411) ^ 2015421906;
                        i2 = 702476233;
                    } else {
                        iM55979 = (i13 - C0946.m55979("ܶ۠")) * 63;
                        i = ((iM55979 ^ i12) * (-9703)) ^ 924877815;
                        i2 = 1953677684;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -326901158:
                case 910054710:
                    ((C10674) C0955.m56035(itM56090)).m24567();
                    int iM559711 = (C0946.m55979("۠᩷") ^ i13) * (-93);
                    i14 = ((iM559711 ^ i12) * (-3861)) ^ 1597785701;
                    i3 = i16;
                    i15 = iM559711 ^ 14416337;
                    i11 = i3;
                    break;
                case 26915400:
                case 708830335:
                    i16 = i16;
                    if (C0866.m55647(itM56090)) {
                        iM55979 = C0873.m55680("ᩳۢ") ^ i13;
                        i = ((iM55979 ^ i12) * 3799) ^ (-1001016166);
                        i2 = -1027953132;
                    } else {
                        iM55979 = (C0946.m55979("֫᩻") + i12) * (-61);
                        i = ((iM55979 ^ i13) * (-13451)) ^ (-1936218186);
                        i2 = 1405200244;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 43721434:
                case 399450806:
                    i8 = 13958;
                    iM55979 = (C0946.m55979("᩵ۖ") + i12) * 13;
                    i = ((iM55979 ^ i13) * (-20431)) ^ (-1473263381);
                    i2 = -806626335;
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 70083736:
                case 1677251656:
                    i16 = i16;
                    C0917.m55842(C0873.m55680(strM55936) ^ 2124940966);
                    if (z) {
                        iM55979 = C0873.m55680("ۧۚ") ^ i12;
                        i = ((iM55979 ^ i13) * 27903) ^ (-106874767);
                        i2 = 625932686;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩵") + i13) * 87;
                        i = ((iM55979 ^ i12) * (-32713)) ^ (-1420158576);
                        i2 = -2047439652;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 171779365:
                case 2083090569:
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C1929.m56553()) {
                        iM55979 = C0946.m55979("ܳ۫") ^ i13;
                        i = ((iM55979 ^ i12) * 26683) ^ (-1436668247);
                        i2 = 1218601480;
                    } else {
                        iM55979 = (C0946.m55979("۬ۜ") ^ i13) * 85;
                        i = ((iM55979 ^ i12) * 10645) ^ (-1854729726);
                        i2 = 2117919189;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 477778879:
                case 598823673:
                    i16 = i16;
                    c = 11;
                    if (C0917.f81868) {
                        iM55979 = (i12 - C0946.m55979("ۧۛ")) * (-113);
                        i = ((iM55979 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩶") ^ i12;
                        i = ((iM55979 ^ i13) * (-18035)) ^ 1522941541;
                        i2 = -1513751529;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 741952483:
                case 1497547849:
                    i16 = i16;
                    strM55936 = RunnableC0938.m55936(sArr2, i9, i10, i8);
                    if (C1036.m56257() <= 0) {
                        iM55979 = (i12 - C0946.m55979("ۧۛ")) * (-113);
                        i = ((iM55979 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM55979 = (C0873.m55680("ۖܳ") ^ i12) * (-81);
                        i = ((iM55979 ^ i13) * (-27281)) ^ 1849874058;
                        i2 = -1190394909;
                    }
                    i3 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                default:
                    C0955.m56027(abstractActivityC14026);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final ArrayList m31856() {
        return this.f39544;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public void mo21652() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0138 A[PHI: r1 r2 r11 r12
      0x0138: PHI (r1v4 l.۫ۤۡ) = (r1v3 l.۫ۤۡ), (r1v2 l.۫ۤۡ), (r1v2 l.۫ۤۡ) binds: [B:39:0x0136, B:22:0x008c, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:39:0x0136, B:22:0x008c, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:39:0x0136, B:22:0x008c, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:39:0x0136, B:22:0x008c, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0231 A[PHI: r5 r7 r8 r9
      0x0231: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:54:0x01e4, B:50:0x01c3, B:17:0x006e, B:15:0x006a, B:12:0x0064, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:54:0x01e4, B:50:0x01c3, B:17:0x006e, B:15:0x006a, B:12:0x0064, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:54:0x01e4, B:50:0x01c3, B:17:0x006e, B:15:0x006a, B:12:0x0064, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:54:0x01e4, B:50:0x01c3, B:17:0x006e, B:15:0x006a, B:12:0x0064, B:9:0x005e, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0262 A[PHI: r3 r14 r15 r21
      0x0262: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:64:0x0260, B:26:0x00af, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:64:0x0260, B:26:0x00af, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:64:0x0260, B:26:0x00af, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:64:0x0260, B:26:0x00af, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0298 A[PHI: r13 r16
      0x0298: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:68:0x0296, B:35:0x0112, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:68:0x0296, B:35:0x0112, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ */
    public static void m31837(AbstractActivityC14026 abstractActivityC14026) {
        int iM55979;
        int i;
        int i2;
        int i3 = C1044.f81959;
        int i4 = C1017.f81942;
        int iM559710 = (C0946.m55979("۬ۘ") + i4) * (-13);
        int i5 = ((iM559710 ^ i3) * (-26315)) ^ 1043920256;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM559710 ^ (-1101765626);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1387941379;
        char c = 0;
        String strM56144 = null;
        InterfaceC14100 interfaceC14100 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * (-5807)) >> 31));
            switch (i16) {
                case -2049762664:
                case -1997095550:
                    C1024.m56202(C0946.m55979(strM56144) ^ 2124162362);
                    iM55979 = (C0873.m55680("᩸۬") + i4) * (-73);
                    i = ((iM55979 ^ i3) * 9185) ^ 874555473;
                    i2 = -985872871;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1835361721:
                case -1163037614:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM55979 = C0946.m55979("֡ܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-29101)) ^ 60743392;
                        i2 = 602122397;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1757394940:
                case -1505853124:
                    i11 = 61261929;
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM55979 = (C0873.m55680("֡ۧ") + i4) * (-117);
                        i = ((iM55979 ^ i3) * 2807) ^ (-2053639704);
                        i2 = 1682089136;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1566114176:
                case 1619126591:
                    sArr3 = f82167;
                    i15 = 68;
                    i7 = 3;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("᩹᩸") ^ i3) * (-11);
                        i = ((iM55979 ^ i4) * 3111) ^ (-1031727686);
                        i2 = -1633773279;
                    } else {
                        iM55979 = (C0873.m55680("ۚۤ") + i4) * 81;
                        i = ((iM55979 ^ i3) * (-32485)) ^ 1726515008;
                        i2 = -497455516;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1333209731:
                case -1127956905:
                    i14 = 43;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("֡ܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-29101)) ^ 60743392;
                        i2 = 602122397;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܳۨ")) * 101;
                        i = ((iM55979 ^ i4) * (-15017)) ^ 1018186930;
                        i2 = -1235656680;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1186326317:
                case 1678774640:
                    i8 = s + 7827;
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("ۧ۬") ^ i4) * (-25);
                        i = ((iM55979 ^ i3) * 7431) ^ 1867626629;
                        i2 = -391385233;
                    } else {
                        iM55979 = C0873.m55680("ۙܺ") ^ i4;
                        i = ((iM55979 ^ i3) * 6361) ^ 1723389020;
                        i2 = -1445133637;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1182061648:
                case -240499276:
                    strM56144 = C1012.m56144(sArr3, i15, i7, i12);
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0946.m55979("۠ۙ") + i3) * 61;
                        i = ((iM55979 ^ i4) * (-23751)) ^ (-782815562);
                        i2 = 1880692950;
                    } else {
                        iM55979 = (C0946.m55979("ۗܽ") + i3) * 79;
                        i = ((iM55979 ^ i4) * 25839) ^ 107978850;
                        i2 = -1666674240;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1162267575:
                case 523358086:
                    i12 = 61925;
                    iM55979 = C0946.m55979("᩷᩺") ^ i3;
                    i = ((iM55979 ^ i4) * (-15919)) ^ (-645714768);
                    i2 = -1982995277;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1138932400:
                case -193770293:
                    break;
                case -1000594995:
                case -228978327:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM55979 = (C0946.m55979("۠ۙ") + i3) * 61;
                        i = ((iM55979 ^ i4) * (-23751)) ^ (-782815562);
                        i2 = 1880692950;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -932131034:
                case -405060156:
                    sArr = f82167;
                    if (C1964.m56597() != 0) {
                        iM55979 = C0946.m55979("֡ܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-29101)) ^ 60743392;
                        i2 = 602122397;
                    } else {
                        iM55979 = (C0946.m55979("ۛۨ") + i4) * 73;
                        i = ((iM55979 ^ i3) * (-4241)) ^ (-1659821658);
                        i2 = -1051091179;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -458530115:
                case 2129103234:
                    i12 = 45873;
                    iM55979 = C0946.m55979("᩷᩺") ^ i3;
                    i = ((iM55979 ^ i4) * (-15919)) ^ (-645714768);
                    i2 = -1982995277;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -393795428:
                case -119251153:
                    RunnableC1014.m56177();
                    break;
                case 26590088:
                case 897238905:
                    interfaceC14100 = ApplicationC21448.f67649;
                    sArr2 = f82167;
                    i13 = 25;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("۠ۙ") + i3) * 61;
                        i = ((iM55979 ^ i4) * (-23751)) ^ (-782815562);
                        i2 = 1880692950;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩹") ^ i4;
                        i = ((iM55979 ^ i3) * 18327) ^ (-98847167);
                        i2 = 1836932290;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 132365908:
                case 1819373958:
                    C0912.m55833();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩸") ^ i3) * (-11);
                        i = ((iM55979 ^ i4) * 3111) ^ (-1031727686);
                        i2 = -1633773279;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 234795547:
                case 574461346:
                    C0947.m55997();
                    RunnableC1014.m56177();
                    iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                    i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                    i2 = 960306960;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 257592378:
                case 901599109:
                    c = 24;
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0873.m55680("᩹᩸") ^ i3) * (-11);
                        i = ((iM55979 ^ i4) * 3111) ^ (-1031727686);
                        i2 = -1633773279;
                    } else {
                        iM55979 = (C0946.m55979("֨ۖ") ^ i3) * C0254q.f1218h;
                        i = ((iM55979 ^ i4) * 14777) ^ (-188041922);
                        i2 = 2019284371;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1113120288:
                case 1753251248:
                    int i17 = i10 + i11;
                    if (i9 - (i17 + i17) > 0) {
                        iM55979 = C0873.m55680("ۜ᩸") ^ i4;
                        i = ((iM55979 ^ i3) * (-1655)) ^ 1079578673;
                        i2 = 1795217183;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩸") ^ i3) * 43;
                        i = ((iM55979 ^ i4) * 8953) ^ (-1722163715);
                        i2 = 63288741;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1702651222:
                case 2110399479:
                    C24104.m53360(interfaceC14100, C1012.m56144(sArr2, i13, i14, i12), true);
                    if (abstractActivityC14026.m31836(true)) {
                        int iM559711 = (C0946.m55979("ᩳۘ") + i3) * 85;
                        i5 = ((iM559711 ^ i4) * 4677) ^ (-955770520);
                        i6 = iM559711 ^ 667851038;
                    } else {
                        iM55979 = (C0873.m55680("᩸۬") + i4) * (-73);
                        i = ((iM55979 ^ i3) * 9185) ^ 874555473;
                        i2 = -985872871;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1830268727:
                case 2019874160:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM55979 = C0873.m55680("۬ܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-26113)) ^ 2080792220;
                        i2 = 778390826;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("᩻ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM55979 = C0873.m55680("ۜۖ") ^ i3;
                        i = ((iM55979 ^ i4) * 25765) ^ 1502009899;
                        i2 = 823251569;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0233  */
    /* JADX WARN: Code duplicated, block: B:61:0x0275  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a7 A[PHI: r14 r15
      0x02a7: PHI (r14v4 java.util.LinkedHashSet) = (r14v2 java.util.LinkedHashSet), (r14v3 java.util.LinkedHashSet), (r14v2 java.util.LinkedHashSet) binds: [B:62:0x028d, B:57:0x0257, B:45:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r15v4 java.util.LinkedHashSet) = (r15v2 java.util.LinkedHashSet), (r15v3 java.util.LinkedHashSet), (r15v2 java.util.LinkedHashSet) binds: [B:62:0x028d, B:57:0x0257, B:45:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    private boolean m31836(boolean z) {
        int iM55680;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int iM55681;
        int i4;
        int i5;
        int i6;
        int iM55979;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        boolean z3;
        short[] sArr2;
        int i14;
        int iM559710;
        StringBuilder sb;
        AbstractActivityC14026 abstractActivityC14026 = this;
        int i15 = -1974201065;
        int i16 = C1025.f81947;
        int i17 = C1124.f82007;
        int iM55682 = (C0873.m55680("ܰᩴ") + i17) * (-105);
        int i18 = ((iM55682 ^ i16) * (-31605)) ^ 2090707442;
        int i19 = iM55682 ^ (-1491720680);
        C10674 c10674 = null;
        String str = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i20 = 0;
        boolean z4 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int iM56137 = 0;
        int i26 = 0;
        char c = 0;
        short s = 0;
        int i27 = 0;
        boolean z5 = false;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        StringBuilder sb2 = null;
        String str2 = null;
        String strM55592 = null;
        short[] sArr6 = null;
        int i32 = 0;
        int i33 = 0;
        String strM55639 = null;
        int i34 = 0;
        LinkedHashSet linkedHashSetM26437 = null;
        LinkedHashSet linkedHashSetM26438 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * 8977) >> 31));
            switch (i15) {
                case -2094769183:
                case 1398151653:
                    C0949.m56012();
                    if (!C1048.f81963) {
                        iM55680 = C0946.m55979("ۙ᩻") ^ i17;
                        i = ((iM55680 ^ i16) * (-21901)) ^ 108456434;
                        i2 = 204108181;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr7 = sArr5;
                        iM559710 = i28;
                        sArr2 = sArr7;
                        int iM55683 = C0873.m55680("ۛ᩸") ^ i16;
                        int i35 = i10;
                        i18 = ((iM55683 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM55683 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i35;
                        i29 = i29;
                        int i36 = iM559710;
                        sArr5 = sArr2;
                        i28 = i36;
                    }
                    break;
                case -2087717862:
                case -518144256:
                    C0937.m55918();
                    if (RunnableC0938.f81886 < 0) {
                        iM55680 = C0873.m55680("ܿ֫") ^ i16;
                        i = ((iM55680 ^ i17) * 10317) ^ (-497929447);
                        i2 = -1335014925;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    } else {
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        i31 = i31;
                        i3 = i20;
                        z4 = z4;
                        sArr4 = sArr4;
                        short[] sArr8 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr8;
                        iM55681 = C0946.m55979("ۖܰ") ^ i16;
                        i18 = ((iM55681 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM55681 ^ i4;
                        abstractActivityC14026 = this;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr9 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr9;
                    }
                    break;
                case -2054567424:
                case 2074288208:
                    i21 = i21;
                    int i37 = iM56137;
                    i33 = i33;
                    i29 = i29;
                    i31 = i31;
                    i3 = i20;
                    z4 = z4;
                    sArr4 = sArr4;
                    short[] sArr10 = sArr5;
                    z5 = z5;
                    i28 = i28;
                    sArr = sArr10;
                    if (i22 < i37) {
                        int iM559711 = C0946.m55979("ܶ֨") ^ i17;
                        iM56137 = i37;
                        i18 = ((iM559711 ^ i16) * (-21209)) ^ (-1368329832);
                        i19 = iM559711 ^ 1881024074;
                    } else {
                        iM56137 = i37;
                        iM55979 = C0946.m55979("ᩴ᩹") ^ i16;
                        i7 = ((iM55979 ^ i17) * 4599) ^ (-1050907778);
                        i8 = 1898199549;
                        i19 = iM55979 ^ i8;
                        i18 = i7;
                    }
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i3;
                    z4 = z4;
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    short[] sArr11 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr11;
                    break;
                case -2053065067:
                case -157406:
                    int i38 = i21;
                    int i39 = i28;
                    short[] sArr12 = sArr5;
                    int i40 = i33;
                    int i41 = i29;
                    int i42 = i31;
                    int i43 = i20;
                    boolean z6 = z4;
                    short[] sArr13 = sArr4;
                    if (i23 > 0) {
                        int iM559712 = (C0946.m55979("֨ᩳ") + i16) * (-29);
                        i18 = ((iM559712 ^ i17) * (-27643)) ^ 921872178;
                        i19 = iM559712 ^ 1666599254;
                    } else {
                        int iM559713 = (i16 - C0946.m55979("ᩳ᩵")) * 27;
                        i19 = iM559713 ^ 307776011;
                        i18 = ((iM559713 ^ i17) * 4641) ^ 56256894;
                    }
                    sArr4 = sArr13;
                    i31 = i42;
                    sArr5 = sArr12;
                    i20 = i43;
                    z4 = z6;
                    i21 = i38;
                    i33 = i40;
                    i29 = i41;
                    i28 = i39;
                    z5 = true;
                    break;
                case -1879282711:
                case 355714792:
                    sArr = sArr5;
                    i5 = 30218;
                    int iM55684 = C0873.m55680("۫֫") ^ i17;
                    int i44 = ((iM55684 ^ i16) * (-27661)) ^ (-736260874);
                    i19 = iM55684 ^ 1113663999;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i20;
                    z4 = z4;
                    i21 = i21;
                    i33 = i5;
                    i29 = i29;
                    i18 = i44;
                    abstractActivityC14026 = this;
                    short[] sArr14 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr14;
                    break;
                case -1876981329:
                case -1420071489:
                    i10 = i33;
                    i29 = i29;
                    i14 = i20;
                    z4 = z4;
                    sb = sb2;
                    C1003.m56121(sb, C0845.m55590(abstractActivityC14026, C0873.m55680(strM55592) ^ 2125832451));
                    if (C1046.f81962 > 0) {
                        sb2 = sb;
                        int iM559714 = C0946.m55979("ۤ᩷") ^ i17;
                        i11 = ((iM559714 ^ i16) * (-11057)) ^ (-700432403);
                        i19 = iM559714 ^ 581839668;
                        i20 = i14;
                        i33 = i10;
                        i18 = i11;
                        z4 = z4;
                        i29 = i29;
                    } else {
                        int iM55685 = (C0873.m55680("ۧᩳ") + i16) * (-41);
                        sb2 = sb;
                        int i45 = ((iM55685 ^ i17) * 2233) ^ 1661811842;
                        i19 = iM55685 ^ (-1019927124);
                        z4 = z4;
                        i29 = i29;
                        int i46 = i14;
                        i33 = i10;
                        i18 = i45;
                        i20 = i46;
                    }
                    break;
                case -1853989325:
                case 481779210:
                    abstractActivityC14026.f39547[i25] = i22;
                    i24 = i25 + 1;
                    i26 = i32;
                    i3 = i20;
                    z4 = z4;
                    i9 = i28;
                    sArr = sArr5;
                    sArr4 = sArr4;
                    int iM55686 = C0873.m55680("֨ۧ") ^ i16;
                    boolean z7 = z5;
                    i18 = ((iM55686 ^ i17) * (-8267)) ^ 1516229680;
                    i19 = iM55686 ^ (-824457433);
                    sArr4 = sArr4;
                    i31 = i31;
                    z5 = z7;
                    z4 = z4;
                    i21 = i21;
                    i29 = i29;
                    sArr5 = sArr;
                    i28 = i9;
                    i20 = i3;
                    i33 = i33;
                    break;
                case -1830579471:
                case 1696809106:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        z4 = z4;
                        sb = sb2;
                        int iM55687 = (C0873.m55680("ۧᩳ") + i16) * (-41);
                        sb2 = sb;
                        int i47 = ((iM55687 ^ i17) * 2233) ^ 1661811842;
                        i19 = iM55687 ^ (-1019927124);
                        z4 = z4;
                        i29 = i29;
                        int i48 = i14;
                        i33 = i10;
                        i18 = i47;
                        i20 = i48;
                    } else {
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        i31 = i31;
                        i3 = i20;
                        z4 = z4;
                        sArr4 = sArr4;
                        short[] sArr15 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr15;
                        iM55681 = C0946.m55979("ۖܰ") ^ i16;
                        i18 = ((iM55681 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM55681 ^ i4;
                        abstractActivityC14026 = this;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr16 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr16;
                    }
                    break;
                case -1808718274:
                case -1712302109:
                    C0967.m56074();
                    C1071.m56343();
                    return false;
                case -1792350366:
                case -610245214:
                    return z5;
                case -1772525513:
                case 803104126:
                    i12 = i21;
                    i33 = i33;
                    i29 = i29;
                    i3 = i20;
                    z2 = z4;
                    i13 = i28;
                    short[] sArr17 = sArr5;
                    abstractActivityC14026.f39550 = i23;
                    z3 = z5;
                    abstractActivityC14026.f39549 = z3;
                    sArr4 = f82167;
                    i30 = 16;
                    i31 = 3;
                    if (!C0937.f81884) {
                        sArr5 = sArr17;
                        int iM55688 = (C0873.m55680("۫ᩳ") + i16) * 25;
                        i19 = iM55688 ^ (-749188264);
                        z5 = z3;
                        i28 = i13;
                        i18 = ((iM55688 ^ i17) * (-8103)) ^ 1355536715;
                        i20 = i3;
                        z4 = z2;
                        i21 = i12;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        int iM55689 = C0873.m55680("ۗ۬") ^ i17;
                        i19 = iM55689 ^ 1161570100;
                        z5 = z3;
                        i18 = ((iM55689 ^ i16) * 12753) ^ 28951154;
                        sArr5 = sArr17;
                        z4 = z2;
                        i21 = i12;
                        i28 = i13;
                        i29 = i29;
                        i20 = i3;
                        i33 = i33;
                    }
                    break;
                case -1685258438:
                case -811992208:
                    z4 = z4;
                    int i49 = i33;
                    i3 = i20;
                    StringBuilder sb3 = sb2;
                    sArr6 = f82167;
                    i34 = 22;
                    if (C1012.f81938 >= 0) {
                        i33 = i49;
                        sb2 = sb3;
                        i29 = 2;
                        short[] sArr18 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr18;
                        iM55681 = (C0873.m55680("ۧ᩻") + i17) * 69;
                        i18 = ((iM55681 ^ i16) * 9329) ^ (-124640057);
                        i4 = -1318127037;
                        i19 = iM55681 ^ i4;
                        abstractActivityC14026 = this;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr19 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr19;
                    } else {
                        int iM559715 = (C0946.m55979("ܰۧ") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i19 = iM559715 ^ 1947791622;
                        sb2 = sb3;
                        i20 = i3;
                        i33 = i49;
                        i18 = ((iM559715 ^ i17) * (-14223)) ^ (-1519352631);
                        z4 = z4;
                        i29 = 2;
                    }
                    break;
                case -1658199249:
                case -352220657:
                    i21 = i21;
                    z5 = z5;
                    i33 = i33;
                    i29 = i29;
                    i31 = i31;
                    i3 = i20;
                    z4 = z4;
                    i9 = i28;
                    sArr = sArr5;
                    sArr4 = sArr4;
                    c10674 = (C10674) C0992.m56115(abstractActivityC14026.f39553, i22);
                    if (!c10674.m24569()) {
                        z5 = z5;
                        iM55979 = (C0946.m55979("֨᩺") + i16) * 115;
                        i28 = i9;
                        i7 = ((iM55979 ^ i17) * 27365) ^ (-290858960);
                        i8 = 1713641692;
                        i19 = iM55979 ^ i8;
                        i18 = i7;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr110 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr110;
                    } else {
                        i26 = i22;
                        i24 = i23;
                        int iM556810 = C0873.m55680("֨ۧ") ^ i16;
                        boolean z8 = z5;
                        i18 = ((iM556810 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM556810 ^ (-824457433);
                        sArr4 = sArr4;
                        i31 = i31;
                        z5 = z8;
                        z4 = z4;
                        i21 = i21;
                        i29 = i29;
                        sArr5 = sArr;
                        i28 = i9;
                        i20 = i3;
                        i33 = i33;
                    }
                    break;
                case -1651996235:
                case 1156214354:
                    C0890.m55740();
                    if (C1229.f82066 < 0) {
                        i12 = i21;
                        z3 = z5;
                        i33 = i33;
                        i29 = i29;
                        i3 = i20;
                        z2 = z4;
                        i13 = i28;
                        int iM556811 = (C0873.m55680("۫ᩳ") + i16) * 25;
                        i19 = iM556811 ^ (-749188264);
                        z5 = z3;
                        i28 = i13;
                        i18 = ((iM556811 ^ i17) * (-8103)) ^ 1355536715;
                        i20 = i3;
                        z4 = z2;
                        i21 = i12;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr20 = sArr5;
                        iM559710 = i28;
                        sArr2 = sArr20;
                        int iM556812 = C0873.m55680("ۛ᩸") ^ i16;
                        int i310 = i10;
                        i18 = ((iM556812 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM556812 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i310;
                        i29 = i29;
                        int i311 = iM559710;
                        sArr5 = sArr2;
                        i28 = i311;
                    }
                    break;
                case -1525421046:
                case 1052662971:
                    sArr = sArr5;
                    i5 = 8292;
                    int iM556813 = C0873.m55680("۫֫") ^ i17;
                    int i410 = ((iM556813 ^ i16) * (-27661)) ^ (-736260874);
                    i19 = iM556813 ^ 1113663999;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i20;
                    z4 = z4;
                    i21 = i21;
                    i33 = i5;
                    i29 = i29;
                    i18 = i410;
                    abstractActivityC14026 = this;
                    short[] sArr111 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr111;
                    break;
                case -1475617386:
                case 495490459:
                    i21 = i21;
                    sArr2 = sArr5;
                    i10 = i33;
                    i29 = i29;
                    i31 = i31;
                    i14 = i20;
                    z4 = z4;
                    sArr4 = sArr4;
                    i30 = i30;
                    iM559710 = C0946.m55979(C0946.m55986(sArr4, i30, i31, i10)) ^ 2127109830;
                    if (RunnableC0897.f81856) {
                        int iM556814 = (C0873.m55680("ᩴܿ") + i16) * (-71);
                        sArr4 = sArr4;
                        i31 = i31;
                        z4 = z4;
                        i21 = i21;
                        i30 = i30;
                        i19 = iM556814 ^ 1622949802;
                        i18 = ((iM556814 ^ i17) * 25543) ^ (-2130339381);
                        i29 = i29;
                        i20 = i14;
                        i33 = i10;
                    } else {
                        int iM556815 = C0873.m55680("ۛ᩸") ^ i16;
                        int i312 = i10;
                        i18 = ((iM556815 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM556815 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i312;
                        i29 = i29;
                    }
                    int i313 = iM559710;
                    sArr5 = sArr2;
                    i28 = i313;
                    break;
                case -1353263736:
                case 591707728:
                    i33 = i33;
                    i29 = i29;
                    sArr4 = sArr4;
                    i31 = i31;
                    i3 = i20;
                    short[] sArr21 = sArr5;
                    z5 = z5;
                    i28 = i28;
                    sArr = sArr21;
                    iM56137 = C1012.m56137(abstractActivityC14026.f39553);
                    if (C0854.f81826 != 0) {
                        z4 = false;
                        i21 = -1;
                        iM55979 = (C0873.m55680("ۢۧ") ^ i17) * 89;
                        i7 = ((iM55979 ^ i16) * (-32499)) ^ (-1212384025);
                        i8 = 723565479;
                        i19 = iM55979 ^ i8;
                        i18 = i7;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        int iM559716 = C0946.m55979("᩸ᩴ") ^ i16;
                        i18 = ((iM559716 ^ i17) * (-11297)) ^ 1438289189;
                        i19 = iM559716 ^ 888863656;
                        sArr4 = sArr4;
                        i31 = i31;
                        i29 = i29;
                        i20 = i3;
                        i33 = i33;
                        z4 = false;
                        i21 = -1;
                    }
                    short[] sArr112 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr112;
                    break;
                case -1258029571:
                case 453519392:
                    abstractActivityC14026.f39543 = strM55639;
                    abstractActivityC14026.f39551 = i21;
                    if (abstractActivityC14026.f39556) {
                        iM55680 = (C0873.m55680("ۤ᩸") ^ i17) * (-39);
                        i = ((iM55680 ^ i16) * 15827) ^ 935841521;
                        i2 = 819978180;
                    } else {
                        iM55680 = (C0873.m55680("᩵ܶ") ^ i17) * (-15);
                        i = ((iM55680 ^ i16) * (-6289)) ^ 886991879;
                        i2 = 2060608844;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -1251250786:
                case 883439984:
                    if (ViewOnClickListenerC0939.m55949(linkedHashSetM26437, linkedHashSetM26438)) {
                        iM55680 = C0873.m55680("ܰ᩷") ^ i16;
                        i = ((iM55680 ^ i17) * (-3309)) ^ 1671614442;
                        i2 = -633414424;
                    } else {
                        iM55680 = (i16 - C0873.m55680("֡֡")) * (-35);
                        i = ((iM55680 ^ i17) * 17461) ^ (-353469968);
                        i2 = 1913552347;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -1243911132:
                case 1581113416:
                    i10 = i33;
                    i29 = i29;
                    i14 = i20;
                    StringBuilder sb4 = sb2;
                    C1003.m56121(sb4, C1194.m56386(sArr6, i34, i29, i10));
                    C0863.m55629(sb4, i23);
                    strM55639 = C0863.m55639(sb4);
                    if (C0930.f81879 > 0) {
                        int iM559717 = C0946.m55979("ۧ֫") ^ i17;
                        z4 = z4;
                        i11 = ((iM559717 ^ i16) * (-21059)) ^ 2051603451;
                        i19 = iM559717 ^ (-163589165);
                        sb2 = sb4;
                        i20 = i14;
                        i33 = i10;
                        i18 = i11;
                        z4 = z4;
                        i29 = i29;
                    } else {
                        sb2 = sb4;
                        short[] sArr22 = sArr5;
                        iM559710 = i28;
                        sArr2 = sArr22;
                        int iM556816 = C0873.m55680("ۛ᩸") ^ i16;
                        int i314 = i10;
                        i18 = ((iM556816 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM556816 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i314;
                        i29 = i29;
                        int i315 = iM559710;
                        sArr5 = sArr2;
                        i28 = i315;
                    }
                    break;
                case -1237260340:
                case -799786927:
                    C0927.m55873();
                    if (C0863.f81833 > 0) {
                        iM55680 = C0873.m55680("᩵۠") ^ i17;
                        i = ((iM55680 ^ i16) * 23011) ^ (-1505582704);
                        i2 = -2011735090;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        z4 = z4;
                        sb = sb2;
                        int iM556817 = (C0873.m55680("ۧᩳ") + i16) * (-41);
                        sb2 = sb;
                        int i411 = ((iM556817 ^ i17) * 2233) ^ 1661811842;
                        i19 = iM556817 ^ (-1019927124);
                        z4 = z4;
                        i29 = i29;
                        int i412 = i14;
                        i33 = i10;
                        i18 = i411;
                        i20 = i412;
                    }
                    break;
                case -1143592337:
                case 783934530:
                    if (!abstractActivityC14026.mo21650(str2)) {
                        iM55680 = (i16 - C0873.m55680("֡֡")) * (-35);
                        i = ((iM55680 ^ i17) * 17461) ^ (-353469968);
                        i2 = 1913552347;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    } else {
                        i26 = i20;
                        i24 = i23;
                        i3 = i26;
                        z4 = z4;
                        i9 = i28;
                        sArr = sArr5;
                        sArr4 = sArr4;
                        int iM556818 = C0873.m55680("֨ۧ") ^ i16;
                        boolean z9 = z5;
                        i18 = ((iM556818 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM556818 ^ (-824457433);
                        sArr4 = sArr4;
                        i31 = i31;
                        z5 = z9;
                        z4 = z4;
                        i21 = i21;
                        i29 = i29;
                        sArr5 = sArr;
                        i28 = i9;
                        i20 = i3;
                        i33 = i33;
                    }
                    break;
                case -1082991087:
                case 886312419:
                    str2 = c10674.f29536;
                    str = c10674.f29534;
                    if (str2 == null) {
                        i26 = i20;
                        i24 = i23;
                        i3 = i26;
                        z4 = z4;
                        i9 = i28;
                        sArr = sArr5;
                        sArr4 = sArr4;
                        int iM556819 = C0873.m55680("֨ۧ") ^ i16;
                        boolean z10 = z5;
                        i18 = ((iM556819 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM556819 ^ (-824457433);
                        sArr4 = sArr4;
                        i31 = i31;
                        z5 = z10;
                        z4 = z4;
                        i21 = i21;
                        i29 = i29;
                        sArr5 = sArr;
                        i28 = i9;
                        i20 = i3;
                        i33 = i33;
                    } else {
                        iM55680 = (i16 - C0946.m55979("᩻ܰ")) * 33;
                        i = ((iM55680 ^ i17) * 26863) ^ 702621629;
                        i2 = -1951176538;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    }
                    break;
                case -1065454407:
                case 1483908710:
                    sArr = sArr5;
                    i6 = -1;
                    i22 = 0;
                    i23 = 0;
                    iM55979 = (i17 - C0873.m55680("۟ۢ")) * 21;
                    i3 = i6;
                    i7 = ((iM55979 ^ i16) * (-16467)) ^ 947987365;
                    i8 = -252029052;
                    i19 = iM55979 ^ i8;
                    i18 = i7;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i3;
                    z4 = z4;
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    short[] sArr113 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr113;
                    break;
                case -1034172129:
                case -850330439:
                    if (linkedHashSetM26437 != null) {
                        iM55680 = C0873.m55680("ܿۛ") ^ i17;
                        i = ((iM55680 ^ i16) * 23321) ^ (-1789239368);
                        i2 = -643826085;
                    } else {
                        iM55680 = (i16 - C0873.m55680("֡֡")) * (-35);
                        i = ((iM55680 ^ i17) * 17461) ^ (-353469968);
                        i2 = 1913552347;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -718935630:
                case -144114182:
                    if (i20 != i22) {
                        iM55680 = C0873.m55680("ۧ᩷") ^ i17;
                        i = ((iM55680 ^ i16) * 24897) ^ (-1832226428);
                        i2 = -1736022180;
                    } else {
                        i32 = i20;
                        i25 = i23;
                        iM55680 = (i16 - C0946.m55979("۟ۨ")) * 51;
                        i = ((iM55680 ^ i17) * 16433) ^ 1509175186;
                        i2 = 664898815;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -689621104:
                case 1305475794:
                    i12 = i21;
                    int i50 = i33;
                    i29 = i29;
                    i3 = i20;
                    z2 = z4;
                    i13 = i28;
                    C1053.m56321(abstractActivityC14026, i13);
                    sb2 = new StringBuilder();
                    sArr5 = f82167;
                    if (RunnableC1014.f81941 <= 0) {
                        i33 = i50;
                        z3 = z5;
                        int iM5568110 = (C0873.m55680("۫ᩳ") + i16) * 25;
                        i19 = iM5568110 ^ (-749188264);
                        z5 = z3;
                        i28 = i13;
                        i18 = ((iM5568110 ^ i17) * (-8103)) ^ 1355536715;
                        i20 = i3;
                        z4 = z2;
                        i21 = i12;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        int iM556820 = C0873.m55680("ᩴ᩵") ^ i17;
                        int i51 = ((iM556820 ^ i16) * 24459) ^ (-232627806);
                        i19 = iM556820 ^ (-84619176);
                        i28 = i13;
                        i20 = i3;
                        z4 = z2;
                        i33 = i50;
                        i18 = i51;
                        i29 = i29;
                        i21 = i12;
                    }
                    break;
                case -620115787:
                case 1974581115:
                    abstractActivityC14026.f39547[i23] = i20;
                    i25 = i23 + 1;
                    i32 = -1;
                    iM55680 = (i16 - C0946.m55979("۟ۨ")) * 51;
                    i = ((iM55680 ^ i17) * 16433) ^ 1509175186;
                    i2 = 664898815;
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -602184011:
                case -308082133:
                    linkedHashSetM26437 = C11446.m26437(str);
                    linkedHashSetM26438 = C11446.m26437(str2);
                    if (linkedHashSetM26437 != linkedHashSetM26438) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i17;
                        i = ((iM55680 ^ i16) * (-1531)) ^ 1867725731;
                        i2 = 543635797;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩷") ^ i16;
                        i = ((iM55680 ^ i17) * (-3309)) ^ 1671614442;
                        i2 = -633414424;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -477667038:
                case 1391055060:
                    if (i20 != i21) {
                        iM55680 = (C0873.m55680("ܺ۫") + i16) * 89;
                        i = ((iM55680 ^ i17) * 4293) ^ 694059605;
                        i2 = -693674852;
                    } else {
                        i32 = i20;
                        i25 = i23;
                        iM55680 = (i16 - C0946.m55979("۟ۨ")) * 51;
                        i = ((iM55680 ^ i17) * 16433) ^ 1509175186;
                        i2 = 664898815;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case -448643244:
                case 838942101:
                    C1048.m56305();
                    if (!C0917.f81868) {
                        i33 = i33;
                        i29 = i29;
                        i3 = i20;
                        z4 = z4;
                        short[] sArr114 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr114;
                        iM55681 = (C0873.m55680("ۧ᩻") + i17) * 69;
                        i18 = ((iM55681 ^ i16) * 9329) ^ (-124640057);
                        i4 = -1318127037;
                        i19 = iM55681 ^ i4;
                        abstractActivityC14026 = this;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr115 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr115;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr23 = sArr5;
                        iM559710 = i28;
                        sArr2 = sArr23;
                        int iM5568111 = C0873.m55680("ۛ᩸") ^ i16;
                        int i316 = i10;
                        i18 = ((iM5568111 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM5568111 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i316;
                        i29 = i29;
                        int i317 = iM559710;
                        sArr5 = sArr2;
                        i28 = i317;
                    }
                    break;
                case -325019121:
                case 657894828:
                    abstractActivityC14026.m31842(z4);
                    iM55680 = C0946.m55979("ۙܳ") ^ i17;
                    i = ((iM55680 ^ i16) * (-24595)) ^ 1008182743;
                    i2 = -113025460;
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case 135606850:
                case 245770366:
                    if (str == null) {
                        i26 = i20;
                        i24 = i23;
                        i3 = i26;
                        z4 = z4;
                        i9 = i28;
                        sArr = sArr5;
                        sArr4 = sArr4;
                        int iM5568112 = C0873.m55680("֨ۧ") ^ i16;
                        boolean z11 = z5;
                        i18 = ((iM5568112 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM5568112 ^ (-824457433);
                        sArr4 = sArr4;
                        i31 = i31;
                        z5 = z11;
                        z4 = z4;
                        i21 = i21;
                        i29 = i29;
                        sArr5 = sArr;
                        i28 = i9;
                        i20 = i3;
                        i33 = i33;
                    } else {
                        iM55680 = (i17 - C0946.m55979("᩹᩺")) * 81;
                        i = ((iM55680 ^ i16) * (-28675)) ^ (-2089384827);
                        i2 = 1189680216;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    }
                    break;
                case 241621196:
                case 979153141:
                    i22++;
                    i23 = i24;
                    i6 = i26;
                    sArr = sArr5;
                    iM55979 = (i17 - C0873.m55680("۟ۢ")) * 21;
                    i3 = i6;
                    i7 = ((iM55979 ^ i16) * (-16467)) ^ 947987365;
                    i8 = -252029052;
                    i19 = iM55979 ^ i8;
                    i18 = i7;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i3;
                    z4 = z4;
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    short[] sArr116 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr116;
                    break;
                case 258209476:
                case 1267476046:
                    if (z) {
                        iM55680 = (i17 - C0873.m55680("۠ۘ")) * (-85);
                        i = ((iM55680 ^ i16) * 4127) ^ 1045875190;
                        i2 = -522179904;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩷") ^ i16;
                        i = ((iM55680 ^ i17) * (-3309)) ^ 1671614442;
                        i2 = -633414424;
                    }
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case 343188833:
                case 696296310:
                    m31854();
                    return z4;
                case 355355155:
                case 1403488313:
                    C0861.m55626();
                    C1929.m56553();
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    i31 = i31;
                    i3 = i20;
                    z4 = z4;
                    sArr4 = sArr4;
                    short[] sArr117 = sArr5;
                    z5 = z5;
                    i28 = i28;
                    sArr = sArr117;
                    iM55681 = C0946.m55979("ۖܰ") ^ i16;
                    i18 = ((iM55681 ^ i17) * (-25671)) ^ 83381373;
                    i4 = 1836535060;
                    i19 = iM55681 ^ i4;
                    abstractActivityC14026 = this;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i3;
                    z4 = z4;
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    short[] sArr118 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr118;
                    break;
                case 398507662:
                case 1198904613:
                    i10 = i33;
                    i29 = i29;
                    i3 = i20;
                    z4 = z4;
                    i21 = i21;
                    short[] sArr24 = sArr5;
                    strM55592 = C0845.m55592(sArr24, 19, 3, i10);
                    if (C0882.m55710() == 0) {
                        int iM556821 = (C0873.m55680("ܰ֨") ^ i16) * (-47);
                        i11 = ((iM556821 ^ i17) * (-6851)) ^ (-405230406);
                        i19 = iM556821 ^ (-1959817206);
                        sArr5 = sArr24;
                        i20 = i3;
                        i21 = i21;
                        i33 = i10;
                        i18 = i11;
                        z4 = z4;
                        i29 = i29;
                    } else {
                        i33 = i10;
                        z5 = z5;
                        i28 = i28;
                        sArr4 = sArr4;
                        sArr = sArr24;
                        i31 = i31;
                        iM55979 = (C0873.m55680("ۢۧ") ^ i17) * 89;
                        i7 = ((iM55979 ^ i16) * (-32499)) ^ (-1212384025);
                        i8 = 723565479;
                        i19 = iM55979 ^ i8;
                        i18 = i7;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr119 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr119;
                    }
                    break;
                case 453528876:
                case 1159935605:
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    i31 = i31;
                    i3 = i20;
                    z4 = z4;
                    sArr4 = sArr4;
                    short[] sArr25 = sArr5;
                    z5 = z5;
                    i28 = i28;
                    sArr = sArr25;
                    int i52 = (s * s) + 8910225;
                    if ((i27 * i27) - (i52 + i52) <= 0) {
                        iM55681 = C0873.m55680("֨۟") ^ i17;
                        i18 = ((iM55681 ^ i16) * (-14203)) ^ 1605962048;
                        i4 = 1657535881;
                    } else {
                        iM55681 = C0873.m55680("᩺᩷") ^ i16;
                        i18 = ((iM55681 ^ i17) * 30335) ^ 154697288;
                        i4 = 1368875738;
                    }
                    i19 = iM55681 ^ i4;
                    abstractActivityC14026 = this;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i3;
                    z4 = z4;
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    short[] sArr1110 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr1110;
                    break;
                case 697486869:
                case 1201592210:
                    if (C1012.m56134() > 0) {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr26 = sArr5;
                        iM559710 = i28;
                        sArr2 = sArr26;
                        int iM5568113 = C0873.m55680("ۛ᩸") ^ i16;
                        int i318 = i10;
                        i18 = ((iM5568113 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM5568113 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i318;
                        i29 = i29;
                        int i319 = iM559710;
                        sArr5 = sArr2;
                        i28 = i319;
                    } else {
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        i31 = i31;
                        i3 = i20;
                        z4 = z4;
                        sArr4 = sArr4;
                        short[] sArr1111 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr1111;
                        iM55681 = C0946.m55979("ۖܰ") ^ i16;
                        i18 = ((iM55681 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM55681 ^ i4;
                        abstractActivityC14026 = this;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr1112 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr1112;
                    }
                    break;
                case 792280584:
                case 1663042202:
                    abstractActivityC14026.f39555.notifyDataSetChanged();
                    iM55680 = C0946.m55979("ۙܳ") ^ i17;
                    i = ((iM55680 ^ i16) * (-24595)) ^ 1008182743;
                    i2 = -113025460;
                    i19 = iM55680 ^ i2;
                    i18 = i;
                    break;
                case 1034729275:
                case 2012297155:
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    i31 = i31;
                    i3 = i20;
                    z4 = z4;
                    sArr4 = sArr4;
                    short[] sArr27 = sArr5;
                    z5 = z5;
                    i28 = i28;
                    sArr = sArr27;
                    short s2 = sArr3[c];
                    int i53 = s2 + 2985;
                    if (C1046.f81962 > 0) {
                        int iM559718 = C0946.m55979("ۚ۫") ^ i16;
                        s = s2;
                        int i54 = ((iM559718 ^ i17) * (-24443)) ^ 475858766;
                        i19 = iM559718 ^ (-275818608);
                        i27 = i53;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i18 = i54;
                        i29 = i29;
                        abstractActivityC14026 = this;
                        short[] sArr1113 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr1113;
                    } else {
                        s = s2;
                        i27 = i53;
                        iM55681 = C0946.m55979("ۖܰ") ^ i16;
                        i18 = ((iM55681 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM55681 ^ i4;
                        abstractActivityC14026 = this;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                        short[] sArr1114 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr1114;
                    }
                    break;
                case 1098022132:
                case 1735622281:
                    if (C1025.f81947 < 0) {
                        iM55680 = (C0946.m55979("᩻ܶ") ^ i17) * 35;
                        i = ((iM55680 ^ i16) * (-18731)) ^ (-914834566);
                        i2 = 696322550;
                        i19 = iM55680 ^ i2;
                        i18 = i;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr28 = sArr5;
                        iM559710 = i28;
                        sArr2 = sArr28;
                        int iM5568114 = C0873.m55680("ۛ᩸") ^ i16;
                        int i3110 = i10;
                        i18 = ((iM5568114 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM5568114 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i3110;
                        i29 = i29;
                        int i3111 = iM559710;
                        sArr5 = sArr2;
                        i28 = i3111;
                    }
                    break;
                default:
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    i31 = i31;
                    i3 = i20;
                    z4 = z4;
                    sArr4 = sArr4;
                    short[] sArr29 = sArr5;
                    z5 = z5;
                    i28 = i28;
                    sArr = sArr29;
                    sArr3 = f82167;
                    c = 15;
                    if (C1024.f81946) {
                        iM55681 = (C0873.m55680("ۧ᩻") + i17) * 69;
                        i18 = ((iM55681 ^ i16) * 9329) ^ (-124640057);
                        i4 = -1318127037;
                    } else {
                        iM55681 = C0946.m55979("ۚۧ") ^ i17;
                        i18 = ((iM55681 ^ i16) * (-25799)) ^ 2057579783;
                        i4 = -795128799;
                    }
                    i19 = iM55681 ^ i4;
                    abstractActivityC14026 = this;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i3;
                    z4 = z4;
                    i21 = i21;
                    i33 = i33;
                    i29 = i29;
                    short[] sArr1115 = sArr;
                    i28 = i28;
                    z5 = z5;
                    sArr5 = sArr1115;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31852(int i, View view) {
        int iM55979;
        int i2;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        int i3 = 1385450773;
        int i4 = C0873.f81841;
        int i5 = C1404.f82149;
        int iM559710 = C0946.m55979("᩵ۨ") ^ i5;
        int i6 = ((iM559710 ^ i4) * (-22765)) ^ (-1386810756);
        int i7 = -1116578489;
        while (true) {
            int i8 = iM559710 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * 18257) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1972188842:
                    case -1336704017:
                        if (((C10674) C1017.m56196(arrayList, i)).m24571()) {
                            iM55979 = C0946.m55979("ۜܰ") ^ i4;
                            i6 = ((iM55979 ^ i5) * 22719) ^ 2092382195;
                            i2 = 1909636999;
                        } else {
                            iM55979 = C0946.m55979("ۤ֨") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-18775)) ^ 1927869330;
                            i2 = 1055259570;
                        }
                        i8 = iM55979 ^ i2;
                        z = true;
                        break;
                    case -1935934516:
                    case 1683345328:
                        this.f39545 -= z ? 1 : 0;
                        if (C1036.f81953 < 0) {
                            iM559710 = C0873.m55680("֫᩶") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-21259)) ^ 427442417;
                            i7 = 2002269980;
                        } else {
                            iM559710 = C0873.m55680("ۚ֫") ^ i4;
                            i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                        }
                        break;
                    case -1814786964:
                    case -623461588:
                        if (C1044.f81959 < 0) {
                            iM559710 = (i4 - C0873.m55680("᩻᩹")) * C0254q.f1218h;
                            i6 = ((iM559710 ^ i5) * (-6387)) ^ 1488839723;
                            i7 = 1676042634;
                        } else {
                            iM559710 = C0946.m55979("᩻ܺ") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                        }
                        break;
                    case -1786911882:
                    case -1019523854:
                        if (RunnableC0871.m55672() < 0) {
                            iM559710 = C0873.m55680("ۨ᩶") ^ i4;
                            i6 = ((iM559710 ^ i5) * (-15241)) ^ (-1844320464);
                            i7 = 1471812519;
                        } else {
                            iM559710 = C0873.m55680("ۚ֫") ^ i4;
                            i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                        }
                        break;
                    case -1552754165:
                    case 1252604287:
                        z2 = false;
                        C0949.m56015(view, 0);
                        if (this.f39545 != 0) {
                            iM559710 = (C0946.m55979("ۛۚ") ^ i5) * 13;
                            i6 = ((iM559710 ^ i4) * 25421) ^ (-1632024753);
                            i7 = 1902293166;
                        } else {
                            iM559710 = C0946.m55979("ۡ᩵") ^ i4;
                            i6 = ((iM559710 ^ i5) * (-11067)) ^ 1711387261;
                            i7 = -1090241146;
                        }
                        break;
                    case -1421949749:
                    case -889910424:
                        C0877.m55696();
                        break;
                    case -1219731031:
                    case 1683946091:
                        break;
                    case -1152605645:
                    case 218762351:
                        if (!C0861.f81831) {
                            iM559710 = C0873.m55680("ۚ֫") ^ i4;
                            i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                            break;
                        }
                        iM559710 = (i5 - C0946.m55979("ۛۜ")) * (-91);
                        i6 = ((iM559710 ^ i4) * (-30959)) ^ (-1169028283);
                        i7 = -296263633;
                        break;
                    case -1099123057:
                    case -441172620:
                        m31842(z2);
                        iM559710 = (C0946.m55979("ۛۚ") ^ i5) * 13;
                        i6 = ((iM559710 ^ i4) * 25421) ^ (-1632024753);
                        i7 = 1902293166;
                        break;
                    case -876593953:
                    case 1767588200:
                        if (C0882.m55710() == 0) {
                            iM559710 = C0946.m55979("᩶ۢ") ^ i5;
                            i6 = ((iM559710 ^ i4) * 27675) ^ (-1243167406);
                            i7 = 1207799932;
                        } else {
                            iM559710 = (C0873.m55680("֫֨") ^ i4) * 61;
                            i6 = ((iM559710 ^ i5) * 801) ^ (-1788511310);
                            i7 = -819007863;
                        }
                        break;
                    case -726877775:
                    case 970037233:
                        C1071.m56343();
                        C0949.m56012();
                        iM559710 = C0873.m55680("ۚ֫") ^ i4;
                        i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                        i7 = -1874510273;
                        break;
                    case -647359829:
                    case -92329334:
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM559710 = C0946.m55979("ܽۢ") ^ i4;
                            i6 = ((iM559710 ^ i5) * (-475)) ^ 1492667320;
                            i7 = 1384591763;
                        } else {
                            iM559710 = (C0873.m55680("֫֨") ^ i4) * 61;
                            i6 = ((iM559710 ^ i5) * 801) ^ (-1788511310);
                            i7 = -819007863;
                        }
                        break;
                    case -463526859:
                    case 2094019002:
                        if (!C0917.f81868) {
                            iM559710 = C0873.m55680("ᩴ֫") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-10097)) ^ (-1188875870);
                            i7 = 222497824;
                        } else {
                            iM559710 = C0946.m55979("֡ۙ") ^ i5;
                            i6 = ((iM559710 ^ i4) * 30293) ^ 1669600778;
                            i7 = -302316139;
                        }
                        break;
                    case -271896509:
                    case 396624448:
                        if (C1017.m56187() > 0) {
                            iM559710 = C0946.m55979("᩶ܽ") ^ i4;
                            i6 = ((iM559710 ^ i5) * 29345) ^ (-4004604);
                            i7 = -1522158157;
                        } else {
                            iM559710 = C0873.m55680("ۚ֫") ^ i4;
                            i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                        }
                        break;
                    case -630414:
                    case 1028495467:
                        C0937.m55918();
                        if (C0898.m55800() > 0) {
                            iM559710 = C0946.m55979("֡ۙ") ^ i5;
                            i6 = ((iM559710 ^ i4) * 30293) ^ 1669600778;
                            i7 = -302316139;
                            break;
                        }
                        iM559710 = C0873.m55680("ۚ֫") ^ i4;
                        i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                        i7 = -1874510273;
                        break;
                    case 137836944:
                    case 925180979:
                        arrayList = this.f39553;
                        if (C1071.m56343() == 0) {
                            iM559710 = C0873.m55680("ᩳ᩻") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-18929)) ^ (-1071845961);
                            i7 = 1685777083;
                        } else {
                            iM559710 = (C0873.m55680("֫֨") ^ i4) * 61;
                            i6 = ((iM559710 ^ i5) * 801) ^ (-1788511310);
                            i7 = -819007863;
                        }
                        break;
                    case 208519732:
                    case 727878421:
                        C0877.m55697(view, C23223.f72997);
                        if (this.f39545 != 0) {
                            iM559710 = (C0946.m55979("᩹ᩴ") ^ i5) * 19;
                            i6 = ((iM559710 ^ i4) * (-851)) ^ (-1258320620);
                            i7 = -593815031;
                        } else {
                            iM559710 = (i4 - C0873.m55680("᩻ܿ")) * 123;
                            i6 = ((iM559710 ^ i5) * (-23917)) ^ (-71423467);
                            i7 = 1302277902;
                        }
                        break;
                    case 444051431:
                    case 1395365606:
                        C1404.m56468();
                        if (!RunnableC0897.f81856) {
                            iM559710 = C0946.m55979("᩻ܺ") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                            break;
                        }
                        iM559710 = C0873.m55680("ۚ֫") ^ i4;
                        i6 = ((iM559710 ^ i5) * 23741) ^ (-946486436);
                        i7 = -1874510273;
                        break;
                    case 622949826:
                    case 832166157:
                        if (RunnableC0938.f81886 < 0) {
                            iM559710 = C0873.m55680("۬ۜ") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-1073)) ^ 443252370;
                            i7 = 1096227130;
                        } else {
                            iM559710 = C0946.m55979("᩻ܺ") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                        }
                        break;
                    case 1316622652:
                    case 2063952136:
                        if (!C0917.f81868) {
                            iM559710 = C0873.m55680("᩺ۧ") ^ i4;
                            i6 = ((iM559710 ^ i5) * 9139) ^ 1500836314;
                            i7 = 644080977;
                        } else {
                            iM559710 = C0946.m55979("᩻ܺ") ^ i5;
                            i6 = ((iM559710 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                        }
                        break;
                    case 1669964012:
                    case 1915453151:
                        this.f39545 += z ? 1 : 0;
                        break;
                    default:
                        m31842(z);
                        iM559710 = (C0946.m55979("᩹ᩴ") ^ i5) * 19;
                        i6 = ((iM559710 ^ i4) * (-851)) ^ (-1258320620);
                        i7 = -593815031;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ int m31833(AbstractActivityC14026 abstractActivityC14026, int i) {
        return abstractActivityC14026.f39547[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ int m31823(AbstractActivityC14026 abstractActivityC14026, int i) {
        return abstractActivityC14026.f39547[i];
    }
}
