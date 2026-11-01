package p067l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܶ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C17143 implements InterfaceC23850 {

    /* JADX INFO: renamed from: ۫ */
    public static boolean f51043 = ApplicationC21448.f67649.getBoolean("sesrt", true);

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ int f51044 = 0;

    /* JADX INFO: renamed from: ֡ */
    public final View f51045;

    /* JADX INFO: renamed from: ֨ */
    public boolean f51046;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f51047;

    /* JADX INFO: renamed from: ۖ */
    public final C14731 f51048;

    /* JADX INFO: renamed from: ۗ */
    public MenuItem f51049;

    /* JADX INFO: renamed from: ۘ */
    public final String f51050;

    /* JADX INFO: renamed from: ۙ */
    public final C14731 f51051;

    /* JADX INFO: renamed from: ۚ */
    public final View f51052;

    /* JADX INFO: renamed from: ۜ */
    public final C7179 f51053;

    /* JADX INFO: renamed from: ۠ */
    public C3397 f51054;

    /* JADX INFO: renamed from: ۡ */
    public final C14731 f51055;

    /* JADX INFO: renamed from: ۢ */
    public final C14731 f51056;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10439 f51057;

    /* JADX INFO: renamed from: ܳ */
    public C15802 f51058;

    /* JADX INFO: renamed from: ܶ */
    public final View f51059;

    /* JADX INFO: renamed from: ܺ */
    public final C14731 f51060;

    /* JADX INFO: renamed from: ܽ */
    public boolean f51061;

    /* JADX INFO: renamed from: ܿ */
    public final C3667 f51062;

    /* JADX INFO: renamed from: ᩳ */
    public final C14146 f51063;

    /* JADX INFO: renamed from: ᩴ */
    public final C14731 f51064;

    /* JADX INFO: renamed from: ᩵ */
    public final View f51065;

    /* JADX INFO: renamed from: ᩶ */
    public final TextView f51066;

    /* JADX INFO: renamed from: ᩷ */
    public final C7179 f51067;

    /* JADX INFO: renamed from: ᩸ */
    public HandlerC3235 f51068;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f51069;

    /* JADX INFO: renamed from: ᩻ */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC23180 f51070;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38808(C17143 c17143) {
        c17143.getClass();
        AbstractActivityC5549 abstractActivityC5549 = c17143.f51047;
        abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC24484.class));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38809(C17143 c17143, int i, String[] strArr, DialogInterface dialogInterface, int i2) {
        c17143.getClass();
        if (i != i2) {
            String str = strArr[i2];
            c17143.m38848(str);
            c17143.f51063.m32492(str);
        }
        dialogInterface.dismiss();
    }

    public C17143(ActivityC18686 activityC18686, C14146 c14146, View view) {
        this(activityC18686, c14146, "code", new C6395(4, view));
    }

    public C17143(AbstractActivityC5549 abstractActivityC5549, C14146 c14146, String str, InterfaceC10439 interfaceC10439) {
        this.f51068 = new HandlerC3235(this, new C10050());
        this.f51047 = abstractActivityC5549;
        this.f51063 = c14146;
        this.f51050 = str;
        this.f51070 = new SharedPreferencesOnSharedPreferenceChangeListenerC23180(abstractActivityC5549, c14146);
        this.f51057 = interfaceC10439;
        View viewMo14636 = interfaceC10439.mo14636();
        this.f51059 = viewMo14636;
        this.f51052 = viewMo14636.findViewById(R.id.MT_Protector);
        this.f51045 = viewMo14636.findViewById(R.id.MT_Protector);
        this.f51065 = viewMo14636.findViewById(R.id.MT_Protector);
        C7179 c7179 = (C7179) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51067 = c7179;
        C7179 c71710 = (C7179) viewMo14636.findViewById(R.id.edtReplaceWord);
        this.f51053 = c71710;
        C14731 c14731 = (C14731) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51064 = c14731;
        C14731 c14732 = (C14731) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51056 = c14732;
        C14731 c14733 = (C14731) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51051 = c14733;
        C14731 c14734 = (C14731) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51055 = c14734;
        C14731 c14735 = (C14731) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51048 = c14735;
        C14731 c14736 = (C14731) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51060 = c14736;
        TextView textView = (TextView) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51066 = textView;
        this.f51069 = (TextView) viewMo14636.findViewById(R.id.MT_Protector);
        C3667 c3667 = (C3667) viewMo14636.findViewById(R.id.MT_Protector);
        this.f51062 = c3667;
        if (!f51043) {
            ((ViewGroup) viewMo14636).removeView(c3667);
        }
        textView.setOnClickListener(new ViewOnClickListenerC9098(0, abstractActivityC5549, this));
        c7179.m16509(str.concat("_s"), (String) null);
        c71710.m16509(str.concat("_r"), (String) null);
        C3397 c3397 = new C3397(abstractActivityC5549, c14146);
        this.f51054 = c3397;
        final C23514 c23514 = new C23514((TextView) viewMo14636.findViewById(R.id.MT_Protector));
        c3397.m5986(new C6416(this, c23514));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۟ۨᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17143.m38811(this.f25787, view);
            }
        };
        c14146.m32386(new C4404(this));
        c14735.m33674(new InterfaceC5344() { // from class: l.ۧ᩺ᩳ
            @Override // p067l.InterfaceC5344
            /* JADX INFO: renamed from: ֫ */
            public final void mo11597(C14731 c14737, boolean z, boolean z2) {
                C17143.m38817(this.f36871, c23514, z, z2);
            }
        });
        C8460 c8460 = new C8460(this, c23514);
        c14731.m33674(c8460);
        c14732.m33674(c8460);
        c14733.m33674(c8460);
        c14734.m33674(c8460);
        c14736.m33674(c8460);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i = 0; i < 5; i++) {
            View viewFindViewById = viewMo14636.findViewById(iArr[i]);
            C21272.m48052(viewFindViewById);
            viewFindViewById.setOnClickListener(onClickListener);
        }
        this.f51067.m16507(new C20498(this));
        c14146.m32379(new Runnable() { // from class: l.ܽ᩺ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f55218.m38833();
            }
        });
        c14146.m32394(new InterfaceC10005() { // from class: l.ᩳ᩺ᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i2, int i3) {
                this.f60287.m38833();
            }
        });
        m38853();
        c14146.m32408(this);
        m38832();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38814(final C17143 c17143, AbstractActivityC5549 abstractActivityC5549, View view) {
        TextView textView = c17143.f51066;
        if (f51043) {
            f51043 = false;
            C24104.m53360(ApplicationC21448.f67649, "sesrt", false);
            c17143.f51062.setVisibility(8);
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        boolean z = !c17143.f51069.getText().toString().equals("0");
        C1898 c1898 = new C1898(abstractActivityC5549, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.setOptionalIconsVisible(true);
        c0994M50638.setGroupDividerEnabled(true);
        C1484.m33529(c0994M50638, R.string.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c0994M50638.add(R.string.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ܿ᩺ᩳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C17143.m38810(this.f57221, menuItem);
                return true;
            }
        });
        C1828.m48009(c1898).m44897();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38810(C17143 c17143, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            String string = ApplicationC21448.f67649.getString("srep", "$0\\n");
            new C7757(c17143, c17143.f51047, string.trim().isEmpty() ? "$0\\n" : string);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c17143.m38805(1);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c17143.m38805(2);
        } else if (itemId == R.string.MT_Protector) {
            c17143.m38805(3);
        } else if (itemId == R.string.MT_Protector) {
            c17143.m38805(4);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m38853() {
        InterfaceC4739 interfaceC4739Mo14637 = this.f51057.mo14637();
        this.f51060.setVisibility(interfaceC4739Mo14637 == null ? 8 : 0);
        this.f51054.m5985(interfaceC4739Mo14637);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38844(InterfaceC24784 interfaceC24784, C6456 c6456, Class cls) {
        c6456.m14753(interfaceC24784, new C5075(this, cls), this.f51067.m16514(), this.f51053.m16514());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38838(String str) {
        this.f51070.m51641(str);
        m38825(this.f51049, this.f51063);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38836(MenuItem menuItem) {
        this.f51049 = menuItem;
        m38825(menuItem, this.f51063);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38825(MenuItem menuItem, C14146 c14146) {
        if (menuItem == null) {
            return;
        }
        RunnableC8625 runnableC8625 = new RunnableC8625(menuItem, c14146);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableC8625.run();
        } else {
            C7050.m16212(runnableC8625);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m38857() {
        MenuItem menuItem = this.f51049;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f51049.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = this.f51070;
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51645(zIsChecked);
        this.f51063.m32404(sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51651(), new RunnableC4778(1, this));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m38826(C17143 c17143) {
        C14146 c14146 = c17143.f51063;
        c14146.scrollTo(0, c14146.m32472());
        c14146.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38812(C17143 c17143, PatternSyntaxException patternSyntaxException) {
        C20671 c20671BuildDialog = c17143.f51047.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(C13259.m30302(patternSyntaxException));
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38811(C17143 c17143, View view) {
        C7179 c7179 = c17143.f51053;
        C7179 c71710 = c17143.f51067;
        C3397 c3397 = c17143.f51054;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c3397.m5990(c71710.m16518().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            c3397.m5983(c71710.m16518().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            if (c17143.mo13672(false)) {
                return;
            }
            c3397.m5984(c71710.m16518().toString(), c7179.m16518().toString());
        } else if (id == R.id.MT_Protector) {
            c3397.m5991(c71710.m16518().toString(), c7179.m16518().toString());
        } else if (id == R.id.MT_Protector) {
            c17143.m38854();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38818(C17143 c17143, boolean z) {
        c17143.m38820();
        C14731 c14731 = c17143.f51048;
        c14731.setVisibility(z ? 0 : 8);
        c14731.m33675(z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38817(C17143 c17143, C23514 c23514, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        c17143.f51063.m32528();
        c17143.m38847();
        c23514.m52292(R.string.MT_Protector, 2000);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38816(C17143 c17143, C23514 c23514, C14731 c14731, boolean z, boolean z2) {
        String str = c17143.f51050;
        C3397 c3397 = c17143.f51054;
        int id = c14731.getId();
        if (id == R.id.MT_Protector) {
            c3397.m5999(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3397.m5981(), C17588.m40053(str, "_bit")).apply();
            c17143.m38847();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3397.m5997(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3397.m5981(), C17588.m40053(str, "_bit")).apply();
            c17143.m38847();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3397.m5987(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3397.m5981(), C17588.m40053(str, "_bit")).apply();
            c17143.m38847();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3397.m5995(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
                if (z) {
                    DialogInterfaceOnClickListenerC12648.m29081(R.string.MT_Protector, c17143.f51047, "page_search");
                }
            }
            ApplicationC21448.f67649.edit().mo27874(c3397.m5981(), C17588.m40053(str, "_bit")).apply();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3397.m5992(z);
            if (z2) {
                c23514.m52292(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
            }
            ApplicationC21448.f67649.edit().mo27874(c3397.m5981(), C17588.m40053(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private void m38804() {
        C3397 c3397 = this.f51054;
        this.f51064.m33675(c3397.m5993(), false);
        this.f51056.m33675(c3397.m5996(), false);
        this.f51051.m33675(c3397.m6001(), false);
        this.f51055.m33675(c3397.m6000(), false);
        this.f51060.m33675(c3397.m5998(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public void m38820() {
        C15802 c15802 = this.f51058;
        if (c15802 != null) {
            c15802.m35872();
            this.f51058 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38805(int i) {
        m38820();
        if (this.f51061 || this.f51046) {
            return;
        }
        C14146 c14146 = this.f51063;
        if (i == 3 && c14146.m32505()) {
            return;
        }
        final String string = this.f51067.m16518().toString();
        String string2 = ApplicationC21448.f67649.getString("srep", "$0\\n");
        String str = string2.trim().isEmpty() ? "$0\\n" : string2;
        final int iM5989 = this.f51054.m5989();
        final C14698 c14698M32582 = c14146.m32582();
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int iMo28581 = interfaceC9768M32500.mo28581();
        final String str2 = str;
        C15802 c15802 = new C15802(c14146, this.f51047, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ܳ᩺ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C17143.m38819(this.f48376, string, iM5989, c14698M32582, str2);
            }
        });
        this.f51058 = c15802;
        new C3062(this, c15802, interfaceC9768M32500, iMo28581, string, iM5989, str, c14698M32582, i).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38819(C17143 c17143, String str, int i, C14698 c14698, String str2) {
        if (c17143.f51061 || c17143.f51046 || !str.contentEquals(c17143.f51067.m16518()) || i != c17143.f51054.m5989() || !C12826.equals(c14698, c17143.f51063.m32582())) {
            return false;
        }
        String string = ApplicationC21448.f67649.getString("srep", "$0\\n");
        return str2.equals(string.trim().isEmpty() ? "$0\\n" : string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵ */
    public void m38833() {
        if (m38852()) {
            int iM16521 = this.f51067.m16521();
            TextView textView = this.f51069;
            TextView textView2 = this.f51066;
            if (iM16521 != 0) {
                C14146 c14146 = this.f51063;
                C8506 c8506 = c14146.f40190;
                int[] iArrM32433 = c14146.m32433();
                C17893 c17893M19797 = c8506.m19797(c14146.getContext(), iArrM32433[0], iArrM32433[1]);
                if (f51043 && c17893M19797.size() >= 10) {
                    textView2.getPaint().setUnderlineText(true);
                    textView2.invalidate();
                    C3667 c3667 = this.f51062;
                    if (c3667.getVisibility() == 8) {
                        c3667.measure(0, 0);
                        c3667.m7074().m17811((textView2.getWidth() / 2.0f) / c3667.getMeasuredWidth());
                        c3667.setVisibility(0);
                        c3667.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(c3667, "alpha", 0.0f, 1.0f).setDuration(150L).start();
                    }
                }
                if (c17893M19797.m40693()) {
                    textView2.setTextColor(C23223.f72984);
                    textView.setTextColor(C23223.f72984);
                } else if (c17893M19797.m40695()) {
                    textView2.setTextColor(C23223.f72975);
                    textView.setTextColor(C23223.f72975);
                } else {
                    textView2.setTextColor(C23223.f72986);
                    textView.setTextColor(C23223.f72986);
                }
                String strM40694 = c17893M19797.m40694();
                if (TextUtils.equals(strM40694, textView.getText())) {
                    return;
                }
                textView.setText(strM40694);
                return;
            }
            if (!TextUtils.equals("0", textView.getText())) {
                textView.setText("0");
            }
            textView2.setTextColor(C23223.f72984);
            textView.setTextColor(C23223.f72984);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38849(C11996 c11996) {
        boolean z = false;
        boolean z2 = this.f51059.getVisibility() == 0;
        if (z2 && this.f51052.getVisibility() == 0) {
            z = true;
        }
        C7179 c7179 = this.f51067;
        if (z2) {
            c7179.m16517();
        }
        C7179 c71710 = this.f51053;
        if (z) {
            c71710.m16517();
        }
        c11996.m27445(z2);
        c11996.m27445(z);
        c11996.m27443((CharSequence) (z2 ? c7179.m16518().toString() : ""));
        c11996.m27443((CharSequence) (z ? c71710.m16518().toString() : ""));
        c11996.mo15113(29298);
        c11996.writeByte(this.f51054.m5981());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38850(C14677 c14677) {
        byte bByteValue;
        C5486 c5486M12123 = C5486.m12123(c14677);
        if (c5486M12123.f13129) {
            Byte b = c5486M12123.f13126;
            if (b == null) {
                bByteValue = ApplicationC21448.f67649.mo20199((byte) 0, this.f51050 + "_bit");
            } else {
                bByteValue = b.byteValue();
            }
            this.f51054.m5982(bByteValue);
        }
        C7050.m16212(new RunnableC17196(2, this, c5486M12123));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m38807(C5486 c5486, Runnable runnable) {
        boolean z = c5486.f13129;
        boolean z2 = c5486.f13130;
        runnable.run();
        m38804();
        int i = 8;
        this.f51059.setVisibility(z ? 0 : 8);
        if (z && z2) {
            i = 0;
        }
        this.f51052.setVisibility(i);
        m38832();
        C7179 c7179 = this.f51067;
        if (z) {
            c7179.m16508(c5486.f13128);
            runnable.run();
        }
        if (z2) {
            this.f51053.m16508(c5486.f13127);
            runnable.run();
            this.f51055.setVisibility(0);
        }
        C14146 c14146 = this.f51063;
        if (z) {
            View view = this.f51045;
            view.setEnabled(false);
            this.f51065.setEnabled(!c14146.m32505());
            if (c7179.m16521() != 0) {
                m38847();
            }
            if (z2 && !c14146.m32505()) {
                view.setEnabled(true);
            }
        } else {
            c14146.m32528();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38841(C5154 c5154, C6827 c6827, C6495 c6495, C22864 c22864) {
        if (this.f51061 || this.f51046) {
            throw new IllegalStateException("Editor helper cannot prepare session state");
        }
        this.f51063.m32388(c5154, this.f51070.m51638(c6827), c6495, c22864);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38840(C5154 c5154, C6827 c6827, C5486 c5486) {
        byte bByteValue;
        C14146 c14146 = this.f51063;
        c14146.m32441();
        if (this.f51061 || this.f51046) {
            throw new IllegalStateException("Editor helper cannot restore session state");
        }
        final InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        Runnable runnable = new Runnable() { // from class: l.᩻᩺ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C17143.m38815(this.f80573, interfaceC9768M32500);
            }
        };
        this.f51046 = true;
        HandlerC3235 handlerC3235 = this.f51068;
        handlerC3235.removeCallbacksAndMessages(null);
        try {
            boolean zM32417 = c14146.m32417(c5154);
            SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = this.f51070;
            if (!zM32417) {
                c14146.m32387(c5154, sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51638(c6827));
            }
            runnable.run();
            sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51639();
            m38825(this.f51049, c14146);
            if (c5486.f13129) {
                C3397 c3397 = this.f51054;
                Byte b = c5486.f13126;
                if (b == null) {
                    bByteValue = ApplicationC21448.f67649.mo20199((byte) 0, this.f51050 + "_bit");
                } else {
                    bByteValue = b.byteValue();
                }
                c3397.m5982(bByteValue);
            }
            m38807(c5486, runnable);
            handlerC3235.removeCallbacksAndMessages(null);
            this.f51046 = false;
            m38847();
        } catch (Throwable th) {
            handlerC3235.removeCallbacksAndMessages(null);
            this.f51046 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38815(C17143 c17143, InterfaceC9768 interfaceC9768) {
        if (c17143.f51061 || c17143.f51063.m32500() != interfaceC9768) {
            throw new CancellationException("Editor owner changed during restoration");
        }
    }

    @Override // p067l.InterfaceC23850
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13672(boolean z) {
        View view = this.f51052;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f51055.setVisibility(0);
        this.f51045.setEnabled(true);
        C7179 c7179 = this.f51053;
        c7179.requestFocus();
        c7179.m16512();
        c7179.m16522();
        if (z) {
            C7050.m16226(c7179.m16514());
        }
        return true;
    }

    @Override // p067l.InterfaceC23850
    /* JADX INFO: renamed from: ֫ */
    public final void mo13664() {
        mo13671(true, false);
    }

    @Override // p067l.InterfaceC23850
    /* JADX INFO: renamed from: ۧ */
    public final void mo13676() {
        mo13671(false, false);
    }

    @Override // p067l.InterfaceC23850
    /* JADX INFO: renamed from: ֫ */
    public final void mo13671(boolean z, boolean z2) {
        boolean zM38852 = m38852();
        C3397 c3397 = this.f51054;
        C14146 c14146 = this.f51063;
        if (!zM38852) {
            if (c14146.f40275.mo11814()) {
                return;
            }
            c3397.m5982(ApplicationC21448.f67649.mo20199((byte) 0, this.f51050 + "_bit"));
            m38804();
            this.f51059.setVisibility(0);
            this.f51052.setVisibility(8);
            m38832();
            this.f51055.setVisibility(8);
            this.f51045.setEnabled(false);
            this.f51065.setEnabled(!c14146.m32505());
        }
        C7179 c7179 = this.f51067;
        if (z) {
            c7179.requestFocus();
            C7050.m16226(c7179.m16514());
        }
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        if (i != i2 && !z2) {
            try {
                String string = c14146.m32500().subSequence(i, i2).toString();
                if (c3397.m5993()) {
                    string = C6112.m13905(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c7179.m16508(string);
                if (z) {
                    c7179.m16522();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM38852) {
            c7179.m16512();
            if (z) {
                c7179.m16522();
            }
        } else if (!z2) {
            return;
        }
        if (c7179.m16521() != 0) {
            m38847();
        } else {
            m38833();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m38852() {
        return this.f51059.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38854() {
        m38820();
        C14146 c14146 = this.f51063;
        c14146.m32528();
        this.f51054.m5988();
        View view = this.f51059;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m38832();
            this.f51067.m16517();
        }
        View view2 = this.f51052;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f51053.m16517();
        }
        if (f51043) {
            this.f51062.setVisibility(8);
            TextView textView = this.f51066;
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        this.f51055.setVisibility(8);
        c14146.requestFocus();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m38847() {
        m38820();
        this.f51068.removeMessages(0);
        m38821();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m38821() {
        if (this.f51061 || this.f51046 || !m38852()) {
            return;
        }
        this.f51054.m5994(this.f51067.m16518().toString());
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m38832() {
        View view = this.f51059;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        AbstractActivityC5549 abstractActivityC5549 = this.f51047;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            abstractActivityC5549.getWindow().setNavigationBarColor(C23223.f72971);
        } else {
            abstractActivityC5549.getWindow().setNavigationBarColor(this.f51063.f40262.f76000);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38842(C11996 c11996) {
        this.f51070.m51643(c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38843(C14677 c14677) {
        this.f51070.m51644(c14677);
        m38825(this.f51049, this.f51063);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38839(String str, boolean z) {
        this.f51070.m51642(str, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38837(Class cls) {
        this.f51070.m51640(cls);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38856() {
        this.f51061 = true;
        m38820();
        this.f51054.m5988();
        this.f51068.removeCallbacksAndMessages(null);
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = this.f51070;
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.getClass();
        try {
            C7050.f18355.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC23180);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m38845() {
        return this.f51070.m51646();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38848(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = this.f51070;
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51649(str);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51655() || SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51633()) {
            this.f51063.m32381(str, true);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m38846() {
        this.f51070.m51647();
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m38855() {
        return this.f51070.m51652();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m38858() {
        C3733 c3733 = new C3733(this, this.f51047);
        c3733.m33344(R.string.MT_Protector);
        c3733.m33362(2);
        c3733.m33351("1…" + this.f51063.m32365());
        c3733.m33330();
        c3733.m33365(2);
        c3733.m33352(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m38851(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C14146 c14146 = this.f51063;
        if (itemId == R.id.MT_Protector) {
            c14146.m32362();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146.m32548();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146.m32559();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146.m32545();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo13664();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m38858();
            return true;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f51047;
        if (itemId == R.id.MT_Protector) {
            final String[] strArr = (String[]) C9038.m20936().toArray(new String[0]);
            final int iIndexOf = C9038.m20936().indexOf(this.f51070.m51652());
            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46723(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.᩷᩺ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C17143.m38809(this.f70979, iIndexOf, strArr, dialogInterface, i);
                }
            });
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732().m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۢ᩺ᩳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17143.m38808(this.f32911);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m38837(ActivityC12551.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m38857();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146.m32446(!c14146.m32501());
            menuItem.setChecked(c14146.m32501());
            if (c14146.m32501()) {
                DialogInterfaceOnClickListenerC12648.m29079(R.string.MT_Protector, abstractActivityC5549, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m38806(menuItem, c14146);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C17833)) {
            return false;
        }
        ((C17833) title).m40496().mo10846(c14146);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38806(MenuItem menuItem, C14146 c14146) {
        int i;
        int i2;
        MenuItem menuItemAdd;
        boolean z = (c14146.m32434() || c14146.m32505()) ? false : true;
        boolean z2 = c14146.m32590() == 0;
        int iM32508 = c14146.m32508();
        int iM32512 = c14146.m32512();
        if (iM32508 > iM32512) {
            i2 = iM32508;
            i = iM32512;
        } else {
            i = iM32508;
            i2 = iM32512;
        }
        SubMenu subMenu = menuItem.getSubMenu();
        subMenu.clear();
        List<AbstractC5094> listM5213 = C3081.m5213();
        Map mapM5215 = C3081.m5215();
        SubMenu subMenu2 = null;
        for (AbstractC5094 abstractC5094 : listM5213) {
            Integer num = (Integer) mapM5215.get(abstractC5094.mo10845());
            if (num != null && abstractC5094.mo10847(c14146, z, z2, i, i2)) {
                if (num.intValue() >= 300) {
                    if (subMenu2 == null) {
                        SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, 0, 65535, R.string.MT_Protector);
                        subMenuAddSubMenu.setIcon(R.drawable.MT_Protector);
                        subMenu2 = subMenuAddSubMenu;
                    }
                    menuItemAdd = subMenu2.add(0, 0, num.intValue(), abstractC5094.mo10848());
                } else {
                    menuItemAdd = subMenu.add(0, 0, num.intValue(), abstractC5094.mo10848());
                }
                menuItemAdd.setIcon(abstractC5094.mo10844(c14146.getContext()));
            }
        }
    }
}
