package p067l;

import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12317 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C3599 f34376;

    /* JADX INFO: renamed from: ۧ */
    public boolean f34377;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f34378;

    /* JADX INFO: renamed from: ܽ */
    public int f34379;

    /* JADX INFO: renamed from: ܿ */
    public final Integer f34380;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f34381;

    public C12317(ArrayList arrayList, C17859 c17859) {
        Integer numValueOf = Integer.valueOf(BasicLabelFormatter.MILLION);
        this.f34376 = new C3599();
        ArrayList arrayList2 = new ArrayList();
        this.f34378 = arrayList2;
        this.f34379 = 0;
        this.f34377 = true;
        this.f34381 = arrayList;
        arrayList2.add(c17859);
        this.f34380 = numValueOf;
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo9304() {
        return this.f34377;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f34376;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        CharSequence charSequenceM40550 = interfaceC20543.getLine().m40550();
        int iM24605 = C10685.m24605('|', charSequenceM40550, interfaceC20543.mo46447());
        if (iM24605 == -1) {
            return null;
        }
        if (iM24605 == interfaceC20543.mo46447() && C10685.m24606(iM24605 + 1, charSequenceM40550.length(), charSequenceM40550) == charSequenceM40550.length()) {
            this.f34377 = false;
            return null;
        }
        return C16359.m37169(interfaceC20543.getIndex());
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9297(C17859 c17859) {
        this.f34378.add(c17859);
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9296(InterfaceC13285 interfaceC13285) {
        C3599 c3599 = this.f34376;
        List listM3764 = c3599.m3764();
        C21332 c21332 = !listM3764.isEmpty() ? (C21332) listM3764.get(0) : null;
        C23716 c23716 = new C23716();
        if (c21332 != null) {
            c23716.m3760(c21332);
        }
        c3599.m3756(c23716);
        C21705 c21705 = new C21705();
        c21705.m3755(c23716.m3764());
        c23716.m3756(c21705);
        ArrayList arrayList = this.f34378;
        ArrayList arrayListM28383 = m28383((C17859) arrayList.get(0));
        int size = arrayListM28383.size();
        for (int i = 0; i < size; i++) {
            C23046 c23046M28381 = m28381((C17859) arrayListM28383.get(i), i, interfaceC13285);
            c23046M28381.m51422();
            c21705.m3756(c23046M28381);
        }
        int i2 = 2;
        C10305 c10305 = null;
        while (i2 < arrayList.size()) {
            C17859 c17859 = (C17859) arrayList.get(i2);
            C21332 c21333 = i2 < listM3764.size() ? (C21332) listM3764.get(i2) : null;
            ArrayList arrayListM28384 = m28383(c17859);
            C21705 c21706 = new C21705();
            if (c21333 != null) {
                c21706.m3760(c21333);
            }
            int i3 = 0;
            while (i3 < size) {
                c21706.m3756(m28381(i3 < arrayListM28384.size() ? (C17859) arrayListM28384.get(i3) : C17859.m40549("", (C21332) null), i3, interfaceC13285));
                i3++;
            }
            if (c10305 == null) {
                c10305 = new C10305();
                c3599.m3756(c10305);
            }
            c10305.m3756(c21706);
            c10305.m3760(c21333);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C23046 m28381(C17859 c17859, int i, InterfaceC13285 interfaceC13285) {
        Integer num = this.f34380;
        if (num != null) {
            if (this.f34379 >= num.intValue()) {
                throw new IllegalArgumentException("Aborting parsing because maximum number of cells reached (maxCells = " + num + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            this.f34379++;
        }
        C23046 c23046 = new C23046();
        C21332 c21332M40552 = c17859.m40552();
        if (c21332M40552 != null) {
            c23046.m3760(c21332M40552);
        }
        ArrayList arrayList = this.f34381;
        if (i < arrayList.size()) {
            c23046.m51421(((C14328) arrayList.get(i)).m32925());
        }
        CharSequence charSequenceM40550 = c17859.m40550();
        int iM24606 = C10685.m24606(0, charSequenceM40550.length(), charSequenceM40550);
        C17859 c17859M40551 = c17859.m40551(iM24606, C10685.m24616(charSequenceM40550.length() - 1, iM24606, charSequenceM40550) + 1);
        C19201 c19201 = new C19201();
        c19201.m43691(c17859M40551);
        interfaceC13285.mo30351(c19201, c23046);
        return c23046;
    }

    /* JADX INFO: renamed from: ܽ */
    public static ArrayList m28383(C17859 c17859) {
        CharSequence charSequenceM40550 = c17859.m40550();
        int iM24606 = C10685.m24606(0, charSequenceM40550.length(), charSequenceM40550);
        int length = charSequenceM40550.length();
        if (charSequenceM40550.charAt(iM24606) == '|') {
            iM24606++;
            length = C10685.m24616(charSequenceM40550.length() - 1, iM24606, charSequenceM40550) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iM24606;
        while (iM24606 < length) {
            char cCharAt = charSequenceM40550.charAt(iM24606);
            if (cCharAt == '\\') {
                int i2 = iM24606 + 1;
                if (i2 < length && charSequenceM40550.charAt(i2) == '|') {
                    sb.append('|');
                    iM24606 = i2;
                } else {
                    sb.append('\\');
                }
            } else if (cCharAt == '|') {
                arrayList.add(C17859.m40549(sb.toString(), c17859.m40551(i, iM24606).m40552()));
                sb.setLength(0);
                i = iM24606 + 1;
            } else {
                sb.append(cCharAt);
            }
            iM24606++;
        }
        if (sb.length() > 0) {
            arrayList.add(C17859.m40549(sb.toString(), c17859.m40551(i, c17859.m40550().length()).m40552()));
        }
        return arrayList;
    }
}
