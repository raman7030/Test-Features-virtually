package p067l;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0719o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C8362 extends AbstractC16003 implements InterfaceC22169, InterfaceC2787, InterfaceC6075 {

    /* JADX INFO: renamed from: ۚ֫ */
    public static final /* synthetic */ int f22369 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public C5946 f22371;

    /* JADX INFO: renamed from: ֫֫ */
    public C6941 f22372;

    /* JADX INFO: renamed from: ۖ֫ */
    public C13992 f22373;

    /* JADX INFO: renamed from: ۗ */
    public boolean f22374;

    /* JADX INFO: renamed from: ۘ֫ */
    public String f22375;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceMenuItemC1528 f22376;

    /* JADX INFO: renamed from: ۛ */
    public C14146 f22377;

    /* JADX INFO: renamed from: ۜ֫ */
    public InterfaceMenuItemC1528 f22378;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceMenuItemC1528 f22379;

    /* JADX INFO: renamed from: ۡ֫ */
    public InterfaceMenuItemC1528 f22380;

    /* JADX INFO: renamed from: ۢ֫ */
    public TextView f22381;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceMenuItemC1528 f22382;

    /* JADX INFO: renamed from: ۧ֫ */
    public TextView f22383;

    /* JADX INFO: renamed from: ۨ */
    public C17143 f22384;

    /* JADX INFO: renamed from: ۫ */
    public C14121 f22385;

    /* JADX INFO: renamed from: ۬ */
    public String f22386;

    /* JADX INFO: renamed from: ܰ */
    public C20223 f22387;

    /* JADX INFO: renamed from: ܳ֫ */
    public C20699 f22388;

    /* JADX INFO: renamed from: ܺ֫ */
    public C6456 f22389;

    /* JADX INFO: renamed from: ܽ֫ */
    public volatile boolean f22390;

    /* JADX INFO: renamed from: ܿ֫ */
    public View f22391;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f22392;

    /* JADX INFO: renamed from: ᩴ֫ */
    public InterfaceMenuItemC1528 f22393;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f22394;

    /* JADX INFO: renamed from: ᩷֫ */
    public InterfaceMenuItemC1528 f22395;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f22396;

    /* JADX INFO: renamed from: ᩻֫ */
    public ViewOnClickListenerC21674 f22397;

    /* JADX INFO: renamed from: ֨֫ */
    public static final C13259 f22368 = C13259.m30303(8, "^[ \\t]*((fill-array-data|goto|packed-switch|sparse-switch|if-).+|-?0[xX][0-9a-fA-F]+ *-> *)?(:[\\w$]+)[ \\t]*(#.*)?$");

    /* JADX INFO: renamed from: ۠֫ */
    public static final C13259 f22370 = C13259.m30303(8, "^[ \\t]*\\.catch.*\\{.*(:[\\w$]+).*\\.\\..*(:[\\w$]+).*\\}.*(:[\\w$]+)[ \\t]*(#.*)?$");

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo16322() {
        return true;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܳ */
    public final int mo16324() {
        return R.drawable.MT_Protector;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo19372() {
        return true;
    }

    public C8362() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܺ */
    public final String mo16325() {
        if (this.f22375 == null) {
            this.f22375 = C8597.m20011(80, C15993.m36343(m19360()));
        }
        return this.f22375;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩷ */
    public final String mo16326() {
        if (!this.f46351.getBoolean("changed", false)) {
            return mo16325();
        }
        return "*" + mo16325();
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۜ */
    public final String mo16323() {
        return C8597.m20011(150, m19360());
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo19366() {
        return this.f46351.getBoolean("changed", false);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֫ */
    public final void mo19363(C5946 c5946) {
        c5946.m13319(m19360());
    }

    /* JADX INFO: renamed from: ֨ */
    public final String m19360() {
        String string = requireArguments().getString("classpath");
        C12826.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m19370(String str) {
        m36367((String) null);
        requireArguments().putString("classpath", str);
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22371 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f22373 = (C13992) new C6874(requireActivity()).m15765(C13992.class);
        this.f22387 = C20894.m47200(this, new C21764(this));
    }

    @Override // p067l.ComponentCallbacksC11117
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM42612 = ((ActivityC18686) requireActivity()).m42612(R.layout.MT_Protector);
        if (viewM42612 == null) {
            viewM42612 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C12826.requireNonNull(viewM42612);
        }
        C7050.m16213(new RunnableC6357(5, this), 600L);
        return viewM42612;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f22374 = false;
        this.f22391 = view.findViewById(R.id.MT_Protector);
        this.f22377 = (C14146) view.findViewById(R.id.MT_Protector);
        this.f22383 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f22381 = (TextView) view.findViewById(R.id.MT_Protector);
        C17143 c17143 = new C17143((ActivityC18686) requireActivity(), this.f22377, view);
        this.f22384 = c17143;
        c17143.m38839("edit_word_wrap_smali", false);
        this.f22389 = new C6456(view, this.f22377);
        this.f22384.m38844(getViewLifecycleOwner(), this.f22389, ActivityC12551.class);
        C6941 c6941 = new C6941();
        this.f22372 = c6941;
        c6941.mo10030(C11084.m25530(getViewLifecycleOwner()));
        this.f22397 = new ViewOnClickListenerC21674(this, this.f22377, this.f22372);
        this.f22372.mo10029(new C22661(this));
        this.f22377.m32398(new C20433(this));
        this.f22377.m32392(new C21104(this));
        this.f22377.m32402(new C2997(this));
        this.f22377.m32394(new InterfaceC10005() { // from class: l.ۡ᩷ۢ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i, int i2) {
                C8362.m19310(this.f30590, i, i2);
            }
        });
        this.f22377.m32384((InterfaceC2746) new C5680(this));
        this.f22383.setText(mo16326());
        if (this.f46351.getBoolean("changed", false)) {
            this.f22383.setTextColor(C23223.f72972);
        }
        final C13929 c13929Matcher = C13259.m30303(8, "^\\.class ([a-z\\-]+ )*L([^;]+);").matcher((CharSequence) "");
        this.f22383.setOnClickListener(new ViewOnClickListenerC20973(1, this, c13929Matcher));
        this.f22383.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܺ᩷ۢ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C8362.m19312(this.f53011, c13929Matcher);
                return true;
            }
        });
        m19356();
        this.f22381.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ᩷ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11453.f22397.m48914();
            }
        });
        this.f22394 = true;
        this.f22389.m14752();
        this.f22371.m13355().m4066(getViewLifecycleOwner(), new InterfaceC3326() { // from class: l.ۘ᩷ۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C8362.m19315(this.f16457, (C14121) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19311(C8362 c8362, List list, List list2, List list3, List list4) {
        if (c8362.f22394) {
            c8362.f22397.m48913(list, list3, list2, list4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19310(C8362 c8362, int i, int i2) {
        C6941 c6941 = c8362.f22372;
        if (c6941 != null) {
            c6941.mo10028(i, i2, c8362);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19313(final C8362 c8362, C13929 c13929, View view) {
        String strM19360;
        C1898 c1898 = new C1898(c8362.requireContext(), view, 0);
        c13929.m56473reset((CharSequence) c8362.f22377.m32500());
        if (c13929.find()) {
            strM19360 = c13929.group(2);
        } else {
            strM19360 = c8362.m19360();
        }
        final C24375 c24375 = new C24375(c1898, strM19360, false);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۜ᩷ۢ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C8362.m19317(this.f24513, c24375, menuItem);
                return true;
            }
        });
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19317(C8362 c8362, C24375 c24375, MenuItem menuItem) {
        if (c24375.m53728(menuItem)) {
            return;
        }
        c8362.f22371.m13319(c8362.m19360());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19312(C8362 c8362, C13929 c13929) {
        String strM19360;
        c13929.m56473reset((CharSequence) c8362.f22377.m32500());
        if (c13929.find()) {
            strM19360 = c13929.group(2);
        } else {
            strM19360 = c8362.m19360();
        }
        C20671 c20671BuildDialog = ((ActivityC18686) c8362.requireActivity()).buildDialog();
        c20671BuildDialog.m46718(strM19360);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19315(C8362 c8362, C14121 c14121) {
        c8362.f22385 = c14121;
        if (!c8362.f22394) {
            c8362.f22390 = true;
        } else {
            new C3668(c8362, c8362.m19360()).m22250();
        }
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۡ */
    public final C14146 mo19367() {
        if (this.f22392) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f22394) {
            return this.f22377;
        }
        return null;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f22394 = false;
        C6941 c6941 = this.f22372;
        if (c6941 != null) {
            c6941.close();
        }
        C14146 c14146 = this.f22377;
        if (c14146 != null) {
            c14146.m32450();
        }
        C17143 c17143 = this.f22384;
        if (c17143 != null) {
            c17143.m38856();
        }
        this.f22391 = null;
        this.f22389 = null;
        this.f22377 = null;
        this.f22384 = null;
        this.f22397 = null;
        this.f22372 = null;
        this.f22383 = null;
        this.f22381 = null;
        this.f22379 = null;
        this.f22376 = null;
        this.f22378 = null;
        this.f22382 = null;
        this.f22380 = null;
        this.f22393 = null;
        this.f22395 = null;
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC18686) requireActivity()).m42585((CharSequence) null);
        ((ActivityC18686) requireActivity()).m12272(this.f22377);
        C17143 c17143 = this.f22384;
        if (c17143 != null && c17143.m38845() && this.f22394) {
            this.f22389.m14752();
        }
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onPause() {
        super.onPause();
        C14146 c14146 = this.f22377;
        if (c14146 != null) {
            c14146.m32507();
        }
        ((ActivityC18686) requireActivity()).m12270();
    }

    @Override // p067l.ComponentCallbacksC11117, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C14146 c14146 = this.f22377;
        if (c14146 != null) {
            c14146.m32507();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19365(C20699 c20699) {
        this.f22388 = c20699;
        if (c20699 != null && this.f22394 && this.f22374) {
            if (c20699.f63908) {
                this.f22377.m32580();
            }
            C1446.m31704(this.f22394);
            C20699 c206910 = this.f22388;
            if (c206910 == null) {
                return;
            }
            this.f22388 = null;
            c206910.m46768(this.f22377);
            this.f22377.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public static void m19355(C8362 c8362) {
        C1446.m31704(c8362.f22394);
        C20699 c20699 = c8362.f22388;
        if (c20699 == null) {
            return;
        }
        c8362.f22388 = null;
        c20699.m46768(c8362.f22377);
        c8362.f22377.requestFocus();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC1983 interfaceMenuC1983 = (InterfaceMenuC1983) menu;
        this.f22395 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22393 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22380 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22382 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22378 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22376 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22379 = (InterfaceMenuItemC1528) interfaceMenuC1983.findItem(R.id.MT_Protector);
        this.f22395.setEnabled(this.f22377.m32360());
        this.f22393.setEnabled(this.f22377.m32447());
        this.f22380.setEnabled(this.f22377.m32361());
        this.f22382.setEnabled(!this.f22377.m32505());
        this.f22378.setChecked(this.f22377.m32505());
        this.f22384.m38836(interfaceMenuC1983.findItem(R.id.MT_Protector));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence, l.۟᩸ᩳ] */
    /* JADX WARN: Type inference failed for: r1v11, types: [l.۟᩸ᩳ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    @Override // p067l.ComponentCallbacksC11117
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        C3422 c3422;
        C3422 c3423;
        ?? r1;
        if (this.f22396 || this.f22392) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f22377.m32507();
        int itemId = menuItem.getItemId();
        boolean z2 = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f22377.m32501());
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (C24414.m53850() && ApplicationC21448.f67649.getBoolean("cc", true)) {
                z2 = true;
            }
            menuItemFindItem.setChecked(z2);
            this.f22376.setEnabled(this.f22377.m32438());
            this.f22379.setEnabled(this.f22377.m32578());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String strM36343 = C15993.m36343(m19360());
            if (strM36343.length() > 50) {
                strM36343 = strM36343.substring(0, 50);
            }
            this.f22387.m45709(strM36343 + ".smali");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f22397.m48914();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!C24414.m53850()) {
                C22682.m50793(R.string.MT_Protector);
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC21448.f67649.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC18686 activityC18686 = (ActivityC18686) requireActivity();
            mo19364(activityC18686, true, (Runnable) new RunnableC18664(activityC18686, this, z2));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ((ActivityC18686) requireActivity()).m42587(m19360(), (String) null, (ArrayList) null, false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C4024((ActivityC18686) requireActivity(), C4024.m8029(this.f22377));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C14146 c14146 = this.f22377;
            c14146.m32471(!c14146.m32505());
            menuItem.setChecked(this.f22377.m32505());
            this.f22384.m38854();
            if (this.f22394) {
                this.f22389.m14752();
            }
            this.f22382.setEnabled(!this.f22377.m32505());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (!ApplicationC21448.f67649.getBoolean("ard", true)) {
                m19354();
                return true;
            }
            C20671 c20671BuildDialog = ((ActivityC18686) requireActivity()).buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷᩷ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f70812.m19354();
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢ᩷ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8362.m19309(this.f32672);
                }
            });
            c20671BuildDialog.m46732();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            Object objMo10027 = this.f22372.mo10027();
            int[] iArrM32433 = this.f22377.m32433();
            if (iArrM32433[0] == iArrM32433[1] && (objMo10027 instanceof C24850)) {
                C24850 c24850 = (C24850) objMo10027;
                ?? Mo28589 = this.f22377.m32500().mo28589();
                try {
                    int i = iArrM32433[0];
                    int iIndexOf = TextUtils.indexOf((CharSequence) Mo28589, '\n', c24850.m54587() + 1);
                    int iLastIndexOf = TextUtils.lastIndexOf(Mo28589, '\n', c24850.m54583() - 1);
                    if (iIndexOf > i || i > iLastIndexOf) {
                        C22682.m50793(R.string.MT_Protector);
                        Mo28589.close();
                        Mo28589 = Mo28589;
                    } else {
                        String strConcat = ".class Ltest;\n.super Ljava/lang/Object;\n".concat(Mo28589.subSequence(c24850.m54587(), c24850.m54583()));
                        Mo28589.close();
                        String strM32137 = this.f22385.m32137(m19360());
                        C20960 c20960M32106 = this.f22385.m32106(strM32137);
                        C23616 c23616M32125 = this.f22385.m32125(strM32137);
                        try {
                            C20765 c20765M47281 = c20960M32106.m47281();
                            C3349 c3349 = (C3349) C11572.m26641(strConcat, c20765M47281, c20960M32106).getMethods().iterator().next();
                            InterfaceC20568 interfaceC20568Mo5857 = c3349.mo5857();
                            if (interfaceC20568Mo5857 == null) {
                                c3423 = null;
                            } else {
                                z = interfaceC20568Mo5857 instanceof C3422;
                                if (z) {
                                    c3423 = (C3422) interfaceC20568Mo5857;
                                } else {
                                    c3422 = new C3422(interfaceC20568Mo5857);
                                    c3423 = c3422;
                                }
                            }
                            if (c3423 == null) {
                                r1 = c3422;
                                r1 = z;
                                r1 = c20765M47281;
                                C22682.m50793(R.string.MT_Protector);
                                Mo28589 = r1;
                            } else {
                                r1 = c3422;
                                r1 = z;
                                r1 = c20765M47281;
                                C10374 c10374 = new C10374(this, (ActivityC18686) requireActivity(), c3423, c3349, c23616M32125, c24850);
                                c10374.m33344(R.string.MT_Protector);
                                c10374.m33336((CharSequence) "1");
                                c10374.m33362(C0719o.a.f2896b);
                                c10374.m33347(R.string.MT_Protector);
                                c10374.m33342(R.string.MT_Protector);
                                c10374.m33330();
                                Mo28589 = 6;
                                c10374.m33365(6);
                                c10374.m33367();
                                c10374.m33352(true);
                            }
                        } catch (C16299 e) {
                            ((ActivityC18686) requireActivity()).m12259(e, (DialogInterface.OnDismissListener) null);
                            C20699 c20699M46760 = C20699.m46760(e.f47904, e.f47908);
                            C14146 c14147 = this.f22377;
                            c20699M46760.m46768(c14147);
                            Mo28589 = c14147;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Mo28589.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                C22682.m50793(R.string.MT_Protector);
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                mo19368((ActivityC18686) requireActivity());
                return true;
            }
            if (!this.f22384.m38851(menuItem)) {
                return super.onOptionsItemSelected(menuItem);
            }
            if (itemId == R.id.MT_Protector) {
                SubMenu subMenu = menuItem.getSubMenu();
                subMenu.add(0, R.string.MT_Protector, 65520, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                subMenu.add(0, R.string.MT_Protector, 65520, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19309(C8362 c8362) {
        C24104.m53360(ApplicationC21448.f67649, "ard", false);
        c8362.m19354();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸ */
    public void m19354() {
        String str;
        Object objMo10027 = this.f22372.mo10027();
        int[] iArrM32433 = this.f22377.m32433();
        if (iArrM32433[0] != iArrM32433[1] || !(objMo10027 instanceof C24850)) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C24850 c24850 = (C24850) objMo10027;
        C9729 c9729Mo28589 = this.f22377.m32500().mo28589();
        try {
            int i = iArrM32433[0];
            int iIndexOf = TextUtils.indexOf((CharSequence) c9729Mo28589, '\n', c24850.m54587() + 1);
            int iLastIndexOf = TextUtils.lastIndexOf(c9729Mo28589, '\n', c24850.m54583() - 1);
            if (iIndexOf <= i && i <= iLastIndexOf) {
                int iIndexOf2 = TextUtils.indexOf((CharSequence) c9729Mo28589, '\n', i) + 1;
                if (iIndexOf2 != 0) {
                    iLastIndexOf = iIndexOf2;
                }
                String str2 = ".class Ltest;\n.super Ljava/lang/Object;\n" + c9729Mo28589.subSequence(c24850.m54587(), iLastIndexOf) + "  nop\n  .source \"analysis_register_mark\"\n  nop\n" + c9729Mo28589.subSequence(iLastIndexOf, c24850.m54583());
                c9729Mo28589.close();
                C20960 c20960M32106 = this.f22385.m32106(this.f22385.m32137(m19360()));
                try {
                    C3349 c3349 = (C3349) C11572.m26641(str2, c20960M32106.m47281(), c20960M32106).getMethods().iterator().next();
                    InterfaceC20568 interfaceC20568Mo5857 = c3349.mo5857();
                    C3422 c3422 = interfaceC20568Mo5857 != null ? interfaceC20568Mo5857 instanceof C3422 ? (C3422) interfaceC20568Mo5857 : new C3422(interfaceC20568Mo5857) : null;
                    if (c3422 == null) {
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    try {
                        C12830 c12830 = new C12830(c3422);
                        c12830.m29408();
                        ArrayList arrayList = new ArrayList();
                        int iMo6075 = c3422.mo6075();
                        int i2 = 1 ^ (EnumC17248.STATIC.m39032(c3349.mo5854()) ? 1 : 0);
                        Iterator<E> it = c3349.mo5852().iterator();
                        while (it.hasNext()) {
                            i2 = C13061.m29894(((C24787) it.next()).getType()) ? i2 + 2 : i2 + 1;
                        }
                        int i3 = iMo6075 - i2;
                        Iterator it2 = c12830.m29409().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((C23955) it2.next()).m53076().iterator();
                            while (it3.hasNext()) {
                                C17503 c17503M22075 = ((AbstractC9476) it3.next()).m22075();
                                AbstractC9476 abstractC9476M39881 = c17503M22075.m39881();
                                if (abstractC9476M39881 != null && abstractC9476M39881.mo6217() == EnumC3167.f5839) {
                                    for (AbstractC8135 abstractC8135 : c17503M22075.m39877()) {
                                        if ((abstractC8135 instanceof InterfaceC6486) && "analysis_register_mark".equals(((InterfaceC6486) abstractC8135).mo11944())) {
                                            boolean[] zArrM39878 = c17503M22075.m39878();
                                            for (int i4 = 0; i4 < zArrM39878.length; i4++) {
                                                if (zArrM39878[i4]) {
                                                    if (i4 >= i3) {
                                                        arrayList.add(C0655am.f2322ax + (i4 - i3));
                                                    } else {
                                                        arrayList.add(C0655am.f2277aE + i4);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            C22682.m50793(R.string.MT_Protector);
                            return;
                        }
                        if (this.f22377.m32593()) {
                            str = "\t";
                        } else {
                            char[] cArr = new char[this.f22377.m32425()];
                            Arrays.fill(cArr, ' ');
                            str = new String(cArr);
                        }
                        StringBuilder sbM21133 = C9179.m21133(str, "# ");
                        sbM21133.append(getString(R.string.MT_Protector));
                        sbM21133.append(" ");
                        sbM21133.append(C11567.m26623(arrayList, " "));
                        String string = sbM21133.toString();
                        this.f22377.m32500().insert(iLastIndexOf, string + "\n");
                        this.f22377.mo27941(string.length() + iLastIndexOf);
                        this.f22377.m32575();
                        this.f22377.m32409(false);
                        return;
                    } catch (Exception e) {
                        C22682.m50800(e.toString());
                        return;
                    }
                } catch (C16299 e2) {
                    ((ActivityC18686) requireActivity()).m12259(e2, (DialogInterface.OnDismissListener) null);
                    C20699.m46760(e2.f47904, e2.f47908).m46768(this.f22377);
                    return;
                }
            }
            C22682.m50793(R.string.MT_Protector);
            c9729Mo28589.close();
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC20028 interfaceC20028Mo19371 = mo19371();
        if (interfaceC20028Mo19371 != null) {
            C17078 c17078 = (C17078) interfaceC20028Mo19371;
            c17078.mo11541();
            c17078.mo11540();
        }
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC20028 mo19371() {
        C14121 c14121 = this.f22385;
        if (c14121 == null || this.f22392 || !this.f22394) {
            return null;
        }
        C12828 c12828M36366 = m36366(c14121.m38429());
        if (this.f22396) {
            c12828M36366.m29395();
            return null;
        }
        C14146 c14146 = this.f22377;
        C17143 c17143 = this.f22384;
        if (c14146 == null || c17143 == null) {
            throw new RuntimeException();
        }
        return new C17078(this, c14146, c17143, c12828M36366);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19320(C8362 c8362, C14677 c14677) {
        C23395.m52060((InterfaceC21384) c14677, 1382253409);
        if (c14677.readInt() != c8362.f22385.m32123(c8362.m19360())) {
            return false;
        }
        c8362.f22377.m32476(true);
        try {
            C23395.m52060((InterfaceC21384) c14677, 1382253409);
            c8362.f22377.mo27918(c14677);
            C23395.m52060((InterfaceC21384) c14677, 1382253409);
            c8362.f22384.m38850(c14677);
            C23395.m52060((InterfaceC21384) c14677, 1382253409);
            c8362.f22384.m38843(c14677);
            if (!c8362.f22377.m32500().mo4005()) {
                c8362.f22377.m32400(c8362.m36369(c8362.f22385.m38429()).m29402());
            }
            c8362.f22377.m32499();
            return true;
        } catch (Throwable th) {
            c8362.f22377.m32476(false);
            throw th;
        }
    }

    @Override // p067l.InterfaceC22169
    /* JADX INFO: renamed from: ֫ */
    public final void mo19362(int i, int i2, String str) {
        if (this.f22394) {
            if (i == 0 && i2 == 0) {
                this.f22386 = null;
            } else if (i == -1 && i2 == -1) {
                this.f22386 = C8597.m20011(100, str);
            } else {
                this.f22386 = String.format("[%d - %d] : %s", Integer.valueOf(this.f22377.m32484(i) + 1), Integer.valueOf(this.f22377.m32484(i2) + 1), C8597.m20011(100, str));
            }
            m19356();
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m19356() {
        C14146 c14146 = this.f22377;
        if (c14146 != null) {
            StringBuilder sb = new StringBuilder();
            int iM32508 = c14146.m32508();
            int iM32512 = c14146.m32512();
            Point pointM32536 = c14146.m32536(iM32508);
            sb.append(pointM32536.x);
            sb.append(':');
            sb.append(pointM32536.y);
            if (iM32508 != iM32512) {
                sb.append(" (");
                sb.append(Math.abs(iM32512 - iM32508));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            sb.append(" │ ");
            sb.append((String) C12826.requireNonNullElse(this.f22386, "..."));
            this.f22381.setText(sb.toString());
        }
    }

    @Override // p067l.InterfaceC2787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4372() {
        C17143 c17143 = this.f22384;
        if (c17143 == null || !c17143.m38852()) {
            return false;
        }
        this.f22384.m38854();
        this.f22377.m32507();
        return true;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۧ */
    public final void mo19368(final ActivityC18686 activityC18686) {
        if (!this.f46351.getBoolean("changed", false)) {
            m36361(activityC18686);
            return;
        }
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC18686);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46710(R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩷ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = C8362.f22369;
                ActivityC18686 activityC18687 = activityC18686;
                C8362 c8362 = this.f80407;
                c8362.mo19364(activityC18687, false, (Runnable) new RunnableC18664(activityC18687, c8362, true));
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17416(1, this, activityC18686));
        c20671.m46732();
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֫ */
    public final void mo19364(ActivityC18686 activityC18686, boolean z, Runnable runnable) {
        C23115 c23115 = new C23115(runnable);
        if (!mo19366()) {
            c23115.onSuccess();
        } else {
            new C23785(activityC18686, new C14397(activityC18686, this, z), c23115).m22250();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19319(ActivityC18686 activityC18686, C8362 c8362, boolean z) {
        if (z) {
            c8362.m36361(activityC18686);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7482 m19369(ActivityC18686 activityC18686) {
        C1446.m31704(this.f46351.getBoolean("changed", false));
        return new C14397(activityC18686, this, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m19361(C14121 c14121, C13992 c13992) {
        if (this.f22394 && !this.f22390 && !C12799.m29347()) {
            for (int i = 0; i < 50 && !this.f22390; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f22394 && this.f22390) {
            return this.f22377.m32500().toString();
        }
        c13992.m31796();
        C12828 c12828M36366 = m36366(c14121.m38429());
        if (!c12828M36366.m29398()) {
            return c14121.m32113(m19360());
        }
        C14677 c14677M33572 = C14677.m33572(c12828M36366.m29399());
        C23395.m52060((InterfaceC21384) c14677M33572, 1382253409);
        if (c14677M33572.readInt() == c14121.m32123(m19360())) {
            C23395.m52060((InterfaceC21384) c14677M33572, 1382253409);
            return C8782.m20318(c14677M33572, m36369(c14121.m38429()).m29402());
        }
        return c14121.m32113(m19360());
    }

    @Override // p067l.InterfaceC6075
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13812(C14121 c14121) {
        return !c14121.m32119(m19360());
    }

    /* JADX INFO: renamed from: ᩹ */
    public static void m19357(C8362 c8362) {
        if (c8362.f22394) {
            c8362.f22389.m14752();
        }
    }
}
