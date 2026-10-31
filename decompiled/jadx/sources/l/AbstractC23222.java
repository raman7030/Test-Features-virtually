package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f74630;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CheckBox f74631;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5062 f74632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5062 f74633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CheckBox f74634;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CheckBox f74635;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo12117();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12118(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12119(String str);

    public AbstractC23222(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f74633 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f74632 = (C5062) viewM10216.findViewById(R.id.editText2);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f74635 = checkBox;
        int i = 0;
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("filter_match_case", false));
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        this.f74634 = checkBox2;
        checkBox2.setOnCheckedChangeListener(new C10523(i, this));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("filter_regex", false));
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f74631 = checkBox3;
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("filter_exactly_match", false));
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
        this.f74630 = dialogInterfaceC0206M44438;
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new ViewOnClickListenerC6289(i, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51530(AbstractC23222 abstractC23222, boolean z) {
        abstractC23222.f74633.m14609(z);
        abstractC23222.f74632.m14612(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51529(AbstractC23222 abstractC23222) {
        C11459 c11459M28259;
        String string;
        String strExpandReplacement;
        C5062 c5062 = abstractC23222.f74633;
        String string2 = c5062.m14611().toString();
        C5062 c5063 = abstractC23222.f74632;
        String string3 = c5063.m14611().toString();
        boolean zIsChecked = abstractC23222.f74635.isChecked();
        boolean zIsChecked2 = abstractC23222.f74634.isChecked();
        boolean zIsChecked3 = abstractC23222.f74631.isChecked();
        if (string2.length() == 0) {
            return;
        }
        if (zIsChecked2) {
            try {
                try {
                    C13574.m32628(C11459.m28260(string2), string3);
                } catch (Exception e) {
                    C21374.m48459((CharSequence) e.getMessage());
                    c5063.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C21374.m48459((CharSequence) e2.getMessage());
                c5062.requestFocus();
                return;
            }
        }
        abstractC23222.f74630.dismiss();
        c5062.m14610();
        c5063.m14610();
        ApplicationC20075.f65008.edit().putBoolean("filter_match_case", zIsChecked).putBoolean("filter_regex", zIsChecked2).putBoolean("filter_exactly_match", zIsChecked3).apply();
        if (!zIsChecked2) {
            string2 = C3939.m11985(string2);
        }
        if (zIsChecked) {
            c11459M28259 = C11459.m28260(string2);
        } else {
            c11459M28259 = C11459.m28259(66, string2);
        }
        C11934 c11934 = new C11934();
        C12164 c12164Matcher = c11459M28259.matcher((CharSequence) "");
        while (true) {
            String strMo12117 = abstractC23222.mo12117();
            if (strMo12117 == null) {
                abstractC23222.mo12118(c11934.m29118());
                return;
            }
            ArrayList<C10048> arrayList = new ArrayList();
            c12164Matcher.m29615reset((CharSequence) strMo12117);
            if (zIsChecked3) {
                if (c12164Matcher.matches()) {
                    arrayList.add(c12164Matcher.toSnapshot());
                }
            } else {
                while (c12164Matcher.find()) {
                    arrayList.add(c12164Matcher.toSnapshot());
                }
            }
            if (arrayList.isEmpty()) {
                string = null;
            } else {
                c11934.m29119(arrayList.size());
                StringBuilder sb = new StringBuilder(strMo12117.length());
                int i = 0;
                for (C10048 c10048 : arrayList) {
                    int iStart = c10048.start();
                    int iEnd = c10048.end();
                    if (zIsChecked2) {
                        try {
                            strExpandReplacement = c10048.expandReplacement(string3);
                        } catch (Exception unused) {
                            strExpandReplacement = string3;
                        }
                        if (iStart > i) {
                            sb.append((CharSequence) strMo12117, i, iStart);
                        }
                        sb.append(strExpandReplacement);
                    } else {
                        if (iStart > i) {
                            sb.append((CharSequence) strMo12117, i, iStart);
                        }
                        sb.append(string3);
                    }
                    i = iEnd;
                }
                if (i < strMo12117.length()) {
                    sb.append((CharSequence) strMo12117, i, strMo12117.length());
                }
                string = sb.toString();
            }
            if (string != null) {
                abstractC23222.mo12119(string);
            }
        }
    }
}
