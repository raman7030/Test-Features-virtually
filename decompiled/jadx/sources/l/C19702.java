package l;

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
public final class C19702 extends AbstractC13921 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C23734 f63642;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f63643;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f63644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Map f63645;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f63646;

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "multi-unix-zip";
    }

    public C19702(ArrayList arrayList) {
        this.f63644 = arrayList;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (AbstractC15440 abstractC15440 : this.f63644) {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                Collection collectionM42210 = c18090.m42210();
                arrayList.addAll(collectionM42210);
                map.putAll(c18090.m42195());
                Iterator it = collectionM42210.iterator();
                while (it.hasNext()) {
                    map2.put(((C3545) it.next()).getName(), abstractC15440);
                }
                c18090.close();
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Collections.sort(arrayList, C18090.f56325);
        this.f63646 = C20195.unmodifiableList(arrayList);
        this.f63643 = C20195.unmodifiableMap(map);
        this.f63645 = C20195.unmodifiableMap(map2);
        this.f63642 = new C23734(arrayList);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        C3545 c3545M30924 = ((C12645) interfaceC17889).m30924();
        AbstractC15440 abstractC15440 = (AbstractC15440) this.f63645.get(c3545M30924.getName());
        C11003.requireNonNull(abstractC15440);
        return new BufferedInputStream(C22523.m50497(c3545M30924, abstractC15440, null, null, null));
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        String strSubstring = str.substring(1);
        if (this.f63643 == null) {
            mo7646(false);
        }
        C3545 c3545 = (C3545) this.f63643.get(strSubstring);
        if (c3545 == null && strSubstring.endsWith("/")) {
            c3545 = (C3545) this.f63642.m4933(strSubstring);
        }
        if (c3545 == null) {
            return null;
        }
        return new C12645(c3545);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("multi-unix-zip".getBytes());
        Iterator it = this.f63644.iterator();
        while (it.hasNext()) {
            C14460.m34528(messageDigest, ((AbstractC15440) it.next()).mo23554());
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f63646 == null) {
            mo7646(false);
        }
        List listM4937 = this.f63642.m4937(str.substring(1));
        ArrayList arrayList = new ArrayList(listM4937.size());
        Iterator it = listM4937.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12645((C3545) it.next()));
        }
        return arrayList;
    }
}
