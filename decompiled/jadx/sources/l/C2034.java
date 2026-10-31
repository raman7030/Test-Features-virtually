package l;

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
public final class C2034 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f6783;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f6784;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f6785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f6786;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f6787;

    public C2034() {
        throw null;
    }

    public C2034(String str, String str2, HashMap map, HashMap map2, Map map3) {
        this.f6786 = str;
        this.f6787 = str2;
        this.f6785 = AbstractC9608.copyOf((Map) map);
        this.f6783 = AbstractC9608.copyOf((Map) map2);
        this.f6784 = map3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6619(StringWriter stringWriter) throws IOException {
        stringWriter.append((CharSequence) this.f6787);
        stringWriter.append(" -> ");
        stringWriter.append((CharSequence) this.f6786);
        stringWriter.append(":\n");
        AbstractC20151 it = this.f6783.values().iterator();
        while (it.hasNext()) {
            C14733 c14733 = (C14733) it.next();
            if (!c14733.m35040()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c14733.toString()).append('\n');
            }
        }
        AbstractC20151 it2 = this.f6785.values().iterator();
        while (it2.hasNext()) {
            C14733 c14734 = (C14733) it2.next();
            if (!c14734.m35040()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c14734.toString()).append('\n');
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = this.f6784.values().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(((C7657) it3.next()).f23643);
        }
        Collections.sort(arrayList, C8200.comparingInt(new C11891()));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            stringWriter.append(ASN1Dump.TAB).append((CharSequence) ((C14006) it4.next()).toString()).append('\n');
        }
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            m6619(stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2034)) {
            return false;
        }
        C2034 c2034 = (C2034) obj;
        return this.f6787.equals(c2034.f6787) && this.f6786.equals(c2034.f6786) && this.f6785.equals(c2034.f6785) && this.f6783.equals(c2034.f6783) && this.f6784.equals(c2034.f6784);
    }

    public final int hashCode() {
        return this.f6784.hashCode() + ((this.f6783.hashCode() + ((this.f6785.hashCode() + C11010.m27349(this.f6787.hashCode() * 31, 31, this.f6786)) * 31)) * 31);
    }
}
