package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24439 {

    /* JADX INFO: renamed from: ֫ */
    public DialogInterfaceC2564 f77373;

    /* JADX INFO: renamed from: ۧ */
    public CheckBox f77374;

    /* JADX INFO: renamed from: ܳ */
    public C7179 f77375;

    /* JADX INFO: renamed from: ܽ */
    public C7179 f77376;

    /* JADX INFO: renamed from: ܿ */
    public CheckBox f77377;

    /* JADX INFO: renamed from: ᩳ */
    public CheckBox f77378;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo14037();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14038(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14039(String str);

    public AbstractC24439(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f77376 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f77375 = (C7179) viewM12252.findViewById(R.id.editText2);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f77378 = checkBox;
        int i = 0;
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("filter_match_case", false));
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f77377 = checkBox2;
        checkBox2.setOnCheckedChangeListener(new C12370(i, this));
        checkBox2.setChecked(ApplicationC21448.f67649.getBoolean("filter_regex", false));
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f77374 = checkBox3;
        checkBox3.setChecked(ApplicationC21448.f67649.getBoolean("filter_exactly_match", false));
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        this.f77373 = dialogInterfaceC2564M46732;
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC8346(i, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53927(AbstractC24439 abstractC24439, boolean z) {
        abstractC24439.f77376.m16516(z);
        abstractC24439.f77375.m16519(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53926(AbstractC24439 abstractC24439) {
        C13259 c13259M30303;
        String string;
        String strExpandReplacement;
        C7179 c7179 = abstractC24439.f77376;
        String string2 = c7179.m16518().toString();
        C7179 c71710 = abstractC24439.f77375;
        String string3 = c71710.m16518().toString();
        boolean zIsChecked = abstractC24439.f77378.isChecked();
        boolean zIsChecked2 = abstractC24439.f77377.isChecked();
        boolean zIsChecked3 = abstractC24439.f77374.isChecked();
        if (string2.length() == 0) {
            return;
        }
        if (zIsChecked2) {
            try {
                try {
                    C15269.m34740(C13259.m30304(string2), string3);
                } catch (Exception e) {
                    C22682.m50795((CharSequence) e.getMessage());
                    c71710.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C22682.m50795((CharSequence) e2.getMessage());
                c7179.requestFocus();
                return;
            }
        }
        abstractC24439.f77373.dismiss();
        c7179.m16517();
        c71710.m16517();
        ApplicationC21448.f67649.edit().putBoolean("filter_match_case", zIsChecked).putBoolean("filter_regex", zIsChecked2).putBoolean("filter_exactly_match", zIsChecked3).apply();
        if (!zIsChecked2) {
            string2 = C6112.m13905(string2);
        }
        if (zIsChecked) {
            c13259M30303 = C13259.m30304(string2);
        } else {
            c13259M30303 = C13259.m30303(66, string2);
        }
        C13711 c13711 = new C13711();
        C13929 c13929Matcher = c13259M30303.matcher((CharSequence) "");
        while (true) {
            String strMo14037 = abstractC24439.mo14037();
            if (strMo14037 == null) {
                abstractC24439.mo14038(c13711.m31171());
                return;
            }
            ArrayList<C11918> arrayList = new ArrayList();
            c13929Matcher.m56473reset((CharSequence) strMo14037);
            if (zIsChecked3) {
                if (c13929Matcher.matches()) {
                    arrayList.add(c13929Matcher.toSnapshot());
                }
            } else {
                while (c13929Matcher.find()) {
                    arrayList.add(c13929Matcher.toSnapshot());
                }
            }
            if (arrayList.isEmpty()) {
                string = null;
            } else {
                c13711.m31172(arrayList.size());
                StringBuilder sb = new StringBuilder(strMo14037.length());
                int i = 0;
                for (C11918 c11918 : arrayList) {
                    int iStart = c11918.start();
                    int iEnd = c11918.end();
                    if (zIsChecked2) {
                        try {
                            strExpandReplacement = c11918.expandReplacement(string3);
                        } catch (Exception unused) {
                            strExpandReplacement = string3;
                        }
                        if (iStart > i) {
                            sb.append((CharSequence) strMo14037, i, iStart);
                        }
                        sb.append(strExpandReplacement);
                    } else {
                        if (iStart > i) {
                            sb.append((CharSequence) strMo14037, i, iStart);
                        }
                        sb.append(string3);
                    }
                    i = iEnd;
                }
                if (i < strMo14037.length()) {
                    sb.append((CharSequence) strMo14037, i, strMo14037.length());
                }
                string = sb.toString();
            }
            if (string != null) {
                abstractC24439.mo14039(string);
            }
        }
    }
}
