package l;

import android.os.Build;
import android.text.TextUtils;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܺܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public class C15975 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49290 = 0;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f49296;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f49297;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public String f49298;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f49299;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C17558 f49292 = new C17558();

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C4586 f49293 = new C4586(false);

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public HashSet f49294 = new HashSet();

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C16340 f49300 = new C16340();

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public HashSet f49291 = new HashSet();

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final HashSet f49295 = new HashSet();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String[] strArrM11558 = m11558("ARG_PATHS");
        return strArrM11558.length == 1 ? C4925.m14306(R.string.MT_Protector, C9523.m24404(strArrM11558[0])) : C4925.m14306(R.string.MT_Protector, m11531("extractDir"));
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
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C17222 mo2780() throws Throwable {
        ArrayList<C8921> arrayList;
        int i;
        Throwable th;
        long size;
        int size2;
        boolean zM14321;
        ArrayList<C11038> arrayList2;
        Iterator it;
        int i2;
        AbstractC15440 abstractC15440;
        long size3;
        AbstractC15440 abstractC15441;
        C3545 c3545;
        AbstractC15440 abstractC15440M36526;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        AbstractC15440 abstractC15442;
        long j;
        long j2;
        C17558 c17558;
        boolean[] zArr;
        AbstractC15440 abstractC15443;
        C17558 c17559;
        long j3;
        int iM37768;
        BufferedInputStream bufferedInputStream;
        HashSet hashSet;
        ArrayList arrayList4;
        C0393 c0393;
        AbstractC15440 abstractC15444;
        ArrayList arrayList5;
        C1358 c1358;
        C11518 c11518;
        C12223 c12223M28349;
        AbstractC15440 abstractC15440M36527;
        C11518 c11519;
        C12223 c12223;
        AbstractC15440 abstractC15445;
        AbstractC15440 abstractC15440M36492;
        C19404 c19404Mo28347;
        OutputStream outputStreamMo23555;
        byte[] bArr;
        int i3;
        String[] strArrM11558 = m11558("ARG_PATHS");
        C16340 c16340 = new C16340();
        int i4 = 0;
        for (String str4 : strArrM11558) {
            c16340.m38486(C16999.m39866(str4, new String[0]));
        }
        this.f49300 = c16340;
        EnumC4045[] enumC4045Arr = new EnumC4045[strArrM11558.length];
        for (int i5 = 0; i5 < strArrM11558.length && !mo1526(); i5++) {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(strArrM11558[i5], new String[0]);
            EnumC4045 enumC4045M44998 = C19568.m44998(abstractC15440M39866);
            enumC4045Arr[i5] = enumC4045M44998;
            if (enumC4045M44998 == EnumC4045.f12834) {
                this.f49300.m38487(abstractC15440M39866, C18090.m42176(abstractC15440M39866));
            }
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        AbstractC15440 abstractC15440M39867 = C16999.m39866(m11556("extractDir"), new String[0]);
        boolean zM11552 = m11552("separateFolder");
        int iM11548 = m11548("relativeNameSubStart");
        this.f49297 = m11552("extractToAnother");
        boolean zM11553 = m11552("deleteSources");
        int i6 = 1;
        this.f49299 = strArrM11558.length == 1;
        ArrayList arrayList6 = new ArrayList();
        int length = strArrM11558.length;
        int i7 = 0;
        while (i7 < length) {
            String str5 = MotionUtils.EASING_TYPE_FORMAT_END;
            String str6 = "/";
            String str7 = MotionUtils.EASING_TYPE_FORMAT_START;
            if (length > i6) {
                mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + (i7 + 1) + "/" + length + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            AbstractC15440 abstractC15440M39868 = C16999.m39866(strArrM11558[i7], new String[i4]);
            EnumC4045 enumC4045 = enumC4045Arr[i7];
            AbstractC15440 abstractC15440M36528 = zM11552 ? abstractC15440M39867.m36526(abstractC15440M39868.m36517()) : abstractC15440M39867;
            int i8 = C1865.f6357[enumC4045.ordinal()];
            String[] strArr = strArrM11558;
            C4586 c4586 = this.f49293;
            EnumC4045[] enumC4045Arr2 = enumC4045Arr;
            C17558 c175510 = this.f49292;
            int i9 = length;
            AbstractC15440 abstractC15446 = abstractC15440M36528;
            if (i8 == 1) {
                arrayList = arrayList6;
                abstractC15440M39867 = abstractC15440M39867;
                zM11552 = zM11552;
                zM11553 = zM11553;
                AbstractC15440 abstractC15447 = abstractC15446;
                i = i7;
                m50127();
                ArrayList arrayList7 = zM11553 ? arrayList : null;
                C18090 c18090 = new C18090(abstractC15440M39868);
                try {
                    byte[] bArrM42188 = c18090.m42188();
                    this.f49300.m38487(abstractC15440M39868, bArrM42188);
                    if (arrayList7 != null) {
                        if (bArrM42188 == null) {
                            try {
                                arrayList7.add(new C8921(abstractC15440M39868));
                            } catch (Throwable th2) {
                                th = th2;
                                c18090 = c18090;
                                try {
                                    c18090.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                    throw th;
                                }
                            }
                        } else {
                            AbstractC15440 abstractC15440M36514 = abstractC15440M39868.m36514();
                            C12951 c12951 = new C12951(bArrM42188);
                            int i10 = c12951.readInt();
                            int i11 = 0;
                            while (i11 < i10) {
                                int i12 = i10;
                                arrayList7.add(new C8921(abstractC15440M36514.m36526(c12951.m31506())));
                                c12951.skipBytes(8);
                                i11++;
                                i10 = i12;
                            }
                        }
                    }
                    String strM26212 = C10395.m26212(abstractC15440M39868.mo23554());
                    if (TextUtils.isEmpty(strM26212)) {
                        String str8 = this.f49298;
                        if (str8 != null) {
                            c18090.m42192(str8);
                        }
                    } else {
                        c18090.m42192(strM26212);
                    }
                    ArrayList<C3545> arrayListM42194 = c18090.m42194();
                    for (C3545 c3546 : arrayListM42194) {
                        C16999.m39860(c3546.getName(), c3546.isDirectory());
                    }
                    m37776(abstractC15447);
                    if (Build.VERSION.SDK_INT >= 30) {
                        C8055 c8055 = new C8055();
                        for (C3545 c3547 : arrayListM42194) {
                            AbstractC15440 abstractC15440M36529 = abstractC15447.m36526(C16999.m39860(c3547.getName(), c3547.isDirectory()));
                            if (c3547.isDirectory()) {
                                c8055.m21436(abstractC15440M36529);
                            } else {
                                c8055.m21436(abstractC15440M36529.m36536());
                            }
                        }
                        if (c8055.m21437()) {
                            size = 0;
                            for (C3545 c3548 : arrayListM42194) {
                                if (!c3548.isDirectory()) {
                                    size += c3548.getSize();
                                }
                            }
                            size2 = arrayListM42194.size();
                            zM14321 = C4925.m14321();
                            arrayList2 = new ArrayList();
                            it = arrayListM42194.iterator();
                            i2 = 0;
                            abstractC15440 = abstractC15440M39868;
                            size3 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    c18090 = c18090;
                                    for (C11038 c11038 : arrayList2) {
                                        abstractC15441 = c11038.f33177;
                                        if (abstractC15441.mo27912()) {
                                            abstractC15441.mo18537(c11038.f33178);
                                        }
                                    }
                                    break;
                                }
                                c3545 = (C3545) it.next();
                                c18090 = c18090;
                                try {
                                    c4586 = c4586;
                                    String strM39860 = C16999.m39860(c3545.getName(), c3545.isDirectory());
                                    i2++;
                                    if (this.f49299) {
                                        mo11546(C4925.m14327(R.string.MT_Protector) + str7 + i2 + str6 + size2 + str5);
                                    }
                                    mo11520(strM39860);
                                    m50129(0);
                                    mo11538(C19277.m44456(size3, size));
                                    abstractC15440M36526 = abstractC15447.m36526(strM39860);
                                    if (c3545.isDirectory()) {
                                        m37774(abstractC15440M36526);
                                        if (zM14321) {
                                            arrayList2.add(new C11038(abstractC15440M36526, c3545.getTime()));
                                        }
                                        m37777(abstractC15440M36526.mo23554().substring(iM11548));
                                        str = str6;
                                        str2 = str7;
                                        str3 = str5;
                                        arrayList3 = arrayList2;
                                        abstractC15442 = abstractC15440;
                                        size3 = size3;
                                    } else {
                                        j = size3;
                                        this.f49296 = false;
                                        if (abstractC15440M36526.mo23120()) {
                                            j2 = j;
                                            abstractC15442 = abstractC15440;
                                            str = str6;
                                            str2 = str7;
                                            str3 = str5;
                                            arrayList3 = arrayList2;
                                            iM37768 = m37768(abstractC15440M36526, abstractC15440M36526.mo23554().substring(iM11548), c3545.getSize(), c3545.getTime());
                                            if (!mo1526()) {
                                                break;
                                            }
                                            if (iM37768 != 0) {
                                                c17558 = c175510;
                                                c17558.m41050(abstractC15440M36526);
                                                this.f49296 = true;
                                                if (c4586.mo13494() && abstractC15440M36526.mo29016()) {
                                                    abstractC15440M36526.mo29017(this);
                                                }
                                            } else if (iM37768 != 1) {
                                                size3 = j2 + c3545.getSize();
                                            } else if (iM37768 != 2) {
                                                abstractC15440M36526 = abstractC15440M36526.m36492(true);
                                            }
                                            m37774(abstractC15440M36526.m36536());
                                            zArr = new boolean[]{false};
                                            abstractC15443 = abstractC15447;
                                            c17559 = c17558;
                                            j3 = size;
                                            C22523.m50502(abstractC15442.mo23554(), c18090, c3545, abstractC15440M36526, false, new C17387(this, j2, size, c18090, zArr, c3545));
                                            if (mo1526()) {
                                                break;
                                            }
                                            if (this.f49296) {
                                                c17559.m41052(abstractC15440M36526);
                                            }
                                            if (zArr[0]) {
                                                C10395.m26217(abstractC15442.mo23554(), c18090.m42208());
                                                this.f49298 = c18090.m42208();
                                            }
                                            size3 = c3545.getSize() + j2;
                                            int i13 = C14463.f44330;
                                            C14463.m34554(abstractC15440M36526.mo23554(), true);
                                            m37777(abstractC15440M36526.mo23554().substring(iM11548));
                                            abstractC15440 = abstractC15442;
                                            c175510 = c17559;
                                            abstractC15447 = abstractC15443;
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
                                            abstractC15442 = abstractC15440;
                                            j2 = j;
                                        }
                                        c17558 = c175510;
                                        m37774(abstractC15440M36526.m36536());
                                        zArr = new boolean[]{false};
                                        abstractC15443 = abstractC15447;
                                        c17559 = c17558;
                                        j3 = size;
                                        C22523.m50502(abstractC15442.mo23554(), c18090, c3545, abstractC15440M36526, false, new C17387(this, j2, size, c18090, zArr, c3545));
                                        if (mo1526()) {
                                            break;
                                            break;
                                        }
                                        if (this.f49296) {
                                            c17559.m41052(abstractC15440M36526);
                                        }
                                        if (zArr[0]) {
                                            C10395.m26217(abstractC15442.mo23554(), c18090.m42208());
                                            this.f49298 = c18090.m42208();
                                        }
                                        size3 = c3545.getSize() + j2;
                                        int i14 = C14463.f44330;
                                        C14463.m34554(abstractC15440M36526.mo23554(), true);
                                        m37777(abstractC15440M36526.mo23554().substring(iM11548));
                                        abstractC15440 = abstractC15442;
                                        c175510 = c17559;
                                        abstractC15447 = abstractC15443;
                                        str6 = str;
                                        str7 = str2;
                                        str5 = str3;
                                        arrayList2 = arrayList3;
                                        size = j3;
                                    }
                                    abstractC15440 = abstractC15442;
                                    c175510 = c175510;
                                    str6 = str;
                                    str7 = str2;
                                    str5 = str3;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    c18090.close();
                                    throw th;
                                }
                            }
                            c18090.close();
                        } else {
                            cancel();
                            c18090.close();
                        }
                    } else {
                        size = 0;
                        while (r2.hasNext()) {
                            if (!c3548.isDirectory()) {
                                size += c3548.getSize();
                            }
                        }
                        size2 = arrayListM42194.size();
                        zM14321 = C4925.m14321();
                        arrayList2 = new ArrayList();
                        it = arrayListM42194.iterator();
                        i2 = 0;
                        abstractC15440 = abstractC15440M39868;
                        size3 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                c18090 = c18090;
                                while (r0.hasNext()) {
                                    abstractC15441 = c11038.f33177;
                                    if (abstractC15441.mo27912()) {
                                        abstractC15441.mo18537(c11038.f33178);
                                    }
                                }
                                break;
                                break;
                            }
                            c3545 = (C3545) it.next();
                            c18090 = c18090;
                            c4586 = c4586;
                            String strM39861 = C16999.m39860(c3545.getName(), c3545.isDirectory());
                            i2++;
                            if (this.f49299) {
                                mo11546(C4925.m14327(R.string.MT_Protector) + str7 + i2 + str6 + size2 + str5);
                            }
                            mo11520(strM39861);
                            m50129(0);
                            mo11538(C19277.m44456(size3, size));
                            abstractC15440M36526 = abstractC15447.m36526(strM39861);
                            if (c3545.isDirectory()) {
                                m37774(abstractC15440M36526);
                                if (zM14321) {
                                    arrayList2.add(new C11038(abstractC15440M36526, c3545.getTime()));
                                }
                                m37777(abstractC15440M36526.mo23554().substring(iM11548));
                                str = str6;
                                str2 = str7;
                                str3 = str5;
                                arrayList3 = arrayList2;
                                abstractC15442 = abstractC15440;
                                size3 = size3;
                            } else {
                                j = size3;
                                this.f49296 = false;
                                if (abstractC15440M36526.mo23120()) {
                                    j2 = j;
                                    abstractC15442 = abstractC15440;
                                    str = str6;
                                    str2 = str7;
                                    str3 = str5;
                                    arrayList3 = arrayList2;
                                    iM37768 = m37768(abstractC15440M36526, abstractC15440M36526.mo23554().substring(iM11548), c3545.getSize(), c3545.getTime());
                                    if (!mo1526()) {
                                        break;
                                        break;
                                    }
                                    if (iM37768 != 0) {
                                        c17558 = c175510;
                                        c17558.m41050(abstractC15440M36526);
                                        this.f49296 = true;
                                        if (c4586.mo13494()) {
                                            abstractC15440M36526.mo29017(this);
                                        }
                                    } else if (iM37768 != 1) {
                                        size3 = j2 + c3545.getSize();
                                    } else if (iM37768 != 2) {
                                        abstractC15440M36526 = abstractC15440M36526.m36492(true);
                                    }
                                    m37774(abstractC15440M36526.m36536());
                                    zArr = new boolean[]{false};
                                    abstractC15443 = abstractC15447;
                                    c17559 = c17558;
                                    j3 = size;
                                    C22523.m50502(abstractC15442.mo23554(), c18090, c3545, abstractC15440M36526, false, new C17387(this, j2, size, c18090, zArr, c3545));
                                    if (mo1526()) {
                                        break;
                                        break;
                                    }
                                    if (this.f49296) {
                                        c17559.m41052(abstractC15440M36526);
                                    }
                                    if (zArr[0]) {
                                        C10395.m26217(abstractC15442.mo23554(), c18090.m42208());
                                        this.f49298 = c18090.m42208();
                                    }
                                    size3 = c3545.getSize() + j2;
                                    int i15 = C14463.f44330;
                                    C14463.m34554(abstractC15440M36526.mo23554(), true);
                                    m37777(abstractC15440M36526.mo23554().substring(iM11548));
                                    abstractC15440 = abstractC15442;
                                    c175510 = c17559;
                                    abstractC15447 = abstractC15443;
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
                                    abstractC15442 = abstractC15440;
                                    j2 = j;
                                }
                                c17558 = c175510;
                                m37774(abstractC15440M36526.m36536());
                                zArr = new boolean[]{false};
                                abstractC15443 = abstractC15447;
                                c17559 = c17558;
                                j3 = size;
                                C22523.m50502(abstractC15442.mo23554(), c18090, c3545, abstractC15440M36526, false, new C17387(this, j2, size, c18090, zArr, c3545));
                                if (mo1526()) {
                                    break;
                                    break;
                                }
                                if (this.f49296) {
                                    c17559.m41052(abstractC15440M36526);
                                }
                                if (zArr[0]) {
                                    C10395.m26217(abstractC15442.mo23554(), c18090.m42208());
                                    this.f49298 = c18090.m42208();
                                }
                                size3 = c3545.getSize() + j2;
                                int i16 = C14463.f44330;
                                C14463.m34554(abstractC15440M36526.mo23554(), true);
                                m37777(abstractC15440M36526.mo23554().substring(iM11548));
                                abstractC15440 = abstractC15442;
                                c175510 = c17559;
                                abstractC15447 = abstractC15443;
                                str6 = str;
                                str7 = str2;
                                str5 = str3;
                                arrayList2 = arrayList3;
                                size = j3;
                            }
                            abstractC15440 = abstractC15442;
                            c175510 = c175510;
                            str6 = str;
                            str7 = str2;
                            str5 = str3;
                            arrayList2 = arrayList3;
                        }
                        c18090.close();
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c18090 = c18090;
                }
            } else if (i8 != 2) {
                if (i8 != 3) {
                    m50128();
                    C9924.m25035(null, abstractC15440M39868, new C6804(this, zM11553 ? arrayList6 : null, abstractC15446, iM11548, abstractC15440M39868));
                } else {
                    if (zM11553) {
                        arrayList6.add(new C8921(abstractC15440M39868));
                    }
                    m50128();
                    m37776(abstractC15446);
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            C8055 c8056 = new C8055();
                            c8056.m21436(abstractC15446);
                            if (!c8056.m21437()) {
                                cancel();
                            }
                            arrayList = arrayList6;
                            abstractC15440M39867 = abstractC15440M39867;
                            zM11552 = zM11552;
                            zM11553 = zM11553;
                        }
                        if (abstractC15440M36527.mo23120()) {
                            c11519 = c11518;
                            c12223 = c12223M28349;
                            i = i7;
                            int iM37769 = m37768(abstractC15440M36527, abstractC15440M36527.mo23554().substring(iM11548), c12223M28349.getSize(), c12223M28349.getTime());
                            if (!mo1526()) {
                                if (iM37769 != 0) {
                                    if (iM37769 != 1) {
                                        if (iM37769 != 2) {
                                            abstractC15445 = abstractC15440M36527;
                                        } else {
                                            abstractC15440M36492 = abstractC15440M36527.m36492(true);
                                        }
                                        m37774(abstractC15440M36492.m36536());
                                        c19404Mo28347 = c11519.mo28347(c12223);
                                        outputStreamMo23555 = abstractC15440M36492.mo23555(false);
                                        c19404Mo28347.m44686().m44459(new C19164(this));
                                        bArr = new byte[1024];
                                        while (true) {
                                            i3 = c19404Mo28347.read(bArr);
                                            if (i3 != -1) {
                                                if (outputStreamMo23555 != null) {
                                                    outputStreamMo23555.close();
                                                }
                                                c19404Mo28347.close();
                                                if (this.f49296) {
                                                    c175510.m41052(abstractC15440M36492);
                                                }
                                                int i17 = C14463.f44330;
                                                C14463.m34554(abstractC15440M36492.mo23554(), true);
                                                m37777(abstractC15440M36492.mo23554().substring(iM11548));
                                                break;
                                            }
                                            outputStreamMo23555.write(bArr, 0, i3);
                                            if (mo1526()) {
                                                outputStreamMo23555.close();
                                                c19404Mo28347.close();
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    abstractC15445 = abstractC15440M36527;
                                    c175510.m41050(abstractC15445);
                                    this.f49296 = true;
                                    if (c4586.mo13494() && abstractC15445.mo29016()) {
                                        abstractC15445.mo29017(this);
                                    }
                                }
                            }
                            arrayList = arrayList6;
                            abstractC15440M39867 = abstractC15440M39867;
                            zM11552 = zM11552;
                            zM11553 = zM11553;
                        } else {
                            c11519 = c11518;
                            c12223 = c12223M28349;
                            abstractC15445 = abstractC15440M36527;
                            i = i7;
                        }
                        c19404Mo28347.m44686().m44459(new C19164(this));
                        bArr = new byte[1024];
                        while (true) {
                            i3 = c19404Mo28347.read(bArr);
                            if (i3 != -1) {
                                if (outputStreamMo23555 != null) {
                                    outputStreamMo23555.close();
                                }
                                c19404Mo28347.close();
                                if (this.f49296) {
                                    c175510.m41052(abstractC15440M36492);
                                }
                                int i18 = C14463.f44330;
                                C14463.m34554(abstractC15440M36492.mo23554(), true);
                                m37777(abstractC15440M36492.mo23554().substring(iM11548));
                                break;
                            }
                            outputStreamMo23555.write(bArr, 0, i3);
                            if (mo1526()) {
                                outputStreamMo23555.close();
                                c19404Mo28347.close();
                                break;
                            }
                        }
                        arrayList = arrayList6;
                        abstractC15440M39867 = abstractC15440M39867;
                        zM11552 = zM11552;
                        zM11553 = zM11553;
                    } catch (Throwable th6) {
                        if (outputStreamMo23555 == null) {
                            throw th6;
                        }
                        try {
                            outputStreamMo23555.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                    c11518 = new C11518(abstractC15440M39868.mo23554());
                    c11518.mo7646(false);
                    c12223M28349 = c11518.m28349();
                    String name = c12223M28349.getName();
                    abstractC15440M36527 = abstractC15446.m36526(name);
                    if (this.f49299) {
                        m11536(R.string.MT_Protector);
                    }
                    mo11520(name);
                    m50129(0);
                    this.f49296 = false;
                    abstractC15440M36492 = abstractC15445;
                    m37774(abstractC15440M36492.m36536());
                    c19404Mo28347 = c11519.mo28347(c12223);
                    outputStreamMo23555 = abstractC15440M36492.mo23555(false);
                }
                i = i7;
                arrayList = arrayList6;
                abstractC15440M39867 = abstractC15440M39867;
                zM11552 = zM11552;
                zM11553 = zM11553;
            } else {
                AbstractC15440 abstractC15448 = abstractC15446;
                i = i7;
                if (zM11553) {
                    arrayList6.add(new C8921(abstractC15440M39868));
                }
                m50127();
                BufferedInputStream bufferedInputStreamM36518 = abstractC15440M39868.m36518();
                try {
                    final InputStream c14564 = new C14564(this, bufferedInputStreamM36518, abstractC15440M39868);
                    boolean zM14322 = C4925.m14321();
                    ArrayList<C11038> arrayList8 = new ArrayList();
                    HashSet hashSet2 = new HashSet();
                    String strMo23554 = abstractC15448.mo23554();
                    boolean z = (C16999.m39887(strMo23554) || C16999.m39877(strMo23554)) ? false : true;
                    ArrayList arrayList9 = new ArrayList();
                    C0393 c0394 = new C0393();
                    InputStream inputStreamM30665 = C12498.m30665(bufferedInputStreamM36518, new InterfaceC1629() { // from class: l.ܽܰܳ
                        @Override // l.InterfaceC1629
                        public final Object get() {
                            int i19 = C15975.f49290;
                            return c14564;
                        }
                    });
                    arrayList = arrayList6;
                    if (inputStreamM30665 != null) {
                        c14564 = inputStreamM30665;
                    }
                    C0393 c0395 = c0394;
                    C8414 c8414 = new C8414(c14564, 10240, null);
                    while (true) {
                        C1358 c1358M22022 = c8414.m22022();
                        if (c1358M22022 != null) {
                            boolean z2 = z && c1358M22022.m4770();
                            String strM39862 = C16999.m39860(c1358M22022.m4741(), z2 ? false : c1358M22022.m4768());
                            C9627 c9627 = z2 ? new C9627(strM39862, C16999.m39881(strM39862, c1358M22022.m4767()), c1358M22022.m4768()) : null;
                            m37776(abstractC15448);
                            AbstractC15440 abstractC15440M365210 = abstractC15448.m36526(strM39862);
                            AbstractC15440 abstractC15449 = abstractC15448;
                            if (Build.VERSION.SDK_INT >= 30) {
                                AbstractC15440 abstractC15440M36515 = (!z2 && c1358M22022.m4768()) ? abstractC15440M365210 : abstractC15440M365210.m36514();
                                if (hashSet2.add(abstractC15440M36515.mo23554())) {
                                    C8055 c8057 = new C8055();
                                    c8057.m21436(abstractC15440M36515);
                                    if (!c8057.m21437()) {
                                        cancel();
                                        bufferedInputStreamM36518.close();
                                        break;
                                    }
                                }
                            }
                            if (this.f49299) {
                                m11536(R.string.MT_Protector);
                            }
                            mo11520(strM39862);
                            m50129(0);
                            if (z2) {
                                arrayList9.add(c9627);
                            } else {
                                if (c1358M22022.m4768()) {
                                    m37774(abstractC15440M365210);
                                    if (zM14322) {
                                        arrayList8.add(new C11038(abstractC15440M365210, c1358M22022.m4758().getTime()));
                                    }
                                    m37777(abstractC15440M365210.mo23554().substring(iM11548));
                                } else {
                                    this.f49296 = false;
                                    if (abstractC15440M365210.mo23120()) {
                                        c0393 = c0395;
                                        bufferedInputStream = bufferedInputStreamM36518;
                                        c1358 = c1358M22022;
                                        hashSet = hashSet2;
                                        arrayList4 = arrayList9;
                                        abstractC15444 = abstractC15449;
                                        arrayList5 = arrayList8;
                                        try {
                                            int iM377610 = m37768(abstractC15440M365210, abstractC15440M365210.mo23554().substring(iM11548), c1358M22022.m4729(), c1358M22022.m4758().getTime());
                                            if (!mo1526()) {
                                                if (iM377610 == 0) {
                                                    c175510.m41050(abstractC15440M365210);
                                                    this.f49296 = true;
                                                    if (c4586.mo13494() && abstractC15440M365210.mo29016()) {
                                                        abstractC15440M365210.mo29017(this);
                                                    }
                                                } else if (iM377610 == 1) {
                                                    continue;
                                                } else if (iM377610 == 2) {
                                                    abstractC15440M365210 = abstractC15440M365210.m36492(true);
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
                                        c0393 = c0395;
                                        abstractC15444 = abstractC15449;
                                        arrayList5 = arrayList8;
                                        bufferedInputStream = bufferedInputStreamM36518;
                                        c1358 = c1358M22022;
                                    }
                                    m37774(abstractC15440M365210.m36536());
                                    C12498.m30668(c8414, c1358, abstractC15440M365210, new C23737(this));
                                    if (!mo1526()) {
                                        if (this.f49296) {
                                            c175510.m41052(abstractC15440M365210);
                                        }
                                        c0393.m1888(strM39862, abstractC15440M365210.getName());
                                        int i19 = C14463.f44330;
                                        C14463.m34554(abstractC15440M365210.mo23554(), true);
                                        m37777(abstractC15440M365210.mo23554().substring(iM11548));
                                    }
                                }
                                bufferedInputStreamM36518 = bufferedInputStream;
                                zM11552 = zM11552;
                                abstractC15440M39867 = abstractC15440M39867;
                                arrayList8 = arrayList5;
                                hashSet2 = hashSet;
                                abstractC15448 = abstractC15444;
                                arrayList9 = arrayList4;
                                c0395 = c0393;
                                zM11553 = zM11553;
                            }
                            hashSet = hashSet2;
                            arrayList4 = arrayList9;
                            c0393 = c0395;
                            abstractC15444 = abstractC15449;
                            arrayList5 = arrayList8;
                            bufferedInputStream = bufferedInputStreamM36518;
                            bufferedInputStreamM36518 = bufferedInputStream;
                            zM11552 = zM11552;
                            abstractC15440M39867 = abstractC15440M39867;
                            arrayList8 = arrayList5;
                            hashSet2 = hashSet;
                            abstractC15448 = abstractC15444;
                            arrayList9 = arrayList4;
                            c0395 = c0393;
                            zM11553 = zM11553;
                        } else {
                            ArrayList arrayList10 = arrayList9;
                            abstractC15440M39867 = abstractC15440M39867;
                            zM11552 = zM11552;
                            zM11553 = zM11553;
                            C0393 c0396 = c0395;
                            AbstractC15440 abstractC154410 = abstractC15448;
                            bufferedInputStream = bufferedInputStreamM36518;
                            m37776(abstractC154410);
                            for (C11038 c11039 : arrayList8) {
                                AbstractC15440 abstractC154411 = c11039.f33177;
                                if (abstractC154411.mo27912()) {
                                    abstractC154411.mo18537(c11039.f33178);
                                }
                            }
                            m37770(abstractC154410, iM11548, arrayList10, c0396);
                        }
                        bufferedInputStream.close();
                        break;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    bufferedInputStream = bufferedInputStreamM36518;
                }
            }
            if (mo1526()) {
                return C17222.m40521();
            }
            if (zM11553 && !arrayList.isEmpty()) {
                boolean z3 = arrayList.size() > 1;
                if (z3) {
                    m11536(R.string.MT_Protector);
                    mo11538(0);
                    m50129(0);
                }
                for (C8921 c8921 : arrayList) {
                    if (z3) {
                        mo11520(c8921.f27125.getName());
                    }
                    AbstractC15440 abstractC154412 = c8921.f27125;
                    if (abstractC154412.mo23119() && abstractC154412.mo23117() == c8921.f27126 && abstractC154412.mo23552()) {
                        this.f49300.m38489(c8921.f27125);
                    }
                }
                arrayList.clear();
            }
            i7 = i + 1;
            i4 = 0;
            i6 = 1;
            strArrM11558 = strArr;
            enumC4045Arr = enumC4045Arr2;
            length = i9;
            arrayList6 = arrayList;
            zM11552 = zM11552;
            abstractC15440M39867 = abstractC15440M39867;
            zM11553 = zM11553;
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76954;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37773(C15975 c15975, AbstractC15440 abstractC15440, int i, IInArchive iInArchive, AbstractC15440 abstractC15441, String[] strArr, C9627[] c9627Arr) {
        boolean zM14321 = C4925.m14321();
        ArrayList<C4007> arrayList = new ArrayList();
        C0393 c0393 = new C0393();
        C18390.m42815(null, null, new C20916(c15975, c15975, iInArchive, abstractC15441, arrayList, c9627Arr, strArr, abstractC15440, zM14321, c0393, i));
        if (c15975.mo1526()) {
            return;
        }
        c15975.m11536(R.string.MT_Protector);
        C19277 c19277 = new C19277(arrayList.size());
        c19277.m44459(new C19164(c15975));
        for (C4007 c4007 : arrayList) {
            c19277.m44460(1);
            String str = strArr[c4007.m12080()];
            c15975.mo11520(str);
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(str);
            c15975.m37774(abstractC15440M36526);
            if (c4007.m12084() >= 0 && zM14321 && abstractC15440M36526.mo27912()) {
                abstractC15440M36526.mo18537(c4007.m12084());
            }
            c15975.m37777(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C9627 c9627 : c9627Arr) {
            if (c9627 != null) {
                arrayList2.add(c9627);
            }
        }
        c15975.m37770(abstractC15440, i, arrayList2, c0393);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m37768(AbstractC15440 abstractC15440, String str, long j, long j2) {
        int iMo13490;
        boolean zM38488 = this.f49300.m38488(abstractC15440);
        C4586 c4586 = this.f49293;
        if (c4586.mo13492(zM38488)) {
            iMo13490 = c4586.mo13490(str, C22306.m50047(j, j2), C22306.m50048(abstractC15440), abstractC15440.mo29016(), zM38488);
        } else {
            C22306 c22306 = C22306.f72317;
            iMo13490 = c4586.mo13490(str, c22306, c22306, false, zM38488);
        }
        if (c4586.mo1526()) {
            cancel();
        }
        return iMo13490;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37770(AbstractC15440 abstractC15440, int i, ArrayList arrayList, C0393 c0393) {
        if (arrayList.isEmpty()) {
            return;
        }
        m11536(R.string.MT_Protector);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9627 c9627 = (C9627) it.next();
            if (!mo1526()) {
                String str = c9627.f29181;
                String strConcat = str.concat("/");
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(str);
                        if (!abstractC15440M36526.mo23120()) {
                            mo11520(str);
                            m37774(abstractC15440M36526.m36536());
                            abstractC15440M36526.mo27934(c0393.m1889(str, c9627.f29182));
                            if (!c9627.f29180) {
                                int i2 = C14463.f44330;
                                C14463.m34554(abstractC15440M36526.mo23554(), true);
                            }
                            m37777(abstractC15440M36526.mo23554().substring(i));
                            break;
                        }
                        break;
                    }
                    C9627 c9628 = (C9627) it2.next();
                    if (c9628 != c9627 && c9628.f29181.startsWith(strConcat)) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m37777(String str) {
        int iIndexOf = str.indexOf(47);
        HashSet hashSet = this.f49294;
        if (iIndexOf == -1) {
            hashSet.add(str);
        } else {
            hashSet.add(str.substring(0, iIndexOf));
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            boolean z = this.f49297;
            HashSet hashSet = this.f49294;
            if (z) {
                if (m11525(c16561)) {
                    c16561.m39041();
                    c16561.m39000((Collection) hashSet);
                    c16561.m39015();
                    return;
                }
                return;
            }
            if (m11542(c16560)) {
                c16560.m39041();
                c16560.m39000((Collection) hashSet);
                c16560.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m37776(AbstractC15440 abstractC15440) throws IOException {
        if (this.f49295.add(abstractC15440.mo23554())) {
            try {
                C17721.m41504(abstractC15440, EnumC16309.MODIFY_DIRECTORY);
                if (!abstractC15440.mo23120() && !abstractC15440.mo23546()) {
                    throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Cannot create extract directory: ")));
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m37774(AbstractC15440 abstractC15440) {
        if (abstractC15440 == null) {
            return;
        }
        String strMo23554 = abstractC15440.mo23554();
        HashSet hashSet = this.f49291;
        if (hashSet.contains(strMo23554)) {
            return;
        }
        if (!abstractC15440.mo23120()) {
            abstractC15440.mo23546();
        }
        hashSet.add(abstractC15440.mo23554());
        do {
            abstractC15440 = abstractC15440.m36536();
            if (abstractC15440 == null) {
                return;
            }
        } while (hashSet.add(abstractC15440.mo23554()));
    }
}
