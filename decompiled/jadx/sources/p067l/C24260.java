package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩺ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes.dex */
public final class C24260 {

    /* JADX INFO: renamed from: ֫ */
    public final C17182 f76863;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f76864 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17043 f76865;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f76866;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17043 f76867;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f76868;

    /* JADX INFO: renamed from: ᩻ */
    public final String f76869;

    /* JADX INFO: renamed from: ᩷ */
    public static final String f76862 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ۜ */
    public static final HashMap f76861 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m53565(String str) {
        AbstractC17043 abstractC17043M53586 = m53586();
        if (abstractC17043M53586.m38691()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        if (abstractC17043M53586.mo25094()) {
            m53583(abstractC17043M53586);
            for (AbstractC17043 abstractC17043 : abstractC17043M53586.mo25500(true)) {
                if (m53581(abstractC17043.getName()) && abstractC17043.mo25087() && !abstractC17043.m38691()) {
                    C24260 c24260 = new C24260(abstractC17043, abstractC17043.getName());
                    if (!abstractC17043.getName().equals(str) || !c24260.m53589()) {
                        try {
                            c24260.m53590();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public static synchronized C24260 m53578() {
        C24260 c24260;
        AbstractC17043 abstractC17043M53586 = m53586();
        if (abstractC17043M53586.m38691()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        abstractC17043M53586.m38666();
        m53583(abstractC17043M53586);
        for (int i = 0; i < 100; i++) {
            String string = UUID.randomUUID().toString();
            AbstractC17043 abstractC17043M38684 = abstractC17043M53586.m38684(string);
            if (!abstractC17043M38684.mo25094()) {
                if (abstractC17043M38684.mo25497()) {
                    c24260 = new C24260(abstractC17043M38684, string);
                    try {
                        c24260.m53585();
                        AbstractC17043 abstractC17043 = c24260.f76868;
                        m53569(abstractC17043, "Hex session owner file is unsafe");
                        abstractC17043.m38668(f76862);
                    } catch (IOException e) {
                        try {
                            c24260.m53590();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                } else if (!abstractC17043M38684.mo25094()) {
                    throw new IOException("Unable to create hex session directory");
                }
            }
        }
        throw new IOException("Unable to allocate hex session token");
        return c24260;
    }

    public C24260(AbstractC17043 abstractC17043, String str) {
        this.f76869 = str;
        this.f76867 = abstractC17043;
        this.f76866 = abstractC17043.m38684("checkpoint");
        this.f76865 = abstractC17043.m38684("state.tmp");
        this.f76863 = abstractC17043.m38684("base").m38692();
        this.f76868 = abstractC17043.m38684("owner");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53567(String str, InterfaceC18588 interfaceC18588) throws IOException {
        C8167 c8167;
        while (!interfaceC18588.mo3924()) {
            synchronized (C24260.class) {
                c8167 = (C8167) f76861.get(str);
            }
            if (c8167 != null) {
                EnumC12191 enumC12191M18942 = c8167.m18942(interfaceC18588);
                if (enumC12191M18942 != EnumC12191.SUPERSEDED) {
                    if (enumC12191M18942 != EnumC12191.COMMITTED) {
                        throw c8167.m18941();
                    }
                    return;
                }
            } else {
                if (interfaceC18588.mo3924()) {
                    throw new C25008();
                }
                return;
            }
        }
        throw new C25008();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53570(InterfaceC18588 interfaceC18588) throws C25008 {
        if (interfaceC18588.mo3924()) {
            throw new C25008();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m53593() {
        return this.f76869;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17182 m53594() {
        return this.f76863;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m53596() {
        AbstractC17043 abstractC17043 = this.f76866;
        return abstractC17043.mo25093() && !abstractC17043.m38691();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m53589() {
        boolean zM18949;
        synchronized (C24260.class) {
            C8167 c8167 = (C8167) f76861.get(this.f76869);
            zM18949 = c8167 != null ? c8167.m18949() : m53596();
        }
        return zM18949;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8167 m53587() throws IOException {
        m53585();
        AbstractC17043 abstractC17043M38684 = this.f76867.m38684("state-" + UUID.randomUUID() + ".tmp");
        m53569(abstractC17043M38684, "Hex pending state file is unsafe");
        C8167 c8167 = new C8167(this, abstractC17043M38684);
        synchronized (C24260.class) {
            HashMap map = f76861;
            C8167 c8168 = (C8167) map.get(this.f76869);
            if (c8168 != null && c8168.f21545) {
                throw new IOException("Hex session deletion was requested");
            }
            map.put(this.f76869, c8167);
            if (c8168 != null) {
                C8167.m18939(c8168);
            }
        }
        return c8167;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8759 m53588(C17142 c17142) throws IOException {
        C14202 c14202;
        m53585();
        if (!this.f76866.mo25093() || this.f76866.m38691()) {
            throw new IOException("Hex session checkpoint is unavailable");
        }
        synchronized (this.f76864) {
            c14202 = new C14202(this.f76866, c17142);
            this.f76864.add(c14202.f40469);
        }
        return c14202;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final BufferedInputStream m53595() throws IOException {
        m53585();
        AbstractC17043 abstractC17043 = this.f76866;
        if (!abstractC17043.mo25093() || abstractC17043.m38691()) {
            throw new IOException("Hex session checkpoint does not exist: " + this.f76869);
        }
        return new BufferedInputStream(abstractC17043.mo29987());
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m53582(C24260 c24260) {
        synchronized (c24260.f76864) {
            Iterator it = c24260.f76864.iterator();
            while (it.hasNext()) {
                try {
                    ((C13532) it.next()).m30795();
                } catch (IOException unused) {
                }
            }
            c24260.f76864.clear();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m53591() {
        synchronized (this.f76864) {
            Iterator it = this.f76864.iterator();
            while (it.hasNext()) {
                if (((C13532) it.next()).m30792()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53592() throws IOException {
        synchronized (C24260.class) {
            C8167 c8167 = (C8167) f76861.get(this.f76869);
            if (c8167 != null) {
                C8167.m18937(c8167, false);
            } else {
                m53572();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m53572() throws IOException {
        m53585();
        try {
            m53579(this.f76865);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            m53579(this.f76866);
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53590() throws IOException {
        synchronized (C24260.class) {
            C8167 c8167 = (C8167) f76861.get(this.f76869);
            if (c8167 != null) {
                C8167.m18937(c8167, true);
            } else {
                m53571();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53566(String str, Exception exc) {
        if ((exc instanceof C25008) || !m53581(str)) {
            return;
        }
        try {
            m53576(str);
        } catch (IOException e) {
            exc.addSuppressed(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public void m53571() throws IOException {
        AbstractC17043 abstractC17043 = this.f76867;
        if (abstractC17043.m38691() || abstractC17043.mo25094()) {
            m53583(m53586());
            m53579(abstractC17043);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public static AbstractC17043 m53586() {
        return C17853.f53284.m38684("hex-sessions");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m53583(AbstractC17043 abstractC17043) throws IOException {
        if (!abstractC17043.mo25087() || abstractC17043.m38691()) {
            throw new IOException("Hex session root directory is unavailable");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24260 m53564(String str, C17813 c17813) throws IOException {
        C24260 c24260;
        if (m53581(str)) {
            m53567(str, C17917.m40721(c17813));
            synchronized (C24260.class) {
                AbstractC17043 abstractC17043M53586 = m53586();
                m53583(abstractC17043M53586);
                AbstractC17043 abstractC17043M38684 = abstractC17043M53586.m38684(str);
                if (!abstractC17043M38684.mo25087() || abstractC17043M38684.m38691()) {
                    throw new IOException("Hex session does not exist: " + str);
                }
                c24260 = new C24260(abstractC17043M38684, str);
                String str2 = f76862;
                AbstractC17043 abstractC17043 = c24260.f76868;
                String strM38647 = null;
                if (abstractC17043.mo25093() && !abstractC17043.m38691()) {
                    try {
                        strM38647 = abstractC17043.m38647();
                    } catch (IOException unused) {
                    }
                }
                if (!str2.equals(strM38647)) {
                    c24260.m53573();
                }
                c24260.m53585();
                AbstractC17043 abstractC17044 = c24260.f76868;
                m53569(abstractC17044, "Hex session owner file is unsafe");
                abstractC17044.m38668(f76862);
            }
            return c24260;
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53576(String str) {
        if (m53581(str)) {
            synchronized (C24260.class) {
                C8167 c8167 = (C8167) f76861.get(str);
                if (c8167 != null) {
                    C8167.m18937(c8167, true);
                    return;
                }
                AbstractC17043 abstractC17043M53586 = m53586();
                if (abstractC17043M53586.mo25094()) {
                    m53583(abstractC17043M53586);
                    AbstractC17043 abstractC17043M38684 = abstractC17043M53586.m38684(str);
                    if (abstractC17043M38684.mo25087() && !abstractC17043M38684.m38691()) {
                        new C24260(abstractC17043M38684, str).m53571();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m53581(String str) {
        if (str == null || str.length() != 36) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 8 || i == 13 || i == 18 || i == 23) {
                if (cCharAt != '-') {
                    return false;
                }
            } else if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m53585() throws IOException {
        m53583(m53586());
        AbstractC17043 abstractC17043 = this.f76867;
        if (!abstractC17043.mo25087() || abstractC17043.m38691()) {
            throw new IOException("Hex session directory is unavailable: " + this.f76869);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۡ */
    private void m53573() {
        try {
            for (AbstractC17043 abstractC17043 : this.f76867.mo25500(true)) {
                String name = abstractC17043.getName();
                if ("state.tmp".equals(name)) {
                    m53579(abstractC17043);
                } else {
                    int length = name.length() - 4;
                    if ((name.startsWith("state-") && name.endsWith(".tmp") && length > 6 && m53581(name.substring(6, length))) || name.endsWith(".hex-base.tmp")) {
                        try {
                            m53579(abstractC17043);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53569(AbstractC17043 abstractC17043, String str) throws IOException {
        if (abstractC17043.m38691() || (abstractC17043.mo25094() && !abstractC17043.mo25093())) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53579(AbstractC17043 abstractC17043) throws IOException {
        boolean zM38691 = abstractC17043.m38691();
        if (zM38691 || abstractC17043.mo25094()) {
            if (abstractC17043.mo25087() && !zM38691) {
                Iterator it = abstractC17043.mo25500(true).iterator();
                while (it.hasNext()) {
                    m53579((AbstractC17043) it.next());
                }
            }
            if (zM38691 || abstractC17043.mo25094()) {
                if (zM38691) {
                    if (abstractC17043.mo29990()) {
                        return;
                    }
                } else if (abstractC17043.mo25503()) {
                    return;
                }
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete hex session path: ")));
            }
        }
    }
}
