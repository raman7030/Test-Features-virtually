package p067l;

import android.net.Uri;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩳܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19560 {

    /* JADX INFO: renamed from: ֫ */
    public static final WeakHashMap f59535 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ */
    public static long f59536;

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24196 m44419(ActivityC17586 activityC17586, AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370) {
        long jLongValue;
        C12826.requireNonNull(abstractC15599);
        C12826.requireNonNull(interfaceC19370);
        if ((abstractC15599 instanceof C4744) || (abstractC15599 instanceof C13757)) {
            AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
            String name = interfaceC19370.getName();
            C12826.requireNonNull(abstractC17043Mo26445);
            C12826.requireNonNull(name);
            if (!abstractC17043Mo26445.mo33653()) {
                return new C24512(abstractC17043Mo26445, C6316.m14442(abstractC17043Mo26445, new StringBuilder("mfile:")), name);
            }
            Uri uriMo33652 = abstractC17043Mo26445.mo33652();
            C12826.requireNonNull(uriMo33652);
            if (!"content".equals(uriMo33652.getScheme())) {
                throw new IllegalArgumentException("Expected a content URI");
            }
            return new C15794("uri:" + uriMo33652, name, new C16433(uriMo33652), uriMo33652);
        }
        if (!(abstractC15599 instanceof C20661) && !(abstractC15599 instanceof C4598) && !(abstractC15599 instanceof AbstractC5375) && !(abstractC15599 instanceof C19121) && !(abstractC15599 instanceof C13315) && !(abstractC15599 instanceof C7150)) {
            throw new IllegalArgumentException("Unsupported gallery visitor");
        }
        WeakHashMap weakHashMap = f59535;
        synchronized (weakHashMap) {
            Long lValueOf = (Long) weakHashMap.get(abstractC15599);
            if (lValueOf == null) {
                long j = f59536 + 1;
                f59536 = j;
                lValueOf = Long.valueOf(j);
                weakHashMap.put(abstractC15599, lValueOf);
            }
            jLongValue = lValueOf.longValue();
        }
        StringBuilder sbM33191 = C14536.m33191("visitor:", ":", jLongValue);
        sbM33191.append(interfaceC19370.getPath());
        return new C4137(abstractC15599, interfaceC19370, sbM33191.toString(), interfaceC19370.getName(), interfaceC19370.getPath(), new WeakReference(activityC17586));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44420(StringBuilder sb, AbstractC15599 abstractC15599) throws IOException {
        if (abstractC15599 instanceof C20661) {
            m44421(((C20661) abstractC15599).m46674(), sb);
            return;
        }
        if (abstractC15599 instanceof C4598) {
            Iterator it = ((C4598) abstractC15599).m9726().iterator();
            while (it.hasNext()) {
                m44421((AbstractC17043) it.next(), sb);
            }
        } else if (abstractC15599 instanceof C19121) {
            m44421(((C19121) abstractC15599).m43447(), sb);
        } else if (abstractC15599 instanceof C13315) {
            m44421(((C13315) abstractC15599).m30396(), sb);
        } else if (abstractC15599 instanceof C7150) {
            m44421(((C7150) abstractC15599).m16437(), sb);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44421(AbstractC17043 abstractC17043, StringBuilder sb) throws IOException {
        if (!abstractC17043.mo25093()) {
            throw new IOException("Image container is no longer a regular file");
        }
        String strMo25505 = abstractC17043.mo25505();
        sb.append('|');
        sb.append(strMo25505.length());
        sb.append(':');
        sb.append(strMo25505);
        sb.append(':');
        sb.append(abstractC17043.mo25101());
        sb.append(':');
        sb.append(abstractC17043.mo25091());
    }
}
