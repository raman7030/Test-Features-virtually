package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10435 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5062 f31349;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f31350;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f31351;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f31352;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f31353;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f31354;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f31355;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5062 f31356;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f31357;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12366 f31358;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f31359;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC12551 f31360;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Spinner f31361;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC10435(ActivityC17169 activityC17169, C12366 c12366) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f31351 = interfaceC12344;
        this.f31359 = activityC17169;
        this.f31358 = c12366;
        View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        this.f31352 = viewM10216;
        C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f31349 = c5062;
        C5062 c5063 = (C5062) viewM10216.findViewById(R.id.editText2);
        this.f31356 = c5063;
        c5062.m14602(C2353.m7663(), (String) null);
        c5063.m14602(C2353.m7662(), (String) null);
        this.f31357 = viewM10216.findViewById(R.id.linearLayout);
        this.f31361 = (Spinner) viewM10216.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f31353 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        this.f31354 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f31355 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new C22585(this, 1));
        checkBox.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26276(ViewOnClickListenerC10435 viewOnClickListenerC10435, boolean z) {
        viewOnClickListenerC10435.f31349.m14609(z);
        viewOnClickListenerC10435.f31356.m14612(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26278(C0941 c0941) {
        this.f31360 = new C21597(this, c0941.m3355());
        int i = this.f31351.getInt("dex_search_type", 0) == 4 ? 1 : 0;
        Spinner spinner = this.f31361;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26277() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f31359);
        c19258.m44421(this.f31352);
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f31350 = dialogInterfaceC0206M19253;
        dialogInterfaceC0206M19253.m1447().setOnClickListener(this);
        this.f31349.m14608(0);
        C4925.m14329(this.f31356.m14607());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5062 c5062 = this.f31349;
        String string = c5062.m14611().toString();
        C5062 c5063 = this.f31356;
        String string2 = c5063.m14611().toString();
        if (string.isEmpty()) {
            this.f31350.dismiss();
            return;
        }
        boolean zIsChecked = this.f31353.isChecked();
        boolean zIsChecked2 = this.f31354.isChecked();
        boolean zIsChecked3 = this.f31355.isChecked();
        if (zIsChecked2) {
            try {
                try {
                    C13574.m32628(C11459.m28260(string), string2);
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
        c5062.m14610();
        c5063.m14610();
        this.f31351.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f31350.dismiss();
        this.f31360.mo13973(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f31355.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26275(ViewOnClickListenerC10435 viewOnClickListenerC10435, Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C22933 c22933 = new C22933(viewOnClickListenerC10435.f31359);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C13256 c13256 = new C13256(viewOnClickListenerC10435, c22933);
        final boolean z4 = viewOnClickListenerC10435.f31361.getSelectedItemPosition() == 1;
        final C12366 c12366 = viewOnClickListenerC10435.f31358;
        C11003.requireNonNull(set);
        final C3379 c3379 = new C3379(0, set);
        new Thread(new Runnable() { // from class: l.ۧܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C22108 c22108 = new C22108();
                String str3 = str;
                final boolean z5 = z2;
                final C15051 c15051M9357 = C3058.m9357(str3, z5, z);
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C12366 c12367 = c12366;
                c12367.m30033(concurrentLinkedQueue, "", true, (Predicate) c3379);
                final InterfaceC21403 interfaceC21403 = c13256;
                interfaceC21403.mo22515(0);
                final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                c19277.m44459(new C21847(interfaceC21403));
                final boolean z6 = z4;
                final String str4 = str2;
                final boolean z7 = z3;
                Runnable runnable = new Runnable() { // from class: l.ܳܽۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC13508 interfaceC13508;
                        ConcurrentLinkedQueue concurrentLinkedQueue2;
                        InterfaceC21403 interfaceC21404;
                        C19277 c19278;
                        C15051 c15051;
                        boolean z8;
                        boolean z9;
                        InterfaceC13508 interfaceC13509;
                        String strM9355;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        InterfaceC21403 interfaceC21405 = interfaceC21403;
                        C19277 c19279 = c19277;
                        C15051 c15052 = c15051M9357;
                        boolean z10 = z6;
                        String str5 = str4;
                        boolean z11 = z5;
                        boolean z12 = z7;
                        C22108 c22109 = c22108;
                        while (!concurrentLinkedQueue3.isEmpty() && (interfaceC13508 = (InterfaceC13508) concurrentLinkedQueue3.poll()) != null && !interfaceC21405.mo22513()) {
                            c19279.m44460(1);
                            String strMo31675 = interfaceC13508.mo31675();
                            C12164 c12164 = c15052.get();
                            if (z10) {
                                C12572 c12572 = new C12572(strMo31675);
                                C22706 c22706 = new C22706(strMo31675.length());
                                C22108 c221010 = new C22108();
                                int i = 0;
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                int i2 = 0;
                                while (c12572.m30816()) {
                                    InterfaceC21403 interfaceC21406 = interfaceC21405;
                                    int i3 = i;
                                    C22108 c221011 = c221010;
                                    C19277 c192710 = c19279;
                                    C22706 c22707 = c22706;
                                    C15051 c15053 = c15052;
                                    C12572 c12573 = c12572;
                                    boolean z13 = z10;
                                    String str6 = strMo31675;
                                    boolean z14 = z12;
                                    boolean z15 = z12;
                                    InterfaceC13508 interfaceC135010 = interfaceC13508;
                                    String strM9356 = C3058.m9355(c12572.f37888, str5, c12164, z11, z14, c221011);
                                    if (strM9356 != null) {
                                        c22707.append((CharSequence) str6, i2, c12573.f37890);
                                        try {
                                            C14020.m33624(c22707, strM9356);
                                        } catch (IOException unused) {
                                        }
                                        i2 = c12573.f37886;
                                        i = c221011.f71773 + i3;
                                        synchronized (c221011) {
                                            c221011.f71773 = 0;
                                            c221011.f71772 = 0;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    c221010 = c221011;
                                    c22706 = c22707;
                                    c12572 = c12573;
                                    strMo31675 = str6;
                                    interfaceC13508 = interfaceC135010;
                                    interfaceC21405 = interfaceC21406;
                                    c19279 = c192710;
                                    c15052 = c15053;
                                    z10 = z13;
                                    z12 = z15;
                                }
                                interfaceC21404 = interfaceC21405;
                                c19278 = c19279;
                                c15051 = c15052;
                                z8 = z10;
                                int i4 = i;
                                C22706 c22708 = c22706;
                                String str7 = strMo31675;
                                z9 = z12;
                                interfaceC13509 = interfaceC13508;
                                if (i4 == 0) {
                                    strM9355 = null;
                                } else {
                                    c22109.m49685(i4);
                                    if (i2 < str7.length()) {
                                        c22708.append((CharSequence) str7, i2, str7.length());
                                    }
                                    strM9355 = c22708.toString();
                                }
                            } else {
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                interfaceC21404 = interfaceC21405;
                                c19278 = c19279;
                                c15051 = c15052;
                                z8 = z10;
                                z9 = z12;
                                interfaceC13509 = interfaceC13508;
                                strM9355 = C3058.m9355(strMo31675, str5, c12164, z11, false, c22109);
                            }
                            if (strM9355 != null) {
                                interfaceC13509.mo31670(strM9355);
                            }
                            concurrentLinkedQueue3 = concurrentLinkedQueue2;
                            interfaceC21405 = interfaceC21404;
                            c19279 = c19278;
                            c15052 = c15051;
                            z10 = z8;
                            z12 = z9;
                        }
                    }
                };
                c12367.m30024();
                c12367.m30042(false);
                C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                c12367.m30042(true);
                c12367.m30061();
                C4925.m14315(new RunnableC18352(2, interfaceC21403, c22108));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26279(final C15063 c15063) {
        this.f31360 = new InterfaceC12551() { // from class: l.ۙܿۢ
            @Override // l.InterfaceC12551
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo13973(String str, String str2, boolean z, boolean z2, boolean z3) {
                C22108 c22108 = new C22108();
                C12164 c12164Matcher = C3058.m9359(str, z2, z).matcher((CharSequence) "");
                C15063 c15064 = c15063;
                for (C15769 c15769 : c15064.m35629()) {
                    String strM9355 = C3058.m9355(c15769.m37186(), str2, c12164Matcher, z2, z3, c22108);
                    if (strM9355 != null) {
                        c15769.m37185(strM9355);
                    }
                }
                c15064.m35631();
                c15064.m35630();
                c15064.m35628().notifyDataSetChanged();
                C21374.m48459((CharSequence) c15064.getString(R.string.MT_Protector, Integer.valueOf(c22108.f71773)));
            }
        };
        this.f31357.setVisibility(8);
    }
}
