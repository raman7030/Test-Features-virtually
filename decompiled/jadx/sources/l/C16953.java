package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public class C16953 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f52032 = "null";

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f52031 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, this.f52032);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
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
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        AbstractC15440 abstractC15440;
        String str;
        int i;
        Iterator it;
        String str2;
        String[] strArr;
        int i2;
        C7469 c7469;
        boolean z;
        long j;
        String str3;
        String str4 = "/";
        AbstractC15440 abstractC15440M11515 = m11515("outputDir");
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("password");
        int iM11548 = m11548("level");
        boolean zM11552 = m11552("deleteSources");
        int i3 = 0;
        C14836 c14836 = new C14836(this, strArrM11558, false);
        if (mo1526()) {
            return C17222.m40521();
        }
        int length = strArrM11558.length;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f52031;
            if (i4 < length) {
                AbstractC15440 abstractC15440M39866 = C16999.m39866(strArrM11558[i4], new String[i3]);
                AbstractC15440 abstractC15440M36492 = abstractC15440M11515.m36526((abstractC15440M39866.mo23113() ? abstractC15440M39866.getName() : abstractC15440M39866.m36517()) + ".zip").m36492(true);
                this.f52032 = abstractC15440M36492.getName();
                C1764 c1764M35238 = c14836.m35238(i4);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(abstractC15440M36492);
                try {
                    C8918 c8918 = new C8918(abstractC15440M36492);
                    try {
                        c8918.m23026(strM11556);
                        boolean zM47042 = AbstractC20546.m47042(iM11548, c8918);
                        C15313 c15313 = new C15313();
                        if (zM47042) {
                            abstractC15440 = abstractC15440M11515;
                            Iterator it2 = c1764M35238.f6117.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Iterator it3 = it2;
                                    C7469 c74610 = (C7469) it2.next();
                                    str = strM11556;
                                    if (!c74610.f23002) {
                                        i = iM11548;
                                        if (c74610.f22995.equals("AndroidManifest.xml")) {
                                            try {
                                                C15206 c15206M35971 = C15206.m35971(c74610.f22994);
                                                c15313.f46967 = C22263.m49982(c15206M35971);
                                                c15313.f46966 = C22263.m49984(c15206M35971);
                                                break;
                                            } catch (Exception unused) {
                                                c15313.f46967 = false;
                                                c15313.f46966 = false;
                                                break;
                                            }
                                        }
                                        C24009.m52846(arrayList2);
                                        throw e;
                                    }
                                    i = iM11548;
                                    strM11556 = str;
                                    it2 = it3;
                                    iM11548 = i;
                                }
                            }
                            it = c1764M35238.f6117.iterator();
                            while (it.hasNext()) {
                                c7469 = (C7469) it.next();
                                if (mo1526()) {
                                    break;
                                }
                                c14836.m35242();
                                mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c14836.m35237() + str4 + c14836.m35241() + MotionUtils.EASING_TYPE_FORMAT_END);
                                z = c7469.f23002;
                                Iterator it4 = it;
                                String[] strArr2 = strArrM11558;
                                j = c7469.f22997;
                                int i5 = length;
                                str3 = c7469.f22995;
                                if (z) {
                                    C3545 c3545 = new C3545(str3 + str4);
                                    c3545.setTime(j);
                                    c8918.m23013(c3545);
                                    str4 = str4;
                                } else {
                                    AbstractC15440 abstractC15441 = c7469.f22994;
                                    if (zM47042) {
                                        c8918.m23018(C21665.m48934(str3, c15313));
                                    }
                                    mo11520(str3);
                                    C3545 c3546 = new C3545(str3);
                                    c3546.m10805(c7469.f23003);
                                    c3546.setTime(j);
                                    c8918.m23013(c3546);
                                    abstractC15441.m36495(c8918.m23007(), new C11310(this, c14836));
                                }
                                strArrM11558 = strArr2;
                                it = it4;
                                length = i5;
                                str4 = str4;
                                zM47042 = zM47042;
                            }
                            str2 = str4;
                            strArr = strArrM11558;
                            i2 = length;
                            c8918.close();
                            if (mo1526()) {
                                C24009.m52846(arrayList2);
                                return C17222.m40521();
                            }
                            arrayList.addAll(arrayList2);
                            i4++;
                            i3 = 0;
                            strArrM11558 = strArr;
                            abstractC15440M11515 = abstractC15440;
                            strM11556 = str;
                            iM11548 = i;
                            length = i2;
                            str4 = str2;
                        } else {
                            abstractC15440 = abstractC15440M11515;
                        }
                        str = strM11556;
                        i = iM11548;
                        it = c1764M35238.f6117.iterator();
                        while (it.hasNext()) {
                            c7469 = (C7469) it.next();
                            if (mo1526()) {
                                break;
                                break;
                            }
                            c14836.m35242();
                            mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c14836.m35237() + str4 + c14836.m35241() + MotionUtils.EASING_TYPE_FORMAT_END);
                            z = c7469.f23002;
                            Iterator it5 = it;
                            String[] strArr3 = strArrM11558;
                            j = c7469.f22997;
                            int i6 = length;
                            str3 = c7469.f22995;
                            if (z) {
                                C3545 c3547 = new C3545(str3 + str4);
                                c3547.setTime(j);
                                c8918.m23013(c3547);
                                str4 = str4;
                            } else {
                                AbstractC15440 abstractC15442 = c7469.f22994;
                                if (zM47042) {
                                    c8918.m23018(C21665.m48934(str3, c15313));
                                }
                                mo11520(str3);
                                C3545 c3548 = new C3545(str3);
                                c3548.m10805(c7469.f23003);
                                c3548.setTime(j);
                                c8918.m23013(c3548);
                                abstractC15442.m36495(c8918.m23007(), new C11310(this, c14836));
                            }
                            strArrM11558 = strArr3;
                            it = it5;
                            length = i6;
                            str4 = str4;
                            zM47042 = zM47042;
                        }
                        str2 = str4;
                        strArr = strArrM11558;
                        i2 = length;
                        c8918.close();
                        if (mo1526()) {
                            C24009.m52846(arrayList2);
                            return C17222.m40521();
                        }
                        arrayList.addAll(arrayList2);
                        i4++;
                        i3 = 0;
                        strArrM11558 = strArr;
                        abstractC15440M11515 = abstractC15440;
                        strM11556 = str;
                        iM11548 = i;
                        length = i2;
                        str4 = str2;
                    } catch (Throwable th) {
                        try {
                            c8918.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    C24009.m52846(arrayList2);
                    throw e;
                }
            } else {
                String[] strArr4 = strArrM11558;
                if (!mo1526() && zM11552) {
                    C24009.m52848(this, strArr4, arrayList, c14836.m35241());
                }
                return m11545();
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        boolean zM11552 = m11552("compressToAnother");
        C24009.m52849(c17222, zM11552, zM11552 ? m11525(c16561) : m11542(c16560), c16560, c16561, C24009.m52844((List) this.f52031));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
