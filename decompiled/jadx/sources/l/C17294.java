package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܿۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C17294 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f52989;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f52990;

    /* JADX INFO: renamed from: ۬᩺ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f52991;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f52992;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f52993;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f52994;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f52995;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native void m40591(TextView textView, TextView textView2, Button button, View view, View view2);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static native void m40607(View view);

    static {
        ApplicationC12518.m30701(132);
        f52991 = new short[]{3891, 5594, 5897, 9812, -5415, 630, -1461, 9344, -967, -1394, -1821, -7549, -1690, 31613};
        f52992 = Collections.newSetFromMap(new WeakHashMap());
        f52989 = new WeakHashMap();
        f52994 = new C18000();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40598(final AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM10216.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM10216.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM10216.findViewById(R.id.MT_Protector);
        final boolean[] zArr = {true};
        final C13141 c13141 = new C13141();
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44435(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44420(new DialogInterface.OnDismissListener() { // from class: l.ᩳ۫᩻
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C17294.m40602(zArr, abstractActivityC3346, c13141);
            }
        });
        final DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258BuildDialog.m44415();
        DialogInterfaceC0206[] dialogInterfaceC0206Arr = {dialogInterfaceC0206M44415};
        dialogInterfaceC0206M44415.m1438(new DialogInterface.OnShowListener() { // from class: l.ᩴ۫᩻
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C17294.m40600(abstractActivityC3346, c13141);
            }
        });
        dialogInterfaceC0206M44415.m1449();
        final RunnableC10560 runnableC10560M17596 = C6326.m17596(viewM10216.findViewById(R.id.MT_Protector), abstractActivityC3346, dialogInterfaceC0206M44415);
        int i = 0;
        final Button buttonM1448 = dialogInterfaceC0206M44415.m1448();
        buttonM1448.setOnClickListener(new ViewOnClickListenerC8183(i));
        dialogInterfaceC0206M44415.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۫᩻
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۡ֫, l.᩺۬᩻] */
            /* JADX WARN: Type inference failed for: r5v8, types: [l.᩷۫᩻] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                View viewM10217 = abstractActivityC3347.m10216(R.layout.MT_Protector);
                final TabLayout tabLayout = (TabLayout) viewM10217.findViewById(R.id.MT_Protector);
                View[] viewArr = {viewM10217.findViewById(R.id.MT_Protector), viewM10217.findViewById(R.id.MT_Protector), viewM10217.findViewById(R.id.MT_Protector), viewM10217.findViewById(R.id.MT_Protector)};
                int[] iArr = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                C22109 c22109 = (C22109) viewM10217.findViewById(R.id.MT_Protector);
                c22109.m2036();
                c22109.m2029(new C12416(viewArr, abstractActivityC3347, iArr));
                tabLayout.setupWithViewPager(c22109);
                final EditText editText = (EditText) viewM10217.findViewById(R.id.MT_Protector);
                final EditText editText2 = (EditText) viewM10217.findViewById(R.id.MT_Protector);
                final EditText editText3 = (EditText) viewM10217.findViewById(R.id.MT_Protector);
                final C2978 c2978 = (C2978) viewM10217.findViewById(R.id.MT_Protector);
                final C2978 c2979 = (C2978) viewM10217.findViewById(R.id.MT_Protector);
                final Button button = (Button) viewM10217.findViewById(R.id.MT_Protector);
                Button button2 = (Button) viewM10217.findViewById(R.id.MT_Protector);
                TextInputLayout textInputLayout = (TextInputLayout) viewM10217.findViewById(R.id.MT_Protector);
                final TextInputLayout textInputLayout2 = (TextInputLayout) viewM10217.findViewById(R.id.MT_Protector);
                final TextInputLayout textInputLayout3 = (TextInputLayout) viewM10217.findViewById(R.id.MT_Protector);
                editText.setText(C21404.m48495().mo23554());
                editText2.setText(String.valueOf(C19911.m45803()));
                editText3.setText(String.valueOf(C21404.m48499()));
                c2978.setChecked(C21404.m48494() && C21769.m49098(abstractActivityC3347));
                c2979.setChecked(ApplicationC20075.f65008.getBoolean("floating_button_stick_to_edge", true));
                c2979.setEnabled(c2978.isChecked());
                button.setEnabled(c2978.isChecked());
                editText.addTextChangedListener(new C10300(textInputLayout, editText));
                editText2.addTextChangedListener(new C6066(textInputLayout2, editText2));
                textInputLayout3.setHelperTextColor(ColorStateList.valueOf(C21943.f70291));
                final RunnableC12436 runnableC12436 = new RunnableC12436(textInputLayout3);
                textInputLayout3.setEndIconVisible(false);
                editText3.addTextChangedListener(new C11711(textInputLayout3, runnableC12436, editText3));
                textInputLayout3.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܽ۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C17294.m40595(textInputLayout3, runnableC12436, editText3, abstractActivityC3347);
                    }
                });
                button.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i2 = C21404.f68902;
                        C13060.m31629(abstractActivityC3347, C21404.m48482(ApplicationC20075.f65008.getInt("amfbc", 0)), new C0421());
                    }
                });
                C14096.m33705(button);
                final RunnableC14532 runnableC14532 = new RunnableC14532(0, viewM10217);
                runnableC14532.run();
                button2.setOnClickListener(new ViewOnClickListenerC23705(abstractActivityC3347, runnableC14532, 0));
                int i2 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258(abstractActivityC3347);
                c19258.m44433(R.string.MT_Protector);
                c19258.m44421(viewM10217);
                c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258.m44428(false);
                final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
                final RunnableC6772 runnableC6772 = new RunnableC6772(0, abstractActivityC3347);
                final C6273 c6273M44074 = ViewOnClickListenerC19121.m44074(abstractActivityC3347.mo2322(), "mcp-home-" + UUID.randomUUID(), new C22999(runnableC6772, dialogInterfaceC0206M44438, abstractActivityC3347, editText));
                C13841.m33200(abstractActivityC3347, textInputLayout, editText, (RunnableC20884) new Runnable() { // from class: l.᩷۫᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6273 c6273 = c6273M44074;
                        EditText editText4 = editText;
                        if (dialogInterfaceC0206M44438.m1442()) {
                            AbstractActivityC3346 abstractActivityC3348 = abstractActivityC3347;
                            if (abstractActivityC3348.isFinishing() || abstractActivityC3348.isDestroyed()) {
                                return;
                            }
                            if (abstractActivityC3348 instanceof ActivityC8411) {
                                ((ActivityC8411) abstractActivityC3348).m22015(true);
                            }
                            try {
                                c6273.m36540(0, R.string.MT_Protector, editText4.getText().toString(), (String) null, (String[]) null, (Bundle) null);
                            } catch (RuntimeException e) {
                                runnableC6772.run();
                                throw e;
                            }
                        }
                    }
                });
                final C15176 c15176M35881 = C15176.m35881(viewArr[2], abstractActivityC3347, dialogInterfaceC0206M44438);
                dialogInterfaceC0206M44438.m1448().setVisibility(8);
                final C3264 c3264M9981 = C3264.m9981(viewArr[3], abstractActivityC3347, dialogInterfaceC0206M44438);
                c22109.m49686((ViewGroup) viewArr[0], (ViewGroup) viewArr[1]);
                final C8817 c8817M22788 = C8817.m22788();
                View viewFindViewById5 = viewM10217.findViewById(R.id.MT_Protector);
                final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44415;
                viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: l.ۢ۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C17294.m40597(c3264M9981, c8817M22788, textInputLayout2, editText2, abstractActivityC3347, dialogInterfaceC0206M44438, dialogInterfaceC0206);
                    }
                });
                final RunnableC8889 runnableC8889 = new RunnableC8889(textInputLayout, editText, abstractActivityC3347, dialogInterfaceC0206M44438, 0);
                final RunnableC15943 runnableC15943 = new RunnableC15943(c15176M35881);
                dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۤ۬᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        if (selectedTabPosition == 2) {
                            c15176M35881.m35900();
                        } else if (selectedTabPosition == 3) {
                            c3264M9981.m10005();
                        }
                    }
                });
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C13826(viewM10217, abstractActivityC3347, dialogInterfaceC0206M44438, runnableC14532, runnableC15943, viewArr, c3264M9981, runnableC8889));
                c2978.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛ۬᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C17294.m40599(abstractActivityC3347, dialogInterfaceC0206M44438, c2978, c2979, button, z);
                    }
                });
                c2979.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨ۬᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C17294.m40609(c2978, c2979);
                    }
                });
                final ?? r1 = new InterfaceC17236() { // from class: l.᩺۬᩻
                    @Override // l.InterfaceC17236
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) throws Throwable {
                        if (enumC22901 == EnumC22901.ON_RESUME && dialogInterfaceC0206M44438.m1442()) {
                            C2978 c29710 = c2978;
                            if (c29710.isChecked() && !C21769.m49098(abstractActivityC3347)) {
                                c29710.setChecked(false);
                            }
                            runnableC14532.run();
                            runnableC15943.run();
                            c3264M9981.m10007();
                        }
                    }
                };
                abstractActivityC3347.getLifecycle().mo19833(r1);
                dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܰ۬᩻
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C17294.m40601(c6273M44074, runnableC6772, c15176M35881, abstractActivityC3347, r1, textInputLayout3, runnableC12436, runnableC8889, textInputLayout2, editText2);
                    }
                });
                final RunnableC7497 runnableC7497 = new RunnableC7497(c3264M9981, dialogInterfaceC0206M44438);
                dialogInterfaceC0206M44438.m1446().setOnClickListener(new ViewOnClickListenerC1833(0, runnableC7497));
                dialogInterfaceC0206M44438.m1437(new DialogInterface.OnKeyListener() { // from class: l.ۧ۫᩻
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                        if (i3 != 4) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                            runnableC7497.run();
                        }
                        return true;
                    }
                });
            }
        });
        final C8817 c8817M22788 = C8817.m22788();
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.᩸۫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c8817M22788.m22791()) {
                    RunnableC3244 runnableC3244 = new RunnableC3244();
                    AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                    abstractActivityC3347.m10219(runnableC3244);
                    C11287.m27901(abstractActivityC3347);
                    C17294.m40612();
                    C4925.m14316(new RunnableC3950(0), 1000L);
                    C4925.m14316(new RunnableC3950(0), c.a);
                }
            }
        });
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC22294(c8817M22788, abstractActivityC3346, dialogInterfaceC0206Arr, i));
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC20178(i, c8817M22788, abstractActivityC3346));
        Runnable runnable = new Runnable() { // from class: l.ۙ۫᩻
            @Override // java.lang.Runnable
            public final void run() {
                C17294.m40603(zArr, runnableC10560M17596, textView, textView2, buttonM1448, viewFindViewById, viewFindViewById2);
            }
        };
        viewM10216.setTag(runnable);
        f52992.add(runnable);
        m40612();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40602(boolean[] zArr, AbstractActivityC3346 abstractActivityC3346, C13141 c13141) {
        zArr[0] = false;
        abstractActivityC3346.getLifecycle().mo19834(c13141);
        WeakHashMap weakHashMap = f52989;
        Integer num = (Integer) weakHashMap.get(abstractActivityC3346);
        if (num != null) {
            if (num.intValue() == 1) {
                weakHashMap.remove(abstractActivityC3346);
            } else {
                weakHashMap.put(abstractActivityC3346, Integer.valueOf(num.intValue() - 1));
            }
        }
        int i = f52993;
        if (i != 0) {
            f52993 = i - 1;
            m40613();
        }
        if (abstractActivityC3346 instanceof ActivityC8411) {
            abstractActivityC3346.finish();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40603(boolean[] zArr, RunnableC10560 runnableC10560, TextView textView, TextView textView2, Button button, View view, View view2) {
        if (zArr[0]) {
            runnableC10560.run();
            m40591(textView, textView2, button, view, view2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40592(TextView textView, boolean z) {
        if (z) {
            ViewOnClickListenerC14813.m35215(textView);
            return;
        }
        textView.setOnClickListener(null);
        textView.setClickable(false);
        textView.setFocusable(false);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40595(TextInputLayout textInputLayout, RunnableC12436 runnableC12436, EditText editText, AbstractActivityC3346 abstractActivityC3346) {
        textInputLayout.removeCallbacks(runnableC12436);
        runnableC12436.run();
        Integer numM48346 = C21311.m48346(editText.getText().toString());
        if (numM48346 == null) {
            textInputLayout.setError(C4925.m14327(R.string.MT_Protector));
        } else {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
        }
        if (numM48346 == null) {
            return;
        }
        if (!ServiceC19288.m44489() || ServiceC19288.m44480() != numM48346.intValue()) {
            try {
                ServerSocket serverSocket = new ServerSocket();
                try {
                    serverSocket.setReuseAddress(true);
                    serverSocket.bind(new InetSocketAddress(numM48346.intValue()));
                    serverSocket.close();
                } catch (Throwable th) {
                    try {
                        serverSocket.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException e) {
                textInputLayout.setError(C4925.m14306(e instanceof BindException ? R.string.MT_Protector : R.string.MT_Protector, numM48346));
                editText.requestFocus();
                return;
            }
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        int iM48499 = C21404.m48499();
        C21404.m48493(editText.getText().toString());
        textInputLayout.setEndIconVisible(false);
        if (ServiceC19288.m44489() && iM48499 != C21404.m48499()) {
            f52990 = true;
            Application applicationM14335 = C4925.m14335();
            applicationM14335.stopService(new Intent(applicationM14335, (Class<?>) ServiceC19288.class));
        }
        m40612();
        textInputLayout.setHelperText(abstractActivityC3346.getString(R.string.MT_Protector));
        textInputLayout.postDelayed(runnableC12436, 2000L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40597(C3264 c3264, C8817 c8817, TextInputLayout textInputLayout, EditText editText, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206, DialogInterfaceC0206 dialogInterfaceC0207) {
        if (!c3264.m10006() && c8817.m22791() && m40614(textInputLayout, editText)) {
            C19911.m45805(editText.getText().toString());
            C11026.m27359(abstractActivityC3346, new RunnableC19473(0, dialogInterfaceC0206, dialogInterfaceC0207));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40594(TextInputLayout textInputLayout, EditText editText, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        String strM40610 = m40610(textInputLayout, editText);
        if (strM40610 == null) {
            return;
        }
        try {
            if (!strM40610.equals(C21404.m48495().mo23554())) {
                C21404.m48497(strM40610);
            }
            if (strM40610.equals(editText.getText().toString())) {
                return;
            }
            editText.setText(strM40610);
        } catch (C15052 e) {
            EnumC7998 enumC7998 = e.f45940;
            textInputLayout.setError(abstractActivityC3346.getString(m40589(enumC7998)));
            if (dialogInterfaceC0206.m1442()) {
                return;
            }
            C21374.m48457(m40589(enumC7998));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40599(AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206, C2978 c2978, C2978 c2979, Button button, boolean z) {
        if (z && !C9255.m23764(abstractActivityC3346)) {
            c2978.setChecked(false);
            C1772 c1772 = new C1772(new boolean[]{false}, abstractActivityC3346 instanceof ActivityC8411 ? (ActivityC8411) abstractActivityC3346 : null, abstractActivityC3346, dialogInterfaceC0206, c2978);
            try {
                C21769.m49100(abstractActivityC3346, c1772);
            } catch (Throwable th) {
                c1772.mo5898();
                abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
        boolean zIsChecked = c2978.isChecked();
        c2979.setEnabled(zIsChecked);
        button.setEnabled(zIsChecked);
        m40609(c2978, c2979);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40601(C6273 c6273, RunnableC6772 runnableC6772, C15176 c15176, AbstractActivityC3346 abstractActivityC3346, C23019 c23019, TextInputLayout textInputLayout, RunnableC12436 runnableC12436, RunnableC8889 runnableC8889, TextInputLayout textInputLayout2, EditText editText) {
        c6273.m36539();
        runnableC6772.run();
        c15176.m35901();
        abstractActivityC3346.getLifecycle().mo19834(c23019);
        textInputLayout.removeCallbacks(runnableC12436);
        runnableC12436.run();
        runnableC8889.run();
        if (m40614(textInputLayout2, editText)) {
            int iM45803 = C19911.m45803();
            C19911.m45805(editText.getText().toString());
            if (C19911.m45803() != iM45803) {
                int i = ServiceC19288.f60689;
                C1802.f6208.execute(new RunnableC3950(1));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m40610(TextInputLayout textInputLayout, EditText editText) {
        try {
            String strM48485 = C21404.m48485(editText.getText().toString());
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return strM48485;
        } catch (C15052 e) {
            textInputLayout.setError(C4925.m14327(m40589(e.f45940)));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40609(C2978 c2978, C2978 c2979) {
        if (C21404.m48494() == c2978.isChecked() && ApplicationC20075.f65008.getBoolean("floating_button_stick_to_edge", true) == c2979.isChecked()) {
            return;
        }
        C21404.m48490(c2978.isChecked(), c2979.isChecked());
        ServiceC19288.m44482();
        m40612();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40589(EnumC7998 enumC7998) {
        int i = C13121.f39262[enumC7998.ordinal()];
        if (i == 1) {
            return R.string.MT_Protector;
        }
        if (i == 2) {
            return R.string.MT_Protector;
        }
        if (i == 3) {
            return R.string.MT_Protector;
        }
        if (i == 4) {
            return R.string.MT_Protector;
        }
        if (i == 5) {
            return R.string.MT_Protector;
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m40614(TextInputLayout textInputLayout, EditText editText) {
        try {
            int i = Integer.parseInt(editText.getText().toString().trim());
            if (i < 1 || i > 100) {
                textInputLayout.setError(C4925.m14327(R.string.MT_Protector));
                return false;
            }
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return true;
        } catch (NumberFormatException unused) {
            textInputLayout.setError(C4925.m14327(R.string.MT_Protector));
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m40612() {
        Iterator it = f52992.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40605(Main main) {
        return main != null && main.getLifecycle().mo19832().m33028(EnumC13728.RESUMED) && f52989.containsKey(main);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40600(AbstractActivityC3346 abstractActivityC3346, C13141 c13141) {
        if (!f52995) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            Application applicationM14335 = C4925.m14335();
            BroadcastReceiver broadcastReceiver = f52994;
            applicationM14335.registerReceiver(broadcastReceiver, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("bin.mt.mcp.ACTION_STARTED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_STOPPED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_FAILED_TO_START");
            C4925.m14311(broadcastReceiver, intentFilter2);
            f52995 = true;
        }
        f52993++;
        WeakHashMap weakHashMap = f52989;
        Integer num = (Integer) weakHashMap.get(abstractActivityC3346);
        weakHashMap.put(abstractActivityC3346, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        abstractActivityC3346.getLifecycle().mo19833(c13141);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m40613() {
        if (f52995 && f52993 == 0 && !f52990) {
            Application applicationM14335 = C4925.m14335();
            BroadcastReceiver broadcastReceiver = f52994;
            applicationM14335.unregisterReceiver(broadcastReceiver);
            C4925.m14310(broadcastReceiver);
            f52995 = false;
        }
    }
}
