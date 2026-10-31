package l;

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
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܶ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C15545 implements InterfaceC22602 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean f47911 = ApplicationC20075.f65008.getBoolean("sesrt", true);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47912 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f47913;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f47914;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f47915;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13008 f47916;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public MenuItem f47917;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f47918;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13008 f47919;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View f47920;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5062 f47921;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C1082 f47922;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C13008 f47923;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C13008 f47924;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8491 f47925;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14134 f47926;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final View f47927;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13008 f47928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f47929;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1366 f47930;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12392 f47931;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13008 f47932;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f47933;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f47934;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5062 f47935;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HandlerC0912 f47936;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f47937;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC21897 f47938;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36647(C15545 c15545) {
        c15545.getClass();
        AbstractActivityC3346 abstractActivityC3346 = c15545.f47915;
        abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC23269.class));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36648(C15545 c15545, int i, String[] strArr, DialogInterface dialogInterface, int i2) {
        c15545.getClass();
        if (i != i2) {
            String str = strArr[i2];
            c15545.m36687(str);
            c15545.f47931.m30428(str);
        }
        dialogInterface.dismiss();
    }

    public C15545(ActivityC17169 activityC17169, C12392 c12392, View view) {
        this(activityC17169, c12392, "code", new C4236(4, view));
    }

    public C15545(AbstractActivityC3346 abstractActivityC3346, C12392 c12392, String str, InterfaceC8491 interfaceC8491) {
        this.f47936 = new HandlerC0912(this, new C8083());
        this.f47915 = abstractActivityC3346;
        this.f47931 = c12392;
        this.f47918 = str;
        this.f47938 = new SharedPreferencesOnSharedPreferenceChangeListenerC21897(abstractActivityC3346, c12392);
        this.f47925 = interfaceC8491;
        View viewMo12760 = interfaceC8491.mo12760();
        this.f47927 = viewMo12760;
        this.f47920 = viewMo12760.findViewById(R.id.MT_Protector);
        this.f47913 = viewMo12760.findViewById(R.id.MT_Protector);
        this.f47933 = viewMo12760.findViewById(R.id.MT_Protector);
        C5062 c5062 = (C5062) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47935 = c5062;
        C5062 c5063 = (C5062) viewMo12760.findViewById(R.id.edtReplaceWord);
        this.f47921 = c5063;
        C13008 c13008 = (C13008) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47932 = c13008;
        C13008 c13009 = (C13008) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47924 = c13009;
        C13008 c130010 = (C13008) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47919 = c130010;
        C13008 c130011 = (C13008) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47923 = c130011;
        C13008 c130012 = (C13008) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47916 = c130012;
        C13008 c130013 = (C13008) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47928 = c130013;
        TextView textView = (TextView) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47934 = textView;
        this.f47937 = (TextView) viewMo12760.findViewById(R.id.MT_Protector);
        C1366 c1366 = (C1366) viewMo12760.findViewById(R.id.MT_Protector);
        this.f47930 = c1366;
        if (!f47911) {
            ((ViewGroup) viewMo12760).removeView(c1366);
        }
        textView.setOnClickListener(new ViewOnClickListenerC7080(0, abstractActivityC3346, this));
        c5062.m14602(str.concat("_s"), (String) null);
        c5063.m14602(str.concat("_r"), (String) null);
        C1082 c1082 = new C1082(abstractActivityC3346, c12392);
        this.f47922 = c1082;
        final C22249 c22249 = new C22249((TextView) viewMo12760.findViewById(R.id.MT_Protector));
        c1082.m3715(new C4258(this, c22249));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۟ۨᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15545.m36650(this.f22875, view);
            }
        };
        c12392.m30322(new C2141(this));
        c130012.m31589(new InterfaceC3131() { // from class: l.ۧ᩺ᩳ
            @Override // l.InterfaceC3131
            /* JADX INFO: renamed from: ֫ */
            public final void mo9554(C13008 c130014, boolean z, boolean z2) {
                C15545.m36656(this.f33872, c22249, z, z2);
            }
        });
        C6410 c6410 = new C6410(this, c22249);
        c13008.m31589(c6410);
        c13009.m31589(c6410);
        c130010.m31589(c6410);
        c130011.m31589(c6410);
        c130013.m31589(c6410);
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        for (int i = 0; i < 5; i++) {
            View viewFindViewById = viewMo12760.findViewById(iArr[i]);
            C19890.m45741(viewFindViewById);
            viewFindViewById.setOnClickListener(onClickListener);
        }
        this.f47935.m14600(new C19075(this));
        c12392.m30315(new Runnable() { // from class: l.ܽ᩺ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f52038.m36672();
            }
        });
        c12392.m30330(new InterfaceC8035() { // from class: l.ᩳ᩺ᩳ
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫ */
            public final void mo1646(int i2, int i3) {
                this.f57068.m36672();
            }
        });
        m36692();
        c12392.m30344(this);
        m36671();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36653(final C15545 c15545, AbstractActivityC3346 abstractActivityC3346, View view) {
        TextView textView = c15545.f47934;
        if (f47911) {
            f47911 = false;
            C22870.m50970(ApplicationC20075.f65008, "sesrt", false);
            c15545.f47930.setVisibility(8);
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        boolean z = !c15545.f47937.getText().toString().equals("0");
        C21282 c21282 = new C21282(abstractActivityC3346, view, 0);
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.setOptionalIconsVisible(true);
        c3060M48304.setGroupDividerEnabled(true);
        C12937.m31442(c3060M48304, R.string.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
        c3060M48304.add(R.string.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ܿ᩺ᩳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C15545.m36649(this.f54028, menuItem);
                return true;
            }
        });
        C19871.m45698(c21282).m42637();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36649(C15545 c15545, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            String string = ApplicationC20075.f65008.getString("srep", "$0\\n");
            new C5669(c15545, c15545.f47915, string.trim().isEmpty() ? "$0\\n" : string);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c15545.m36644(1);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c15545.m36644(2);
        } else if (itemId == R.string.MT_Protector) {
            c15545.m36644(3);
        } else if (itemId == R.string.MT_Protector) {
            c15545.m36644(4);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m36692() {
        InterfaceC2494 interfaceC2494Mo12761 = this.f47925.mo12761();
        this.f47928.setVisibility(interfaceC2494Mo12761 == null ? 8 : 0);
        this.f47922.m3714(interfaceC2494Mo12761);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36683(InterfaceC23586 interfaceC23586, C4301 c4301, Class cls) {
        c4301.m12889(interfaceC23586, new C2847(this, cls), this.f47935.m14607(), this.f47921.m14607());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36677(String str) {
        this.f47938.m49288(str);
        m36664(this.f47917, this.f47931);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36675(MenuItem menuItem) {
        this.f47917 = menuItem;
        m36664(menuItem, this.f47931);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36664(MenuItem menuItem, C12392 c12392) {
        if (menuItem == null) {
            return;
        }
        RunnableC6583 runnableC6583 = new RunnableC6583(menuItem, c12392);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnableC6583.run();
        } else {
            C4925.m14315(runnableC6583);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36696() {
        MenuItem menuItem = this.f47917;
        menuItem.setChecked(!menuItem.isChecked());
        boolean zIsChecked = this.f47917.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = this.f47938;
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49292(zIsChecked);
        this.f47931.m30340(sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49298(), new RunnableC2535(1, this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36665(C15545 c15545) {
        C12392 c12392 = c15545.f47931;
        c12392.scrollTo(0, c12392.m30408());
        c12392.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36651(C15545 c15545, PatternSyntaxException patternSyntaxException) {
        C19258 c19258BuildDialog = c15545.f47915.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(C11459.m28258(patternSyntaxException));
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36650(C15545 c15545, View view) {
        C5062 c5062 = c15545.f47921;
        C5062 c5063 = c15545.f47935;
        C1082 c1082 = c15545.f47922;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c1082.m3719(c5063.m14611().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            c1082.m3712(c5063.m14611().toString());
            return;
        }
        if (id == R.id.MT_Protector) {
            if (c15545.mo11736(false)) {
                return;
            }
            c1082.m3713(c5063.m14611().toString(), c5062.m14611().toString());
        } else if (id == R.id.MT_Protector) {
            c1082.m3720(c5063.m14611().toString(), c5062.m14611().toString());
        } else if (id == R.id.MT_Protector) {
            c15545.m36693();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36657(C15545 c15545, boolean z) {
        c15545.m36659();
        C13008 c13008 = c15545.f47916;
        c13008.setVisibility(z ? 0 : 8);
        c13008.m31590(z, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36656(C15545 c15545, C22249 c22249, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        c15545.f47931.m30464();
        c15545.m36686();
        c22249.m49964(R.string.MT_Protector, 2000);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36655(C15545 c15545, C22249 c22249, C13008 c13008, boolean z, boolean z2) {
        String str = c15545.f47918;
        C1082 c1082 = c15545.f47922;
        int id = c13008.getId();
        if (id == R.id.MT_Protector) {
            c1082.m3728(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC20075.f65008.edit().mo25852(c1082.m3710(), C16014.m37867(str, "_bit")).apply();
            c15545.m36686();
            return;
        }
        if (id == R.id.MT_Protector) {
            c1082.m3726(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC20075.f65008.edit().mo25852(c1082.m3710(), C16014.m37867(str, "_bit")).apply();
            c15545.m36686();
            return;
        }
        if (id == R.id.MT_Protector) {
            c1082.m3716(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector : R.string.MT_Protector);
            }
            ApplicationC20075.f65008.edit().mo25852(c1082.m3710(), C16014.m37867(str, "_bit")).apply();
            c15545.m36686();
            return;
        }
        if (id == R.id.MT_Protector) {
            c1082.m3724(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector : R.string.MT_Protector);
                if (z) {
                    DialogInterfaceOnClickListenerC10816.m27036(R.string.MT_Protector, c15545.f47915, "page_search");
                }
            }
            ApplicationC20075.f65008.edit().mo25852(c1082.m3710(), C16014.m37867(str, "_bit")).apply();
            return;
        }
        if (id == R.id.MT_Protector) {
            c1082.m3721(z);
            if (z2) {
                c22249.m49964(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
            }
            ApplicationC20075.f65008.edit().mo25852(c1082.m3710(), C16014.m37867(str, "_bit")).apply();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m36643() {
        C1082 c1082 = this.f47922;
        this.f47932.m31590(c1082.m3722(), false);
        this.f47924.m31590(c1082.m3725(), false);
        this.f47919.m31590(c1082.m3730(), false);
        this.f47923.m31590(c1082.m3729(), false);
        this.f47928.m31590(c1082.m3727(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m36659() {
        C14134 c14134 = this.f47926;
        if (c14134 != null) {
            c14134.m33740();
            this.f47926 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36644(int i) {
        m36659();
        if (this.f47929 || this.f47914) {
            return;
        }
        C12392 c12392 = this.f47931;
        if (i == 3 && c12392.m30441()) {
            return;
        }
        final String string = this.f47935.m14611().toString();
        String string2 = ApplicationC20075.f65008.getString("srep", "$0\\n");
        String str = string2.trim().isEmpty() ? "$0\\n" : string2;
        final int iM3718 = this.f47922.m3718();
        final C12973 c12973M30518 = c12392.m30518();
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int iMo26548 = interfaceC7785M30436.mo26548();
        final String str2 = str;
        C14134 c14134 = new C14134(c12392, this.f47915, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ܳ᩺ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C15545.m36658(this.f45260, string, iM3718, c12973M30518, str2);
            }
        });
        this.f47926 = c14134;
        new C0729(this, c14134, interfaceC7785M30436, iMo26548, string, iM3718, str, c12973M30518, i).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36658(C15545 c15545, String str, int i, C12973 c12973, String str2) {
        if (c15545.f47929 || c15545.f47914 || !str.contentEquals(c15545.f47935.m14611()) || i != c15545.f47922.m3718() || !C11003.equals(c12973, c15545.f47931.m30518())) {
            return false;
        }
        String string = ApplicationC20075.f65008.getString("srep", "$0\\n");
        return str2.equals(string.trim().isEmpty() ? "$0\\n" : string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m36672() {
        if (m36691()) {
            int iM14614 = this.f47935.m14614();
            TextView textView = this.f47937;
            TextView textView2 = this.f47934;
            if (iM14614 != 0) {
                C12392 c12392 = this.f47931;
                C6458 c6458 = c12392.f37173;
                int[] iArrM30369 = c12392.m30369();
                C16335 c16335M17850 = c6458.m17850(c12392.getContext(), iArrM30369[0], iArrM30369[1]);
                if (f47911 && c16335M17850.size() >= 10) {
                    textView2.getPaint().setUnderlineText(true);
                    textView2.invalidate();
                    C1366 c1366 = this.f47930;
                    if (c1366.getVisibility() == 8) {
                        c1366.measure(0, 0);
                        c1366.m4836().m15890((textView2.getWidth() / 2.0f) / c1366.getMeasuredWidth());
                        c1366.setVisibility(0);
                        c1366.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(c1366, "alpha", 0.0f, 1.0f).setDuration(150L).start();
                    }
                }
                if (c16335M17850.m38477()) {
                    textView2.setTextColor(C21943.f70273);
                    textView.setTextColor(C21943.f70273);
                } else if (c16335M17850.m38479()) {
                    textView2.setTextColor(C21943.f70263);
                    textView.setTextColor(C21943.f70263);
                } else {
                    textView2.setTextColor(C21943.f70275);
                    textView.setTextColor(C21943.f70275);
                }
                String strM38478 = c16335M17850.m38478();
                if (TextUtils.equals(strM38478, textView.getText())) {
                    return;
                }
                textView.setText(strM38478);
                return;
            }
            if (!TextUtils.equals("0", textView.getText())) {
                textView.setText("0");
            }
            textView2.setTextColor(C21943.f70273);
            textView.setTextColor(C21943.f70273);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36688(C10130 c10130) {
        boolean z = false;
        boolean z2 = this.f47927.getVisibility() == 0;
        if (z2 && this.f47920.getVisibility() == 0) {
            z = true;
        }
        C5062 c5062 = this.f47935;
        if (z2) {
            c5062.m14610();
        }
        C5062 c5063 = this.f47921;
        if (z) {
            c5063.m14610();
        }
        c10130.m25425(z2);
        c10130.m25425(z);
        c10130.m25423((CharSequence) (z2 ? c5062.m14611().toString() : ""));
        c10130.m25423((CharSequence) (z ? c5063.m14611().toString() : ""));
        c10130.mo13231(29298);
        c10130.writeByte(this.f47922.m3710());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36689(C12951 c12951) {
        byte bByteValue;
        C3280 c3280M10090 = C3280.m10090(c12951);
        if (c3280M10090.f10322) {
            Byte b = c3280M10090.f10319;
            if (b == null) {
                bByteValue = ApplicationC20075.f65008.mo18251((byte) 0, this.f47918 + "_bit");
            } else {
                bByteValue = b.byteValue();
            }
            this.f47922.m3711(bByteValue);
        }
        C4925.m14315(new RunnableC15602(2, this, c3280M10090));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m36646(C3280 c3280, Runnable runnable) {
        boolean z = c3280.f10322;
        boolean z2 = c3280.f10323;
        runnable.run();
        m36643();
        int i = 8;
        this.f47927.setVisibility(z ? 0 : 8);
        if (z && z2) {
            i = 0;
        }
        this.f47920.setVisibility(i);
        m36671();
        C5062 c5062 = this.f47935;
        if (z) {
            c5062.m14601(c3280.f10321);
            runnable.run();
        }
        if (z2) {
            this.f47921.m14601(c3280.f10320);
            runnable.run();
            this.f47923.setVisibility(0);
        }
        C12392 c12392 = this.f47931;
        if (z) {
            View view = this.f47913;
            view.setEnabled(false);
            this.f47933.setEnabled(!c12392.m30441());
            if (c5062.m14614() != 0) {
                m36686();
            }
            if (z2 && !c12392.m30441()) {
                view.setEnabled(true);
            }
        } else {
            c12392.m30464();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36680(C2931 c2931, C4691 c4691, C4342 c4342, C21565 c21565) {
        if (this.f47929 || this.f47914) {
            throw new IllegalStateException("Editor helper cannot prepare session state");
        }
        this.f47931.m30324(c2931, this.f47938.m49285(c4691), c4342, c21565);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36679(C2931 c2931, C4691 c4691, C3280 c3280) {
        byte bByteValue;
        C12392 c12392 = this.f47931;
        c12392.m30377();
        if (this.f47929 || this.f47914) {
            throw new IllegalStateException("Editor helper cannot restore session state");
        }
        final InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        Runnable runnable = new Runnable() { // from class: l.᩻᩺ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C15545.m36654(this.f77821, interfaceC7785M30436);
            }
        };
        this.f47914 = true;
        HandlerC0912 handlerC0912 = this.f47936;
        handlerC0912.removeCallbacksAndMessages(null);
        try {
            boolean zM30353 = c12392.m30353(c2931);
            SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = this.f47938;
            if (!zM30353) {
                c12392.m30323(c2931, sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49285(c4691));
            }
            runnable.run();
            sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49286();
            m36664(this.f47917, c12392);
            if (c3280.f10322) {
                C1082 c1082 = this.f47922;
                Byte b = c3280.f10319;
                if (b == null) {
                    bByteValue = ApplicationC20075.f65008.mo18251((byte) 0, this.f47918 + "_bit");
                } else {
                    bByteValue = b.byteValue();
                }
                c1082.m3711(bByteValue);
            }
            m36646(c3280, runnable);
            handlerC0912.removeCallbacksAndMessages(null);
            this.f47914 = false;
            m36686();
        } catch (Throwable th) {
            handlerC0912.removeCallbacksAndMessages(null);
            this.f47914 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36654(C15545 c15545, InterfaceC7785 interfaceC7785) {
        if (c15545.f47929 || c15545.f47931.m30436() != interfaceC7785) {
            throw new CancellationException("Editor owner changed during restoration");
        }
    }

    @Override // l.InterfaceC22602
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11736(boolean z) {
        View view = this.f47920;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f47923.setVisibility(0);
        this.f47913.setEnabled(true);
        C5062 c5062 = this.f47921;
        c5062.requestFocus();
        c5062.m14605();
        c5062.m14615();
        if (z) {
            C4925.m14329(c5062.m14607());
        }
        return true;
    }

    @Override // l.InterfaceC22602
    /* JADX INFO: renamed from: ֫ */
    public final void mo11728() {
        mo11735(true, false);
    }

    @Override // l.InterfaceC22602
    /* JADX INFO: renamed from: ۧ */
    public final void mo11740() {
        mo11735(false, false);
    }

    @Override // l.InterfaceC22602
    /* JADX INFO: renamed from: ֫ */
    public final void mo11735(boolean z, boolean z2) {
        boolean zM36691 = m36691();
        C1082 c1082 = this.f47922;
        C12392 c12392 = this.f47931;
        if (!zM36691) {
            if (c12392.f37258.mo9770()) {
                return;
            }
            c1082.m3711(ApplicationC20075.f65008.mo18251((byte) 0, this.f47918 + "_bit"));
            m36643();
            this.f47927.setVisibility(0);
            this.f47920.setVisibility(8);
            m36671();
            this.f47923.setVisibility(8);
            this.f47913.setEnabled(false);
            this.f47933.setEnabled(!c12392.m30441());
        }
        C5062 c5062 = this.f47935;
        if (z) {
            c5062.requestFocus();
            C4925.m14329(c5062.m14607());
        }
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        if (i != i2 && !z2) {
            try {
                String string = c12392.m30436().subSequence(i, i2).toString();
                if (c1082.m3722()) {
                    string = C3939.m11985(string).replace("\r", "\\r").replace("\t", "\\t");
                }
                c5062.m14601(string);
                if (z) {
                    c5062.m14615();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!zM36691) {
            c5062.m14605();
            if (z) {
                c5062.m14615();
            }
        } else if (!z2) {
            return;
        }
        if (c5062.m14614() != 0) {
            m36686();
        } else {
            m36672();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m36691() {
        return this.f47927.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36693() {
        m36659();
        C12392 c12392 = this.f47931;
        c12392.m30464();
        this.f47922.m3717();
        View view = this.f47927;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m36671();
            this.f47935.m14610();
        }
        View view2 = this.f47920;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f47921.m14610();
        }
        if (f47911) {
            this.f47930.setVisibility(8);
            TextView textView = this.f47934;
            if (textView.getPaint().isUnderlineText()) {
                textView.getPaint().setUnderlineText(false);
                textView.invalidate();
            }
        }
        this.f47923.setVisibility(8);
        c12392.requestFocus();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m36686() {
        m36659();
        this.f47936.removeMessages(0);
        m36660();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m36660() {
        if (this.f47929 || this.f47914 || !m36691()) {
            return;
        }
        this.f47922.m3723(this.f47935.m14611().toString());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m36671() {
        View view = this.f47927;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        AbstractActivityC3346 abstractActivityC3346 = this.f47915;
        if (zIsAttachedToWindow && view.getVisibility() == 0) {
            abstractActivityC3346.getWindow().setNavigationBarColor(C21943.f70259);
        } else {
            abstractActivityC3346.getWindow().setNavigationBarColor(this.f47931.f37245.f73275);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36681(C10130 c10130) {
        this.f47938.m49290(c10130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36682(C12951 c12951) {
        this.f47938.m49291(c12951);
        m36664(this.f47917, this.f47931);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36678(String str, boolean z) {
        this.f47938.m49289(str, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36676(Class cls) {
        this.f47938.m49287(cls);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36695() {
        this.f47929 = true;
        m36659();
        this.f47922.m3717();
        this.f47936.removeCallbacksAndMessages(null);
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = this.f47938;
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.getClass();
        try {
            C4925.f15523.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC21897);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m36684() {
        return this.f47938.m49293();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36687(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = this.f47938;
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49296(str);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49302() || SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49280()) {
            this.f47931.m30317(str, true);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m36685() {
        this.f47938.m49294();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m36694() {
        return this.f47938.m49299();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m36697() {
        C1435 c1435 = new C1435(this, this.f47915);
        c1435.m31258(R.string.MT_Protector);
        c1435.m31276(2);
        c1435.m31265("1…" + this.f47931.m30301());
        c1435.m31244();
        c1435.m31279(2);
        c1435.m31266(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36690(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C12392 c12392 = this.f47931;
        if (itemId == R.id.MT_Protector) {
            c12392.m30298();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c12392.m30484();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c12392.m30495();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c12392.m30481();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo11728();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m36697();
            return true;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f47915;
        if (itemId == R.id.MT_Protector) {
            final String[] strArr = (String[]) C7017.m18979().toArray(new String[0]);
            final int iIndexOf = C7017.m18979().indexOf(this.f47938.m49299());
            C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44429(strArr, iIndexOf, new DialogInterface.OnClickListener() { // from class: l.᩷᩺ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C15545.m36648(this.f68297, iIndexOf, strArr, dialogInterface, i);
                }
            });
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۢ᩺ᩳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15545.m36647(this.f29953);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m36676(ActivityC10714.class);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m36696();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            c12392.m30382(!c12392.m30437());
            menuItem.setChecked(c12392.m30437());
            if (c12392.m30437()) {
                DialogInterfaceOnClickListenerC10816.m27034(R.string.MT_Protector, abstractActivityC3346, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m36645(menuItem, c12392);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C16271)) {
            return false;
        }
        ((C16271) title).m38282().mo8779(c12392);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36645(MenuItem menuItem, C12392 c12392) {
        int i;
        int i2;
        MenuItem menuItemAdd;
        boolean z = (c12392.m30370() || c12392.m30441()) ? false : true;
        boolean z2 = c12392.m30526() == 0;
        int iM30444 = c12392.m30444();
        int iM30448 = c12392.m30448();
        if (iM30444 > iM30448) {
            i2 = iM30444;
            i = iM30448;
        } else {
            i = iM30444;
            i2 = iM30448;
        }
        SubMenu subMenu = menuItem.getSubMenu();
        subMenu.clear();
        List<AbstractC2867> listM2884 = C0749.m2884();
        Map mapM2886 = C0749.m2886();
        SubMenu subMenu2 = null;
        for (AbstractC2867 abstractC2867 : listM2884) {
            Integer num = (Integer) mapM2886.get(abstractC2867.mo8778());
            if (num != null && abstractC2867.mo8780(c12392, z, z2, i, i2)) {
                if (num.intValue() >= 300) {
                    if (subMenu2 == null) {
                        SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, 0, 65535, R.string.MT_Protector);
                        subMenuAddSubMenu.setIcon(R.drawable.MT_Protector);
                        subMenu2 = subMenuAddSubMenu;
                    }
                    menuItemAdd = subMenu2.add(0, 0, num.intValue(), abstractC2867.mo8781());
                } else {
                    menuItemAdd = subMenu.add(0, 0, num.intValue(), abstractC2867.mo8781());
                }
                menuItemAdd.setIcon(abstractC2867.mo8777(c12392.getContext()));
            }
        }
    }
}
