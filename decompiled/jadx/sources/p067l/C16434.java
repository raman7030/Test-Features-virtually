package p067l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6RC */
/* JADX INFO: loaded from: classes.dex */
public final class C16434 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final int f48298;

    /* JADX INFO: renamed from: ۙ */
    public final C9729 f48299;

    /* JADX INFO: renamed from: ۤ */
    public final CharSequence f48300;

    /* JADX INFO: renamed from: ۫ */
    public final C24301 f48301;

    /* JADX INFO: renamed from: ۬ */
    public final List f48302;

    /* JADX INFO: renamed from: ᩶ */
    public final String f48303;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f48304;

    /* JADX INFO: renamed from: ᩹ */
    public C23989 f48305;

    static {
        ApplicationC14266.m56479(114);
    }

    /* JADX INFO: renamed from: ֫ */
    public native void m37350(AbstractC5526 abstractC5526);

    public C16434(CharSequence charSequence, C9729 c9729, String str, C24301 c24301, int i, List list) {
        this.f48300 = charSequence;
        this.f48299 = c9729;
        this.f48303 = str;
        this.f48301 = c24301;
        this.f48298 = i;
        this.f48302 = list;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16434 m37345(InterfaceC9768 interfaceC9768, String str, C24301 c24301) {
        return m37344(interfaceC9768, str, c24301, -1, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16434 m37346(C13693 c13693, String str, C24301 c24301) {
        C16434 c16434M37344 = m37344(c13693.f38639, str, c24301, -1, null);
        C15271 c15271 = c13693.f38637;
        if (c15271 == null || c15271.m34768() <= 1) {
            return c16434M37344;
        }
        try {
            c16434M37344.f48305 = c13693.f38637.m34761(c13693.f38640, c16434M37344.f48300, c13693.f38631.f79987);
            return c16434M37344;
        } catch (Error | RuntimeException e) {
            c16434M37344.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37349() {
        m37347();
        C23989 c23989 = this.f48305;
        if (c23989 != null) {
            c23989.m53161();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16434 m37344(CharSequence charSequence, String str, C24301 c24301, int i, ArrayList arrayList) {
        List listUnmodifiableList;
        C24301 c24301M53631 = c24301.m53631();
        C9729 c9729Mo28595 = null;
        if (arrayList == null) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C12826.requireNonNull(obj);
                arrayList2.add(obj);
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList2);
        }
        if (listUnmodifiableList != null && (i < 0 || i >= listUnmodifiableList.size())) {
            throw new IllegalArgumentException("Invalid saving page index");
        }
        try {
            c9729Mo28595 = charSequence instanceof InterfaceC21800 ? ((InterfaceC21800) charSequence).mo28595() : null;
            return new C16434(c9729Mo28595 == null ? charSequence : c9729Mo28595, c9729Mo28595, str, c24301M53631, i, listUnmodifiableList);
        } catch (Error | RuntimeException e) {
            if (c9729Mo28595 != null) {
                c9729Mo28595.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37351(AbstractC17043 abstractC17043) {
        m37347();
        C23989 c23989 = this.f48305;
        C24301 c24301 = this.f48301;
        String str = this.f48303;
        if (c23989 == null) {
            C3694.m7125(abstractC17043, this.f48300, str, c24301.f76968);
        } else {
            C3694.m7123(abstractC17043, str, c24301.f76968, c23989);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15639 m37348(int i) throws C4161 {
        m37347();
        C15639 c15639 = new C15639();
        C23989 c23989 = this.f48305;
        CharSequence charSequence = this.f48300;
        if (c23989 == null) {
            c15639.m35533(i, charSequence);
            return c15639;
        }
        for (int i2 = 0; i2 < this.f48305.f76191.m34768(); i2++) {
            if (i2 == this.f48305.m53158()) {
                c15639.m35533(i, charSequence);
            } else {
                C9729 c9729M53159 = this.f48305.m53159(i2);
                try {
                    c15639.m35533(-1, c9729M53159);
                    c9729M53159.close();
                } catch (Throwable th) {
                    try {
                        c9729M53159.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return c15639;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37352(C24301 c24301) {
        C24301 c24302 = this.f48301;
        Map map = c24302.f76970;
        if (c24301 != null) {
            Map map2 = c24301.f76970;
            if (c24302.f76971 == c24301.f76971 && c24302.f76968 == c24301.f76968 && c24302.f76969 == c24301.f76969 && c24302.f76967 == c24301.f76967 && c24302.f76966 == c24301.f76966 && C12826.equals(c24302.f76965, c24301.f76965)) {
                if (map == null || map2 == null) {
                    if (map == map2) {
                        return true;
                    }
                } else if (map.keySet().equals(map2.keySet())) {
                    for (Map.Entry entry : map.entrySet()) {
                        C18344 c18344 = (C18344) entry.getValue();
                        C18344 c18345 = (C18344) map2.get(entry.getKey());
                        int i = c18344.f54790;
                        C16332[] c16332Arr = c18344.f54789;
                        int i2 = c18345.f54790;
                        C16332[] c16332Arr2 = c18345.f54789;
                        if (i == i2 && c18344.f54786 == c18345.f54786 && C12826.equals(c18344.f54787, c18345.f54787) && c16332Arr.length == c16332Arr2.length) {
                            for (int i3 = 0; i3 < c16332Arr.length; i3++) {
                                C16332 c16332 = c16332Arr[i3];
                                C16332 c16333 = c16332Arr2[i3];
                                if (c16332.f47991 == c16333.f47991 && c16332.f47992 == c16333.f47992 && C12826.equals(c16332.f47990, c16333.f47990)) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37347() {
        if (this.f48304) {
            throw new IllegalStateException("Saving request is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f48304) {
            return;
        }
        this.f48304 = true;
        try {
            C9729 c9729 = this.f48299;
            if (c9729 != null) {
                c9729.close();
            }
        } finally {
            C23989 c23989 = this.f48305;
            if (c23989 != null) {
                c23989.close();
            }
        }
    }
}
