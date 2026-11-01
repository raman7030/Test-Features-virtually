package p067l;

import android.os.Build;
import android.text.TextUtils;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import net.p069sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܺܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public class C17551 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩶֫ */
    public static final /* synthetic */ int f52448 = 0;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f52454;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f52455;

    /* JADX INFO: renamed from: ᩵֫ */
    public String f52456;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f52457;

    /* JADX INFO: renamed from: ֨֫ */
    public C19056 f52450 = new C19056();

    /* JADX INFO: renamed from: ۘ֫ */
    public C6727 f52451 = new C6727(false);

    /* JADX INFO: renamed from: ۚ֫ */
    public HashSet f52452 = new HashSet();

    /* JADX INFO: renamed from: ᩹֫ */
    public C17898 f52458 = new C17898();

    /* JADX INFO: renamed from: ֡֫ */
    public HashSet f52449 = new HashSet();

    /* JADX INFO: renamed from: ۠֫ */
    public final HashSet f52453 = new HashSet();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        String[] strArrM13494 = m13494("ARG_PATHS");
        return strArrM13494.length == 1 ? C7050.m16203(R.string.MT_Protector, C11419.m26414(strArrM13494[0])) : C7050.m16203(R.string.MT_Protector, m13467("extractDir"));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0242 */
    /* JADX WARN: Code duplicated, block: B:248:0x0571 A[Catch: all -> 0x07fa, TRY_ENTER, TryCatch #7 {all -> 0x07fa, blocks: (B:212:0x04a5, B:222:0x04ea, B:229:0x0503, B:230:0x050b, B:234:0x0523, B:248:0x0571, B:249:0x0577, B:256:0x0595, B:257:0x05ab, B:259:0x05b1, B:226:0x04fc), top: B:365:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:251:0x057d A[Catch: all -> 0x04e7, TRY_ENTER, TryCatch #5 {all -> 0x04e7, blocks: (B:215:0x04b2, B:216:0x04bb, B:218:0x04cb, B:224:0x04f8, B:232:0x0511, B:237:0x052c, B:238:0x0535, B:240:0x053b, B:242:0x0557, B:243:0x055b, B:244:0x0563, B:246:0x0569, B:251:0x057d, B:253:0x0589, B:228:0x0500), top: B:361:0x04b2 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x05b1 A[Catch: all -> 0x07fa, TRY_LEAVE, TryCatch #7 {all -> 0x07fa, blocks: (B:212:0x04a5, B:222:0x04ea, B:229:0x0503, B:230:0x050b, B:234:0x0523, B:248:0x0571, B:249:0x0577, B:256:0x0595, B:257:0x05ab, B:259:0x05b1, B:226:0x04fc), top: B:365:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x05cf A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:264:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:269:0x0619 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0628  */
    /* JADX WARN: Code duplicated, block: B:272:0x0642 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:274:0x064d A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:277:0x067c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x067e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0684  */
    /* JADX WARN: Code duplicated, block: B:283:0x0685 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:296:0x0706 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:298:0x070a A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:301:0x0712 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0765 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:261:0x05bb, B:263:0x05cf, B:265:0x05fc, B:267:0x0614, B:269:0x0619, B:271:0x062a, B:272:0x0642, B:274:0x064d, B:293:0x06c9, B:296:0x0706, B:298:0x070a, B:299:0x070d, B:301:0x0712, B:302:0x0723, B:283:0x0685, B:284:0x068a, B:286:0x06a3, B:288:0x06b1, B:290:0x06b7, B:305:0x0757, B:306:0x075f, B:308:0x0765, B:310:0x0773), top: B:355:0x05bb }] */
    /* JADX WARN: Code duplicated, block: B:392:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:? A[LOOP:4: B:75:0x01ee->B:394:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0577 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x067a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0681 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x068a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0773 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5 A[Catch: all -> 0x0234, TRY_LEAVE, TryCatch #3 {all -> 0x0234, blocks: (B:74:0x01de, B:75:0x01ee, B:77:0x01f5), top: B:357:0x01de, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0208 A[Catch: all -> 0x0242, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:73:0x01da, B:79:0x01ff, B:82:0x0208, B:96:0x0241, B:95:0x023e, B:74:0x01de, B:75:0x01ee, B:77:0x01f5, B:91:0x0238), top: B:353:0x01da, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:438:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:263:0x05cf, please report this as an issue */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C18736 mo5125() throws Throwable {
        ArrayList<C10847> arrayList;
        int i;
        Throwable th;
        long size;
        int size2;
        boolean zM16218;
        ArrayList<C12859> arrayList2;
        Iterator it;
        int i2;
        AbstractC17043 abstractC17043;
        long size3;
        AbstractC17043 abstractC17044;
        C5738 c5738;
        AbstractC17043 abstractC17043M38684;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        AbstractC17043 abstractC17045;
        long j;
        long j2;
        C19056 c19056;
        boolean[] zArr;
        AbstractC17043 abstractC17046;
        C19056 c19057;
        long j3;
        int iM39952;
        BufferedInputStream bufferedInputStream;
        HashSet hashSet;
        ArrayList arrayList4;
        C2742 c2742;
        AbstractC17043 abstractC17047;
        ArrayList arrayList5;
        C3659 c3659;
        C13315 c13315;
        C13985 c13985M30395;
        AbstractC17043 abstractC17043M38685;
        C13315 c13316;
        C13985 c13985;
        AbstractC17043 abstractC17048;
        AbstractC17043 abstractC17043M38650;
        C20810 c20810Mo30393;
        OutputStream outputStreamMo25506;
        byte[] bArr;
        int i3;
        String[] strArrM13494 = m13494("ARG_PATHS");
        C17898 c17898 = new C17898();
        int i4 = 0;
        for (String str4 : strArrM13494) {
            c17898.m40702(C18524.m42109(str4, new String[0]));
        }
        this.f52458 = c17898;
        EnumC6213[] enumC6213Arr = new EnumC6213[strArrM13494.length];
        for (int i5 = 0; i5 < strArrM13494.length && !mo3924(); i5++) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(strArrM13494[i5], new String[0]);
            EnumC6213 enumC6213M47293 = C20966.m47293(abstractC17043M42109);
            enumC6213Arr[i5] = enumC6213M47293;
            if (enumC6213M47293 == EnumC6213.f15648) {
                this.f52458.m40703(abstractC17043M42109, C19561.m44435(abstractC17043M42109));
            }
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        AbstractC17043 abstractC17043M421010 = C18524.m42109(m13492("extractDir"), new String[0]);
        boolean zM13488 = m13488("separateFolder");
        int iM13484 = m13484("relativeNameSubStart");
        this.f52455 = m13488("extractToAnother");
        boolean zM13489 = m13488("deleteSources");
        int i6 = 1;
        this.f52457 = strArrM13494.length == 1;
        ArrayList arrayList6 = new ArrayList();
        int length = strArrM13494.length;
        int i7 = 0;
        while (i7 < length) {
            String str5 = MotionUtils.EASING_TYPE_FORMAT_END;
            String str6 = "/";
            String str7 = MotionUtils.EASING_TYPE_FORMAT_START;
            if (length > i6) {
                mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + (i7 + 1) + "/" + length + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            AbstractC17043 abstractC17043M421011 = C18524.m42109(strArrM13494[i7], new String[i4]);
            EnumC6213 enumC6213 = enumC6213Arr[i7];
            AbstractC17043 abstractC17043M38686 = zM13488 ? abstractC17043M421010.m38684(abstractC17043M421011.m38675()) : abstractC17043M421010;
            int i8 = C4141.f9138[enumC6213.ordinal()];
            String[] strArr = strArrM13494;
            C6727 c6727 = this.f52451;
            EnumC6213[] enumC6213Arr2 = enumC6213Arr;
            C19056 c19058 = this.f52450;
            int i9 = length;
            AbstractC17043 abstractC17049 = abstractC17043M38686;
            if (i8 == 1) {
                arrayList = arrayList6;
                abstractC17043M421010 = abstractC17043M421010;
                zM13488 = zM13488;
                zM13489 = zM13489;
                AbstractC17043 abstractC170410 = abstractC17049;
                i = i7;
                m52467();
                ArrayList arrayList7 = zM13489 ? arrayList : null;
                C19561 c19561 = new C19561(abstractC17043M421011);
                try {
                    byte[] bArrM44447 = c19561.m44447();
                    this.f52458.m40703(abstractC17043M421011, bArrM44447);
                    if (arrayList7 != null) {
                        if (bArrM44447 == null) {
                            try {
                                arrayList7.add(new C10847(abstractC17043M421011));
                            } catch (Throwable th2) {
                                th = th2;
                                c19561 = c19561;
                                try {
                                    c19561.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                    throw th;
                                }
                            }
                        } else {
                            AbstractC17043 abstractC17043M38672 = abstractC17043M421011.m38672();
                            C14677 c14677 = new C14677(bArrM44447);
                            int i10 = c14677.readInt();
                            int i11 = 0;
                            while (i11 < i10) {
                                int i12 = i10;
                                arrayList7.add(new C10847(abstractC17043M38672.m38684(c14677.m33593())));
                                c14677.skipBytes(8);
                                i11++;
                                i10 = i12;
                            }
                        }
                    }
                    String strM28241 = C12248.m28241(abstractC17043M421011.mo25505());
                    if (TextUtils.isEmpty(strM28241)) {
                        String str8 = this.f52456;
                        if (str8 != null) {
                            c19561.m44451(str8);
                        }
                    } else {
                        c19561.m44451(strM28241);
                    }
                    ArrayList<C5738> arrayListM44453 = c19561.m44453();
                    for (C5738 c5739 : arrayListM44453) {
                        C18524.m42103(c5739.getName(), c5739.isDirectory());
                    }
                    m39960(abstractC170410);
                    if (Build.VERSION.SDK_INT >= 30) {
                        C10024 c10024 = new C10024();
                        for (C5738 c57310 : arrayListM44453) {
                            AbstractC17043 abstractC17043M38687 = abstractC170410.m38684(C18524.m42103(c57310.getName(), c57310.isDirectory()));
                            if (c57310.isDirectory()) {
                                c10024.m23403(abstractC17043M38687);
                            } else {
                                c10024.m23403(abstractC17043M38687.m38694());
                            }
                        }
                        if (c10024.m23404()) {
                            size = 0;
                            for (C5738 c57311 : arrayListM44453) {
                                if (!c57311.isDirectory()) {
                                    size += c57311.getSize();
                                }
                            }
                            size2 = arrayListM44453.size();
                            zM16218 = C7050.m16218();
                            arrayList2 = new ArrayList();
                            it = arrayListM44453.iterator();
                            i2 = 0;
                            abstractC17043 = abstractC17043M421011;
                            size3 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    c19561 = c19561;
                                    for (C12859 c12859 : arrayList2) {
                                        abstractC17044 = c12859.f36172;
                                        if (abstractC17044.mo29973()) {
                                            abstractC17044.mo20486(c12859.f36173);
                                        }
                                    }
                                    break;
                                }
                                c5738 = (C5738) it.next();
                                c19561 = c19561;
                                try {
                                    c6727 = c6727;
                                    String strM42103 = C18524.m42103(c5738.getName(), c5738.isDirectory());
                                    i2++;
                                    if (this.f52457) {
                                        mo13482(C7050.m16224(R.string.MT_Protector) + str7 + i2 + str6 + size2 + str5);
                                    }
                                    mo13456(strM42103);
                                    m52469(0);
                                    mo13474(C20689.m46750(size3, size));
                                    abstractC17043M38684 = abstractC170410.m38684(strM42103);
                                    if (c5738.isDirectory()) {
                                        m39958(abstractC17043M38684);
                                        if (zM16218) {
                                            arrayList2.add(new C12859(abstractC17043M38684, c5738.getTime()));
                                        }
                                        m39961(abstractC17043M38684.mo25505().substring(iM13484));
                                        str = str6;
                                        str2 = str7;
                                        str3 = str5;
                                        arrayList3 = arrayList2;
                                        abstractC17045 = abstractC17043;
                                        size3 = size3;
                                    } else {
                                        j = size3;
                                        this.f52454 = false;
                                        if (abstractC17043M38684.mo25094()) {
                                            j2 = j;
                                            abstractC17045 = abstractC17043;
                                            str = str6;
                                            str2 = str7;
                                            str3 = str5;
                                            arrayList3 = arrayList2;
                                            iM39952 = m39952(abstractC17043M38684, abstractC17043M38684.mo25505().substring(iM13484), c5738.getSize(), c5738.getTime());
                                            if (!mo3924()) {
                                                break;
                                            }
                                            if (iM39952 != 0) {
                                                c19056 = c19058;
                                                c19056.m43296(abstractC17043M38684);
                                                this.f52454 = true;
                                                if (c6727.mo15383() && abstractC17043M38684.mo31068()) {
                                                    abstractC17043M38684.mo31069(this);
                                                }
                                            } else if (iM39952 != 1) {
                                                size3 = j2 + c5738.getSize();
                                            } else if (iM39952 != 2) {
                                                abstractC17043M38684 = abstractC17043M38684.m38650(true);
                                            }
                                            m39958(abstractC17043M38684.m38694());
                                            zArr = new boolean[]{false};
                                            abstractC17046 = abstractC170410;
                                            c19057 = c19056;
                                            j3 = size;
                                            C23775.m52844(abstractC17045.mo25505(), c19561, c5738, abstractC17043M38684, false, new C18893(this, j2, size, c19561, zArr, c5738));
                                            if (mo3924()) {
                                                break;
                                            }
                                            if (this.f52454) {
                                                c19057.m43298(abstractC17043M38684);
                                            }
                                            if (zArr[0]) {
                                                C12248.m28246(abstractC17045.mo25505(), c19561.m44467());
                                                this.f52456 = c19561.m44467();
                                            }
                                            size3 = c5738.getSize() + j2;
                                            int i13 = C16114.f47424;
                                            C16114.m36688(abstractC17043M38684.mo25505(), true);
                                            m39961(abstractC17043M38684.mo25505().substring(iM13484));
                                            abstractC17043 = abstractC17045;
                                            c19058 = c19057;
                                            abstractC170410 = abstractC17046;
                                            str6 = str;
                                            str7 = str2;
                                            str5 = str3;
                                            arrayList2 = arrayList3;
                                            size = j3;
                                        } else {
                                            str = str6;
                                            str2 = str7;
                                            str3 = str5;
                                            arrayList3 = arrayList2;
                                            abstractC17045 = abstractC17043;
                                            j2 = j;
                                        }
                                        c19056 = c19058;
                                        m39958(abstractC17043M38684.m38694());
                                        zArr = new boolean[]{false};
                                        abstractC17046 = abstractC170410;
                                        c19057 = c19056;
                                        j3 = size;
                                        C23775.m52844(abstractC17045.mo25505(), c19561, c5738, abstractC17043M38684, false, new C18893(this, j2, size, c19561, zArr, c5738));
                                        if (mo3924()) {
                                            break;
                                            break;
                                        }
                                        if (this.f52454) {
                                            c19057.m43298(abstractC17043M38684);
                                        }
                                        if (zArr[0]) {
                                            C12248.m28246(abstractC17045.mo25505(), c19561.m44467());
                                            this.f52456 = c19561.m44467();
                                        }
                                        size3 = c5738.getSize() + j2;
                                        int i14 = C16114.f47424;
                                        C16114.m36688(abstractC17043M38684.mo25505(), true);
                                        m39961(abstractC17043M38684.mo25505().substring(iM13484));
                                        abstractC17043 = abstractC17045;
                                        c19058 = c19057;
                                        abstractC170410 = abstractC17046;
                                        str6 = str;
                                        str7 = str2;
                                        str5 = str3;
                                        arrayList2 = arrayList3;
                                        size = j3;
                                    }
                                    abstractC17043 = abstractC17045;
                                    c19058 = c19058;
                                    str6 = str;
                                    str7 = str2;
                                    str5 = str3;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    c19561.close();
                                    throw th;
                                }
                            }
                            c19561.close();
                        } else {
                            cancel();
                            c19561.close();
                        }
                    } else {
                        size = 0;
                        while (r2.hasNext()) {
                            if (!c57311.isDirectory()) {
                                size += c57311.getSize();
                            }
                        }
                        size2 = arrayListM44453.size();
                        zM16218 = C7050.m16218();
                        arrayList2 = new ArrayList();
                        it = arrayListM44453.iterator();
                        i2 = 0;
                        abstractC17043 = abstractC17043M421011;
                        size3 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                c19561 = c19561;
                                while (r0.hasNext()) {
                                    abstractC17044 = c12859.f36172;
                                    if (abstractC17044.mo29973()) {
                                        abstractC17044.mo20486(c12859.f36173);
                                    }
                                }
                                break;
                                break;
                            }
                            c5738 = (C5738) it.next();
                            c19561 = c19561;
                            c6727 = c6727;
                            String strM42104 = C18524.m42103(c5738.getName(), c5738.isDirectory());
                            i2++;
                            if (this.f52457) {
                                mo13482(C7050.m16224(R.string.MT_Protector) + str7 + i2 + str6 + size2 + str5);
                            }
                            mo13456(strM42104);
                            m52469(0);
                            mo13474(C20689.m46750(size3, size));
                            abstractC17043M38684 = abstractC170410.m38684(strM42104);
                            if (c5738.isDirectory()) {
                                m39958(abstractC17043M38684);
                                if (zM16218) {
                                    arrayList2.add(new C12859(abstractC17043M38684, c5738.getTime()));
                                }
                                m39961(abstractC17043M38684.mo25505().substring(iM13484));
                                str = str6;
                                str2 = str7;
                                str3 = str5;
                                arrayList3 = arrayList2;
                                abstractC17045 = abstractC17043;
                                size3 = size3;
                            } else {
                                j = size3;
                                this.f52454 = false;
                                if (abstractC17043M38684.mo25094()) {
                                    j2 = j;
                                    abstractC17045 = abstractC17043;
                                    str = str6;
                                    str2 = str7;
                                    str3 = str5;
                                    arrayList3 = arrayList2;
                                    iM39952 = m39952(abstractC17043M38684, abstractC17043M38684.mo25505().substring(iM13484), c5738.getSize(), c5738.getTime());
                                    if (!mo3924()) {
                                        break;
                                        break;
                                    }
                                    if (iM39952 != 0) {
                                        c19056 = c19058;
                                        c19056.m43296(abstractC17043M38684);
                                        this.f52454 = true;
                                        if (c6727.mo15383()) {
                                            abstractC17043M38684.mo31069(this);
                                        }
                                    } else if (iM39952 != 1) {
                                        size3 = j2 + c5738.getSize();
                                    } else if (iM39952 != 2) {
                                        abstractC17043M38684 = abstractC17043M38684.m38650(true);
                                    }
                                    m39958(abstractC17043M38684.m38694());
                                    zArr = new boolean[]{false};
                                    abstractC17046 = abstractC170410;
                                    c19057 = c19056;
                                    j3 = size;
                                    C23775.m52844(abstractC17045.mo25505(), c19561, c5738, abstractC17043M38684, false, new C18893(this, j2, size, c19561, zArr, c5738));
                                    if (mo3924()) {
                                        break;
                                        break;
                                    }
                                    if (this.f52454) {
                                        c19057.m43298(abstractC17043M38684);
                                    }
                                    if (zArr[0]) {
                                        C12248.m28246(abstractC17045.mo25505(), c19561.m44467());
                                        this.f52456 = c19561.m44467();
                                    }
                                    size3 = c5738.getSize() + j2;
                                    int i15 = C16114.f47424;
                                    C16114.m36688(abstractC17043M38684.mo25505(), true);
                                    m39961(abstractC17043M38684.mo25505().substring(iM13484));
                                    abstractC17043 = abstractC17045;
                                    c19058 = c19057;
                                    abstractC170410 = abstractC17046;
                                    str6 = str;
                                    str7 = str2;
                                    str5 = str3;
                                    arrayList2 = arrayList3;
                                    size = j3;
                                } else {
                                    str = str6;
                                    str2 = str7;
                                    str3 = str5;
                                    arrayList3 = arrayList2;
                                    abstractC17045 = abstractC17043;
                                    j2 = j;
                                }
                                c19056 = c19058;
                                m39958(abstractC17043M38684.m38694());
                                zArr = new boolean[]{false};
                                abstractC17046 = abstractC170410;
                                c19057 = c19056;
                                j3 = size;
                                C23775.m52844(abstractC17045.mo25505(), c19561, c5738, abstractC17043M38684, false, new C18893(this, j2, size, c19561, zArr, c5738));
                                if (mo3924()) {
                                    break;
                                    break;
                                }
                                if (this.f52454) {
                                    c19057.m43298(abstractC17043M38684);
                                }
                                if (zArr[0]) {
                                    C12248.m28246(abstractC17045.mo25505(), c19561.m44467());
                                    this.f52456 = c19561.m44467();
                                }
                                size3 = c5738.getSize() + j2;
                                int i16 = C16114.f47424;
                                C16114.m36688(abstractC17043M38684.mo25505(), true);
                                m39961(abstractC17043M38684.mo25505().substring(iM13484));
                                abstractC17043 = abstractC17045;
                                c19058 = c19057;
                                abstractC170410 = abstractC17046;
                                str6 = str;
                                str7 = str2;
                                str5 = str3;
                                arrayList2 = arrayList3;
                                size = j3;
                            }
                            abstractC17043 = abstractC17045;
                            c19058 = c19058;
                            str6 = str;
                            str7 = str2;
                            str5 = str3;
                            arrayList2 = arrayList3;
                        }
                        c19561.close();
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c19561 = c19561;
                }
            } else if (i8 != 2) {
                if (i8 != 3) {
                    m52468();
                    C11801.m27052(null, abstractC17043M421011, new C8835(this, zM13489 ? arrayList6 : null, abstractC17049, iM13484, abstractC17043M421011));
                } else {
                    if (zM13489) {
                        arrayList6.add(new C10847(abstractC17043M421011));
                    }
                    m52468();
                    m39960(abstractC17049);
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            C10024 c10025 = new C10024();
                            c10025.m23403(abstractC17049);
                            if (!c10025.m23404()) {
                                cancel();
                            }
                            arrayList = arrayList6;
                            abstractC17043M421010 = abstractC17043M421010;
                            zM13488 = zM13488;
                            zM13489 = zM13489;
                        }
                        if (abstractC17043M38685.mo25094()) {
                            c13316 = c13315;
                            c13985 = c13985M30395;
                            i = i7;
                            int iM39953 = m39952(abstractC17043M38685, abstractC17043M38685.mo25505().substring(iM13484), c13985M30395.getSize(), c13985M30395.getTime());
                            if (!mo3924()) {
                                if (iM39953 != 0) {
                                    if (iM39953 != 1) {
                                        if (iM39953 != 2) {
                                            abstractC17048 = abstractC17043M38685;
                                        } else {
                                            abstractC17043M38650 = abstractC17043M38685.m38650(true);
                                        }
                                        m39958(abstractC17043M38650.m38694());
                                        c20810Mo30393 = c13316.mo30393(c13985);
                                        outputStreamMo25506 = abstractC17043M38650.mo25506(false);
                                        c20810Mo30393.m46980().m46753(new C20582(this));
                                        bArr = new byte[1024];
                                        while (true) {
                                            i3 = c20810Mo30393.read(bArr);
                                            if (i3 != -1) {
                                                if (outputStreamMo25506 != null) {
                                                    outputStreamMo25506.close();
                                                }
                                                c20810Mo30393.close();
                                                if (this.f52454) {
                                                    c19058.m43298(abstractC17043M38650);
                                                }
                                                int i17 = C16114.f47424;
                                                C16114.m36688(abstractC17043M38650.mo25505(), true);
                                                m39961(abstractC17043M38650.mo25505().substring(iM13484));
                                                break;
                                            }
                                            outputStreamMo25506.write(bArr, 0, i3);
                                            if (mo3924()) {
                                                outputStreamMo25506.close();
                                                c20810Mo30393.close();
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    abstractC17048 = abstractC17043M38685;
                                    c19058.m43296(abstractC17048);
                                    this.f52454 = true;
                                    if (c6727.mo15383() && abstractC17048.mo31068()) {
                                        abstractC17048.mo31069(this);
                                    }
                                }
                            }
                            arrayList = arrayList6;
                            abstractC17043M421010 = abstractC17043M421010;
                            zM13488 = zM13488;
                            zM13489 = zM13489;
                        } else {
                            c13316 = c13315;
                            c13985 = c13985M30395;
                            abstractC17048 = abstractC17043M38685;
                            i = i7;
                        }
                        c20810Mo30393.m46980().m46753(new C20582(this));
                        bArr = new byte[1024];
                        while (true) {
                            i3 = c20810Mo30393.read(bArr);
                            if (i3 != -1) {
                                if (outputStreamMo25506 != null) {
                                    outputStreamMo25506.close();
                                }
                                c20810Mo30393.close();
                                if (this.f52454) {
                                    c19058.m43298(abstractC17043M38650);
                                }
                                int i18 = C16114.f47424;
                                C16114.m36688(abstractC17043M38650.mo25505(), true);
                                m39961(abstractC17043M38650.mo25505().substring(iM13484));
                                break;
                            }
                            outputStreamMo25506.write(bArr, 0, i3);
                            if (mo3924()) {
                                outputStreamMo25506.close();
                                c20810Mo30393.close();
                                break;
                            }
                        }
                        arrayList = arrayList6;
                        abstractC17043M421010 = abstractC17043M421010;
                        zM13488 = zM13488;
                        zM13489 = zM13489;
                    } catch (Throwable th6) {
                        if (outputStreamMo25506 == null) {
                            throw th6;
                        }
                        try {
                            outputStreamMo25506.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                    c13315 = new C13315(abstractC17043M421011.mo25505());
                    c13315.mo9717(false);
                    c13985M30395 = c13315.m30395();
                    String name = c13985M30395.getName();
                    abstractC17043M38685 = abstractC17049.m38684(name);
                    if (this.f52457) {
                        m13472(R.string.MT_Protector);
                    }
                    mo13456(name);
                    m52469(0);
                    this.f52454 = false;
                    abstractC17043M38650 = abstractC17048;
                    m39958(abstractC17043M38650.m38694());
                    c20810Mo30393 = c13316.mo30393(c13985);
                    outputStreamMo25506 = abstractC17043M38650.mo25506(false);
                }
                i = i7;
                arrayList = arrayList6;
                abstractC17043M421010 = abstractC17043M421010;
                zM13488 = zM13488;
                zM13489 = zM13489;
            } else {
                AbstractC17043 abstractC170411 = abstractC17049;
                i = i7;
                if (zM13489) {
                    arrayList6.add(new C10847(abstractC17043M421011));
                }
                m52467();
                BufferedInputStream bufferedInputStreamM38676 = abstractC17043M421011.m38676();
                try {
                    final InputStream c16210 = new C16210(this, bufferedInputStreamM38676, abstractC17043M421011);
                    boolean zM16219 = C7050.m16218();
                    ArrayList<C12859> arrayList8 = new ArrayList();
                    HashSet hashSet2 = new HashSet();
                    String strMo25505 = abstractC170411.mo25505();
                    boolean z = (C18524.m42130(strMo25505) || C18524.m42120(strMo25505)) ? false : true;
                    ArrayList arrayList9 = new ArrayList();
                    C2742 c2743 = new C2742();
                    InputStream inputStreamM32740 = C14247.m32740(bufferedInputStreamM38676, new InterfaceC0923() { // from class: l.ܽܰܳ
                        @Override // p067l.InterfaceC0923
                        public final Object get() {
                            int i19 = C17551.f52448;
                            return c16210;
                        }
                    });
                    arrayList = arrayList6;
                    if (inputStreamM32740 != null) {
                        c16210 = inputStreamM32740;
                    }
                    C2742 c2744 = c2743;
                    C10365 c10365 = new C10365(c16210, 10240, null);
                    while (true) {
                        C3659 c3659M23992 = c10365.m23992();
                        if (c3659M23992 != null) {
                            boolean z2 = z && c3659M23992.m7008();
                            String strM42105 = C18524.m42103(c3659M23992.m6979(), z2 ? false : c3659M23992.m7006());
                            C11518 c11518 = z2 ? new C11518(strM42105, C18524.m42124(strM42105, c3659M23992.m7005()), c3659M23992.m7006()) : null;
                            m39960(abstractC170411);
                            AbstractC17043 abstractC17043M38688 = abstractC170411.m38684(strM42105);
                            AbstractC17043 abstractC170412 = abstractC170411;
                            if (Build.VERSION.SDK_INT >= 30) {
                                AbstractC17043 abstractC17043M38673 = (!z2 && c3659M23992.m7006()) ? abstractC17043M38688 : abstractC17043M38688.m38672();
                                if (hashSet2.add(abstractC17043M38673.mo25505())) {
                                    C10024 c10026 = new C10024();
                                    c10026.m23403(abstractC17043M38673);
                                    if (!c10026.m23404()) {
                                        cancel();
                                        bufferedInputStreamM38676.close();
                                        break;
                                    }
                                }
                            }
                            if (this.f52457) {
                                m13472(R.string.MT_Protector);
                            }
                            mo13456(strM42105);
                            m52469(0);
                            if (z2) {
                                arrayList9.add(c11518);
                            } else {
                                if (c3659M23992.m7006()) {
                                    m39958(abstractC17043M38688);
                                    if (zM16219) {
                                        arrayList8.add(new C12859(abstractC17043M38688, c3659M23992.m6996().getTime()));
                                    }
                                    m39961(abstractC17043M38688.mo25505().substring(iM13484));
                                } else {
                                    this.f52454 = false;
                                    if (abstractC17043M38688.mo25094()) {
                                        c2742 = c2744;
                                        bufferedInputStream = bufferedInputStreamM38676;
                                        c3659 = c3659M23992;
                                        hashSet = hashSet2;
                                        arrayList4 = arrayList9;
                                        abstractC17047 = abstractC170412;
                                        arrayList5 = arrayList8;
                                        try {
                                            int iM39954 = m39952(abstractC17043M38688, abstractC17043M38688.mo25505().substring(iM13484), c3659M23992.m6967(), c3659M23992.m6996().getTime());
                                            if (!mo3924()) {
                                                if (iM39954 == 0) {
                                                    c19058.m43296(abstractC17043M38688);
                                                    this.f52454 = true;
                                                    if (c6727.mo15383() && abstractC17043M38688.mo31068()) {
                                                        abstractC17043M38688.mo31069(this);
                                                    }
                                                } else if (iM39954 == 1) {
                                                    continue;
                                                } else if (iM39954 == 2) {
                                                    abstractC17043M38688 = abstractC17043M38688.m38650(true);
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            Throwable th9 = th;
                                            try {
                                                bufferedInputStream.close();
                                                throw th9;
                                            } catch (Throwable th10) {
                                                th9.addSuppressed(th10);
                                                throw th9;
                                            }
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                        arrayList4 = arrayList9;
                                        c2742 = c2744;
                                        abstractC17047 = abstractC170412;
                                        arrayList5 = arrayList8;
                                        bufferedInputStream = bufferedInputStreamM38676;
                                        c3659 = c3659M23992;
                                    }
                                    m39958(abstractC17043M38688.m38694());
                                    C14247.m32743(c10365, c3659, abstractC17043M38688, new C24928(this));
                                    if (!mo3924()) {
                                        if (this.f52454) {
                                            c19058.m43298(abstractC17043M38688);
                                        }
                                        c2742.m4280(strM42105, abstractC17043M38688.getName());
                                        int i19 = C16114.f47424;
                                        C16114.m36688(abstractC17043M38688.mo25505(), true);
                                        m39961(abstractC17043M38688.mo25505().substring(iM13484));
                                    }
                                }
                                bufferedInputStreamM38676 = bufferedInputStream;
                                zM13488 = zM13488;
                                abstractC17043M421010 = abstractC17043M421010;
                                arrayList8 = arrayList5;
                                hashSet2 = hashSet;
                                abstractC170411 = abstractC17047;
                                arrayList9 = arrayList4;
                                c2744 = c2742;
                                zM13489 = zM13489;
                            }
                            hashSet = hashSet2;
                            arrayList4 = arrayList9;
                            c2742 = c2744;
                            abstractC17047 = abstractC170412;
                            arrayList5 = arrayList8;
                            bufferedInputStream = bufferedInputStreamM38676;
                            bufferedInputStreamM38676 = bufferedInputStream;
                            zM13488 = zM13488;
                            abstractC17043M421010 = abstractC17043M421010;
                            arrayList8 = arrayList5;
                            hashSet2 = hashSet;
                            abstractC170411 = abstractC17047;
                            arrayList9 = arrayList4;
                            c2744 = c2742;
                            zM13489 = zM13489;
                        } else {
                            ArrayList arrayList10 = arrayList9;
                            abstractC17043M421010 = abstractC17043M421010;
                            zM13488 = zM13488;
                            zM13489 = zM13489;
                            C2742 c2745 = c2744;
                            AbstractC17043 abstractC170413 = abstractC170411;
                            bufferedInputStream = bufferedInputStreamM38676;
                            m39960(abstractC170413);
                            for (C12859 c128510 : arrayList8) {
                                AbstractC17043 abstractC170414 = c128510.f36172;
                                if (abstractC170414.mo29973()) {
                                    abstractC170414.mo20486(c128510.f36173);
                                }
                            }
                            m39954(abstractC170413, iM13484, arrayList10, c2745);
                        }
                        bufferedInputStream.close();
                        break;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    bufferedInputStream = bufferedInputStreamM38676;
                }
            }
            if (mo3924()) {
                return C18736.m42768();
            }
            if (zM13489 && !arrayList.isEmpty()) {
                boolean z3 = arrayList.size() > 1;
                if (z3) {
                    m13472(R.string.MT_Protector);
                    mo13474(0);
                    m52469(0);
                }
                for (C10847 c10847 : arrayList) {
                    if (z3) {
                        mo13456(c10847.f30057.getName());
                    }
                    AbstractC17043 abstractC170415 = c10847.f30057;
                    if (abstractC170415.mo25093() && abstractC170415.mo25091() == c10847.f30058 && abstractC170415.mo25503()) {
                        this.f52458.m40705(c10847.f30057);
                    }
                }
                arrayList.clear();
            }
            i7 = i + 1;
            i4 = 0;
            i6 = 1;
            strArrM13494 = strArr;
            enumC6213Arr = enumC6213Arr2;
            length = i9;
            arrayList6 = arrayList;
            zM13488 = zM13488;
            abstractC17043M421010 = abstractC17043M421010;
            zM13489 = zM13489;
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79706;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39957(C17551 c17551, AbstractC17043 abstractC17043, int i, IInArchive iInArchive, AbstractC17043 abstractC17044, String[] strArr, C11518[] c11518Arr) {
        boolean zM16218 = C7050.m16218();
        ArrayList<C6177> arrayList = new ArrayList();
        C2742 c2742 = new C2742();
        C19847.m45087(null, null, new C22247(c17551, c17551, iInArchive, abstractC17044, arrayList, c11518Arr, strArr, abstractC17043, zM16218, c2742, i));
        if (c17551.mo3924()) {
            return;
        }
        c17551.m13472(R.string.MT_Protector);
        C20689 c20689 = new C20689(arrayList.size());
        c20689.m46753(new C20582(c17551));
        for (C6177 c6177 : arrayList) {
            c20689.m46754(1);
            String str = strArr[c6177.m14000()];
            c17551.mo13456(str);
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(str);
            c17551.m39958(abstractC17043M38684);
            if (c6177.m14004() >= 0 && zM16218 && abstractC17043M38684.mo29973()) {
                abstractC17043M38684.mo20486(c6177.m14004());
            }
            c17551.m39961(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C11518 c11518 : c11518Arr) {
            if (c11518 != null) {
                arrayList2.add(c11518);
            }
        }
        c17551.m39954(abstractC17043, i, arrayList2, c2742);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m39952(AbstractC17043 abstractC17043, String str, long j, long j2) {
        int iMo15379;
        boolean zM40704 = this.f52458.m40704(abstractC17043);
        C6727 c6727 = this.f52451;
        if (c6727.mo15381(zM40704)) {
            iMo15379 = c6727.mo15379(str, C23568.m52377(j, j2), C23568.m52378(abstractC17043), abstractC17043.mo31068(), zM40704);
        } else {
            C23568 c23568 = C23568.f75044;
            iMo15379 = c6727.mo15379(str, c23568, c23568, false, zM40704);
        }
        if (c6727.mo3924()) {
            cancel();
        }
        return iMo15379;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39954(AbstractC17043 abstractC17043, int i, ArrayList arrayList, C2742 c2742) {
        if (arrayList.isEmpty()) {
            return;
        }
        m13472(R.string.MT_Protector);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11518 c11518 = (C11518) it.next();
            if (!mo3924()) {
                String str = c11518.f32129;
                String strConcat = str.concat("/");
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(str);
                        if (!abstractC17043M38684.mo25094()) {
                            mo13456(str);
                            m39958(abstractC17043M38684.m38694());
                            abstractC17043M38684.mo29995(c2742.m4281(str, c11518.f32130));
                            if (!c11518.f32128) {
                                int i2 = C16114.f47424;
                                C16114.m36688(abstractC17043M38684.mo25505(), true);
                            }
                            m39961(abstractC17043M38684.mo25505().substring(i));
                            break;
                        }
                        break;
                    }
                    C11518 c11519 = (C11518) it2.next();
                    if (c11519 != c11518 && c11519.f32129.startsWith(strConcat)) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ */
    public void m39961(String str) {
        int iIndexOf = str.indexOf(47);
        HashSet hashSet = this.f52452;
        if (iIndexOf == -1) {
            hashSet.add(str);
        } else {
            hashSet.add(str.substring(0, iIndexOf));
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            boolean z = this.f52455;
            HashSet hashSet = this.f52452;
            if (z) {
                if (m13461(c18108)) {
                    c18108.m41267();
                    c18108.m41226((Collection) hashSet);
                    c18108.m41241();
                    return;
                }
                return;
            }
            if (m13478(c18107)) {
                c18107.m41267();
                c18107.m41226((Collection) hashSet);
                c18107.m41241();
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m39960(AbstractC17043 abstractC17043) throws IOException {
        if (this.f52453.add(abstractC17043.mo25505())) {
            try {
                C19210.m43750(abstractC17043, EnumC17868.MODIFY_DIRECTORY);
                if (!abstractC17043.mo25094() && !abstractC17043.mo25497()) {
                    throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Cannot create extract directory: ")));
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m39958(AbstractC17043 abstractC17043) {
        if (abstractC17043 == null) {
            return;
        }
        String strMo25505 = abstractC17043.mo25505();
        HashSet hashSet = this.f52449;
        if (hashSet.contains(strMo25505)) {
            return;
        }
        if (!abstractC17043.mo25094()) {
            abstractC17043.mo25497();
        }
        hashSet.add(abstractC17043.mo25505());
        do {
            abstractC17043 = abstractC17043.m38694();
            if (abstractC17043 == null) {
                return;
            }
        } while (hashSet.add(abstractC17043.mo25505()));
    }
}
