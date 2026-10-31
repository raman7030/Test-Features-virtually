package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B7W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10480 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f31449;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10480 m26371(InputStream inputStream) throws IOException {
        C6973 c6973 = new C6973(new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)));
        try {
            C12596 c12596 = new C12596();
            c6973.m18862(c12596);
            C10480 c10480M30860 = c12596.m30860();
            c6973.close();
            return c10480M30860;
        } catch (Throwable th) {
            try {
                c6973.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C10480(Map map) {
        new HashMap();
        C6785 c6785M24537 = AbstractC9608.m24537();
        for (Map.Entry entry : ((AbstractC9608) map).entrySet()) {
            c6785M24537.mo18428((String) entry.getKey(), ((C23179) entry.getValue()).m51420());
        }
        this.f31449 = c6785M24537.mo18430();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap m26372() {
        AbstractC9608 abstractC9608 = this.f31449;
        HashMap map = new HashMap(abstractC9608.size());
        AbstractC20151 it = abstractC9608.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            map.put((String) entry.getKey(), ((C2034) entry.getValue()).f6787);
        }
        return map;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ArrayList arrayList = new ArrayList(this.f31449.values());
            Collections.sort(arrayList, C8200.comparing(new C7915(3)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2034) it.next()).m6619(stringWriter);
            }
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10480) {
            return this.f31449.equals(((C10480) obj).f31449);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31449.hashCode() * 31;
    }
}
