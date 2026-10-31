package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0102 implements InterfaceC0397, AdapterView.OnItemClickListener, InterfaceC21524 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18222 f1067;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f1068;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f1069;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f1070;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f1071;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f1072;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f1073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f1074;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f1075;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1076;

    public C0102(C7864 c7864) {
        this.f1073 = c7864;
        this.f1068 = c7864.m21123().split("/");
        C18222 c18222 = new C18222(c7864.requireContext(), 255);
        this.f1067 = c18222;
        c18222.m42454(this);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.START;
        c18222.m42461();
        c7864.f24374.m30341((InterfaceC21524) this);
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
    @Override // l.InterfaceC0397
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1091(ArrayList arrayList) {
        int i;
        int iM21065;
        int iM21064;
        int iM21066;
        C5042 c5042;
        String strM14562;
        C7864 c7864 = this.f1073;
        c7864.f24374.m30318(arrayList);
        int iM30444 = c7864.f24374.m30444();
        int iM30448 = c7864.f24374.m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        C7744 c7744Mo26556 = c7864.f24374.m30436().mo26556();
        if (iM30444 != iM30448) {
            try {
                if (TextUtils.indexOf((CharSequence) c7744Mo26556, '\n', iM30444, iM30448) == -1) {
                    i = iM30444 - 1;
                    iM21065 = C7864.m21065(c7744Mo26556, i, true);
                    int iM21067 = C7864.m21065(c7744Mo26556, iM30448, false);
                    if (iM21065 == -1 && iM21067 != -1) {
                        int i2 = iM21065 + 1;
                        this.f1071 = i2;
                        this.f1069 = iM21067;
                        this.f1070 = c7744Mo26556.subSequence(i2, iM21067);
                        if (m1089()) {
                            this.f1076 = false;
                            m1088(arrayList);
                        }
                    } else {
                        iM21064 = C7864.m21064(i, (CharSequence) c7744Mo26556, true);
                        iM21066 = C7864.m21064(iM30448, (CharSequence) c7744Mo26556, false);
                        if (iM21064 == -1 && iM21066 != -1 && C7864.m21076(iM21064 - 1, c7744Mo26556)) {
                            int i3 = iM21064 + 1;
                            this.f1071 = i3;
                            this.f1069 = iM21066;
                            this.f1070 = c7744Mo26556.subSequence(i3, iM21066);
                            if (c7864.f24365 != null) {
                                arrayList.add(new C21645(R.string.menu_copy_id, R.drawable.MT_Protector, new InterfaceC13041() { // from class: l.ۘ֫ۢ
                                    @Override // l.InterfaceC13041
                                    public final void accept(Object obj) {
                                        C0102.m1086(this.f11479);
                                    }
                                }));
                            }
                            this.f1074 = "";
                            this.f1072 = this.f1068[1];
                            this.f1075 = this.f1070;
                            this.f1076 = true;
                            m1088(arrayList);
                        } else if (iM21064 != -1 && iM21066 != -1) {
                            c5042 = new C5042(iM21064 - 1, c7744Mo26556);
                            strM14562 = c5042.m14562();
                            if (strM14562.equals("=")) {
                                strM14562 = c5042.m14562() + strM14562;
                            }
                            if (strM14562.equals("parent=")) {
                                int i4 = iM21064 + 1;
                                this.f1071 = i4;
                                this.f1069 = iM21066;
                                this.f1070 = c7744Mo26556.subSequence(i4, iM21066);
                                if (m1089()) {
                                    this.f1076 = false;
                                    m1088(arrayList);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            i = iM30444 - 1;
            iM21065 = C7864.m21065(c7744Mo26556, i, true);
            int iM21068 = C7864.m21065(c7744Mo26556, iM30448, false);
            if (iM21065 == -1) {
                iM21064 = C7864.m21064(i, (CharSequence) c7744Mo26556, true);
                iM21066 = C7864.m21064(iM30448, (CharSequence) c7744Mo26556, false);
                if (iM21064 == -1) {
                    if (iM21064 != -1) {
                        c5042 = new C5042(iM21064 - 1, c7744Mo26556);
                        strM14562 = c5042.m14562();
                        if (strM14562.equals("=")) {
                            strM14562 = c5042.m14562() + strM14562;
                        }
                        if (strM14562.equals("parent=")) {
                            int i5 = iM21064 + 1;
                            this.f1071 = i5;
                            this.f1069 = iM21066;
                            this.f1070 = c7744Mo26556.subSequence(i5, iM21066);
                            if (m1089()) {
                                this.f1076 = false;
                                m1088(arrayList);
                            }
                        }
                    }
                } else if (iM21064 != -1) {
                    c5042 = new C5042(iM21064 - 1, c7744Mo26556);
                    strM14562 = c5042.m14562();
                    if (strM14562.equals("=")) {
                        strM14562 = c5042.m14562() + strM14562;
                    }
                    if (strM14562.equals("parent=")) {
                        int i6 = iM21064 + 1;
                        this.f1071 = i6;
                        this.f1069 = iM21066;
                        this.f1070 = c7744Mo26556.subSequence(i6, iM21066);
                        if (m1089()) {
                            this.f1076 = false;
                            m1088(arrayList);
                        }
                    }
                }
            } else {
                iM21064 = C7864.m21064(i, (CharSequence) c7744Mo26556, true);
                iM21066 = C7864.m21064(iM30448, (CharSequence) c7744Mo26556, false);
                if (iM21064 == -1) {
                    if (iM21064 != -1) {
                        c5042 = new C5042(iM21064 - 1, c7744Mo26556);
                        strM14562 = c5042.m14562();
                        if (strM14562.equals("=")) {
                            strM14562 = c5042.m14562() + strM14562;
                        }
                        if (strM14562.equals("parent=")) {
                            int i7 = iM21064 + 1;
                            this.f1071 = i7;
                            this.f1069 = iM21066;
                            this.f1070 = c7744Mo26556.subSequence(i7, iM21066);
                            if (m1089()) {
                                this.f1076 = false;
                                m1088(arrayList);
                            }
                        }
                    }
                } else if (iM21064 != -1) {
                    c5042 = new C5042(iM21064 - 1, c7744Mo26556);
                    strM14562 = c5042.m14562();
                    if (strM14562.equals("=")) {
                        strM14562 = c5042.m14562() + strM14562;
                    }
                    if (strM14562.equals("parent=")) {
                        int i8 = iM21064 + 1;
                        this.f1071 = i8;
                        this.f1069 = iM21066;
                        this.f1070 = c7744Mo26556.subSequence(i8, iM21066);
                        if (m1089()) {
                            this.f1076 = false;
                            m1088(arrayList);
                        }
                    }
                }
            }
        }
        c7744Mo26556.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1086(C0102 c0102) {
        C7864 c7864 = c0102.f1073;
        if (c7864.f24385) {
            String strM21067 = C7864.m21067(c7864, c0102.f1070);
            if (strM21067 != null) {
                C4925.m14308(-1, strM21067);
                C21374 c21374M48458 = C21374.m48458(0, strM21067);
                c21374M48458.m48467(17, 0);
                c21374M48458.m48468();
                return;
            }
            ((ActivityC17169) c7864.requireActivity()).m40354(c7864.f24365, (C19287) null);
            C21374 c21374M48459 = C21374.m48458(1, c7864.getString(R.string.MT_Protector, c0102.f1070));
            c21374M48459.m48467(17, 0);
            c21374M48459.m48468();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m1089() {
        if ((this.f1070.startsWith("@") || this.f1070.startsWith("?")) && this.f1070.indexOf(32) == -1) {
            String[] strArrSplit = this.f1070.substring(1).split("/");
            if (strArrSplit.length == 2) {
                String str = strArrSplit[0];
                this.f1075 = strArrSplit[1];
                if (str.indexOf(58) != -1) {
                    String[] strArrSplit2 = str.split(":");
                    if (strArrSplit2.length != 2) {
                        return false;
                    }
                    this.f1074 = strArrSplit2[0];
                    this.f1072 = strArrSplit2[1];
                } else {
                    this.f1074 = "";
                    this.f1072 = str;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ᩴ֫ۢ] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1088(ArrayList arrayList) {
        if (this.f1068.length != 3) {
            return;
        }
        C7864 c7864 = this.f1073;
        C1869 c1869M30375 = c7864.f24374.m30375();
        c1869M30375.f6373 = true;
        c1869M30375.f6375 = this.f1071;
        c1869M30375.f6374 = this.f1069;
        c7864.f24374.invalidate();
        arrayList.add(new C19154(this, new InterfaceC13041() { // from class: l.ᩴ֫ۢ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C0102.m1087(this.f57217, (C12392) obj);
            }
        }, c1869M30375));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1087(C0102 c0102, C12392 c12392) {
        String strConcat;
        C18222 c18222 = c0102.f1067;
        C7864 c7864 = c0102.f1073;
        if (c7864.f24385) {
            if (TextUtils.isEmpty(c0102.f1074)) {
                strConcat = C9045.m23341(new StringBuilder(), c0102.f1068[0], "/");
            } else {
                String strM44848 = c7864.f24368.m44848(c0102.f1074);
                if (strM44848 == null) {
                    c7864.f24386.m11384((Throwable) new C1637("Resource not found: " + c0102.f1070));
                    return;
                }
                strConcat = strM44848.concat("/");
            }
            ArrayList<C2518> arrayListM44846 = c7864.f24368.m44846(C9045.m23341(C5368.m15339(strConcat), c0102.f1072, "/"), c0102.f1075);
            if (arrayListM44846.isEmpty()) {
                c7864.f24386.m11384((Throwable) new C1637("Resource not found: " + c0102.f1070));
                return;
            }
            if (c0102.f1076) {
                String strM21123 = c7864.m21123();
                for (C2518 c2518 : arrayListM44846) {
                    if (c2518.f7992.equals(strM21123)) {
                        c2518.setSpan(new ForegroundColorSpan(C21943.f70257), 0, strM21123.length(), 33);
                        break;
                    }
                }
            }
            Collections.sort(arrayListM44846);
            c18222.m42455(arrayListM44846);
            c18222.m42457(c12392, c12392.m30444());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C18222 c18222 = this.f1067;
        c18222.m42453();
        C2518 c2518 = (C2518) c18222.m42452(i);
        C7864 c7864 = this.f1073;
        c7864.f24374.m30516();
        ((ActivityC17169) c7864.requireActivity()).m40354(c2518.f7992, c2518.f7993);
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1090() {
        this.f1067.m42453();
    }
}
