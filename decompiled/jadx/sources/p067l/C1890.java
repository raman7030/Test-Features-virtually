package p067l;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷᩸ */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1890 {

    /* JADX INFO: renamed from: ֫ */
    public final C1330 f70840;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f70841;

    /* JADX INFO: renamed from: ܳ */
    public final C0980 f70842;

    /* JADX INFO: renamed from: ܽ */
    public int f70843;

    /* JADX INFO: renamed from: ܿ */
    public final C1645 f70844;

    /* JADX INFO: renamed from: ᩳ */
    public final C1295 f70845;

    public C1890() {
        C1645 c1645 = new C1645();
        c1645.f53036 = false;
        c1645.f53038 = 0;
        c1645.f53039 = 0;
        c1645.f53035 = 1.0f;
        c1645.f53037 = Float.NaN;
        this.f70844 = c1645;
        C1295 c1295 = new C1295();
        c1295.f30613 = false;
        c1295.f30612 = -1;
        c1295.f30618 = null;
        c1295.f30616 = -1;
        c1295.f30615 = 0;
        c1295.f30617 = Float.NaN;
        c1295.f30614 = Float.NaN;
        this.f70845 = c1295;
        C1330 c1330 = new C1330();
        c1330.f32717 = false;
        c1330.f32704 = false;
        c1330.f32754 = -1;
        c1330.f32756 = -1;
        c1330.f32750 = -1.0f;
        c1330.f32733 = -1;
        c1330.f32718 = -1;
        c1330.f32710 = -1;
        c1330.f32747 = -1;
        c1330.f32737 = -1;
        c1330.f32720 = -1;
        c1330.f32744 = -1;
        c1330.f32740 = -1;
        c1330.f32703 = -1;
        c1330.f32700 = -1;
        c1330.f32714 = -1;
        c1330.f32746 = -1;
        c1330.f32709 = -1;
        c1330.f32725 = 0.5f;
        c1330.f32755 = 0.5f;
        c1330.f32723 = null;
        c1330.f32734 = -1;
        c1330.f32759 = 0;
        c1330.f32742 = 0.0f;
        c1330.f32721 = -1;
        c1330.f32738 = -1;
        c1330.f32739 = -1;
        c1330.f32758 = -1;
        c1330.f32706 = -1;
        c1330.f32702 = -1;
        c1330.f32726 = -1;
        c1330.f32705 = -1;
        c1330.f32749 = -1;
        c1330.f32713 = -1;
        c1330.f32736 = -1;
        c1330.f32701 = -1;
        c1330.f32748 = -1;
        c1330.f32699 = -1;
        c1330.f32719 = -1;
        c1330.f32751 = -1.0f;
        c1330.f32728 = -1.0f;
        c1330.f32715 = 0;
        c1330.f32757 = 0;
        c1330.f32712 = 0;
        c1330.f32711 = 0;
        c1330.f32708 = -1;
        c1330.f32707 = -1;
        c1330.f32732 = -1;
        c1330.f32731 = -1;
        c1330.f32730 = 1.0f;
        c1330.f32729 = 1.0f;
        c1330.f32741 = -1;
        c1330.f32745 = 0;
        c1330.f32760 = -1;
        c1330.f32752 = false;
        c1330.f32716 = false;
        c1330.f32727 = true;
        this.f70840 = c1330;
        C0980 c0980 = new C0980();
        c0980.f11494 = false;
        c0980.f11496 = 0.0f;
        c0980.f11495 = 0.0f;
        c0980.f11492 = 0.0f;
        c0980.f11498 = 1.0f;
        c0980.f11488 = 1.0f;
        c0980.f11497 = Float.NaN;
        c0980.f11490 = Float.NaN;
        c0980.f11489 = 0.0f;
        c0980.f11493 = 0.0f;
        c0980.f11487 = 0.0f;
        c0980.f11486 = false;
        c0980.f11491 = 0.0f;
        this.f70842 = c0980;
        this.f70841 = new HashMap();
    }

    public final Object clone() {
        C1890 c1890 = new C1890();
        c1890.f70840.m26933(this.f70840);
        c1890.f70845.m25459(this.f70845);
        C1645 c1645 = this.f70844;
        boolean z = c1645.f53036;
        C1645 c1646 = c1890.f70844;
        c1646.f53036 = z;
        c1646.f53038 = c1645.f53038;
        c1646.f53035 = c1645.f53035;
        c1646.f53037 = c1645.f53037;
        c1646.f53039 = c1645.f53039;
        c1890.f70842.m10680(this.f70842);
        c1890.f70843 = this.f70843;
        return c1890;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50419(C1890 c1890, AbstractC1216 abstractC1216, int i, C1785 c1785) {
        C1330 c1330 = c1890.f70840;
        c1890.m50416(i, c1785);
        if (abstractC1216 instanceof C1146) {
            c1330.f32760 = 1;
            C1146 c1146 = (C1146) abstractC1216;
            c1330.f32741 = c1146.m18976();
            c1330.f32724 = Arrays.copyOf(c1146.f26210, c1146.f26211);
            c1330.f32745 = c1146.m18977();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m50416(int i, C1785 c1785) {
        m50415(i, (C1680) c1785);
        this.f70844.f53035 = c1785.f63148;
        float f = c1785.f63146;
        C0980 c0980 = this.f70842;
        c0980.f11496 = f;
        c0980.f11495 = c1785.f63144;
        c0980.f11492 = c1785.f63147;
        c0980.f11498 = c1785.f63151;
        c0980.f11488 = c1785.f63153;
        c0980.f11497 = c1785.f63152;
        c0980.f11490 = c1785.f63150;
        c0980.f11489 = c1785.f63156;
        c0980.f11493 = c1785.f63145;
        c0980.f11487 = c1785.f63154;
        c0980.f11491 = c1785.f63149;
        c0980.f11486 = c1785.f63155;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m50415(int i, C1680 c1680) {
        this.f70843 = i;
        int i2 = c1680.f55126;
        C1330 c1330 = this.f70840;
        c1330.f32733 = i2;
        c1330.f32718 = c1680.f55101;
        c1330.f32710 = c1680.f55087;
        c1330.f32747 = c1680.f55105;
        c1330.f32737 = c1680.f55078;
        c1330.f32720 = c1680.f55119;
        c1330.f32744 = c1680.f55108;
        c1330.f32740 = c1680.f55094;
        c1330.f32703 = c1680.f55069;
        c1330.f32700 = c1680.f55123;
        c1330.f32714 = c1680.f55125;
        c1330.f32746 = c1680.f55114;
        c1330.f32709 = c1680.f55075;
        c1330.f32725 = c1680.f55077;
        c1330.f32755 = c1680.f55074;
        c1330.f32723 = c1680.f55090;
        c1330.f32734 = c1680.f55110;
        c1330.f32759 = c1680.f55102;
        c1330.f32742 = c1680.f55112;
        c1330.f32721 = c1680.f55106;
        c1330.f32738 = c1680.f55071;
        c1330.f32739 = c1680.f55121;
        c1330.f32750 = c1680.f55118;
        c1330.f32754 = c1680.f55122;
        c1330.f32756 = c1680.f55124;
        c1330.f32722 = ((ViewGroup.MarginLayoutParams) c1680).width;
        c1330.f32735 = ((ViewGroup.MarginLayoutParams) c1680).height;
        c1330.f32758 = ((ViewGroup.MarginLayoutParams) c1680).leftMargin;
        c1330.f32706 = ((ViewGroup.MarginLayoutParams) c1680).rightMargin;
        c1330.f32702 = ((ViewGroup.MarginLayoutParams) c1680).topMargin;
        c1330.f32726 = ((ViewGroup.MarginLayoutParams) c1680).bottomMargin;
        c1330.f32751 = c1680.f55093;
        c1330.f32728 = c1680.f55097;
        c1330.f32757 = c1680.f55100;
        c1330.f32715 = c1680.f55073;
        c1330.f32752 = c1680.f55083;
        c1330.f32716 = c1680.f55127;
        c1330.f32712 = c1680.f55070;
        c1330.f32711 = c1680.f55085;
        c1330.f32708 = c1680.f55109;
        c1330.f32707 = c1680.f55095;
        c1330.f32732 = c1680.f55111;
        c1330.f32731 = c1680.f55113;
        c1330.f32730 = c1680.f55128;
        c1330.f32729 = c1680.f55103;
        c1330.f32743 = c1680.f55120;
        c1330.f32736 = c1680.f55104;
        c1330.f32748 = c1680.f55116;
        c1330.f32713 = c1680.f55079;
        c1330.f32701 = c1680.f55067;
        c1330.f32719 = c1680.f55086;
        c1330.f32699 = c1680.f55065;
        c1330.f32705 = c1680.getMarginEnd();
        c1330.f32749 = c1680.getMarginStart();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50420(C1680 c1680) {
        C1330 c1330 = this.f70840;
        c1680.f55126 = c1330.f32733;
        c1680.f55101 = c1330.f32718;
        c1680.f55087 = c1330.f32710;
        c1680.f55105 = c1330.f32747;
        c1680.f55078 = c1330.f32737;
        c1680.f55119 = c1330.f32720;
        c1680.f55108 = c1330.f32744;
        c1680.f55094 = c1330.f32740;
        c1680.f55069 = c1330.f32703;
        c1680.f55123 = c1330.f32700;
        c1680.f55125 = c1330.f32714;
        c1680.f55114 = c1330.f32746;
        c1680.f55075 = c1330.f32709;
        ((ViewGroup.MarginLayoutParams) c1680).leftMargin = c1330.f32758;
        ((ViewGroup.MarginLayoutParams) c1680).rightMargin = c1330.f32706;
        ((ViewGroup.MarginLayoutParams) c1680).topMargin = c1330.f32702;
        ((ViewGroup.MarginLayoutParams) c1680).bottomMargin = c1330.f32726;
        c1680.f55086 = c1330.f32719;
        c1680.f55065 = c1330.f32699;
        c1680.f55104 = c1330.f32736;
        c1680.f55116 = c1330.f32748;
        c1680.f55077 = c1330.f32725;
        c1680.f55074 = c1330.f32755;
        c1680.f55110 = c1330.f32734;
        c1680.f55102 = c1330.f32759;
        c1680.f55112 = c1330.f32742;
        c1680.f55090 = c1330.f32723;
        c1680.f55106 = c1330.f32721;
        c1680.f55071 = c1330.f32738;
        c1680.f55093 = c1330.f32751;
        c1680.f55097 = c1330.f32728;
        c1680.f55100 = c1330.f32757;
        c1680.f55073 = c1330.f32715;
        c1680.f55083 = c1330.f32752;
        c1680.f55127 = c1330.f32716;
        c1680.f55070 = c1330.f32712;
        c1680.f55085 = c1330.f32711;
        c1680.f55109 = c1330.f32708;
        c1680.f55095 = c1330.f32707;
        c1680.f55111 = c1330.f32732;
        c1680.f55113 = c1330.f32731;
        c1680.f55128 = c1330.f32730;
        c1680.f55103 = c1330.f32729;
        c1680.f55121 = c1330.f32739;
        c1680.f55118 = c1330.f32750;
        c1680.f55122 = c1330.f32754;
        c1680.f55124 = c1330.f32756;
        ((ViewGroup.MarginLayoutParams) c1680).width = c1330.f32722;
        ((ViewGroup.MarginLayoutParams) c1680).height = c1330.f32735;
        String str = c1330.f32743;
        if (str != null) {
            c1680.f55120 = str;
        }
        c1680.setMarginStart(c1330.f32749);
        c1680.setMarginEnd(c1330.f32705);
        c1680.m42001();
    }
}
