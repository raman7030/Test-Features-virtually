package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes.dex */
public final class C23298 extends C1860 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12010 f74908 = new C12010();

    public C23298(C11738 c11738) {
        this.f6339 = c11738.f6339;
        C6615 c6615 = c11738.f6341;
        this.f6341 = c6615;
        this.f6340 = c11738;
        f74908.m29359(c6615);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m51696() {
        C8026 c8026;
        C6615 c6615;
        EnumC15204 enumC15204;
        C17028 c17028;
        ArrayList arrayList = new ArrayList();
        while (true) {
            C6615 c6616 = this.f6341;
            if (c6616.f20355 != EnumC15204.f46559) {
                if (arrayList.size() > 0) {
                    return arrayList;
                }
                return null;
            }
            if (EnumC18734.m43387(c6616.f20350)) {
                arrayList.add(m51695());
            } else {
                if (!EnumC18734.m43389(this.f6341.f20350)) {
                    return null;
                }
                boolean zM43388 = EnumC18734.m43388(this.f6341.f20350);
                this.f6341.m18126();
                C6615 c6617 = this.f6341;
                if (c6617.f20355 == EnumC15204.f46579) {
                    int i = c6617.f20360;
                    c6617.m18127(String.format("     [ParserAnnotation.parseTypeAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
                    c8026 = new C8026(this.f6340.f35012.m9311(i), zM43388);
                } else {
                    String str = c6617.f20350;
                    c6617.m18127(C20094.m46315("     [ParserAnnotation.parseTypeAnnotation]: value = ", str));
                    c8026 = new C8026(this.f6340.f35012.m9312(str), zM43388);
                }
                this.f6341.m18126();
                C6615 c6618 = this.f6341;
                EnumC15204 enumC15205 = EnumC15204.f46642;
                c6618.m18132(enumC15205);
                m51694(c8026);
                this.f6341.m18127("     [ParserAnnotation._scanTypeTarget]: Begin ");
                this.f6341.m18132(enumC15205);
                this.f6341.m18132(EnumC15204.f46611);
                this.f6341.m18127("     [ParserAnnotation._scanTypeTarget]: TargetType: " + this.f6341.f20357);
                EnumC17734 enumC17734M41543 = EnumC17734.m41543(this.f6341.f20357);
                if (enumC17734M41543 == null) {
                    C3917 c3917 = this.f6339;
                    C6615 c6619 = this.f6341;
                    throw C19462.m44860(c3917, c6619.f20363, "Incorrect TypeAnnotation target \"{0}\"", new Object[]{c6619.f20357});
                }
                this.f6341.m18127("     [ParserAnnotation._scanTypeTarget]: Got TargetType: " + enumC17734M41543);
                C12010 c12010 = f74908;
                if (c12010.f35958 == null) {
                    c12010.f35958 = this.f6341;
                }
                c12010.m29366(enumC17734M41543);
                c8026.f24762 = c12010.m29363();
                c8026.f24761 = enumC17734M41543;
                this.f6341.m18127("     [ParserAnnotation._scanTypeTarget]: Got TargetInfo: " + c8026.f24762);
                C6615 c66110 = this.f6341;
                EnumC15204 enumC15206 = EnumC15204.f46442;
                c66110.m18132(enumC15206);
                C6615 c66111 = this.f6341;
                if (c66111.f20355 != enumC15206) {
                    c66111.m18132(enumC15205);
                    while (true) {
                        c6615 = this.f6341;
                        EnumC15204 enumC15207 = c6615.f20355;
                        EnumC15204 enumC15208 = EnumC15204.f46554;
                        if (enumC15207 == enumC15208 || enumC15207 == (enumC15204 = EnumC15204.f46442)) {
                            break;
                        }
                        if (enumC15207 == enumC15208 || !enumC15207.m35963()) {
                            C3917 c3918 = this.f6339;
                            C6615 c66112 = this.f6341;
                            throw C19462.m44860(c3918, c66112.f20363, "Incorrect TypeAnnotation TargetPath PathEntry \"{0}\"", new Object[]{c66112.f20355});
                        }
                        EnumC10679 enumC10679M26806 = EnumC10679.m26806(this.f6341.f20350);
                        if (enumC10679M26806 == EnumC10679.TYPE_ARGUMENT) {
                            this.f6341.m18126();
                            this.f6341.m18132(EnumC15204.f46642);
                            C6615 c66113 = this.f6341;
                            EnumC15204 enumC15209 = c66113.f20355;
                            if (enumC15209 == enumC15208 || enumC15209 != EnumC15204.f46543) {
                                throw C19462.m44860(this.f6339, c66113.f20363, "Incorrect TypeAnnotation TargetPath PathEntry ArgIndex (expected Integer),  \"{0}\"", new Object[]{enumC15209});
                            }
                            int i2 = c66113.f20360;
                            c66113.m18126();
                            c17028 = new C17028(enumC10679M26806, i2);
                            this.f6341.m18132(enumC15204);
                        } else {
                            c17028 = new C17028(enumC10679M26806, 0);
                            this.f6341.m18126();
                        }
                        c8026.f24763.m5187(c17028);
                        C6615 c66114 = this.f6341;
                        if (c66114.f20355 == EnumC15204.f46591) {
                            c66114.m18126();
                        }
                    }
                    c6615.m18132(EnumC15204.f46442);
                }
                this.f6341.m18132(EnumC15204.f46442);
                arrayList.add(c8026);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10973 m51697() {
        this.f6341.m18126();
        this.f6341.m18132(EnumC15204.f46642);
        EnumC15204 enumC15204 = this.f6341.f20355;
        InterfaceC12218 interfaceC12218M51693 = (enumC15204 == EnumC15204.f46554 || enumC15204 == EnumC15204.f46442) ? null : m51693("default");
        this.f6341.m18132(EnumC15204.f46442);
        C10973 c10973 = new C10973(this.f6340.f35012, EnumC4662.f14806);
        c10973.f33018 = interfaceC12218M51693;
        return c10973;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C16636 m51695() {
        C16636 c16636;
        boolean zM43388 = EnumC18734.m43388(this.f6341.f20350);
        this.f6341.m18127(" - - - > [ParserAnnotation.parseAnnotation]: Begin ");
        this.f6341.m18126();
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18127(String.format("     [ParserAnnotation.parseAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
            c16636 = new C16636(this.f6340.f35012.m9311(i), zM43388);
        } else {
            String str = c6615.f20350;
            c6615.m18127(C20094.m46315("     [ParserAnnotation.parseAnnotation]: value = ", str));
            c16636 = new C16636(this.f6340.f35012.m9312(str), zM43388);
        }
        this.f6341.m18126();
        m51694(c16636);
        return c16636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51694(C16636 c16636) {
        C6615 c6615;
        this.f6341.m18127(" - - - > [ParserAnnotation._scanAnnotation]: Begin");
        this.f6341.m18132(EnumC15204.f46642);
        while (true) {
            c6615 = this.f6341;
            EnumC15204 enumC15204 = c6615.f20355;
            if (enumC15204 == EnumC15204.f46554 || enumC15204 == EnumC15204.f46442) {
                break;
            }
            C15869 c15869M28690 = this.f6340.m28690();
            this.f6341.m18132(EnumC15204.f46608);
            if (c15869M28690.mo18355()) {
                AbstractC2465 abstractC2465 = c15869M28690.f49042;
                if (abstractC2465.f7865 != EnumC10932.f32926) {
                    throw new C12136();
                }
                String strMo7938 = abstractC2465.mo7938();
                this.f6341.m18127(C20094.m46315("     [ParserAnnotation._scanAnnotation]: Annot - Field Name: ", strMo7938));
                c16636.m39168(new C10993(c15869M28690, m51693(strMo7938)));
            } else if (this.f6341.f20355 == EnumC15204.f46579) {
                C15869 c15869M28691 = this.f6340.m28690();
                this.f6341.m18127("     [ParserAnnotation._scanAnnotation]: " + c15869M28690.f20943 + " = " + c15869M28691.f20943);
                c16636.m39168(new C10993(c15869M28690, c15869M28691));
            } else {
                c16636.m39168(new C10993(c15869M28690, m51693("unknown")));
            }
            C6615 c6616 = this.f6341;
            if (c6616.f20355 == EnumC15204.f46591) {
                c6616.m18126();
            }
        }
        c6615.m18132(EnumC15204.f46442);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12218 m51693(String str) {
        C6615 c6615;
        int[] iArr = C20477.f66000;
        int i = 1;
        switch (iArr[this.f6341.f20355.ordinal()]) {
            case 1:
                C3917 c3917 = this.f6339;
                StringBuilder sbM9834 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: JASM Keyword: (annotation field name: ", str, ") keyword: ");
                sbM9834.append(this.f6341.f20350);
                c3917.m45778(sbM9834.toString(), new Object[0]);
                String str2 = this.f6341.f20350;
                int i2 = C20477.f65999[C17987.m42032(str2).ordinal()];
                if (i2 == 1) {
                    this.f6341.m18126();
                    int i3 = iArr[this.f6341.f20355.ordinal()];
                    if (i3 == 1) {
                        String str3 = this.f6341.f20350;
                        str3.getClass();
                        if (!str3.equals("true")) {
                            if (!str3.equals("false")) {
                                throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_BOOLEAN.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967() + ", " + EnumC15204.f46574.m35967() + ", " + EnumC15204.f46587.m35967(), this.f6341.f20350});
                            }
                            i = 0;
                        }
                        C3917 c3918 = this.f6339;
                        StringBuilder sbM9835 = C3200.m9834("Boolean Field: ", str, " = ");
                        sbM9835.append(this.f6341.f20350);
                        c3918.m45778(sbM9835.toString(), new Object[0]);
                        C10599 c10599 = new C10599(EnumC7464.AE_BOOLEAN.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i)));
                        this.f6341.m18126();
                        return c10599;
                    }
                    if (i3 == 3) {
                        C10599 c105910 = new C10599(EnumC7464.AE_BOOLEAN.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                        this.f6341.m18126();
                        return c105910;
                    }
                    if (i3 != 4) {
                        throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_BOOLEAN.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                    }
                    C3917 c3919 = this.f6339;
                    StringBuilder sbM9836 = C3200.m9834("Boolean Field: ", str, " = ");
                    sbM9836.append(this.f6341.f20360);
                    c3919.m45778(sbM9836.toString(), new Object[0]);
                    int i4 = this.f6341.f20360;
                    if (i4 > 1 || i4 < 0) {
                        C3917 c39110 = this.f6339;
                        StringBuilder sbM9837 = C3200.m9834("Warning: Boolean Field: ", str, " value is not 0 or 1, value = ");
                        sbM9837.append(this.f6341.f20360);
                        c39110.m45778(sbM9837.toString(), new Object[0]);
                    }
                    C10599 c105911 = new C10599(EnumC7464.AE_BOOLEAN.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i4)));
                    this.f6341.m18126();
                    return c105911;
                }
                if (i2 == 2) {
                    this.f6341.m18126();
                    int i5 = iArr[this.f6341.f20355.ordinal()];
                    if (i5 == 3) {
                        C10599 c105912 = new C10599(EnumC7464.AE_BYTE.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                        this.f6341.m18126();
                        return c105912;
                    }
                    if (i5 != 4) {
                        throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_BYTE.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                    }
                    C3917 c39111 = this.f6339;
                    StringBuilder sbM9838 = C3200.m9834("Byte Field: ", str, " = ");
                    sbM9838.append(this.f6341.f20360);
                    c39111.m45778(sbM9838.toString(), new Object[0]);
                    int i6 = this.f6341.f20360;
                    if (i6 > 255) {
                        C3917 c39112 = this.f6339;
                        StringBuilder sbM9839 = C3200.m9834("Warning: Byte Field: ", str, " value is greater than 0xFF, value = ");
                        sbM9839.append(this.f6341.f20360);
                        c39112.m45778(sbM9839.toString(), new Object[0]);
                    }
                    C10599 c105913 = new C10599(EnumC7464.AE_BYTE.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i6)));
                    this.f6341.m18126();
                    return c105913;
                }
                if (i2 == 3) {
                    this.f6341.m18126();
                    int i7 = iArr[this.f6341.f20355.ordinal()];
                    if (i7 == 3) {
                        C10599 c105914 = new C10599(EnumC7464.AE_CHAR.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                        this.f6341.m18126();
                        return c105914;
                    }
                    if (i7 == 4) {
                        C3917 c39113 = this.f6339;
                        StringBuilder sbM98310 = C3200.m9834("Char Field: ", str, " = ");
                        sbM98310.append(this.f6341.f20360);
                        c39113.m45778(sbM98310.toString(), new Object[0]);
                        C10599 c105915 = new C10599(EnumC7464.AE_CHAR.m19999(), this.f6340.f35012.m9323(Integer.valueOf(this.f6341.f20360)));
                        this.f6341.m18126();
                        return c105915;
                    }
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_CHAR.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                }
                if (i2 != 4) {
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation keyword \"{0}\"", new Object[]{str2});
                }
                this.f6341.m18126();
                int i8 = iArr[this.f6341.f20355.ordinal()];
                if (i8 == 3) {
                    C10599 c105916 = new C10599(EnumC7464.AE_SHORT.m19999(), this.f6340.f35012.m9311(Integer.parseInt(this.f6341.f20350)));
                    this.f6341.m18126();
                    return c105916;
                }
                if (i8 != 4) {
                    throw C19462.m44860(this.f6339, this.f6341.f20363, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC7464.AE_SHORT.m19998(), EnumC15204.f46543.m35967() + ", " + EnumC15204.f46579.m35967(), this.f6341.f20350});
                }
                C3917 c39114 = this.f6339;
                StringBuilder sbM98311 = C3200.m9834("Short Field: ", str, " = ");
                sbM98311.append(this.f6341.f20360);
                c39114.m45778(sbM98311.toString(), new Object[0]);
                int i9 = this.f6341.f20360;
                if (i9 > 65535) {
                    C3917 c39115 = this.f6339;
                    StringBuilder sbM98312 = C3200.m9834("Warning: Short Field: ", str, " value is greater than 0xFFFF, value = ");
                    sbM98312.append(this.f6341.f20360);
                    c39115.m45778(sbM98312.toString(), new Object[0]);
                }
                C10599 c105917 = new C10599(EnumC7464.AE_SHORT.m19999(), this.f6340.f35012.m9323(Integer.valueOf(i9)));
                this.f6341.m18126();
                return c105917;
            case 2:
                C3917 c39116 = this.f6339;
                StringBuilder sbM98313 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: String Field: ", str, " = ");
                sbM98313.append(this.f6341.f20350);
                c39116.m45778(sbM98313.toString(), new Object[0]);
                C10599 c105918 = new C10599(EnumC10932.f32926.m27252(), this.f6340.f35012.m9312(this.f6341.f20350));
                this.f6341.m18126();
                return c105918;
            case 3:
                C3917 c39117 = this.f6339;
                StringBuilder sbM98314 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Constant Field by index: ", str, " = #");
                sbM98314.append(this.f6341.f20350);
                c39117.m45778(sbM98314.toString(), new Object[0]);
                int i10 = Integer.parseInt(this.f6341.f20350);
                C15869 c15869M9311 = this.f6340.f35012.m9311(i10);
                EnumC10932 enumC10932M37607 = c15869M9311.m37607();
                InterfaceC12218 c105919 = enumC10932M37607.m27255(EnumC10932.f32931, EnumC10932.f32913, EnumC10932.f32923, EnumC10932.f32910, EnumC10932.f32948, EnumC10932.f32926) ? new C10599(enumC10932M37607.m27252(), c15869M9311) : new C12715(this.f6340.f35012.m9311(i10));
                this.f6341.m18126();
                return c105919;
            case 4:
                C3917 c39118 = this.f6339;
                StringBuilder sbM98315 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Integer Field: ", str, " = ");
                sbM98315.append(this.f6341.f20360);
                c39118.m45778(sbM98315.toString(), new Object[0]);
                C10599 c105920 = new C10599(EnumC10932.f32913.m27252(), this.f6340.f35012.m9323(Integer.valueOf(this.f6341.f20360)));
                this.f6341.m18126();
                return c105920;
            case 5:
                C3917 c39119 = this.f6339;
                StringBuilder sbM98316 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Double Field: ", str, " = ");
                sbM98316.append(this.f6341.f20366);
                c39119.m45778(sbM98316.toString(), new Object[0]);
                Long lValueOf = Long.valueOf(Double.doubleToLongBits(this.f6341.f20366));
                char cM27252 = EnumC10932.f32948.m27252();
                C3046 c3046 = this.f6340.f35012;
                c3046.getClass();
                C10599 c105921 = new C10599(cM27252, c3046.m9314(new C23507(lValueOf)));
                this.f6341.m18126();
                return c105921;
            case 6:
                C3917 c39120 = this.f6339;
                StringBuilder sbM98317 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Float Field: ", str, " = ");
                sbM98317.append(this.f6341.f20365);
                c39120.m45778(sbM98317.toString(), new Object[0]);
                Integer numValueOf = Integer.valueOf(Float.floatToIntBits(this.f6341.f20365));
                char cM27253 = EnumC10932.f32923.m27252();
                C3046 c3047 = this.f6340.f35012;
                c3047.getClass();
                C10599 c105922 = new C10599(cM27253, c3047.m9314(new C9397(numValueOf)));
                this.f6341.m18126();
                return c105922;
            case 7:
                C3917 c39121 = this.f6339;
                StringBuilder sbM98318 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Long Field: ", str, " = ");
                sbM98318.append(this.f6341.f20351);
                c39121.m45778(sbM98318.toString(), new Object[0]);
                char cM27254 = EnumC10932.f32910.m27252();
                C3046 c3048 = this.f6340.f35012;
                Long lValueOf2 = Long.valueOf(this.f6341.f20351);
                c3048.getClass();
                C10599 c105923 = new C10599(cM27254, c3048.m9314(new C3752(lValueOf2)));
                this.f6341.m18126();
                return c105923;
            case 8:
                this.f6339.m45778("[ParserAnnotation.scanAnnotationData]:: Class) keyword: " + this.f6341.f20350, new Object[0]);
                this.f6341.m18126();
                int i11 = iArr[this.f6341.f20355.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    C3917 c39122 = this.f6339;
                    StringBuilder sbM98319 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                    sbM98319.append(this.f6341.f20350);
                    c39122.m45778(sbM98319.toString(), new Object[0]);
                    C10599 c105924 = new C10599(EnumC7464.AE_CLASS.m19999(), this.f6340.f35012.m9312(this.f6341.f20350));
                    this.f6341.m18126();
                    return c105924;
                }
                if (i11 != 3) {
                    C3917 c39123 = this.f6339;
                    C6615 c6616 = this.f6341;
                    throw C19462.m44860(c39123, c6616.f20363, "Incorrect Annotation (class), expected class name or CP index, got \"{0}\"", new Object[]{c6616.f20350});
                }
                C3917 c39124 = this.f6339;
                StringBuilder sbM98320 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                sbM98320.append(this.f6341.f20350);
                c39124.m45778(sbM98320.toString(), new Object[0]);
                C12715 c12715 = new C12715(this.f6340.f35012.m9311(Integer.valueOf(this.f6341.f20350).intValue()));
                this.f6341.m18126();
                return c12715;
            case 9:
                this.f6339.m45778("[ParserAnnotation.scanAnnotationData]:: Enum) keyword: " + this.f6341.f20350, new Object[0]);
                this.f6341.m18126();
                int i12 = iArr[this.f6341.f20355.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    String str4 = this.f6341.f20350;
                    EnumC7464 enumC7464 = EnumC7464.AE_STRING;
                    enumC7464.m19999();
                    C15869 c15869M9312 = this.f6340.f35012.m9312(str4);
                    this.f6341.m18126();
                    this.f6341.m18132(EnumC15204.f46599);
                    int i13 = iArr[this.f6341.f20355.ordinal()];
                    if (i13 == 1 || i13 == 2) {
                        String str5 = this.f6341.f20350;
                        enumC7464.m19999();
                        C6365 c6365 = new C6365(c15869M9312, this.f6340.f35012.m9312(str5));
                        this.f6341.m18126();
                        return c6365;
                    }
                    if (i13 == 3) {
                        C6365 c6366 = new C6365(c15869M9312, this.f6340.f35012.m9311(this.f6341.f20360));
                        this.f6341.m18126();
                        return c6366;
                    }
                    C3917 c39125 = this.f6339;
                    C6615 c6617 = this.f6341;
                    throw C19462.m44860(c39125, c6617.f20363, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c6617.f20350});
                }
                if (i12 != 3) {
                    C3917 c39126 = this.f6339;
                    C6615 c6618 = this.f6341;
                    throw C19462.m44860(c39126, c6618.f20363, "Incorrect Annotation (enum), expected type_name or CP index, got \"{0}\"", new Object[]{c6618.f20350});
                }
                C6615 c6619 = this.f6341;
                int i14 = c6619.f20360;
                c6619.m18126();
                C6615 c66110 = this.f6341;
                if (c66110.f20355 == EnumC15204.f46599) {
                    c66110.m18126();
                }
                int i15 = iArr[this.f6341.f20355.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    String str6 = this.f6341.f20350;
                    EnumC7464.AE_STRING.m19999();
                    C6365 c6367 = new C6365(this.f6340.f35012.m9311(i14), this.f6340.f35012.m9312(str6));
                    this.f6341.m18126();
                    return c6367;
                }
                if (i15 == 3) {
                    C6365 c6368 = new C6365(this.f6340.f35012.m9311(i14), this.f6340.f35012.m9311(this.f6341.f20360));
                    this.f6341.m18126();
                    return c6368;
                }
                C3917 c39127 = this.f6339;
                C6615 c66111 = this.f6341;
                throw C19462.m44860(c39127, c66111.f20363, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c66111.f20350});
            case 10:
                C3917 c39128 = this.f6339;
                StringBuilder sbM98321 = C3200.m9834("[ParserAnnotation.scanAnnotationData]:: Annotation Field: ", str, " = ");
                sbM98321.append(this.f6341.f20350);
                c39128.m45778(sbM98321.toString(), new Object[0]);
                C16636 c16636M51695 = m51695();
                C4954 c4954 = new C4954();
                c4954.f15614 = c16636M51695;
                return c4954;
            case 11:
                this.f6339.m45778(C20094.m46315("[ParserAnnotation.scanAnnotationData]:: Annotation Array Field: ", str), new Object[0]);
                this.f6341.m18126();
                C13420 c13420 = new C13420();
                c13420.f40109 = new ArrayList();
                while (true) {
                    c6615 = this.f6341;
                    EnumC15204 enumC15204 = c6615.f20355;
                    if (enumC15204 != EnumC15204.f46554 && enumC15204 != EnumC15204.f46442) {
                        c13420.f40109.add(m51693(C16014.m37867(str, " {}")));
                        C6615 c66112 = this.f6341;
                        if (c66112.f20355 == EnumC15204.f46591) {
                            c66112.m18126();
                        }
                    }
                }
                c6615.m18132(EnumC15204.f46442);
                return c13420;
            default:
                C3917 c39129 = this.f6339;
                C6615 c66113 = this.f6341;
                throw C19462.m44860(c39129, c66113.f20363, "Incorrect Annotation, unrecognized token: \"{0}\"", new Object[]{c66113.f20355});
        }
    }
}
