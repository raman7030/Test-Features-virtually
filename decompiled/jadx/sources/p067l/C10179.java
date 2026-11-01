package p067l;

import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10179 {

    /* JADX INFO: renamed from: ܳ */
    public static final C21545 f28225 = new C21545();

    /* JADX INFO: renamed from: ᩻ */
    public static final C4065 f28226 = new C4065(0, 0);

    /* JADX INFO: renamed from: ֫ */
    public final String f28227;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f28228;

    /* JADX INFO: renamed from: ܽ */
    public final String f28229;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f28230;

    /* JADX INFO: renamed from: ᩳ */
    public final C4065 f28231;

    /* JADX INFO: renamed from: ֫ */
    public static C3473 m23730(String str, boolean z) throws IOException {
        String strMo29996;
        HashSet hashSet = null;
        for (int i = 0; i <= 64; i++) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            String strMo25495 = abstractC17043M42109.mo25495();
            if (hashSet != null && !hashSet.add(strMo25495)) {
                throw new IOException("Symbolic link cycle in hex target");
            }
            if (z && (abstractC17043M42109 instanceof C13102)) {
                C19136 c19136M29989 = ((C13102) abstractC17043M42109).m29989();
                if (c19136M29989.m43534() != 'l') {
                    strMo29996 = null;
                } else {
                    strMo29996 = c19136M29989.m43531();
                    if (strMo29996 == null) {
                        throw new IOException("Hex target link metadata is unavailable");
                    }
                }
            } else {
                strMo29996 = abstractC17043M42109.mo29996();
            }
            if (strMo29996 == null) {
                return new C3473(abstractC17043M42109, strMo25495);
            }
            if (hashSet == null) {
                hashSet = new HashSet();
                hashSet.add(strMo25495);
            }
            if (i == 64) {
                throw new IOException("Too many symbolic links in hex target");
            }
            if (!strMo29996.startsWith("/")) {
                AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
                while (true) {
                    if (abstractC17043M38694 != null) {
                        if (strMo29996.isEmpty() || strMo29996.equals(".")) {
                            str = abstractC17043M38694.mo25505();
                            break;
                        }
                        if (strMo29996.equals("..")) {
                            str = abstractC17043M38694.getParent();
                            break;
                        }
                        if (strMo29996.startsWith("./")) {
                            strMo29996 = strMo29996.substring(2);
                        } else if (strMo29996.startsWith("../")) {
                            strMo29996 = strMo29996.substring(3);
                            abstractC17043M38694 = abstractC17043M38694.m38694();
                        } else {
                            str = abstractC17043M38694.m38684(strMo29996).mo25505();
                            break;
                        }
                    } else {
                        str = abstractC17043M42109.mo25505();
                        break;
                    }
                }
            } else {
                str = strMo29996;
            }
            if (str == null) {
                throw new C7614();
            }
        }
        throw new IOException("Too many symbolic links in hex target");
    }

    public C10179(String str, C3473 c3473, C4065 c4065) {
        this.f28227 = str;
        this.f28229 = c3473.f6968;
        AbstractC17043 abstractC17043 = c3473.f6967;
        this.f28228 = abstractC17043;
        this.f28231 = c4065;
        this.f28230 = abstractC17043.m38665();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10179 m23735(AbstractC17043 abstractC17043) {
        C12826.requireNonNull(abstractC17043, "openedFile");
        if (abstractC17043.m38665()) {
            return m23733(abstractC17043);
        }
        return m23732(abstractC17043.mo25505(), (String) null, (C4065) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10179 m23734(AbstractC17043 abstractC17043, String str, C4065 c4065) {
        C12826.requireNonNull(abstractC17043, "openedFile");
        if (abstractC17043.m38665()) {
            return m23733(abstractC17043);
        }
        return m23732(abstractC17043.mo25505(), str, c4065);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10179 m23736(AbstractC17043 abstractC17043, String str, C4065 c4065) throws IOException {
        C12826.requireNonNull(abstractC17043, "openedFile");
        if (!abstractC17043.m38665()) {
            try {
                return new C10179(abstractC17043.mo25505(), new C3473(C18524.m42109(str, new String[0]), str), c4065);
            } catch (RuntimeException e) {
                throw new IOException("Unable to restore deferred hex target", e);
            }
        }
        return m23733(abstractC17043);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m23737() {
        return this.f28227;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m23740() {
        return this.f28229;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 m23738() {
        return this.f28228;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4065 m23742() {
        return this.f28231;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m23739() throws IOException {
        C4065 c4065 = this.f28231;
        if (this.f28230) {
            return;
        }
        try {
            C3473 c3473M23730 = m23730(this.f28227, true);
            if (!this.f28229.equals(c3473M23730.f6968)) {
                throw new C7614();
            }
            if (!c4065.equals(m23731(c3473M23730.f6967, c4065))) {
                throw new C7614();
            }
        } catch (C7614 e) {
            throw e;
        } catch (IOException e2) {
            throw new IOException("Unable to validate hex target", e2);
        } catch (RuntimeException e3) {
            throw new IOException("Unable to validate hex target", e3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10179 m23733(AbstractC17043 abstractC17043) {
        return new C10179(abstractC17043.mo25505(), new C3473(abstractC17043, abstractC17043.mo25495()), f28226);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10179 m23732(String str, String str2, C4065 c4065) throws IOException {
        C3473 c3473M23730 = m23730(str, false);
        String str3 = c3473M23730.f6968;
        AbstractC17043 abstractC17043 = c3473M23730.f6967;
        if (abstractC17043.m38665()) {
            return new C10179(str, c3473M23730, f28226);
        }
        if (str2 != null && !str2.equals(str3)) {
            throw new C7614();
        }
        if (!abstractC17043.mo29972() || !abstractC17043.mo25093()) {
            throw new IOException("File can not be read");
        }
        long jMo25101 = abstractC17043.mo25101();
        if (jMo25101 < 0) {
            throw new IOException("Hex target length is unavailable");
        }
        C4065 c4066 = new C4065(jMo25101, abstractC17043.mo25091());
        if (c4065 != null && !c4065.equals(c4066)) {
            throw new C7614();
        }
        C3473 c3473M23731 = m23730(str, false);
        if (str3.equals(c3473M23731.f6968)) {
            AbstractC17043 abstractC17044 = c3473M23731.f6967;
            if (abstractC17044.mo29972() && abstractC17044.mo25093() && abstractC17044.mo25101() == c4066.m8135() && abstractC17044.mo25091() == c4066.m8133()) {
                return new C10179(str, c3473M23731, c4066);
            }
        }
        throw new C7614();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4065 m23731(AbstractC17043 abstractC17043, C4065 c4065) throws IOException {
        if (!(abstractC17043 instanceof C13102)) {
            if (!abstractC17043.mo29972() || !abstractC17043.mo25093()) {
                throw new IOException("Hex target metadata is unavailable");
            }
            long jMo25101 = abstractC17043.mo25101();
            long jMo25091 = abstractC17043.mo25091();
            if (jMo25101 < 0 || ((jMo25101 == 0 && c4065.m8135() != 0) || (jMo25091 == 0 && c4065.m8133() != 0))) {
                throw new IOException("Hex target metadata is unavailable");
            }
            return new C4065(jMo25101, jMo25091);
        }
        C19136 c19136M29989 = ((C13102) abstractC17043).m29989();
        if (c19136M29989.m43534() != '-' || c19136M29989.m43536() < 0) {
            throw new IOException("Hex target metadata is unavailable");
        }
        return new C4065(c19136M29989.m43536(), c19136M29989.m43530());
    }

    /* JADX INFO: renamed from: ܿ */
    public final C10179 m23741() {
        if (this.f28230) {
            return this;
        }
        return m23732(this.f28227, this.f28229, (C4065) null);
    }
}
