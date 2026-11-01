package p067l;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes.dex */
public class C9951 extends AbstractC5375 {

    /* JADX INFO: renamed from: ܰ */
    public static final C21836 f27546;

    /* JADX INFO: renamed from: ᩺ */
    public static final /* synthetic */ int f27547 = 0;

    /* JADX INFO: renamed from: ۛ */
    public C16655 f27548;

    /* JADX INFO: renamed from: ۤ */
    public Boolean f27549;

    /* JADX INFO: renamed from: ۨ */
    public boolean f27550;

    /* JADX INFO: renamed from: ۫ */
    public C12421 f27551;

    /* JADX INFO: renamed from: ۬ */
    public final C5967 f27552;

    /* JADX INFO: renamed from: ۤ */
    private native void m23246();

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo11731() {
        return false;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo11750() {
        return false;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11751() {
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11752() {
        return false;
    }

    public C9951(int i, AbstractC5769 abstractC5769) {
        super(i, abstractC5769);
        this.f27550 = true;
        this.f27552 = new C5967(new C3245(this), true);
        this.f27548 = C16655.m37713(i, abstractC5769);
        m23246();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11729(AbstractC5769 abstractC5769) {
        super.mo11729(abstractC5769);
        C16655 c16655M37713 = C16655.m37713(this.f12757, abstractC5769);
        if (this.f27548.equals(c16655M37713)) {
            return;
        }
        this.f27548 = c16655M37713;
        m23246();
        this.f27552.m13377();
    }

    public C9951(int i, AbstractC5769 abstractC5769, C14677 c14677) {
        this(i, abstractC5769);
        this.f27550 = c14677.m33585();
        Boolean boolM33589 = c14677.m33589();
        this.f27549 = boolM33589;
        if (boolM33589 != null) {
            this.f27552.m13379(boolM33589.booleanValue());
        }
        this.f27551.m28624(c14677.m33590());
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11739(C11996 c11996) {
        c11996.m27445(this.f27550);
        c11996.m27442(this.f27549);
        c11996.m27444(this.f27551.m28621());
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۘ */
    public final String mo11732() {
        return this.f27548.f48929;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۖ */
    public final String mo11730() {
        return AbstractC5375.m11723(this.f27548.f48929);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܶ */
    public final String mo11743() {
        return TextUtils.isEmpty(this.f12758.f14159) ? "/" : AbstractC18422.m41972(this.f12758.f14159);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        this.f27552.m13377();
        if (z) {
            this.f27551.m28617();
        }
    }

    static {
        ApplicationC14266.m56479(79);
        f27546 = new C21836();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public String m23245(String str) {
        boolean zStartsWith = str.startsWith("/");
        C21836 c21836 = f27546;
        if (zStartsWith) {
            return this.f27548.f48929 + c21836.m49258(str);
        }
        return this.f27548.f48929 + "/" + c21836.m49258(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11733() {
        return this.f27550;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo11725(long j, String str) throws C8397 {
        try {
            return this.f27551.m28615(j, m23245(str));
        } catch (C8397 e) {
            this.f27550 = false;
            throw e;
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo11737(long j, String str) {
        String strM9383 = C4463.m9383(C11419.m26414(str));
        if (strM9383.indexOf(42) != -1) {
            strM9383 = "application/octet-stream";
        }
        return this.f27551.m28616(m23245(str), strM9383, j);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11745(String str, boolean z) throws C13762, C12216 {
        try {
            if (z) {
                this.f27551.m28622(m23245(str) + "/");
                return;
            }
            this.f27551.m28622(m23245(str));
        } catch (C13762 e) {
            if (e.m31347() == 405) {
                throw new C12216(e);
            }
            throw e;
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11728(String str, String str2) {
        this.f27551.m28619(m23245(str), m23245(str2));
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܿ */
    public final void mo11746(String str) {
        this.f27551.m28618(m23245(str));
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11735(String str) {
        return this.f27552.m13381(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11747(String str) {
        C5967 c5967 = this.f27552;
        c5967.getClass();
        return c5967.m13376(C11419.m26416(str), C11419.m26414(str)) != null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩻ */
    public final String mo11753(String str) {
        return this.f27552.m13380(str);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        String strM26416 = C11419.m26416(str);
        C10409 c10409 = (C10409) this.f27552.m13376(strM26416, C11419.m26414(str));
        if (c10409 != null) {
            return new C10622(c10409, strM26416);
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        String strM41972 = AbstractC18422.m41972(str);
        Collection<C10409> collectionValues = this.f27552.m13382(strM41972).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C10409 c10409 : collectionValues) {
            if (z || !c10409.m24113().startsWith(".")) {
                arrayList.add(new C10622(c10409, strM41972));
            }
        }
        return arrayList;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۢ */
    public final void mo11736(String str) {
        this.f27552.m13378(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23244(C9951 c9951, List list, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C10409) it.next()).m24113());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C10409 c10409 = (C10409) it2.next();
            if (!c10409.m24114()) {
                String strM24113 = c10409.m24113();
                char cCharAt = strM24113.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM24113.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM24113.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (c9951.f27551.m28623(c9951.m23245(C11419.m26403(str, lowerCase)))) {
                        c9951.f27549 = Boolean.TRUE;
                    } else {
                        c9951.f27549 = Boolean.FALSE;
                    }
                    c9951.f27552.m13379(c9951.f27549.booleanValue());
                    return;
                }
            }
        }
    }
}
