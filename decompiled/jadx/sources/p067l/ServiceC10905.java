package p067l;

import android.content.Intent;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC10905 extends AbstractServiceC1398 {

    /* JADX INFO: renamed from: ۛ */
    public static final C18724 f30230;

    /* JADX INFO: renamed from: ۨ */
    public static final C1782 f30232 = new C1782();

    /* JADX INFO: renamed from: ᩺ */
    public static final C1782 f30234 = new C1782();

    /* JADX INFO: renamed from: ۤ */
    public static final C1782 f30231 = new C1782();

    /* JADX INFO: renamed from: ܰ */
    public static HashMap f30233 = new HashMap();

    static {
        C19395 c19395M23272 = C9959.m23272();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c19395M23272.m44153(1L, timeUnit);
        c19395M23272.m44155(1L, timeUnit);
        c19395M23272.m44145(1L, timeUnit);
        c19395M23272.m44147(new C16663());
        c19395M23272.m44152(new C7938());
        f30230 = c19395M23272.m44143();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25160(C18280 c18280) {
        if (f30233.containsKey(c18280.f54573) || f30234.contains(c18280.f54573)) {
            return false;
        }
        f30232.add(c18280.f54573);
        Intent intent = new Intent();
        intent.putExtra("task", new C11576(c18280));
        AbstractServiceC1398.m29845(C7050.m16232(), intent);
        return true;
    }

    @Override // p067l.AbstractServiceC1398
    /* JADX INFO: renamed from: ֫ */
    public final void mo25162(Intent intent) {
        String strM38647;
        C11576 c11576 = (C11576) intent.getParcelableExtra("task");
        C12826.requireNonNull(c11576);
        String str = c11576.f32246;
        f30232.remove(str);
        C1782 c1782 = f30231;
        c1782.remove(str);
        HashMap map = f30233;
        if (map.containsKey(str)) {
            return;
        }
        AbstractC17043 abstractC17043M38684 = C18951.m43058().m38684(str);
        AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684("packageUpload");
        AbstractC17043 abstractC17043M38686 = abstractC17043M38684.m38684("key");
        if (abstractC17043M38685.mo25094()) {
            final C8893 c8893 = new C8893(str);
            map.put(str, c8893);
            try {
                try {
                    abstractC17043M38684.m38684(C0708d.f2599O).mo25503();
                    if (abstractC17043M38686.mo25094()) {
                        strM38647 = abstractC17043M38686.m38647();
                        c8893.m20500(100);
                    } else {
                        String[] strArrM8514 = C4199.m8514(abstractC17043M38685, c11576.f32247);
                        C20689 c20689 = new C20689(abstractC17043M38685.mo25101());
                        c20689.m46753(new InterfaceC4595() { // from class: l.ܳܺۢ
                            @Override // p067l.InterfaceC4595
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8466(int i) {
                                c8893.m20500(i);
                            }
                        });
                        C24986 c24986 = new C24986();
                        c24986.f79760 = str;
                        c24986.f79758 = abstractC17043M38685;
                        c24986.f79759 = c20689;
                        C11349 c11349 = new C11349();
                        c11349.m26292(strArrM8514[0]);
                        c11349.m26287("PUT", c24986);
                        c11349.m26293("Content-Md5", strArrM8514[2]);
                        InterfaceC18228 interfaceC18228M42716 = f30230.m42716(c11349.m26284());
                        c24986.f79757 = interfaceC18228M42716;
                        C20066 c20066Execute = interfaceC18228M42716.execute();
                        if (interfaceC18228M42716.mo41458()) {
                            map.remove(str);
                            return;
                        } else {
                            if (!c20066Execute.m45439()) {
                                throw new IOException("Unexpected response code " + c20066Execute);
                            }
                            strM38647 = strArrM8514[1];
                            abstractC17043M38686.m38668(strM38647);
                        }
                    }
                    if (c1782.contains(str)) {
                        map.remove(str);
                        return;
                    }
                    int iM8511 = C4199.m8511(strM38647, c11576);
                    abstractC17043M38685.mo25503();
                    abstractC17043M38686.mo25503();
                    f30234.add(str);
                    Intent intent2 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_SUCCESS");
                    intent2.putExtra("taskID", str);
                    intent2.putExtra("id", iM8511);
                    C7050.m16209(intent2);
                    map.remove(str);
                } catch (Exception e) {
                    Intent intent3 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_FAIL");
                    intent3.putExtra("taskID", str);
                    if ((e instanceof C3924) || (e instanceof C20807)) {
                        intent3.putExtra("message", e.getMessage());
                    }
                    C7050.m16209(intent3);
                    map.remove(str);
                }
            } catch (Throwable th) {
                map.remove(str);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m25161(String str) {
        return f30233.containsKey(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25159(String str) {
        C8893 c8893 = (C8893) f30233.get(str);
        if (c8893 == null) {
            return f30232.contains(str) ? 0 : 100;
        }
        return c8893.f24100;
    }
}
