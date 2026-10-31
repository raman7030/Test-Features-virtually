package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7KZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16803 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f51589;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f51590;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51591;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39538(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145) {
        AbstractC4308 abstractC4308;
        if (abstractC5144 == null || abstractC5145 == null) {
            return abstractC5144 == null && abstractC5145 == null;
        }
        AbstractC5144 abstractC5144M19471 = C7260.m19471(abstractC5144);
        AbstractC5144 abstractC5144M19472 = C7260.m19471(abstractC5145);
        AbstractC4308 abstractC4309 = abstractC5144M19471.f16086;
        if (abstractC4309 != null && abstractC4309.mo12915() != null && (abstractC4308 = abstractC5144M19472.f16086) != null && abstractC4308.mo12915() != null) {
            return C11003.equals(abstractC5144M19471.f16086.mo12915(), abstractC5144M19472.f16086.mo12915());
        }
        if (abstractC5144M19471.mo989() != abstractC5144M19472.mo989()) {
            return false;
        }
        AbstractC5144 abstractC5146 = this.f51590;
        boolean z = this.f51591;
        try {
            this.f51590 = abstractC5144M19472;
            abstractC5144M19471.mo988(this);
            return this.f51591;
        } finally {
            this.f51590 = abstractC5146;
            this.f51591 = z;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m39537(Iterable iterable, Iterable iterable2) {
        if (iterable == null || iterable2 == null) {
            return iterable == null && iterable2 == null;
        }
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!m39538((AbstractC5144) it.next(), (AbstractC5144) it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        C7673 c7674 = (C7673) this.f51590;
        AbstractC5698 abstractC5698 = c7673.f23697;
        AbstractC5698 abstractC5699 = c7674.f23697;
        if (abstractC5698 != null && abstractC5699 != null && C11003.equals(this.f51589.get(abstractC5698), abstractC5699)) {
            this.f51591 = true;
        } else {
            this.f51591 = c7673.f23697 == c7674.f23697;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        C6262 c6263 = (C6262) this.f51590;
        this.f51591 = m39538(c6262.f19397, c6263.f19397) && c6262.f19396 == c6263.f19396;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        C18257 c18258 = (C18257) this.f51590;
        this.f51591 = m39537(c18257.f56778, c18258.f56778) && m39538(c18257.f56779, c18258.f56779);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        C17551 c17552 = (C17551) this.f51590;
        this.f51591 = m39538(c17551.f53650, c17552.f53650) && m39537(c17551.f53653, c17552.f53653);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        C15580 c15581 = (C15580) this.f51590;
        this.f51591 = m39537(c15580.f48010, c15581.f48010) && m39538(c15580.f48011, c15581.f48011) && m39537(c15580.f48012, c15581.f48012) && c15580.f13845 == c15581.f13845;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        C6968 c6969 = (C6968) this.f51590;
        this.f51591 = m39538(c6968.f21475, c6969.f21475) && m39538(c6968.f21476, c6969.f21476);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        C21080 c21081 = (C21080) this.f51590;
        this.f51591 = m39538(c21080.f67987, c21081.f67987) && m39538(c21080.f67988, c21081.f67988);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        C9791 c9792 = (C9791) this.f51590;
        this.f51591 = m39538(c9791.f29619, c9792.f29619) && m39538(c9791.f29618, c9792.f29618) && c9791.f2830 == c9792.f2830;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        C9085 c9086 = (C9085) this.f51590;
        this.f51591 = m39538(c9085.f27533, c9086.f27533) && m39538(c9085.f27532, c9086.f27532) && c9085.f2830 == c9086.f2830;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        this.f51591 = m39538(c16139.f49721, ((C16139) this.f51590).f49721);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C2735 c2736 = (C2735) this.f51590;
        this.f51591 = c2735.f8522 == c2736.f8522 && m39537(c2735.f8521, c2736.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        this.f51591 = c4146.f13545 == ((C4146) this.f51590).f13545;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        this.f51591 = m39538(c2322.f7456, ((C2322) this.f51590).f7456);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1418(C18963 c18963) {
        C18963 c18964 = (C18963) this.f51590;
        this.f51591 = m39537(c18963.f59815, c18964.f59815) && m39537(c18963.f59814, c18964.f59814);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1425(C21785 c21785) {
        this.f51591 = true;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1366(C0617 c0617) {
        C0617 c0618 = (C0617) this.f51590;
        this.f51591 = m39538(c0617.f2373, c0618.f2373) && m39538(c0617.f2372, c0618.f2372);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C5557 c5558 = (C5557) this.f51590;
        this.f51591 = m39538(c5557.f17181, c5558.f17181) && c5557.f17180 == c5558.f17180 && m39537(c5557.f17185, c5558.f17185) && m39538(c5557.f17184, c5558.f17184) && m39537(c5557.f17183, c5558.f17183) && m39537(c5557.f17179, c5558.f17179);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        C8379 c83710 = (C8379) this.f51590;
        this.f51591 = m39538(c8379.f25701, c83710.f25701) && m39538(c8379.f25699, c83710.f25699) && m39538(c8379.f25700, c83710.f25700);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        this.f51591 = c15433.f47247 == ((C15433) this.f51590).f47247;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        C20374 c20375 = (C20374) this.f51590;
        this.f51591 = m39538(c20374.f65770, c20375.f65770) && m39538(c20374.f65771, c20375.f65771);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1374(C3440 c3440) {
        this.f51591 = m39537(c3440.f10874, ((C3440) this.f51590).f10874);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1394(C10496 c10496) {
        this.f51591 = m39538(c10496.f31483, ((C10496) this.f51590).f31483);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1400(C13317 c13317) {
        C13317 c13318 = (C13317) this.f51590;
        this.f51591 = m39538(c13317.f39865, c13318.f39865) && m39537(c13317.f39866, c13318.f39866);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C11907 c11908 = (C11907) this.f51590;
        this.f51591 = m39537(c11907.f35587, c11908.f35587) && m39538(c11907.f35588, c11908.f35588) && m39537(c11907.f35586, c11908.f35586) && m39538(c11907.f35585, c11908.f35585);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        C4851 c4852 = (C4851) this.f51590;
        this.f51591 = m39538(c4851.f15325, c4852.f15325) && m39538(c4851.f15326, c4852.f15326) && m39538(c4851.f15324, c4852.f15324);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        C1470 c1471 = (C1470) this.f51590;
        this.f51591 = m39538(c1470.f5225, c1471.f5225) && m39538(c1470.f5226, c1471.f5226) && m39538(c1470.f5227, c1471.f5227);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1395(C10643 c10643) {
        C10643 c10644 = (C10643) this.f51590;
        this.f51591 = c10643.f32020 == c10644.f32020 && m39538(c10643.f32021, c10644.f32021);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1404(C14728 c14728) {
        C14728 c14729 = (C14728) this.f51590;
        this.f51591 = m39538(c14728.f44980, c14729.f44980) && m39538(c14728.f44979, c14729.f44979);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C17698 c17699 = (C17698) this.f51590;
        this.f51591 = c17698.f54160 == c17699.f54160 && m39538(c17698.f54159, c17699.f54159);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C14169 c141610 = (C14169) this.f51590;
        this.f51591 = m39537(c14169.f42775, c141610.f42775) && m39538(c14169.f42776, c141610.f42776) && c14169.f42773 == c141610.f42773;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1376(C3733 c3733) {
        C3733 c3734 = (C3733) this.f51590;
        this.f51591 = m39537(c3733.f11797, c3734.f11797) && m39538(c3733.f11799, c3734.f11799);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        C23342 c23343 = (C23342) this.f51590;
        this.f51591 = c23342.f74996 == c23343.f74996 && C11003.equals(c23342.f74997, c23343.f74997);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C8526 c8527 = (C8526) this.f51590;
        this.f51591 = m39538(c8526.f26046, c8527.f26046) && c8526.f26044 == c8527.f26044 && m39538(c8526.f26051, c8527.f26051) && m39537(c8526.f26047, c8527.f26047) && m39538(c8526.f26052, c8527.f26052) && m39537(c8526.f26048, c8527.f26048) && m39537(c8526.f26042, c8527.f26042) && m39538(c8526.f26043, c8527.f26043) && m39538(c8526.f26049, c8527.f26049);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1370(C2176 c2176) {
        C2176 c2177 = (C2176) this.f51590;
        this.f51591 = c2176.f7169 == c2177.f7169 && m39537(c2176.f7168, c2177.f7168);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C3587 c3588 = (C3587) this.f51590;
        this.f51591 = m39538(c3587.f11379, c3588.f11379) && m39538(c3587.f11378, c3588.f11378) && m39537(c3587.f11376, c3588.f11376);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        boolean z;
        C18404 c18405 = (C18404) this.f51590;
        if (m39538(c18404.f57138, c18405.f57138) && m39537(c18404.f57140, c18405.f57140) && m39537(c18404.f57137, c18405.f57137)) {
            C2609 c2609 = c18404.f57141;
            C2609 c26010 = c18405.f57141;
            if (c2609 != null && c26010 != null) {
                Iterator it = c2609.iterator();
                Iterator it2 = c26010.iterator();
                while (true) {
                    if (it.hasNext() && it2.hasNext()) {
                        if (!m39537((Iterable) it.next(), (Iterable) it2.next())) {
                        }
                    } else if (!it.hasNext() && !it2.hasNext()) {
                        if (m39537(c18404.f57139, c18405.f57139)) {
                        }
                    }
                }
            } else if (c2609 == null && c26010 == null) {
                z = m39537(c18404.f57139, c18405.f57139);
            }
        }
        this.f51591 = z;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        C19110 c19111 = (C19110) this.f51590;
        this.f51591 = m39538(c19110.f60199, c19111.f60199) && m39537(c19110.f60198, c19111.f60198) && m39538(c19110.f60196, c19111.f60196) && m39537(c19110.f60197, c19111.f60197) && m39538(c19110.f60195, c19111.f60195) && c19110.f60194 == c19111.f60194;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1365(C0058 c0058) {
        C0058 c0059 = (C0058) this.f51590;
        this.f51591 = m39538(c0058.f946, c0059.f946) && m39537(c0058.f947, c0059.f947);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1386(C7820 c7820) {
        C7820 c7821 = (C7820) this.f51590;
        this.f51591 = m39537(c7820.f24198, c7821.f24198) && m39538(c7820.f24199, c7821.f24199) && c7820.f24200 == c7821.f24200;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1399(C12759 c12759) {
        C12759 c127510 = (C12759) this.f51590;
        this.f51591 = m39538(c12759.f38349, c127510.f38349) && m39537(c12759.f38348, c127510.f38348);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        C9232 c9233 = (C9232) this.f51590;
        this.f51591 = c9232.f27940 == c9233.f27940 && c9232.f27942 == c9233.f27942 && c9232.f27944 == c9233.f27944 && m39538(c9232.f27945, c9233.f27945) && m39537(c9232.f27947, c9233.f27947);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1398(C12054 c12054) {
        C12054 c12055 = (C12054) this.f51590;
        this.f51591 = c12054.f36053 == c12055.f36053 && c12054.f36054 == c12055.f36054 && m39538(c12054.f36052, c12055.f36052);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        this.f51591 = m39538(c9938.f30017, ((C9938) this.f51590).f30017);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        C22637 c22638 = (C22637) this.f51590;
        this.f51591 = m39538(c22637.f73103, c22638.f73103) && m39537(c22637.f73102, c22638.f73102);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        C13464 c13465 = (C13464) this.f51590;
        this.f51591 = m39538(c13464.f40197, c13465.f40197) && m39537(c13464.f40199, c13465.f40199);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1384(C7115 c7115) {
        C7115 c7116 = (C7115) this.f51590;
        this.f51591 = m39538(c7115.f21831, c7116.f21831) && m39538(c7115.f21830, c7116.f21830);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        this.f51591 = m39538(c1616.f5680, ((C1616) this.f51590).f5680);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1367(C1323 c1323) {
        C1323 c1324 = (C1323) this.f51590;
        this.f51591 = m39537(c1323.f4738, c1324.f4738) && c1323.f4739 == c1324.f4739 && c1323.f4746 == c1324.f4746;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C10789 c107810 = (C10789) this.f51590;
        this.f51591 = m39538(c10789.f32445, c107810.f32445) && m39537(c10789.f32449, c107810.f32449) && m39538(c10789.f32448, c107810.f32448) && m39537(c10789.f32446, c107810.f32446);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        C16432 c16433 = (C16432) this.f51590;
        this.f51591 = m39538(c16432.f50542, c16433.f50542) && m39537(c16432.f50541, c16433.f50541);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        this.f51591 = m39538(c23901.f77274, ((C23901) this.f51590).f77274);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1420(C19256 c19256) {
        this.f51591 = c19256.f60620 == ((C19256) this.f51590).f60620;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        C17844 c17845 = (C17844) this.f51590;
        this.f51591 = m39538(c17844.f54511, c17845.f54511) && m39538(c17844.f54512, c17845.f54512);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1373(C2882 c2882) {
        this.f51591 = c2882.f9190 == ((C2882) this.f51590).f9190;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1412(C17138 c17138) {
        this.f51591 = m39537(c17138.f52525, ((C17138) this.f51590).f52525);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C14315 c14316 = (C14315) this.f51590;
        this.f51591 = c14315.f43169 == c14316.f43169 && m39537(c14315.f43170, c14316.f43170) && m39537(c14315.f43168, c14316.f43168);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        C16286 c16287 = (C16286) this.f51590;
        this.f51591 = m39538(c16286.f50075, c16287.f50075) && m39538(c16286.f50076, c16287.f50076);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1428(C23488 c23488) {
        this.f51591 = m39537(c23488.f75416, ((C23488) this.f51590).f75416);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        C6555 c6556 = (C6555) this.f51590;
        this.f51591 = m39538(c6555.f20226, c6556.f20226) && c6555.f2830 == c6556.f2830;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1422(C20667 c20667) {
        this.f51591 = m39538(c20667.f66557, ((C20667) this.f51590).f66557);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C9378 c9379 = (C9378) this.f51590;
        boolean z = m39538(c9378.f28486, c9379.f28486) && c9378.f28484 == c9379.f28484 && m39538(c9378.f28483, c9379.f28483) && m39538(c9378.f28488, c9379.f28488) && m39538(c9378.f28487, c9379.f28487);
        this.f51591 = z;
        if (z) {
            this.f51589.put(c9378.f28489, c9379.f28489);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        C8672 c8673 = (C8672) this.f51590;
        this.f51591 = m39538(c8672.f26445, c8673.f26445) && m39538(c8672.f26444, c8673.f26444);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        C15726 c15727 = (C15726) this.f51590;
        this.f51591 = m39538(c15726.f48502, c15727.f48502) && m39538(c15726.f48501, c15727.f48501);
    }

    public C16803(C2609 c2609, C2609 c26010) {
        this.f51589 = new HashMap();
        HashMap map = new HashMap();
        Iterator it = c26010.iterator();
        Iterator it2 = c2609.iterator();
        while (it2.hasNext()) {
            AbstractC5698 abstractC5698 = (AbstractC5698) it2.next();
            if (!it.hasNext()) {
                break;
            } else {
                map.put(abstractC5698, (AbstractC5698) it.next());
            }
        }
        this.f51589 = map;
    }
}
