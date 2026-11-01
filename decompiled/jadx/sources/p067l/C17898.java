package p067l;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܽ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 770P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17898 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f53477;

    /* JADX INFO: renamed from: ۧ */
    public long f53478;

    /* JADX INFO: renamed from: ܳ */
    public final C24665 f53479;

    /* JADX INFO: renamed from: ܽ */
    public C4598 f53480;

    /* JADX INFO: renamed from: ܿ */
    public final HashSet f53481;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f53482;

    /* JADX INFO: renamed from: ᩻ */
    public final LinkedHashSet f53483;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m40704(AbstractC17043 abstractC17043) {
        C12826.requireNonNull(abstractC17043);
        m40701();
        boolean z = false;
        if (this.f53483.isEmpty()) {
            return false;
        }
        String strMo25505 = abstractC17043.mo25505();
        if (!this.f53483.contains(strMo25505)) {
            HashMap map = this.f53479.test(strMo25505) ? this.f53477 : this.f53482;
            if (!map.isEmpty() && map.containsKey(m40699(strMo25505))) {
            }
            return z;
        }
        z = true;
        return z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m40705(AbstractC17043 abstractC17043) {
        C12826.requireNonNull(abstractC17043);
        String strMo25505 = abstractC17043.mo25505();
        if (this.f53483.remove(strMo25505)) {
            String strM40699 = m40699(strMo25505);
            HashMap map = this.f53477;
            int iIntValue = ((Integer) map.get(strM40699)).intValue();
            if (iIntValue == 1) {
                map.remove(strM40699);
            } else {
                map.put(strM40699, Integer.valueOf(iIntValue - 1));
            }
            if (this.f53481.remove(strMo25505)) {
                HashMap map2 = this.f53482;
                int iIntValue2 = ((Integer) map2.get(strM40699)).intValue();
                if (iIntValue2 == 1) {
                    map2.remove(strM40699);
                } else {
                    map2.put(strM40699, Integer.valueOf(iIntValue2 - 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m40703(AbstractC17043 abstractC17043, byte[] bArr) {
        m40702(abstractC17043);
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            C14677 c14677 = new C14677(bArr);
            int i = c14677.readInt();
            int length = (bArr.length - 4) / 9;
            if (i <= 0 || i > length) {
                throw new IOException("Invalid ZIP split volume count: " + i);
            }
            AbstractC17043 abstractC17043M38672 = abstractC17043.m38672();
            for (int i2 = 0; i2 < i; i2++) {
                m40702(abstractC17043M38672.m38684(c14677.m33593()));
                c14677.skipBytes(8);
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Invalid ZIP split metadata", e);
        }
    }

    public C17898() {
        C24665 c24665 = new C24665(1);
        this.f53483 = new LinkedHashSet();
        this.f53481 = new HashSet();
        this.f53477 = new HashMap();
        this.f53482 = new HashMap();
        this.f53478 = Long.MIN_VALUE;
        this.f53479 = c24665;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17898 m40700(AbstractC15599 abstractC15599) {
        C12826.requireNonNull(abstractC15599);
        C17898 c17898 = new C17898();
        if (abstractC15599 instanceof C20661) {
            C20661 c20661 = (C20661) abstractC15599;
            c17898.m40703(c20661.m46674(), c20661.m46682());
            return c17898;
        }
        if (abstractC15599 instanceof C19121) {
            C19121 c19121 = (C19121) abstractC15599;
            c17898.m40702(c19121.m43447());
            c17898.m40702(c19121.m43453());
            return c17898;
        }
        if (abstractC15599 instanceof C4598) {
            c17898.f53480 = (C4598) abstractC15599;
            c17898.m40701();
            return c17898;
        }
        if (abstractC15599 instanceof C13315) {
            c17898.m40702(((C13315) abstractC15599).m30396());
            return c17898;
        }
        if (abstractC15599 instanceof C7150) {
            C7150 c7150 = (C7150) abstractC15599;
            if (!c7150.m16433()) {
                c17898.m40702(c7150.m16437());
            }
        }
        return c17898;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40701() {
        C4598 c4598 = this.f53480;
        if (c4598 == null) {
            return;
        }
        long jM9727 = c4598.m9727();
        if (this.f53478 == jM9727) {
            return;
        }
        Iterator it = this.f53480.m9726().iterator();
        while (it.hasNext()) {
            m40702((AbstractC17043) it.next());
        }
        this.f53478 = jM9727;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40699(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m40702(AbstractC17043 abstractC17043) {
        C12826.requireNonNull(abstractC17043);
        String strMo25505 = abstractC17043.mo25505();
        if (this.f53483.add(strMo25505)) {
            String strM40699 = m40699(strMo25505);
            C15525.merge(this.f53477, strM40699, 1, new C12535());
            if (this.f53479.test(strMo25505)) {
                this.f53481.add(strMo25505);
                C15525.merge(this.f53482, strM40699, 1, new C12535());
            }
        }
    }
}
