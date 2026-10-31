package l;

import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8218 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20177 f25315 = new C20177();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C1785 f25316 = new C1785(0, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f25317;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f25318;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f25319;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f25320;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1785 f25321;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1162 m21761(String str, boolean z) throws IOException {
        String strMo27935;
        HashSet hashSet = null;
        for (int i = 0; i <= 64; i++) {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
            String strMo23544 = abstractC15440M39866.mo23544();
            if (hashSet != null && !hashSet.add(strMo23544)) {
                throw new IOException("Symbolic link cycle in hex target");
            }
            if (z && (abstractC15440M39866 instanceof C11293)) {
                C17642 c17642M27928 = ((C11293) abstractC15440M39866).m27928();
                if (c17642M27928.m41288() != 'l') {
                    strMo27935 = null;
                } else {
                    strMo27935 = c17642M27928.m41285();
                    if (strMo27935 == null) {
                        throw new IOException("Hex target link metadata is unavailable");
                    }
                }
            } else {
                strMo27935 = abstractC15440M39866.mo27935();
            }
            if (strMo27935 == null) {
                return new C1162(abstractC15440M39866, strMo23544);
            }
            if (hashSet == null) {
                hashSet = new HashSet();
                hashSet.add(strMo23544);
            }
            if (i == 64) {
                throw new IOException("Too many symbolic links in hex target");
            }
            if (!strMo27935.startsWith("/")) {
                AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
                while (true) {
                    if (abstractC15440M36536 != null) {
                        if (strMo27935.isEmpty() || strMo27935.equals(".")) {
                            str = abstractC15440M36536.mo23554();
                            break;
                        }
                        if (strMo27935.equals("..")) {
                            str = abstractC15440M36536.getParent();
                            break;
                        }
                        if (strMo27935.startsWith("./")) {
                            strMo27935 = strMo27935.substring(2);
                        } else if (strMo27935.startsWith("../")) {
                            strMo27935 = strMo27935.substring(3);
                            abstractC15440M36536 = abstractC15440M36536.m36536();
                        } else {
                            str = abstractC15440M36536.m36526(strMo27935).mo23554();
                            break;
                        }
                    } else {
                        str = abstractC15440M39866.mo23554();
                        break;
                    }
                }
            } else {
                str = strMo27935;
            }
            if (str == null) {
                throw new C5519();
            }
        }
        throw new IOException("Too many symbolic links in hex target");
    }

    public C8218(String str, C1162 c1162, C1785 c1785) {
        this.f25317 = str;
        this.f25319 = c1162.f4200;
        AbstractC15440 abstractC15440 = c1162.f4199;
        this.f25318 = abstractC15440;
        this.f25321 = c1785;
        this.f25320 = abstractC15440.m36507();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8218 m21766(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440, "openedFile");
        if (abstractC15440.m36507()) {
            return m21764(abstractC15440);
        }
        return m21763(abstractC15440.mo23554(), (String) null, (C1785) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8218 m21765(AbstractC15440 abstractC15440, String str, C1785 c1785) {
        C11003.requireNonNull(abstractC15440, "openedFile");
        if (abstractC15440.m36507()) {
            return m21764(abstractC15440);
        }
        return m21763(abstractC15440.mo23554(), str, c1785);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8218 m21767(AbstractC15440 abstractC15440, String str, C1785 c1785) throws IOException {
        C11003.requireNonNull(abstractC15440, "openedFile");
        if (!abstractC15440.m36507()) {
            try {
                return new C8218(abstractC15440.mo23554(), new C1162(C16999.m39866(str, new String[0]), str), c1785);
            } catch (RuntimeException e) {
                throw new IOException("Unable to restore deferred hex target", e);
            }
        }
        return m21764(abstractC15440);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21768() {
        return this.f25317;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m21771() {
        return this.f25319;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m21769() {
        return this.f25318;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1785 m21773() {
        return this.f25321;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21770() throws IOException {
        C1785 c1785 = this.f25321;
        if (this.f25320) {
            return;
        }
        try {
            C1162 c1162M21761 = m21761(this.f25317, true);
            if (!this.f25319.equals(c1162M21761.f4200)) {
                throw new C5519();
            }
            if (!c1785.equals(m21762(c1162M21761.f4199, c1785))) {
                throw new C5519();
            }
        } catch (C5519 e) {
            throw e;
        } catch (IOException e2) {
            throw new IOException("Unable to validate hex target", e2);
        } catch (RuntimeException e3) {
            throw new IOException("Unable to validate hex target", e3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8218 m21764(AbstractC15440 abstractC15440) {
        return new C8218(abstractC15440.mo23554(), new C1162(abstractC15440, abstractC15440.mo23544()), f25316);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8218 m21763(String str, String str2, C1785 c1785) throws IOException {
        C1162 c1162M21761 = m21761(str, false);
        String str3 = c1162M21761.f4200;
        AbstractC15440 abstractC15440 = c1162M21761.f4199;
        if (abstractC15440.m36507()) {
            return new C8218(str, c1162M21761, f25316);
        }
        if (str2 != null && !str2.equals(str3)) {
            throw new C5519();
        }
        if (!abstractC15440.mo27911() || !abstractC15440.mo23119()) {
            throw new IOException("File can not be read");
        }
        long jMo23127 = abstractC15440.mo23127();
        if (jMo23127 < 0) {
            throw new IOException("Hex target length is unavailable");
        }
        C1785 c1786 = new C1785(jMo23127, abstractC15440.mo23117());
        if (c1785 != null && !c1785.equals(c1786)) {
            throw new C5519();
        }
        C1162 c1162M21762 = m21761(str, false);
        if (str3.equals(c1162M21762.f4200)) {
            AbstractC15440 abstractC15441 = c1162M21762.f4199;
            if (abstractC15441.mo27911() && abstractC15441.mo23119() && abstractC15441.mo23127() == c1786.m5940() && abstractC15441.mo23117() == c1786.m5938()) {
                return new C8218(str, c1162M21762, c1786);
            }
        }
        throw new C5519();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1785 m21762(AbstractC15440 abstractC15440, C1785 c1785) throws IOException {
        if (!(abstractC15440 instanceof C11293)) {
            if (!abstractC15440.mo27911() || !abstractC15440.mo23119()) {
                throw new IOException("Hex target metadata is unavailable");
            }
            long jMo23127 = abstractC15440.mo23127();
            long jMo23117 = abstractC15440.mo23117();
            if (jMo23127 < 0 || ((jMo23127 == 0 && c1785.m5940() != 0) || (jMo23117 == 0 && c1785.m5938() != 0))) {
                throw new IOException("Hex target metadata is unavailable");
            }
            return new C1785(jMo23127, jMo23117);
        }
        C17642 c17642M27928 = ((C11293) abstractC15440).m27928();
        if (c17642M27928.m41288() != '-' || c17642M27928.m41290() < 0) {
            throw new IOException("Hex target metadata is unavailable");
        }
        return new C1785(c17642M27928.m41290(), c17642M27928.m41284());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8218 m21772() {
        if (this.f25320) {
            return this;
        }
        return m21763(this.f25317, this.f25319, (C1785) null);
    }
}
