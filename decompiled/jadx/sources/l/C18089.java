package l;

import android.net.Uri;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩳܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18089 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f56323 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f56324;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC22967 m42160(ActivityC16012 activityC16012, AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889) {
        long jLongValue;
        C11003.requireNonNull(abstractC13921);
        C11003.requireNonNull(interfaceC17889);
        if ((abstractC13921 instanceof C2499) || (abstractC13921 instanceof C11982)) {
            AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
            String name = interfaceC17889.getName();
            C11003.requireNonNull(abstractC15440Mo24433);
            C11003.requireNonNull(name);
            if (!abstractC15440Mo24433.mo31568()) {
                return new C23299(abstractC15440Mo24433, C4153.m12552(abstractC15440Mo24433, new StringBuilder("mfile:")), name);
            }
            Uri uriMo31567 = abstractC15440Mo24433.mo31567();
            C11003.requireNonNull(uriMo31567);
            if (!"content".equals(uriMo31567.getScheme())) {
                throw new IllegalArgumentException("Expected a content URI");
            }
            return new C14126("uri:" + uriMo31567, name, new C14798(uriMo31567), uriMo31567);
        }
        if (!(abstractC13921 instanceof C19247) && !(abstractC13921 instanceof C2346) && !(abstractC13921 instanceof AbstractC3163) && !(abstractC13921 instanceof C17626) && !(abstractC13921 instanceof C11518) && !(abstractC13921 instanceof C5031)) {
            throw new IllegalArgumentException("Unsupported gallery visitor");
        }
        WeakHashMap weakHashMap = f56323;
        synchronized (weakHashMap) {
            Long lValueOf = (Long) weakHashMap.get(abstractC13921);
            if (lValueOf == null) {
                long j = f56324 + 1;
                f56324 = j;
                lValueOf = Long.valueOf(j);
                weakHashMap.put(abstractC13921, lValueOf);
            }
            jLongValue = lValueOf.longValue();
        }
        StringBuilder sbM31106 = C12803.m31106("visitor:", ":", jLongValue);
        sbM31106.append(interfaceC17889.getPath());
        return new C1861(abstractC13921, interfaceC17889, sbM31106.toString(), interfaceC17889.getName(), interfaceC17889.getPath(), new WeakReference(activityC16012));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42161(StringBuilder sb, AbstractC13921 abstractC13921) throws IOException {
        if (abstractC13921 instanceof C19247) {
            m42162(((C19247) abstractC13921).m44380(), sb);
            return;
        }
        if (abstractC13921 instanceof C2346) {
            Iterator it = ((C2346) abstractC13921).m7655().iterator();
            while (it.hasNext()) {
                m42162((AbstractC15440) it.next(), sb);
            }
        } else if (abstractC13921 instanceof C17626) {
            m42162(((C17626) abstractC13921).m41201(), sb);
        } else if (abstractC13921 instanceof C11518) {
            m42162(((C11518) abstractC13921).m28350(), sb);
        } else if (abstractC13921 instanceof C5031) {
            m42162(((C5031) abstractC13921).m14533(), sb);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42162(AbstractC15440 abstractC15440, StringBuilder sb) throws IOException {
        if (!abstractC15440.mo23119()) {
            throw new IOException("Image container is no longer a regular file");
        }
        String strMo23554 = abstractC15440.mo23554();
        sb.append('|');
        sb.append(strMo23554.length());
        sb.append(':');
        sb.append(strMo23554);
        sb.append(':');
        sb.append(abstractC15440.mo23127());
        sb.append(':');
        sb.append(abstractC15440.mo23117());
    }
}
