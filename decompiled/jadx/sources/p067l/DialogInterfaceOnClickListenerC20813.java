package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC20813 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ܰ */
    public static WeakReference f65396;

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC17043 f65398;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f65399;

    /* JADX INFO: renamed from: ۛ */
    public View f65400;

    /* JADX INFO: renamed from: ۨ */
    public final C18107 f65402;

    /* JADX INFO: renamed from: ۫ */
    public boolean f65403;

    /* JADX INFO: renamed from: ۬ */
    public boolean f65404;

    /* JADX INFO: renamed from: ᩸ */
    public C6190 f65406;

    /* JADX INFO: renamed from: ᩹ */
    public C6751 f65407;

    /* JADX INFO: renamed from: ֡ܰ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f82950 = {805, 6642, 6634, 6598, 6651, 6648, 6647, 6598, 6633, 6642, 6634, 6581, 6602, 6646, 6635, 6635, 6624, 6581, 6585, 6637, 6641, 6640, 6634, 6585, 6655, 6636, 6647, 6650, 6637, 6640, 6646, 6647, 6585, 6640, 6634, 6585, 6647, 6646, 6637, 6585, 6634, 6636, 6633, 6633, 6646, 6635, 6637, 6652, 6653, 6585, 6655, 6646, 6635, 6585, 6637, 6641, 6640, 6634, 6585, 6648, 6633, 6633, 6585, 6648, 6637, 6585, 6637, 6641, 6652, 6585, 6644, 6646, 6644, 6652, 6647, 6637, 6584, 17937, 31528, 29392, -6507, 32539, 31855, 22420, 31926, 31384, 16992, -28036, 18189, 27825, 22246, 27825, 18978, 25319, 19206, -26268, -6504};

    /* JADX INFO: renamed from: ᩺ */
    public static final AtomicInteger f65397 = new AtomicInteger();

    /* JADX INFO: renamed from: ۟ */
    public static boolean f65395 = true;

    /* JADX INFO: renamed from: ᩶ */
    public AtomicBoolean f65405 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۤ */
    public boolean f65401 = true;

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m47002(String str) {
        short[] sArr = f82950;
        if (C0930.m55885() > 0) {
            short s = sArr[0];
            if (RunnableC1014.f81941 > 0) {
                int i = s + 8940;
                int i2 = i * i;
                if (C0930.f81879 > 0) {
                    int i3 = (s * 35760) - i2 > 0 ? 29916 : 6553;
                    C20953 c20953M47267 = C20953.m47267();
                    short[] sArr2 = f82950;
                    if (C0906.f81862 < 0) {
                        if (C1194.f82045 == 0) {
                            String strM47268 = c20953M47267.m47268(ServiceConnectionC1013.m56161(sArr2, 1, 10, i3), "");
                            if (C0863.f81833 <= 0) {
                                C0930.m55885();
                                if (C0912.f81867 > 0) {
                                    C1028.m56247();
                                    if (C0906.f81862 < 0) {
                                        AbstractC0942.m55971();
                                        RunnableC0897.m55784();
                                    } else if (C0890.f81849 == 0) {
                                        AbstractC0942.m55971();
                                        RunnableC0897.m55784();
                                    }
                                }
                            } else {
                                short[] sArr3 = f82950;
                                if (C0890.f81849 != 0) {
                                    C0930.m55885();
                                    if (C0912.f81867 > 0) {
                                        C1028.m56247();
                                        if (C0906.f81862 < 0) {
                                            AbstractC0942.m55971();
                                            RunnableC0897.m55784();
                                        } else if (C0890.f81849 == 0) {
                                            AbstractC0942.m55971();
                                            RunnableC0897.m55784();
                                        }
                                    }
                                } else {
                                    String strM55970 = AbstractC0942.m55970(sArr3, 11, 1, i3);
                                    if (C0873.f81841 > 0) {
                                        if (!Arrays.asList(ViewOnClickListenerC0939.m55948(strM47268, strM55970)).contains(str)) {
                                            return false;
                                        }
                                        if (C11419.m26417()) {
                                            short[] sArr4 = f82950;
                                            if (C0949.f81897 < 0) {
                                                C22682.m50800(C1404.m56462(sArr4, 77, 20, i3));
                                                return true;
                                            }
                                            if (C0890.f81849 == 0) {
                                            }
                                        } else {
                                            short[] sArr5 = f82950;
                                            if (C1017.f81942 < 0) {
                                                C22682.m50800(C1048.m56318(sArr5, 12, 65, i3));
                                                return true;
                                            }
                                        }
                                        AbstractC0942.m55971();
                                        RunnableC0897.m55784();
                                    }
                                }
                            }
                        }
                    } else if (C0890.f81849 == 0) {
                        AbstractC0942.m55971();
                        RunnableC0897.m55784();
                    }
                } else {
                    C0930.m55885();
                    if (C0912.f81867 > 0) {
                        C1028.m56247();
                        if (C0906.f81862 < 0) {
                            AbstractC0942.m55971();
                            RunnableC0897.m55784();
                        } else if (C0890.f81849 == 0) {
                            AbstractC0942.m55971();
                            RunnableC0897.m55784();
                        }
                    }
                }
            } else if (C0890.f81849 == 0) {
                AbstractC0942.m55971();
                RunnableC0897.m55784();
            }
        }
        C1404.m56468();
        C0917.m55854();
        return false;
    }

    public DialogInterfaceOnClickListenerC20813(final C18107 c18107, String str) {
        this.f65402 = c18107;
        this.f65398 = C18524.m42109(str, new String[0]);
        final int iIncrementAndGet = f65397.incrementAndGet();
        final C14853 c14853 = new C14853(c18107.m41282(), R.string.MT_Protector);
        C4081.f8987.execute(new Runnable() { // from class: l.ۨ۫ܿ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC20813.m46996(this.f37917, c14853, iIncrementAndGet, c18107);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46996(final DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, final C14853 c14853, final int i, final C18107 c18107) {
        C7050.m16206(300L, new RunnableC15504(0, dialogInterfaceOnClickListenerC20813, c14853));
        AbstractC17043 abstractC17043 = dialogInterfaceOnClickListenerC20813.f65398;
        C6190 c6190M45791 = C20272.m45791(abstractC17043);
        dialogInterfaceOnClickListenerC20813.f65406 = c6190M45791;
        String strM52307 = null;
        if (c6190M45791 == null) {
            try {
                C19561 c19561 = new C19561(abstractC17043);
                try {
                    strM52307 = C23527.m52307(c19561);
                    c19561.close();
                } catch (Throwable th) {
                    try {
                        c19561.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        final String str = strM52307;
        dialogInterfaceOnClickListenerC20813.f65401 = false;
        C7050.m16212(new Runnable() { // from class: l.۟۫ܿ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC20813.m46995(this.f25924, c14853, i, str, c18107);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46994(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, C14853 c14853) {
        if (dialogInterfaceOnClickListenerC20813.f65401) {
            c14853.m33952(new RunnableC16180(1, c14853));
            c14853.m33956();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46986(C14853 c14853) {
        f65397.incrementAndGet();
        c14853.m33949();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.۬۫ܿ] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46995(final DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, C14853 c14853, int i, final String str, final C18107 c18107) {
        DialogInterfaceC2564 dialogInterfaceC2564;
        AbstractC17043 abstractC17043 = dialogInterfaceOnClickListenerC20813.f65398;
        c14853.m33949();
        if (i != f65397.get()) {
            return;
        }
        if (dialogInterfaceOnClickListenerC20813.f65406 == null) {
            if (str == null) {
                C20966.m47311(c18107, abstractC17043);
                return;
            }
            String[] strArr = {C7050.m16224(R.string.MT_Protector), C7050.m16224(R.string.MT_Protector)};
            C20671 c20671BuildDialog = c18107.m41282().buildDialog();
            c20671BuildDialog.m46723(strArr, -1, new DialogInterface.OnClickListener() { // from class: l.֫ۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DialogInterfaceOnClickListenerC20813.m46998(this.f8904, c18107, str, dialogInterface, i2);
                }
            });
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46732();
            return;
        }
        final Main mainM41282 = c18107.m41282();
        View viewM12252 = mainM41282.m12252(R.layout.MT_Protector);
        dialogInterfaceOnClickListenerC20813.f65400 = viewM12252;
        ImageView imageView = (ImageView) viewM12252.findViewById(R.id.icon);
        imageView.setImageDrawable(dialogInterfaceOnClickListenerC20813.f65406.m14019());
        imageView.setOnClickListener(new ViewOnClickListenerC10502(1, dialogInterfaceOnClickListenerC20813));
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC20813.f65406.m14015());
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC20813.f65406.m14014());
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), dialogInterfaceOnClickListenerC20813.f65406.m14012());
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), String.valueOf(dialogInterfaceOnClickListenerC20813.f65406.m14018()));
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), C24158.m53411(dialogInterfaceOnClickListenerC20813.f65406.m14017()));
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), C7453.m17222(dialogInterfaceOnClickListenerC20813.f65406.m14011()));
        ViewOnClickListenerC16447.m37364((TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector), C7453.m17222(dialogInterfaceOnClickListenerC20813.f65406.m14016()));
        TextView textView = (TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.signature);
        View viewFindViewById = dialogInterfaceOnClickListenerC20813.f65400.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC16447.m37363(textView);
        dialogInterfaceOnClickListenerC20813.m47013();
        C20671 c20671BuildDialog2 = mainM41282.buildDialog();
        c20671BuildDialog2.m46715(dialogInterfaceOnClickListenerC20813.f65400);
        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
        c20671BuildDialog2.m46728(R.string.MT_Protector, dialogInterfaceOnClickListenerC20813);
        if (c18107.m41261("local")) {
            c20671BuildDialog2.m46734(R.string.MT_Protector, dialogInterfaceOnClickListenerC20813);
        }
        WeakReference weakReference = f65396;
        if (weakReference != null && (dialogInterfaceC2564 = (DialogInterfaceC2564) weakReference.get()) != null && dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
        dialogInterfaceOnClickListenerC20813.f65399 = c20671BuildDialog2.m46732();
        f65396 = new WeakReference(dialogInterfaceOnClickListenerC20813.f65399);
        final long jM29353 = C12810.m29353(abstractC17043.mo25495());
        Button buttonM3861 = dialogInterfaceOnClickListenerC20813.f65399.m3861();
        dialogInterfaceOnClickListenerC20813.f65399.m3860().setOnClickListener(new ViewOnClickListenerC12766(0, dialogInterfaceOnClickListenerC20813));
        dialogInterfaceOnClickListenerC20813.f65399.m3860().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܽۤܿ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C6001.m13510(c18107, this.f54158.f65398);
                return true;
            }
        });
        buttonM3861.setOnClickListener(dialogInterfaceOnClickListenerC20813);
        final C20142 c20142 = new C20142(dialogInterfaceOnClickListenerC20813);
        mainM41282.getLifecycle().mo21806(c20142);
        final C4491 c4491M9493 = C4491.m9493(mainM41282);
        final C6060 c6060 = new C6060(dialogInterfaceOnClickListenerC20813);
        c4491M9493.m9496(c6060, new IntentFilter("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"));
        dialogInterfaceOnClickListenerC20813.f65399.m3849(new DialogInterface.OnDismissListener() { // from class: l.ᩳۤܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C12810.m29355(jM29353);
                mainM41282.getLifecycle().mo21807(c20142);
                c4491M9493.m9495(c6060);
            }
        });
        C21898.f68876.m4066(dialogInterfaceOnClickListenerC20813.f65399, new C6788(0, dialogInterfaceOnClickListenerC20813));
        C4081.f8987.execute(new RunnableC5447(0, dialogInterfaceOnClickListenerC20813, textView));
        C10140.m23620(textView2, viewFindViewById, dialogInterfaceOnClickListenerC20813.f65398, mainM41282, true, new InterfaceC1489() { // from class: l.۬۫ܿ
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                this.f42309.f65407 = (C6751) obj;
            }
        }, new InterfaceC18588() { // from class: l.۫۫ܿ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return DialogInterfaceOnClickListenerC20813.m47010(this.f40395);
            }
        }, dialogInterfaceOnClickListenerC20813.f65405);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46998(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, C18107 c18107, String str, DialogInterface dialogInterface, int i) {
        AbstractC17043 abstractC17043 = dialogInterfaceOnClickListenerC20813.f65398;
        dialogInterface.dismiss();
        if (i == 0) {
            C20966.m47311(c18107, abstractC17043);
        } else {
            m46987(c18107, abstractC17043, str, (RunnableC22099) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46992(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, TextView textView) {
        try {
            String strM17429 = C7531.m17429(dialogInterfaceOnClickListenerC20813.f65398);
            if (dialogInterfaceOnClickListenerC20813.f65399.m3855()) {
                C7050.m16212(new RunnableC8129(0, textView, strM17429));
            }
        } catch (Throwable unused) {
            if (dialogInterfaceOnClickListenerC20813.f65399.m3855()) {
                C7050.m16212(new RunnableC9941(2, textView));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m47010(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813) {
        return !dialogInterfaceOnClickListenerC20813.f65399.m3855();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m47016(final DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813) {
        CharSequence[] charSequenceArr = {C7050.m16224(R.string.MT_Protector), C7050.m16224(R.string.MT_Protector), C7050.m16224(R.string.MT_Protector)};
        C20671 c20671BuildDialog = dialogInterfaceOnClickListenerC20813.f65402.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۤ۫ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogInterfaceOnClickListenerC20813.m46990(this.f33977, dialogInterface, i);
            }
        });
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46990(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, DialogInterface dialogInterface, int i) {
        C18107 c18107 = dialogInterfaceOnClickListenerC20813.f65402;
        dialogInterface.dismiss();
        if (i == 0) {
            new C18800(dialogInterfaceOnClickListenerC20813, c18107.m41219(dialogInterfaceOnClickListenerC20813.f65406.m14015() + "_icon.zip", false)).m22250();
            return;
        }
        if (i == 1 || i == 2) {
            new C16117(dialogInterfaceOnClickListenerC20813, c18107.m41219(dialogInterfaceOnClickListenerC20813.f65406.m14015() + "_icon" + new String[]{".png", ".webp"}[i - 1], false), i).m22250();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m46984(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int iM29939 = C13076.m29939(200.0f);
        if (intrinsicWidth < iM29939) {
            intrinsicHeight = (int) (intrinsicHeight * (iM29939 / intrinsicWidth));
            intrinsicWidth = iM29939;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46988(C19561 c19561, C10844 c10844, C14281 c14281, int i, boolean z, C10949 c10949) {
        C5738 entry;
        for (InterfaceC22528 interfaceC22528 : c14281.m32839(i)) {
            if (z) {
                InterfaceC6434 interfaceC6434Mo31469 = interfaceC22528.mo31469();
                InterfaceC3080 type = interfaceC22528.getType();
                InterfaceC9116 interfaceC9116Mo31472 = interfaceC22528.mo31472();
                C10278 c10278M25225 = c10949.m25225(interfaceC6434Mo31469.mo14722(), interfaceC6434Mo31469.getPackageName());
                c10278M25225.m23892(interfaceC6434Mo31469.mo14712());
                C21678 c21678M23895 = c10278M25225.m23895(type.mo5199(), type.getTypeName());
                C4914 c4914M48931 = c21678M23895.m48931(interfaceC9116Mo31472.mo20693());
                c21678M23895.m48934(interfaceC22528.mo50213(), interfaceC22528.mo31468(), false);
                c4914M48931.m10438(interfaceC22528.mo50213()).m45911(interfaceC22528);
            }
            if (!interfaceC22528.mo31474()) {
                InterfaceC3751 value = interfaceC22528.getValue();
                if (value.mo7252() && (entry = c19561.getEntry(value.mo7251().getValue())) != null) {
                    c10844.m24988(entry, c19561);
                    try {
                        XmlResourceParserC12128 xmlResourceParserC12128M38154 = C16820.m38138(c19561.m44452(entry, (C20689) null)).m38154();
                        while (true) {
                            int next = xmlResourceParserC12128M38154.next();
                            if (next != 1) {
                                if (next == 2) {
                                    int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                                    for (int i2 = 0; i2 < attributeCount; i2++) {
                                        if (xmlResourceParserC12128M38154.m28045(i2) == 1) {
                                            m46988(c19561, c10844, c14281, xmlResourceParserC12128M38154.m28042(i2), true, c10949);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m47013() {
        int i;
        PackageInfo packageInfo;
        long j;
        int i2;
        String str;
        String str2;
        String str3;
        long j2;
        int i3;
        float f;
        boolean z = this.f65404;
        if (z) {
            this.f65404 = false;
        }
        PackageManager packageManagerM16217 = C7050.m16217();
        String strMo25505 = null;
        try {
            Iterator<PackageInfo> it = packageManagerM16217.getInstalledPackages(0).iterator();
            i = 0;
            do {
                try {
                    if (!it.hasNext()) {
                        packageInfo = null;
                        break;
                    } else {
                        packageInfo = it.next();
                        if ((packageInfo.applicationInfo.flags & 129) == 0) {
                            i++;
                        }
                    }
                } catch (Throwable unused) {
                }
            } while (!packageInfo.packageName.equals(this.f65406.m14014()));
        } catch (Throwable unused2) {
            i = 0;
        }
        if (packageInfo == null && i <= 1) {
            try {
                packageInfo = packageManagerM16217.getPackageInfo(this.f65406.m14014(), 0);
            } catch (Throwable unused3) {
            }
        }
        if (packageInfo != null) {
            String str4 = packageInfo.versionName;
            int i4 = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str5 = applicationInfo.sourceDir;
            str3 = applicationInfo.dataDir;
            AbstractC17043 abstractC17043M38684 = C17853.f53287.m38684("Android/data/" + packageInfo.packageName);
            if (abstractC17043M38684.mo25087()) {
                strMo25505 = abstractC17043M38684.mo25505();
            } else if (Build.VERSION.SDK_INT >= 34 && !C23770.m52834().mo4996() && (packageInfo.applicationInfo.flags & 129) == 0) {
                strMo25505 = abstractC17043M38684.mo25505();
            }
            i2 = packageInfo.applicationInfo.uid;
            j = packageInfo.firstInstallTime;
            j2 = packageInfo.lastUpdateTime;
            i3 = i4;
            str2 = str4;
            str = strMo25505;
            strMo25505 = str5;
        } else {
            j = 0;
            i2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            j2 = 0;
            i3 = 0;
        }
        if (strMo25505 != null && this.f65400.findViewById(R.id.MT_Protector).getVisibility() == 0 && ((TextView) this.f65400.findViewById(R.id.apkPath)).getText().toString().equals(strMo25505)) {
            return;
        }
        if (strMo25505 != null) {
            this.f65400.findViewById(R.id.MT_Protector).setVisibility(0);
            this.f65400.findViewById(R.id.MT_Protector).setVisibility(0);
            this.f65400.findViewById(R.id.MT_Protector).setVisibility(0);
            if (str3 != null) {
                this.f65400.findViewById(R.id.MT_Protector).setVisibility(0);
                TextView textView = (TextView) this.f65400.findViewById(R.id.dataDirectory);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new AbsoluteSizeSpan(C13076.m29941(13.0f)), 0, spannableString.length(), 17);
                textView.setText(spannableString);
                ViewOnClickListenerC16447.m37365(textView);
                textView.setOnClickListener(this);
                f = 13.0f;
            } else {
                f = 13.0f;
                this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            if (str != null) {
                this.f65400.findViewById(R.id.MT_Protector).setVisibility(0);
                ((TextView) this.f65400.findViewById(R.id.textView6)).setText(C7050.m16224(R.string.MT_Protector).concat(" 1"));
                ((TextView) this.f65400.findViewById(R.id.textView10)).setText(C7050.m16224(R.string.MT_Protector).concat(" 2"));
                TextView textView2 = (TextView) this.f65400.findViewById(R.id.dataDirectory2);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new AbsoluteSizeSpan(C13076.m29941(f)), 0, spannableString2.length(), 17);
                textView2.setText(spannableString2);
                ViewOnClickListenerC16447.m37365(textView2);
                textView2.setOnClickListener(this);
            } else {
                this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
            }
            ViewOnClickListenerC16447.m37364((TextView) this.f65400.findViewById(R.id.installedVersion), str2 + " (" + i3 + MotionUtils.EASING_TYPE_FORMAT_END);
            TextView textView3 = (TextView) this.f65400.findViewById(R.id.apkPath);
            SpannableString spannableString3 = new SpannableString(strMo25505);
            spannableString3.setSpan(new AbsoluteSizeSpan(C13076.m29941(f)), 0, spannableString3.length(), 17);
            textView3.setText(spannableString3);
            ViewOnClickListenerC16447.m37365(textView3);
            textView3.setOnClickListener(this);
            ViewOnClickListenerC16447.m37364((TextView) this.f65400.findViewById(R.id.uid), String.valueOf(i2));
            ViewOnClickListenerC16447.m37364((TextView) this.f65400.findViewById(R.id.firstInstall), C18794.m42827(j));
            ViewOnClickListenerC16447.m37364((TextView) this.f65400.findViewById(R.id.lastUpdate), C18794.m42827(j2));
            this.f65403 = ((long) i3) > this.f65406.m14018();
            return;
        }
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65400.findViewById(R.id.MT_Protector).setVisibility(8);
        this.f65403 = false;
        if (z) {
            m47000(false);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C20966.m47311(this.f65402, this.f65398);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46991(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, View view) {
        if (!ApplicationC21448.f67650.getBoolean("apk_installation_verify", true)) {
            dialogInterfaceOnClickListenerC20813.m47000(true);
            return;
        }
        C6751 c6751 = dialogInterfaceOnClickListenerC20813.f65407;
        if (c6751 != null && c6751.m15419() && !dialogInterfaceOnClickListenerC20813.f65407.m15420()) {
            C20671 c20671BuildDialog = dialogInterfaceOnClickListenerC20813.f65402.m41282().buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5765(2, dialogInterfaceOnClickListenerC20813));
            C10884.m25069(c20671BuildDialog.m46732());
            return;
        }
        view.setEnabled(false);
        new C10754(dialogInterfaceOnClickListenerC20813, view).m22250();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m47000(boolean z) {
        int i = 0;
        if (z && !ApplicationC21448.f67650.getBoolean("apk_installation_confirm", false)) {
            z = false;
        }
        if (z) {
            boolean z2 = (!C21898.m49407() || C20953.m47267().m47269("disable_install_by_shizuku") || C21898.m49410() == 0) ? false : true;
            boolean zM49409 = C21898.m49409();
            if (!z2 && !zM49409) {
                z = false;
            }
        }
        AbstractC17043 abstractC17043 = this.f65398;
        C18107 c18107 = this.f65402;
        if (z) {
            C20671 c20671BuildDialog = c18107.m41282().buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, abstractC17043.getName()));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21541(i, this));
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        C21898.m49403(c18107.m41282(), abstractC17043, this.f65406.m14014());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6196 c6196M45806;
        C6196 c6196M45807;
        int id = view.getId();
        C18107 c18107 = this.f65402;
        if (id == R.id.dataDirectory) {
            this.f65399.dismiss();
            if (!C11164.m25781() && (c6196M45807 = C20278.m45806(this.f65406.m14014())) != null) {
                c18107.m41259(c6196M45807.m14040() + "/data", true);
                return;
            }
            c18107.m41259(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.dataDirectory2) {
            this.f65399.dismiss();
            if (!C11164.m25781() && (c6196M45806 = C20278.m45806(this.f65406.m14014())) != null) {
                c18107.m41259(c6196M45806.m14040() + "/android_data", true);
                return;
            }
            c18107.m41259(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.apkPath) {
            this.f65399.dismiss();
            File file = new File(((TextView) view).getText().toString());
            c18107.m41279(file.getName());
            c18107.m41259(file.getParent(), true);
            return;
        }
        String strM14014 = this.f65406.m14014();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f65399;
        C12826.requireNonNull(dialogInterfaceC2564);
        m46987(c18107, this.f65398, strM14014, new RunnableC22099(3, dialogInterfaceC2564));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46987(final C18107 c18107, final AbstractC17043 abstractC17043, final String str, final RunnableC22099 runnableC22099) {
        boolean z = C7050.m16235().getBoolean(R.bool.MT_Protector);
        ViewOnClickListenerC22974 viewOnClickListenerC22974 = new ViewOnClickListenerC22974(c18107.m41282(), null);
        if (z) {
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
        } else {
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
            viewOnClickListenerC22974.m51304(R.string.MT_Protector, R.string.MT_Protector);
        }
        viewOnClickListenerC22974.m51307(new InterfaceC16937() { // from class: l.᩺۫ܿ
            @Override // p067l.InterfaceC16937
            /* JADX INFO: renamed from: ֫ */
            public final void mo10648(int i) {
                DialogInterfaceOnClickListenerC20813.m46985(str, runnableC22099, c18107, abstractC17043, i);
            }
        });
        if (z) {
            viewOnClickListenerC22974.m51308();
        } else {
            viewOnClickListenerC22974.m51309();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46985(String str, Runnable runnable, C18107 c18107, AbstractC17043 abstractC17043, int i) {
        if (i == R.string.MT_Protector && m47002(str)) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        if (i == R.string.MT_Protector) {
            C16590.m37592(c18107, new String[]{abstractC17043.mo25505()}, str, true, false);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37594(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37597(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37595(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37590(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37604(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37593(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37598(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            if (!C24414.m53856()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            } else {
                C16590.m37601(abstractC17043, c18107, str);
                return;
            }
        }
        if (i == R.string.MT_Protector) {
            C16590.m37602(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37603(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37596(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37600(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16590.m37599(abstractC17043, c18107, str);
            return;
        }
        if (i == R.string.MT_Protector) {
            Intent intent = new Intent(c18107.m41282(), (Class<?>) ActivityC20908.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(abstractC17043.m38680());
            intent.putExtra("packageName", str);
            c18107.m41282().startActivity(intent);
        }
    }
}
