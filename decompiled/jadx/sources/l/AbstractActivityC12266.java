package l;

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
import com.alipay.sdk.m.y.q;
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
public abstract class AbstractActivityC12266 extends AbstractActivityC3346 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۜۜܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f36523 = {2107, -26692, -26694, -26711, -26714, -26693, -26632, 3167, 19834, -19102, -17270, 2959, 28667, 28502, -26127, 127, 3324, 7627, 3024, 6947, 6232, 2343, 30256, 30250, 6973, -19625, -19618, -19645, -19629, -19624, -19627, -19602, -19643, -19624, -19647, -19602, -19630, -19623, -19628, -19630, -19622, -19602, -19643, -19645, -19632, -19617, -19646, -19619, -19632, -19643, -19624, -19618, -19617, -19602, -19625, -19618, -19645, -19620, -19632, -19643, -19602, -19630, -19618, -19617, -19643, -19645, -19618, -19619, -10827, -10229, -7689, 9949, -22664, -29216, -19949, 17676, 22151, 21644, 2376, 1430, 11809, -8820, 7664, 706, 12065, -2445, 9564, 4372, 12043, -7360, 8153, -665, -3149, 3239, -7145, -4693, 11427, 3540, 8824, 11404, 10016, 8048, 7273, 4565, 6223, -270, -7033, -15586, -6400, 4045, 1648, 846, -4824, 2557, 5797, -4311, 1744, 5258, -881, -13885, 3240, 24389, -18756, 24551, 20596, -20522, 18390, -18236, -21297, -19017, 18720, -20789, 22996, -18938, 21377, -23668, -17849, 24032, 20305, -19095, 22769, -21248, 25306, 31340, 27051, -23215, -21878, 19329, 13331, 13332, 13313, 13332, 13317, 13359, 13355, 13332, 13330, 13313, 13326, 13331, 13324, 13313, 13332, 13321, 13327, 13326, 13375, 13325, 13327, 13316, 13317, 13375, 13331, 13327, 13330, 13332, 13317, 13316, 161, 24140, -19308, -20369, 22585, -16923, -19562, 28814, 23437, -21786, 370, -3934, -5933, -2828, 6410, -4116, 6495, -13903, -992, -12942, 6010, -15349, 5234, -13315, -7791, 8055, -1423, 611, 4074, -13876, -5833, -13009, 3603, -692, 4987, -14262, -6459, 5403, 6786, -10139, -6120, -13991, -8172, 448, -1529, -13543, 4597, -7493, 5043, 7076, -2761, 4674, -9734, -14477, 6788, -6305, -16154, -5366, -15920, 3171, 2984, 7883, -27056, -27045, -27050, -27056, -27048, -27028, -27065, -27071, -27054, -27043, -27072, -27041, -27054, -27065, -27046, -27044, -27043, -27028, -27051, -27044, -27071, -27042, -27054, -27065, -27028, -27056, -27044, -27043, -27065, -27071, -27044, -27041, -27051, -27044, -27071, -27055, -27046, -27049, -27028, -27065, -27046, -27069, -27028, 7463, 2380, 609, 5670, -12943, 6657, -5878, 4895, -12739, 2429, 700, 4349, 543, -4130, -5468, 5641, 7868, 2241, -27065, -27071, -27054, -27043, -27072, -27041, -27054, -27065, -27046, -27044, -27043, -27028, -27042, -27044, -27049, -27050, -27028, -27072, -27044, -27071, -27065, -27050, -27049, 253, -12654, 5491, 4804, -30134, -30131, -30120, -30131, -30116, -30090, -30094, 1551, 8139, 8132, 8137, 8132, 83, -24172, 24095, -32252};

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f36524 = 0;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f36525;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36526;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public String f36527;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f36528;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public int f36529;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f36530;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int[] f36531;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceOnDismissListenerC5317 f36532;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f36533;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f36534;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f36535;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public int f36536;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f36537;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C19712 f36538;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12971 f36539;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f36540;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public C5242 f36541;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36542;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36543;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19677(RunnableC18617 runnableC18617);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19678(boolean z);

    /* JADX INFO: renamed from: ֫֫ */
    public String mo19679() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo19680() {
        return false;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public abstract void mo19681();

    /* JADX INFO: renamed from: ܽ */
    public boolean mo19682(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean mo19683() {
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public CharSequence mo19685(String str) {
        return str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo29796(int i) {
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo19687() {
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
        int iM6981;
        int i2;
        int i3;
        int i4 = C0422.f1886;
        int i5 = C4075.f12947;
        int iM2566 = (C0630.m2566("ᩳۨ") ^ i5) * (-125);
        int i6 = ((iM2566 ^ i4) * (-18711)) ^ (-659303054);
        ArrayList arrayList = null;
        C8739 c8739 = null;
        int i7 = iM2566 ^ 1318286552;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        int iM1484 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1370546266;
        while (true) {
            int i14 = i7 ^ (i6 & (((i13 ^ i4) * (-15675)) >> 31));
            switch (i14) {
                case -1938115565:
                case 390562650:
                    i14 = i14;
                    this.f36535 = i;
                    if (((C8739) C3537.m10755(this.f36537, i8)).m22601()) {
                        iM6981 = C0630.m2566("֡᩺") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-12639)) ^ (-213021315);
                        i3 = -202651384;
                    } else {
                        iM6981 = (C2105.m6981("֨᩹") ^ i4) * (-91);
                        i2 = ((iM6981 ^ i5) * 10199) ^ (-1942639121);
                        i3 = -152572127;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1921775096:
                case 1651015800:
                    i14 = i14;
                    this.f36535 = i10;
                    this.f36539.notifyDataSetChanged();
                    iM6981 = C0630.m2566("֡᩺") ^ i4;
                    i2 = ((iM6981 ^ i5) * (-12639)) ^ (-213021315);
                    i3 = -202651384;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1904806698:
                case 1225893759:
                    i11++;
                    iM6981 = (i5 - C2105.m6981("ۢ۠")) * (-89);
                    i2 = ((iM6981 ^ i4) * 16967) ^ (-1888309773);
                    i3 = -981979508;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1791737859:
                case 161151623:
                    i14 = i14;
                    if (C4075.f12947 < 0) {
                        iM6981 = (C0630.m2566("ܽۗ") ^ i4) * 87;
                        i2 = ((iM6981 ^ i5) * 16877) ^ (-1198479393);
                        i3 = 386114170;
                    } else {
                        iM6981 = C0630.m2566("᩻ۛ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-24491)) ^ (-1233226170);
                        i3 = 500225554;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1778148608:
                case 301248034:
                    i14 = i14;
                    if (C0964.f3626 != 0) {
                        iM6981 = (i4 - C2105.m6981("ܿܶ")) * (-47);
                        i2 = ((iM6981 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    } else {
                        iM6981 = C2105.m6981("ۙ᩷") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-16387)) ^ (-783209024);
                        i3 = -868716040;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1732550227:
                case -352304400:
                    return z;
                case -1649181865:
                case 1262037276:
                    i14 = i14;
                    c8739 = (C8739) C3537.m10755(arrayList, i12);
                    if (c8739.m22601()) {
                        iM6981 = C0630.m2566("ۖۘ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25293)) ^ 1240465352;
                        i3 = -1052087195;
                    } else {
                        iM6981 = (C0630.m2566("ᩴܰ") ^ i5) * 59;
                        i2 = ((iM6981 ^ i4) * (-29115)) ^ (-51372053);
                        i3 = 1680926593;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1545043320:
                case 868335324:
                    i14 = i14;
                    i12 = this.f36531[i11];
                    iM6981 = (i4 - C0630.m2566("۫ᩴ")) * 99;
                    i2 = ((iM6981 ^ i5) * 1203) ^ (-718529285);
                    i3 = -375089580;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1451806425:
                case 775770371:
                    i14 = i14;
                    C4075.m12263();
                    if (C4075.m12263() > 0) {
                        iM6981 = (C0630.m2566("ܽۗ") ^ i4) * 87;
                        i2 = ((iM6981 ^ i5) * 16877) ^ (-1198479393);
                        i3 = 386114170;
                    } else {
                        iM6981 = C0630.m2566("ۡ۟") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-28149)) ^ (-963484169);
                        i3 = 493875771;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1404782670:
                case -632837467:
                    i14 = i14;
                    if (C2520.m8026()) {
                        iM6981 = C2105.m6981("۠֡") ^ i4;
                        i2 = ((iM6981 ^ i5) * 21869) ^ 1995624214;
                        i3 = -338941857;
                    } else {
                        iM6981 = C2105.m6981("᩶ܽ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-2337)) ^ (-883167641);
                        i3 = -727464049;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1388432981:
                case 524281832:
                    i14 = i14;
                    if (C3245.f10203 > 0) {
                        iM6981 = C0630.m2566("᩻ۛ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-24491)) ^ (-1233226170);
                        i3 = 500225554;
                    } else {
                        iM6981 = C2105.m6981("ᩴܽ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1383479006:
                case 1592897132:
                    i14 = i14;
                    m29780(z);
                    m29790(i8, view);
                    this.f36535 = i;
                    iM6981 = C0630.m2566("֡᩺") ^ i4;
                    i2 = ((iM6981 ^ i5) * (-12639)) ^ (-213021315);
                    i3 = -202651384;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1362240537:
                case 140576013:
                    i14 = i14;
                    if (c8739.m22596(z)) {
                        iM6981 = (i4 - C0630.m2566("ۖ᩹")) * 85;
                        i2 = ((iM6981 ^ i5) * 2345) ^ 1589548730;
                        i3 = -2067254616;
                    } else {
                        iM6981 = C0630.m2566("ۖۘ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25293)) ^ 1240465352;
                        i3 = -1052087195;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1267036098:
                case -21818217:
                    return false;
                case -1249044806:
                case -1056560418:
                    i14 = i14;
                    this.f36529 += z ? 1 : 0;
                    iM6981 = C0630.m2566("ۖۘ") ^ i5;
                    i2 = ((iM6981 ^ i4) * (-25293)) ^ 1240465352;
                    i3 = -1052087195;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1114860367:
                case -215502433:
                    C4075.m12263();
                    if (AbstractC2021.m6574()) {
                        i14 = i14;
                        iM6981 = C0630.m2566("ۧ᩵") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-2039)) ^ (-1896165016);
                        i3 = 2086575846;
                        i7 = iM6981 ^ i3;
                        i6 = i2;
                        i13 = i14;
                    }
                    i14 = i14;
                    iM6981 = C0630.m2566("᩻ۛ") ^ i5;
                    i2 = ((iM6981 ^ i4) * (-24491)) ^ (-1233226170);
                    i3 = 500225554;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1049778405:
                case 576818815:
                    i14 = i14;
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ۧ᩵") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-2039)) ^ (-1896165016);
                        i3 = 2086575846;
                    } else {
                        iM6981 = C2105.m6981("۫ۤ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-9805)) ^ (-1694228546);
                        i3 = 1797598950;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -867451127:
                case 221990284:
                    i14 = i14;
                    if (this.f36533) {
                        iM6981 = (C2105.m6981("ܳ۫") + i4) * 93;
                        i2 = ((iM6981 ^ i5) * 4633) ^ 1605698147;
                        i3 = 350734317;
                    } else {
                        i8 = i;
                        iM6981 = (C0630.m2566("ۡ᩺") + i5) * (-7);
                        i2 = ((iM6981 ^ i4) * (-24659)) ^ (-1378953207);
                        i3 = 1100227949;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -856624379:
                case 82825316:
                    i14 = i14;
                    if (((C8739) C3019.m9263(this.f36537, i8)).m22600()) {
                        iM6981 = (C2105.m6981("᩶۟") + i4) * (-87);
                        i2 = ((iM6981 ^ i5) * (-9909)) ^ (-71119841);
                        i3 = 2017463085;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ᩴۚ")) * (-123);
                        i2 = ((iM6981 ^ i4) * 18167) ^ (-138317037);
                        i3 = 1388707700;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -761116879:
                case 1653380134:
                    i14 = i14;
                    m29790(i8, view);
                    iM6981 = C0630.m2566("֡᩺") ^ i4;
                    i2 = ((iM6981 ^ i5) * (-12639)) ^ (-213021315);
                    i3 = -202651384;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -724313017:
                case 458685260:
                    i14 = i14;
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ܿܶ")) * (-47);
                        i2 = ((iM6981 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    } else {
                        iM6981 = C0630.m2566("᩸ۘ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-25409)) ^ (-1847055504);
                        i3 = -1591530056;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -672116548:
                case 2027561578:
                    i14 = i14;
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ܿܶ")) * (-47);
                        i2 = ((iM6981 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    } else {
                        iM6981 = C0630.m2566("᩹ۗ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-6945)) ^ (-2052294405);
                        i3 = -2107345730;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -483728742:
                case 171728408:
                    i14 = i14;
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("ܽۗ") ^ i4) * 87;
                        i2 = ((iM6981 ^ i5) * 16877) ^ (-1198479393);
                        i3 = 386114170;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i5;
                        i2 = ((iM6981 ^ i4) * 22961) ^ 79313996;
                        i3 = 606033528;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -478223769:
                case 1038953305:
                    i14 = i14;
                    if (C0483.m2121()) {
                        iM6981 = (i4 - C2105.m6981("ܽۤ")) * (-53);
                        i2 = ((iM6981 ^ i5) * (-15401)) ^ (-1447868893);
                        i3 = -1465277568;
                    } else {
                        iM6981 = C2105.m6981("ᩴܽ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -383773257:
                case 2144510462:
                    i14 = i14;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("۠֡") ^ i4;
                        i2 = ((iM6981 ^ i5) * 21869) ^ 1995624214;
                        i3 = -338941857;
                    } else {
                        iM6981 = (C0630.m2566("ۢܽ") ^ i4) * 115;
                        i2 = ((iM6981 ^ i5) * 28399) ^ (-236611620);
                        i3 = 913692540;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -380692066:
                case 62989982:
                    if (C4159.f13567) {
                        iM6981 = C0630.m2566("ۡۜ") ^ i5;
                        i14 = i14;
                        i2 = ((iM6981 ^ i4) * (-28559)) ^ 763098593;
                        i3 = 627440744;
                    } else {
                        i14 = i14;
                        iM6981 = C0630.m2566("᩻ۛ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-24491)) ^ (-1233226170);
                        i3 = 500225554;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -337662377:
                case -200966320:
                    i14 = i14;
                    if (C1711.m5736() > 0) {
                        iM6981 = C2105.m6981("ᩴܽ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܿܶ")) * (-47);
                        i2 = ((iM6981 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -109904120:
                case 1574663162:
                    i14 = i14;
                    if (i11 <= iM1484) {
                        iM6981 = (i5 - C0630.m2566("᩵᩵")) * (-61);
                        i2 = ((iM6981 ^ i4) * (-17553)) ^ 842158641;
                        i3 = -1583141196;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۗۨ")) * 101;
                        i2 = ((iM6981 ^ i4) * 3081) ^ (-1522443966);
                        i3 = -1442895525;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 128804178:
                case 873542692:
                    i14 = i14;
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ᩴܽ") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-22407)) ^ 1070138676;
                        i3 = 919939403;
                    } else {
                        iM6981 = C0630.m2566("۟ܶ") ^ i5;
                        i2 = ((iM6981 ^ i4) * 2643) ^ 1227134472;
                        i3 = -1716558899;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 161894046:
                case 422390264:
                    i14 = i14;
                    i8 = this.f36531[i];
                    iM6981 = (C0630.m2566("ۡ᩺") + i5) * (-7);
                    i2 = ((iM6981 ^ i4) * (-24659)) ^ (-1378953207);
                    i3 = 1100227949;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 386610195:
                case 1483811256:
                    i14 = i14;
                    i9 = this.f36535;
                    i10 = -1;
                    if (i9 == -1) {
                        iM6981 = C0630.m2566("ۤ۫") ^ i4;
                        i2 = ((iM6981 ^ i5) * 12515) ^ (-66917869);
                        i3 = 262937820;
                    } else {
                        iM6981 = C0630.m2566("ܰۙ") ^ i5;
                        i2 = ((iM6981 ^ i4) * (-1043)) ^ (-15801228);
                        i3 = -1590509726;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 582309148:
                case 1912669034:
                    i14 = i14;
                    arrayList = this.f36537;
                    if (this.f36533) {
                        iM6981 = C2105.m6981("۫֡") ^ i4;
                        i2 = ((iM6981 ^ i5) * (-15725)) ^ (-1025318263);
                        i3 = -1157423713;
                    } else {
                        i12 = i11;
                        iM6981 = (i4 - C0630.m2566("۫ᩴ")) * 99;
                        i2 = ((iM6981 ^ i5) * 1203) ^ (-718529285);
                        i3 = -375089580;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 694766355:
                case 1449332183:
                    int iM3783 = RunnableC1108.m3783(i9, i);
                    iM1484 = C0237.m1484(this.f36535, i);
                    i11 = iM3783;
                    iM6981 = (i5 - C2105.m6981("ۢ۠")) * (-89);
                    i2 = ((iM6981 ^ i4) * 16967) ^ (-1888309773);
                    i3 = -981979508;
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 695928576:
                case 1478275447:
                    i14 = i14;
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("ܳ᩷") + i4) * (-33);
                        i2 = ((iM6981 ^ i5) * 23373) ^ (-26463471);
                        i3 = -1319760687;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܿܶ")) * (-47);
                        i2 = ((iM6981 ^ i5) * (-1251)) ^ 1346944906;
                        i3 = 1865967060;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 789464782:
                case 1336818096:
                    i14 = i14;
                    z = true;
                    z = true;
                    if (this.f36540) {
                        iM6981 = (i4 - C0630.m2566("ۙۗ")) * (-95);
                        i2 = ((iM6981 ^ i5) * (-31827)) ^ 657250196;
                        i3 = -704100656;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ܿ۬")) * 35;
                        i2 = ((iM6981 ^ i4) * 29297) ^ (-2012246002);
                        i3 = -90020307;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 1837781657:
                case 1863807607:
                    RunnableC1108.m3790();
                    C2520.m8026();
                    return false;
                default:
                    i14 = i14;
                    RunnableC1937.m6387();
                    iM6981 = (C0630.m2566("ܽۗ") ^ i4) * 87;
                    i2 = ((iM6981 ^ i5) * 16877) ^ (-1198479393);
                    i3 = 386114170;
                    i7 = iM6981 ^ i3;
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
    public AbstractActivityC12266() {
        int iM2566;
        int i;
        boolean z = false;
        int i2 = -139350319;
        int i3 = C3746.f11829;
        int i4 = C7811.f24123;
        int iM2567 = (i3 - C0630.m2566("ܳۨ")) * (-19);
        int i5 = ((iM2567 ^ i4) * 10497) ^ 175996826;
        int i6 = -1397683382;
        while (true) {
            int i7 = iM2567 ^ i6;
            C5242 c5242 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 22903) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1985436601:
                    case -8320478:
                        AbstractC2021.m6574();
                        if (C1047.f3863 >= 0) {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM2566 = (i3 - C2105.m6981("ܿۧ")) * 39;
                            i5 = ((iM2566 ^ i4) * (-1733)) ^ (-1955570117);
                            i = 416728194;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1636826900:
                    case 313171210:
                        this.f36529 = z ? 1 : 0;
                        if (C21923.f70183 != 0) {
                            iM2566 = C0630.m2566("ܶ᩷") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-23837)) ^ 123972227;
                            i = 1535512375;
                        } else {
                            iM2566 = C2105.m6981("ۗܿ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-27925)) ^ (-1994064897);
                            i = -486798404;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1406623456:
                    case -1387716884:
                        this.f36535 = -1;
                        return;
                    case -1306521175:
                    case 916626294:
                        C4159.m12565();
                        if (RunnableC3474.f10992 > 0) {
                            iM2566 = (C2105.m6981("ۨۜ") + i4) * (-91);
                            i5 = ((iM2566 ^ i3) * (-29289)) ^ 670195940;
                            i = 1526498744;
                        } else {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1278418279:
                    case 1887741597:
                        if (C1294.m4372() <= 0) {
                            iM2566 = C0630.m2566("ܶ᩷") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-23837)) ^ 123972227;
                            i = 1535512375;
                        } else {
                            iM2566 = (C2105.m6981("ۨۜ") + i4) * (-91);
                            i5 = ((iM2566 ^ i3) * (-29289)) ^ 670195940;
                            i = 1526498744;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -870469048:
                    case 1594797351:
                        this.f36541 = c5242;
                        if (AbstractC2021.m6574()) {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM2566 = (i3 - C2105.m6981("ۨ᩺")) * 33;
                            i5 = ((iM2566 ^ i4) * (-5681)) ^ 1521245568;
                            i = -324371361;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -629138794:
                    case -268108657:
                        if (C21923.f70183 != 0) {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM2566 = C2105.m6981("ᩴ᩷") ^ i3;
                            i5 = ((iM2566 ^ i4) * 21215) ^ (-1407576487);
                            i = 1953536876;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -610802656:
                    case 640969993:
                        if (C1047.m3599() >= 0) {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM2566 = C0630.m2566("ۙۗ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-32277)) ^ 711965837;
                            i = 1106567894;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -497848934:
                    case 774860994:
                        if (C0422.f1886 <= 0) {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM2566 = (i4 - C2105.m6981("ܿ᩶")) * (-53);
                            i5 = ((iM2566 ^ i3) * 927) ^ 350945794;
                            i = 258951449;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -361353103:
                    case 1656922491:
                        C0798.m2998();
                        throw new RuntimeException();
                    case -247356966:
                    case 114622615:
                        z = false;
                        z = false;
                        this.f36540 = false;
                        if (ServiceConnectionC3453.f10921 < 0) {
                            iM2566 = (i4 - C0630.m2566("᩶ۡ")) * 71;
                            i5 = ((iM2566 ^ i3) * (-4689)) ^ 376169984;
                            i = 249066679;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case 532206076:
                    case 1446590835:
                        if (C0714.f2697 >= 0) {
                            iM2566 = (i3 - C0630.m2566("᩵ۙ")) * 123;
                            i5 = ((iM2566 ^ i4) * 30885) ^ 696386888;
                            i = 408685958;
                        } else {
                            iM2566 = (C0630.m2566("᩷ܽ") ^ i3) * (-93);
                            i5 = ((iM2566 ^ i4) * (-19117)) ^ 83875659;
                            i = -234684553;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 829479615:
                    case 1353113566:
                        if (C4117.f13076 > 0) {
                            iM2566 = (i3 - C2105.m6981("᩺᩵")) * 63;
                            i5 = ((iM2566 ^ i4) * (-13663)) ^ 738297705;
                            i = -1392829108;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case 1393300915:
                    case 1706218114:
                        this.f36533 = z;
                        if (C22628.f73083 > 0) {
                            c5242 = new C5242(C3245.m9921(z));
                            if (C1420.f5096 <= 0) {
                                iM2566 = C0630.m2566("ܶ᩷") ^ i4;
                                i5 = ((iM2566 ^ i3) * (-23837)) ^ 123972227;
                                i = 1535512375;
                            } else {
                                iM2566 = C2105.m6981("ᩴۜ") ^ i3;
                                i5 = ((iM2566 ^ i4) * 2629) ^ 985617821;
                                i = 970252074;
                            }
                            i7 = iM2566 ^ i;
                        }
                        break;
                    default:
                        C4263.m12819();
                        C0798.m2998();
                        iM2566 = C0630.m2566("ܶ᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-23837)) ^ 123972227;
                        i = 1535512375;
                        i7 = iM2566 ^ i;
                        break;
                }
            }
            iM2567 = (C0630.m2566("ᩴۛ") + i4) * (-105);
            i5 = ((iM2567 ^ i3) * (-9037)) ^ (-2043658176);
            i6 = -43325696;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[PHI: r6
      0x00a7: PHI (r6v5 l.ۧ᩺ᩴ) = (r6v3 l.ۧ᩺ᩴ), (r6v2 l.ۧ᩺ᩴ) binds: [B:30:0x00a5, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0108 A[PHI: r3 r4
      0x0108: PHI (r3v4 l.ۧ᩺ᩴ) = (r3v3 l.ۧ᩺ᩴ), (r3v2 l.ۧ᩺ᩴ), (r3v2 l.ۧ᩺ᩴ) binds: [B:40:0x0106, B:22:0x006c, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r4v4 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v2 java.util.ArrayList), (r4v2 java.util.ArrayList) binds: [B:40:0x0106, B:22:0x006c, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List m29793() {
        int iM2566;
        int i;
        int iM6981;
        int i2;
        int i3 = 0;
        InterfaceC11315 interfaceC11315Range = null;
        InterfaceC11315 map = null;
        final ArrayList arrayList = null;
        IntFunction intFunction = null;
        InterfaceC11315 map2 = null;
        int i4 = -1463725107;
        int i5 = C2520.f8000;
        int i6 = C1420.f5096;
        int iM6982 = (C2105.m6981("ۤܿ") + i6) * 53;
        int i7 = ((iM6982 ^ i5) * (-5195)) ^ 117809970;
        int i8 = 354972497;
        while (true) {
            int i9 = iM6982 ^ i8;
            IntUnaryOperator intUnaryOperator = null;
            while (true) {
                i4 = ((((i4 ^ i5) * 20045) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -1970732768:
                    case -1368947102:
                        interfaceC11315Range = C13803.range(i3, this.f36534);
                        if (!RunnableC1108.m3790()) {
                            intUnaryOperator = new IntUnaryOperator() { // from class: l.ۘ۟ܽ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C15755.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i10) {
                                    return AbstractActivityC12266.m29761(this.f11987, i10);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C15755.$default$compose(this, intUnaryOperator2);
                                }
                            };
                            if (!C1005.f3721) {
                            }
                            iM2566 = (C2105.m6981("᩶ܳ") ^ i6) * 21;
                            i7 = ((iM2566 ^ i5) * (-3461)) ^ (-777360953);
                            i = 1431176114;
                            i9 = iM2566 ^ i;
                            break;
                        }
                        break;
                    case -1956813282:
                    case -1737278801:
                        final ArrayList arrayList2 = this.f36537;
                        C3537.m10749(arrayList2);
                        if (ServiceConnectionC3453.f10921 < 0) {
                            InterfaceC17664 interfaceC17664MapToObj = map2.mapToObj(new IntFunction() { // from class: l.ۖ۟ܽ
                                @Override // java.util.function.IntFunction
                                public final Object apply(int i10) {
                                    ArrayList arrayList3 = null;
                                    int i11 = 599159505;
                                    int i12 = C1420.f5096;
                                    int i13 = C3432.f10845;
                                    int iM6983 = C2105.m6981("֨ۨ") ^ i13;
                                    int i14 = ((iM6983 ^ i12) * (-9745)) ^ 1470785999;
                                    int i15 = 704289462;
                                    while (true) {
                                        i11 = ((((i11 ^ i12) * 18539) >> 31) & i14) ^ (iM6983 ^ i15);
                                        switch (i11) {
                                            case -1789606628:
                                            case -159656202:
                                                C3432.m10477();
                                                C7106.m19120();
                                                return null;
                                            case -1709554895:
                                            case 1975300139:
                                                if (RunnableC1108.f4040) {
                                                    iM6983 = (C2105.m6981("ܽܿ") + i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                    i14 = ((iM6983 ^ i12) * (-26001)) ^ (-848471234);
                                                    i15 = -450786936;
                                                } else {
                                                    iM6983 = (C0630.m2566("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM6983 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                }
                                                break;
                                            case -1662093346:
                                            case 1414590293:
                                                if (C0798.f2919) {
                                                    iM6983 = C2105.m6981("ܶ᩵") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                } else {
                                                    iM6983 = (i13 - C2105.m6981("᩸ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                    i14 = ((iM6983 ^ i12) * (-14619)) ^ (-1133127215);
                                                    i15 = 1189143193;
                                                }
                                                break;
                                            case -1621434546:
                                            case -686487683:
                                                if (C7811.m20844() != 0) {
                                                    iM6983 = (C0630.m2566("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM6983 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                } else {
                                                    iM6983 = C0630.m2566("ۡ۬") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * 6433) ^ (-1379169166);
                                                    i15 = 1786589636;
                                                }
                                                break;
                                            case -1567032186:
                                            case -1161304849:
                                                if (C1504.f5354) {
                                                    iM6983 = (i13 - C2105.m6981("֨ۚ")) * 35;
                                                    i14 = ((iM6983 ^ i12) * 27629) ^ 811842169;
                                                    i15 = -287880606;
                                                } else {
                                                    iM6983 = (C2105.m6981("ۤ᩶") ^ i13) * (-69);
                                                    i14 = ((iM6983 ^ i12) * 32585) ^ 1671754368;
                                                    i15 = 1154574709;
                                                }
                                                break;
                                            case -385302442:
                                            case 1938486298:
                                                if (C3911.m11924() <= 0) {
                                                    iM6983 = (C0630.m2566("᩶ۢ") + i13) * 7;
                                                    i14 = ((iM6983 ^ i12) * (-9777)) ^ 251382212;
                                                    i15 = 413493077;
                                                } else {
                                                    iM6983 = C2105.m6981("ܶ᩵") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                }
                                                break;
                                            case -352290023:
                                            case 1191910773:
                                                if (C21923.m49329()) {
                                                    iM6983 = C2105.m6981("ۨܺ") ^ i13;
                                                    i14 = ((iM6983 ^ i12) * (-3745)) ^ 209180024;
                                                    i15 = 1113382299;
                                                } else {
                                                    iM6983 = C2105.m6981("ܶ᩵") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                }
                                                break;
                                            case -146252831:
                                            case 1849452491:
                                                RunnableC3474.m10630();
                                                iM6983 = C2105.m6981("ܶ᩵") ^ i12;
                                                i14 = ((iM6983 ^ i13) * 19981) ^ 823230861;
                                                i15 = -1246628707;
                                                break;
                                            case 48687622:
                                            case 754678016:
                                                if (C3019.f9544 >= 0) {
                                                    iM6983 = (C0630.m2566("᩶ۢ") + i13) * 7;
                                                    i14 = ((iM6983 ^ i12) * (-9777)) ^ 251382212;
                                                    i15 = 413493077;
                                                } else {
                                                    iM6983 = C2105.m6981("ۖۤ") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * (-13537)) ^ (-1111338939);
                                                    i15 = 1281078659;
                                                }
                                                break;
                                            case 230825031:
                                            case 796444608:
                                                C0483.m2121();
                                                if (!C3663.f11553) {
                                                    iM6983 = (C0630.m2566("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM6983 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                } else {
                                                    iM6983 = C2105.m6981("ܶ᩵") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                }
                                                break;
                                            case 231216254:
                                            case 699872891:
                                                if (C2105.f7037 != 0) {
                                                    iM6983 = C2105.m6981("ܶ᩵") ^ i12;
                                                    i14 = ((iM6983 ^ i13) * 19981) ^ 823230861;
                                                    i15 = -1246628707;
                                                } else {
                                                    iM6983 = (C2105.m6981("᩻ۙ") ^ i12) * (-71);
                                                    i14 = ((iM6983 ^ i13) * (-5115)) ^ (-1016791725);
                                                    i15 = -1852167972;
                                                }
                                                break;
                                            case 261207257:
                                            case 1851833682:
                                                if (C4117.m12364() != 0) {
                                                    iM6983 = (C0630.m2566("ۡۡ") + i12) * (-105);
                                                    i14 = ((iM6983 ^ i13) * 3757) ^ (-1775127816);
                                                    i15 = -663132294;
                                                } else {
                                                    iM6983 = C2105.m6981("۟ۧ") ^ i13;
                                                    i14 = ((iM6983 ^ i12) * 5621) ^ (-939224233);
                                                    i15 = 1644267453;
                                                }
                                                break;
                                            case 280540561:
                                            case 1181961007:
                                                arrayList3 = arrayList2;
                                                if (C1047.f3863 >= 0) {
                                                    iM6983 = (i13 - C2105.m6981("֨ۚ")) * 35;
                                                    i14 = ((iM6983 ^ i12) * 27629) ^ 811842169;
                                                    i15 = -287880606;
                                                } else {
                                                    iM6983 = (C2105.m6981("ۗ᩷") ^ i12) * 23;
                                                    i14 = ((iM6983 ^ i13) * 20695) ^ (-1285672142);
                                                    i15 = 352752267;
                                                }
                                                break;
                                            case 1148861397:
                                            case 1307795895:
                                                if (C2520.f8000 >= 0) {
                                                    iM6983 = (i13 - C2105.m6981("֨ۚ")) * 35;
                                                    i14 = ((iM6983 ^ i12) * 27629) ^ 811842169;
                                                    i15 = -287880606;
                                                } else {
                                                    iM6983 = (C2105.m6981("᩻ܰ") ^ i13) * (-49);
                                                    i14 = ((iM6983 ^ i12) * 17789) ^ (-1476612971);
                                                    i15 = 1178437826;
                                                }
                                                break;
                                            case 1628863518:
                                            case 2047410686:
                                                if (RunnableC1937.f6483 >= 0) {
                                                    iM6983 = (C0630.m2566("᩶ۢ") + i13) * 7;
                                                    i14 = ((iM6983 ^ i12) * (-9777)) ^ 251382212;
                                                    i15 = 413493077;
                                                } else {
                                                    iM6983 = (C2105.m6981("֡ۙ") + i12) * 13;
                                                    i14 = ((iM6983 ^ i13) * 25455) ^ (-1753674354);
                                                    i15 = 1017461323;
                                                }
                                                break;
                                            default:
                                                return (C8739) C3019.m9263(arrayList3, i10);
                                        }
                                    }
                                }
                            });
                            int i10 = 1;
                            if (!C2272.m7503()) {
                                return interfaceC17664MapToObj.filter(new C16082(i10)).toList();
                            }
                            iM2566 = C2105.m6981("۟ۢ") ^ i5;
                            i7 = ((iM2566 ^ i6) * 23523) ^ 1787064497;
                            i = -2013467150;
                            i9 = iM2566 ^ i;
                        }
                        break;
                    case -1893362482:
                    case -1831514592:
                        InterfaceC11315 interfaceC11315Range2 = C13803.range(i3, this.f36534);
                        if (C1420.f5096 <= 0) {
                            iM2566 = C2105.m6981("ۖ֫") ^ i6;
                            i7 = ((iM2566 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            map2 = interfaceC11315Range2.map(new IntUnaryOperator() { // from class: l.ܺ۟ܽ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C15755.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i11) {
                                    return AbstractActivityC12266.m29771(this.f48721, i11);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C15755.$default$compose(this, intUnaryOperator2);
                                }
                            });
                            if (C0237.f1507 != 0) {
                                iM2566 = C0630.m2566("ܶۧ") ^ i6;
                                i7 = ((iM2566 ^ i5) * (-4117)) ^ (-1158989231);
                                i = 179503604;
                            } else {
                                iM2566 = (C0630.m2566("᩵ܽ") ^ i5) * 75;
                                i7 = ((iM2566 ^ i6) * (-26993)) ^ (-1695339599);
                                i = 1634280586;
                            }
                        }
                        i9 = iM2566 ^ i;
                        break;
                    case -1827229233:
                    case 1703785644:
                        if (this.f36540) {
                            iM6981 = C2105.m6981("֨۠") ^ i6;
                            i7 = ((iM6981 ^ i5) * 24899) ^ 2083044614;
                            i2 = -786488436;
                        } else {
                            iM6981 = (i5 - C2105.m6981("᩹۠")) * (-99);
                            i7 = ((iM6981 ^ i6) * (-24989)) ^ (-372704475);
                            i2 = -1360983333;
                        }
                        i9 = iM6981 ^ i2;
                        i3 = 0;
                        break;
                    case -1750079621:
                    case -624856913:
                        map = interfaceC11315Range.map(intUnaryOperator);
                        arrayList = this.f36537;
                        if (C1773.f6144 <= 0) {
                            iM2566 = C2105.m6981("۟ۢ") ^ i5;
                            i7 = ((iM2566 ^ i6) * 23523) ^ 1787064497;
                            i = -2013467150;
                        } else {
                            iM2566 = (C2105.m6981("ۙ֫") ^ i6) * (-7);
                            i7 = ((iM2566 ^ i5) * 22291) ^ (-208188914);
                            i = -1894768414;
                        }
                        i9 = iM2566 ^ i;
                        break;
                    case -1435906092:
                    case 2066923420:
                        C3019.m9257(arrayList);
                        intFunction = new IntFunction() { // from class: l.ۖ۟ܽ
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i11) {
                                ArrayList arrayList3 = null;
                                int i12 = 599159505;
                                int i13 = C1420.f5096;
                                int i14 = C3432.f10845;
                                int iM6983 = C2105.m6981("֨ۨ") ^ i14;
                                int i15 = ((iM6983 ^ i13) * (-9745)) ^ 1470785999;
                                int i16 = 704289462;
                                while (true) {
                                    i12 = ((((i12 ^ i13) * 18539) >> 31) & i15) ^ (iM6983 ^ i16);
                                    switch (i12) {
                                        case -1789606628:
                                        case -159656202:
                                            C3432.m10477();
                                            C7106.m19120();
                                            return null;
                                        case -1709554895:
                                        case 1975300139:
                                            if (RunnableC1108.f4040) {
                                                iM6983 = (C2105.m6981("ܽܿ") + i14) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i15 = ((iM6983 ^ i13) * (-26001)) ^ (-848471234);
                                                i16 = -450786936;
                                            } else {
                                                iM6983 = (C0630.m2566("ۡۡ") + i13) * (-105);
                                                i15 = ((iM6983 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            }
                                            break;
                                        case -1662093346:
                                        case 1414590293:
                                            if (C0798.f2919) {
                                                iM6983 = C2105.m6981("ܶ᩵") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            } else {
                                                iM6983 = (i14 - C2105.m6981("᩸ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i15 = ((iM6983 ^ i13) * (-14619)) ^ (-1133127215);
                                                i16 = 1189143193;
                                            }
                                            break;
                                        case -1621434546:
                                        case -686487683:
                                            if (C7811.m20844() != 0) {
                                                iM6983 = (C0630.m2566("ۡۡ") + i13) * (-105);
                                                i15 = ((iM6983 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            } else {
                                                iM6983 = C0630.m2566("ۡ۬") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 6433) ^ (-1379169166);
                                                i16 = 1786589636;
                                            }
                                            break;
                                        case -1567032186:
                                        case -1161304849:
                                            if (C1504.f5354) {
                                                iM6983 = (i14 - C2105.m6981("֨ۚ")) * 35;
                                                i15 = ((iM6983 ^ i13) * 27629) ^ 811842169;
                                                i16 = -287880606;
                                            } else {
                                                iM6983 = (C2105.m6981("ۤ᩶") ^ i14) * (-69);
                                                i15 = ((iM6983 ^ i13) * 32585) ^ 1671754368;
                                                i16 = 1154574709;
                                            }
                                            break;
                                        case -385302442:
                                        case 1938486298:
                                            if (C3911.m11924() <= 0) {
                                                iM6983 = (C0630.m2566("᩶ۢ") + i14) * 7;
                                                i15 = ((iM6983 ^ i13) * (-9777)) ^ 251382212;
                                                i16 = 413493077;
                                            } else {
                                                iM6983 = C2105.m6981("ܶ᩵") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            }
                                            break;
                                        case -352290023:
                                        case 1191910773:
                                            if (C21923.m49329()) {
                                                iM6983 = C2105.m6981("ۨܺ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-3745)) ^ 209180024;
                                                i16 = 1113382299;
                                            } else {
                                                iM6983 = C2105.m6981("ܶ᩵") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            }
                                            break;
                                        case -146252831:
                                        case 1849452491:
                                            RunnableC3474.m10630();
                                            iM6983 = C2105.m6981("ܶ᩵") ^ i13;
                                            i15 = ((iM6983 ^ i14) * 19981) ^ 823230861;
                                            i16 = -1246628707;
                                            break;
                                        case 48687622:
                                        case 754678016:
                                            if (C3019.f9544 >= 0) {
                                                iM6983 = (C0630.m2566("᩶ۢ") + i14) * 7;
                                                i15 = ((iM6983 ^ i13) * (-9777)) ^ 251382212;
                                                i16 = 413493077;
                                            } else {
                                                iM6983 = C2105.m6981("ۖۤ") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-13537)) ^ (-1111338939);
                                                i16 = 1281078659;
                                            }
                                            break;
                                        case 230825031:
                                        case 796444608:
                                            C0483.m2121();
                                            if (!C3663.f11553) {
                                                iM6983 = (C0630.m2566("ۡۡ") + i13) * (-105);
                                                i15 = ((iM6983 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            } else {
                                                iM6983 = C2105.m6981("ܶ᩵") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            }
                                            break;
                                        case 231216254:
                                        case 699872891:
                                            if (C2105.f7037 != 0) {
                                                iM6983 = C2105.m6981("ܶ᩵") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 19981) ^ 823230861;
                                                i16 = -1246628707;
                                            } else {
                                                iM6983 = (C2105.m6981("᩻ۙ") ^ i13) * (-71);
                                                i15 = ((iM6983 ^ i14) * (-5115)) ^ (-1016791725);
                                                i16 = -1852167972;
                                            }
                                            break;
                                        case 261207257:
                                        case 1851833682:
                                            if (C4117.m12364() != 0) {
                                                iM6983 = (C0630.m2566("ۡۡ") + i13) * (-105);
                                                i15 = ((iM6983 ^ i14) * 3757) ^ (-1775127816);
                                                i16 = -663132294;
                                            } else {
                                                iM6983 = C2105.m6981("۟ۧ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * 5621) ^ (-939224233);
                                                i16 = 1644267453;
                                            }
                                            break;
                                        case 280540561:
                                        case 1181961007:
                                            arrayList3 = arrayList;
                                            if (C1047.f3863 >= 0) {
                                                iM6983 = (i14 - C2105.m6981("֨ۚ")) * 35;
                                                i15 = ((iM6983 ^ i13) * 27629) ^ 811842169;
                                                i16 = -287880606;
                                            } else {
                                                iM6983 = (C2105.m6981("ۗ᩷") ^ i13) * 23;
                                                i15 = ((iM6983 ^ i14) * 20695) ^ (-1285672142);
                                                i16 = 352752267;
                                            }
                                            break;
                                        case 1148861397:
                                        case 1307795895:
                                            if (C2520.f8000 >= 0) {
                                                iM6983 = (i14 - C2105.m6981("֨ۚ")) * 35;
                                                i15 = ((iM6983 ^ i13) * 27629) ^ 811842169;
                                                i16 = -287880606;
                                            } else {
                                                iM6983 = (C2105.m6981("᩻ܰ") ^ i14) * (-49);
                                                i15 = ((iM6983 ^ i13) * 17789) ^ (-1476612971);
                                                i16 = 1178437826;
                                            }
                                            break;
                                        case 1628863518:
                                        case 2047410686:
                                            if (RunnableC1937.f6483 >= 0) {
                                                iM6983 = (C0630.m2566("᩶ۢ") + i14) * 7;
                                                i15 = ((iM6983 ^ i13) * (-9777)) ^ 251382212;
                                                i16 = 413493077;
                                            } else {
                                                iM6983 = (C2105.m6981("֡ۙ") + i13) * 13;
                                                i15 = ((iM6983 ^ i14) * 25455) ^ (-1753674354);
                                                i16 = 1017461323;
                                            }
                                            break;
                                        default:
                                            return (C8739) C3019.m9263(arrayList3, i11);
                                    }
                                }
                            }
                        };
                        if (!C2126.f7087) {
                            iM2566 = (C2105.m6981("᩵ۙ") + i5) * (-61);
                            i7 = ((iM2566 ^ i6) * 29721) ^ 1080715384;
                            i = -1237735293;
                            i9 = iM2566 ^ i;
                        }
                        break;
                    case -1394624094:
                    case -61535523:
                        C0798.m2998();
                        C0630.m2564();
                        return null;
                    case -795020749:
                    case 1516160351:
                        InterfaceC17664 interfaceC17664M2810 = C0714.m2810(this.f36537);
                        if (C4263.m12819() < 0) {
                            int i11 = 1;
                            if (!C4159.f13567) {
                                break;
                            }
                            return interfaceC17664M2810.filter(new C16082(i11)).toList();
                        }
                        iM2566 = (C0630.m2566("ۧۨ") ^ i5) * 75;
                        i7 = ((iM2566 ^ i6) * (-24577)) ^ 887195557;
                        i = 278565693;
                        i9 = iM2566 ^ i;
                        break;
                    case -683941169:
                    case 248421515:
                        return map.mapToObj(intFunction).toList();
                    case -527220701:
                    case 470113706:
                        if (this.f36533) {
                            iM2566 = C2105.m6981("ܶ֫") ^ i6;
                            i7 = ((iM2566 ^ i5) * (-21895)) ^ (-2081984850);
                            i = 642222605;
                        } else {
                            iM2566 = C0630.m2566("᩷ܺ") ^ i5;
                            i7 = ((iM2566 ^ i6) * (-21887)) ^ 144825096;
                            i = -1308447436;
                        }
                        i9 = iM2566 ^ i;
                        break;
                    case 25418628:
                    case 1624650799:
                        return this.f36537;
                    case 207158853:
                    case 2105763581:
                        C3663.m11168();
                        iM2566 = C2105.m6981("ۖ֫") ^ i6;
                        i7 = ((iM2566 ^ i5) * 7383) ^ 598182428;
                        i = -1080096548;
                        i9 = iM2566 ^ i;
                        break;
                    case 967139011:
                    case 1651806760:
                        if (this.f36540) {
                            iM2566 = C0630.m2566("᩹ܽ") ^ i5;
                            i7 = ((iM2566 ^ i6) * (-21217)) ^ 1811285808;
                            i = 1530593667;
                        } else {
                            iM2566 = (C2105.m6981("ۜۘ") + i6) * (-35);
                            i7 = ((iM2566 ^ i5) * 32341) ^ (-778830721);
                            i = -604779265;
                        }
                        i9 = iM2566 ^ i;
                        break;
                    case 1232682001:
                    case 1813564987:
                        if (C7811.f24123 < 0) {
                            iM2566 = C2105.m6981("ۖ֫") ^ i6;
                            i7 = ((iM2566 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            iM2566 = C2105.m6981("۟ۢ") ^ i5;
                            i7 = ((iM2566 ^ i6) * 23523) ^ 1787064497;
                            i = -2013467150;
                        }
                        i9 = iM2566 ^ i;
                        break;
                    case 1240330175:
                    case 1940856145:
                        C3683.m11222();
                        if (C0050.m940() > 0) {
                            iM2566 = C2105.m6981("ۖ֫") ^ i6;
                            i7 = ((iM2566 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            iM2566 = (C0630.m2566("ۧۨ") ^ i5) * 75;
                            i7 = ((iM2566 ^ i6) * (-24577)) ^ 887195557;
                            i = 278565693;
                        }
                        i9 = iM2566 ^ i;
                        break;
                    default:
                        C1916.m6308();
                        if (C0964.f3626 == 0) {
                            iM2566 = C2105.m6981("ۖ֫") ^ i6;
                            i7 = ((iM2566 ^ i5) * 7383) ^ 598182428;
                            i = -1080096548;
                        } else {
                            iM2566 = C0630.m2566("ܶۧ") ^ i6;
                            i7 = ((iM2566 ^ i5) * (-4117)) ^ (-1158989231);
                            i = 179503604;
                        }
                        i9 = iM2566 ^ i;
                        break;
                }
            }
            iM6982 = C2105.m6981("۟ۚ") ^ i5;
            i7 = ((iM6982 ^ i6) * (-24421)) ^ (-364119369);
            i8 = -1035338704;
        }
    }

    static {
        AbstractC15440 abstractC15440 = null;
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
        int i7 = C1128.f4106;
        int i8 = C3746.f11829;
        int iM2566 = (C0630.m2566("ۛۤ") ^ i8) * (-13);
        int i9 = ((iM2566 ^ i7) * (-19207)) ^ 866237809;
        int i10 = 1665997497;
        while (true) {
            i6 = ((((i6 ^ i7) * (-11871)) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1917890018:
                case 40907422:
                    f36525 = C3663.m11176(abstractC15440, C22628.m50602(sArr2, i4, i5, i3));
                    return;
                case -1912698471:
                case 1495497545:
                    i2 = i * i;
                    s2 = 36096;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ۙ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        iM2566 = (C2105.m6981("ۜۘ") + i8) * (-79);
                        i9 = ((iM2566 ^ i7) * (-6481)) ^ (-720021226);
                        i10 = -199696591;
                    }
                    break;
                case -1864431450:
                case -483252525:
                    i5 = 6;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    } else {
                        iM2566 = (C2105.m6981("ܿۧ") ^ i8) * (-31);
                        i9 = ((iM2566 ^ i7) * 7777) ^ (-728105627);
                        i10 = 101487571;
                    }
                    break;
                case -1766050085:
                case 1793954577:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((iM2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM2566 = (C0630.m2566("ۚ᩺") ^ i8) * 127;
                        i9 = ((iM2566 ^ i7) * 12981) ^ (-1771433130);
                        i10 = 805563330;
                    }
                    break;
                case -1514235043:
                case -1066182944:
                    sArr = f36523;
                    c = 0;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((iM2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM2566 = (C0630.m2566("ۧܳ") ^ i7) * (-85);
                        i9 = ((iM2566 ^ i8) * (-2293)) ^ (-212618402);
                        i10 = -1918724625;
                    }
                    break;
                case -1508216992:
                case 905623481:
                    if (C2167.f7158 < 0) {
                        iM2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((iM2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    }
                    break;
                case -1505638493:
                case 329072830:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM2566 = (C2105.m6981("᩷֨") + i8) * (-97);
                        i9 = ((iM2566 ^ i7) * 323) ^ (-641349883);
                        i10 = -510887060;
                    }
                    break;
                case -1326620288:
                case 995190875:
                    abstractC15440 = C16293.f50117;
                    sArr2 = f36523;
                    if (C7106.m19120() <= 0) {
                        iM2566 = C0630.m2566("ۙ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        iM2566 = (C0630.m2566("ۖܳ") + i7) * 81;
                        i9 = ((iM2566 ^ i8) * (-23393)) ^ (-1860901729);
                        i10 = -1922012804;
                    }
                    break;
                case -1229580000:
                case 942225761:
                    if (i2 - (s * s2) < 0) {
                        iM2566 = C0630.m2566("᩶۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-13179)) ^ (-1501453135);
                        i10 = 825262515;
                    } else {
                        iM2566 = (C2105.m6981("ۘܰ") + i7) * 27;
                        i9 = ((iM2566 ^ i8) * (-20823)) ^ 2027049039;
                        i10 = -1918137173;
                    }
                    break;
                case -988907167:
                case -560757112:
                    s = sArr[c];
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM2566 = (C0630.m2566("۟֡") ^ i8) * (-31);
                        i9 = ((iM2566 ^ i7) * 7163) ^ (-69023048);
                        i10 = 1128759285;
                    }
                    break;
                case -924830062:
                case 2145937087:
                    i = s + 9024;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM2566 = C0630.m2566("᩹ۛ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-25357)) ^ 180982989;
                        i10 = 1369720579;
                    }
                    break;
                case -703191382:
                case 1475015267:
                    i3 = 16744;
                    iM2566 = C0630.m2566("᩸ܺ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 25937) ^ (-1145486524);
                    i10 = -1200988790;
                    break;
                case -636418864:
                case 1046502345:
                    if (!C4159.f13567) {
                        iM2566 = C0630.m2566("ۙ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-3317)) ^ 495550739;
                        i10 = -1868089704;
                    } else {
                        iM2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-10391)) ^ 867913005;
                        i10 = 12374655;
                    }
                    break;
                case -556258523:
                case -402777178:
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("ܳ֡") + i8) * (-7);
                        i9 = ((iM2566 ^ i7) * (-16523)) ^ (-317515707);
                        i10 = 959977129;
                    } else {
                        iM2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((iM2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    }
                    break;
                case -38203752:
                case 154195634:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ۧ֡") + i7) * (-103);
                        i9 = ((iM2566 ^ i8) * (-4453)) ^ (-918123500);
                        i10 = -1394026405;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۧ᩵")) * 19;
                        i9 = ((iM2566 ^ i8) * 24091) ^ (-1585591040);
                        i10 = 2133409062;
                    }
                    break;
                case 137891527:
                case 2082322127:
                    C4159.m12565();
                    throw new RuntimeException();
                case 326758729:
                case 1806203083:
                    i3 = 38856;
                    iM2566 = C0630.m2566("᩸ܺ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 25937) ^ (-1145486524);
                    i10 = -1200988790;
                    break;
                case 700190950:
                case 1065067273:
                    i4 = 1;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ۛ۬") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7599)) ^ 141069526;
                        i10 = -1640437150;
                    } else {
                        iM2566 = C2105.m6981("᩷۠") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-18005)) ^ (-180540231);
                        i10 = -2048371329;
                    }
                    break;
                default:
                    C4616.m13552();
                    C3746.m11369();
                    iM2566 = C2105.m6981("ۛ۫") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-10391)) ^ 867913005;
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
        int iM6981;
        int i2;
        int i3;
        int i4 = 0;
        final C8739 c8739 = null;
        final C3094 c3094 = null;
        String str = null;
        C10235 c10235 = null;
        boolean z = false;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        String str2 = null;
        C10235 c10236 = null;
        int i5 = -1299363156;
        int i6 = AbstractC2021.f6743;
        int i7 = C0714.f2697;
        int iM2566 = C0630.m2566("ۚ֨") ^ i7;
        int i8 = ((iM2566 ^ i6) * 30147) ^ (-1313049031);
        int i9 = -83044687;
        while (true) {
            int i10 = iM2566 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * (-29063)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2006008532:
                    case -953220651:
                        str = c8739.f26609;
                        c10235 = c3094.f9673;
                        C21923.m49331(c10235, str);
                        z = true;
                        if (C4117.m12364() != 0) {
                            iM6981 = C0630.m2566("ۜ᩹") ^ i7;
                            i2 = ((iM6981 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM6981 = (C2105.m6981("ܽ۟") ^ i6) * (-65);
                            i2 = ((iM6981 ^ i7) * (-7907)) ^ 2043919401;
                            i3 = -1023920360;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1900373990:
                    case 1033651315:
                        i4 = this.f36531[i];
                        iM6981 = C0630.m2566("ܿᩳ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 9633) ^ (-1453078870);
                        i3 = 1302010640;
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1865511019:
                    case 2124183591:
                        if (this.f36533) {
                            iM6981 = C2105.m6981("ᩳۜ") ^ i7;
                            i2 = ((iM6981 ^ i6) * (-18983)) ^ (-183828522);
                            i3 = 16169166;
                        } else {
                            i4 = i;
                            iM6981 = C0630.m2566("ܿᩳ") ^ i6;
                            i2 = ((iM6981 ^ i7) * 9633) ^ (-1453078870);
                            i3 = 1302010640;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1830244957:
                    case 668517328:
                        this.f36535 = -1;
                        m29790(i4, view);
                        break;
                    case -1615694473:
                    case 895806000:
                        ServiceConnectionC3453.m10564();
                        if (!C0630.m2564()) {
                            iM2566 = C2105.m6981("ܽۢ") ^ i7;
                            i8 = ((iM2566 ^ i6) * (-13303)) ^ (-1613093226);
                            i9 = -1359248534;
                        } else {
                            iM6981 = C2105.m6981("۟ۛ") ^ i6;
                            i2 = ((iM6981 ^ i7) * (-1257)) ^ (-954969392);
                            i3 = -1354567148;
                            i10 = iM6981 ^ i3;
                            i8 = i2;
                        }
                        break;
                    case -1572638933:
                    case -1015339652:
                        C3245.m9925();
                        ServiceConnectionC3453.m10564();
                        break;
                    case -1503263806:
                    case 287074939:
                        C4159.m12565();
                        iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                        i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                        i3 = -2071181861;
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1155833373:
                    case 1069983792:
                        c3094 = new C3094(this);
                        C1047.m3601(c3094.f9675, c8739.m22597());
                        if (C0630.f2410 <= 0) {
                            iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                            i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        } else {
                            iM6981 = (i7 - C0630.m2566("۬ۖ")) * (-83);
                            i2 = ((iM6981 ^ i6) * (-18477)) ^ 1923217765;
                            i3 = 1422716123;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1143810793:
                    case 548699698:
                        if (!C2126.f7087) {
                            iM2566 = C0630.m2566("᩶֨") ^ i7;
                            i8 = ((iM2566 ^ i6) * 29999) ^ (-2007143827);
                            i9 = -1622128236;
                        }
                        iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                        i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                        i3 = -2071181861;
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1082603522:
                    case -1050292420:
                        if (RunnableC1108.f4040) {
                            iM6981 = (C0630.m2566("ۢ֨") + i7) * (-29);
                            i2 = ((iM6981 ^ i6) * 15985) ^ (-1783763885);
                            i3 = -2123173504;
                        } else {
                            iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                            i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -1057551829:
                    case 1967330978:
                        if (C1047.f3863 >= 0) {
                            iM6981 = C0630.m2566("ۜ᩹") ^ i7;
                            i2 = ((iM6981 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM6981 = (C2105.m6981("ۜ᩸") + i6) * 95;
                            i2 = ((iM6981 ^ i7) * 10647) ^ (-85775801);
                            i3 = -152504420;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -814863481:
                    case -363124593:
                        if (this.f36540) {
                            iM6981 = (i7 - C0630.m2566("ۛۨ")) * 3;
                            i2 = ((iM6981 ^ i6) * (-17635)) ^ (-261138732);
                            i3 = 939659699;
                        } else {
                            iM6981 = (C0630.m2566("֡ܽ") ^ i7) * (-117);
                            i2 = ((iM6981 ^ i6) * (-27381)) ^ (-2024635349);
                            i3 = 1318050440;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -762191021:
                    case 1269617121:
                        C21923.m49331(c10236, str);
                        C1128.m3853(C7811.m20839(dialogInterfaceC0206), 8);
                        iM2566 = (i6 - C0630.m2566("ۡۘ")) * 57;
                        i8 = ((iM2566 ^ i7) * 11473) ^ 1917421488;
                        i9 = 1998905520;
                        break;
                    case -669520546:
                    case -548730211:
                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                            iM6981 = C0630.m2566("ۜ᩹") ^ i7;
                            i2 = ((iM6981 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM6981 = (i7 - C2105.m6981("᩸ܳ")) * (-65);
                            i2 = ((iM6981 ^ i6) * 21515) ^ 1277715680;
                            i3 = -256782363;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case -291395859:
                    case 1022104508:
                        c10236.mo25922(0, c10236.m30526());
                        C4925.m14329(c10236);
                        break;
                    case -130274161:
                    case 82750830:
                        mo29796(c8739.f26610);
                        break;
                    case 92452688:
                    case 2048386133:
                        if (C0422.f1886 <= 0) {
                            iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                            i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        } else {
                            iM6981 = (i6 - C0630.m2566("ܽ۠")) * 101;
                            i2 = ((iM6981 ^ i7) * 12557) ^ 1487138002;
                            i3 = 1751195971;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case 296087045:
                    case 642981789:
                        C22628.m50616(c10236, str2);
                        C4159.m12564(C7811.m20839(dialogInterfaceC0206), new View.OnClickListener() { // from class: l.᩶۟ܽ
                            {
                                int i11 = 434316898;
                                int i12 = C5695.f17556;
                                int i13 = C3537.f11231;
                                int iM6982 = (i12 - C2105.m6981("ܿۚ")) * (-75);
                                int i14 = ((iM6982 ^ i13) * 23797) ^ (-410926004);
                                int i15 = 1479672326;
                                while (true) {
                                    i11 = ((((i11 ^ i13) * 11179) >> 31) & i14) ^ (iM6982 ^ i15);
                                    switch (i11) {
                                        case -2031327845:
                                        case -181390582:
                                            C3746.m11369();
                                            iM6982 = (C2105.m6981("ۤۜ") + i12) * 3;
                                            i14 = ((iM6982 ^ i13) * 23875) ^ 233911378;
                                            i15 = -50645245;
                                            break;
                                        case -1949665300:
                                        case 1180596678:
                                            if (!AbstractC2021.m6574()) {
                                                iM6982 = (i12 - C2105.m6981("ۤᩳ")) * 95;
                                                i14 = ((iM6982 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM6982 = C2105.m6981("ᩳ۫") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            }
                                            break;
                                        case -1811771157:
                                        case -845033576:
                                            if (C1420.f5096 <= 0) {
                                                iM6982 = (i12 - C2105.m6981("ۛۧ")) * 115;
                                                i14 = ((iM6982 ^ i13) * 23295) ^ (-782053105);
                                                i15 = 78283389;
                                            } else {
                                                iM6982 = (C0630.m2566("᩺᩸") + i12) * (-9);
                                                i14 = ((iM6982 ^ i13) * 16089) ^ 1445371586;
                                                i15 = -456810223;
                                            }
                                            break;
                                        case -1683239728:
                                        case -838108108:
                                            if (C3432.f10845 >= 0) {
                                                iM6982 = C0630.m2566("ᩳ᩷") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 23041) ^ 55680639;
                                                i15 = 943638593;
                                            } else {
                                                iM6982 = (C2105.m6981("֡᩸") ^ i13) * 33;
                                                i14 = ((iM6982 ^ i12) * 16255) ^ (-1798635680);
                                                i15 = 1584196050;
                                            }
                                            break;
                                        case -1333168364:
                                        case 1367275389:
                                            if (C3746.f11829 <= 0) {
                                                iM6982 = (i12 - C2105.m6981("ۤᩳ")) * 95;
                                                i14 = ((iM6982 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM6982 = C2105.m6981("ۨۨ") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 11809) ^ 610473422;
                                                i15 = 471342802;
                                            }
                                            break;
                                        case -1329994515:
                                        case 1362967557:
                                            if (C3746.m11369() >= 0) {
                                                iM6982 = C2105.m6981("ᩳ۫") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            } else {
                                                iM6982 = C2105.m6981("ۢ۫") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 13273) ^ 445392711;
                                                i15 = 446899070;
                                            }
                                            break;
                                        case -1241531519:
                                        case 117107519:
                                            if (C1420.f5096 <= 0) {
                                                iM6982 = (i12 - C2105.m6981("ۤᩳ")) * 95;
                                                i14 = ((iM6982 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM6982 = C2105.m6981("᩵ܳ") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 8077) ^ 975592451;
                                                i15 = 591357757;
                                            }
                                            break;
                                        case -1026104379:
                                        case 524127634:
                                            if (C0237.f1507 == 0) {
                                                iM6982 = C0630.m2566("ᩳ᩷") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 23041) ^ 55680639;
                                                i15 = 943638593;
                                            } else {
                                                iM6982 = C2105.m6981("ᩳ۫") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            }
                                            break;
                                        case -812984253:
                                        case 1284199511:
                                            return;
                                        case -651209334:
                                        case 15232440:
                                            if (C4117.f13076 <= 0) {
                                                iM6982 = (C2105.m6981("ۤۜ") + i12) * 3;
                                                i14 = ((iM6982 ^ i13) * 23875) ^ 233911378;
                                                i15 = -50645245;
                                            } else {
                                                iM6982 = C0630.m2566("ۜ۬") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 1781) ^ (-1353205864);
                                                i15 = 1572768979;
                                            }
                                            break;
                                        case -523155239:
                                        case -85625066:
                                            if (C1773.f6144 <= 0) {
                                                iM6982 = (C2105.m6981("ۤۜ") + i12) * 3;
                                                i14 = ((iM6982 ^ i13) * 23875) ^ 233911378;
                                                i15 = -50645245;
                                            } else {
                                                iM6982 = (C2105.m6981("ܿۖ") + i13) * (-95);
                                                i14 = ((iM6982 ^ i12) * (-14167)) ^ (-1364498920);
                                                i15 = -1644089120;
                                            }
                                            break;
                                        case -377189777:
                                        case 469694569:
                                            C3432.m10477();
                                            if (C3663.m11168() < 0) {
                                                iM6982 = C2105.m6981("ᩳ۫") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 21447) ^ (-1546468174);
                                                i15 = 1465275145;
                                            } else {
                                                iM6982 = (C2105.m6981("ۤۜ") + i12) * 3;
                                                i14 = ((iM6982 ^ i13) * 23875) ^ 233911378;
                                                i15 = -50645245;
                                            }
                                            break;
                                        case -141238432:
                                        case 571640595:
                                            if (RunnableC3474.m10630()) {
                                                iM6982 = (C2105.m6981("ۢۢ") + i13) * (-67);
                                                i14 = ((iM6982 ^ i12) * 16409) ^ (-674950983);
                                                i15 = 1356036021;
                                            } else {
                                                iM6982 = (i12 - C2105.m6981("ۛۧ")) * 115;
                                                i14 = ((iM6982 ^ i13) * 23295) ^ (-782053105);
                                                i15 = 78283389;
                                            }
                                            break;
                                        case 406963505:
                                        case 1278718674:
                                            if (C1047.f3863 >= 0) {
                                                iM6982 = (i12 - C2105.m6981("ۤᩳ")) * 95;
                                                i14 = ((iM6982 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM6982 = C2105.m6981("ۧۖ") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 32523) ^ (-1716995895);
                                                i15 = 828938332;
                                            }
                                            break;
                                        case 995934574:
                                        case 1012291081:
                                            C3746.m11369();
                                            throw new RuntimeException();
                                        default:
                                            if (C2272.f7362) {
                                                iM6982 = (i12 - C2105.m6981("ۤᩳ")) * 95;
                                                i14 = ((iM6982 ^ i13) * 26231) ^ 1884727337;
                                                i15 = 405169962;
                                            } else {
                                                iM6982 = (C2105.m6981("ܶۡ") ^ i12) * (-79);
                                                i14 = ((iM6982 ^ i13) * (-13175)) ^ (-661347570);
                                                i15 = 2070951825;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C8739 c87310 = null;
                                String str3 = null;
                                C3094 c3095 = null;
                                AbstractActivityC12266 abstractActivityC12266 = null;
                                C12971 c12971 = null;
                                int i11 = -1206866439;
                                int i12 = C2520.f8000;
                                int i13 = C1773.f6144;
                                int iM6982 = (C2105.m6981("᩹ۢ") ^ i12) * 93;
                                int i14 = ((iM6982 ^ i13) * 7073) ^ 1343526256;
                                int i15 = 405710216;
                                while (true) {
                                    i11 = ((((i11 ^ i13) * 12807) >> 31) & i14) ^ (iM6982 ^ i15);
                                    switch (i11) {
                                        case -1847030786:
                                        case 2007557633:
                                            c12971.notifyDataSetChanged();
                                            if (C3683.f11629 >= 0) {
                                                iM6982 = (C2105.m6981("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM6982 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            } else {
                                                iM6982 = C2105.m6981("ܶۤ") ^ i13;
                                                i14 = ((iM6982 ^ i12) * 16011) ^ (-1470545745);
                                                i15 = 829678834;
                                            }
                                            break;
                                        case -1708723026:
                                        case -1540541759:
                                            if (C2520.m8026()) {
                                                iM6982 = C2105.m6981("ۢ۬") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            } else {
                                                iM6982 = (i13 - C2105.m6981("ۗ᩷")) * 29;
                                                i14 = ((iM6982 ^ i12) * 19277) ^ 1196446929;
                                                i15 = 95449220;
                                            }
                                            break;
                                        case -1347186021:
                                        case -205507621:
                                            c87310 = c8739;
                                            if (C4159.m12565() >= 0) {
                                                iM6982 = C2105.m6981("ۢ۬") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            } else {
                                                iM6982 = (C2105.m6981("ܰܰ") ^ i12) * 97;
                                                i14 = ((iM6982 ^ i13) * 531) ^ (-116683928);
                                                i15 = -1493898896;
                                            }
                                            break;
                                        case -1241882068:
                                        case 835148473:
                                            C22628.m50615();
                                            iM6982 = C2105.m6981("ۢ۬") ^ i12;
                                            i14 = ((iM6982 ^ i13) * 3629) ^ 169170384;
                                            i15 = 1429897079;
                                            break;
                                        case -1117300879:
                                        case -560043159:
                                            C0630.m2564();
                                            break;
                                        case -1044716794:
                                        case 1011990912:
                                            if (C2272.f7362) {
                                                iM6982 = (i13 - C2105.m6981("᩸ۡ")) * 3;
                                                i14 = ((iM6982 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM6982 = C0630.m2566("᩺ۢ") ^ i12;
                                                i14 = ((iM6982 ^ i13) * (-29353)) ^ (-1376204608);
                                                i15 = 1118764915;
                                            }
                                            break;
                                        case -1032361609:
                                        case 278295544:
                                            c87310.m22593(str3);
                                            c3095 = c3094;
                                            if (RunnableC1937.f6483 >= 0) {
                                                iM6982 = (C2105.m6981("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM6982 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            } else {
                                                iM6982 = C0630.m2566("۫ܿ") ^ i13;
                                                i14 = ((iM6982 ^ i12) * (-2703)) ^ (-2120860466);
                                                i15 = 940662274;
                                            }
                                            break;
                                        case -999382102:
                                        case -431527288:
                                            if (C1504.f5354) {
                                                iM6982 = (C2105.m6981("ۙ۟") + i13) * 39;
                                                i14 = ((iM6982 ^ i12) * (-23877)) ^ (-88282423);
                                                i15 = 925643500;
                                            } else {
                                                iM6982 = C2105.m6981("ۢ۬") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            }
                                            break;
                                        case -922153841:
                                        case 1218242345:
                                            if (C4117.f13076 <= 0) {
                                                iM6982 = (i13 - C2105.m6981("᩸ۡ")) * 3;
                                                i14 = ((iM6982 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM6982 = (C0630.m2566("᩻ۖ") + i13) * 15;
                                                i14 = ((iM6982 ^ i12) * 16625) ^ 1865797147;
                                                i15 = 1317604996;
                                            }
                                            break;
                                        case -633053231:
                                        case 701988264:
                                            C2167.m7155();
                                            if (C3911.f12484 >= 0) {
                                                iM6982 = (i13 - C2105.m6981("᩸ۡ")) * 3;
                                                i14 = ((iM6982 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM6982 = C2105.m6981("ۢ۬") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 3629) ^ 169170384;
                                                i15 = 1429897079;
                                            }
                                            break;
                                        case 380428864:
                                        case 1594201400:
                                            abstractActivityC12266 = c3095.f9676;
                                            c12971 = abstractActivityC12266.f36539;
                                            if (C1504.f5354) {
                                                iM6982 = (i13 - C2105.m6981("᩸ۡ")) * 3;
                                                i14 = ((iM6982 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            } else {
                                                iM6982 = C2105.m6981("ۜܿ") ^ i12;
                                                i14 = ((iM6982 ^ i13) * (-16053)) ^ (-48883724);
                                                i15 = -66259530;
                                            }
                                            break;
                                        case 533619562:
                                        case 1904646145:
                                            abstractActivityC12266.m29792();
                                            C3663.m11167(c3095.f9672);
                                            break;
                                        case 1323918554:
                                        case 1651191049:
                                            if (C2272.f7362) {
                                                iM6982 = C0630.m2566("ܶۖ") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 11879) ^ (-609600980);
                                                i15 = 1338674590;
                                            } else {
                                                iM6982 = C2105.m6981("᩻ۘ") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 19801) ^ (-1835405483);
                                                i15 = -2049864161;
                                            }
                                            break;
                                        case 1338074276:
                                        case 1472931146:
                                            str3 = null;
                                            if (C3537.m10746() <= 0) {
                                                iM6982 = (C2105.m6981("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM6982 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            } else {
                                                iM6982 = C2105.m6981("ܺ᩻") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 14481) ^ (-546921380);
                                                i15 = -1691205331;
                                            }
                                            break;
                                        case 1473076243:
                                        case 1746975242:
                                            if (C1420.f5096 <= 0) {
                                                iM6982 = C0630.m2566("ܶۖ") ^ i12;
                                                i14 = ((iM6982 ^ i13) * 11879) ^ (-609600980);
                                                i15 = 1338674590;
                                            } else {
                                                iM6982 = (i13 - C2105.m6981("᩸ۡ")) * 3;
                                                i14 = ((iM6982 ^ i12) * 19767) ^ (-580173664);
                                                i15 = -1108793058;
                                            }
                                            break;
                                        default:
                                            if (C1504.m5179()) {
                                                iM6982 = (i13 - C0630.m2566("ۗᩴ")) * (-117);
                                                i14 = ((iM6982 ^ i12) * 23985) ^ (-109573839);
                                                i15 = -1618020301;
                                            } else {
                                                iM6982 = (C2105.m6981("ۚ᩶") ^ i12) * 127;
                                                i14 = ((iM6982 ^ i13) * 27115) ^ (-1314688445);
                                                i15 = 776972146;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM2566 = (i6 - C0630.m2566("ۡۘ")) * 57;
                        i8 = ((iM2566 ^ i7) * 11473) ^ 1917421488;
                        i9 = 1998905520;
                        break;
                        break;
                    case 456224647:
                    case 588701671:
                        c8739 = (C8739) C3019.m9263(this.f36537, i4);
                        if (c8739.m22600()) {
                            iM6981 = C2105.m6981("᩹۟") ^ i6;
                            i2 = ((iM6981 ^ i7) * 20881) ^ 728543865;
                            i3 = 1380391275;
                        } else {
                            iM6981 = (C0630.m2566("۟ۚ") + i6) * (-79);
                            i2 = ((iM6981 ^ i7) * (-7229)) ^ 1061194209;
                            i3 = -1421675151;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case 772622075:
                    case 1899556516:
                        if (C1420.f5096 <= 0) {
                            iM6981 = C2105.m6981("۟ۛ") ^ i6;
                            i2 = ((iM6981 ^ i7) * (-1257)) ^ (-954969392);
                            i3 = -1354567148;
                        } else {
                            iM6981 = (C2105.m6981("ܶۘ") + i7) * (-121);
                            i2 = ((iM6981 ^ i6) * 23627) ^ (-484676421);
                            i3 = -1179814743;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case 1011044839:
                    case 1963076180:
                        c10235.m30407(z);
                        dialogInterfaceC0206 = c3094.f9672;
                        dialogInterfaceC0206.m1449();
                        Button buttonM49343 = C21923.m49343(dialogInterfaceC0206);
                        if (C1005.m3501()) {
                            C2126.m7039(buttonM49343, new View.OnClickListener() { // from class: l.᩹۟ܽ

                                /* JADX INFO: renamed from: ۛ֡ۜ, reason: not valid java name and contains not printable characters */
                                private static final short[] f71848 = {9072, -24500, -26522, -22631};

                                {
                                    int i11 = 927090723;
                                    int i12 = ViewOnClickListenerC1958.f6529;
                                    int i13 = C0422.f1886;
                                    int iM6982 = (C2105.m6981("ۖܽ") ^ i13) * (-119);
                                    int i14 = ((iM6982 ^ i12) * 16127) ^ 441251135;
                                    int i15 = -693521931;
                                    while (true) {
                                        i11 = ((((i11 ^ i12) * (-4799)) >> 31) & i14) ^ (iM6982 ^ i15);
                                        switch (i11) {
                                            case -2012546230:
                                            case 488692249:
                                                if (C0483.f2088 >= 0) {
                                                    iM6982 = (C0630.m2566("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM6982 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM6982 = (C2105.m6981("ۨ᩷") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                    i14 = ((iM6982 ^ i13) * 5645) ^ 1717471222;
                                                    i15 = 1872005417;
                                                }
                                                break;
                                            case -1913286193:
                                            case 1462533512:
                                                return;
                                            case -1801237731:
                                            case 159385286:
                                                if (C2167.f7158 >= 0) {
                                                    iM6982 = (C2105.m6981("᩺֨") ^ i13) * 101;
                                                    i14 = ((iM6982 ^ i12) * (-25795)) ^ 1261811619;
                                                    i15 = -1096867894;
                                                } else {
                                                    iM6982 = (C0630.m2566("ۜ᩶") ^ i12) * (-45);
                                                    i14 = ((iM6982 ^ i13) * (-25429)) ^ 1799846233;
                                                    i15 = -592855119;
                                                }
                                                break;
                                            case -1793063293:
                                            case 1292834876:
                                                if (C2520.m8026()) {
                                                    iM6982 = C0630.m2566("֨᩶") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-32115)) ^ 313192778;
                                                    i15 = -69177869;
                                                } else {
                                                    iM6982 = C0630.m2566("᩷۬") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-28499)) ^ 1870754464;
                                                    i15 = -1793201765;
                                                }
                                                break;
                                            case -1247568095:
                                            case 125964194:
                                                if (C2520.f8000 >= 0) {
                                                    iM6982 = (C0630.m2566("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM6982 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM6982 = (C2105.m6981("᩺֨") ^ i13) * 101;
                                                    i14 = ((iM6982 ^ i12) * (-25795)) ^ 1261811619;
                                                    i15 = -1096867894;
                                                }
                                                break;
                                            case -1183277567:
                                            case 1524010698:
                                                if (C2126.f7087) {
                                                    iM6982 = (C0630.m2566("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM6982 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM6982 = C2105.m6981("ᩳᩳ") ^ i12;
                                                    i14 = ((iM6982 ^ i13) * (-31447)) ^ (-482118784);
                                                    i15 = -2103989198;
                                                }
                                                break;
                                            case -1126828125:
                                            case -53674493:
                                                if (C3663.f11553) {
                                                    iM6982 = C0630.m2566("֨᩶") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-32115)) ^ 313192778;
                                                    i15 = -69177869;
                                                } else {
                                                    iM6982 = C0630.m2566("ۡܺ") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * 31677) ^ 134000280;
                                                    i15 = -1584201351;
                                                }
                                                break;
                                            case -1064827358:
                                            case 1651359543:
                                                C3245.m9925();
                                                iM6982 = (C2105.m6981("᩺֨") ^ i13) * 101;
                                                i14 = ((iM6982 ^ i12) * (-25795)) ^ 1261811619;
                                                i15 = -1096867894;
                                                break;
                                            case -692631963:
                                            case 1203108131:
                                                if (C1420.f5096 <= 0) {
                                                    iM6982 = C2105.m6981("ۘܶ") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-31079)) ^ (-473388165);
                                                    i15 = -1864277227;
                                                } else {
                                                    iM6982 = (C0630.m2566("ܳ᩸") + i12) * (-103);
                                                    i14 = ((iM6982 ^ i13) * 17051) ^ 1941266725;
                                                    i15 = 884545052;
                                                }
                                                break;
                                            case -485759172:
                                            case 847436014:
                                                RunnableC0588.m2441();
                                                if (C3245.f10203 <= 0) {
                                                    iM6982 = C2105.m6981("ۘܶ") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-31079)) ^ (-473388165);
                                                    i15 = -1864277227;
                                                } else {
                                                    iM6982 = (C0630.m2566("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM6982 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                }
                                                break;
                                            case -449732118:
                                            case 301820512:
                                                if (C5695.f17556 >= 0) {
                                                    iM6982 = C0630.m2566("֨᩶") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-32115)) ^ 313192778;
                                                    i15 = -69177869;
                                                } else {
                                                    iM6982 = (C0630.m2566("֫۟") ^ i13) * (-87);
                                                    i14 = ((iM6982 ^ i12) * 25601) ^ 92576905;
                                                    i15 = -1661210833;
                                                }
                                                break;
                                            case -379423066:
                                            case -319902899:
                                                if (C22628.m50615() != 0) {
                                                    iM6982 = (C0630.m2566("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM6982 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM6982 = (C2105.m6981("ܶ۟") ^ i13) * 5;
                                                    i14 = ((iM6982 ^ i12) * 20593) ^ (-1340955104);
                                                    i15 = 1572119549;
                                                }
                                                break;
                                            case -303321938:
                                            case 1831401217:
                                                ViewOnClickListenerC1958.m6429();
                                                throw new RuntimeException();
                                            case 146632593:
                                            case 456418674:
                                                if (C1047.f3863 >= 0) {
                                                    iM6982 = (C0630.m2566("ܿۜ") ^ i12) * 21;
                                                    i14 = ((iM6982 ^ i13) * 11473) ^ (-2112995178);
                                                    i15 = -2071381467;
                                                } else {
                                                    iM6982 = (C2105.m6981("ۗ᩺") ^ i13) * 37;
                                                    i14 = ((iM6982 ^ i12) * (-27387)) ^ (-197618390);
                                                    i15 = 246634711;
                                                }
                                                break;
                                            case 1186164365:
                                            case 2108360843:
                                                if (C4075.f12947 >= 0) {
                                                    iM6982 = C2105.m6981("ۘܶ") ^ i13;
                                                    i14 = ((iM6982 ^ i12) * (-31079)) ^ (-473388165);
                                                    i15 = -1864277227;
                                                } else {
                                                    iM6982 = C2105.m6981("ᩳ᩷") ^ i12;
                                                    i14 = ((iM6982 ^ i13) * 22661) ^ 808204581;
                                                    i15 = -1056903984;
                                                }
                                                break;
                                            default:
                                                if (C2958.m9034() <= 0) {
                                                    iM6982 = (C2105.m6981("᩺֨") ^ i13) * 101;
                                                    i14 = ((iM6982 ^ i12) * (-25795)) ^ 1261811619;
                                                    i15 = -1096867894;
                                                } else {
                                                    iM6982 = C2105.m6981("ۙۤ") ^ i12;
                                                    i14 = ((iM6982 ^ i13) * (-3613)) ^ 1629486257;
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
                                    int iM2567;
                                    int i11;
                                    int i12;
                                    int iM2568;
                                    int i13;
                                    short[] sArr;
                                    ViewOnClickListenerC22144 viewOnClickListenerC22144 = this;
                                    int i14 = 853964741;
                                    int i15 = C3432.f10845;
                                    int i16 = C3746.f11829;
                                    int iM2569 = (C0630.m2566("ᩳ᩺") ^ i15) * (-29);
                                    int i17 = ((iM2569 ^ i16) * (-23729)) ^ 167432371;
                                    int i18 = iM2569 ^ 425494260;
                                    String str3 = null;
                                    short[] sArr2 = null;
                                    short[] sArr3 = null;
                                    int iM6982 = 0;
                                    int i19 = 0;
                                    int i20 = 0;
                                    int i21 = 0;
                                    int i22 = 0;
                                    int i23 = 0;
                                    char c = 0;
                                    short s = 0;
                                    short s2 = 0;
                                    short s3 = 0;
                                    C8739 c87310 = null;
                                    AbstractActivityC12266 abstractActivityC12266 = null;
                                    String strM947 = null;
                                    InterfaceC7785 interfaceC7785M28030 = null;
                                    C10235 c10237 = null;
                                    C3094 c3095 = null;
                                    while (true) {
                                        i14 = i18 ^ (i17 & (((i14 ^ i16) * (-29125)) >> 31));
                                        switch (i14) {
                                            case -1971716384:
                                            case 1808330608:
                                                i19 = 51149;
                                                iM2567 = (C0630.m2566("᩹ۧ") + i15) * 41;
                                                i11 = ((iM2567 ^ i16) * (-19731)) ^ (-727870107);
                                                i12 = -1417041878;
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1965122721:
                                            case 2106514124:
                                                C4263.m12819();
                                                if (C1916.f6442) {
                                                    iM2567 = (C0630.m2566("᩺۟") ^ i16) * 73;
                                                    i11 = ((iM2567 ^ i15) * (-12691)) ^ 1885641771;
                                                    i12 = 1216008584;
                                                } else {
                                                    iM2567 = C2105.m6981("۫ۨ") ^ i15;
                                                    i11 = ((iM2567 ^ i16) * (-1425)) ^ (-468453997);
                                                    i12 = -497236945;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1824833070:
                                            case 1698566393:
                                                if (C2105.f7037 != 0) {
                                                    iM2568 = C0630.m2566("ܺ۫") ^ i15;
                                                    i17 = ((iM2568 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                } else {
                                                    iM2568 = C0630.m2566("᩹ܰ") ^ i15;
                                                    i17 = ((iM2568 ^ i16) * (-14737)) ^ 1450338643;
                                                    i13 = -1685033673;
                                                }
                                                i18 = iM2568 ^ i13;
                                                viewOnClickListenerC22144 = this;
                                                break;
                                            case -1683327363:
                                            case 1041421333:
                                                c87310 = c8739;
                                                if (ViewOnClickListenerC1958.m6437(strM947, c87310.f26609)) {
                                                    iM2567 = (C0630.m2566("۫ܽ") + i16) * 71;
                                                    i11 = ((iM2567 ^ i15) * 29591) ^ (-1931050998);
                                                    i12 = -1836647625;
                                                } else {
                                                    str3 = strM947;
                                                    iM2567 = C2105.m6981("ۘᩳ") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * (-6055)) ^ (-1801321479);
                                                    i12 = -1143002906;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1502396094:
                                            case -1099284320:
                                                C1504.m5167(2122484687 ^ iM6982);
                                                C0798.m3010(c10237);
                                                break;
                                            case -1502308526:
                                            case 35700761:
                                                C1005.m3501();
                                                if (C0050.f910 < 0) {
                                                    sArr = sArr2;
                                                    int iM6983 = C2105.m6981("᩶ۨ") ^ i15;
                                                    i18 = iM6983 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM6983 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC22144 = this;
                                                } else {
                                                    iM2567 = C2105.m6981("۫ۨ") ^ i15;
                                                    i11 = ((iM2567 ^ i16) * (-1425)) ^ (-468453997);
                                                    i12 = -497236945;
                                                    i18 = iM2567 ^ i12;
                                                    i17 = i11;
                                                }
                                                break;
                                            case -1471758712:
                                            case 211926356:
                                                if (i22 - (i23 * i23) <= 0) {
                                                    iM2567 = C0630.m2566("᩹۟") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * (-20077)) ^ (-515838079);
                                                    i12 = 219323411;
                                                } else {
                                                    iM2567 = C2105.m6981("ۜ۟") ^ i15;
                                                    i11 = ((iM2567 ^ i16) * (-31429)) ^ 1585462585;
                                                    i12 = -1593301854;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1420915956:
                                            case 981944302:
                                                c3095 = c3094;
                                                c10237 = c3095.f9674;
                                                interfaceC7785M28030 = C11340.m28030(c10237);
                                                if (C1128.f4106 > 0) {
                                                    iM2567 = C0630.m2566("ۜۨ") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * 23277) ^ 1736215459;
                                                    i12 = -648410682;
                                                    i18 = iM2567 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM6984 = C2105.m6981("᩶ۨ") ^ i15;
                                                    i18 = iM6984 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM6984 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC22144 = this;
                                                }
                                                break;
                                            case -1338079303:
                                            case 1464353370:
                                                C3019.m9255();
                                                break;
                                            case -1256837343:
                                            case -1081894225:
                                                strM947 = C0050.m947(interfaceC7785M28030);
                                                abstractActivityC12266 = c3095.f9676;
                                                if (abstractActivityC12266.mo19682(strM947)) {
                                                    iM2567 = C0630.m2566("᩹۬") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * (-13823)) ^ (-218958282);
                                                    i12 = 1489545059;
                                                } else {
                                                    iM2567 = C0630.m2566("۟ۙ") ^ i15;
                                                    i11 = ((iM2567 ^ i16) * (-13735)) ^ (-925412237);
                                                    i12 = -783609641;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1145882934:
                                            case 337421321:
                                                i19 = 38397;
                                                iM2567 = (C0630.m2566("᩹ۧ") + i15) * 41;
                                                i11 = ((iM2567 ^ i16) * (-19731)) ^ (-727870107);
                                                i12 = -1417041878;
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1145090359:
                                            case 179276085:
                                                iM6982 = C2105.m6981(ServiceConnectionC3453.m10568(sArr3, i21, i20, i19));
                                                if (C3245.f10203 <= 0) {
                                                    iM2567 = C2105.m6981("۫ۨ") ^ i15;
                                                    i11 = ((iM2567 ^ i16) * (-1425)) ^ (-468453997);
                                                    i12 = -497236945;
                                                } else {
                                                    iM2567 = C0630.m2566("᩵ۨ") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * 2791) ^ 882281904;
                                                    i12 = -660589738;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1104761799:
                                            case 227123024:
                                                s2 = sArr2[c];
                                                s = 65008;
                                                if (!AbstractC2021.m6574()) {
                                                    iM2567 = C0630.m2566("ܺ֫") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * (-28393)) ^ (-966083310);
                                                    i12 = 1788319077;
                                                    i18 = iM2567 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    iM2568 = C0630.m2566("ܺ۫") ^ i15;
                                                    i17 = ((iM2568 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                    i18 = iM2568 ^ i13;
                                                    viewOnClickListenerC22144 = this;
                                                }
                                                break;
                                            case -913878701:
                                            case 335956182:
                                                str3 = null;
                                                iM2567 = C2105.m6981("ۘᩳ") ^ i16;
                                                i11 = ((iM2567 ^ i15) * (-6055)) ^ (-1801321479);
                                                i12 = -1143002906;
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -586772840:
                                            case 460951431:
                                                c87310.m22593(str3);
                                                abstractActivityC12266.f36539.notifyDataSetChanged();
                                                if (C1294.f4556 < 0) {
                                                    iM2567 = (C2105.m6981("᩺ۛ") + i15) * (-123);
                                                    i11 = ((iM2567 ^ i16) * 13751) ^ (-1417356023);
                                                    i12 = 217390753;
                                                    i18 = iM2567 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    iM2568 = C0630.m2566("ܺ۫") ^ i15;
                                                    i17 = ((iM2568 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                    i18 = iM2568 ^ i13;
                                                    viewOnClickListenerC22144 = this;
                                                }
                                                break;
                                            case -245394484:
                                            case 1299976957:
                                                abstractActivityC12266.m29792();
                                                C1504.m5172(c3095.f9672);
                                                break;
                                            case -63230421:
                                            case 301829985:
                                                C0422.m1963();
                                                if (C22628.m50615() == 0) {
                                                    iM2567 = C2105.m6981("ۗۖ") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * 16701) ^ 474098689;
                                                    i12 = 1694061091;
                                                    i18 = iM2567 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM6985 = C2105.m6981("᩶ۨ") ^ i15;
                                                    i18 = iM6985 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM6985 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC22144 = this;
                                                }
                                                break;
                                            case 206452785:
                                            case 1938154503:
                                                i22 = s2 * s;
                                                s3 = 16252;
                                                if (!C0483.m2121()) {
                                                    iM2568 = C0630.m2566("ܺ۫") ^ i15;
                                                    i17 = ((iM2568 ^ i16) * (-15159)) ^ (-352461482);
                                                    i13 = 1227854834;
                                                    i18 = iM2568 ^ i13;
                                                    viewOnClickListenerC22144 = this;
                                                } else {
                                                    iM2567 = (i16 - C2105.m6981("ۛۡ")) * 7;
                                                    i11 = ((iM2567 ^ i15) * (-15021)) ^ 449439314;
                                                    i12 = -1669226659;
                                                    i18 = iM2567 ^ i12;
                                                    i17 = i11;
                                                }
                                                break;
                                            case 313162411:
                                            case 472911048:
                                                RunnableC1108.m3790();
                                                iM2567 = C2105.m6981("۫ۨ") ^ i15;
                                                i11 = ((iM2567 ^ i16) * (-1425)) ^ (-468453997);
                                                i12 = -497236945;
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case 780602824:
                                            case 1505237981:
                                                sArr = f71848;
                                                if (C7811.m20844() == 0) {
                                                    int iM25610 = (C0630.m2566("۬ۛ") + i16) * (-89);
                                                    i11 = ((iM25610 ^ i15) * (-869)) ^ 1589904155;
                                                    i18 = iM25610 ^ 1941998556;
                                                    viewOnClickListenerC22144 = this;
                                                    sArr2 = sArr;
                                                    i17 = i11;
                                                } else {
                                                    int iM6986 = C2105.m6981("᩶ۨ") ^ i15;
                                                    i18 = iM6986 ^ 1070201669;
                                                    sArr2 = sArr;
                                                    i17 = ((iM6986 ^ i16) * 31603) ^ (-1004622306);
                                                    viewOnClickListenerC22144 = this;
                                                }
                                                break;
                                            case 1227268871:
                                            case 1307059984:
                                                c = 0;
                                                if (RunnableC0588.m2441() >= 0) {
                                                    iM2567 = C2105.m6981("ۗۖ") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * 16701) ^ 474098689;
                                                    i12 = 1694061091;
                                                } else {
                                                    iM2567 = (i15 - C0630.m2566("᩹᩵")) * (-35);
                                                    i11 = ((iM2567 ^ i16) * (-837)) ^ 1621621322;
                                                    i12 = 857916684;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            case 1399546148:
                                            case 2044160309:
                                                i23 = s2 + s3;
                                                if (RunnableC3474.m10630()) {
                                                    iM2567 = C2105.m6981("ۗۘ") ^ i15;
                                                    i11 = ((iM2567 ^ i16) * (-29633)) ^ 1151046152;
                                                    i12 = 491929409;
                                                } else {
                                                    iM2567 = C2105.m6981("ۗۖ") ^ i16;
                                                    i11 = ((iM2567 ^ i15) * 16701) ^ 474098689;
                                                    i12 = 1694061091;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                            default:
                                                sArr3 = f71848;
                                                i21 = 1;
                                                i20 = 3;
                                                if (C0714.f2697 >= 0) {
                                                    iM2567 = (C0630.m2566("᩺۟") ^ i16) * 73;
                                                    i11 = ((iM2567 ^ i15) * (-12691)) ^ 1885641771;
                                                    i12 = 1216008584;
                                                } else {
                                                    iM2567 = (C0630.m2566("ۘܶ") ^ i15) * (-63);
                                                    i11 = ((iM2567 ^ i16) * (-23875)) ^ (-2114596357);
                                                    i12 = 1700522947;
                                                }
                                                i18 = iM2567 ^ i12;
                                                i17 = i11;
                                                break;
                                        }
                                        return;
                                    }
                                }
                            });
                            str2 = c8739.f26611;
                            c10236 = c3094.f9674;
                            if (str2 == null) {
                                iM6981 = (i7 - C0630.m2566("᩶ۨ")) * (-55);
                                i2 = ((iM6981 ^ i6) * 26855) ^ 554286770;
                                i3 = 639617634;
                            } else {
                                iM6981 = (C0630.m2566("᩻ܿ") ^ i6) * 7;
                                i2 = ((iM6981 ^ i7) * 28281) ^ (-1487686476);
                                i3 = 1325795220;
                            }
                        } else {
                            iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                            i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                            i3 = -2071181861;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case 1075460656:
                    case 1636027017:
                        if (C1047.m3599() >= 0) {
                            iM6981 = C0630.m2566("ۜ᩹") ^ i7;
                            i2 = ((iM6981 ^ i6) * (-19113)) ^ (-774971710);
                            i3 = 301826167;
                        } else {
                            iM6981 = (C0630.m2566("ܺۨ") + i7) * 65;
                            i2 = ((iM6981 ^ i6) * (-12687)) ^ 1218243706;
                            i3 = 1556888556;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    case 1485717507:
                    case 1710144616:
                        if (C3432.m10477() <= 0) {
                            iM6981 = C2105.m6981("۟ۛ") ^ i6;
                            i2 = ((iM6981 ^ i7) * (-1257)) ^ (-954969392);
                            i3 = -1354567148;
                        } else {
                            iM6981 = C2105.m6981("۠ܳ") ^ i6;
                            i2 = ((iM6981 ^ i7) * (-7545)) ^ (-60887591);
                            i3 = -1748001556;
                        }
                        i10 = iM6981 ^ i3;
                        i8 = i2;
                        break;
                    default:
                        if (C22628.f73083 > 0) {
                            iM2566 = C2105.m6981("ܽۢ") ^ i7;
                            i8 = ((iM2566 ^ i6) * (-13303)) ^ (-1613093226);
                            i9 = -1359248534;
                        }
                        iM6981 = (i6 - C2105.m6981("ۢ᩵")) * (-35);
                        i2 = ((iM6981 ^ i7) * 10393) ^ (-579203086);
                        i3 = -2071181861;
                        i10 = iM6981 ^ i3;
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
    
        if (l.C21923.f70183 == 0) goto L30;
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
        int iM2566;
        int i;
        int i2;
        DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC2527;
        String strM1958;
        String str;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC2528;
        short[] sArr;
        short[] sArr2;
        int i7;
        int i8;
        short[] sArr3;
        int iM2567;
        int i9;
        int i10;
        int iM6982;
        int i11;
        int i12;
        int i13;
        int iM2568;
        int i14;
        ?? r8;
        int i15;
        DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC2529;
        DialogInterfaceOnClickListenerC10944 dialogInterfaceOnClickListenerC10944;
        short[] sArr4;
        int i16;
        int i17;
        String str2;
        String str3;
        int i18;
        C20065 c20065;
        short[] sArr5;
        C19258 c19258;
        int iM2569;
        int iM6983;
        int i19;
        int i20;
        DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC25210;
        C19258 c19259;
        C20065 c20066;
        short[] sArr6;
        int iM6984;
        int i21;
        int i22;
        int i23;
        DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC25211;
        int iM25610;
        int i24;
        int i25;
        int iM6985;
        int i26;
        int i27;
        int i28;
        int iM25611;
        int i29;
        int i30;
        ?? r9;
        ?? r31;
        int iM6986;
        int i31;
        int i32;
        ?? r10;
        AbstractActivityC12266 abstractActivityC12266 = this;
        int i33 = 585808498;
        int i34 = C0714.f2697;
        int i35 = C4616.f14690;
        int iM6987 = (C2105.m6981("ۜ֨") + i35) * (-11);
        int i36 = ((iM6987 ^ i34) * 11177) ^ 2016438742;
        int i37 = iM6987 ^ (-685466002);
        DialogInterfaceOnClickListenerC10944 dialogInterfaceOnClickListenerC10945 = null;
        String str4 = null;
        C20065 c20067 = null;
        C19258 c192510 = null;
        DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC25212 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int iM7041 = 0;
        boolean z = false;
        boolean z2 = false;
        int i38 = 0;
        int i39 = 0;
        int iM25612 = 0;
        int i40 = 0;
        int i41 = 0;
        int iM6988 = 0;
        int iM25613 = 0;
        int i42 = 0;
        int iM6989 = 0;
        int i43 = 0;
        int i44 = 0;
        C3122 c3122 = null;
        String str5 = null;
        DialogInterfaceOnClickListenerC3573 dialogInterfaceOnClickListenerC3573 = null;
        int i45 = 0;
        C19258 c192511 = null;
        ?? r11 = 0;
        int i46 = 0;
        while (true) {
            i33 = i37 ^ (i36 & (((i33 ^ i34) * 31167) >> 31));
            switch (i33) {
                case -2101308910:
                case 977595085:
                    z = z ? 1 : 0;
                    i46 = i46;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i43 = i43;
                    i44 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr9 = sArr9;
                    short s = f36523[188];
                    if ((s * 18842) - ((s * s) + 88755241) <= 0) {
                        iM6981 = (C2105.m6981("᩻۟") + i34) * (-101);
                        i36 = ((iM6981 ^ i35) * 13005) ^ (-1481448002);
                        i5 = -329508848;
                    } else {
                        iM6981 = (C2105.m6981("ۚ֡") ^ i35) * 5;
                        i36 = ((iM6981 ^ i34) * (-26571)) ^ (-503195385);
                        i5 = -1151644524;
                    }
                    i10 = iM6981 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25212;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -2008027017:
                case 1338913573:
                    i46 = i46;
                    abstractActivityC12266.m29780(z2);
                    if (abstractActivityC12266.f36533) {
                        iM6986 = C2105.m6981("֫ᩳ") ^ i34;
                        i31 = ((iM6986 ^ i35) * 27981) ^ 1568069754;
                        i32 = 1546082767;
                    } else {
                        iM6986 = (C2105.m6981("ۖۛ") ^ i35) * (-67);
                        i31 = ((iM6986 ^ i34) * (-331)) ^ (-1148070600);
                        i32 = -457923608;
                    }
                    i37 = iM6986 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -1984254323:
                case 936036935:
                    C4075.m12261(abstractActivityC12266, new Intent(abstractActivityC12266, (Class<?>) ActivityC20401.class));
                    return z;
                case -1931616586:
                case -480452707:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    iM25612 = C0630.m2566(C4263.m12817(f36523, 201, 3, i38)) ^ 2120559360;
                    sArr7 = f36523;
                    if (C0798.f2919) {
                        iM2568 = C0630.m2566("ۖ֨") ^ i34;
                        i11 = ((iM2568 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                    } else {
                        iM2568 = C0630.m2566("ܿۚ") ^ i35;
                        i11 = ((iM2568 ^ i34) * 22223) ^ (-613119380);
                        i14 = 686050199;
                    }
                    i13 = iM2568 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -1917592805:
                case -1621236421:
                    C3663.m11168();
                    if (!C0798.f2919) {
                        iM2566 = C0630.m2566("۬᩵") ^ i35;
                        i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM2566 ^ i2;
                        i36 = i;
                    } else {
                        i6 = i46;
                        dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                        c192511 = c192511;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                        c3122 = c3122;
                        sArr2 = sArr8;
                        i7 = i43;
                        i8 = i44;
                        str4 = str4;
                        str5 = str5;
                        i42 = i42;
                        c20067 = c20067;
                        sArr3 = sArr9;
                        iM2568 = C0630.m2566("ۖ֨") ^ i34;
                        i11 = ((iM2568 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                        i13 = iM2568 ^ i14;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                        c20067 = c20067;
                        c192511 = c192511;
                        i37 = i13;
                        i36 = i11;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c3122 = c3122;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    }
                    break;
                case -1856838507:
                case -722952549:
                    C3663.m11161(C0630.m2566(C3911.m11919(f36523, 298, 3, i38)) ^ 2128642199);
                    i46 = i46;
                    r9 = r11;
                    dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                    iM6985 = (i35 - C0630.m2566("֡ᩴ")) * (-61);
                    i26 = ((iM6985 ^ i34) * 22409) ^ (-154142375);
                    i27 = -960648158;
                    r10 = r9;
                    i37 = iM6985 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    break;
                case -1838660019:
                case -895870147:
                    C3663.m11161(iM25613);
                    return z;
                case -1824048558:
                case -1745657219:
                    i4 = iM6989;
                    C0382.m1849(c192510, i4);
                    C3019.m9252(c192510, mo19686());
                    dialogInterfaceOnClickListenerC25212 = new DialogInterfaceOnClickListenerC2527(abstractActivityC12266, z ? 1 : 0);
                    sArr11 = f36523;
                    i39 = 289;
                    i45 = 3;
                    if (C5695.m16023() < 0) {
                        iM6989 = i4;
                        iM2566 = (i35 - C0630.m2566("۟᩻")) * (-61);
                        i = ((iM2566 ^ i34) * (-17241)) ^ 915254838;
                        i2 = 452743046;
                        i37 = iM2566 ^ i2;
                        i36 = i;
                    } else {
                        int iM25614 = (C0630.m2566("ۧ᩸") + i34) * (-123);
                        iM6989 = i4;
                        i36 = ((iM25614 ^ i35) * 7745) ^ 921560606;
                        i37 = iM25614 ^ 744016823;
                    }
                    break;
                case -1756570000:
                case 2109099044:
                    if (C1916.m6308() < 0) {
                        iM2566 = C0630.m2566("۬᩵") ^ i35;
                        i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                    } else {
                        iM2566 = C2105.m6981("᩹ۙ") ^ i35;
                        i = ((iM2566 ^ i34) * 8615) ^ 593276043;
                        i2 = -1176174469;
                    }
                    i37 = iM2566 ^ i2;
                    i36 = i;
                    break;
                case -1619925492:
                case -1459278818:
                    C2520.m8026();
                    break;
                case -1584048009:
                case -484527476:
                    i28 = i46;
                    abstractActivityC12266.f36526 = (abstractActivityC12266.f36526 ? 1 : 0) ^ (z ? 1 : 0);
                    ?? r32 = r11;
                    C7106.m19107(C7811.m20835(ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008), C1005.m3502(f36523, 301, 23, i38), abstractActivityC12266.f36526));
                    C4159.m12566(menuItem, abstractActivityC12266.f36526);
                    if (abstractActivityC12266.f36526) {
                        iM25611 = (C0630.m2566("᩻ܺ") ^ i35) * (-5);
                        i29 = ((iM25611 ^ i34) * (-21171)) ^ (-1596392050);
                        i30 = -589291868;
                        r31 = r32;
                    } else {
                        iM25611 = C0630.m2566("ۨ᩵") ^ i34;
                        i29 = ((iM25611 ^ i35) * (-19415)) ^ 488772372;
                        i30 = -633944971;
                        r31 = r32;
                    }
                    i37 = iM25611 ^ i30;
                    i36 = i29;
                    i46 = i28;
                    r11 = r31;
                    break;
                case -1569387733:
                case 1366346773:
                    dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                    r9 = r11;
                    if (abstractActivityC12266.m29774(z)) {
                        iM6985 = C2105.m6981("ۡܿ") ^ i34;
                        i26 = ((iM6985 ^ i35) * (-21451)) ^ (-1479940175);
                        i27 = 1520916728;
                        r10 = r11;
                    } else {
                        iM6985 = (i35 - C0630.m2566("֡ᩴ")) * (-61);
                        i26 = ((iM6985 ^ i34) * 22409) ^ (-154142375);
                        i27 = -960648158;
                        r10 = r9;
                    }
                    i37 = iM6985 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    break;
                case -1557111792:
                case -900710428:
                    dialogInterfaceOnClickListenerC25210 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c3122 = c3122;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20066 = c20067;
                    sArr6 = sArr9;
                    if (iM7041 == (C2105.m6981(C3245.m9934(f36523, 222, 3, i38)) ^ 2125200465)) {
                        iM6984 = (C0630.m2566("ۖܺ") ^ i35) * (-99);
                        i21 = ((iM6984 ^ i34) * (-355)) ^ (-571674563);
                        i22 = 100028965;
                    } else {
                        iM6984 = (C2105.m6981("ܿ᩷") ^ i34) * 79;
                        i21 = ((iM6984 ^ i35) * (-27909)) ^ (-276821813);
                        i22 = -827064746;
                    }
                    i37 = iM6984 ^ i22;
                    i36 = i21;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25210;
                    c20067 = c20066;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -1477754429:
                case -520107746:
                    C1683.m5683(abstractActivityC12266, new RunnableC20699(2, abstractActivityC12266));
                    return z;
                case -1415565409:
                case 605392605:
                    dialogInterfaceOnClickListenerC25210 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    String str6 = str4;
                    c3122 = c3122;
                    str5 = str5;
                    i42 = i42;
                    c20066 = c20067;
                    sArr6 = sArr9;
                    str4 = str6;
                    if (iM7041 == (C0630.m2566(C0630.m2575(f36523, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i38)) ^ 2127309232)) {
                        iM6984 = C2105.m6981("ܰ᩹") ^ i35;
                        i21 = ((iM6984 ^ i34) * (-20281)) ^ 1746252711;
                        i22 = 476207635;
                    } else {
                        iM6984 = (i35 - C2105.m6981("ۛᩳ")) * 67;
                        i21 = ((iM6984 ^ i34) * 27113) ^ (-414934248);
                        i22 = 1166017717;
                    }
                    i37 = iM6984 ^ i22;
                    i36 = i21;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25210;
                    c20067 = c20066;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -1363522385:
                case 79498874:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        dialogInterfaceOnClickListenerC25210 = dialogInterfaceOnClickListenerC25212;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                        c19259 = c192511;
                        c3122 = c3122;
                        str4 = str4;
                        str5 = str5;
                        i42 = i42;
                        c20066 = c20067;
                        sArr6 = sArr9;
                        int iM25615 = C0630.m2566("ۤ᩷") ^ i35;
                        i37 = iM25615 ^ 1609742930;
                        c192511 = c19259;
                        i36 = ((iM25615 ^ i34) * (-11477)) ^ 824378909;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25210;
                        c20067 = c20066;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c3122 = c3122;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    } else {
                        iM2566 = C0630.m2566("۬᩵") ^ i35;
                        i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM2566 ^ i2;
                        i36 = i;
                    }
                    break;
                case -1351049287:
                case 84676960:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    if (RunnableC1937.m6373()) {
                        iM6982 = (C2105.m6981("ۢᩳ") ^ i35) * (-119);
                        i11 = ((iM6982 ^ i34) * 13299) ^ 366199814;
                        i12 = -919143586;
                    } else {
                        iM6982 = (C0630.m2566("᩵ܽ") ^ i34) * (-121);
                        i11 = ((iM6982 ^ i35) * 17025) ^ 738856323;
                        i12 = 1956525198;
                    }
                    i13 = iM6982 ^ i12;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -1336406104:
                case 1274365637:
                    C2520.m8033(c192510, C2105.m6981(RunnableC1108.m3789(sArr12, 292, 3, i38)) ^ 2105183637, dialogInterfaceOnClickListenerC3573);
                    RunnableC0588.m2438(c192510);
                    return z;
                case -1332224779:
                case 2023476055:
                    C1047.m3599();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("᩺᩵") ^ i35) * (-49);
                        i = ((iM2566 ^ i34) * (-2207)) ^ (-765651437);
                        i2 = -1942286365;
                        i37 = iM2566 ^ i2;
                        i36 = i;
                    } else {
                        i15 = i46;
                        dialogInterfaceOnClickListenerC2529 = dialogInterfaceOnClickListenerC25212;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                        iM2569 = i40;
                        c3122 = c3122;
                        i16 = i43;
                        i17 = i44;
                        c19258 = c192511;
                        dialogInterfaceOnClickListenerC10944 = dialogInterfaceOnClickListenerC10945;
                        str2 = str4;
                        sArr4 = sArr8;
                        str3 = str5;
                        i18 = i42;
                        c20065 = c20067;
                        sArr5 = sArr9;
                        iM6983 = C0630.m2566("ۛ᩷") ^ i34;
                        i19 = ((iM6983 ^ i35) * (-5649)) ^ 1714233114;
                        i20 = 552974414;
                        i37 = iM6983 ^ i20;
                        i44 = i17;
                        sArr8 = sArr4;
                        sArr9 = sArr5;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2529;
                        i43 = i16;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10944;
                        c192511 = c19258;
                        c20067 = c20065;
                        i40 = iM2569;
                        i36 = i19;
                        i42 = i18;
                        str5 = str3;
                        str4 = str2;
                        i46 = i15;
                        r8 = r11;
                        c3122 = c3122;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    }
                    break;
                case -1278073231:
                case 1279748329:
                    if (C0964.f3626 == 0) {
                        dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                        iM6985 = C2105.m6981("֫ᩴ") ^ i35;
                        i26 = ((iM6985 ^ i34) * (-17367)) ^ (-773388480);
                        i27 = -1309160807;
                        r10 = r11;
                        i37 = iM6985 ^ i27;
                        i36 = i26;
                        r11 = r10;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    } else {
                        i6 = i46;
                        dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                        c192511 = c192511;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                        c3122 = c3122;
                        sArr2 = sArr8;
                        i7 = i43;
                        i8 = i44;
                        str4 = str4;
                        str5 = str5;
                        i42 = i42;
                        c20067 = c20067;
                        sArr3 = sArr9;
                        iM2568 = C0630.m2566("ۖ֨") ^ i34;
                        i11 = ((iM2568 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                        i13 = iM2568 ^ i14;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                        c20067 = c20067;
                        c192511 = c192511;
                        i37 = i13;
                        i36 = i11;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c3122 = c3122;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    }
                    break;
                case -1241997306:
                case -359186096:
                    abstractActivityC12266.mo19677(new RunnableC18617(abstractActivityC12266, z2));
                    return z;
                case -1214108917:
                case 1572536423:
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    C19258 c192512 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    C3432.m10490(c192512, i40 ^ i41);
                    c192511 = c192512;
                    i6 = i46;
                    iM6988 = C2105.m6981(C21923.m49334(f36523, 216, 3, i38));
                    if (RunnableC3474.f10992 <= 0) {
                        iM2568 = C0630.m2566("ۖ֨") ^ i34;
                        i11 = ((iM2568 ^ i35) * 13689) ^ 1393033029;
                        i14 = 289285507;
                    } else {
                        iM2568 = C0630.m2566("᩻ۚ") ^ i34;
                        i11 = ((iM2568 ^ i35) * (-14371)) ^ (-1598642414);
                        i14 = -723808342;
                    }
                    i13 = iM2568 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -1173752938:
                case 1134755251:
                    i15 = i46;
                    dialogInterfaceOnClickListenerC2529 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    dialogInterfaceOnClickListenerC10944 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr4 = sArr8;
                    i16 = i43;
                    i17 = i44;
                    str2 = str4;
                    str3 = str5;
                    i18 = i42;
                    c20065 = c20067;
                    sArr5 = sArr9;
                    int i47 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC12266);
                    iM2569 = C0630.m2566(C1711.m5726(f36523, 213, 3, i38));
                    i41 = 2120408656;
                    if (C2958.f9394 >= 0) {
                        iM6983 = C0630.m2566("ۛ᩷") ^ i34;
                        i19 = ((iM6983 ^ i35) * (-5649)) ^ 1714233114;
                        i20 = 552974414;
                    } else {
                        iM6983 = (C2105.m6981("ۙۘ") + i34) * 17;
                        i19 = ((iM6983 ^ i35) * 14567) ^ (-91645112);
                        i20 = 787761307;
                    }
                    i37 = iM6983 ^ i20;
                    i44 = i17;
                    sArr8 = sArr4;
                    sArr9 = sArr5;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2529;
                    i43 = i16;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10944;
                    c192511 = c19258;
                    c20067 = c20065;
                    i40 = iM2569;
                    i36 = i19;
                    i42 = i18;
                    str5 = str3;
                    str4 = str2;
                    i46 = i15;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -1057156598:
                case 956813725:
                    return z2;
                case -1010756821:
                case -544689334:
                    ViewOnClickListenerC1958.m6441(c192510, C0630.m2566(C2126.m7036(sArr11, i39, i45, i38)) ^ 2130446929, dialogInterfaceOnClickListenerC25212);
                    i46 = i46;
                    C5695.m16035(c192510, i46, r11);
                    dialogInterfaceOnClickListenerC3573 = new DialogInterfaceOnClickListenerC3573(z ? 1 : 0, abstractActivityC12266);
                    sArr12 = f36523;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("۬᩵") ^ i35;
                        i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                    } else {
                        iM2566 = C0630.m2566("۬ۗ") ^ i34;
                        i = ((iM2566 ^ i35) * (-7827)) ^ (-1686331117);
                        i2 = -977632845;
                    }
                    i37 = iM2566 ^ i2;
                    i36 = i;
                    break;
                case -987764432:
                case 1978038262:
                    DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC25213 = dialogInterfaceOnClickListenerC25212;
                    DialogInterfaceOnClickListenerC3573 dialogInterfaceOnClickListenerC3574 = dialogInterfaceOnClickListenerC3573;
                    String str7 = str5;
                    C3122 c3123 = c3122;
                    C20065 c20068 = c20067;
                    short[] sArr13 = sArr9;
                    String strM1959 = C0422.m1958(abstractActivityC12266, C0630.m2566(C4075.m12252(sArr13, 231, 3, i38)) ^ 2119204616);
                    sArr10 = f36523;
                    if (C3432.m10477() <= 0) {
                        int iM69810 = C2105.m6981("ۘۗ") ^ i34;
                        i37 = iM69810 ^ 1054350359;
                        sArr9 = sArr13;
                        i36 = ((iM69810 ^ i35) * 25925) ^ 295935624;
                        c3122 = c3123;
                        str5 = str7;
                        c20067 = c20068;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25213;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3574;
                        i42 = 234;
                        str4 = strM1959;
                    } else {
                        int iM69811 = (C2105.m6981("ۚᩴ") ^ i34) * 73;
                        i36 = ((iM69811 ^ i35) * 3407) ^ 166546084;
                        i37 = iM69811 ^ (-1831178742);
                        c3122 = c3123;
                        str5 = str7;
                        sArr9 = sArr13;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25213;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3574;
                        str4 = strM1959;
                        c20067 = c20068;
                        i42 = 234;
                    }
                    break;
                case -959472351:
                case 1417228005:
                    abstractActivityC12266.f36537 = abstractActivityC12266.f36528;
                    iM6986 = (i34 - C0630.m2566("۠ܶ")) * 69;
                    i31 = ((iM6986 ^ i35) * 3533) ^ (-1266176747);
                    i32 = -749119788;
                    i37 = iM6986 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -920012375:
                case 1153070697:
                    m29788();
                    return z;
                case -834523945:
                case -494694655:
                    i46 = i46;
                    if (abstractActivityC12266.f36530 == null) {
                        iM6986 = C2105.m6981("ۛ᩹") ^ i34;
                        i31 = ((iM6986 ^ i35) * 30281) ^ 1453471341;
                        i32 = -1303861824;
                    } else {
                        iM6986 = C0630.m2566("ۗ۫") ^ i35;
                        i31 = ((iM6986 ^ i34) * (-18319)) ^ 984652927;
                        i32 = -137328578;
                    }
                    i37 = iM6986 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -822260289:
                case 1622114641:
                    C1504.m5167(iM25613);
                    return z;
                case -822230812:
                case 1148774610:
                    i28 = i46;
                    ?? r33 = r11;
                    if (iM7041 == (C0630.m2566(C3663.m11162(f36523, 295, 3, i38)) ^ 2100394739)) {
                        iM25611 = (C0630.m2566("᩹ۡ") ^ i35) * (-95);
                        i29 = ((iM25611 ^ i34) * 23203) ^ 1916142308;
                        i30 = 16233023;
                        r31 = r33;
                    } else {
                        iM25611 = C0630.m2566("֫ܿ") ^ i34;
                        i29 = ((iM25611 ^ i35) * 31195) ^ (-353777276);
                        i30 = 1320337123;
                        r31 = r33;
                    }
                    i37 = iM25611 ^ i30;
                    i36 = i29;
                    i46 = i28;
                    r11 = r31;
                    break;
                case -781480950:
                case 10410092:
                    abstractActivityC12266.f36537 = abstractActivityC12266.f36530;
                    iM6986 = (i34 - C0630.m2566("۠ܶ")) * 69;
                    i31 = ((iM6986 ^ i35) * 3533) ^ (-1266176747);
                    i32 = -749119788;
                    i37 = iM6986 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -764900870:
                case 886604081:
                    abstractActivityC12266.f36533 = z2;
                    abstractActivityC12266.f36535 = -1;
                    i46 = i46;
                    C0964.m3409(abstractActivityC12266, C2105.m6981(C3746.m11357(f36523, 324, 3, i38)) ^ 2102612123);
                    abstractActivityC12266.f36527 = r11;
                    m29792();
                    iM6986 = (C2105.m6981("ۖۛ") ^ i35) * (-67);
                    i31 = ((iM6986 ^ i34) * (-331)) ^ (-1148070600);
                    i32 = -457923608;
                    i37 = iM6986 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -743882059:
                case 1007112483:
                    i46 = i46;
                    ArrayList arrayList = new ArrayList(abstractActivityC12266.f36528);
                    abstractActivityC12266.f36530 = arrayList;
                    Collections.sort(arrayList, C8200.comparing(new C10420(z ? 1 : 0)));
                    iM6986 = C0630.m2566("ۗ۫") ^ i35;
                    i31 = ((iM6986 ^ i34) * (-18319)) ^ 984652927;
                    i32 = -137328578;
                    i37 = iM6986 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -735918281:
                case 1023885542:
                    C3122 c3124 = c3122;
                    c3124.setAdapter((SpinnerAdapter) c20067);
                    c3124.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    c3124.setSelection(abstractActivityC12266.f36536);
                    new C8033(abstractActivityC12266, abstractActivityC12266, abstractActivityC12266.f36533, c3124);
                    return z;
                case -725710264:
                case -94173491:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    if (iM7041 == (C0630.m2566(C4263.m12817(f36523, 198, 3, i38)) ^ 2128988521)) {
                        iM2567 = C2105.m6981("ܰۙ") ^ i34;
                        i36 = ((iM2567 ^ i35) * (-23303)) ^ 2098254953;
                        i9 = 1343466874;
                    } else {
                        iM2567 = C0630.m2566("ۤᩴ") ^ i35;
                        i36 = ((iM2567 ^ i34) * (-27761)) ^ 175060136;
                        i9 = -1436094362;
                    }
                    i10 = iM2567 ^ i9;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -700874696:
                case 1735181805:
                    dialogInterfaceOnClickListenerC25211 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    if (iM7041 == (C2105.m6981(C7811.m20837(f36523, 237, 3, i38)) ^ 2103240319)) {
                        iM25610 = (C2105.m6981("ܺܽ") ^ i34) * 47;
                        i24 = ((iM25610 ^ i35) * (-4315)) ^ 2124848173;
                        i25 = 656607020;
                    } else {
                        iM25610 = (C0630.m2566("ۨۗ") + i34) * (-39);
                        i24 = ((iM25610 ^ i35) * 29569) ^ 477266917;
                        i25 = 1287856239;
                    }
                    i37 = iM25610 ^ i25;
                    i36 = i24;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25211;
                    r11 = r11;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -631919107:
                case 968446297:
                    m29797();
                    return z;
                case -576309274:
                case 2063358839:
                    i38 = 10020;
                    iM6981 = (i34 - C2105.m6981("ۙ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i36 = ((iM6981 ^ i35) * (-26001)) ^ (-1523589984);
                    i5 = 658426457;
                    i10 = iM6981 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25212;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -564374834:
                case 975331187:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    if (RunnableC1937.m6373()) {
                        iM2568 = C2105.m6981("֫ܳ") ^ i35;
                        i11 = ((iM2568 ^ i34) * (-1707)) ^ 1484824283;
                        i14 = 1536992825;
                    } else {
                        iM2568 = (C2105.m6981("ۖ۟") + i34) * (-91);
                        i11 = ((iM2568 ^ i35) * 23881) ^ (-2069899648);
                        i14 = 154956655;
                    }
                    i13 = iM2568 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -555525751:
                case 5958385:
                    dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    str = str4;
                    i3 = i42;
                    C20065 c20069 = c20067;
                    C3122 c3125 = new C3122(abstractActivityC12266, r11);
                    strM1958 = C0422.m1958(abstractActivityC12266, C0630.m2566(C1005.m3502(f36523, 228, 3, i38)) ^ 2123761830);
                    sArr9 = f36523;
                    if (C2105.m6982() != 0) {
                        c3122 = c3125;
                        c20067 = c20069;
                        int iM69812 = C2105.m6981("ۤۨ") ^ i34;
                        i23 = ((iM69812 ^ i35) * (-28707)) ^ 1664520717;
                        i37 = iM69812 ^ (-706949829);
                    } else {
                        int iM25616 = (C0630.m2566("ᩳ۬") + i35) * 119;
                        i23 = ((iM25616 ^ i34) * 8067) ^ 1739566528;
                        i37 = iM25616 ^ (-942993617);
                        c3122 = c3125;
                        c20067 = c20069;
                    }
                    str4 = str;
                    i42 = i3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    str5 = strM1958;
                    i36 = i23;
                    r11 = r11;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -420654411:
                case 809686648:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    if (mo19680()) {
                        iM2567 = (C0630.m2566("ܿۖ") + i34) * (-107);
                        i36 = ((iM2567 ^ i35) * (-2077)) ^ (-1432661184);
                        i9 = -1913740224;
                    } else {
                        iM2567 = C0630.m2566("۠ۛ") ^ i35;
                        i36 = ((iM2567 ^ i34) * 12907) ^ 326209972;
                        i9 = -869514133;
                    }
                    i10 = iM2567 ^ i9;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -257835857:
                case 631887091:
                    i46 = i46;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i43 = i43;
                    i44 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr9 = sArr9;
                    int iM69813 = C2105.m6981(C2520.m8030(f36523, 192, 3, i38)) ^ 2099443039;
                    short[] sArr14 = f36523;
                    z = z ? 1 : 0;
                    iM25613 = C0630.m2566(C2958.m9031(sArr14, 195, 3, i38)) ^ 2120334791;
                    if (iM7041 == iM69813) {
                        iM6981 = (i34 - C2105.m6981("֡ۛ")) * 51;
                        i36 = ((iM6981 ^ i35) * (-7589)) ^ 1861226554;
                        i5 = -152662688;
                    } else {
                        iM6981 = C0630.m2566("᩷ܺ") ^ i34;
                        i36 = ((iM6981 ^ i35) * 24687) ^ 1837796135;
                        i5 = 1525853174;
                    }
                    i10 = iM6981 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25212;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -239504086:
                case 135063483:
                    C2272.m7503();
                    C0798.m2998();
                    return false;
                case -139158212:
                case 1345958167:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    iM7041 = C2126.m7041(menuItem);
                    z = true;
                    z = true;
                    z2 = false;
                    if (iM7041 == (C0630.m2566(ServiceConnectionC3453.m10568(f36523, 189, 3, i38)) ^ 2124072269)) {
                        iM2567 = C0630.m2566("᩸ۖ") ^ i35;
                        i36 = ((iM2567 ^ i34) * (-12709)) ^ 1995422044;
                        i9 = 385496038;
                    } else {
                        iM2567 = C0630.m2566("ܳ᩸") ^ i35;
                        i36 = ((iM2567 ^ i34) * (-133)) ^ (-334202636);
                        i9 = -702899254;
                    }
                    i10 = iM2567 ^ i9;
                    sArr7 = sArr;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case -50412651:
                case 1676177769:
                    int i48 = DialogInterfaceC0206.f1451;
                    c192510 = new C19258(abstractActivityC12266);
                    dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                    iM6989 = C2105.m6981(C0964.m3396(f36523, 286, 3, i38)) ^ 2130602348;
                    if (C2520.f8000 >= 0) {
                        iM6985 = C2105.m6981("֫ᩴ") ^ i35;
                        i26 = ((iM6985 ^ i34) * (-17367)) ^ (-773388480);
                        i27 = -1309160807;
                        r10 = r11;
                    } else {
                        iM6985 = C2105.m6981("ܳᩴ") ^ i35;
                        i26 = ((iM6985 ^ i34) * (-25245)) ^ (-434599205);
                        i27 = -1241768653;
                        r10 = r11;
                    }
                    i37 = iM6985 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    break;
                case -3904119:
                case 126649198:
                    new C15087(abstractActivityC12266, abstractActivityC12266);
                    return z;
                case 64381445:
                case 1338823254:
                    return z;
                case 76514122:
                case 487750979:
                    dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                    if (iM7041 == (C0630.m2566(RunnableC1108.m3789(f36523, 283, 3, i38)) ^ 2098723143)) {
                        iM6985 = (i34 - C0630.m2566("ܺۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i26 = ((iM6985 ^ i35) * (-26935)) ^ 964479064;
                        i27 = 335770334;
                        r10 = r11;
                    } else {
                        iM6985 = (C2105.m6981("ۡۚ") ^ i35) * (-75);
                        i26 = ((iM6985 ^ i34) * (-4777)) ^ (-1827533274);
                        i27 = -481377601;
                        r10 = r11;
                    }
                    i37 = iM6985 ^ i27;
                    i36 = i26;
                    r11 = r10;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    break;
                case 102146741:
                case 290766880:
                    dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    C3122 c3126 = c3122;
                    short[] sArr15 = sArr10;
                    int i49 = i42;
                    String strM19510 = C0422.m1958(abstractActivityC12266, C2105.m6981(C5695.m16034(sArr15, i49, 3, i38)) ^ 2118612099);
                    sArr10 = sArr15;
                    String str8 = str5;
                    i3 = i49;
                    str = str4;
                    C20065 c200610 = new C20065(abstractActivityC12266, C7470.m20016(str8, str, strM19510));
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        int iM69814 = (i34 - C2105.m6981("᩶ۤ")) * 57;
                        i37 = iM69814 ^ 2059822080;
                        i36 = ((iM69814 ^ i35) * 3169) ^ (-818689722);
                        c3122 = c3126;
                        c20067 = c200610;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                        i42 = i3;
                        str5 = str8;
                        str4 = str;
                        r11 = r11;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                    } else {
                        c20067 = c200610;
                        c3122 = c3126;
                        strM1958 = str8;
                        int iM69815 = C2105.m6981("ۤۨ") ^ i34;
                        i23 = ((iM69815 ^ i35) * (-28707)) ^ 1664520717;
                        i37 = iM69815 ^ (-706949829);
                        str4 = str;
                        i42 = i3;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                        str5 = strM1958;
                        i36 = i23;
                        r11 = r11;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    }
                    break;
                case 157414244:
                case 1481105672:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    int i50 = iM25612;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    if (!abstractActivityC12266.m29774(z2)) {
                        iM6982 = C2105.m6981("ܽܿ") ^ i35;
                        iM25612 = i50;
                        i11 = ((iM6982 ^ i34) * (-18975)) ^ (-1686596505);
                        i12 = 1666179999;
                        i13 = iM6982 ^ i12;
                        sArr7 = sArr;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                        c20067 = c20067;
                        c192511 = c192511;
                        i37 = i13;
                        i36 = i11;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        r8 = r11;
                        c3122 = c3122;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    } else {
                        iM25612 = i50;
                        iM2567 = C0630.m2566("۠ۛ") ^ i35;
                        i36 = ((iM2567 ^ i34) * 12907) ^ 326209972;
                        i9 = -869514133;
                        i10 = iM2567 ^ i9;
                        sArr7 = sArr;
                        i44 = i8;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                        i43 = i7;
                        i46 = i6;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                        c20067 = c20067;
                        c192511 = c192511;
                        i37 = i10;
                        i42 = i42;
                        str5 = str5;
                        str4 = str4;
                        abstractActivityC12266 = this;
                        r8 = r11;
                        c3122 = c3122;
                        r11 = r8;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    }
                    break;
                case 241136172:
                case 1950969722:
                    DialogInterfaceOnClickListenerC2527 dialogInterfaceOnClickListenerC25214 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    C19258 c192513 = c192511;
                    DialogInterfaceOnClickListenerC10944 dialogInterfaceOnClickListenerC10946 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    short[] sArr16 = sArr8;
                    int i51 = i43;
                    int i52 = i44;
                    String str9 = str4;
                    String str10 = str5;
                    int i53 = i42;
                    C20065 c200611 = c20067;
                    short[] sArr17 = sArr9;
                    short[] sArr18 = sArr7;
                    int iM69816 = C2105.m6981(C3746.m11357(sArr18, 204, 3, i38)) ^ 2126180885;
                    int i54 = iM25612;
                    if (iM7041 == i54) {
                        int iM25617 = (i35 - C0630.m2566("ۤۧ")) * (-31);
                        sArr7 = sArr18;
                        i44 = i52;
                        sArr8 = sArr16;
                        sArr9 = sArr17;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25214;
                        i43 = i51;
                        i46 = iM69816;
                        i36 = ((iM25617 ^ i34) * (-32131)) ^ 1530613925;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10946;
                        c20067 = c200611;
                        c192511 = c192513;
                        r8 = 0;
                        i37 = iM25617 ^ (-179091189);
                        i42 = i53;
                        str5 = str10;
                        str4 = str9;
                        iM25612 = i54;
                    } else {
                        int iM69817 = C2105.m6981("ۡۙ") ^ i34;
                        i36 = ((iM69817 ^ i35) * (-17269)) ^ (-1014247345);
                        sArr7 = sArr18;
                        i44 = i52;
                        i46 = iM69816;
                        sArr8 = sArr16;
                        sArr9 = sArr17;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25214;
                        i43 = i51;
                        iM25612 = i54;
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10946;
                        c20067 = c200611;
                        c192511 = c192513;
                        i37 = iM69817 ^ (-1486011184);
                        i42 = i53;
                        str5 = str10;
                        str4 = str9;
                        r8 = 0;
                    }
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case 257707117:
                case 690127573:
                    i6 = i46;
                    dialogInterfaceOnClickListenerC2528 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c192511 = c192511;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c3122 = c3122;
                    sArr2 = sArr8;
                    i7 = i43;
                    i8 = i44;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20067 = c20067;
                    sArr3 = sArr9;
                    if (iM7041 == (C2105.m6981(C2272.m7507(f36523, 210, 3, i38)) ^ 2101517045)) {
                        iM2568 = C2105.m6981("۬᩺") ^ i35;
                        i11 = ((iM2568 ^ i34) * (-22477)) ^ 1001782985;
                        i14 = -275605913;
                    } else {
                        iM2568 = (C2105.m6981("᩺ۗ") + i34) * (-59);
                        i11 = ((iM2568 ^ i35) * (-18557)) ^ (-1838562734);
                        i14 = -111803962;
                    }
                    i13 = iM2568 ^ i14;
                    i44 = i8;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2528;
                    i43 = i7;
                    i46 = i6;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i13;
                    i36 = i11;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case 459829903:
                case 543168306:
                    C19258 c192514 = c192511;
                    C1294.m4380(c192514, C0630.m2566(C3911.m11919(sArr8, i43, i44, i38)) ^ 2120684269, dialogInterfaceOnClickListenerC10945);
                    C5695.m16035(c192514, i46, r11);
                    RunnableC0588.m2438(c192514);
                    return z;
                case 593240698:
                case 1536363426:
                    C3746.m11369();
                    if (!C2272.f7362) {
                        i4 = iM6989;
                        int iM25618 = (C0630.m2566("ۧ᩸") + i34) * (-123);
                        iM6989 = i4;
                        i36 = ((iM25618 ^ i35) * 7745) ^ 921560606;
                        i37 = iM25618 ^ 744016823;
                    } else {
                        iM2566 = C0630.m2566("۬᩵") ^ i35;
                        i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM2566 ^ i2;
                        i36 = i;
                    }
                    break;
                case 648065797:
                case 1173674749:
                    C1711.m5728(C0630.m2566(AbstractC2021.m6573(f36523, 207, 3, i38)) ^ 2120883409);
                    return z;
                case 903349803:
                case 1272212842:
                    i38 = 38451;
                    iM6981 = (i34 - C2105.m6981("ۙ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i36 = ((iM6981 ^ i35) * (-26001)) ^ (-1523589984);
                    i5 = 658426457;
                    i10 = iM6981 ^ i5;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25212;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10945;
                    c20067 = c20067;
                    c192511 = c192511;
                    i37 = i10;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC12266 = this;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case 987331994:
                case 1347506225:
                    dialogInterfaceOnClickListenerC25211 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    if (C0964.m3400(ApplicationC20075.f65008, C2958.m9035(RunnableC0588.m2436(f36523, 272, 11, i38), C4263.m12817(f36523, 240, 32, i38)), z2)) {
                        iM25610 = (i35 - C2105.m6981("ۤ֨")) * (-93);
                        i24 = ((iM25610 ^ i34) * 25889) ^ 456133431;
                        i25 = 1283109087;
                    } else {
                        iM25610 = (C0630.m2566("ۧ᩹") ^ i34) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i24 = ((iM25610 ^ i35) * (-22579)) ^ 1569006033;
                        i25 = -682698936;
                    }
                    i37 = iM25610 ^ i25;
                    i36 = i24;
                    dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25211;
                    r11 = r11;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                case 1003895302:
                case 2034865281:
                    C2958.m9034();
                    C3683.m11222();
                    iM2566 = C0630.m2566("۬᩵") ^ i35;
                    i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                    i2 = 783796338;
                    i37 = iM2566 ^ i2;
                    i36 = i;
                    break;
                case 1336748115:
                case 2099760657:
                    new C0977(abstractActivityC12266, abstractActivityC12266);
                    return z;
                case 1519889928:
                case 1545317504:
                    dialogInterfaceOnClickListenerC25210 = dialogInterfaceOnClickListenerC25212;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    c19259 = c192511;
                    c3122 = c3122;
                    str4 = str4;
                    str5 = str5;
                    i42 = i42;
                    c20066 = c20067;
                    sArr6 = sArr9;
                    C7106.m19114(c19259, iM6988 ^ 2097684097);
                    DialogInterfaceOnClickListenerC10944 dialogInterfaceOnClickListenerC10947 = new DialogInterfaceOnClickListenerC10944(z ? 1 : 0, abstractActivityC12266);
                    sArr8 = f36523;
                    i43 = 219;
                    i44 = 3;
                    if (RunnableC0588.m2441() >= 0) {
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10947;
                        int iM25619 = C0630.m2566("ۤ᩷") ^ i35;
                        i37 = iM25619 ^ 1609742930;
                        c192511 = c19259;
                        i36 = ((iM25619 ^ i34) * (-11477)) ^ 824378909;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25210;
                    } else {
                        int iM69818 = (i35 - C2105.m6981("ۡ֡")) * (-81);
                        i36 = ((iM69818 ^ i34) * 17059) ^ 1605341546;
                        i37 = iM69818 ^ (-1632382702);
                        dialogInterfaceOnClickListenerC10945 = dialogInterfaceOnClickListenerC10947;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC25210;
                        c192511 = c19259;
                    }
                    c20067 = c20066;
                    i42 = i42;
                    str5 = str5;
                    str4 = str4;
                    r8 = r11;
                    c3122 = c3122;
                    r11 = r8;
                    dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    break;
                default:
                    ServiceConnectionC3453.m10564();
                    if (!C0798.f2919) {
                        dialogInterfaceOnClickListenerC2527 = dialogInterfaceOnClickListenerC25212;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                        strM1958 = str5;
                        str = str4;
                        i3 = i42;
                        int iM69819 = C2105.m6981("ۤۨ") ^ i34;
                        i23 = ((iM69819 ^ i35) * (-28707)) ^ 1664520717;
                        i37 = iM69819 ^ (-706949829);
                        str4 = str;
                        i42 = i3;
                        dialogInterfaceOnClickListenerC25212 = dialogInterfaceOnClickListenerC2527;
                        str5 = strM1958;
                        i36 = i23;
                        r11 = r11;
                        dialogInterfaceOnClickListenerC3573 = dialogInterfaceOnClickListenerC3573;
                    } else {
                        iM2566 = C0630.m2566("۬᩵") ^ i35;
                        i = ((iM2566 ^ i34) * (-29089)) ^ 185729853;
                        i2 = 783796338;
                        i37 = iM2566 ^ i2;
                        i36 = i;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0138, code lost:
    
        if (l.C1420.f5096 > 0) goto L14;
     */
    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29792() {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        C8739 c8739;
        int i7;
        int iM6983;
        int i8;
        StringBuilder sb;
        String str;
        int iM2567;
        int i9;
        int i10;
        int i11;
        String str2;
        int iM2568;
        int i12;
        int i13 = -1665758572;
        int i14 = C2958.f9394;
        int i15 = RunnableC3474.f10992;
        int iM6984 = (i14 - C2105.m6981("֡᩸")) * 27;
        int i16 = ((iM6984 ^ i15) * 19311) ^ 171582390;
        int i17 = iM6984 ^ (-567845588);
        int[] iArr = null;
        C8739 c87310 = null;
        StringBuilder sb2 = null;
        String strM1959 = null;
        String strM9250 = null;
        String strM19510 = null;
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
        String strM6988 = null;
        Iterator itM12354 = null;
        StringBuilder sb3 = null;
        C8739 c87311 = null;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-253)) >> 31));
            switch (i13) {
                case -1942518098:
                case 1663151346:
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb4 = sb3;
                    i28 = i28;
                    sb3 = sb4;
                    i30 = i29 * i29;
                    i31 = s * 2;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ᩴ֨") ^ i14;
                        i3 = ((iM2566 ^ i15) * 23131) ^ 1901306183;
                        i4 = 934941712;
                    } else {
                        iM2566 = C2105.m6981("֡᩺") ^ i14;
                        i3 = ((iM2566 ^ i15) * (-15859)) ^ 803538593;
                        i4 = -808816591;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    strM9250 = C3019.m9250(sArr3, i18, i20, i19);
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ۨۨ") ^ i14;
                        i = ((iM6981 ^ i15) * (-6487)) ^ (-2067993145);
                        i2 = -619948667;
                    } else {
                        iM6981 = C2105.m6981("ܽ֨") ^ i15;
                        i = ((iM6981 ^ i14) * (-8373)) ^ (-577114793);
                        i2 = 1981079779;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case -1807385931:
                case 1415055521:
                    sArr3 = f36523;
                    i18 = 337;
                    i20 = 3;
                    if (!C1916.f6442) {
                        arrayList = arrayList;
                        iM2568 = (C0630.m2566("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM2568 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM2568 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        iM6981 = (C0630.m2566("ۗۙ") + i14) * (-67);
                        i = ((iM6981 ^ i15) * 6159) ^ 1908156087;
                        i2 = 1175274419;
                        i17 = iM6981 ^ i2;
                        i16 = i;
                    }
                    break;
                case -1716738039:
                case -616978357:
                    i34++;
                    i23 = i25;
                    i33 = i26;
                    i7 = i28;
                    int iM2569 = (C0630.m2566("۠᩷") + i15) * 115;
                    i28 = i7;
                    i16 = ((iM2569 ^ i14) * 5329) ^ (-34994253);
                    i17 = iM2569 ^ (-536349508);
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
                    iM2566 = C0630.m2566("ۜۛ") ^ i14;
                    i3 = ((iM2566 ^ i15) * (-13187)) ^ (-1690222544);
                    i4 = -2130340454;
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    if (c87311.f26611 == null) {
                        i25 = i23;
                        i26 = i27;
                        arrayList = arrayList;
                        iM2568 = (C0630.m2566("ᩳܽ") + i14) * (-7);
                        i9 = ((iM2568 ^ i15) * (-4573)) ^ (-892610306);
                        i12 = -1865625614;
                        i17 = iM2568 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        iM6981 = (i14 - C2105.m6981("ܰ۠")) * (-101);
                        i = ((iM6981 ^ i15) * (-9179)) ^ (-1662017761);
                        i2 = 2022830243;
                        i17 = iM6981 ^ i2;
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
                    iM6983 = (C0630.m2566("۬۬") + i15) * (-99);
                    i3 = ((iM6983 ^ i14) * (-30783)) ^ (-1405393916);
                    i8 = 608721658;
                    i17 = iM6983 ^ i8;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i39 = i28;
                    sb3 = sb3;
                    i28 = i39;
                    break;
                case -1529310127:
                case 1295091035:
                    str2 = strM6988;
                    StringBuilder sb5 = sb2;
                    C1420.m4905(sb5, str2);
                    C0422.m1944(sb5, i33);
                    strM19510 = C0050.m947(sb5);
                    sb = sb3;
                    int iM6985 = (i15 - C2105.m6981("᩸ۜ")) * (-89);
                    strM6988 = str2;
                    i16 = ((iM6985 ^ i14) * 8717) ^ (-2139274337);
                    i17 = iM6985 ^ (-1907482688);
                    sb3 = sb;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case -1417416792:
                case -307006880:
                    C21923.m49340(this.f10584, this.f36527);
                    break;
                case -1344873671:
                case -1135955947:
                    str2 = strM6988;
                    sb = sb3;
                    C3245.m9923(sb, str2);
                    C0050.m945(sb, i22);
                    strM19510 = C0422.m1959(sb);
                    int iM6986 = (i15 - C2105.m6981("᩸ۜ")) * (-89);
                    strM6988 = str2;
                    i16 = ((iM6986 ^ i14) * 8717) ^ (-2139274337);
                    i17 = iM6986 ^ (-1907482688);
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
                        iM6983 = C2105.m6981("ᩴܽ") ^ i15;
                        sb3 = sb;
                        i3 = ((iM6983 ^ i14) * (-31295)) ^ (-1715941993);
                        i8 = 443322022;
                        i17 = iM6983 ^ i8;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i310 = i28;
                        sb3 = sb3;
                        i28 = i310;
                    } else {
                        int iM6987 = C2105.m6981("۟ۜ") ^ i14;
                        i16 = ((iM6987 ^ i15) * (-20235)) ^ (-1857772895);
                        i17 = iM6987 ^ (-645956017);
                        i28 = i40;
                        sb3 = sb;
                        i18 = i18;
                        arrayList = arrayList;
                    }
                    break;
                case -1165082304:
                case 885398726:
                    if (!C2126.f7087) {
                        iM6981 = C0630.m2566("ۨۨ") ^ i14;
                        i = ((iM6981 ^ i15) * (-6487)) ^ (-2067993145);
                        i2 = -619948667;
                        i17 = iM6981 ^ i2;
                        i16 = i;
                    } else {
                        c87311 = c87311;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i32 = i32;
                        i18 = i18;
                        StringBuilder sb6 = sb3;
                        i28 = i28;
                        sb3 = sb6;
                        iM2566 = C2105.m6981("᩸ۨ") ^ i14;
                        i3 = ((iM2566 ^ i15) * 11815) ^ 773212168;
                        i4 = -1878775493;
                        i11 = iM2566 ^ i4;
                        i32 = i32;
                        c87311 = c87311;
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
                    C3432.m10477();
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("ۨۨ") ^ i14;
                        i = ((iM6981 ^ i15) * (-6487)) ^ (-2067993145);
                        i2 = -619948667;
                        i17 = iM6981 ^ i2;
                        i16 = i;
                    } else {
                        arrayList = arrayList;
                        iM2568 = (C0630.m2566("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM2568 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM2568 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    }
                    break;
                case -998051475:
                case 1391960528:
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb7 = sb3;
                    i28 = i28;
                    sb3 = sb7;
                    i29 = s + 1;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ۤۡ") ^ i15) * (-61);
                        i3 = ((iM2566 ^ i14) * (-18243)) ^ 1415773197;
                        i4 = 297238576;
                    } else {
                        iM2566 = (C0630.m2566("ܽᩴ") ^ i14) * (-7);
                        i3 = ((iM2566 ^ i15) * (-6569)) ^ (-501687849);
                        i4 = 791720626;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb8 = sb3;
                    i28 = i28;
                    sb3 = sb8;
                    s = sArr[c];
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ᩳۜ") ^ i15;
                        i3 = ((iM2566 ^ i14) * 30171) ^ (-768451150);
                        i4 = 1634795618;
                    } else {
                        iM2566 = C2105.m6981("֫᩶") ^ i15;
                        i3 = ((iM2566 ^ i14) * (-28139)) ^ 1930003672;
                        i4 = -1519847701;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    if (C0483.m2123(itM12354)) {
                        iM6983 = C0630.m2566("۠᩹") ^ i15;
                        i3 = ((iM6983 ^ i14) * 3599) ^ (-1508643132);
                        i8 = 1767981410;
                    } else {
                        iM6983 = (i14 - C2105.m6981("᩷ۛ")) * (-95);
                        i3 = ((iM6983 ^ i15) * 27155) ^ 2026766434;
                        i8 = -453892036;
                    }
                    i17 = iM6983 ^ i8;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i314 = i28;
                    sb3 = sb3;
                    i28 = i314;
                    break;
                case -741899333:
                case -616925360:
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb10 = sb3;
                    i28 = i28;
                    sb3 = sb10;
                    c = 335;
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("᩸ۨ") ^ i14;
                        i3 = ((iM2566 ^ i15) * 11815) ^ 773212168;
                        i4 = -1878775493;
                    } else {
                        iM2566 = (C2105.m6981("۫ۤ") + i14) * (-79);
                        i3 = ((iM2566 ^ i15) * (-1181)) ^ (-1638943802);
                        i4 = 1349835591;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    iM2566 = C0630.m2566("ۜۛ") ^ i14;
                    i3 = ((iM2566 ^ i15) * (-13187)) ^ (-1690222544);
                    i4 = -2130340454;
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    C8739 c87312 = c87310;
                    if (c87312.f26611 != null) {
                        int iM6988 = (i14 - C2105.m6981("ۗۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        c87310 = c87312;
                        i16 = ((iM6988 ^ i15) * 24017) ^ 438425242;
                        i17 = iM6988 ^ (-1179204376);
                    } else {
                        c87310 = c87312;
                        i22 = i24;
                        arrayList = arrayList;
                        i18 = i18;
                        sb3 = sb3;
                        iM6983 = (C0630.m2566("۬۬") + i15) * (-99);
                        i3 = ((iM6983 ^ i14) * (-30783)) ^ (-1405393916);
                        i8 = 608721658;
                        i17 = iM6983 ^ i8;
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
                    C0050.m945(sb11, i21);
                    if (C7811.f24123 >= 0) {
                        sb3 = sb11;
                        i18 = i18;
                        iM2568 = (C0630.m2566("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM2568 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM2568 ^ i12;
                        i16 = i9;
                    } else {
                        int iM25610 = C0630.m2566("۠֡") ^ i14;
                        sb3 = sb11;
                        i16 = ((iM25610 ^ i15) * (-30233)) ^ (-85042351);
                        i17 = iM25610 ^ 1231597635;
                    }
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case -241394856:
                case -15032842:
                    arrayList = arrayList;
                    i18 = i18;
                    sb3 = sb3;
                    itM12354 = C4117.m12354(arrayList);
                    i21 = i35;
                    i22 = 0;
                    iM6983 = (C0630.m2566("۬۬") + i15) * (-99);
                    i3 = ((iM6983 ^ i14) * (-30783)) ^ (-1405393916);
                    i8 = 608721658;
                    i17 = iM6983 ^ i8;
                    i16 = i3;
                    i18 = i18;
                    arrayList = arrayList;
                    int i318 = i28;
                    sb3 = sb3;
                    i28 = i318;
                    break;
                case -142936235:
                case 10024710:
                    C3683.m11222();
                    C1916.m6308();
                    break;
                case -122474669:
                case 1148939757:
                    C2126.m7040();
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb12 = sb3;
                    i28 = i28;
                    sb3 = sb12;
                    iM2566 = C2105.m6981("ᩳۜ") ^ i15;
                    i3 = ((iM2566 ^ i14) * 30171) ^ (-768451150);
                    i4 = 1634795618;
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb13 = sb3;
                    i28 = i28;
                    sb3 = sb13;
                    if ((i31 + 1) - i30 <= 0) {
                        iM2566 = (C2105.m6981("ۚ۬") ^ i15) * 79;
                        i3 = ((iM2566 ^ i14) * 28629) ^ 1911032881;
                        i4 = -1785386755;
                    } else {
                        iM2566 = (i15 - C2105.m6981("᩷ۖ")) * (-31);
                        i3 = ((iM2566 ^ i14) * (-13241)) ^ (-945922377);
                        i4 = -149805815;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb14 = sb3;
                    i28 = i28;
                    sb3 = sb14;
                    sArr = f36523;
                    if (C0630.m2564()) {
                        iM2566 = (C0630.m2566("ۢۘ") ^ i14) * (-101);
                        i3 = ((iM2566 ^ i15) * 2935) ^ (-338735012);
                        i4 = -132540340;
                    } else {
                        iM2566 = (C0630.m2566("ܿ᩷") ^ i15) * 59;
                        i3 = ((iM2566 ^ i14) * 13955) ^ (-1281628277);
                        i4 = 1270934759;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    str = strM6988;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb15 = sb2;
                    c87310 = (C8739) RunnableC1108.m3791(itM12354);
                    if (!c87310.m22600()) {
                        iM2567 = C0630.m2566("ܿܽ") ^ i15;
                        sb2 = sb15;
                        i9 = ((iM2567 ^ i14) * (-9417)) ^ 89064211;
                        i10 = -1947891986;
                        i17 = iM2567 ^ i10;
                        strM6988 = str;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        sb2 = sb15;
                        strM6988 = str;
                        sb3 = sb3;
                        iM6983 = (C0630.m2566("۬۬") + i15) * (-99);
                        i3 = ((iM6983 ^ i14) * (-30783)) ^ (-1405393916);
                        i8 = 608721658;
                        i17 = iM6983 ^ i8;
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
                    c87311 = c87311;
                    short[] sArr4 = sArr2;
                    i32 = i32;
                    strM6988 = C2105.m6988(sArr4, i32, 1, i19);
                    i35 = 0;
                    if (z) {
                        iM2566 = (C0630.m2566("᩵ۗ") + i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        sArr2 = sArr4;
                        i3 = ((iM2566 ^ i15) * (-25665)) ^ (-2146370813);
                        i4 = -144057234;
                    } else {
                        sArr2 = sArr4;
                        iM2566 = C0630.m2566("᩵᩶") ^ i15;
                        i3 = ((iM2566 ^ i14) * (-30897)) ^ (-1008704133);
                        i4 = -1871374252;
                    }
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    C21923.m49340(this.f10584, strM1959);
                    break;
                case 359483960:
                case 678029631:
                    i7 = this.f36534;
                    iArr = this.f36531;
                    i34 = i35;
                    i33 = 0;
                    i23 = 0;
                    int iM25611 = (C0630.m2566("۠᩷") + i15) * 115;
                    i28 = i7;
                    i16 = ((iM25611 ^ i14) * 5329) ^ (-34994253);
                    i17 = iM25611 ^ (-536349508);
                    i18 = i18;
                    arrayList = arrayList;
                    int i3114 = i28;
                    sb3 = sb3;
                    i28 = i3114;
                    break;
                case 402574149:
                case 1705016905:
                    StringBuilder sbM19190 = C7166.m19190(strM19510, strM9250);
                    C3245.m9923(sbM19190, this.f36527);
                    strM1959 = C0422.m1959(sbM19190);
                    iM6981 = (i14 - C0630.m2566("ᩳܳ")) * 17;
                    i = ((iM6981 ^ i15) * (-29431)) ^ 1439444913;
                    i2 = 334854571;
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                case 423244983:
                case 744324869:
                    arrayList = arrayList;
                    c87311 = (C8739) C3537.m10755(arrayList, iArr[i34]);
                    if (c87311.m22600()) {
                        i26 = i33;
                        i25 = i23;
                        iM2568 = (C0630.m2566("ᩳܽ") + i14) * (-7);
                        i9 = ((iM2568 ^ i15) * (-4573)) ^ (-892610306);
                        i12 = -1865625614;
                    } else {
                        iM2568 = (C0630.m2566("᩶᩷") + i15) * (-21);
                        i18 = i18;
                        i9 = ((iM2568 ^ i14) * 8837) ^ (-427580459);
                        i12 = 1023565312;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i9;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case 559885537:
                case 785874752:
                    c8739 = c87311;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb17 = sb3;
                    i28 = i28;
                    sb3 = sb17;
                    boolean z2 = this.f36533;
                    sArr2 = f36523;
                    i32 = 336;
                    if (C4263.m12819() >= 0) {
                        z = z2;
                        int iM25612 = C0630.m2566("ܶ᩻") ^ i15;
                        i3 = ((iM25612 ^ i14) * 9451) ^ 1762059883;
                        i11 = iM25612 ^ 630282821;
                        c87311 = c8739;
                        i17 = i11;
                        i16 = i3;
                    } else {
                        int iM6989 = (C2105.m6981("ܽۧ") ^ i15) * 49;
                        z = z2;
                        i16 = ((iM6989 ^ i14) * 23039) ^ 1074011084;
                        c87311 = c8739;
                        i17 = iM6989 ^ (-1668481064);
                    }
                    i18 = i18;
                    arrayList = arrayList;
                    int i3115 = i28;
                    sb3 = sb3;
                    i28 = i3115;
                    break;
                case 774787602:
                case 2123441055:
                    if (C22628.f73083 <= 0) {
                        arrayList = arrayList;
                        iM2568 = (C0630.m2566("۠ۙ") + i15) * 59;
                        i18 = i18;
                        i9 = ((iM2568 ^ i14) * 10999) ^ (-1479444153);
                        i12 = -811777097;
                        i17 = iM2568 ^ i12;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        c8739 = c87311;
                        arrayList = arrayList;
                        i18 = i18;
                        StringBuilder sb18 = sb3;
                        i28 = i28;
                        sb3 = sb18;
                        int iM25613 = C0630.m2566("ܶ᩻") ^ i15;
                        i3 = ((iM25613 ^ i14) * 9451) ^ 1762059883;
                        i11 = iM25613 ^ 630282821;
                        c87311 = c8739;
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
                    iM2568 = (C0630.m2566("ᩳܽ") + i14) * (-7);
                    i9 = ((iM2568 ^ i15) * (-4573)) ^ (-892610306);
                    i12 = -1865625614;
                    i17 = iM2568 ^ i12;
                    i16 = i9;
                    i18 = i18;
                    arrayList = arrayList;
                    break;
                case 871067123:
                case 1948750962:
                    int i41 = i18;
                    C8739 c87313 = c87311;
                    short[] sArr5 = sArr2;
                    int i42 = i32;
                    StringBuilder sb19 = sb3;
                    i28 = i28;
                    sb3 = sb19;
                    ArrayList arrayList2 = this.f36537;
                    if (arrayList2 == null) {
                        iM6982 = (C0630.m2566("ܿ֨") + i14) * 95;
                        i5 = ((iM6982 ^ i15) * (-25917)) ^ (-803910993);
                        i6 = 368566592;
                    } else {
                        iM6982 = C2105.m6981("ۧܽ") ^ i14;
                        i5 = ((iM6982 ^ i15) * 6735) ^ 1106493973;
                        i6 = -604669727;
                    }
                    i32 = i42;
                    c87311 = c87313;
                    sArr2 = sArr5;
                    i17 = iM6982 ^ i6;
                    i18 = i41;
                    arrayList = arrayList2;
                    i16 = i5;
                    int i3117 = i28;
                    sb3 = sb3;
                    i28 = i3117;
                    break;
                case 1204274993:
                case 1590516469:
                    if (C2958.f9394 >= 0) {
                        c87311 = c87311;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i32 = i32;
                        i18 = i18;
                        StringBuilder sb20 = sb3;
                        i28 = i28;
                        sb3 = sb20;
                        iM2566 = C2105.m6981("ᩴ֨") ^ i14;
                        i3 = ((iM2566 ^ i15) * 23131) ^ 1901306183;
                        i4 = 934941712;
                        i11 = iM2566 ^ i4;
                        i32 = i32;
                        c87311 = c87311;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i3118 = i28;
                        sb3 = sb3;
                        i28 = i3118;
                    }
                    c87311 = c87311;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i32 = i32;
                    i18 = i18;
                    StringBuilder sb110 = sb3;
                    i28 = i28;
                    sb3 = sb110;
                    iM2566 = C2105.m6981("ᩳۜ") ^ i15;
                    i3 = ((iM2566 ^ i14) * 30171) ^ (-768451150);
                    i4 = 1634795618;
                    i11 = iM2566 ^ i4;
                    i32 = i32;
                    c87311 = c87311;
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
                    C2272.m7503();
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ۘ۫") ^ i15;
                        i = ((iM6981 ^ i14) * (-14697)) ^ 1118769685;
                        i2 = -1576356558;
                        i17 = iM6981 ^ i2;
                        i16 = i;
                    } else {
                        c87311 = c87311;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i32 = i32;
                        i18 = i18;
                        StringBuilder sb111 = sb3;
                        i28 = i28;
                        sb3 = sb111;
                        iM2566 = C2105.m6981("ᩳۜ") ^ i15;
                        i3 = ((iM2566 ^ i14) * 30171) ^ (-768451150);
                        i4 = 1634795618;
                        i11 = iM2566 ^ i4;
                        i32 = i32;
                        c87311 = c87311;
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
                    str = strM6988;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb21 = new StringBuilder();
                    C0422.m1944(sb21, i23);
                    if (C3432.f10845 < 0) {
                        iM2567 = C2105.m6981("ܳ᩹") ^ i14;
                        sb2 = sb21;
                        i9 = ((iM2567 ^ i15) * (-14291)) ^ (-621363098);
                        i10 = 1375385440;
                        i17 = iM2567 ^ i10;
                        strM6988 = str;
                        i16 = i9;
                        i18 = i18;
                        arrayList = arrayList;
                    } else {
                        strM6988 = str;
                        sb2 = sb21;
                        StringBuilder sb22 = sb3;
                        i28 = i28;
                        sb3 = sb22;
                        iM2566 = (C0630.m2566("ۢۘ") ^ i14) * (-101);
                        i3 = ((iM2566 ^ i15) * 2935) ^ (-338735012);
                        i4 = -132540340;
                        i11 = iM2566 ^ i4;
                        i32 = i32;
                        c87311 = c87311;
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
                    if (this.f36527 != null) {
                        iM6981 = C0630.m2566("ۛ֡") ^ i15;
                        i = ((iM6981 ^ i14) * 10539) ^ (-426861152);
                        i2 = 900865834;
                    } else {
                        strM1959 = strM19510;
                        iM6981 = (i14 - C0630.m2566("ᩳܳ")) * 17;
                        i = ((iM6981 ^ i15) * (-29431)) ^ 1439444913;
                        i2 = 334854571;
                    }
                    i17 = iM6981 ^ i2;
                    i16 = i;
                    break;
                default:
                    C2520.m8026();
                    if (C3683.f11629 >= 0) {
                        arrayList = arrayList;
                        i18 = i18;
                        StringBuilder sb23 = sb3;
                        i28 = i28;
                        sb3 = sb23;
                        iM2566 = (C0630.m2566("ۢۘ") ^ i14) * (-101);
                        i3 = ((iM2566 ^ i15) * 2935) ^ (-338735012);
                        i4 = -132540340;
                        i11 = iM2566 ^ i4;
                        i32 = i32;
                        c87311 = c87311;
                        sArr2 = sArr2;
                        i17 = i11;
                        i16 = i3;
                        i18 = i18;
                        arrayList = arrayList;
                        int i31112 = i28;
                        sb3 = sb3;
                        i28 = i31112;
                    }
                    c8739 = c87311;
                    arrayList = arrayList;
                    i18 = i18;
                    StringBuilder sb112 = sb3;
                    i28 = i28;
                    sb3 = sb112;
                    int iM25614 = C0630.m2566("ܶ᩻") ^ i15;
                    i3 = ((iM25614 ^ i14) * 9451) ^ 1762059883;
                    i11 = iM25614 ^ 630282821;
                    c87311 = c8739;
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
    
        if (l.C11340.m28031() == false) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m29762(AbstractActivityC12266 abstractActivityC12266) {
        int iM6981;
        int i;
        int i2;
        int iM2566 = 0;
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
        int i10 = C11340.f33930;
        int i11 = C1294.f4556;
        int iM6982 = (C2105.m6981("۫ۧ") ^ i10) * (-27);
        int i12 = ((iM6982 ^ i11) * (-6443)) ^ (-645121172);
        int i13 = iM6982 ^ 1038585672;
        String strM3841 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-2085)) >> 31));
            switch (i9) {
                case -1567614808:
                case 189029411:
                    iM2566 = iM2566;
                    sArr = f36523;
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("۠᩷") ^ i11;
                        i = ((iM6981 ^ i10) * 20683) ^ 2126405221;
                        i2 = 1637645059;
                    } else {
                        iM6981 = C2105.m6981("֡ۢ") ^ i11;
                        i = ((iM6981 ^ i10) * (-18539)) ^ 1548328858;
                        i2 = 496648549;
                    }
                    int i14 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i14;
                    break;
                case -1307646869:
                case 136623157:
                    break;
                case -1299037649:
                case 10637083:
                    ViewOnClickListenerC1958.m6429();
                    if (C3019.f9544 < 0) {
                        iM2566 = iM2566;
                        iM6981 = C0630.m2566("ۚ۟") ^ i10;
                        i = ((iM6981 ^ i11) * 365) ^ (-965422760);
                        i2 = -1828012928;
                        int i15 = iM2566;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        iM2566 = i15;
                    }
                    iM2566 = iM2566;
                    iM6981 = C2105.m6981("۬ۙ") ^ i11;
                    i = ((iM6981 ^ i10) * (-12285)) ^ (-2112848291);
                    i2 = -1748065260;
                    int i16 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i16;
                    break;
                case -1298862943:
                case 899445951:
                    iM2566 = iM2566;
                    s2 = 1;
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("۬ۙ") ^ i11;
                        i = ((iM6981 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM6981 = (C2105.m6981("ۤۤ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6981 ^ i10) * 20369) ^ (-56101540);
                        i2 = -30162732;
                    }
                    int i17 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i17;
                    break;
                case -1178160031:
                case 952553298:
                    C0422.m1963();
                    ServiceConnectionC3453.m10564();
                    break;
                case -1177334432:
                case 1882840702:
                    iM2566 = iM2566;
                    i8 = 3;
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("ۚ۟") ^ i10;
                        i = ((iM6981 ^ i11) * 365) ^ (-965422760);
                        i2 = -1828012928;
                    } else {
                        iM6981 = C0630.m2566("ۛۙ") ^ i10;
                        i = ((iM6981 ^ i11) * 1709) ^ (-1975708729);
                        i2 = 1772108438;
                    }
                    int i18 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i18;
                    break;
                case -1114978572:
                case 878591078:
                    strM3841 = C1128.m3841(sArr2, i7, i8, i6);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = iM2566;
                        iM6981 = C2105.m6981("۬ۙ") ^ i11;
                        i = ((iM6981 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM6981 = (i11 - C0630.m2566("ۖܺ")) * (-67);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * 28451) ^ (-1038250591);
                        i2 = 1815376233;
                    }
                    int i19 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i19;
                    break;
                case -1073616380:
                case 1169527303:
                    iM2566 = iM2566;
                    int i20 = s + s2;
                    if ((i20 * i20) - i5 < 0) {
                        iM6981 = C0630.m2566("ۜ᩺") ^ i11;
                        i = ((iM6981 ^ i10) * 29875) ^ (-1487549567);
                        i2 = 1986555584;
                    } else {
                        iM6981 = C0630.m2566("ۧۨ") ^ i10;
                        i = ((iM6981 ^ i11) * (-12179)) ^ 162194176;
                        i2 = -313967096;
                    }
                    int i110 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i110;
                    break;
                case -1005598657:
                case -648005643:
                    i6 = 469;
                    iM6981 = C2105.m6981("ܰܰ") ^ i10;
                    i = ((iM6981 ^ i11) * (-5599)) ^ 100891571;
                    i2 = -1010206278;
                    int i111 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i111;
                    break;
                case -993563313:
                case -560371968:
                    break;
                case -835438741:
                case 962840021:
                    i6 = 57274;
                    iM6981 = C2105.m6981("ܰܰ") ^ i10;
                    i = ((iM6981 ^ i11) * (-5599)) ^ 100891571;
                    i2 = -1010206278;
                    int i112 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i112;
                    break;
                case -829152577:
                case -607636646:
                    iM2566 = iM2566;
                    c = 7;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("۬ۙ") ^ i11;
                        i = ((iM6981 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM6981 = C0630.m2566("᩵᩷") ^ i10;
                        i = ((iM6981 ^ i11) * 11617) ^ (-315998018);
                        i2 = -342737789;
                    }
                    int i113 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i113;
                    break;
                case -689802684:
                case 720114827:
                    C1504.m5167(iM2566 ^ i3);
                    iM2566 = iM2566;
                    iM6981 = (i11 - C0630.m2566("ܳۘ")) * (-27);
                    i = ((iM6981 ^ i10) * 18587) ^ (-391077063);
                    i2 = 1323984561;
                    int i114 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i114;
                    break;
                case -689259764:
                case -142264606:
                    iM2566 = iM2566;
                    sArr2 = f36523;
                    i7 = 8;
                    if (C3663.f11553) {
                        iM2566 = iM2566;
                        iM6981 = (C2105.m6981("ۚۗ") + i11) * (-35);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * 12009) ^ 77317962;
                        i2 = 429239037;
                    } else {
                        iM6981 = (i10 - C0630.m2566("ۖᩳ")) * q.h;
                        i = ((iM6981 ^ i11) * (-1905)) ^ 1173048998;
                        i2 = 569608579;
                    }
                    int i115 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i115;
                    break;
                case -465859642:
                case 1556470850:
                    iM2566 = C0630.m2566(strM3841);
                    if (C2167.f7158 >= 0) {
                        i3 = 2099656562;
                        iM6981 = (C2105.m6981("ۚۗ") + i11) * (-35);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * 12009) ^ 77317962;
                        i2 = 429239037;
                        int i116 = iM2566;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        iM2566 = i116;
                    } else {
                        int iM6983 = C2105.m6981("᩵ۙ") ^ i10;
                        i13 = iM6983 ^ 46886524;
                        i12 = ((iM6983 ^ i11) * (-3329)) ^ 859125794;
                        i3 = 2099656562;
                    }
                    break;
                case -246958163:
                case 1158409856:
                    iM2566 = iM2566;
                    i4 = s * 2;
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۗۚ") ^ i10;
                        i = ((iM6981 ^ i11) * 12951) ^ (-153593936);
                        i2 = -163111621;
                    } else {
                        iM6981 = C0630.m2566("ܺ۬") ^ i10;
                        i = ((iM6981 ^ i11) * (-32327)) ^ 209062419;
                        i2 = 703745196;
                    }
                    int i117 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i117;
                    break;
                case -120218430:
                case 400799878:
                    iM2566 = iM2566;
                    if (abstractActivityC12266.m29774(true)) {
                        iM6981 = C2105.m6981("ۡ۠") ^ i11;
                        i = ((iM6981 ^ i10) * 5017) ^ 39332902;
                        i2 = 1485659350;
                    } else {
                        iM6981 = (i11 - C0630.m2566("ܳۘ")) * (-27);
                        i = ((iM6981 ^ i10) * 18587) ^ (-391077063);
                        i2 = 1323984561;
                    }
                    int i118 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i118;
                    break;
                case -36139678:
                case 331386380:
                    iM2566 = iM2566;
                    i5 = i4 + 1;
                    if (C1711.m5736() <= 0) {
                        iM6981 = C2105.m6981("۬ۙ") ^ i11;
                        i = ((iM6981 ^ i10) * (-12285)) ^ (-2112848291);
                        i2 = -1748065260;
                    } else {
                        iM6981 = C0630.m2566("ۖۧ") ^ i10;
                        i = ((iM6981 ^ i11) * 7647) ^ (-1568802972);
                        i2 = 1723732300;
                    }
                    int i119 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i119;
                    break;
                case 246900555:
                case 1193296121:
                    C1711.m5736();
                    RunnableC1108.m3790();
                    iM2566 = iM2566;
                    iM6981 = C2105.m6981("۬ۙ") ^ i11;
                    i = ((iM6981 ^ i10) * (-12285)) ^ (-2112848291);
                    i2 = -1748065260;
                    int i1110 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i1110;
                    break;
                case 1069241629:
                case 1320780086:
                    iM2566 = iM2566;
                    s = sArr[c];
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۚ۟") ^ i10;
                        i = ((iM6981 ^ i11) * 365) ^ (-965422760);
                        i2 = -1828012928;
                    } else {
                        iM6981 = (i11 - C0630.m2566("ۚۘ")) * 109;
                        i = ((iM6981 ^ i10) * 32417) ^ 1254643160;
                        i2 = 1998553412;
                    }
                    int i1111 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i1111;
                    break;
                default:
                    if (C1916.f6442) {
                        iM6981 = (C2105.m6981("ۚۗ") + i11) * (-35);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * 12009) ^ 77317962;
                        i2 = 429239037;
                    } else {
                        iM2566 = iM2566;
                        iM6981 = C2105.m6981("֡ۢ") ^ i11;
                        i = ((iM6981 ^ i10) * (-18539)) ^ 1548328858;
                        i2 = 496648549;
                    }
                    int i1112 = iM2566;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = i1112;
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
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int iM6981;
        int i2;
        int i3;
        int iM6982;
        int i4;
        int i5;
        boolean z = false;
        AbstractC15440 abstractC15440 = null;
        boolean z2 = false;
        Exception exc = null;
        C12951 c12951M31485 = null;
        Exception exc2 = null;
        int iM8022 = 0;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 121685618;
        int i9 = C2520.f8000;
        int i10 = C4263.f13799;
        int iM6983 = (i10 - C2105.m6981("ۤۛ")) * (-19);
        int i11 = ((iM6983 ^ i9) * 24609) ^ 172385143;
        int i12 = iM6983 ^ (-1914213825);
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            int i14 = i12 ^ (i11 & (((i8 ^ i9) * 23887) >> 31));
            switch (i14) {
                case -1864489758:
                case -430313412:
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    short s = f36523[120];
                    if ((s * 10844) - ((s * s) + 29398084) > 0) {
                        iM6982 = C0630.m2566("ܽۚ") ^ i9;
                        i4 = ((iM6982 ^ i10) * (-3359)) ^ (-1845827602);
                        i5 = 2032960828;
                    } else {
                        iM6982 = C2105.m6981("۬ۡ") ^ i10;
                        i4 = ((iM6982 ^ i9) * (-3925)) ^ (-816776694);
                        i5 = -675432750;
                    }
                    int i15 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i15;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -1760537428:
                case 603710308:
                    i = i14;
                    mo19681();
                    iM6981 = (i10 - C2105.m6981("᩶ܺ")) * (-11);
                    i2 = ((iM6981 ^ i9) * 30331) ^ 514195243;
                    i3 = 503200428;
                    int i16 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i16;
                    break;
                case -1682034042:
                case -471776625:
                    i7 = 13408;
                    iM6982 = C0630.m2566("۠ۨ") ^ i10;
                    i4 = ((iM6982 ^ i9) * 21439) ^ (-1029003607);
                    i5 = -274244047;
                    int i17 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i17;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -1665416758:
                case -617367182:
                    i = i14;
                    if (z3) {
                        iM6981 = C2105.m6981("ᩳۘ") ^ i9;
                        i2 = ((iM6981 ^ i10) * (-29957)) ^ 62470107;
                        i3 = -1242022256;
                    } else {
                        iM6981 = C2105.m6981("۫ۜ") ^ i9;
                        i2 = ((iM6981 ^ i10) * (-18225)) ^ 1985938745;
                        i3 = -1119394053;
                    }
                    int i18 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i18;
                    break;
                case -1497113343:
                case 203758321:
                    i = i14;
                    C22124.m49722((InterfaceC20008) c12951M31485, -1985229329);
                    this.f36540 = C4263.m12815(c12951M31485);
                    this.f36529 = C2520.m8022(c12951M31485);
                    this.f36533 = C4263.m12815(c12951M31485);
                    this.f36531 = c12951M31485.m31491();
                    this.f36534 = C2520.m8022(c12951M31485);
                    this.f36536 = C2520.m8022(c12951M31485);
                    this.f36543 = C0964.m3406(c12951M31485);
                    this.f36542 = C0964.m3406(c12951M31485);
                    setTitle(c12951M31485.m31506());
                    this.f36527 = c12951M31485.m31503();
                    z3 = this.f36540;
                    iM6981 = C0630.m2566("ۡۤ") ^ i10;
                    i2 = ((iM6981 ^ i9) * 8757) ^ (-251450861);
                    i3 = -277918599;
                    int i19 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i19;
                    break;
                case -1397976478:
                case 776603124:
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    if (C1005.m3504(bundle, ServiceConnectionC3453.m10568(f36523, 148, 7, i7))) {
                        iM6982 = (C0630.m2566("۬֨") ^ i10) * (-17);
                        i4 = ((iM6982 ^ i9) * (-6021)) ^ 1928255210;
                        i5 = 1065616453;
                    } else {
                        iM6982 = C0630.m2566("ۢ᩹") ^ i9;
                        i4 = ((iM6982 ^ i10) * 25045) ^ 1691968835;
                        i5 = -1870470940;
                    }
                    int i110 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i110;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -1351387084:
                case -604263663:
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    super.onCreate(bundle);
                    m10214();
                    C4263.m12813(this, C2105.m6981(C0382.m1840(f36523, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i7)) ^ 2125429319);
                    C0964.m3409(this, C0630.m2566(RunnableC0588.m2436(f36523, 124, 3, i7)) ^ 2123953986);
                    C9762 c9762 = (C9762) C4263.m12813(this, C0630.m2566(C1711.m5726(f36523, 127, 3, i7)) ^ 2099836054);
                    this.f10584 = c9762;
                    C2272.m7515(this, c9762);
                    C1773.m5915(this);
                    C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C5211 c5211 = new C5211(this);
                    AbstractC2021.m6565(onBackPressedDispatcher);
                    onBackPressedDispatcher.m28891(c5211);
                    RunnableC3474.m10625(this.f10584, new ViewOnClickListenerC0911(1, this));
                    C19712 c19712 = (C19712) C0964.m3409(this, C2105.m6981(C1773.m5917(f36523, 130, 3, i7)) ^ 2128827711);
                    this.f36538 = c19712;
                    c19712.m45422(C0630.m2566(ViewOnClickListenerC1958.m6435(f36523, 133, 3, i7)) ^ 2130620369, 0);
                    this.f36538.m45422(C0630.m2566(C3683.m11225(f36523, 136, 3, i7)) ^ 2099962074, 0);
                    this.f36538.m45422(C0630.m2566(C3537.m10748(f36523, 139, 3, i7)) ^ 2130322180, 45);
                    this.f36538.m45422(C2105.m6981(C21923.m49334(f36523, 142, 3, i7)) ^ 2118607793, 0);
                    this.f36538.m45422(C2105.m6981(C0798.m3005(f36523, 145, 3, i7)) ^ 2101134825, 0);
                    ListView listView = (ListView) C0964.m3409(this, R.id.list);
                    z = true;
                    listView.setFastScrollEnabled(true);
                    listView.setOnItemClickListener(this);
                    listView.setOnItemLongClickListener(this);
                    C12971 c12971 = new C12971(this);
                    this.f36539 = c12971;
                    listView.setAdapter((ListAdapter) c12971);
                    listView.setOnItemClickListener(this);
                    this.f36532 = new DialogInterfaceOnDismissListenerC5317(this);
                    AbstractC15440 abstractC15441 = f36525;
                    if (bundle != null) {
                        int iM2566 = (C0630.m2566("᩻᩵") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        abstractC15440 = abstractC15441;
                        i11 = ((iM2566 ^ i10) * 21385) ^ (-958033328);
                        i8 = i14;
                        exc2 = exc2;
                        i13 = 0;
                        i12 = iM2566 ^ (-1361075364);
                    } else {
                        abstractC15440 = abstractC15441;
                        i13 = 0;
                        iM6982 = C0630.m2566("ۢ᩹") ^ i9;
                        i4 = ((iM6982 ^ i10) * 25045) ^ 1691968835;
                        i5 = -1870470940;
                        int i111 = iM6982 ^ i5;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i111;
                        i11 = i4;
                    }
                    c12951M31485 = c12951M31485;
                    break;
                case -1293579373:
                case -573312168:
                    C2126.m7039(this.f36538, new ViewOnClickListenerC4428(2, this));
                    this.f36538.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡۟ܽ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            AbstractActivityC12266 abstractActivityC12266 = null;
                            int i20 = -239256275;
                            int i21 = C0422.f1886;
                            int i22 = C2958.f9394;
                            int iM6984 = C2105.m6981("᩸᩻") ^ i21;
                            int i23 = ((iM6984 ^ i22) * (-15945)) ^ 978615468;
                            int i24 = 236945957;
                            while (true) {
                                i20 = ((((i20 ^ i22) * 30577) >> 31) & i23) ^ (iM6984 ^ i24);
                                switch (i20) {
                                    case -2035064495:
                                    case 2019208868:
                                        AbstractActivityC12266.m29789(abstractActivityC12266);
                                        return true;
                                    case -1937552691:
                                    case -1303052549:
                                        C7106.m19120();
                                        if (C21923.f70183 == 0) {
                                            iM6984 = (C0630.m2566("ۚ᩺") + i21) * 115;
                                            i23 = ((iM6984 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        } else {
                                            iM6984 = (C0630.m2566("ۚۜ") + i22) * 41;
                                            i23 = ((iM6984 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        }
                                        break;
                                    case -1873167891:
                                    case -120648246:
                                        C4117.m12364();
                                        C1047.m3599();
                                        return false;
                                    case -1758194141:
                                    case 2055009915:
                                        if (!C2126.f7087) {
                                            iM6984 = C0630.m2566("ۡ۫") ^ i21;
                                            i23 = ((iM6984 ^ i22) * (-32011)) ^ (-371490613);
                                            i24 = -534474015;
                                        } else {
                                            iM6984 = (C0630.m2566("ۚۜ") + i22) * 41;
                                            i23 = ((iM6984 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        }
                                        break;
                                    case -1332750795:
                                    case -258273841:
                                        C2520.m8026();
                                        C1773.m5908();
                                        iM6984 = C0630.m2566("ۡ۫") ^ i21;
                                        i23 = ((iM6984 ^ i22) * (-32011)) ^ (-371490613);
                                        i24 = -534474015;
                                        break;
                                    case -1313729905:
                                    case 1733885650:
                                        if (C21923.f70183 != 0) {
                                            iM6984 = (C2105.m6981("ۚܰ") + i21) * 15;
                                            i23 = ((iM6984 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM6984 = (C0630.m2566("ܽ֫") + i21) * 45;
                                            i23 = ((iM6984 ^ i22) * (-1015)) ^ 697981635;
                                            i24 = -1554651008;
                                        }
                                        break;
                                    case -1043063865:
                                    case 2130768362:
                                        if (C3245.f10203 <= 0) {
                                            iM6984 = (C0630.m2566("ۚۜ") + i22) * 41;
                                            i23 = ((iM6984 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        } else {
                                            iM6984 = C2105.m6981("۫ܶ") ^ i22;
                                            i23 = ((iM6984 ^ i21) * 9067) ^ 113414837;
                                            i24 = 282403282;
                                        }
                                        break;
                                    case -1026105565:
                                    case 1521484596:
                                        if (C0422.m1963()) {
                                            iM6984 = C0630.m2566("ۘ֫") ^ i21;
                                            i23 = ((iM6984 ^ i22) * (-25975)) ^ (-1346171712);
                                            i24 = -650149611;
                                        } else {
                                            iM6984 = C0630.m2566("ۢܳ") ^ i22;
                                            i23 = ((iM6984 ^ i21) * 21641) ^ 189327173;
                                            i24 = 1169018931;
                                        }
                                        break;
                                    case -1023575342:
                                    case -165769050:
                                        abstractActivityC12266 = this.f1590;
                                        if (C3911.f12484 >= 0) {
                                            iM6984 = (C2105.m6981("ۚܰ") + i21) * 15;
                                            i23 = ((iM6984 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM6984 = (C0630.m2566("ܽ۫") + i22) * 81;
                                            i23 = ((iM6984 ^ i21) * (-20989)) ^ 1431431337;
                                            i24 = 383989796;
                                        }
                                        break;
                                    case -911791860:
                                    case -459764810:
                                        if (C0382.f1805) {
                                            iM6984 = (C0630.m2566("᩷֨") ^ i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i23 = ((iM6984 ^ i21) * (-31723)) ^ 1316919771;
                                            i24 = -480380086;
                                        } else {
                                            iM6984 = (C0630.m2566("ۚ᩺") + i21) * 115;
                                            i23 = ((iM6984 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        }
                                        break;
                                    case -759497599:
                                    case -398785694:
                                        C11340.m28031();
                                        if (C22628.f73083 <= 0) {
                                            iM6984 = C0630.m2566("ۢܳ") ^ i22;
                                            i23 = ((iM6984 ^ i21) * 21641) ^ 189327173;
                                            i24 = 1169018931;
                                        } else {
                                            iM6984 = C0630.m2566("ۡ۫") ^ i21;
                                            i23 = ((iM6984 ^ i22) * (-32011)) ^ (-371490613);
                                            i24 = -534474015;
                                        }
                                        break;
                                    case -574169819:
                                    case 36481408:
                                        if (C5695.m16023() >= 0) {
                                            iM6984 = (C0630.m2566("ۚۜ") + i22) * 41;
                                            i23 = ((iM6984 ^ i21) * 28495) ^ 1047601315;
                                            i24 = -1878858944;
                                        } else {
                                            iM6984 = (C2105.m6981("ܳۨ") ^ i22) * 25;
                                            i23 = ((iM6984 ^ i21) * (-22933)) ^ (-549357717);
                                            i24 = 349135620;
                                        }
                                        break;
                                    case -436787474:
                                    case 71723044:
                                        if (C0050.f910 >= 0) {
                                            iM6984 = (C2105.m6981("ۚܰ") + i21) * 15;
                                            i23 = ((iM6984 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM6984 = (C2105.m6981("ܶ᩹") ^ i21) * (-111);
                                            i23 = ((iM6984 ^ i22) * (-765)) ^ (-1570507925);
                                            i24 = -214453520;
                                        }
                                        break;
                                    case -206954027:
                                    case 1141766654:
                                        if (C3683.m11222()) {
                                            iM6984 = (C0630.m2566("ۚ᩺") + i21) * 115;
                                            i23 = ((iM6984 ^ i22) * 25843) ^ (-1379540204);
                                            i24 = -1523679696;
                                        } else {
                                            iM6984 = (C0630.m2566("֫ۗ") ^ i22) * (-105);
                                            i23 = ((iM6984 ^ i21) * (-22229)) ^ (-1186823943);
                                            i24 = -984368542;
                                        }
                                        break;
                                    case 385322535:
                                    case 1033063176:
                                        if (C2126.m7040()) {
                                            iM6984 = (C2105.m6981("ۚܰ") + i21) * 15;
                                            i23 = ((iM6984 ^ i22) * 31799) ^ 1580072180;
                                            i24 = -111771628;
                                        } else {
                                            iM6984 = C2105.m6981("֫ܳ") ^ i21;
                                            i23 = ((iM6984 ^ i22) * 13469) ^ 1844301027;
                                            i24 = 449272937;
                                        }
                                        break;
                                    default:
                                        if (C1916.f6442) {
                                            iM6984 = C2105.m6981("᩻ۡ") ^ i21;
                                            i23 = ((iM6984 ^ i22) * 21019) ^ 1274766939;
                                            i24 = -347973358;
                                        } else {
                                            iM6984 = (C0630.m2566("ۚ᩺") + i21) * 115;
                                            i23 = ((iM6984 ^ i22) * 25843) ^ (-1379540204);
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
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    if (C3245.m9926(abstractC15440)) {
                        iM6982 = (C2105.m6981("ܽۗ") + i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6982 ^ i10) * 31877) ^ 380135518;
                        i5 = 1614262775;
                    } else {
                        iM6982 = C0630.m2566("ۢ᩹") ^ i9;
                        i4 = ((iM6982 ^ i10) * 25045) ^ 1691968835;
                        i5 = -1870470940;
                    }
                    int i112 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i112;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -1092153279:
                case 10710186:
                    i14 = i14;
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    this.f36526 = C0964.m3400(ApplicationC20075.f65008, C1773.m5917(f36523, 155, 23, i7), z);
                    iM6982 = (C2105.m6981("۬ܺ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM6982 ^ i9) * 21789) ^ (-1466083373);
                    i5 = 1319983687;
                    int i113 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i113;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -989559803:
                case -246191146:
                    i = i14;
                    c12951M31485 = C12951.m31485(C1294.m4379(abstractC15440));
                    iM8022 = C2520.m8022(c12951M31485);
                    try {
                        arrayList = new ArrayList(iM8022);
                        this.f36537 = arrayList;
                        this.f36528 = arrayList;
                        i6 = i13;
                        iM6981 = (i9 - C2105.m6981("᩷ۖ")) * (-99);
                        i2 = ((iM6981 ^ i10) * 31899) ^ (-961042540);
                        i3 = 1781974962;
                    } catch (Exception e) {
                        exc2 = e;
                        arrayList = null;
                        iM6981 = C2105.m6981("᩺ᩴ") ^ i9;
                        i2 = ((iM6981 ^ i10) * 9159) ^ 343925359;
                        i3 = -248277778;
                    }
                    int i114 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i114;
                    break;
                case -921871005:
                case 455526247:
                    z2 = false;
                    iM6982 = C2105.m6981("᩻ܶ") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-29487)) ^ (-1626045139);
                    i5 = -895396323;
                    int i115 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i115;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -879494267:
                case 2056524672:
                    m10224(exc2, z);
                    break;
                case -635138454:
                case 933553617:
                    m10224(exc, z);
                    break;
                case -253916616:
                case 1607193293:
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    if (z2) {
                        iM6982 = (i9 - C2105.m6981("᩵᩹")) * 127;
                        i4 = ((iM6982 ^ i10) * (-5501)) ^ (-417710661);
                        i5 = -1270336122;
                    } else {
                        iM6982 = C0630.m2566("ۤܳ") ^ i10;
                        i4 = ((iM6982 ^ i9) * (-32147)) ^ 985636095;
                        i5 = 396826243;
                    }
                    int i116 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i116;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -225924523:
                case 1272429722:
                    i7 = 17773;
                    iM6982 = C0630.m2566("۠ۨ") ^ i10;
                    i4 = ((iM6982 ^ i9) * 21439) ^ (-1029003607);
                    i5 = -274244047;
                    int i117 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i117;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -77065209:
                case 1787829154:
                    i = i14;
                    C1916.m6307(arrayList, new C8739(c12951M31485));
                    iM6981 = C2105.m6981("۠ۗ") ^ i9;
                    i2 = ((iM6981 ^ i10) * 21707) ^ 1859825927;
                    i3 = -672163135;
                    int i118 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i118;
                    break;
                case -56960567:
                case 1048039853:
                    z2 = true;
                    iM6982 = C2105.m6981("᩻ܶ") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-29487)) ^ (-1626045139);
                    i5 = -895396323;
                    int i119 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i119;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case -39333100:
                case -16891090:
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    try {
                        mo19678(z2);
                        iM6982 = C2105.m6981("᩷۫") ^ i9;
                        i4 = ((iM6982 ^ i10) * 9995) ^ (-1297474455);
                        i5 = -440956805;
                        int i1110 = iM6982 ^ i5;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i1110;
                    } catch (Exception e2) {
                        int iM2567 = C0630.m2566("ۤܰ") ^ i10;
                        i4 = ((iM2567 ^ i9) * 32145) ^ 473533195;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = iM2567 ^ 66588725;
                        exc = e2;
                    }
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case 424661945:
                case 1046465537:
                    try {
                        this.f36538.m45419();
                        i = i14;
                        iM6981 = C2105.m6981("۫ۜ") ^ i9;
                        i2 = ((iM6981 ^ i10) * (-18225)) ^ 1985938745;
                        i3 = -1119394053;
                    } catch (Exception e3) {
                        exc2 = e3;
                        i = i14;
                        iM6981 = C2105.m6981("᩺ᩴ") ^ i9;
                        i2 = ((iM6981 ^ i10) * 9159) ^ 343925359;
                        i3 = -248277778;
                    }
                    int i1111 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i1111;
                    break;
                case 678459044:
                case 920876030:
                    try {
                        i = i14;
                        try {
                            this.f36541.mo1669(C3245.m9921(this.f36540));
                            m29792();
                            iM6981 = (i10 - C2105.m6981("᩶ܺ")) * (-11);
                            i2 = ((iM6981 ^ i9) * 30331) ^ 514195243;
                            i3 = 503200428;
                        } catch (Exception e4) {
                            e = e4;
                            exc2 = e;
                            iM6981 = C2105.m6981("᩺ᩴ") ^ i9;
                            i2 = ((iM6981 ^ i10) * 9159) ^ 343925359;
                            i3 = -248277778;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i = i14;
                    }
                    int i1112 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i1112;
                    break;
                case 1119097002:
                case 1846573947:
                    c12951M31485 = c12951M31485;
                    exc2 = exc2;
                    i14 = i14;
                    if (mo19683()) {
                        iM6982 = C2105.m6981("ܳۙ") ^ i9;
                        i4 = ((iM6982 ^ i10) * (-4013)) ^ 45527141;
                        i5 = 893599251;
                    } else {
                        iM6982 = (C2105.m6981("۬ܺ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM6982 ^ i9) * 21789) ^ (-1466083373);
                        i5 = 1319983687;
                    }
                    int i1113 = iM6982 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1113;
                    i11 = i4;
                    c12951M31485 = c12951M31485;
                    break;
                case 1789966163:
                case 1874241652:
                    i = i14;
                    if (i6 < iM8022) {
                        iM6981 = (C2105.m6981("۬᩺") ^ i10) * 7;
                        i2 = ((iM6981 ^ i9) * 12857) ^ 1181271627;
                        i3 = 68809384;
                    } else {
                        iM6981 = C2105.m6981("᩷᩵") ^ i10;
                        i2 = ((iM6981 ^ i9) * (-8345)) ^ 1719209950;
                        i3 = 947551495;
                    }
                    int i1114 = i;
                    i12 = iM6981 ^ i3;
                    i11 = i2;
                    i8 = i1114;
                    break;
                default:
                    i = i14;
                    i6++;
                    iM6981 = (i9 - C2105.m6981("᩷ۖ")) * (-99);
                    i2 = ((iM6981 ^ i10) * 31899) ^ (-961042540);
                    i3 = 1781974962;
                    int i1115 = i;
                    i12 = iM6981 ^ i3;
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
    
        if (l.C22628.f73083 > 0) goto L16;
     */
    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        int iM2566;
        int i;
        int i2;
        AbstractC15440 abstractC15440;
        int i3;
        int i4;
        int iM6981;
        C10130 c10130 = null;
        Iterator itM9029 = null;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        CharSequence title = null;
        String str = null;
        AbstractC15440 abstractC15441 = null;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1738294509;
        int i11 = RunnableC0588.f2309;
        int i12 = C3245.f10203;
        int iM6982 = (C2105.m6981("֡ۛ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i13 = ((iM6982 ^ i12) * (-27327)) ^ (-1062036591);
        int i14 = iM6982 ^ 14919817;
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
                    abstractC15441 = abstractC15441;
                    C21923.m49342(c10130, -1985229329);
                    c10130.m25425(this.f36540);
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C2105.m6981("֫ᩴ") + i12) * 39;
                        i = ((iM2566 ^ i11) * 30595) ^ 1390955533;
                        i2 = -1652511487;
                    } else {
                        iM2566 = C0630.m2566("֨ۖ") ^ i11;
                        i = ((iM2566 ^ i12) * 7207) ^ 1625120212;
                        i2 = -381558182;
                    }
                    int i16 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i16;
                    i13 = i;
                    str = str;
                    break;
                case -1693414573:
                case -520137526:
                    C1128.m3851();
                    str = str;
                    abstractC15441 = abstractC15441;
                    iM2566 = (C2105.m6981("֫ᩴ") + i12) * 39;
                    i = ((iM2566 ^ i11) * 30595) ^ 1390955533;
                    i2 = -1652511487;
                    int i17 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i17;
                    i13 = i;
                    str = str;
                    break;
                case -1686290190:
                case -653408080:
                    c10130.m25424(str);
                    abstractC15441 = f36525;
                    AbstractC2021.m6569(abstractC15441);
                    int iM2567 = C0630.m2566("᩻ܿ") ^ i11;
                    str = str;
                    i = ((iM2567 ^ i12) * 3371) ^ (-1935970247);
                    i14 = iM2567 ^ (-576211568);
                    i13 = i;
                    str = str;
                    break;
                case -1678817676:
                case -934348630:
                    str = str;
                    abstractC15441 = abstractC15441;
                    C22628.m50607(c10130, i6);
                    c10130.m25425(this.f36543);
                    z2 = this.f36542;
                    if (C2126.m7040()) {
                        iM2566 = (C2105.m6981("۠ܳ") ^ i12) * 69;
                        i = ((iM2566 ^ i11) * (-30599)) ^ (-202938335);
                        i2 = -1549395035;
                    } else {
                        iM2566 = (i11 - C0630.m2566("᩸ۤ")) * (-63);
                        i = ((iM2566 ^ i12) * (-28281)) ^ 1255217660;
                        i2 = -967420124;
                    }
                    int i18 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i18;
                    i13 = i;
                    str = str;
                    break;
                case -1615636764:
                case 1109473824:
                    str = str;
                    abstractC15441 = abstractC15441;
                    C22628.m50607(c10130, i5);
                    i6 = this.f36536;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ܽۡ") + i11) * (-69);
                        i = ((iM2566 ^ i12) * (-14457)) ^ (-856727243);
                        i2 = 602623320;
                    } else {
                        iM2566 = (C2105.m6981("ۧ᩸") ^ i12) * 15;
                        i = ((iM2566 ^ i11) * 15781) ^ 35667942;
                        i2 = -1630560509;
                    }
                    int i19 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i19;
                    i13 = i;
                    str = str;
                    break;
                case -1389947646:
                case 1134378344:
                    C10130 c10131 = new C10130();
                    C22628.m50607(c10131, C3432.m10481(arrayList));
                    itM9029 = C2958.m9029(arrayList);
                    c10130 = c10131;
                    iM2566 = C2105.m6981("ۘ᩻") ^ i11;
                    i = ((iM2566 ^ i12) * 7939) ^ (-1486711873);
                    i2 = -1439211833;
                    int i110 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i110;
                    i13 = i;
                    str = str;
                    break;
                case -1363181864:
                case 546732987:
                    str = str;
                    abstractC15441 = abstractC15441;
                    super.onSaveInstanceState(bundle);
                    ArrayList arrayList2 = this.f36528;
                    if (arrayList2 == null) {
                        arrayList = arrayList2;
                        iM2566 = C2105.m6981("۟ۢ") ^ i12;
                        i = ((iM2566 ^ i11) * (-2855)) ^ 748672706;
                        i2 = 1016441682;
                        int i111 = iM2566 ^ i2;
                        abstractC15441 = abstractC15441;
                        i14 = i111;
                        i13 = i;
                    } else {
                        int iM6983 = (C2105.m6981("ۜۤ") ^ i12) * (-9);
                        arrayList = arrayList2;
                        i13 = ((iM6983 ^ i11) * 27679) ^ (-2042811589);
                        abstractC15441 = abstractC15441;
                        i14 = iM6983 ^ (-1977130936);
                    }
                    str = str;
                    break;
                case -1234578743:
                case 386685179:
                    i15 = 35385;
                    iM2566 = (C0630.m2566("ۗۢ") ^ i11) * (-45);
                    i = ((iM2566 ^ i12) * 2485) ^ (-439536425);
                    i2 = 1080364500;
                    int i112 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i112;
                    i13 = i;
                    str = str;
                    break;
                case -1148569204:
                case -962043730:
                    abstractC15440 = abstractC15441;
                    c10130.m25439(C0422.m1959(title));
                    str = this.f36527;
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("᩷֡") + i11) * 3;
                        i4 = ((iM6981 ^ i12) * (-27985)) ^ 1426651197;
                        i3 = -726310404;
                    } else {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i11;
                        i4 = ((iM6981 ^ i12) * (-5443)) ^ 2043316253;
                        i3 = 1089914771;
                    }
                    AbstractC15440 abstractC15442 = abstractC15440;
                    i14 = iM6981 ^ i3;
                    i13 = i4;
                    abstractC15441 = abstractC15442;
                    break;
                case -1137626573:
                case -585373418:
                    C0714.m2805();
                    C4263.m12819();
                    break;
                case -987008843:
                case 740627161:
                    C1711.m5736();
                    if (C2167.f7158 >= 0) {
                        int iM6984 = (C2105.m6981("ۢۘ") ^ i11) * (-17);
                        i14 = iM6984 ^ (-2082878012);
                        i13 = ((iM6984 ^ i12) * 3673) ^ (-58467351);
                    } else {
                        str = str;
                        abstractC15441 = abstractC15441;
                        iM2566 = (C2105.m6981("֫ᩴ") + i12) * 39;
                        i = ((iM2566 ^ i11) * 30595) ^ 1390955533;
                        i2 = -1652511487;
                        int i113 = iM2566 ^ i2;
                        abstractC15441 = abstractC15441;
                        i14 = i113;
                        i13 = i;
                        str = str;
                    }
                    break;
                case -963777813:
                case 1049380967:
                    ((C8739) C2272.m7513(itM9029)).m22594(c10130);
                    iM2566 = C2105.m6981("ۘ᩻") ^ i11;
                    i = ((iM2566 ^ i12) * 7939) ^ (-1486711873);
                    i2 = -1439211833;
                    int i114 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i114;
                    i13 = i;
                    str = str;
                    break;
                case -806062791:
                case 1450310258:
                    i15 = 26056;
                    iM2566 = (C0630.m2566("ۗۢ") ^ i11) * (-45);
                    i = ((iM2566 ^ i12) * 2485) ^ (-439536425);
                    i2 = 1080364500;
                    int i115 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i115;
                    i13 = i;
                    str = str;
                    break;
                case -692000217:
                case 424201431:
                    C2167.m7155();
                    break;
                case -626933648:
                case 1891281883:
                    str = str;
                    abstractC15441 = abstractC15441;
                    C21923.m49342(c10130, this.f36529);
                    z = this.f36533;
                    if (C0050.m940() <= 0) {
                        iM2566 = (C2105.m6981("۠ܳ") ^ i12) * 69;
                        i = ((iM2566 ^ i11) * (-30599)) ^ (-202938335);
                        i2 = -1549395035;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩷") ^ i12) * (-35);
                        i = ((iM2566 ^ i11) * (-15663)) ^ 1823127807;
                        i2 = 775889708;
                    }
                    int i116 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i116;
                    i13 = i;
                    str = str;
                    break;
                case -613699581:
                case 1147106843:
                    try {
                        C3245.m9917(abstractC15441, c10130.m25427());
                        abstractC15441 = abstractC15441;
                        try {
                            try {
                                C1294.m4382(bundle, C11340.m28025(f36523, 328, 7, i15), true);
                                break;
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (IOException unused3) {
                        abstractC15441 = abstractC15441;
                    }
                    str = str;
                    iM2566 = C2105.m6981("۟ۢ") ^ i12;
                    i = ((iM2566 ^ i11) * (-2855)) ^ 748672706;
                    i2 = 1016441682;
                    int i117 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i117;
                    i13 = i;
                    str = str;
                    break;
                case -577641305:
                case 1008959158:
                    str = str;
                    abstractC15441 = abstractC15441;
                    c10130.m25425(z2);
                    title = getTitle();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ܽۡ") + i11) * (-69);
                        i = ((iM2566 ^ i12) * (-14457)) ^ (-856727243);
                        i2 = 602623320;
                    } else {
                        iM2566 = C0630.m2566("᩺֫") ^ i12;
                        i = ((iM2566 ^ i11) * 16745) ^ (-1407796092);
                        i2 = -455998793;
                    }
                    int i118 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i118;
                    i13 = i;
                    str = str;
                    break;
                case -567381061:
                case -515432325:
                    str = str;
                    abstractC15441 = abstractC15441;
                    if ((i9 + 1) - i8 > 0) {
                        iM2566 = C0630.m2566("ᩴ᩻") ^ i12;
                        i = ((iM2566 ^ i11) * 4965) ^ 118835467;
                        i2 = -309435434;
                    } else {
                        iM2566 = C2105.m6981("ۗܰ") ^ i12;
                        i = ((iM2566 ^ i11) * (-31335)) ^ (-7658500);
                        i2 = -1810869864;
                    }
                    int i119 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i119;
                    i13 = i;
                    str = str;
                    break;
                case -517395149:
                case 1564380633:
                    C1005.m3501();
                    if (C1420.f5096 > 0) {
                        str = str;
                        abstractC15441 = abstractC15441;
                        iM2566 = (C2105.m6981("۠ܳ") ^ i12) * 69;
                        i = ((iM2566 ^ i11) * (-30599)) ^ (-202938335);
                        i2 = -1549395035;
                        int i1110 = iM2566 ^ i2;
                        abstractC15441 = abstractC15441;
                        i14 = i1110;
                        i13 = i;
                        str = str;
                    }
                    str = str;
                    abstractC15441 = abstractC15441;
                    iM2566 = C0630.m2566("۟ۨ") ^ i12;
                    i = ((iM2566 ^ i11) * 1441) ^ 43196791;
                    i2 = -1184298798;
                    int i1111 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i1111;
                    i13 = i;
                    str = str;
                    break;
                case -379144126:
                case 424480363:
                    if (C0964.f3626 != 0) {
                        str = str;
                        abstractC15441 = abstractC15441;
                        iM2566 = C2105.m6981("ᩳܺ") ^ i12;
                        i = ((iM2566 ^ i11) * 2107) ^ (-1429715508);
                        i2 = -414116870;
                        int i1112 = iM2566 ^ i2;
                        abstractC15441 = abstractC15441;
                        i14 = i1112;
                        i13 = i;
                        str = str;
                    } else {
                        int iM6985 = (C2105.m6981("ۢۘ") ^ i11) * (-17);
                        i14 = iM6985 ^ (-2082878012);
                        i13 = ((iM6985 ^ i12) * 3673) ^ (-58467351);
                    }
                    break;
                case 34089629:
                case 1166765843:
                    C0050.m940();
                    if (C7811.f24123 < 0) {
                        abstractC15440 = abstractC15441;
                        iM6981 = (C2105.m6981("᩷֡") + i11) * 3;
                        i4 = ((iM6981 ^ i12) * (-27985)) ^ 1426651197;
                        i3 = -726310404;
                        AbstractC15440 abstractC15443 = abstractC15440;
                        i14 = iM6981 ^ i3;
                        i13 = i4;
                        abstractC15441 = abstractC15443;
                    } else {
                        str = str;
                        abstractC15441 = abstractC15441;
                        iM2566 = C0630.m2566("۟ۨ") ^ i12;
                        i = ((iM2566 ^ i11) * 1441) ^ 43196791;
                        i2 = -1184298798;
                        int i1113 = iM2566 ^ i2;
                        abstractC15441 = abstractC15441;
                        i14 = i1113;
                        i13 = i;
                        str = str;
                    }
                    break;
                case 436020165:
                case 1586453300:
                    str = str;
                    abstractC15441 = abstractC15441;
                    s = sArr[c];
                    i7 = s + 1;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("۟ۨ") ^ i12;
                        i = ((iM2566 ^ i11) * 1441) ^ 43196791;
                        i2 = -1184298798;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ܺܺ")) * (-89);
                        i = ((iM2566 ^ i12) * 24067) ^ (-1091866793);
                        i2 = 1135280935;
                    }
                    int i1114 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i1114;
                    i13 = i;
                    str = str;
                    break;
                case 501416986:
                case 874480206:
                    str = str;
                    abstractC15441 = abstractC15441;
                    i8 = i7 * i7;
                    i9 = s * 2;
                    if (C1773.m5908() <= 0) {
                        iM2566 = C0630.m2566("۟ۨ") ^ i12;
                        i = ((iM2566 ^ i11) * 1441) ^ 43196791;
                        i2 = -1184298798;
                    } else {
                        iM2566 = (C0630.m2566("ۛۗ") ^ i11) * 25;
                        i = ((iM2566 ^ i12) * 20449) ^ (-1504679245);
                        i2 = -389956672;
                    }
                    int i1115 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i1115;
                    i13 = i;
                    str = str;
                    break;
                case 771276208:
                case 1551630922:
                    str = str;
                    abstractC15441 = abstractC15441;
                    sArr = f36523;
                    c = 327;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("֫ᩴ") + i12) * 39;
                        i = ((iM2566 ^ i11) * 30595) ^ 1390955533;
                        i2 = -1652511487;
                    } else {
                        iM2566 = C0630.m2566("᩺ۢ") ^ i12;
                        i = ((iM2566 ^ i11) * (-11589)) ^ (-354210844);
                        i2 = 2096445684;
                    }
                    int i1116 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i1116;
                    i13 = i;
                    str = str;
                    break;
                case 869027787:
                case 1841767512:
                    str = str;
                    abstractC15441 = abstractC15441;
                    if (C1773.m5910(itM9029)) {
                        iM2566 = C2105.m6981("ۢ᩸") ^ i12;
                        i = ((iM2566 ^ i11) * (-8725)) ^ (-1464044009);
                        i2 = 485883865;
                    } else {
                        iM2566 = C0630.m2566("ۚ֫") ^ i11;
                        i = ((iM2566 ^ i12) * 3623) ^ (-1575229319);
                        i2 = 114602249;
                    }
                    int i1117 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
                    i14 = i1117;
                    i13 = i;
                    str = str;
                    break;
                case 1556675356:
                case 1734472717:
                    str = str;
                    abstractC15441 = abstractC15441;
                    c10130.m25425(z);
                    c10130.m25435(this.f36531);
                    i5 = this.f36534;
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("ᩳܺ") ^ i12;
                        i = ((iM2566 ^ i11) * 2107) ^ (-1429715508);
                        i2 = -414116870;
                    } else {
                        iM2566 = (C2105.m6981("֨ᩴ") + i11) * (-17);
                        i = ((iM2566 ^ i12) * (-7807)) ^ (-1095749895);
                        i2 = -2078825227;
                    }
                    int i1118 = iM2566 ^ i2;
                    abstractC15441 = abstractC15441;
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
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m29781(AbstractActivityC12266 abstractActivityC12266) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int iM2568;
        int i6;
        int i7;
        int iM6981;
        int i8;
        int i9;
        int i10 = C2167.f7158;
        int i11 = C0714.f2697;
        int iM6982 = (i10 - C2105.m6981("ۛۗ")) * (-53);
        int i12 = ((iM6982 ^ i11) * 23775) ^ 2009327530;
        Iterator itM12354 = null;
        ArrayList arrayList = null;
        String strM1483 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i13 = iM6982 ^ (-2030129400);
        boolean z = false;
        boolean z2 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iM6983 = 0;
        int iM6984 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i18 = 0;
        short s3 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -749235298;
        Iterator itM9029 = null;
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
                        iM2568 = C2105.m6981("ۚᩴ") ^ i11;
                        i6 = ((iM2568 ^ i10) * (-22859)) ^ 266570757;
                        i7 = -1763244042;
                    } else {
                        iM2568 = (C0630.m2566("ܶ۫") ^ i10) * (-115);
                        i6 = ((iM2568 ^ i11) * 29135) ^ (-1829805591);
                        i7 = 1809731803;
                    }
                    i13 = iM2568 ^ i7;
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
                    if (C7811.f24123 >= 0) {
                        iM2568 = (C0630.m2566("ܿۨ") + i10) * (-73);
                        i6 = ((iM2568 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                    } else {
                        iM2568 = C0630.m2566("ۙ᩺") ^ i11;
                        i6 = ((iM2568 ^ i10) * (-10141)) ^ (-483554685);
                        i7 = 1412560304;
                    }
                    i13 = iM2568 ^ i7;
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
                    sArr = f36523;
                    c = 'G';
                    if (C0964.f3626 != 0) {
                        iM2568 = (C0630.m2566("ۚ᩵") + i11) * 13;
                        i6 = ((iM2568 ^ i10) * 85) ^ (-756712849);
                        i7 = -1314311422;
                    } else {
                        iM2568 = (i10 - C0630.m2566("ܿۘ")) * (-13);
                        i6 = ((iM2568 ^ i11) * (-11917)) ^ 1508421892;
                        i7 = -1451074624;
                    }
                    i13 = iM2568 ^ i7;
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
                    iM2568 = C0630.m2566("ۤۛ") ^ i11;
                    i6 = ((iM2568 ^ i10) * 9839) ^ 1755930727;
                    i7 = -1081137081;
                    i13 = iM2568 ^ i7;
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
                    iM2568 = C0630.m2566("ۤۛ") ^ i11;
                    i6 = ((iM2568 ^ i10) * 9839) ^ 1755930727;
                    i7 = -1081137081;
                    i13 = iM2568 ^ i7;
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
                        iM2568 = C0630.m2566("ܳۡ") ^ i10;
                        i6 = ((iM2568 ^ i11) * (-9255)) ^ 100921298;
                        i7 = 1600807421;
                    } else {
                        iM2568 = (C2105.m6981("ۢ۠") + i10) * 69;
                        i6 = ((iM2568 ^ i11) * 6725) ^ (-997189699);
                        i7 = 502218606;
                    }
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList8 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList8;
                    break;
                case -1950791782:
                case 801942243:
                    C2272.m7503();
                    if (C1294.f4556 < 0) {
                        i21 = i21;
                        sArr3 = sArr3;
                        iM2567 = (C0630.m2566("ۙۡ") + i10) * (-19);
                        i3 = ((iM2567 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    } else {
                        iM2566 = C2105.m6981("֡ᩴ") ^ i11;
                        i = ((iM2566 ^ i10) * (-30359)) ^ (-2138438129);
                        i2 = -1742244562;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1930074187:
                case 971967464:
                    if (!C0630.m2564()) {
                        iM2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((iM2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        iM2567 = (C0630.m2566("ۙۡ") + i10) * (-19);
                        i3 = ((iM2567 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    }
                    break;
                case -1913885805:
                case -991689722:
                    RunnableC1108.m3790();
                    if (C0050.f910 >= 0) {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i30 = i19;
                        arrayList2 = arrayList2;
                        i5 = i30;
                        iM2568 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((iM2568 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = iM2568 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList9 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList9;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((iM2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = iM2566 ^ i2;
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
                    int i32 = abstractActivityC12266.f36534;
                    int i33 = i20 == true ? 1 : 0;
                    if (i33 < i32) {
                        iM2568 = C2105.m6981("ۗܿ") ^ i11;
                        i20 = i33 == true ? 1 : 0;
                        i6 = ((iM2568 ^ i10) * (-5529)) ^ 1430353853;
                        i7 = 779720154;
                    } else {
                        i20 = i33 == true ? 1 : 0;
                        iM2568 = C0630.m2566("ۙܰ") ^ i10;
                        i6 = ((iM2568 ^ i11) * (-4059)) ^ (-1041646249);
                        i7 = 1181986638;
                    }
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList10 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList10;
                    break;
                case -1624901601:
                case 1595879092:
                    abstractActivityC12266.m29780(z2);
                    abstractActivityC12266.f36539.notifyDataSetChanged();
                    break;
                case -1607052145:
                case 737240183:
                    i21 = i21;
                    sArr3 = sArr3;
                    ArrayList arrayList11 = abstractActivityC12266.f36537;
                    i19 = abstractActivityC12266.f36531[i20 == true ? 1 : 0];
                    if (C1005.f3721) {
                        int iM2569 = C0630.m2566("۫ۨ") ^ i10;
                        arrayList2 = arrayList11;
                        i12 = ((iM2569 ^ i11) * (-1127)) ^ 657319183;
                        i13 = iM2569 ^ (-1380477793);
                    } else {
                        arrayList2 = arrayList11;
                        iM2567 = (C0630.m2566("ۙۡ") + i10) * (-19);
                        i3 = ((iM2567 ^ i11) * 8917) ^ 1736725121;
                        i4 = 192205081;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                    }
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -1557778784:
                case 321280788:
                    i17 = iM6983 ^ 2130322989;
                    sArr3 = f36523;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ܺۗ") + i11) * 101;
                        i = ((iM2566 ^ i10) * 19637) ^ 756170748;
                        i2 = 2036093383;
                    } else {
                        iM2566 = (C0630.m2566("ᩴܰ") + i10) * (-13);
                        i = ((iM2566 ^ i11) * 5871) ^ 1432856957;
                        i2 = -1182831524;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1552481460:
                case 310104399:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((iM2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                    } else {
                        iM2566 = C2105.m6981("ۧ᩷") ^ i11;
                        i = ((iM2566 ^ i10) * (-26669)) ^ 1885452994;
                        i2 = 1781057980;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1427923611:
                case 1261375080:
                    if (!((C8739) RunnableC1108.m3791(itM12354)).m22602()) {
                        iM2567 = (i11 - C2105.m6981("ۧۤ")) * (-81);
                        i3 = ((iM2567 ^ i10) * 9391) ^ (-405813789);
                        i4 = 515928501;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    } else {
                        iM2566 = C0630.m2566("ۡܽ") ^ i10;
                        i = ((iM2566 ^ i11) * 32283) ^ 934619083;
                        i2 = 466063929;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1404070249:
                case 1554979506:
                    i21 = i21;
                    sArr3 = sArr3;
                    abstractActivityC12266.f36529 += z2 ? 1 : 0;
                    int i34 = i19;
                    arrayList2 = arrayList2;
                    i5 = i34;
                    iM2568 = (i11 - C0630.m2566("֫ۢ")) * 99;
                    i6 = ((iM2568 ^ i10) * (-6443)) ^ (-1096112717);
                    i7 = -1204488943;
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList12 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList12;
                    break;
                case -1367618891:
                case -82745241:
                    if (!C11340.m28031()) {
                        iM2566 = C2105.m6981("֡ᩴ") ^ i11;
                        i = ((iM2566 ^ i10) * (-30359)) ^ (-2138438129);
                        i2 = -1742244562;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i35 = i19;
                        arrayList2 = arrayList2;
                        i5 = i35;
                        iM2568 = (C0630.m2566("ۚ᩵") + i11) * 13;
                        i6 = ((iM2568 ^ i10) * 85) ^ (-756712849);
                        i7 = -1314311422;
                        i13 = iM2568 ^ i7;
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
                    iM2568 = (C2105.m6981("֨ۧ") + i11) * 71;
                    i6 = ((iM2568 ^ i10) * (-29461)) ^ 1064557393;
                    i7 = 1556544592;
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList14 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList14;
                    break;
                case -1261063141:
                case -1217422293:
                    abstractActivityC12266.f36532.m15259();
                    break;
                case -1245636293:
                case 568629844:
                    abstractActivityC12266.f36529 += z2 ? 1 : 0;
                    i21 = i21;
                    sArr3 = sArr3;
                    i5 = i19;
                    iM2568 = (C2105.m6981("᩶ܺ") + i11) * 101;
                    i6 = ((iM2568 ^ i10) * (-4323)) ^ (-1020884064);
                    i7 = 1199732378;
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList15 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList15;
                    break;
                case -1230250035:
                case 1556886373:
                    RunnableC1937.m6387();
                    if (C4616.f14690 > 0) {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i37 = i19;
                        arrayList2 = arrayList2;
                        i5 = i37;
                        iM2568 = (C0630.m2566("ܿۨ") + i10) * (-73);
                        i6 = ((iM2568 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                        i13 = iM2568 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList16 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList16;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((iM2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                        i13 = iM2566 ^ i2;
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
                        iM2568 = C0630.m2566("ܶ᩻") ^ i10;
                        i6 = ((iM2568 ^ i11) * 28387) ^ (-397102967);
                        i7 = -256858175;
                    } else {
                        iM2568 = (C0630.m2566("֨᩸") ^ i11) * (-45);
                        i6 = ((iM2568 ^ i10) * (-31013)) ^ 1805882866;
                        i7 = 1118531432;
                    }
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList17 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList17;
                    break;
                case -1185109089:
                case 297438886:
                    abstractActivityC12266.m29780(abstractActivityC12266.f36538.m45423());
                    break;
                case -1095213586:
                case 870679910:
                    abstractActivityC12266.m29780(z2);
                    abstractActivityC12266.f36539.notifyDataSetChanged();
                    break;
                case -1089149937:
                case 736375744:
                    iM6984 = C2105.m6981(strM1483);
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("֡᩶") ^ i10;
                        i = ((iM2566 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                    } else {
                        iM2566 = (C2105.m6981("ܽܿ") + i11) * 73;
                        i = ((iM2566 ^ i10) * (-23145)) ^ (-281406979);
                        i2 = -1851183652;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1030634909:
                case 1461527253:
                    abstractActivityC12266.f36529 += z2 ? 1 : 0;
                    iM2567 = (i11 - C2105.m6981("ۧۤ")) * (-81);
                    i3 = ((iM2567 ^ i10) * 9391) ^ (-405813789);
                    i4 = 515928501;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -963476798:
                case -299226483:
                    if (((C8739) C3019.m9263(arrayList, i16)).m22602()) {
                        iM2566 = (C2105.m6981("᩵ۗ") + i10) * 93;
                        i = ((iM2566 ^ i11) * 15753) ^ 66205015;
                        i2 = -1117094625;
                    } else {
                        iM2566 = C2105.m6981("᩺ۤ") ^ i11;
                        i = ((iM2566 ^ i10) * (-16889)) ^ (-1544940840);
                        i2 = -403827462;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -947896077:
                case 904948844:
                    i21 = i21;
                    sArr3 = sArr3;
                    int i39 = i19;
                    arrayList2 = arrayList2;
                    i5 = i39;
                    abstractActivityC12266.f36529 = z ? 1 : 0;
                    if (abstractActivityC12266.f36533) {
                        iM2568 = (C2105.m6981("ᩴܳ") + i10) * 115;
                        i6 = ((iM2568 ^ i11) * (-19495)) ^ 1375116752;
                        i7 = 1888588920;
                    } else {
                        iM2568 = C0630.m2566("ܶ֨") ^ i11;
                        i6 = ((iM2568 ^ i10) * (-31443)) ^ (-6631949);
                        i7 = -66349754;
                    }
                    i13 = iM2568 ^ i7;
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
                    if (C1773.m5910(itM12354)) {
                        iM2567 = C2105.m6981("ܰܽ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-12565)) ^ 497280671;
                        i4 = 615276917;
                    } else {
                        iM2567 = C0630.m2566("᩸᩷") ^ i10;
                        i3 = ((iM2567 ^ i11) * 30347) ^ (-687382957);
                        i4 = -1629408634;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -889449022:
                case -463002671:
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("᩵ܽ") + i10) * (-65);
                        i = ((iM2566 ^ i11) * 12615) ^ (-1692139109);
                        i2 = 2119147079;
                    } else {
                        iM2566 = (C2105.m6981("֨ۢ") ^ i10) * 49;
                        i = ((iM2566 ^ i11) * (-12307)) ^ (-2139344709);
                        i2 = -863503220;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -742062553:
                case 1986608645:
                    i15 = 0;
                    iM2567 = (C2105.m6981("֫ܳ") ^ i10) * (-7);
                    i3 = ((iM2567 ^ i11) * (-18995)) ^ 815231853;
                    i4 = -74508259;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -721873149:
                case 1498941853:
                    arrayList = abstractActivityC12266.f36537;
                    i16 = abstractActivityC12266.f36531[i15];
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("֡᩶") ^ i10;
                        i = ((iM2566 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i11;
                        i = ((iM2566 ^ i10) * (-18149)) ^ (-513897506);
                        i2 = 1617300072;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -705199057:
                case -286113175:
                    C1420.m4913();
                    C3537.m10746();
                    iM2566 = C2105.m6981("֡ᩴ") ^ i11;
                    i = ((iM2566 ^ i10) * (-30359)) ^ (-2138438129);
                    i2 = -1742244562;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -649006062:
                case 1326419034:
                    strM1483 = C0237.m1483(sArr3, 75, 3, i14);
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("ܺۗ") + i11) * 101;
                        i = ((iM2566 ^ i10) * 19637) ^ 756170748;
                        i2 = 2036093383;
                    } else {
                        iM2566 = (i10 - C0630.m2566("ۙ᩸")) * 101;
                        i = ((iM2566 ^ i11) * (-3499)) ^ 939789785;
                        i2 = -1792857501;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -597085923:
                case 1960953316:
                    ArrayList arrayList19 = arrayList2;
                    i21 = i21;
                    sArr3 = sArr3;
                    int i40 = i19;
                    arrayList2 = arrayList19;
                    if (((C8739) C3019.m9263(arrayList19, i40)).m22596(z2)) {
                        iM2568 = C0630.m2566("ۙ֡") ^ i10;
                        i5 = i40;
                        i6 = ((iM2568 ^ i11) * 7737) ^ (-1424100386);
                        i7 = -2047258756;
                    } else {
                        i5 = i40;
                        iM2568 = (i11 - C0630.m2566("֫ۢ")) * 99;
                        i6 = ((iM2568 ^ i10) * (-6443)) ^ (-1096112717);
                        i7 = -1204488943;
                    }
                    i13 = iM2568 ^ i7;
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
                    int iM45427 = abstractActivityC12266.f36538.m45427();
                    z = false;
                    z2 = true;
                    if (iM45427 != 0) {
                        iM6981 = (C2105.m6981("ܳܰ") ^ i10) * 95;
                        i8 = ((iM6981 ^ i11) * 1513) ^ (-130103798);
                        i9 = 1583073842;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i11;
                        i8 = ((iM6981 ^ i10) * (-30907)) ^ (-1554136896);
                        i9 = -1405555182;
                    }
                    i13 = iM6981 ^ i9;
                    sArr3 = sArr4;
                    i21 = iM45427;
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
                        iM2567 = C2105.m6981("ۗ᩶") ^ i11;
                        i3 = ((iM2567 ^ i10) * 20093) ^ 1708305681;
                        i4 = -711380851;
                    } else {
                        iM2567 = C0630.m2566("ۖ۟") ^ i11;
                        i3 = ((iM2567 ^ i10) * 21555) ^ (-1527540730);
                        i4 = 958422271;
                    }
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case -181699517:
                case -81103479:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (i15 < abstractActivityC12266.f36534) {
                        iM2567 = (i10 - C2105.m6981("֡۫")) * 9;
                        i3 = ((iM2567 ^ i11) * 24161) ^ 1246132863;
                        i4 = -44268287;
                    } else {
                        iM2567 = C0630.m2566("᩸᩷") ^ i10;
                        i3 = ((iM2567 ^ i11) * 30347) ^ (-687382957);
                        i4 = -1629408634;
                    }
                    i13 = iM2567 ^ i4;
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
                    abstractActivityC12266.f36529 = z ? 1 : 0;
                    if (abstractActivityC12266.f36533) {
                        i20 = z ? 1 : 0;
                        iM2568 = (C2105.m6981("֨ۧ") + i11) * 71;
                        i6 = ((iM2568 ^ i10) * (-29461)) ^ 1064557393;
                        i7 = 1556544592;
                    } else {
                        iM2568 = C2105.m6981("ۗ۫") ^ i10;
                        i6 = ((iM2568 ^ i11) * 12859) ^ 653536617;
                        i7 = -723772992;
                    }
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList112 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList112;
                    break;
                case -11454214:
                case 1932649142:
                    iM6983 = C2105.m6981(RunnableC1108.m3789(sArr2, i23, i24, i14));
                    if (C3537.f11231 < 0) {
                        iM2566 = (C0630.m2566("᩹ܰ") ^ i11) * (-23);
                        i = ((iM2566 ^ i10) * 1925) ^ (-317538984);
                        i2 = -1810966406;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i310 = i19;
                        arrayList2 = arrayList2;
                        i5 = i310;
                        iM2568 = (C0630.m2566("ܿۨ") + i10) * (-73);
                        i6 = ((iM2568 ^ i11) * 20321) ^ (-1244896121);
                        i7 = 342610518;
                        i13 = iM2568 ^ i7;
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
                    abstractActivityC12266.m29780(z);
                    break;
                case 91837099:
                case 676919953:
                    abstractActivityC12266.m10217(i17, iM6984 ^ 2104653483, z);
                    break;
                case 227168018:
                case 682312654:
                    i21 = i21;
                    sArr3 = sArr3;
                    i5 = i19;
                    itM9029 = C2958.m9029(abstractActivityC12266.f36537);
                    iM2568 = (C2105.m6981("᩶ܺ") + i11) * 101;
                    i6 = ((iM2568 ^ i10) * (-4323)) ^ (-1020884064);
                    i7 = 1199732378;
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList114 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList114;
                    break;
                case 375957440:
                case 2025474503:
                    C1711.m5736();
                    break;
                case 379959933:
                case 1224156311:
                    abstractActivityC12266.f36529 += z2 ? 1 : 0;
                    iM2566 = C2105.m6981("᩺ۤ") ^ i11;
                    i = ((iM2566 ^ i10) * (-16889)) ^ (-1544940840);
                    i2 = -403827462;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case 565201921:
                case 735888845:
                    sArr2 = f36523;
                    i23 = 72;
                    i24 = 3;
                    if (C1128.f4106 > 0) {
                        iM2566 = (C0630.m2566("ۖۙ") + i10) * (-61);
                        i = ((iM2566 ^ i11) * (-7647)) ^ (-1813798038);
                        i2 = -914537855;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i311 = i19;
                        arrayList2 = arrayList2;
                        i5 = i311;
                        iM2568 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((iM2568 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = iM2568 ^ i7;
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
                    if (!((C8739) C2272.m7513(itM9029)).m22596(z2)) {
                        i5 = i19;
                        iM2568 = (C2105.m6981("᩶ܺ") + i11) * 101;
                        i6 = ((iM2568 ^ i10) * (-4323)) ^ (-1020884064);
                        i7 = 1199732378;
                        i13 = iM2568 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList116 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList116;
                    } else {
                        iM2567 = (C2105.m6981("ܽۨ") ^ i10) * 57;
                        i3 = ((iM2567 ^ i11) * (-22971)) ^ 1544003543;
                        i4 = 1171878161;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    }
                    break;
                case 1003332704:
                case 1203040351:
                    if (abstractActivityC12266.f36529 == 0) {
                        iM2566 = C0630.m2566("ۙۛ") ^ i11;
                        i = ((iM2566 ^ i10) * (-26129)) ^ 652773798;
                        i2 = -1882686325;
                    } else {
                        iM2566 = C0630.m2566("᩺᩵") ^ i11;
                        i = ((iM2566 ^ i10) * (-4195)) ^ 777244040;
                        i2 = -1112944576;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case 1146013384:
                case 1643757087:
                    i21 = i21;
                    sArr3 = sArr3;
                    if (!C0483.m2123(itM9029)) {
                        int i43 = i19;
                        arrayList2 = arrayList2;
                        i5 = i43;
                        iM2568 = C0630.m2566("ۙܰ") ^ i10;
                        i6 = ((iM2568 ^ i11) * (-4059)) ^ (-1041646249);
                        i7 = 1181986638;
                        i13 = iM2568 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i21 = i21;
                        ArrayList arrayList117 = arrayList2;
                        i19 = i5;
                        arrayList2 = arrayList117;
                    } else {
                        iM2567 = C0630.m2566("ۚۘ") ^ i10;
                        i3 = ((iM2567 ^ i11) * (-1679)) ^ (-1606579020);
                        i4 = -382543703;
                        i13 = iM2567 ^ i4;
                        i12 = i3;
                        sArr3 = sArr3;
                        i21 = i21;
                    }
                    break;
                case 1253276514:
                case 1772238157:
                    i15++;
                    iM2567 = (C2105.m6981("֫ܳ") ^ i10) * (-7);
                    i3 = ((iM2567 ^ i11) * (-18995)) ^ 815231853;
                    i4 = -74508259;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
                case 1338228550:
                case 1426514896:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("֡᩶") ^ i10;
                        i = ((iM2566 ^ i11) * 11239) ^ (-1814476169);
                        i2 = 498221269;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    } else {
                        i21 = i21;
                        sArr3 = sArr3;
                        int i312 = i19;
                        arrayList2 = arrayList2;
                        i5 = i312;
                        iM2568 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((iM2568 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                        i13 = iM2568 ^ i7;
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
                        iM2567 = C0630.m2566("ۧۡ") ^ i10;
                        sArr3 = sArr3;
                        i3 = ((iM2567 ^ i11) * 6743) ^ (-1331423479);
                        i4 = 1247998275;
                    } else {
                        sArr3 = sArr3;
                        iM2567 = C0630.m2566("۟ܳ") ^ i11;
                        i3 = ((iM2567 ^ i10) * (-15967)) ^ (-2017367133);
                        i4 = -1342207448;
                    }
                    i13 = iM2567 ^ i4;
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
                    if (C1711.f5919) {
                        iM2568 = (C0630.m2566("۫᩶") + i11) * 65;
                        i6 = ((iM2568 ^ i10) * (-30169)) ^ (-226437537);
                        i7 = 465422048;
                    } else {
                        iM2568 = C0630.m2566("ܳ᩹") ^ i11;
                        i6 = ((iM2568 ^ i10) * (-20973)) ^ 1184290841;
                        i7 = 222108106;
                    }
                    i13 = iM2568 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i21 = i21;
                    ArrayList arrayList119 = arrayList2;
                    i19 = i5;
                    arrayList2 = arrayList119;
                    break;
                default:
                    itM12354 = C4117.m12354(abstractActivityC12266.f36537);
                    iM2567 = (i11 - C2105.m6981("ۧۤ")) * (-81);
                    i3 = ((iM2567 ^ i10) * 9391) ^ (-405813789);
                    i4 = 515928501;
                    i13 = iM2567 ^ i4;
                    i12 = i3;
                    sArr3 = sArr3;
                    i21 = i21;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (l.C2126.f7087 == false) goto L13;
     */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m29789(AbstractActivityC12266 abstractActivityC12266) {
        int i;
        C19712 c19712;
        short[] sArr;
        int i2;
        C19712 c19713;
        int iM2566;
        int i3;
        C19712 c19714;
        int i4;
        int i5;
        int i6;
        int iM6981;
        int i7;
        int i8;
        int iM6982;
        int i9;
        short[] sArr2;
        int iM6983;
        int i10;
        int i11;
        abstractActivityC12266 = abstractActivityC12266;
        int i12 = C3683.f11629;
        int i13 = C4263.f13799;
        int iM6984 = (C2105.m6981("ۢ᩷") ^ i12) * q.h;
        int i14 = ((iM6984 ^ i13) * (-12345)) ^ (-699571265);
        C19712 c19715 = null;
        C19712 c19716 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i15 = iM6984 ^ 339766664;
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
        C19712 c19717 = null;
        C19712 c19718 = null;
        String strM6573 = null;
        int i24 = 0;
        C19712 c19719 = null;
        String strM2436 = null;
        int i25 = 0;
        String strM16034 = null;
        String strM4373 = null;
        String strM7159 = null;
        C19712 c197110 = null;
        int i26 = 0;
        while (true) {
            i22 = i15 ^ (i14 & (((i22 ^ i13) * 16041) >> 31));
            switch (i22) {
                case -1986867163:
                case -199641362:
                    c19715.m45425(i17, C0630.m2566(strM7159) ^ 2122839841);
                    break;
                case -1971612880:
                case 520846330:
                    i26 = i26;
                    i18 = 2;
                    if (i24 != 2) {
                        iM6982 = C0630.m2566("ۚܳ") ^ i12;
                        i7 = ((iM6982 ^ i13) * (-32513)) ^ (-1535510339);
                        i9 = -1618223384;
                    } else {
                        iM6982 = C0630.m2566("ܶۨ") ^ i12;
                        i7 = ((iM6982 ^ i13) * (-25073)) ^ (-1196212943);
                        i9 = 1221424636;
                    }
                    i11 = iM6982 ^ i9;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -1886223423:
                case 543189501:
                    c197110 = abstractActivityC12266.f36538;
                    i26 = i26;
                    strM6573 = AbstractC2021.m6573(f36523, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i16);
                    if (C0798.m2998() == 0) {
                        iM6982 = (i13 - C2105.m6981("۠᩶")) * 127;
                        i7 = ((iM6982 ^ i12) * (-9557)) ^ (-1183613221);
                        i9 = -613856701;
                        i11 = iM6982 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    }
                    sArr2 = sArr5;
                    i6 = i23;
                    iM6981 = (i12 - C0630.m2566("ۜ֫")) * (-81);
                    sArr5 = sArr2;
                    i7 = ((iM6981 ^ i13) * (-25829)) ^ (-32697272);
                    i8 = 1917158584;
                    i11 = iM6981 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -1870476084:
                case -1189205052:
                    c19713 = c19717;
                    i16 = 38544;
                    iM2566 = C2105.m6981("ۡۢ") ^ i12;
                    i14 = ((iM2566 ^ i13) * (-22791)) ^ 254014328;
                    i3 = 830780538;
                    i4 = iM2566 ^ i3;
                    i20 = i20;
                    i23 = i23;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c19717 = c19713;
                    i24 = i5;
                    break;
                case -1862911076:
                case -753585222:
                    C2126.m7040();
                    C2167.m7155();
                    i26 = i26;
                    i20 = i20;
                    C19712 c197111 = c19717;
                    i24 = i24;
                    c19713 = c197111;
                    int iM2567 = C0630.m2566("ۖ᩻") ^ i12;
                    i14 = ((iM2567 ^ i13) * (-6519)) ^ (-206793318);
                    i4 = iM2567 ^ (-635707163);
                    i20 = i20;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c19717 = c19713;
                    i24 = i5;
                    break;
                case -1787058637:
                case -1590259585:
                    c19716.m45425(i25, C0630.m2566(strM2436) ^ 2128778644);
                    break;
                case -1736277199:
                case 114752464:
                    c19713 = c19717;
                    i16 = 21203;
                    iM2566 = C2105.m6981("ۡۢ") ^ i12;
                    i14 = ((iM2566 ^ i13) * (-22791)) ^ 254014328;
                    i3 = 830780538;
                    i4 = iM2566 ^ i3;
                    i20 = i20;
                    i23 = i23;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c19717 = c19713;
                    i24 = i5;
                    break;
                case -1601233200:
                case 303760026:
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    C19712 c197112 = c19717;
                    i24 = i24;
                    c19713 = c197112;
                    if ((s * s2) - ((s * s) + 96727225) <= 0) {
                        iM2566 = (C0630.m2566("ۤۙ") + i13) * 77;
                        i14 = ((iM2566 ^ i12) * (-11139)) ^ 1697432460;
                        i3 = 115645437;
                    } else {
                        iM2566 = (C0630.m2566("ܳܳ") ^ i12) * 91;
                        i14 = ((iM2566 ^ i13) * (-27147)) ^ 3861826;
                        i3 = 1955171374;
                    }
                    i4 = iM2566 ^ i3;
                    i20 = i20;
                    i23 = i23;
                    i26 = i26;
                    i15 = i4;
                    i5 = i24;
                    c19717 = c19713;
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
                    C19712 c197113 = c19717;
                    i24 = i24;
                    c19713 = c197113;
                    sArr3 = f36523;
                    c = 'e';
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = (C0630.m2566("ۜۢ") ^ i12) * 45;
                        i14 = ((iM2566 ^ i13) * 10471) ^ (-1380718415);
                        i3 = -1582398640;
                        i4 = iM2566 ^ i3;
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    } else {
                        i23 = i23;
                        int iM2568 = C0630.m2566("ۖ᩻") ^ i12;
                        i14 = ((iM2568 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM2568 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    }
                    break;
                case -1135979933:
                case 1976213995:
                    i26 = i26;
                    if (abstractActivityC12266.f36538.m45423()) {
                        iM6982 = C2105.m6981("ۧۚ") ^ i13;
                        i7 = ((iM6982 ^ i12) * 2947) ^ 1209581969;
                        i9 = 1946302530;
                    } else {
                        iM6982 = C0630.m2566("۠ۖ") ^ i13;
                        i7 = ((iM6982 ^ i12) * 19841) ^ 1381999208;
                        i9 = 1821963779;
                    }
                    i11 = iM6982 ^ i9;
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
                    c19713 = c19717;
                    i20 = i20;
                    i23 = i23;
                    int iM45427 = abstractActivityC12266.f36538.m45427();
                    if (iM45427 != 0) {
                        int iM6985 = C2105.m6981("۬ۧ") ^ i13;
                        int i27 = ((iM6985 ^ i12) * (-17383)) ^ (-1650451962);
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = iM6985 ^ 2005025841;
                        c19717 = c19713;
                        i24 = iM45427;
                        i14 = i27;
                        abstractActivityC12266 = abstractActivityC12266;
                    } else {
                        iM2566 = (C0630.m2566("۬ܿ") ^ i13) * (-3);
                        i24 = iM45427;
                        i14 = ((iM2566 ^ i12) * (-4925)) ^ (-2044329827);
                        i3 = 2116397890;
                        i4 = iM2566 ^ i3;
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    }
                    break;
                case -793206687:
                case 467230949:
                    c19719.m45425(i18, C2105.m6981(strM4373) ^ 2125427181);
                    break;
                case -752620449:
                case 1511073695:
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    C19712 c197114 = c19717;
                    i24 = i24;
                    c19713 = c197114;
                    s = sArr3[c];
                    s2 = 19670;
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C2105.m6981("ۙ۬") ^ i13) * (-75);
                        i14 = ((iM2566 ^ i12) * 31331) ^ 877199844;
                        i3 = 139070663;
                        i4 = iM2566 ^ i3;
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    } else {
                        c19714 = c19713;
                        int iM2569 = (C0630.m2566("֨ܿ") + i12) * (-83);
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = iM2569 ^ (-1039252500);
                        i5 = i24;
                        c19717 = c19714;
                        i14 = ((iM2569 ^ i13) * (-12713)) ^ (-1992614590);
                        i24 = i5;
                    }
                    break;
                case -647786868:
                case 1388850109:
                    if (C2105.f7037 == 0) {
                        i26 = i26;
                        sArr2 = sArr5;
                        i6 = i23;
                        iM6981 = (i12 - C0630.m2566("ۜ֫")) * (-81);
                        sArr5 = sArr2;
                        i7 = ((iM6981 ^ i13) * (-25829)) ^ (-32697272);
                        i8 = 1917158584;
                        i11 = iM6981 ^ i8;
                        i23 = i6;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    } else {
                        i26 = i26;
                        i20 = i20;
                        C19712 c197115 = c19717;
                        i24 = i24;
                        c19713 = c197115;
                        int iM25610 = C0630.m2566("ۖ᩻") ^ i12;
                        i14 = ((iM25610 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM25610 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    }
                    break;
                case -628437204:
                case 1132698278:
                    i = i26;
                    c19712 = c19717;
                    sArr = sArr4;
                    i2 = i23;
                    i20 = IShizukuService.Stub.TRANSACTION_attachUserService;
                    i21 = 3;
                    if (C1420.m4913()) {
                        int iM6986 = (C2105.m6981("֡ۗ") ^ i13) * 109;
                        sArr4 = sArr;
                        i14 = ((iM6986 ^ i12) * (-7695)) ^ 1146714273;
                        i23 = i2;
                        i26 = i;
                        i15 = iM6986 ^ (-1992451430);
                    } else {
                        sArr4 = sArr;
                        int iM6987 = (C2105.m6981("ܽܳ") + i13) * 31;
                        i23 = i2;
                        i26 = i;
                        i15 = iM6987 ^ 1501811986;
                        i14 = ((iM6987 ^ i12) * (-17699)) ^ (-1849135287);
                        i24 = i24;
                    }
                    c19717 = c19712;
                    break;
                case -458712821:
                case 1569911182:
                    i26 = i26;
                    c19716 = abstractActivityC12266.f36538;
                    strM2436 = RunnableC0588.m2436(f36523, 114, 3, i16);
                    if (C3019.m9255() > 0) {
                        iM6982 = C2105.m6981("ܺᩳ") ^ i12;
                        i7 = ((iM6982 ^ i13) * (-9027)) ^ (-1487449472);
                        i9 = 1437707243;
                        i11 = iM6982 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    }
                    sArr2 = sArr5;
                    i6 = i23;
                    iM6981 = (i12 - C0630.m2566("ۜ֫")) * (-81);
                    sArr5 = sArr2;
                    i7 = ((iM6981 ^ i13) * (-25829)) ^ (-32697272);
                    i8 = 1917158584;
                    i11 = iM6981 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case -418603490:
                case 1976479448:
                    C4263.m12819();
                    if (C0964.f3626 != 0) {
                        i = i26;
                        c19712 = c19717;
                        sArr = sArr4;
                        i2 = i23;
                        int iM6988 = (C2105.m6981("֡ۗ") ^ i13) * 109;
                        sArr4 = sArr;
                        i14 = ((iM6988 ^ i12) * (-7695)) ^ 1146714273;
                        i23 = i2;
                        i26 = i;
                        i15 = iM6988 ^ (-1992451430);
                        c19717 = c19712;
                    } else {
                        iM6983 = (C2105.m6981("ۤ۫") + i13) * 59;
                        i7 = ((iM6983 ^ i12) * (-11683)) ^ (-2065535511);
                        i10 = 1136157928;
                        i15 = iM6983 ^ i10;
                        i14 = i7;
                    }
                    break;
                case 300360273:
                case 1975666220:
                    c19718.m45425(i18, C0630.m2566(strM16034) ^ 2102409270);
                    break;
                case 321820010:
                case 1079954873:
                    i26 = i26;
                    c19718 = abstractActivityC12266.f36538;
                    strM16034 = C5695.m16034(f36523, UMErrorCode.E_UM_BE_CREATE_FAILED, 3, i16);
                    if (C3245.f10203 > 0) {
                        iM6982 = C2105.m6981("֫᩺") ^ i13;
                        i7 = ((iM6982 ^ i12) * 21409) ^ 839366487;
                        i9 = 1100916011;
                        i11 = iM6982 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    }
                    sArr2 = sArr5;
                    i6 = i23;
                    iM6981 = (i12 - C0630.m2566("ۜ֫")) * (-81);
                    sArr5 = sArr2;
                    i7 = ((iM6981 ^ i13) * (-25829)) ^ (-32697272);
                    i8 = 1917158584;
                    i11 = iM6981 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case 373327110:
                case 1489241309:
                    i26 = i26;
                    c19719 = abstractActivityC12266.f36538;
                    strM4373 = C1294.m4373(f36523, 108, 3, i16);
                    if (RunnableC3474.f10992 > 0) {
                        iM6982 = C2105.m6981("ۧ۟") ^ i12;
                        i7 = ((iM6982 ^ i13) * 4119) ^ (-846021089);
                        i9 = -279020080;
                        i11 = iM6982 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    } else {
                        i20 = i20;
                        C19712 c197116 = c19717;
                        i24 = i24;
                        c19713 = c197116;
                        int iM25611 = C0630.m2566("ۖ᩻") ^ i12;
                        i14 = ((iM25611 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM25611 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    }
                    break;
                case 451618977:
                case 673068372:
                    i26 = 4;
                    if (i24 != 4) {
                        iM6983 = (C2105.m6981("ۜۛ") + i13) * 127;
                        i7 = ((iM6983 ^ i12) * 3965) ^ 1069582812;
                        i10 = -596227262;
                    } else {
                        iM6983 = C2105.m6981("᩹ۘ") ^ i12;
                        i7 = ((iM6983 ^ i13) * 255) ^ (-1207432070);
                        i10 = 2065070419;
                    }
                    i15 = iM6983 ^ i10;
                    i14 = i7;
                    break;
                case 483166797:
                case 1980313334:
                    i24 = i24;
                    i26 = i26;
                    i20 = i20;
                    i23 = i23;
                    c19714 = abstractActivityC12266.f36538;
                    i19 = 0;
                    sArr4 = f36523;
                    if (C1916.f6442) {
                        int iM25612 = C0630.m2566("ᩴ᩺") ^ i12;
                        i14 = ((iM25612 ^ i13) * 3071) ^ (-317385);
                        i23 = i23;
                        i26 = i26;
                        i15 = iM25612 ^ (-1224272435);
                        i24 = i24;
                        c19717 = c19714;
                        i20 = i20;
                    } else {
                        int iM25613 = (C0630.m2566("֨ܿ") + i12) * (-83);
                        i20 = i20;
                        i23 = i23;
                        i26 = i26;
                        i15 = iM25613 ^ (-1039252500);
                        i5 = i24;
                        c19717 = c19714;
                        i14 = ((iM25613 ^ i13) * (-12713)) ^ (-1992614590);
                        i24 = i5;
                    }
                    break;
                case 573097261:
                case 1486177399:
                    c197110.m45425(i26, C2105.m6981(strM6573) ^ 2129106364);
                    break;
                case 733614423:
                case 782028653:
                    C3245.m9925();
                    break;
                case 795042153:
                case 1193647857:
                    i26 = i26;
                    c19715 = abstractActivityC12266.f36538;
                    sArr5 = f36523;
                    i23 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    if (C5695.f17556 < 0) {
                        iM6982 = C2105.m6981("֡ۤ") ^ i13;
                        i7 = ((iM6982 ^ i12) * (-24809)) ^ 711557393;
                        i9 = 1075446071;
                        i11 = iM6982 ^ i9;
                        i26 = i26;
                        i15 = i11;
                        i14 = i7;
                    } else {
                        i20 = i20;
                        C19712 c197117 = c19717;
                        i24 = i24;
                        c19713 = c197117;
                        int iM25614 = C0630.m2566("ۖ᩻") ^ i12;
                        i14 = ((iM25614 ^ i13) * (-6519)) ^ (-206793318);
                        i4 = iM25614 ^ (-635707163);
                        i20 = i20;
                        i26 = i26;
                        i15 = i4;
                        i5 = i24;
                        c19717 = c19713;
                        i24 = i5;
                    }
                    break;
                case 1138667618:
                case 1163881962:
                    i26 = i26;
                    i6 = i23;
                    i17 = 1;
                    if (i24 != 1) {
                        iM6981 = C0630.m2566("ܽ᩺") ^ i13;
                        i7 = ((iM6981 ^ i12) * 30943) ^ 975235618;
                        i8 = 727164943;
                    } else {
                        iM6981 = (i12 - C2105.m6981("᩸ۧ")) * (-61);
                        i7 = ((iM6981 ^ i13) * (-4731)) ^ (-142481790);
                        i8 = -1828154733;
                    }
                    i11 = iM6981 ^ i8;
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
                        iM6982 = C0630.m2566("᩶ۧ") ^ i13;
                        i7 = ((iM6982 ^ i12) * (-9305)) ^ 1143283161;
                        i9 = 474031949;
                    } else {
                        iM6982 = (i12 - C2105.m6981("᩷ᩴ")) * 77;
                        i7 = ((iM6982 ^ i13) * (-10485)) ^ (-1116630995);
                        i9 = -700159394;
                    }
                    i11 = iM6982 ^ i9;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                case 1796644743:
                case 1950784892:
                    i26 = i26;
                    sArr2 = sArr5;
                    i6 = i23;
                    strM7159 = C2167.m7159(sArr2, i6, 3, i16);
                    if (C1294.f4556 >= 0) {
                        iM6981 = (i12 - C0630.m2566("ۜ֫")) * (-81);
                        sArr5 = sArr2;
                        i7 = ((iM6981 ^ i13) * (-25829)) ^ (-32697272);
                        i8 = 1917158584;
                    } else {
                        sArr5 = sArr2;
                        iM6981 = C0630.m2566("ۗ᩻") ^ i12;
                        i7 = ((iM6981 ^ i13) * (-7691)) ^ 1984986110;
                        i8 = 10393991;
                    }
                    i11 = iM6981 ^ i8;
                    i23 = i6;
                    i26 = i26;
                    i15 = i11;
                    i14 = i7;
                    break;
                default:
                    c19717.m45425(i19, C2105.m6981(RunnableC1937.m6385(sArr4, i20, i21, i16)) ^ 2097719778);
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f36532.m15258();
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
    
        if (l.C1504.f5354 != false) goto L14;
     */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m29782(AbstractActivityC12266 abstractActivityC12266) {
        int i;
        int iM2566;
        int i2;
        int iM2567;
        int i3;
        int i4;
        AbstractActivityC12266 abstractActivityC12267 = abstractActivityC12266;
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
        int i13 = RunnableC0588.f2309;
        int i14 = C2167.f7158;
        int iM6981 = C2105.m6981("۫ᩴ") ^ i13;
        int i15 = ((iM6981 ^ i14) * (-13111)) ^ (-1844754487);
        int i16 = iM6981 ^ 1353995253;
        String strM3789 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * (-4461)) >> 31));
            switch (i12) {
                case -2083920898:
                case 524461568:
                    i = i9;
                    i8 = 9604;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C0630.m2566("᩹᩹") ^ i13;
                        i15 = ((iM2566 ^ i14) * (-2739)) ^ 1485764292;
                        i2 = 1740150594;
                    } else {
                        iM2566 = C2105.m6981("ۛ᩵") ^ i13;
                        i15 = ((iM2566 ^ i14) * 20273) ^ (-550678416);
                        i2 = -427500857;
                    }
                    int i17 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i17;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case -1999553831:
                case -467881499:
                    i = i9;
                    i5 = s + 98;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i13 - C2105.m6981("۫ܰ")) * 123;
                        i15 = ((iM2566 ^ i14) * 26593) ^ (-509248707);
                        i2 = 18011086;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۠") + i14) * 23;
                        i15 = ((iM2566 ^ i13) * 10933) ^ (-528303459);
                        i2 = -141970975;
                    }
                    int i18 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i18;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case -1952038850:
                case 1034223332:
                    strM3789 = RunnableC1108.m3789(sArr2, i10, i11, i9);
                    if (C0382.f1805) {
                        i = i9;
                        iM2567 = C2105.m6981("ۧᩳ") ^ i14;
                        i3 = ((iM2567 ^ i13) * 21789) ^ 1892372768;
                        i4 = -886068051;
                    } else {
                        iM2567 = (C2105.m6981("֫֨") ^ i14) * (-91);
                        i = i9;
                        i3 = ((iM2567 ^ i13) * (-24443)) ^ 1084551069;
                        i4 = -1268022764;
                    }
                    int i19 = i;
                    i16 = iM2567 ^ i4;
                    i15 = i3;
                    i9 = i19;
                    break;
                case -1832880074:
                case 309973223:
                    C1711.m5728(C2105.m6981(strM3789) ^ 2116156096);
                    break;
                case -1762994141:
                case 305567127:
                    i = i9;
                    c = 'N';
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("᩹᩹") ^ i13;
                        i15 = ((iM2566 ^ i14) * (-2739)) ^ 1485764292;
                        i2 = 1740150594;
                    } else {
                        iM2566 = (C0630.m2566("֨᩵") + i14) * 65;
                        i15 = ((iM2566 ^ i13) * 10835) ^ (-298472275);
                        i2 = 658624460;
                    }
                    int i110 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i110;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case -1571224532:
                case 32218258:
                    C0382.m1848();
                    if (C0237.f1507 == 0) {
                        iM2567 = (C2105.m6981("֫֨") ^ i14) * (-91);
                        i = i9;
                        i3 = ((iM2567 ^ i13) * (-24443)) ^ 1084551069;
                        i4 = -1268022764;
                        int i111 = i;
                        i16 = iM2567 ^ i4;
                        i15 = i3;
                        i9 = i111;
                    } else {
                        i = i9;
                        iM2566 = C0630.m2566("᩵ۙ") ^ i13;
                        i15 = ((iM2566 ^ i14) * 10075) ^ (-1254870940);
                        i2 = -1405040850;
                        int i112 = iM2566 ^ i2;
                        i9 = i;
                        i16 = i112;
                        abstractActivityC12267 = abstractActivityC12266;
                    }
                    break;
                case -1476597955:
                case 312878524:
                    i = i9;
                    if (abstractActivityC12266.mo19680()) {
                        iM2567 = (C0630.m2566("᩵֡") ^ i13) * 123;
                        i3 = ((iM2567 ^ i14) * (-15181)) ^ 1894701803;
                        i4 = 575306641;
                    } else {
                        iM2567 = (C0630.m2566("ۨ᩷") + i13) * (-7);
                        i3 = ((iM2567 ^ i14) * (-31213)) ^ 1478336355;
                        i4 = -2058820848;
                    }
                    int i113 = i;
                    i16 = iM2567 ^ i4;
                    i15 = i3;
                    i9 = i113;
                    break;
                case -1454519339:
                case -88372992:
                    if (C3019.m9255() > 0) {
                        i = i9;
                        iM2566 = C0630.m2566("᩶ܿ") ^ i14;
                        i15 = ((iM2566 ^ i13) * (-1221)) ^ 594542782;
                        i2 = -658625731;
                        int i114 = iM2566 ^ i2;
                        i9 = i;
                        i16 = i114;
                        abstractActivityC12267 = abstractActivityC12266;
                    }
                    i = i9;
                    iM2566 = C0630.m2566("᩹᩹") ^ i13;
                    i15 = ((iM2566 ^ i14) * (-2739)) ^ 1485764292;
                    i2 = 1740150594;
                    int i115 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i115;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case -1286307785:
                case -867329784:
                    i9 = 51567;
                    int iM2568 = C0630.m2566("ܰۙ") ^ i14;
                    i16 = iM2568 ^ 2125106866;
                    i15 = ((iM2568 ^ i13) * (-28611)) ^ (-1024194783);
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case -917545805:
                case -758596326:
                    i = i9;
                    sArr = f36523;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("᩵ۙ") ^ i13;
                        i15 = ((iM2566 ^ i14) * 10075) ^ (-1254870940);
                        i2 = -1405040850;
                    } else {
                        iM2566 = C0630.m2566("ۡᩴ") ^ i13;
                        i15 = ((iM2566 ^ i14) * 23141) ^ 163007318;
                        i2 = 252823615;
                    }
                    int i116 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i116;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case -657643008:
                case 1944375838:
                    i = i9;
                    if (abstractActivityC12267.m29774(false)) {
                        iM2567 = (C0630.m2566("ۨ᩷") + i13) * (-7);
                        i3 = ((iM2567 ^ i14) * (-31213)) ^ 1478336355;
                        i4 = -2058820848;
                    } else {
                        iM2567 = C0630.m2566("ۨܶ") ^ i14;
                        i3 = ((iM2567 ^ i13) * 20519) ^ (-299829791);
                        i4 = -357803689;
                    }
                    int i117 = i;
                    i16 = iM2567 ^ i4;
                    i15 = i3;
                    i9 = i117;
                    break;
                case -413507002:
                case 171053907:
                    RunnableC3474.m10630();
                    break;
                case -53924465:
                case 872024127:
                    i = i9;
                    sArr2 = f36523;
                    i10 = 79;
                    if (C3746.f11829 > 0) {
                        iM2567 = (i13 - C2105.m6981("ۚܺ")) * (-105);
                        i3 = ((iM2567 ^ i14) * 12343) ^ (-2083337024);
                        i4 = -2119740507;
                        int i118 = i;
                        i16 = iM2567 ^ i4;
                        i15 = i3;
                        i9 = i118;
                    } else {
                        iM2566 = C0630.m2566("᩹᩹") ^ i13;
                        i15 = ((iM2566 ^ i14) * (-2739)) ^ 1485764292;
                        i2 = 1740150594;
                        int i119 = iM2566 ^ i2;
                        i9 = i;
                        i16 = i119;
                        abstractActivityC12267 = abstractActivityC12266;
                    }
                    break;
                case -29349939:
                case 1359096540:
                    C1128.m3851();
                    i = i9;
                    iM2566 = C0630.m2566("᩵ۙ") ^ i13;
                    i15 = ((iM2566 ^ i14) * 10075) ^ (-1254870940);
                    i2 = -1405040850;
                    int i1110 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i1110;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case 56897413:
                case 1331531102:
                    i = i9;
                    boolean z = true;
                    if (C7106.f21815 == 0) {
                        abstractActivityC12267.mo19677(new RunnableC18617(abstractActivityC12267, z));
                    }
                    iM2566 = C0630.m2566("᩵ۙ") ^ i13;
                    i15 = ((iM2566 ^ i14) * 10075) ^ (-1254870940);
                    i2 = -1405040850;
                    int i1111 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i1111;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case 141368703:
                case 1936886214:
                    i = i9;
                    s = sArr[c];
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i13 - C2105.m6981("۫ܰ")) * 123;
                        i15 = ((iM2566 ^ i14) * 26593) ^ (-509248707);
                        i2 = 18011086;
                    } else {
                        iM2566 = C0630.m2566("۬֡") ^ i13;
                        i15 = ((iM2566 ^ i14) * (-10151)) ^ 874591072;
                        i2 = 287971651;
                    }
                    int i1112 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i1112;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case 193820414:
                case 901251973:
                    C5695.m16023();
                    break;
                case 366505023:
                case 373658653:
                    i9 = 19255;
                    int iM2569 = C0630.m2566("ܰۙ") ^ i14;
                    i16 = iM2569 ^ 2125106866;
                    i15 = ((iM2569 ^ i13) * (-28611)) ^ (-1024194783);
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                case 479489909:
                case 1448699516:
                    i = i9;
                    i11 = 3;
                    if (C1294.f4556 < 0) {
                        iM2567 = (C0630.m2566("ۙ᩷") ^ i14) * 41;
                        i3 = ((iM2567 ^ i13) * 12465) ^ 1192435997;
                        i4 = 1165199974;
                        int i1113 = i;
                        i16 = iM2567 ^ i4;
                        i15 = i3;
                        i9 = i1113;
                    } else {
                        iM2566 = (i13 - C2105.m6981("۫ܰ")) * 123;
                        i15 = ((iM2566 ^ i14) * 26593) ^ (-509248707);
                        i2 = 18011086;
                        int i1114 = iM2566 ^ i2;
                        i9 = i;
                        i16 = i1114;
                        abstractActivityC12267 = abstractActivityC12266;
                    }
                    break;
                case 1417886689:
                case 2139081618:
                    i = i9;
                    int i20 = i7 + i8;
                    if (i6 - (i20 + i20) > 0) {
                        iM2566 = (C0630.m2566("᩶ܶ") ^ i14) * (-29);
                        i15 = ((iM2566 ^ i13) * (-20875)) ^ (-897599490);
                        i2 = -1392006342;
                    } else {
                        iM2566 = (C2105.m6981("֫ۘ") + i13) * 109;
                        i15 = ((iM2566 ^ i14) * (-10637)) ^ 786592124;
                        i2 = -2059273293;
                    }
                    int i1115 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i1115;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
                default:
                    i = i9;
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C4263.m12819() >= 0) {
                        iM2566 = C0630.m2566("᩶ܿ") ^ i14;
                        i15 = ((iM2566 ^ i13) * (-1221)) ^ 594542782;
                        i2 = -658625731;
                    } else {
                        iM2566 = (C2105.m6981("᩷ܺ") ^ i14) * 69;
                        i15 = ((iM2566 ^ i13) * 24457) ^ (-2093080616);
                        i2 = 399742247;
                    }
                    int i1116 = iM2566 ^ i2;
                    i9 = i;
                    i16 = i1116;
                    abstractActivityC12267 = abstractActivityC12266;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo29795() {
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
    public String mo19686() {
        int iM6981;
        int i;
        int i2;
        int iM2566 = 0;
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
        int i10 = C1047.f3863;
        int i11 = ServiceConnectionC3453.f10921;
        int iM2567 = C0630.m2566("ܽܺ") ^ i11;
        int i12 = ((iM2567 ^ i10) * (-18197)) ^ 374024919;
        int i13 = iM2567 ^ (-11676758);
        String strM11919 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * 12395) >> 31));
            switch (i14) {
                case -2125556784:
                case 1757775400:
                    i14 = i14;
                    C1047.m3599();
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i11 - C0630.m2566("ۛܽ")) * (-73);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                    } else {
                        iM2566 = iM2566;
                        iM6981 = (C2105.m6981("۠ۨ") ^ i10) * 101;
                        i = ((iM6981 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -2102383350:
                case -1280722612:
                    iM2566 = iM2566;
                    i14 = i14;
                    int i15 = s + s2;
                    if ((i15 * i15) - i5 < 0) {
                        iM6981 = C0630.m2566("᩻֨") ^ i11;
                        i = ((iM6981 ^ i10) * (-15139)) ^ (-1964577599);
                        i2 = -812988481;
                    } else {
                        iM6981 = (C0630.m2566("ܶܶ") ^ i10) * 69;
                        i = ((iM6981 ^ i11) * 3379) ^ (-1887268212);
                        i2 = -580370208;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -1815181300:
                case -1721849470:
                    ViewOnClickListenerC1958.m6429();
                    C7106.m19120();
                    return null;
                case -1676603987:
                case 2083469965:
                    iM2566 = iM2566;
                    i14 = i14;
                    i8 = 3;
                    if (C1047.f3863 >= 0) {
                        iM2566 = iM2566;
                        iM6981 = (i11 - C0630.m2566("ۛܽ")) * (-73);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                    } else {
                        iM6981 = C2105.m6981("ܿܳ") ^ i10;
                        i = ((iM6981 ^ i11) * (-30839)) ^ 495843898;
                        i2 = 1801146046;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -1640613754:
                case -50520979:
                    i6 = 54418;
                    iM6981 = C0630.m2566("᩹᩸") ^ i11;
                    i = ((iM6981 ^ i10) * (-18835)) ^ (-224278306);
                    i2 = -1258686988;
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -1635199673:
                case 595462210:
                    i6 = 38568;
                    iM6981 = C0630.m2566("᩹᩸") ^ i11;
                    i = ((iM6981 ^ i10) * (-18835)) ^ (-224278306);
                    i2 = -1258686988;
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -1604336165:
                case 269301090:
                    iM2566 = iM2566;
                    i14 = i14;
                    i5 = i4 + 1;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("۠ۨ") ^ i10) * 101;
                        i = ((iM6981 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM6981 = C0630.m2566("ᩴ۫") ^ i10;
                        i = ((iM6981 ^ i11) * (-26665)) ^ 2008938539;
                        i2 = -349897733;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -1448975630:
                case -1266240781:
                    C7811.m20844();
                    if (C3019.f9544 < 0) {
                        iM2566 = iM2566;
                        i14 = i14;
                        iM6981 = (C2105.m6981("۠ۨ") ^ i10) * 101;
                        i = ((iM6981 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                        i9 = i14;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        iM2566 = iM2566;
                    } else {
                        int iM2568 = C0630.m2566("᩸ۘ") ^ i11;
                        i13 = iM2568 ^ (-2077145032);
                        i12 = ((iM2568 ^ i10) * 1745) ^ 423487025;
                        i9 = i14;
                    }
                    break;
                case -1307578976:
                case 953938044:
                    return C0050.m946(this, iM2566 ^ i3);
                case -1029069046:
                case 1240308015:
                    iM2566 = iM2566;
                    i14 = i14;
                    c = 340;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("۠ۨ") ^ i10) * 101;
                        i = ((iM6981 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM6981 = C2105.m6981("᩺ܰ") ^ i10;
                        i = ((iM6981 ^ i11) * (-1031)) ^ 2056876298;
                        i2 = -1769607013;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -476093550:
                case 396990476:
                    C2958.m9034();
                    if (C3537.f11231 < 0) {
                        iM2566 = iM2566;
                        i14 = i14;
                        iM6981 = C2105.m6981("ۛۛ") ^ i11;
                        i = ((iM6981 ^ i10) * (-1569)) ^ 211967846;
                        i2 = 1483840739;
                        i9 = i14;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        iM2566 = iM2566;
                    } else {
                        iM6981 = (i11 - C0630.m2566("ۛܽ")) * (-73);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                        i9 = i14;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        iM2566 = iM2566;
                    }
                    break;
                case -433869821:
                case 1761444236:
                    i14 = i14;
                    strM11919 = C3911.m11919(sArr2, i7, i8, i6);
                    if (C1047.f3863 >= 0) {
                        iM2566 = iM2566;
                        iM6981 = (i10 - C0630.m2566("ۢۡ")) * (-127);
                        i = ((iM6981 ^ i11) * 24355) ^ (-1120252208);
                        i2 = -968160218;
                    } else {
                        iM6981 = (C2105.m6981("᩹᩻") ^ i11) * 97;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * 2291) ^ 88315818;
                        i2 = -472725927;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case -150098052:
                case 1477449959:
                    iM2566 = iM2566;
                    i14 = i14;
                    i4 = s * 2;
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i10 - C0630.m2566("ۢۡ")) * (-127);
                        i = ((iM6981 ^ i11) * 24355) ^ (-1120252208);
                        i2 = -968160218;
                    } else {
                        iM6981 = (i10 - C0630.m2566("۬۟")) * (-39);
                        i = ((iM6981 ^ i11) * (-13169)) ^ 2050868691;
                        i2 = 1658182884;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case 331006279:
                case 1246535100:
                    iM2566 = iM2566;
                    i14 = i14;
                    sArr = f36523;
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("۠ۨ") ^ i10) * 101;
                        i = ((iM6981 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM6981 = C2105.m6981("᩷ܳ") ^ i11;
                        i = ((iM6981 ^ i10) * (-10093)) ^ (-1891095686);
                        i2 = -1525065789;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case 469683716:
                case 1083248505:
                    iM2566 = iM2566;
                    i14 = i14;
                    s = sArr[c];
                    if (C4263.m12819() >= 0) {
                        iM2566 = iM2566;
                        iM6981 = (i11 - C0630.m2566("ۛܽ")) * (-73);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                    } else {
                        iM6981 = C2105.m6981("۬֨") ^ i11;
                        i = ((iM6981 ^ i10) * (-23253)) ^ (-783878996);
                        i2 = -1259916885;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case 728260427:
                case 1656072224:
                    i14 = i14;
                    iM2566 = C0630.m2566(strM11919);
                    if (C2520.f8000 >= 0) {
                        i3 = 2128242756;
                        iM6981 = (i11 - C0630.m2566("ۛܽ")) * (-73);
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i10) * (-10027)) ^ 1818179753;
                        i2 = -187235104;
                        i9 = i14;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        iM2566 = iM2566;
                    } else {
                        int iM2569 = C0630.m2566("۟ᩴ") ^ i10;
                        i9 = i14;
                        i13 = iM2569 ^ (-1247602080);
                        i12 = ((iM2569 ^ i11) * 249) ^ 1860275664;
                        i3 = 2128242756;
                    }
                    break;
                case 855720474:
                case 1514616088:
                    C2272.m7503();
                    iM6981 = (i11 - C0630.m2566("ۛܽ")) * (-73);
                    iM2566 = iM2566;
                    i = ((iM6981 ^ i10) * (-10027)) ^ 1818179753;
                    i2 = -187235104;
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                case 1477267355:
                case 1931026123:
                    iM2566 = iM2566;
                    i14 = i14;
                    sArr2 = f36523;
                    i7 = 341;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("ۛۛ") ^ i11;
                        i = ((iM6981 ^ i10) * (-1569)) ^ 211967846;
                        i2 = 1483840739;
                    } else {
                        iM6981 = C2105.m6981("᩺᩷") ^ i10;
                        i = ((iM6981 ^ i11) * (-27783)) ^ (-837143772);
                        i2 = 292177913;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
                    break;
                default:
                    iM2566 = iM2566;
                    i14 = i14;
                    s2 = 1;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("۠ۨ") ^ i10) * 101;
                        i = ((iM6981 ^ i11) * (-8919)) ^ 1011816575;
                        i2 = -1964312995;
                    } else {
                        iM6981 = (C2105.m6981("ۤܳ") + i11) * (-87);
                        i = ((iM6981 ^ i10) * 30959) ^ 1606316132;
                        i2 = -992397861;
                    }
                    i9 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    iM2566 = iM2566;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29791(ArrayList arrayList) {
        int iM6981;
        int i;
        int[] iArr = null;
        int i2 = -1189755882;
        int i3 = C4075.f12947;
        int i4 = C4616.f14690;
        int iM6982 = C2105.m6981("֡ۛ") ^ i4;
        int i5 = ((iM6982 ^ i3) * 11047) ^ (-166729707);
        int i6 = iM6982 ^ 1405876364;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            C15420 c15420 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-5079)) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -2133383842:
                    case -170228477:
                        C4075.m12263();
                        break;
                    case -1877374065:
                    case 289671315:
                        this.f36537 = arrayList2;
                        this.f36528 = arrayList2;
                        if (mo19683()) {
                            iM6981 = (i3 - C2105.m6981("ۜܽ")) * (-43);
                            i5 = ((iM6981 ^ i4) * 10027) ^ (-164062864);
                            i = -416769988;
                        } else {
                            iM6981 = C0630.m2566("ۜۛ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 30503) ^ (-135206951);
                            i = 906134916;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -1523350970:
                    case 1200828670:
                        m29797();
                        m29792();
                        break;
                    case -1510554859:
                    case -1208127796:
                        this.f36531 = iArr;
                        if (C1711.f5919) {
                            iM6981 = (C0630.m2566("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM6981 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ۖ֨")) * 13;
                            i5 = ((iM6981 ^ i3) * 28449) ^ (-1042643722);
                            i = -1326681176;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -1131399997:
                    case -975889835:
                        if (this.f36530 == null) {
                            iM6981 = C0630.m2566("۟ۨ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-31725)) ^ (-1597061903);
                            i = -1972468708;
                        } else {
                            iM6981 = C2105.m6981("ܽۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-19623)) ^ 1412115156;
                            i = 1905062987;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -1033271206:
                    case 1950113975:
                        this.f36530 = arrayList3;
                        if (!RunnableC1108.f4040) {
                        }
                        c15420 = new C15420(1);
                        if (C1916.m6308() < 0) {
                            iM6981 = (C2105.m6981("᩵᩸") ^ i3) * 37;
                            i5 = ((iM6981 ^ i4) * 12303) ^ (-1775685621);
                            i = -862280876;
                            i6 = iM6981 ^ i;
                        }
                        break;
                        break;
                        break;
                    case -954799450:
                    case 233639808:
                        C3683.m11222();
                        if (C22628.f73083 > 0) {
                            iM6981 = (C0630.m2566("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM6981 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                        } else {
                            iM6981 = C0630.m2566("᩸ܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-7957)) ^ 1554248649;
                            i = 1795540801;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -930775501:
                    case 368781889:
                        if (!C0382.f1805) {
                        }
                        iM6981 = (C2105.m6981("ᩳۨ") + i3) * 11;
                        i5 = ((iM6981 ^ i4) * 27625) ^ (-849593784);
                        i = -618135357;
                        i6 = iM6981 ^ i;
                        break;
                        break;
                    case -762881217:
                    case 37047853:
                        ArrayList arrayList4 = this.f36528;
                        if (C3746.f11829 > 0) {
                            arrayList3 = new ArrayList(arrayList4);
                            if (C4159.f13567) {
                                iM6981 = C2105.m6981("ۘᩳ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 3761) ^ (-1667646082);
                                i = 1384599788;
                                i6 = iM6981 ^ i;
                                break;
                            }
                        }
                        int iM2566 = (i4 - C0630.m2566("ܿᩴ")) * 109;
                        i5 = ((iM2566 ^ i3) * (-16843)) ^ (-1111172178);
                        i6 = iM2566 ^ 1255081781;
                        arrayList2 = null;
                        arrayList3 = null;
                        break;
                    case -692977167:
                    case 2019520403:
                        Collections.sort(arrayList3, C8200.comparing(c15420));
                        iM6981 = C2105.m6981("ܽۚ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-19623)) ^ 1412115156;
                        i = 1905062987;
                        i6 = iM6981 ^ i;
                        break;
                    case -607859443:
                    case 1970311958:
                        if (!C2126.m7040()) {
                            iM6981 = (C2105.m6981("ۙ᩶") + i4) * 13;
                            i5 = ((iM6981 ^ i3) * 2425) ^ 2095908747;
                            i = -496155368;
                            i6 = iM6981 ^ i;
                        }
                        break;
                    case -497080202:
                    case 476078304:
                        C2126.m7040();
                        if (C3911.f12484 < 0) {
                            iM6981 = C0630.m2566("᩸ܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-7957)) ^ 1554248649;
                            i = 1795540801;
                        } else {
                            iM6981 = (C0630.m2566("ܶᩴ") ^ i3) * (-103);
                            i5 = ((iM6981 ^ i4) * 7973) ^ 368286760;
                            i = 786994998;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case 119884716:
                    case 1254559907:
                        if (!C0483.m2121()) {
                            int iM2567 = (i4 - C0630.m2566("ܿᩴ")) * 109;
                            i5 = ((iM2567 ^ i3) * (-16843)) ^ (-1111172178);
                            i6 = iM2567 ^ 1255081781;
                            arrayList2 = null;
                            arrayList3 = null;
                        } else {
                            arrayList2 = new ArrayList(arrayList);
                            if (C3245.m9925() != 0) {
                                iM6981 = (C0630.m2566("ܶᩴ") ^ i3) * (-103);
                                i5 = ((iM6981 ^ i4) * 7973) ^ 368286760;
                                i = 786994998;
                            } else {
                                iM6981 = (C0630.m2566("᩵ۨ") ^ i3) * (-83);
                                i5 = ((iM6981 ^ i4) * (-11137)) ^ 1644291981;
                                i = -634509124;
                            }
                            i6 = iM6981 ^ i;
                        }
                        break;
                    case 280592443:
                    case 718773075:
                        iArr = new int[C3432.m10481(arrayList)];
                        if (C3245.f10203 <= 0) {
                            iM6981 = (C0630.m2566("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM6981 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                        } else {
                            iM6981 = C0630.m2566("֫᩵") ^ i3;
                            i5 = ((iM6981 ^ i4) * 26507) ^ 129129983;
                            i = 766318823;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case 498661202:
                    case 1304240708:
                        C3746.m11369();
                        if (C3663.m11168() < 0) {
                            int iM2568 = (i4 - C0630.m2566("ܿᩴ")) * 109;
                            i5 = ((iM2568 ^ i3) * (-16843)) ^ (-1111172178);
                            i6 = iM2568 ^ 1255081781;
                            arrayList2 = null;
                            arrayList3 = null;
                        } else {
                            iM6981 = (C0630.m2566("᩸ܿ") ^ i3) * 55;
                            i5 = ((iM6981 ^ i4) * 25637) ^ (-1811100304);
                            i = -1087665750;
                            i6 = iM6981 ^ i;
                        }
                        break;
                    case 928901370:
                    case 1171693463:
                        C3019.m9255();
                        C0483.m2121();
                        iM6981 = (C0630.m2566("᩸ܿ") ^ i3) * 55;
                        i5 = ((iM6981 ^ i4) * 25637) ^ (-1811100304);
                        i = -1087665750;
                        i6 = iM6981 ^ i;
                        break;
                    case 1463274934:
                    case 1556493503:
                        this.f36537 = this.f36530;
                        iM6981 = C0630.m2566("ۜۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 30503) ^ (-135206951);
                        i = 906134916;
                        i6 = iM6981 ^ i;
                        break;
                    default:
                        if (this.f36526) {
                            iM6981 = (C2105.m6981("ܶܿ") ^ i4) * (-41);
                            i5 = ((iM6981 ^ i3) * 13183) ^ (-1516779585);
                            i = 1888760396;
                        } else {
                            iM6981 = C0630.m2566("ۜۛ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 30503) ^ (-135206951);
                            i = 906134916;
                        }
                        i6 = iM6981 ^ i;
                        break;
                }
                return;
            }
            int iM2569 = (i3 - C0630.m2566("ۜ᩺")) * 109;
            i5 = ((iM2569 ^ i4) * (-28663)) ^ 1795604244;
            i6 = iM2569 ^ (-331357884);
        }
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final void m29797() {
        this.f36539.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m29780(boolean z) {
        C5242 c5242 = null;
        boolean z2 = false;
        int i = 0;
        Iterator itM9029 = null;
        int i2 = -75859335;
        int i3 = C3019.f9544;
        int i4 = C1128.f4106;
        int iM2566 = C0630.m2566("ۧᩴ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-29043)) ^ 1409446133;
        int i6 = -300709710;
        while (true) {
            int i7 = iM2566 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-29803)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2140366186:
                    case 960120957:
                        if (C3432.m10477() > 0) {
                            iM2566 = (C2105.m6981("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM2566 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        } else {
                            iM2566 = C2105.m6981("۫᩹") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                        }
                        break;
                    case -2135878778:
                    case 1101290770:
                        if (C3537.f11231 < 0) {
                            iM2566 = (C0630.m2566("ۜۚ") ^ i3) * (-95);
                            i5 = ((iM2566 ^ i4) * 31391) ^ (-829811951);
                            i6 = 175676010;
                        } else {
                            iM2566 = (C2105.m6981("ܳ۠") + i4) * 127;
                            i5 = ((iM2566 ^ i3) * 31713) ^ (-705814969);
                            i6 = 252380924;
                        }
                        break;
                    case -2020284238:
                    case 1170563118:
                        break;
                    case -1930483251:
                    case -1345613302:
                        i = -1;
                        if (!C1005.f3721) {
                            iM2566 = (C2105.m6981("ܳ۠") + i4) * 127;
                            i5 = ((iM2566 ^ i3) * 31713) ^ (-705814969);
                            i6 = 252380924;
                            break;
                        }
                        iM2566 = C2105.m6981("ۚ᩹") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25047)) ^ (-1262284839);
                        i6 = 2004146767;
                        break;
                    case -1833904775:
                    case 1555157132:
                        this.f36539.notifyDataSetChanged();
                        if (C2105.f7037 == 0) {
                            iM2566 = C0630.m2566("ۢ۠") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-31465)) ^ (-2066364595);
                            i6 = -1487975940;
                        } else {
                            iM2566 = (C2105.m6981("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM2566 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        }
                        break;
                    case -1777633536:
                    case -760832170:
                        if (RunnableC0588.f2309 < 0) {
                            iM2566 = (C2105.m6981("ۤ᩺") ^ i4) * 15;
                            i5 = ((iM2566 ^ i3) * (-26605)) ^ 1500532690;
                            i6 = 387102194;
                        } else {
                            iM2566 = C2105.m6981("۫᩹") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                        }
                        break;
                    case -1609745941:
                    case 922417751:
                        if (C0050.m940() > 0) {
                            iM2566 = (C0630.m2566("ۜܰ") ^ i3) * (-91);
                            i5 = ((iM2566 ^ i4) * 29635) ^ (-1524366561);
                            i6 = -1096972983;
                        } else {
                            iM2566 = (C2105.m6981("ܿ᩵") + i3) * (-65);
                            i5 = ((iM2566 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                        }
                        break;
                    case -1462293890:
                    case 2146448216:
                        this.f36535 = i;
                        this.f36529 = z2 ? 1 : 0;
                        iM2566 = C0630.m2566("֨ۨ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3515)) ^ 2074091716;
                        i6 = 1296159142;
                    case -1266284659:
                    case 1687034626:
                        C3683.m11222();
                        break;
                    case -1130271154:
                    case 1836816764:
                        ((C8739) C2272.m7513(itM9029)).m22596(z2);
                        iM2566 = C2105.m6981("ܿۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-19585)) ^ (-2003103280);
                        i6 = -772058476;
                        break;
                    case -992841850:
                    case 2099744316:
                        if (!C4159.f13567) {
                            iM2566 = C2105.m6981("۫᩹") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                            break;
                        }
                        iM2566 = C0630.m2566("᩵᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19645) ^ (-362351376);
                        i6 = 2074718294;
                        break;
                    case -950716148:
                    case 1238255996:
                        itM9029 = C2958.m9029(this.f36537);
                        iM2566 = C2105.m6981("ܿۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-19585)) ^ (-2003103280);
                        i6 = -772058476;
                        break;
                        break;
                    case -932234992:
                    case -18933897:
                        if (this.f36540 != z) {
                            iM2566 = (i4 - C2105.m6981("ۜܶ")) * (-119);
                            i5 = ((iM2566 ^ i3) * (-22503)) ^ (-1753933248);
                            i6 = 1664948153;
                        } else {
                            iM2566 = C0630.m2566("֨ۨ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-3515)) ^ 2074091716;
                            i6 = 1296159142;
                        }
                        break;
                    case -645942746:
                    case 1023606344:
                        if (!C1773.m5910(itM9029)) {
                            iM2566 = C2105.m6981("۠᩻") ^ i3;
                            i5 = ((iM2566 ^ i4) * 985) ^ 1658169822;
                            i6 = 2131866386;
                        } else {
                            iM2566 = C0630.m2566("ܳ᩹") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-4127)) ^ 958813420;
                            i6 = -2133137110;
                        }
                        break;
                    case -614807772:
                    case 1621541135:
                        if (C22628.f73083 > 0) {
                            iM2566 = C2105.m6981("᩸ܰ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 5911) ^ 330478627;
                            i6 = 319749845;
                        } else {
                            iM2566 = (C2105.m6981("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM2566 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        }
                        break;
                    case -426279145:
                    case 837924147:
                        if (C1294.f4556 < 0) {
                            iM2566 = C2105.m6981("ۡ᩸") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-30977)) ^ (-699668789);
                            i6 = -866744327;
                        } else {
                            iM2566 = C2105.m6981("۫᩹") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-26819)) ^ (-387879311);
                            i6 = 1812655140;
                        }
                        break;
                    case -347042727:
                    case 1748730855:
                        this.f36540 = z;
                        c5242 = this.f36541;
                        if (C2520.f8000 < 0) {
                            iM2566 = C2105.m6981("᩵ܶ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-16205)) ^ (-1729820029);
                            i6 = 1556991381;
                        } else {
                            iM2566 = (C2105.m6981("ܿ᩵") + i3) * (-65);
                            i5 = ((iM2566 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                        }
                        break;
                    case -311661678:
                    case 1693593140:
                        this.f36538.m45428();
                        iM2566 = (C0630.m2566("ܰۤ") ^ i3) * 15;
                        i5 = ((iM2566 ^ i4) * 20805) ^ 494278351;
                        i6 = -119136651;
                        break;
                    case 109989186:
                    case 345196937:
                        if (!z) {
                            iM2566 = C2105.m6981("ۘ۟") ^ i4;
                            i5 = ((iM2566 ^ i3) * 28335) ^ (-1881721428);
                            i6 = 1452399609;
                        } else {
                            iM2566 = C0630.m2566("֨ۨ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-3515)) ^ 2074091716;
                            i6 = 1296159142;
                        }
                        break;
                    case 418625542:
                    case 462013093:
                        if (C1420.f5096 > 0) {
                            iM2566 = C2105.m6981("֨᩶") ^ i3;
                            i5 = ((iM2566 ^ i4) * 4033) ^ (-958233583);
                            i6 = 327046985;
                        } else {
                            iM2566 = (C2105.m6981("ܿ᩵") + i3) * (-65);
                            i5 = ((iM2566 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                        }
                        break;
                    case 1075148420:
                    case 1414197564:
                        c5242.mo1669(C1420.m4911(z));
                        if (!z) {
                            iM2566 = C0630.m2566("ۗ᩸") ^ i3;
                            i5 = ((iM2566 ^ i4) * 2947) ^ 1423324173;
                            i6 = -1991030459;
                        } else {
                            iM2566 = C2105.m6981("ۡܳ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 14847) ^ (-1274174248);
                            i6 = -1411119366;
                        }
                        break;
                    case 1178948472:
                    case 2100790806:
                        this.f36538.m45419();
                        iM2566 = (C0630.m2566("ܰۤ") ^ i3) * 15;
                        i5 = ((iM2566 ^ i4) * 20805) ^ 494278351;
                        i6 = -119136651;
                        break;
                        break;
                    case 1221065311:
                    case 1793565465:
                        C0964.m3413();
                        C11340.m28031();
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-26819)) ^ (-387879311);
                        i6 = 1812655140;
                        break;
                    case 1741783164:
                    case 2060897234:
                        C1047.m3599();
                        if (C4075.f12947 < 0) {
                            iM2566 = (C2105.m6981("ܿ᩵") + i3) * (-65);
                            i5 = ((iM2566 ^ i4) * 10261) ^ 558411228;
                            i6 = -511982811;
                            break;
                        }
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-26819)) ^ (-387879311);
                        i6 = 1812655140;
                        break;
                    case 1758999536:
                    case 1860149972:
                        if (C0630.f2410 > 0) {
                            iM2566 = (C0630.m2566("ܽۜ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM2566 ^ i4) * 777) ^ 886810043;
                            i6 = -1525176147;
                        } else {
                            iM2566 = (C2105.m6981("ۡۡ") ^ i4) * (-83);
                            i5 = ((iM2566 ^ i3) * (-3637)) ^ 1825876422;
                            i6 = 1178236954;
                        }
                        break;
                    default:
                        if (this.f36529 <= 0) {
                            z2 = false;
                            iM2566 = C2105.m6981("۠᩻") ^ i3;
                            i5 = ((iM2566 ^ i4) * 985) ^ 1658169822;
                            i6 = 2131866386;
                        }
                        int iM6981 = C2105.m6981("ۡۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-22363)) ^ 1380575029;
                        i7 = iM6981 ^ (-1536222059);
                        z2 = false;
                        break;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public void m29788() {
        String str;
        String str2;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int iM2566;
        int i7;
        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC22555;
        String str3;
        int i8;
        int iM2567;
        int i9;
        int i10;
        AbstractActivityC12266 abstractActivityC12266 = this;
        C19258 c19258 = null;
        int i11 = 0;
        boolean z = false;
        DialogInterfaceC0206 dialogInterfaceC0206M2438 = null;
        String strMo29795 = null;
        ViewGroup viewGroup = null;
        int iIndexOfChild = 0;
        int i12 = 0;
        int iM6983 = 0;
        String strM2436 = null;
        int iM2568 = 0;
        String strM9250 = null;
        short s = 0;
        short s2 = 0;
        int i13 = 586814579;
        int i14 = C0714.f2697;
        int i15 = C0483.f2088;
        int iM2569 = (i15 - C0630.m2566("ܳۤ")) * (-79);
        int i16 = ((iM2569 ^ i14) * (-15319)) ^ (-1276222585);
        int i17 = iM2569 ^ (-840863315);
        Iterator itM12354 = null;
        short[] sArr = null;
        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC22556 = null;
        int i18 = 0;
        DialogInterfaceOnClickListenerC20173 dialogInterfaceOnClickListenerC20173 = null;
        int i19 = 0;
        ArrayList arrayList = null;
        int i20 = 0;
        int iM25610 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-20055)) >> 31));
            switch (i13) {
                case -2131036088:
                case -79159200:
                    str = strMo29795;
                    C2520.m8033(c19258, iM2568 ^ 2102298975, null);
                    iM6982 = (C2105.m6981("ۙ۠") + i15) * 97;
                    i5 = ((iM6982 ^ i14) * 21731) ^ (-440084496);
                    i6 = 2025733575;
                    str2 = str;
                    i17 = iM6982 ^ i6;
                    i16 = i5;
                    strMo29795 = str2;
                    break;
                case -2063228968:
                case -200762067:
                    str = strMo29795;
                    dialogInterfaceC0206M2438 = RunnableC0588.m2438(c19258);
                    if (z) {
                        iM6982 = (C0630.m2566("᩸ۤ") + i14) * 75;
                        i5 = ((iM6982 ^ i15) * 15197) ^ 30323274;
                        i6 = -304872549;
                    } else {
                        iM6982 = (C2105.m6981("ۨۤ") + i15) * (-107);
                        i5 = ((iM6982 ^ i14) * 11459) ^ (-906081222);
                        i6 = 162962141;
                    }
                    str2 = str;
                    i17 = iM6982 ^ i6;
                    i16 = i5;
                    strMo29795 = str2;
                    break;
                case -2023689448:
                case -1905362504:
                    if (C2958.f9394 < 0) {
                        str = strMo29795;
                        i19 = i19;
                        i2 = i20;
                        iM6981 = C2105.m6981("ۖܿ") ^ i15;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        i3 = ((iM6981 ^ i14) * 11477) ^ (-456181855);
                        i4 = 298979272;
                        int i21 = iM6981 ^ i4;
                        i20 = i2;
                        str2 = str;
                        i17 = i21;
                        i16 = i3;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        i19 = i19;
                        strMo29795 = str2;
                    } else {
                        iM2567 = (C0630.m2566("ۧۧ") ^ i15) * 99;
                        i9 = ((iM2567 ^ i14) * (-18935)) ^ 1481597197;
                        i10 = 1314838682;
                        i17 = iM2567 ^ i10;
                        i16 = i9;
                    }
                    break;
                case -1882356577:
                case -809906583:
                    str = strMo29795;
                    C1294.m4380(c19258, 2099769225 ^ iM6983, dialogInterfaceOnClickListenerC22556);
                    if (ServiceConnectionC3453.m10564() > 0) {
                        dialogInterfaceOnClickListenerC20173 = new DialogInterfaceOnClickListenerC20173(i11, abstractActivityC12266);
                        strM2436 = RunnableC0588.m2436(f36523, 92, 3, i18);
                        if (C1773.f6144 > 0) {
                            iM6982 = C0630.m2566("۬ܿ") ^ i14;
                            i5 = ((iM6982 ^ i15) * (-23829)) ^ (-1099377334);
                            i6 = 944514734;
                            str2 = str;
                            i17 = iM6982 ^ i6;
                            i16 = i5;
                            strMo29795 = str2;
                            break;
                        }
                    }
                    strMo29795 = str;
                    int iM25611 = C0630.m2566("ܺܶ") ^ i14;
                    i17 = iM25611 ^ (-2147071595);
                    i16 = ((iM25611 ^ i15) * 15067) ^ 2010946710;
                    dialogInterfaceOnClickListenerC22556 = null;
                    dialogInterfaceOnClickListenerC20173 = null;
                    break;
                case -1748080348:
                case -1209308980:
                    C2272.m7505(this);
                    break;
                case -1576169080:
                case 2131086172:
                    RunnableC1108.m3781(this);
                    break;
                case -1564739218:
                case -1301793354:
                    break;
                case -1418352456:
                case 159302391:
                    str = strMo29795;
                    iM2568 = C0630.m2566(C1128.m3841(f36523, 95, 3, i18));
                    iM6982 = (i15 - C0630.m2566("ۛۧ")) * (-27);
                    i5 = ((iM6982 ^ i14) * (-22737)) ^ 238044346;
                    i6 = -1944767885;
                    str2 = str;
                    i17 = iM6982 ^ i6;
                    i16 = i5;
                    strMo29795 = str2;
                    break;
                case -1241259680:
                case -379869947:
                    str = strMo29795;
                    C2520.m8029(c19258, C2105.m6981(strM2436) ^ 2129461435, dialogInterfaceOnClickListenerC20173);
                    z = abstractActivityC12266 instanceof ActivityC19507;
                    if (z) {
                        iM6982 = C2105.m6981("᩺۬") ^ i14;
                        i5 = ((iM6982 ^ i15) * (-29853)) ^ 778224075;
                        i6 = -2026708136;
                    } else {
                        iM6982 = (C2105.m6981("ۙ۠") + i15) * 97;
                        i5 = ((iM6982 ^ i14) * 21731) ^ (-440084496);
                        i6 = 2025733575;
                    }
                    str2 = str;
                    i17 = iM6982 ^ i6;
                    i16 = i5;
                    strMo29795 = str2;
                    break;
                case -1208731047:
                case -304054129:
                    str = strMo29795;
                    i19 = i19;
                    i2 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    if (((C8739) C2272.m7513(itM12354)).m22599()) {
                        iM6981 = (C0630.m2566("ۡۙ") + i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM6981 ^ i15) * 17521) ^ (-251820074);
                        i4 = 1597013255;
                    } else {
                        iM6981 = C2105.m6981("֡ܺ") ^ i15;
                        i3 = ((iM6981 ^ i14) * (-8895)) ^ 1759524138;
                        i4 = 1013138195;
                    }
                    int i22 = iM6981 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i22;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = str2;
                    break;
                case -1177681755:
                case 1991967599:
                    C3746.m11369();
                    C1916.m6308();
                    break;
                case -1168371613:
                case 308540622:
                    i18 = 62922;
                    iM2566 = C0630.m2566("᩶᩻") ^ i14;
                    i16 = ((iM2566 ^ i15) * 12443) ^ (-1808411966);
                    i7 = 1865212596;
                    i = iM2566 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = strMo29795;
                    i17 = i;
                    abstractActivityC12266 = this;
                    break;
                case -915177902:
                case 1607142584:
                    strMo29795 = mo29795();
                    Button buttonM20839 = C7811.m20839(dialogInterfaceC0206M2438);
                    viewGroup = (ViewGroup) buttonM20839.getParent();
                    iIndexOfChild = viewGroup.indexOfChild(buttonM20839);
                    if (!C1504.m5179()) {
                        int iM25612 = C0630.m2566("ܺܶ") ^ i14;
                        i17 = iM25612 ^ (-2147071595);
                        i16 = ((iM25612 ^ i15) * 15067) ^ 2010946710;
                        dialogInterfaceOnClickListenerC22556 = null;
                        dialogInterfaceOnClickListenerC20173 = null;
                    } else {
                        iM2567 = C0630.m2566("ܰ۬") ^ i15;
                        i9 = ((iM2567 ^ i14) * (-25099)) ^ 2115499950;
                        i10 = -1464521321;
                        i17 = iM2567 ^ i10;
                        i16 = i9;
                    }
                    break;
                case -823033118:
                case 1131016576:
                    if (!C1005.f3721) {
                        iM2567 = (C0630.m2566("ۧۧ") ^ i15) * 99;
                        i9 = ((iM2567 ^ i14) * (-18935)) ^ 1481597197;
                        i10 = 1314838682;
                        i17 = iM2567 ^ i10;
                        i16 = i9;
                    } else {
                        strMo29795 = strMo29795;
                        i19 = i19;
                        i20 = i20;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        iM2566 = (C2105.m6981("֡᩸") + i14) * 67;
                        i16 = ((iM2566 ^ i15) * 30421) ^ 1165481377;
                        i7 = 1213427027;
                        i = iM2566 ^ i7;
                        i20 = i20;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        i19 = i19;
                        strMo29795 = strMo29795;
                        i17 = i;
                        abstractActivityC12266 = this;
                    }
                    break;
                case -775916586:
                case 1951009476:
                    str = strMo29795;
                    C1916.m6295(c19258, iM25610 ^ i12);
                    i11 = 1;
                    if (C2105.f7037 == 0) {
                        dialogInterfaceOnClickListenerC22556 = new DialogInterfaceOnClickListenerC22555(i11, abstractActivityC12266);
                        iM6983 = C2105.m6981(C11340.m28025(f36523, 89, 3, i18));
                        if (C4263.f13799 > 0) {
                            iM6982 = C0630.m2566("֫ۗ") ^ i14;
                            i5 = ((iM6982 ^ i15) * (-24175)) ^ (-305531836);
                            i6 = 1106666232;
                            str2 = str;
                            i17 = iM6982 ^ i6;
                            i16 = i5;
                            strMo29795 = str2;
                            break;
                        }
                    }
                    strMo29795 = str;
                    int iM25613 = C0630.m2566("ܺܶ") ^ i14;
                    i17 = iM25613 ^ (-2147071595);
                    i16 = ((iM25613 ^ i15) * 15067) ^ 2010946710;
                    dialogInterfaceOnClickListenerC22556 = null;
                    dialogInterfaceOnClickListenerC20173 = null;
                    break;
                case -723703374:
                case 33261242:
                    dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC22556;
                    str3 = strMo29795;
                    int i23 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC12266);
                    sArr = f36523;
                    i8 = 83;
                    i20 = 3;
                    if (C0237.m1481() >= 0) {
                        int iM25614 = (i14 - C0630.m2566("ۖ֨")) * (-121);
                        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC22557 = dialogInterfaceOnClickListenerC22555;
                        i19 = i8;
                        i16 = ((iM25614 ^ i15) * (-30993)) ^ 1105133170;
                        strMo29795 = str3;
                        i17 = iM25614 ^ 862783477;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22557;
                    } else {
                        int iM6984 = (C2105.m6981("۠ܰ") + i15) * (-49);
                        i16 = ((iM6984 ^ i14) * (-18535)) ^ (-332341909);
                        strMo29795 = str3;
                        i17 = iM6984 ^ (-1154652115);
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22555;
                        i19 = 83;
                    }
                    break;
                case -564768933:
                case -247515600:
                    str = strMo29795;
                    i19 = i19;
                    i2 = i20;
                    C0382.m1849(c19258, C0630.m2566(AbstractC2021.m6573(sArr, i19, i2, i18)) ^ 2125200366);
                    if (C7811.m20844() != 0) {
                        iM6981 = C2105.m6981("ۖܿ") ^ i15;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        i3 = ((iM6981 ^ i14) * 11477) ^ (-456181855);
                        i4 = 298979272;
                    } else {
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        iM6981 = (C2105.m6981("֡֨") + i14) * 69;
                        i3 = ((iM6981 ^ i15) * 8437) ^ (-943308735);
                        i4 = -2078398606;
                    }
                    int i24 = iM6981 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i24;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = str2;
                    break;
                case -543375578:
                case 822060580:
                    str = strMo29795;
                    iM25610 = C0630.m2566(C0050.m948(f36523, 86, 3, i18));
                    i12 = 2119803576;
                    if (!C0382.m1848()) {
                        iM6982 = (C2105.m6981("۬ۙ") ^ i15) * 93;
                        i5 = ((iM6982 ^ i14) * (-2763)) ^ 149781173;
                        i6 = -567683808;
                        str2 = str;
                        i17 = iM6982 ^ i6;
                        i16 = i5;
                        strMo29795 = str2;
                    }
                    i19 = i19;
                    i2 = i20;
                    iM6981 = C2105.m6981("ۖܿ") ^ i15;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i3 = ((iM6981 ^ i14) * 11477) ^ (-456181855);
                    i4 = 298979272;
                    int i25 = iM6981 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i25;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = str2;
                    break;
                case -528261490:
                case 1522464202:
                    i18 = 28737;
                    iM2566 = C0630.m2566("᩶᩻") ^ i14;
                    i16 = ((iM2566 ^ i15) * 12443) ^ (-1808411966);
                    i7 = 1865212596;
                    i = iM2566 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = strMo29795;
                    i17 = i;
                    abstractActivityC12266 = this;
                    break;
                case -513755540:
                case 1810542135:
                    strMo29795 = strMo29795;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    ArrayList arrayList2 = abstractActivityC12266.f36537;
                    if (arrayList2 != null) {
                        int iM25615 = C0630.m2566("᩹᩹") ^ i14;
                        int i26 = ((iM25615 ^ i15) * (-23621)) ^ 832762067;
                        i = iM25615 ^ (-1510926815);
                        arrayList = arrayList2;
                        i16 = i26;
                        i20 = i20;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        i19 = i19;
                        strMo29795 = strMo29795;
                        i17 = i;
                        abstractActivityC12266 = this;
                    } else {
                        int iM25616 = C0630.m2566("᩹ۤ") ^ i15;
                        arrayList = arrayList2;
                        i20 = i20;
                        i16 = ((iM25616 ^ i14) * 14455) ^ 484192171;
                        abstractActivityC12266 = this;
                        str2 = strMo29795;
                        i17 = iM25616 ^ 1223558316;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                        i19 = i19;
                        strMo29795 = str2;
                    }
                    break;
                case -373422593:
                case 949436639:
                    strMo29795 = strMo29795;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    s = f36523[82];
                    s2 = 13594;
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("֡᩸") + i14) * 67;
                        i16 = ((iM2566 ^ i15) * 30421) ^ 1165481377;
                        i7 = 1213427027;
                    } else {
                        iM2566 = (C0630.m2566("ۗۨ") ^ i14) * (-61);
                        i16 = ((iM2566 ^ i15) * 17) ^ (-1904267292);
                        i7 = -269325288;
                    }
                    i = iM2566 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = strMo29795;
                    i17 = i;
                    abstractActivityC12266 = this;
                    break;
                case -286925940:
                case 2006359592:
                    str = strMo29795;
                    strM9250 = C3019.m9250(f36523, 98, 3, i18);
                    if (!C3663.f11553) {
                        iM6982 = C2105.m6981("ܿۧ") ^ i14;
                        i5 = ((iM6982 ^ i15) * (-617)) ^ (-1589740207);
                        i6 = -683086051;
                        str2 = str;
                        i17 = iM6982 ^ i6;
                        i16 = i5;
                        strMo29795 = str2;
                    } else {
                        strMo29795 = str;
                        int iM25617 = C0630.m2566("ܺܶ") ^ i14;
                        i17 = iM25617 ^ (-2147071595);
                        i16 = ((iM25617 ^ i15) * 15067) ^ 2010946710;
                        dialogInterfaceOnClickListenerC22556 = null;
                        dialogInterfaceOnClickListenerC20173 = null;
                    }
                    break;
                case -116560932:
                case 282274319:
                    strMo29795 = strMo29795;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    if ((s * s2) - ((s * s) + 46199209) > 0) {
                        iM2566 = C2105.m6981("۬֨") ^ i15;
                        i16 = ((iM2566 ^ i14) * 509) ^ 1290106679;
                        i7 = 1702861404;
                    } else {
                        iM2566 = (i15 - C0630.m2566("ܰۤ")) * (-103);
                        i16 = ((iM2566 ^ i14) * (-31973)) ^ 211450666;
                        i7 = -643330375;
                    }
                    i = iM2566 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = strMo29795;
                    i17 = i;
                    abstractActivityC12266 = this;
                    break;
                case 81816915:
                case 1392831018:
                    C0422.m1963();
                    strMo29795 = strMo29795;
                    i19 = i19;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    iM2566 = (C2105.m6981("֡᩸") + i14) * 67;
                    i16 = ((iM2566 ^ i15) * 30421) ^ 1165481377;
                    i7 = 1213427027;
                    i = iM2566 ^ i7;
                    i20 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = strMo29795;
                    i17 = i;
                    abstractActivityC12266 = this;
                    break;
                case 239711412:
                case 1059664436:
                    AbstractC2021.m6574();
                    if (C21923.f70183 == 0) {
                        str3 = strMo29795;
                        i8 = i19;
                        dialogInterfaceOnClickListenerC22555 = dialogInterfaceOnClickListenerC22556;
                        int iM25618 = (i14 - C0630.m2566("ۖ֨")) * (-121);
                        DialogInterfaceOnClickListenerC22555 dialogInterfaceOnClickListenerC22558 = dialogInterfaceOnClickListenerC22555;
                        i19 = i8;
                        i16 = ((iM25618 ^ i15) * (-30993)) ^ 1105133170;
                        strMo29795 = str3;
                        i17 = iM25618 ^ 862783477;
                        dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22558;
                    } else {
                        iM2567 = (C0630.m2566("ۧۧ") ^ i15) * 99;
                        i9 = ((iM2567 ^ i14) * (-18935)) ^ 1481597197;
                        i10 = 1314838682;
                        i17 = iM2567 ^ i10;
                        i16 = i9;
                    }
                    break;
                case 733823772:
                case 1039559557:
                    str = strMo29795;
                    i19 = i19;
                    i2 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    itM12354 = C4117.m12354(arrayList);
                    iM6981 = C2105.m6981("֡ܺ") ^ i15;
                    i3 = ((iM6981 ^ i14) * (-8895)) ^ 1759524138;
                    i4 = 1013138195;
                    int i27 = iM6981 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i27;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = str2;
                    break;
                case 959388835:
                case 1493635720:
                    CheckBox checkBox = (CheckBox) C3537.m10739(abstractActivityC12266, C0630.m2566(strM9250) ^ 2118991330);
                    viewGroup.removeViewAt(iIndexOfChild);
                    viewGroup.addView(checkBox, iIndexOfChild);
                    C10025.m25194(abstractActivityC12266, checkBox, strMo29795);
                    str = strMo29795;
                    iM6982 = (C2105.m6981("ۨۤ") + i15) * (-107);
                    i5 = ((iM6982 ^ i14) * 11459) ^ (-906081222);
                    i6 = 162962141;
                    str2 = str;
                    i17 = iM6982 ^ i6;
                    i16 = i5;
                    strMo29795 = str2;
                    break;
                default:
                    str = strMo29795;
                    i19 = i19;
                    i2 = i20;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    if (C0483.m2123(itM12354)) {
                        iM6981 = (C2105.m6981("᩻᩸") + i15) * (-35);
                        i3 = ((iM6981 ^ i14) * 7699) ^ 1671956753;
                        i4 = -1873288337;
                    } else {
                        iM6981 = C2105.m6981("ۧۙ") ^ i14;
                        i3 = ((iM6981 ^ i15) * 26409) ^ 1705844344;
                        i4 = -246805101;
                    }
                    int i28 = iM6981 ^ i4;
                    i20 = i2;
                    str2 = str;
                    i17 = i28;
                    i16 = i3;
                    dialogInterfaceOnClickListenerC22556 = dialogInterfaceOnClickListenerC22556;
                    i19 = i19;
                    strMo29795 = str2;
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
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        AbstractActivityC12266 abstractActivityC12266 = this;
        int i4 = C4616.f14690;
        int i5 = C2520.f8000;
        int iM6982 = C2105.m6981("ܰۨ") ^ i4;
        int i6 = ((iM6982 ^ i5) * 4763) ^ 1335410694;
        String strM9250 = null;
        short[] sArr = null;
        int i7 = iM6982 ^ 1959663332;
        MenuInflater menuInflater = null;
        int iM6983 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 766016607;
        int i14 = 0;
        String strM6988 = null;
        short[] sArr2 = null;
        int i15 = 0;
        MenuItem menuItemM6301 = null;
        C5242 c5242 = null;
        C19323 c19323 = null;
        int iM2567 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * (-15683)) >> 31));
            switch (i13) {
                case -1690519696:
                case -310437595:
                    if (C3432.m10477() > 0) {
                        iM2566 = C2105.m6981("ۨۨ") ^ i4;
                        i = ((iM2566 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    } else {
                        iM2566 = C0630.m2566("ۧۛ") ^ i5;
                        i = ((iM2566 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1488758547:
                case 1160393417:
                    int i16 = i11 + i12;
                    if (i10 - (i16 + i16) > 0) {
                        iM2566 = (i4 - C2105.m6981("ۨᩳ")) * 47;
                        i = ((iM2566 ^ i5) * 1715) ^ (-659955074);
                        i2 = -1538288920;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۤ") ^ i4) * (-81);
                        i = ((iM2566 ^ i5) * (-7605)) ^ 1201705980;
                        i2 = -205382003;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1205982893:
                case 1642094896:
                    i8 = 19065;
                    iM2566 = (C0630.m2566("᩸ۗ") + i5) * (-93);
                    i = ((iM2566 ^ i4) * (-9555)) ^ 416547675;
                    i2 = -1544798309;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1099358559:
                case 1287463231:
                    i8 = 10376;
                    iM2566 = (C0630.m2566("᩸ۗ") + i5) * (-93);
                    i = ((iM2566 ^ i4) * (-9555)) ^ 416547675;
                    i2 = -1544798309;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1053045133:
                case 1059279827:
                    menuInflater.inflate(C2105.m6981(strM6988) ^ 2128500269, menu);
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("᩹᩺") ^ i5;
                        i = ((iM2566 ^ i4) * 18469) ^ (-934168926);
                        i2 = -1950569751;
                    } else {
                        iM2566 = C0630.m2566("ۧܿ") ^ i4;
                        i = ((iM2566 ^ i5) * 1323) ^ (-1921419665);
                        i2 = 265801890;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -929717558:
                case 1258332833:
                    return true;
                case -926389599:
                case 1137712565:
                    if (C1294.m4372() > 0) {
                        iM2566 = C2105.m6981("᩹᩺") ^ i5;
                        i = ((iM2566 ^ i4) * 18469) ^ (-934168926);
                        i2 = -1950569751;
                    } else {
                        iM2566 = C2105.m6981("ۨۨ") ^ i4;
                        i = ((iM2566 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -842192885:
                case -617874873:
                    iM6983 = C2105.m6981(C7811.m20837(sArr, i9, 3, i8));
                    i15 = 2119359754;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ۨۨ") ^ i4;
                        i = ((iM2566 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    } else {
                        iM2566 = (C2105.m6981("᩹ܳ") ^ i4) * (-13);
                        i = ((iM2566 ^ i5) * 13617) ^ 501647526;
                        i2 = 924111338;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -657883765:
                case -100304088:
                    ViewOnClickListenerC1958.m6429();
                    C0964.m3413();
                    iM2566 = C2105.m6981("᩹᩺") ^ i5;
                    i = ((iM2566 ^ i4) * 18469) ^ (-934168926);
                    i2 = -1950569751;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -656677973:
                case -223524631:
                    C0422.m1953(menuItemM6301, false);
                    iM2566 = C2105.m6981("۬ۢ") ^ i5;
                    i = ((iM2566 ^ i4) * 16601) ^ 830034681;
                    i2 = 1127331816;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -558287941:
                case 1457320246:
                    MenuItem menuItemM6302 = C1916.m6301(menu, iM2567);
                    C3019.m9257(menuItemM6302);
                    c19323 = new C19323(menuItemM6302);
                    c5242 = abstractActivityC12266.f36541;
                    if (!C2126.f7087) {
                        iM2566 = C2105.m6981("֫᩸") ^ i4;
                        i = ((iM2566 ^ i5) * (-25725)) ^ 1823499434;
                        i2 = 1658453494;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM6981 ^ i3;
                        abstractActivityC12266 = this;
                    }
                    break;
                case -535127966:
                case 227733180:
                    menuInflater = getMenuInflater();
                    strM6988 = C2105.m6988(f36523, 179, 3, i8);
                    if (C1047.f3863 < 0) {
                        iM2566 = C2105.m6981("۠᩶") ^ i5;
                        i = ((iM2566 ^ i4) * (-2223)) ^ 1497639426;
                        i2 = 1251994033;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM6981 ^ i3;
                        abstractActivityC12266 = this;
                    }
                    break;
                case -445312847:
                case 626723003:
                    C0964.m3413();
                    if (C1128.f4106 > 0) {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM6981 ^ i3;
                        abstractActivityC12266 = this;
                    } else {
                        iM2566 = C0630.m2566("ۧۛ") ^ i5;
                        i = ((iM2566 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -158371272:
                case 1065913412:
                    menuItemM6301 = C1916.m6301(menu, iM6983 ^ i15);
                    if (mo19683()) {
                        iM2566 = C0630.m2566("᩻ۨ") ^ i4;
                        i = ((iM2566 ^ i5) * (-7393)) ^ (-35895988);
                        i2 = 1552491433;
                    } else {
                        iM2566 = C0630.m2566("۟ۡ") ^ i5;
                        i = ((iM2566 ^ i4) * 29575) ^ (-1083707272);
                        i2 = 2030656351;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -104385756:
                case 1846637336:
                    short s2 = sArr2[c];
                    int i17 = s2 + 11286;
                    if (C2958.f9394 >= 0) {
                        s = s2;
                        i14 = i17;
                        iM6981 = C2105.m6981("ܶ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                        i7 = iM6981 ^ i3;
                    } else {
                        int iM2568 = C0630.m2566("ۨۧ") ^ i5;
                        int i18 = ((iM2568 ^ i4) * (-19613)) ^ 2109091890;
                        i7 = iM2568 ^ 1003485743;
                        s = s2;
                        i14 = i17;
                        i6 = i18;
                    }
                    abstractActivityC12266 = this;
                    break;
                case 1781148:
                case 907625495:
                    C3432.m10477();
                    C4159.m12565();
                    return false;
                case 211598910:
                case 1383411100:
                    sArr2 = f36523;
                    c = 178;
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("֡۠") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-28145)) ^ 464461529;
                        i3 = 1219106951;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-31627)) ^ (-558054927);
                        i3 = -1115188304;
                    }
                    i7 = iM6981 ^ i3;
                    abstractActivityC12266 = this;
                    break;
                case 390345937:
                case 694997850:
                    strM9250 = C3019.m9250(f36523, 182, 3, i8);
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("ۧۛ") ^ i5;
                        i = ((iM2566 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                    } else {
                        iM2566 = (C0630.m2566("᩷ۛ") ^ i5) * q.h;
                        i = ((iM2566 ^ i4) * (-29049)) ^ 101753555;
                        i2 = 375633325;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 660740989:
                case 1545290206:
                    iM2567 = 2125707506 ^ C0630.m2566(strM9250);
                    if (C0630.m2564()) {
                        iM2566 = (i4 - C2105.m6981("ۚ۟")) * 41;
                        i = ((iM2566 ^ i5) * 14059) ^ 1631373319;
                        i2 = 380143112;
                    } else {
                        iM2566 = C0630.m2566("ۙۧ") ^ i4;
                        i = ((iM2566 ^ i5) * (-16533)) ^ (-1049952205);
                        i2 = 1885861080;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 770340890:
                case 1147332891:
                    C2272.m7508(c5242, abstractActivityC12266, c19323);
                    sArr = f36523;
                    i9 = 185;
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("ۨۨ") ^ i4;
                        i = ((iM2566 ^ i5) * (-22659)) ^ 1483994599;
                        i2 = -591496984;
                    } else {
                        iM2566 = C0630.m2566("ۡۧ") ^ i5;
                        i = ((iM2566 ^ i4) * (-30125)) ^ 1862695418;
                        i2 = 1351609909;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1118563119:
                case 2050082468:
                    C4159.m12566(menuItemM6301, abstractActivityC12266.f36526);
                    iM2566 = C2105.m6981("۬ۢ") ^ i5;
                    i = ((iM2566 ^ i4) * 16601) ^ 830034681;
                    i2 = 1127331816;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                default:
                    i10 = i14 * i14;
                    i11 = s * s;
                    i12 = 127373796;
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("ۧۛ") ^ i5;
                        i = ((iM2566 ^ i4) * 14645) ^ 1619355732;
                        i2 = 1131183649;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩺") ^ i5) * (-39);
                        i = ((iM2566 ^ i4) * 25555) ^ (-1971836896);
                        i2 = -52966555;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m29788();
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
    
        if (l.ServiceConnectionC3453.f10921 >= 0) goto L13;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m29764(AbstractActivityC12266 abstractActivityC12266, boolean z) {
        int iM6981;
        int i;
        int i2;
        int i3;
        String strM6385 = null;
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
        int i12 = C4075.f12947;
        int i13 = C3683.f11629;
        int iM2566 = (i13 - C0630.m2566("ᩴ۫")) * 11;
        int i14 = ((iM2566 ^ i12) * 9665) ^ 1870133755;
        int i15 = iM2566 ^ 701588022;
        Iterator itM9029 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i12) * 20659) >> 31));
            switch (i16) {
                case -1831416586:
                case 1080932343:
                    i8 = 7693;
                    iM6981 = (C2105.m6981("᩵ۖ") + i12) * 13;
                    i = ((iM6981 ^ i13) * (-20431)) ^ (-1473263381);
                    i2 = -806626335;
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1791433887:
                case 24831239:
                    i16 = i16;
                    int i17 = i6 + i7;
                    if ((i17 + i17) - i5 < 0) {
                        iM6981 = (C2105.m6981("۟ᩴ") ^ i13) * (-57);
                        i = ((iM6981 ^ i12) * 26297) ^ (-1347471844);
                        i2 = -1887599886;
                    } else {
                        iM6981 = (i12 - C2105.m6981("ۖܽ")) * (-83);
                        i = ((iM6981 ^ i13) * 15761) ^ (-2081079439);
                        i2 = -1968311446;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1618923195:
                case 631482658:
                    itM9029 = C2958.m9029(abstractActivityC12266.f36528);
                    int iM6982 = (C2105.m6981("۠᩷") ^ i13) * (-93);
                    i14 = ((iM6982 ^ i12) * (-3861)) ^ 1597785701;
                    i3 = i16;
                    i15 = iM6982 ^ 14416337;
                    i11 = i3;
                    break;
                case -1543486916:
                case 740286747:
                    i16 = i16;
                    sArr = f36523;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ܳ۫") ^ i13;
                        i = ((iM6981 ^ i12) * 26683) ^ (-1436668247);
                        i2 = 1218601480;
                    } else {
                        iM6981 = C2105.m6981("ۨܳ") ^ i13;
                        i = ((iM6981 ^ i12) * 5217) ^ (-1079642632);
                        i2 = -684306849;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1533762552:
                case -549536662:
                    C7106.m19120();
                    break;
                case -1470058844:
                case -1424240235:
                    i16 = i16;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ܳ۫") ^ i13;
                        i = ((iM6981 ^ i12) * 26683) ^ (-1436668247);
                        i2 = 1218601480;
                    } else {
                        iM6981 = (C2105.m6981("᩵۟") + i12) * 11;
                        i = ((iM6981 ^ i13) * (-8511)) ^ (-1580197444);
                        i2 = -267211603;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1312749977:
                case 589446372:
                    i16 = i16;
                    sArr2 = f36523;
                    i9 = 12;
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("֨᩻") + i12) * 77;
                        i = ((iM6981 ^ i13) * 13605) ^ (-1177787480);
                        i2 = -593515003;
                    } else {
                        iM6981 = C2105.m6981("۟᩷") ^ i12;
                        i = ((iM6981 ^ i13) * 3141) ^ 1182598205;
                        i2 = 1413268542;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1138407939:
                case 716812043:
                    C1005.m3501();
                    if (C2520.f8000 < 0) {
                        i16 = i16;
                        iM6981 = (i12 - C2105.m6981("ۧۛ")) * (-113);
                        i = ((iM6981 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM6981 = C0630.m2566("֫ۘ") ^ i13;
                        i16 = i16;
                        i = ((iM6981 ^ i12) * 3841) ^ 1678604237;
                        i2 = 705387750;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1025792741:
                case 1323327988:
                    i16 = i16;
                    i7 = 148225;
                    if (C2272.f7362) {
                        iM6981 = (i12 - C2105.m6981("ۧۛ")) * (-113);
                        i = ((iM6981 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM6981 = (i13 - C2105.m6981("֡ۢ")) * 109;
                        i = ((iM6981 ^ i12) * (-425)) ^ (-1564844166);
                        i2 = -2001160963;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -1025132440:
                case 493483906:
                    C0798.m2998();
                    C3432.m10477();
                    break;
                case -979619775:
                case -233121246:
                    i16 = i16;
                    i4 = s + s2;
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("ܶۢ") ^ i12;
                        i = ((iM6981 ^ i13) * 671) ^ 858138347;
                        i2 = -2107190639;
                    } else {
                        iM6981 = (i13 - C2105.m6981("᩵᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM6981 ^ i12) * 18411) ^ 2015421906;
                        i2 = 702476233;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -814609701:
                case 765336897:
                    i16 = i16;
                    s = sArr[c];
                    s2 = 385;
                    if (C3245.m9925() != 0) {
                        iM6981 = (i12 - C2105.m6981("ۧۛ")) * (-113);
                        i = ((iM6981 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM6981 = (C2105.m6981("ۜ᩷") + i13) * (-37);
                        i = ((iM6981 ^ i12) * (-29679)) ^ 467276387;
                        i2 = 1512354810;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -774032020:
                case 1372665635:
                    break;
                case -750440345:
                case 444776487:
                    if (C4616.m13552() != 0) {
                        i16 = i16;
                        iM6981 = (C2105.m6981("֨᩻") + i12) * 77;
                        i = ((iM6981 ^ i13) * 13605) ^ (-1177787480);
                        i2 = -593515003;
                        i3 = i16;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        i11 = i3;
                    }
                    i16 = i16;
                    iM6981 = C2105.m6981("ܳ۫") ^ i13;
                    i = ((iM6981 ^ i12) * 26683) ^ (-1436668247);
                    i2 = 1218601480;
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -597658893:
                case -561239162:
                    i16 = i16;
                    C0964.m3413();
                    C2126.m7040();
                    iM6981 = (i12 - C2105.m6981("ۧۛ")) * (-113);
                    i = ((iM6981 ^ i13) * 19571) ^ 1643953673;
                    i2 = -850956610;
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -597214562:
                case 1615762786:
                    i16 = i16;
                    i10 = 3;
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i13 - C2105.m6981("᩵᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM6981 ^ i12) * 18411) ^ 2015421906;
                        i2 = 702476233;
                    } else {
                        iM6981 = (i13 - C2105.m6981("ܶ۠")) * 63;
                        i = ((iM6981 ^ i12) * (-9703)) ^ 924877815;
                        i2 = 1953677684;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case -326901158:
                case 910054710:
                    ((C8739) C2272.m7513(itM9029)).m22598();
                    int iM6983 = (C2105.m6981("۠᩷") ^ i13) * (-93);
                    i14 = ((iM6983 ^ i12) * (-3861)) ^ 1597785701;
                    i3 = i16;
                    i15 = iM6983 ^ 14416337;
                    i11 = i3;
                    break;
                case 26915400:
                case 708830335:
                    i16 = i16;
                    if (C0483.m2123(itM9029)) {
                        iM6981 = C0630.m2566("ᩳۢ") ^ i13;
                        i = ((iM6981 ^ i12) * 3799) ^ (-1001016166);
                        i2 = -1027953132;
                    } else {
                        iM6981 = (C2105.m6981("֫᩻") + i12) * (-61);
                        i = ((iM6981 ^ i13) * (-13451)) ^ (-1936218186);
                        i2 = 1405200244;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 43721434:
                case 399450806:
                    i8 = 13958;
                    iM6981 = (C2105.m6981("᩵ۖ") + i12) * 13;
                    i = ((iM6981 ^ i13) * (-20431)) ^ (-1473263381);
                    i2 = -806626335;
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 70083736:
                case 1677251656:
                    i16 = i16;
                    C1504.m5167(C0630.m2566(strM6385) ^ 2124940966);
                    if (z) {
                        iM6981 = C0630.m2566("ۧۚ") ^ i12;
                        i = ((iM6981 ^ i13) * 27903) ^ (-106874767);
                        i2 = 625932686;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩵") + i13) * 87;
                        i = ((iM6981 ^ i12) * (-32713)) ^ (-1420158576);
                        i2 = -2047439652;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 171779365:
                case 2083090569:
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C21923.m49329()) {
                        iM6981 = C2105.m6981("ܳ۫") ^ i13;
                        i = ((iM6981 ^ i12) * 26683) ^ (-1436668247);
                        i2 = 1218601480;
                    } else {
                        iM6981 = (C2105.m6981("۬ۜ") ^ i13) * 85;
                        i = ((iM6981 ^ i12) * 10645) ^ (-1854729726);
                        i2 = 2117919189;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 477778879:
                case 598823673:
                    i16 = i16;
                    c = 11;
                    if (C1504.f5354) {
                        iM6981 = (i12 - C2105.m6981("ۧۛ")) * (-113);
                        i = ((iM6981 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩶") ^ i12;
                        i = ((iM6981 ^ i13) * (-18035)) ^ 1522941541;
                        i2 = -1513751529;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                case 741952483:
                case 1497547849:
                    i16 = i16;
                    strM6385 = RunnableC1937.m6385(sArr2, i9, i10, i8);
                    if (C3911.m11924() <= 0) {
                        iM6981 = (i12 - C2105.m6981("ۧۛ")) * (-113);
                        i = ((iM6981 ^ i13) * 19571) ^ 1643953673;
                        i2 = -850956610;
                    } else {
                        iM6981 = (C0630.m2566("ۖܳ") ^ i12) * (-81);
                        i = ((iM6981 ^ i13) * (-27281)) ^ 1849874058;
                        i2 = -1190394909;
                    }
                    i3 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    i11 = i3;
                    break;
                default:
                    C2272.m7505(abstractActivityC12266);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m29794() {
        return this.f36528;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public void mo19684() {
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m29775(AbstractActivityC12266 abstractActivityC12266) {
        int iM6981;
        int i;
        int i2;
        int i3 = C4075.f12947;
        int i4 = C3537.f11231;
        int iM6982 = (C2105.m6981("۬ۘ") + i4) * (-13);
        int i5 = ((iM6982 ^ i3) * (-26315)) ^ 1043920256;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6982 ^ (-1101765626);
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
        String strM10488 = null;
        InterfaceC12344 interfaceC12344 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * (-5807)) >> 31));
            switch (i16) {
                case -2049762664:
                case -1997095550:
                    C3663.m11161(C2105.m6981(strM10488) ^ 2124162362);
                    iM6981 = (C0630.m2566("᩸۬") + i4) * (-73);
                    i = ((iM6981 ^ i3) * 9185) ^ 874555473;
                    i2 = -985872871;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1835361721:
                case -1163037614:
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM6981 = C2105.m6981("֡ܿ") ^ i4;
                        i = ((iM6981 ^ i3) * (-29101)) ^ 60743392;
                        i2 = 602122397;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1757394940:
                case -1505853124:
                    i11 = 61261929;
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM6981 = (C0630.m2566("֡ۧ") + i4) * (-117);
                        i = ((iM6981 ^ i3) * 2807) ^ (-2053639704);
                        i2 = 1682089136;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1566114176:
                case 1619126591:
                    sArr3 = f36523;
                    i15 = 68;
                    i7 = 3;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C0630.m2566("᩹᩸") ^ i3) * (-11);
                        i = ((iM6981 ^ i4) * 3111) ^ (-1031727686);
                        i2 = -1633773279;
                    } else {
                        iM6981 = (C0630.m2566("ۚۤ") + i4) * 81;
                        i = ((iM6981 ^ i3) * (-32485)) ^ 1726515008;
                        i2 = -497455516;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1333209731:
                case -1127956905:
                    i14 = 43;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("֡ܿ") ^ i4;
                        i = ((iM6981 ^ i3) * (-29101)) ^ 60743392;
                        i2 = 602122397;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܳۨ")) * 101;
                        i = ((iM6981 ^ i4) * (-15017)) ^ 1018186930;
                        i2 = -1235656680;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1186326317:
                case 1678774640:
                    i8 = s + 7827;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("ۧ۬") ^ i4) * (-25);
                        i = ((iM6981 ^ i3) * 7431) ^ 1867626629;
                        i2 = -391385233;
                    } else {
                        iM6981 = C0630.m2566("ۙܺ") ^ i4;
                        i = ((iM6981 ^ i3) * 6361) ^ 1723389020;
                        i2 = -1445133637;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1182061648:
                case -240499276:
                    strM10488 = C3432.m10488(sArr3, i15, i7, i12);
                    if (C0964.f3626 != 0) {
                        iM6981 = (C2105.m6981("۠ۙ") + i3) * 61;
                        i = ((iM6981 ^ i4) * (-23751)) ^ (-782815562);
                        i2 = 1880692950;
                    } else {
                        iM6981 = (C2105.m6981("ۗܽ") + i3) * 79;
                        i = ((iM6981 ^ i4) * 25839) ^ 107978850;
                        i2 = -1666674240;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1162267575:
                case 523358086:
                    i12 = 61925;
                    iM6981 = C2105.m6981("᩷᩺") ^ i3;
                    i = ((iM6981 ^ i4) * (-15919)) ^ (-645714768);
                    i2 = -1982995277;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1138932400:
                case -193770293:
                    break;
                case -1000594995:
                case -228978327:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM6981 = (C2105.m6981("۠ۙ") + i3) * 61;
                        i = ((iM6981 ^ i4) * (-23751)) ^ (-782815562);
                        i2 = 1880692950;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -932131034:
                case -405060156:
                    sArr = f36523;
                    if (C22628.m50615() != 0) {
                        iM6981 = C2105.m6981("֡ܿ") ^ i4;
                        i = ((iM6981 ^ i3) * (-29101)) ^ 60743392;
                        i2 = 602122397;
                    } else {
                        iM6981 = (C2105.m6981("ۛۨ") + i4) * 73;
                        i = ((iM6981 ^ i3) * (-4241)) ^ (-1659821658);
                        i2 = -1051091179;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -458530115:
                case 2129103234:
                    i12 = 45873;
                    iM6981 = C2105.m6981("᩷᩺") ^ i3;
                    i = ((iM6981 ^ i4) * (-15919)) ^ (-645714768);
                    i2 = -1982995277;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -393795428:
                case -119251153:
                    RunnableC3474.m10630();
                    break;
                case 26590088:
                case 897238905:
                    interfaceC12344 = ApplicationC20075.f65008;
                    sArr2 = f36523;
                    i13 = 25;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("۠ۙ") + i3) * 61;
                        i = ((iM6981 ^ i4) * (-23751)) ^ (-782815562);
                        i2 = 1880692950;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩹") ^ i4;
                        i = ((iM6981 ^ i3) * 18327) ^ (-98847167);
                        i2 = 1836932290;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 132365908:
                case 1819373958:
                    C1420.m4913();
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩸") ^ i3) * (-11);
                        i = ((iM6981 ^ i4) * 3111) ^ (-1031727686);
                        i2 = -1633773279;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 234795547:
                case 574461346:
                    C2126.m7040();
                    RunnableC3474.m10630();
                    iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                    i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                    i2 = 960306960;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 257592378:
                case 901599109:
                    c = 24;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("᩹᩸") ^ i3) * (-11);
                        i = ((iM6981 ^ i4) * 3111) ^ (-1031727686);
                        i2 = -1633773279;
                    } else {
                        iM6981 = (C2105.m6981("֨ۖ") ^ i3) * q.h;
                        i = ((iM6981 ^ i4) * 14777) ^ (-188041922);
                        i2 = 2019284371;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1113120288:
                case 1753251248:
                    int i17 = i10 + i11;
                    if (i9 - (i17 + i17) > 0) {
                        iM6981 = C0630.m2566("ۜ᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-1655)) ^ 1079578673;
                        i2 = 1795217183;
                    } else {
                        iM6981 = (C0630.m2566("ۨ᩸") ^ i3) * 43;
                        i = ((iM6981 ^ i4) * 8953) ^ (-1722163715);
                        i2 = 63288741;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1702651222:
                case 2110399479:
                    C22870.m50970(interfaceC12344, C3432.m10488(sArr2, i13, i14, i12), true);
                    if (abstractActivityC12266.m29774(true)) {
                        int iM6983 = (C2105.m6981("ᩳۘ") + i3) * 85;
                        i5 = ((iM6983 ^ i4) * 4677) ^ (-955770520);
                        i6 = iM6983 ^ 667851038;
                    } else {
                        iM6981 = (C0630.m2566("᩸۬") + i4) * (-73);
                        i = ((iM6981 ^ i3) * 9185) ^ 874555473;
                        i2 = -985872871;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1830268727:
                case 2019874160:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM6981 = C0630.m2566("۬ܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-26113)) ^ 2080792220;
                        i2 = 778390826;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 1873) ^ (-2010506457);
                        i2 = 960306960;
                    } else {
                        iM6981 = C0630.m2566("ۜۖ") ^ i3;
                        i = ((iM6981 ^ i4) * 25765) ^ 1502009899;
                        i2 = 823251569;
                    }
                    i6 = iM6981 ^ i2;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m29774(boolean z) {
        int iM2566;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int iM2567;
        int i4;
        int i5;
        int i6;
        int iM6981;
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
        int iM6982;
        StringBuilder sb;
        AbstractActivityC12266 abstractActivityC12266 = this;
        int i15 = -1974201065;
        int i16 = C3683.f11629;
        int i17 = C5695.f17556;
        int iM2568 = (C0630.m2566("ܰᩴ") + i17) * (-105);
        int i18 = ((iM2568 ^ i16) * (-31605)) ^ 2090707442;
        int i19 = iM2568 ^ (-1491720680);
        C8739 c8739 = null;
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
        int iM10481 = 0;
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
        String strM948 = null;
        short[] sArr6 = null;
        int i32 = 0;
        int i33 = 0;
        String strM1959 = null;
        int i34 = 0;
        LinkedHashSet linkedHashSetM24426 = null;
        LinkedHashSet linkedHashSetM24427 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * 8977) >> 31));
            switch (i15) {
                case -2094769183:
                case 1398151653:
                    C2167.m7155();
                    if (!C4159.f13567) {
                        iM2566 = C2105.m6981("ۙ᩻") ^ i17;
                        i = ((iM2566 ^ i16) * (-21901)) ^ 108456434;
                        i2 = 204108181;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr7 = sArr5;
                        iM6982 = i28;
                        sArr2 = sArr7;
                        int iM2569 = C0630.m2566("ۛ᩸") ^ i16;
                        int i35 = i10;
                        i18 = ((iM2569 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM2569 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i35;
                        i29 = i29;
                        int i36 = iM6982;
                        sArr5 = sArr2;
                        i28 = i36;
                    }
                    break;
                case -2087717862:
                case -518144256:
                    C1916.m6308();
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = C0630.m2566("ܿ֫") ^ i16;
                        i = ((iM2566 ^ i17) * 10317) ^ (-497929447);
                        i2 = -1335014925;
                        i19 = iM2566 ^ i2;
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
                        iM2567 = C2105.m6981("ۖܰ") ^ i16;
                        i18 = ((iM2567 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM2567 ^ i4;
                        abstractActivityC12266 = this;
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
                    int i37 = iM10481;
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
                        int iM6983 = C2105.m6981("ܶ֨") ^ i17;
                        iM10481 = i37;
                        i18 = ((iM6983 ^ i16) * (-21209)) ^ (-1368329832);
                        i19 = iM6983 ^ 1881024074;
                    } else {
                        iM10481 = i37;
                        iM6981 = C2105.m6981("ᩴ᩹") ^ i16;
                        i7 = ((iM6981 ^ i17) * 4599) ^ (-1050907778);
                        i8 = 1898199549;
                        i19 = iM6981 ^ i8;
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
                        int iM6984 = (C2105.m6981("֨ᩳ") + i16) * (-29);
                        i18 = ((iM6984 ^ i17) * (-27643)) ^ 921872178;
                        i19 = iM6984 ^ 1666599254;
                    } else {
                        int iM6985 = (i16 - C2105.m6981("ᩳ᩵")) * 27;
                        i19 = iM6985 ^ 307776011;
                        i18 = ((iM6985 ^ i17) * 4641) ^ 56256894;
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
                    int iM25610 = C0630.m2566("۫֫") ^ i17;
                    int i44 = ((iM25610 ^ i16) * (-27661)) ^ (-736260874);
                    i19 = iM25610 ^ 1113663999;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i20;
                    z4 = z4;
                    i21 = i21;
                    i33 = i5;
                    i29 = i29;
                    i18 = i44;
                    abstractActivityC12266 = this;
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
                    C3245.m9923(sb, C0050.m946(abstractActivityC12266, C0630.m2566(strM948) ^ 2125832451));
                    if (C4117.f13076 > 0) {
                        sb2 = sb;
                        int iM6986 = C2105.m6981("ۤ᩷") ^ i17;
                        i11 = ((iM6986 ^ i16) * (-11057)) ^ (-700432403);
                        i19 = iM6986 ^ 581839668;
                        i20 = i14;
                        i33 = i10;
                        i18 = i11;
                        z4 = z4;
                        i29 = i29;
                    } else {
                        int iM25611 = (C0630.m2566("ۧᩳ") + i16) * (-41);
                        sb2 = sb;
                        int i45 = ((iM25611 ^ i17) * 2233) ^ 1661811842;
                        i19 = iM25611 ^ (-1019927124);
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
                    abstractActivityC12266.f36531[i25] = i22;
                    i24 = i25 + 1;
                    i26 = i32;
                    i3 = i20;
                    z4 = z4;
                    i9 = i28;
                    sArr = sArr5;
                    sArr4 = sArr4;
                    int iM25612 = C0630.m2566("֨ۧ") ^ i16;
                    boolean z7 = z5;
                    i18 = ((iM25612 ^ i17) * (-8267)) ^ 1516229680;
                    i19 = iM25612 ^ (-824457433);
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
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        z4 = z4;
                        sb = sb2;
                        int iM25613 = (C0630.m2566("ۧᩳ") + i16) * (-41);
                        sb2 = sb;
                        int i47 = ((iM25613 ^ i17) * 2233) ^ 1661811842;
                        i19 = iM25613 ^ (-1019927124);
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
                        iM2567 = C2105.m6981("ۖܰ") ^ i16;
                        i18 = ((iM2567 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM2567 ^ i4;
                        abstractActivityC12266 = this;
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
                    C2520.m8026();
                    C4616.m13552();
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
                    abstractActivityC12266.f36534 = i23;
                    z3 = z5;
                    abstractActivityC12266.f36533 = z3;
                    sArr4 = f36523;
                    i30 = 16;
                    i31 = 3;
                    if (!C1916.f6442) {
                        sArr5 = sArr17;
                        int iM25614 = (C0630.m2566("۫ᩳ") + i16) * 25;
                        i19 = iM25614 ^ (-749188264);
                        z5 = z3;
                        i28 = i13;
                        i18 = ((iM25614 ^ i17) * (-8103)) ^ 1355536715;
                        i20 = i3;
                        z4 = z2;
                        i21 = i12;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        int iM25615 = C0630.m2566("ۗ۬") ^ i17;
                        i19 = iM25615 ^ 1161570100;
                        z5 = z3;
                        i18 = ((iM25615 ^ i16) * 12753) ^ 28951154;
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
                    sArr6 = f36523;
                    i34 = 22;
                    if (C3432.f10845 >= 0) {
                        i33 = i49;
                        sb2 = sb3;
                        i29 = 2;
                        short[] sArr18 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr18;
                        iM2567 = (C0630.m2566("ۧ᩻") + i17) * 69;
                        i18 = ((iM2567 ^ i16) * 9329) ^ (-124640057);
                        i4 = -1318127037;
                        i19 = iM2567 ^ i4;
                        abstractActivityC12266 = this;
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
                        int iM6987 = (C2105.m6981("ܰۧ") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i19 = iM6987 ^ 1947791622;
                        sb2 = sb3;
                        i20 = i3;
                        i33 = i49;
                        i18 = ((iM6987 ^ i17) * (-14223)) ^ (-1519352631);
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
                    c8739 = (C8739) C3019.m9263(abstractActivityC12266.f36537, i22);
                    if (!c8739.m22600()) {
                        z5 = z5;
                        iM6981 = (C2105.m6981("֨᩺") + i16) * 115;
                        i28 = i9;
                        i7 = ((iM6981 ^ i17) * 27365) ^ (-290858960);
                        i8 = 1713641692;
                        i19 = iM6981 ^ i8;
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
                        int iM25616 = C0630.m2566("֨ۧ") ^ i16;
                        boolean z8 = z5;
                        i18 = ((iM25616 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM25616 ^ (-824457433);
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
                    C0964.m3413();
                    if (C7811.f24123 < 0) {
                        i12 = i21;
                        z3 = z5;
                        i33 = i33;
                        i29 = i29;
                        i3 = i20;
                        z2 = z4;
                        i13 = i28;
                        int iM25617 = (C0630.m2566("۫ᩳ") + i16) * 25;
                        i19 = iM25617 ^ (-749188264);
                        z5 = z3;
                        i28 = i13;
                        i18 = ((iM25617 ^ i17) * (-8103)) ^ 1355536715;
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
                        iM6982 = i28;
                        sArr2 = sArr20;
                        int iM25618 = C0630.m2566("ۛ᩸") ^ i16;
                        int i310 = i10;
                        i18 = ((iM25618 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM25618 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i310;
                        i29 = i29;
                        int i311 = iM6982;
                        sArr5 = sArr2;
                        i28 = i311;
                    }
                    break;
                case -1525421046:
                case 1052662971:
                    sArr = sArr5;
                    i5 = 8292;
                    int iM25619 = C0630.m2566("۫֫") ^ i17;
                    int i410 = ((iM25619 ^ i16) * (-27661)) ^ (-736260874);
                    i19 = iM25619 ^ 1113663999;
                    sArr4 = sArr4;
                    i31 = i31;
                    i20 = i20;
                    z4 = z4;
                    i21 = i21;
                    i33 = i5;
                    i29 = i29;
                    i18 = i410;
                    abstractActivityC12266 = this;
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
                    iM6982 = C2105.m6981(C2105.m6988(sArr4, i30, i31, i10)) ^ 2127109830;
                    if (RunnableC1108.f4040) {
                        int iM25620 = (C0630.m2566("ᩴܿ") + i16) * (-71);
                        sArr4 = sArr4;
                        i31 = i31;
                        z4 = z4;
                        i21 = i21;
                        i30 = i30;
                        i19 = iM25620 ^ 1622949802;
                        i18 = ((iM25620 ^ i17) * 25543) ^ (-2130339381);
                        i29 = i29;
                        i20 = i14;
                        i33 = i10;
                    } else {
                        int iM256110 = C0630.m2566("ۛ᩸") ^ i16;
                        int i312 = i10;
                        i18 = ((iM256110 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM256110 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i312;
                        i29 = i29;
                    }
                    int i313 = iM6982;
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
                    iM10481 = C3432.m10481(abstractActivityC12266.f36537);
                    if (C0237.f1507 != 0) {
                        z4 = false;
                        i21 = -1;
                        iM6981 = (C0630.m2566("ۢۧ") ^ i17) * 89;
                        i7 = ((iM6981 ^ i16) * (-32499)) ^ (-1212384025);
                        i8 = 723565479;
                        i19 = iM6981 ^ i8;
                        i18 = i7;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        int iM6988 = C2105.m6981("᩸ᩴ") ^ i16;
                        i18 = ((iM6988 ^ i17) * (-11297)) ^ 1438289189;
                        i19 = iM6988 ^ 888863656;
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
                    abstractActivityC12266.f36527 = strM1959;
                    abstractActivityC12266.f36535 = i21;
                    if (abstractActivityC12266.f36540) {
                        iM2566 = (C0630.m2566("ۤ᩸") ^ i17) * (-39);
                        i = ((iM2566 ^ i16) * 15827) ^ 935841521;
                        i2 = 819978180;
                    } else {
                        iM2566 = (C0630.m2566("᩵ܶ") ^ i17) * (-15);
                        i = ((iM2566 ^ i16) * (-6289)) ^ 886991879;
                        i2 = 2060608844;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -1251250786:
                case 883439984:
                    if (ViewOnClickListenerC1958.m6437(linkedHashSetM24426, linkedHashSetM24427)) {
                        iM2566 = C0630.m2566("ܰ᩷") ^ i16;
                        i = ((iM2566 ^ i17) * (-3309)) ^ 1671614442;
                        i2 = -633414424;
                    } else {
                        iM2566 = (i16 - C0630.m2566("֡֡")) * (-35);
                        i = ((iM2566 ^ i17) * 17461) ^ (-353469968);
                        i2 = 1913552347;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -1243911132:
                case 1581113416:
                    i10 = i33;
                    i29 = i29;
                    i14 = i20;
                    StringBuilder sb4 = sb2;
                    C3245.m9923(sb4, C7106.m19110(sArr6, i34, i29, i10));
                    C0422.m1944(sb4, i23);
                    strM1959 = C0422.m1959(sb4);
                    if (C1773.f6144 > 0) {
                        int iM6989 = C2105.m6981("ۧ֫") ^ i17;
                        z4 = z4;
                        i11 = ((iM6989 ^ i16) * (-21059)) ^ 2051603451;
                        i19 = iM6989 ^ (-163589165);
                        sb2 = sb4;
                        i20 = i14;
                        i33 = i10;
                        i18 = i11;
                        z4 = z4;
                        i29 = i29;
                    } else {
                        sb2 = sb4;
                        short[] sArr22 = sArr5;
                        iM6982 = i28;
                        sArr2 = sArr22;
                        int iM256111 = C0630.m2566("ۛ᩸") ^ i16;
                        int i314 = i10;
                        i18 = ((iM256111 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM256111 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i314;
                        i29 = i29;
                        int i315 = iM6982;
                        sArr5 = sArr2;
                        i28 = i315;
                    }
                    break;
                case -1237260340:
                case -799786927:
                    C1711.m5736();
                    if (C0422.f1886 > 0) {
                        iM2566 = C0630.m2566("᩵۠") ^ i17;
                        i = ((iM2566 ^ i16) * 23011) ^ (-1505582704);
                        i2 = -2011735090;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        z4 = z4;
                        sb = sb2;
                        int iM256112 = (C0630.m2566("ۧᩳ") + i16) * (-41);
                        sb2 = sb;
                        int i411 = ((iM256112 ^ i17) * 2233) ^ 1661811842;
                        i19 = iM256112 ^ (-1019927124);
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
                    if (!abstractActivityC12266.mo19682(str2)) {
                        iM2566 = (i16 - C0630.m2566("֡֡")) * (-35);
                        i = ((iM2566 ^ i17) * 17461) ^ (-353469968);
                        i2 = 1913552347;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    } else {
                        i26 = i20;
                        i24 = i23;
                        i3 = i26;
                        z4 = z4;
                        i9 = i28;
                        sArr = sArr5;
                        sArr4 = sArr4;
                        int iM256113 = C0630.m2566("֨ۧ") ^ i16;
                        boolean z9 = z5;
                        i18 = ((iM256113 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM256113 ^ (-824457433);
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
                    str2 = c8739.f26611;
                    str = c8739.f26609;
                    if (str2 == null) {
                        i26 = i20;
                        i24 = i23;
                        i3 = i26;
                        z4 = z4;
                        i9 = i28;
                        sArr = sArr5;
                        sArr4 = sArr4;
                        int iM256114 = C0630.m2566("֨ۧ") ^ i16;
                        boolean z10 = z5;
                        i18 = ((iM256114 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM256114 ^ (-824457433);
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
                        iM2566 = (i16 - C2105.m6981("᩻ܰ")) * 33;
                        i = ((iM2566 ^ i17) * 26863) ^ 702621629;
                        i2 = -1951176538;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    }
                    break;
                case -1065454407:
                case 1483908710:
                    sArr = sArr5;
                    i6 = -1;
                    i22 = 0;
                    i23 = 0;
                    iM6981 = (i17 - C0630.m2566("۟ۢ")) * 21;
                    i3 = i6;
                    i7 = ((iM6981 ^ i16) * (-16467)) ^ 947987365;
                    i8 = -252029052;
                    i19 = iM6981 ^ i8;
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
                    if (linkedHashSetM24426 != null) {
                        iM2566 = C0630.m2566("ܿۛ") ^ i17;
                        i = ((iM2566 ^ i16) * 23321) ^ (-1789239368);
                        i2 = -643826085;
                    } else {
                        iM2566 = (i16 - C0630.m2566("֡֡")) * (-35);
                        i = ((iM2566 ^ i17) * 17461) ^ (-353469968);
                        i2 = 1913552347;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -718935630:
                case -144114182:
                    if (i20 != i22) {
                        iM2566 = C0630.m2566("ۧ᩷") ^ i17;
                        i = ((iM2566 ^ i16) * 24897) ^ (-1832226428);
                        i2 = -1736022180;
                    } else {
                        i32 = i20;
                        i25 = i23;
                        iM2566 = (i16 - C2105.m6981("۟ۨ")) * 51;
                        i = ((iM2566 ^ i17) * 16433) ^ 1509175186;
                        i2 = 664898815;
                    }
                    i19 = iM2566 ^ i2;
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
                    C4263.m12813(abstractActivityC12266, i13);
                    sb2 = new StringBuilder();
                    sArr5 = f36523;
                    if (RunnableC3474.f10992 <= 0) {
                        i33 = i50;
                        z3 = z5;
                        int iM256115 = (C0630.m2566("۫ᩳ") + i16) * 25;
                        i19 = iM256115 ^ (-749188264);
                        z5 = z3;
                        i28 = i13;
                        i18 = ((iM256115 ^ i17) * (-8103)) ^ 1355536715;
                        i20 = i3;
                        z4 = z2;
                        i21 = i12;
                        i33 = i33;
                        i29 = i29;
                    } else {
                        int iM25621 = C0630.m2566("ᩴ᩵") ^ i17;
                        int i51 = ((iM25621 ^ i16) * 24459) ^ (-232627806);
                        i19 = iM25621 ^ (-84619176);
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
                    abstractActivityC12266.f36531[i23] = i20;
                    i25 = i23 + 1;
                    i32 = -1;
                    iM2566 = (i16 - C2105.m6981("۟ۨ")) * 51;
                    i = ((iM2566 ^ i17) * 16433) ^ 1509175186;
                    i2 = 664898815;
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -602184011:
                case -308082133:
                    linkedHashSetM24426 = C9551.m24426(str);
                    linkedHashSetM24427 = C9551.m24426(str2);
                    if (linkedHashSetM24426 != linkedHashSetM24427) {
                        iM2566 = C2105.m6981("ܰ۫") ^ i17;
                        i = ((iM2566 ^ i16) * (-1531)) ^ 1867725731;
                        i2 = 543635797;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩷") ^ i16;
                        i = ((iM2566 ^ i17) * (-3309)) ^ 1671614442;
                        i2 = -633414424;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -477667038:
                case 1391055060:
                    if (i20 != i21) {
                        iM2566 = (C0630.m2566("ܺ۫") + i16) * 89;
                        i = ((iM2566 ^ i17) * 4293) ^ 694059605;
                        i2 = -693674852;
                    } else {
                        i32 = i20;
                        i25 = i23;
                        iM2566 = (i16 - C2105.m6981("۟ۨ")) * 51;
                        i = ((iM2566 ^ i17) * 16433) ^ 1509175186;
                        i2 = 664898815;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -448643244:
                case 838942101:
                    C4159.m12565();
                    if (!C1504.f5354) {
                        i33 = i33;
                        i29 = i29;
                        i3 = i20;
                        z4 = z4;
                        short[] sArr114 = sArr5;
                        z5 = z5;
                        i28 = i28;
                        sArr = sArr114;
                        iM2567 = (C0630.m2566("ۧ᩻") + i17) * 69;
                        i18 = ((iM2567 ^ i16) * 9329) ^ (-124640057);
                        i4 = -1318127037;
                        i19 = iM2567 ^ i4;
                        abstractActivityC12266 = this;
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
                        iM6982 = i28;
                        sArr2 = sArr23;
                        int iM256116 = C0630.m2566("ۛ᩸") ^ i16;
                        int i316 = i10;
                        i18 = ((iM256116 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM256116 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i316;
                        i29 = i29;
                        int i317 = iM6982;
                        sArr5 = sArr2;
                        i28 = i317;
                    }
                    break;
                case -325019121:
                case 657894828:
                    abstractActivityC12266.m29780(z4);
                    iM2566 = C2105.m6981("ۙܳ") ^ i17;
                    i = ((iM2566 ^ i16) * (-24595)) ^ 1008182743;
                    i2 = -113025460;
                    i19 = iM2566 ^ i2;
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
                        int iM256117 = C0630.m2566("֨ۧ") ^ i16;
                        boolean z11 = z5;
                        i18 = ((iM256117 ^ i17) * (-8267)) ^ 1516229680;
                        i19 = iM256117 ^ (-824457433);
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
                        iM2566 = (i17 - C2105.m6981("᩹᩺")) * 81;
                        i = ((iM2566 ^ i16) * (-28675)) ^ (-2089384827);
                        i2 = 1189680216;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    }
                    break;
                case 241621196:
                case 979153141:
                    i22++;
                    i23 = i24;
                    i6 = i26;
                    sArr = sArr5;
                    iM6981 = (i17 - C0630.m2566("۟ۢ")) * 21;
                    i3 = i6;
                    i7 = ((iM6981 ^ i16) * (-16467)) ^ 947987365;
                    i8 = -252029052;
                    i19 = iM6981 ^ i8;
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
                        iM2566 = (i17 - C0630.m2566("۠ۘ")) * (-85);
                        i = ((iM2566 ^ i16) * 4127) ^ 1045875190;
                        i2 = -522179904;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩷") ^ i16;
                        i = ((iM2566 ^ i17) * (-3309)) ^ 1671614442;
                        i2 = -633414424;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case 343188833:
                case 696296310:
                    m29792();
                    return z4;
                case 355355155:
                case 1403488313:
                    C0382.m1848();
                    C21923.m49329();
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
                    iM2567 = C2105.m6981("ۖܰ") ^ i16;
                    i18 = ((iM2567 ^ i17) * (-25671)) ^ 83381373;
                    i4 = 1836535060;
                    i19 = iM2567 ^ i4;
                    abstractActivityC12266 = this;
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
                    strM948 = C0050.m948(sArr24, 19, 3, i10);
                    if (C0798.m2998() == 0) {
                        int iM25622 = (C0630.m2566("ܰ֨") ^ i16) * (-47);
                        i11 = ((iM25622 ^ i17) * (-6851)) ^ (-405230406);
                        i19 = iM25622 ^ (-1959817206);
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
                        iM6981 = (C0630.m2566("ۢۧ") ^ i17) * 89;
                        i7 = ((iM6981 ^ i16) * (-32499)) ^ (-1212384025);
                        i8 = 723565479;
                        i19 = iM6981 ^ i8;
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
                        iM2567 = C0630.m2566("֨۟") ^ i17;
                        i18 = ((iM2567 ^ i16) * (-14203)) ^ 1605962048;
                        i4 = 1657535881;
                    } else {
                        iM2567 = C0630.m2566("᩺᩷") ^ i16;
                        i18 = ((iM2567 ^ i17) * 30335) ^ 154697288;
                        i4 = 1368875738;
                    }
                    i19 = iM2567 ^ i4;
                    abstractActivityC12266 = this;
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
                    if (C3432.m10477() > 0) {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr26 = sArr5;
                        iM6982 = i28;
                        sArr2 = sArr26;
                        int iM256118 = C0630.m2566("ۛ᩸") ^ i16;
                        int i318 = i10;
                        i18 = ((iM256118 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM256118 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i318;
                        i29 = i29;
                        int i319 = iM6982;
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
                        iM2567 = C2105.m6981("ۖܰ") ^ i16;
                        i18 = ((iM2567 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM2567 ^ i4;
                        abstractActivityC12266 = this;
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
                    abstractActivityC12266.f36539.notifyDataSetChanged();
                    iM2566 = C2105.m6981("ۙܳ") ^ i17;
                    i = ((iM2566 ^ i16) * (-24595)) ^ 1008182743;
                    i2 = -113025460;
                    i19 = iM2566 ^ i2;
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
                    if (C4117.f13076 > 0) {
                        int iM69810 = C2105.m6981("ۚ۫") ^ i16;
                        s = s2;
                        int i54 = ((iM69810 ^ i17) * (-24443)) ^ 475858766;
                        i19 = iM69810 ^ (-275818608);
                        i27 = i53;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i3;
                        z4 = z4;
                        i21 = i21;
                        i33 = i33;
                        i18 = i54;
                        i29 = i29;
                        abstractActivityC12266 = this;
                        short[] sArr1113 = sArr;
                        i28 = i28;
                        z5 = z5;
                        sArr5 = sArr1113;
                    } else {
                        s = s2;
                        i27 = i53;
                        iM2567 = C2105.m6981("ۖܰ") ^ i16;
                        i18 = ((iM2567 ^ i17) * (-25671)) ^ 83381373;
                        i4 = 1836535060;
                        i19 = iM2567 ^ i4;
                        abstractActivityC12266 = this;
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
                    if (C3683.f11629 < 0) {
                        iM2566 = (C2105.m6981("᩻ܶ") ^ i17) * 35;
                        i = ((iM2566 ^ i16) * (-18731)) ^ (-914834566);
                        i2 = 696322550;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    } else {
                        i10 = i33;
                        i29 = i29;
                        i14 = i20;
                        short[] sArr28 = sArr5;
                        iM6982 = i28;
                        sArr2 = sArr28;
                        int iM256119 = C0630.m2566("ۛ᩸") ^ i16;
                        int i3110 = i10;
                        i18 = ((iM256119 ^ i17) * 31087) ^ 1016852820;
                        i19 = iM256119 ^ 617813825;
                        i30 = i30;
                        sArr4 = sArr4;
                        i31 = i31;
                        i20 = i14;
                        z4 = z4;
                        i21 = i21;
                        i33 = i3110;
                        i29 = i29;
                        int i3111 = iM6982;
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
                    sArr3 = f36523;
                    c = 15;
                    if (C3663.f11553) {
                        iM2567 = (C0630.m2566("ۧ᩻") + i17) * 69;
                        i18 = ((iM2567 ^ i16) * 9329) ^ (-124640057);
                        i4 = -1318127037;
                    } else {
                        iM2567 = C2105.m6981("ۚۧ") ^ i17;
                        i18 = ((iM2567 ^ i16) * (-25799)) ^ 2057579783;
                        i4 = -795128799;
                    }
                    i19 = iM2567 ^ i4;
                    abstractActivityC12266 = this;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29790(int i, View view) {
        int iM6981;
        int i2;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        int i3 = 1385450773;
        int i4 = C0630.f2410;
        int i5 = C11340.f33930;
        int iM6982 = C2105.m6981("᩵ۨ") ^ i5;
        int i6 = ((iM6982 ^ i4) * (-22765)) ^ (-1386810756);
        int i7 = -1116578489;
        while (true) {
            int i8 = iM6982 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * 18257) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1972188842:
                    case -1336704017:
                        if (((C8739) C3537.m10755(arrayList, i)).m22602()) {
                            iM6981 = C2105.m6981("ۜܰ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 22719) ^ 2092382195;
                            i2 = 1909636999;
                        } else {
                            iM6981 = C2105.m6981("ۤ֨") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-18775)) ^ 1927869330;
                            i2 = 1055259570;
                        }
                        i8 = iM6981 ^ i2;
                        z = true;
                        break;
                    case -1935934516:
                    case 1683345328:
                        this.f36529 -= z ? 1 : 0;
                        if (C3911.f12484 < 0) {
                            iM6982 = C0630.m2566("֫᩶") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-21259)) ^ 427442417;
                            i7 = 2002269980;
                        } else {
                            iM6982 = C0630.m2566("ۚ֫") ^ i4;
                            i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                        }
                        break;
                    case -1814786964:
                    case -623461588:
                        if (C4075.f12947 < 0) {
                            iM6982 = (i4 - C0630.m2566("᩻᩹")) * q.h;
                            i6 = ((iM6982 ^ i5) * (-6387)) ^ 1488839723;
                            i7 = 1676042634;
                        } else {
                            iM6982 = C2105.m6981("᩻ܺ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                        }
                        break;
                    case -1786911882:
                    case -1019523854:
                        if (RunnableC0588.m2441() < 0) {
                            iM6982 = C0630.m2566("ۨ᩶") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-15241)) ^ (-1844320464);
                            i7 = 1471812519;
                        } else {
                            iM6982 = C0630.m2566("ۚ֫") ^ i4;
                            i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                        }
                        break;
                    case -1552754165:
                    case 1252604287:
                        z2 = false;
                        C2167.m7158(view, 0);
                        if (this.f36529 != 0) {
                            iM6982 = (C2105.m6981("ۛۚ") ^ i5) * 13;
                            i6 = ((iM6982 ^ i4) * 25421) ^ (-1632024753);
                            i7 = 1902293166;
                        } else {
                            iM6982 = C2105.m6981("ۡ᩵") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-11067)) ^ 1711387261;
                            i7 = -1090241146;
                        }
                        break;
                    case -1421949749:
                    case -889910424:
                        C0714.m2805();
                        break;
                    case -1219731031:
                    case 1683946091:
                        break;
                    case -1152605645:
                    case 218762351:
                        if (!C0382.f1805) {
                            iM6982 = C0630.m2566("ۚ֫") ^ i4;
                            i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                            break;
                        }
                        iM6982 = (i5 - C2105.m6981("ۛۜ")) * (-91);
                        i6 = ((iM6982 ^ i4) * (-30959)) ^ (-1169028283);
                        i7 = -296263633;
                        break;
                    case -1099123057:
                    case -441172620:
                        m29780(z2);
                        iM6982 = (C2105.m6981("ۛۚ") ^ i5) * 13;
                        i6 = ((iM6982 ^ i4) * 25421) ^ (-1632024753);
                        i7 = 1902293166;
                        break;
                    case -876593953:
                    case 1767588200:
                        if (C0798.m2998() == 0) {
                            iM6982 = C2105.m6981("᩶ۢ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 27675) ^ (-1243167406);
                            i7 = 1207799932;
                        } else {
                            iM6982 = (C0630.m2566("֫֨") ^ i4) * 61;
                            i6 = ((iM6982 ^ i5) * 801) ^ (-1788511310);
                            i7 = -819007863;
                        }
                        break;
                    case -726877775:
                    case 970037233:
                        C4616.m13552();
                        C2167.m7155();
                        iM6982 = C0630.m2566("ۚ֫") ^ i4;
                        i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                        i7 = -1874510273;
                        break;
                    case -647359829:
                    case -92329334:
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM6982 = C2105.m6981("ܽۢ") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-475)) ^ 1492667320;
                            i7 = 1384591763;
                        } else {
                            iM6982 = (C0630.m2566("֫֨") ^ i4) * 61;
                            i6 = ((iM6982 ^ i5) * 801) ^ (-1788511310);
                            i7 = -819007863;
                        }
                        break;
                    case -463526859:
                    case 2094019002:
                        if (!C1504.f5354) {
                            iM6982 = C0630.m2566("ᩴ֫") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-10097)) ^ (-1188875870);
                            i7 = 222497824;
                        } else {
                            iM6982 = C2105.m6981("֡ۙ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 30293) ^ 1669600778;
                            i7 = -302316139;
                        }
                        break;
                    case -271896509:
                    case 396624448:
                        if (C3537.m10746() > 0) {
                            iM6982 = C2105.m6981("᩶ܽ") ^ i4;
                            i6 = ((iM6982 ^ i5) * 29345) ^ (-4004604);
                            i7 = -1522158157;
                        } else {
                            iM6982 = C0630.m2566("ۚ֫") ^ i4;
                            i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                            i7 = -1874510273;
                        }
                        break;
                    case -630414:
                    case 1028495467:
                        C1916.m6308();
                        if (C1128.m3851() > 0) {
                            iM6982 = C2105.m6981("֡ۙ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 30293) ^ 1669600778;
                            i7 = -302316139;
                            break;
                        }
                        iM6982 = C0630.m2566("ۚ֫") ^ i4;
                        i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                        i7 = -1874510273;
                        break;
                    case 137836944:
                    case 925180979:
                        arrayList = this.f36537;
                        if (C4616.m13552() == 0) {
                            iM6982 = C0630.m2566("ᩳ᩻") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-18929)) ^ (-1071845961);
                            i7 = 1685777083;
                        } else {
                            iM6982 = (C0630.m2566("֫֨") ^ i4) * 61;
                            i6 = ((iM6982 ^ i5) * 801) ^ (-1788511310);
                            i7 = -819007863;
                        }
                        break;
                    case 208519732:
                    case 727878421:
                        C0714.m2806(view, C21943.f70286);
                        if (this.f36529 != 0) {
                            iM6982 = (C2105.m6981("᩹ᩴ") ^ i5) * 19;
                            i6 = ((iM6982 ^ i4) * (-851)) ^ (-1258320620);
                            i7 = -593815031;
                        } else {
                            iM6982 = (i4 - C0630.m2566("᩻ܿ")) * 123;
                            i6 = ((iM6982 ^ i5) * (-23917)) ^ (-71423467);
                            i7 = 1302277902;
                        }
                        break;
                    case 444051431:
                    case 1395365606:
                        C11340.m28031();
                        if (!RunnableC1108.f4040) {
                            iM6982 = C2105.m6981("᩻ܺ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                            break;
                        }
                        iM6982 = C0630.m2566("ۚ֫") ^ i4;
                        i6 = ((iM6982 ^ i5) * 23741) ^ (-946486436);
                        i7 = -1874510273;
                        break;
                    case 622949826:
                    case 832166157:
                        if (RunnableC1937.f6483 < 0) {
                            iM6982 = C0630.m2566("۬ۜ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-1073)) ^ 443252370;
                            i7 = 1096227130;
                        } else {
                            iM6982 = C2105.m6981("᩻ܺ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                        }
                        break;
                    case 1316622652:
                    case 2063952136:
                        if (!C1504.f5354) {
                            iM6982 = C0630.m2566("᩺ۧ") ^ i4;
                            i6 = ((iM6982 ^ i5) * 9139) ^ 1500836314;
                            i7 = 644080977;
                        } else {
                            iM6982 = C2105.m6981("᩻ܺ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-22653)) ^ (-1967144788);
                            i7 = -1014163101;
                        }
                        break;
                    case 1669964012:
                    case 1915453151:
                        this.f36529 += z ? 1 : 0;
                        break;
                    default:
                        m29780(z);
                        iM6982 = (C2105.m6981("᩹ᩴ") ^ i5) * 19;
                        i6 = ((iM6982 ^ i4) * (-851)) ^ (-1258320620);
                        i7 = -593815031;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m29771(AbstractActivityC12266 abstractActivityC12266, int i) {
        return abstractActivityC12266.f36531[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m29761(AbstractActivityC12266 abstractActivityC12266, int i) {
        return abstractActivityC12266.f36531[i];
    }
}
