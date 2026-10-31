package l;

import android.content.Intent;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC8982 extends AbstractServiceC11215 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C17209 f27295;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C18955 f27297 = new C18955();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C18955 f27299 = new C18955();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18955 f27296 = new C18955();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap f27298 = new HashMap();

    static {
        C17915 c17915M21306 = C7987.m21306();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c17915M21306.m41904(1L, timeUnit);
        c17915M21306.m41906(1L, timeUnit);
        c17915M21306.m41896(1L, timeUnit);
        c17915M21306.m41898(new C15041());
        c17915M21306.m41903(new C5860());
        f27295 = c17915M21306.m41894();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23216(C16742 c16742) {
        if (f27298.containsKey(c16742.f51390) || f27299.contains(c16742.f51390)) {
            return false;
        }
        f27297.add(c16742.f51390);
        Intent intent = new Intent();
        intent.putExtra("task", new C9688(c16742));
        AbstractServiceC11215.m27783(C4925.m14335(), intent);
        return true;
    }

    @Override // l.AbstractServiceC11215
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23218(Intent intent) {
        String strM36489;
        C9688 c9688 = (C9688) intent.getParcelableExtra("task");
        C11003.requireNonNull(c9688);
        String str = c9688.f29296;
        f27297.remove(str);
        C18955 c18955 = f27296;
        c18955.remove(str);
        HashMap map = f27298;
        if (map.containsKey(str)) {
            return;
        }
        AbstractC15440 abstractC15440M36526 = C17448.m40800().m36526(str);
        AbstractC15440 abstractC15440M36527 = abstractC15440M36526.m36526("packageUpload");
        AbstractC15440 abstractC15440M36528 = abstractC15440M36526.m36526("key");
        if (abstractC15440M36527.mo23120()) {
            final C6865 c6865 = new C6865(str);
            map.put(str, c6865);
            try {
                try {
                    abstractC15440M36526.m36526(d.O).mo23552();
                    if (abstractC15440M36528.mo23120()) {
                        strM36489 = abstractC15440M36528.m36489();
                        c6865.m18551(100);
                    } else {
                        String[] strArrM6341 = C1926.m6341(abstractC15440M36527, c9688.f29297);
                        C19277 c19277 = new C19277(abstractC15440M36527.mo23127());
                        c19277.m44459(new InterfaceC2343() { // from class: l.ܳܺۢ
                            @Override // l.InterfaceC2343
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6264(int i) {
                                c6865.m18551(i);
                            }
                        });
                        C23798 c23798 = new C23798();
                        c23798.f77007 = str;
                        c23798.f77005 = abstractC15440M36527;
                        c23798.f77006 = c19277;
                        C9449 c9449 = new C9449();
                        c9449.m24282(strArrM6341[0]);
                        c9449.m24277("PUT", c23798);
                        c9449.m24283("Content-Md5", strArrM6341[2]);
                        InterfaceC16687 interfaceC16687M40469 = f27295.m40469(c9449.m24274());
                        c23798.f77004 = interfaceC16687M40469;
                        C18621 c18621Execute = interfaceC16687M40469.execute();
                        if (interfaceC16687M40469.mo39223()) {
                            map.remove(str);
                            return;
                        } else {
                            if (!c18621Execute.m43173()) {
                                throw new IOException("Unexpected response code " + c18621Execute);
                            }
                            strM36489 = strArrM6341[1];
                            abstractC15440M36528.m36510(strM36489);
                        }
                    }
                    if (c18955.contains(str)) {
                        map.remove(str);
                        return;
                    }
                    int iM6338 = C1926.m6338(strM36489, c9688);
                    abstractC15440M36527.mo23552();
                    abstractC15440M36528.mo23552();
                    f27299.add(str);
                    Intent intent2 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_SUCCESS");
                    intent2.putExtra("taskID", str);
                    intent2.putExtra("id", iM6338);
                    C4925.m14312(intent2);
                    map.remove(str);
                } catch (Exception e) {
                    Intent intent3 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_FAIL");
                    intent3.putExtra("taskID", str);
                    if ((e instanceof C1637) || (e instanceof C19401)) {
                        intent3.putExtra("message", e.getMessage());
                    }
                    C4925.m14312(intent3);
                    map.remove(str);
                }
            } catch (Throwable th) {
                map.remove(str);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m23217(String str) {
        return f27298.containsKey(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23215(String str) {
        C6865 c6865 = (C6865) f27298.get(str);
        if (c6865 == null) {
            return f27297.contains(str) ? 0 : 100;
        }
        return c6865.f21221;
    }
}
