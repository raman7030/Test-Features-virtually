package p067l;

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
public final class C12329 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11500 f34413;

    /* JADX INFO: renamed from: ֫ */
    public static C12329 m28403(InputStream inputStream) throws IOException {
        C8996 c8996 = new C8996(new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)));
        try {
            C14340 c14340 = new C14340();
            c8996.m20816(c14340);
            C12329 c12329M32937 = c14340.m32937();
            c8996.close();
            return c12329M32937;
        } catch (Throwable th) {
            try {
                c8996.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C12329(Map map) {
        new HashMap();
        C8817 c8817M26550 = AbstractC11500.m26550();
        for (Map.Entry entry : ((AbstractC11500) map).entrySet()) {
            c8817M26550.mo20376((String) entry.getKey(), ((C24398) entry.getValue()).m53816());
        }
        this.f34413 = c8817M26550.mo20378();
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashMap m28404() {
        AbstractC11500 abstractC11500 = this.f34413;
        HashMap map = new HashMap(abstractC11500.size());
        AbstractC21520 it = abstractC11500.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            map.put((String) entry.getKey(), ((C4302) entry.getValue()).f9571);
        }
        return map;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ArrayList arrayList = new ArrayList(this.f34413.values());
            Collections.sort(arrayList, C10162.comparing(new C9891(3)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4302) it.next()).m8745(stringWriter);
            }
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12329) {
            return this.f34413.equals(((C12329) obj).f34413);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34413.hashCode() * 31;
    }
}
