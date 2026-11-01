package p067l;

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
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0240c;
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
public final class C18805 {

    /* JADX INFO: renamed from: ֫ */
    public static final WeakHashMap f56171;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f56172;

    /* JADX INFO: renamed from: ۬᩺ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f82281;

    /* JADX INFO: renamed from: ܳ */
    public static final Set f56173;

    /* JADX INFO: renamed from: ܽ */
    public static int f56174;

    /* JADX INFO: renamed from: ܿ */
    public static final BroadcastReceiver f56175;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f56176;

    /* JADX INFO: renamed from: ֫ */
    public static native void m42842(TextView textView, TextView textView2, Button button, View view, View view2);

    /* JADX INFO: renamed from: ۧ */
    public static native void m42858(View view);

    static {
        ApplicationC14266.m56479(132);
        f82281 = new short[]{3891, 5594, 5897, 9812, -5415, 630, -1461, 9344, -967, -1394, -1821, -7549, -1690, 31613};
        f56173 = Collections.newSetFromMap(new WeakHashMap());
        f56171 = new WeakHashMap();
        f56175 = new C19476();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42849(final AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM12252.findViewById(R.id.MT_Protector);
        final boolean[] zArr = {true};
        final C14858 c14858 = new C14858();
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46729(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46714(new DialogInterface.OnDismissListener() { // from class: l.ᩳ۫᩻
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C18805.m42853(zArr, abstractActivityC5549, c14858);
            }
        });
        final DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671BuildDialog.m46709();
        DialogInterfaceC2564[] dialogInterfaceC2564Arr = {dialogInterfaceC2564M46709};
        dialogInterfaceC2564M46709.m3851(new DialogInterface.OnShowListener() { // from class: l.ᩴ۫᩻
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C18805.m42851(abstractActivityC5549, c14858);
            }
        });
        dialogInterfaceC2564M46709.m3862();
        final RunnableC12405 runnableC12405M19536 = C8381.m19536(viewM12252.findViewById(R.id.MT_Protector), abstractActivityC5549, dialogInterfaceC2564M46709);
        int i = 0;
        final Button buttonM3861 = dialogInterfaceC2564M46709.m3861();
        buttonM3861.setOnClickListener(new ViewOnClickListenerC10146(i));
        dialogInterfaceC2564M46709.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۫᩻
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۡ֫, l.᩺۬᩻] */
            /* JADX WARN: Type inference failed for: r5v8, types: [l.᩷۫᩻] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                View viewM12253 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                final TabLayout tabLayout = (TabLayout) viewM12253.findViewById(R.id.MT_Protector);
                View[] viewArr = {viewM12253.findViewById(R.id.MT_Protector), viewM12253.findViewById(R.id.MT_Protector), viewM12253.findViewById(R.id.MT_Protector), viewM12253.findViewById(R.id.MT_Protector)};
                int[] iArr = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                C23381 c23381 = (C23381) viewM12253.findViewById(R.id.MT_Protector);
                c23381.m4413();
                c23381.m4406(new C14169(viewArr, abstractActivityC55410, iArr));
                tabLayout.setupWithViewPager(c23381);
                final EditText editText = (EditText) viewM12253.findViewById(R.id.MT_Protector);
                final EditText editText2 = (EditText) viewM12253.findViewById(R.id.MT_Protector);
                final EditText editText3 = (EditText) viewM12253.findViewById(R.id.MT_Protector);
                final C0990 c0990 = (C0990) viewM12253.findViewById(R.id.MT_Protector);
                final C0990 c0991 = (C0990) viewM12253.findViewById(R.id.MT_Protector);
                final Button button = (Button) viewM12253.findViewById(R.id.MT_Protector);
                Button button2 = (Button) viewM12253.findViewById(R.id.MT_Protector);
                TextInputLayout textInputLayout = (TextInputLayout) viewM12253.findViewById(R.id.MT_Protector);
                final TextInputLayout textInputLayout2 = (TextInputLayout) viewM12253.findViewById(R.id.MT_Protector);
                final TextInputLayout textInputLayout3 = (TextInputLayout) viewM12253.findViewById(R.id.MT_Protector);
                editText.setText(C22711.m50831().mo25505());
                editText2.setText(String.valueOf(C21292.m48115()));
                editText3.setText(String.valueOf(C22711.m50835()));
                c0990.setChecked(C22711.m50830() && C23058.m51448(abstractActivityC55410));
                c0991.setChecked(ApplicationC21448.f67649.getBoolean("floating_button_stick_to_edge", true));
                c0991.setEnabled(c0990.isChecked());
                button.setEnabled(c0990.isChecked());
                editText.addTextChangedListener(new C12158(textInputLayout, editText));
                editText2.addTextChangedListener(new C8134(textInputLayout2, editText2));
                textInputLayout3.setHelperTextColor(ColorStateList.valueOf(C23223.f73002));
                final RunnableC14188 runnableC14188 = new RunnableC14188(textInputLayout3);
                textInputLayout3.setEndIconVisible(false);
                editText3.addTextChangedListener(new C13499(textInputLayout3, runnableC14188, editText3));
                textInputLayout3.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܽ۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C18805.m42846(textInputLayout3, runnableC14188, editText3, abstractActivityC55410);
                    }
                });
                button.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i2 = C22711.f71600;
                        C14781.m33716(abstractActivityC55410, C22711.m50818(ApplicationC21448.f67649.getInt("amfbc", 0)), new C2769());
                    }
                });
                C15766.m35831(button);
                final RunnableC16180 runnableC16180 = new RunnableC16180(0, viewM12253);
                runnableC16180.run();
                button2.setOnClickListener(new ViewOnClickListenerC24898(abstractActivityC55410, runnableC16180, 0));
                int i2 = DialogInterfaceC2564.f4230;
                C20671 c20671 = new C20671(abstractActivityC55410);
                c20671.m46727(R.string.MT_Protector);
                c20671.m46715(viewM12253);
                c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671.m46722(false);
                final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
                final RunnableC8805 runnableC8805 = new RunnableC8805(0, abstractActivityC55410);
                final C8331 c8331M46368 = ViewOnClickListenerC20541.m46368(abstractActivityC55410.mo4693(), "mcp-home-" + UUID.randomUUID(), new C24227(runnableC8805, dialogInterfaceC2564M46732, abstractActivityC55410, editText));
                C15523.m35318(abstractActivityC55410, textInputLayout, editText, (RunnableC22217) new Runnable() { // from class: l.᩷۫᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8331 c8331 = c8331M46368;
                        EditText editText4 = editText;
                        if (dialogInterfaceC2564M46732.m3855()) {
                            AbstractActivityC5549 abstractActivityC55411 = abstractActivityC55410;
                            if (abstractActivityC55411.isFinishing() || abstractActivityC55411.isDestroyed()) {
                                return;
                            }
                            if (abstractActivityC55411 instanceof ActivityC10363) {
                                ((ActivityC10363) abstractActivityC55411).m23985(true);
                            }
                            try {
                                c8331.m38698(0, R.string.MT_Protector, editText4.getText().toString(), (String) null, (String[]) null, (Bundle) null);
                            } catch (RuntimeException e) {
                                runnableC8805.run();
                                throw e;
                            }
                        }
                    }
                });
                final C16792 c16792M38040 = C16792.m38040(viewArr[2], abstractActivityC55410, dialogInterfaceC2564M46732);
                dialogInterfaceC2564M46732.m3861().setVisibility(8);
                final C5471 c5471M12014 = C5471.m12014(viewArr[3], abstractActivityC55410, dialogInterfaceC2564M46732);
                c23381.m52024((ViewGroup) viewArr[0], (ViewGroup) viewArr[1]);
                final C10748 c10748M24758 = C10748.m24758();
                View viewFindViewById5 = viewM12253.findViewById(R.id.MT_Protector);
                final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46709;
                viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: l.ۢ۫᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C18805.m42848(c5471M12014, c10748M24758, textInputLayout2, editText2, abstractActivityC55410, dialogInterfaceC2564M46732, dialogInterfaceC2564);
                    }
                });
                final RunnableC10817 runnableC10817 = new RunnableC10817(textInputLayout, editText, abstractActivityC55410, dialogInterfaceC2564M46732, 0);
                final RunnableC17521 runnableC17521 = new RunnableC17521(c16792M38040);
                dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۤ۬᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        if (selectedTabPosition == 2) {
                            c16792M38040.m38059();
                        } else if (selectedTabPosition == 3) {
                            c5471M12014.m12038();
                        }
                    }
                });
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C15509(viewM12253, abstractActivityC55410, dialogInterfaceC2564M46732, runnableC16180, runnableC17521, viewArr, c5471M12014, runnableC10817));
                c0990.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛ۬᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C18805.m42850(abstractActivityC55410, dialogInterfaceC2564M46732, c0990, c0991, button, z);
                    }
                });
                c0991.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨ۬᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C18805.m42860(c0990, c0991);
                    }
                });
                final ?? r1 = new InterfaceC18749() { // from class: l.᩺۬᩻
                    @Override // p067l.InterfaceC18749
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) throws Throwable {
                        if (enumC24133 == EnumC24133.ON_RESUME && dialogInterfaceC2564M46732.m3855()) {
                            C0990 c0992 = c0990;
                            if (c0992.isChecked() && !C23058.m51448(abstractActivityC55410)) {
                                c0992.setChecked(false);
                            }
                            runnableC16180.run();
                            runnableC17521.run();
                            c5471M12014.m12040();
                        }
                    }
                };
                abstractActivityC55410.getLifecycle().mo21806(r1);
                dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.ܰ۬᩻
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C18805.m42852(c8331M46368, runnableC8805, c16792M38040, abstractActivityC55410, r1, textInputLayout3, runnableC14188, runnableC10817, textInputLayout2, editText2);
                    }
                });
                final RunnableC9494 runnableC9494 = new RunnableC9494(c5471M12014, dialogInterfaceC2564M46732);
                dialogInterfaceC2564M46732.m3859().setOnClickListener(new ViewOnClickListenerC4111(0, runnableC9494));
                dialogInterfaceC2564M46732.m3850(new DialogInterface.OnKeyListener() { // from class: l.ۧ۫᩻
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                        if (i3 != 4) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                            runnableC9494.run();
                        }
                        return true;
                    }
                });
            }
        });
        final C10748 c10748M24758 = C10748.m24758();
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.᩸۫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c10748M24758.m24761()) {
                    RunnableC5452 runnableC5452 = new RunnableC5452();
                    AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                    abstractActivityC55410.m12255(runnableC5452);
                    C13096.m29962(abstractActivityC55410);
                    C18805.m42863();
                    C7050.m16213(new RunnableC6123(0), 1000L);
                    C7050.m16213(new RunnableC6123(0), C0240c.f1145a);
                }
            }
        });
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC23557(c10748M24758, abstractActivityC5549, dialogInterfaceC2564Arr, i));
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC21546(i, c10748M24758, abstractActivityC5549));
        Runnable runnable = new Runnable() { // from class: l.ۙ۫᩻
            @Override // java.lang.Runnable
            public final void run() {
                C18805.m42854(zArr, runnableC12405M19536, textView, textView2, buttonM3861, viewFindViewById, viewFindViewById2);
            }
        };
        viewM12252.setTag(runnable);
        f56173.add(runnable);
        m42863();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42853(boolean[] zArr, AbstractActivityC5549 abstractActivityC5549, C14858 c14858) {
        zArr[0] = false;
        abstractActivityC5549.getLifecycle().mo21807(c14858);
        WeakHashMap weakHashMap = f56171;
        Integer num = (Integer) weakHashMap.get(abstractActivityC5549);
        if (num != null) {
            if (num.intValue() == 1) {
                weakHashMap.remove(abstractActivityC5549);
            } else {
                weakHashMap.put(abstractActivityC5549, Integer.valueOf(num.intValue() - 1));
            }
        }
        int i = f56174;
        if (i != 0) {
            f56174 = i - 1;
            m42864();
        }
        if (abstractActivityC5549 instanceof ActivityC10363) {
            abstractActivityC5549.finish();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42854(boolean[] zArr, RunnableC12405 runnableC12405, TextView textView, TextView textView2, Button button, View view, View view2) {
        if (zArr[0]) {
            runnableC12405.run();
            m42842(textView, textView2, button, view, view2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42843(TextView textView, boolean z) {
        if (z) {
            ViewOnClickListenerC16447.m37363(textView);
            return;
        }
        textView.setOnClickListener(null);
        textView.setClickable(false);
        textView.setFocusable(false);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42846(TextInputLayout textInputLayout, RunnableC14188 runnableC14188, EditText editText, AbstractActivityC5549 abstractActivityC5549) {
        textInputLayout.removeCallbacks(runnableC14188);
        runnableC14188.run();
        Integer numM50681 = C22622.m50681(editText.getText().toString());
        if (numM50681 == null) {
            textInputLayout.setError(C7050.m16224(R.string.MT_Protector));
        } else {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
        }
        if (numM50681 == null) {
            return;
        }
        if (!ServiceC20700.m46783() || ServiceC20700.m46774() != numM50681.intValue()) {
            try {
                ServerSocket serverSocket = new ServerSocket();
                try {
                    serverSocket.setReuseAddress(true);
                    serverSocket.bind(new InetSocketAddress(numM50681.intValue()));
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
                textInputLayout.setError(C7050.m16203(e instanceof BindException ? R.string.MT_Protector : R.string.MT_Protector, numM50681));
                editText.requestFocus();
                return;
            }
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        int iM50835 = C22711.m50835();
        C22711.m50829(editText.getText().toString());
        textInputLayout.setEndIconVisible(false);
        if (ServiceC20700.m46783() && iM50835 != C22711.m50835()) {
            f56172 = true;
            Application applicationM16232 = C7050.m16232();
            applicationM16232.stopService(new Intent(applicationM16232, (Class<?>) ServiceC20700.class));
        }
        m42863();
        textInputLayout.setHelperText(abstractActivityC5549.getString(R.string.MT_Protector));
        textInputLayout.postDelayed(runnableC14188, 2000L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42848(C5471 c5471, C10748 c10748, TextInputLayout textInputLayout, EditText editText, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564, DialogInterfaceC2564 dialogInterfaceC2565) {
        if (!c5471.m12039() && c10748.m24761() && m42865(textInputLayout, editText)) {
            C21292.m48117(editText.getText().toString());
            C12848.m29421(abstractActivityC5549, new RunnableC20876(0, dialogInterfaceC2564, dialogInterfaceC2565));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42845(TextInputLayout textInputLayout, EditText editText, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        String strM42861 = m42861(textInputLayout, editText);
        if (strM42861 == null) {
            return;
        }
        try {
            if (!strM42861.equals(C22711.m50831().mo25505())) {
                C22711.m50833(strM42861);
            }
            if (strM42861.equals(editText.getText().toString())) {
                return;
            }
            editText.setText(strM42861);
        } catch (C16674 e) {
            EnumC9970 enumC9970 = e.f49058;
            textInputLayout.setError(abstractActivityC5549.getString(m42840(enumC9970)));
            if (dialogInterfaceC2564.m3855()) {
                return;
            }
            C22682.m50793(m42840(enumC9970));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42850(AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564, C0990 c0990, C0990 c0991, Button button, boolean z) {
        if (z && !C11164.m25765(abstractActivityC5549)) {
            c0990.setChecked(false);
            C4053 c4053 = new C4053(new boolean[]{false}, abstractActivityC5549 instanceof ActivityC10363 ? (ActivityC10363) abstractActivityC5549 : null, abstractActivityC5549, dialogInterfaceC2564, c0990);
            try {
                C23058.m51450(abstractActivityC5549, c4053);
            } catch (Throwable th) {
                c4053.mo8109();
                abstractActivityC5549.m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
        boolean zIsChecked = c0990.isChecked();
        c0991.setEnabled(zIsChecked);
        button.setEnabled(zIsChecked);
        m42860(c0990, c0991);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42852(C8331 c8331, RunnableC8805 runnableC8805, C16792 c16792, AbstractActivityC5549 abstractActivityC5549, C24246 c24246, TextInputLayout textInputLayout, RunnableC14188 runnableC14188, RunnableC10817 runnableC10817, TextInputLayout textInputLayout2, EditText editText) {
        c8331.m38697();
        runnableC8805.run();
        c16792.m38060();
        abstractActivityC5549.getLifecycle().mo21807(c24246);
        textInputLayout.removeCallbacks(runnableC14188);
        runnableC14188.run();
        runnableC10817.run();
        if (m42865(textInputLayout2, editText)) {
            int iM48115 = C21292.m48115();
            C21292.m48117(editText.getText().toString());
            if (C21292.m48115() != iM48115) {
                int i = ServiceC20700.f63919;
                C4081.f8987.execute(new RunnableC6123(1));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m42861(TextInputLayout textInputLayout, EditText editText) {
        try {
            String strM50821 = C22711.m50821(editText.getText().toString());
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return strM50821;
        } catch (C16674 e) {
            textInputLayout.setError(C7050.m16224(m42840(e.f49058)));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42860(C0990 c0990, C0990 c0991) {
        if (C22711.m50830() == c0990.isChecked() && ApplicationC21448.f67649.getBoolean("floating_button_stick_to_edge", true) == c0991.isChecked()) {
            return;
        }
        C22711.m50826(c0990.isChecked(), c0991.isChecked());
        ServiceC20700.m46776();
        m42863();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42840(EnumC9970 enumC9970) {
        int i = C14839.f42317[enumC9970.ordinal()];
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

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m42865(TextInputLayout textInputLayout, EditText editText) {
        try {
            int i = Integer.parseInt(editText.getText().toString().trim());
            if (i < 1 || i > 100) {
                textInputLayout.setError(C7050.m16224(R.string.MT_Protector));
                return false;
            }
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return true;
        } catch (NumberFormatException unused) {
            textInputLayout.setError(C7050.m16224(R.string.MT_Protector));
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m42863() {
        Iterator it = f56173.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42856(Main main) {
        return main != null && main.getLifecycle().mo21805().m35142(EnumC15415.RESUMED) && f56171.containsKey(main);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42851(AbstractActivityC5549 abstractActivityC5549, C14858 c14858) {
        if (!f56176) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            Application applicationM16232 = C7050.m16232();
            BroadcastReceiver broadcastReceiver = f56175;
            applicationM16232.registerReceiver(broadcastReceiver, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("bin.mt.mcp.ACTION_STARTED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_STOPPED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_FAILED_TO_START");
            C7050.m16208(broadcastReceiver, intentFilter2);
            f56176 = true;
        }
        f56174++;
        WeakHashMap weakHashMap = f56171;
        Integer num = (Integer) weakHashMap.get(abstractActivityC5549);
        weakHashMap.put(abstractActivityC5549, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        abstractActivityC5549.getLifecycle().mo21806(c14858);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m42864() {
        if (f56176 && f56174 == 0 && !f56172) {
            Application applicationM16232 = C7050.m16232();
            BroadcastReceiver broadcastReceiver = f56175;
            applicationM16232.unregisterReceiver(broadcastReceiver);
            C7050.m16207(broadcastReceiver);
            f56176 = false;
        }
    }
}
