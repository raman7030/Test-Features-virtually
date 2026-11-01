package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class C6001 {

    /* JADX INFO: renamed from: ۢ */
    public static final C0907 f15039 = new C0907(25);

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f15040;

    /* JADX INFO: renamed from: ۜ */
    public final C10709 f15041;

    /* JADX INFO: renamed from: ۧ */
    public final View f15042;

    /* JADX INFO: renamed from: ܳ */
    public final C7816 f15043;

    /* JADX INFO: renamed from: ܽ */
    public String f15044;

    /* JADX INFO: renamed from: ܿ */
    public final DialogInterfaceC2564 f15045;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f15046 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public boolean f15047;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC17399 f15048;

    /* JADX INFO: renamed from: ֫ */
    public static void m13511(C18107 c18107, InterfaceC19370 interfaceC19370, boolean z) {
        AbstractC17043 abstractC17043Mo8210 = c18107.m41270().mo8210(interfaceC19370);
        String strMo39137 = interfaceC19370.mo39137();
        C6001 c6001 = new C6001(c18107.m41282(), C7816.m18080(c18107.m41282(), abstractC17043Mo8210, strMo39137));
        c6001.f15048 = new C9157(c18107, interfaceC19370);
        if (z) {
            c6001.f15044 = "built-in";
            c6001.f15047 = !strMo39137.equals("*/*");
        }
        new C16058(c6001, null).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13510(C18107 c18107, AbstractC17043 abstractC17043) {
        Main mainM41282 = c18107.m41282();
        C6001 c6001 = new C6001(mainM41282, C7816.m18080(mainM41282, C17853.f53284.m38684("a.apk"), "application/vnd.android.package-archive"));
        c6001.f15044 = "default";
        c6001.f15047 = true;
        View view = c6001.f15042;
        view.findViewById(R.id.MT_Protector).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        DialogInterfaceC2564 dialogInterfaceC2564 = c6001.f15045;
        dialogInterfaceC2564.m3847(-2, null, null);
        dialogInterfaceC2564.m3847(-3, null, null);
        c6001.f15048 = new C3989(abstractC17043, mainM41282);
        new C16058(c6001, null).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13504(AbstractActivityC5549 abstractActivityC5549, C4566 c4566) {
        C6001 c6001 = new C6001(abstractActivityC5549, C7816.m18080(abstractActivityC5549, C17853.f53284.m38684("a.apk"), "application/vnd.android.package-archive"));
        c6001.f15044 = "default";
        c6001.f15047 = true;
        View view = c6001.f15042;
        view.findViewById(R.id.MT_Protector).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        DialogInterfaceC2564 dialogInterfaceC2564 = c6001.f15045;
        dialogInterfaceC2564.m3847(-2, null, null);
        dialogInterfaceC2564.m3847(-3, abstractActivityC5549.getString(R.string.MT_Protector), null);
        ((TextView) view.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        textView.setVisibility(0);
        c6001.f15048 = new C12707(c4566);
        new C16058(c6001, new RunnableC13181(c6001, c4566, 0)).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13508(C6001 c6001, C4566 c4566) {
        Button buttonM3861 = c6001.f15045.m3861();
        if (ApplicationC21448.f67649.contains("dsai")) {
            buttonM3861.setOnClickListener(new ViewOnClickListenerC7058(1, c4566, c6001));
        } else {
            buttonM3861.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m13514(C6001 c6001, C4566 c4566) {
        ApplicationC21448.f67649.edit().remove("dsai").apply();
        c4566.mo9048();
        c6001.f15045.dismiss();
    }

    public C6001(AbstractActivityC5549 abstractActivityC5549, C7816 c7816) {
        this.f15040 = abstractActivityC5549;
        this.f15043 = c7816;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f15042 = viewM12252;
        C8683 c8683 = new C8683(this);
        C10709 c10709 = (C10709) viewM12252.findViewById(R.id.MT_Protector);
        this.f15041 = c10709;
        c10709.setLayoutManager(new C22663((Context) abstractActivityC5549, 3));
        c10709.setAdapter(c8683);
        View viewInflate = LayoutInflater.from(abstractActivityC5549).inflate(R.layout.MT_Protector, (ViewGroup) c10709, false);
        viewInflate.measure(0, 0);
        c10709.m24638((C11169.f31004.size() / 3) * viewInflate.getMeasuredHeight());
        C7040.m16183(c10709);
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        ((C24790) viewM12252.findViewById(R.id.searchView)).m54458(new C18070(c8683, viewFindViewById, viewM12252.findViewById(R.id.MT_Protector)));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC15087(1, abstractActivityC5549));
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f15045 = c20671.m46709();
        String strM18082 = c7816.m18082();
        if (strM18082.equals("*/*")) {
            this.f15044 = "built-in";
            return;
        }
        if (strM18082.startsWith("text/")) {
            this.f15044 = "text/*";
            return;
        }
        if (strM18082.startsWith("image/")) {
            this.f15044 = "image/*";
            return;
        }
        if (strM18082.startsWith("video/")) {
            this.f15044 = "video/*";
        } else if (strM18082.startsWith("audio/")) {
            this.f15044 = "audio/*";
        } else {
            this.f15044 = "default";
            this.f15047 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13503(C0994 c0994, int i, int i2, String str) {
        MenuItem menuItemAdd = c0994.add(i, i2, 0, i2);
        if (C12826.equals(this.f15044, str)) {
            menuItemAdd.setCheckable(true).setChecked(true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13507(C6001 c6001, View view) {
        C1898 c1898 = new C1898(c6001.f15040, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        C1938.m52015(c0994M50638);
        c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "built-in");
        if (c6001.f15047) {
            c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "default");
        }
        c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "text/*");
        c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "image/*");
        c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "video/*");
        c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "audio/*");
        c6001.m13503(c0994M50638, R.id.MT_Protector, R.string.MT_Protector, "*/*");
        c1898.m50636(new C14417(2, c6001));
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13506(C6001 c6001, MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            str = "built-in";
        } else if (itemId == R.string.MT_Protector) {
            str = "default";
        } else if (itemId == R.string.MT_Protector) {
            str = "text/*";
        } else if (itemId == R.string.MT_Protector) {
            str = "image/*";
        } else if (itemId == R.string.MT_Protector) {
            str = "video/*";
        } else {
            str = itemId == R.string.MT_Protector ? "audio/*" : "*/*";
        }
        if (C12826.equals(c6001.f15044, str)) {
            return;
        }
        c6001.f15044 = str;
        new C24776(c6001).m22250();
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m13512(C6001 c6001) {
        ArrayList arrayList = c6001.f15046;
        arrayList.clear();
        if ("built-in".equals(c6001.f15044)) {
            for (int i : DialogInterfaceOnDismissListenerC18647.m42397()) {
                C11169 c11169M25783 = C11169.m25783(i);
                C10695 c10695 = new C10695();
                c10695.f29636 = c11169M25783;
                c10695.f29638 = c11169M25783.m25784().f66888.m30927();
                c10695.f29640 = c11169M25783.m25786();
                arrayList.add(c10695);
            }
            return;
        }
        List<C5134> listM18083 = c6001.f15043.m18083(c6001.f15044);
        PackageManager packageManager = c6001.f15040.getPackageManager();
        for (C5134 c5134 : listM18083) {
            C10695 c10696 = new C10695();
            c10696.f29639 = packageManager;
            c10696.f29635 = c5134;
            c10696.f29640 = c5134.m10960(packageManager);
            c10696.f29637 = new RunnableC11366(c10696);
            arrayList.add(c10696);
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i2 = 0; i2 < size - 1; i2++) {
            if (!zArr[i2]) {
                C10695 c10697 = (C10695) arrayList.get(i2);
                String strM10964 = c10697.f29635.m10964();
                boolean z = false;
                for (int i3 = i2 + 1; i3 < size; i3++) {
                    C10695 c10698 = (C10695) arrayList.get(i3);
                    String str = c10698.f29640;
                    C5134 c5135 = c10698.f29635;
                    if (str.equals(c10697.f29640) && !strM10964.equals(c5135.m10964())) {
                        c10698.f29640 += "\n(" + c5135.m10964() + ')';
                        z = true;
                        zArr[i3] = true;
                    }
                }
                if (z) {
                    c10697.f29640 += "\n(" + c10697.f29635.m10964() + ')';
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13509(C6001 c6001, boolean z) {
        AbstractActivityC5549 abstractActivityC5549 = c6001.f15040;
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46710(R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22216(2, c6001));
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23909());
        }
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13505(C6001 c6001) {
        AbstractActivityC5549 abstractActivityC5549 = c6001.f15040;
        try {
            AbstractC17043 abstractC17043M38684 = C17853.f53278.m38684("filetransfer.apk");
            abstractC17043M38684.m38651(abstractActivityC5549.getAssets().open("filetransfer.apk"));
            Uri uriM38667 = abstractC17043M38684.m38667();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriM38667, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            C5065.m10798(intent, uriM38667);
            abstractActivityC5549.startActivity(intent);
        } catch (IOException e) {
            abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
