package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩺ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes.dex */
public final class C23034 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15587 f74125;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74126 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74129;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74130;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f74131;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f74124 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f74123 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m51172(String str) {
        AbstractC15440 abstractC15440M51193 = m51193();
        if (abstractC15440M51193.m36533()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        if (abstractC15440M51193.mo23120()) {
            m51190(abstractC15440M51193);
            for (AbstractC15440 abstractC15440 : abstractC15440M51193.mo23549(true)) {
                if (m51188(abstractC15440.getName()) && abstractC15440.mo23113() && !abstractC15440.m36533()) {
                    C23034 c23034 = new C23034(abstractC15440, abstractC15440.getName());
                    if (!abstractC15440.getName().equals(str) || !c23034.m51196()) {
                        try {
                            c23034.m51197();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static synchronized C23034 m51185() {
        C23034 c23034;
        AbstractC15440 abstractC15440M51193 = m51193();
        if (abstractC15440M51193.m36533()) {
            throw new IOException("Hex session root directory is unsafe");
        }
        abstractC15440M51193.m36508();
        m51190(abstractC15440M51193);
        for (int i = 0; i < 100; i++) {
            String string = UUID.randomUUID().toString();
            AbstractC15440 abstractC15440M36526 = abstractC15440M51193.m36526(string);
            if (!abstractC15440M36526.mo23120()) {
                if (abstractC15440M36526.mo23546()) {
                    c23034 = new C23034(abstractC15440M36526, string);
                    try {
                        c23034.m51192();
                        AbstractC15440 abstractC15440 = c23034.f74130;
                        m51176(abstractC15440, "Hex session owner file is unsafe");
                        abstractC15440.m36510(f74124);
                    } catch (IOException e) {
                        try {
                            c23034.m51197();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                } else if (!abstractC15440M36526.mo23120()) {
                    throw new IOException("Unable to create hex session directory");
                }
            }
        }
        throw new IOException("Unable to allocate hex session token");
        return c23034;
    }

    public C23034(AbstractC15440 abstractC15440, String str) {
        this.f74131 = str;
        this.f74129 = abstractC15440;
        this.f74128 = abstractC15440.m36526("checkpoint");
        this.f74127 = abstractC15440.m36526("state.tmp");
        this.f74125 = abstractC15440.m36526("base").m36534();
        this.f74130 = abstractC15440.m36526("owner");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51174(String str, InterfaceC17066 interfaceC17066) throws IOException {
        C6101 c6101;
        while (!interfaceC17066.mo1526()) {
            synchronized (C23034.class) {
                c6101 = (C6101) f74123.get(str);
            }
            if (c6101 != null) {
                EnumC10335 enumC10335M17011 = c6101.m17011(interfaceC17066);
                if (enumC10335M17011 != EnumC10335.SUPERSEDED) {
                    if (enumC10335M17011 != EnumC10335.COMMITTED) {
                        throw c6101.m17010();
                    }
                    return;
                }
            } else {
                if (interfaceC17066.mo1526()) {
                    throw new C23821();
                }
                return;
            }
        }
        throw new C23821();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51177(InterfaceC17066 interfaceC17066) throws C23821 {
        if (interfaceC17066.mo1526()) {
            throw new C23821();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m51200() {
        return this.f74131;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15587 m51201() {
        return this.f74125;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51203() {
        AbstractC15440 abstractC15440 = this.f74128;
        return abstractC15440.mo23119() && !abstractC15440.m36533();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m51196() {
        boolean zM17018;
        synchronized (C23034.class) {
            C6101 c6101 = (C6101) f74123.get(this.f74131);
            zM17018 = c6101 != null ? c6101.m17018() : m51203();
        }
        return zM17018;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6101 m51194() throws IOException {
        m51192();
        AbstractC15440 abstractC15440M36526 = this.f74129.m36526("state-" + UUID.randomUUID() + ".tmp");
        m51176(abstractC15440M36526, "Hex pending state file is unsafe");
        C6101 c6101 = new C6101(this, abstractC15440M36526);
        synchronized (C23034.class) {
            HashMap map = f74123;
            C6101 c6102 = (C6101) map.get(this.f74131);
            if (c6102 != null && c6102.f18690) {
                throw new IOException("Hex session deletion was requested");
            }
            map.put(this.f74131, c6101);
            if (c6102 != null) {
                C6101.m17008(c6102);
            }
        }
        return c6101;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6724 m51195(C15544 c15544) throws IOException {
        C12451 c12451;
        m51192();
        if (!this.f74128.mo23119() || this.f74128.m36533()) {
            throw new IOException("Hex session checkpoint is unavailable");
        }
        synchronized (this.f74126) {
            c12451 = new C12451(this.f74128, c15544);
            this.f74126.add(c12451.f37453);
        }
        return c12451;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m51202() throws IOException {
        m51192();
        AbstractC15440 abstractC15440 = this.f74128;
        if (!abstractC15440.mo23119() || abstractC15440.m36533()) {
            throw new IOException("Hex session checkpoint does not exist: " + this.f74131);
        }
        return new BufferedInputStream(abstractC15440.mo27926());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m51189(C23034 c23034) {
        synchronized (c23034.f74126) {
            Iterator it = c23034.f74126.iterator();
            while (it.hasNext()) {
                try {
                    ((C11746) it.next()).m28747();
                } catch (IOException unused) {
                }
            }
            c23034.f74126.clear();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m51198() {
        synchronized (this.f74126) {
            Iterator it = this.f74126.iterator();
            while (it.hasNext()) {
                if (((C11746) it.next()).m28744()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m51199() throws IOException {
        synchronized (C23034.class) {
            C6101 c6101 = (C6101) f74123.get(this.f74131);
            if (c6101 != null) {
                C6101.m17006(c6101, false);
            } else {
                m51179();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m51179() throws IOException {
        m51192();
        try {
            m51186(this.f74127);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            m51186(this.f74128);
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51197() throws IOException {
        synchronized (C23034.class) {
            C6101 c6101 = (C6101) f74123.get(this.f74131);
            if (c6101 != null) {
                C6101.m17006(c6101, true);
            } else {
                m51178();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51173(String str, Exception exc) {
        if ((exc instanceof C23821) || !m51188(str)) {
            return;
        }
        try {
            m51183(str);
        } catch (IOException e) {
            exc.addSuppressed(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m51178() throws IOException {
        AbstractC15440 abstractC15440 = this.f74129;
        if (abstractC15440.m36533() || abstractC15440.mo23120()) {
            m51190(m51193());
            m51186(abstractC15440);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m51193() {
        return C16293.f50117.m36526("hex-sessions");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m51190(AbstractC15440 abstractC15440) throws IOException {
        if (!abstractC15440.mo23113() || abstractC15440.m36533()) {
            throw new IOException("Hex session root directory is unavailable");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23034 m51171(String str, C16250 c16250) throws IOException {
        C23034 c23034;
        if (m51188(str)) {
            m51174(str, C16360.m38504(c16250));
            synchronized (C23034.class) {
                AbstractC15440 abstractC15440M51193 = m51193();
                m51190(abstractC15440M51193);
                AbstractC15440 abstractC15440M36526 = abstractC15440M51193.m36526(str);
                if (!abstractC15440M36526.mo23113() || abstractC15440M36526.m36533()) {
                    throw new IOException("Hex session does not exist: " + str);
                }
                c23034 = new C23034(abstractC15440M36526, str);
                String str2 = f74124;
                AbstractC15440 abstractC15440 = c23034.f74130;
                String strM36489 = null;
                if (abstractC15440.mo23119() && !abstractC15440.m36533()) {
                    try {
                        strM36489 = abstractC15440.m36489();
                    } catch (IOException unused) {
                    }
                }
                if (!str2.equals(strM36489)) {
                    c23034.m51180();
                }
                c23034.m51192();
                AbstractC15440 abstractC15441 = c23034.f74130;
                m51176(abstractC15441, "Hex session owner file is unsafe");
                abstractC15441.m36510(f74124);
            }
            return c23034;
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51183(String str) {
        if (m51188(str)) {
            synchronized (C23034.class) {
                C6101 c6101 = (C6101) f74123.get(str);
                if (c6101 != null) {
                    C6101.m17006(c6101, true);
                    return;
                }
                AbstractC15440 abstractC15440M51193 = m51193();
                if (abstractC15440M51193.mo23120()) {
                    m51190(abstractC15440M51193);
                    AbstractC15440 abstractC15440M36526 = abstractC15440M51193.m36526(str);
                    if (abstractC15440M36526.mo23113() && !abstractC15440M36526.m36533()) {
                        new C23034(abstractC15440M36526, str).m51178();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m51188(String str) {
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m51192() throws IOException {
        m51190(m51193());
        AbstractC15440 abstractC15440 = this.f74129;
        if (!abstractC15440.mo23113() || abstractC15440.m36533()) {
            throw new IOException("Hex session directory is unavailable: " + this.f74131);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m51180() {
        try {
            for (AbstractC15440 abstractC15440 : this.f74129.mo23549(true)) {
                String name = abstractC15440.getName();
                if ("state.tmp".equals(name)) {
                    m51186(abstractC15440);
                } else {
                    int length = name.length() - 4;
                    if ((name.startsWith("state-") && name.endsWith(".tmp") && length > 6 && m51188(name.substring(6, length))) || name.endsWith(".hex-base.tmp")) {
                        try {
                            m51186(abstractC15440);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51176(AbstractC15440 abstractC15440, String str) throws IOException {
        if (abstractC15440.m36533() || (abstractC15440.mo23120() && !abstractC15440.mo23119())) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51186(AbstractC15440 abstractC15440) throws IOException {
        boolean zM36533 = abstractC15440.m36533();
        if (zM36533 || abstractC15440.mo23120()) {
            if (abstractC15440.mo23113() && !zM36533) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m51186((AbstractC15440) it.next());
                }
            }
            if (zM36533 || abstractC15440.mo23120()) {
                if (zM36533) {
                    if (abstractC15440.mo27929()) {
                        return;
                    }
                } else if (abstractC15440.mo23552()) {
                    return;
                }
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete hex session path: ")));
            }
        }
    }
}
