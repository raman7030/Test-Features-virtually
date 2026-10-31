package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC5230 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f16375 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5062 f16376;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5062 f16377;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2978 f16378;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f16379;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5062 f16380;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f16381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f16382;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2978 f16383;

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo2119();

    static {
        byte[] bArrMo18253 = ApplicationC20075.f65008.mo18253("mrir", (byte[]) null);
        if (bArrMo18253 != null) {
            C12951 c12951 = new C12951(bArrMo18253);
            int i = c12951.readByte() & 255;
            for (int i2 = 0; i2 < i; i2++) {
                f16375.add(C0290.m1640(c12951));
            }
        }
    }

    public AbstractViewOnClickListenerC5230(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList, boolean z, boolean z2) {
        this.f16382 = abstractActivityC3346;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC1306(1, abstractActivityC3346, arrayList));
        C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f16377 = c5062;
        C5062 c5063 = (C5062) viewM10216.findViewById(R.id.editText2);
        this.f16376 = c5063;
        C5062 c5064 = (C5062) viewM10216.findViewById(R.id.editText3);
        this.f16380 = c5064;
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.switch1);
        this.f16378 = c2978;
        this.f16383 = (C2978) viewM10216.findViewById(R.id.switch2);
        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        this.f16379 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC9841(3, this));
        viewFindViewById.setEnabled(!f16375.isEmpty());
        c5062.m14601("{P}{S}");
        c5062.m14607().m25927();
        c5063.m14601("");
        c5064.m14601("");
        c2978.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻۠ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230 = this.f75660;
                abstractViewOnClickListenerC5230.f16376.m14609(z3);
                abstractViewOnClickListenerC5230.f16380.m14612(z3);
            }
        });
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("rename_multi_regex", false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = abstractActivityC3346.getString(R.string.MT_Protector);
        int iLastIndexOf = string.lastIndexOf("\n\n");
        int iIndexOf = string.indexOf("\n{N}");
        if (iLastIndexOf == -1 || iIndexOf == -1 || iLastIndexOf < iIndexOf) {
            throw new IllegalStateException(string);
        }
        spannableStringBuilder.append((CharSequence) string, 0, iIndexOf).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) abstractActivityC3346.getString(R.string.MT_Protector));
        RunnableC6641 runnableC6641 = new RunnableC6641(this, abstractActivityC3346);
        C12164 c12164Matcher = C11459.m28260("%.+?%").matcher((CharSequence) spannableStringBuilder);
        if (c12164Matcher.find(length)) {
            spannableStringBuilder.delete(c12164Matcher.end() - 1, c12164Matcher.end());
            spannableStringBuilder.delete(c12164Matcher.start(), c12164Matcher.start() + 1);
            spannableStringBuilder.setSpan(new C2408(runnableC6641), c12164Matcher.start(), c12164Matcher.end() - 2, 17);
            if (z2) {
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) abstractActivityC3346.getString(R.string.MT_Protector));
            }
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) string, iIndexOf + 1, iLastIndexOf);
            if (z) {
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) abstractActivityC3346.getString(R.string.MT_Protector));
            }
            C12164 c12164Matcher2 = C11459.m28259(8, "^\\{\\w+\\}").matcher((CharSequence) spannableStringBuilder);
            while (c12164Matcher2.find()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), c12164Matcher2.start(), c12164Matcher2.end(), 17);
            }
            spannableStringBuilder.append((CharSequence) string, iLastIndexOf, string.length());
            TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
            c19258BuildDialog.m44421(viewM10216);
            c19258BuildDialog.m44428(false);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44437("{  }", (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258BuildDialog.m44415();
            this.f16381 = dialogInterfaceC0206M44415;
            C5088.m14637(dialogInterfaceC0206M44415);
            return;
        }
        throw new IllegalStateException(abstractActivityC3346.getString(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m15025() {
        C10130 c10130 = new C10130();
        ArrayList arrayList = f16375;
        c10130.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0290) it.next()).m1645(c10130);
        }
        ApplicationC20075.f65008.edit().mo25855("mrir", c10130.m25444()).apply();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15034() {
        C0290 c0290 = new C0290(0, m15030(), m15032(), m15033(), this.f16378.isChecked());
        ArrayList arrayList = f16375;
        arrayList.remove(c0290);
        arrayList.add(0, c0290);
        while (arrayList.size() > 100) {
            C18473.m42953(arrayList, 1);
        }
        m15025();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m15021(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C5378.stream(f16375).map(new C20753()).toArray(new C9464());
        C19258 c19258BuildDialog = this.f16382.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44430(charSequenceArr, new DialogInterfaceOnClickListenerC19423(1, this));
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1443().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ۡ۠ܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, final int i, long j) {
                final AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230 = this.f26682;
                C19258 c19258BuildDialog2 = abstractViewOnClickListenerC5230.f16382.buildDialog();
                c19258BuildDialog2.m44433(R.string.MT_Protector);
                c19258BuildDialog2.m44424(charSequenceArr[i]);
                final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                final View view3 = view;
                c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ۠ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        AbstractViewOnClickListenerC5230.m15023(abstractViewOnClickListenerC5230, i, dialogInterfaceC0206, view3);
                    }
                });
                c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog2.m44438();
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15022(AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230, int i) {
        C0290 c0290 = (C0290) f16375.get(i);
        abstractViewOnClickListenerC5230.f16377.m14601(c0290.f1644);
        abstractViewOnClickListenerC5230.f16376.m14601(c0290.f1647);
        abstractViewOnClickListenerC5230.f16380.m14601(c0290.f1646);
        abstractViewOnClickListenerC5230.f16378.setChecked(c0290.f1645);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15023(AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230, int i, DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        ArrayList arrayList = f16375;
        arrayList.remove(i);
        m15025();
        dialogInterfaceC0206.dismiss();
        if (arrayList.isEmpty()) {
            abstractViewOnClickListenerC5230.f16379.setEnabled(false);
        } else {
            abstractViewOnClickListenerC5230.m15021(view);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15026() {
        this.f16381.dismiss();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m15030() {
        return this.f16377.m14611().toString();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m15032() {
        return this.f16376.m14611().toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m15033() {
        return this.f16380.m14611().toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m15035() {
        return this.f16378.isChecked();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m15027() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f16381;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        dialogInterfaceC0206.m1448().setOnClickListener(this);
        C4925.m14329(this.f16377);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2978 m15029() {
        C2978 c2978 = this.f16383;
        c2978.setVisibility(0);
        return c2978;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m15031() {
        return this.f16381;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m15028() {
        C5062 c5062 = this.f16377;
        if (c5062.m14614() > 0 && !m15030().equals("{P}{S}")) {
            c5062.m14610();
        }
        C5062 c5063 = this.f16376;
        if (c5063.m14614() > 0) {
            c5063.m14610();
        }
        C5062 c5064 = this.f16380;
        if (c5064.m14614() > 0) {
            c5064.m14610();
        }
        ApplicationC20075.f65008.edit().putBoolean("rename_multi_regex", this.f16378.isChecked()).apply();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 16908313) {
            if (this.f16378.isChecked()) {
                try {
                    C11459.m28260(m15032());
                } catch (Exception e) {
                    this.f16382.m10223(e, (DialogInterface.OnDismissListener) null);
                    C5062 c5062 = this.f16376;
                    c5062.m14615();
                    c5062.requestFocus();
                    return;
                }
            }
            mo2119();
            return;
        }
        C5062 c5063 = this.f16377;
        int iM30444 = c5063.m14607().m30444();
        int iM30448 = c5063.m14607().m30448();
        c5063.requestFocus();
        c5063.m14611().replace(iM30444, iM30448, "{}");
        c5063.m14608(iM30444 + 1);
    }
}
