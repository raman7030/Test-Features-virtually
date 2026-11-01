package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC12286 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final C7179 f34313;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f34314;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC14100 f34315;

    /* JADX INFO: renamed from: ۟ */
    public final View f34316;

    /* JADX INFO: renamed from: ۤ */
    public final CheckBox f34317;

    /* JADX INFO: renamed from: ۨ */
    public final CheckBox f34318;

    /* JADX INFO: renamed from: ۫ */
    public final CheckBox f34319;

    /* JADX INFO: renamed from: ۬ */
    public final C7179 f34320;

    /* JADX INFO: renamed from: ܰ */
    public final View f34321;

    /* JADX INFO: renamed from: ᩶ */
    public final C14121 f34322;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC18686 f34323;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC14297 f34324;

    /* JADX INFO: renamed from: ᩺ */
    public final Spinner f34325;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC12286(ActivityC18686 activityC18686, C14121 c14121) {
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        this.f34315 = interfaceC14100;
        this.f34323 = activityC18686;
        this.f34322 = c14121;
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        this.f34316 = viewM12252;
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f34313 = c7179;
        C7179 c71710 = (C7179) viewM12252.findViewById(R.id.editText2);
        this.f34320 = c71710;
        c7179.m16509(C4605.m9734(), (String) null);
        c71710.m16509(C4605.m9733(), (String) null);
        this.f34321 = viewM12252.findViewById(R.id.linearLayout);
        this.f34325 = (Spinner) viewM12252.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f34317 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f34318 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f34319 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new C23834(this, 1));
        checkBox.setChecked(interfaceC14100.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC14100.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC14100.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28305(ViewOnClickListenerC12286 viewOnClickListenerC12286, boolean z) {
        viewOnClickListenerC12286.f34313.m16516(z);
        viewOnClickListenerC12286.f34320.m16519(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28307(C3263 c3263) {
        this.f34324 = new C22894(this, c3263.m5674());
        int i = this.f34315.getInt("dex_search_type", 0) == 4 ? 1 : 0;
        Spinner spinner = this.f34325;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28306() {
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(this.f34323);
        c20671.m46715(this.f34316);
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f34314 = dialogInterfaceC2564M21200;
        dialogInterfaceC2564M21200.m3860().setOnClickListener(this);
        this.f34313.m16515(0);
        C7050.m16226(this.f34320.m16514());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7179 c7179 = this.f34313;
        String string = c7179.m16518().toString();
        C7179 c71710 = this.f34320;
        String string2 = c71710.m16518().toString();
        if (string.isEmpty()) {
            this.f34314.dismiss();
            return;
        }
        boolean zIsChecked = this.f34317.isChecked();
        boolean zIsChecked2 = this.f34318.isChecked();
        boolean zIsChecked3 = this.f34319.isChecked();
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
        this.f34315.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f34314.dismiss();
        this.f34324.mo15853(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f34319.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28304(ViewOnClickListenerC12286 viewOnClickListenerC12286, Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C24164 c24164 = new C24164(viewOnClickListenerC12286.f34323);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        final C14967 c14967 = new C14967(viewOnClickListenerC12286, c24164);
        final boolean z4 = viewOnClickListenerC12286.f34325.getSelectedItemPosition() == 1;
        final C14121 c14121 = viewOnClickListenerC12286.f34322;
        C12826.requireNonNull(set);
        final C5580 c5580 = new C5580(0, set);
        new Thread(new Runnable() { // from class: l.ۧܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C23380 c23380 = new C23380();
                String str3 = str;
                final boolean z5 = z2;
                final C16673 c16673M11399 = C5275.m11399(str3, z5, z);
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C14121 c14122 = c14121;
                c14122.m32094(concurrentLinkedQueue, "", true, (Predicate) c5580);
                final InterfaceC22710 interfaceC22710 = c14967;
                interfaceC22710.mo24484(0);
                final C20689 c20689 = new C20689(concurrentLinkedQueue.size());
                c20689.m46753(new C23132(interfaceC22710));
                final boolean z6 = z4;
                final String str4 = str2;
                final boolean z7 = z3;
                Runnable runnable = new Runnable() { // from class: l.ܳܽۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC15206 interfaceC15206;
                        ConcurrentLinkedQueue concurrentLinkedQueue2;
                        InterfaceC22710 interfaceC22711;
                        C20689 c206810;
                        C16673 c16673;
                        boolean z8;
                        boolean z9;
                        InterfaceC15206 interfaceC15207;
                        String strM11397;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        InterfaceC22710 interfaceC22712 = interfaceC22710;
                        C20689 c206811 = c20689;
                        C16673 c16674 = c16673M11399;
                        boolean z10 = z6;
                        String str5 = str4;
                        boolean z11 = z5;
                        boolean z12 = z7;
                        C23380 c23381 = c23380;
                        while (!concurrentLinkedQueue3.isEmpty() && (interfaceC15206 = (InterfaceC15206) concurrentLinkedQueue3.poll()) != null && !interfaceC22712.mo24482()) {
                            c206811.m46754(1);
                            String strMo33763 = interfaceC15206.mo33763();
                            C13929 c13929 = c16674.get();
                            if (z10) {
                                C14317 c14317 = new C14317(strMo33763);
                                C23948 c23948 = new C23948(strMo33763.length());
                                C23380 c23382 = new C23380();
                                int i = 0;
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                int i2 = 0;
                                while (c14317.m32891()) {
                                    InterfaceC22710 interfaceC22713 = interfaceC22712;
                                    int i3 = i;
                                    C23380 c23383 = c23382;
                                    C20689 c206812 = c206811;
                                    C23948 c23949 = c23948;
                                    C16673 c16675 = c16674;
                                    C14317 c14318 = c14317;
                                    boolean z13 = z10;
                                    String str6 = strMo33763;
                                    boolean z14 = z12;
                                    boolean z15 = z12;
                                    InterfaceC15206 interfaceC15208 = interfaceC15206;
                                    String strM11398 = C5275.m11397(c14317.f40914, str5, c13929, z11, z14, c23383);
                                    if (strM11398 != null) {
                                        c23949.append((CharSequence) str6, i2, c14318.f40916);
                                        try {
                                            C15693.m35744(c23949, strM11398);
                                        } catch (IOException unused) {
                                        }
                                        i2 = c14318.f40912;
                                        i = c23383.f74495 + i3;
                                        synchronized (c23383) {
                                            c23383.f74495 = 0;
                                            c23383.f74494 = 0;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    c23382 = c23383;
                                    c23948 = c23949;
                                    c14317 = c14318;
                                    strMo33763 = str6;
                                    interfaceC15206 = interfaceC15208;
                                    interfaceC22712 = interfaceC22713;
                                    c206811 = c206812;
                                    c16674 = c16675;
                                    z10 = z13;
                                    z12 = z15;
                                }
                                interfaceC22711 = interfaceC22712;
                                c206810 = c206811;
                                c16673 = c16674;
                                z8 = z10;
                                int i4 = i;
                                C23948 c239410 = c23948;
                                String str7 = strMo33763;
                                z9 = z12;
                                interfaceC15207 = interfaceC15206;
                                if (i4 == 0) {
                                    strM11397 = null;
                                } else {
                                    c23381.m52023(i4);
                                    if (i2 < str7.length()) {
                                        c239410.append((CharSequence) str7, i2, str7.length());
                                    }
                                    strM11397 = c239410.toString();
                                }
                            } else {
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                interfaceC22711 = interfaceC22712;
                                c206810 = c206811;
                                c16673 = c16674;
                                z8 = z10;
                                z9 = z12;
                                interfaceC15207 = interfaceC15206;
                                strM11397 = C5275.m11397(strMo33763, str5, c13929, z11, false, c23381);
                            }
                            if (strM11397 != null) {
                                interfaceC15207.mo33758(strM11397);
                            }
                            concurrentLinkedQueue3 = concurrentLinkedQueue2;
                            interfaceC22712 = interfaceC22711;
                            c206811 = c206810;
                            c16674 = c16673;
                            z10 = z8;
                            z12 = z9;
                        }
                    }
                };
                c14122.m32085();
                c14122.m32103(false);
                C5275.m11400((int) (C19110.f57020 * 0.66f), runnable);
                c14122.m32103(true);
                c14122.m32122();
                C7050.m16212(new RunnableC19811(2, interfaceC22710, c23380));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28308(final C16684 c16684) {
        this.f34324 = new InterfaceC14297() { // from class: l.ۙܿۢ
            @Override // p067l.InterfaceC14297
            /* JADX INFO: renamed from: ֫ */
            public final void mo15853(String str, String str2, boolean z, boolean z2, boolean z3) {
                C23380 c23380 = new C23380();
                C13929 c13929Matcher = C5275.m11401(str, z2, z).matcher((CharSequence) "");
                C16684 c16685 = c16684;
                for (C17355 c17355 : c16685.m37787()) {
                    String strM11397 = C5275.m11397(c17355.m39356(), str2, c13929Matcher, z2, z3, c23380);
                    if (strM11397 != null) {
                        c17355.m39355(strM11397);
                    }
                }
                c16685.m37789();
                c16685.m37788();
                c16685.m37786().notifyDataSetChanged();
                C22682.m50795((CharSequence) c16685.getString(R.string.MT_Protector, Integer.valueOf(c23380.f74495)));
            }
        };
        this.f34321.setVisibility(8);
    }
}
