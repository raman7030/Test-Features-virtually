package p067l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC7339 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۛ */
    public static final ArrayList f19215 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public final C7179 f19216;

    /* JADX INFO: renamed from: ۙ */
    public final C7179 f19217;

    /* JADX INFO: renamed from: ۤ */
    public final C0990 f19218;

    /* JADX INFO: renamed from: ۫ */
    public final View f19219;

    /* JADX INFO: renamed from: ۬ */
    public final C7179 f19220;

    /* JADX INFO: renamed from: ᩶ */
    public final DialogInterfaceC2564 f19221;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f19222;

    /* JADX INFO: renamed from: ᩹ */
    public final C0990 f19223;

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo4502();

    static {
        byte[] bArrMo20201 = ApplicationC21448.f67649.mo20201("mrir", (byte[]) null);
        if (bArrMo20201 != null) {
            C14677 c14677 = new C14677(bArrMo20201);
            int i = c14677.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                f19215.add(C2644.m4040(c14677));
            }
        }
    }

    public AbstractViewOnClickListenerC7339(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList, boolean z, boolean z2) {
        this.f19222 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC3610(1, abstractActivityC5549, arrayList));
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f19217 = c7179;
        C7179 c71710 = (C7179) viewM12252.findViewById(R.id.editText2);
        this.f19216 = c71710;
        C7179 c71711 = (C7179) viewM12252.findViewById(R.id.editText3);
        this.f19220 = c71711;
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.switch1);
        this.f19218 = c0990;
        this.f19223 = (C0990) viewM12252.findViewById(R.id.switch2);
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        this.f19219 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC11722(3, this));
        viewFindViewById.setEnabled(!f19215.isEmpty());
        c7179.m16508("{P}{S}");
        c7179.m16514().m27949();
        c71710.m16508("");
        c71711.m16508("");
        c0990.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻۠ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                AbstractViewOnClickListenerC7339 abstractViewOnClickListenerC7339 = this.f78406;
                abstractViewOnClickListenerC7339.f19216.m16516(z3);
                abstractViewOnClickListenerC7339.f19220.m16519(z3);
            }
        });
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("rename_multi_regex", false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = abstractActivityC5549.getString(R.string.MT_Protector);
        int iLastIndexOf = string.lastIndexOf("\n\n");
        int iIndexOf = string.indexOf("\n{N}");
        if (iLastIndexOf == -1 || iIndexOf == -1 || iLastIndexOf < iIndexOf) {
            throw new IllegalStateException(string);
        }
        spannableStringBuilder.append((CharSequence) string, 0, iIndexOf).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) abstractActivityC5549.getString(R.string.MT_Protector));
        RunnableC8680 runnableC8680 = new RunnableC8680(this, abstractActivityC5549);
        C13929 c13929Matcher = C13259.m30304("%.+?%").matcher((CharSequence) spannableStringBuilder);
        if (c13929Matcher.find(length)) {
            spannableStringBuilder.delete(c13929Matcher.end() - 1, c13929Matcher.end());
            spannableStringBuilder.delete(c13929Matcher.start(), c13929Matcher.start() + 1);
            spannableStringBuilder.setSpan(new C4657(runnableC8680), c13929Matcher.start(), c13929Matcher.end() - 2, 17);
            if (z2) {
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) abstractActivityC5549.getString(R.string.MT_Protector));
            }
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) string, iIndexOf + 1, iLastIndexOf);
            if (z) {
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) abstractActivityC5549.getString(R.string.MT_Protector));
            }
            C13929 c13929Matcher2 = C13259.m30303(8, "^\\{\\w+\\}").matcher((CharSequence) spannableStringBuilder);
            while (c13929Matcher2.find()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), c13929Matcher2.start(), c13929Matcher2.end(), 17);
            }
            spannableStringBuilder.append((CharSequence) string, iLastIndexOf, string.length());
            TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
            c20671BuildDialog.m46715(viewM12252);
            c20671BuildDialog.m46722(false);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46731("{  }", (DialogInterface.OnClickListener) null);
            DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671BuildDialog.m46709();
            this.f19221 = dialogInterfaceC2564M46709;
            C7204.m16545(dialogInterfaceC2564M46709);
            return;
        }
        throw new IllegalStateException(abstractActivityC5549.getString(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m16935() {
        C11996 c11996 = new C11996();
        ArrayList arrayList = f19215;
        c11996.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C2644) it.next()).m4045(c11996);
        }
        ApplicationC21448.f67649.edit().mo27877("mrir", c11996.m27464()).apply();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m16944() {
        C2644 c2644 = new C2644(0, m16940(), m16942(), m16943(), this.f19218.isChecked());
        ArrayList arrayList = f19215;
        arrayList.remove(c2644);
        arrayList.add(0, c2644);
        while (arrayList.size() > 100) {
            C19925.m45229(arrayList, 1);
        }
        m16935();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m16931(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C7480.stream(f19215).map(new C22092()).toArray(new C11363());
        C20671 c20671BuildDialog = this.f19222.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46724(charSequenceArr, new DialogInterfaceOnClickListenerC20828(1, this));
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3856().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ۡ۠ܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, final int i, long j) {
                final AbstractViewOnClickListenerC7339 abstractViewOnClickListenerC7339 = this.f29608;
                C20671 c20671BuildDialog2 = abstractViewOnClickListenerC7339.f19222.buildDialog();
                c20671BuildDialog2.m46727(R.string.MT_Protector);
                c20671BuildDialog2.m46718(charSequenceArr[i]);
                final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                final View view3 = view;
                c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ۠ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        AbstractViewOnClickListenerC7339.m16933(abstractViewOnClickListenerC7339, i, dialogInterfaceC2564, view3);
                    }
                });
                c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog2.m46732();
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16932(AbstractViewOnClickListenerC7339 abstractViewOnClickListenerC7339, int i) {
        C2644 c2644 = (C2644) f19215.get(i);
        abstractViewOnClickListenerC7339.f19217.m16508(c2644.f4421);
        abstractViewOnClickListenerC7339.f19216.m16508(c2644.f4424);
        abstractViewOnClickListenerC7339.f19220.m16508(c2644.f4423);
        abstractViewOnClickListenerC7339.f19218.setChecked(c2644.f4422);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16933(AbstractViewOnClickListenerC7339 abstractViewOnClickListenerC7339, int i, DialogInterfaceC2564 dialogInterfaceC2564, View view) {
        ArrayList arrayList = f19215;
        arrayList.remove(i);
        m16935();
        dialogInterfaceC2564.dismiss();
        if (arrayList.isEmpty()) {
            abstractViewOnClickListenerC7339.f19219.setEnabled(false);
        } else {
            abstractViewOnClickListenerC7339.m16931(view);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16936() {
        this.f19221.dismiss();
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m16940() {
        return this.f19217.m16518().toString();
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m16942() {
        return this.f19216.m16518().toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m16943() {
        return this.f19220.m16518().toString();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m16945() {
        return this.f19218.isChecked();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m16937() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f19221;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        dialogInterfaceC2564.m3861().setOnClickListener(this);
        C7050.m16226(this.f19217);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C0990 m16939() {
        C0990 c0990 = this.f19223;
        c0990.setVisibility(0);
        return c0990;
    }

    /* JADX INFO: renamed from: ܽ */
    public final DialogInterfaceC2564 m16941() {
        return this.f19221;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m16938() {
        C7179 c7179 = this.f19217;
        if (c7179.m16521() > 0 && !m16940().equals("{P}{S}")) {
            c7179.m16517();
        }
        C7179 c71710 = this.f19216;
        if (c71710.m16521() > 0) {
            c71710.m16517();
        }
        C7179 c71711 = this.f19220;
        if (c71711.m16521() > 0) {
            c71711.m16517();
        }
        ApplicationC21448.f67649.edit().putBoolean("rename_multi_regex", this.f19218.isChecked()).apply();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 16908313) {
            if (this.f19218.isChecked()) {
                try {
                    C13259.m30304(m16942());
                } catch (Exception e) {
                    this.f19222.m12259(e, (DialogInterface.OnDismissListener) null);
                    C7179 c7179 = this.f19216;
                    c7179.m16522();
                    c7179.requestFocus();
                    return;
                }
            }
            mo4502();
            return;
        }
        C7179 c71710 = this.f19217;
        int iM32508 = c71710.m16514().m32508();
        int iM32512 = c71710.m16514().m32512();
        c71710.requestFocus();
        c71710.m16518().replace(iM32508, iM32512, "{}");
        c71710.m16515(iM32508 + 1);
    }
}
