package l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10468 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1295 f31411;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f31412;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31413;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31414;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Integer f31415;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31416;

    public C10468(ArrayList arrayList, C16300 c16300) {
        Integer numValueOf = Integer.valueOf(BasicLabelFormatter.MILLION);
        this.f31411 = new C1295();
        ArrayList arrayList2 = new ArrayList();
        this.f31413 = arrayList2;
        this.f31414 = 0;
        this.f31412 = true;
        this.f31416 = arrayList;
        arrayList2.add(c16300);
        this.f31415 = numValueOf;
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo7225() {
        return this.f31412;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f31411;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        CharSequence charSequenceM38335 = interfaceC19124.getLine().m38335();
        int iM22635 = C8751.m22635('|', charSequenceM38335, interfaceC19124.mo44153());
        if (iM22635 == -1) {
            return null;
        }
        if (iM22635 == interfaceC19124.mo44153() && C8751.m22636(iM22635 + 1, charSequenceM38335.length(), charSequenceM38335) == charSequenceM38335.length()) {
            this.f31412 = false;
            return null;
        }
        return C14721.m35022(interfaceC19124.getIndex());
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        this.f31413.add(c16300);
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7217(InterfaceC11487 interfaceC11487) {
        C1295 c1295 = this.f31411;
        List listM1351 = c1295.m1351();
        C19954 c19954 = !listM1351.isEmpty() ? (C19954) listM1351.get(0) : null;
        C22462 c22462 = new C22462();
        if (c19954 != null) {
            c22462.m1347(c19954);
        }
        c1295.m1343(c22462);
        C20346 c20346 = new C20346();
        c20346.m1342(c22462.m1351());
        c22462.m1343(c20346);
        ArrayList arrayList = this.f31413;
        ArrayList arrayListM26351 = m26351((C16300) arrayList.get(0));
        int size = arrayListM26351.size();
        for (int i = 0; i < size; i++) {
            C21757 c21757M26349 = m26349((C16300) arrayListM26351.get(i), i, interfaceC11487);
            c21757M26349.m49073();
            c20346.m1343(c21757M26349);
        }
        int i2 = 2;
        C8351 c8351 = null;
        while (i2 < arrayList.size()) {
            C16300 c16300 = (C16300) arrayList.get(i2);
            C19954 c19955 = i2 < listM1351.size() ? (C19954) listM1351.get(i2) : null;
            ArrayList arrayListM26352 = m26351(c16300);
            C20346 c20347 = new C20346();
            if (c19955 != null) {
                c20347.m1347(c19955);
            }
            int i3 = 0;
            while (i3 < size) {
                c20347.m1343(m26349(i3 < arrayListM26352.size() ? (C16300) arrayListM26352.get(i3) : C16300.m38334("", (C19954) null), i3, interfaceC11487));
                i3++;
            }
            if (c8351 == null) {
                c8351 = new C8351();
                c1295.m1343(c8351);
            }
            c8351.m1343(c20347);
            c8351.m1347(c19955);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21757 m26349(C16300 c16300, int i, InterfaceC11487 interfaceC11487) {
        Integer num = this.f31415;
        if (num != null) {
            if (this.f31414 >= num.intValue()) {
                throw new IllegalArgumentException("Aborting parsing because maximum number of cells reached (maxCells = " + num + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            this.f31414++;
        }
        C21757 c21757 = new C21757();
        C19954 c19954M38337 = c16300.m38337();
        if (c19954M38337 != null) {
            c21757.m1347(c19954M38337);
        }
        ArrayList arrayList = this.f31416;
        if (i < arrayList.size()) {
            c21757.m49072(((C12584) arrayList.get(i)).m30848());
        }
        CharSequence charSequenceM38335 = c16300.m38335();
        int iM22636 = C8751.m22636(0, charSequenceM38335.length(), charSequenceM38335);
        C16300 c16300M38336 = c16300.m38336(iM22636, C8751.m22646(charSequenceM38335.length() - 1, iM22636, charSequenceM38335) + 1);
        C17712 c17712 = new C17712();
        c17712.m41445(c16300M38336);
        interfaceC11487.mo28307(c17712, c21757);
        return c21757;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26351(C16300 c16300) {
        CharSequence charSequenceM38335 = c16300.m38335();
        int iM22636 = C8751.m22636(0, charSequenceM38335.length(), charSequenceM38335);
        int length = charSequenceM38335.length();
        if (charSequenceM38335.charAt(iM22636) == '|') {
            iM22636++;
            length = C8751.m22646(charSequenceM38335.length() - 1, iM22636, charSequenceM38335) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iM22636;
        while (iM22636 < length) {
            char cCharAt = charSequenceM38335.charAt(iM22636);
            if (cCharAt == '\\') {
                int i2 = iM22636 + 1;
                if (i2 < length && charSequenceM38335.charAt(i2) == '|') {
                    sb.append('|');
                    iM22636 = i2;
                } else {
                    sb.append('\\');
                }
            } else if (cCharAt == '|') {
                arrayList.add(C16300.m38334(sb.toString(), c16300.m38336(i, iM22636).m38337()));
                sb.setLength(0);
                i = iM22636 + 1;
            } else {
                sb.append(cCharAt);
            }
            iM22636++;
        }
        if (sb.length() > 0) {
            arrayList.add(C16300.m38334(sb.toString(), c16300.m38336(i, c16300.m38335().length()).m38337()));
        }
        return arrayList;
    }
}
