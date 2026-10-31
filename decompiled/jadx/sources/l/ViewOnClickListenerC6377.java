package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۛ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6377 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5062 f19728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f19729;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f19730;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f19731;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f19732;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f19733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f19734;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5062 f19735;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f19736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC10611 f19737;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f19738;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19452 f19739;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Spinner f19740;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC6377(ActivityC17169 activityC17169, C19452 c19452) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f19730 = interfaceC12344;
        this.f19738 = activityC17169;
        this.f19739 = c19452;
        View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        this.f19731 = viewM10216;
        C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f19728 = c5062;
        C5062 c5063 = (C5062) viewM10216.findViewById(R.id.editText2);
        this.f19735 = c5063;
        c5062.m14602(C2353.m7663(), (String) null);
        c5063.m14602(C2353.m7662(), (String) null);
        this.f19736 = viewM10216.findViewById(R.id.linearLayout);
        this.f19740 = (Spinner) viewM10216.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f19732 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        this.f19733 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f19734 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ᩺᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC6377.m17694(this.f11290, z);
            }
        });
        checkBox.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17694(ViewOnClickListenerC6377 viewOnClickListenerC6377, boolean z) {
        viewOnClickListenerC6377.f19728.m14609(z);
        viewOnClickListenerC6377.f19735.m14612(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17696(C0941 c0941) {
        this.f19737 = new C6123(this, c0941.m3355());
        int i = this.f19730.getInt("arsc_search_type", 0) == 2 ? 1 : 0;
        Spinner spinner = this.f19740;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17695() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f19738);
        c19258.m44421(this.f19731);
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f19729 = dialogInterfaceC0206M19253;
        dialogInterfaceC0206M19253.m1447().setOnClickListener(this);
        this.f19728.m14608(0);
        C4925.m14329(this.f19735.m14607());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5062 c5062 = this.f19728;
        String string = c5062.m14611().toString();
        C5062 c5063 = this.f19735;
        String string2 = c5063.m14611().toString();
        if (string.isEmpty()) {
            this.f19729.dismiss();
            return;
        }
        boolean zIsChecked = this.f19732.isChecked();
        boolean zIsChecked2 = this.f19733.isChecked();
        boolean zIsChecked3 = this.f19734.isChecked();
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
        this.f19730.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f19729.dismiss();
        this.f19737.mo17037(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f19734.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17693(ViewOnClickListenerC6377 viewOnClickListenerC6377, final Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C22933 c22933 = new C22933(viewOnClickListenerC6377.f19738);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C12727 c12727 = new C12727(viewOnClickListenerC6377, c22933);
        final boolean z4 = viewOnClickListenerC6377.f19740.getSelectedItemPosition() == 1;
        final C19452 c19452 = viewOnClickListenerC6377.f19739;
        new Thread(new Runnable() { // from class: l.᩺ۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19452 c19453 = c19452;
                final boolean z5 = z4;
                final C9200 c9200 = new C9200(c19453, z5);
                final InterfaceC21403 interfaceC21403 = c12727;
                try {
                    c9200.f27877 = z5 ? c19453.m44833() : Collections.EMPTY_MAP;
                    final C22108 c22108 = new C22108();
                    String str3 = str;
                    final boolean z6 = z2;
                    final C15051 c15051M9357 = C3058.m9357(str3, z6, z);
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c19453.m44822(concurrentLinkedQueue, "", true, set);
                    interfaceC21403.mo22515(0);
                    final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                    c19277.m44459(new C21847(interfaceC21403));
                    final String str4 = str2;
                    final boolean z7 = z3;
                    Runnable runnable = new Runnable() { // from class: l.ᩳ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC1438 interfaceC1438;
                            ConcurrentLinkedQueue concurrentLinkedQueue2;
                            InterfaceC21403 interfaceC21404;
                            C19277 c19278;
                            C15051 c15051;
                            boolean z8;
                            C9200 c9201;
                            InterfaceC1438 interfaceC1439;
                            boolean z9;
                            C22108 c22109;
                            String strM9355;
                            C22108 c221010;
                            C15051 c15052;
                            StringBuilder sb;
                            boolean z10;
                            String str5;
                            C9200 c9202;
                            InterfaceC1438 interfaceC14310;
                            boolean z11;
                            C22108 c221011;
                            ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                            InterfaceC21403 interfaceC21405 = interfaceC21403;
                            C19277 c19279 = c19277;
                            C15051 c15053 = c15051M9357;
                            boolean z12 = z5;
                            C9200 c9203 = c9200;
                            String str6 = str4;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            C22108 c221012 = c22108;
                            while (!concurrentLinkedQueue3.isEmpty() && (interfaceC1438 = (InterfaceC1438) concurrentLinkedQueue3.poll()) != null && !interfaceC21405.mo22513()) {
                                c19279.m44460(1);
                                String strMo4946 = interfaceC1438.mo4946();
                                C12164 c12164 = c15053.get();
                                if (z12) {
                                    List<C24032> listM23633 = c9203.m23633(interfaceC1438.getPath());
                                    strM9355 = null;
                                    if (listM23633 == null) {
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        interfaceC21404 = interfaceC21405;
                                        c19278 = c19279;
                                        c15051 = c15053;
                                        z8 = z12;
                                        c9201 = c9203;
                                        interfaceC1439 = interfaceC1438;
                                        z9 = z14;
                                        c22109 = c221012;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(strMo4946.length());
                                        C22108 c221013 = new C22108();
                                        int i = 0;
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        int i2 = 0;
                                        for (C24032 c24032 : listM23633) {
                                            InterfaceC21403 interfaceC21406 = interfaceC21405;
                                            C19277 c192710 = c19279;
                                            if (c24032.f77861 != 1) {
                                                c15052 = c15053;
                                                z10 = z12;
                                                c9202 = c9203;
                                                c221010 = c221013;
                                                sb = sb2;
                                                str5 = strMo4946;
                                                interfaceC14310 = interfaceC1438;
                                                z11 = z14;
                                                c221011 = c221012;
                                            } else {
                                                int i3 = i;
                                                c221010 = c221013;
                                                c15052 = c15053;
                                                sb = sb2;
                                                z10 = z12;
                                                str5 = strMo4946;
                                                c9202 = c9203;
                                                interfaceC14310 = interfaceC1438;
                                                boolean z15 = z14;
                                                z11 = z14;
                                                c221011 = c221012;
                                                String strM9356 = C3058.m9355(c24032.f77864, str6, c12164, z13, z15, c221010);
                                                if (strM9356 != null) {
                                                    sb.append((CharSequence) str5, i2, c24032.f77862);
                                                    sb.append(C10753.m26948(strM9356));
                                                    i2 = c24032.f77859;
                                                    i = i3 + c221010.f71773;
                                                    synchronized (c221010) {
                                                        c221010.f71773 = 0;
                                                        c221010.f71772 = 0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                            }
                                            c221013 = c221010;
                                            sb2 = sb;
                                            strMo4946 = str5;
                                            interfaceC1438 = interfaceC14310;
                                            c221012 = c221011;
                                            interfaceC21405 = interfaceC21406;
                                            c19279 = c192710;
                                            c15053 = c15052;
                                            z12 = z10;
                                            c9203 = c9202;
                                            z14 = z11;
                                        }
                                        interfaceC21404 = interfaceC21405;
                                        c19278 = c19279;
                                        c15051 = c15053;
                                        z8 = z12;
                                        c9201 = c9203;
                                        int i4 = i;
                                        StringBuilder sb3 = sb2;
                                        String str7 = strMo4946;
                                        interfaceC1439 = interfaceC1438;
                                        z9 = z14;
                                        c22109 = c221012;
                                        if (i4 != 0) {
                                            c22109.m49685(i4);
                                            if (i2 < str7.length()) {
                                                sb3.append((CharSequence) str7, i2, str7.length());
                                            }
                                            strM9355 = sb3.toString();
                                        }
                                    }
                                } else {
                                    concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                    interfaceC21404 = interfaceC21405;
                                    c19278 = c19279;
                                    c15051 = c15053;
                                    z8 = z12;
                                    c9201 = c9203;
                                    interfaceC1439 = interfaceC1438;
                                    z9 = z14;
                                    c22109 = c221012;
                                    strM9355 = C3058.m9355(strMo4946, str6, c12164, z13, false, c221012);
                                }
                                String str8 = strM9355;
                                if (str8 != null) {
                                    interfaceC1439.mo4947(str8);
                                }
                                c221012 = c22109;
                                concurrentLinkedQueue3 = concurrentLinkedQueue2;
                                interfaceC21405 = interfaceC21404;
                                c19279 = c19278;
                                c15053 = c15051;
                                z12 = z8;
                                c9203 = c9201;
                                z14 = z9;
                            }
                        }
                    };
                    c19453.m44830(false);
                    C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                    c19453.m44830(true);
                    C4925.m14315(new RunnableC20553(4, interfaceC21403, c22108));
                } catch (Exception e) {
                    C4925.m14315(new Runnable() { // from class: l.ܽ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC21403 interfaceC21404 = interfaceC21403;
                            c9200.m23634(interfaceC21404.mo22516(), exc);
                            interfaceC21404.mo22514();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17697(final C19328 c19328) {
        this.f19737 = new InterfaceC10611() { // from class: l.۬᩺᩷
            @Override // l.InterfaceC10611
            /* JADX INFO: renamed from: ֫ */
            public final void mo17037(String str, String str2, boolean z, boolean z2, boolean z3) {
                C22108 c22108 = new C22108();
                C12164 c12164Matcher = C3058.m9359(str, z2, z).matcher((CharSequence) "");
                C19328 c19329 = c19328;
                for (C23560 c23560 : c19329.m44546()) {
                    String strM9355 = C3058.m9355(c23560.m52025(), str2, c12164Matcher, z2, z3, c22108);
                    if (strM9355 != null) {
                        c23560.m52024(strM9355);
                    }
                }
                c19329.m44548();
                c19329.m44547();
                c19329.m44545().notifyDataSetChanged();
                C21374.m48459((CharSequence) c19329.getString(R.string.MT_Protector, Integer.valueOf(c22108.f71773)));
            }
        };
        this.f19736.setVisibility(8);
    }
}
