package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
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
public final class C21584 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69318 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f69319;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f69321;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f69322;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C0123 f69323;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f69324 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f69320 = new C1122();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48757(final AbstractActivityC3346 abstractActivityC3346, int i) {
        final C21584 c21584 = new C21584();
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        final ImageView imageView = (ImageView) viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM10216.findViewById(R.id.MT_Protector);
        final TextView textView3 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM10216.findViewById(R.id.MT_Protector);
        final C22289 c22289 = (C22289) viewM10216.findViewById(R.id.MT_Protector);
        final ImageView imageView2 = (ImageView) viewM10216.findViewById(R.id.MT_Protector);
        RadioGroup radioGroup = (RadioGroup) viewM10216.findViewById(R.id.MT_Protector);
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
                long jM5493 = ServiceC1618.m5493();
                long jMax = Math.max(jArr[0] - System.currentTimeMillis(), 0L);
                C22289 c222810 = c22289;
                c222810.m50009(jMax, jM5493);
                if (zArr[0] && viewFindViewById3.getVisibility() == 0 && jMax > 0) {
                    c222810.postDelayed(runnableArr[0], 200L);
                }
            }
        };
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44420(new DialogInterface.OnDismissListener() { // from class: l.ۢ۫ܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C21584.m48758(zArr, c22289, runnableArr, abstractActivityC3346);
            }
        });
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258BuildDialog.m44415();
        dialogInterfaceC0206M44415.m1438(new DialogInterfaceOnShowListenerC8884());
        dialogInterfaceC0206M44415.m1449();
        final RunnableC10560 runnableC10560M17596 = C6326.m17596(viewM10216.findViewById(R.id.MT_Protector), abstractActivityC3346, dialogInterfaceC0206M44415);
        ViewOnClickListenerC14813.m35215(textView2);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܺ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21584.m48756(abstractActivityC3346);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(c21584) { // from class: l.ۖ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                int i4 = iArr[0];
                String str = strArr[0];
                if (!C21584.m48759(i4, str, i4 == 0 ? ServiceC1618.m5485() : ServiceC7926.m21228())) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                try {
                    View viewM10217 = abstractActivityC3347.m10216(R.layout.MT_Protector);
                    ImageView imageView3 = (ImageView) viewM10217.findViewById(R.id.MT_Protector);
                    TextView textView4 = (TextView) viewM10217.findViewById(R.id.MT_Protector);
                    imageView3.setImageBitmap(C21584.m48751(C11266.m27878(220.0f), str));
                    ViewOnClickListenerC14813.m35216(textView4, str);
                    int i5 = DialogInterfaceC0206.f1451;
                    C19258 c19258 = new C19258(abstractActivityC3347);
                    c19258.m44433(R.string.MT_Protector);
                    c19258.m44421(viewM10217);
                    c19258.m44442(R.string.MT_Protector, null);
                    c19258.m44438();
                } catch (RuntimeException | C9456 unused) {
                    C21374.m48457(R.string.MT_Protector);
                }
            }
        });
        dialogInterfaceC0206M44415.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۫ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = iArr[0];
                final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (i4 == 0) {
                    View viewM10217 = abstractActivityC3347.m10216(R.layout.MT_Protector);
                    final EditText editText = (EditText) viewM10217.findViewById(R.id.MT_Protector);
                    final EditText editText2 = (EditText) viewM10217.findViewById(R.id.editText4);
                    final TextInputLayout textInputLayout = (TextInputLayout) viewM10217.findViewById(R.id.textInputLayout4);
                    final EditText editText3 = (EditText) viewM10217.findViewById(R.id.MT_Protector);
                    final TextInputLayout textInputLayout2 = (TextInputLayout) viewM10217.findViewById(R.id.MT_Protector);
                    ((TextView) viewM10217.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
                    viewM10217.findViewById(R.id.textView2).setVisibility(8);
                    viewM10217.findViewById(R.id.editText2).setVisibility(8);
                    viewM10217.findViewById(R.id.textView3).setVisibility(8);
                    viewM10217.findViewById(R.id.editText3).setVisibility(8);
                    ((TextView) viewM10217.findViewById(R.id.textView5)).setText(R.string.MT_Protector);
                    ((TextView) viewM10217.findViewById(R.id.textView6)).setVisibility(0);
                    Button button = (Button) viewM10217.findViewById(R.id.MT_Protector);
                    button.setVisibility(0);
                    final C21584 c21585 = this.f12572;
                    button.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۫ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final AbstractActivityC3346 abstractActivityC3348 = abstractActivityC3347;
                            View viewM10218 = abstractActivityC3348.m10216(R.layout.MT_Protector);
                            ((TextView) viewM10218.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            ListView listView = (ListView) viewM10218.findViewById(R.id.MT_Protector);
                            final C8178 c8178 = new C8178(abstractActivityC3348);
                            listView.setAdapter((ListAdapter) c8178);
                            C4915.m14284(listView);
                            final C21584 c21586 = c21585;
                            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.᩻۫ܿ
                                @Override // android.widget.AdapterView.OnItemClickListener
                                public final void onItemClick(AdapterView adapterView, View view3, int i5, long j) {
                                    C8178 c8179 = c8178;
                                    if (c8179.m21664()) {
                                        return;
                                    }
                                    C16826 c16826M21663 = c8179.m21663(i5);
                                    AbstractActivityC3346 abstractActivityC3349 = abstractActivityC3348;
                                    View viewM10219 = abstractActivityC3349.m10216(R.layout.MT_Protector);
                                    String string = abstractActivityC3349.getString(c16826M21663.m39573() ? R.string.MT_Protector : R.string.MT_Protector);
                                    String strM39568 = c16826M21663.m39568();
                                    if (TextUtils.isEmpty(strM39568)) {
                                        strM39568 = abstractActivityC3349.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM10219.findViewById(R.id.MT_Protector)).setText(strM39568);
                                    ((TextView) viewM10219.findViewById(R.id.MT_Protector)).setText(string);
                                    long jM39570 = c16826M21663.m39570();
                                    ((TextView) viewM10219.findViewById(R.id.MT_Protector)).setText(jM39570 <= 0 ? abstractActivityC3349.getString(R.string.MT_Protector) : C17283.m40572(jM39570));
                                    long jM39572 = c16826M21663.m39572();
                                    ((TextView) viewM10219.findViewById(R.id.MT_Protector)).setText(jM39572 <= 0 ? abstractActivityC3349.getString(R.string.MT_Protector) : C17283.m40572(jM39572));
                                    String strM39571 = c16826M21663.m39571();
                                    if (TextUtils.isEmpty(strM39571)) {
                                        strM39571 = abstractActivityC3349.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM10219.findViewById(R.id.MT_Protector)).setText(strM39571);
                                    String strM39569 = c16826M21663.m39569();
                                    if (TextUtils.isEmpty(strM39569)) {
                                        strM39569 = abstractActivityC3349.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM10219.findViewById(R.id.MT_Protector)).setText(strM39569);
                                    int i6 = DialogInterfaceC0206.f1451;
                                    C19258 c19258 = new C19258(abstractActivityC3349);
                                    c19258.m44421(viewM10219);
                                    c19258.m44442(R.string.MT_Protector, null);
                                    c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                    DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
                                    dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener(c21586, abstractActivityC3349, c16826M21663, c8179, dialogInterfaceC0206M44438) { // from class: l.ۜ۫ܿ

                                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ DialogInterfaceC0206 f21016;

                                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C8178 f21017;

                                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ AbstractActivityC3346 f21018;

                                        /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C16826 f21019;

                                        {
                                            this.f21018 = abstractActivityC3349;
                                            this.f21019 = c16826M21663;
                                            this.f21017 = c8179;
                                            this.f21016 = dialogInterfaceC0206M44438;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            final C16826 c16826 = this.f21019;
                                            String strM395610 = c16826.m39568();
                                            boolean zIsEmpty = TextUtils.isEmpty(strM395610);
                                            AbstractActivityC3346 abstractActivityC33410 = this.f21018;
                                            if (zIsEmpty) {
                                                strM395610 = abstractActivityC33410.getString(R.string.MT_Protector);
                                            }
                                            int i7 = DialogInterfaceC0206.f1451;
                                            C19258 c19259 = new C19258(abstractActivityC33410);
                                            c19259.m44433(R.string.MT_Protector);
                                            c19259.m44424(abstractActivityC33410.getString(R.string.MT_Protector, strM395610));
                                            final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19259, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                            Button buttonM1447 = dialogInterfaceC0206M19253.m1447();
                                            final DialogInterfaceC0206 dialogInterfaceC0206 = this.f21016;
                                            final C8178 c81710 = this.f21017;
                                            buttonM1447.setOnClickListener(new View.OnClickListener() { // from class: l.᩷۫ܿ
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view5) {
                                                    dialogInterfaceC0206M19253.dismiss();
                                                    if (ServiceC1618.m5484(c16826.m39567())) {
                                                        dialogInterfaceC0206.dismiss();
                                                        c81710.m21665();
                                                    } else {
                                                        C21374.m48457(R.string.MT_Protector);
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                            int i5 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(abstractActivityC3348);
                            c19258.m44421(viewM10218);
                            c19258.m44442(R.string.MT_Protector, null);
                            c19258.m44438();
                        }
                    });
                    editText.setText(C3735.m11349().mo23554());
                    editText2.setText(String.valueOf(C3735.m11350()));
                    editText3.setHint(R.string.MT_Protector);
                    editText3.setInputType(2);
                    editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    editText3.setText(C3735.m11346());
                    C13841.m33200(abstractActivityC3347, (TextInputLayout) viewM10217.findViewById(R.id.MT_Protector), editText, (RunnableC20884) null);
                    C10309.m26062(textInputLayout);
                    C10309.m26062(textInputLayout2);
                    int i5 = DialogInterfaceC0206.f1451;
                    C19258 c19258 = new C19258(abstractActivityC3347);
                    c19258.m44433(R.string.MT_Protector);
                    c19258.m44421(viewM10217);
                    c19258.m44442(R.string.MT_Protector, null);
                    c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258.m44428(false);
                    final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
                    dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ۫ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C21584.m48755(textInputLayout, editText2, editText3, textInputLayout2, editText, dialogInterfaceC0206M44438);
                        }
                    });
                    C5088.m14637(dialogInterfaceC0206M44438);
                    return;
                }
                View viewM10218 = abstractActivityC3347.m10216(R.layout.MT_Protector);
                final EditText editText4 = (EditText) viewM10218.findViewById(R.id.MT_Protector);
                final EditText editText5 = (EditText) viewM10218.findViewById(R.id.editText2);
                final EditText editText6 = (EditText) viewM10218.findViewById(R.id.editText3);
                final EditText editText7 = (EditText) viewM10218.findViewById(R.id.editText4);
                final TextInputLayout textInputLayout3 = (TextInputLayout) viewM10218.findViewById(R.id.textInputLayout4);
                final EditText editText8 = (EditText) viewM10218.findViewById(R.id.MT_Protector);
                editText4.setText(C14981.m35468().mo23554());
                editText5.setText(C14981.m35467());
                editText6.setText(C14981.m35470());
                editText8.setText(C14981.m35466());
                editText7.setText(String.valueOf(C14981.m35469()));
                AbstractC3577.m10936(editText8, abstractActivityC3347);
                C13841.m33200(abstractActivityC3347, (TextInputLayout) viewM10218.findViewById(R.id.MT_Protector), editText4, (RunnableC20884) null);
                C10309.m26062(textInputLayout3);
                int i6 = DialogInterfaceC0206.f1451;
                C19258 c19259 = new C19258(abstractActivityC3347);
                c19259.m44433(R.string.MT_Protector);
                c19259.m44421(viewM10218);
                c19259.m44442(R.string.MT_Protector, null);
                c19259.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19259.m44428(false);
                final DialogInterfaceC0206 dialogInterfaceC0206M44439 = c19259.m44438();
                dialogInterfaceC0206M44439.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܽ۫ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C21584.m48754(textInputLayout3, editText7, editText4, editText5, editText6, editText8, dialogInterfaceC0206M44439);
                    }
                });
                C5088.m14637(dialogInterfaceC0206M44439);
            }
        });
        final Button buttonM1448 = dialogInterfaceC0206M44415.m1448();
        final Button buttonM1447 = dialogInterfaceC0206M44415.m1447();
        buttonM1448.setOnClickListener(new ViewOnClickListenerC19197(1, iArr));
        radioGroup.check(i3 == 1 ? R.id.MT_Protector : R.id.MT_Protector);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.ᩴ۫ܿ
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                C21584.m48753(i4, iArr);
            }
        });
        Runnable runnable = new Runnable(c21584) { // from class: l.᩵۫ܿ
            /* JADX WARN: Code duplicated, block: B:56:0x0142  */
            /* JADX WARN: Code duplicated, block: B:57:0x014b  */
            /* JADX WARN: Code duplicated, block: B:60:0x015f  */
            @Override // java.lang.Runnable
            public final void run() {
                String strM5489;
                boolean zM48759;
                ImageView imageView3;
                View view;
                String[] strArr2;
                String strM46305;
                if (zArr[0]) {
                    runnableC10560M17596.run();
                    int[] iArr2 = iArr;
                    boolean zM5485 = iArr2[0] == 0 ? ServiceC1618.m5485() : ServiceC7926.m21228();
                    Runnable[] runnableArr2 = runnableArr;
                    c22289.removeCallbacks(runnableArr2[0]);
                    View view2 = viewFindViewById3;
                    view2.setVisibility(8);
                    buttonM1447.setText((ServiceC1618.m5485() || ServiceC7926.m21228()) ? R.string.MT_Protector : R.string.MT_Protector);
                    buttonM1448.setText(zM5485 ? R.string.MT_Protector : R.string.MT_Protector);
                    Inet4Address inet4AddressM31302 = C12865.m31302();
                    ImageView imageView4 = imageView2;
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    int i4 = R.string.MT_Protector;
                    if (inet4AddressM31302 != null) {
                        imageView4.setImageResource(R.drawable.MT_Protector);
                        if (zM5485) {
                            textView4.setText(iArr2[0] == 0 ? R.string.MT_Protector : R.string.MT_Protector);
                            strM5489 = iArr2[0] == 0 ? ServiceC1618.m5489() : ServiceC7926.m21224();
                            textView5.setText(strM5489);
                            if (iArr2[0] == 0) {
                                String strM5488 = ServiceC1618.m5488();
                                long jM5490 = ServiceC1618.m5490();
                                if (!TextUtils.isEmpty(strM5488) && jM5490 > System.currentTimeMillis()) {
                                    jArr[0] = jM5490;
                                    if (strM5488.length() == 6) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(strM5488.substring(0, 3));
                                        sb.append(" ");
                                        strM46305 = C20087.m46305(3, strM5488, sb);
                                    } else {
                                        strM46305 = strM5488;
                                    }
                                    String strM14306 = C4925.m14306(R.string.MT_Protector, strM46305);
                                    int iIndexOf = strM14306.indexOf(strM46305);
                                    int length = strM5488.length();
                                    TextView textView6 = textView3;
                                    CharSequence charSequence = strM14306;
                                    charSequence = strM14306;
                                    if (length == 6 && iIndexOf >= 0) {
                                        int iMax = Math.max(C11266.m27878(2.0f), Math.round(textView6.getTextSize() * 0.15f));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM14306);
                                        spannableStringBuilder.setSpan(new C15232(iMax), iIndexOf + 3, iIndexOf + 4, 33);
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
                        zM48759 = C21584.m48759(iArr2[0], strM5489, zM5485);
                        imageView3 = imageView;
                        view = viewFindViewById2;
                        strArr2 = strArr;
                        if (zM48759) {
                            strArr2[0] = strM5489;
                            imageView3.setVisibility(0);
                            view.setVisibility(0);
                        } else {
                            strArr2[0] = null;
                            imageView3.setVisibility(4);
                            view.setVisibility(4);
                        }
                        View view3 = viewFindViewById;
                        view3.setVisibility(C11287.m27900(view3.getContext()) ? 8 : 0);
                    }
                    imageView4.setImageResource(R.drawable.MT_Protector);
                    if (zM5485) {
                        i4 = R.string.MT_Protector;
                    }
                    textView4.setText(i4);
                    textView5.setText(R.string.MT_Protector);
                    strM5489 = null;
                    zM48759 = C21584.m48759(iArr2[0], strM5489, zM5485);
                    imageView3 = imageView;
                    view = viewFindViewById2;
                    strArr2 = strArr;
                    if (zM48759) {
                        strArr2[0] = strM5489;
                        imageView3.setVisibility(0);
                        view.setVisibility(0);
                    } else {
                        strArr2[0] = null;
                        imageView3.setVisibility(4);
                        view.setVisibility(4);
                    }
                    View view4 = viewFindViewById;
                    view4.setVisibility(C11287.m27900(view4.getContext()) ? 8 : 0);
                }
            }
        };
        viewM10216.setTag(runnable);
        f69324.add(runnable);
        m48767();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48758(boolean[] zArr, C22289 c22289, Runnable[] runnableArr, AbstractActivityC3346 abstractActivityC3346) {
        zArr[0] = false;
        c22289.removeCallbacks(runnableArr[0]);
        int i = f69322;
        if (i != 0) {
            int i2 = i - 1;
            f69322 = i2;
            if (i2 == 0) {
                f69323.m1193();
                f69323 = null;
                C4925.m14310(f69320);
            }
        }
        if (abstractActivityC3346 instanceof ActivityC15465) {
            abstractActivityC3346.finish();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48756(AbstractActivityC3346 abstractActivityC3346) {
        abstractActivityC3346.m10219(new RunnableC18056());
        C11287.m27901(abstractActivityC3346);
        m48767();
        C4925.m14316(new RunnableC0416(), 1000L);
        C4925.m14316(new RunnableC0416(), c.a);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48753(int i, int[] iArr) {
        int i2 = i == R.id.MT_Protector ? 1 : 0;
        iArr[0] = i2;
        ApplicationC20075.f65010.edit().putInt("remote_manager_last_protocol", i2 != 1 ? 0 : 1).apply();
        m48767();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48752() {
        m48767();
        C4925.m14316(new RunnableC0416(), 1000L);
        C4925.m14316(new RunnableC0416(), c.a);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48759(int i, String str, boolean z) {
        if (i != 0 || !z || TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toString().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m48751(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0");
        }
        EnumC20745 enumC20745 = EnumC20745.AZTEC;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i);
        }
        C22155 c22155M29809 = C4516.m13290(str, EnumC0282.L).m29809();
        if (c22155M29809 == null) {
            throw new IllegalStateException();
        }
        int iM49774 = c22155M29809.m49774();
        int iM49773 = c22155M29809.m49773();
        int i2 = iM49774 + 8;
        int i3 = iM49773 + 8;
        int iMax = Math.max(i, i2);
        int iMax2 = Math.max(i, i3);
        int iMin = Math.min(iMax / i2, iMax2 / i3);
        int i4 = (iMax - (iM49774 * iMin)) / 2;
        int i5 = (iMax2 - (iM49773 * iMin)) / 2;
        C15804 c15804 = new C15804(iMax, iMax2);
        int i6 = 0;
        while (i6 < iM49773) {
            int i7 = 0;
            int i8 = i4;
            while (i7 < iM49774) {
                if (c22155M29809.m49768(i7, i6) == 1) {
                    c15804.m37442(i8, i5, iMin, iMin);
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
                iArr[i10 + i11] = c15804.m37443(i11, i9) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48755(TextInputLayout textInputLayout, EditText editText, EditText editText2, TextInputLayout textInputLayout2, EditText editText3, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m48760(textInputLayout, editText)) {
            String string = editText2.getText().toString();
            if (!C3735.m11348(string)) {
                textInputLayout2.setError(C4925.m14327(R.string.MT_Protector));
                editText2.requestFocus();
                return;
            }
            textInputLayout2.setError(null);
            textInputLayout2.setErrorEnabled(false);
            C3735.m11347(editText3.getText().toString(), editText.getText().toString(), string);
            if (ServiceC1618.m5485()) {
                f69321 = true;
                Application applicationM14335 = C4925.m14335();
                applicationM14335.stopService(new Intent(applicationM14335, (Class<?>) ServiceC1618.class));
            }
            dialogInterfaceC0206.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48754(TextInputLayout textInputLayout, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m48760(textInputLayout, editText)) {
            C14981.m35463(editText2.getText().toString(), editText3.getText().toString(), editText4.getText().toString(), editText5.getText().toString(), editText.getText().toString());
            if (ServiceC7926.m21228()) {
                f69319 = true;
                Application applicationM14335 = C4925.m14335();
                applicationM14335.stopService(new Intent(applicationM14335, (Class<?>) ServiceC7926.class));
            }
            dialogInterfaceC0206.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48760(TextInputLayout textInputLayout, EditText editText) {
        if (C21311.m48346(editText.getText().toString()) == null) {
            textInputLayout.setError(C4925.m14327(R.string.MT_Protector));
            editText.requestFocus();
            return false;
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48767() {
        Iterator it = f69324.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48762() {
        if (f69322 == 0) {
            f69323 = new C0123(C4925.m14335(), new RunnableC0416());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STARTED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STOPPED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STARTED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STOPPED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
            C4925.m14311(f69320, intentFilter);
        }
        f69322++;
    }
}
