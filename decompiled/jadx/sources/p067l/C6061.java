package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۘۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6061 implements InterfaceC23850 {

    /* JADX INFO: renamed from: ֡ */
    public C3397 f15217;

    /* JADX INFO: renamed from: ֨ */
    public final View f15218;

    /* JADX INFO: renamed from: ֫ */
    public final ActivityC4030 f15219;

    /* JADX INFO: renamed from: ۖ */
    public final C14731 f15220;

    /* JADX INFO: renamed from: ۘ */
    public final View f15221;

    /* JADX INFO: renamed from: ۚ */
    public C3397 f15222;

    /* JADX INFO: renamed from: ۜ */
    public final C7179 f15223;

    /* JADX INFO: renamed from: ۠ */
    public HandlerC3235 f15224 = new HandlerC3235(this, new C5633(4));

    /* JADX INFO: renamed from: ۡ */
    public final C14731 f15225;

    /* JADX INFO: renamed from: ۢ */
    public final C14731 f15226;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4720 f15227;

    /* JADX INFO: renamed from: ܳ */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC23180 f15228;

    /* JADX INFO: renamed from: ܶ */
    public final TextView f15229;

    /* JADX INFO: renamed from: ܺ */
    public final String f15230;

    /* JADX INFO: renamed from: ܽ */
    public final C9471 f15231;

    /* JADX INFO: renamed from: ܿ */
    public final C14146 f15232;

    /* JADX INFO: renamed from: ᩳ */
    public final C14146 f15233;

    /* JADX INFO: renamed from: ᩴ */
    public final View f15234;

    /* JADX INFO: renamed from: ᩵ */
    public final View f15235;

    /* JADX INFO: renamed from: ᩶ */
    public MenuItem f15236;

    /* JADX INFO: renamed from: ᩷ */
    public final C7179 f15237;

    /* JADX INFO: renamed from: ᩸ */
    public final TextView f15238;

    /* JADX INFO: renamed from: ᩹ */
    public final C14731 f15239;

    /* JADX INFO: renamed from: ᩻ */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC23180 f15240;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13650(C6061 c6061) {
        c6061.getClass();
        ActivityC4030 activityC4030 = c6061.f15219;
        activityC4030.startActivity(new Intent(activityC4030, (Class<?>) ActivityC24484.class));
    }

    public C6061(ActivityC4030 activityC4030, C9471 c9471, InterfaceC4720 interfaceC4720) {
        this.f15219 = activityC4030;
        this.f15231 = c9471;
        C14146 c14146M22071 = c9471.m22071();
        this.f15233 = c14146M22071;
        C14146 c14146M22052 = c9471.m22052();
        this.f15232 = c14146M22052;
        this.f15230 = TextBundle.TEXT_ENTRY;
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = new SharedPreferencesOnSharedPreferenceChangeListenerC23180(activityC4030, c14146M22071);
        this.f15228 = sharedPreferencesOnSharedPreferenceChangeListenerC23180;
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23181 = new SharedPreferencesOnSharedPreferenceChangeListenerC23180(activityC4030, c14146M22052);
        this.f15240 = sharedPreferencesOnSharedPreferenceChangeListenerC23181;
        this.f15227 = interfaceC4720;
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51648();
        sharedPreferencesOnSharedPreferenceChangeListenerC23181.m51648();
        View viewMo7096 = interfaceC4720.mo7096();
        this.f15218 = viewMo7096;
        this.f15235 = viewMo7096.findViewById(R.id.MT_Protector);
        this.f15234 = viewMo7096.findViewById(R.id.MT_Protector);
        this.f15221 = viewMo7096.findViewById(R.id.MT_Protector);
        C7179 c7179 = (C7179) viewMo7096.findViewById(R.id.MT_Protector);
        this.f15237 = c7179;
        C7179 c71710 = (C7179) viewMo7096.findViewById(R.id.edtReplaceWord);
        this.f15223 = c71710;
        this.f15220 = (C14731) viewMo7096.findViewById(R.id.MT_Protector);
        this.f15226 = (C14731) viewMo7096.findViewById(R.id.MT_Protector);
        this.f15239 = (C14731) viewMo7096.findViewById(R.id.MT_Protector);
        this.f15225 = (C14731) viewMo7096.findViewById(R.id.MT_Protector);
        this.f15238 = (TextView) viewMo7096.findViewById(R.id.MT_Protector);
        this.f15229 = (TextView) viewMo7096.findViewById(R.id.MT_Protector);
        ((ViewGroup) viewMo7096).removeView(viewMo7096.findViewById(R.id.MT_Protector));
        c7179.m16509("text_s", (String) null);
        c71710.m16509("text_r", (String) null);
        this.f15217 = new C3397(activityC4030, c14146M22071);
        this.f15222 = new C3397(activityC4030, c14146M22052);
        final C23514 c23514 = new C23514((TextView) viewMo7096.findViewById(R.id.MT_Protector));
        int i = 0;
        while (i < 2) {
            (i == 0 ? this.f15217 : this.f15222).m5986(new C11426(this, c23514));
            i++;
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܽۤᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6061.m13651(this.f54160, view);
            }
        };
        InterfaceC5344 interfaceC5344 = new InterfaceC5344() { // from class: l.ᩳۤᩳ
            @Override // p067l.InterfaceC5344
            /* JADX INFO: renamed from: ֫ */
            public final void mo11597(C14731 c14731, boolean z, boolean z2) {
                C6061.m13653(this.f59341, c23514, c14731, z, z2);
            }
        };
        this.f15220.m33674(interfaceC5344);
        this.f15226.m33674(interfaceC5344);
        this.f15239.m33674(interfaceC5344);
        this.f15225.m33674(interfaceC5344);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i2 = 0; i2 < 5; i2++) {
            View viewFindViewById = viewMo7096.findViewById(iArr[i2]);
            C21272.m48052(viewFindViewById);
            viewFindViewById.setOnClickListener(onClickListener);
        }
        this.f15237.m16507(new C10755(this));
        c14146M22071.m32379(new RunnableC18801(0, this));
        c14146M22052.m32379(new RunnableC18801(0, this));
        c14146M22071.m32394(new InterfaceC10005() { // from class: l.ܳۤᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i3, int i4) {
                this.f47434.m13674();
            }
        });
        c14146M22052.m32394(new InterfaceC10005() { // from class: l.᩻ۤᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i3, int i4) {
                this.f79331.m13674();
            }
        });
        this.f15233.m32408(this);
        this.f15232.m32408(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13670(InterfaceC24784 interfaceC24784, C6456 c6456, Class cls) {
        c6456.m14753(interfaceC24784, new C22155(this), this.f15237.m16514(), this.f15223.m16514());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13667(String str, String str2) {
        this.f15228.m51641(str);
        this.f15240.m51641(str2);
        C17143.m38825(this.f15236, this.f15233);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m13682() {
        return this.f15228.m51652();
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m13680() {
        return this.f15240.m51652();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13665(MenuItem menuItem) {
        this.f15236 = menuItem;
        C17143.m38825(menuItem, this.f15233);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m13684() {
        MenuItem menuItem = this.f15236;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f15236.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = this.f15228;
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51645(zIsChecked);
        boolean zIsChecked2 = this.f15236.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23181 = this.f15240;
        sharedPreferencesOnSharedPreferenceChangeListenerC23181.m51645(zIsChecked2);
        C21405 c21405M51651 = sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51651();
        C21405 c21405M51652 = sharedPreferencesOnSharedPreferenceChangeListenerC23181.m51651();
        RunnableC11745 runnableC11745 = new RunnableC11745(this, new AtomicInteger(2), 1);
        this.f15233.m32404(c21405M51651, runnableC11745);
        this.f15232.m32404(c21405M51652, runnableC11745);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m13660(C6061 c6061) {
        C14146 c14146 = c6061.f15233;
        c14146.scrollTo(0, c14146.m32472());
        C14146 c14147 = c6061.f15232;
        c14147.scrollTo(0, c14147.m32472());
        c14146.invalidate();
        c14147.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13652(C6061 c6061, PatternSyntaxException patternSyntaxException) {
        C20671 c20671BuildDialog = c6061.f15219.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(C13259.m30302(patternSyntaxException));
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13651(C6061 c6061, View view) {
        C7179 c7179 = c6061.f15223;
        C7179 c71710 = c6061.f15237;
        C3397 c3397 = c6061.f15231.m22068() ? c6061.f15217 : c6061.f15222;
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
            if (c6061.mo13672(false)) {
                return;
            }
            c3397.m5984(c71710.m16518().toString(), c7179.m16518().toString());
        } else if (id == R.id.MT_Protector) {
            c3397.m5991(c71710.m16518().toString(), c7179.m16518().toString());
        } else if (id == R.id.MT_Protector) {
            c6061.m13681();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13653(C6061 c6061, C23514 c23514, C14731 c14731, boolean z, boolean z2) {
        String str = c6061.f15230;
        C3397 c3397 = c6061.f15222;
        C3397 c3398 = c6061.f15217;
        int id = c14731.getId();
        if (id == R.id.MT_Protector) {
            c3398.m5999(z);
            c3397.m5999(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3398.m5981(), C17588.m40053(str, "_bit")).apply();
            c6061.m13675();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3398.m5997(z);
            c3397.m5997(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3398.m5981(), C17588.m40053(str, "_bit")).apply();
            c6061.m13675();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3398.m5987(z);
            c3397.m5987(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3398.m5981(), C17588.m40053(str, "_bit")).apply();
            c6061.m13675();
            return;
        }
        if (id == R.id.MT_Protector) {
            c3398.m5992(z);
            c3397.m5992(z);
            if (z2) {
                c23514.m52291(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC21448.f67649.edit().mo27874(c3398.m5981(), C17588.m40053(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m13656() {
        C3397 c3397 = this.f15217;
        this.f15220.m33675(c3397.m5993(), false);
        this.f15226.m33675(c3397.m5996(), false);
        this.f15239.m33675(c3397.m6001(), false);
        this.f15225.m33675(c3397.m6000(), false);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m13674() {
        if (m13685()) {
            int iM16521 = this.f15237.m16521();
            TextView textView = this.f15238;
            TextView textView2 = this.f15229;
            if (iM16521 != 0) {
                C14146 c14146M22070 = this.f15231.m22070();
                C8506 c8506 = c14146M22070.f40190;
                int[] iArrM32433 = c14146M22070.m32433();
                C17893 c17893M19797 = c8506.m19797(c14146M22070.getContext(), iArrM32433[0], iArrM32433[1]);
                if (c17893M19797.m40693()) {
                    textView.setTextColor(C23223.f72984);
                    textView2.setTextColor(C23223.f72984);
                } else if (c17893M19797.m40695()) {
                    textView.setTextColor(C23223.f72975);
                    textView2.setTextColor(C23223.f72975);
                } else {
                    textView.setTextColor(C23223.f72986);
                    textView2.setTextColor(C23223.f72986);
                }
                String strM40694 = c17893M19797.m40694();
                if (TextUtils.equals(strM40694, textView2.getText())) {
                    return;
                }
                textView2.setText(strM40694);
                return;
            }
            if (!TextUtils.equals("0", textView2.getText())) {
                textView2.setText("0");
            }
            textView.setTextColor(C23223.f72984);
            textView2.setTextColor(C23223.f72984);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13677(C11996 c11996) {
        boolean z = false;
        boolean z2 = this.f15218.getVisibility() == 0;
        if (z2 && this.f15235.getVisibility() == 0) {
            z = true;
        }
        C7179 c7179 = this.f15237;
        if (z2) {
            c7179.m16517();
        }
        C7179 c71710 = this.f15223;
        if (z) {
            c71710.m16517();
        }
        c11996.m27445(z2);
        c11996.m27445(z);
        c11996.m27443((CharSequence) (z2 ? c7179.m16518().toString() : ""));
        c11996.m27443((CharSequence) (z ? c71710.m16518().toString() : ""));
        c11996.writeByte(this.f15217.m5981());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13678(C14677 c14677) {
        final boolean zM33585 = c14677.m33585();
        final boolean zM33586 = c14677.m33585();
        final String strM33591 = c14677.m33591();
        final String strM33592 = c14677.m33591();
        byte b = c14677.readByte();
        if (zM33585) {
            this.f15217.m5982(b);
            this.f15222.m5982(b);
        }
        C7050.m16212(new Runnable() { // from class: l.ۜۤᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C6061.m13654(this.f23693, zM33585, zM33586, strM33591, strM33592);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13654(C6061 c6061, boolean z, boolean z2, String str, String str2) {
        C14146 c14146 = c6061.f15233;
        View view = c6061.f15234;
        C7179 c7179 = c6061.f15237;
        c6061.m13656();
        int i = 8;
        c6061.f15218.setVisibility(z ? 0 : 8);
        View view2 = c6061.f15235;
        if (z && z2) {
            i = 0;
        }
        view2.setVisibility(i);
        c6061.m13655();
        c6061.f15227.mo7097();
        if (z) {
            c7179.m16508(str);
        }
        if (z2) {
            c6061.f15223.m16508(str2);
            c6061.f15225.setVisibility(0);
        }
        if (z) {
            view.setAlpha(0.26f);
            view.setEnabled(false);
            View view3 = c6061.f15221;
            if (c14146.m32505()) {
                view3.setAlpha(0.26f);
                view3.setEnabled(false);
            } else {
                view3.setAlpha(1.0f);
                view3.setEnabled(true);
            }
            if (c7179.m16521() != 0) {
                c6061.m13675();
            }
            if (!z2 || c14146.m32505()) {
                return;
            }
            view.setAlpha(1.0f);
            view.setEnabled(true);
        }
    }

    @Override // p067l.InterfaceC23850
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13672(boolean z) {
        View view = this.f15235;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f15225.setVisibility(0);
        View view2 = this.f15234;
        view2.setAlpha(1.0f);
        view2.setEnabled(true);
        C7179 c7179 = this.f15223;
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
        boolean zM13685 = m13685();
        C14146 c14146M22070 = this.f15231.m22070();
        C3397 c3397 = this.f15217;
        if (!zM13685) {
            if (this.f15233.f40275.mo11814() || this.f15232.f40275.mo11814()) {
                return;
            }
            byte bMo20199 = ApplicationC21448.f67649.mo20199((byte) 0, this.f15230 + "_bit");
            c3397.m5982(bMo20199);
            this.f15222.m5982(bMo20199);
            m13656();
            this.f15218.setVisibility(0);
            this.f15235.setVisibility(8);
            m13655();
            this.f15225.setVisibility(8);
            this.f15227.mo7097();
            View view = this.f15234;
            view.setAlpha(0.26f);
            view.setEnabled(false);
            boolean zM32505 = c14146M22070.m32505();
            View view2 = this.f15221;
            if (zM32505) {
                view2.setAlpha(0.26f);
                view2.setEnabled(false);
            } else {
                view2.setAlpha(1.0f);
                view2.setEnabled(true);
            }
        }
        C7179 c7179 = this.f15237;
        if (z) {
            c7179.requestFocus();
            C7050.m16226(c7179.m16514());
        }
        int[] iArrM32433 = c14146M22070.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        if (i != i2 && !z2) {
            try {
                String string = c14146M22070.m32500().subSequence(i, i2).toString();
                if (c3397.m5993()) {
                    string = C6112.m13905(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c7179.m16508(string);
                if (z) {
                    c7179.m16522();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM13685) {
            c7179.m16512();
            if (z) {
                c7179.m16522();
            }
        } else if (!z2) {
            return;
        }
        if (c7179.m16521() != 0) {
            m13675();
        } else {
            m13674();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m13685() {
        return this.f15218.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13681() {
        this.f15217.m5988();
        this.f15222.m5988();
        View view = this.f15218;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m13655();
            this.f15237.m16517();
            this.f15227.mo7097();
        }
        View view2 = this.f15235;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f15223.m16517();
        }
        this.f15225.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m13675() {
        this.f15224.removeMessages(0);
        m13659();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public void m13659() {
        if (m13685()) {
            C7179 c7179 = this.f15237;
            this.f15217.m5994(c7179.m16518().toString());
            this.f15222.m5994(c7179.m16518().toString());
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m13655() {
        View view = this.f15218;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        ActivityC4030 activityC4030 = this.f15219;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            activityC4030.getWindow().setNavigationBarColor(C23223.f72971);
        } else {
            activityC4030.getWindow().setNavigationBarColor(this.f15231.m22071().f40262.f76000);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13668(C11996 c11996) {
        this.f15228.m51643(c11996);
        this.f15240.m51643(c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13669(C14677 c14677) {
        this.f15228.m51644(c14677);
        this.f15240.m51644(c14677);
        C17143.m38825(this.f15236, this.f15233);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13666(Class cls) {
        this.f15228.m51654();
        this.f15240.m51640(cls);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m13683() {
        this.f15224.removeCallbacksAndMessages(null);
        this.f15217.m5988();
        this.f15222.m5988();
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180 = this.f15228;
        sharedPreferencesOnSharedPreferenceChangeListenerC23180.getClass();
        try {
            C7050.f18355.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC23180);
        } catch (Exception unused) {
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23181 = this.f15240;
        sharedPreferencesOnSharedPreferenceChangeListenerC23181.getClass();
        try {
            C7050.f18355.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC23181);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m13673() {
        return this.f15228.m51646() | this.f15240.m51646();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13679(MenuItem menuItem) {
        final SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23180;
        final SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23181;
        final C14146 c14146;
        final C14146 c14147;
        C9471 c9471 = this.f15231;
        C14146 c14146M22070 = c9471.m22070();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            c14146M22070.m32362();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146M22070.m32548();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146M22070.m32559();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c14146M22070.m32545();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo13664();
            return true;
        }
        ActivityC4030 activityC4030 = this.f15219;
        if (itemId == R.id.MT_Protector) {
            C14146 c14146M22071 = c9471.m22070();
            C17459 c17459 = new C17459(activityC4030, c14146M22071);
            c17459.m33344(R.string.MT_Protector);
            c17459.m33362(2);
            c17459.m33351("1…" + c14146M22071.m32365());
            c17459.m33330();
            c17459.m33365(2);
            c17459.m33352(true);
            return true;
        }
        C14146 c14148 = this.f15232;
        C14146 c14149 = this.f15233;
        if (itemId == R.id.MT_Protector) {
            boolean zM22068 = c9471.m22068();
            SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23182 = this.f15240;
            SharedPreferencesOnSharedPreferenceChangeListenerC23180 sharedPreferencesOnSharedPreferenceChangeListenerC23183 = this.f15228;
            if (zM22068) {
                sharedPreferencesOnSharedPreferenceChangeListenerC23181 = sharedPreferencesOnSharedPreferenceChangeListenerC23182;
                sharedPreferencesOnSharedPreferenceChangeListenerC23180 = sharedPreferencesOnSharedPreferenceChangeListenerC23183;
                c14147 = c14148;
                c14146 = c14149;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC23180 = sharedPreferencesOnSharedPreferenceChangeListenerC23182;
                sharedPreferencesOnSharedPreferenceChangeListenerC23181 = sharedPreferencesOnSharedPreferenceChangeListenerC23183;
                c14146 = c14148;
                c14147 = c14149;
            }
            final boolean zEquals = sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51652().equals(sharedPreferencesOnSharedPreferenceChangeListenerC23181.m51652());
            final String[] strArr = (String[]) C9038.m20936().toArray(new String[0]);
            final int iIndexOf = C9038.m20936().indexOf(sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51652());
            C20671 c20671BuildDialog = activityC4030.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46723(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.֫ۤᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (iIndexOf != i) {
                        String str = strArr[i];
                        sharedPreferencesOnSharedPreferenceChangeListenerC23180.m51649(str);
                        boolean zM51633 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51633();
                        C14146 c141410 = c14146;
                        if (zM51633) {
                            c141410.m32381(str, true);
                        }
                        c141410.m32492(str);
                        if (zEquals) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC23181.m51649(str);
                            boolean zM51634 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51633();
                            C14146 c141411 = c14147;
                            if (zM51634) {
                                c141411.m32381(str, true);
                            }
                            c141411.m32492(str);
                        }
                    }
                    dialogInterface.dismiss();
                }
            });
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732().m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۤᩳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6061.m13650(this.f35938);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m13666(ActivityC4701.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m13684();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean zM32501 = c14149.m32501();
            boolean z = !zM32501;
            c14149.m32446(z);
            c14148.m32446(z);
            menuItem.setChecked(z);
            if (!zM32501) {
                DialogInterfaceOnClickListenerC12648.m29079(R.string.MT_Protector, activityC4030, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C17143.m38806(menuItem, c14146M22070);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C17833)) {
            return false;
        }
        ((C17833) title).m40496().mo10846(c14146M22070);
        return true;
    }
}
