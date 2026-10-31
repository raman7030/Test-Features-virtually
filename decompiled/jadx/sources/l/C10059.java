package l;

/* JADX INFO: renamed from: l.ۤۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95X4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10059 extends C20454 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f30237;

    public C10059(boolean[] zArr) {
        this.f30237 = zArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    @Override // l.C20454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8396 mo25248(AbstractC8396 abstractC8396) {
        String str;
        EnumC1340 enumC1340 = abstractC8396.f25745;
        EnumC1340 enumC1341 = EnumC1340.CHECK_CAST;
        if (enumC1340 == enumC1341) {
            C16156 c16156 = (C16156) abstractC8396;
            AbstractC8396 abstractC8397 = c16156.f63597;
            if (abstractC8397.f25745 == enumC1341) {
                C16156 c16157 = (C16156) abstractC8397;
                if (c16156.f49779.equals(c16157.f49779)) {
                    abstractC8396 = c16157;
                }
            }
        }
        super.mo25248(abstractC8396);
        if (abstractC8396.f25745 == enumC1341) {
            C16156 c16158 = (C16156) abstractC8396;
            String str2 = c16158.f49779;
            if (str2.charAt(0) == '[') {
                AbstractC8396 abstractC8398 = c16158.f63597;
                if (abstractC8398.f25745 == EnumC1340.INVOKE_STATIC) {
                    C11219 c11219 = (C11219) abstractC8398;
                    C7338 c7338 = c11219.f33657;
                    if (c7338.m19700().equals("newInstance") && c7338.m19702().equals("Ljava/lang/reflect/Array;")) {
                        if (c7338.m19704().length == 2 && c7338.m19704()[0].equals("Ljava/lang/Class;")) {
                            AbstractC8396 abstractC8399 = c11219.f17269[0];
                            EnumC1340 enumC1342 = abstractC8399.f25745;
                            if (enumC1342 == EnumC1340.CONSTANT) {
                                str = ((C22860) ((C11987) abstractC8399).f35889).f73758;
                            } else if (enumC1342 == EnumC1340.STATIC_FIELD) {
                                C9808 c9808 = (C9808) abstractC8399;
                                String str3 = c9808.f29647;
                                if (str3.startsWith("Ljava/lang/") && c9808.f29645.equals("TYPE")) {
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
                                AbstractC8396 abstractC83910 = c11219.f17269[1];
                                boolean zEquals = c7338.m19704()[1].equals("I");
                                boolean[] zArr = this.f30237;
                                if (zEquals) {
                                    if (str2.equals("[".concat(str))) {
                                        int i = 0;
                                        while (str.charAt(i) == '[') {
                                            i++;
                                        }
                                        zArr[0] = true;
                                        return i > 0 ? new C14745(str.substring(i), i + 1, new AbstractC8396[]{abstractC83910}) : new C16156(EnumC1340.NEW_ARRAY, abstractC83910, str);
                                    }
                                } else if (abstractC83910.f25745 == EnumC1340.FILLED_ARRAY) {
                                    C7753 c7753 = (C7753) abstractC83910;
                                    int length = c7753.f17269.length;
                                    if (str2.length() > length && str2.substring(length).equals(str)) {
                                        int i2 = 0;
                                        while (str.charAt(i2) == '[') {
                                            i2++;
                                        }
                                        zArr[0] = true;
                                        return new C14745(str.substring(i2), i2 + length, c7753.f17269);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return abstractC8396;
    }
}
