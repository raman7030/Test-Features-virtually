package p067l;

import java.util.Arrays;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩵᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21186 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۤ */
    public static final C20515 f66585 = new C20515();

    /* JADX INFO: renamed from: ۗ */
    public final C8050 f66586;

    /* JADX INFO: renamed from: ۫ */
    public C13060 f66587;

    /* JADX INFO: renamed from: ۬ */
    public byte[] f66588;

    /* JADX INFO: renamed from: ֫ */
    public static void m47851(C21186[] c21186Arr) {
        Arrays.sort(c21186Arr, f66585);
    }

    public C21186(C3948 c3948, C8050 c8050) {
        super(1, -1);
        if (c8050 == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f66586 = c8050;
        this.f66587 = null;
        this.f66588 = null;
        mo5192(c3948);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_ANNOTATION_ITEM;
    }

    public final int hashCode() {
        return this.f66586.hashCode();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ֫ */
    public final int mo5190(AbstractC5289 abstractC5289) {
        return this.f66586.compareTo(((C21186) abstractC5289).f66586);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f66586.mo4819();
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C18423 c18423M7862 = c3948.m7862();
        C8050 c8050 = this.f66586;
        this.f66587 = c18423M7862.m41991(c8050.getType());
        C25129.m55180(c3948, c8050);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        C19705 c19705 = new C19705();
        new C25129(c6630.m18447(), c19705).m55184(this.f66586, false);
        byte[] bArrM44779 = c19705.m44779();
        this.f66588 = bArrM44779;
        m11431(bArrM44779.length + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47852(C19705 c19705) {
        StringBuilder sb = new StringBuilder("    visibility: ");
        C8050 c8050 = this.f66586;
        sb.append(c8050.getVisibility().mo4819());
        c19705.m44760(0, sb.toString());
        c19705.m44760(0, "    type: " + c8050.getType().mo4819());
        for (C9391 c9391 : c8050.m18703()) {
            c19705.m44760(0, ASN1Dump.TAB + c9391.getName().mo4819() + ": " + C25129.m55182(c9391.getValue()));
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        boolean zM44765 = c19705.m44765();
        C8050 c8050 = this.f66586;
        EnumC13415 visibility = c8050.getVisibility();
        if (zM44765) {
            c19705.m44760(0, m11433() + " annotation");
            StringBuilder sb = new StringBuilder("  visibility: VISBILITY_");
            sb.append(visibility);
            c19705.m44760(1, sb.toString());
        }
        int i = C6433.f16635[visibility.ordinal()];
        if (i == 1) {
            c19705.m44776(0);
        } else if (i == 2) {
            c19705.m44776(1);
        } else if (i == 3) {
            c19705.m44776(2);
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        if (zM44765) {
            new C25129(c3948, c19705).m55184(c8050, true);
        } else {
            c19705.m44764(this.f66588);
        }
    }
}
