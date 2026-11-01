package p067l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2465 implements InterfaceC2746, AdapterView.OnItemClickListener, InterfaceC22825 {

    /* JADX INFO: renamed from: ۗ */
    public C19687 f3841;

    /* JADX INFO: renamed from: ۙ */
    public String[] f3842;

    /* JADX INFO: renamed from: ۛ */
    public int f3843;

    /* JADX INFO: renamed from: ۤ */
    public String f3844;

    /* JADX INFO: renamed from: ۨ */
    public int f3845;

    /* JADX INFO: renamed from: ۫ */
    public String f3846;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C9842 f3847;

    /* JADX INFO: renamed from: ᩶ */
    public String f3848;

    /* JADX INFO: renamed from: ᩸ */
    public String f3849;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f3850;

    public C2465(C9842 c9842) {
        this.f3847 = c9842;
        this.f3842 = c9842.m23088().split("/");
        C19687 c19687 = new C19687(c9842.requireContext(), 255);
        this.f3841 = c19687;
        c19687.m44715(this);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.START;
        c19687.m44722();
        c9842.f27290.m32405((InterfaceC22825) this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:16:0x005c A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00da A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:8:0x002f, B:10:0x0035, B:13:0x0044, B:15:0x0055, B:16:0x005c, B:19:0x0068, B:21:0x0070, B:23:0x0081, B:24:0x0094, B:27:0x00ac, B:29:0x00bf, B:30:0x00d2, B:32:0x00da, B:34:0x00eb), top: B:43:0x002f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00bf, please report this as an issue */
    @Override // p067l.InterfaceC2746
    /* JADX INFO: renamed from: ֫ */
    public final void mo3487(ArrayList arrayList) {
        int i;
        int iM23030;
        int iM23029;
        int iM230210;
        C7160 c7160;
        String strM16466;
        C9842 c9842 = this.f3847;
        c9842.f27290.m32382(arrayList);
        int iM32508 = c9842.f27290.m32508();
        int iM32512 = c9842.f27290.m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        C9729 c9729Mo28589 = c9842.f27290.m32500().mo28589();
        if (iM32508 != iM32512) {
            try {
                if (TextUtils.indexOf((CharSequence) c9729Mo28589, '\n', iM32508, iM32512) == -1) {
                    i = iM32508 - 1;
                    iM23030 = C9842.m23030(c9729Mo28589, i, true);
                    int iM23031 = C9842.m23030(c9729Mo28589, iM32512, false);
                    if (iM23030 == -1 && iM23031 != -1) {
                        int i2 = iM23030 + 1;
                        this.f3845 = i2;
                        this.f3843 = iM23031;
                        this.f3844 = c9729Mo28589.subSequence(i2, iM23031);
                        if (m3485()) {
                            this.f3850 = false;
                            m3484(arrayList);
                        }
                    } else {
                        iM23029 = C9842.m23029(i, (CharSequence) c9729Mo28589, true);
                        iM230210 = C9842.m23029(iM32512, (CharSequence) c9729Mo28589, false);
                        if (iM23029 == -1 && iM230210 != -1 && C9842.m23041(iM23029 - 1, c9729Mo28589)) {
                            int i3 = iM23029 + 1;
                            this.f3845 = i3;
                            this.f3843 = iM230210;
                            this.f3844 = c9729Mo28589.subSequence(i3, iM230210);
                            if (c9842.f27281 != null) {
                                arrayList.add(new C22940(R.string.menu_copy_id, R.drawable.MT_Protector, new InterfaceC1489() { // from class: l.ۘ֫ۢ
                                    @Override // p067l.InterfaceC1489
                                    public final void accept(Object obj) {
                                        C2465.m3482(this.f14284);
                                    }
                                }));
                            }
                            this.f3848 = "";
                            this.f3846 = this.f3842[1];
                            this.f3849 = this.f3844;
                            this.f3850 = true;
                            m3484(arrayList);
                        } else if (iM23029 != -1 && iM230210 != -1) {
                            c7160 = new C7160(iM23029 - 1, c9729Mo28589);
                            strM16466 = c7160.m16466();
                            if (strM16466.equals("=")) {
                                strM16466 = c7160.m16466() + strM16466;
                            }
                            if (strM16466.equals("parent=")) {
                                int i4 = iM23029 + 1;
                                this.f3845 = i4;
                                this.f3843 = iM230210;
                                this.f3844 = c9729Mo28589.subSequence(i4, iM230210);
                                if (m3485()) {
                                    this.f3850 = false;
                                    m3484(arrayList);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            i = iM32508 - 1;
            iM23030 = C9842.m23030(c9729Mo28589, i, true);
            int iM23032 = C9842.m23030(c9729Mo28589, iM32512, false);
            if (iM23030 == -1) {
                iM23029 = C9842.m23029(i, (CharSequence) c9729Mo28589, true);
                iM230210 = C9842.m23029(iM32512, (CharSequence) c9729Mo28589, false);
                if (iM23029 == -1) {
                    if (iM23029 != -1) {
                        c7160 = new C7160(iM23029 - 1, c9729Mo28589);
                        strM16466 = c7160.m16466();
                        if (strM16466.equals("=")) {
                            strM16466 = c7160.m16466() + strM16466;
                        }
                        if (strM16466.equals("parent=")) {
                            int i5 = iM23029 + 1;
                            this.f3845 = i5;
                            this.f3843 = iM230210;
                            this.f3844 = c9729Mo28589.subSequence(i5, iM230210);
                            if (m3485()) {
                                this.f3850 = false;
                                m3484(arrayList);
                            }
                        }
                    }
                } else if (iM23029 != -1) {
                    c7160 = new C7160(iM23029 - 1, c9729Mo28589);
                    strM16466 = c7160.m16466();
                    if (strM16466.equals("=")) {
                        strM16466 = c7160.m16466() + strM16466;
                    }
                    if (strM16466.equals("parent=")) {
                        int i6 = iM23029 + 1;
                        this.f3845 = i6;
                        this.f3843 = iM230210;
                        this.f3844 = c9729Mo28589.subSequence(i6, iM230210);
                        if (m3485()) {
                            this.f3850 = false;
                            m3484(arrayList);
                        }
                    }
                }
            } else {
                iM23029 = C9842.m23029(i, (CharSequence) c9729Mo28589, true);
                iM230210 = C9842.m23029(iM32512, (CharSequence) c9729Mo28589, false);
                if (iM23029 == -1) {
                    if (iM23029 != -1) {
                        c7160 = new C7160(iM23029 - 1, c9729Mo28589);
                        strM16466 = c7160.m16466();
                        if (strM16466.equals("=")) {
                            strM16466 = c7160.m16466() + strM16466;
                        }
                        if (strM16466.equals("parent=")) {
                            int i7 = iM23029 + 1;
                            this.f3845 = i7;
                            this.f3843 = iM230210;
                            this.f3844 = c9729Mo28589.subSequence(i7, iM230210);
                            if (m3485()) {
                                this.f3850 = false;
                                m3484(arrayList);
                            }
                        }
                    }
                } else if (iM23029 != -1) {
                    c7160 = new C7160(iM23029 - 1, c9729Mo28589);
                    strM16466 = c7160.m16466();
                    if (strM16466.equals("=")) {
                        strM16466 = c7160.m16466() + strM16466;
                    }
                    if (strM16466.equals("parent=")) {
                        int i8 = iM23029 + 1;
                        this.f3845 = i8;
                        this.f3843 = iM230210;
                        this.f3844 = c9729Mo28589.subSequence(i8, iM230210);
                        if (m3485()) {
                            this.f3850 = false;
                            m3484(arrayList);
                        }
                    }
                }
            }
        }
        c9729Mo28589.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3482(C2465 c2465) {
        C9842 c9842 = c2465.f3847;
        if (c9842.f27301) {
            String strM23032 = C9842.m23032(c9842, c2465.f3844);
            if (strM23032 != null) {
                C7050.m16205(-1, strM23032);
                C22682 c22682M50794 = C22682.m50794(0, strM23032);
                c22682M50794.m50803(17, 0);
                c22682M50794.m50804();
                return;
            }
            ((ActivityC18686) c9842.requireActivity()).m42599(c9842.f27281, (C20699) null);
            C22682 c22682M50795 = C22682.m50794(1, c9842.getString(R.string.MT_Protector, c2465.f3844));
            c22682M50795.m50803(17, 0);
            c22682M50795.m50804();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m3485() {
        if ((this.f3844.startsWith("@") || this.f3844.startsWith("?")) && this.f3844.indexOf(32) == -1) {
            String[] strArrSplit = this.f3844.substring(1).split("/");
            if (strArrSplit.length == 2) {
                String str = strArrSplit[0];
                this.f3849 = strArrSplit[1];
                if (str.indexOf(58) != -1) {
                    String[] strArrSplit2 = str.split(":");
                    if (strArrSplit2.length != 2) {
                        return false;
                    }
                    this.f3848 = strArrSplit2[0];
                    this.f3846 = strArrSplit2[1];
                } else {
                    this.f3848 = "";
                    this.f3846 = str;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ᩴ֫ۢ] */
    /* JADX INFO: renamed from: ۧ */
    private void m3484(ArrayList arrayList) {
        if (this.f3842.length != 3) {
            return;
        }
        C9842 c9842 = this.f3847;
        C4145 c4145M32439 = c9842.f27290.m32439();
        c4145M32439.f9154 = true;
        c4145M32439.f9156 = this.f3845;
        c4145M32439.f9155 = this.f3843;
        c9842.f27290.invalidate();
        arrayList.add(new C20572(this, new InterfaceC1489() { // from class: l.ᩴ֫ۢ
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                C2465.m3483(this.f60435, (C14146) obj);
            }
        }, c4145M32439));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3483(C2465 c2465, C14146 c14146) {
        String strConcat;
        C19687 c19687 = c2465.f3841;
        C9842 c9842 = c2465.f3847;
        if (c9842.f27301) {
            if (TextUtils.isEmpty(c2465.f3848)) {
                strConcat = C10965.m25286(new StringBuilder(), c2465.f3842[0], "/");
            } else {
                String strM47144 = c9842.f27284.m47144(c2465.f3848);
                if (strM47144 == null) {
                    c9842.f27302.m13320((Throwable) new C3924("Resource not found: " + c2465.f3844));
                    return;
                }
                strConcat = strM47144.concat("/");
            }
            ArrayList<C4762> arrayListM47142 = c9842.f27284.m47142(C10965.m25286(C7470.m17248(strConcat), c2465.f3846, "/"), c2465.f3849);
            if (arrayListM47142.isEmpty()) {
                c9842.f27302.m13320((Throwable) new C3924("Resource not found: " + c2465.f3844));
                return;
            }
            if (c2465.f3850) {
                String strM23088 = c9842.m23088();
                for (C4762 c4762 : arrayListM47142) {
                    if (c4762.f10784.equals(strM23088)) {
                        c4762.setSpan(new ForegroundColorSpan(C23223.f72969), 0, strM23088.length(), 33);
                        break;
                    }
                }
            }
            Collections.sort(arrayListM47142);
            c19687.m44716(arrayListM47142);
            c19687.m44718(c14146, c14146.m32508());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C19687 c19687 = this.f3841;
        c19687.m44714();
        C4762 c4762 = (C4762) c19687.m44713(i);
        C9842 c9842 = this.f3847;
        c9842.f27290.m32580();
        ((ActivityC18686) c9842.requireActivity()).m42599(c4762.f10784, c4762.f10785);
    }

    @Override // p067l.InterfaceC22825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3486() {
        this.f3841.m44714();
    }
}
