package l;

import android.app.Application;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserHandle;
import android.os.UserManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.function.ar.ActivityRecordService;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܳۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14507 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static long f44477 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f44478 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static Set f44479 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f44480 = new AtomicLong();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11521 f44481;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C11521 f44482;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f44483;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f44484;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BaseAdapter f44485;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7287 f44486 = new C7287();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f44487;

    public C14507(AbstractActivityC3346 abstractActivityC3346) {
        this.f44483 = abstractActivityC3346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34666() {
        LinkedList linkedList = ActivityRecordService.f16;
        synchronized (linkedList) {
            this.f44484 = new ArrayList(linkedList);
        }
        this.f44485 = new C12931(this);
        C19258 c19258BuildDialog = this.f44483.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44422(this.f44485, (DialogInterfaceOnClickListenerC1348) null);
        c19258BuildDialog.m44442((ActivityRecordService.m47() && ActivityRecordService.m46()) ? R.string.MT_Protector : R.string.MT_Protector, null);
        DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f44487 = dialogInterfaceC0206M16343;
        final Button buttonM1447 = dialogInterfaceC0206M16343.m1447();
        f44479.add(buttonM1447);
        this.f44487.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܺۛܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C14507.m34636(this.f48582, buttonM1447);
            }
        });
        this.f44487.m1443().setOnItemClickListener(new C15047());
        this.f44487.m1447().setOnClickListener(new ViewOnClickListenerC14054(2, this));
        this.f44487.m1443().setTag(this);
        this.f44483.getLifecycle().mo19833(new C22809(this));
        this.f44487.m1448().setOnClickListener(new ViewOnClickListenerC1833(1, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34636(C14507 c14507, Button button) {
        m34664(c14507);
        f44479.remove(button);
        AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
        if (abstractActivityC3346 instanceof ActivityC19701) {
            abstractActivityC3346.finish();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34635(C14507 c14507, View view) {
        AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
        C21282 c21282 = new C21282(abstractActivityC3346, view, 0);
        C3060 c3060M48304 = c21282.m48304();
        boolean zM48 = true;
        if (!ApplicationC20075.f65008.getBoolean("activity_record_floating_enable", true) ? false : C21769.m49098(abstractActivityC3346)) {
            zM48 = (ActivityRecordService.m47() && ActivityRecordService.m46()) ? true ^ ActivityRecordService.m48() : false;
        }
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        if (zM48) {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c21282.m48302(new C16648(3, c14507));
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34634(C14507 c14507, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                linkedList.clear();
                ActivityRecordService.m49();
            }
            ActivityRecordService.f14 = null;
            c14507.f44484.clear();
            c14507.f44485.notifyDataSetChanged();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C22870.m50970(ApplicationC20075.f65008, "activity_record_floating_enable", false);
            ActivityRecordService.m44();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C22870.m50970(ApplicationC20075.f65008, "activity_record_floating_enable", true);
            if (C9255.m23764(c14507.f44483)) {
                if (ActivityRecordService.m47() && ActivityRecordService.m46()) {
                    ActivityRecordService.m45();
                    return;
                }
                return;
            }
            try {
                C21769.m49100(c14507.f44483, null);
            } catch (Throwable th) {
                c14507.f44483.m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34633(C14507 c14507) {
        boolean zM47 = ActivityRecordService.m47();
        if (zM47 && ActivityRecordService.m46()) {
            m34660();
            return;
        }
        if (!zM47) {
            m34637(false);
        }
        C11521 c11521 = new C11521(c14507);
        if (m34665(c11521)) {
            C11521 c11522 = f44482;
            if (c11522 != null) {
                f44481 = c11521;
                if (c11522.f34408 || m34655(c11522, false)) {
                    return;
                }
                m34631(f44482, EnumC13636.UNHANDLED, (EnumC5876) null);
                return;
            }
            f44482 = c11521;
            if (!m34662(c11521)) {
                f44482 = null;
            } else {
                m34647(c11521, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34647(final C11521 c11521, boolean z) {
        EnumC13636 enumC13636;
        if (m34655(c11521, false)) {
            if (ActivityRecordService.m47()) {
                m34637(true);
                m34631(c11521, EnumC13636.HANDLED, (EnumC5876) null);
                return;
            }
            if (f44478 && !z && !C9255.m23781()) {
                EnumC10110 enumC10110 = EnumC10110.SHELL_INIT;
                c11521.f34407 = enumC10110;
                c11521.f34408 = true;
                m34629(c11521, enumC10110);
                try {
                    C1802.f6208.execute(new RunnableC17330(c11521, new C20177()));
                    return;
                } catch (RejectedExecutionException unused) {
                    C4925.m14315(new Runnable() { // from class: l.᩹ۛܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14507.m34641(c11521);
                        }
                    });
                    return;
                }
            }
            c11521.f34407 = EnumC10110.CONTINUE_SELECTION;
            WeakReference weakReference = c11521.f34404;
            if (f44478 && C9255.m23768()) {
                C14507 c14507 = (C14507) weakReference.get();
                if (c14507 != null) {
                    AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
                    if (!m34655(c11521, false)) {
                        enumC13636 = EnumC13636.UNHANDLED;
                    } else {
                        c11521.f34407 = EnumC10110.CHOICE;
                        try {
                            View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
                            TextView textView = (TextView) viewM10216.findViewById(R.id.text);
                            SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector) + "\n\n" + C4925.m14327(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(spannableString, "\n\n");
                            while (iIndexOf != -1) {
                                int i = iIndexOf + 2;
                                spannableString.setSpan(new RelativeSizeSpan(0.5f), iIndexOf, i, 33);
                                iIndexOf = TextUtils.indexOf(spannableString, "\n\n", i);
                            }
                            textView.setText(spannableString);
                            final Button button = (Button) viewM10216.findViewById(R.id.button1);
                            final Button button2 = (Button) viewM10216.findViewById(R.id.button2);
                            C14096.m33705(button2);
                            C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                            c19258BuildDialog.m44421(viewM10216);
                            final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
                            if (!dialogInterfaceC0206M44438.m1442()) {
                                m34632(c11521, true);
                                return;
                            }
                            C7287 c7287 = c14507.f44486;
                            if (c7287.f22371 != c11521 || !m34655(c11521, false)) {
                                dialogInterfaceC0206M44438.dismiss();
                                enumC13636 = EnumC13636.UNHANDLED;
                            } else {
                                c7287.f22370 = dialogInterfaceC0206M44438;
                                dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۙۛܿ
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        C14507.m34663(c11521, dialogInterfaceC0206M44438);
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: l.ۗۛܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C14507.m34627(c11521, dialogInterfaceC0206M44438, button, button2);
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() { // from class: l.ۖۛܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C14507.m34658(c11521, dialogInterfaceC0206M44438);
                                    }
                                });
                                return;
                            }
                        } catch (RuntimeException unused2) {
                            m34632(c11521, true);
                            return;
                        }
                    }
                } else {
                    enumC13636 = EnumC13636.UNHANDLED;
                }
            } else if (!m34655(c11521, false)) {
                enumC13636 = EnumC13636.UNHANDLED;
            } else {
                if (!ApplicationC20075.f65008.getBoolean("forbid_tip_ar_manual", true)) {
                    m34632(c11521, true);
                    return;
                }
                C14507 c14508 = (C14507) weakReference.get();
                if (c14508 == null) {
                    enumC13636 = EnumC13636.UNHANDLED;
                } else {
                    c11521.f34407 = EnumC10110.MANUAL_PROMPT;
                    try {
                        C19258 c19258BuildDialog2 = c14508.f44483.buildDialog();
                        c19258BuildDialog2.m44433(R.string.MT_Protector);
                        c19258BuildDialog2.m44416(R.string.MT_Protector);
                        c19258BuildDialog2.m44442(R.string.MT_Protector, null);
                        c19258BuildDialog2.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC0206 dialogInterfaceC0206M44439 = c19258BuildDialog2.m44438();
                        if (!dialogInterfaceC0206M44439.m1442()) {
                            m34632(c11521, true);
                            return;
                        }
                        C7287 c7288 = c14508.f44486;
                        if (c7288.f22371 != c11521 || !m34655(c11521, false)) {
                            dialogInterfaceC0206M44439.dismiss();
                            enumC13636 = EnumC13636.UNHANDLED;
                        } else {
                            c7288.f22370 = dialogInterfaceC0206M44439;
                            dialogInterfaceC0206M44439.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۘۛܿ
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C14507.m34663(c11521, dialogInterfaceC0206M44439);
                                }
                            });
                            dialogInterfaceC0206M44439.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۛܿ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C14507.m34626(c11521, dialogInterfaceC0206M44439);
                                }
                            });
                            dialogInterfaceC0206M44439.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۛܿ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C14507.m34661(c11521, dialogInterfaceC0206M44439);
                                }
                            });
                            return;
                        }
                    } catch (RuntimeException unused3) {
                        m34632(c11521, true);
                        return;
                    }
                }
            }
            m34631(c11521, enumC13636, (EnumC5876) null);
            return;
        }
        m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m34641(C11521 c11521) {
        if (f44482 != c11521) {
            return;
        }
        m34648(c11521);
        c11521.f34408 = false;
        if (m34655(c11521, false)) {
            c11521.f34407 = EnumC10110.CONTINUE_SELECTION;
            m34647(c11521, true);
        } else {
            m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34627(final C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206, Button button, Button button2) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.CHOICE)) {
            EnumC10110 enumC10110 = EnumC10110.SHELL_WORKER;
            c11521.f34407 = enumC10110;
            c11521.f34408 = true;
            dialogInterfaceC0206.m1441(false);
            button.setEnabled(false);
            button2.setEnabled(false);
            m34629(c11521, enumC10110);
            try {
                C1802.f6208.execute(new RunnableC16624(c11521, new C20177()));
            } catch (RejectedExecutionException unused) {
                C4925.m14315(new Runnable() { // from class: l.֡ۛܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14507.m34646(c11521, EnumC5876.COMMAND_FAILED);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c4, code lost:
    
        if (r19 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c6, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d2, code lost:
    
        if (m34638(1000, r17, r13, r14, r15) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d4, code lost:
    
        r1 = m34623(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e3, code lost:
    
        r11 = r8;
        r1 = m34623(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ef, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        return m34624(r9, r12, r0, r17, r13, r14, r15, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r8.f36465 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC5876 m34643() throws Throwable {
        boolean z;
        String str;
        Application applicationM14335 = C4925.m14335();
        InterfaceC10085 interfaceC10085M23776 = C9255.m23776();
        int i = Build.VERSION.SDK_INT;
        C12226 c12226 = null;
        if (i <= 23) {
            z = true;
            try {
                UserManager userManager = (UserManager) applicationM14335.getSystemService("user");
                List<UserHandle> userProfiles = userManager == null ? null : userManager.getUserProfiles();
                if (userProfiles != null && userProfiles.size() == 1) {
                    z = false;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            z = false;
        }
        String strFlattenToString = new ComponentName(applicationM14335, (Class<?>) ActivityRecordService.class).flattenToString();
        int iHashCode = Process.myUserHandle().hashCode();
        C5171 c5171 = new C5171();
        C0937 c0937 = new C0937();
        C7993 c7993 = new C7993();
        C12226 c12227 = new C12226();
        try {
            if (ActivityRecordService.m47()) {
                return EnumC5876.STARTED;
            }
            try {
                if (interfaceC10085M23776 != null && interfaceC10085M23776.mo25345()) {
                    int uid = interfaceC10085M23776.getUid();
                    if (uid != 0 && uid != 2000) {
                        return EnumC5876.COMMAND_FAILED;
                    }
                    if (z) {
                        return EnumC5876.UNSUPPORTED_PROFILE;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() + 15000;
                    if (i >= 24) {
                        try {
                            C1808 c1808M34622 = m34622(interfaceC10085M23776, "am get-current-user", 1, false, jElapsedRealtime, c0937, c12227);
                            try {
                                if (c1808M34622.f6234) {
                                    c12227 = c12227;
                                    try {
                                        int i2 = Integer.parseInt(((String) c1808M34622.f6233.get(0)).trim());
                                        if (i2 != iHashCode) {
                                            return EnumC5876.UNSUPPORTED_PROFILE;
                                        }
                                        iHashCode = i2;
                                    } catch (RuntimeException unused2) {
                                        if (c12227.f36465) {
                                        }
                                        return EnumC5876.COMMAND_FAILED;
                                    }
                                }
                            } catch (RuntimeException unused3) {
                                c12226 = c12227;
                                c12227 = c12226;
                            }
                        } catch (RuntimeException unused4) {
                            c12227 = c12227;
                            c12226 = c12227;
                        }
                    }
                    C1808 c1808M34620 = m34620(interfaceC10085M23776, iHashCode, "enabled_accessibility_services", jElapsedRealtime, c0937, c12227);
                    if (!c1808M34620.f6234) {
                        if (c12227.f36465) {
                            return EnumC5876.STATE_UNKNOWN;
                        }
                        return EnumC5876.COMMAND_FAILED;
                    }
                    if (m34639((String) c1808M34620.f6233.get(0), strFlattenToString)) {
                        C12226 c12228 = c12227;
                        if (!m34638(1000L, jElapsedRealtime, c5171, c0937, c7993)) {
                            EnumC5876 enumC5876M34623 = m34623(interfaceC10085M23776, iHashCode, i, jElapsedRealtime, c0937, c12228);
                        }
                        return m34624(interfaceC10085M23776, iHashCode, strFlattenToString, jElapsedRealtime, c5171, c0937, c7993, c12228);
                    }
                    try {
                        synchronized (interfaceC10085M23776) {
                            try {
                                C1808 c1808M34621 = m34620(interfaceC10085M23776, iHashCode, "enabled_accessibility_services", jElapsedRealtime, c0937, c12227);
                                if (!c1808M34621.f6234) {
                                    return c12227.f36465 ? EnumC5876.STATE_UNKNOWN : EnumC5876.COMMAND_FAILED;
                                }
                                String str2 = (String) c1808M34621.f6233.get(0);
                                boolean zM34639 = m34639(str2, strFlattenToString);
                                if (!zM34639) {
                                    if (str2 == null || str2.isEmpty() || "null".equals(str2)) {
                                        str = strFlattenToString;
                                    } else {
                                        str = str2 + ':' + strFlattenToString;
                                    }
                                    C12226 c12229 = c12227;
                                    try {
                                        if (!m34621(interfaceC10085M23776, iHashCode, "enabled_accessibility_services", str, jElapsedRealtime, c0937, c12227).f6234) {
                                            return c12229.f36465 ? EnumC5876.STATE_UNKNOWN : EnumC5876.COMMAND_FAILED;
                                        }
                                        c12227 = c12229;
                                        C1808 c1808M34623 = m34620(interfaceC10085M23776, iHashCode, "enabled_accessibility_services", jElapsedRealtime, c0937, c12227);
                                        if (!c1808M34623.f6234) {
                                            return c12227.f36465 ? EnumC5876.STATE_UNKNOWN : EnumC5876.COMMAND_FAILED;
                                        }
                                        if (!m34639((String) c1808M34623.f6233.get(0), strFlattenToString)) {
                                            return EnumC5876.ENTRY_MISSING;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c12227 = c12229;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        throw th;
                    } catch (RuntimeException unused5) {
                    }
                }
                return EnumC5876.COMMAND_FAILED;
            } catch (RuntimeException unused6) {
            }
        } catch (RuntimeException unused7) {
        }
        c12226 = c12227;
        c12227 = c12226;
        return c12227.f36465 ? EnumC5876.STATE_UNKNOWN : EnumC5876.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34658(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.CHOICE)) {
            c11521.f34407 = EnumC10110.MANUAL_COMMIT;
            m34649(c11521, dialogInterfaceC0206);
            m34632(c11521, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34646(C11521 c11521, EnumC5876 enumC5876) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        DialogInterfaceC0206 dialogInterfaceC0207;
        if (f44482 != c11521) {
            return;
        }
        if (enumC5876 == null) {
            enumC5876 = EnumC5876.COMMAND_FAILED;
        }
        EnumC5876 enumC5877 = EnumC5876.STARTED;
        if (enumC5876 == enumC5877 && !ActivityRecordService.m47()) {
            enumC5876 = EnumC5876.STATE_UNKNOWN;
        }
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 != c11521) {
                dialogInterfaceC0206 = null;
            } else {
                dialogInterfaceC0206 = c7287.f22370;
            }
        } else {
            dialogInterfaceC0206 = null;
        }
        boolean zM34640 = m34640(c11521, dialogInterfaceC0206, EnumC10110.SHELL_WORKER);
        m34648(c11521);
        c11521.f34408 = false;
        if (!zM34640) {
            m34657(c11521);
            if (enumC5876 == enumC5877 && c11521.f34402 == f44477) {
                try {
                    m34637(true);
                    return;
                } finally {
                    m34631(c11521, EnumC13636.HANDLED, (EnumC5876) null);
                }
            } else {
                EnumC13636 enumC13636 = EnumC13636.UNHANDLED;
                if (enumC5876 == enumC5877) {
                    enumC5876 = null;
                }
                m34631(c11521, enumC13636, enumC5876);
                return;
            }
        }
        C14507 c14508 = (C14507) c11521.f34404.get();
        if (c14508 != null) {
            C7287 c7288 = c14508.f44486;
            if (c7288.f22371 != c11521) {
                dialogInterfaceC0207 = null;
            } else {
                dialogInterfaceC0207 = c7288.f22370;
            }
        } else {
            dialogInterfaceC0207 = null;
        }
        if (enumC5876 == enumC5877) {
            c11521.f34407 = EnumC10110.FINISHING;
            m34649(c11521, dialogInterfaceC0207);
            try {
                m34637(true);
                C21374.m48457(R.string.MT_Protector);
                return;
            } finally {
                m34631(c11521, EnumC13636.HANDLED, (EnumC5876) null);
            }
        }
        if (enumC5876 == EnumC5876.STATE_UNKNOWN || enumC5876 == EnumC5876.ENTRY_MISSING || enumC5876 == EnumC5876.BIND_TIMEOUT || enumC5876 == EnumC5876.UNSUPPORTED_PROFILE) {
            f44478 = false;
        }
        c11521.f34407 = EnumC10110.MANUAL_COMMIT;
        m34649(c11521, dialogInterfaceC0207);
        m34632(c11521, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34626(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.MANUAL_PROMPT)) {
            c11521.f34407 = EnumC10110.MANUAL_COMMIT;
            m34649(c11521, dialogInterfaceC0206);
            m34632(c11521, true);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34661(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.MANUAL_PROMPT)) {
            C22870.m50970(ApplicationC20075.f65008, "forbid_tip_ar_manual", false);
            c11521.f34407 = EnumC10110.MANUAL_COMMIT;
            m34649(c11521, dialogInterfaceC0206);
            m34632(c11521, true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34632(C11521 c11521, boolean z) {
        EnumC13636 enumC13636;
        if (!m34655(c11521, false)) {
            enumC13636 = EnumC13636.UNHANDLED;
        } else if (z && ActivityRecordService.m47()) {
            m34637(true);
            enumC13636 = EnumC13636.HANDLED;
        } else {
            C14507 c14507 = (C14507) c11521.f34404.get();
            if (c14507 == null) {
                enumC13636 = EnumC13636.UNHANDLED;
            } else {
                c11521.f34407 = EnumC10110.MANUAL_COMMIT;
                try {
                    c14507.f44483.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                    try {
                        C21374.m48464(C4925.m14306(R.string.MT_Protector, C4925.m14327(R.string.MT_Protector)));
                    } catch (RuntimeException unused) {
                    }
                    enumC13636 = EnumC13636.HANDLED;
                } catch (RuntimeException unused2) {
                    enumC13636 = EnumC13636.UNHANDLED;
                }
            }
        }
        m34631(c11521, enumC13636, (EnumC5876) null);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m34660() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new RunnableC21399());
            return;
        }
        f44477++;
        m34637(false);
        f44481 = null;
        C11521 c11521 = f44482;
        if (c11521 == null) {
            return;
        }
        c11521.f34406 = true;
        m34657(c11521);
        if (c11521.f34408) {
            return;
        }
        m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34637(boolean z) {
        ActivityRecordService.m42(z);
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        for (Button button : f44479) {
            if (button != null) {
                button.setText(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m34663(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 == c11521 && c7287.f22370 == dialogInterfaceC0206) {
                c7287.f22370 = null;
            }
        }
        if (f44482 == c11521) {
            EnumC10110 enumC10110 = c11521.f34407;
            if (enumC10110 == EnumC10110.CHOICE || enumC10110 == EnumC10110.MANUAL_PROMPT) {
                c11521.f34406 = true;
                m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m34657(C11521 c11521) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 == null) {
            return;
        }
        C7287 c7287 = c14507.f44486;
        if (c7287.f22371 != c11521) {
            return;
        }
        c11521.f34407 = EnumC10110.FINISHING;
        m34648(c11521);
        DialogInterfaceC0206 dialogInterfaceC0206 = c7287.f22370;
        c7287.f22370 = null;
        c7287.f22371 = null;
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442()) {
            return;
        }
        dialogInterfaceC0206.dismiss();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m34649(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (dialogInterfaceC0206 == null) {
            return;
        }
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 == c11521 && c7287.f22370 == dialogInterfaceC0206) {
                c7287.f22370 = null;
            }
        }
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34629(final C11521 c11521, final EnumC10110 enumC10110) {
        m34648(c11521);
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 != c11521) {
                return;
            }
            final long j = c11521.f34403 + 1;
            c11521.f34403 = j;
            c7287.f22369 = j;
            C4925.m14316(new Runnable() { // from class: l.᩶ۛܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C14507.m34630(c11521, enumC10110, j);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34630(C11521 c11521, EnumC10110 enumC10110, long j) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null && m34655(c11521, false) && c11521.f34407 == enumC10110 && c11521.f34403 == j) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 == c11521 && c7287.f22369 == j) {
                try {
                    C13136 c13136 = new C13136(c14507.f44483, R.string.MT_Protector);
                    c13136.m31864();
                    if (m34655(c11521, false) && c11521.f34407 == enumC10110 && c11521.f34403 == j && c7287.f22371 == c11521 && c7287.f22369 == j) {
                        c7287.f22368 = c13136;
                    } else {
                        c13136.m31857();
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m34648(C11521 c11521) {
        long j = c11521.f34403 + 1;
        c11521.f34403 = j;
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 == null) {
            return;
        }
        C7287 c7287 = c14507.f44486;
        if (c7287.f22371 != c11521) {
            return;
        }
        c7287.f22369 = j;
        C13136 c13136 = c7287.f22368;
        c7287.f22368 = null;
        if (c13136 != null) {
            c13136.m31857();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m34662(C11521 c11521) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 == null || !m34665(c11521)) {
            return false;
        }
        C7287 c7287 = c14507.f44486;
        C11521 c11522 = c7287.f22371;
        if (c11522 != null && c11522 != c11521) {
            m34657(c11522);
        }
        c7287.f22371 = c11521;
        c7287.f22370 = null;
        c7287.f22368 = null;
        c7287.f22369 = c11521.f34403;
        c11521.f34406 = false;
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m34665(C11521 c11521) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) c11521.f34405.get();
        if (c14507 == null) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
        return dialogInterfaceC0206 != null && c14507.f44487 == dialogInterfaceC0206 && dialogInterfaceC0206.m1442() && abstractActivityC3346.getLifecycle().mo19832() == EnumC13728.RESUMED && !abstractActivityC3346.isFinishing() && !abstractActivityC3346.isDestroyed();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m34655(C11521 c11521, boolean z) {
        C14507 c14507;
        if (f44482 != c11521 || c11521.f34402 != f44477 || c11521.f34406 || !m34665(c11521) || (c14507 = (C14507) c11521.f34404.get()) == null) {
            return false;
        }
        C7287 c7287 = c14507.f44486;
        if (c7287.f22371 != c11521) {
            return false;
        }
        if (!z) {
            return true;
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = c7287.f22370;
        return dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34640(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206, EnumC10110 enumC10110) {
        C14507 c14507;
        return dialogInterfaceC0206 != null && c11521.f34407 == enumC10110 && m34655(c11521, true) && (c14507 = (C14507) c11521.f34404.get()) != null && c14507.f44486.f22370 == dialogInterfaceC0206;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34631(C11521 c11521, EnumC13636 enumC13636, EnumC5876 enumC5876) {
        if (f44482 != c11521) {
            return;
        }
        c11521.f34407 = EnumC10110.FINISHING;
        long j = c11521.f34402;
        m34657(c11521);
        f44482 = null;
        if (enumC5876 != null && j == f44477 && (enumC5876 == EnumC5876.STATE_UNKNOWN || enumC5876 == EnumC5876.ENTRY_MISSING || enumC5876 == EnumC5876.BIND_TIMEOUT || enumC5876 == EnumC5876.UNSUPPORTED_PROFILE)) {
            f44478 = false;
        }
        C11521 c11522 = f44481;
        f44481 = null;
        if (c11522 == null) {
            return;
        }
        long j2 = c11522.f34402;
        if (!(enumC13636 == EnumC13636.HANDLED && j2 == j) && j2 == f44477 && m34665(c11522)) {
            f44482 = c11522;
            if (!m34662(c11522)) {
                f44482 = null;
            } else if (enumC5876 != null) {
                m34632(c11522, false);
            } else {
                m34647(c11522, false);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m34664(C14507 c14507) {
        C11521 c11521 = f44481;
        if (c11521 != null && c11521.f34404.get() == c14507) {
            f44481 = null;
        }
        C11521 c11522 = f44482;
        if (c11522 == null || c11522.f34404.get() != c14507) {
            return;
        }
        c11522.f34406 = true;
        m34657(c11522);
        if (c11522.f34408) {
            return;
        }
        m34631(c11522, EnumC13636.UNHANDLED, (EnumC5876) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5876 m34623(InterfaceC10085 interfaceC10085, int i, int i2, long j, C0937 c0937, C12226 c12226) {
        if (i2 >= 24) {
            return null;
        }
        C1808 c1808M34620 = m34620(interfaceC10085, i, "accessibility_enabled", j, c0937, c12226);
        if (c1808M34620.f6234) {
            if ("1".equals(((String) c1808M34620.f6233.get(0)).trim())) {
                return null;
            }
            if (m34621(interfaceC10085, i, "accessibility_enabled", "1", j, c0937, c12226).f6234) {
                C1808 c1808M34621 = m34620(interfaceC10085, i, "accessibility_enabled", j, c0937, c12226);
                if (c1808M34621.f6234 && "1".equals(((String) c1808M34621.f6233.get(0)).trim())) {
                    return null;
                }
                if (c12226.f36465) {
                    return EnumC5876.STATE_UNKNOWN;
                }
                return EnumC5876.COMMAND_FAILED;
            }
            if (c12226.f36465) {
                return EnumC5876.STATE_UNKNOWN;
            }
            return EnumC5876.COMMAND_FAILED;
        }
        if (c12226.f36465) {
            return EnumC5876.STATE_UNKNOWN;
        }
        return EnumC5876.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5876 m34624(InterfaceC10085 interfaceC10085, int i, String str, long j, C5171 c5171, C0937 c0937, C7993 c7993, C12226 c12226) {
        m34638(Math.min(8000L, Math.max(0L, (j - SystemClock.elapsedRealtime()) - 2500)), j, c5171, c0937, c7993);
        C1808 c1808M34620 = m34620(interfaceC10085, i, "enabled_accessibility_services", j, c0937, c12226);
        if (c1808M34620.f6234) {
            if (!m34639((String) c1808M34620.f6233.get(0), str)) {
                return EnumC5876.ENTRY_MISSING;
            }
            if (ActivityRecordService.m47()) {
                return EnumC5876.STARTED;
            }
            return EnumC5876.BIND_TIMEOUT;
        }
        if (c12226.f36465) {
            return EnumC5876.STATE_UNKNOWN;
        }
        return EnumC5876.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34638(long j, long j2, C5171 c5171, C0937 c0937, C7993 c7993) {
        if (ActivityRecordService.m47()) {
            return true;
        }
        long jMin = Math.min(j2, Math.max(0L, j) + SystemClock.elapsedRealtime());
        while (SystemClock.elapsedRealtime() < jMin) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin2 = Math.min(200L, jMin - jElapsedRealtime);
            if (jMin2 <= 0) {
                return false;
            }
            SystemClock.sleep(jMin2);
            if (ActivityRecordService.m47()) {
                return true;
            }
            if (SystemClock.elapsedRealtime() <= jElapsedRealtime) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1808 m34620(InterfaceC10085 interfaceC10085, int i, String str, long j, C0937 c0937, C12226 c12226) {
        return m34622(interfaceC10085, "settings get --user " + i + " secure " + str, 1, false, j, c0937, c12226);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1808 m34621(InterfaceC10085 interfaceC10085, int i, String str, String str2, long j, C0937 c0937, C12226 c12226) {
        StringBuilder sb = new StringBuilder("settings put --user ");
        sb.append(i);
        sb.append(" secure ");
        sb.append(str);
        sb.append(" ");
        sb.append("'" + str2.replace("'", "'\\''") + "'");
        return m34622(interfaceC10085, sb.toString(), 0, true, j, c0937, c12226);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1808 m34622(InterfaceC10085 interfaceC10085, String str, int i, boolean z, long j, C0937 c0937, C12226 c12226) {
        boolean z2;
        boolean z3;
        synchronized (interfaceC10085) {
            long jElapsedRealtime = j - SystemClock.elapsedRealtime();
            if (jElapsedRealtime <= 0) {
                return new C1808(Collections.EMPTY_LIST, false);
            }
            long jMin = Math.min(2500L, jElapsedRealtime);
            if (z) {
                c12226.f36465 = true;
            }
            String str2 = "MT_AR_DONE:" + Long.toHexString(f44480.incrementAndGet());
            try {
                try {
                    C12201 c12201Mo25342 = interfaceC10085.mo25342(jMin, "{ " + str + "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- '" + str2 + "'");
                    String[] strArrSplit = c12201Mo25342.f36414.split("\\n", -1);
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        }
                        if ("Read shell timeout.".equals(strArrSplit[i2].trim())) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    boolean zMo25345 = interfaceC10085.mo25345();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = c12201Mo25342.f36415;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= strArr.length) {
                            if (i4 == 1) {
                                z3 = true;
                                break;
                            }
                        } else {
                            String str3 = strArr[i3];
                            if (str2.equals(str3)) {
                                i4++;
                                if (i3 == strArr.length - 1) {
                                    i3++;
                                }
                            } else if (str3.startsWith("MT_AR_OUT:")) {
                                arrayList.add(str3.substring(10));
                                i3++;
                            }
                        }
                        z3 = false;
                        break;
                    }
                    if (z2 || !zMo25345 || (!z3 && (interfaceC10085 instanceof C12906))) {
                        try {
                            interfaceC10085.close();
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!c12201Mo25342.m29683() && z3 && arrayList.size() == i) {
                        return new C1808(arrayList, true);
                    }
                    return new C1808(Collections.EMPTY_LIST, false);
                } catch (RuntimeException unused2) {
                    return new C1808(Collections.EMPTY_LIST, false);
                }
            } catch (RuntimeException unused3) {
                interfaceC10085.close();
                return new C1808(Collections.EMPTY_LIST, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34639(String str, String str2) {
        ComponentName componentNameUnflattenFromString;
        if (str == null || str.isEmpty() || "null".equals(str) || (componentNameUnflattenFromString = ComponentName.unflattenFromString(str2)) == null) {
            return false;
        }
        for (String str3 : str.split(":", -1)) {
            if (!str3.isEmpty() && componentNameUnflattenFromString.equals(ComponentName.unflattenFromString(str3))) {
                return true;
            }
        }
        return false;
    }
}
