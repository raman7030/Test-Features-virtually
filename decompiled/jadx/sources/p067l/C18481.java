package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public class C18481 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public String f55213 = "null";

    /* JADX INFO: renamed from: ۘ֫ */
    public ArrayList f55212 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, this.f55213);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x013c A[Catch: all -> 0x01c0, TRY_ENTER, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x015b A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x015f A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0169  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ad A[LOOP:0: B:7:0x0035->B:55:0x01ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x013c, please report this as an issue */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        AbstractC17043 abstractC17043;
        String str;
        int i;
        Iterator it;
        String str2;
        String[] strArr;
        int i2;
        C9467 c9467;
        boolean z;
        long j;
        String str3;
        String str4 = "/";
        AbstractC17043 abstractC17043M13451 = m13451("outputDir");
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("password");
        int iM13484 = m13484("level");
        boolean zM13488 = m13488("deleteSources");
        int i3 = 0;
        C16469 c16469 = new C16469(this, strArrM13494, false);
        if (mo3924()) {
            return C18736.m42768();
        }
        int length = strArrM13494.length;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f55212;
            if (i4 < length) {
                AbstractC17043 abstractC17043M42109 = C18524.m42109(strArrM13494[i4], new String[i3]);
                AbstractC17043 abstractC17043M38650 = abstractC17043M13451.m38684((abstractC17043M42109.mo25087() ? abstractC17043M42109.getName() : abstractC17043M42109.m38675()) + ".zip").m38650(true);
                this.f55213 = abstractC17043M38650.getName();
                C4045 c4045M37393 = c16469.m37393(i4);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(abstractC17043M38650);
                try {
                    C10844 c10844 = new C10844(abstractC17043M38650);
                    try {
                        c10844.m25000(strM13492);
                        boolean zM49365 = AbstractC21895.m49365(iM13484, c10844);
                        C16922 c16922 = new C16922();
                        if (zM49365) {
                            abstractC17043 = abstractC17043M13451;
                            Iterator it2 = c4045M37393.f8893.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Iterator it3 = it2;
                                    C9467 c9468 = (C9467) it2.next();
                                    str = strM13492;
                                    if (!c9468.f25915) {
                                        i = iM13484;
                                        if (c9468.f25908.equals("AndroidManifest.xml")) {
                                            try {
                                                C16820 c16820M38131 = C16820.m38131(c9468.f25907);
                                                c16922.f50093 = C23527.m52310(c16820M38131);
                                                c16922.f50092 = C23527.m52312(c16820M38131);
                                                break;
                                            } catch (Exception unused) {
                                                c16922.f50093 = false;
                                                c16922.f50092 = false;
                                                break;
                                            }
                                        }
                                        C25187.m55252(arrayList2);
                                        throw e;
                                    }
                                    i = iM13484;
                                    strM13492 = str;
                                    it2 = it3;
                                    iM13484 = i;
                                }
                            }
                            it = c4045M37393.f8893.iterator();
                            while (it.hasNext()) {
                                c9467 = (C9467) it.next();
                                if (mo3924()) {
                                    break;
                                }
                                c16469.m37397();
                                mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c16469.m37392() + str4 + c16469.m37396() + MotionUtils.EASING_TYPE_FORMAT_END);
                                z = c9467.f25915;
                                Iterator it4 = it;
                                String[] strArr2 = strArrM13494;
                                j = c9467.f25910;
                                int i5 = length;
                                str3 = c9467.f25908;
                                if (z) {
                                    C5738 c5738 = new C5738(str3 + str4);
                                    c5738.setTime(j);
                                    c10844.m24987(c5738);
                                    str4 = str4;
                                } else {
                                    AbstractC17043 abstractC17044 = c9467.f25907;
                                    if (zM49365) {
                                        c10844.m24992(C22959.m51283(str3, c16922));
                                    }
                                    mo13456(str3);
                                    C5738 c5739 = new C5738(str3);
                                    c5739.m12786(c9467.f25916);
                                    c5739.setTime(j);
                                    c10844.m24987(c5739);
                                    abstractC17044.m38653(c10844.m24981(), new C13118(this, c16469));
                                }
                                strArrM13494 = strArr2;
                                it = it4;
                                length = i5;
                                str4 = str4;
                                zM49365 = zM49365;
                            }
                            str2 = str4;
                            strArr = strArrM13494;
                            i2 = length;
                            c10844.close();
                            if (mo3924()) {
                                C25187.m55252(arrayList2);
                                return C18736.m42768();
                            }
                            arrayList.addAll(arrayList2);
                            i4++;
                            i3 = 0;
                            strArrM13494 = strArr;
                            abstractC17043M13451 = abstractC17043;
                            strM13492 = str;
                            iM13484 = i;
                            length = i2;
                            str4 = str2;
                        } else {
                            abstractC17043 = abstractC17043M13451;
                        }
                        str = strM13492;
                        i = iM13484;
                        it = c4045M37393.f8893.iterator();
                        while (it.hasNext()) {
                            c9467 = (C9467) it.next();
                            if (mo3924()) {
                                break;
                                break;
                            }
                            c16469.m37397();
                            mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c16469.m37392() + str4 + c16469.m37396() + MotionUtils.EASING_TYPE_FORMAT_END);
                            z = c9467.f25915;
                            Iterator it5 = it;
                            String[] strArr3 = strArrM13494;
                            j = c9467.f25910;
                            int i6 = length;
                            str3 = c9467.f25908;
                            if (z) {
                                C5738 c57310 = new C5738(str3 + str4);
                                c57310.setTime(j);
                                c10844.m24987(c57310);
                                str4 = str4;
                            } else {
                                AbstractC17043 abstractC17045 = c9467.f25907;
                                if (zM49365) {
                                    c10844.m24992(C22959.m51283(str3, c16922));
                                }
                                mo13456(str3);
                                C5738 c57311 = new C5738(str3);
                                c57311.m12786(c9467.f25916);
                                c57311.setTime(j);
                                c10844.m24987(c57311);
                                abstractC17045.m38653(c10844.m24981(), new C13118(this, c16469));
                            }
                            strArrM13494 = strArr3;
                            it = it5;
                            length = i6;
                            str4 = str4;
                            zM49365 = zM49365;
                        }
                        str2 = str4;
                        strArr = strArrM13494;
                        i2 = length;
                        c10844.close();
                        if (mo3924()) {
                            C25187.m55252(arrayList2);
                            return C18736.m42768();
                        }
                        arrayList.addAll(arrayList2);
                        i4++;
                        i3 = 0;
                        strArrM13494 = strArr;
                        abstractC17043M13451 = abstractC17043;
                        strM13492 = str;
                        iM13484 = i;
                        length = i2;
                        str4 = str2;
                    } catch (Throwable th) {
                        try {
                            c10844.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    C25187.m55252(arrayList2);
                    throw e;
                }
            } else {
                String[] strArr4 = strArrM13494;
                if (!mo3924() && zM13488) {
                    C25187.m55254(this, strArr4, arrayList, c16469.m37396());
                }
                return m13481();
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        boolean zM13488 = m13488("compressToAnother");
        C25187.m55255(c18736, zM13488, zM13488 ? m13461(c18108) : m13478(c18107), c18107, c18108, C25187.m55250((List) this.f55212));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
