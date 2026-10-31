package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۧ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11026 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f33146;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public TextView f33149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f33150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f33151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f33152;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9575 f33153 = new C9575();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7210 f33148 = new C7210(this);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f33147 = C19911.m45803();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27359(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        C13559 c13559M32602;
        final C11026 c11026 = new C11026(abstractActivityC3346, runnable);
        final FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۗۗ᩻
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C11026.m27357(this.f9422);
            }
        });
        new Thread(futureTask, "MT MCP initial workspace scan").start();
        long jUptimeMillis = SystemClock.uptimeMillis() + 300;
        AbstractActivityC3346 abstractActivityC3347 = c11026.f33146;
        View viewM10216 = abstractActivityC3347.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(abstractActivityC3347.getString(R.string.MT_Protector, Integer.valueOf(c11026.f33147)));
        C8776 c8776 = (C8776) viewM10216.findViewById(R.id.MT_Protector);
        c11026.f33149 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        c8776.setLayoutManager(new C6495(abstractActivityC3347));
        c8776.setAdapter(c11026.f33148);
        c8776.m22668((abstractActivityC3347.getResources().getDisplayMetrics().heightPixels * 2) / 3);
        try {
            c13559M32602 = (C13559) futureTask.get(Math.max(0L, jUptimeMillis - SystemClock.uptimeMillis()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c13559M32602 = null;
        } catch (ExecutionException e) {
            c13559M32602 = C13559.m32602(new Exception("Unable to load workspaces", e));
        } catch (TimeoutException unused2) {
            c13559M32602 = null;
        }
        if (c13559M32602 != null) {
            c11026.m27365(c13559M32602, false);
        } else {
            c11026.f33149.setVisibility(8);
        }
        C19258 c19258BuildDialog = abstractActivityC3347.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        c11026.f33151 = dialogInterfaceC0206M44438;
        C8960.m23097(dialogInterfaceC0206M44438);
        if (c13559M32602 != null) {
            if (c13559M32602.f40463 != null) {
                abstractActivityC3347.m10223(c13559M32602.f40463, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        new Thread(new Runnable() { // from class: l.ۙۗ᩻
            @Override // java.lang.Runnable
            public final void run() {
                final C13559 c13559M32603;
                try {
                    c13559M32603 = (C13559) futureTask.get();
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (ExecutionException e2) {
                    c13559M32603 = C13559.m32602(new Exception("Unable to load workspaces", e2));
                }
                final C11026 c11027 = this.f14071;
                C4925.m14315(new Runnable() { // from class: l.ۤۗ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        c11027.m27365(c13559M32603, true);
                    }
                });
            }
        }, "MT MCP initial workspace apply").start();
    }

    public C11026(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        this.f33146 = abstractActivityC3346;
        this.f33150 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C13559 m27357(C11026 c11026) {
        try {
            return C13559.m32603(c11026.f33153.m24454());
        } catch (Exception e) {
            return C13559.m32602(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27365(C13559 c13559, boolean z) {
        if (c13559.f40463 != null) {
            Exception exc = c13559.f40463;
            this.f33148.m19295();
            this.f33149.setVisibility(0);
            if (z) {
                this.f33146.m10223(exc, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        m27358(c13559.f40464);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27358(List list) {
        int iMin = Math.min(this.f33147, list.size());
        this.f33148.m19296(list.subList(0, iMin));
        this.f33149.setVisibility(list.isEmpty() ? 0 : 8);
        if (iMin < list.size()) {
            int i = ServiceC19288.f60689;
            C1802.f6208.execute(new RunnableC3950(1));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27368(final C11026 c11026, final C20864 c20864, final DialogInterfaceC0206 dialogInterfaceC0206) {
        AbstractActivityC3346 abstractActivityC3346 = c11026.f33146;
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(abstractActivityC3346.getString(R.string.MT_Protector, c20864.f67521));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۗ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C22732(this.f17834, c20864, dialogInterfaceC0206).m20274();
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27363(final C11026 c11026, final C20864 c20864) {
        String string;
        int i;
        AbstractActivityC3346 abstractActivityC3346 = c11026.f33146;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        boolean z = c20864.f67522 != null;
        String string2 = c20864.f67519;
        if (z) {
            textView.setText(R.string.MT_Protector);
            textView2.setText(c20864.f67522);
            textView2.setTextColor(C0881.m3228(abstractActivityC3346, R.color.MT_Protector));
        } else {
            textView.setText(R.string.MT_Protector);
            if (string2 == null || string2.isEmpty()) {
                string = abstractActivityC3346.getString(R.string.MT_Protector);
            } else {
                int iMax = Math.max(string2.lastIndexOf(47), string2.lastIndexOf(92));
                string = (iMax < 0 || (i = iMax + 1) >= string2.length()) ? string2 : string2.substring(i);
            }
            textView2.setText(string);
            textView2.setTextColor(m27366(viewM10216));
        }
        ViewOnClickListenerC14813.m35215(textView2);
        String strM51028 = C22927.m51028(c20864.f67524);
        TextView textView3 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        textView3.setText(strM51028);
        ViewOnClickListenerC14813.m35215(textView3);
        String strM40572 = C17283.m40572(c20864.f67523);
        TextView textView4 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        textView4.setText(strM40572);
        ViewOnClickListenerC14813.m35215(textView4);
        String str = c20864.f67521;
        TextView textView5 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        textView5.setText(str);
        ViewOnClickListenerC14813.m35215(textView5);
        if (string2 == null || string2.isEmpty()) {
            string2 = abstractActivityC3346.getString(R.string.MT_Protector);
        }
        TextView textView6 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        textView6.setText(string2);
        ViewOnClickListenerC14813.m35215(textView6);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        c11026.f33152 = dialogInterfaceC0206M44438;
        dialogInterfaceC0206M44438.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.۬ۗ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                C11026.m27364(this.f38612, c20864, dialogInterfaceC0206);
            }
        });
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new ViewOnClickListenerC12149(c11026, c20864, dialogInterfaceC0206M44438, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27361(C11026 c11026, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        if (c11026.f33152 == dialogInterfaceC0206) {
            c11026.f33152 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27364(C11026 c11026, C20864 c20864, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        if (c11026.f33152 == dialogInterfaceC0206) {
            c11026.f33152 = null;
        }
        AbstractActivityC3346 abstractActivityC3346 = c11026.f33146;
        if (abstractActivityC3346 instanceof Main) {
            Main main = (Main) abstractActivityC3346;
            DialogInterfaceC0206 dialogInterfaceC0207 = c11026.f33151;
            if (dialogInterfaceC0207 != null) {
                dialogInterfaceC0207.dismiss();
            }
            c11026.f33150.run();
            C9340 c9340M132 = main.m132();
            if (c9340M132 != null) {
                c9340M132.m24070().m39033(c20864.f67520.mo23554(), true);
                return;
            }
            return;
        }
        DialogInterfaceC0206 dialogInterfaceC0208 = c11026.f33151;
        if (dialogInterfaceC0208 != null) {
            dialogInterfaceC0208.dismiss();
        }
        Main.m64((Activity) abstractActivityC3346, c20864.f67520.mo23554(), false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m27366(View view) {
        TypedValue typedValue = new TypedValue();
        if (view.getContext().getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true)) {
            if (typedValue.resourceId != 0) {
                return C0881.m3228(view.getContext(), typedValue.resourceId);
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
