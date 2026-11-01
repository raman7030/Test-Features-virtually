package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܳۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C15957 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۖ֫ */
    public static final ExecutorService f46181;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final ArrayList f46182;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static boolean f46183;

    /* JADX INFO: renamed from: ֫֫ */
    public long f46184;

    /* JADX INFO: renamed from: ۗ */
    public EnumC10594 f46185;

    /* JADX INFO: renamed from: ۙ */
    public final C7179 f46186;

    /* JADX INFO: renamed from: ۛ */
    public List f46187 = Collections.singletonList("");

    /* JADX INFO: renamed from: ۜ֫ */
    public EnumC11265 f46188;

    /* JADX INFO: renamed from: ۟ */
    public long f46189;

    /* JADX INFO: renamed from: ۡ֫ */
    public final AbstractC18422 f46190;

    /* JADX INFO: renamed from: ۢ֫ */
    public final TextView f46191;

    /* JADX INFO: renamed from: ۤ */
    public final View f46192;

    /* JADX INFO: renamed from: ۧ֫ */
    public Runnable f46193;

    /* JADX INFO: renamed from: ۨ */
    public final CheckBox f46194;

    /* JADX INFO: renamed from: ۫ */
    public final View f46195;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f46196;

    /* JADX INFO: renamed from: ܰ */
    public long f46197;

    /* JADX INFO: renamed from: ܳ֫ */
    public final CheckBox f46198;

    /* JADX INFO: renamed from: ܺ֫ */
    public final C18107 f46199;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C7179 f46200;

    /* JADX INFO: renamed from: ܿ֫ */
    public List f46201;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC21323 f46202;

    /* JADX INFO: renamed from: ᩶ */
    public final CheckBox f46203;

    /* JADX INFO: renamed from: ᩷֫ */
    public final TextView f46204;

    /* JADX INFO: renamed from: ᩸ */
    public final View f46205;

    /* JADX INFO: renamed from: ᩹ */
    public final CheckBox f46206;

    /* JADX INFO: renamed from: ᩺ */
    public long f46207;

    /* JADX INFO: renamed from: ᩻֫ */
    public final TextView f46208;

    static {
        ArrayList arrayList = new ArrayList();
        f46182 = arrayList;
        arrayList.addAll(C24675.m54313(ApplicationC21448.f67649.mo20201("sir", (byte[]) null)));
        f46181 = Executors.newFixedThreadPool(Math.min(C19110.f57020, 3));
    }

    public C15957(C18107 c18107, InterfaceC21323 interfaceC21323) {
        EnumC10594 enumC10594M24383;
        this.f46199 = c18107;
        this.f46202 = interfaceC21323;
        this.f46190 = c18107.m41270();
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        this.f46191 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        this.f46195 = viewFindViewById;
        this.f46196 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f46200 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.editText2);
        this.f46186 = c7179;
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f46198 = checkBox;
        this.f46206 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f46194 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f46203 = checkBox3;
        this.f46208 = (TextView) viewM12252.findViewById(R.id.textView1);
        this.f46204 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM12252.findViewById(R.id.MT_Protector);
        this.f46205 = viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM12252.findViewById(R.id.MT_Protector);
        this.f46192 = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC15087(3, this));
        viewFindViewById4.setEnabled(!f46182.isEmpty());
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC12721(2, this));
        if (ApplicationC21448.f67649.contains("fsnm")) {
            enumC10594M24383 = EnumC10594.m24383(ApplicationC21448.f67649.getInt("fsnm", EnumC10594.CONTAINS.m24387()));
        } else if (ApplicationC21448.f67649.contains("sir") || ApplicationC21448.f67649.contains("file_search_record") || ApplicationC21448.f67649.contains("file_search_record_empty")) {
            enumC10594M24383 = EnumC10594.WILDCARD;
        } else {
            enumC10594M24383 = EnumC10594.CONTAINS;
        }
        m36219(enumC10594M24383);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۬᩶ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f42983.f46186.m16516(z);
            }
        });
        c7179.m16508(ApplicationC21448.f67649.getString("file_advanced_search", ""));
        checkBox2.setChecked(!ApplicationC21448.f67649.getBoolean("file_search_ignore_case", true));
        checkBox3.setChecked(ApplicationC21448.f67649.getBoolean("file_search_regex", false));
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("file_search_sub", true));
        c7179.m16514().m27925(3);
        c7179.m16514().m32539(17.0f);
        c7179.m16505();
        try {
            this.f46207 = Long.parseLong(ApplicationC21448.f67649.getString("file_search_max_size", "-1"));
        } catch (NumberFormatException unused) {
            this.f46207 = -1L;
        }
        try {
            this.f46189 = Long.parseLong(ApplicationC21448.f67649.getString("file_search_min_size", "-1"));
        } catch (NumberFormatException unused2) {
            this.f46189 = -1L;
        }
        long j = this.f46189;
        if (j >= 0) {
            long j2 = this.f46207;
            if (j == j2 && j2 != C14849.FOREVER_NS) {
                this.f46207 = j2 + 1;
            }
        }
        this.f46208.setText(EnumC21994.m49559(j, this.f46207));
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC14379(0, this));
        try {
            this.f46197 = Long.parseLong(ApplicationC21448.f67649.getString("fsmaxt", "-1"));
        } catch (NumberFormatException unused3) {
            this.f46197 = -1L;
        }
        try {
            this.f46184 = Long.parseLong(ApplicationC21448.f67649.getString("fsmint", "-1"));
        } catch (NumberFormatException unused4) {
            this.f46184 = -1L;
        }
        this.f46188 = EnumC11265.m26191(ApplicationC21448.f67649.getInt("fstp", 0));
        m36250();
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC21623(2, this));
        this.f46206.setOnCheckedChangeListener(this);
        this.f46206.setChecked(f46183);
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19782(2, this));
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ۢ᩶ܳ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C15957.m36220(this.f32622);
            }
        });
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC11027(0, this, dialogInterfaceC2564M46732));
        C7050.m16226(this.f46200.m16514());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36252(List list) {
        this.f46187 = list;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36251(ArrayList arrayList, Runnable runnable) {
        this.f46201 = arrayList;
        this.f46193 = runnable;
        this.f46191.setText(R.string.MT_Protector);
        this.f46198.setVisibility(8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36220(C15957 c15957) {
        c15957.m36241();
        Runnable runnable = c15957.f46193;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m36245(C15957 c15957) {
        c15957.m36241();
        Runnable runnable = c15957.f46193;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m36219(EnumC10594 enumC10594) {
        this.f46185 = enumC10594;
        int iM24386 = enumC10594.m24386();
        TextView textView = this.f46196;
        textView.setText(iM24386);
        this.f46195.setContentDescription(textView.getText());
        this.f46200.m16516(enumC10594 == EnumC10594.REGEX);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m36247(final C15957 c15957) {
        final EnumC10594[] enumC10594ArrValues = EnumC10594.values();
        View view = c15957.f46195;
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        C0994 c0994M50638 = c1898.m50638();
        C1484.m33529(c0994M50638, R.string.MT_Protector);
        for (int i = 0; i < enumC10594ArrValues.length; i++) {
            c0994M50638.add(0, i, i, enumC10594ArrValues[i].m24385()).setCheckable(true);
        }
        c0994M50638.setGroupCheckable(0, true, true);
        c0994M50638.getItem(c15957.f46185.ordinal()).setChecked(true);
        c1898.m50636(new InterfaceC1583() { // from class: l.ܺ᩶ܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f52961.m36219(enumC10594ArrValues[menuItem.getItemId()]);
                return true;
            }
        });
        C1828.m48009(c1898).m44897();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m36237(final C15957 c15957) {
        final EnumC21994[] enumC21994ArrValues = EnumC21994.values();
        final int length = enumC21994ArrValues.length;
        TextView textView = c15957.f46208;
        C1898 c1898 = new C1898(textView.getContext(), textView, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, length, 1, R.string.MT_Protector).setCheckable(true);
        int i = 0;
        while (i < enumC21994ArrValues.length) {
            c0994M50638.add(0, i, i == 0 ? 0 : i + 1, enumC21994ArrValues[i].m49565()).setCheckable(true);
            i++;
        }
        c0994M50638.setGroupCheckable(0, true, true);
        EnumC21994 enumC21994M49558 = EnumC21994.m49558(c15957.f46189, c15957.f46207);
        c0994M50638.findItem(enumC21994M49558 == null ? length : enumC21994M49558.ordinal()).setChecked(true);
        c1898.m50636(new InterfaceC1583() { // from class: l.ᩴ᩶ܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C15957.m36224(this.f63095, length, enumC21994ArrValues, menuItem);
                return true;
            }
        });
        C1828.m48009(c1898).m44897();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36224(C15957 c15957, int i, EnumC21994[] enumC21994Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            C7300.m16853(c15957.f46199.m41282(), c15957.f46189, c15957.f46207, new C15646(c15957));
            return;
        }
        EnumC21994 enumC21994 = enumC21994Arr[itemId];
        long jM49567 = enumC21994.m49567();
        long jM49566 = enumC21994.m49566();
        c15957.f46189 = jM49567;
        c15957.f46207 = jM49566;
        c15957.f46208.setText(EnumC21994.m49559(jM49567, jM49566));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m36243(final C15957 c15957) {
        final EnumC11265[] enumC11265ArrValues = EnumC11265.values();
        final int length = enumC11265ArrValues.length;
        TextView textView = c15957.f46204;
        C1898 c1898 = new C1898(textView.getContext(), textView, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, length, 1, R.string.MT_Protector).setCheckable(true);
        int i = 0;
        while (i < enumC11265ArrValues.length) {
            c0994M50638.add(0, i, i == 0 ? 0 : i + 1, enumC11265ArrValues[i].m26193()).setCheckable(true);
            i++;
        }
        c0994M50638.setGroupCheckable(0, true, true);
        EnumC11265 enumC11265 = c15957.f46188;
        if (enumC11265 == null && c15957.f46184 == -1 && c15957.f46197 == -1) {
            enumC11265 = EnumC11265.ANY;
        }
        c0994M50638.findItem(enumC11265 == null ? length : enumC11265.ordinal()).setChecked(true);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۘ᩶ܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C15957.m36223(this.f16416, length, enumC11265ArrValues, menuItem);
                return true;
            }
        });
        C1828.m48009(c1898).m44897();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36223(C15957 c15957, int i, EnumC11265[] enumC11265Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            c15957.m36246();
            C7300.m16852(c15957.f46199.m41282(), c15957.f46184, c15957.f46197, new C13303(c15957));
            return;
        }
        EnumC11265 enumC11265 = enumC11265Arr[itemId];
        if (enumC11265 != EnumC11265.ANY) {
            c15957.f46188 = enumC11265;
            c15957.m36246();
            c15957.m36250();
        } else {
            c15957.f46188 = null;
            c15957.f46184 = -1L;
            c15957.f46197 = -1L;
            c15957.m36250();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36225(C15957 c15957, long j, long j2) {
        c15957.f46189 = j;
        c15957.f46207 = j2;
        c15957.f46208.setText(EnumC21994.m49559(j, j2));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m36238(C15957 c15957, long j, long j2) {
        c15957.f46188 = null;
        c15957.f46184 = j;
        c15957.f46197 = j2;
        c15957.m36250();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m36250() {
        EnumC11265 enumC11265 = this.f46188;
        this.f46204.setText(enumC11265 == null ? EnumC11265.m26190(this.f46184, this.f46197) : enumC11265.m26193());
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m36246() {
        EnumC11265 enumC11265 = this.f46188;
        if (enumC11265 != null) {
            long[] jArrM26194 = enumC11265.m26194(System.currentTimeMillis());
            this.f46184 = jArrM26194[0];
            this.f46197 = jArrM26194[1];
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m36244() {
        ApplicationC21448.f67649.edit().mo27877("sir", C24675.m54312(f46182)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.֨᩶ܳ] */
    /* JADX INFO: renamed from: ֫ */
    public void m36218(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C7480.stream(f46182).map(new C21086(0)).toArray(new C2979());
        C20671 c20671BuildDialog = this.f46199.m41282().buildDialog();
        C4338 c4338 = new C4338(R.layout.MT_Protector, c20671BuildDialog.m46726(), Arrays.asList(charSequenceArr));
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46716(c4338, (DialogInterfaceOnClickListenerC3650) new DialogInterface.OnClickListener() { // from class: l.֨᩶ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C15957.m36221(this.f7668, i);
            }
        });
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3856().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.۠᩶ܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, int i, long j) {
                C15957.m36230(this.f28670, charSequenceArr, dialogInterfaceC2564M46732, view, i);
                return true;
            }
        });
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ᩶ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C15957.m36228(this.f50450, dialogInterfaceC2564M46732, view);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36221(C15957 c15957, int i) {
        C24675 c24675 = (C24675) f46182.get(i);
        c15957.m36219(c24675.m54321());
        c15957.f46200.m16508(c24675.m54326());
        c15957.f46198.setChecked(c24675.m54322());
        c15957.f46206.setChecked(c24675.m54316());
        c15957.f46189 = c24675.m54319();
        c15957.f46207 = c24675.m54320();
        c15957.f46184 = c24675.m54325();
        c15957.f46197 = c24675.m54318();
        c15957.f46188 = c24675.m54327();
        c15957.f46186.m16508(c24675.m54324());
        c15957.f46194.setChecked(c24675.m54328());
        c15957.f46203.setChecked(c24675.m54315());
        c15957.f46208.setText(EnumC21994.m49559(c15957.f46189, c15957.f46207));
        c15957.m36250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36230(final C15957 c15957, CharSequence[] charSequenceArr, final DialogInterfaceC2564 dialogInterfaceC2564, final View view, final int i) {
        C20671 c20671BuildDialog = c15957.f46199.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(charSequenceArr[i]);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸᩶ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C15957.m36222(this.f72592, i, dialogInterfaceC2564, view);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36222(C15957 c15957, int i, DialogInterfaceC2564 dialogInterfaceC2564, View view) {
        ArrayList arrayList = f46182;
        arrayList.remove(i);
        m36244();
        dialogInterfaceC2564.dismiss();
        if (arrayList.isEmpty()) {
            c15957.f46192.setEnabled(false);
        } else {
            c15957.m36218(view);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36228(C15957 c15957, DialogInterfaceC2564 dialogInterfaceC2564, View view) {
        C12368 c12368 = new C12368(c15957, c15957.f46199.m41282(), dialogInterfaceC2564, view);
        c12368.m33344(R.string.MT_Protector);
        c12368.m33347(R.string.MT_Protector);
        c12368.m33351(C7050.m16224(R.string.MT_Protector));
        c12368.m33362(2);
        c12368.m33354(2);
        c12368.m33330();
        c12368.m33352(true);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m36241() {
        InterfaceC14770 interfaceC14770PutString = ApplicationC21448.f67649.edit().putString("file_advanced_search", this.f46186.m16518().toString()).mo27875(this.f46185.m24387(), "fsnm").putBoolean("file_search_ignore_case", !this.f46194.isChecked()).putBoolean("file_search_regex", this.f46203.isChecked()).putBoolean("file_search_sub", this.f46198.isChecked()).putString("file_search_max_size", Long.toString(this.f46207)).putString("file_search_min_size", Long.toString(this.f46189)).putString("fsmaxt", Long.toString(this.f46197)).putString("fsmint", Long.toString(this.f46184));
        EnumC11265 enumC11265 = this.f46188;
        interfaceC14770PutString.mo27875(enumC11265 == null ? 0 : enumC11265.m26195(), "fstp").apply();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36227(C15957 c15957, DialogInterfaceC2564 dialogInterfaceC2564) {
        DialogInterface.OnDismissListener onDismissListener;
        C13259 c13259;
        long jM49563;
        long j;
        long j2;
        long j3;
        C13259 c13259M30303;
        DialogInterface.OnDismissListener onDismissListener2;
        CheckBox checkBox = c15957.f46198;
        C18107 c18107 = c15957.f46199;
        CheckBox checkBox2 = c15957.f46194;
        CheckBox checkBox3 = c15957.f46203;
        C7179 c7179 = c15957.f46186;
        c15957.m36246();
        C7179 c71710 = c15957.f46200;
        String string = c71710.m16518().toString();
        CheckBox checkBox4 = c15957.f46206;
        if (checkBox4.isChecked()) {
            long j4 = c15957.f46207;
            jM49563 = EnumC21994.m49563(c15957.f46189, j4);
            long j5 = c15957.f46184;
            j = j4;
            long j6 = c15957.f46197;
            if (c7179.m16521() == 0) {
                onDismissListener2 = null;
                c13259M30303 = null;
                j6 = j6;
            } else {
                String string2 = c7179.m16518().toString();
                if (!checkBox3.isChecked()) {
                    string2 = C6112.m13905(string2);
                }
                try {
                    c13259M30303 = checkBox2.isChecked() ? C13259.m30303(8, string2) : C13259.m30303(74, string2);
                    onDismissListener2 = null;
                } catch (PatternSyntaxException e) {
                    c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            c13259 = c13259M30303;
            j3 = j6;
            j2 = j5;
            onDismissListener = onDismissListener2;
        } else {
            onDismissListener = null;
            c13259 = null;
            jM49563 = -1;
            j = -1;
            j2 = -1;
            j3 = -1;
        }
        try {
            try {
                C18600 c18600 = new C18600(string, c15957.f46185, checkBox.isChecked(), jM49563, j, j2, j3, c13259);
                if (checkBox4.isChecked()) {
                    c7179.m16517();
                }
                c71710.m16517();
                c15957.m36241();
                final C24675 c24675 = new C24675(c71710.m16518().toString(), c15957.f46185, checkBox.isChecked(), checkBox4.isChecked(), c15957.f46189, c15957.f46207, c15957.f46184, c15957.f46197, c15957.f46188, c7179.m16518().toString(), checkBox2.isChecked(), checkBox3.isChecked());
                Predicate predicate = new Predicate() { // from class: l.ۖ᩶ܳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate2) {
                        return C20697.$default$and(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m10568or(Predicate predicate2) {
                        return C20697.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c24675.m54317((C24675) obj);
                    }
                };
                ArrayList arrayList = f46182;
                C7480.removeIf(arrayList, predicate);
                arrayList.add(0, c24675);
                while (arrayList.size() > 100) {
                    C19925.m45229(arrayList, 1);
                }
                m36244();
                dialogInterfaceC2564.dismiss();
                new C9685(c15957, c18600).m22250();
            } catch (PatternSyntaxException e2) {
                e = e2;
                c18107.m41282().m12259(e, onDismissListener);
            }
        } catch (PatternSyntaxException e3) {
            e = e3;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f46205.setVisibility(z ? 0 : 8);
        f46183 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36232(final C18107 c18107, final InterfaceC21323 interfaceC21323, final C17969 c17969) {
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        int i = 0;
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(C7050.m16203(R.string.MT_Protector, Integer.valueOf(c17969.f53664.size())));
        C11400 c11400 = (C11400) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(c11400);
        final C12606 c12606 = new C12606(c17969, c18107, c11400);
        c11400.setAdapter((ListAdapter) c12606);
        c11400.setSelection(c17969.f53663);
        c11400.setFastScrollEnabled(true);
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46714(new DialogInterfaceOnDismissListenerC22427(i, c17969, c11400));
        String str = c17969.f53665;
        if (str.equals("local")) {
            c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7674(i, c17969, c12606));
            c20671BuildDialog.m46731("↕", new DialogInterface.OnClickListener() { // from class: l.᩹᩶ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    c18107.m41259("//SEARCH//" + c17969.hashCode(), true);
                }
            });
        } else {
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩶ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C17969 c179610 = c17969;
                    BaseAdapter baseAdapter = c12606;
                    synchronized (c179610) {
                        c179610.f53664.clear();
                    }
                    baseAdapter.notifyDataSetChanged();
                }
            });
        }
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        ImageView imageView = (ImageView) viewM12252.findViewById(R.id.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        C1717.m43573(imageView, C7050.m16230(R.string.MT_Protector));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩶ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC21323.mo15432(c18107, view, c17969, new C3888(dialogInterfaceC2564M46732));
            }
        });
        if (str.equals("local")) {
            Drawable drawableMutate = c18107.m41282().getResources().getDrawable(R.drawable.MT_Protector).mutate();
            drawableMutate.setColorFilter(C15766.m35830(C23223.f72969));
            Button buttonM3861 = dialogInterfaceC2564M46732.m3861();
            int textSize = (int) buttonM3861.getTextSize();
            drawableMutate.setBounds(0, 0, textSize, textSize);
            SpannableString spannableString = new SpannableString("↕");
            spannableString.setSpan(new ImageSpan(drawableMutate), 0, 1, 33);
            buttonM3861.setText(spannableString);
        }
        c11400.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۗ᩶ܳ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                dialogInterfaceC2564M46732.dismiss();
                C17969 c179610 = c17969;
                C13946 c13946 = (C13946) c179610.f53664.get(i2);
                c13946.f39335 = true;
                InterfaceC19370 interfaceC19370M31720 = c13946.m31720();
                String name = interfaceC19370M31720.getName();
                C18107 c18108 = c18107;
                c18108.m41279(name);
                c18108.m41259(interfaceC19370M31720.getParent(), c179610.f53665.equals("local"));
            }
        });
        C10884.m25071(dialogInterfaceC2564M46732);
    }
}
