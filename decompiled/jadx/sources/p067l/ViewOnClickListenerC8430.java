package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۛ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC8430 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final C7179 f22601;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f22602;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC14100 f22603;

    /* JADX INFO: renamed from: ۟ */
    public final View f22604;

    /* JADX INFO: renamed from: ۤ */
    public final CheckBox f22605;

    /* JADX INFO: renamed from: ۨ */
    public final CheckBox f22606;

    /* JADX INFO: renamed from: ۫ */
    public final CheckBox f22607;

    /* JADX INFO: renamed from: ۬ */
    public final C7179 f22608;

    /* JADX INFO: renamed from: ܰ */
    public final View f22609;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC12454 f22610;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC18686 f22611;

    /* JADX INFO: renamed from: ᩹ */
    public final C20856 f22612;

    /* JADX INFO: renamed from: ᩺ */
    public final Spinner f22613;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC8430(ActivityC18686 activityC18686, C20856 c20856) {
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        this.f22603 = interfaceC14100;
        this.f22611 = activityC18686;
        this.f22612 = c20856;
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        this.f22604 = viewM12252;
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f22601 = c7179;
        C7179 c71710 = (C7179) viewM12252.findViewById(R.id.editText2);
        this.f22608 = c71710;
        c7179.m16509(C4605.m9734(), (String) null);
        c71710.m16509(C4605.m9733(), (String) null);
        this.f22609 = viewM12252.findViewById(R.id.linearLayout);
        this.f22613 = (Spinner) viewM12252.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f22605 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f22606 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f22607 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ᩺᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC8430.m19641(this.f14096, z);
            }
        });
        checkBox.setChecked(interfaceC14100.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC14100.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC14100.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19641(ViewOnClickListenerC8430 viewOnClickListenerC8430, boolean z) {
        viewOnClickListenerC8430.f22601.m16516(z);
        viewOnClickListenerC8430.f22608.m16519(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19643(C3263 c3263) {
        this.f22610 = new C8188(this, c3263.m5674());
        int i = this.f22603.getInt("arsc_search_type", 0) == 2 ? 1 : 0;
        Spinner spinner = this.f22613;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19642() {
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(this.f22611);
        c20671.m46715(this.f22604);
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f22602 = dialogInterfaceC2564M21200;
        dialogInterfaceC2564M21200.m3860().setOnClickListener(this);
        this.f22601.m16515(0);
        C7050.m16226(this.f22608.m16514());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7179 c7179 = this.f22601;
        String string = c7179.m16518().toString();
        C7179 c71710 = this.f22608;
        String string2 = c71710.m16518().toString();
        if (string.isEmpty()) {
            this.f22602.dismiss();
            return;
        }
        boolean zIsChecked = this.f22605.isChecked();
        boolean zIsChecked2 = this.f22606.isChecked();
        boolean zIsChecked3 = this.f22607.isChecked();
        if (zIsChecked2) {
            try {
                try {
                    C15269.m34740(C13259.m30304(string), string2);
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
        c7179.m16517();
        c71710.m16517();
        this.f22603.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f22602.dismiss();
        this.f22610.mo18968(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f22607.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19640(ViewOnClickListenerC8430 viewOnClickListenerC8430, final Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C24164 c24164 = new C24164(viewOnClickListenerC8430.f22611);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        final C14465 c14465 = new C14465(viewOnClickListenerC8430, c24164);
        final boolean z4 = viewOnClickListenerC8430.f22613.getSelectedItemPosition() == 1;
        final C20856 c20856 = viewOnClickListenerC8430.f22612;
        new Thread(new Runnable() { // from class: l.᩺ۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C20856 c20857 = c20856;
                final boolean z5 = z4;
                final C11113 c11113 = new C11113(c20857, z5);
                final InterfaceC22710 interfaceC22710 = c14465;
                try {
                    c11113.f30823 = z5 ? c20857.m47129() : Collections.EMPTY_MAP;
                    final C23380 c23380 = new C23380();
                    String str3 = str;
                    final boolean z6 = z2;
                    final C16673 c16673M11399 = C5275.m11399(str3, z6, z);
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c20857.m47118(concurrentLinkedQueue, "", true, set);
                    interfaceC22710.mo24484(0);
                    final C20689 c20689 = new C20689(concurrentLinkedQueue.size());
                    c20689.m46753(new C23132(interfaceC22710));
                    final String str4 = str2;
                    final boolean z7 = z3;
                    Runnable runnable = new Runnable() { // from class: l.ᩳ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC3736 interfaceC3736;
                            ConcurrentLinkedQueue concurrentLinkedQueue2;
                            InterfaceC22710 interfaceC22711;
                            C20689 c206810;
                            C16673 c16673;
                            boolean z8;
                            C11113 c11114;
                            InterfaceC3736 interfaceC3737;
                            boolean z9;
                            C23380 c23381;
                            String strM11397;
                            C23380 c23382;
                            C16673 c16674;
                            StringBuilder sb;
                            boolean z10;
                            String str5;
                            C11113 c11115;
                            InterfaceC3736 interfaceC3738;
                            boolean z11;
                            C23380 c23383;
                            ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                            InterfaceC22710 interfaceC22712 = interfaceC22710;
                            C20689 c206811 = c20689;
                            C16673 c16675 = c16673M11399;
                            boolean z12 = z5;
                            C11113 c11116 = c11113;
                            String str6 = str4;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            C23380 c23384 = c23380;
                            while (!concurrentLinkedQueue3.isEmpty() && (interfaceC3736 = (InterfaceC3736) concurrentLinkedQueue3.poll()) != null && !interfaceC22712.mo24482()) {
                                c206811.m46754(1);
                                String strMo7189 = interfaceC3736.mo7189();
                                C13929 c13929 = c16675.get();
                                if (z12) {
                                    List<C25209> listM25632 = c11116.m25632(interfaceC3736.getPath());
                                    strM11397 = null;
                                    if (listM25632 == null) {
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        interfaceC22711 = interfaceC22712;
                                        c206810 = c206811;
                                        c16673 = c16675;
                                        z8 = z12;
                                        c11114 = c11116;
                                        interfaceC3737 = interfaceC3736;
                                        z9 = z14;
                                        c23381 = c23384;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(strMo7189.length());
                                        C23380 c23385 = new C23380();
                                        int i = 0;
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        int i2 = 0;
                                        for (C25209 c25209 : listM25632) {
                                            InterfaceC22710 interfaceC22713 = interfaceC22712;
                                            C20689 c206812 = c206811;
                                            if (c25209.f80613 != 1) {
                                                c16674 = c16675;
                                                z10 = z12;
                                                c11115 = c11116;
                                                c23382 = c23385;
                                                sb = sb2;
                                                str5 = strMo7189;
                                                interfaceC3738 = interfaceC3736;
                                                z11 = z14;
                                                c23383 = c23384;
                                            } else {
                                                int i3 = i;
                                                c23382 = c23385;
                                                c16674 = c16675;
                                                sb = sb2;
                                                z10 = z12;
                                                str5 = strMo7189;
                                                c11115 = c11116;
                                                interfaceC3738 = interfaceC3736;
                                                boolean z15 = z14;
                                                z11 = z14;
                                                c23383 = c23384;
                                                String strM11398 = C5275.m11397(c25209.f80616, str6, c13929, z13, z15, c23382);
                                                if (strM11398 != null) {
                                                    sb.append((CharSequence) str5, i2, c25209.f80614);
                                                    sb.append(C12588.m28992(strM11398));
                                                    i2 = c25209.f80611;
                                                    i = i3 + c23382.f74495;
                                                    synchronized (c23382) {
                                                        c23382.f74495 = 0;
                                                        c23382.f74494 = 0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                            }
                                            c23385 = c23382;
                                            sb2 = sb;
                                            strMo7189 = str5;
                                            interfaceC3736 = interfaceC3738;
                                            c23384 = c23383;
                                            interfaceC22712 = interfaceC22713;
                                            c206811 = c206812;
                                            c16675 = c16674;
                                            z12 = z10;
                                            c11116 = c11115;
                                            z14 = z11;
                                        }
                                        interfaceC22711 = interfaceC22712;
                                        c206810 = c206811;
                                        c16673 = c16675;
                                        z8 = z12;
                                        c11114 = c11116;
                                        int i4 = i;
                                        StringBuilder sb3 = sb2;
                                        String str7 = strMo7189;
                                        interfaceC3737 = interfaceC3736;
                                        z9 = z14;
                                        c23381 = c23384;
                                        if (i4 != 0) {
                                            c23381.m52023(i4);
                                            if (i2 < str7.length()) {
                                                sb3.append((CharSequence) str7, i2, str7.length());
                                            }
                                            strM11397 = sb3.toString();
                                        }
                                    }
                                } else {
                                    concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                    interfaceC22711 = interfaceC22712;
                                    c206810 = c206811;
                                    c16673 = c16675;
                                    z8 = z12;
                                    c11114 = c11116;
                                    interfaceC3737 = interfaceC3736;
                                    z9 = z14;
                                    c23381 = c23384;
                                    strM11397 = C5275.m11397(strMo7189, str6, c13929, z13, false, c23384);
                                }
                                String str8 = strM11397;
                                if (str8 != null) {
                                    interfaceC3737.mo7190(str8);
                                }
                                c23384 = c23381;
                                concurrentLinkedQueue3 = concurrentLinkedQueue2;
                                interfaceC22712 = interfaceC22711;
                                c206811 = c206810;
                                c16675 = c16673;
                                z12 = z8;
                                c11116 = c11114;
                                z14 = z9;
                            }
                        }
                    };
                    c20857.m47126(false);
                    C5275.m11400((int) (C19110.f57020 * 0.66f), runnable);
                    c20857.m47126(true);
                    C7050.m16212(new RunnableC21902(4, interfaceC22710, c23380));
                } catch (Exception e) {
                    C7050.m16212(new Runnable() { // from class: l.ܽ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC22710 interfaceC22711 = interfaceC22710;
                            c11113.m25633(interfaceC22711.mo24485(), exc);
                            interfaceC22711.mo24483();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19644(final C20738 c20738) {
        this.f22610 = new InterfaceC12454() { // from class: l.۬᩺᩷
            @Override // p067l.InterfaceC12454
            /* JADX INFO: renamed from: ֫ */
            public final void mo18968(String str, String str2, boolean z, boolean z2, boolean z3) {
                C23380 c23380 = new C23380();
                C13929 c13929Matcher = C5275.m11401(str, z2, z).matcher((CharSequence) "");
                C20738 c20739 = c20738;
                for (C24760 c24760 : c20739.m46840()) {
                    String strM11397 = C5275.m11397(c24760.m54427(), str2, c13929Matcher, z2, z3, c23380);
                    if (strM11397 != null) {
                        c24760.m54426(strM11397);
                    }
                }
                c20739.m46842();
                c20739.m46841();
                c20739.m46839().notifyDataSetChanged();
                C22682.m50795((CharSequence) c20739.getString(R.string.MT_Protector, Integer.valueOf(c23380.f74495)));
            }
        };
        this.f22609.setVisibility(8);
    }
}
