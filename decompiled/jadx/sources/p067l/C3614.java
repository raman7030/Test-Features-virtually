package p067l;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0708d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.֨ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3614 {
    /* JADX INFO: renamed from: ֫ */
    public static C5154 m6778(Bundle bundle, C5154 c5154, int i) {
        if (!bundle.getBoolean("initialSmoothPending")) {
            return c5154;
        }
        int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
        C5154 c5154M11012 = c5154.m11012(i, C7050.f18355.getInt("smooth_mode_threshold", 200000));
        bundle.remove("initialSmoothPending");
        return c5154M11012;
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13693 m6779(InterfaceC22097 interfaceC22097, Bundle bundle, C5154 c5154, byte[] bArr, byte[] bArr2, C13083 c13083, C8467 c8467, InterfaceC18588 interfaceC18588) throws Throwable {
        ?? r5;
        C6495 c6495;
        C24913 c24913M54703;
        ?? r6;
        boolean z;
        InterfaceC19157 interfaceC19157Walk;
        Iterator it;
        ?? r7;
        C6495 c6496;
        C5154 c5154M6778;
        C9217 c9217M54763;
        C14443 c14443M21234;
        C14343 c14343M19154;
        InterfaceC22097 interfaceC22098;
        if (C18743.exists(interfaceC22097, new EnumC16060[0])) {
            throw new IOException("Session directory already exists");
        }
        InterfaceC22097 interfaceC22097ResolveSibling = interfaceC22097.resolveSibling(interfaceC22097.getFileName() + "-new-" + UUID.randomUUID());
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putBoolean("e2SourcePending", c13083 == null);
        bundle2.putBoolean("initialSmoothPending", true);
        bundle2.putBoolean("changed", false);
        bundle2.putBoolean(C0708d.f2599O, false);
        C24301 c24301 = c13083 == null ? null : c13083.f36778;
        try {
            ?? r8 = c8467.f22723;
            c24913M54703 = C24913.m54703(interfaceC22097ResolveSibling, (C3455) r8, c8467.f22725);
            try {
                c24913M54703.m54768();
                C6495 c6497 = new C6495(c24913M54703);
                if (c13083 == null) {
                    r8 = interfaceC22097ResolveSibling;
                    c6497.setSelection(0, 0);
                    c6497.mo3998(false);
                    if (c13083 != null) {
                        c5154M6778 = m6778(bundle2, c5154, c6497.length());
                    } else {
                        c5154M6778 = c5154;
                    }
                    c9217M54763 = c24913M54703.m54763();
                    c14443M21234 = c9217M54763.m21234();
                    c14343M19154 = C8308.m19154(c14443M21234, bundle2, c24301, c5154M6778, bArr, bArr2, 8388608);
                    byte[] bArrM32941 = c14343M19154.m32941();
                    c6496 = c6497;
                    c24913M54703.m54757(c9217M54763.m21233(C9847.m23110(c9217M54763.m21232(), C13280.m30341(r8, c24913M54703.m54755(), new ByteArrayInputStream(bArrM32941), bArrM32941.length, 8388608, c8467.f22723), c24913M54703.m54755()))).m12907();
                    c14343M19154.close();
                    c14443M21234.close();
                    c9217M54763.close();
                    r5 = r8;
                    C11150.m25681(r5, bundle2);
                    c6496.close();
                    c24913M54703.m54769().m12907();
                    if (!interfaceC18588.mo3924()) {
                        throw new CancellationException("Session creation is canceled");
                    }
                    C18743.move(r5, interfaceC22097, EnumC4662.ATOMIC_MOVE);
                    InterfaceC24242.f76829.mo30678(interfaceC22097.getParent());
                    return C13693.m31105(interfaceC22097, c8467.f22723, c8467.f22725, c8467.f22724, 8388608, interfaceC18588, (String) null);
                }
                r8 = c13083.f36779;
                int i = 0;
                while (i < r8.length()) {
                    try {
                        if (interfaceC18588.mo3924()) {
                            throw new CancellationException("Session creation is canceled");
                        }
                        interfaceC22098 = interfaceC22097ResolveSibling;
                        try {
                            int iMin = (int) Math.min(r8.length(), ((long) i) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                            int length = c6497.length();
                            int length2 = c6497.length();
                            c6496 = c13083.f36779;
                            c6497.m14912(length, length2, c6496, i, iMin);
                            c24913M54703.m54752();
                            i = iMin;
                            interfaceC22097ResolveSibling = interfaceC22098;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC22098 = interfaceC22097ResolveSibling;
                    }
                    c6495 = c6497;
                    r7 = interfaceC22098;
                    z = false;
                    r6 = r7;
                }
                r8 = interfaceC22097ResolveSibling;
                try {
                    c6497.setSelection(0, 0);
                    c6497.mo3998(false);
                    if (c13083 != null) {
                        c5154M6778 = m6778(bundle2, c5154, c6497.length());
                    } else {
                        c5154M6778 = c5154;
                    }
                    try {
                        c9217M54763 = c24913M54703.m54763();
                        try {
                            c14443M21234 = c9217M54763.m21234();
                            try {
                                c14343M19154 = C8308.m19154(c14443M21234, bundle2, c24301, c5154M6778, bArr, bArr2, 8388608);
                                try {
                                    byte[] bArrM32942 = c14343M19154.m32941();
                                    try {
                                        c6496 = c6497;
                                        try {
                                            try {
                                                c24913M54703.m54757(c9217M54763.m21233(C9847.m23110(c9217M54763.m21232(), C13280.m30341(r8, c24913M54703.m54755(), new ByteArrayInputStream(bArrM32942), bArrM32942.length, 8388608, c8467.f22723), c24913M54703.m54755()))).m12907();
                                                try {
                                                    c14343M19154.close();
                                                    try {
                                                        c14443M21234.close();
                                                        try {
                                                            c9217M54763.close();
                                                            r5 = r8;
                                                            C11150.m25681(r5, bundle2);
                                                            c6496.close();
                                                            try {
                                                                c24913M54703.m54769().m12907();
                                                                try {
                                                                    if (!interfaceC18588.mo3924()) {
                                                                        throw new CancellationException("Session creation is canceled");
                                                                    }
                                                                    C18743.move(r5, interfaceC22097, EnumC4662.ATOMIC_MOVE);
                                                                    try {
                                                                        InterfaceC24242.f76829.mo30678(interfaceC22097.getParent());
                                                                        return C13693.m31105(interfaceC22097, c8467.f22723, c8467.f22725, c8467.f22724, 8388608, interfaceC18588, (String) null);
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        z = true;
                                                                        c6495 = null;
                                                                        c24913M54703 = null;
                                                                        r6 = r5;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    c6495 = null;
                                                                    c24913M54703 = null;
                                                                    r7 = r5;
                                                                    z = false;
                                                                    r6 = r7;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                c6495 = null;
                                                                r7 = r5;
                                                                z = false;
                                                                r6 = r7;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r8 = r8;
                                                            c6495 = c6496;
                                                            r7 = r8;
                                                            z = false;
                                                            r6 = r7;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        r8 = r8;
                                                        Throwable th8 = th;
                                                        try {
                                                            c9217M54763.close();
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
                                                        c14443M21234.close();
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
                                                    c14343M19154.close();
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
                                        c6496 = c6497;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    c6496 = c6497;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                c6496 = c6497;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            c6496 = c6497;
                        }
                    } catch (Throwable th21) {
                        th = th21;
                        c6495 = c6496;
                        r7 = r8;
                        z = false;
                        r6 = r7;
                        if (c6495 != null) {
                            try {
                                c6495.close();
                            } catch (Throwable th22) {
                                if (c24913M54703 != null) {
                                    try {
                                        c24913M54703.m54734().m12907();
                                    } catch (Throwable th23) {
                                        if (!z && C18743.exists(r6, new EnumC16060[0])) {
                                            InterfaceC19157 interfaceC19157Walk2 = C18743.walk(r6, new EnumC12709[0]);
                                            try {
                                                Iterator it2 = interfaceC19157Walk2.sorted(C10162.reverseOrder()).toList().iterator();
                                                while (it2.hasNext()) {
                                                    C18743.delete((InterfaceC22097) it2.next());
                                                }
                                                interfaceC19157Walk2.close();
                                            } catch (Throwable th24) {
                                                if (interfaceC19157Walk2 == null) {
                                                    throw th24;
                                                }
                                                try {
                                                    interfaceC19157Walk2.close();
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
                                if (z || !C18743.exists(r6, new EnumC16060[0])) {
                                    throw th22;
                                }
                                InterfaceC19157 interfaceC19157Walk3 = C18743.walk(r6, new EnumC12709[0]);
                                try {
                                    Iterator it3 = interfaceC19157Walk3.sorted(C10162.reverseOrder()).toList().iterator();
                                    while (it3.hasNext()) {
                                        C18743.delete((InterfaceC22097) it3.next());
                                    }
                                    interfaceC19157Walk3.close();
                                    throw th22;
                                } catch (Throwable th26) {
                                    if (interfaceC19157Walk3 == null) {
                                        throw th26;
                                    }
                                    try {
                                        interfaceC19157Walk3.close();
                                        throw th26;
                                    } catch (Throwable th27) {
                                        th26.addSuppressed(th27);
                                        throw th26;
                                    }
                                }
                            }
                        }
                        if (c24913M54703 != null) {
                            try {
                                c24913M54703.m54734().m12907();
                            } catch (Throwable th28) {
                                if (!z && C18743.exists(r6, new EnumC16060[0])) {
                                    InterfaceC19157 interfaceC19157Walk4 = C18743.walk(r6, new EnumC12709[0]);
                                    try {
                                        Iterator it4 = interfaceC19157Walk4.sorted(C10162.reverseOrder()).toList().iterator();
                                        while (it4.hasNext()) {
                                            C18743.delete((InterfaceC22097) it4.next());
                                        }
                                        interfaceC19157Walk4.close();
                                    } catch (Throwable th29) {
                                        if (interfaceC19157Walk4 == null) {
                                            throw th29;
                                        }
                                        try {
                                            interfaceC19157Walk4.close();
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
                            interfaceC19157Walk = C18743.walk(r6, new EnumC12709[0]);
                            try {
                                it = interfaceC19157Walk.sorted(C10162.reverseOrder()).toList().iterator();
                                while (it.hasNext()) {
                                    C18743.delete((InterfaceC22097) it.next());
                                }
                                interfaceC19157Walk.close();
                            } catch (Throwable th31) {
                                if (interfaceC19157Walk == null) {
                                    throw th31;
                                }
                                try {
                                    interfaceC19157Walk.close();
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
                    c6496 = c6497;
                }
            } catch (Throwable th34) {
                th = th34;
                r5 = interfaceC22097ResolveSibling;
            }
        } catch (Throwable th35) {
            th = th35;
            r5 = interfaceC22097ResolveSibling;
        }
        if (c6495 != null) {
            c6495.close();
        }
        if (c24913M54703 != null) {
            c24913M54703.m54734().m12907();
        }
        if (!z && C18743.exists(r6, new EnumC16060[0])) {
            interfaceC19157Walk = C18743.walk(r6, new EnumC12709[0]);
            it = interfaceC19157Walk.sorted(C10162.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C18743.delete((InterfaceC22097) it.next());
            }
            interfaceC19157Walk.close();
        }
        throw th;
    }
}
