package p067l;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.engio.mbassy.listener.MessageHandler;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.۬۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14842 {

    /* JADX INFO: renamed from: ۜ */
    public static final C6796 f42318 = new C6796();

    /* JADX INFO: renamed from: ᩷ */
    public static final Random f42319 = new Random();

    /* JADX INFO: renamed from: ֫ */
    public String f42320;

    /* JADX INFO: renamed from: ᩳ */
    public C13502 f42325;

    /* JADX INFO: renamed from: ᩻ */
    public final C21727 f42326 = new C21727();

    /* JADX INFO: renamed from: ܿ */
    public final C23738 f42324 = new C23738();

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f42322 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6974 f42321 = AbstractC6974.f18145;

    /* JADX INFO: renamed from: ܽ */
    public long f42323 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized String m33884() {
        return this.f42320;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized String m33885(AbstractC6974 abstractC6974, C17474 c17474) {
        return m33876(abstractC6974.mo15985(c17474.f52252, this.f42324).f75532, c17474).f13018;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m33886(C2772 c2772) {
        C13502 c13502;
        String str = this.f42320;
        if (str != null) {
            C5455 c5455 = (C5455) this.f42322.get(str);
            c5455.getClass();
            m33878(c5455);
        }
        Iterator it = this.f42322.values().iterator();
        while (it.hasNext()) {
            C5455 c5456 = (C5455) it.next();
            it.remove();
            if (c5456.f13016 && (c13502 = this.f42325) != null) {
                c13502.m30655(c2772, c5456.f13018);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m33887(C2772 c2772, int i) {
        this.f42325.getClass();
        boolean z = i == 0;
        Iterator it = this.f42322.values().iterator();
        while (it.hasNext()) {
            C5455 c5455 = (C5455) it.next();
            if (c5455.m11977(c2772)) {
                it.remove();
                if (c5455.f13016) {
                    boolean zEquals = c5455.f13018.equals(this.f42320);
                    if (z && zEquals) {
                        boolean unused = c5455.f13014;
                    }
                    if (zEquals) {
                        m33878(c5455);
                    }
                    this.f42325.m30655(c2772, c5455.f13018);
                }
            }
        }
        m33883(c2772);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m33889(C2772 c2772) {
        this.f42325.getClass();
        if (c2772.f4668.m15990()) {
            return;
        }
        C17474 c17474 = c2772.f4671;
        if (c17474 != null) {
            if (c17474.f52251 < m33881()) {
                return;
            }
            C5455 c5455 = (C5455) this.f42322.get(this.f42320);
            if (c5455 != null && c5455.f13019 == -1 && c5455.f13015 != c2772.f4669) {
                return;
            }
        }
        C5455 c5455M33876 = m33876(c2772.f4669, c2772.f4671);
        if (this.f42320 == null) {
            this.f42320 = c5455M33876.f13018;
        }
        C17474 c17475 = c2772.f4671;
        if (c17475 != null && c17475.m39842()) {
            C17474 c17476 = c2772.f4671;
            Object obj = c17476.f52252;
            C5455 c5455M33877 = m33876(c2772.f4669, new C17474(c17476.f52248, c17476.f52251, obj));
            if (!c5455M33877.f13016) {
                c5455M33877.f13016 = true;
                c2772.f4668.mo15985(c2772.f4671.f52252, this.f42324);
                this.f42324.m52774(c2772.f4671.f52248);
                Math.max(0L, C5792.m13013(0L) + C5792.m13013(this.f42324.f75530));
                this.f42325.getClass();
            }
        }
        if (!c5455M33876.f13016) {
            c5455M33876.f13016 = true;
            this.f42325.getClass();
        }
        if (c5455M33876.f13018.equals(this.f42320) && !c5455M33876.f13014) {
            c5455M33876.f13014 = true;
            this.f42325.m30654(c2772, c5455M33876.f13018);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m33890(C2772 c2772) {
        this.f42325.getClass();
        AbstractC6974 abstractC6974 = this.f42321;
        this.f42321 = c2772.f4668;
        Iterator it = this.f42322.values().iterator();
        while (it.hasNext()) {
            C5455 c5455 = (C5455) it.next();
            if (!c5455.m11978(abstractC6974, this.f42321) || c5455.m11977(c2772)) {
                it.remove();
                if (c5455.f13016) {
                    if (c5455.f13018.equals(this.f42320)) {
                        m33878(c5455);
                    }
                    this.f42325.m30655(c2772, c5455.f13018);
                }
            }
        }
        m33883(c2772);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33888(C13502 c13502) {
        this.f42325 = c13502;
    }

    @RequiresNonNull({MessageHandler.Properties.Listener})
    /* JADX INFO: renamed from: ᩳ */
    private void m33883(C2772 c2772) {
        AbstractC6974 abstractC6974 = c2772.f4668;
        int i = c2772.f4669;
        C17474 c17474 = c2772.f4671;
        boolean zM15990 = abstractC6974.m15990();
        HashMap map = this.f42322;
        if (zM15990) {
            String str = this.f42320;
            if (str != null) {
                C5455 c5455 = (C5455) map.get(str);
                c5455.getClass();
                m33878(c5455);
                return;
            }
            return;
        }
        C5455 c5456 = (C5455) map.get(this.f42320);
        this.f42320 = m33876(i, c17474).f13018;
        m33889(c2772);
        if (c17474 != null) {
            long j = c17474.f52251;
            if (c17474.m39842()) {
                if (c5456 != null && c5456.f13019 == j && c5456.f13013 != null && c5456.f13013.f52248 == c17474.f52248 && c5456.f13013.f52249 == c17474.f52249) {
                    return;
                }
                m33876(i, new C17474(j, c17474.f52252));
                this.f42325.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33878(C5455 c5455) {
        if (c5455.f13019 != -1) {
            this.f42323 = c5455.f13019;
        }
        this.f42320 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public long m33881() {
        C5455 c5455 = (C5455) this.f42322.get(this.f42320);
        if (c5455 != null && c5455.f13019 != -1) {
            return c5455.f13019;
        }
        return this.f42323 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    private C5455 m33876(int i, C17474 c17474) {
        HashMap map = this.f42322;
        C5455 c5455 = null;
        long j = C14849.FOREVER_NS;
        for (C5455 c5456 : map.values()) {
            c5456.m11979(i, c17474);
            if (c5456.m11976(i, c17474)) {
                long j2 = c5456.f13019;
                if (j2 == -1 || j2 < j) {
                    c5455 = c5456;
                    j = j2;
                } else if (j2 == j) {
                    String str = C5792.f14228;
                    if (c5455.f13013 != null && c5456.f13013 != null) {
                        c5455 = c5456;
                    }
                }
            }
        }
        if (c5455 != null) {
            return c5455;
        }
        String strM33879 = m33879();
        C5455 c5457 = new C5455(this, strM33879, i, c17474);
        map.put(strM33879, c5457);
        return c5457;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m33879() {
        byte[] bArr = new byte[12];
        f42319.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
