package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11095 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩶۬ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f82099 = {4261, -27605, -27592, -27615, -27522};

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ int f30732;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC17043 f30733;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ int f30734;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C13929 f30735;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f30736;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ boolean f30737;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f30738;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractViewOnClickListenerC17799 f30739;

    public C11095(AbstractViewOnClickListenerC17799 abstractViewOnClickListenerC17799, int i, C13929 c13929, boolean z, int i2, boolean z2) {
        this.f30739 = abstractViewOnClickListenerC17799;
        this.f30732 = i;
        this.f30735 = c13929;
        this.f30738 = z;
        this.f30734 = i2;
        this.f30737 = z2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f30739.f53156.m41282());
        c24164.mo51878((Runnable) null);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51883();
        this.f30736 = c24164;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String str;
        boolean zM37012;
        XmlResourceParserC12128 xmlResourceParserC12128M38154;
        String str2 = "/";
        AbstractViewOnClickListenerC17799 abstractViewOnClickListenerC17799 = this.f30739;
        C19561 c19561 = new C19561(abstractViewOnClickListenerC17799.f53147);
        int i = this.f30732;
        try {
            if (i == 0) {
                m25536(c19561);
                c19561.close();
                return;
            }
            ((C15294) abstractViewOnClickListenerC17799).f43632 = new C17969("zip", "/");
            C20689 c20689 = new C20689(c19561.m44466());
            C24164 c24164 = this.f30736;
            C12826.requireNonNull(c24164);
            c20689.m46753(new C24793(c24164));
            int i2 = 1;
            C14281 c14281 = i == 1 ? new C14281(c19561) : null;
            Set set = abstractViewOnClickListenerC17799.f53146 != null ? (Set) C7480.stream(abstractViewOnClickListenerC17799.f53146).map(new C4055(1)).collect(C24205.toSet()) : null;
            for (C5738 c5738 : c19561.m44469()) {
                if (this.f30736.m53444()) {
                    break;
                }
                c20689.m46754(i2);
                if (c5738.isDirectory() || c5738.getSize() <= 10 || c5738.getSize() >= 2097152) {
                    str = str2;
                } else {
                    if (set != null) {
                        if (!set.contains(str2 + c5738.getName())) {
                            str = str2;
                        }
                    }
                    try {
                        InputStream inputStreamM44448 = c19561.m44448(c5738);
                        if (i != i2) {
                            int i3 = this.f30734;
                            int i4 = 2;
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        try {
                                            XmlResourceParserC12128 xmlResourceParserC12128M38155 = C16820.m38130(inputStreamM44448).m38154();
                                            while (true) {
                                                int next = xmlResourceParserC12128M38155.next();
                                                if (next != i2) {
                                                    if (next == i4) {
                                                        int attributeCount = xmlResourceParserC12128M38155.getAttributeCount();
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 != attributeCount) {
                                                                int iM28045 = xmlResourceParserC12128M38155.m28045(i5);
                                                                str = str2;
                                                                if (iM28045 >= 16 && iM28045 <= 31) {
                                                                    try {
                                                                        if (i3 == xmlResourceParserC12128M38155.m28042(i5)) {
                                                                            xmlResourceParserC12128M38155.close();
                                                                            zM37012 = true;
                                                                        }
                                                                    } catch (Exception unused) {
                                                                        zM37012 = false;
                                                                    }
                                                                }
                                                                i5++;
                                                                str2 = str;
                                                            }
                                                            str = str2;
                                                        }
                                                    }
                                                    i2 = 1;
                                                    i4 = 2;
                                                    str2 = str2;
                                                } else {
                                                    str = str2;
                                                }
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } else {
                                        str = str2;
                                        throw new RuntimeException();
                                    }
                                    i2 = 1;
                                } else {
                                    str = str2;
                                    xmlResourceParserC12128M38154 = C16820.m38130(inputStreamM44448).m38154();
                                    while (true) {
                                        int next2 = xmlResourceParserC12128M38154.next();
                                        if (next2 != 1) {
                                            if (next2 == 2) {
                                                int attributeCount2 = xmlResourceParserC12128M38154.getAttributeCount();
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 == attributeCount2) {
                                                        continue;
                                                    } else {
                                                        int iM28046 = xmlResourceParserC12128M38154.m28045(i6);
                                                        if (iM28046 < 28 || iM28046 > 31 || i3 != xmlResourceParserC12128M38154.m28042(i6)) {
                                                            i6++;
                                                        } else {
                                                            xmlResourceParserC12128M38154.close();
                                                            zM37012 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                zM37012 = false;
                            } else {
                                str = str2;
                                xmlResourceParserC12128M38154 = C16820.m38130(inputStreamM44448).m38154();
                                while (true) {
                                    int next3 = xmlResourceParserC12128M38154.next();
                                    if (next3 == 1) {
                                        zM37012 = false;
                                    } else if (next3 == 2) {
                                        int attributeCount3 = xmlResourceParserC12128M38154.getAttributeCount();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 == attributeCount3) {
                                                continue;
                                            } else {
                                                int iM28047 = xmlResourceParserC12128M38154.m28045(i7);
                                                if ((iM28047 == 2 || iM28047 == 1) && i3 == xmlResourceParserC12128M38154.m28042(i7)) {
                                                    xmlResourceParserC12128M38154.close();
                                                    zM37012 = true;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            str = str2;
                            zM37012 = C16252.m37012(inputStreamM44448, this.f30735, this.f30738, c14281);
                        }
                        if (zM37012) {
                            try {
                                C14387 c14387 = new C14387(c5738);
                                ((C15294) abstractViewOnClickListenerC17799).f43632.f53664.add(new C13946(c14387, c14387.getParent()));
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (IOException unused4) {
                        str = str2;
                    }
                    i2 = 1;
                }
                str2 = str;
            }
            c19561.close();
        } catch (Throwable th) {
            try {
                c19561.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f30736.m53444()) {
            return;
        }
        C15294 c15294 = (C15294) this.f30739;
        C12574 c12574 = c15294.f43633;
        if (c15294.f43632.f53664.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            C15957.m36232(c15294.f43631, c12574, c15294.f43632);
        }
        c12574.mo15431(c15294.f43632);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f30739.f53156.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f30736.m53442();
        AbstractC17043 abstractC17043 = this.f30733;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (p067l.RunnableC0938.f81886 >= 0) goto L36;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m25536(C19561 c19561) {
        C20689 c20689;
        byte[] bArr;
        byte[] bArr2;
        C20689 c206810;
        int iM55979;
        int i;
        int i2;
        int i3;
        int i4;
        int iM559710;
        int i5;
        C20689 c206811;
        byte[] bArr3;
        C20689 c206812;
        int iM55680;
        int i6;
        int i7;
        C20689 c206813;
        int i8;
        int i9;
        int iM559711;
        int i10;
        int iM55681;
        int iM559712;
        int i11;
        int i12 = 1131643013;
        int i13 = C1071.f81975;
        int i14 = ServiceConnectionC1013.f81940;
        int iM559713 = (C0946.m55979("᩹ܳ") ^ i14) * 33;
        int i15 = ((iM559713 ^ i13) * (-15385)) ^ (-2142764973);
        int i16 = iM559713 ^ (-1630531295);
        C20689 c206814 = null;
        Iterator itM56292 = null;
        ArrayList arrayList = null;
        byte[] bArrM38146 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 0;
        ArrayList arrayList2 = null;
        Iterator itM56593 = null;
        C15294 c15294 = null;
        C14387 c14387 = null;
        C20689 c206815 = null;
        int i18 = 0;
        C14281 c14281 = null;
        String strM38152 = null;
        C6763 c6763 = null;
        C5738 c5738 = null;
        C5738 c5739 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 26237) >> 31));
            switch (i12) {
                case -2141373815:
                case -1418112831:
                    RunnableC1014.m56171(c206815, i18);
                    C16820 c16820M56167 = RunnableC1014.m56167(C1024.m56204(c19561, c5738));
                    c16820M56167.m38143(c14281, this.f30737, this.f30733);
                    strM38152 = c16820M56167.m38152();
                    if (strM38152 == null) {
                        c14281 = c14281;
                        c20689 = c206814;
                        c6763 = c6763;
                        c206810 = c206815;
                        i17 = i17;
                        bArr2 = bArrM38146;
                        int iM55682 = (C0873.m55680("ܺ۫") ^ i14) * 13;
                        bArrM38146 = bArr2;
                        i17 = i17;
                        c206815 = c206810;
                        c6763 = c6763;
                        c206814 = c20689;
                        i16 = iM55682 ^ (-239954095);
                        i15 = ((iM55682 ^ i13) * 10311) ^ (-1352818471);
                        c14281 = c14281;
                    } else {
                        iM559710 = (C0873.m55680("ۚ᩸") ^ i13) * 29;
                        i = ((iM559710 ^ i14) * 2109) ^ 1891768741;
                        i5 = 1179327018;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case -2124282396:
                case 1667654762:
                    c6763 = c6763;
                    c14281 = c14281;
                    c206815 = c206815;
                    i17 = i17;
                    bArr2 = bArrM38146;
                    c206812 = new C20689(c19561.m44466());
                    if (C0955.f81898) {
                        iM559712 = C0946.m55979("۠ܿ") ^ i13;
                        i9 = ((iM559712 ^ i14) * (-18017)) ^ 2049456318;
                        i11 = 226048549;
                    } else {
                        C0854.m55609(c206812, new InterfaceC4595() { // from class: l.᩷᩹᩻
                            @Override // p067l.InterfaceC4595
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8466(int i19) {
                                this.f70930.f30736.m53436(i19 / 2);
                            }
                        });
                        itM56593 = C1964.m56593(C1229.m56411(c19561));
                        iM559712 = (C0873.m55680("ۘ֫") + i14) * 67;
                        i9 = ((iM559712 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                    }
                    i16 = iM559712 ^ i11;
                    c6763 = c6763;
                    bArrM38146 = bArr2;
                    c206814 = c206812;
                    i15 = i9;
                    i17 = i17;
                    c14281 = c14281;
                    c206815 = c206815;
                    break;
                case -2103610860:
                case -1563993554:
                    c14387 = new C14387(c5738);
                    arrayList = c15294.f43632.f53664;
                    if (!C0892.f81851) {
                        c14281 = c14281;
                        c206815 = c206815;
                        c206811 = c206814;
                        i17 = i17;
                        bArr3 = bArrM38146;
                        iM559711 = (i14 - C0946.m55979("᩻ۢ")) * (-29);
                        i9 = ((iM559711 ^ i13) * 29559) ^ (-545837950);
                        i8 = -700236358;
                        int i19 = iM559711 ^ i8;
                        c206814 = c206811;
                        bArrM38146 = bArr3;
                        i16 = i19;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    } else {
                        iM559710 = C0946.m55979("ۘۤ") ^ i14;
                        i = ((iM559710 ^ i13) * 18585) ^ 1886520924;
                        i5 = 634339654;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case -2008208978:
                case -666613124:
                    if (C0873.f81841 > 0) {
                        iM559710 = (C0873.m55680("ۛ᩸") ^ i13) * 59;
                        i = ((iM559710 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                    } else {
                        iM559710 = C0873.m55680("ᩳ۬") ^ i14;
                        i = ((iM559710 ^ i13) * 9265) ^ (-65992805);
                        i5 = 105668681;
                    }
                    i16 = iM559710 ^ i5;
                    i15 = i;
                    break;
                case -1873290642:
                case -33174943:
                    break;
                case -1776771501:
                case 360438968:
                    c5738 = (C5738) C0955.m56035(itM56292);
                    if (!C1048.m56312(this.f30736)) {
                        iM559710 = (C0946.m55979("ᩳᩳ") ^ i13) * (-77);
                        i = ((iM559710 ^ i14) * (-23955)) ^ 1470985496;
                        i5 = -251318495;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    } else {
                        c20689 = c206814;
                        iM55979 = C0873.m55680("ܳ᩸") ^ i14;
                        i = ((iM55979 ^ i13) * (-8127)) ^ (-1078266224);
                        i2 = -1623039631;
                        int i20 = iM55979 ^ i2;
                        c206814 = c20689;
                        i16 = i20;
                        i15 = i;
                    }
                    break;
                case -1710663821:
                case 1592242651:
                    c14281 = c14281;
                    c206815 = c206815;
                    c20689 = c206814;
                    i17 = i17;
                    c6763 = c6763;
                    bArr2 = bArrM38146;
                    i18 = 1;
                    if (C0866.m55647(itM56593)) {
                        iM55680 = C0946.m55979("ۘ۟") ^ i13;
                        i3 = ((iM55680 ^ i14) * 18153) ^ (-1280437450);
                        i6 = 511459410;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩹") ^ i14) * (-71);
                        i3 = ((iM55680 ^ i13) * 31599) ^ (-1881671991);
                        i6 = -1401246544;
                    }
                    i4 = iM55680 ^ i6;
                    bArrM38146 = bArr2;
                    c14281 = c14281;
                    i17 = i17;
                    c206815 = c206815;
                    c206813 = c20689;
                    i16 = i4;
                    i15 = i3;
                    c6763 = c6763;
                    c206814 = c206813;
                    break;
                case -1604569371:
                case -463818666:
                    c20689 = c206814;
                    c6763.m15448();
                    C15294 c15295 = (C15294) this.f30739;
                    if (C0890.f81849 == 0) {
                        short[] sArr2 = f82099;
                        c6763 = c6763;
                        if (C0930.m55885() > 0) {
                            c14281 = c14281;
                            c206815 = c206815;
                            i17 = i17;
                            String strM56584 = C1964.m56584(sArr2, 1, 3, i17);
                            short[] sArr3 = f82099;
                            if (C1964.m56597() == 0) {
                                bArr2 = bArrM38146;
                                c15295.f43632 = new C17969(strM56584, C0894.m55773(sArr3, 4, 1, i17));
                                long jM56137 = C1012.m56137(arrayList2);
                                if (C1404.f82149 < 0) {
                                    c206810 = new C20689(jM56137);
                                    C1036.m56262(c206810, new InterfaceC4595() { // from class: l.ۢ᩹᩻
                                        @Override // p067l.InterfaceC4595
                                        /* JADX INFO: renamed from: ֫ */
                                        public final void mo8466(int i21) {
                                            this.f32885.f30736.m53436((i21 / 2) + 50);
                                        }
                                    });
                                    c15294 = c15295;
                                    itM56292 = C1046.m56292(arrayList2);
                                    int iM55683 = (C0873.m55680("ܺ۫") ^ i14) * 13;
                                    bArrM38146 = bArr2;
                                    i17 = i17;
                                    c206815 = c206810;
                                    c6763 = c6763;
                                    c206814 = c20689;
                                    i16 = iM55683 ^ (-239954095);
                                    i15 = ((iM55683 ^ i13) * 10311) ^ (-1352818471);
                                    c14281 = c14281;
                                } else {
                                    c15294 = c15295;
                                    int iM55684 = (C0873.m55680("ۘᩳ") + i14) * 75;
                                    i3 = ((iM55684 ^ i13) * 5135) ^ (-216901377);
                                    i4 = iM55684 ^ 1232425696;
                                    bArrM38146 = bArr2;
                                    c14281 = c14281;
                                    i17 = i17;
                                    c206815 = null;
                                    c206813 = c20689;
                                    i16 = i4;
                                    i15 = i3;
                                    c6763 = c6763;
                                    c206814 = c206813;
                                }
                            } else {
                                c15294 = c15295;
                                bArr = bArrM38146;
                                c14281 = c14281;
                                iM55681 = C0873.m55680("ۜᩴ") ^ i14;
                                i3 = ((iM55681 ^ i13) * 5915) ^ (-1637437060);
                                i10 = 1391016840;
                                i4 = iM55681 ^ i10;
                                bArrM38146 = bArr;
                                i17 = i17;
                                c206815 = c206815;
                                c206813 = c20689;
                                i16 = i4;
                                i15 = i3;
                                c6763 = c6763;
                                c206814 = c206813;
                            }
                        } else {
                            c15294 = c15295;
                            int iM55685 = (C0873.m55680("ܶ᩷") + i13) * 33;
                            i3 = ((iM55685 ^ i14) * 21447) ^ 924194471;
                            i4 = iM55685 ^ 1286482755;
                            c206813 = c20689;
                            i16 = i4;
                            i15 = i3;
                            c6763 = c6763;
                            c206814 = c206813;
                        }
                    } else {
                        c15294 = c15295;
                        iM55979 = C0946.m55979("᩶᩶") ^ i13;
                        i = ((iM55979 ^ i14) * 16071) ^ 1763771332;
                        i2 = -418853462;
                        int i21 = iM55979 ^ i2;
                        c206814 = c20689;
                        i16 = i21;
                        i15 = i;
                    }
                    break;
                case -1582133885:
                case 474273711:
                    c6763.m15449(bArrM38146);
                    C1194.m56393(arrayList2, c5739);
                    c206812 = c206814;
                    bArr2 = bArrM38146;
                    iM559712 = (C0873.m55680("ۘ֫") + i14) * 67;
                    i9 = ((iM559712 ^ i13) * 9687) ^ 760679655;
                    i11 = -1625855494;
                    i16 = iM559712 ^ i11;
                    c6763 = c6763;
                    bArrM38146 = bArr2;
                    c206814 = c206812;
                    i15 = i9;
                    i17 = i17;
                    c14281 = c14281;
                    c206815 = c206815;
                    break;
                case -1575426583:
                case -591498517:
                    c14281 = c14281;
                    c206815 = c206815;
                    c20689 = c206814;
                    i17 = i17;
                    c6763 = c6763;
                    bArr2 = bArrM38146;
                    s = sArr[c];
                    s2 = 38942;
                    if (!C0937.f81884) {
                        c206812 = c20689;
                        iM559712 = C0946.m55979("۠ܿ") ^ i13;
                        i9 = ((iM559712 ^ i14) * (-18017)) ^ 2049456318;
                        i11 = 226048549;
                        i16 = iM559712 ^ i11;
                        c6763 = c6763;
                        bArrM38146 = bArr2;
                        c206814 = c206812;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    } else {
                        iM55680 = C0946.m55979("ܽܳ") ^ i14;
                        i3 = ((iM55680 ^ i13) * 11253) ^ 194822437;
                        i6 = -1166581901;
                        i4 = iM55680 ^ i6;
                        bArrM38146 = bArr2;
                        c14281 = c14281;
                        i17 = i17;
                        c206815 = c206815;
                        c206813 = c20689;
                        i16 = i4;
                        i15 = i3;
                        c6763 = c6763;
                        c206814 = c206813;
                    }
                    break;
                case -1565493716:
                case 952583573:
                    c20689 = c206814;
                    c5739 = (C5738) C0955.m56035(itM56593);
                    if (!C0947.m56001(this.f30736)) {
                        iM55979 = (i13 - C0946.m55979("۠ۙ")) * (-37);
                        i = ((iM55979 ^ i14) * (-8383)) ^ 237772558;
                        i2 = -1791493114;
                        int i22 = iM55979 ^ i2;
                        c206814 = c20689;
                        i16 = i22;
                        i15 = i;
                    } else {
                        c6763 = c6763;
                        c14281 = c14281;
                        c206815 = c206815;
                        i17 = i17;
                        bArr2 = bArrM38146;
                        iM55680 = (C0946.m55979("ᩳ᩹") ^ i14) * (-71);
                        i3 = ((iM55680 ^ i13) * 31599) ^ (-1881671991);
                        i6 = -1401246544;
                        i4 = iM55680 ^ i6;
                        bArrM38146 = bArr2;
                        c14281 = c14281;
                        i17 = i17;
                        c206815 = c206815;
                        c206813 = c20689;
                        i16 = i4;
                        i15 = i3;
                        c6763 = c6763;
                        c206814 = c206813;
                    }
                    break;
                case -1322907308:
                case -1252543679:
                    c14281 = c14281;
                    c206815 = c206815;
                    c206811 = c206814;
                    i17 = i17;
                    bArr3 = bArrM38146;
                    AbstractC17043 abstractC17043M55691 = C0873.m55691(C17853.f53278);
                    this.f30733 = abstractC17043M55691;
                    c6763 = new C6763(abstractC17043M55691);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM559711 = (i14 - C0946.m55979("᩻ۢ")) * (-29);
                        i9 = ((iM559711 ^ i13) * 29559) ^ (-545837950);
                        i8 = -700236358;
                    } else {
                        iM559711 = C0946.m55979("᩸ܽ") ^ i14;
                        i9 = ((iM559711 ^ i13) * 6125) ^ 1990009947;
                        i8 = -1321443201;
                    }
                    int i110 = iM559711 ^ i8;
                    c206814 = c206811;
                    bArrM38146 = bArr3;
                    i16 = i110;
                    i15 = i9;
                    i17 = i17;
                    c14281 = c14281;
                    c206815 = c206815;
                    break;
                case -1152958992:
                case 304994181:
                    i7 = 53251;
                    int iM55686 = (i13 - C0873.m55680("ܽۙ")) * (-43);
                    bArrM38146 = bArrM38146;
                    c206815 = c206815;
                    i17 = i7;
                    i15 = ((iM55686 ^ i14) * 29765) ^ 230884129;
                    c14281 = c14281;
                    c206813 = c206814;
                    i16 = iM55686 ^ (-875569259);
                    c6763 = c6763;
                    c206814 = c206813;
                    break;
                case -1105321504:
                case 465257764:
                    C1053.m56327();
                    if (!C0917.f81868) {
                        c14281 = c14281;
                        c20689 = c206814;
                        i17 = i17;
                        c6763 = c6763;
                        bArr2 = bArrM38146;
                        int iM55687 = (C0873.m55680("ۘᩳ") + i14) * 75;
                        i3 = ((iM55687 ^ i13) * 5135) ^ (-216901377);
                        i4 = iM55687 ^ 1232425696;
                        bArrM38146 = bArr2;
                        c14281 = c14281;
                        i17 = i17;
                        c206815 = null;
                        c206813 = c20689;
                        i16 = i4;
                        i15 = i3;
                        c6763 = c6763;
                        c206814 = c206813;
                    } else {
                        iM559710 = C0946.m55979("ܿᩳ") ^ i13;
                        i = ((iM559710 ^ i14) * 18477) ^ 2049421062;
                        i5 = -16814168;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case -1052987038:
                case -356995104:
                    C0930.m55885();
                    if (C1024.m56209() < 0) {
                        c20689 = c206814;
                        c6763 = c6763;
                        int iM55688 = (C0873.m55680("ܶ᩷") + i13) * 33;
                        i3 = ((iM55688 ^ i14) * 21447) ^ 924194471;
                        i4 = iM55688 ^ 1286482755;
                        c206813 = c20689;
                        i16 = i4;
                        i15 = i3;
                        c6763 = c6763;
                        c206814 = c206813;
                    } else {
                        iM559710 = (C0873.m55680("ۛ᩸") ^ i13) * 59;
                        i = ((iM559710 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case -1045406294:
                case -690379650:
                    C1044.m56286();
                    if (C1012.f81938 >= 0) {
                        iM559710 = C0946.m55979("ۡܽ") ^ i14;
                        i = ((iM559710 ^ i13) * (-1499)) ^ 107793292;
                        i5 = -602644900;
                    } else {
                        iM559710 = (C0873.m55680("ۛ᩸") ^ i13) * 59;
                        i = ((iM559710 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                    }
                    i16 = iM559710 ^ i5;
                    i15 = i;
                    break;
                case -919048390:
                case 855288122:
                    C1194.m56393(arrayList, new C13946(c14387, c14387.getParent()));
                    c14281 = c14281;
                    c20689 = c206814;
                    c6763 = c6763;
                    c206810 = c206815;
                    i17 = i17;
                    bArr2 = bArrM38146;
                    int iM55689 = (C0873.m55680("ܺ۫") ^ i14) * 13;
                    bArrM38146 = bArr2;
                    i17 = i17;
                    c206815 = c206810;
                    c6763 = c6763;
                    c206814 = c20689;
                    i16 = iM55689 ^ (-239954095);
                    i15 = ((iM55689 ^ i13) * 10311) ^ (-1352818471);
                    c14281 = c14281;
                    break;
                case -667008518:
                case -392603726:
                    i7 = 37969;
                    int iM556810 = (i13 - C0873.m55680("ܽۙ")) * (-43);
                    bArrM38146 = bArrM38146;
                    c206815 = c206815;
                    i17 = i7;
                    i15 = ((iM556810 ^ i14) * 29765) ^ 230884129;
                    c14281 = c14281;
                    c206813 = c206814;
                    i16 = iM556810 ^ (-875569259);
                    c6763 = c6763;
                    c206814 = c206813;
                    break;
                case -590000402:
                case 1451249045:
                    c14281 = c14281;
                    c206815 = c206815;
                    c20689 = c206814;
                    i17 = i17;
                    c6763 = c6763;
                    bArr2 = bArrM38146;
                    if ((s * s2) - ((s * s) + 379119841) > 0) {
                        iM55680 = (C0946.m55979("۬ۤ") + i13) * (-19);
                        i3 = ((iM55680 ^ i14) * 25197) ^ (-481670147);
                        i6 = 231985245;
                    } else {
                        iM55680 = C0946.m55979("ۚᩴ") ^ i14;
                        i3 = ((iM55680 ^ i13) * (-117)) ^ (-1169239866);
                        i6 = 885611088;
                    }
                    i4 = iM55680 ^ i6;
                    bArrM38146 = bArr2;
                    c14281 = c14281;
                    i17 = i17;
                    c206815 = c206815;
                    c206813 = c20689;
                    i16 = i4;
                    i15 = i3;
                    c6763 = c6763;
                    c206814 = c206813;
                    break;
                case -460375147:
                case -179266597:
                    C0912.m55833();
                    iM559710 = C0946.m55979("ۡܽ") ^ i14;
                    i = ((iM559710 ^ i13) * (-1499)) ^ 107793292;
                    i5 = -602644900;
                    i16 = iM559710 ^ i5;
                    i15 = i;
                    break;
                case -317200200:
                case -204511941:
                    c206812 = c206814;
                    AbstractC0942.m55961(c206812, i18);
                    if (RunnableC0897.m55788(c5739)) {
                        bArr2 = bArrM38146;
                        iM559712 = (C0873.m55680("ۘ֫") + i14) * 67;
                        i9 = ((iM559712 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM559712 ^ i11;
                        c6763 = c6763;
                        bArrM38146 = bArr2;
                        c206814 = c206812;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    } else {
                        int iM559714 = (C0946.m55979("᩸۬") ^ i14) * (-113);
                        i15 = ((iM559714 ^ i13) * 17077) ^ 922105573;
                        c206814 = c206812;
                        i16 = iM559714 ^ 1027265284;
                    }
                    break;
                case -159024013:
                case 1064414581:
                    if (C1194.m56387(c5739) < 2097152) {
                        iM559710 = (i14 - C0946.m55979("᩵᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM559710 ^ i13) * 11103) ^ (-1780552524);
                        i5 = 1457793092;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    } else {
                        c206812 = c206814;
                        bArr2 = bArrM38146;
                        iM559712 = (C0873.m55680("ۘ֫") + i14) * 67;
                        i9 = ((iM559712 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM559712 ^ i11;
                        c6763 = c6763;
                        bArrM38146 = bArr2;
                        c206814 = c206812;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    }
                    break;
                case -113677604:
                case 45684830:
                    c20689 = c206814;
                    if (C0930.m55886(itM56292)) {
                        iM55979 = C0946.m55979("ۛᩴ") ^ i13;
                        i = ((iM55979 ^ i14) * 7541) ^ (-1542705738);
                        i2 = 868281473;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩸") ^ i14;
                        i = ((iM55979 ^ i13) * (-8127)) ^ (-1078266224);
                        i2 = -1623039631;
                    }
                    int i23 = iM55979 ^ i2;
                    c206814 = c20689;
                    i16 = i23;
                    i15 = i;
                    break;
                case 142267351:
                case 629107020:
                    C13929 c13929 = this.f30735;
                    c13929.m56473reset((CharSequence) strM38152);
                    if (!c13929.find()) {
                        c14281 = c14281;
                        c20689 = c206814;
                        c6763 = c6763;
                        c206810 = c206815;
                        i17 = i17;
                        bArr2 = bArrM38146;
                        int iM556811 = (C0873.m55680("ܺ۫") ^ i14) * 13;
                        bArrM38146 = bArr2;
                        i17 = i17;
                        c206815 = c206810;
                        c6763 = c6763;
                        c206814 = c20689;
                        i16 = iM556811 ^ (-239954095);
                        i15 = ((iM556811 ^ i13) * 10311) ^ (-1352818471);
                        c14281 = c14281;
                    } else {
                        iM559710 = C0873.m55680("ۛ۫") ^ i13;
                        i = ((iM559710 ^ i14) * (-25659)) ^ 1919134714;
                        i5 = -1540982876;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case 254880865:
                case 1941269924:
                    break;
                case 358527691:
                case 426138750:
                    c14281 = c14281;
                    c206815 = c206815;
                    c20689 = c206814;
                    i17 = i17;
                    c6763 = c6763;
                    bArr2 = bArrM38146;
                    sArr = f82099;
                    c = 0;
                    if (C1003.f81929 <= 0) {
                        int iM556812 = (C0873.m55680("ۘᩳ") + i14) * 75;
                        i3 = ((iM556812 ^ i13) * 5135) ^ (-216901377);
                        i4 = iM556812 ^ 1232425696;
                        bArrM38146 = bArr2;
                        c14281 = c14281;
                        i17 = i17;
                        c206815 = null;
                    } else {
                        iM55680 = C0873.m55680("᩻ܿ") ^ i13;
                        i3 = ((iM55680 ^ i14) * (-22813)) ^ (-344885442);
                        i6 = -100233201;
                        i4 = iM55680 ^ i6;
                        bArrM38146 = bArr2;
                        c14281 = c14281;
                        i17 = i17;
                        c206815 = c206815;
                    }
                    c206813 = c20689;
                    i16 = i4;
                    i15 = i3;
                    c6763 = c6763;
                    c206814 = c206813;
                    break;
                case 484488309:
                case 734148794:
                    if (!C0967.m56074()) {
                        c14281 = c14281;
                        c206815 = c206815;
                        c206811 = c206814;
                        i17 = i17;
                        bArr3 = bArrM38146;
                        iM559711 = (i14 - C0946.m55979("᩻ۢ")) * (-29);
                        i9 = ((iM559711 ^ i13) * 29559) ^ (-545837950);
                        i8 = -700236358;
                        int i111 = iM559711 ^ i8;
                        c206814 = c206811;
                        bArrM38146 = bArr3;
                        i16 = i111;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    } else {
                        iM559710 = (C0873.m55680("ۛ᩸") ^ i13) * 59;
                        i = ((iM559710 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case 489952479:
                case 853848238:
                    try {
                        bArrM38146 = AbstractC0942.m55957(C1024.m56204(c19561, c5739)).m38146(c14281);
                        iM559710 = C0873.m55680("ۗᩳ") ^ i13;
                        i = ((iM559710 ^ i14) * 10209) ^ (-1032997280);
                        i5 = -2029404865;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    } catch (Throwable unused) {
                        c206812 = c206814;
                        bArr2 = bArrM38146;
                        iM559712 = (C0873.m55680("ۘ֫") + i14) * 67;
                        i9 = ((iM559712 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM559712 ^ i11;
                        c6763 = c6763;
                        bArrM38146 = bArr2;
                        c206814 = c206812;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    }
                    break;
                case 528262641:
                case 1523303224:
                    if (C1194.m56387(c5739) <= 10) {
                        c206812 = c206814;
                        bArr2 = bArrM38146;
                        iM559712 = (C0873.m55680("ۘ֫") + i14) * 67;
                        i9 = ((iM559712 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM559712 ^ i11;
                        c6763 = c6763;
                        bArrM38146 = bArr2;
                        c206814 = c206812;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    } else {
                        iM559710 = (i14 - C0873.m55680("ܰ᩵")) * (-115);
                        i = ((iM559710 ^ i13) * 17609) ^ 1136670753;
                        i5 = 2072626396;
                        i16 = iM559710 ^ i5;
                        i15 = i;
                    }
                    break;
                case 631217625:
                case 1722434737:
                    if (!C0873.m55678()) {
                        c20689 = c206814;
                        iM55979 = C0946.m55979("᩶᩶") ^ i13;
                        i = ((iM55979 ^ i14) * 16071) ^ 1763771332;
                        i2 = -418853462;
                        int i24 = iM55979 ^ i2;
                        c206814 = c20689;
                        i16 = i24;
                        i15 = i;
                    } else {
                        c14281 = c14281;
                        c206815 = c206815;
                        c206812 = c206814;
                        i17 = i17;
                        c6763 = c6763;
                        bArr2 = bArrM38146;
                        iM559712 = C0946.m55979("۠ܿ") ^ i13;
                        i9 = ((iM559712 ^ i14) * (-18017)) ^ 2049456318;
                        i11 = 226048549;
                        i16 = iM559712 ^ i11;
                        c6763 = c6763;
                        bArrM38146 = bArr2;
                        c206814 = c206812;
                        i15 = i9;
                        i17 = i17;
                        c14281 = c14281;
                        c206815 = c206815;
                    }
                    break;
                case 820213584:
                case 1507767456:
                    C0861.m55626();
                    C1194.m56396();
                    break;
                case 1324955072:
                case 1573433034:
                    c206815 = c206815;
                    c20689 = c206814;
                    i17 = i17;
                    c6763 = c6763;
                    bArr = bArrM38146;
                    c14281 = new C14281(c19561);
                    arrayList2 = new ArrayList();
                    if (C0992.f81922 >= 0) {
                        iM55681 = C0873.m55680("ۜᩴ") ^ i14;
                        i3 = ((iM55681 ^ i13) * 5915) ^ (-1637437060);
                        i10 = 1391016840;
                    } else {
                        iM55681 = (C0946.m55979("ܽᩳ") + i13) * 11;
                        i3 = ((iM55681 ^ i14) * (-12267)) ^ 855367076;
                        i10 = 729767062;
                    }
                    i4 = iM55681 ^ i10;
                    bArrM38146 = bArr;
                    i17 = i17;
                    c206815 = c206815;
                    c206813 = c20689;
                    i16 = i4;
                    i15 = i3;
                    c6763 = c6763;
                    c206814 = c206813;
                    break;
                default:
                    if (AbstractC0942.f81890 <= 0) {
                        c14281 = c14281;
                        c20689 = c206814;
                        i17 = i17;
                        c6763 = c6763;
                        bArr2 = bArrM38146;
                        int iM556813 = (C0873.m55680("ۘᩳ") + i14) * 75;
                        i3 = ((iM556813 ^ i13) * 5135) ^ (-216901377);
                        i4 = iM556813 ^ 1232425696;
                        bArrM38146 = bArr2;
                        c14281 = c14281;
                        i17 = i17;
                        c206815 = null;
                        c206813 = c20689;
                        i16 = i4;
                        i15 = i3;
                        c6763 = c6763;
                        c206814 = c206813;
                    } else {
                        c20689 = c206814;
                        iM55979 = C0946.m55979("᩶᩶") ^ i13;
                        i = ((iM55979 ^ i14) * 16071) ^ 1763771332;
                        i2 = -418853462;
                        int i25 = iM55979 ^ i2;
                        c206814 = c20689;
                        i16 = i25;
                        i15 = i;
                    }
                    break;
            }
            return;
        }
    }
}
