package p067l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.google.android.material.textfield.TextInputLayout;
import java.net.Inet4Address;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩸۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C22882 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f72019 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f72020;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f72022;

    /* JADX INFO: renamed from: ܿ */
    public static int f72023;

    /* JADX INFO: renamed from: ᩳ */
    public static C2485 f72024;

    /* JADX INFO: renamed from: ᩻ */
    public static final Set f72025 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ܳ */
    public static final BroadcastReceiver f72021 = new C3435();

    /* JADX INFO: renamed from: ֫ */
    public static void m51103(final AbstractActivityC5549 abstractActivityC5549, int i) {
        final C22882 c22882 = new C22882();
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        final ImageView imageView = (ImageView) viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        final TextView textView3 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM12252.findViewById(R.id.MT_Protector);
        final C23552 c23552 = (C23552) viewM12252.findViewById(R.id.MT_Protector);
        final ImageView imageView2 = (ImageView) viewM12252.findViewById(R.id.MT_Protector);
        RadioGroup radioGroup = (RadioGroup) viewM12252.findViewById(R.id.MT_Protector);
        int i2 = i == 1 ? 1 : 0;
        final int[] iArr = {i2};
        final String[] strArr = {null};
        final boolean[] zArr = {true};
        final long[] jArr = {0};
        final Runnable[] runnableArr = new Runnable[1];
        int i3 = i2;
        runnableArr[0] = new Runnable() { // from class: l.ۧ۫ܿ
            @Override // java.lang.Runnable
            public final void run() {
                long jM7723 = ServiceC3906.m7723();
                long jMax = Math.max(jArr[0] - System.currentTimeMillis(), 0L);
                C23552 c23553 = c23552;
                c23553.m52337(jMax, jM7723);
                if (zArr[0] && viewFindViewById3.getVisibility() == 0 && jMax > 0) {
                    c23553.postDelayed(runnableArr[0], 200L);
                }
            }
        };
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46714(new DialogInterface.OnDismissListener() { // from class: l.ۢ۫ܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C22882.m51104(zArr, c23552, runnableArr, abstractActivityC5549);
            }
        });
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671BuildDialog.m46709();
        dialogInterfaceC2564M46709.m3851(new DialogInterfaceOnShowListenerC10812());
        dialogInterfaceC2564M46709.m3862();
        final RunnableC12405 runnableC12405M19536 = C8381.m19536(viewM12252.findViewById(R.id.MT_Protector), abstractActivityC5549, dialogInterfaceC2564M46709);
        ViewOnClickListenerC16447.m37363(textView2);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܺ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22882.m51102(abstractActivityC5549);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(c22882) { // from class: l.ۖ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                int i4 = iArr[0];
                String str = strArr[0];
                if (!C22882.m51105(i4, str, i4 == 0 ? ServiceC3906.m7715() : ServiceC9901.m23194())) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                try {
                    View viewM12253 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                    ImageView imageView3 = (ImageView) viewM12253.findViewById(R.id.MT_Protector);
                    TextView textView4 = (TextView) viewM12253.findViewById(R.id.MT_Protector);
                    imageView3.setImageBitmap(C22882.m51097(C13076.m29939(220.0f), str));
                    ViewOnClickListenerC16447.m37364(textView4, str);
                    int i5 = DialogInterfaceC2564.f4230;
                    C20671 c20671 = new C20671(abstractActivityC55410);
                    c20671.m46727(R.string.MT_Protector);
                    c20671.m46715(viewM12253);
                    c20671.m46736(R.string.MT_Protector, null);
                    c20671.m46732();
                } catch (RuntimeException | C11355 unused) {
                    C22682.m50793(R.string.MT_Protector);
                }
            }
        });
        dialogInterfaceC2564M46709.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = iArr[0];
                final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (i4 == 0) {
                    View viewM12253 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                    final EditText editText = (EditText) viewM12253.findViewById(R.id.MT_Protector);
                    final EditText editText2 = (EditText) viewM12253.findViewById(R.id.editText4);
                    final TextInputLayout textInputLayout = (TextInputLayout) viewM12253.findViewById(R.id.textInputLayout4);
                    final EditText editText3 = (EditText) viewM12253.findViewById(R.id.MT_Protector);
                    final TextInputLayout textInputLayout2 = (TextInputLayout) viewM12253.findViewById(R.id.MT_Protector);
                    ((TextView) viewM12253.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
                    viewM12253.findViewById(R.id.textView2).setVisibility(8);
                    viewM12253.findViewById(R.id.editText2).setVisibility(8);
                    viewM12253.findViewById(R.id.textView3).setVisibility(8);
                    viewM12253.findViewById(R.id.editText3).setVisibility(8);
                    ((TextView) viewM12253.findViewById(R.id.textView5)).setText(R.string.MT_Protector);
                    ((TextView) viewM12253.findViewById(R.id.textView6)).setVisibility(0);
                    Button button = (Button) viewM12253.findViewById(R.id.MT_Protector);
                    button.setVisibility(0);
                    final C22882 c22883 = this.f15380;
                    button.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۫ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final AbstractActivityC5549 abstractActivityC55411 = abstractActivityC55410;
                            View viewM12254 = abstractActivityC55411.m12252(R.layout.MT_Protector);
                            ((TextView) viewM12254.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            ListView listView = (ListView) viewM12254.findViewById(R.id.MT_Protector);
                            final C10141 c10141 = new C10141(abstractActivityC55411);
                            listView.setAdapter((ListAdapter) c10141);
                            C7040.m16181(listView);
                            final C22882 c22884 = c22883;
                            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.᩻۫ܿ
                                @Override // android.widget.AdapterView.OnItemClickListener
                                public final void onItemClick(AdapterView adapterView, View view3, int i5, long j) {
                                    C10141 c10142 = c10141;
                                    if (c10142.m23633()) {
                                        return;
                                    }
                                    C18360 c18360M23632 = c10142.m23632(i5);
                                    AbstractActivityC5549 abstractActivityC55412 = abstractActivityC55411;
                                    View viewM12255 = abstractActivityC55412.m12252(R.layout.MT_Protector);
                                    String string = abstractActivityC55412.getString(c18360M23632.m41809() ? R.string.MT_Protector : R.string.MT_Protector);
                                    String strM41804 = c18360M23632.m41804();
                                    if (TextUtils.isEmpty(strM41804)) {
                                        strM41804 = abstractActivityC55412.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM12255.findViewById(R.id.MT_Protector)).setText(strM41804);
                                    ((TextView) viewM12255.findViewById(R.id.MT_Protector)).setText(string);
                                    long jM41806 = c18360M23632.m41806();
                                    ((TextView) viewM12255.findViewById(R.id.MT_Protector)).setText(jM41806 <= 0 ? abstractActivityC55412.getString(R.string.MT_Protector) : C18794.m42823(jM41806));
                                    long jM41808 = c18360M23632.m41808();
                                    ((TextView) viewM12255.findViewById(R.id.MT_Protector)).setText(jM41808 <= 0 ? abstractActivityC55412.getString(R.string.MT_Protector) : C18794.m42823(jM41808));
                                    String strM41807 = c18360M23632.m41807();
                                    if (TextUtils.isEmpty(strM41807)) {
                                        strM41807 = abstractActivityC55412.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM12255.findViewById(R.id.MT_Protector)).setText(strM41807);
                                    String strM41805 = c18360M23632.m41805();
                                    if (TextUtils.isEmpty(strM41805)) {
                                        strM41805 = abstractActivityC55412.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM12255.findViewById(R.id.MT_Protector)).setText(strM41805);
                                    int i6 = DialogInterfaceC2564.f4230;
                                    C20671 c20671 = new C20671(abstractActivityC55412);
                                    c20671.m46715(viewM12255);
                                    c20671.m46736(R.string.MT_Protector, null);
                                    c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                    DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
                                    dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener(c22884, abstractActivityC55412, c18360M23632, c10142, dialogInterfaceC2564M46732) { // from class: l.ۜ۫ܿ

                                        /* JADX INFO: renamed from: ۙ */
                                        public final /* synthetic */ DialogInterfaceC2564 f23891;

                                        /* JADX INFO: renamed from: ᩶ */
                                        public final /* synthetic */ C10141 f23892;

                                        /* JADX INFO: renamed from: ᩸ */
                                        public final /* synthetic */ AbstractActivityC5549 f23893;

                                        /* JADX INFO: renamed from: ᩹ */
                                        public final /* synthetic */ C18360 f23894;

                                        {
                                            this.f23893 = abstractActivityC55412;
                                            this.f23894 = c18360M23632;
                                            this.f23892 = c10142;
                                            this.f23891 = dialogInterfaceC2564M46732;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            final C18360 c18360 = this.f23894;
                                            String strM41806 = c18360.m41804();
                                            boolean zIsEmpty = TextUtils.isEmpty(strM41806);
                                            AbstractActivityC5549 abstractActivityC55413 = this.f23893;
                                            if (zIsEmpty) {
                                                strM41806 = abstractActivityC55413.getString(R.string.MT_Protector);
                                            }
                                            int i7 = DialogInterfaceC2564.f4230;
                                            C20671 c20672 = new C20671(abstractActivityC55413);
                                            c20672.m46727(R.string.MT_Protector);
                                            c20672.m46718(abstractActivityC55413.getString(R.string.MT_Protector, strM41806));
                                            final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20672, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                            Button buttonM3860 = dialogInterfaceC2564M21200.m3860();
                                            final DialogInterfaceC2564 dialogInterfaceC2564 = this.f23891;
                                            final C10141 c10143 = this.f23892;
                                            buttonM3860.setOnClickListener(new View.OnClickListener() { // from class: l.᩷۫ܿ
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view5) {
                                                    dialogInterfaceC2564M21200.dismiss();
                                                    if (ServiceC3906.m7714(c18360.m41803())) {
                                                        dialogInterfaceC2564.dismiss();
                                                        c10143.m23634();
                                                    } else {
                                                        C22682.m50793(R.string.MT_Protector);
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                            int i5 = DialogInterfaceC2564.f4230;
                            C20671 c20671 = new C20671(abstractActivityC55411);
                            c20671.m46715(viewM12254);
                            c20671.m46736(R.string.MT_Protector, null);
                            c20671.m46732();
                        }
                    });
                    editText.setText(C5918.m13301().mo25505());
                    editText2.setText(String.valueOf(C5918.m13302()));
                    editText3.setHint(R.string.MT_Protector);
                    editText3.setInputType(2);
                    editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    editText3.setText(C5918.m13298());
                    C15523.m35318(abstractActivityC55410, (TextInputLayout) viewM12253.findViewById(R.id.MT_Protector), editText, (RunnableC22217) null);
                    C12166.m28086(textInputLayout);
                    C12166.m28086(textInputLayout2);
                    int i5 = DialogInterfaceC2564.f4230;
                    C20671 c20671 = new C20671(abstractActivityC55410);
                    c20671.m46727(R.string.MT_Protector);
                    c20671.m46715(viewM12253);
                    c20671.m46736(R.string.MT_Protector, null);
                    c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671.m46722(false);
                    final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
                    dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ۫ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C22882.m51101(textInputLayout, editText2, editText3, textInputLayout2, editText, dialogInterfaceC2564M46732);
                        }
                    });
                    C7204.m16545(dialogInterfaceC2564M46732);
                    return;
                }
                View viewM12254 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                final EditText editText4 = (EditText) viewM12254.findViewById(R.id.MT_Protector);
                final EditText editText5 = (EditText) viewM12254.findViewById(R.id.editText2);
                final EditText editText6 = (EditText) viewM12254.findViewById(R.id.editText3);
                final EditText editText7 = (EditText) viewM12254.findViewById(R.id.editText4);
                final TextInputLayout textInputLayout3 = (TextInputLayout) viewM12254.findViewById(R.id.textInputLayout4);
                final EditText editText8 = (EditText) viewM12254.findViewById(R.id.MT_Protector);
                editText4.setText(C16606.m37624().mo25505());
                editText5.setText(C16606.m37623());
                editText6.setText(C16606.m37626());
                editText8.setText(C16606.m37622());
                editText7.setText(String.valueOf(C16606.m37625()));
                AbstractC5769.m12913(editText8, abstractActivityC55410);
                C15523.m35318(abstractActivityC55410, (TextInputLayout) viewM12254.findViewById(R.id.MT_Protector), editText4, (RunnableC22217) null);
                C12166.m28086(textInputLayout3);
                int i6 = DialogInterfaceC2564.f4230;
                C20671 c20672 = new C20671(abstractActivityC55410);
                c20672.m46727(R.string.MT_Protector);
                c20672.m46715(viewM12254);
                c20672.m46736(R.string.MT_Protector, null);
                c20672.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20672.m46722(false);
                final DialogInterfaceC2564 dialogInterfaceC2564M46733 = c20672.m46732();
                dialogInterfaceC2564M46733.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܽ۫ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C22882.m51100(textInputLayout3, editText7, editText4, editText5, editText6, editText8, dialogInterfaceC2564M46733);
                    }
                });
                C7204.m16545(dialogInterfaceC2564M46733);
            }
        });
        final Button buttonM3861 = dialogInterfaceC2564M46709.m3861();
        final Button buttonM3860 = dialogInterfaceC2564M46709.m3860();
        buttonM3861.setOnClickListener(new ViewOnClickListenerC20613(1, iArr));
        radioGroup.check(i3 == 1 ? R.id.MT_Protector : R.id.MT_Protector);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.ᩴ۫ܿ
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                C22882.m51099(i4, iArr);
            }
        });
        Runnable runnable = new Runnable(c22882) { // from class: l.᩵۫ܿ
            /* JADX WARN: Code duplicated, block: B:56:0x0142  */
            /* JADX WARN: Code duplicated, block: B:57:0x014b  */
            /* JADX WARN: Code duplicated, block: B:60:0x015f  */
            @Override // java.lang.Runnable
            public final void run() {
                String strM7719;
                boolean zM51105;
                ImageView imageView3;
                View view;
                String[] strArr2;
                String strM48621;
                if (zArr[0]) {
                    runnableC12405M19536.run();
                    int[] iArr2 = iArr;
                    boolean zM7715 = iArr2[0] == 0 ? ServiceC3906.m7715() : ServiceC9901.m23194();
                    Runnable[] runnableArr2 = runnableArr;
                    c23552.removeCallbacks(runnableArr2[0]);
                    View view2 = viewFindViewById3;
                    view2.setVisibility(8);
                    buttonM3860.setText((ServiceC3906.m7715() || ServiceC9901.m23194()) ? R.string.MT_Protector : R.string.MT_Protector);
                    buttonM3861.setText(zM7715 ? R.string.MT_Protector : R.string.MT_Protector);
                    Inet4Address inet4AddressM33388 = C14595.m33388();
                    ImageView imageView4 = imageView2;
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    int i4 = R.string.MT_Protector;
                    if (inet4AddressM33388 != null) {
                        imageView4.setImageResource(R.drawable.MT_Protector);
                        if (zM7715) {
                            textView4.setText(iArr2[0] == 0 ? R.string.MT_Protector : R.string.MT_Protector);
                            strM7719 = iArr2[0] == 0 ? ServiceC3906.m7719() : ServiceC9901.m23190();
                            textView5.setText(strM7719);
                            if (iArr2[0] == 0) {
                                String strM7718 = ServiceC3906.m7718();
                                long jM7720 = ServiceC3906.m7720();
                                if (!TextUtils.isEmpty(strM7718) && jM7720 > System.currentTimeMillis()) {
                                    jArr[0] = jM7720;
                                    if (strM7718.length() == 6) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(strM7718.substring(0, 3));
                                        sb.append(" ");
                                        strM48621 = C21459.m48621(3, strM7718, sb);
                                    } else {
                                        strM48621 = strM7718;
                                    }
                                    String strM16203 = C7050.m16203(R.string.MT_Protector, strM48621);
                                    int iIndexOf = strM16203.indexOf(strM48621);
                                    int length = strM7718.length();
                                    TextView textView6 = textView3;
                                    CharSequence charSequence = strM16203;
                                    charSequence = strM16203;
                                    if (length == 6 && iIndexOf >= 0) {
                                        int iMax = Math.max(C13076.m29939(2.0f), Math.round(textView6.getTextSize() * 0.15f));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM16203);
                                        spannableStringBuilder.setSpan(new C16845(iMax), iIndexOf + 3, iIndexOf + 4, 33);
                                        charSequence = spannableStringBuilder;
                                    }
                                    textView6.setText(charSequence);
                                    view2.setVisibility(0);
                                    runnableArr2[0].run();
                                }
                            }
                        } else {
                            textView4.setText(R.string.MT_Protector);
                            textView5.setText(R.string.MT_Protector);
                        }
                        zM51105 = C22882.m51105(iArr2[0], strM7719, zM7715);
                        imageView3 = imageView;
                        view = viewFindViewById2;
                        strArr2 = strArr;
                        if (zM51105) {
                            strArr2[0] = strM7719;
                            imageView3.setVisibility(0);
                            view.setVisibility(0);
                        } else {
                            strArr2[0] = null;
                            imageView3.setVisibility(4);
                            view.setVisibility(4);
                        }
                        View view3 = viewFindViewById;
                        view3.setVisibility(C13096.m29961(view3.getContext()) ? 8 : 0);
                    }
                    imageView4.setImageResource(R.drawable.MT_Protector);
                    if (zM7715) {
                        i4 = R.string.MT_Protector;
                    }
                    textView4.setText(i4);
                    textView5.setText(R.string.MT_Protector);
                    strM7719 = null;
                    zM51105 = C22882.m51105(iArr2[0], strM7719, zM7715);
                    imageView3 = imageView;
                    view = viewFindViewById2;
                    strArr2 = strArr;
                    if (zM51105) {
                        strArr2[0] = strM7719;
                        imageView3.setVisibility(0);
                        view.setVisibility(0);
                    } else {
                        strArr2[0] = null;
                        imageView3.setVisibility(4);
                        view.setVisibility(4);
                    }
                    View view4 = viewFindViewById;
                    view4.setVisibility(C13096.m29961(view4.getContext()) ? 8 : 0);
                }
            }
        };
        viewM12252.setTag(runnable);
        f72025.add(runnable);
        m51113();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51104(boolean[] zArr, C23552 c23552, Runnable[] runnableArr, AbstractActivityC5549 abstractActivityC5549) {
        zArr[0] = false;
        c23552.removeCallbacks(runnableArr[0]);
        int i = f72023;
        if (i != 0) {
            int i2 = i - 1;
            f72023 = i2;
            if (i2 == 0) {
                f72024.m3594();
                f72024 = null;
                C7050.m16207(f72021);
            }
        }
        if (abstractActivityC5549 instanceof ActivityC17067) {
            abstractActivityC5549.finish();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51102(AbstractActivityC5549 abstractActivityC5549) {
        abstractActivityC5549.m12255(new RunnableC19529());
        C13096.m29962(abstractActivityC5549);
        m51113();
        C7050.m16213(new RunnableC2764(), 1000L);
        C7050.m16213(new RunnableC2764(), C0240c.f1145a);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51099(int i, int[] iArr) {
        int i2 = i == R.id.MT_Protector ? 1 : 0;
        iArr[0] = i2;
        ApplicationC21448.f67650.edit().putInt("remote_manager_last_protocol", i2 != 1 ? 0 : 1).apply();
        m51113();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51098() {
        m51113();
        C7050.m16213(new RunnableC2764(), 1000L);
        C7050.m16213(new RunnableC2764(), C0240c.f1145a);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51105(int i, String str, boolean z) {
        if (i != 0 || !z || TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toString().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m51097(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0");
        }
        EnumC22084 enumC22084 = EnumC22084.AZTEC;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i);
        }
        C23424 c23424M31871 = C6660.m15173(str, EnumC2636.L).m31871();
        if (c23424M31871 == null) {
            throw new IllegalStateException();
        }
        int iM52112 = c23424M31871.m52112();
        int iM52111 = c23424M31871.m52111();
        int i2 = iM52112 + 8;
        int i3 = iM52111 + 8;
        int iMax = Math.max(i, i2);
        int iMax2 = Math.max(i, i3);
        int iMin = Math.min(iMax / i2, iMax2 / i3);
        int i4 = (iMax - (iM52112 * iMin)) / 2;
        int i5 = (iMax2 - (iM52111 * iMin)) / 2;
        C17388 c17388 = new C17388(iMax, iMax2);
        int i6 = 0;
        while (i6 < iM52111) {
            int i7 = 0;
            int i8 = i4;
            while (i7 < iM52112) {
                if (c23424M31871.m52106(i7, i6) == 1) {
                    c17388.m39614(i8, i5, iMin, iMin);
                }
                i7++;
                i8 += iMin;
            }
            i6++;
            i5 += iMin;
        }
        int[] iArr = new int[i * i];
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = i9 * i;
            for (int i11 = 0; i11 < i; i11++) {
                iArr[i10 + i11] = c17388.m39615(i11, i9) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51101(TextInputLayout textInputLayout, EditText editText, EditText editText2, TextInputLayout textInputLayout2, EditText editText3, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (m51106(textInputLayout, editText)) {
            String string = editText2.getText().toString();
            if (!C5918.m13300(string)) {
                textInputLayout2.setError(C7050.m16224(R.string.MT_Protector));
                editText2.requestFocus();
                return;
            }
            textInputLayout2.setError(null);
            textInputLayout2.setErrorEnabled(false);
            C5918.m13299(editText3.getText().toString(), editText.getText().toString(), string);
            if (ServiceC3906.m7715()) {
                f72022 = true;
                Application applicationM16232 = C7050.m16232();
                applicationM16232.stopService(new Intent(applicationM16232, (Class<?>) ServiceC3906.class));
            }
            dialogInterfaceC2564.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51100(TextInputLayout textInputLayout, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (m51106(textInputLayout, editText)) {
            C16606.m37619(editText2.getText().toString(), editText3.getText().toString(), editText4.getText().toString(), editText5.getText().toString(), editText.getText().toString());
            if (ServiceC9901.m23194()) {
                f72020 = true;
                Application applicationM16232 = C7050.m16232();
                applicationM16232.stopService(new Intent(applicationM16232, (Class<?>) ServiceC9901.class));
            }
            dialogInterfaceC2564.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51106(TextInputLayout textInputLayout, EditText editText) {
        if (C22622.m50681(editText.getText().toString()) == null) {
            textInputLayout.setError(C7050.m16224(R.string.MT_Protector));
            editText.requestFocus();
            return false;
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m51113() {
        Iterator it = f72025.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m51108() {
        if (f72023 == 0) {
            f72024 = new C2485(C7050.m16232(), new RunnableC2764());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STARTED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STOPPED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STARTED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STOPPED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
            C7050.m16208(f72021, intentFilter);
        }
        f72023++;
    }
}
