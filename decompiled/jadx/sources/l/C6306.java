package l;

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
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C6306 extends AbstractC14346 implements InterfaceC20834, InterfaceC0440, InterfaceC3900 {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19498 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C3764 f19500;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C4811 f19501;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C12230 f19502;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f19503;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public String f19504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19505;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C12392 f19506;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19507;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19508;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19509;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public TextView f19510;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19511;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public TextView f19512;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15545 f19513;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12366 f19514;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f19515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18786 f19516;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C19287 f19517;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C4301 f19518;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f19519;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public View f19520;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f19521;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19522;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f19523;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f19524;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f19525;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20313 f19526;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f19497 = C11459.m28259(8, "^[ \\t]*((fill-array-data|goto|packed-switch|sparse-switch|if-).+|-?0[xX][0-9a-fA-F]+ *-> *)?(:[\\w$]+)[ \\t]*(#.*)?$");

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f19499 = C11459.m28259(8, "^[ \\t]*\\.catch.*\\{.*(:[\\w$]+).*\\.\\..*(:[\\w$]+).*\\}.*(:[\\w$]+)[ \\t]*(#.*)?$");

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo14418() {
        return true;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܳ */
    public final int mo14420() {
        return R.drawable.MT_Protector;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo17432() {
        return true;
    }

    public C6306() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܺ */
    public final String mo14421() {
        if (this.f19504 == null) {
            this.f19504 = C6554.m18061(80, C14336.m34210(m17420()));
        }
        return this.f19504;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩷ */
    public final String mo14422() {
        if (!this.f43260.getBoolean("changed", false)) {
            return mo14421();
        }
        return "*" + mo14421();
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۜ */
    public final String mo14419() {
        return C6554.m18061(150, m17420());
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo17426() {
        return this.f43260.getBoolean("changed", false);
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17423(C3764 c3764) {
        c3764.m11383(m17420());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m17420() {
        String string = requireArguments().getString("classpath");
        C11003.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17430(String str) {
        m34234((String) null);
        requireArguments().putString("classpath", str);
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19500 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f19502 = (C12230) new C4741(requireActivity()).m13885(C12230.class);
        this.f19516 = C19492.m44903(this, new C20407(this));
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM40367 = ((ActivityC17169) requireActivity()).m40367(R.layout.MT_Protector);
        if (viewM40367 == null) {
            viewM40367 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C11003.requireNonNull(viewM40367);
        }
        C4925.m14316(new RunnableC4196(5, this), 600L);
        return viewM40367;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f19503 = false;
        this.f19520 = view.findViewById(R.id.MT_Protector);
        this.f19506 = (C12392) view.findViewById(R.id.MT_Protector);
        this.f19512 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f19510 = (TextView) view.findViewById(R.id.MT_Protector);
        C15545 c15545 = new C15545((ActivityC17169) requireActivity(), this.f19506, view);
        this.f19513 = c15545;
        c15545.m36678("edit_word_wrap_smali", false);
        this.f19518 = new C4301(view, this.f19506);
        this.f19513.m36683(getViewLifecycleOwner(), this.f19518, ActivityC10714.class);
        C4811 c4811 = new C4811();
        this.f19501 = c4811;
        c4811.mo7982(C9170.m23579(getViewLifecycleOwner()));
        this.f19526 = new ViewOnClickListenerC20313(this, this.f19506, this.f19501);
        this.f19501.mo7981(new C21352(this));
        this.f19506.m30334(new C19007(this));
        this.f19506.m30328(new C19713(this));
        this.f19506.m30338(new C0661(this));
        this.f19506.m30330(new InterfaceC8035() { // from class: l.ۡ᩷ۢ
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫ */
            public final void mo1646(int i, int i2) {
                C6306.m17370(this.f27650, i, i2);
            }
        });
        this.f19506.m30320((InterfaceC0397) new C3484(this));
        this.f19512.setText(mo14422());
        if (this.f43260.getBoolean("changed", false)) {
            this.f19512.setTextColor(C21943.f70260);
        }
        final C12164 c12164Matcher = C11459.m28259(8, "^\\.class ([a-z\\-]+ )*L([^;]+);").matcher((CharSequence) "");
        this.f19512.setOnClickListener(new ViewOnClickListenerC19575(1, this, c12164Matcher));
        this.f19512.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܺ᩷ۢ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C6306.m17372(this.f49845, c12164Matcher);
                return true;
            }
        });
        m17416();
        this.f19510.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ᩷ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8659.f19526.m46591();
            }
        });
        this.f19523 = true;
        this.f19518.m12888();
        this.f19500.m11419().m1668(getViewLifecycleOwner(), new InterfaceC1008() { // from class: l.ۘ᩷ۢ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C6306.m17375(this.f13644, (C12366) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17371(C6306 c6306, List list, List list2, List list3, List list4) {
        if (c6306.f19523) {
            c6306.f19526.m46590(list, list3, list2, list4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17370(C6306 c6306, int i, int i2) {
        C4811 c4811 = c6306.f19501;
        if (c4811 != null) {
            c4811.mo7980(i, i2, c6306);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17373(final C6306 c6306, C12164 c12164, View view) {
        String strM17420;
        C21282 c21282 = new C21282(c6306.requireContext(), view, 0);
        c12164.m29615reset((CharSequence) c6306.f19506.m30436());
        if (c12164.find()) {
            strM17420 = c12164.group(2);
        } else {
            strM17420 = c6306.m17420();
        }
        final C23155 c23155 = new C23155(c21282, strM17420, false);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۜ᩷ۢ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C6306.m17377(this.f21632, c23155, menuItem);
                return true;
            }
        });
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17377(C6306 c6306, C23155 c23155, MenuItem menuItem) {
        if (c23155.m51333(menuItem)) {
            return;
        }
        c6306.f19500.m11383(c6306.m17420());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17372(C6306 c6306, C12164 c12164) {
        String strM17420;
        c12164.m29615reset((CharSequence) c6306.f19506.m30436());
        if (c12164.find()) {
            strM17420 = c12164.group(2);
        } else {
            strM17420 = c6306.m17420();
        }
        C19258 c19258BuildDialog = ((ActivityC17169) c6306.requireActivity()).buildDialog();
        c19258BuildDialog.m44424(strM17420);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17375(C6306 c6306, C12366 c12366) {
        c6306.f19514 = c12366;
        if (!c6306.f19523) {
            c6306.f19519 = true;
        } else {
            new C1367(c6306, c6306.m17420()).m20274();
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12392 mo17427() {
        if (this.f19521) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f19523) {
            return this.f19506;
        }
        return null;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19523 = false;
        C4811 c4811 = this.f19501;
        if (c4811 != null) {
            c4811.close();
        }
        C12392 c12392 = this.f19506;
        if (c12392 != null) {
            c12392.m30386();
        }
        C15545 c15545 = this.f19513;
        if (c15545 != null) {
            c15545.m36695();
        }
        this.f19520 = null;
        this.f19518 = null;
        this.f19506 = null;
        this.f19513 = null;
        this.f19526 = null;
        this.f19501 = null;
        this.f19512 = null;
        this.f19510 = null;
        this.f19508 = null;
        this.f19505 = null;
        this.f19507 = null;
        this.f19511 = null;
        this.f19509 = null;
        this.f19522 = null;
        this.f19524 = null;
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC17169) requireActivity()).m40340((CharSequence) null);
        ((ActivityC17169) requireActivity()).m10236(this.f19506);
        C15545 c15545 = this.f19513;
        if (c15545 != null && c15545.m36684() && this.f19523) {
            this.f19518.m12888();
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onPause() {
        super.onPause();
        C12392 c12392 = this.f19506;
        if (c12392 != null) {
            c12392.m30443();
        }
        ((ActivityC17169) requireActivity()).m10234();
    }

    @Override // l.ComponentCallbacksC9205, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C12392 c12392 = this.f19506;
        if (c12392 != null) {
            c12392.m30443();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17425(C19287 c19287) {
        this.f19517 = c19287;
        if (c19287 != null && this.f19523 && this.f19503) {
            if (c19287.f60678) {
                this.f19506.m30516();
            }
            C12171.m29642(this.f19523);
            C19287 c19288 = this.f19517;
            if (c19288 == null) {
                return;
            }
            this.f19517 = null;
            c19288.m44474(this.f19506);
            this.f19506.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m17415(C6306 c6306) {
        C12171.m29642(c6306.f19523);
        C19287 c19287 = c6306.f19517;
        if (c19287 == null) {
            return;
        }
        c6306.f19517 = null;
        c19287.m44474(c6306.f19506);
        c6306.f19506.requestFocus();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC23000 interfaceMenuC23000 = (InterfaceMenuC23000) menu;
        this.f19524 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19522 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19509 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19511 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19507 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19505 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19508 = (InterfaceMenuItemC13827) interfaceMenuC23000.findItem(R.id.MT_Protector);
        this.f19524.setEnabled(this.f19506.m30296());
        this.f19522.setEnabled(this.f19506.m30383());
        this.f19509.setEnabled(this.f19506.m30297());
        this.f19511.setEnabled(!this.f19506.m30441());
        this.f19507.setChecked(this.f19506.m30441());
        this.f19513.m36675(interfaceMenuC23000.findItem(R.id.MT_Protector));
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
    @Override // l.ComponentCallbacksC9205
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        C1109 c1109;
        C1109 c11010;
        ?? r1;
        if (this.f19525 || this.f19521) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f19506.m30443();
        int itemId = menuItem.getItemId();
        boolean z2 = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f19506.m30437());
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (C23196.m51454() && ApplicationC20075.f65008.getBoolean("cc", true)) {
                z2 = true;
            }
            menuItemFindItem.setChecked(z2);
            this.f19505.setEnabled(this.f19506.m30374());
            this.f19508.setEnabled(this.f19506.m30514());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String strM34210 = C14336.m34210(m17420());
            if (strM34210.length() > 50) {
                strM34210 = strM34210.substring(0, 50);
            }
            this.f19516.m43440(strM34210 + ".smali");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f19526.m46591();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!C23196.m51454()) {
                C21374.m48457(R.string.MT_Protector);
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC20075.f65008.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC17169 activityC17169 = (ActivityC17169) requireActivity();
            mo17424(activityC17169, true, (Runnable) new RunnableC17146(activityC17169, this, z2));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ((ActivityC17169) requireActivity()).m40342(m17420(), (String) null, (ArrayList) null, false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C1742((ActivityC17169) requireActivity(), C1742.m5819(this.f19506));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C12392 c12392 = this.f19506;
            c12392.m30407(!c12392.m30441());
            menuItem.setChecked(this.f19506.m30441());
            this.f19513.m36693();
            if (this.f19523) {
                this.f19518.m12888();
            }
            this.f19511.setEnabled(!this.f19506.m30441());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (!ApplicationC20075.f65008.getBoolean("ard", true)) {
                m17414();
                return true;
            }
            C19258 c19258BuildDialog = ((ActivityC17169) requireActivity()).buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷᩷ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f68130.m17414();
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢ᩷ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6306.m17369(this.f29719);
                }
            });
            c19258BuildDialog.m44438();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            Object objMo7979 = this.f19501.mo7979();
            int[] iArrM30369 = this.f19506.m30369();
            if (iArrM30369[0] == iArrM30369[1] && (objMo7979 instanceof C23655)) {
                C23655 c23655 = (C23655) objMo7979;
                ?? Mo26556 = this.f19506.m30436().mo26556();
                try {
                    int i = iArrM30369[0];
                    int iIndexOf = TextUtils.indexOf((CharSequence) Mo26556, '\n', c23655.m52184() + 1);
                    int iLastIndexOf = TextUtils.lastIndexOf(Mo26556, '\n', c23655.m52180() - 1);
                    if (iIndexOf > i || i > iLastIndexOf) {
                        C21374.m48457(R.string.MT_Protector);
                        Mo26556.close();
                        Mo26556 = Mo26556;
                    } else {
                        String strConcat = ".class Ltest;\n.super Ljava/lang/Object;\n".concat(Mo26556.subSequence(c23655.m52184(), c23655.m52180()));
                        Mo26556.close();
                        String strM30076 = this.f19514.m30076(m17420());
                        C19562 c19562M30045 = this.f19514.m30045(strM30076);
                        C22357 c22357M30064 = this.f19514.m30064(strM30076);
                        try {
                            C19357 c19357M44986 = c19562M30045.m44986();
                            C1032 c1032 = (C1032) C9684.m24627(strConcat, c19357M44986, c19562M30045).getMethods().iterator().next();
                            InterfaceC19150 interfaceC19150Mo3570 = c1032.mo3570();
                            if (interfaceC19150Mo3570 == null) {
                                c11010 = null;
                            } else {
                                z = interfaceC19150Mo3570 instanceof C1109;
                                if (z) {
                                    c11010 = (C1109) interfaceC19150Mo3570;
                                } else {
                                    c1109 = new C1109(interfaceC19150Mo3570);
                                    c11010 = c1109;
                                }
                            }
                            if (c11010 == null) {
                                r1 = c1109;
                                r1 = z;
                                r1 = c19357M44986;
                                C21374.m48457(R.string.MT_Protector);
                                Mo26556 = r1;
                            } else {
                                r1 = c1109;
                                r1 = z;
                                r1 = c19357M44986;
                                C8423 c8423 = new C8423(this, (ActivityC17169) requireActivity(), c11010, c1032, c22357M30064, c23655);
                                c8423.m31258(R.string.MT_Protector);
                                c8423.m31250((CharSequence) "1");
                                c8423.m31276(o.a.b);
                                c8423.m31261(R.string.MT_Protector);
                                c8423.m31256(R.string.MT_Protector);
                                c8423.m31244();
                                Mo26556 = 6;
                                c8423.m31279(6);
                                c8423.m31281();
                                c8423.m31266(true);
                            }
                        } catch (C14658 e) {
                            ((ActivityC17169) requireActivity()).m10223(e, (DialogInterface.OnDismissListener) null);
                            C19287 c19287M44466 = C19287.m44466(e.f44794, e.f44798);
                            C12392 c12393 = this.f19506;
                            c19287M44466.m44474(c12393);
                            Mo26556 = c12393;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Mo26556.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                C21374.m48457(R.string.MT_Protector);
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                mo17428((ActivityC17169) requireActivity());
                return true;
            }
            if (!this.f19513.m36690(menuItem)) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17369(C6306 c6306) {
        C22870.m50970(ApplicationC20075.f65008, "ard", false);
        c6306.m17414();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m17414() {
        String str;
        Object objMo7979 = this.f19501.mo7979();
        int[] iArrM30369 = this.f19506.m30369();
        if (iArrM30369[0] != iArrM30369[1] || !(objMo7979 instanceof C23655)) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C23655 c23655 = (C23655) objMo7979;
        C7744 c7744Mo26556 = this.f19506.m30436().mo26556();
        try {
            int i = iArrM30369[0];
            int iIndexOf = TextUtils.indexOf((CharSequence) c7744Mo26556, '\n', c23655.m52184() + 1);
            int iLastIndexOf = TextUtils.lastIndexOf(c7744Mo26556, '\n', c23655.m52180() - 1);
            if (iIndexOf <= i && i <= iLastIndexOf) {
                int iIndexOf2 = TextUtils.indexOf((CharSequence) c7744Mo26556, '\n', i) + 1;
                if (iIndexOf2 != 0) {
                    iLastIndexOf = iIndexOf2;
                }
                String str2 = ".class Ltest;\n.super Ljava/lang/Object;\n" + c7744Mo26556.subSequence(c23655.m52184(), iLastIndexOf) + "  nop\n  .source \"analysis_register_mark\"\n  nop\n" + c7744Mo26556.subSequence(iLastIndexOf, c23655.m52180());
                c7744Mo26556.close();
                C19562 c19562M30045 = this.f19514.m30045(this.f19514.m30076(m17420()));
                try {
                    C1032 c1032 = (C1032) C9684.m24627(str2, c19562M30045.m44986(), c19562M30045).getMethods().iterator().next();
                    InterfaceC19150 interfaceC19150Mo3570 = c1032.mo3570();
                    C1109 c1109 = interfaceC19150Mo3570 != null ? interfaceC19150Mo3570 instanceof C1109 ? (C1109) interfaceC19150Mo3570 : new C1109(interfaceC19150Mo3570) : null;
                    if (c1109 == null) {
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    try {
                        C11008 c11008 = new C11008(c1109);
                        c11008.m27346();
                        ArrayList arrayList = new ArrayList();
                        int iMo3818 = c1109.mo3818();
                        int i2 = 1 ^ (EnumC15657.STATIC.m36866(c1032.mo3567()) ? 1 : 0);
                        Iterator<E> it = c1032.mo3565().iterator();
                        while (it.hasNext()) {
                            i2 = C11250.m27832(((C23589) it.next()).getType()) ? i2 + 2 : i2 + 1;
                        }
                        int i3 = iMo3818 - i2;
                        Iterator it2 = c11008.m27347().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((C22714) it2.next()).m50750().iterator();
                            while (it3.hasNext()) {
                                C15925 c15925M20099 = ((AbstractC7479) it3.next()).m20099();
                                AbstractC7479 abstractC7479M37706 = c15925M20099.m37706();
                                if (abstractC7479M37706 != null && abstractC7479M37706.mo3975() == EnumC0841.f3065) {
                                    for (AbstractC6068 abstractC6068 : c15925M20099.m37702()) {
                                        if ((abstractC6068 instanceof InterfaceC4333) && "analysis_register_mark".equals(((InterfaceC4333) abstractC6068).mo9896())) {
                                            boolean[] zArrM37703 = c15925M20099.m37703();
                                            for (int i4 = 0; i4 < zArrM37703.length; i4++) {
                                                if (zArrM37703[i4]) {
                                                    if (i4 >= i3) {
                                                        arrayList.add(am.ax + (i4 - i3));
                                                    } else {
                                                        arrayList.add(am.aE + i4);
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
                            C21374.m48457(R.string.MT_Protector);
                            return;
                        }
                        if (this.f19506.m30529()) {
                            str = "\t";
                        } else {
                            char[] cArr = new char[this.f19506.m30361()];
                            Arrays.fill(cArr, ' ');
                            str = new String(cArr);
                        }
                        StringBuilder sbM19190 = C7166.m19190(str, "# ");
                        sbM19190.append(getString(R.string.MT_Protector));
                        sbM19190.append(" ");
                        sbM19190.append(C9679.m24609(arrayList, " "));
                        String string = sbM19190.toString();
                        this.f19506.m30436().insert(iLastIndexOf, string + "\n");
                        this.f19506.mo25919(string.length() + iLastIndexOf);
                        this.f19506.m30511();
                        this.f19506.m30345(false);
                        return;
                    } catch (Exception e) {
                        C21374.m48464(e.toString());
                        return;
                    }
                } catch (C14658 e2) {
                    ((ActivityC17169) requireActivity()).m10223(e2, (DialogInterface.OnDismissListener) null);
                    C19287.m44466(e2.f44794, e2.f44798).m44474(this.f19506);
                    return;
                }
            }
            C21374.m48457(R.string.MT_Protector);
            c7744Mo26556.close();
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC18581 interfaceC18581Mo17431 = mo17431();
        if (interfaceC18581Mo17431 != null) {
            C15477 c15477 = (C15477) interfaceC18581Mo17431;
            c15477.mo9498();
            c15477.mo9497();
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18581 mo17431() {
        C12366 c12366 = this.f19514;
        if (c12366 == null || this.f19521 || !this.f19523) {
            return null;
        }
        C11005 c11005M34233 = m34233(c12366.m36268());
        if (this.f19525) {
            c11005M34233.m27333();
            return null;
        }
        C12392 c12392 = this.f19506;
        C15545 c15545 = this.f19513;
        if (c12392 == null || c15545 == null) {
            throw new RuntimeException();
        }
        return new C15477(this, c12392, c15545, c11005M34233);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17380(C6306 c6306, C12951 c12951) {
        C22124.m49722((InterfaceC20008) c12951, 1382253409);
        if (c12951.readInt() != c6306.f19514.m30062(c6306.m17420())) {
            return false;
        }
        c6306.f19506.m30412(true);
        try {
            C22124.m49722((InterfaceC20008) c12951, 1382253409);
            c6306.f19506.mo25896(c12951);
            C22124.m49722((InterfaceC20008) c12951, 1382253409);
            c6306.f19513.m36689(c12951);
            C22124.m49722((InterfaceC20008) c12951, 1382253409);
            c6306.f19513.m36682(c12951);
            if (!c6306.f19506.m30436().mo1607()) {
                c6306.f19506.m30336(c6306.m34236(c6306.f19514.m36268()).m27340());
            }
            c6306.f19506.m30435();
            return true;
        } catch (Throwable th) {
            c6306.f19506.m30412(false);
            throw th;
        }
    }

    @Override // l.InterfaceC20834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17422(int i, int i2, String str) {
        if (this.f19523) {
            if (i == 0 && i2 == 0) {
                this.f19515 = null;
            } else if (i == -1 && i2 == -1) {
                this.f19515 = C6554.m18061(100, str);
            } else {
                this.f19515 = String.format("[%d - %d] : %s", Integer.valueOf(this.f19506.m30420(i) + 1), Integer.valueOf(this.f19506.m30420(i2) + 1), C6554.m18061(100, str));
            }
            m17416();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m17416() {
        C12392 c12392 = this.f19506;
        if (c12392 != null) {
            StringBuilder sb = new StringBuilder();
            int iM30444 = c12392.m30444();
            int iM30448 = c12392.m30448();
            Point pointM30472 = c12392.m30472(iM30444);
            sb.append(pointM30472.x);
            sb.append(':');
            sb.append(pointM30472.y);
            if (iM30444 != iM30448) {
                sb.append(" (");
                sb.append(Math.abs(iM30448 - iM30444));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            sb.append(" │ ");
            sb.append((String) C11003.requireNonNullElse(this.f19515, "..."));
            this.f19510.setText(sb.toString());
        }
    }

    @Override // l.InterfaceC0440
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1996() {
        C15545 c15545 = this.f19513;
        if (c15545 == null || !c15545.m36691()) {
            return false;
        }
        this.f19513.m36693();
        this.f19506.m30443();
        return true;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17428(final ActivityC17169 activityC17169) {
        if (!this.f43260.getBoolean("changed", false)) {
            m34228(activityC17169);
            return;
        }
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44416(R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩷ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = C6306.f19498;
                ActivityC17169 activityC171610 = activityC17169;
                C6306 c6306 = this.f77655;
                c6306.mo17424(activityC171610, false, (Runnable) new RunnableC17146(activityC171610, c6306, true));
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15833(1, this, activityC17169));
        c19258.m44438();
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17424(ActivityC17169 activityC17169, boolean z, Runnable runnable) {
        C21829 c21829 = new C21829(runnable);
        if (!mo17426()) {
            c21829.onSuccess();
        } else {
            new C22534(activityC17169, new C12656(activityC17169, this, z), c21829).m20274();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17379(ActivityC17169 activityC17169, C6306 c6306, boolean z) {
        if (z) {
            c6306.m34228(activityC17169);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5380 m17429(ActivityC17169 activityC17169) {
        C12171.m29642(this.f43260.getBoolean("changed", false));
        return new C12656(activityC17169, this, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m17421(C12366 c12366, C12230 c12230) {
        if (this.f19523 && !this.f19519 && !C10975.m27285()) {
            for (int i = 0; i < 50 && !this.f19519; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f19523 && this.f19519) {
            return this.f19506.m30436().toString();
        }
        c12230.m29734();
        C11005 c11005M34233 = m34233(c12366.m36268());
        if (!c11005M34233.m27336()) {
            return c12366.m30052(m17420());
        }
        C12951 c12951M31485 = C12951.m31485(c11005M34233.m27337());
        C22124.m49722((InterfaceC20008) c12951M31485, 1382253409);
        if (c12951M31485.readInt() == c12366.m30062(m17420())) {
            C22124.m49722((InterfaceC20008) c12951M31485, 1382253409);
            return C6748.m18370(c12951M31485, m34236(c12366.m36268()).m27340());
        }
        return c12366.m30052(m17420());
    }

    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11876(C12366 c12366) {
        return !c12366.m30058(m17420());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m17417(C6306 c6306) {
        if (c6306.f19523) {
            c6306.f19518.m12888();
        }
    }
}
