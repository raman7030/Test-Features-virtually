package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܽ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 770P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16340 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f50304;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f50305;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23461 f50306;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2346 f50307;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f50308;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f50309;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f50310;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m38488(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440);
        m38485();
        boolean z = false;
        if (this.f50310.isEmpty()) {
            return false;
        }
        String strMo23554 = abstractC15440.mo23554();
        if (!this.f50310.contains(strMo23554)) {
            HashMap map = this.f50306.test(strMo23554) ? this.f50304 : this.f50309;
            if (!map.isEmpty() && map.containsKey(m38483(strMo23554))) {
            }
            return z;
        }
        z = true;
        return z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38489(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440);
        String strMo23554 = abstractC15440.mo23554();
        if (this.f50310.remove(strMo23554)) {
            String strM38483 = m38483(strMo23554);
            HashMap map = this.f50304;
            int iIntValue = ((Integer) map.get(strM38483)).intValue();
            if (iIntValue == 1) {
                map.remove(strM38483);
            } else {
                map.put(strM38483, Integer.valueOf(iIntValue - 1));
            }
            if (this.f50308.remove(strMo23554)) {
                HashMap map2 = this.f50309;
                int iIntValue2 = ((Integer) map2.get(strM38483)).intValue();
                if (iIntValue2 == 1) {
                    map2.remove(strM38483);
                } else {
                    map2.put(strM38483, Integer.valueOf(iIntValue2 - 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38487(AbstractC15440 abstractC15440, byte[] bArr) {
        m38486(abstractC15440);
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            C12951 c12951 = new C12951(bArr);
            int i = c12951.readInt();
            int length = (bArr.length - 4) / 9;
            if (i <= 0 || i > length) {
                throw new IOException("Invalid ZIP split volume count: " + i);
            }
            AbstractC15440 abstractC15440M36514 = abstractC15440.m36514();
            for (int i2 = 0; i2 < i; i2++) {
                m38486(abstractC15440M36514.m36526(c12951.m31506()));
                c12951.skipBytes(8);
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Invalid ZIP split metadata", e);
        }
    }

    public C16340() {
        C23461 c23461 = new C23461(1);
        this.f50310 = new LinkedHashSet();
        this.f50308 = new HashSet();
        this.f50304 = new HashMap();
        this.f50309 = new HashMap();
        this.f50305 = Long.MIN_VALUE;
        this.f50306 = c23461;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16340 m38484(AbstractC13921 abstractC13921) {
        C11003.requireNonNull(abstractC13921);
        C16340 c16340 = new C16340();
        if (abstractC13921 instanceof C19247) {
            C19247 c19247 = (C19247) abstractC13921;
            c16340.m38487(c19247.m44380(), c19247.m44388());
            return c16340;
        }
        if (abstractC13921 instanceof C17626) {
            C17626 c17626 = (C17626) abstractC13921;
            c16340.m38486(c17626.m41201());
            c16340.m38486(c17626.m41207());
            return c16340;
        }
        if (abstractC13921 instanceof C2346) {
            c16340.f50307 = (C2346) abstractC13921;
            c16340.m38485();
            return c16340;
        }
        if (abstractC13921 instanceof C11518) {
            c16340.m38486(((C11518) abstractC13921).m28350());
            return c16340;
        }
        if (abstractC13921 instanceof C5031) {
            C5031 c5031 = (C5031) abstractC13921;
            if (!c5031.m14529()) {
                c16340.m38486(c5031.m14533());
            }
        }
        return c16340;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38485() {
        C2346 c2346 = this.f50307;
        if (c2346 == null) {
            return;
        }
        long jM7656 = c2346.m7656();
        if (this.f50305 == jM7656) {
            return;
        }
        Iterator it = this.f50307.m7655().iterator();
        while (it.hasNext()) {
            m38486((AbstractC15440) it.next());
        }
        this.f50305 = jM7656;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38483(String str) {
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(Character.toUpperCase(cCharAt));
            if (sb == null && lowerCase != cCharAt) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
            if (sb != null) {
                sb.append(lowerCase);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38486(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440);
        String strMo23554 = abstractC15440.mo23554();
        if (this.f50310.add(strMo23554)) {
            String strM38483 = m38483(strMo23554);
            C13843.merge(this.f50304, strM38483, 1, new C10697());
            if (this.f50306.test(strMo23554)) {
                this.f50308.add(strMo23554);
                C13843.merge(this.f50309, strM38483, 1, new C10697());
            }
        }
    }
}
