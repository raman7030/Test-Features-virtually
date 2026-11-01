package p067l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.֫᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes2.dex */
public final class C4302 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11500 f9567;

    /* JADX INFO: renamed from: ۧ */
    public final Map f9568;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC11500 f9569;

    /* JADX INFO: renamed from: ܿ */
    public final String f9570;

    /* JADX INFO: renamed from: ᩳ */
    public final String f9571;

    public C4302() {
        throw null;
    }

    public C4302(String str, String str2, HashMap map, HashMap map2, Map map3) {
        this.f9570 = str;
        this.f9571 = str2;
        this.f9569 = AbstractC11500.copyOf((Map) map);
        this.f9567 = AbstractC11500.copyOf((Map) map2);
        this.f9568 = map3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8745(StringWriter stringWriter) throws IOException {
        stringWriter.append((CharSequence) this.f9571);
        stringWriter.append(" -> ");
        stringWriter.append((CharSequence) this.f9570);
        stringWriter.append(":\n");
        AbstractC21520 it = this.f9567.values().iterator();
        while (it.hasNext()) {
            C16371 c16371 = (C16371) it.next();
            if (!c16371.m37187()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c16371.toString()).append('\n');
            }
        }
        AbstractC21520 it2 = this.f9569.values().iterator();
        while (it2.hasNext()) {
            C16371 c16372 = (C16371) it2.next();
            if (!c16372.m37187()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c16372.toString()).append('\n');
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = this.f9568.values().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(((C9646) it3.next()).f26557);
        }
        Collections.sort(arrayList, C10162.comparingInt(new C13670()));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            stringWriter.append(ASN1Dump.TAB).append((CharSequence) ((C15680) it4.next()).toString()).append('\n');
        }
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            m8745(stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4302)) {
            return false;
        }
        C4302 c4302 = (C4302) obj;
        return this.f9571.equals(c4302.f9571) && this.f9570.equals(c4302.f9570) && this.f9569.equals(c4302.f9569) && this.f9567.equals(c4302.f9567) && this.f9568.equals(c4302.f9568);
    }

    public final int hashCode() {
        return this.f9568.hashCode() + ((this.f9567.hashCode() + ((this.f9569.hashCode() + C12832.m29411(this.f9571.hashCode() * 31, 31, this.f9570)) * 31)) * 31);
    }
}
