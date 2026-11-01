package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes.dex */
public final class C24511 extends C4136 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C13783 f77653 = new C13783();

    public C24511(C13524 c13524) {
        this.f9120 = c13524.f9120;
        C8655 c8655 = c13524.f9122;
        this.f9122 = c8655;
        this.f9121 = c13524;
        f77653.m31419(c8655);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m54092() {
        C9996 c9996;
        C8655 c8655;
        EnumC16818 enumC16818;
        C18551 c18551;
        ArrayList arrayList = new ArrayList();
        while (true) {
            C8655 c8656 = this.f9122;
            if (c8656.f23232 != EnumC16818.f49684) {
                if (arrayList.size() > 0) {
                    return arrayList;
                }
                return null;
            }
            if (EnumC20173.m45654(c8656.f23227)) {
                arrayList.add(m54091());
            } else {
                if (!EnumC20173.m45656(this.f9122.f23227)) {
                    return null;
                }
                boolean zM45655 = EnumC20173.m45655(this.f9122.f23227);
                this.f9122.m20078();
                C8655 c8657 = this.f9122;
                if (c8657.f23232 == EnumC16818.f49704) {
                    int i = c8657.f23237;
                    c8657.m20079(String.format("     [ParserAnnotation.parseTypeAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
                    c9996 = new C9996(this.f9121.f38012.m11353(i), zM45655);
                } else {
                    String str = c8657.f23227;
                    c8657.m20079(C21466.m48631("     [ParserAnnotation.parseTypeAnnotation]: value = ", str));
                    c9996 = new C9996(this.f9121.f38012.m11354(str), zM45655);
                }
                this.f9122.m20078();
                C8655 c8658 = this.f9122;
                EnumC16818 enumC16819 = EnumC16818.f49767;
                c8658.m20084(enumC16819);
                m54090(c9996);
                this.f9122.m20079("     [ParserAnnotation._scanTypeTarget]: Begin ");
                this.f9122.m20084(enumC16819);
                this.f9122.m20084(EnumC16818.f49736);
                this.f9122.m20079("     [ParserAnnotation._scanTypeTarget]: TargetType: " + this.f9122.f23234);
                EnumC19222 enumC19222M43788 = EnumC19222.m43788(this.f9122.f23234);
                if (enumC19222M43788 == null) {
                    C6091 c6091 = this.f9120;
                    C8655 c8659 = this.f9122;
                    throw C20865.m47156(c6091, c8659.f23240, "Incorrect TypeAnnotation target \"{0}\"", new Object[]{c8659.f23234});
                }
                this.f9122.m20079("     [ParserAnnotation._scanTypeTarget]: Got TargetType: " + enumC19222M43788);
                C13783 c13783 = f77653;
                if (c13783.f38968 == null) {
                    c13783.f38968 = this.f9122;
                }
                c13783.m31426(enumC19222M43788);
                c9996.f27676 = c13783.m31423();
                c9996.f27675 = enumC19222M43788;
                this.f9122.m20079("     [ParserAnnotation._scanTypeTarget]: Got TargetInfo: " + c9996.f27676);
                C8655 c86510 = this.f9122;
                EnumC16818 enumC168110 = EnumC16818.f49567;
                c86510.m20084(enumC168110);
                C8655 c86511 = this.f9122;
                if (c86511.f23232 != enumC168110) {
                    c86511.m20084(enumC16819);
                    while (true) {
                        c8655 = this.f9122;
                        EnumC16818 enumC168111 = c8655.f23232;
                        EnumC16818 enumC168112 = EnumC16818.f49679;
                        if (enumC168111 == enumC168112 || enumC168111 == (enumC16818 = EnumC16818.f49567)) {
                            break;
                        }
                        if (enumC168111 == enumC168112 || !enumC168111.m38123()) {
                            C6091 c6092 = this.f9120;
                            C8655 c86512 = this.f9122;
                            throw C20865.m47156(c6092, c86512.f23240, "Incorrect TypeAnnotation TargetPath PathEntry \"{0}\"", new Object[]{c86512.f23232});
                        }
                        EnumC12517 enumC12517M28845 = EnumC12517.m28845(this.f9122.f23227);
                        if (enumC12517M28845 == EnumC12517.TYPE_ARGUMENT) {
                            this.f9122.m20078();
                            this.f9122.m20084(EnumC16818.f49767);
                            C8655 c86513 = this.f9122;
                            EnumC16818 enumC168113 = c86513.f23232;
                            if (enumC168113 == enumC168112 || enumC168113 != EnumC16818.f49668) {
                                throw C20865.m47156(this.f9120, c86513.f23240, "Incorrect TypeAnnotation TargetPath PathEntry ArgIndex (expected Integer),  \"{0}\"", new Object[]{enumC168113});
                            }
                            int i2 = c86513.f23237;
                            c86513.m20078();
                            c18551 = new C18551(enumC12517M28845, i2);
                            this.f9122.m20084(enumC16818);
                        } else {
                            c18551 = new C18551(enumC12517M28845, 0);
                            this.f9122.m20078();
                        }
                        c9996.f27677.m7413(c18551);
                        C8655 c86514 = this.f9122;
                        if (c86514.f23232 == EnumC16818.f49716) {
                            c86514.m20078();
                        }
                    }
                    c8655.m20084(EnumC16818.f49567);
                }
                this.f9122.m20084(EnumC16818.f49567);
                arrayList.add(c9996);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12797 m54093() {
        this.f9122.m20078();
        this.f9122.m20084(EnumC16818.f49767);
        EnumC16818 enumC16818 = this.f9122.f23232;
        InterfaceC13980 interfaceC13980M54089 = (enumC16818 == EnumC16818.f49679 || enumC16818 == EnumC16818.f49567) ? null : m54089("default");
        this.f9122.m20084(EnumC16818.f49567);
        C12797 c12797 = new C12797(this.f9121.f38012, EnumC6799.f17636);
        c12797.f36011 = interfaceC13980M54089;
        return c12797;
    }

    /* JADX INFO: renamed from: ܽ */
    private C18179 m54091() {
        C18179 c18179;
        boolean zM45655 = EnumC20173.m45655(this.f9122.f23227);
        this.f9122.m20079(" - - - > [ParserAnnotation.parseAnnotation]: Begin ");
        this.f9122.m20078();
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49704) {
            int i = c8655.f23237;
            c8655.m20079(String.format("     [ParserAnnotation.parseAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
            c18179 = new C18179(this.f9121.f38012.m11353(i), zM45655);
        } else {
            String str = c8655.f23227;
            c8655.m20079(C21466.m48631("     [ParserAnnotation.parseAnnotation]: value = ", str));
            c18179 = new C18179(this.f9121.f38012.m11354(str), zM45655);
        }
        this.f9122.m20078();
        m54090(c18179);
        return c18179;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54090(C18179 c18179) {
        C8655 c8655;
        this.f9122.m20079(" - - - > [ParserAnnotation._scanAnnotation]: Begin");
        this.f9122.m20084(EnumC16818.f49767);
        while (true) {
            c8655 = this.f9122;
            EnumC16818 enumC16818 = c8655.f23232;
            if (enumC16818 == EnumC16818.f49679 || enumC16818 == EnumC16818.f49567) {
                break;
            }
            C17450 c17450M30738 = this.f9121.m30738();
            this.f9122.m20084(EnumC16818.f49733);
            if (c17450M30738.mo20303()) {
                AbstractC4711 abstractC4711 = c17450M30738.f52180;
                if (abstractC4711.f10653 != EnumC12758.f35904) {
                    throw new C13902();
                }
                String strMo9986 = abstractC4711.mo9986();
                this.f9122.m20079(C21466.m48631("     [ParserAnnotation._scanAnnotation]: Annot - Field Name: ", strMo9986));
                c18179.m41396(new C12816(c17450M30738, m54089(strMo9986)));
            } else if (this.f9122.f23232 == EnumC16818.f49704) {
                C17450 c17450M30739 = this.f9121.m30738();
                this.f9122.m20079("     [ParserAnnotation._scanAnnotation]: " + c17450M30738.f23817 + " = " + c17450M30739.f23817);
                c18179.m41396(new C12816(c17450M30738, c17450M30739));
            } else {
                c18179.m41396(new C12816(c17450M30738, m54089("unknown")));
            }
            C8655 c8656 = this.f9122;
            if (c8656.f23232 == EnumC16818.f49716) {
                c8656.m20078();
            }
        }
        c8655.m20084(EnumC16818.f49567);
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC13980 m54089(String str) {
        C8655 c8655;
        int[] iArr = C21830.f68677;
        int i = 1;
        switch (iArr[this.f9122.f23232.ordinal()]) {
            case 1:
                C6091 c6091 = this.f9120;
                StringBuilder sbM11879 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: JASM Keyword: (annotation field name: ", str, ") keyword: ");
                sbM11879.append(this.f9122.f23227);
                c6091.m48090(sbM11879.toString(), new Object[0]);
                String str2 = this.f9122.f23227;
                int i2 = C21830.f68676[C19463.m44282(str2).ordinal()];
                if (i2 == 1) {
                    this.f9122.m20078();
                    int i3 = iArr[this.f9122.f23232.ordinal()];
                    if (i3 == 1) {
                        String str3 = this.f9122.f23227;
                        str3.getClass();
                        if (!str3.equals("true")) {
                            if (!str3.equals("false")) {
                                throw C20865.m47156(this.f9120, this.f9122.f23240, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC9462.AE_BOOLEAN.m21973(), EnumC16818.f49668.m38127() + ", " + EnumC16818.f49704.m38127() + ", " + EnumC16818.f49699.m38127() + ", " + EnumC16818.f49712.m38127(), this.f9122.f23227});
                            }
                            i = 0;
                        }
                        C6091 c6092 = this.f9120;
                        StringBuilder sbM118710 = C5410.m11879("Boolean Field: ", str, " = ");
                        sbM118710.append(this.f9122.f23227);
                        c6092.m48090(sbM118710.toString(), new Object[0]);
                        C12442 c12442 = new C12442(EnumC9462.AE_BOOLEAN.m21974(), this.f9121.f38012.m11365(Integer.valueOf(i)));
                        this.f9122.m20078();
                        return c12442;
                    }
                    if (i3 == 3) {
                        C12442 c12443 = new C12442(EnumC9462.AE_BOOLEAN.m21974(), this.f9121.f38012.m11353(Integer.parseInt(this.f9122.f23227)));
                        this.f9122.m20078();
                        return c12443;
                    }
                    if (i3 != 4) {
                        throw C20865.m47156(this.f9120, this.f9122.f23240, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC9462.AE_BOOLEAN.m21973(), EnumC16818.f49668.m38127() + ", " + EnumC16818.f49704.m38127(), this.f9122.f23227});
                    }
                    C6091 c6093 = this.f9120;
                    StringBuilder sbM118711 = C5410.m11879("Boolean Field: ", str, " = ");
                    sbM118711.append(this.f9122.f23237);
                    c6093.m48090(sbM118711.toString(), new Object[0]);
                    int i4 = this.f9122.f23237;
                    if (i4 > 1 || i4 < 0) {
                        C6091 c6094 = this.f9120;
                        StringBuilder sbM118712 = C5410.m11879("Warning: Boolean Field: ", str, " value is not 0 or 1, value = ");
                        sbM118712.append(this.f9122.f23237);
                        c6094.m48090(sbM118712.toString(), new Object[0]);
                    }
                    C12442 c12444 = new C12442(EnumC9462.AE_BOOLEAN.m21974(), this.f9121.f38012.m11365(Integer.valueOf(i4)));
                    this.f9122.m20078();
                    return c12444;
                }
                if (i2 == 2) {
                    this.f9122.m20078();
                    int i5 = iArr[this.f9122.f23232.ordinal()];
                    if (i5 == 3) {
                        C12442 c12445 = new C12442(EnumC9462.AE_BYTE.m21974(), this.f9121.f38012.m11353(Integer.parseInt(this.f9122.f23227)));
                        this.f9122.m20078();
                        return c12445;
                    }
                    if (i5 != 4) {
                        throw C20865.m47156(this.f9120, this.f9122.f23240, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC9462.AE_BYTE.m21973(), EnumC16818.f49668.m38127() + ", " + EnumC16818.f49704.m38127(), this.f9122.f23227});
                    }
                    C6091 c6095 = this.f9120;
                    StringBuilder sbM118713 = C5410.m11879("Byte Field: ", str, " = ");
                    sbM118713.append(this.f9122.f23237);
                    c6095.m48090(sbM118713.toString(), new Object[0]);
                    int i6 = this.f9122.f23237;
                    if (i6 > 255) {
                        C6091 c6096 = this.f9120;
                        StringBuilder sbM118714 = C5410.m11879("Warning: Byte Field: ", str, " value is greater than 0xFF, value = ");
                        sbM118714.append(this.f9122.f23237);
                        c6096.m48090(sbM118714.toString(), new Object[0]);
                    }
                    C12442 c12446 = new C12442(EnumC9462.AE_BYTE.m21974(), this.f9121.f38012.m11365(Integer.valueOf(i6)));
                    this.f9122.m20078();
                    return c12446;
                }
                if (i2 == 3) {
                    this.f9122.m20078();
                    int i7 = iArr[this.f9122.f23232.ordinal()];
                    if (i7 == 3) {
                        C12442 c12447 = new C12442(EnumC9462.AE_CHAR.m21974(), this.f9121.f38012.m11353(Integer.parseInt(this.f9122.f23227)));
                        this.f9122.m20078();
                        return c12447;
                    }
                    if (i7 == 4) {
                        C6091 c6097 = this.f9120;
                        StringBuilder sbM118715 = C5410.m11879("Char Field: ", str, " = ");
                        sbM118715.append(this.f9122.f23237);
                        c6097.m48090(sbM118715.toString(), new Object[0]);
                        C12442 c12448 = new C12442(EnumC9462.AE_CHAR.m21974(), this.f9121.f38012.m11365(Integer.valueOf(this.f9122.f23237)));
                        this.f9122.m20078();
                        return c12448;
                    }
                    throw C20865.m47156(this.f9120, this.f9122.f23240, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC9462.AE_CHAR.m21973(), EnumC16818.f49668.m38127() + ", " + EnumC16818.f49704.m38127(), this.f9122.f23227});
                }
                if (i2 != 4) {
                    throw C20865.m47156(this.f9120, this.f9122.f23240, "Incorrect Annotation keyword \"{0}\"", new Object[]{str2});
                }
                this.f9122.m20078();
                int i8 = iArr[this.f9122.f23232.ordinal()];
                if (i8 == 3) {
                    C12442 c12449 = new C12442(EnumC9462.AE_SHORT.m21974(), this.f9121.f38012.m11353(Integer.parseInt(this.f9122.f23227)));
                    this.f9122.m20078();
                    return c12449;
                }
                if (i8 != 4) {
                    throw C20865.m47156(this.f9120, this.f9122.f23240, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC9462.AE_SHORT.m21973(), EnumC16818.f49668.m38127() + ", " + EnumC16818.f49704.m38127(), this.f9122.f23227});
                }
                C6091 c6098 = this.f9120;
                StringBuilder sbM118716 = C5410.m11879("Short Field: ", str, " = ");
                sbM118716.append(this.f9122.f23237);
                c6098.m48090(sbM118716.toString(), new Object[0]);
                int i9 = this.f9122.f23237;
                if (i9 > 65535) {
                    C6091 c6099 = this.f9120;
                    StringBuilder sbM118717 = C5410.m11879("Warning: Short Field: ", str, " value is greater than 0xFFFF, value = ");
                    sbM118717.append(this.f9122.f23237);
                    c6099.m48090(sbM118717.toString(), new Object[0]);
                }
                C12442 c124410 = new C12442(EnumC9462.AE_SHORT.m21974(), this.f9121.f38012.m11365(Integer.valueOf(i9)));
                this.f9122.m20078();
                return c124410;
            case 2:
                C6091 c60910 = this.f9120;
                StringBuilder sbM118718 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: String Field: ", str, " = ");
                sbM118718.append(this.f9122.f23227);
                c60910.m48090(sbM118718.toString(), new Object[0]);
                C12442 c124411 = new C12442(EnumC12758.f35904.m29296(), this.f9121.f38012.m11354(this.f9122.f23227));
                this.f9122.m20078();
                return c124411;
            case 3:
                C6091 c60911 = this.f9120;
                StringBuilder sbM118719 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Constant Field by index: ", str, " = #");
                sbM118719.append(this.f9122.f23227);
                c60911.m48090(sbM118719.toString(), new Object[0]);
                int i10 = Integer.parseInt(this.f9122.f23227);
                C17450 c17450M11353 = this.f9121.f38012.m11353(i10);
                EnumC12758 enumC12758M39779 = c17450M11353.m39779();
                InterfaceC13980 c124412 = enumC12758M39779.m29299(EnumC12758.f35909, EnumC12758.f35891, EnumC12758.f35901, EnumC12758.f35888, EnumC12758.f35926, EnumC12758.f35904) ? new C12442(enumC12758M39779.m29296(), c17450M11353) : new C14453(this.f9121.f38012.m11353(i10));
                this.f9122.m20078();
                return c124412;
            case 4:
                C6091 c60912 = this.f9120;
                StringBuilder sbM118720 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Integer Field: ", str, " = ");
                sbM118720.append(this.f9122.f23237);
                c60912.m48090(sbM118720.toString(), new Object[0]);
                C12442 c124413 = new C12442(EnumC12758.f35891.m29296(), this.f9121.f38012.m11365(Integer.valueOf(this.f9122.f23237)));
                this.f9122.m20078();
                return c124413;
            case 5:
                C6091 c60913 = this.f9120;
                StringBuilder sbM118721 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Double Field: ", str, " = ");
                sbM118721.append(this.f9122.f23243);
                c60913.m48090(sbM118721.toString(), new Object[0]);
                Long lValueOf = Long.valueOf(Double.doubleToLongBits(this.f9122.f23243));
                char cM29296 = EnumC12758.f35926.m29296();
                C5263 c5263 = this.f9121.f38012;
                c5263.getClass();
                C12442 c124414 = new C12442(cM29296, c5263.m11356(new C24709(lValueOf)));
                this.f9122.m20078();
                return c124414;
            case 6:
                C6091 c60914 = this.f9120;
                StringBuilder sbM118722 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Float Field: ", str, " = ");
                sbM118722.append(this.f9122.f23242);
                c60914.m48090(sbM118722.toString(), new Object[0]);
                Integer numValueOf = Integer.valueOf(Float.floatToIntBits(this.f9122.f23242));
                char cM29297 = EnumC12758.f35901.m29296();
                C5263 c5264 = this.f9121.f38012;
                c5264.getClass();
                C12442 c124415 = new C12442(cM29297, c5264.m11356(new C11299(numValueOf)));
                this.f9122.m20078();
                return c124415;
            case 7:
                C6091 c60915 = this.f9120;
                StringBuilder sbM118723 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Long Field: ", str, " = ");
                sbM118723.append(this.f9122.f23228);
                c60915.m48090(sbM118723.toString(), new Object[0]);
                char cM29298 = EnumC12758.f35888.m29296();
                C5263 c5265 = this.f9121.f38012;
                Long lValueOf2 = Long.valueOf(this.f9122.f23228);
                c5265.getClass();
                C12442 c124416 = new C12442(cM29298, c5265.m11356(new C5934(lValueOf2)));
                this.f9122.m20078();
                return c124416;
            case 8:
                this.f9120.m48090("[ParserAnnotation.scanAnnotationData]:: Class) keyword: " + this.f9122.f23227, new Object[0]);
                this.f9122.m20078();
                int i11 = iArr[this.f9122.f23232.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    C6091 c60916 = this.f9120;
                    StringBuilder sbM118724 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                    sbM118724.append(this.f9122.f23227);
                    c60916.m48090(sbM118724.toString(), new Object[0]);
                    C12442 c124417 = new C12442(EnumC9462.AE_CLASS.m21974(), this.f9121.f38012.m11354(this.f9122.f23227));
                    this.f9122.m20078();
                    return c124417;
                }
                if (i11 != 3) {
                    C6091 c60917 = this.f9120;
                    C8655 c8656 = this.f9122;
                    throw C20865.m47156(c60917, c8656.f23240, "Incorrect Annotation (class), expected class name or CP index, got \"{0}\"", new Object[]{c8656.f23227});
                }
                C6091 c60918 = this.f9120;
                StringBuilder sbM118725 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                sbM118725.append(this.f9122.f23227);
                c60918.m48090(sbM118725.toString(), new Object[0]);
                C14453 c14453 = new C14453(this.f9121.f38012.m11353(Integer.valueOf(this.f9122.f23227).intValue()));
                this.f9122.m20078();
                return c14453;
            case 9:
                this.f9120.m48090("[ParserAnnotation.scanAnnotationData]:: Enum) keyword: " + this.f9122.f23227, new Object[0]);
                this.f9122.m20078();
                int i12 = iArr[this.f9122.f23232.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    String str4 = this.f9122.f23227;
                    EnumC9462 enumC9462 = EnumC9462.AE_STRING;
                    enumC9462.m21974();
                    C17450 c17450M11354 = this.f9121.f38012.m11354(str4);
                    this.f9122.m20078();
                    this.f9122.m20084(EnumC16818.f49724);
                    int i13 = iArr[this.f9122.f23232.ordinal()];
                    if (i13 == 1 || i13 == 2) {
                        String str5 = this.f9122.f23227;
                        enumC9462.m21974();
                        C8418 c8418 = new C8418(c17450M11354, this.f9121.f38012.m11354(str5));
                        this.f9122.m20078();
                        return c8418;
                    }
                    if (i13 == 3) {
                        C8418 c8419 = new C8418(c17450M11354, this.f9121.f38012.m11353(this.f9122.f23237));
                        this.f9122.m20078();
                        return c8419;
                    }
                    C6091 c60919 = this.f9120;
                    C8655 c8657 = this.f9122;
                    throw C20865.m47156(c60919, c8657.f23240, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c8657.f23227});
                }
                if (i12 != 3) {
                    C6091 c60920 = this.f9120;
                    C8655 c8658 = this.f9122;
                    throw C20865.m47156(c60920, c8658.f23240, "Incorrect Annotation (enum), expected type_name or CP index, got \"{0}\"", new Object[]{c8658.f23227});
                }
                C8655 c8659 = this.f9122;
                int i14 = c8659.f23237;
                c8659.m20078();
                C8655 c86510 = this.f9122;
                if (c86510.f23232 == EnumC16818.f49724) {
                    c86510.m20078();
                }
                int i15 = iArr[this.f9122.f23232.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    String str6 = this.f9122.f23227;
                    EnumC9462.AE_STRING.m21974();
                    C8418 c84110 = new C8418(this.f9121.f38012.m11353(i14), this.f9121.f38012.m11354(str6));
                    this.f9122.m20078();
                    return c84110;
                }
                if (i15 == 3) {
                    C8418 c84111 = new C8418(this.f9121.f38012.m11353(i14), this.f9121.f38012.m11353(this.f9122.f23237));
                    this.f9122.m20078();
                    return c84111;
                }
                C6091 c60921 = this.f9120;
                C8655 c86511 = this.f9122;
                throw C20865.m47156(c60921, c86511.f23240, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c86511.f23227});
            case 10:
                C6091 c60922 = this.f9120;
                StringBuilder sbM118726 = C5410.m11879("[ParserAnnotation.scanAnnotationData]:: Annotation Field: ", str, " = ");
                sbM118726.append(this.f9122.f23227);
                c60922.m48090(sbM118726.toString(), new Object[0]);
                C18179 c18179M54091 = m54091();
                C7077 c7077 = new C7077();
                c7077.f18448 = c18179M54091;
                return c7077;
            case 11:
                this.f9120.m48090(C21466.m48631("[ParserAnnotation.scanAnnotationData]:: Annotation Array Field: ", str), new Object[0]);
                this.f9122.m20078();
                C15123 c15123 = new C15123();
                c15123.f43178 = new ArrayList();
                while (true) {
                    c8655 = this.f9122;
                    EnumC16818 enumC16818 = c8655.f23232;
                    if (enumC16818 != EnumC16818.f49679 && enumC16818 != EnumC16818.f49567) {
                        c15123.f43178.add(m54089(C17588.m40053(str, " {}")));
                        C8655 c86512 = this.f9122;
                        if (c86512.f23232 == EnumC16818.f49716) {
                            c86512.m20078();
                        }
                    }
                }
                c8655.m20084(EnumC16818.f49567);
                return c15123;
            default:
                C6091 c60923 = this.f9120;
                C8655 c86513 = this.f9122;
                throw C20865.m47156(c60923, c86513.f23240, "Incorrect Annotation, unrecognized token: \"{0}\"", new Object[]{c86513.f23232});
        }
    }
}
