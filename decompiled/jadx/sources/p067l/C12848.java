package p067l;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۧ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12848 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f36141;

    /* JADX INFO: renamed from: ܳ */
    public TextView f36144;

    /* JADX INFO: renamed from: ܽ */
    public final Runnable f36145;

    /* JADX INFO: renamed from: ܿ */
    public DialogInterfaceC2564 f36146;

    /* JADX INFO: renamed from: ᩳ */
    public DialogInterfaceC2564 f36147;

    /* JADX INFO: renamed from: ᩻ */
    public final C11469 f36148 = new C11469();

    /* JADX INFO: renamed from: ۧ */
    public final C9221 f36143 = new C9221(this);

    /* JADX INFO: renamed from: ۜ */
    public final int f36142 = C21292.m48115();

    /* JADX INFO: renamed from: ֫ */
    public static void m29421(AbstractActivityC5549 abstractActivityC5549, Runnable runnable) {
        C15255 c15255M34713;
        final C12848 c12848 = new C12848(abstractActivityC5549, runnable);
        final FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۗۗ᩻
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C12848.m29419(this.f12221);
            }
        });
        new Thread(futureTask, "MT MCP initial workspace scan").start();
        long jUptimeMillis = SystemClock.uptimeMillis() + 300;
        AbstractActivityC5549 abstractActivityC55410 = c12848.f36141;
        View viewM12252 = abstractActivityC55410.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(abstractActivityC55410.getString(R.string.MT_Protector, Integer.valueOf(c12848.f36142)));
        C10709 c10709 = (C10709) viewM12252.findViewById(R.id.MT_Protector);
        c12848.f36144 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        c10709.setLayoutManager(new C8541(abstractActivityC55410));
        c10709.setAdapter(c12848.f36143);
        c10709.m24638((abstractActivityC55410.getResources().getDisplayMetrics().heightPixels * 2) / 3);
        try {
            c15255M34713 = (C15255) futureTask.get(Math.max(0L, jUptimeMillis - SystemClock.uptimeMillis()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c15255M34713 = null;
        } catch (ExecutionException e) {
            c15255M34713 = C15255.m34713(new Exception("Unable to load workspaces", e));
        } catch (TimeoutException unused2) {
            c15255M34713 = null;
        }
        if (c15255M34713 != null) {
            c12848.m29427(c15255M34713, false);
        } else {
            c12848.f36144.setVisibility(8);
        }
        C20671 c20671BuildDialog = abstractActivityC55410.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        c12848.f36146 = dialogInterfaceC2564M46732;
        C10884.m25071(dialogInterfaceC2564M46732);
        if (c15255M34713 != null) {
            if (c15255M34713.f43541 != null) {
                abstractActivityC55410.m12259(c15255M34713.f43541, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        new Thread(new Runnable() { // from class: l.ۙۗ᩻
            @Override // java.lang.Runnable
            public final void run() {
                final C15255 c15255M34714;
                try {
                    c15255M34714 = (C15255) futureTask.get();
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (ExecutionException e2) {
                    c15255M34714 = C15255.m34713(new Exception("Unable to load workspaces", e2));
                }
                final C12848 c12849 = this.f16887;
                C7050.m16212(new Runnable() { // from class: l.ۤۗ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        c12849.m29427(c15255M34714, true);
                    }
                });
            }
        }, "MT MCP initial workspace apply").start();
    }

    public C12848(AbstractActivityC5549 abstractActivityC5549, Runnable runnable) {
        this.f36141 = abstractActivityC5549;
        this.f36145 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C15255 m29419(C12848 c12848) {
        try {
            return C15255.m34714(c12848.f36148.m26466());
        } catch (Exception e) {
            return C15255.m34713(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m29427(C15255 c15255, boolean z) {
        if (c15255.f43541 != null) {
            Exception exc = c15255.f43541;
            this.f36143.m21243();
            this.f36144.setVisibility(0);
            if (z) {
                this.f36141.m12259(exc, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        m29420(c15255.f43542);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m29420(List list) {
        int iMin = Math.min(this.f36142, list.size());
        this.f36143.m21244(list.subList(0, iMin));
        this.f36144.setVisibility(list.isEmpty() ? 0 : 8);
        if (iMin < list.size()) {
            int i = ServiceC20700.f63919;
            C4081.f8987.execute(new RunnableC6123(1));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29430(final C12848 c12848, final C22198 c22198, final DialogInterfaceC2564 dialogInterfaceC2564) {
        AbstractActivityC5549 abstractActivityC5549 = c12848.f36141;
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(abstractActivityC5549.getString(R.string.MT_Protector, c22198.f70207));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۗ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C23973(this.f20687, c22198, dialogInterfaceC2564).m22250();
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29425(final C12848 c12848, final C22198 c22198) {
        String string;
        int i;
        AbstractActivityC5549 abstractActivityC5549 = c12848.f36141;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        boolean z = c22198.f70208 != null;
        String string2 = c22198.f70205;
        if (z) {
            textView.setText(R.string.MT_Protector);
            textView2.setText(c22198.f70208);
            textView2.setTextColor(C0886.m5542(abstractActivityC5549, R.color.MT_Protector));
        } else {
            textView.setText(R.string.MT_Protector);
            if (string2 == null || string2.isEmpty()) {
                string = abstractActivityC5549.getString(R.string.MT_Protector);
            } else {
                int iMax = Math.max(string2.lastIndexOf(47), string2.lastIndexOf(92));
                string = (iMax < 0 || (i = iMax + 1) >= string2.length()) ? string2 : string2.substring(i);
            }
            textView2.setText(string);
            textView2.setTextColor(m29428(viewM12252));
        }
        ViewOnClickListenerC16447.m37363(textView2);
        String strM53419 = C24158.m53419(c22198.f70210);
        TextView textView3 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        textView3.setText(strM53419);
        ViewOnClickListenerC16447.m37363(textView3);
        String strM42823 = C18794.m42823(c22198.f70209);
        TextView textView4 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        textView4.setText(strM42823);
        ViewOnClickListenerC16447.m37363(textView4);
        String str = c22198.f70207;
        TextView textView5 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        textView5.setText(str);
        ViewOnClickListenerC16447.m37363(textView5);
        if (string2 == null || string2.isEmpty()) {
            string2 = abstractActivityC5549.getString(R.string.MT_Protector);
        }
        TextView textView6 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        textView6.setText(string2);
        ViewOnClickListenerC16447.m37363(textView6);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        c12848.f36147 = dialogInterfaceC2564M46732;
        dialogInterfaceC2564M46732.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.۬ۗ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                C12848.m29426(this.f41656, c22198, dialogInterfaceC2564);
            }
        });
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC13915(c12848, c22198, dialogInterfaceC2564M46732, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29423(C12848 c12848, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
        if (c12848.f36147 == dialogInterfaceC2564) {
            c12848.f36147 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29426(C12848 c12848, C22198 c22198, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
        if (c12848.f36147 == dialogInterfaceC2564) {
            c12848.f36147 = null;
        }
        AbstractActivityC5549 abstractActivityC5549 = c12848.f36141;
        if (abstractActivityC5549 instanceof Main) {
            Main main = (Main) abstractActivityC5549;
            DialogInterfaceC2564 dialogInterfaceC2565 = c12848.f36146;
            if (dialogInterfaceC2565 != null) {
                dialogInterfaceC2565.dismiss();
            }
            c12848.f36145.run();
            C11245 c11245M130 = main.m130();
            if (c11245M130 != null) {
                c11245M130.m26079().m41259(c22198.f70206.mo25505(), true);
                return;
            }
            return;
        }
        DialogInterfaceC2564 dialogInterfaceC2566 = c12848.f36146;
        if (dialogInterfaceC2566 != null) {
            dialogInterfaceC2566.dismiss();
        }
        Main.m62((Activity) abstractActivityC5549, c22198.f70206.mo25505(), false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m29428(View view) {
        TypedValue typedValue = new TypedValue();
        if (view.getContext().getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true)) {
            if (typedValue.resourceId != 0) {
                return C0886.m5542(view.getContext(), typedValue.resourceId);
            }
            return typedValue.data;
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return ((TextView) view.findViewById(R.id.MT_Protector)).getCurrentTextColor();
    }
}
