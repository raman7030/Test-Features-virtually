package p067l;

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
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۛ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC8425 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final /* synthetic */ int f22580 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public C11108 f22581;

    /* JADX INFO: renamed from: ܳۧ */
    public int f22582;

    /* JADX INFO: renamed from: ܿۧ */
    public C25189 f22583;

    /* JADX INFO: renamed from: ᩳۧ */
    public C5743 f22584;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C21167 f22585;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "SchemeEditorActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        ListView listView = (ListView) m12277(android.R.id.list);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC7140(1, this));
        String stringExtra = getIntent().getStringExtra("schemeName");
        C12826.requireNonNull(stringExtra);
        setTitle(stringExtra);
        try {
            this.f22581 = C17812.m40435(stringExtra);
        } catch (Exception unused) {
            this.f22581 = new C11108(stringExtra);
        }
        C5743 c5743 = new C5743(this);
        this.f22584 = c5743;
        listView.setAdapter((ListAdapter) c5743);
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
        m19610(-1, (C22508) null);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m19610(i, (C22508) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19614(ActivityC8425 activityC8425, C12449 c12449, CompoundButton compoundButton, CompoundButton compoundButton2, CompoundButton compoundButton3, CompoundButton compoundButton4, CompoundButton compoundButton5, CompoundButton compoundButton6, CompoundButton compoundButton7, C22508 c22508, int i, DialogInterfaceC2564 dialogInterfaceC2564) {
        Spinner spinner = c12449.f34803;
        if (spinner.getSelectedItemPosition() != 2) {
            if (!compoundButton.isChecked() && !compoundButton2.isChecked() && !compoundButton3.isChecked()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            C21167 c21167 = activityC8425.f22585;
            if (c21167.f66492.m44476() && c21167.f66496.m44476() && c21167.f66498.m44476()) {
                if (spinner.getSelectedItemPosition() == 1 && activityC8425.f22582 == 0) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
            } else {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
        } else {
            if (!compoundButton4.isChecked() && !compoundButton5.isChecked() && !compoundButton6.isChecked() && !compoundButton7.isChecked()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            C25189 c25189 = activityC8425.f22583;
            if (!c25189.f80565.m44476() || !c25189.f80567.m44476() || !c25189.f80571.m44476()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
        }
        c22508.f70973 = spinner.getSelectedItemPosition();
        activityC8425.f22585.f66497 = compoundButton.isChecked();
        activityC8425.f22585.f66495 = compoundButton3.isChecked();
        activityC8425.f22585.f66493 = compoundButton2.isChecked();
        activityC8425.f22583.f80566 = compoundButton4.isChecked();
        activityC8425.f22583.f80570 = compoundButton5.isChecked();
        activityC8425.f22583.f80568 = compoundButton6.isChecked();
        activityC8425.f22583.f80569 = compoundButton7.isChecked();
        c22508.f70974 = activityC8425.f22585;
        c22508.f70972 = activityC8425.f22583;
        c22508.f70975 = activityC8425.f22582;
        if (i == -1) {
            activityC8425.f22581.f30810.add(c22508);
        }
        try {
            C17812.m40431(activityC8425.f22581);
        } catch (IOException e) {
            activityC8425.m12259(e, (DialogInterface.OnDismissListener) null);
        }
        activityC8425.f22584.notifyDataSetChanged();
        dialogInterfaceC2564.dismiss();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19615(final ActivityC8425 activityC8425, C12449 c12449, final TextView textView) {
        if (c12449.f34803.getSelectedItemPosition() != 2) {
            View viewM12252 = activityC8425.m12252(R.layout.MT_Protector);
            final C15130 c15130 = new C15130(viewM12252, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
            final C15130 c15131 = new C15130(viewM12252, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
            final C15130 c15132 = new C15130(viewM12252, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
            final C15130 c15133 = new C15130(viewM12252, R.id.header4, R.id.textInputLayout4, R.id.editText4, R.id.MT_Protector, R.id.MT_Protector);
            final C21167 c21167 = activityC8425.f22585;
            c15130.m34555(c21167.f66492);
            c15131.m34555(c21167.f66496);
            c15132.m34555(c21167.f66494);
            c15133.m34555(c21167.f66498);
            C20671 c20671BuildDialog = activityC8425.buildDialog();
            c20671BuildDialog.m46715(viewM12252);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46722(false);
            final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            C7204.m16545(dialogInterfaceC2564M46732);
            dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC8425.f22580;
                    ActivityC8425 activityC8426 = this.f51040;
                    activityC8426.getClass();
                    C15130 c15134 = c15130;
                    boolean zIsChecked = c15134.f43192.isChecked();
                    C15130 c15135 = c15131;
                    C15130 c15136 = c15132;
                    C15130 c15137 = c15133;
                    if (zIsChecked && c15135.f43192.isChecked() && c15136.f43192.isChecked() && c15137.f43192.isChecked()) {
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                    if (!c15134.f43192.isChecked() && c15134.m34556()) {
                        c15134.m34554(R.string.MT_Protector);
                        return;
                    }
                    if (!c15135.f43192.isChecked() && c15135.m34556()) {
                        c15135.m34554(R.string.MT_Protector);
                        return;
                    }
                    if (!c15137.f43192.isChecked() && c15137.m34556()) {
                        c15137.m34554(R.string.MT_Protector);
                        return;
                    }
                    try {
                        c15134.m34553();
                        c15135.m34553();
                        c15136.m34553();
                        c15137.m34553();
                        c15134.m34557();
                        c15135.m34557();
                        c15136.m34557();
                        c15137.m34557();
                        TextView textView2 = textView;
                        if (textView2.getVisibility() == 8) {
                            textView2.setVisibility(0);
                        }
                        textView2.setText(c21167.m47775());
                        dialogInterfaceC2564M46732.dismiss();
                    } catch (PatternSyntaxException e) {
                        activityC8426.m12259(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩸᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC8425.f22580;
                    C21837 c21837 = new C21837(this.f72806, c15130, c15131, c15132, c15133);
                    c21837.m33344(R.string.MT_Protector);
                    c21837.m33363("Smali");
                    c21837.m33351("Lxxx;->method()V");
                    c21837.m33356();
                    String strM16227 = C7050.m16227();
                    if (strM16227 != null) {
                        String[] strArrSplit = strM16227.split("->");
                        if (strArrSplit.length == 2) {
                            String str = strArrSplit[0];
                            if (str.length() > 2 && str.startsWith("L") && str.endsWith(C0249l.f1196b)) {
                                String[] strArrSplit2 = strArrSplit[1].split("\\(");
                                if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty()) {
                                    String[] strArrSplit3 = strArrSplit2[1].split("\\)");
                                    if (strArrSplit3.length == 2) {
                                        String str2 = strArrSplit3[0];
                                        String str3 = strArrSplit3[1];
                                        if (str2.matches("(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*") && str3.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                            c21837.m33336((CharSequence) strM16227);
                                            c21837.m33367();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c21837.m33352(true);
                }
            });
            return;
        }
        View viewM12253 = activityC8425.m12252(R.layout.MT_Protector);
        final C15130 c15134 = new C15130(viewM12253, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
        final C15130 c15135 = new C15130(viewM12253, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
        final C15130 c15136 = new C15130(viewM12253, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
        final C25189 c25189 = activityC8425.f22583;
        c15134.m34555(c25189.f80565);
        c15135.m34555(c25189.f80567);
        c15136.m34555(c25189.f80571);
        C20671 c20671BuildDialog2 = activityC8425.buildDialog();
        c20671BuildDialog2.m46715(viewM12253);
        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46733 = c20671BuildDialog2.m46732();
        C7204.m16545(dialogInterfaceC2564M46733);
        dialogInterfaceC2564M46733.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֨᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC8425.f22580;
                ActivityC8425 activityC8426 = this.f7910;
                activityC8426.getClass();
                C15130 c15137 = c15134;
                boolean zIsChecked = c15137.f43192.isChecked();
                C15130 c15138 = c15135;
                C15130 c15139 = c15136;
                if (zIsChecked && c15138.f43192.isChecked() && c15139.f43192.isChecked()) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                if (!c15137.f43192.isChecked() && c15137.m34556()) {
                    c15137.m34554(R.string.MT_Protector);
                    return;
                }
                if (!c15138.f43192.isChecked() && c15138.m34556()) {
                    c15138.m34554(R.string.MT_Protector);
                    return;
                }
                if (!c15139.f43192.isChecked() && c15139.m34556()) {
                    c15139.m34554(R.string.MT_Protector);
                    return;
                }
                try {
                    c15137.m34553();
                    c15138.m34553();
                    c15139.m34553();
                    c15137.m34557();
                    c15138.m34557();
                    c15139.m34557();
                    TextView textView2 = textView;
                    if (textView2.getVisibility() == 8) {
                        textView2.setVisibility(0);
                    }
                    textView2.setText(c25189.m55258());
                    dialogInterfaceC2564M46733.dismiss();
                } catch (PatternSyntaxException e) {
                    activityC8426.m12259(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
        dialogInterfaceC2564M46733.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC8425.f22580;
                C7084 c7084 = new C7084(this.f28862, c15134, c15135, c15136);
                c7084.m33344(R.string.MT_Protector);
                c7084.m33363("Smali");
                c7084.m33351("Lxxx;->field:I");
                c7084.m33356();
                String strM16227 = C7050.m16227();
                if (strM16227 != null) {
                    String[] strArrSplit = strM16227.split("->");
                    if (strArrSplit.length == 2) {
                        String str = strArrSplit[0];
                        if (str.length() > 2 && str.startsWith("L") && str.endsWith(C0249l.f1196b)) {
                            String[] strArrSplit2 = strArrSplit[1].split(":");
                            if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty() && strArrSplit2[1].matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                c7084.m33336((CharSequence) strM16227);
                                c7084.m33367();
                            }
                        }
                    }
                }
                c7084.m33352(true);
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
    /* JADX INFO: renamed from: ֫ */
    private void m19610(final int i, C22508 c22508) {
        C22508 c22509;
        final C22508 c225010;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i != -1) {
            c22509 = (C22508) this.f22581.f30810.get(i);
        } else {
            if (c22508 != null) {
                C22508 c225011 = new C22508();
                c225011.f70974 = new C21167();
                c225011.f70972 = new C25189();
                c225011.f70973 = c22508.f70973;
                c225011.f70974.m47776(c22508.f70974);
                c225011.f70972.m55259(c22508.f70972);
                c225011.f70975 = c22508.f70975;
                c225010 = c225011;
            } else {
                c22509 = new C22508();
            }
            this.f22582 = c225010.f70975;
            this.f22585 = new C21167();
            this.f22583 = new C25189();
            this.f22585.m47776(c225010.f70974);
            this.f22583.m55259(c225010.f70972);
            View viewM12252 = m12252(R.layout.MT_Protector);
            final C12449 c12449 = new C12449();
            c12449.f34801 = c225010;
            Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner1);
            c12449.f34803 = spinner;
            spinner.setAdapter((SpinnerAdapter) new C21438(this, getResources().getStringArray(R.array.MT_Protector)));
            c12449.f34798 = viewM12252.findViewById(R.id.MT_Protector);
            c12449.f34799 = viewM12252.findViewById(R.id.MT_Protector);
            c12449.f34802 = viewM12252.findViewById(R.id.MT_Protector);
            c12449.f34797 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            c12449.f34800 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            final CompoundButton compoundButton = (CompoundButton) viewM12252.findViewById(R.id.switch1);
            final CompoundButton compoundButton2 = (CompoundButton) viewM12252.findViewById(R.id.switch2);
            final CompoundButton compoundButton3 = (CompoundButton) viewM12252.findViewById(R.id.switch3);
            final CompoundButton compoundButton4 = (CompoundButton) viewM12252.findViewById(R.id.switch4);
            final CompoundButton compoundButton5 = (CompoundButton) viewM12252.findViewById(R.id.switch5);
            final CompoundButton compoundButton6 = (CompoundButton) viewM12252.findViewById(R.id.switch6);
            final CompoundButton compoundButton7 = (CompoundButton) viewM12252.findViewById(R.id.switch7);
            View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
            final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
            CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
            CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
            CheckBox checkBox4 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
            CheckBox checkBox5 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
            CheckBox checkBox6 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
            spinner.setSelection(c225010.f70973);
            c12449.m28664(c225010.f70973);
            spinner.setOnItemSelectedListener(new C14460(c12449));
            checkBox.setTag(1);
            checkBox2.setTag(2);
            checkBox3.setTag(4);
            checkBox4.setTag(8);
            checkBox5.setTag(16);
            checkBox6.setTag(32);
            C20755 c20755 = new C20755(this, 1);
            checkBox.setOnCheckedChangeListener(c20755);
            checkBox2.setOnCheckedChangeListener(c20755);
            checkBox3.setOnCheckedChangeListener(c20755);
            checkBox4.setOnCheckedChangeListener(c20755);
            checkBox5.setOnCheckedChangeListener(c20755);
            checkBox6.setOnCheckedChangeListener(c20755);
            compoundButton.setChecked(c225010.f70974.f66497);
            compoundButton2.setChecked(c225010.f70974.f66495);
            compoundButton3.setChecked(c225010.f70974.f66493);
            compoundButton4.setChecked(c225010.f70972.f80566);
            compoundButton5.setChecked(c225010.f70972.f80570);
            compoundButton6.setChecked(c225010.f70972.f80568);
            compoundButton7.setChecked(c225010.f70972.f80569);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.֡᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC8425.m19615(this.f5509, c12449, textView);
                }
            };
            viewFindViewById.setOnClickListener(onClickListener);
            textView.setOnClickListener(onClickListener);
            if ((c225010.f70975 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            checkBox.setChecked(z);
            if ((c225010.f70975 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            checkBox2.setChecked(z2);
            if ((c225010.f70975 & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            checkBox3.setChecked(z3);
            if ((c225010.f70975 & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            checkBox4.setChecked(z4);
            if ((c225010.f70975 & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkBox5.setChecked(z5);
            if ((c225010.f70975 & 32) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            checkBox6.setChecked(z6);
            C20671 c20671BuildDialog = buildDialog();
            c20671BuildDialog.m46715(viewM12252);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46722(false);
            final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            C7204.m16545(dialogInterfaceC2564M46732);
            dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC8425.m19614(this.f20350, c12449, compoundButton, compoundButton3, compoundButton2, compoundButton4, compoundButton5, compoundButton6, compoundButton7, c225010, i, dialogInterfaceC2564M46732);
                }
            });
        }
        c225010 = c22509;
        this.f22582 = c225010.f70975;
        this.f22585 = new C21167();
        this.f22583 = new C25189();
        this.f22585.m47776(c225010.f70974);
        this.f22583.m55259(c225010.f70972);
        View viewM12253 = m12252(R.layout.MT_Protector);
        final C12449 c124410 = new C12449();
        c124410.f34801 = c225010;
        Spinner spinner2 = (Spinner) viewM12253.findViewById(R.id.spinner1);
        c124410.f34803 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) new C21438(this, getResources().getStringArray(R.array.MT_Protector)));
        c124410.f34798 = viewM12253.findViewById(R.id.MT_Protector);
        c124410.f34799 = viewM12253.findViewById(R.id.MT_Protector);
        c124410.f34802 = viewM12253.findViewById(R.id.MT_Protector);
        c124410.f34797 = (TextView) viewM12253.findViewById(R.id.MT_Protector);
        c124410.f34800 = (TextView) viewM12253.findViewById(R.id.MT_Protector);
        final CompoundButton compoundButton8 = (CompoundButton) viewM12253.findViewById(R.id.switch1);
        final CompoundButton compoundButton9 = (CompoundButton) viewM12253.findViewById(R.id.switch2);
        final CompoundButton compoundButton10 = (CompoundButton) viewM12253.findViewById(R.id.switch3);
        final CompoundButton compoundButton11 = (CompoundButton) viewM12253.findViewById(R.id.switch4);
        final CompoundButton compoundButton12 = (CompoundButton) viewM12253.findViewById(R.id.switch5);
        final CompoundButton compoundButton13 = (CompoundButton) viewM12253.findViewById(R.id.switch6);
        final CompoundButton compoundButton14 = (CompoundButton) viewM12253.findViewById(R.id.switch7);
        View viewFindViewById2 = viewM12253.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM12253.findViewById(R.id.MT_Protector);
        CheckBox checkBox7 = (CheckBox) viewM12253.findViewById(R.id.MT_Protector);
        CheckBox checkBox8 = (CheckBox) viewM12253.findViewById(R.id.MT_Protector);
        CheckBox checkBox9 = (CheckBox) viewM12253.findViewById(R.id.MT_Protector);
        CheckBox checkBox10 = (CheckBox) viewM12253.findViewById(R.id.MT_Protector);
        CheckBox checkBox11 = (CheckBox) viewM12253.findViewById(R.id.MT_Protector);
        CheckBox checkBox12 = (CheckBox) viewM12253.findViewById(R.id.MT_Protector);
        spinner2.setSelection(c225010.f70973);
        c124410.m28664(c225010.f70973);
        spinner2.setOnItemSelectedListener(new C14460(c124410));
        checkBox7.setTag(1);
        checkBox8.setTag(2);
        checkBox9.setTag(4);
        checkBox10.setTag(8);
        checkBox11.setTag(16);
        checkBox12.setTag(32);
        C20755 c20756 = new C20755(this, 1);
        checkBox7.setOnCheckedChangeListener(c20756);
        checkBox8.setOnCheckedChangeListener(c20756);
        checkBox9.setOnCheckedChangeListener(c20756);
        checkBox10.setOnCheckedChangeListener(c20756);
        checkBox11.setOnCheckedChangeListener(c20756);
        checkBox12.setOnCheckedChangeListener(c20756);
        compoundButton8.setChecked(c225010.f70974.f66497);
        compoundButton9.setChecked(c225010.f70974.f66495);
        compoundButton10.setChecked(c225010.f70974.f66493);
        compoundButton11.setChecked(c225010.f70972.f80566);
        compoundButton12.setChecked(c225010.f70972.f80570);
        compoundButton13.setChecked(c225010.f70972.f80568);
        compoundButton14.setChecked(c225010.f70972.f80569);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.֡᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC8425.m19615(this.f5509, c124410, textView2);
            }
        };
        viewFindViewById2.setOnClickListener(onClickListener2);
        textView2.setOnClickListener(onClickListener2);
        if ((c225010.f70975 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        checkBox7.setChecked(z);
        if ((c225010.f70975 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkBox8.setChecked(z2);
        if ((c225010.f70975 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        checkBox9.setChecked(z3);
        if ((c225010.f70975 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        checkBox10.setChecked(z4);
        if ((c225010.f70975 & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        checkBox11.setChecked(z5);
        if ((c225010.f70975 & 32) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        checkBox12.setChecked(z6);
        C20671 c20671BuildDialog2 = buildDialog();
        c20671BuildDialog2.m46715(viewM12253);
        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46733 = c20671BuildDialog2.m46732();
        C7204.m16545(dialogInterfaceC2564M46733);
        dialogInterfaceC2564M46733.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC8425.m19614(this.f20350, c124410, compoundButton8, compoundButton10, compoundButton9, compoundButton11, compoundButton12, compoundButton13, compoundButton14, c225010, i, dialogInterfaceC2564M46733);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m19613(ActivityC8425 activityC8425, CompoundButton compoundButton, boolean z) {
        int iIntValue = ((Integer) compoundButton.getTag()).intValue();
        if (z) {
            activityC8425.f22582 = iIntValue | activityC8425.f22582;
        } else {
            activityC8425.f22582 = (~iIntValue) & activityC8425.f22582;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C1898 c1898 = new C1898(this, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new C18538(i, this));
        C19801.m45029(view, c1898);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19612(final ActivityC8425 activityC8425, final int i, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            activityC8425.m19610(-1, (C22508) activityC8425.f22581.f30810.get(i));
            return;
        }
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC8425);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(activityC8425.getString(R.string.MT_Protector, ((C22508) activityC8425.f22581.f30810.get(i)).m50470()));
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩺ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC8425.m19611(this.f75775, i);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19611(ActivityC8425 activityC8425, int i) {
        activityC8425.f22581.f30810.remove(i);
        try {
            C17812.m40431(activityC8425.f22581);
        } catch (IOException e) {
            activityC8425.m12259(e, (DialogInterface.OnDismissListener) null);
        }
        activityC8425.f22584.notifyDataSetChanged();
    }
}
