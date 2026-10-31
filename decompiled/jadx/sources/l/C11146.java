package l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes3.dex */
public class C11146 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7638 f33463 = new C7638();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4550 f33464;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4550 f33465;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15293 f33466;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33467;

    /* JADX INFO: renamed from: ֫ */
    public String mo14039() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean mo27661() {
        return this instanceof C4816;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject mo27664() {
        return null;
    }

    public C11146(int i) {
        this.f33467 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27662() {
        return this.f33467;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m27663() {
        return this.f33467 == 31;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String mo27660() {
        return m27658(this.f33467);
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo14042() {
        int i = this.f33467;
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
                return false;
            case 2:
            case 3:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 30:
                return true;
            case 27:
            default:
                throw new IllegalArgumentException("type=" + i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14041(View view, C10235 c10235) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C12392 c12392Mo6482 = interfaceC1973.mo6482();
        InterfaceC22602 interfaceC22602Mo6483 = interfaceC1973.mo6483();
        if (c12392Mo6482 == null || interfaceC22602Mo6483 == null) {
            return;
        }
        if (!c12392Mo6482.hasFocus()) {
            c12392Mo6482.requestFocus();
        }
        int i = this.f33467;
        int iM2038 = 0;
        switch (i) {
            case 1:
                C22975.m51114(c12392Mo6482);
                return;
            case 2:
                C22975.m51121(c12392Mo6482);
                return;
            case 3:
                C22975.m51128(c12392Mo6482);
                return;
            case 4:
                C22975.m51123(c12392Mo6482);
                return;
            case 5:
                C22975.m51130(c12392Mo6482);
                return;
            case 6:
                C22975.m51126(c12392Mo6482);
                return;
            case 7:
                C22975.m51116(c12392Mo6482, true);
                return;
            case 8:
                C22975.m51116(c12392Mo6482, false);
                return;
            case 9:
                C22975.m51131(c12392Mo6482);
                return;
            case 10:
                C22975.m51124(c12392Mo6482);
                return;
            case 11:
                C22975.m51118(c12392Mo6482);
                return;
            case 12:
                interfaceC22602Mo6483.mo11728();
                return;
            case 13:
                c12392Mo6482.m30495();
                return;
            case 14:
                c12392Mo6482.m30481();
                return;
            case 15:
                interfaceC1973.mo6484();
                return;
            case 16:
                C22975.m51127(c12392Mo6482, false);
                return;
            case 17:
                C22975.m51125(c12392Mo6482, false);
                return;
            case 18:
                c12392Mo6482.onKeyDown(21, null);
                return;
            case 19:
                c12392Mo6482.onKeyDown(22, null);
                return;
            case 20:
                c12392Mo6482.onKeyDown(19, null);
                return;
            case 21:
                c12392Mo6482.onKeyDown(20, null);
                return;
            case 22:
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof C10797) {
                        iM2038 = ((C10797) parent).m2038();
                        ApplicationC20075 applicationC20075 = C4925.f15522;
                        applicationC20075.startActivity(new Intent(applicationC20075, (Class<?>) ActivityC0477.class).addFlags(268435456).putExtra("pageIndex", iM2038));
                        return;
                    }
                }
                ApplicationC20075 applicationC20076 = C4925.f15522;
                applicationC20076.startActivity(new Intent(applicationC20076, (Class<?>) ActivityC0477.class).addFlags(268435456).putExtra("pageIndex", iM2038));
                return;
            case 23:
                C22975.m51129(c12392Mo6482, false);
                return;
            case 24:
                C22975.m51122(c12392Mo6482, false);
                return;
            case 25:
                c12392Mo6482.m30391();
                return;
            case 26:
                c12392Mo6482.m30522();
                return;
            case 27:
            default:
                throw new RuntimeException(C19370.m44628(i, "Unsupported type "));
            case 28:
                c12392Mo6482.m30466(R.id.copy);
                return;
            case 29:
                c12392Mo6482.m30466(R.id.cut);
                return;
            case 30:
                c12392Mo6482.m30466(R.id.paste);
                return;
            case 31:
                C15293 c15293 = this.f33466;
                if (c15293 == null) {
                    throw new RuntimeException("bindingFunction == null");
                }
                if (c15293.f46926.mo14042()) {
                    new RunnableC13987(this, view, interfaceC1973).run();
                    return;
                } else {
                    this.f33466.f46926.mo14040(view, interfaceC1973);
                    C4925.m14316(new RunnableC23160(), 200L);
                    return;
                }
            case 32:
                C22975.m51117(c12392Mo6482);
                return;
            case 33:
                C22975.m51119(c12392Mo6482);
                return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27659(boolean z) {
        int i = this.f33467;
        if (i < 0 || i >= 35) {
            return false;
        }
        return z || i != 31;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC19634 m27657(int i) {
        if (i == 0) {
            return C4816.f15238;
        }
        if (i == 27) {
            return C22455.f72732;
        }
        if (i == 34) {
            return C11872.f35407;
        }
        return f33463;
    }

    static {
        int[] iArr = {31, 0, 34, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 32, 33, 12, 13, 14, 15, 16, 17, 23, 24, 18, 19, 20, 21, 25, 26, 22};
        f33465 = C13016.m31595(C15859.m37593(iArr));
        f33464 = C13016.m31595(new C15859(iArr, 0));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m27658(int i) {
        switch (i) {
            case 0:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 1:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 2:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 3:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 4:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 5:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 6:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 7:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 8:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 9:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 10:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 11:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 12:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 13:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 14:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 15:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 16:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 17:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 18:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 19:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 20:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 21:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 22:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 23:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 24:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 25:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 26:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 27:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 28:
                return C4925.m14327(R.string.copy);
            case 29:
                return C4925.m14327(R.string.cut);
            case 30:
                return C4925.m14327(R.string.paste);
            case 31:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 32:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 33:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            case 34:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector);
            default:
                return i + "???";
        }
    }
}
