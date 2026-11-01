package p067l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K8B6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21094 extends AbstractC15599 {

    /* JADX INFO: renamed from: ۗ */
    public C24925 f66273;

    /* JADX INFO: renamed from: ۙ */
    public Map f66274;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f66275;

    /* JADX INFO: renamed from: ᩶ */
    public Map f66276;

    /* JADX INFO: renamed from: ᩹ */
    public List f66277;

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "multi-unix-zip";
    }

    public C21094(ArrayList arrayList) {
        this.f66275 = arrayList;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (AbstractC17043 abstractC17043 : this.f66275) {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                Collection collectionM44469 = c19561.m44469();
                arrayList.addAll(collectionM44469);
                map.putAll(c19561.m44454());
                Iterator it = collectionM44469.iterator();
                while (it.hasNext()) {
                    map2.put(((C5738) it.next()).getName(), abstractC17043);
                }
                c19561.close();
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Collections.sort(arrayList, C19561.f59537);
        this.f66277 = C21562.unmodifiableList(arrayList);
        this.f66274 = C21562.unmodifiableMap(map);
        this.f66276 = C21562.unmodifiableMap(map2);
        this.f66273 = new C24925(arrayList);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) {
        C5738 c5738M33002 = ((C14387) interfaceC19370).m33002();
        AbstractC17043 abstractC17043 = (AbstractC17043) this.f66276.get(c5738M33002.getName());
        C12826.requireNonNull(abstractC17043);
        return new BufferedInputStream(C23775.m52839(c5738M33002, abstractC17043, null, null, null));
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        String strSubstring = str.substring(1);
        if (this.f66274 == null) {
            mo9717(false);
        }
        C5738 c5738 = (C5738) this.f66274.get(strSubstring);
        if (c5738 == null && strSubstring.endsWith("/")) {
            c5738 = (C5738) this.f66273.m7176(strSubstring);
        }
        if (c5738 == null) {
            return null;
        }
        return new C14387(c5738);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("multi-unix-zip".getBytes());
        Iterator it = this.f66275.iterator();
        while (it.hasNext()) {
            C16111.m36662(messageDigest, ((AbstractC17043) it.next()).mo25505());
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        if (this.f66277 == null) {
            mo9717(false);
        }
        List listM7180 = this.f66273.m7180(str.substring(1));
        ArrayList arrayList = new ArrayList(listM7180.size());
        Iterator it = listM7180.iterator();
        while (it.hasNext()) {
            arrayList.add(new C14387((C5738) it.next()));
        }
        return arrayList;
    }
}
