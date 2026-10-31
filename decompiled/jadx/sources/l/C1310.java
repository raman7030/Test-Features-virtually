package l;

import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.֨ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1310 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2931 m4546(Bundle bundle, C2931 c2931, int i) {
        if (!bundle.getBoolean("initialSmoothPending")) {
            return c2931;
        }
        int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
        C2931 c2931M8944 = c2931.m8944(i, C4925.f15523.getInt("smooth_mode_threshold", 200000));
        bundle.remove("initialSmoothPending");
        return c2931M8944;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01a3 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01b5 */
    /* JADX WARN: Code duplicated, block: B:201:0x02eb A[Catch: all -> 0x02f9, TRY_LEAVE, TryCatch #15 {all -> 0x02f9, blocks: (B:198:0x02d5, B:199:0x02e5, B:201:0x02eb), top: B:243:0x02d5 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1 A[Catch: all -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00a8, blocks: (B:23:0x0086, B:26:0x00aa, B:27:0x00b1, B:33:0x00c1), top: B:225:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #16 {all -> 0x017d, blocks: (B:54:0x013f, B:56:0x0145, B:61:0x0177, B:62:0x017c), top: B:245:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0177 A[Catch: all -> 0x017d, TRY_ENTER, TryCatch #16 {all -> 0x017d, blocks: (B:54:0x013f, B:56:0x0145, B:61:0x0177, B:62:0x017c), top: B:245:0x013f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [l.᩷۠ᩴ] */
    /* JADX WARN: Type inference failed for: r5v10, types: [l.᩷۠ᩴ] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [l.֨۬ᩳ] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v33, types: [l.᩷۠ᩴ] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11915 m4547(InterfaceC20758 interfaceC20758, Bundle bundle, C2931 c2931, byte[] bArr, byte[] bArr2, C11273 c11273, C6417 c6417, InterfaceC17066 interfaceC17066) throws Throwable {
        ?? r5;
        C4342 c4342;
        C23721 c23721M52300;
        ?? r6;
        boolean z;
        InterfaceC17664 interfaceC17664Walk;
        Iterator it;
        ?? r7;
        C4342 c4343;
        C2931 c2931M4546;
        C7206 c7206M52360;
        C12704 c12704M19287;
        C12599 c12599M17216;
        InterfaceC20758 interfaceC20759;
        if (C17229.exists(interfaceC20758, new EnumC14406[0])) {
            throw new IOException("Session directory already exists");
        }
        InterfaceC20758 interfaceC20758ResolveSibling = interfaceC20758.resolveSibling(interfaceC20758.getFileName() + "-new-" + UUID.randomUUID());
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putBoolean("e2SourcePending", c11273 == null);
        bundle2.putBoolean("initialSmoothPending", true);
        bundle2.putBoolean("changed", false);
        bundle2.putBoolean(d.O, false);
        C23077 c23077 = c11273 == null ? null : c11273.f33778;
        try {
            ?? r8 = c6417.f19851;
            c23721M52300 = C23721.m52300(interfaceC20758ResolveSibling, (C1143) r8, c6417.f19853);
            try {
                c23721M52300.m52365();
                C4342 c4344 = new C4342(c23721M52300);
                if (c11273 == null) {
                    r8 = interfaceC20758ResolveSibling;
                    c4344.setSelection(0, 0);
                    c4344.mo1600(false);
                    if (c11273 != null) {
                        c2931M4546 = m4546(bundle2, c2931, c4344.length());
                    } else {
                        c2931M4546 = c2931;
                    }
                    c7206M52360 = c23721M52300.m52360();
                    c12704M19287 = c7206M52360.m19287();
                    c12599M17216 = C6249.m17216(c12704M19287, bundle2, c23077, c2931M4546, bArr, bArr2, 8388608);
                    byte[] bArrM30864 = c12599M17216.m30864();
                    c4343 = c4344;
                    c23721M52300.m52354(c7206M52360.m19286(C7869.m21145(c7206M52360.m19285(), C11481.m28297(r8, c23721M52300.m52352(), new ByteArrayInputStream(bArrM30864), bArrM30864.length, 8388608, c6417.f19851), c23721M52300.m52352()))).m10930();
                    c12599M17216.close();
                    c12704M19287.close();
                    c7206M52360.close();
                    r5 = r8;
                    C9240.m23681(r5, bundle2);
                    c4343.close();
                    c23721M52300.m52366().m10930();
                    if (!interfaceC17066.mo1526()) {
                        throw new CancellationException("Session creation is canceled");
                    }
                    C17229.move(r5, interfaceC20758, EnumC2413.ATOMIC_MOVE);
                    InterfaceC23015.f74090.mo28630(interfaceC20758.getParent());
                    return C11915.m29053(interfaceC20758, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, interfaceC17066, (String) null);
                }
                r8 = c11273.f33779;
                int i = 0;
                while (i < r8.length()) {
                    try {
                        if (interfaceC17066.mo1526()) {
                            throw new CancellationException("Session creation is canceled");
                        }
                        interfaceC20759 = interfaceC20758ResolveSibling;
                        try {
                            int iMin = (int) Math.min(r8.length(), ((long) i) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                            int length = c4344.length();
                            int length2 = c4344.length();
                            c4343 = c11273.f33779;
                            c4344.m13048(length, length2, c4343, i, iMin);
                            c23721M52300.m52349();
                            i = iMin;
                            interfaceC20758ResolveSibling = interfaceC20759;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC20759 = interfaceC20758ResolveSibling;
                    }
                    c4342 = c4344;
                    r7 = interfaceC20759;
                    z = false;
                    r6 = r7;
                }
                r8 = interfaceC20758ResolveSibling;
                try {
                    c4344.setSelection(0, 0);
                    c4344.mo1600(false);
                    if (c11273 != null) {
                        c2931M4546 = m4546(bundle2, c2931, c4344.length());
                    } else {
                        c2931M4546 = c2931;
                    }
                    try {
                        c7206M52360 = c23721M52300.m52360();
                        try {
                            c12704M19287 = c7206M52360.m19287();
                            try {
                                c12599M17216 = C6249.m17216(c12704M19287, bundle2, c23077, c2931M4546, bArr, bArr2, 8388608);
                                try {
                                    byte[] bArrM30865 = c12599M17216.m30864();
                                    try {
                                        c4343 = c4344;
                                        try {
                                            try {
                                                c23721M52300.m52354(c7206M52360.m19286(C7869.m21145(c7206M52360.m19285(), C11481.m28297(r8, c23721M52300.m52352(), new ByteArrayInputStream(bArrM30865), bArrM30865.length, 8388608, c6417.f19851), c23721M52300.m52352()))).m10930();
                                                try {
                                                    c12599M17216.close();
                                                    try {
                                                        c12704M19287.close();
                                                        try {
                                                            c7206M52360.close();
                                                            r5 = r8;
                                                            C9240.m23681(r5, bundle2);
                                                            c4343.close();
                                                            try {
                                                                c23721M52300.m52366().m10930();
                                                                try {
                                                                    if (!interfaceC17066.mo1526()) {
                                                                        throw new CancellationException("Session creation is canceled");
                                                                    }
                                                                    C17229.move(r5, interfaceC20758, EnumC2413.ATOMIC_MOVE);
                                                                    try {
                                                                        InterfaceC23015.f74090.mo28630(interfaceC20758.getParent());
                                                                        return C11915.m29053(interfaceC20758, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, interfaceC17066, (String) null);
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        z = true;
                                                                        c4342 = null;
                                                                        c23721M52300 = null;
                                                                        r6 = r5;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    c4342 = null;
                                                                    c23721M52300 = null;
                                                                    r7 = r5;
                                                                    z = false;
                                                                    r6 = r7;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                c4342 = null;
                                                                r7 = r5;
                                                                z = false;
                                                                r6 = r7;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r8 = r8;
                                                            c4342 = c4343;
                                                            r7 = r8;
                                                            z = false;
                                                            r6 = r7;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        r8 = r8;
                                                        Throwable th8 = th;
                                                        try {
                                                            c7206M52360.close();
                                                            throw th8;
                                                        } catch (Throwable th9) {
                                                            th8.addSuppressed(th9);
                                                            throw th8;
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    Throwable th11 = th;
                                                    try {
                                                        c12704M19287.close();
                                                        throw th11;
                                                    } catch (Throwable th12) {
                                                        th11.addSuppressed(th12);
                                                        throw th11;
                                                    }
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                Throwable th14 = th;
                                                try {
                                                    c12599M17216.close();
                                                    throw th14;
                                                } catch (Throwable th15) {
                                                    th14.addSuppressed(th15);
                                                    throw th14;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        c4343 = c4344;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    c4343 = c4344;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                c4343 = c4344;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            c4343 = c4344;
                        }
                    } catch (Throwable th21) {
                        th = th21;
                        c4342 = c4343;
                        r7 = r8;
                        z = false;
                        r6 = r7;
                        if (c4342 != null) {
                            try {
                                c4342.close();
                            } catch (Throwable th22) {
                                if (c23721M52300 != null) {
                                    try {
                                        c23721M52300.m52331().m10930();
                                    } catch (Throwable th23) {
                                        if (!z && C17229.exists(r6, new EnumC14406[0])) {
                                            InterfaceC17664 interfaceC17664Walk2 = C17229.walk(r6, new EnumC10880[0]);
                                            try {
                                                Iterator it2 = interfaceC17664Walk2.sorted(C8200.reverseOrder()).toList().iterator();
                                                while (it2.hasNext()) {
                                                    C17229.delete((InterfaceC20758) it2.next());
                                                }
                                                interfaceC17664Walk2.close();
                                            } catch (Throwable th24) {
                                                if (interfaceC17664Walk2 == null) {
                                                    throw th24;
                                                }
                                                try {
                                                    interfaceC17664Walk2.close();
                                                    throw th24;
                                                } catch (Throwable th25) {
                                                    th24.addSuppressed(th25);
                                                    throw th24;
                                                }
                                            }
                                        }
                                        throw th23;
                                    }
                                }
                                if (z || !C17229.exists(r6, new EnumC14406[0])) {
                                    throw th22;
                                }
                                InterfaceC17664 interfaceC17664Walk3 = C17229.walk(r6, new EnumC10880[0]);
                                try {
                                    Iterator it3 = interfaceC17664Walk3.sorted(C8200.reverseOrder()).toList().iterator();
                                    while (it3.hasNext()) {
                                        C17229.delete((InterfaceC20758) it3.next());
                                    }
                                    interfaceC17664Walk3.close();
                                    throw th22;
                                } catch (Throwable th26) {
                                    if (interfaceC17664Walk3 == null) {
                                        throw th26;
                                    }
                                    try {
                                        interfaceC17664Walk3.close();
                                        throw th26;
                                    } catch (Throwable th27) {
                                        th26.addSuppressed(th27);
                                        throw th26;
                                    }
                                }
                            }
                        }
                        if (c23721M52300 != null) {
                            try {
                                c23721M52300.m52331().m10930();
                            } catch (Throwable th28) {
                                if (!z && C17229.exists(r6, new EnumC14406[0])) {
                                    InterfaceC17664 interfaceC17664Walk4 = C17229.walk(r6, new EnumC10880[0]);
                                    try {
                                        Iterator it4 = interfaceC17664Walk4.sorted(C8200.reverseOrder()).toList().iterator();
                                        while (it4.hasNext()) {
                                            C17229.delete((InterfaceC20758) it4.next());
                                        }
                                        interfaceC17664Walk4.close();
                                    } catch (Throwable th29) {
                                        if (interfaceC17664Walk4 == null) {
                                            throw th29;
                                        }
                                        try {
                                            interfaceC17664Walk4.close();
                                            throw th29;
                                        } catch (Throwable th30) {
                                            th29.addSuppressed(th30);
                                            throw th29;
                                        }
                                    }
                                }
                                throw th28;
                            }
                        }
                        if (!z) {
                            interfaceC17664Walk = C17229.walk(r6, new EnumC10880[0]);
                            try {
                                it = interfaceC17664Walk.sorted(C8200.reverseOrder()).toList().iterator();
                                while (it.hasNext()) {
                                    C17229.delete((InterfaceC20758) it.next());
                                }
                                interfaceC17664Walk.close();
                            } catch (Throwable th31) {
                                if (interfaceC17664Walk == null) {
                                    throw th31;
                                }
                                try {
                                    interfaceC17664Walk.close();
                                    throw th31;
                                } catch (Throwable th32) {
                                    th31.addSuppressed(th32);
                                    throw th31;
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th33) {
                    th = th33;
                    c4343 = c4344;
                }
            } catch (Throwable th34) {
                th = th34;
                r5 = interfaceC20758ResolveSibling;
            }
        } catch (Throwable th35) {
            th = th35;
            r5 = interfaceC20758ResolveSibling;
        }
        if (c4342 != null) {
            c4342.close();
        }
        if (c23721M52300 != null) {
            c23721M52300.m52331().m10930();
        }
        if (!z && C17229.exists(r6, new EnumC14406[0])) {
            interfaceC17664Walk = C17229.walk(r6, new EnumC10880[0]);
            it = interfaceC17664Walk.sorted(C8200.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C17229.delete((InterfaceC20758) it.next());
            }
            interfaceC17664Walk.close();
        }
        throw th;
    }
}
