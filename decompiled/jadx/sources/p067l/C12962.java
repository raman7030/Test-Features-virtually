package p067l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes3.dex */
public class C12962 {

    /* JADX INFO: renamed from: ܽ */
    public static final C9628 f36463 = new C9628();

    /* JADX INFO: renamed from: ܿ */
    public static final C6693 f36464;

    /* JADX INFO: renamed from: ᩳ */
    public static final C6693 f36465;

    /* JADX INFO: renamed from: ֫ */
    public C16903 f36466;

    /* JADX INFO: renamed from: ۧ */
    public final int f36467;

    /* JADX INFO: renamed from: ֫ */
    public String mo15919() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public boolean mo29723() {
        return this instanceof C6946;
    }

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject mo29726() {
        return null;
    }

    public C12962(int i) {
        this.f36467 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m29724() {
        return this.f36467;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m29725() {
        return this.f36467 == 31;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo29722() {
        return m29720(this.f36467);
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo15922() {
        int i = this.f36467;
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
    public void mo15921(View view, C12096 c12096) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15920(View view, InterfaceC4244 interfaceC4244) {
        C14146 c14146Mo8623 = interfaceC4244.mo8623();
        InterfaceC23850 interfaceC23850Mo8624 = interfaceC4244.mo8624();
        if (c14146Mo8623 == null || interfaceC23850Mo8624 == null) {
            return;
        }
        if (!c14146Mo8623.hasFocus()) {
            c14146Mo8623.requestFocus();
        }
        int i = this.f36467;
        int iM4415 = 0;
        switch (i) {
            case 1:
                C24204.m53506(c14146Mo8623);
                return;
            case 2:
                C24204.m53513(c14146Mo8623);
                return;
            case 3:
                C24204.m53520(c14146Mo8623);
                return;
            case 4:
                C24204.m53515(c14146Mo8623);
                return;
            case 5:
                C24204.m53522(c14146Mo8623);
                return;
            case 6:
                C24204.m53518(c14146Mo8623);
                return;
            case 7:
                C24204.m53508(c14146Mo8623, true);
                return;
            case 8:
                C24204.m53508(c14146Mo8623, false);
                return;
            case 9:
                C24204.m53523(c14146Mo8623);
                return;
            case 10:
                C24204.m53516(c14146Mo8623);
                return;
            case 11:
                C24204.m53510(c14146Mo8623);
                return;
            case 12:
                interfaceC23850Mo8624.mo13664();
                return;
            case 13:
                c14146Mo8623.m32559();
                return;
            case 14:
                c14146Mo8623.m32545();
                return;
            case 15:
                interfaceC4244.mo8625();
                return;
            case 16:
                C24204.m53519(c14146Mo8623, false);
                return;
            case 17:
                C24204.m53517(c14146Mo8623, false);
                return;
            case 18:
                c14146Mo8623.onKeyDown(21, null);
                return;
            case 19:
                c14146Mo8623.onKeyDown(22, null);
                return;
            case 20:
                c14146Mo8623.onKeyDown(19, null);
                return;
            case 21:
                c14146Mo8623.onKeyDown(20, null);
                return;
            case 22:
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof C12630) {
                        iM4415 = ((C12630) parent).m4415();
                        ApplicationC21448 applicationC21448 = C7050.f18354;
                        applicationC21448.startActivity(new Intent(applicationC21448, (Class<?>) ActivityC2822.class).addFlags(268435456).putExtra("pageIndex", iM4415));
                        return;
                    }
                }
                ApplicationC21448 applicationC21449 = C7050.f18354;
                applicationC21449.startActivity(new Intent(applicationC21449, (Class<?>) ActivityC2822.class).addFlags(268435456).putExtra("pageIndex", iM4415));
                return;
            case 23:
                C24204.m53521(c14146Mo8623, false);
                return;
            case 24:
                C24204.m53514(c14146Mo8623, false);
                return;
            case 25:
                c14146Mo8623.m32455();
                return;
            case 26:
                c14146Mo8623.m32586();
                return;
            case 27:
            default:
                throw new RuntimeException(C20778.m46922(i, "Unsupported type "));
            case 28:
                c14146Mo8623.m32530(R.id.copy);
                return;
            case 29:
                c14146Mo8623.m32530(R.id.cut);
                return;
            case 30:
                c14146Mo8623.m32530(R.id.paste);
                return;
            case 31:
                C16903 c16903 = this.f36466;
                if (c16903 == null) {
                    throw new RuntimeException("bindingFunction == null");
                }
                if (c16903.f50053.mo15922()) {
                    new RunnableC15662(this, view, interfaceC4244).run();
                    return;
                } else {
                    this.f36466.f50053.mo15920(view, interfaceC4244);
                    C7050.m16213(new RunnableC24380(), 200L);
                    return;
                }
            case 32:
                C24204.m53509(c14146Mo8623);
                return;
            case 33:
                C24204.m53511(c14146Mo8623);
                return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29721(boolean z) {
        int i = this.f36467;
        if (i < 0 || i >= 35) {
            return false;
        }
        return z || i != 31;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC21029 m29719(int i) {
        if (i == 0) {
            return C6946.f18071;
        }
        if (i == 27) {
            return C23710.f75458;
        }
        if (i == 34) {
            return C13652.f38416;
        }
        return f36463;
    }

    static {
        int[] iArr = {31, 0, 34, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 32, 33, 12, 13, 14, 15, 16, 17, 23, 24, 18, 19, 20, 21, 25, 26, 22};
        f36465 = C14739.m33680(C17441.m39765(iArr));
        f36464 = C14739.m33680(new C17441(iArr, 0));
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m29720(int i) {
        switch (i) {
            case 0:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 1:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 2:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 3:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 4:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 5:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 6:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 7:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 8:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 9:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 10:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 11:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 12:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 13:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 14:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 15:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 16:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 17:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 18:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 19:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 20:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 21:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 22:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 23:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 24:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 25:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 26:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 27:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 28:
                return C7050.m16224(R.string.copy);
            case 29:
                return C7050.m16224(R.string.cut);
            case 30:
                return C7050.m16224(R.string.paste);
            case 31:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 32:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 33:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            case 34:
                return C7050.m16224(bin.p000mt.plus.R.string.MT_Protector);
            default:
                return i + "???";
        }
    }
}
