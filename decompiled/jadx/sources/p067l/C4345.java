package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4345 {

    /* JADX INFO: renamed from: ۢ */
    public static final C17441 f9713 = C17441.m39765(new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector});

    /* JADX INFO: renamed from: ֫ */
    public C15349 f9714;

    /* JADX INFO: renamed from: ۜ */
    public String f9715;

    /* JADX INFO: renamed from: ۧ */
    public C15349 f9716;

    /* JADX INFO: renamed from: ܳ */
    public String f9717;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f9718;

    /* JADX INFO: renamed from: ܿ */
    public String f9719;

    /* JADX INFO: renamed from: ᩳ */
    public int f9720;

    /* JADX INFO: renamed from: ᩷ */
    public int f9721;

    /* JADX INFO: renamed from: ᩻ */
    public String f9722;

    /* JADX INFO: renamed from: ۧ */
    public static C4345 m8965() {
        C4345 c4345 = new C4345();
        c4345.f9714 = new C15349();
        c4345.f9716 = new C15349();
        c4345.f9720 = 7;
        return c4345;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8968(int i, String str) {
        String strM16224 = C7050.m16224(i);
        this.f9722 = str;
        C15349 c15349 = this.f9714;
        c15349.f43813 = null;
        c15349.f43811 = strM16224;
        c15349.f43809 = strM16224;
        if (c15349.f43810 == null) {
            c15349.f43810 = strM16224;
        }
        c15349.f43812 = Boolean.TRUE;
        c15349.f43814 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8972(int i, String str) {
        String strM16224 = C7050.m16224(i);
        this.f9715 = str;
        C15349 c15349 = this.f9716;
        c15349.f43813 = null;
        c15349.f43811 = strM16224;
        c15349.f43809 = strM16224;
        if (c15349.f43810 == null) {
            c15349.f43810 = strM16224;
        }
        c15349.f43812 = Boolean.TRUE;
        c15349.f43814 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8969(String str) {
        this.f9714.f43808 = str;
        this.f9716.f43808 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m8975(String str) {
        this.f9714.f43810 = str;
        this.f9716.f43810 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8967(int i) {
        int iIndexOf = f9713.indexOf(i);
        this.f9721 = iIndexOf;
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8974(String str) {
        this.f9717 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8970(ArrayList arrayList) {
        this.f9718 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8966() {
        this.f9720 = 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8973(String str) {
        this.f9719 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8971(AbstractActivityC5549 abstractActivityC5549) {
        C15349 c15349 = this.f9716;
        C15349 c153410 = this.f9714;
        if (this.f9722 != null) {
            AbstractC17043 abstractC17043M38684 = C17853.f53277.m38684("diffText1");
            try {
                abstractC17043M38684.m38668(this.f9722);
            } catch (IOException e) {
                abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
            }
            c153410.f43813 = abstractC17043M38684;
        }
        if (this.f9715 != null) {
            AbstractC17043 abstractC17043M38685 = C17853.f53277.m38684("diffText2");
            try {
                abstractC17043M38685.m38668(this.f9715);
            } catch (IOException e2) {
                abstractActivityC5549.m12259(e2, (DialogInterface.OnDismissListener) null);
            }
            c15349.f43813 = abstractC17043M38685;
        }
        if (c153410.f43813 == null || c153410.f43811 == null || c153410.f43809 == null || c153410.f43810 == null || c153410.f43812 == null || c15349.f43813 == null || c15349.f43811 == null || c15349.f43809 == null || c15349.f43810 == null || c15349.f43812 == null) {
            throw new IllegalArgumentException();
        }
        Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC4030.class);
        intent.putExtra("arg1", c153410.m34934().toString());
        intent.putExtra("arg2", c15349.m34934().toString());
        intent.putExtra("moreInfoFlags", this.f9720);
        intent.putExtra("titleIndex", this.f9721);
        String str = this.f9719;
        if (str != null) {
            intent.putExtra("moreInfoReplacedPath", str);
        }
        String str2 = this.f9717;
        if (str2 != null) {
            intent.putExtra("subtitle", str2);
        }
        ArrayList<String> arrayList = this.f9718;
        if (arrayList != null) {
            intent.putStringArrayListExtra("customIgnoreRegexes", arrayList);
        }
        abstractActivityC5549.startActivity(intent);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m8964(int i) {
        C17441 c17441 = f9713;
        if (i < 0 || i >= c17441.size()) {
            i = 0;
        }
        return c17441.getInt(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8961(Main main, final C9315 c9315) {
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        m8962(c9315.f25331, c9315.f25329, editText, editText2);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(main);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13339(0, c9315, main));
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۜᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9315 c9316 = c9315;
                c9316.m21562();
                C4345.m8962(c9316.f25331, c9316.f25329, editText, editText2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8963(C9315 c9315, AbstractActivityC5549 abstractActivityC5549) {
        c9315.m21560();
        C4345 c4345M8965 = m8965();
        AbstractC17043 abstractC17043 = c9315.f25327;
        c4345M8965.f9722 = null;
        C15349 c15349 = c4345M8965.f9714;
        c15349.f43813 = abstractC17043;
        if (c15349.f43811 == null) {
            c15349.f43811 = abstractC17043.mo25505();
        }
        if (c15349.f43809 == null) {
            c15349.f43809 = abstractC17043.getName();
        }
        if (c15349.f43810 == null) {
            c15349.f43810 = abstractC17043.getName();
        }
        if (c15349.f43812 == null) {
            c15349.f43812 = Boolean.FALSE;
        }
        c15349.f43814 = false;
        AbstractC17043 abstractC17044 = c9315.f25328;
        c4345M8965.f9715 = null;
        C15349 c153410 = c4345M8965.f9716;
        c153410.f43813 = abstractC17044;
        if (c153410.f43811 == null) {
            c153410.f43811 = abstractC17044.mo25505();
        }
        if (c153410.f43809 == null) {
            c153410.f43809 = abstractC17044.getName();
        }
        if (c153410.f43810 == null) {
            c153410.f43810 = abstractC17044.getName();
        }
        if (c153410.f43812 == null) {
            c153410.f43812 = Boolean.FALSE;
        }
        c153410.f43814 = false;
        c4345M8965.m8971(abstractActivityC5549);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8962(String str, String str2, EditText editText, EditText editText2) {
        File file = new File(str);
        File file2 = new File(str2);
        String name = file.getName();
        String name2 = file2.getName();
        while (name.equals(name2)) {
            file = file.getParentFile();
            file2 = file2.getParentFile();
            if (file == null || file2 == null) {
                break;
            }
            name = file.getName() + "/" + name;
            name2 = file2.getName() + "/" + name2;
        }
        editText.setText(name);
        editText2.setText(name2);
    }
}
