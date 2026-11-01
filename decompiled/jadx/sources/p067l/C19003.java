package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19003 extends AbstractC13599 {

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final /* synthetic */ int f56656 = 0;

    /* JADX INFO: renamed from: ۖۧ */
    public int f56657;

    /* JADX INFO: renamed from: ۘۧ */
    public C19674 f56658;

    /* JADX INFO: renamed from: ۜۧ */
    public C11176 f56659;

    /* JADX INFO: renamed from: ۡۧ */
    public C18312 f56660;

    /* JADX INFO: renamed from: ۢۧ */
    public C18963 f56661;

    /* JADX INFO: renamed from: ܺۧ */
    public ArrayList f56662;

    /* JADX INFO: renamed from: ᩴۧ */
    public C18312 f56663;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f56664;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C4726 f56665;

    public C19003(C22161 c22161) {
        super(c22161);
        this.f56658 = null;
        this.f32297 = EnumC3290.METHOD_DATA;
        this.f38254 = "MethodData";
        this.f32298 = c22161.f38266.f32298;
        this.f56662 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20569(DataInputStream dataInputStream, EnumC6799 enumC6799, int i) throws IOException {
        Object[] objArr = 0;
        switch (C12969.f36484[enumC6799.ordinal()]) {
            case 1:
                C4726 c4726 = new C4726(this);
                this.f56665 = c4726;
                c4726.m10014(i, dataInputStream);
                return true;
            case 2:
                if (this.f38268 != null) {
                    this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "method_info");
                }
                C8925 c8925 = new C8925((C22161) this.f38259);
                c8925.m20620(i, dataInputStream);
                this.f38268 = c8925;
                return true;
            case 3:
                C18963 c18963 = new C18963((C22161) this.f38259);
                c18963.m21124(i, dataInputStream);
                this.f56661 = c18963;
                return true;
            case 4:
                int unsignedByte = dataInputStream.readUnsignedByte();
                this.f38257.m48074(new C9575(unsignedByte, objArr == true ? 1 : 0));
                this.f56662 = new ArrayList(unsignedByte);
                for (int i2 = 0; i2 < unsignedByte; i2++) {
                    short unsignedShort = (short) dataInputStream.readUnsignedShort();
                    int unsignedShort2 = dataInputStream.readUnsignedShort();
                    this.f38257.m48090(String.format("()->MethodParameter[%d] = { name[%d]: \"%s\" modifiers[%d]: %s}", Integer.valueOf(i2), Short.valueOf(unsignedShort), this.f38266.m27987(unsignedShort, new C4541(8)), Integer.valueOf(unsignedShort2), EnumC8140.m18880(unsignedShort2, EnumC21552.METHOD)), new Object[0]);
                    ArrayList arrayList = this.f56662;
                    C18332 c18332 = new C18332();
                    c18332.f54743 = unsignedShort2;
                    c18332.f54744 = unsignedShort;
                    arrayList.add(i2, c18332);
                }
                return true;
            case 5:
            case 6:
                boolean z = enumC6799 == EnumC6799.f17645;
                C18312 c18312 = new C18312(this, z);
                c18312.m41745(dataInputStream);
                if (z) {
                    this.f56660 = c18312;
                    return true;
                }
                this.f56663 = c18312;
                return true;
            case 7:
                this.f56659 = C9834.m23011(dataInputStream, this.f38259, false);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    private boolean m43149() {
        if (this.f56658 == null) {
            C18312 c18312 = this.f56663;
            int iM41746 = c18312 != null ? c18312.m41746() : 0;
            C18312 c18313 = this.f56660;
            this.f56658 = new C19674(iM41746, c18313 != null ? c18313.m41746() : 0);
        }
        if (this.f56658.m44685()) {
            return true;
        }
        ArrayList arrayList = this.f56662;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m43150() {
        if (m43149()) {
            m26678(1);
            int i = this.f32284 ? 7 : 5;
            ArrayList arrayList = this.f56662;
            int i2 = 0;
            int iMax = Math.max(this.f56658.m44687(), Math.max(arrayList != null ? arrayList.size() : 0, this.f56658.m44686()));
            String[] strArr = new String[iMax];
            if (this.f56662 != null) {
                for (int i3 = 0; i3 < iMax; i3++) {
                    C18332 c18332 = (C18332) this.f56662.get(i3);
                    strArr[i3] = C22934.m51254(EnumC16818.f49719, new StringBuilder(), "{ ");
                    if (this.f32275) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr[i3]);
                        int i4 = c18332.f54744;
                        int i5 = c18332.f54743;
                        sb.append(String.format("#%d ", Integer.valueOf(i4)));
                        strArr[i3] = sb.toString();
                        if (!this.f32292 && i4 != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(strArr[i3]);
                            sb2.append("/* " + ((C22161) this.f38259).f38266.m27987(i4, new C5270(6)) + " */ ");
                            strArr[i3] = sb2.toString();
                        }
                        if (i5 != 0) {
                            strArr[i3] = strArr[i3] + EnumC8140.m18861(i5, EnumC21552.METHOD_PARAMETERS);
                        }
                    } else {
                        int i6 = c18332.f54744;
                        int i7 = c18332.f54743;
                        if (i6 != 0) {
                            strArr[i3] = strArr[i3] + ((C22161) this.f38259).f38266.m27987(c18332.f54744, new C4251(i2)) + " ";
                        } else {
                            strArr[i3] = C10965.m25286(new StringBuilder(), strArr[i3], "#0 ");
                        }
                        if (i7 != 0) {
                            strArr[i3] = strArr[i3] + EnumC8140.m18861(i7, EnumC21552.METHOD_PARAMETERS);
                        }
                    }
                    strArr[i3] = C10965.m25286(new StringBuilder(), strArr[i3], C0249l.f1198d);
                }
            }
            int i8 = 0;
            while (i8 < iMax) {
                ArrayList arrayList2 = (this.f56663 == null || i8 >= this.f56658.m44687()) ? null : this.f56663.get(i8);
                ArrayList arrayList3 = (this.f56660 == null || i8 >= this.f56658.m44686()) ? null : this.f56660.get(i8);
                ArrayList arrayList4 = this.f56662;
                C18332 c18333 = arrayList4 != null ? (C18332) arrayList4.get(i8) : null;
                boolean z = (arrayList2 == null && arrayList3 == null) ? false : true;
                if (c18333 != null || z) {
                    m26672(m26671(i, String.format("%2d: ", Integer.valueOf(i8))));
                    if (c18333 != null) {
                        m26675(3, strArr[i8]);
                    }
                    m43148(arrayList2);
                    m43148(arrayList3);
                    m26681();
                }
                i8++;
            }
            m26667(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43148(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C8493 c8493 = (C8493) it.next();
                m26681();
                m26668(m26677(3, ""));
                c8493.mo24245(EnumC8234.PARAMETER_ANNOTATION);
                c8493.m26684(m26670() + 3);
                c8493.mo5334();
            }
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۧ */
    public final void mo6308(int i, int i2) {
        int i3;
        AbstractC10857 abstractC10857M29496;
        int iIndexOf;
        C8925 c8925 = this.f38268;
        boolean z = (c8925 == null || c8925.f32289) ? false : true;
        boolean z2 = z && c8925.mo26663();
        boolean z3 = this.f56661 != null;
        boolean z4 = this.f56665 != null || m43149() || z3;
        boolean z5 = (z4 || z2) ? false : true;
        if (i > 0) {
            m26681();
        }
        if (this.f32278) {
            int size = !EnumC8140.m18874(this.f38256) ? 1 : 0;
            String str = m26664() + " *  ";
            int i4 = this.f38256;
            EnumC21552 enumC21552 = EnumC21552.METHOD;
            String strConcat = EnumC8140.m18861(i4, enumC21552).concat(m30957());
            C8925 c8926 = this.f38268;
            if (c8926 != null) {
                abstractC10857M29496 = c8926.m20626();
            } else {
                this.f38257.getClass();
                abstractC10857M29496 = new C12869(this.f56664).m29496(this.f38266);
            }
            C12102 c12102 = ((C22161) this.f38259).f38266;
            int i5 = this.f56657;
            C7929 c7929 = C12102.f33839;
            String strM27987 = c12102.m27987(i5, c7929);
            boolean zEquals = strM27987.equals("<init>");
            String string = abstractC10857M29496.toString();
            if (abstractC10857M29496 instanceof C16220) {
                size += ((C16220) abstractC10857M29496).f47723.size();
            }
            if (zEquals) {
                strM27987 = ((C22161) this.f38259).f70102;
                string = string.substring(string.indexOf(MotionUtils.EASING_TYPE_FORMAT_START));
                iIndexOf = 0;
            } else {
                iIndexOf = string.indexOf(40);
            }
            String strReplaceAll = string.substring(0, iIndexOf).concat(strM27987).concat(string.substring(iIndexOf)).replaceAll("/", ".");
            String strM27988 = ((C22161) this.f38259).f38266.m27987(this.f56664, c7929);
            m26679("/**");
            m26676(str + strConcat + strReplaceAll);
            String strConcat2 = str.concat(m26664());
            m26676(strConcat2 + "descriptor: " + strM27988);
            if (this.f38268 != null) {
                StringBuilder sbM21133 = C9179.m21133(strConcat2, "signature:  ");
                sbM21133.append(((C22161) this.f38259).f38266.m27987(this.f38268.m20622(), c7929));
                m26676(sbM21133.toString());
            }
            StringBuilder sbM17248 = C7470.m17248(strConcat2);
            sbM17248.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f38256), EnumC8140.m18880(this.f38256, enumC21552)));
            m26676(sbM17248.toString());
            m26676(strConcat2 + String.format("stack: %d, locals: %d, args_size: %d", Integer.valueOf(this.f56665.f10700), Integer.valueOf(this.f56665.f10696), Integer.valueOf(size)));
            m26679(" */");
        }
        mo10015(this.f38267, this.f38261);
        mo10015(this.f38265, this.f38269);
        String strConcat3 = EnumC8140.m18861(this.f38256, EnumC21552.METHOD).concat(m30957()).concat(EnumC16818.f49738.m38127());
        String strM26671 = m26671(Math.max(strConcat3.length() + 1, (m26670() * 2) + EnumC3290.SIGNATURE.m5731().length()), strConcat3);
        int length = strM26671.length() - m26670();
        C8537 c8537M20619 = z ? this.f38268.m20619(new Function() { // from class: l.᩺ܽ֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f77084.f38266.m27990(((Integer) obj).intValue()));
            }
        }) : new C8537("", "");
        boolean z6 = this.f32275;
        String str2 = C0249l.f1196b;
        if (z6) {
            String strConcat4 = strM26671.concat(String.format("#%d:#%d", Integer.valueOf(this.f56657), Integer.valueOf(this.f56664))).concat((String) c8537M20619.f22916);
            if (z5 && this.f56659 == null) {
                strConcat4 = strConcat4.concat(C0249l.f1196b);
            }
            if (!this.f32292) {
                m26672(m26671(this.f32298, strConcat4));
                m26668((this.f56659 != null ? " /* " : " // ").concat(((C22161) this.f38259).f38266.getName(this.f56657) + ":" + ((C22161) this.f38259).f38266.getName(this.f56664)).concat((String) c8537M20619.f22917).concat(this.f56659 != null ? " */ " : " "));
            } else if (this.f56659 != null) {
                m26672(m26671(this.f32298, strConcat4));
            } else {
                m26672(strConcat4);
            }
        } else {
            String strConcat5 = strM26671.concat(((C22161) this.f38259).f38266.getName(this.f56657) + ":").concat(((C22161) this.f38259).f38266.getName(this.f56664)).concat((String) c8537M20619.f22917);
            if (z5 && this.f56659 == null) {
                strConcat5 = strConcat5.concat(C0249l.f1196b);
            }
            m26672(strConcat5);
        }
        C11176 c11176 = this.f56659;
        if (c11176 != null) {
            c11176.m26678(1);
            c11176.f32298 = m26670() - m26683();
            this.f56659.mo24245(EnumC8234.HAS_DEFAULT_VALUE);
            this.f56659.mo5334();
            if (!z4) {
                if (z2) {
                    str2 = ",";
                }
                m26668(str2);
            }
        }
        if (z2) {
            m26681();
            C8925 c8927 = this.f38268;
            c8927.m20629();
            c8927.m20625(length);
            i3 = 1;
            c8927.m26678(1);
            c8927.f32298 = this.f32298 - m26683();
            this.f38268.m20621(!z3);
            this.f38268.mo5334();
        } else {
            i3 = 1;
        }
        if (this.f56661 != null) {
            m26681();
            C18963 c18963 = this.f56661;
            c18963.m43084(length);
            c18963.m26678(i3);
            c18963.f32298 = this.f32298 - m26683();
            this.f56661.mo5334();
        } else {
            m26681();
        }
        C4726 c4726 = this.f56665;
        if (c4726 != null) {
            c4726.f32298 = this.f32298;
            c4726.mo5334();
        } else if (m43149()) {
            m43150();
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        mo6308(i, i2);
    }
}
