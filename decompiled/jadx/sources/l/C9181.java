package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9181 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩶۬ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f27792 = {4261, -27605, -27592, -27615, -27522};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27793;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f27794;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27795;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12164 f27796;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f27797;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27798;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27799;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC16235 f27800;

    public C9181(AbstractViewOnClickListenerC16235 abstractViewOnClickListenerC16235, int i, C12164 c12164, boolean z, int i2, boolean z2) {
        this.f27800 = abstractViewOnClickListenerC16235;
        this.f27793 = i;
        this.f27796 = c12164;
        this.f27799 = z;
        this.f27795 = i2;
        this.f27798 = z2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f27800.f49987.m39056());
        c22933.mo49542((Runnable) null);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49547();
        this.f27797 = c22933;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String str;
        boolean zM34861;
        XmlResourceParserC10269 xmlResourceParserC10269M35994;
        String str2 = "/";
        AbstractViewOnClickListenerC16235 abstractViewOnClickListenerC16235 = this.f27800;
        C18090 c18090 = new C18090(abstractViewOnClickListenerC16235.f49978);
        int i = this.f27793;
        try {
            if (i == 0) {
                m23584(c18090);
                c18090.close();
                return;
            }
            ((C13600) abstractViewOnClickListenerC16235).f40554 = new C16415("zip", "/");
            C19277 c19277 = new C19277(c18090.m42207());
            C22933 c22933 = this.f27797;
            C11003.requireNonNull(c22933);
            c19277.m44459(new C23595(c22933));
            int i2 = 1;
            C12534 c12534 = i == 1 ? new C12534(c18090) : null;
            Set set = abstractViewOnClickListenerC16235.f49977 != null ? (Set) C5378.stream(abstractViewOnClickListenerC16235.f49977).map(new C1775(1)).collect(C22976.toSet()) : null;
            for (C3545 c3545 : c18090.m42210()) {
                if (this.f27797.m51053()) {
                    break;
                }
                c19277.m44460(i2);
                if (c3545.isDirectory() || c3545.getSize() <= 10 || c3545.getSize() >= 2097152) {
                    str = str2;
                } else {
                    if (set != null) {
                        if (!set.contains(str2 + c3545.getName())) {
                            str = str2;
                        }
                    }
                    try {
                        InputStream inputStreamM42189 = c18090.m42189(c3545);
                        if (i != i2) {
                            int i3 = this.f27795;
                            int i4 = 2;
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        try {
                                            XmlResourceParserC10269 xmlResourceParserC10269M35995 = C15206.m35970(inputStreamM42189).m35994();
                                            while (true) {
                                                int next = xmlResourceParserC10269M35995.next();
                                                if (next != i2) {
                                                    if (next == i4) {
                                                        int attributeCount = xmlResourceParserC10269M35995.getAttributeCount();
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 != attributeCount) {
                                                                int iM26023 = xmlResourceParserC10269M35995.m26023(i5);
                                                                str = str2;
                                                                if (iM26023 >= 16 && iM26023 <= 31) {
                                                                    try {
                                                                        if (i3 == xmlResourceParserC10269M35995.m26020(i5)) {
                                                                            xmlResourceParserC10269M35995.close();
                                                                            zM34861 = true;
                                                                        }
                                                                    } catch (Exception unused) {
                                                                        zM34861 = false;
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
                                    xmlResourceParserC10269M35994 = C15206.m35970(inputStreamM42189).m35994();
                                    while (true) {
                                        int next2 = xmlResourceParserC10269M35994.next();
                                        if (next2 != 1) {
                                            if (next2 == 2) {
                                                int attributeCount2 = xmlResourceParserC10269M35994.getAttributeCount();
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 == attributeCount2) {
                                                        continue;
                                                    } else {
                                                        int iM26024 = xmlResourceParserC10269M35994.m26023(i6);
                                                        if (iM26024 < 28 || iM26024 > 31 || i3 != xmlResourceParserC10269M35994.m26020(i6)) {
                                                            i6++;
                                                        } else {
                                                            xmlResourceParserC10269M35994.close();
                                                            zM34861 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                zM34861 = false;
                            } else {
                                str = str2;
                                xmlResourceParserC10269M35994 = C15206.m35970(inputStreamM42189).m35994();
                                while (true) {
                                    int next3 = xmlResourceParserC10269M35994.next();
                                    if (next3 == 1) {
                                        zM34861 = false;
                                    } else if (next3 == 2) {
                                        int attributeCount3 = xmlResourceParserC10269M35994.getAttributeCount();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 == attributeCount3) {
                                                continue;
                                            } else {
                                                int iM26025 = xmlResourceParserC10269M35994.m26023(i7);
                                                if ((iM26025 == 2 || iM26025 == 1) && i3 == xmlResourceParserC10269M35994.m26020(i7)) {
                                                    xmlResourceParserC10269M35994.close();
                                                    zM34861 = true;
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
                            zM34861 = C14608.m34861(inputStreamM42189, this.f27796, this.f27799, c12534);
                        }
                        if (zM34861) {
                            try {
                                C12645 c12645 = new C12645(c3545);
                                ((C13600) abstractViewOnClickListenerC16235).f40554.f50492.add(new C12182(c12645, c12645.getParent()));
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
            c18090.close();
        } catch (Throwable th) {
            try {
                c18090.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f27797.m51053()) {
            return;
        }
        C13600 c13600 = (C13600) this.f27800;
        C10738 c10738 = c13600.f40555;
        if (c13600.f40554.f50492.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            C14298.m34099(c13600.f40553, c10738, c13600.f40554);
        }
        c10738.mo13540(c13600.f40554);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f27800.f49987.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f27797.m51051();
        AbstractC15440 abstractC15440 = this.f27794;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (l.RunnableC1937.f6483 >= 0) goto L36;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m23584(C18090 c18090) {
        C19277 c19277;
        byte[] bArr;
        byte[] bArr2;
        C19277 c19278;
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4;
        int iM6982;
        int i5;
        C19277 c19279;
        byte[] bArr3;
        C19277 c192710;
        int iM2566;
        int i6;
        int i7;
        C19277 c192711;
        int i8;
        int i9;
        int iM6983;
        int i10;
        int iM2567;
        int iM6984;
        int i11;
        int i12 = 1131643013;
        int i13 = C4616.f14690;
        int i14 = ServiceConnectionC3453.f10921;
        int iM6985 = (C2105.m6981("᩹ܳ") ^ i14) * 33;
        int i15 = ((iM6985 ^ i13) * (-15385)) ^ (-2142764973);
        int i16 = iM6985 ^ (-1630531295);
        C19277 c192712 = null;
        Iterator itM12354 = null;
        ArrayList arrayList = null;
        byte[] bArrM35986 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 0;
        ArrayList arrayList2 = null;
        Iterator itM50611 = null;
        C13600 c13600 = null;
        C12645 c12645 = null;
        C19277 c192713 = null;
        int i18 = 0;
        C12534 c12534 = null;
        String strM35992 = null;
        C4624 c4624 = null;
        C3545 c3545 = null;
        C3545 c3546 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 26237) >> 31));
            switch (i12) {
                case -2141373815:
                case -1418112831:
                    RunnableC3474.m10624(c192713, i18);
                    C15206 c15206M10620 = RunnableC3474.m10620(C3663.m11163(c18090, c3545));
                    c15206M10620.m35983(c12534, this.f27798, this.f27794);
                    strM35992 = c15206M10620.m35992();
                    if (strM35992 == null) {
                        c12534 = c12534;
                        c19277 = c192712;
                        c4624 = c4624;
                        c19278 = c192713;
                        i17 = i17;
                        bArr2 = bArrM35986;
                        int iM2568 = (C0630.m2566("ܺ۫") ^ i14) * 13;
                        bArrM35986 = bArr2;
                        i17 = i17;
                        c192713 = c19278;
                        c4624 = c4624;
                        c192712 = c19277;
                        i16 = iM2568 ^ (-239954095);
                        i15 = ((iM2568 ^ i13) * 10311) ^ (-1352818471);
                        c12534 = c12534;
                    } else {
                        iM6982 = (C0630.m2566("ۚ᩸") ^ i13) * 29;
                        i = ((iM6982 ^ i14) * 2109) ^ 1891768741;
                        i5 = 1179327018;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case -2124282396:
                case 1667654762:
                    c4624 = c4624;
                    c12534 = c12534;
                    c192713 = c192713;
                    i17 = i17;
                    bArr2 = bArrM35986;
                    c192710 = new C19277(c18090.m42207());
                    if (C2272.f7362) {
                        iM6984 = C2105.m6981("۠ܿ") ^ i13;
                        i9 = ((iM6984 ^ i14) * (-18017)) ^ 2049456318;
                        i11 = 226048549;
                    } else {
                        C0237.m1495(c192710, new InterfaceC2343() { // from class: l.᩷᩹᩻
                            @Override // l.InterfaceC2343
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6264(int i19) {
                                this.f68248.f27797.m51045(i19 / 2);
                            }
                        });
                        itM50611 = C22628.m50611(C7811.m20845(c18090));
                        iM6984 = (C0630.m2566("ۘ֫") + i14) * 67;
                        i9 = ((iM6984 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                    }
                    i16 = iM6984 ^ i11;
                    c4624 = c4624;
                    bArrM35986 = bArr2;
                    c192712 = c192710;
                    i15 = i9;
                    i17 = i17;
                    c12534 = c12534;
                    c192713 = c192713;
                    break;
                case -2103610860:
                case -1563993554:
                    c12645 = new C12645(c3545);
                    arrayList = c13600.f40554.f50492;
                    if (!C1005.f3721) {
                        c12534 = c12534;
                        c192713 = c192713;
                        c19279 = c192712;
                        i17 = i17;
                        bArr3 = bArrM35986;
                        iM6983 = (i14 - C2105.m6981("᩻ۢ")) * (-29);
                        i9 = ((iM6983 ^ i13) * 29559) ^ (-545837950);
                        i8 = -700236358;
                        int i19 = iM6983 ^ i8;
                        c192712 = c19279;
                        bArrM35986 = bArr3;
                        i16 = i19;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    } else {
                        iM6982 = C2105.m6981("ۘۤ") ^ i14;
                        i = ((iM6982 ^ i13) * 18585) ^ 1886520924;
                        i5 = 634339654;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case -2008208978:
                case -666613124:
                    if (C0630.f2410 > 0) {
                        iM6982 = (C0630.m2566("ۛ᩸") ^ i13) * 59;
                        i = ((iM6982 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                    } else {
                        iM6982 = C0630.m2566("ᩳ۬") ^ i14;
                        i = ((iM6982 ^ i13) * 9265) ^ (-65992805);
                        i5 = 105668681;
                    }
                    i16 = iM6982 ^ i5;
                    i15 = i;
                    break;
                case -1873290642:
                case -33174943:
                    break;
                case -1776771501:
                case 360438968:
                    c3545 = (C3545) C2272.m7513(itM12354);
                    if (!C4159.m12572(this.f27797)) {
                        iM6982 = (C2105.m6981("ᩳᩳ") ^ i13) * (-77);
                        i = ((iM6982 ^ i14) * (-23955)) ^ 1470985496;
                        i5 = -251318495;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    } else {
                        c19277 = c192712;
                        iM6981 = C0630.m2566("ܳ᩸") ^ i14;
                        i = ((iM6981 ^ i13) * (-8127)) ^ (-1078266224);
                        i2 = -1623039631;
                        int i20 = iM6981 ^ i2;
                        c192712 = c19277;
                        i16 = i20;
                        i15 = i;
                    }
                    break;
                case -1710663821:
                case 1592242651:
                    c12534 = c12534;
                    c192713 = c192713;
                    c19277 = c192712;
                    i17 = i17;
                    c4624 = c4624;
                    bArr2 = bArrM35986;
                    i18 = 1;
                    if (C0483.m2123(itM50611)) {
                        iM2566 = C2105.m6981("ۘ۟") ^ i13;
                        i3 = ((iM2566 ^ i14) * 18153) ^ (-1280437450);
                        i6 = 511459410;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩹") ^ i14) * (-71);
                        i3 = ((iM2566 ^ i13) * 31599) ^ (-1881671991);
                        i6 = -1401246544;
                    }
                    i4 = iM2566 ^ i6;
                    bArrM35986 = bArr2;
                    c12534 = c12534;
                    i17 = i17;
                    c192713 = c192713;
                    c192711 = c19277;
                    i16 = i4;
                    i15 = i3;
                    c4624 = c4624;
                    c192712 = c192711;
                    break;
                case -1604569371:
                case -463818666:
                    c19277 = c192712;
                    c4624.m13573();
                    C13600 c13601 = (C13600) this.f27800;
                    if (C0964.f3626 == 0) {
                        short[] sArr2 = f27792;
                        c4624 = c4624;
                        if (C1773.m5908() > 0) {
                            c12534 = c12534;
                            c192713 = c192713;
                            i17 = i17;
                            String strM50602 = C22628.m50602(sArr2, 1, 3, i17);
                            short[] sArr3 = f27792;
                            if (C22628.m50615() == 0) {
                                bArr2 = bArrM35986;
                                c13601.f40554 = new C16415(strM50602, C1047.m3603(sArr3, 4, 1, i17));
                                long jM10481 = C3432.m10481(arrayList2);
                                if (C11340.f33930 < 0) {
                                    c19278 = new C19277(jM10481);
                                    C3911.m11929(c19278, new InterfaceC2343() { // from class: l.ۢ᩹᩻
                                        @Override // l.InterfaceC2343
                                        /* JADX INFO: renamed from: ֫ */
                                        public final void mo6264(int i21) {
                                            this.f29927.f27797.m51045((i21 / 2) + 50);
                                        }
                                    });
                                    c13600 = c13601;
                                    itM12354 = C4117.m12354(arrayList2);
                                    int iM2569 = (C0630.m2566("ܺ۫") ^ i14) * 13;
                                    bArrM35986 = bArr2;
                                    i17 = i17;
                                    c192713 = c19278;
                                    c4624 = c4624;
                                    c192712 = c19277;
                                    i16 = iM2569 ^ (-239954095);
                                    i15 = ((iM2569 ^ i13) * 10311) ^ (-1352818471);
                                    c12534 = c12534;
                                } else {
                                    c13600 = c13601;
                                    int iM25610 = (C0630.m2566("ۘᩳ") + i14) * 75;
                                    i3 = ((iM25610 ^ i13) * 5135) ^ (-216901377);
                                    i4 = iM25610 ^ 1232425696;
                                    bArrM35986 = bArr2;
                                    c12534 = c12534;
                                    i17 = i17;
                                    c192713 = null;
                                    c192711 = c19277;
                                    i16 = i4;
                                    i15 = i3;
                                    c4624 = c4624;
                                    c192712 = c192711;
                                }
                            } else {
                                c13600 = c13601;
                                bArr = bArrM35986;
                                c12534 = c12534;
                                iM2567 = C0630.m2566("ۜᩴ") ^ i14;
                                i3 = ((iM2567 ^ i13) * 5915) ^ (-1637437060);
                                i10 = 1391016840;
                                i4 = iM2567 ^ i10;
                                bArrM35986 = bArr;
                                i17 = i17;
                                c192713 = c192713;
                                c192711 = c19277;
                                i16 = i4;
                                i15 = i3;
                                c4624 = c4624;
                                c192712 = c192711;
                            }
                        } else {
                            c13600 = c13601;
                            int iM25611 = (C0630.m2566("ܶ᩷") + i13) * 33;
                            i3 = ((iM25611 ^ i14) * 21447) ^ 924194471;
                            i4 = iM25611 ^ 1286482755;
                            c192711 = c19277;
                            i16 = i4;
                            i15 = i3;
                            c4624 = c4624;
                            c192712 = c192711;
                        }
                    } else {
                        c13600 = c13601;
                        iM6981 = C2105.m6981("᩶᩶") ^ i13;
                        i = ((iM6981 ^ i14) * 16071) ^ 1763771332;
                        i2 = -418853462;
                        int i21 = iM6981 ^ i2;
                        c192712 = c19277;
                        i16 = i21;
                        i15 = i;
                    }
                    break;
                case -1582133885:
                case 474273711:
                    c4624.m13574(bArrM35986);
                    C7106.m19117(arrayList2, c3546);
                    c192710 = c192712;
                    bArr2 = bArrM35986;
                    iM6984 = (C0630.m2566("ۘ֫") + i14) * 67;
                    i9 = ((iM6984 ^ i13) * 9687) ^ 760679655;
                    i11 = -1625855494;
                    i16 = iM6984 ^ i11;
                    c4624 = c4624;
                    bArrM35986 = bArr2;
                    c192712 = c192710;
                    i15 = i9;
                    i17 = i17;
                    c12534 = c12534;
                    c192713 = c192713;
                    break;
                case -1575426583:
                case -591498517:
                    c12534 = c12534;
                    c192713 = c192713;
                    c19277 = c192712;
                    i17 = i17;
                    c4624 = c4624;
                    bArr2 = bArrM35986;
                    s = sArr[c];
                    s2 = 38942;
                    if (!C1916.f6442) {
                        c192710 = c19277;
                        iM6984 = C2105.m6981("۠ܿ") ^ i13;
                        i9 = ((iM6984 ^ i14) * (-18017)) ^ 2049456318;
                        i11 = 226048549;
                        i16 = iM6984 ^ i11;
                        c4624 = c4624;
                        bArrM35986 = bArr2;
                        c192712 = c192710;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    } else {
                        iM2566 = C2105.m6981("ܽܳ") ^ i14;
                        i3 = ((iM2566 ^ i13) * 11253) ^ 194822437;
                        i6 = -1166581901;
                        i4 = iM2566 ^ i6;
                        bArrM35986 = bArr2;
                        c12534 = c12534;
                        i17 = i17;
                        c192713 = c192713;
                        c192711 = c19277;
                        i16 = i4;
                        i15 = i3;
                        c4624 = c4624;
                        c192712 = c192711;
                    }
                    break;
                case -1565493716:
                case 952583573:
                    c19277 = c192712;
                    c3546 = (C3545) C2272.m7513(itM50611);
                    if (!C2126.m7044(this.f27797)) {
                        iM6981 = (i13 - C2105.m6981("۠ۙ")) * (-37);
                        i = ((iM6981 ^ i14) * (-8383)) ^ 237772558;
                        i2 = -1791493114;
                        int i22 = iM6981 ^ i2;
                        c192712 = c19277;
                        i16 = i22;
                        i15 = i;
                    } else {
                        c4624 = c4624;
                        c12534 = c12534;
                        c192713 = c192713;
                        i17 = i17;
                        bArr2 = bArrM35986;
                        iM2566 = (C2105.m6981("ᩳ᩹") ^ i14) * (-71);
                        i3 = ((iM2566 ^ i13) * 31599) ^ (-1881671991);
                        i6 = -1401246544;
                        i4 = iM2566 ^ i6;
                        bArrM35986 = bArr2;
                        c12534 = c12534;
                        i17 = i17;
                        c192713 = c192713;
                        c192711 = c19277;
                        i16 = i4;
                        i15 = i3;
                        c4624 = c4624;
                        c192712 = c192711;
                    }
                    break;
                case -1322907308:
                case -1252543679:
                    c12534 = c12534;
                    c192713 = c192713;
                    c19279 = c192712;
                    i17 = i17;
                    bArr3 = bArrM35986;
                    AbstractC15440 abstractC15440M2577 = C0630.m2577(C16293.f50111);
                    this.f27794 = abstractC15440M2577;
                    c4624 = new C4624(abstractC15440M2577);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6983 = (i14 - C2105.m6981("᩻ۢ")) * (-29);
                        i9 = ((iM6983 ^ i13) * 29559) ^ (-545837950);
                        i8 = -700236358;
                    } else {
                        iM6983 = C2105.m6981("᩸ܽ") ^ i14;
                        i9 = ((iM6983 ^ i13) * 6125) ^ 1990009947;
                        i8 = -1321443201;
                    }
                    int i110 = iM6983 ^ i8;
                    c192712 = c19279;
                    bArrM35986 = bArr3;
                    i16 = i110;
                    i15 = i9;
                    i17 = i17;
                    c12534 = c12534;
                    c192713 = c192713;
                    break;
                case -1152958992:
                case 304994181:
                    i7 = 53251;
                    int iM25612 = (i13 - C0630.m2566("ܽۙ")) * (-43);
                    bArrM35986 = bArrM35986;
                    c192713 = c192713;
                    i17 = i7;
                    i15 = ((iM25612 ^ i14) * 29765) ^ 230884129;
                    c12534 = c12534;
                    c192711 = c192712;
                    i16 = iM25612 ^ (-875569259);
                    c4624 = c4624;
                    c192712 = c192711;
                    break;
                case -1105321504:
                case 465257764:
                    C4263.m12819();
                    if (!C1504.f5354) {
                        c12534 = c12534;
                        c19277 = c192712;
                        i17 = i17;
                        c4624 = c4624;
                        bArr2 = bArrM35986;
                        int iM25613 = (C0630.m2566("ۘᩳ") + i14) * 75;
                        i3 = ((iM25613 ^ i13) * 5135) ^ (-216901377);
                        i4 = iM25613 ^ 1232425696;
                        bArrM35986 = bArr2;
                        c12534 = c12534;
                        i17 = i17;
                        c192713 = null;
                        c192711 = c19277;
                        i16 = i4;
                        i15 = i3;
                        c4624 = c4624;
                        c192712 = c192711;
                    } else {
                        iM6982 = C2105.m6981("ܿᩳ") ^ i13;
                        i = ((iM6982 ^ i14) * 18477) ^ 2049421062;
                        i5 = -16814168;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case -1052987038:
                case -356995104:
                    C1773.m5908();
                    if (C3663.m11168() < 0) {
                        c19277 = c192712;
                        c4624 = c4624;
                        int iM25614 = (C0630.m2566("ܶ᩷") + i13) * 33;
                        i3 = ((iM25614 ^ i14) * 21447) ^ 924194471;
                        i4 = iM25614 ^ 1286482755;
                        c192711 = c19277;
                        i16 = i4;
                        i15 = i3;
                        c4624 = c4624;
                        c192712 = c192711;
                    } else {
                        iM6982 = (C0630.m2566("ۛ᩸") ^ i13) * 59;
                        i = ((iM6982 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case -1045406294:
                case -690379650:
                    C4075.m12263();
                    if (C3432.f10845 >= 0) {
                        iM6982 = C2105.m6981("ۡܽ") ^ i14;
                        i = ((iM6982 ^ i13) * (-1499)) ^ 107793292;
                        i5 = -602644900;
                    } else {
                        iM6982 = (C0630.m2566("ۛ᩸") ^ i13) * 59;
                        i = ((iM6982 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                    }
                    i16 = iM6982 ^ i5;
                    i15 = i;
                    break;
                case -919048390:
                case 855288122:
                    C7106.m19117(arrayList, new C12182(c12645, c12645.getParent()));
                    c12534 = c12534;
                    c19277 = c192712;
                    c4624 = c4624;
                    c19278 = c192713;
                    i17 = i17;
                    bArr2 = bArrM35986;
                    int iM25615 = (C0630.m2566("ܺ۫") ^ i14) * 13;
                    bArrM35986 = bArr2;
                    i17 = i17;
                    c192713 = c19278;
                    c4624 = c4624;
                    c192712 = c19277;
                    i16 = iM25615 ^ (-239954095);
                    i15 = ((iM25615 ^ i13) * 10311) ^ (-1352818471);
                    c12534 = c12534;
                    break;
                case -667008518:
                case -392603726:
                    i7 = 37969;
                    int iM25616 = (i13 - C0630.m2566("ܽۙ")) * (-43);
                    bArrM35986 = bArrM35986;
                    c192713 = c192713;
                    i17 = i7;
                    i15 = ((iM25616 ^ i14) * 29765) ^ 230884129;
                    c12534 = c12534;
                    c192711 = c192712;
                    i16 = iM25616 ^ (-875569259);
                    c4624 = c4624;
                    c192712 = c192711;
                    break;
                case -590000402:
                case 1451249045:
                    c12534 = c12534;
                    c192713 = c192713;
                    c19277 = c192712;
                    i17 = i17;
                    c4624 = c4624;
                    bArr2 = bArrM35986;
                    if ((s * s2) - ((s * s) + 379119841) > 0) {
                        iM2566 = (C2105.m6981("۬ۤ") + i13) * (-19);
                        i3 = ((iM2566 ^ i14) * 25197) ^ (-481670147);
                        i6 = 231985245;
                    } else {
                        iM2566 = C2105.m6981("ۚᩴ") ^ i14;
                        i3 = ((iM2566 ^ i13) * (-117)) ^ (-1169239866);
                        i6 = 885611088;
                    }
                    i4 = iM2566 ^ i6;
                    bArrM35986 = bArr2;
                    c12534 = c12534;
                    i17 = i17;
                    c192713 = c192713;
                    c192711 = c19277;
                    i16 = i4;
                    i15 = i3;
                    c4624 = c4624;
                    c192712 = c192711;
                    break;
                case -460375147:
                case -179266597:
                    C1420.m4913();
                    iM6982 = C2105.m6981("ۡܽ") ^ i14;
                    i = ((iM6982 ^ i13) * (-1499)) ^ 107793292;
                    i5 = -602644900;
                    i16 = iM6982 ^ i5;
                    i15 = i;
                    break;
                case -317200200:
                case -204511941:
                    c192710 = c192712;
                    AbstractC2021.m6564(c192710, i18);
                    if (RunnableC1108.m3794(c3546)) {
                        bArr2 = bArrM35986;
                        iM6984 = (C0630.m2566("ۘ֫") + i14) * 67;
                        i9 = ((iM6984 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM6984 ^ i11;
                        c4624 = c4624;
                        bArrM35986 = bArr2;
                        c192712 = c192710;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    } else {
                        int iM6986 = (C2105.m6981("᩸۬") ^ i14) * (-113);
                        i15 = ((iM6986 ^ i13) * 17077) ^ 922105573;
                        c192712 = c192710;
                        i16 = iM6986 ^ 1027265284;
                    }
                    break;
                case -159024013:
                case 1064414581:
                    if (C7106.m19111(c3546) < 2097152) {
                        iM6982 = (i14 - C2105.m6981("᩵᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM6982 ^ i13) * 11103) ^ (-1780552524);
                        i5 = 1457793092;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    } else {
                        c192710 = c192712;
                        bArr2 = bArrM35986;
                        iM6984 = (C0630.m2566("ۘ֫") + i14) * 67;
                        i9 = ((iM6984 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM6984 ^ i11;
                        c4624 = c4624;
                        bArrM35986 = bArr2;
                        c192712 = c192710;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    }
                    break;
                case -113677604:
                case 45684830:
                    c19277 = c192712;
                    if (C1773.m5910(itM12354)) {
                        iM6981 = C2105.m6981("ۛᩴ") ^ i13;
                        i = ((iM6981 ^ i14) * 7541) ^ (-1542705738);
                        i2 = 868281473;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩸") ^ i14;
                        i = ((iM6981 ^ i13) * (-8127)) ^ (-1078266224);
                        i2 = -1623039631;
                    }
                    int i23 = iM6981 ^ i2;
                    c192712 = c19277;
                    i16 = i23;
                    i15 = i;
                    break;
                case 142267351:
                case 629107020:
                    C12164 c12164 = this.f27796;
                    c12164.m29615reset((CharSequence) strM35992);
                    if (!c12164.find()) {
                        c12534 = c12534;
                        c19277 = c192712;
                        c4624 = c4624;
                        c19278 = c192713;
                        i17 = i17;
                        bArr2 = bArrM35986;
                        int iM25617 = (C0630.m2566("ܺ۫") ^ i14) * 13;
                        bArrM35986 = bArr2;
                        i17 = i17;
                        c192713 = c19278;
                        c4624 = c4624;
                        c192712 = c19277;
                        i16 = iM25617 ^ (-239954095);
                        i15 = ((iM25617 ^ i13) * 10311) ^ (-1352818471);
                        c12534 = c12534;
                    } else {
                        iM6982 = C0630.m2566("ۛ۫") ^ i13;
                        i = ((iM6982 ^ i14) * (-25659)) ^ 1919134714;
                        i5 = -1540982876;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case 254880865:
                case 1941269924:
                    break;
                case 358527691:
                case 426138750:
                    c12534 = c12534;
                    c192713 = c192713;
                    c19277 = c192712;
                    i17 = i17;
                    c4624 = c4624;
                    bArr2 = bArrM35986;
                    sArr = f27792;
                    c = 0;
                    if (C3245.f10203 <= 0) {
                        int iM25618 = (C0630.m2566("ۘᩳ") + i14) * 75;
                        i3 = ((iM25618 ^ i13) * 5135) ^ (-216901377);
                        i4 = iM25618 ^ 1232425696;
                        bArrM35986 = bArr2;
                        c12534 = c12534;
                        i17 = i17;
                        c192713 = null;
                    } else {
                        iM2566 = C0630.m2566("᩻ܿ") ^ i13;
                        i3 = ((iM2566 ^ i14) * (-22813)) ^ (-344885442);
                        i6 = -100233201;
                        i4 = iM2566 ^ i6;
                        bArrM35986 = bArr2;
                        c12534 = c12534;
                        i17 = i17;
                        c192713 = c192713;
                    }
                    c192711 = c19277;
                    i16 = i4;
                    i15 = i3;
                    c4624 = c4624;
                    c192712 = c192711;
                    break;
                case 484488309:
                case 734148794:
                    if (!C2520.m8026()) {
                        c12534 = c12534;
                        c192713 = c192713;
                        c19279 = c192712;
                        i17 = i17;
                        bArr3 = bArrM35986;
                        iM6983 = (i14 - C2105.m6981("᩻ۢ")) * (-29);
                        i9 = ((iM6983 ^ i13) * 29559) ^ (-545837950);
                        i8 = -700236358;
                        int i111 = iM6983 ^ i8;
                        c192712 = c19279;
                        bArrM35986 = bArr3;
                        i16 = i111;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    } else {
                        iM6982 = (C0630.m2566("ۛ᩸") ^ i13) * 59;
                        i = ((iM6982 ^ i14) * (-21393)) ^ 1346555999;
                        i5 = 162211226;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case 489952479:
                case 853848238:
                    try {
                        bArrM35986 = AbstractC2021.m6560(C3663.m11163(c18090, c3546)).m35986(c12534);
                        iM6982 = C0630.m2566("ۗᩳ") ^ i13;
                        i = ((iM6982 ^ i14) * 10209) ^ (-1032997280);
                        i5 = -2029404865;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    } catch (Throwable unused) {
                        c192710 = c192712;
                        bArr2 = bArrM35986;
                        iM6984 = (C0630.m2566("ۘ֫") + i14) * 67;
                        i9 = ((iM6984 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM6984 ^ i11;
                        c4624 = c4624;
                        bArrM35986 = bArr2;
                        c192712 = c192710;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    }
                    break;
                case 528262641:
                case 1523303224:
                    if (C7106.m19111(c3546) <= 10) {
                        c192710 = c192712;
                        bArr2 = bArrM35986;
                        iM6984 = (C0630.m2566("ۘ֫") + i14) * 67;
                        i9 = ((iM6984 ^ i13) * 9687) ^ 760679655;
                        i11 = -1625855494;
                        i16 = iM6984 ^ i11;
                        c4624 = c4624;
                        bArrM35986 = bArr2;
                        c192712 = c192710;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    } else {
                        iM6982 = (i14 - C0630.m2566("ܰ᩵")) * (-115);
                        i = ((iM6982 ^ i13) * 17609) ^ 1136670753;
                        i5 = 2072626396;
                        i16 = iM6982 ^ i5;
                        i15 = i;
                    }
                    break;
                case 631217625:
                case 1722434737:
                    if (!C0630.m2564()) {
                        c19277 = c192712;
                        iM6981 = C2105.m6981("᩶᩶") ^ i13;
                        i = ((iM6981 ^ i14) * 16071) ^ 1763771332;
                        i2 = -418853462;
                        int i24 = iM6981 ^ i2;
                        c192712 = c19277;
                        i16 = i24;
                        i15 = i;
                    } else {
                        c12534 = c12534;
                        c192713 = c192713;
                        c192710 = c192712;
                        i17 = i17;
                        c4624 = c4624;
                        bArr2 = bArrM35986;
                        iM6984 = C2105.m6981("۠ܿ") ^ i13;
                        i9 = ((iM6984 ^ i14) * (-18017)) ^ 2049456318;
                        i11 = 226048549;
                        i16 = iM6984 ^ i11;
                        c4624 = c4624;
                        bArrM35986 = bArr2;
                        c192712 = c192710;
                        i15 = i9;
                        i17 = i17;
                        c12534 = c12534;
                        c192713 = c192713;
                    }
                    break;
                case 820213584:
                case 1507767456:
                    C0382.m1848();
                    C7106.m19120();
                    break;
                case 1324955072:
                case 1573433034:
                    c192713 = c192713;
                    c19277 = c192712;
                    i17 = i17;
                    c4624 = c4624;
                    bArr = bArrM35986;
                    c12534 = new C12534(c18090);
                    arrayList2 = new ArrayList();
                    if (C3019.f9544 >= 0) {
                        iM2567 = C0630.m2566("ۜᩴ") ^ i14;
                        i3 = ((iM2567 ^ i13) * 5915) ^ (-1637437060);
                        i10 = 1391016840;
                    } else {
                        iM2567 = (C2105.m6981("ܽᩳ") + i13) * 11;
                        i3 = ((iM2567 ^ i14) * (-12267)) ^ 855367076;
                        i10 = 729767062;
                    }
                    i4 = iM2567 ^ i10;
                    bArrM35986 = bArr;
                    i17 = i17;
                    c192713 = c192713;
                    c192711 = c19277;
                    i16 = i4;
                    i15 = i3;
                    c4624 = c4624;
                    c192712 = c192711;
                    break;
                default:
                    if (AbstractC2021.f6743 <= 0) {
                        c12534 = c12534;
                        c19277 = c192712;
                        i17 = i17;
                        c4624 = c4624;
                        bArr2 = bArrM35986;
                        int iM25619 = (C0630.m2566("ۘᩳ") + i14) * 75;
                        i3 = ((iM25619 ^ i13) * 5135) ^ (-216901377);
                        i4 = iM25619 ^ 1232425696;
                        bArrM35986 = bArr2;
                        c12534 = c12534;
                        i17 = i17;
                        c192713 = null;
                        c192711 = c19277;
                        i16 = i4;
                        i15 = i3;
                        c4624 = c4624;
                        c192712 = c192711;
                    } else {
                        c19277 = c192712;
                        iM6981 = C2105.m6981("᩶᩶") ^ i13;
                        i = ((iM6981 ^ i14) * 16071) ^ 1763771332;
                        i2 = -418853462;
                        int i25 = iM6981 ^ i2;
                        c192712 = c19277;
                        i16 = i25;
                        i15 = i;
                    }
                    break;
            }
            return;
        }
    }
}
