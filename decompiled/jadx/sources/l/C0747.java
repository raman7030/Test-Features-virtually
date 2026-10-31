package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0747 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22911 f2796;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19799[] f2797;

    public C0747(C22911 c22911, C1662 c1662) {
        try {
            super(4, (c22911.size() * 4) + 4);
            this.f2796 = c22911;
            this.f2797 = new C19799[c22911.size()];
            Iterator it = c22911.getAnnotations().iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f2797[i] = new C19799(c1662, (C5978) it.next());
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f2796.hashCode();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo2861(AbstractC3073 abstractC3073) {
        return this.f2796.compareTo(((C0747) abstractC3073).f2796);
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String mo2864() {
        return this.f2796.toString();
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2863(C1662 c1662) {
        C4484 c4484M5614 = c1662.m5614();
        C19799[] c19799Arr = this.f2797;
        int length = c19799Arr.length;
        for (int i = 0; i < length; i++) {
            c19799Arr[i] = (C19799) c4484M5614.m13223(c19799Arr[i]);
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2866(C4484 c4484, int i) {
        C19799.m45540(this.f2797);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        boolean zM42506 = c18241.m42506();
        C19799[] c19799Arr = this.f2797;
        int length = c19799Arr.length;
        if (zM42506) {
            c18241.m42501(0, m9391() + " annotation set");
            c18241.m42501(4, "  size: ".concat(C14712.m35008(length)));
        }
        c18241.m42514(length);
        for (int i = 0; i < length; i++) {
            int iM9390 = c19799Arr[i].m9390();
            if (zM42506) {
                c18241.m42501(4, "  entries[" + Integer.toHexString(i) + "]: " + C14712.m35008(iM9390));
                c19799Arr[i].m45541(c18241);
            }
            c18241.m42514(iM9390);
        }
    }
}
