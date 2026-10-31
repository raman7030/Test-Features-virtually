package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۛ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6372 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19707 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C9195 f19708;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f19709;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C24011 f19710;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C3550 f19711;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C19779 f19712;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "SchemeEditorActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        ListView listView = (ListView) m10241(android.R.id.list);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC5021(1, this));
        String stringExtra = getIntent().getStringExtra("schemeName");
        C11003.requireNonNull(stringExtra);
        setTitle(stringExtra);
        try {
            this.f19708 = C16249.m38221(stringExtra);
        } catch (Exception unused) {
            this.f19708 = new C9195(stringExtra);
        }
        C3550 c3550 = new C3550(this);
        this.f19711 = c3550;
        listView.setAdapter((ListAdapter) c3550);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        m17665(-1, (C21190) null);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m17665(i, (C21190) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17669(ActivityC6372 activityC6372, C10606 c10606, CompoundButton compoundButton, CompoundButton compoundButton2, CompoundButton compoundButton3, CompoundButton compoundButton4, CompoundButton compoundButton5, CompoundButton compoundButton6, CompoundButton compoundButton7, C21190 c21190, int i, DialogInterfaceC0206 dialogInterfaceC0206) {
        Spinner spinner = c10606.f31832;
        if (spinner.getSelectedItemPosition() != 2) {
            if (!compoundButton.isChecked() && !compoundButton2.isChecked() && !compoundButton3.isChecked()) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            C19779 c19779 = activityC6372.f19712;
            if (c19779.f63854.m42217() && c19779.f63858.m42217() && c19779.f63860.m42217()) {
                if (spinner.getSelectedItemPosition() == 1 && activityC6372.f19709 == 0) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
            } else {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
        } else {
            if (!compoundButton4.isChecked() && !compoundButton5.isChecked() && !compoundButton6.isChecked() && !compoundButton7.isChecked()) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            C24011 c24011 = activityC6372.f19710;
            if (!c24011.f77813.m42217() || !c24011.f77815.m42217() || !c24011.f77819.m42217()) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
        }
        c21190.f68291 = spinner.getSelectedItemPosition();
        activityC6372.f19712.f63859 = compoundButton.isChecked();
        activityC6372.f19712.f63857 = compoundButton3.isChecked();
        activityC6372.f19712.f63855 = compoundButton2.isChecked();
        activityC6372.f19710.f77814 = compoundButton4.isChecked();
        activityC6372.f19710.f77818 = compoundButton5.isChecked();
        activityC6372.f19710.f77816 = compoundButton6.isChecked();
        activityC6372.f19710.f77817 = compoundButton7.isChecked();
        c21190.f68292 = activityC6372.f19712;
        c21190.f68290 = activityC6372.f19710;
        c21190.f68293 = activityC6372.f19709;
        if (i == -1) {
            activityC6372.f19708.f27871.add(c21190);
        }
        try {
            C16249.m38217(activityC6372.f19708);
        } catch (IOException e) {
            activityC6372.m10223(e, (DialogInterface.OnDismissListener) null);
        }
        activityC6372.f19711.notifyDataSetChanged();
        dialogInterfaceC0206.dismiss();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17670(final ActivityC6372 activityC6372, C10606 c10606, final TextView textView) {
        if (c10606.f31832.getSelectedItemPosition() != 2) {
            View viewM10216 = activityC6372.m10216(R.layout.MT_Protector);
            final C13427 c13427 = new C13427(viewM10216, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
            final C13427 c13428 = new C13427(viewM10216, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
            final C13427 c13429 = new C13427(viewM10216, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
            final C13427 c134210 = new C13427(viewM10216, R.id.header4, R.id.textInputLayout4, R.id.editText4, R.id.MT_Protector, R.id.MT_Protector);
            final C19779 c19779 = activityC6372.f19712;
            c13427.m32453(c19779.f63854);
            c13428.m32453(c19779.f63858);
            c13429.m32453(c19779.f63856);
            c134210.m32453(c19779.f63860);
            C19258 c19258BuildDialog = activityC6372.buildDialog();
            c19258BuildDialog.m44421(viewM10216);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44428(false);
            final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            C5088.m14637(dialogInterfaceC0206M44438);
            dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC6372.f19707;
                    ActivityC6372 activityC6373 = this.f47908;
                    activityC6373.getClass();
                    C13427 c134211 = c13427;
                    boolean zIsChecked = c134211.f40123.isChecked();
                    C13427 c134212 = c13428;
                    C13427 c134213 = c13429;
                    C13427 c134214 = c134210;
                    if (zIsChecked && c134212.f40123.isChecked() && c134213.f40123.isChecked() && c134214.f40123.isChecked()) {
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                    if (!c134211.f40123.isChecked() && c134211.m32454()) {
                        c134211.m32452(R.string.MT_Protector);
                        return;
                    }
                    if (!c134212.f40123.isChecked() && c134212.m32454()) {
                        c134212.m32452(R.string.MT_Protector);
                        return;
                    }
                    if (!c134214.f40123.isChecked() && c134214.m32454()) {
                        c134214.m32452(R.string.MT_Protector);
                        return;
                    }
                    try {
                        c134211.m32451();
                        c134212.m32451();
                        c134213.m32451();
                        c134214.m32451();
                        c134211.m32455();
                        c134212.m32455();
                        c134213.m32455();
                        c134214.m32455();
                        TextView textView2 = textView;
                        if (textView2.getVisibility() == 8) {
                            textView2.setVisibility(0);
                        }
                        textView2.setText(c19779.m45464());
                        dialogInterfaceC0206M44438.dismiss();
                    } catch (PatternSyntaxException e) {
                        activityC6373.m10223(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩸᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC6372.f19707;
                    C20484 c20484 = new C20484(this.f70094, c13427, c13428, c13429, c134210);
                    c20484.m31258(R.string.MT_Protector);
                    c20484.m31277("Smali");
                    c20484.m31265("Lxxx;->method()V");
                    c20484.m31270();
                    String strM14330 = C4925.m14330();
                    if (strM14330 != null) {
                        String[] strArrSplit = strM14330.split("->");
                        if (strArrSplit.length == 2) {
                            String str = strArrSplit[0];
                            if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                                String[] strArrSplit2 = strArrSplit[1].split("\\(");
                                if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty()) {
                                    String[] strArrSplit3 = strArrSplit2[1].split("\\)");
                                    if (strArrSplit3.length == 2) {
                                        String str2 = strArrSplit3[0];
                                        String str3 = strArrSplit3[1];
                                        if (str2.matches("(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*") && str3.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                            c20484.m31250((CharSequence) strM14330);
                                            c20484.m31281();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c20484.m31266(true);
                }
            });
            return;
        }
        View viewM10217 = activityC6372.m10216(R.layout.MT_Protector);
        final C13427 c134211 = new C13427(viewM10217, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
        final C13427 c134212 = new C13427(viewM10217, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
        final C13427 c134213 = new C13427(viewM10217, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
        final C24011 c24011 = activityC6372.f19710;
        c134211.m32453(c24011.f77813);
        c134212.m32453(c24011.f77815);
        c134213.m32453(c24011.f77819);
        C19258 c19258BuildDialog2 = activityC6372.buildDialog();
        c19258BuildDialog2.m44421(viewM10217);
        c19258BuildDialog2.m44442(R.string.MT_Protector, null);
        c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog2.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog2.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44439 = c19258BuildDialog2.m44438();
        C5088.m14637(dialogInterfaceC0206M44439);
        dialogInterfaceC0206M44439.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC6372.f19707;
                ActivityC6372 activityC6373 = this.f5137;
                activityC6373.getClass();
                C13427 c134214 = c134211;
                boolean zIsChecked = c134214.f40123.isChecked();
                C13427 c134215 = c134212;
                C13427 c134216 = c134213;
                if (zIsChecked && c134215.f40123.isChecked() && c134216.f40123.isChecked()) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                if (!c134214.f40123.isChecked() && c134214.m32454()) {
                    c134214.m32452(R.string.MT_Protector);
                    return;
                }
                if (!c134215.f40123.isChecked() && c134215.m32454()) {
                    c134215.m32452(R.string.MT_Protector);
                    return;
                }
                if (!c134216.f40123.isChecked() && c134216.m32454()) {
                    c134216.m32452(R.string.MT_Protector);
                    return;
                }
                try {
                    c134214.m32451();
                    c134215.m32451();
                    c134216.m32451();
                    c134214.m32455();
                    c134215.m32455();
                    c134216.m32455();
                    TextView textView2 = textView;
                    if (textView2.getVisibility() == 8) {
                        textView2.setVisibility(0);
                    }
                    textView2.setText(c24011.m52852());
                    dialogInterfaceC0206M44439.dismiss();
                } catch (PatternSyntaxException e) {
                    activityC6373.m10223(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
        dialogInterfaceC0206M44439.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC6372.f19707;
                C4961 c4961 = new C4961(this.f25947, c134211, c134212, c134213);
                c4961.m31258(R.string.MT_Protector);
                c4961.m31277("Smali");
                c4961.m31265("Lxxx;->field:I");
                c4961.m31270();
                String strM14330 = C4925.m14330();
                if (strM14330 != null) {
                    String[] strArrSplit = strM14330.split("->");
                    if (strArrSplit.length == 2) {
                        String str = strArrSplit[0];
                        if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                            String[] strArrSplit2 = strArrSplit[1].split(":");
                            if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty() && strArrSplit2[1].matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                c4961.m31250((CharSequence) strM14330);
                                c4961.m31281();
                            }
                        }
                    }
                }
                c4961.m31266(true);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:11:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:12:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:15:0x0205  */
    /* JADX WARN: Code duplicated, block: B:16:0x0207  */
    /* JADX WARN: Code duplicated, block: B:19:0x0211  */
    /* JADX WARN: Code duplicated, block: B:20:0x0213  */
    /* JADX WARN: Code duplicated, block: B:23:0x021d  */
    /* JADX WARN: Code duplicated, block: B:24:0x021f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0229  */
    /* JADX WARN: Code duplicated, block: B:28:0x022b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0235  */
    /* JADX WARN: Code duplicated, block: B:32:0x0237  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17665(final int i, C21190 c21190) {
        C21190 c21191;
        final C21190 c21192;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i != -1) {
            c21191 = (C21190) this.f19708.f27871.get(i);
        } else {
            if (c21190 != null) {
                C21190 c21193 = new C21190();
                c21193.f68292 = new C19779();
                c21193.f68290 = new C24011();
                c21193.f68291 = c21190.f68291;
                c21193.f68292.m45465(c21190.f68292);
                c21193.f68290.m52853(c21190.f68290);
                c21193.f68293 = c21190.f68293;
                c21192 = c21193;
            } else {
                c21191 = new C21190();
            }
            this.f19709 = c21192.f68293;
            this.f19712 = new C19779();
            this.f19710 = new C24011();
            this.f19712.m45465(c21192.f68292);
            this.f19710.m52853(c21192.f68290);
            View viewM10216 = m10216(R.layout.MT_Protector);
            final C10606 c10606 = new C10606();
            c10606.f31830 = c21192;
            Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner1);
            c10606.f31832 = spinner;
            spinner.setAdapter((SpinnerAdapter) new C20065(this, getResources().getStringArray(R.array.MT_Protector)));
            c10606.f31827 = viewM10216.findViewById(R.id.MT_Protector);
            c10606.f31828 = viewM10216.findViewById(R.id.MT_Protector);
            c10606.f31831 = viewM10216.findViewById(R.id.MT_Protector);
            c10606.f31826 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
            c10606.f31829 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
            final CompoundButton compoundButton = (CompoundButton) viewM10216.findViewById(R.id.switch1);
            final CompoundButton compoundButton2 = (CompoundButton) viewM10216.findViewById(R.id.switch2);
            final CompoundButton compoundButton3 = (CompoundButton) viewM10216.findViewById(R.id.switch3);
            final CompoundButton compoundButton4 = (CompoundButton) viewM10216.findViewById(R.id.switch4);
            final CompoundButton compoundButton5 = (CompoundButton) viewM10216.findViewById(R.id.switch5);
            final CompoundButton compoundButton6 = (CompoundButton) viewM10216.findViewById(R.id.switch6);
            final CompoundButton compoundButton7 = (CompoundButton) viewM10216.findViewById(R.id.switch7);
            View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
            final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
            CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
            CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
            CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
            CheckBox checkBox4 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
            CheckBox checkBox5 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
            CheckBox checkBox6 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
            spinner.setSelection(c21192.f68291);
            c10606.m26625(c21192.f68291);
            spinner.setOnItemSelectedListener(new C12722(c10606));
            checkBox.setTag(1);
            checkBox2.setTag(2);
            checkBox3.setTag(4);
            checkBox4.setTag(8);
            checkBox5.setTag(16);
            checkBox6.setTag(32);
            C19346 c19346 = new C19346(this, 1);
            checkBox.setOnCheckedChangeListener(c19346);
            checkBox2.setOnCheckedChangeListener(c19346);
            checkBox3.setOnCheckedChangeListener(c19346);
            checkBox4.setOnCheckedChangeListener(c19346);
            checkBox5.setOnCheckedChangeListener(c19346);
            checkBox6.setOnCheckedChangeListener(c19346);
            compoundButton.setChecked(c21192.f68292.f63859);
            compoundButton2.setChecked(c21192.f68292.f63857);
            compoundButton3.setChecked(c21192.f68292.f63855);
            compoundButton4.setChecked(c21192.f68290.f77814);
            compoundButton5.setChecked(c21192.f68290.f77818);
            compoundButton6.setChecked(c21192.f68290.f77816);
            compoundButton7.setChecked(c21192.f68290.f77817);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.֡᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC6372.m17670(this.f2737, c10606, textView);
                }
            };
            viewFindViewById.setOnClickListener(onClickListener);
            textView.setOnClickListener(onClickListener);
            if ((c21192.f68293 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            checkBox.setChecked(z);
            if ((c21192.f68293 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            checkBox2.setChecked(z2);
            if ((c21192.f68293 & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            checkBox3.setChecked(z3);
            if ((c21192.f68293 & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            checkBox4.setChecked(z4);
            if ((c21192.f68293 & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkBox5.setChecked(z5);
            if ((c21192.f68293 & 32) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            checkBox6.setChecked(z6);
            C19258 c19258BuildDialog = buildDialog();
            c19258BuildDialog.m44421(viewM10216);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44428(false);
            final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            C5088.m14637(dialogInterfaceC0206M44438);
            dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC6372.m17669(this.f17503, c10606, compoundButton, compoundButton3, compoundButton2, compoundButton4, compoundButton5, compoundButton6, compoundButton7, c21192, i, dialogInterfaceC0206M44438);
                }
            });
        }
        c21192 = c21191;
        this.f19709 = c21192.f68293;
        this.f19712 = new C19779();
        this.f19710 = new C24011();
        this.f19712.m45465(c21192.f68292);
        this.f19710.m52853(c21192.f68290);
        View viewM10217 = m10216(R.layout.MT_Protector);
        final C10606 c10607 = new C10606();
        c10607.f31830 = c21192;
        Spinner spinner2 = (Spinner) viewM10217.findViewById(R.id.spinner1);
        c10607.f31832 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) new C20065(this, getResources().getStringArray(R.array.MT_Protector)));
        c10607.f31827 = viewM10217.findViewById(R.id.MT_Protector);
        c10607.f31828 = viewM10217.findViewById(R.id.MT_Protector);
        c10607.f31831 = viewM10217.findViewById(R.id.MT_Protector);
        c10607.f31826 = (TextView) viewM10217.findViewById(R.id.MT_Protector);
        c10607.f31829 = (TextView) viewM10217.findViewById(R.id.MT_Protector);
        final CompoundButton compoundButton8 = (CompoundButton) viewM10217.findViewById(R.id.switch1);
        final CompoundButton compoundButton9 = (CompoundButton) viewM10217.findViewById(R.id.switch2);
        final CompoundButton compoundButton10 = (CompoundButton) viewM10217.findViewById(R.id.switch3);
        final CompoundButton compoundButton11 = (CompoundButton) viewM10217.findViewById(R.id.switch4);
        final CompoundButton compoundButton12 = (CompoundButton) viewM10217.findViewById(R.id.switch5);
        final CompoundButton compoundButton13 = (CompoundButton) viewM10217.findViewById(R.id.switch6);
        final CompoundButton compoundButton14 = (CompoundButton) viewM10217.findViewById(R.id.switch7);
        View viewFindViewById2 = viewM10217.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM10217.findViewById(R.id.MT_Protector);
        CheckBox checkBox7 = (CheckBox) viewM10217.findViewById(R.id.MT_Protector);
        CheckBox checkBox8 = (CheckBox) viewM10217.findViewById(R.id.MT_Protector);
        CheckBox checkBox9 = (CheckBox) viewM10217.findViewById(R.id.MT_Protector);
        CheckBox checkBox10 = (CheckBox) viewM10217.findViewById(R.id.MT_Protector);
        CheckBox checkBox11 = (CheckBox) viewM10217.findViewById(R.id.MT_Protector);
        CheckBox checkBox12 = (CheckBox) viewM10217.findViewById(R.id.MT_Protector);
        spinner2.setSelection(c21192.f68291);
        c10607.m26625(c21192.f68291);
        spinner2.setOnItemSelectedListener(new C12722(c10607));
        checkBox7.setTag(1);
        checkBox8.setTag(2);
        checkBox9.setTag(4);
        checkBox10.setTag(8);
        checkBox11.setTag(16);
        checkBox12.setTag(32);
        C19346 c19347 = new C19346(this, 1);
        checkBox7.setOnCheckedChangeListener(c19347);
        checkBox8.setOnCheckedChangeListener(c19347);
        checkBox9.setOnCheckedChangeListener(c19347);
        checkBox10.setOnCheckedChangeListener(c19347);
        checkBox11.setOnCheckedChangeListener(c19347);
        checkBox12.setOnCheckedChangeListener(c19347);
        compoundButton8.setChecked(c21192.f68292.f63859);
        compoundButton9.setChecked(c21192.f68292.f63857);
        compoundButton10.setChecked(c21192.f68292.f63855);
        compoundButton11.setChecked(c21192.f68290.f77814);
        compoundButton12.setChecked(c21192.f68290.f77818);
        compoundButton13.setChecked(c21192.f68290.f77816);
        compoundButton14.setChecked(c21192.f68290.f77817);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.֡᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC6372.m17670(this.f2737, c10607, textView2);
            }
        };
        viewFindViewById2.setOnClickListener(onClickListener2);
        textView2.setOnClickListener(onClickListener2);
        if ((c21192.f68293 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        checkBox7.setChecked(z);
        if ((c21192.f68293 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkBox8.setChecked(z2);
        if ((c21192.f68293 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        checkBox9.setChecked(z3);
        if ((c21192.f68293 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        checkBox10.setChecked(z4);
        if ((c21192.f68293 & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        checkBox11.setChecked(z5);
        if ((c21192.f68293 & 32) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        checkBox12.setChecked(z6);
        C19258 c19258BuildDialog2 = buildDialog();
        c19258BuildDialog2.m44421(viewM10217);
        c19258BuildDialog2.m44442(R.string.MT_Protector, null);
        c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog2.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44439 = c19258BuildDialog2.m44438();
        C5088.m14637(dialogInterfaceC0206M44439);
        dialogInterfaceC0206M44439.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC6372.m17669(this.f17503, c10607, compoundButton8, compoundButton10, compoundButton9, compoundButton11, compoundButton12, compoundButton13, compoundButton14, c21192, i, dialogInterfaceC0206M44439);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17668(ActivityC6372 activityC6372, CompoundButton compoundButton, boolean z) {
        int iIntValue = ((Integer) compoundButton.getTag()).intValue();
        if (z) {
            activityC6372.f19709 = iIntValue | activityC6372.f19709;
        } else {
            activityC6372.f19709 = (~iIntValue) & activityC6372.f19709;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C21282 c21282 = new C21282(this, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new C17014(i, this));
        C18342.m42767(view, c21282);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17667(final ActivityC6372 activityC6372, final int i, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            activityC6372.m17665(-1, (C21190) activityC6372.f19708.f27871.get(i));
            return;
        }
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6372);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44424(activityC6372.getString(R.string.MT_Protector, ((C21190) activityC6372.f19708.f27871.get(i)).m48140()));
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩺ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC6372.m17666(this.f73048, i);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17666(ActivityC6372 activityC6372, int i) {
        activityC6372.f19708.f27871.remove(i);
        try {
            C16249.m38217(activityC6372.f19708);
        } catch (IOException e) {
            activityC6372.m10223(e, (DialogInterface.OnDismissListener) null);
        }
        activityC6372.f19711.notifyDataSetChanged();
    }
}
