package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2942 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f5113;

    /* JADX INFO: renamed from: ۧ */
    public Object f5114;

    /* JADX INFO: renamed from: ܳ */
    public final AtomicInteger f5115;

    /* JADX INFO: renamed from: ܽ */
    public boolean f5116;

    /* JADX INFO: renamed from: ܿ */
    public RunnableC21110 f5117;

    /* JADX INFO: renamed from: ᩳ */
    public int f5118;

    /* JADX INFO: renamed from: ᩻ */
    public final Set f5119;

    public C2942(AbstractActivityC5549 abstractActivityC5549) {
        C13045.m29867(abstractActivityC5549, "activity");
        this.f5113 = abstractActivityC5549;
        this.f5118 = -1;
        this.f5114 = C10893.f30179;
        this.f5119 = Collections.newSetFromMap(new WeakHashMap());
        this.f5115 = new AtomicInteger();
        this.f5116 = true;
        abstractActivityC5549.getLifecycle().mo21806(new InterfaceC18749() { // from class: l.᩻ᩴܿ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                C2942.m4827(this.f79985, enumC24133);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ֫ */
    public final void m4835(final C14146 c14146) {
        if (!C24414.m53850()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (!this.f5116) {
            ?? r0 = this.f5114;
            boolean zIsEmpty = r0.isEmpty();
            AbstractActivityC5549 abstractActivityC5549 = this.f5113;
            if (!zIsEmpty) {
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC10319) it.next()) instanceof C4284) {
                        int[] iArrM32433 = c14146.m32433();
                        int i = iArrM32433[1];
                        int i2 = iArrM32433[0];
                        if (i - i2 > 10000) {
                            iArrM32433[1] = i2 + 10000;
                        }
                        final C25114 c25114 = new C25114();
                        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
                        C13045.m29865(interfaceC9768M32500, "getText(...)");
                        c25114.f80364 = interfaceC9768M32500.subSequence(iArrM32433[0], iArrM32433[1]).toString();
                        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
                        final TextView textView = (TextView) viewM12252.findViewById(R.id.editText3);
                        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
                        Spinner spinner2 = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
                        Spinner spinner3 = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
                        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
                        viewM12252.findViewById(R.id.MT_Protector).setBackgroundColor(C23223.m51761(-13290187, -986896));
                        C20378 c20378 = new C20378(abstractActivityC5549, this.f5114);
                        C21438 c21438 = new C21438(abstractActivityC5549);
                        C21438 c21439 = new C21438(abstractActivityC5549);
                        spinner.setAdapter((SpinnerAdapter) c20378);
                        spinner2.setAdapter((SpinnerAdapter) c21438);
                        spinner3.setAdapter((SpinnerAdapter) c21439);
                        final TextView textView3 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
                        final TextView textView4 = (TextView) viewM12252.findViewById(R.id.editText2);
                        final ProgressBar progressBar = (ProgressBar) viewM12252.findViewById(R.id.MT_Protector);
                        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                        c20671BuildDialog.m46715(viewM12252);
                        c20671BuildDialog.m46736(R.string.MT_Protector, null);
                        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671BuildDialog.m46709();
                        final C25114 c25115 = new C25114();
                        c25115.f80364 = "";
                        final C21049 c21049 = new C21049(spinner, c20378, spinner2, c21438, spinner3, c21439, viewFindViewById, textView2, c25115, this, c25114, textView4, textView3, textView, progressBar, dialogInterfaceC2564M46709);
                        this.f5119.add(c21049);
                        dialogInterfaceC2564M46709.m3862();
                        C10884.m25071(dialogInterfaceC2564M46709);
                        dialogInterfaceC2564M46709.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.ۜᩴܿ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2942.m4828(c21049, c25115, this, c25114, textView4, textView3, textView, progressBar, dialogInterfaceC2564M46709);
                            }
                        });
                        dialogInterfaceC2564M46709.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ᩴܿ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C1898 c1898 = new C1898(view.getContext(), view, 0);
                                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                final C14146 c14147 = c14146;
                                if (!c14147.m32505()) {
                                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                }
                                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c1898.m50640();
                                final TextView textView5 = textView3;
                                final C21049 c210410 = c21049;
                                final C2942 c2942 = this;
                                final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46709;
                                c1898.m50636(new InterfaceC1583() { // from class: l.ۡᩴܿ
                                    @Override // p067l.InterfaceC1583
                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                        C2942.m4824(textView5, c14147, dialogInterfaceC2564, c2942, c210410, menuItem);
                                        return true;
                                    }
                                });
                                c1898.m50639();
                            }
                        });
                        textView.setOnClickListener(new ViewOnClickListenerC11661(c25114, textView, dialogInterfaceC2564M46709, 0));
                        c20378.registerDataSetObserver(new C6296(this, dialogInterfaceC2564M46709));
                        return;
                    }
                }
            }
            C22682.m50799(R.string.MT_Protector);
            abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC24364.class));
            return;
        }
        this.f5117 = new RunnableC21110(2, this, c14146);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4828(C21049 c21049, C25114 c25114, C2942 c2942, C25114 c25115, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, DialogInterfaceC2564 dialogInterfaceC2564) {
        InterfaceC15012 interfaceC15012M12464 = c21049.m12464();
        if (interfaceC15012M12464 == null) {
            C22682.m50795((CharSequence) "Error");
            return;
        }
        String id = interfaceC15012M12464.getId();
        C13045.m29865(id, "getId(...)");
        c25114.f80364 = id;
        AtomicInteger atomicInteger = c2942.f5115;
        String str = (String) c25115.f80364;
        AbstractActivityC5549 abstractActivityC5549 = c2942.f5113;
        C13045.m29861((Object) textView);
        C13045.m29861((Object) textView2);
        C13045.m29861((Object) textView3);
        C13045.m29861((Object) progressBar);
        Button buttonM3859 = dialogInterfaceC2564.m3859();
        C13045.m29865(buttonM3859, "getNegativeButton(...)");
        new C17694(interfaceC15012M12464, atomicInteger, str, abstractActivityC5549, textView, textView2, textView3, progressBar, buttonM3859).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4824(TextView textView, C14146 c14146, DialogInterfaceC2564 dialogInterfaceC2564, C2942 c2942, C21049 c21049, MenuItem menuItem) {
        AbstractActivityC5549 abstractActivityC5549 = c2942.f5113;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C7050.m16211((CharSequence) textView.getText().toString());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            if (!c14146.m32505()) {
                c14146.m32380(textView.getText().toString());
            }
            dialogInterfaceC2564.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC24364.class));
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC21758.class));
        } else if (itemId == R.string.MT_Protector) {
            C3968.m7913(abstractActivityC5549, new RunnableC18166(1, c21049));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4827(C2942 c2942, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_RESUME) {
            int i = c2942.f5118;
            Set<C5625> set = c2942.f5119;
            if (i != C14976.m34317()) {
                if (!C24414.m53850()) {
                    c2942.f5114 = C10893.f30179;
                    c2942.f5118 = -1;
                    return;
                } else {
                    if (c2942.f5118 == C14976.m34317()) {
                        C13045.m29865(set, "translatorBinders");
                        for (C5625 c5625 : set) {
                            if (c5625 != null) {
                                c5625.m12460();
                            }
                        }
                        return;
                    }
                    new C4955(c2942, new ArrayList(), new ArrayList()).m22250();
                    return;
                }
            }
            C13045.m29865(set, "translatorBinders");
            for (C5625 c5626 : set) {
                if (c5626 != null) {
                    c5626.m12460();
                }
            }
        }
    }
}
