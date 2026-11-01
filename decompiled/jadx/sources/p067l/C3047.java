package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public class C3047 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩶֫ */
    public static final /* synthetic */ int f5459 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public int f5460;

    /* JADX INFO: renamed from: ֨֫ */
    public long f5461;

    /* JADX INFO: renamed from: ۚ֫ */
    public String f5463;

    /* JADX INFO: renamed from: ܶ֫ */
    public C23105 f5465;

    /* JADX INFO: renamed from: ᩸֫ */
    public Collection f5468;

    /* JADX INFO: renamed from: ᩹֫ */
    public C19561 f5469;

    /* JADX INFO: renamed from: ᩵֫ */
    public C4045 f5467 = new C4045();

    /* JADX INFO: renamed from: ᩴ֫ */
    public ArrayList f5466 = new ArrayList();

    /* JADX INFO: renamed from: ۘ֫ */
    public HashSet f5462 = new HashSet();

    /* JADX INFO: renamed from: ۠֫ */
    public HashSet f5464 = new HashSet();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79719;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("zipPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        HashMap map;
        HashSet hashSet;
        C16922 c16922;
        String strM53357;
        C4045 c4045;
        C16922 c16923;
        String str;
        C3047 c3047;
        C16922 c16924;
        InputStream inputStreamMo29987;
        String str2;
        C4045 c4046;
        HashSet hashSet2;
        C3047 c3048 = this;
        AbstractC17043 abstractC17043M13451 = c3048.m13451("zipPath");
        String[] strArrM13494 = c3048.m13494("ARG_PATHS");
        c3048.f5463 = c3048.m13492("rename");
        int iM13484 = c3048.m13484("level");
        int iM13485 = c3048.m13484("update");
        boolean zM13488 = c3048.m13488("deleteSources");
        String strM13492 = c3048.m13492("basePath");
        C13457 c13457M13469 = m13469();
        boolean zM13489 = c3048.m13488("keepApkSigBlock");
        C19210.m43750(abstractC17043M13451, EnumC17868.MODIFY_FILE);
        C20483 c20483 = new C20483(c3048);
        C4045 c4047 = c3048.f5467;
        c4047.m8102(strArrM13494, false, c20483);
        if (mo3924()) {
            return C18736.m42768();
        }
        C19561 c19561 = new C19561(abstractC17043M13451);
        c3048.f5469 = c19561;
        c3048.f5468 = c19561.m44469();
        C23105 c23105M52841 = C23775.m52841(abstractC17043M13451, c13457M13469 != null);
        c3048.f5465 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        if (c13457M13469 == null && zM13489 && c3048.f5469.m44460()) {
            c10844M51527.m24990(c3048.f5469);
        }
        if (c3048.f5469.m44471()) {
            c10844M51527.m24999();
        }
        boolean zM11530 = AbstractDialogInterfaceOnClickListenerC5327.m11530(iM13484, c10844M51527);
        C16922 c16925 = new C16922();
        if (zM11530) {
            c16925.m38499(c3048.f5469);
        }
        HashSet hashSet3 = c3048.f5464;
        if (zM13488) {
            hashSet3.add(abstractC17043M13451);
        }
        C10844 c10844M51528 = c3048.f5465.m51527();
        if (iM13485 == 0) {
            map = null;
        } else {
            map = new HashMap();
            for (Iterator it = c3048.f5468.iterator(); it.hasNext(); it = it) {
                C5738 c5738 = (C5738) it.next();
                if (!c5738.isDirectory()) {
                    map.put(c5738.getName(), c5738);
                }
            }
        }
        String str3 = c3048.f5463;
        Iterator it2 = c4047.f8893.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            strArrM13494 = strArrM13494;
            hashSet = c3048.f5462;
            zM13488 = zM13488;
            abstractC17043M13451 = abstractC17043M13451;
            c13457M13469 = c13457M13469;
            if (!zHasNext) {
                break;
            }
            it2 = it2;
            C9467 c9467 = (C9467) it2.next();
            if (mo3924()) {
                break;
            }
            c4047.m8105();
            c10844M51527 = c10844M51527;
            String strM48621 = c9467.f25908;
            AbstractC17043 abstractC17043 = c9467.f25907;
            long j = c9467.f25910;
            C4045 c4048 = c4047;
            HashSet hashSet4 = hashSet3;
            long j2 = c9467.f25916;
            if (str3.isEmpty()) {
                c16922 = c16925;
            } else {
                int iIndexOf = strM48621.indexOf(47);
                c16922 = c16925;
                strM48621 = iIndexOf == -1 ? str3 : C21459.m48621(iIndexOf, strM48621, C7470.m17248(str3));
            }
            if (c9467.f25915) {
                strM53357 = C24104.m53357(strM13492, strM48621, "/");
                C5738 c5739 = new C5738(strM53357);
                c5739.setTime(j);
                c10844M51528.m24987(c5739);
                c4045 = c4048;
                c16923 = c16922;
                str = strM13492;
                c3047 = this;
            } else {
                String strM40053 = C17588.m40053(strM13492, strM48621);
                try {
                    if (iM13485 != 0) {
                        C12826.requireNonNull(map);
                        C5738 c57310 = (C5738) map.get(strM40053);
                        if (c57310 != null) {
                            if (iM13485 != 1) {
                                c4046 = c4048;
                                hashSet2 = hashSet4;
                                c4046.m8100(j2);
                                hashSet2.add(abstractC17043);
                            } else if (c57310.getTime() >= abstractC17043.mo25091()) {
                                c4046 = c4048;
                                c4046.m8100(j2);
                                hashSet2 = hashSet4;
                                hashSet2.add(abstractC17043);
                            }
                            c3048 = this;
                            c4047 = c4046;
                            hashSet3 = hashSet2;
                            c16925 = c16922;
                        }
                    }
                    C5738 c57311 = new C5738(strM40053);
                    c57311.m12786(j2);
                    c57311.setTime(j);
                    c10844M51528.m24987(c57311);
                    byte[] bArr = new byte[4096];
                    long j3 = 0;
                    while (true) {
                        int i = inputStreamMo29987.read(bArr);
                        if (i <= 0) {
                            str2 = strM40053;
                            str = strM13492;
                            c10844M51528.m24997();
                            break;
                        }
                        str2 = strM40053;
                        c10844M51528.write(bArr, 0, i);
                        byte[] bArr2 = bArr;
                        long j4 = j3 + ((long) i);
                        str = strM13492;
                        c3047.m52470(j4, c57311.getSize());
                        c3047.m13477(c4045.m8103() + j4, c4045.m8106());
                        if (mo3924()) {
                            break;
                        }
                        strM40053 = str2;
                        strM13492 = str;
                        bArr = bArr2;
                        j3 = j4;
                    }
                    inputStreamMo29987.close();
                    c4045.m8100(j2);
                    strM53357 = str2;
                } catch (Throwable th) {
                    if (inputStreamMo29987 == null) {
                        throw th;
                    }
                    try {
                        inputStreamMo29987.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                c4045 = c4048;
                if (zM11530) {
                    c16924 = c16922;
                    c10844M51528.m24992(C22959.m51283(strM40053, c16924));
                } else {
                    c16924 = c16922;
                }
                StringBuilder sb = new StringBuilder();
                c16923 = c16924;
                sb.append(C7050.m16224(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sb.append(c4045.m8099());
                sb.append("/");
                sb.append(c4045.m8104());
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                String string = sb.toString();
                c3047 = this;
                c3047.mo13482(string);
                c3047.mo13456(strM40053);
                inputStreamMo29987 = abstractC17043.mo29987();
            }
            hashSet.add(strM53357);
            if (!hashSet4.contains(abstractC17043)) {
                c3047.f5460++;
            }
            if (strM48621.indexOf(47) == -1) {
                c3047.f5466.add(strM48621);
            }
            c3048 = c3047;
            c4047 = c4045;
            hashSet3 = hashSet4;
            zM11530 = zM11530;
            iM13485 = iM13485;
            strM13492 = str;
            c16925 = c16923;
        }
        C3047 c3049 = c3048;
        C10844 c10844 = c10844M51527;
        if (mo3924()) {
            return C18736.m42768();
        }
        C10844 c10844M51529 = c3049.f5465.m51527();
        C21154 c21154 = new C21154(c3049, C23775.m52838(c3049.f5468));
        int i2 = 0;
        for (C5738 c57312 : c3049.f5468) {
            if (mo3924()) {
                break;
            }
            i2++;
            if (!hashSet.contains(c57312.getName())) {
                c3049.mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i2 + "/" + c3049.f5468.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                c3049.mo13456(c57312.getName());
                if (c57312.isDirectory()) {
                    c10844M51529.m24987(c57312);
                } else {
                    C23775.m52845(c57312, c3049.f5469, c10844M51529, c21154);
                    c3049.f5461 = c57312.m12774() + c3049.f5461;
                }
            } else if (!c57312.isDirectory()) {
                c3049.f5461 = c57312.m12774() + c3049.f5461;
            }
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        c10844.close();
        if (c13457M13469 != null) {
            C11896.m27217(c3049.f5465, c13457M13469, c3049);
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        C20272.m45790(abstractC17043M13451);
        C19056 c19056 = new C19056();
        c19056.m43296(abstractC17043M13451);
        c3049.f5465.m51526(abstractC17043M13451, new RunnableC13181(c3049, abstractC17043M13451, 1), c3049.f5469);
        c19056.m43298(abstractC17043M13451);
        if (zM13488) {
            boolean z = c3049.f5460 > 1;
            if (z) {
                c3049.m13472(R.string.MT_Protector);
                c3049.mo13474(0);
                c3049.m52469(0);
            }
            for (String str4 : strArrM13494) {
                AbstractC17043 abstractC17043M42109 = C18524.m42109(str4, new String[0]);
                EnumC18126 enumC18126M41309 = EnumC18126.m41309(abstractC17043M42109.mo25087());
                if (z && abstractC17043M42109.mo25087() && !abstractC17043M42109.m38691()) {
                    c3049.mo13456(abstractC17043M42109.getName());
                }
                if (c3049.m5145(abstractC17043M42109, z)) {
                    enumC18126M41309.m41311(str4);
                }
            }
        }
        return C18736.m42767();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m5145(AbstractC17043 abstractC17043, boolean z) {
        if (abstractC17043.mo25087() && !abstractC17043.m38691()) {
            boolean z2 = true;
            Iterator it = abstractC17043.mo25500(true).iterator();
            while (it.hasNext()) {
                if (!m5145((AbstractC17043) it.next(), z)) {
                    z2 = false;
                }
            }
            if (z2) {
                if (z) {
                    mo13456(abstractC17043.getName());
                }
                return abstractC17043.mo29990();
            }
        } else if (!this.f5464.contains(abstractC17043)) {
            if (z) {
                mo13456(abstractC17043.getName());
            }
            return abstractC17043.mo29990();
        }
        return false;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            if (m13478(c18107)) {
                c18107.m41267();
            }
            if (m13461(c18108)) {
                c18108.m41226((Collection) this.f5466);
                c18108.m41241();
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C23105 c23105;
        if (!c18736.m42773() && (c23105 = this.f5465) != null) {
            C2700.m4192(c23105.m51527());
            this.f5465.m51525().mo25503();
        }
        C2700.m4192(this.f5469);
        C17127.m38756();
    }
}
