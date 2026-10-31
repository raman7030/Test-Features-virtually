package l;

import java.util.Arrays;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩵᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19799 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C19093 f63948 = new C19093();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5978 f63949;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11249 f63950;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f63951;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45540(C19799[] c19799Arr) {
        Arrays.sort(c19799Arr, f63948);
    }

    public C19799(C1662 c1662, C5978 c5978) {
        super(1, -1);
        if (c5978 == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f63949 = c5978;
        this.f63950 = null;
        this.f63951 = null;
        mo2863(c1662);
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_ANNOTATION_ITEM;
    }

    public final int hashCode() {
        return this.f63949.hashCode();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ֫ */
    public final int mo2861(AbstractC3073 abstractC3073) {
        return this.f63949.compareTo(((C19799) abstractC3073).f63949);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return this.f63949.mo2463();
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C16892 c16892M5632 = c1662.m5632();
        C5978 c5978 = this.f63949;
        this.f63950 = c16892M5632.m39750(c5978.getType());
        C23948.m52774(c1662, c5978);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        C18241 c18241 = new C18241();
        new C23948(c4484.m16521(), c18241).m52778(this.f63949, false);
        byte[] bArrM42520 = c18241.m42520();
        this.f63951 = bArrM42520;
        m9389(bArrM42520.length + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45541(C18241 c18241) {
        StringBuilder sb = new StringBuilder("    visibility: ");
        C5978 c5978 = this.f63949;
        sb.append(c5978.getVisibility().mo2463());
        c18241.m42501(0, sb.toString());
        c18241.m42501(0, "    type: " + c5978.getType().mo2463());
        for (C7389 c7389 : c5978.m16777()) {
            c18241.m42501(0, ASN1Dump.TAB + c7389.getName().mo2463() + ": " + C23948.m52776(c7389.getValue()));
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        boolean zM42506 = c18241.m42506();
        C5978 c5978 = this.f63949;
        EnumC11623 visibility = c5978.getVisibility();
        if (zM42506) {
            c18241.m42501(0, m9391() + " annotation");
            StringBuilder sb = new StringBuilder("  visibility: VISBILITY_");
            sb.append(visibility);
            c18241.m42501(1, sb.toString());
        }
        int i = C4276.f13818[visibility.ordinal()];
        if (i == 1) {
            c18241.m42517(0);
        } else if (i == 2) {
            c18241.m42517(1);
        } else if (i == 3) {
            c18241.m42517(2);
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        if (zM42506) {
            new C23948(c1662, c18241).m52778(c5978, true);
        } else {
            c18241.m42505(this.f63951);
        }
    }
}
