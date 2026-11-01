package p067l;

/* JADX INFO: renamed from: l.ۤۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95X4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11928 extends C21808 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ boolean[] f33195;

    public C11928(boolean[] zArr) {
        this.f33195 = zArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    @Override // p067l.C21808
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo27265(AbstractC10348 abstractC10348) {
        String str;
        EnumC3642 enumC3642 = abstractC10348.f28658;
        EnumC3642 enumC3643 = EnumC3642.CHECK_CAST;
        if (enumC3642 == enumC3643) {
            C17723 c17723 = (C17723) abstractC10348;
            AbstractC10348 abstractC10349 = c17723.f66218;
            if (abstractC10349.f28658 == enumC3643) {
                C17723 c17724 = (C17723) abstractC10349;
                if (c17723.f52945.equals(c17724.f52945)) {
                    abstractC10348 = c17724;
                }
            }
        }
        super.mo27265(abstractC10348);
        if (abstractC10348.f28658 == enumC3643) {
            C17723 c17725 = (C17723) abstractC10348;
            String str2 = c17725.f52945;
            if (str2.charAt(0) == '[') {
                AbstractC10348 abstractC103410 = c17725.f66218;
                if (abstractC103410.f28658 == EnumC3642.INVOKE_STATIC) {
                    C13031 c13031 = (C13031) abstractC103410;
                    C9342 c9342 = c13031.f36656;
                    if (c9342.m21673().equals("newInstance") && c9342.m21675().equals("Ljava/lang/reflect/Array;")) {
                        if (c9342.m21677().length == 2 && c9342.m21677()[0].equals("Ljava/lang/Class;")) {
                            AbstractC10348 abstractC103411 = c13031.f20109[0];
                            EnumC3642 enumC3644 = abstractC103411.f28658;
                            if (enumC3644 == EnumC3642.CONSTANT) {
                                str = ((C24094) ((C13761) abstractC103411).f38899).f76489;
                            } else if (enumC3644 == EnumC3642.STATIC_FIELD) {
                                C11690 c11690 = (C11690) abstractC103411;
                                String str3 = c11690.f32598;
                                if (str3.startsWith("Ljava/lang/") && c11690.f32596.equals("TYPE")) {
                                    switch (str3) {
                                        case "Ljava/lang/Integer;":
                                            str = "I";
                                            break;
                                        case "Ljava/lang/Boolean;":
                                            str = "Z";
                                            break;
                                        case "Ljava/lang/Double;":
                                            str = "D";
                                            break;
                                        case "Ljava/lang/Character;":
                                            str = "C";
                                            break;
                                        case "Ljava/lang/Float;":
                                            str = "F";
                                            break;
                                        case "Ljava/lang/Byte;":
                                            str = "B";
                                            break;
                                        case "Ljava/lang/Long;":
                                            str = "J";
                                            break;
                                        case "Ljava/lang/Void;":
                                            str = "V";
                                            break;
                                        case "Ljava/lang/Short;":
                                            str = "S";
                                            break;
                                        default:
                                            str = null;
                                            break;
                                    }
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                AbstractC10348 abstractC103412 = c13031.f20109[1];
                                boolean zEquals = c9342.m21677()[1].equals("I");
                                boolean[] zArr = this.f33195;
                                if (zEquals) {
                                    if (str2.equals("[".concat(str))) {
                                        int i = 0;
                                        while (str.charAt(i) == '[') {
                                            i++;
                                        }
                                        zArr[0] = true;
                                        return i > 0 ? new C16382(str.substring(i), i + 1, new AbstractC10348[]{abstractC103412}) : new C17723(EnumC3642.NEW_ARRAY, abstractC103412, str);
                                    }
                                } else if (abstractC103412.f28658 == EnumC3642.FILLED_ARRAY) {
                                    C9737 c9737 = (C9737) abstractC103412;
                                    int length = c9737.f20109.length;
                                    if (str2.length() > length && str2.substring(length).equals(str)) {
                                        int i2 = 0;
                                        while (str.charAt(i2) == '[') {
                                            i2++;
                                        }
                                        zArr[0] = true;
                                        return new C16382(str.substring(i2), i2 + length, c9737.f20109);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return abstractC10348;
    }
}
