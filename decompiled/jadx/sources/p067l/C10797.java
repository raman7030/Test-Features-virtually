package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10797 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20856 f29928;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f29929 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f29930 = new ArrayList();

    public C10797(C20856 c20856) {
        this.f29928 = c20856;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24876() {
        for (C3065 c3065 : ((HashMap) this.f29928.f65538).values()) {
            if (c3065.f5534 != null) {
                this.f29930.add(c3065);
            } else if (c3065.f5539 != null) {
                this.f29929.add(c3065);
            } else {
                throw new IOException("Bad xml item: " + c3065.f5532);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m24877() {
        ArrayList arrayList = this.f29929;
        Collections.sort(arrayList);
        ArrayList<C3065> arrayList2 = this.f29930;
        Collections.sort(arrayList2);
        MessageDigest messageDigestM36668 = C16111.m36668();
        messageDigestM36668.update((byte) -127);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            messageDigestM36668.update(((C3065) it.next()).f5532.getBytes(Charset.defaultCharset()));
        }
        messageDigestM36668.update(C0684bo.f2503h);
        for (C3065 c3065 : arrayList2) {
            messageDigestM36668.update(c3065.f5532.getBytes(Charset.defaultCharset()));
            messageDigestM36668.update(c3065.f5534.m29399());
        }
        messageDigestM36668.update((byte) -123);
        return messageDigestM36668.digest();
    }
}
