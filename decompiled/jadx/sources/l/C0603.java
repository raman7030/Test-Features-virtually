package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final class C0603 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f2339;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f2340;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2341;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2342;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RunnableC19719 f2343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2344;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Set f2345;

    public C0603(AbstractActivityC3346 abstractActivityC3346) {
        C11233.m27805(abstractActivityC3346, "activity");
        this.f2339 = abstractActivityC3346;
        this.f2344 = -1;
        this.f2340 = C8969.f27244;
        this.f2345 = Collections.newSetFromMap(new WeakHashMap());
        this.f2341 = new AtomicInteger();
        this.f2342 = true;
        abstractActivityC3346.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.᩻ᩴܿ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                C0603.m2471(this.f77234, enumC22901);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2479(final C12392 c12392) {
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (!this.f2342) {
            ?? r0 = this.f2340;
            boolean zIsEmpty = r0.isEmpty();
            AbstractActivityC3346 abstractActivityC3346 = this.f2339;
            if (!zIsEmpty) {
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC8365) it.next()) instanceof C2015) {
                        int[] iArrM30369 = c12392.m30369();
                        int i = iArrM30369[1];
                        int i2 = iArrM30369[0];
                        if (i - i2 > 10000) {
                            iArrM30369[1] = i2 + 10000;
                        }
                        final C23932 c23932 = new C23932();
                        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
                        C11233.m27803(interfaceC7785M30436, "getText(...)");
                        c23932.f77612 = interfaceC7785M30436.subSequence(iArrM30369[0], iArrM30369[1]).toString();
                        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
                        final TextView textView = (TextView) viewM10216.findViewById(R.id.editText3);
                        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
                        Spinner spinner2 = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
                        Spinner spinner3 = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
                        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
                        viewM10216.findViewById(R.id.MT_Protector).setBackgroundColor(C21943.m49424(-13290187, -986896));
                        C18949 c18949 = new C18949(abstractActivityC3346, this.f2340);
                        C20065 c20065 = new C20065(abstractActivityC3346);
                        C20065 c20066 = new C20065(abstractActivityC3346);
                        spinner.setAdapter((SpinnerAdapter) c18949);
                        spinner2.setAdapter((SpinnerAdapter) c20065);
                        spinner3.setAdapter((SpinnerAdapter) c20066);
                        final TextView textView3 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
                        final TextView textView4 = (TextView) viewM10216.findViewById(R.id.editText2);
                        final ProgressBar progressBar = (ProgressBar) viewM10216.findViewById(R.id.MT_Protector);
                        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                        c19258BuildDialog.m44421(viewM10216);
                        c19258BuildDialog.m44442(R.string.MT_Protector, null);
                        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258BuildDialog.m44415();
                        final C23932 c23933 = new C23932();
                        c23933.f77612 = "";
                        final C19655 c19655 = new C19655(spinner, c18949, spinner2, c20065, spinner3, c20066, viewFindViewById, textView2, c23933, this, c23932, textView4, textView3, textView, progressBar, dialogInterfaceC0206M44415);
                        this.f2345.add(c19655);
                        dialogInterfaceC0206M44415.m1449();
                        C8960.m23097(dialogInterfaceC0206M44415);
                        dialogInterfaceC0206M44415.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ۜᩴܿ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C0603.m2472(c19655, c23933, this, c23932, textView4, textView3, textView, progressBar, dialogInterfaceC0206M44415);
                            }
                        });
                        dialogInterfaceC0206M44415.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ᩴܿ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C21282 c21282 = new C21282(view.getContext(), view, 0);
                                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                final C12392 c12393 = c12392;
                                if (!c12393.m30441()) {
                                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                }
                                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c21282.m48306();
                                final TextView textView5 = textView3;
                                final C19655 c19656 = c19655;
                                final C0603 c0603 = this;
                                final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44415;
                                c21282.m48302(new InterfaceC14930() { // from class: l.ۡᩴܿ
                                    @Override // l.InterfaceC14930
                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                        C0603.m2468(textView5, c12393, dialogInterfaceC0206, c0603, c19656, menuItem);
                                        return true;
                                    }
                                });
                                c21282.m48305();
                            }
                        });
                        textView.setOnClickListener(new ViewOnClickListenerC9777(c23932, textView, dialogInterfaceC0206M44415, 0));
                        c18949.registerDataSetObserver(new C4132(this, dialogInterfaceC0206M44415));
                        return;
                    }
                }
            }
            C21374.m48463(R.string.MT_Protector);
            abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC23143.class));
            return;
        }
        this.f2343 = new RunnableC19719(2, this, c12392);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2472(C19655 c19655, C23932 c23932, C0603 c0603, C23932 c23933, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, DialogInterfaceC0206 dialogInterfaceC0206) {
        InterfaceC13303 interfaceC13303M10425 = c19655.m10425();
        if (interfaceC13303M10425 == null) {
            C21374.m48459((CharSequence) "Error");
            return;
        }
        String id = interfaceC13303M10425.getId();
        C11233.m27803(id, "getId(...)");
        c23932.f77612 = id;
        AtomicInteger atomicInteger = c0603.f2341;
        String str = (String) c23933.f77612;
        AbstractActivityC3346 abstractActivityC3346 = c0603.f2339;
        C11233.m27799((Object) textView);
        C11233.m27799((Object) textView2);
        C11233.m27799((Object) textView3);
        C11233.m27799((Object) progressBar);
        Button buttonM1446 = dialogInterfaceC0206.m1446();
        C11233.m27803(buttonM1446, "getNegativeButton(...)");
        new C16125(interfaceC13303M10425, atomicInteger, str, abstractActivityC3346, textView, textView2, textView3, progressBar, buttonM1446).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2468(TextView textView, C12392 c12392, DialogInterfaceC0206 dialogInterfaceC0206, C0603 c0603, C19655 c19655, MenuItem menuItem) {
        AbstractActivityC3346 abstractActivityC3346 = c0603.f2339;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C4925.m14314((CharSequence) textView.getText().toString());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            if (!c12392.m30441()) {
                c12392.m30316(textView.getText().toString());
            }
            dialogInterfaceC0206.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC23143.class));
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC20401.class));
        } else if (itemId == R.string.MT_Protector) {
            C1683.m5683(abstractActivityC3346, new RunnableC16622(1, c19655));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2471(C0603 c0603, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_RESUME) {
            int i = c0603.f2344;
            Set<C3426> set = c0603.f2345;
            if (i != C13265.m32218()) {
                if (!C23196.m51454()) {
                    c0603.f2340 = C8969.f27244;
                    c0603.f2344 = -1;
                    return;
                } else {
                    if (c0603.f2344 == C13265.m32218()) {
                        C11233.m27803(set, "translatorBinders");
                        for (C3426 c3426 : set) {
                            if (c3426 != null) {
                                c3426.m10421();
                            }
                        }
                        return;
                    }
                    new C2721(c0603, new ArrayList(), new ArrayList()).m20274();
                    return;
                }
            }
            C11233.m27803(set, "translatorBinders");
            for (C3426 c3427 : set) {
                if (c3427 != null) {
                    c3427.m10421();
                }
            }
        }
    }
}
