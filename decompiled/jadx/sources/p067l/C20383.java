package p067l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: renamed from: l.ᩴᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes5.dex */
public class C20383 extends AbstractC5375 {

    /* JADX INFO: renamed from: ۨ */
    public static final /* synthetic */ int f63001 = 0;

    /* JADX INFO: renamed from: ۛ */
    public C21469 f63002;

    /* JADX INFO: renamed from: ۤ */
    public C21054 f63003;

    /* JADX INFO: renamed from: ۫ */
    public Boolean f63004;

    /* JADX INFO: renamed from: ۬ */
    public final C5967 f63005;

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo11731() {
        return true;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo11750() {
        return true;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11752() {
        return true;
    }

    public C20383(int i, AbstractC5769 abstractC5769) {
        super(i, abstractC5769);
        this.f63005 = new C5967(new C17699(this), mo15799());
        this.f63003 = C21054.m47491(i, abstractC5769);
    }

    public C20383(int i, AbstractC5769 abstractC5769, C14677 c14677) {
        this(i, abstractC5769);
        Boolean boolM33589 = c14677.m33589();
        this.f63004 = boolM33589;
        if (boolM33589 != null) {
            this.f63005.m13379(boolM33589.booleanValue());
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11729(AbstractC5769 abstractC5769) {
        super.mo11729(abstractC5769);
        C21054 c21054M47491 = C21054.m47491(this.f12757, abstractC5769);
        if (this.f63003.equals(c21054M47491)) {
            return;
        }
        C5218.m11191(this.f63003);
        this.f63003 = c21054M47491;
        this.f63005.m13377();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11739(C11996 c11996) {
        c11996.m27442(this.f63004);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۘ */
    public final String mo11732() {
        return this.f63003.f66105;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۖ */
    public final String mo11730() {
        return this.f63003.f66105;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩵ */
    public final C21469 mo11749() {
        Comparator c10995;
        C21469 c21469 = this.f63002;
        if (c21469 != null) {
            return c21469;
        }
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            C2947 c2947M17605 = new C7642(c3940M11190).m17605();
            HashMap map = c2947M17605.f5135;
            HashMap map2 = c2947M17605.f5137;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new C6716((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
            }
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList2.add(new C6716((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue()));
            }
            if (c2947M17605.f5136) {
                c10995 = new C23173(1);
            } else {
                c10995 = new C10995();
            }
            Collections.sort(arrayList, c10995);
            Collections.sort(arrayList2, c10995);
            C21469 c214610 = new C21469(C21562.unmodifiableList(arrayList), C21562.unmodifiableList(arrayList2));
            this.f63002 = c214610;
            C5218.m11189(c3940M11190);
            return c214610;
        } catch (Throwable th) {
            try {
                throw new IOException("Failed to load uid and gid lists", th);
            } catch (Throwable th2) {
                C5218.m11189(c3940M11190);
                throw th2;
            }
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11751() {
        C4081.f8988.execute(new RunnableC21169(5, this));
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        this.f63005.m13377();
        if (z) {
            C5218.m11191(this.f63003);
            this.f63002 = null;
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11735(String str) {
        return this.f63005.m13381(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11747(String str) {
        C5967 c5967 = this.f63005;
        c5967.getClass();
        return c5967.m13376(C11419.m26416(str), C11419.m26414(str)) != null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩻ */
    public final String mo11753(String str) {
        return this.f63005.m13380(str);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        String strM26416 = C11419.m26416(str);
        C13801 c13801 = (C13801) this.f63005.m13376(strM26416, C11419.m26414(str));
        if (c13801 != null) {
            return new C14605(c13801, strM26416);
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        String strM41972 = AbstractC18422.m41972(str);
        Collection<C13801> collectionValues = this.f63005.m13382(strM41972).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C13801 c13801 : collectionValues) {
            if (z || !c13801.m31453().startsWith(".")) {
                arrayList.add(new C14605(c13801, strM41972));
            }
        }
        return arrayList;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۢ */
    public final void mo11736(String str) {
        this.f63005.m13378(str);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo15799() {
        return this.f63004 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46011(C20383 c20383, C3940 c3940, Vector vector, String str) throws C18080 {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            hashSet.add(((C13801) it.next()).m31453());
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            C13801 c13801 = (C13801) it2.next();
            if (c13801.m31448().m7977()) {
                String strM31453 = c13801.m31453();
                boolean z = false;
                char cCharAt = strM31453.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM31453.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM31453.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    try {
                        c3940.m7824(C11419.m26403(str, lowerCase));
                        z = true;
                    } catch (C18080 e) {
                        int i = e.f53986;
                        if (i != 2 && i != 10) {
                            throw e;
                        }
                    }
                    c20383.f63004 = Boolean.valueOf(z);
                    c20383.f63005.m13379(z);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C3940 m46013(C20383 c20383) {
        return C5218.m11190(c20383.f63003);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo11725(long j, String str) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            InputStream inputStreamM7815 = c3940M11190.m7815(j, str);
            return new C4960(this, inputStreamM7815, inputStreamM7815, c3940M11190);
        } catch (IOException | Error | RuntimeException e) {
            C5218.m11189(c3940M11190);
            throw e;
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11727(int i, int i2, String str) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            C3999 c3999 = new C3999();
            c3999.m7973(i, i2);
            c3940M11190.m7823(str, c3999);
        } finally {
            C5218.m11189(c3940M11190);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11728(String str, String str2) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            c3940M11190.m7817(str, str2);
        } finally {
            C5218.m11189(c3940M11190);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo11737(long j, String str) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            return new C6301(this, c3940M11190.m7822(str), c3940M11190);
        } catch (IOException | Error | RuntimeException e) {
            C5218.m11189(c3940M11190);
            throw e;
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11738(int i, String str) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            C3999 c3999 = new C3999();
            c3999.m7970(i);
            c3940M11190.m7823(str, c3999);
        } finally {
            C5218.m11189(c3940M11190);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11740(String str, String str2) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            c3940M11190.m7817(str, str2);
            return true;
        } catch (C18080 unused) {
            return false;
        } finally {
            C5218.m11189(c3940M11190);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܶ */
    public final String mo11743() {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            String str = this.f12758.f14159;
            if (!TextUtils.isEmpty(str)) {
                return AbstractC18422.m41972(str);
            }
            return AbstractC18422.m41972(c3940M11190.m7814());
        } finally {
            C5218.m11189(c3940M11190);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11744(long j, String str) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            C3999 c3999 = new C3999();
            int i = (int) (j / 1000);
            c3999.m7971(i, i);
            c3940M11190.m7823(str, c3999);
        } finally {
            C5218.m11189(c3940M11190);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11745(String str, boolean z) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            if (z) {
                c3940M11190.m7826(str);
            } else {
                c3940M11190.m7827(str);
            }
            C5218.m11189(c3940M11190);
        } catch (Throwable th) {
            C5218.m11189(c3940M11190);
            throw th;
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܿ */
    public final void mo11746(String str) {
        C3940 c3940M11190 = C5218.m11190(this.f63003);
        try {
            try {
                C3999 c3999 = new C3999();
                c3999.m7970(448);
                c3940M11190.m7818(str, c3999);
                C5218.m11189(c3940M11190);
            } catch (C18080 e) {
                if (e.f53986 == 4) {
                    try {
                        if (c3940M11190.m7824(str).m7974()) {
                            C5218.m11189(c3940M11190);
                            return;
                        }
                    } catch (C18080 unused) {
                    }
                }
                throw e;
            }
        } catch (Throwable th) {
            C5218.m11189(c3940M11190);
            throw th;
        }
    }
}
