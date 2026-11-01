package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2543 {
    /* JADX INFO: renamed from: ֫ */
    public static void m3734(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z, boolean z2, InterfaceC23331 interfaceC23331) {
        AbstractC17043 abstractC17043M38685 = C17853.f53278.m38685();
        abstractC17043M38685.m38666();
        try {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                C5738 c5738M3732 = m3732(c19561);
                if (c5738M3732 == null) {
                    throw new C20807(R.string.MT_Protector);
                }
                C23292 c23292 = new C23292();
                C21320.m48334(c19561, c23292, null, abstractC17043M38685, interfaceC23331);
                if (interfaceC23331.mo38158()) {
                    c19561.close();
                    abstractC17043M38685.mo25503();
                    return;
                }
                interfaceC23331.mo38159();
                C5857 c5857M3733 = m3733(c19561.m44448(c5738M3732), c23292);
                if (interfaceC23331.mo38158()) {
                    c19561.close();
                    abstractC17043M38685.mo25503();
                } else {
                    C21320.m48333(abstractC17044, z, z2, interfaceC23331, c19561, abstractC17043M38685, c23292, c5857M3733, c5738M3732);
                    c19561.close();
                    abstractC17043M38685.mo25503();
                }
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC17043M38685.mo25503();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5738 m3732(C19561 c19561) {
        for (C5738 c5738 : c19561.m44469()) {
            if (!c5738.isDirectory()) {
                String lowerCase = c5738.getName().toLowerCase();
                if (!lowerCase.contains("/") && lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                    return c5738;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5857 m3733(InputStream inputStream, C23292 c23292) throws IOException {
        c23292.m51873(new C7869(c23292));
        c23292.m51873(new C8813(new C17295()));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            C14677 c14677 = new C14677(bufferedInputStream);
            ArrayList<C5897> arrayList = new ArrayList();
            C13706.m31160(c14677, new C4556(arrayList));
            bufferedInputStream.close();
            C5857 c5857 = new C5857(0);
            for (C5897 c5897 : arrayList) {
                c5857.m13141(new C4516(C10965.m25286(new StringBuilder("L"), c5897.f14517, C0249l.f1196b), C10965.m25286(new StringBuilder("L"), c5897.f14516, C0249l.f1196b)));
            }
            for (C5897 c5898 : arrayList) {
                C5187 c5187 = (C5187) c23292.m51875(c5898.f14516);
                if (c5187 != null) {
                    c5187.mo14967((Object) c5898.f14517);
                    for (C19979 c19979 : c5898.f14514) {
                        String str = c19979.f60652;
                        C12603 c12603 = new C12603(c23292.m51876(c5857.m13140(str, str)));
                        String str2 = c19979.f60653;
                        String str3 = c19979.f60654;
                        for (C14574 c14574 : c5187.m48107()) {
                            if (c14574.m14973().equals(str2) && c14574.m14972().equals(c12603)) {
                                C17295.m39206(c14574).mo14967(str3);
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C20650 c20650 : c5898.f14515) {
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_START);
                        C19542 c19542 = new C19542(c20650.f63775);
                        while (c19542.m44387()) {
                            String strM44388 = c19542.m44388();
                            arrayList2.add(c23292.m51876(c5857.m13140(strM44388, strM44388)));
                        }
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_END);
                        String str4 = c20650.f63775;
                        String strSubstring = str4.substring(str4.indexOf(41) + 1);
                        arrayList2.add(c23292.m51876(c5857.m13140(strSubstring, strSubstring)));
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        C3885 c3885 = new C3885(strArr, strArr.length);
                        arrayList2.clear();
                        String str5 = c20650.f63776;
                        String str6 = c20650.f63777;
                        for (C11893 c11893 : c5187.m48109()) {
                            if (c11893.m14973().equals(str5) && c11893.m14972().equals(c3885)) {
                                C17295.m39206(c11893).mo14967(str6);
                                break;
                            }
                        }
                    }
                }
            }
            C5857 c5858 = new C5857(0);
            c23292.m51873(new C16585(c5858));
            return c5858;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
