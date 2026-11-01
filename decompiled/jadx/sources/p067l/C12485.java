package p067l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p058y.C0248k;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۧ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12485 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicLong f34999 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f35000 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f34998 = Pattern.compile("(.*) \\((\\d+)\\)");

    /* JADX INFO: renamed from: ܿ */
    public static final C12485 f34997 = new C12485();

    /* JADX INFO: renamed from: ܽ */
    public static final C21734 f34996 = new C21734();

    /* JADX INFO: renamed from: ֫ */
    public static C12485 m28744() {
        return f34997;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28774(String str, String str2, String str3, boolean z, boolean z2) {
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return;
        }
        synchronized (c3767) {
            m28747(c3767, SystemClock.elapsedRealtime());
            if (!c3767.f8012 && !c3767.f8008.contains(str2)) {
                C24415 c24415 = c3767.f8043;
                if (c24415 != null && TextUtils.equals(c24415.f77311, str2)) {
                    C9663 c9663 = (C9663) c3767.f8038.get(c24415.f77307);
                    if (c9663 == null) {
                        m28756(c3767);
                        m28755(c3767);
                        return;
                    }
                    boolean z3 = "replace".equals(str3) && z2 && c24415.f77308;
                    c3767.f8008.add(str2);
                    c3767.f8002 = str3;
                    c3767.f8036 = z3;
                    if (c24415.f77312) {
                        c9663.f26627 = "pending";
                        if (z) {
                            c3767.f8004 = true;
                            c3767.f8028 = str3;
                            c3767.f8006 = z3;
                            c3767.f8024 = null;
                        } else {
                            String unused = c24415.f77311;
                            c3767.f8024 = new C13687(c24415.f77307, c24415.f77311, str3, z3);
                        }
                        m28756(c3767);
                    } else if (z) {
                        c3767.f8004 = true;
                        c3767.f8028 = str3;
                        c3767.f8006 = z3;
                        for (C9663 c9664 : c3767.f8038.values()) {
                            if (c9664.f26628) {
                                m28750(c3767, c9664, str3, z3);
                            }
                        }
                        m28756(c3767);
                    } else {
                        m28750(c3767, c9663, str3, z3);
                        m28756(c3767);
                        m28767(c3767);
                    }
                    m28755(c3767);
                    return;
                }
                m28755(c3767);
                return;
            }
            m28755(c3767);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m28777(String str) {
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return false;
        }
        synchronized (c3767) {
            if (c3767.f8012) {
                return true;
            }
            m28747(c3767, SystemClock.elapsedRealtime());
            c3767.f8031 = true;
            m28756(c3767);
            if (!(c3767.f8041 || c3767.f8025)) {
                m28759(c3767);
            } else {
                m28755(c3767);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final LinkedHashMap m28776(String str) {
        LinkedHashMap linkedHashMapM28754;
        LinkedHashMap linkedHashMapM28755;
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return null;
        }
        synchronized (c3767) {
            m28747(c3767, SystemClock.elapsedRealtime());
            if (!c3767.f8012 && !c3767.f8037 && c3767.f8043 == null) {
                Iterator it = c3767.f8038.values().iterator();
                do {
                    if (!it.hasNext()) {
                        c3767.f8041 = true;
                        m28762(c3767);
                        ArrayList<C9663> arrayListM28766 = m28766(c3767);
                        try {
                            try {
                                for (C9663 c9663 : arrayListM28766) {
                                    synchronized (c3767) {
                                        if (c3767.f8012) {
                                            LinkedHashMap linkedHashMapM28756 = m28754(c3767);
                                            synchronized (c3767) {
                                                c3767.f8041 = false;
                                                if (!c3767.f8012) {
                                                    if (c3767.f8031) {
                                                        m28759(c3767);
                                                    } else {
                                                        c3767.f8037 = true;
                                                        m28755(c3767);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM28756;
                                        }
                                        if (c3767.f8031) {
                                            m28759(c3767);
                                            LinkedHashMap linkedHashMapM28757 = m28754(c3767);
                                            synchronized (c3767) {
                                                c3767.f8041 = false;
                                                if (!c3767.f8012) {
                                                    if (c3767.f8031) {
                                                        m28759(c3767);
                                                    } else {
                                                        c3767.f8037 = true;
                                                        m28755(c3767);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM28757;
                                        }
                                        c3767.f8003 = c9663.f26622;
                                        AbstractC17043 abstractC17043M28745 = m28745(c3767, c9663);
                                        try {
                                            C19210.m43750(abstractC17043M28745, EnumC17868.MODIFY_FILE);
                                            if (abstractC17043M28745.mo25094() && !abstractC17043M28745.mo25087()) {
                                                synchronized (c3767) {
                                                    m28757(c3767, m28764(abstractC17043M28745.mo25505()));
                                                    linkedHashMapM28755 = m28754(c3767);
                                                }
                                                synchronized (c3767) {
                                                    c3767.f8041 = false;
                                                    if (!c3767.f8012) {
                                                        if (c3767.f8031) {
                                                            m28759(c3767);
                                                        } else {
                                                            c3767.f8037 = true;
                                                            m28755(c3767);
                                                        }
                                                    }
                                                }
                                                return linkedHashMapM28755;
                                            }
                                            if (!abstractC17043M28745.mo25094()) {
                                                abstractC17043M28745.m38666();
                                                C16114.m36688(abstractC17043M28745.mo25505(), true);
                                            }
                                            synchronized (c3767) {
                                                if (!m28760(c9663.f26627)) {
                                                    c9663.f26627 = "success";
                                                    String strM46051 = C20393.m46051(abstractC17043M28745.mo25505());
                                                    if (!TextUtils.isEmpty(strM46051) && !"/".equals(strM46051)) {
                                                        strM46051 = strM46051.concat("/");
                                                    }
                                                    c9663.f26626 = strM46051;
                                                    c3767.f8009++;
                                                    if (c9663.f26616) {
                                                        c3767.f8034.add(c9663.f26626);
                                                    }
                                                    m28755(c3767);
                                                }
                                            }
                                        } catch (C3924 e) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                synchronized (c3767) {
                                    c3767.f8041 = false;
                                    if (!c3767.f8012) {
                                        if (c3767.f8031) {
                                            m28759(c3767);
                                        } else {
                                            c3767.f8037 = true;
                                            m28755(c3767);
                                        }
                                    }
                                }
                                synchronized (c3767) {
                                    linkedHashMapM28754 = m28754(c3767);
                                }
                                return linkedHashMapM28754;
                            } catch (IOException e2) {
                                synchronized (c3767) {
                                    if (!c3767.f8012) {
                                        m28757(c3767, m28768(e2.getMessage()));
                                    }
                                    throw e2;
                                }
                            }
                        } catch (Throwable th) {
                            synchronized (c3767) {
                                c3767.f8041 = false;
                                if (!c3767.f8012) {
                                    if (c3767.f8031) {
                                        m28759(c3767);
                                    } else {
                                        c3767.f8037 = true;
                                        m28755(c3767);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } while (!((C9663) it.next()).f26628);
            }
            m28755(c3767);
            return m28754(c3767);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap m28772(String str, String str2) {
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return null;
        }
        synchronized (c3767) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m28747(c3767, jElapsedRealtime);
            if (!c3767.f8012 && !c3767.f8031 && c3767.f8043 == null && c3767.f8037) {
                String strM28765 = m28765(c3767);
                if (!TextUtils.isEmpty(strM28765) && TextUtils.equals(strM28765, str2)) {
                    C9663 c9663 = (C9663) c3767.f8038.get(str2);
                    if (c9663 != null && C9663.m22518(c9663)) {
                        if (TextUtils.equals(c3767.f8033, str2) && TextUtils.equals(c9663.f26627, "armed") && jElapsedRealtime - c3767.f8029 <= 60000) {
                            m28762(c3767);
                            m28755(c3767);
                            return m28754(c3767);
                        }
                        AbstractC17043 abstractC17043M28745 = m28745(c3767, c9663);
                        if (c9663.f26619) {
                            if (abstractC17043M28745.mo25094() && abstractC17043M28745.mo25087()) {
                                m28757(c3767, m28764(abstractC17043M28745.mo25505()));
                                return m28754(c3767);
                            }
                        } else if (abstractC17043M28745.mo25094()) {
                            if (abstractC17043M28745.mo25087()) {
                                m28757(c3767, m28764(abstractC17043M28745.mo25505()));
                                return m28754(c3767);
                            }
                            if (!m28758(c3767, c9663) && !c3767.f8004) {
                                m28751(c3767, c9663, abstractC17043M28745);
                                m28755(c3767);
                                return m28754(c3767);
                            }
                        } else {
                            m28748(c3767, c9663.f26622);
                        }
                        c9663.f26627 = "armed";
                        c3767.f8033 = c9663.f26622;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("-a");
                        long j = c3767.f8015;
                        c3767.f8015 = 1 + j;
                        sb.append(j);
                        c3767.f8019 = sb.toString();
                        c3767.f8029 = jElapsedRealtime;
                        c3767.f8003 = c9663.f26622;
                        m28762(c3767);
                        m28755(c3767);
                        return m28754(c3767);
                    }
                    m28763(c3767, strM28765);
                    m28755(c3767);
                    return m28754(c3767);
                }
                m28763(c3767, strM28765);
                m28755(c3767);
                return m28754(c3767);
            }
            m28755(c3767);
            return m28754(c3767);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0281 */
    /* JADX WARN: Code duplicated, block: B:155:0x023b  */
    /* JADX WARN: Code duplicated, block: B:158:0x024a A[Catch: all -> 0x027e, TryCatch #10 {all -> 0x027e, blocks: (B:156:0x023c, B:158:0x024a, B:166:0x0278, B:167:0x027c, B:159:0x024e, B:165:0x026d, B:162:0x0259, B:164:0x0266), top: B:234:0x023c, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x024e A[Catch: all -> 0x027e, TryCatch #10 {all -> 0x027e, blocks: (B:156:0x023c, B:158:0x024a, B:166:0x0278, B:167:0x027c, B:159:0x024e, B:165:0x026d, B:162:0x0259, B:164:0x0266), top: B:234:0x023c, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:247:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[Catch: all -> 0x021a, IOException -> 0x022b, CancellationException -> 0x0283, SYNTHETIC, TryCatch #21 {all -> 0x021a, blocks: (B:31:0x008f, B:32:0x0094, B:68:0x010c, B:71:0x0119, B:93:0x016b, B:94:0x0178, B:111:0x01d6, B:175:0x0285, B:177:0x028b, B:179:0x0290, B:194:0x02b5, B:120:0x01e5, B:121:0x01e6, B:122:0x01fe, B:137:0x0219, B:136:0x0216, B:145:0x0224, B:146:0x022a, B:181:0x0292, B:182:0x02a1), top: B:253:0x008e, inners: #6 }] */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap m28773(String str, String str2, String str3, long j, InputStream inputStream) throws Throwable {
        IOException iOException;
        String str4;
        Throwable th;
        AbstractC17043 abstractC17043;
        LinkedHashMap linkedHashMapM28754;
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return null;
        }
        synchronized (c3767) {
            m28747(c3767, SystemClock.elapsedRealtime());
            if (!c3767.f8012 && !c3767.f8031) {
                if (TextUtils.equals(c3767.f8033, str2) && TextUtils.equals(c3767.f8019, str3)) {
                    C9663 c9663 = (C9663) c3767.f8038.get(str2);
                    if (c9663 != null && C9663.m22518(c9663)) {
                        if (j != c9663.f26618) {
                            throw new C8322(C7050.m16224(R.string.MT_Protector));
                        }
                        c3767.f8025 = true;
                        C12346 c12346M28761 = m28761(c3767, c9663);
                        AbstractC17043 abstractC17044 = null;
                        if (!c12346M28761.f34452) {
                            c3767.f8025 = false;
                            m28755(c3767);
                            return m28754(c3767);
                        }
                        AbstractC17043 abstractC17045 = c12346M28761.f34450;
                        AbstractC17043 abstractC17046 = c12346M28761.f34453;
                        boolean z = c12346M28761.f34451;
                        boolean z2 = c12346M28761.f34454;
                        long j2 = c9663.f26618;
                        try {
                            try {
                                try {
                                    try {
                                        C19210.m43750(abstractC17046, EnumC17868.MODIFY_FILE);
                                        OutputStream outputStreamMo25506 = abstractC17046.mo25506(false);
                                        int i = 65536;
                                        try {
                                            byte[] bArr = new byte[65536];
                                            long j3 = 0;
                                            while (true) {
                                                if (j3 >= j2) {
                                                    abstractC17043 = abstractC17046;
                                                    break;
                                                }
                                                try {
                                                    try {
                                                        synchronized (c3767) {
                                                            try {
                                                                if (c3767.f8031) {
                                                                    throw new CancellationException();
                                                                }
                                                                abstractC17043 = abstractC17046;
                                                                try {
                                                                    bArr = bArr;
                                                                    int i2 = inputStream.read(bArr, 0, (int) Math.min(i, j2 - j3));
                                                                    if (i2 == -1) {
                                                                        break;
                                                                    }
                                                                    outputStreamMo25506.write(bArr, 0, i2);
                                                                    long j4 = j2;
                                                                    long j5 = i2;
                                                                    j3 += j5;
                                                                    synchronized (c3767) {
                                                                        c3767.f8007 += j5;
                                                                        c3767.f8014 = m28742(c3767, i2);
                                                                        c3767.f8003 = c9663.f26622;
                                                                        m28755(c3767);
                                                                    }
                                                                    abstractC17046 = abstractC17043;
                                                                    j2 = j4;
                                                                    i = 65536;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    th = th;
                                                                    if (outputStreamMo25506 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        outputStreamMo25506.close();
                                                                        throw th;
                                                                    } catch (Throwable th3) {
                                                                        th.addSuppressed(th3);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    if (outputStreamMo25506 != null) {
                                                        throw th;
                                                    }
                                                    outputStreamMo25506.close();
                                                    throw th;
                                                }
                                            }
                                            outputStreamMo25506.flush();
                                            try {
                                                outputStreamMo25506.close();
                                                if (j3 != c9663.f26618) {
                                                    throw new IOException(C7050.m16203(R.string.MT_Protector, c9663.f26622));
                                                }
                                                try {
                                                    synchronized (c3767) {
                                                        try {
                                                            if (c3767.f8031) {
                                                                throw new CancellationException();
                                                            }
                                                            if (!z2 && abstractC17045.mo25094()) {
                                                                c3767.f8007 = Math.max(0L, c3767.f8007 - j3);
                                                                c3767.f8014 = 0L;
                                                                c3767.f8020 = 0L;
                                                                c3767.f8005 = 0L;
                                                                c3767.f8025 = false;
                                                                m28751(c3767, c9663, abstractC17045);
                                                                m28755(c3767);
                                                                if (abstractC17043.mo25094()) {
                                                                    abstractC17043.mo25503();
                                                                }
                                                                LinkedHashMap linkedHashMapM28755 = m28754(c3767);
                                                                synchronized (c3767) {
                                                                    c3767.f8025 = false;
                                                                    c3767.f8014 = 0L;
                                                                }
                                                                return linkedHashMapM28755;
                                                            }
                                                            m28752(abstractC17045, abstractC17043, z, z2, c3767);
                                                            C16114.m36688(abstractC17045.mo25505(), true);
                                                            synchronized (c3767) {
                                                                c9663.f26627 = "success";
                                                                c9663.f26626 = C20393.m46051(abstractC17045.mo25505());
                                                                c9663.f26615 = "";
                                                                c3767.f8009++;
                                                                if (c9663.f26616) {
                                                                    c3767.f8034.add(c9663.f26626);
                                                                }
                                                                c3767.f8025 = false;
                                                                c3767.f8003 = c9663.f26622;
                                                                c3767.f8014 = 0L;
                                                                m28762(c3767);
                                                                m28755(c3767);
                                                                linkedHashMapM28754 = m28754(c3767);
                                                            }
                                                            synchronized (c3767) {
                                                                c3767.f8025 = false;
                                                                c3767.f8014 = 0L;
                                                            }
                                                            return linkedHashMapM28754;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                }
                                            } catch (IOException e) {
                                                e = e;
                                                abstractC17044 = abstractC17043;
                                                iOException = e;
                                                if (abstractC17044 == null) {
                                                    synchronized (c3767) {
                                                        c3767.f8025 = false;
                                                        c3767.f8014 = 0L;
                                                        if (c3767.f8031) {
                                                            m28759(c3767);
                                                        } else {
                                                            str4 = c9663.f26626;
                                                            if (!TextUtils.isEmpty(str4)) {
                                                                c3767.f8011.remove(str4);
                                                            }
                                                            m28757(c3767, m28768(iOException.getMessage()));
                                                        }
                                                        return m28754(c3767);
                                                    }
                                                }
                                                if (abstractC17044.mo25094()) {
                                                    abstractC17044.mo25503();
                                                }
                                                synchronized (c3767) {
                                                    try {
                                                        c3767.f8025 = false;
                                                        c3767.f8014 = 0L;
                                                        if (c3767.f8031) {
                                                            m28759(c3767);
                                                        } else {
                                                            str4 = c9663.f26626;
                                                            if (!TextUtils.isEmpty(str4) && !C18524.m42109(str4, new String[0]).mo25094()) {
                                                                c3767.f8011.remove(str4);
                                                            }
                                                            m28757(c3767, m28768(iOException.getMessage()));
                                                        }
                                                        return m28754(c3767);
                                                    } catch (Throwable th9) {
                                                        throw th9;
                                                    }
                                                }
                                                if (iOException == null) {
                                                    synchronized (c3767) {
                                                        c3767.f8025 = false;
                                                        c3767.f8014 = 0L;
                                                    }
                                                }
                                                throw th;
                                            } catch (CancellationException unused) {
                                                abstractC17044 = abstractC17043;
                                                if (abstractC17044 != null && abstractC17044.mo25094()) {
                                                    abstractC17044.mo25503();
                                                }
                                                synchronized (c3767) {
                                                    c3767.f8025 = false;
                                                    c3767.f8014 = 0L;
                                                    m28759(c3767);
                                                    LinkedHashMap linkedHashMapM28756 = m28754(c3767);
                                                    synchronized (c3767) {
                                                        c3767.f8025 = false;
                                                        c3767.f8014 = 0L;
                                                        return linkedHashMapM28756;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    } catch (C3924 e2) {
                                        throw new IOException(e2);
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    abstractC17044 = abstractC17046;
                                } catch (CancellationException unused2) {
                                    abstractC17044 = abstractC17046;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                iOException = null;
                                if (iOException == null) {
                                    synchronized (c3767) {
                                        c3767.f8025 = false;
                                        c3767.f8014 = 0L;
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (CancellationException unused3) {
                        }
                    }
                    m28763(c3767, m28765(c3767));
                    m28755(c3767);
                    return m28754(c3767);
                }
                m28763(c3767, m28765(c3767));
                m28755(c3767);
                return m28754(c3767);
            }
            m28755(c3767);
            return m28754(c3767);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap m28771(String str) {
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return null;
        }
        synchronized (c3767) {
            m28747(c3767, SystemClock.elapsedRealtime());
            if (c3767.f8012) {
                return m28754(c3767);
            }
            boolean z = true;
            if (c3767.f8031) {
                if (!(c3767.f8041 || c3767.f8025)) {
                    m28759(c3767);
                    return m28754(c3767);
                }
            }
            if (c3767.f8037 && c3767.f8043 == null) {
                if (!c3767.f8041 && !c3767.f8025) {
                    z = false;
                }
                if (!z) {
                    Iterator it = c3767.f8038.values().iterator();
                    while (it.hasNext()) {
                        if (!m28760(((C9663) it.next()).f26627)) {
                            m28755(c3767);
                            return m28754(c3767);
                        }
                    }
                    m28769(c3767);
                    return m28754(c3767);
                }
            }
            m28755(c3767);
            return m28754(c3767);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX INFO: renamed from: ֫ */
    public static void m28749(C3767 c3767, List list) throws IOException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15697 c15697 = (C15697) it.next();
            if (c15697 == null) {
                throw new IOException(C7050.m16224(R.string.MT_Protector));
            }
            String str2 = c15697.f45488;
            if (TextUtils.isEmpty(str2)) {
                str = "";
                break;
            }
            String strReplace = str2.replace('\\', '/');
            while (strReplace.startsWith("./")) {
                strReplace = strReplace.substring(2);
            }
            while (strReplace.startsWith("/")) {
                strReplace = strReplace.substring(1);
            }
            while (strReplace.endsWith("/") && strReplace.length() > 1) {
                strReplace = C17073.m38720(1, 0, strReplace);
            }
            if (TextUtils.isEmpty(strReplace) || ".".equals(strReplace)) {
                str = "";
                break;
            }
            String[] strArrSplit = strReplace.split("/");
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = strReplace;
                    break;
                }
                String str3 = strArrSplit[i];
                if (TextUtils.isEmpty(str3) || ".".equals(str3) || "..".equals(str3)) {
                    str = "";
                    break;
                }
                i++;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IOException(C7050.m16224(R.string.MT_Protector));
            }
            String str4 = c15697.f45491;
            if (!TextUtils.equals("file", str4) && !TextUtils.equals("directory", str4)) {
                throw new IOException(C7050.m16203(R.string.MT_Protector, str4));
            }
            C9663 c9663 = new C9663(str, str4, Math.max(c15697.f45489, 0L), Math.max(c15697.f45490, 0L), c15697.f45492);
            C9663 c9664 = (C9663) linkedHashMap.get(c9663.f26622);
            if (c9664 != null && !TextUtils.equals(c9664.f26617, c9663.f26617)) {
                throw new IOException(C7050.m16203(R.string.MT_Protector, c9663.f26622));
            }
            if (c9664 != null) {
                linkedHashMap.remove(c9663.f26622);
            }
            linkedHashMap.put(c9663.f26622, c9663);
        }
        c3767.f8038.clear();
        c3767.f8038.putAll(linkedHashMap);
        c3767.f8013 = c3767.f8038.size();
        c3767.f8039 = 0L;
        for (C9663 c9665 : c3767.f8038.values()) {
            if (C9663.m22518(c9665)) {
                c3767.f8039 = Math.max(c9665.f26618, 0L) + c3767.f8039;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m28753(C3767 c3767) throws IOException {
        for (C9663 c9663 : c3767.f8038.values()) {
            AbstractC17043 abstractC17043M28745 = m28745(c3767, c9663);
            if (C9663.m22512(c9663)) {
                if (!abstractC17043M28745.mo25094()) {
                    continue;
                } else {
                    if (!abstractC17043M28745.mo25087()) {
                        throw new IOException(m28764(abstractC17043M28745.mo25505()));
                    }
                    c9663.f26619 = true;
                }
            } else if (!abstractC17043M28745.mo25094()) {
                continue;
            } else {
                if (abstractC17043M28745.mo25087()) {
                    throw new IOException(m28764(abstractC17043M28745.mo25505()));
                }
                c9663.f26619 = true;
                c9663.f26620 = C20393.m46048(abstractC17043M28745);
                c9663.f26628 = true;
            }
        }
        m28767(c3767);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m28767(C3767 c3767) {
        for (C9663 c9663 : c3767.f8038.values()) {
            if (c9663.f26628) {
                StringBuilder sb = new StringBuilder();
                sb.append(c3767.f8026);
                sb.append("-c");
                long j = c3767.f8027;
                c3767.f8027 = 1 + j;
                sb.append(j);
                String string = sb.toString();
                AbstractC17043 abstractC17043M28745 = m28745(c3767, c9663);
                c9663.f26627 = "waiting_conflict";
                c3767.f8043 = new C24415(string, c9663.f26622, abstractC17043M28745.mo25505(), C23568.m52377(c9663.f26618, c9663.f26623), C23568.m52378(abstractC17043M28745), c3767.f8002, "replace".equals(c3767.f8002) && c9663.f26620 && c3767.f8036, c9663.f26620, false);
                c3767.f8030 = "waiting_conflict";
                String str = c9663.f26622;
                c3767.f8021 = "resolve_conflict";
                c3767.f8042 = m28768(str);
                return;
            }
        }
        m28756(c3767);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28750(C3767 c3767, C9663 c9663, String str, boolean z) {
        boolean z2 = false;
        c9663.f26628 = false;
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c9663.f26627 = "skipped";
            if (c9663.f26621) {
                c9663.f26621 = false;
                c3767.f8013--;
                c3767.f8039 -= c9663.f26618;
                return;
            }
            return;
        }
        c9663.f26627 = "pending";
        c9663.f26624 = str;
        if ("replace".equals(str) && z && c9663.f26620) {
            z2 = true;
        }
        c9663.f26625 = z2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m28766(C3767 c3767) {
        ArrayList arrayList = new ArrayList();
        for (C9663 c9663 : c3767.f8038.values()) {
            if (C9663.m22512(c9663) && !m28760(c9663.f26627)) {
                arrayList.add(c9663);
            }
        }
        C8150.sort(arrayList, C16866.thenComparing(C10162.comparingInt(new C5640()), new C15027()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C12346 m28761(C3767 c3767, C9663 c9663) {
        int i;
        String strM28765 = m28765(c3767);
        if (!TextUtils.equals(strM28765, c9663.f26622)) {
            m28763(c3767, strM28765);
            return C12346.m28425();
        }
        AbstractC17043 abstractC17043M28745 = m28745(c3767, c9663);
        if (c9663.f26619 && abstractC17043M28745.mo25094() && abstractC17043M28745.mo25087()) {
            m28757(c3767, m28764(abstractC17043M28745.mo25505()));
            return C12346.m28425();
        }
        if (!c9663.f26619 && abstractC17043M28745.mo25094() && abstractC17043M28745.mo25087()) {
            m28757(c3767, m28764(abstractC17043M28745.mo25505()));
            return C12346.m28425();
        }
        String str = c9663.f26624;
        boolean z = c9663.f26625;
        if (!c9663.f26619 && abstractC17043M28745.mo25094()) {
            if (m28758(c3767, c9663)) {
                str = c3767.f8024.f38601;
                z = c3767.f8024.f38603;
                c3767.f8024 = null;
            } else if (c3767.f8004) {
                str = c3767.f8028;
                z = "replace".equals(str) && c3767.f8006 && C20393.m46048(abstractC17043M28745);
                m28748(c3767, c9663.f26622);
            } else {
                m28751(c3767, c9663, abstractC17043M28745);
                return C12346.m28425();
            }
        } else {
            m28748(c3767, c9663.f26622);
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c9663.f26627 = "skipped";
            c9663.f26615 = "";
            if (c9663.f26621) {
                c3767.f8009++;
                c3767.f8039 -= c9663.f26618;
                c9663.f26621 = false;
            }
            m28746(c3767);
            m28762(c3767);
            m28755(c3767);
            return C12346.m28425();
        }
        if ("keep_both".equals(str)) {
            while (true) {
                String strM46051 = C20393.m46051(abstractC17043M28745.mo25505());
                if (!abstractC17043M28745.mo25094() && !c3767.f8011.contains(strM46051)) {
                    break;
                }
                AbstractC17043 abstractC17043M38650 = abstractC17043M28745.m38650(true);
                if (TextUtils.equals(abstractC17043M38650.mo25505(), abstractC17043M28745.mo25505())) {
                    String parent = abstractC17043M28745.getParent();
                    if (!TextUtils.isEmpty(parent)) {
                        String name = abstractC17043M28745.getName();
                        String strM38663 = abstractC17043M28745.m38663();
                        String strSubstring = name.substring(0, name.length() - strM38663.length());
                        Matcher matcher = f34998.matcher(strSubstring);
                        if (matcher.matches()) {
                            try {
                                i = Integer.parseInt(matcher.group(2));
                                try {
                                    strSubstring = matcher.group(1);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        abstractC17043M28745 = C18524.m42109(parent, strSubstring + " (" + (i + 1) + MotionUtils.EASING_TYPE_FORMAT_END + strM38663);
                    }
                } else {
                    abstractC17043M28745 = abstractC17043M38650;
                }
            }
        }
        String strM46052 = C20393.m46051(abstractC17043M28745.mo25505());
        c3767.f8011.add(strM46052);
        m28746(c3767);
        m28762(c3767);
        c9663.f26627 = "uploading";
        c9663.f26626 = strM46052;
        c9663.f26615 = "";
        boolean zMo25094 = abstractC17043M28745.mo25094();
        AbstractC17043 abstractC17043M38678 = abstractC17043M28745.m38678(".web_upload");
        c3767.f8003 = c9663.f26622;
        m28755(c3767);
        return C12346.m28426(abstractC17043M28745, abstractC17043M38678, z, zMo25094);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28751(C3767 c3767, C9663 c9663, AbstractC17043 abstractC17043) {
        StringBuilder sb = new StringBuilder();
        sb.append(c3767.f8026);
        sb.append("-c");
        long j = c3767.f8027;
        c3767.f8027 = 1 + j;
        sb.append(j);
        String string = sb.toString();
        boolean zM46048 = C20393.m46048(abstractC17043);
        c9663.f26620 = zM46048;
        c9663.f26627 = "waiting_conflict";
        c9663.f26615 = string;
        c3767.f8043 = new C24415(string, c9663.f26622, abstractC17043.mo25505(), C23568.m52377(c9663.f26618, c9663.f26623), C23568.m52378(abstractC17043), c3767.f8002, "replace".equals(c3767.f8002) && zM46048 && c3767.f8036, zM46048, true);
        c3767.f8030 = "waiting_conflict";
        String str = c9663.f26622;
        c3767.f8021 = "resolve_conflict";
        c3767.f8042 = m28768(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m28758(C3767 c3767, C9663 c9663) {
        return c3767.f8024 != null && TextUtils.equals(c3767.f8024.f38604, c9663.f26622) && TextUtils.equals(c3767.f8024.f38602, c9663.f26615);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28748(C3767 c3767, String str) {
        if (c3767.f8024 != null && TextUtils.equals(c3767.f8024.f38604, str)) {
            c3767.f8024 = null;
        }
        C9663 c9663 = (C9663) c3767.f8038.get(str);
        if (c9663 != null) {
            c9663.f26615 = "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28747(C3767 c3767, long j) {
        if (TextUtils.isEmpty(c3767.f8033) || j - c3767.f8029 <= 60000) {
            return;
        }
        C9663 c9663 = (C9663) c3767.f8038.get(c3767.f8033);
        if (c9663 != null && TextUtils.equals(c9663.f26627, "armed")) {
            c9663.f26627 = "pending";
            m28748(c3767, c9663.f26622);
        }
        m28746(c3767);
        m28763(c3767, m28765(c3767));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m28763(C3767 c3767, String str) {
        c3767.f8021 = "restart_begin";
        c3767.f8042 = m28768(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m28762(C3767 c3767) {
        c3767.f8021 = "none";
        c3767.f8042 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28746(C3767 c3767) {
        c3767.f8033 = "";
        c3767.f8019 = "";
        c3767.f8029 = 0L;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m28756(C3767 c3767) {
        c3767.f8043 = null;
        if (c3767.f8012) {
            return;
        }
        c3767.f8030 = "running";
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m28765(C3767 c3767) {
        ArrayList arrayList = new ArrayList();
        for (C9663 c9663 : c3767.f8038.values()) {
            if (C9663.m22518(c9663) && c9663.f26621 && !m28760(c9663.f26627) && !c9663.f26628) {
                arrayList.add(c9663);
            }
        }
        C8150.sort(arrayList, f34996);
        Iterator it = arrayList.iterator();
        return it.hasNext() ? ((C9663) it.next()).f26622 : "";
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m28755(C3767 c3767) {
        if (c3767.f8012) {
            if (c3767.f8039 == 0 && "success".equals(c3767.f8030)) {
                c3767.f8023 = 100;
            }
        } else if (c3767.f8039 > 0) {
            c3767.f8023 = (int) Math.max(0L, Math.min(100L, (c3767.f8007 * 100) / Math.max(c3767.f8039, 1L)));
        } else {
            c3767.f8023 = 0;
        }
        int iMax = Math.max(c3767.f8013 - c3767.f8009, 0);
        long jMax = Math.max(c3767.f8039 - c3767.f8007, 0L);
        if (c3767.f8013 <= 1) {
            c3767.f8018 = C24158.m53411(jMax) + "/" + C24158.m53411(Math.max(c3767.f8039, 0L));
        } else {
            c3767.f8018 = iMax + " (" + C24158.m53411(jMax) + "/" + C24158.m53411(Math.max(c3767.f8039, 0L)) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (c3767.f8012) {
            m28762(c3767);
            m28746(c3767);
            m28756(c3767);
        } else if (c3767.f8043 == null) {
            c3767.f8030 = "running";
        }
        c3767.f8040 = m28765(c3767);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m28769(C3767 c3767) {
        c3767.f8012 = true;
        c3767.f8030 = "success";
        c3767.f8016 = SystemClock.elapsedRealtime();
        c3767.f8023 = c3767.f8039 == 0 ? 100 : c3767.f8023;
        c3767.f8022 = Collections.singletonList(c3767.f8032);
        List list = Collections.EMPTY_LIST;
        c3767.f8035 = Collections.EMPTY_LIST;
        c3767.f8010 = new ArrayList(c3767.f8034);
        c3767.f8014 = 0L;
        m28762(c3767);
        m28746(c3767);
        m28756(c3767);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m28759(C3767 c3767) {
        for (C9663 c9663 : c3767.f8038.values()) {
            if (!m28760(c9663.f26627)) {
                c9663.f26627 = "cancelled";
            }
        }
        c3767.f8012 = true;
        c3767.f8030 = "cancelled";
        c3767.f8017 = "";
        c3767.f8016 = SystemClock.elapsedRealtime();
        c3767.f8022 = Collections.singletonList(c3767.f8032);
        List list = Collections.EMPTY_LIST;
        c3767.f8035 = Collections.EMPTY_LIST;
        c3767.f8010 = list;
        c3767.f8014 = 0L;
        m28762(c3767);
        m28746(c3767);
        m28756(c3767);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m28757(C3767 c3767, String str) {
        for (C9663 c9663 : c3767.f8038.values()) {
            if (!m28760(c9663.f26627)) {
                c9663.f26627 = C0248k.f1176j;
            }
        }
        c3767.f8012 = true;
        c3767.f8030 = "failure";
        c3767.f8017 = m28768(str);
        c3767.f8016 = SystemClock.elapsedRealtime();
        c3767.f8022 = Collections.singletonList(c3767.f8032);
        List list = Collections.EMPTY_LIST;
        c3767.f8035 = Collections.EMPTY_LIST;
        c3767.f8010 = list;
        c3767.f8014 = 0L;
        m28762(c3767);
        m28746(c3767);
        m28756(c3767);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28752(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z, boolean z2, C3767 c3767) throws IOException {
        if (c3767.f8031) {
            throw new CancellationException();
        }
        try {
            C19210.m43750(abstractC17043, EnumC17868.MODIFY_FILE);
            if (!z2 && abstractC17043.mo25094()) {
                throw new IOException(C7050.m16203(R.string.MT_Protector, abstractC17043.mo25505()));
            }
            if (z && abstractC17043.mo25094() && abstractC17043.mo31068()) {
                abstractC17043.mo31069(new C14357(c3767));
                abstractC17044.m38656(abstractC17043, (Runnable) null);
            } else {
                abstractC17044.m38659(abstractC17043, false, true, null);
            }
        } catch (C3924 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m28742(C3767 c3767, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c3767.f8020 == 0) {
            c3767.f8020 = jElapsedRealtime;
        }
        c3767.f8005 += (long) i;
        long j = jElapsedRealtime - c3767.f8020;
        if (j < 200) {
            return c3767.f8014;
        }
        c3767.f8014 = Math.max((c3767.f8005 * 1000) / Math.max(j, 1L), 0L);
        c3767.f8020 = jElapsedRealtime;
        c3767.f8005 = 0L;
        return c3767.f8014;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m28764(String str) {
        return C7050.m16203(R.string.MT_Protector, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28770(String str, List list) {
        C7480.removeIf(this.f35000.entrySet(), new C6981(SystemClock.elapsedRealtime()));
        String str2 = "fu-" + this.f34999.getAndIncrement();
        C3767 c3767 = new C3767(str2, str);
        this.f35000.put(str2, c3767);
        synchronized (c3767) {
            try {
                m28749(c3767, list);
                m28753(c3767);
                m28755(c3767);
            } catch (IOException e) {
                m28757(c3767, m28768(e.getMessage()));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap m28775(String str) {
        LinkedHashMap linkedHashMapM28754;
        C7480.removeIf(this.f35000.entrySet(), new C6981(SystemClock.elapsedRealtime()));
        C3767 c3767 = (C3767) this.f35000.get(str);
        if (c3767 == null) {
            return null;
        }
        synchronized (c3767) {
            m28747(c3767, SystemClock.elapsedRealtime());
            m28755(c3767);
            linkedHashMapM28754 = m28754(c3767);
        }
        return linkedHashMapM28754;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m28768(String str) {
        return str == null ? "" : str.toString();
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m28760(String str) {
        return TextUtils.equals(str, "success") || TextUtils.equals(str, "skipped") || TextUtils.equals(str, C0248k.f1176j) || TextUtils.equals(str, "cancelled");
    }

    /* JADX INFO: renamed from: ۡ */
    public static LinkedHashMap m28754(C3767 c3767) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c3767.f8026);
        linkedHashMap2.put("type", "upload");
        linkedHashMap2.put("done", Boolean.valueOf(c3767.f8012));
        linkedHashMap2.put(C0172c.f705a, c3767.f8030);
        linkedHashMap2.put("title", c3767.f8044);
        linkedHashMap2.put("name", c3767.f8003);
        linkedHashMap2.put("progress", Integer.valueOf(c3767.f8023));
        linkedHashMap2.put("remaining", c3767.f8018);
        linkedHashMap2.put("speed", Long.valueOf(c3767.f8014));
        linkedHashMap2.put(C0708d.f2599O, c3767.f8017);
        linkedHashMap2.put("refreshDirectories", c3767.f8022);
        linkedHashMap2.put("invalidatePrefixes", c3767.f8035);
        linkedHashMap2.put("pathMoves", Collections.EMPTY_LIST);
        linkedHashMap2.put("markedPaths", c3767.f8010);
        if (c3767.f8043 == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", c3767.f8043.f77311);
            linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, c3767.f8043.f77314);
            linkedHashMap.put("incoming", m28743(c3767.f8043.f77313));
            linkedHashMap.put("existing", m28743(c3767.f8043.f77309));
            linkedHashMap.put("selectedAction", c3767.f8043.f77315);
            linkedHashMap.put("recyclable", Boolean.valueOf(c3767.f8043.f77308));
            linkedHashMap.put("moveToRecycleBin", Boolean.valueOf(c3767.f8043.f77310));
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        linkedHashMap2.put("resumeAction", c3767.f8021);
        linkedHashMap2.put("resumePath", c3767.f8042);
        linkedHashMap2.put("nextUploadPath", c3767.f8040);
        linkedHashMap2.put("armedPath", c3767.f8033);
        linkedHashMap2.put("armToken", c3767.f8019);
        linkedHashMap2.put("cancelRequested", Boolean.valueOf(c3767.f8031));
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m28745(C3767 c3767, C9663 c9663) {
        return C18524.m42109(C20393.m46051(c3767.f8032 + "/" + c9663.f26622), new String[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m28743(C23568 c23568) {
        if (c23568 == null || !c23568.m52382()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c23568.m52380()));
        linkedHashMap.put("time", Long.valueOf(c23568.m52381()));
        return linkedHashMap;
    }
}
