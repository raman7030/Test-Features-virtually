package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import com.umeng.analytics.pro.d;
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
public final class C10645 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f32028 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f32029 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f32027 = Pattern.compile("(.*) \\((\\d+)\\)");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C10645 f32026 = new C10645();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C20376 f32025 = new C20376();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10645 m26705() {
        return f32026;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26735(String str, String str2, String str3, boolean z, boolean z2) {
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            if (!c1472.f5239 && !c1472.f5235.contains(str2)) {
                C23197 c23197 = c1472.f5270;
                if (c23197 != null && TextUtils.equals(c23197.f74568, str2)) {
                    C7675 c7675 = (C7675) c1472.f5265.get(c23197.f74564);
                    if (c7675 == null) {
                        m26717(c1472);
                        m26716(c1472);
                        return;
                    }
                    boolean z3 = "replace".equals(str3) && z2 && c23197.f74565;
                    c1472.f5235.add(str2);
                    c1472.f5229 = str3;
                    c1472.f5263 = z3;
                    if (c23197.f74569) {
                        c7675.f23714 = "pending";
                        if (z) {
                            c1472.f5231 = true;
                            c1472.f5255 = str3;
                            c1472.f5233 = z3;
                            c1472.f5251 = null;
                        } else {
                            String unused = c23197.f74568;
                            c1472.f5251 = new C11909(c23197.f74564, c23197.f74568, str3, z3);
                        }
                        m26717(c1472);
                    } else if (z) {
                        c1472.f5231 = true;
                        c1472.f5255 = str3;
                        c1472.f5233 = z3;
                        for (C7675 c7676 : c1472.f5265.values()) {
                            if (c7676.f23715) {
                                m26711(c1472, c7676, str3, z3);
                            }
                        }
                        m26717(c1472);
                    } else {
                        m26711(c1472, c7675, str3, z3);
                        m26717(c1472);
                        m26728(c1472);
                    }
                    m26716(c1472);
                    return;
                }
                m26716(c1472);
                return;
            }
            m26716(c1472);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26738(String str) {
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return false;
        }
        synchronized (c1472) {
            if (c1472.f5239) {
                return true;
            }
            m26708(c1472, SystemClock.elapsedRealtime());
            c1472.f5258 = true;
            m26717(c1472);
            if (!(c1472.f5268 || c1472.f5252)) {
                m26720(c1472);
            } else {
                m26716(c1472);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26737(String str) {
        LinkedHashMap linkedHashMapM26715;
        LinkedHashMap linkedHashMapM26716;
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            if (!c1472.f5239 && !c1472.f5264 && c1472.f5270 == null) {
                Iterator it = c1472.f5265.values().iterator();
                do {
                    if (!it.hasNext()) {
                        c1472.f5268 = true;
                        m26723(c1472);
                        ArrayList<C7675> arrayListM26727 = m26727(c1472);
                        try {
                            try {
                                for (C7675 c7675 : arrayListM26727) {
                                    synchronized (c1472) {
                                        if (c1472.f5239) {
                                            LinkedHashMap linkedHashMapM26717 = m26715(c1472);
                                            synchronized (c1472) {
                                                c1472.f5268 = false;
                                                if (!c1472.f5239) {
                                                    if (c1472.f5258) {
                                                        m26720(c1472);
                                                    } else {
                                                        c1472.f5264 = true;
                                                        m26716(c1472);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM26717;
                                        }
                                        if (c1472.f5258) {
                                            m26720(c1472);
                                            LinkedHashMap linkedHashMapM26718 = m26715(c1472);
                                            synchronized (c1472) {
                                                c1472.f5268 = false;
                                                if (!c1472.f5239) {
                                                    if (c1472.f5258) {
                                                        m26720(c1472);
                                                    } else {
                                                        c1472.f5264 = true;
                                                        m26716(c1472);
                                                    }
                                                }
                                            }
                                            return linkedHashMapM26718;
                                        }
                                        c1472.f5230 = c7675.f23709;
                                        AbstractC15440 abstractC15440M26706 = m26706(c1472, c7675);
                                        try {
                                            C17721.m41504(abstractC15440M26706, EnumC16309.MODIFY_FILE);
                                            if (abstractC15440M26706.mo23120() && !abstractC15440M26706.mo23113()) {
                                                synchronized (c1472) {
                                                    m26718(c1472, m26725(abstractC15440M26706.mo23554()));
                                                    linkedHashMapM26716 = m26715(c1472);
                                                }
                                                synchronized (c1472) {
                                                    c1472.f5268 = false;
                                                    if (!c1472.f5239) {
                                                        if (c1472.f5258) {
                                                            m26720(c1472);
                                                        } else {
                                                            c1472.f5264 = true;
                                                            m26716(c1472);
                                                        }
                                                    }
                                                }
                                                return linkedHashMapM26716;
                                            }
                                            if (!abstractC15440M26706.mo23120()) {
                                                abstractC15440M26706.m36508();
                                                C14463.m34554(abstractC15440M26706.mo23554(), true);
                                            }
                                            synchronized (c1472) {
                                                if (!m26721(c7675.f23714)) {
                                                    c7675.f23714 = "success";
                                                    String strM43784 = C18965.m43784(abstractC15440M26706.mo23554());
                                                    if (!TextUtils.isEmpty(strM43784) && !"/".equals(strM43784)) {
                                                        strM43784 = strM43784.concat("/");
                                                    }
                                                    c7675.f23713 = strM43784;
                                                    c1472.f5236++;
                                                    if (c7675.f23703) {
                                                        c1472.f5261.add(c7675.f23713);
                                                    }
                                                    m26716(c1472);
                                                }
                                            }
                                        } catch (C1637 e) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                synchronized (c1472) {
                                    c1472.f5268 = false;
                                    if (!c1472.f5239) {
                                        if (c1472.f5258) {
                                            m26720(c1472);
                                        } else {
                                            c1472.f5264 = true;
                                            m26716(c1472);
                                        }
                                    }
                                }
                                synchronized (c1472) {
                                    linkedHashMapM26715 = m26715(c1472);
                                }
                                return linkedHashMapM26715;
                            } catch (IOException e2) {
                                synchronized (c1472) {
                                    if (!c1472.f5239) {
                                        m26718(c1472, m26729(e2.getMessage()));
                                    }
                                    throw e2;
                                }
                            }
                        } catch (Throwable th) {
                            synchronized (c1472) {
                                c1472.f5268 = false;
                                if (!c1472.f5239) {
                                    if (c1472.f5258) {
                                        m26720(c1472);
                                    } else {
                                        c1472.f5264 = true;
                                        m26716(c1472);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } while (!((C7675) it.next()).f23715);
            }
            m26716(c1472);
            return m26715(c1472);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26733(String str, String str2) {
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m26708(c1472, jElapsedRealtime);
            if (!c1472.f5239 && !c1472.f5258 && c1472.f5270 == null && c1472.f5264) {
                String strM26726 = m26726(c1472);
                if (!TextUtils.isEmpty(strM26726) && TextUtils.equals(strM26726, str2)) {
                    C7675 c7675 = (C7675) c1472.f5265.get(str2);
                    if (c7675 != null && C7675.m20538(c7675)) {
                        if (TextUtils.equals(c1472.f5260, str2) && TextUtils.equals(c7675.f23714, "armed") && jElapsedRealtime - c1472.f5256 <= 60000) {
                            m26723(c1472);
                            m26716(c1472);
                            return m26715(c1472);
                        }
                        AbstractC15440 abstractC15440M26706 = m26706(c1472, c7675);
                        if (c7675.f23706) {
                            if (abstractC15440M26706.mo23120() && abstractC15440M26706.mo23113()) {
                                m26718(c1472, m26725(abstractC15440M26706.mo23554()));
                                return m26715(c1472);
                            }
                        } else if (abstractC15440M26706.mo23120()) {
                            if (abstractC15440M26706.mo23113()) {
                                m26718(c1472, m26725(abstractC15440M26706.mo23554()));
                                return m26715(c1472);
                            }
                            if (!m26719(c1472, c7675) && !c1472.f5231) {
                                m26712(c1472, c7675, abstractC15440M26706);
                                m26716(c1472);
                                return m26715(c1472);
                            }
                        } else {
                            m26709(c1472, c7675.f23709);
                        }
                        c7675.f23714 = "armed";
                        c1472.f5260 = c7675.f23709;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("-a");
                        long j = c1472.f5242;
                        c1472.f5242 = 1 + j;
                        sb.append(j);
                        c1472.f5246 = sb.toString();
                        c1472.f5256 = jElapsedRealtime;
                        c1472.f5230 = c7675.f23709;
                        m26723(c1472);
                        m26716(c1472);
                        return m26715(c1472);
                    }
                    m26724(c1472, strM26726);
                    m26716(c1472);
                    return m26715(c1472);
                }
                m26724(c1472, strM26726);
                m26716(c1472);
                return m26715(c1472);
            }
            m26716(c1472);
            return m26715(c1472);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap m26734(String str, String str2, String str3, long j, InputStream inputStream) throws Throwable {
        IOException iOException;
        String str4;
        Throwable th;
        AbstractC15440 abstractC15440;
        LinkedHashMap linkedHashMapM26715;
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            if (!c1472.f5239 && !c1472.f5258) {
                if (TextUtils.equals(c1472.f5260, str2) && TextUtils.equals(c1472.f5246, str3)) {
                    C7675 c7675 = (C7675) c1472.f5265.get(str2);
                    if (c7675 != null && C7675.m20538(c7675)) {
                        if (j != c7675.f23705) {
                            throw new C6264(C4925.m14327(R.string.MT_Protector));
                        }
                        c1472.f5252 = true;
                        C10498 c10498M26722 = m26722(c1472, c7675);
                        AbstractC15440 abstractC15441 = null;
                        if (!c10498M26722.f31490) {
                            c1472.f5252 = false;
                            m26716(c1472);
                            return m26715(c1472);
                        }
                        AbstractC15440 abstractC15442 = c10498M26722.f31488;
                        AbstractC15440 abstractC15443 = c10498M26722.f31491;
                        boolean z = c10498M26722.f31489;
                        boolean z2 = c10498M26722.f31492;
                        long j2 = c7675.f23705;
                        try {
                            try {
                                try {
                                    try {
                                        C17721.m41504(abstractC15443, EnumC16309.MODIFY_FILE);
                                        OutputStream outputStreamMo23555 = abstractC15443.mo23555(false);
                                        int i = 65536;
                                        try {
                                            byte[] bArr = new byte[65536];
                                            long j3 = 0;
                                            while (true) {
                                                if (j3 >= j2) {
                                                    abstractC15440 = abstractC15443;
                                                    break;
                                                }
                                                try {
                                                    try {
                                                        synchronized (c1472) {
                                                            try {
                                                                if (c1472.f5258) {
                                                                    throw new CancellationException();
                                                                }
                                                                abstractC15440 = abstractC15443;
                                                                try {
                                                                    bArr = bArr;
                                                                    int i2 = inputStream.read(bArr, 0, (int) Math.min(i, j2 - j3));
                                                                    if (i2 == -1) {
                                                                        break;
                                                                    }
                                                                    outputStreamMo23555.write(bArr, 0, i2);
                                                                    long j4 = j2;
                                                                    long j5 = i2;
                                                                    j3 += j5;
                                                                    synchronized (c1472) {
                                                                        c1472.f5234 += j5;
                                                                        c1472.f5241 = m26703(c1472, i2);
                                                                        c1472.f5230 = c7675.f23709;
                                                                        m26716(c1472);
                                                                    }
                                                                    abstractC15443 = abstractC15440;
                                                                    j2 = j4;
                                                                    i = 65536;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    th = th;
                                                                    if (outputStreamMo23555 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        outputStreamMo23555.close();
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
                                                    if (outputStreamMo23555 != null) {
                                                        throw th;
                                                    }
                                                    outputStreamMo23555.close();
                                                    throw th;
                                                }
                                            }
                                            outputStreamMo23555.flush();
                                            try {
                                                outputStreamMo23555.close();
                                                if (j3 != c7675.f23705) {
                                                    throw new IOException(C4925.m14306(R.string.MT_Protector, c7675.f23709));
                                                }
                                                try {
                                                    synchronized (c1472) {
                                                        try {
                                                            if (c1472.f5258) {
                                                                throw new CancellationException();
                                                            }
                                                            if (!z2 && abstractC15442.mo23120()) {
                                                                c1472.f5234 = Math.max(0L, c1472.f5234 - j3);
                                                                c1472.f5241 = 0L;
                                                                c1472.f5247 = 0L;
                                                                c1472.f5232 = 0L;
                                                                c1472.f5252 = false;
                                                                m26712(c1472, c7675, abstractC15442);
                                                                m26716(c1472);
                                                                if (abstractC15440.mo23120()) {
                                                                    abstractC15440.mo23552();
                                                                }
                                                                LinkedHashMap linkedHashMapM26716 = m26715(c1472);
                                                                synchronized (c1472) {
                                                                    c1472.f5252 = false;
                                                                    c1472.f5241 = 0L;
                                                                }
                                                                return linkedHashMapM26716;
                                                            }
                                                            m26713(abstractC15442, abstractC15440, z, z2, c1472);
                                                            C14463.m34554(abstractC15442.mo23554(), true);
                                                            synchronized (c1472) {
                                                                c7675.f23714 = "success";
                                                                c7675.f23713 = C18965.m43784(abstractC15442.mo23554());
                                                                c7675.f23702 = "";
                                                                c1472.f5236++;
                                                                if (c7675.f23703) {
                                                                    c1472.f5261.add(c7675.f23713);
                                                                }
                                                                c1472.f5252 = false;
                                                                c1472.f5230 = c7675.f23709;
                                                                c1472.f5241 = 0L;
                                                                m26723(c1472);
                                                                m26716(c1472);
                                                                linkedHashMapM26715 = m26715(c1472);
                                                            }
                                                            synchronized (c1472) {
                                                                c1472.f5252 = false;
                                                                c1472.f5241 = 0L;
                                                            }
                                                            return linkedHashMapM26715;
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
                                                abstractC15441 = abstractC15440;
                                                iOException = e;
                                                if (abstractC15441 == null) {
                                                    synchronized (c1472) {
                                                        c1472.f5252 = false;
                                                        c1472.f5241 = 0L;
                                                        if (c1472.f5258) {
                                                            m26720(c1472);
                                                        } else {
                                                            str4 = c7675.f23713;
                                                            if (!TextUtils.isEmpty(str4)) {
                                                                c1472.f5238.remove(str4);
                                                            }
                                                            m26718(c1472, m26729(iOException.getMessage()));
                                                        }
                                                        return m26715(c1472);
                                                    }
                                                }
                                                if (abstractC15441.mo23120()) {
                                                    abstractC15441.mo23552();
                                                }
                                                synchronized (c1472) {
                                                    try {
                                                        c1472.f5252 = false;
                                                        c1472.f5241 = 0L;
                                                        if (c1472.f5258) {
                                                            m26720(c1472);
                                                        } else {
                                                            str4 = c7675.f23713;
                                                            if (!TextUtils.isEmpty(str4) && !C16999.m39866(str4, new String[0]).mo23120()) {
                                                                c1472.f5238.remove(str4);
                                                            }
                                                            m26718(c1472, m26729(iOException.getMessage()));
                                                        }
                                                        return m26715(c1472);
                                                    } catch (Throwable th9) {
                                                        throw th9;
                                                    }
                                                }
                                                if (iOException == null) {
                                                    synchronized (c1472) {
                                                        c1472.f5252 = false;
                                                        c1472.f5241 = 0L;
                                                    }
                                                }
                                                throw th;
                                            } catch (CancellationException unused) {
                                                abstractC15441 = abstractC15440;
                                                if (abstractC15441 != null && abstractC15441.mo23120()) {
                                                    abstractC15441.mo23552();
                                                }
                                                synchronized (c1472) {
                                                    c1472.f5252 = false;
                                                    c1472.f5241 = 0L;
                                                    m26720(c1472);
                                                    LinkedHashMap linkedHashMapM26717 = m26715(c1472);
                                                    synchronized (c1472) {
                                                        c1472.f5252 = false;
                                                        c1472.f5241 = 0L;
                                                        return linkedHashMapM26717;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    } catch (C1637 e2) {
                                        throw new IOException(e2);
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    abstractC15441 = abstractC15443;
                                } catch (CancellationException unused2) {
                                    abstractC15441 = abstractC15443;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                iOException = null;
                                if (iOException == null) {
                                    synchronized (c1472) {
                                        c1472.f5252 = false;
                                        c1472.f5241 = 0L;
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (CancellationException unused3) {
                        }
                    }
                    m26724(c1472, m26726(c1472));
                    m26716(c1472);
                    return m26715(c1472);
                }
                m26724(c1472, m26726(c1472));
                m26716(c1472);
                return m26715(c1472);
            }
            m26716(c1472);
            return m26715(c1472);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26732(String str) {
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            if (c1472.f5239) {
                return m26715(c1472);
            }
            boolean z = true;
            if (c1472.f5258) {
                if (!(c1472.f5268 || c1472.f5252)) {
                    m26720(c1472);
                    return m26715(c1472);
                }
            }
            if (c1472.f5264 && c1472.f5270 == null) {
                if (!c1472.f5268 && !c1472.f5252) {
                    z = false;
                }
                if (!z) {
                    Iterator it = c1472.f5265.values().iterator();
                    while (it.hasNext()) {
                        if (!m26721(((C7675) it.next()).f23714)) {
                            m26716(c1472);
                            return m26715(c1472);
                        }
                    }
                    m26730(c1472);
                    return m26715(c1472);
                }
            }
            m26716(c1472);
            return m26715(c1472);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26710(C1472 c1472, List list) throws IOException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14024 c14024 = (C14024) it.next();
            if (c14024 == null) {
                throw new IOException(C4925.m14327(R.string.MT_Protector));
            }
            String str2 = c14024.f42405;
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
                strReplace = C15472.m36561(1, 0, strReplace);
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
                throw new IOException(C4925.m14327(R.string.MT_Protector));
            }
            String str4 = c14024.f42408;
            if (!TextUtils.equals("file", str4) && !TextUtils.equals("directory", str4)) {
                throw new IOException(C4925.m14306(R.string.MT_Protector, str4));
            }
            C7675 c7675 = new C7675(str, str4, Math.max(c14024.f42406, 0L), Math.max(c14024.f42407, 0L), c14024.f42409);
            C7675 c7676 = (C7675) linkedHashMap.get(c7675.f23709);
            if (c7676 != null && !TextUtils.equals(c7676.f23704, c7675.f23704)) {
                throw new IOException(C4925.m14306(R.string.MT_Protector, c7675.f23709));
            }
            if (c7676 != null) {
                linkedHashMap.remove(c7675.f23709);
            }
            linkedHashMap.put(c7675.f23709, c7675);
        }
        c1472.f5265.clear();
        c1472.f5265.putAll(linkedHashMap);
        c1472.f5240 = c1472.f5265.size();
        c1472.f5266 = 0L;
        for (C7675 c7677 : c1472.f5265.values()) {
            if (C7675.m20538(c7677)) {
                c1472.f5266 = Math.max(c7677.f23705, 0L) + c1472.f5266;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m26714(C1472 c1472) throws IOException {
        for (C7675 c7675 : c1472.f5265.values()) {
            AbstractC15440 abstractC15440M26706 = m26706(c1472, c7675);
            if (C7675.m20532(c7675)) {
                if (!abstractC15440M26706.mo23120()) {
                    continue;
                } else {
                    if (!abstractC15440M26706.mo23113()) {
                        throw new IOException(m26725(abstractC15440M26706.mo23554()));
                    }
                    c7675.f23706 = true;
                }
            } else if (!abstractC15440M26706.mo23120()) {
                continue;
            } else {
                if (abstractC15440M26706.mo23113()) {
                    throw new IOException(m26725(abstractC15440M26706.mo23554()));
                }
                c7675.f23706 = true;
                c7675.f23707 = C18965.m43781(abstractC15440M26706);
                c7675.f23715 = true;
            }
        }
        m26728(c1472);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m26728(C1472 c1472) {
        for (C7675 c7675 : c1472.f5265.values()) {
            if (c7675.f23715) {
                StringBuilder sb = new StringBuilder();
                sb.append(c1472.f5253);
                sb.append("-c");
                long j = c1472.f5254;
                c1472.f5254 = 1 + j;
                sb.append(j);
                String string = sb.toString();
                AbstractC15440 abstractC15440M26706 = m26706(c1472, c7675);
                c7675.f23714 = "waiting_conflict";
                c1472.f5270 = new C23197(string, c7675.f23709, abstractC15440M26706.mo23554(), C22306.m50047(c7675.f23705, c7675.f23710), C22306.m50048(abstractC15440M26706), c1472.f5229, "replace".equals(c1472.f5229) && c7675.f23707 && c1472.f5263, c7675.f23707, false);
                c1472.f5257 = "waiting_conflict";
                String str = c7675.f23709;
                c1472.f5248 = "resolve_conflict";
                c1472.f5269 = m26729(str);
                return;
            }
        }
        m26717(c1472);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26711(C1472 c1472, C7675 c7675, String str, boolean z) {
        boolean z2 = false;
        c7675.f23715 = false;
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c7675.f23714 = "skipped";
            if (c7675.f23708) {
                c7675.f23708 = false;
                c1472.f5240--;
                c1472.f5266 -= c7675.f23705;
                return;
            }
            return;
        }
        c7675.f23714 = "pending";
        c7675.f23711 = str;
        if ("replace".equals(str) && z && c7675.f23707) {
            z2 = true;
        }
        c7675.f23712 = z2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26727(C1472 c1472) {
        ArrayList arrayList = new ArrayList();
        for (C7675 c7675 : c1472.f5265.values()) {
            if (C7675.m20532(c7675) && !m26721(c7675.f23714)) {
                arrayList.add(c7675);
            }
        }
        C6083.sort(arrayList, C15254.thenComparing(C8200.comparingInt(new C3442()), new C13319()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10498 m26722(C1472 c1472, C7675 c7675) {
        int i;
        String strM26726 = m26726(c1472);
        if (!TextUtils.equals(strM26726, c7675.f23709)) {
            m26724(c1472, strM26726);
            return C10498.m26392();
        }
        AbstractC15440 abstractC15440M26706 = m26706(c1472, c7675);
        if (c7675.f23706 && abstractC15440M26706.mo23120() && abstractC15440M26706.mo23113()) {
            m26718(c1472, m26725(abstractC15440M26706.mo23554()));
            return C10498.m26392();
        }
        if (!c7675.f23706 && abstractC15440M26706.mo23120() && abstractC15440M26706.mo23113()) {
            m26718(c1472, m26725(abstractC15440M26706.mo23554()));
            return C10498.m26392();
        }
        String str = c7675.f23711;
        boolean z = c7675.f23712;
        if (!c7675.f23706 && abstractC15440M26706.mo23120()) {
            if (m26719(c1472, c7675)) {
                str = c1472.f5251.f35592;
                z = c1472.f5251.f35594;
                c1472.f5251 = null;
            } else if (c1472.f5231) {
                str = c1472.f5255;
                z = "replace".equals(str) && c1472.f5233 && C18965.m43781(abstractC15440M26706);
                m26709(c1472, c7675.f23709);
            } else {
                m26712(c1472, c7675, abstractC15440M26706);
                return C10498.m26392();
            }
        } else {
            m26709(c1472, c7675.f23709);
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c7675.f23714 = "skipped";
            c7675.f23702 = "";
            if (c7675.f23708) {
                c1472.f5236++;
                c1472.f5266 -= c7675.f23705;
                c7675.f23708 = false;
            }
            m26707(c1472);
            m26723(c1472);
            m26716(c1472);
            return C10498.m26392();
        }
        if ("keep_both".equals(str)) {
            while (true) {
                String strM43784 = C18965.m43784(abstractC15440M26706.mo23554());
                if (!abstractC15440M26706.mo23120() && !c1472.f5238.contains(strM43784)) {
                    break;
                }
                AbstractC15440 abstractC15440M36492 = abstractC15440M26706.m36492(true);
                if (TextUtils.equals(abstractC15440M36492.mo23554(), abstractC15440M26706.mo23554())) {
                    String parent = abstractC15440M26706.getParent();
                    if (!TextUtils.isEmpty(parent)) {
                        String name = abstractC15440M26706.getName();
                        String strM36505 = abstractC15440M26706.m36505();
                        String strSubstring = name.substring(0, name.length() - strM36505.length());
                        Matcher matcher = f32027.matcher(strSubstring);
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
                        abstractC15440M26706 = C16999.m39866(parent, strSubstring + " (" + (i + 1) + MotionUtils.EASING_TYPE_FORMAT_END + strM36505);
                    }
                } else {
                    abstractC15440M26706 = abstractC15440M36492;
                }
            }
        }
        String strM43785 = C18965.m43784(abstractC15440M26706.mo23554());
        c1472.f5238.add(strM43785);
        m26707(c1472);
        m26723(c1472);
        c7675.f23714 = "uploading";
        c7675.f23713 = strM43785;
        c7675.f23702 = "";
        boolean zMo23120 = abstractC15440M26706.mo23120();
        AbstractC15440 abstractC15440M36520 = abstractC15440M26706.m36520(".web_upload");
        c1472.f5230 = c7675.f23709;
        m26716(c1472);
        return C10498.m26393(abstractC15440M26706, abstractC15440M36520, z, zMo23120);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26712(C1472 c1472, C7675 c7675, AbstractC15440 abstractC15440) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1472.f5253);
        sb.append("-c");
        long j = c1472.f5254;
        c1472.f5254 = 1 + j;
        sb.append(j);
        String string = sb.toString();
        boolean zM43781 = C18965.m43781(abstractC15440);
        c7675.f23707 = zM43781;
        c7675.f23714 = "waiting_conflict";
        c7675.f23702 = string;
        c1472.f5270 = new C23197(string, c7675.f23709, abstractC15440.mo23554(), C22306.m50047(c7675.f23705, c7675.f23710), C22306.m50048(abstractC15440), c1472.f5229, "replace".equals(c1472.f5229) && zM43781 && c1472.f5263, zM43781, true);
        c1472.f5257 = "waiting_conflict";
        String str = c7675.f23709;
        c1472.f5248 = "resolve_conflict";
        c1472.f5269 = m26729(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26719(C1472 c1472, C7675 c7675) {
        return c1472.f5251 != null && TextUtils.equals(c1472.f5251.f35595, c7675.f23709) && TextUtils.equals(c1472.f5251.f35593, c7675.f23702);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26709(C1472 c1472, String str) {
        if (c1472.f5251 != null && TextUtils.equals(c1472.f5251.f35595, str)) {
            c1472.f5251 = null;
        }
        C7675 c7675 = (C7675) c1472.f5265.get(str);
        if (c7675 != null) {
            c7675.f23702 = "";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26708(C1472 c1472, long j) {
        if (TextUtils.isEmpty(c1472.f5260) || j - c1472.f5256 <= 60000) {
            return;
        }
        C7675 c7675 = (C7675) c1472.f5265.get(c1472.f5260);
        if (c7675 != null && TextUtils.equals(c7675.f23714, "armed")) {
            c7675.f23714 = "pending";
            m26709(c1472, c7675.f23709);
        }
        m26707(c1472);
        m26724(c1472, m26726(c1472));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m26724(C1472 c1472, String str) {
        c1472.f5248 = "restart_begin";
        c1472.f5269 = m26729(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m26723(C1472 c1472) {
        c1472.f5248 = "none";
        c1472.f5269 = "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26707(C1472 c1472) {
        c1472.f5260 = "";
        c1472.f5246 = "";
        c1472.f5256 = 0L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26717(C1472 c1472) {
        c1472.f5270 = null;
        if (c1472.f5239) {
            return;
        }
        c1472.f5257 = "running";
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m26726(C1472 c1472) {
        ArrayList arrayList = new ArrayList();
        for (C7675 c7675 : c1472.f5265.values()) {
            if (C7675.m20538(c7675) && c7675.f23708 && !m26721(c7675.f23714) && !c7675.f23715) {
                arrayList.add(c7675);
            }
        }
        C6083.sort(arrayList, f32025);
        Iterator it = arrayList.iterator();
        return it.hasNext() ? ((C7675) it.next()).f23709 : "";
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m26716(C1472 c1472) {
        if (c1472.f5239) {
            if (c1472.f5266 == 0 && "success".equals(c1472.f5257)) {
                c1472.f5250 = 100;
            }
        } else if (c1472.f5266 > 0) {
            c1472.f5250 = (int) Math.max(0L, Math.min(100L, (c1472.f5234 * 100) / Math.max(c1472.f5266, 1L)));
        } else {
            c1472.f5250 = 0;
        }
        int iMax = Math.max(c1472.f5240 - c1472.f5236, 0);
        long jMax = Math.max(c1472.f5266 - c1472.f5234, 0L);
        if (c1472.f5240 <= 1) {
            c1472.f5245 = C22927.m51020(jMax) + "/" + C22927.m51020(Math.max(c1472.f5266, 0L));
        } else {
            c1472.f5245 = iMax + " (" + C22927.m51020(jMax) + "/" + C22927.m51020(Math.max(c1472.f5266, 0L)) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (c1472.f5239) {
            m26723(c1472);
            m26707(c1472);
            m26717(c1472);
        } else if (c1472.f5270 == null) {
            c1472.f5257 = "running";
        }
        c1472.f5267 = m26726(c1472);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m26730(C1472 c1472) {
        c1472.f5239 = true;
        c1472.f5257 = "success";
        c1472.f5243 = SystemClock.elapsedRealtime();
        c1472.f5250 = c1472.f5266 == 0 ? 100 : c1472.f5250;
        c1472.f5249 = Collections.singletonList(c1472.f5259);
        List list = Collections.EMPTY_LIST;
        c1472.f5262 = Collections.EMPTY_LIST;
        c1472.f5237 = new ArrayList(c1472.f5261);
        c1472.f5241 = 0L;
        m26723(c1472);
        m26707(c1472);
        m26717(c1472);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m26720(C1472 c1472) {
        for (C7675 c7675 : c1472.f5265.values()) {
            if (!m26721(c7675.f23714)) {
                c7675.f23714 = "cancelled";
            }
        }
        c1472.f5239 = true;
        c1472.f5257 = "cancelled";
        c1472.f5244 = "";
        c1472.f5243 = SystemClock.elapsedRealtime();
        c1472.f5249 = Collections.singletonList(c1472.f5259);
        List list = Collections.EMPTY_LIST;
        c1472.f5262 = Collections.EMPTY_LIST;
        c1472.f5237 = list;
        c1472.f5241 = 0L;
        m26723(c1472);
        m26707(c1472);
        m26717(c1472);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26718(C1472 c1472, String str) {
        for (C7675 c7675 : c1472.f5265.values()) {
            if (!m26721(c7675.f23714)) {
                c7675.f23714 = k.j;
            }
        }
        c1472.f5239 = true;
        c1472.f5257 = "failure";
        c1472.f5244 = m26729(str);
        c1472.f5243 = SystemClock.elapsedRealtime();
        c1472.f5249 = Collections.singletonList(c1472.f5259);
        List list = Collections.EMPTY_LIST;
        c1472.f5262 = Collections.EMPTY_LIST;
        c1472.f5237 = list;
        c1472.f5241 = 0L;
        m26723(c1472);
        m26707(c1472);
        m26717(c1472);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26713(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, boolean z, boolean z2, C1472 c1472) throws IOException {
        if (c1472.f5258) {
            throw new CancellationException();
        }
        try {
            C17721.m41504(abstractC15440, EnumC16309.MODIFY_FILE);
            if (!z2 && abstractC15440.mo23120()) {
                throw new IOException(C4925.m14306(R.string.MT_Protector, abstractC15440.mo23554()));
            }
            if (z && abstractC15440.mo23120() && abstractC15440.mo29016()) {
                abstractC15440.mo29017(new C12614(c1472));
                abstractC15441.m36498(abstractC15440, (Runnable) null);
            } else {
                abstractC15441.m36501(abstractC15440, false, true, null);
            }
        } catch (C1637 e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m26703(C1472 c1472, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c1472.f5247 == 0) {
            c1472.f5247 = jElapsedRealtime;
        }
        c1472.f5232 += (long) i;
        long j = jElapsedRealtime - c1472.f5247;
        if (j < 200) {
            return c1472.f5241;
        }
        c1472.f5241 = Math.max((c1472.f5232 * 1000) / Math.max(j, 1L), 0L);
        c1472.f5247 = jElapsedRealtime;
        c1472.f5232 = 0L;
        return c1472.f5241;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m26725(String str) {
        return C4925.m14306(R.string.MT_Protector, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26731(String str, List list) {
        C5378.removeIf(this.f32029.entrySet(), new C4853(SystemClock.elapsedRealtime()));
        String str2 = "fu-" + this.f32028.getAndIncrement();
        C1472 c1472 = new C1472(str2, str);
        this.f32029.put(str2, c1472);
        synchronized (c1472) {
            try {
                m26710(c1472, list);
                m26714(c1472);
                m26716(c1472);
            } catch (IOException e) {
                m26718(c1472, m26729(e.getMessage()));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26736(String str) {
        LinkedHashMap linkedHashMapM26715;
        C5378.removeIf(this.f32029.entrySet(), new C4853(SystemClock.elapsedRealtime()));
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            m26716(c1472);
            linkedHashMapM26715 = m26715(c1472);
        }
        return linkedHashMapM26715;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m26729(String str) {
        return str == null ? "" : str.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m26721(String str) {
        return TextUtils.equals(str, "success") || TextUtils.equals(str, "skipped") || TextUtils.equals(str, k.j) || TextUtils.equals(str, "cancelled");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m26715(C1472 c1472) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c1472.f5253);
        linkedHashMap2.put("type", "upload");
        linkedHashMap2.put("done", Boolean.valueOf(c1472.f5239));
        linkedHashMap2.put(c.a, c1472.f5257);
        linkedHashMap2.put("title", c1472.f5271);
        linkedHashMap2.put("name", c1472.f5230);
        linkedHashMap2.put("progress", Integer.valueOf(c1472.f5250));
        linkedHashMap2.put("remaining", c1472.f5245);
        linkedHashMap2.put("speed", Long.valueOf(c1472.f5241));
        linkedHashMap2.put(d.O, c1472.f5244);
        linkedHashMap2.put("refreshDirectories", c1472.f5249);
        linkedHashMap2.put("invalidatePrefixes", c1472.f5262);
        linkedHashMap2.put("pathMoves", Collections.EMPTY_LIST);
        linkedHashMap2.put("markedPaths", c1472.f5237);
        if (c1472.f5270 == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", c1472.f5270.f74568);
            linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, c1472.f5270.f74571);
            linkedHashMap.put("incoming", m26704(c1472.f5270.f74570));
            linkedHashMap.put("existing", m26704(c1472.f5270.f74566));
            linkedHashMap.put("selectedAction", c1472.f5270.f74572);
            linkedHashMap.put("recyclable", Boolean.valueOf(c1472.f5270.f74565));
            linkedHashMap.put("moveToRecycleBin", Boolean.valueOf(c1472.f5270.f74567));
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        linkedHashMap2.put("resumeAction", c1472.f5248);
        linkedHashMap2.put("resumePath", c1472.f5269);
        linkedHashMap2.put("nextUploadPath", c1472.f5267);
        linkedHashMap2.put("armedPath", c1472.f5260);
        linkedHashMap2.put("armToken", c1472.f5246);
        linkedHashMap2.put("cancelRequested", Boolean.valueOf(c1472.f5258));
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m26706(C1472 c1472, C7675 c7675) {
        return C16999.m39866(C18965.m43784(c1472.f5259 + "/" + c7675.f23709), new String[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m26704(C22306 c22306) {
        if (c22306 == null || !c22306.m50052()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c22306.m50050()));
        linkedHashMap.put("time", Long.valueOf(c22306.m50051()));
        return linkedHashMap;
    }
}
