package l;

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
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3822 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C1315 f12232 = new C1315(25);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f12233;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8776 f12234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f12235;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5732 f12236;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f12237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f12238;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f12239 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f12240;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC15815 f12241;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11575(C16560 c16560, InterfaceC17889 interfaceC17889, boolean z) {
        AbstractC15440 abstractC15440Mo6013 = c16560.m39044().mo6013(interfaceC17889);
        String strMo36971 = interfaceC17889.mo36971();
        C3822 c3822 = new C3822(c16560.m39056(), C5732.m16161(c16560.m39056(), abstractC15440Mo6013, strMo36971));
        c3822.f12241 = new C7143(c16560, interfaceC17889);
        if (z) {
            c3822.f12237 = "built-in";
            c3822.f12240 = !strMo36971.equals("*/*");
        }
        new C14404(c3822, null).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11574(C16560 c16560, AbstractC15440 abstractC15440) {
        Main mainM39056 = c16560.m39056();
        C3822 c3822 = new C3822(mainM39056, C5732.m16161(mainM39056, C16293.f50117.m36526("a.apk"), "application/vnd.android.package-archive"));
        c3822.f12237 = "default";
        c3822.f12240 = true;
        View view = c3822.f12235;
        view.findViewById(R.id.MT_Protector).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        DialogInterfaceC0206 dialogInterfaceC0206 = c3822.f12238;
        dialogInterfaceC0206.m1434(-2, null, null);
        dialogInterfaceC0206.m1434(-3, null, null);
        c3822.f12241 = new C1705(abstractC15440, mainM39056);
        new C14404(c3822, null).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11568(AbstractActivityC3346 abstractActivityC3346, C2312 c2312) {
        C3822 c3822 = new C3822(abstractActivityC3346, C5732.m16161(abstractActivityC3346, C16293.f50117.m36526("a.apk"), "application/vnd.android.package-archive"));
        c3822.f12237 = "default";
        c3822.f12240 = true;
        View view = c3822.f12235;
        view.findViewById(R.id.MT_Protector).setVisibility(4);
        view.findViewById(R.id.searchView).setVisibility(4);
        DialogInterfaceC0206 dialogInterfaceC0206 = c3822.f12238;
        dialogInterfaceC0206.m1434(-2, null, null);
        dialogInterfaceC0206.m1434(-3, abstractActivityC3346.getString(R.string.MT_Protector), null);
        ((TextView) view.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        textView.setVisibility(0);
        c3822.f12241 = new C10878(c2312);
        new C14404(c3822, new RunnableC11377(c3822, c2312, 0)).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11572(C3822 c3822, C2312 c2312) {
        Button buttonM1448 = c3822.f12238.m1448();
        if (ApplicationC20075.f65008.contains("dsai")) {
            buttonM1448.setOnClickListener(new ViewOnClickListenerC4934(1, c2312, c3822));
        } else {
            buttonM1448.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11578(C3822 c3822, C2312 c2312) {
        ApplicationC20075.f65008.edit().remove("dsai").apply();
        c2312.mo6922();
        c3822.f12238.dismiss();
    }

    public C3822(AbstractActivityC3346 abstractActivityC3346, C5732 c5732) {
        this.f12233 = abstractActivityC3346;
        this.f12236 = c5732;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f12235 = viewM10216;
        C6644 c6644 = new C6644(this);
        C8776 c8776 = (C8776) viewM10216.findViewById(R.id.MT_Protector);
        this.f12234 = c8776;
        c8776.setLayoutManager(new C21354((Context) abstractActivityC3346, 3));
        c8776.setAdapter(c6644);
        View viewInflate = LayoutInflater.from(abstractActivityC3346).inflate(R.layout.MT_Protector, (ViewGroup) c8776, false);
        viewInflate.measure(0, 0);
        c8776.m22668((C9260.f28058.size() / 3) * viewInflate.getMeasuredHeight());
        C4915.m14286(c8776);
        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        ((C23592) viewM10216.findViewById(R.id.searchView)).m52055(new C16521(c6644, viewFindViewById, viewM10216.findViewById(R.id.MT_Protector)));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC13382(1, abstractActivityC3346));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f12238 = c19258.m44415();
        String strM16163 = c5732.m16163();
        if (strM16163.equals("*/*")) {
            this.f12237 = "built-in";
            return;
        }
        if (strM16163.startsWith("text/")) {
            this.f12237 = "text/*";
            return;
        }
        if (strM16163.startsWith("image/")) {
            this.f12237 = "image/*";
            return;
        }
        if (strM16163.startsWith("video/")) {
            this.f12237 = "video/*";
        } else if (strM16163.startsWith("audio/")) {
            this.f12237 = "audio/*";
        } else {
            this.f12237 = "default";
            this.f12240 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11567(C3060 c3060, int i, int i2, String str) {
        MenuItem menuItemAdd = c3060.add(i, i2, 0, i2);
        if (C11003.equals(this.f12237, str)) {
            menuItemAdd.setCheckable(true).setChecked(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11571(C3822 c3822, View view) {
        C21282 c21282 = new C21282(c3822.f12233, view, 0);
        C3060 c3060M48304 = c21282.m48304();
        C22090.m49677(c3060M48304);
        c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "built-in");
        if (c3822.f12240) {
            c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "default");
        }
        c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "text/*");
        c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "image/*");
        c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "video/*");
        c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "audio/*");
        c3822.m11567(c3060M48304, R.id.MT_Protector, R.string.MT_Protector, "*/*");
        c21282.m48302(new C12677(2, c3822));
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11570(C3822 c3822, MenuItem menuItem) {
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
        if (C11003.equals(c3822.f12237, str)) {
            return;
        }
        c3822.f12237 = str;
        new C23577(c3822).m20274();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m11576(C3822 c3822) {
        ArrayList arrayList = c3822.f12239;
        arrayList.clear();
        if ("built-in".equals(c3822.f12237)) {
            for (int i : DialogInterfaceOnDismissListenerC17128.m40152()) {
                C9260 c9260M23782 = C9260.m23782(i);
                C8761 c8761 = new C8761();
                c8761.f26710 = c9260M23782;
                c8761.f26712 = c9260M23782.m23783().f64252.m28878();
                c8761.f26714 = c9260M23782.m23785();
                arrayList.add(c8761);
            }
            return;
        }
        List<C2910> listM16164 = c3822.f12236.m16164(c3822.f12237);
        PackageManager packageManager = c3822.f12233.getPackageManager();
        for (C2910 c2910 : listM16164) {
            C8761 c8762 = new C8761();
            c8762.f26713 = packageManager;
            c8762.f26709 = c2910;
            c8762.f26714 = c2910.m8893(packageManager);
            c8762.f26711 = new RunnableC9467(c8762);
            arrayList.add(c8762);
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i2 = 0; i2 < size - 1; i2++) {
            if (!zArr[i2]) {
                C8761 c8763 = (C8761) arrayList.get(i2);
                String strM8897 = c8763.f26709.m8897();
                boolean z = false;
                for (int i3 = i2 + 1; i3 < size; i3++) {
                    C8761 c8764 = (C8761) arrayList.get(i3);
                    String str = c8764.f26714;
                    C2910 c2911 = c8764.f26709;
                    if (str.equals(c8763.f26714) && !strM8897.equals(c2911.m8897())) {
                        c8764.f26714 += "\n(" + c2911.m8897() + ')';
                        z = true;
                        zArr[i3] = true;
                    }
                }
                if (z) {
                    c8763.f26714 += "\n(" + c8763.f26709.m8897() + ')';
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11573(C3822 c3822, boolean z) {
        AbstractActivityC3346 abstractActivityC3346 = c3822.f12233;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44416(R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20883(2, c3822));
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22665());
        }
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11569(C3822 c3822) {
        AbstractActivityC3346 abstractActivityC3346 = c3822.f12233;
        try {
            AbstractC15440 abstractC15440M36526 = C16293.f50111.m36526("filetransfer.apk");
            abstractC15440M36526.m36493(abstractActivityC3346.getAssets().open("filetransfer.apk"));
            Uri uriM36509 = abstractC15440M36526.m36509();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriM36509, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            C2837.m8731(intent, uriM36509);
            abstractActivityC3346.startActivity(intent);
        } catch (IOException e) {
            abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
