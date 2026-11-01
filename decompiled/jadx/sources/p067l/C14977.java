package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes4.dex */
public class C14977 extends AbstractC21614 {

    /* JADX INFO: renamed from: ۤ֫ */
    public static final /* synthetic */ int f42792 = 0;

    /* JADX INFO: renamed from: ۗ֫ */
    public AbstractC17043 f42793;

    /* JADX INFO: renamed from: ۫֫ */
    public C23105 f42794;

    /* JADX INFO: renamed from: ۬֫ */
    public C13146 f42795 = new C13146();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo25203("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        ArrayList arrayList;
        C19561 c19561;
        Throwable th;
        C19561 c19562;
        byte[] bArr;
        C19561 c19563;
        C20689 c20689;
        String[] strArrM13494 = m13494("ARG_PATHS");
        AbstractC17043 abstractC17043M38693 = C17853.f53278.m38693("");
        this.f42793 = abstractC17043M38693;
        abstractC17043M38693.m38666();
        String strSubstring = m13492("targetPath").substring(1);
        int iM13484 = m13484("level");
        int iM13485 = m13484("update");
        C13457 c13457M13469 = m13469();
        boolean zM13488 = m13488("keepApkSigBlock");
        AbstractC5375 abstractC5375 = (AbstractC5375) m13462();
        C20661 c20661 = (C20661) m13489();
        c20661.mo9717(false);
        C13146 c13146 = this.f42795;
        if (iM13485 != 0) {
            c13146.m30073(new C21684(strSubstring, c20661, iM13485));
        }
        this.f42795.m30072(abstractC5375, null, null, strArrM13494, this.f42793.mo25505(), new C6931(this));
        if (mo3924()) {
            return C18736.m42768();
        }
        m13472(R.string.MT_Protector);
        m48821(true);
        mo13456("...");
        AbstractC17043 abstractC17043M46674 = c20661.m46674();
        C23105 c23105M52841 = C23775.m52841(abstractC17043M46674, c13457M13469 != null);
        this.f42794 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        ArrayList arrayList2 = new ArrayList();
        try {
            C19561 c19564 = new C19561(abstractC17043M46674);
            try {
                if (c13457M13469 == null && zM13488) {
                    try {
                        if (c19564.m44460()) {
                            c10844M51527.m24990(c19564);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = arrayList2;
                        c19561 = c19564;
                    }
                }
                try {
                    if (c19564.m44471()) {
                        c10844M51527.m24999();
                    }
                    boolean zM11530 = AbstractDialogInterfaceOnClickListenerC5327.m11530(iM13484, c10844M51527);
                    C16922 c16922 = new C16922();
                    if (zM11530) {
                        c16922.m38499(c19564);
                    }
                    Iterator it = c13146.m30071().iterator();
                    long jM44466 = 0;
                    long size = 0;
                    while (it.hasNext()) {
                        C19561 c19565 = new C19561((AbstractC17043) it.next());
                        arrayList2.add(c19565);
                        for (C5738 c5738 : c19565.m44469()) {
                            if (!c5738.isDirectory()) {
                                size += c5738.getSize();
                            }
                        }
                        jM44466 += (long) c19565.m44466();
                    }
                    C20689 c206810 = new C20689(size);
                    c206810.m46753(new C4183(this));
                    HashSet hashSet = new HashSet();
                    byte[] bArr2 = new byte[1024];
                    Iterator it2 = arrayList2.iterator();
                    long j = 0;
                    while (true) {
                        long j2 = j;
                        AbstractC17043 abstractC17043 = abstractC17043M46674;
                        C13457 c13457 = c13457M13469;
                        if (it2.hasNext()) {
                            try {
                                Iterator it3 = it2;
                                C19561 c19566 = (C19561) it2.next();
                                for (C5738 c5739 : c19566.m44469()) {
                                    arrayList = arrayList2;
                                    try {
                                        byte[] bArr3 = bArr2;
                                        C19561 c19567 = c19566;
                                        long j3 = j2 + 1;
                                        c19562 = c19564;
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            C20689 c206811 = c206810;
                                            sb.append(C7050.m16224(R.string.MT_Protector));
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                                            sb.append(j3);
                                            sb.append("/");
                                            sb.append(jM44466);
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                                            mo13482(sb.toString());
                                            mo13456(c5739.getName());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strSubstring);
                                            String str = strSubstring;
                                            sb2.append(c5739.getName());
                                            C5738 c57310 = new C5738(sb2.toString());
                                            long j4 = jM44466;
                                            c57310.setTime(c5739.getTime());
                                            if (zM11530) {
                                                c10844M51527.m24992(C22959.m51283(c57310.getName(), c16922));
                                            }
                                            c10844M51527.m24987(c57310);
                                            hashSet.add(c57310.getName());
                                            if (!c57310.isDirectory()) {
                                                c19563 = c19567;
                                                InputStream inputStreamM44448 = c19563.m44448(c5739);
                                                bArr = bArr3;
                                                while (true) {
                                                    try {
                                                        int i = inputStreamM44448.read(bArr);
                                                        if (i == -1) {
                                                            c20689 = c206811;
                                                            inputStreamM44448.close();
                                                            break;
                                                        }
                                                        c10844M51527.write(bArr, 0, i);
                                                        C20689 c206812 = c206811;
                                                        c206812.m46754(i);
                                                        if (mo3924()) {
                                                            C18736 c18736M42768 = C18736.m42768();
                                                            inputStreamM44448.close();
                                                            c19562.close();
                                                            Iterator it4 = arrayList.iterator();
                                                            while (it4.hasNext()) {
                                                                C2700.m4192((C19561) it4.next());
                                                            }
                                                            return c18736M42768;
                                                        }
                                                        c206811 = c206812;
                                                    } catch (Throwable th3) {
                                                        try {
                                                            inputStreamM44448.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                    th = th;
                                                    th = th;
                                                    c19561 = c19562;
                                                    try {
                                                        c19561.close();
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th.addSuppressed(th5);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            bArr = bArr3;
                                            c19563 = c19567;
                                            c20689 = c206811;
                                            c10844M51527.m24997();
                                            if (mo3924()) {
                                                C18736 c18736M42769 = C18736.m42768();
                                                c19562.close();
                                                Iterator it5 = arrayList.iterator();
                                                while (it5.hasNext()) {
                                                    C2700.m4192((C19561) it5.next());
                                                }
                                                return c18736M42769;
                                            }
                                            c206810 = c20689;
                                            j2 = j3;
                                            arrayList2 = arrayList;
                                            jM44466 = j4;
                                            c19566 = c19563;
                                            bArr2 = bArr;
                                            c19564 = c19562;
                                            strSubstring = str;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c19562 = c19564;
                                    }
                                }
                                abstractC17043M46674 = abstractC17043;
                                j = j2;
                                c13457M13469 = c13457;
                                it2 = it3;
                            } catch (Throwable th8) {
                                th = th8;
                                arrayList = arrayList2;
                            }
                        } else {
                            arrayList = arrayList2;
                            C19561 c19568 = c19564;
                            try {
                                long jM44467 = c19568.m44466();
                                long jM51284 = 0;
                                for (C5738 c57311 : c19568.m44469()) {
                                    if (!c57311.isDirectory()) {
                                        jM51284 += zM11530 ? C22959.m51284(c57311, c16922) : c57311.m12774();
                                    }
                                }
                                C20689 c206813 = new C20689(jM51284);
                                c206813.m46753(new C4183(this));
                                long j5 = 0;
                                for (C5738 c57312 : c19568.m44469()) {
                                    j5++;
                                    if (hashSet.contains(c57312.getName())) {
                                        if (!c57312.isDirectory()) {
                                            c206813.m46752(zM11530 ? C22959.m51284(c57312, c16922) : c57312.m12774());
                                        }
                                        c19561 = c19568;
                                    } else {
                                        mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + j5 + "/" + jM44467 + MotionUtils.EASING_TYPE_FORMAT_END);
                                        mo13456(c57312.getName());
                                        c19561 = c19568;
                                        try {
                                            C22959.m51285(c19561, c10844M51527, c57312, c16922, new C5590(this, c206813));
                                            if (mo3924()) {
                                                C18736 c18736M427610 = C18736.m42768();
                                                c19561.close();
                                                Iterator it6 = arrayList.iterator();
                                                while (it6.hasNext()) {
                                                    C2700.m4192((C19561) it6.next());
                                                }
                                                return c18736M427610;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            th = th;
                                            c19561.close();
                                            throw th;
                                        }
                                    }
                                    c19568 = c19561;
                                    zM11530 = zM11530;
                                }
                                C19561 c19569 = c19568;
                                c10844M51527.close();
                                if (c13457 != null) {
                                    C11896.m27217(this.f42794, c13457, this);
                                }
                                if (mo3924()) {
                                    C18736 c18736M427611 = C18736.m42768();
                                    c19569.close();
                                    Iterator it7 = arrayList.iterator();
                                    while (it7.hasNext()) {
                                        C2700.m4192((C19561) it7.next());
                                    }
                                    return c18736M427611;
                                }
                                C20272.m45790(abstractC17043);
                                C19056 c19056 = new C19056();
                                c19056.m43296(abstractC17043);
                                this.f42794.m51526(abstractC17043, new RunnableC17196(3, this, abstractC17043), c19569);
                                c19056.m43298(abstractC17043);
                                c19569.close();
                                Iterator it8 = arrayList.iterator();
                                while (it8.hasNext()) {
                                    C2700.m4192((C19561) it8.next());
                                }
                                return m13481();
                            } catch (Throwable th10) {
                                th = th10;
                                c19561 = c19568;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    arrayList = arrayList2;
                    c19561 = c19564;
                }
            } catch (Throwable th12) {
                th = th12;
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    C2700.m4192((C19561) it9.next());
                }
                throw th;
            }
        } catch (Throwable th13) {
            th = th13;
            arrayList = arrayList2;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            if (m13478(c18107)) {
                c18107.m41267();
            }
            if (m13461(c18108)) {
                c18108.m41226((Collection) this.f42795.m30074());
                c18108.m41241();
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C23105 c23105;
        AbstractC17043 abstractC17043 = this.f42793;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
        if (!c18736.m42773() && (c23105 = this.f42794) != null) {
            C2700.m4192(c23105.m51527());
            this.f42794.m51525().mo25503();
        }
        C17127.m38756();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, C7050.m16224(R.string.MT_Protector).toLowerCase());
    }
}
