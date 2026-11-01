package p067l;

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
import bin.p000mt.function.p001ar.ActivityRecordService;
import bin.p000mt.plus.R;
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
public final class C16156 {

    /* JADX INFO: renamed from: ۜ */
    public static long f47578 = 0;

    /* JADX INFO: renamed from: ۡ */
    public static boolean f47579 = true;

    /* JADX INFO: renamed from: ۢ */
    public static Set f47580 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ܳ */
    public static final AtomicLong f47581 = new AtomicLong();

    /* JADX INFO: renamed from: ᩷ */
    public static C13318 f47582;

    /* JADX INFO: renamed from: ᩻ */
    public static C13318 f47583;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f47584;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f47585;

    /* JADX INFO: renamed from: ܽ */
    public BaseAdapter f47586;

    /* JADX INFO: renamed from: ܿ */
    public final C9294 f47587 = new C9294();

    /* JADX INFO: renamed from: ᩳ */
    public DialogInterfaceC2564 f47588;

    public C16156(AbstractActivityC5549 abstractActivityC5549) {
        this.f47584 = abstractActivityC5549;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36807() {
        LinkedList linkedList = ActivityRecordService.f16;
        synchronized (linkedList) {
            this.f47585 = new ArrayList(linkedList);
        }
        this.f47586 = new C14658(this);
        C20671 c20671BuildDialog = this.f47584.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46716(this.f47586, (DialogInterfaceOnClickListenerC3650) null);
        c20671BuildDialog.m46736((ActivityRecordService.m47() && ActivityRecordService.m46()) ? R.string.MT_Protector : R.string.MT_Protector, null);
        DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f47588 = dialogInterfaceC2564M18268;
        final Button buttonM3860 = dialogInterfaceC2564M18268.m3860();
        f47580.add(buttonM3860);
        this.f47588.m3849(new DialogInterface.OnDismissListener() { // from class: l.ܺۛܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C16156.m36777(this.f51721, buttonM3860);
            }
        });
        this.f47588.m3856().setOnItemClickListener(new C16669());
        this.f47588.m3860().setOnClickListener(new ViewOnClickListenerC15726(2, this));
        this.f47588.m3856().setTag(this);
        this.f47584.getLifecycle().mo21806(new C24046(this));
        this.f47588.m3861().setOnClickListener(new ViewOnClickListenerC4111(1, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36777(C16156 c16156, Button button) {
        m36805(c16156);
        f47580.remove(button);
        AbstractActivityC5549 abstractActivityC5549 = c16156.f47584;
        if (abstractActivityC5549 instanceof ActivityC21093) {
            abstractActivityC5549.finish();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36776(C16156 c16156, View view) {
        AbstractActivityC5549 abstractActivityC5549 = c16156.f47584;
        C1898 c1898 = new C1898(abstractActivityC5549, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        boolean zM48 = true;
        if (!ApplicationC21448.f67649.getBoolean("activity_record_floating_enable", true) ? false : C23058.m51448(abstractActivityC5549)) {
            zM48 = (ActivityRecordService.m47() && ActivityRecordService.m46()) ? true ^ ActivityRecordService.m48() : false;
        }
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        if (zM48) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50636(new C18191(3, c16156));
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36775(C16156 c16156, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                linkedList.clear();
                ActivityRecordService.m49();
            }
            ActivityRecordService.f14 = null;
            c16156.f47585.clear();
            c16156.f47586.notifyDataSetChanged();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C24104.m53360(ApplicationC21448.f67649, "activity_record_floating_enable", false);
            ActivityRecordService.m44();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C24104.m53360(ApplicationC21448.f67649, "activity_record_floating_enable", true);
            if (C11164.m25765(c16156.f47584)) {
                if (ActivityRecordService.m47() && ActivityRecordService.m46()) {
                    ActivityRecordService.m45();
                    return;
                }
                return;
            }
            try {
                C23058.m51450(c16156.f47584, null);
            } catch (Throwable th) {
                c16156.f47584.m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36774(C16156 c16156) {
        boolean zM47 = ActivityRecordService.m47();
        if (zM47 && ActivityRecordService.m46()) {
            m36801();
            return;
        }
        if (!zM47) {
            m36778(false);
        }
        C13318 c13318 = new C13318(c16156);
        if (m36806(c13318)) {
            C13318 c13319 = f47583;
            if (c13319 != null) {
                f47582 = c13318;
                if (c13319.f37405 || m36796(c13319, false)) {
                    return;
                }
                m36772(f47583, EnumC15328.UNHANDLED, (EnumC7953) null);
                return;
            }
            f47583 = c13318;
            if (!m36803(c13318)) {
                f47583 = null;
            } else {
                m36788(c13318, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX INFO: renamed from: ۧ */
    public static void m36788(final C13318 c13318, boolean z) {
        EnumC15328 enumC15328;
        if (m36796(c13318, false)) {
            if (ActivityRecordService.m47()) {
                m36778(true);
                m36772(c13318, EnumC15328.HANDLED, (EnumC7953) null);
                return;
            }
            if (f47579 && !z && !C11164.m25782()) {
                EnumC11977 enumC11977 = EnumC11977.SHELL_INIT;
                c13318.f37404 = enumC11977;
                c13318.f37405 = true;
                m36770(c13318, enumC11977);
                try {
                    C4081.f8987.execute(new RunnableC18839(c13318, new C21545()));
                    return;
                } catch (RejectedExecutionException unused) {
                    C7050.m16212(new Runnable() { // from class: l.᩹ۛܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16156.m36782(c13318);
                        }
                    });
                    return;
                }
            }
            c13318.f37404 = EnumC11977.CONTINUE_SELECTION;
            WeakReference weakReference = c13318.f37401;
            if (f47579 && C11164.m25769()) {
                C16156 c16156 = (C16156) weakReference.get();
                if (c16156 != null) {
                    AbstractActivityC5549 abstractActivityC5549 = c16156.f47584;
                    if (!m36796(c13318, false)) {
                        enumC15328 = EnumC15328.UNHANDLED;
                    } else {
                        c13318.f37404 = EnumC11977.CHOICE;
                        try {
                            View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
                            TextView textView = (TextView) viewM12252.findViewById(R.id.text);
                            SpannableString spannableString = new SpannableString(C7050.m16224(R.string.MT_Protector) + "\n\n" + C7050.m16224(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(spannableString, "\n\n");
                            while (iIndexOf != -1) {
                                int i = iIndexOf + 2;
                                spannableString.setSpan(new RelativeSizeSpan(0.5f), iIndexOf, i, 33);
                                iIndexOf = TextUtils.indexOf(spannableString, "\n\n", i);
                            }
                            textView.setText(spannableString);
                            final Button button = (Button) viewM12252.findViewById(R.id.button1);
                            final Button button2 = (Button) viewM12252.findViewById(R.id.button2);
                            C15766.m35831(button2);
                            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                            c20671BuildDialog.m46715(viewM12252);
                            final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
                            if (!dialogInterfaceC2564M46732.m3855()) {
                                m36773(c13318, true);
                                return;
                            }
                            C9294 c9294 = c16156.f47587;
                            if (c9294.f25262 != c13318 || !m36796(c13318, false)) {
                                dialogInterfaceC2564M46732.dismiss();
                                enumC15328 = EnumC15328.UNHANDLED;
                            } else {
                                c9294.f25261 = dialogInterfaceC2564M46732;
                                dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.ۙۛܿ
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        C16156.m36804(c13318, dialogInterfaceC2564M46732);
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: l.ۗۛܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C16156.m36768(c13318, dialogInterfaceC2564M46732, button, button2);
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() { // from class: l.ۖۛܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C16156.m36799(c13318, dialogInterfaceC2564M46732);
                                    }
                                });
                                return;
                            }
                        } catch (RuntimeException unused2) {
                            m36773(c13318, true);
                            return;
                        }
                    }
                } else {
                    enumC15328 = EnumC15328.UNHANDLED;
                }
            } else if (!m36796(c13318, false)) {
                enumC15328 = EnumC15328.UNHANDLED;
            } else {
                if (!ApplicationC21448.f67649.getBoolean("forbid_tip_ar_manual", true)) {
                    m36773(c13318, true);
                    return;
                }
                C16156 c16157 = (C16156) weakReference.get();
                if (c16157 == null) {
                    enumC15328 = EnumC15328.UNHANDLED;
                } else {
                    c13318.f37404 = EnumC11977.MANUAL_PROMPT;
                    try {
                        C20671 c20671BuildDialog2 = c16157.f47584.buildDialog();
                        c20671BuildDialog2.m46727(R.string.MT_Protector);
                        c20671BuildDialog2.m46710(R.string.MT_Protector);
                        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
                        c20671BuildDialog2.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC2564 dialogInterfaceC2564M46733 = c20671BuildDialog2.m46732();
                        if (!dialogInterfaceC2564M46733.m3855()) {
                            m36773(c13318, true);
                            return;
                        }
                        C9294 c9295 = c16157.f47587;
                        if (c9295.f25262 != c13318 || !m36796(c13318, false)) {
                            dialogInterfaceC2564M46733.dismiss();
                            enumC15328 = EnumC15328.UNHANDLED;
                        } else {
                            c9295.f25261 = dialogInterfaceC2564M46733;
                            dialogInterfaceC2564M46733.m3849(new DialogInterface.OnDismissListener() { // from class: l.ۘۛܿ
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C16156.m36804(c13318, dialogInterfaceC2564M46733);
                                }
                            });
                            dialogInterfaceC2564M46733.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۛܿ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C16156.m36767(c13318, dialogInterfaceC2564M46733);
                                }
                            });
                            dialogInterfaceC2564M46733.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۛܿ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C16156.m36802(c13318, dialogInterfaceC2564M46733);
                                }
                            });
                            return;
                        }
                    } catch (RuntimeException unused3) {
                        m36773(c13318, true);
                        return;
                    }
                }
            }
            m36772(c13318, enumC15328, (EnumC7953) null);
            return;
        }
        m36772(c13318, EnumC15328.UNHANDLED, (EnumC7953) null);
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m36782(C13318 c13318) {
        if (f47583 != c13318) {
            return;
        }
        m36789(c13318);
        c13318.f37405 = false;
        if (m36796(c13318, false)) {
            c13318.f37404 = EnumC11977.CONTINUE_SELECTION;
            m36788(c13318, true);
        } else {
            m36772(c13318, EnumC15328.UNHANDLED, (EnumC7953) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36768(final C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564, Button button, Button button2) {
        if (m36781(c13318, dialogInterfaceC2564, EnumC11977.CHOICE)) {
            EnumC11977 enumC11977 = EnumC11977.SHELL_WORKER;
            c13318.f37404 = enumC11977;
            c13318.f37405 = true;
            dialogInterfaceC2564.m3854(false);
            button.setEnabled(false);
            button2.setEnabled(false);
            m36770(c13318, enumC11977);
            try {
                C4081.f8987.execute(new RunnableC18168(c13318, new C21545()));
            } catch (RejectedExecutionException unused) {
                C7050.m16212(new Runnable() { // from class: l.֡ۛܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16156.m36787(c13318, EnumC7953.COMMAND_FAILED);
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
    
        if (m36779(1000, r17, r13, r14, r15) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d4, code lost:
    
        r1 = m36764(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e3, code lost:
    
        r11 = r8;
        r1 = m36764(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ef, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        return m36765(r9, r12, r0, r17, r13, r14, r15, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r8.f39479 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC7953 m36784() throws Throwable {
        boolean z;
        String str;
        Application applicationM16232 = C7050.m16232();
        InterfaceC11953 interfaceC11953M25777 = C11164.m25777();
        int i = Build.VERSION.SDK_INT;
        C13988 c13988 = null;
        if (i <= 23) {
            z = true;
            try {
                UserManager userManager = (UserManager) applicationM16232.getSystemService("user");
                List<UserHandle> userProfiles = userManager == null ? null : userManager.getUserProfiles();
                if (userProfiles != null && userProfiles.size() == 1) {
                    z = false;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            z = false;
        }
        String strFlattenToString = new ComponentName(applicationM16232, (Class<?>) ActivityRecordService.class).flattenToString();
        int iHashCode = Process.myUserHandle().hashCode();
        C7283 c7283 = new C7283();
        C3259 c3259 = new C3259();
        C9965 c9965 = new C9965();
        C13988 c13989 = new C13988();
        try {
            if (ActivityRecordService.m47()) {
                return EnumC7953.STARTED;
            }
            try {
                if (interfaceC11953M25777 != null && interfaceC11953M25777.mo27364()) {
                    int uid = interfaceC11953M25777.getUid();
                    if (uid != 0 && uid != 2000) {
                        return EnumC7953.COMMAND_FAILED;
                    }
                    if (z) {
                        return EnumC7953.UNSUPPORTED_PROFILE;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() + 15000;
                    if (i >= 24) {
                        try {
                            C4087 c4087M36763 = m36763(interfaceC11953M25777, "am get-current-user", 1, false, jElapsedRealtime, c3259, c13989);
                            try {
                                if (c4087M36763.f9013) {
                                    c13989 = c13989;
                                    try {
                                        int i2 = Integer.parseInt(((String) c4087M36763.f9012.get(0)).trim());
                                        if (i2 != iHashCode) {
                                            return EnumC7953.UNSUPPORTED_PROFILE;
                                        }
                                        iHashCode = i2;
                                    } catch (RuntimeException unused2) {
                                        if (c13989.f39479) {
                                        }
                                        return EnumC7953.COMMAND_FAILED;
                                    }
                                }
                            } catch (RuntimeException unused3) {
                                c13988 = c13989;
                                c13989 = c13988;
                            }
                        } catch (RuntimeException unused4) {
                            c13989 = c13989;
                            c13988 = c13989;
                        }
                    }
                    C4087 c4087M36761 = m36761(interfaceC11953M25777, iHashCode, "enabled_accessibility_services", jElapsedRealtime, c3259, c13989);
                    if (!c4087M36761.f9013) {
                        if (c13989.f39479) {
                            return EnumC7953.STATE_UNKNOWN;
                        }
                        return EnumC7953.COMMAND_FAILED;
                    }
                    if (m36780((String) c4087M36761.f9012.get(0), strFlattenToString)) {
                        C13988 c139810 = c13989;
                        if (!m36779(1000L, jElapsedRealtime, c7283, c3259, c9965)) {
                            EnumC7953 enumC7953M36764 = m36764(interfaceC11953M25777, iHashCode, i, jElapsedRealtime, c3259, c139810);
                        }
                        return m36765(interfaceC11953M25777, iHashCode, strFlattenToString, jElapsedRealtime, c7283, c3259, c9965, c139810);
                    }
                    try {
                        synchronized (interfaceC11953M25777) {
                            try {
                                C4087 c4087M36762 = m36761(interfaceC11953M25777, iHashCode, "enabled_accessibility_services", jElapsedRealtime, c3259, c13989);
                                if (!c4087M36762.f9013) {
                                    return c13989.f39479 ? EnumC7953.STATE_UNKNOWN : EnumC7953.COMMAND_FAILED;
                                }
                                String str2 = (String) c4087M36762.f9012.get(0);
                                boolean zM36780 = m36780(str2, strFlattenToString);
                                if (!zM36780) {
                                    if (str2 == null || str2.isEmpty() || "null".equals(str2)) {
                                        str = strFlattenToString;
                                    } else {
                                        str = str2 + ':' + strFlattenToString;
                                    }
                                    C13988 c139811 = c13989;
                                    try {
                                        if (!m36762(interfaceC11953M25777, iHashCode, "enabled_accessibility_services", str, jElapsedRealtime, c3259, c13989).f9013) {
                                            return c139811.f39479 ? EnumC7953.STATE_UNKNOWN : EnumC7953.COMMAND_FAILED;
                                        }
                                        c13989 = c139811;
                                        C4087 c4087M36764 = m36761(interfaceC11953M25777, iHashCode, "enabled_accessibility_services", jElapsedRealtime, c3259, c13989);
                                        if (!c4087M36764.f9013) {
                                            return c13989.f39479 ? EnumC7953.STATE_UNKNOWN : EnumC7953.COMMAND_FAILED;
                                        }
                                        if (!m36780((String) c4087M36764.f9012.get(0), strFlattenToString)) {
                                            return EnumC7953.ENTRY_MISSING;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c13989 = c139811;
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
                return EnumC7953.COMMAND_FAILED;
            } catch (RuntimeException unused6) {
            }
        } catch (RuntimeException unused7) {
        }
        c13988 = c13989;
        c13989 = c13988;
        return c13989.f39479 ? EnumC7953.STATE_UNKNOWN : EnumC7953.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ void m36799(C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (m36781(c13318, dialogInterfaceC2564, EnumC11977.CHOICE)) {
            c13318.f37404 = EnumC11977.MANUAL_COMMIT;
            m36790(c13318, dialogInterfaceC2564);
            m36773(c13318, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX INFO: renamed from: ۧ */
    public static void m36787(C13318 c13318, EnumC7953 enumC7953) {
        DialogInterfaceC2564 dialogInterfaceC2564;
        DialogInterfaceC2564 dialogInterfaceC2565;
        if (f47583 != c13318) {
            return;
        }
        if (enumC7953 == null) {
            enumC7953 = EnumC7953.COMMAND_FAILED;
        }
        EnumC7953 enumC7954 = EnumC7953.STARTED;
        if (enumC7953 == enumC7954 && !ActivityRecordService.m47()) {
            enumC7953 = EnumC7953.STATE_UNKNOWN;
        }
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 != null) {
            C9294 c9294 = c16156.f47587;
            if (c9294.f25262 != c13318) {
                dialogInterfaceC2564 = null;
            } else {
                dialogInterfaceC2564 = c9294.f25261;
            }
        } else {
            dialogInterfaceC2564 = null;
        }
        boolean zM36781 = m36781(c13318, dialogInterfaceC2564, EnumC11977.SHELL_WORKER);
        m36789(c13318);
        c13318.f37405 = false;
        if (!zM36781) {
            m36798(c13318);
            if (enumC7953 == enumC7954 && c13318.f37399 == f47578) {
                try {
                    m36778(true);
                    return;
                } finally {
                    m36772(c13318, EnumC15328.HANDLED, (EnumC7953) null);
                }
            } else {
                EnumC15328 enumC15328 = EnumC15328.UNHANDLED;
                if (enumC7953 == enumC7954) {
                    enumC7953 = null;
                }
                m36772(c13318, enumC15328, enumC7953);
                return;
            }
        }
        C16156 c16157 = (C16156) c13318.f37401.get();
        if (c16157 != null) {
            C9294 c9295 = c16157.f47587;
            if (c9295.f25262 != c13318) {
                dialogInterfaceC2565 = null;
            } else {
                dialogInterfaceC2565 = c9295.f25261;
            }
        } else {
            dialogInterfaceC2565 = null;
        }
        if (enumC7953 == enumC7954) {
            c13318.f37404 = EnumC11977.FINISHING;
            m36790(c13318, dialogInterfaceC2565);
            try {
                m36778(true);
                C22682.m50793(R.string.MT_Protector);
                return;
            } finally {
                m36772(c13318, EnumC15328.HANDLED, (EnumC7953) null);
            }
        }
        if (enumC7953 == EnumC7953.STATE_UNKNOWN || enumC7953 == EnumC7953.ENTRY_MISSING || enumC7953 == EnumC7953.BIND_TIMEOUT || enumC7953 == EnumC7953.UNSUPPORTED_PROFILE) {
            f47579 = false;
        }
        c13318.f37404 = EnumC11977.MANUAL_COMMIT;
        m36790(c13318, dialogInterfaceC2565);
        m36773(c13318, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36767(C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (m36781(c13318, dialogInterfaceC2564, EnumC11977.MANUAL_PROMPT)) {
            c13318.f37404 = EnumC11977.MANUAL_COMMIT;
            m36790(c13318, dialogInterfaceC2564);
            m36773(c13318, true);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m36802(C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (m36781(c13318, dialogInterfaceC2564, EnumC11977.MANUAL_PROMPT)) {
            C24104.m53360(ApplicationC21448.f67649, "forbid_tip_ar_manual", false);
            c13318.f37404 = EnumC11977.MANUAL_COMMIT;
            m36790(c13318, dialogInterfaceC2564);
            m36773(c13318, true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36773(C13318 c13318, boolean z) {
        EnumC15328 enumC15328;
        if (!m36796(c13318, false)) {
            enumC15328 = EnumC15328.UNHANDLED;
        } else if (z && ActivityRecordService.m47()) {
            m36778(true);
            enumC15328 = EnumC15328.HANDLED;
        } else {
            C16156 c16156 = (C16156) c13318.f37401.get();
            if (c16156 == null) {
                enumC15328 = EnumC15328.UNHANDLED;
            } else {
                c13318.f37404 = EnumC11977.MANUAL_COMMIT;
                try {
                    c16156.f47584.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                    try {
                        C22682.m50800(C7050.m16203(R.string.MT_Protector, C7050.m16224(R.string.MT_Protector)));
                    } catch (RuntimeException unused) {
                    }
                    enumC15328 = EnumC15328.HANDLED;
                } catch (RuntimeException unused2) {
                    enumC15328 = EnumC15328.UNHANDLED;
                }
            }
        }
        m36772(c13318, enumC15328, (EnumC7953) null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m36801() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7050.m16212(new RunnableC22706());
            return;
        }
        f47578++;
        m36778(false);
        f47582 = null;
        C13318 c13318 = f47583;
        if (c13318 == null) {
            return;
        }
        c13318.f37403 = true;
        m36798(c13318);
        if (c13318.f37405) {
            return;
        }
        m36772(c13318, EnumC15328.UNHANDLED, (EnumC7953) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36778(boolean z) {
        ActivityRecordService.m42(z);
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        for (Button button : f47580) {
            if (button != null) {
                button.setText(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m36804(C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564) {
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 != null) {
            C9294 c9294 = c16156.f47587;
            if (c9294.f25262 == c13318 && c9294.f25261 == dialogInterfaceC2564) {
                c9294.f25261 = null;
            }
        }
        if (f47583 == c13318) {
            EnumC11977 enumC11977 = c13318.f37404;
            if (enumC11977 == EnumC11977.CHOICE || enumC11977 == EnumC11977.MANUAL_PROMPT) {
                c13318.f37403 = true;
                m36772(c13318, EnumC15328.UNHANDLED, (EnumC7953) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m36798(C13318 c13318) {
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 == null) {
            return;
        }
        C9294 c9294 = c16156.f47587;
        if (c9294.f25262 != c13318) {
            return;
        }
        c13318.f37404 = EnumC11977.FINISHING;
        m36789(c13318);
        DialogInterfaceC2564 dialogInterfaceC2564 = c9294.f25261;
        c9294.f25261 = null;
        c9294.f25262 = null;
        if (dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855()) {
            return;
        }
        dialogInterfaceC2564.dismiss();
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m36790(C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (dialogInterfaceC2564 == null) {
            return;
        }
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 != null) {
            C9294 c9294 = c16156.f47587;
            if (c9294.f25262 == c13318 && c9294.f25261 == dialogInterfaceC2564) {
                c9294.f25261 = null;
            }
        }
        if (dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36770(final C13318 c13318, final EnumC11977 enumC11977) {
        m36789(c13318);
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 != null) {
            C9294 c9294 = c16156.f47587;
            if (c9294.f25262 != c13318) {
                return;
            }
            final long j = c13318.f37400 + 1;
            c13318.f37400 = j;
            c9294.f25260 = j;
            C7050.m16213(new Runnable() { // from class: l.᩶ۛܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C16156.m36771(c13318, enumC11977, j);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36771(C13318 c13318, EnumC11977 enumC11977, long j) {
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 != null && m36796(c13318, false) && c13318.f37404 == enumC11977 && c13318.f37400 == j) {
            C9294 c9294 = c16156.f47587;
            if (c9294.f25262 == c13318 && c9294.f25260 == j) {
                try {
                    C14853 c14853 = new C14853(c16156.f47584, R.string.MT_Protector);
                    c14853.m33956();
                    if (m36796(c13318, false) && c13318.f37404 == enumC11977 && c13318.f37400 == j && c9294.f25262 == c13318 && c9294.f25260 == j) {
                        c9294.f25259 = c14853;
                    } else {
                        c14853.m33949();
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m36789(C13318 c13318) {
        long j = c13318.f37400 + 1;
        c13318.f37400 = j;
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 == null) {
            return;
        }
        C9294 c9294 = c16156.f47587;
        if (c9294.f25262 != c13318) {
            return;
        }
        c9294.f25260 = j;
        C14853 c14853 = c9294.f25259;
        c9294.f25259 = null;
        if (c14853 != null) {
            c14853.m33949();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m36803(C13318 c13318) {
        C16156 c16156 = (C16156) c13318.f37401.get();
        if (c16156 == null || !m36806(c13318)) {
            return false;
        }
        C9294 c9294 = c16156.f47587;
        C13318 c13319 = c9294.f25262;
        if (c13319 != null && c13319 != c13318) {
            m36798(c13319);
        }
        c9294.f25262 = c13318;
        c9294.f25261 = null;
        c9294.f25259 = null;
        c9294.f25260 = c13318.f37400;
        c13318.f37403 = false;
        return true;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m36806(C13318 c13318) {
        C16156 c16156 = (C16156) c13318.f37401.get();
        DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) c13318.f37402.get();
        if (c16156 == null) {
            return false;
        }
        AbstractActivityC5549 abstractActivityC5549 = c16156.f47584;
        return dialogInterfaceC2564 != null && c16156.f47588 == dialogInterfaceC2564 && dialogInterfaceC2564.m3855() && abstractActivityC5549.getLifecycle().mo21805() == EnumC15415.RESUMED && !abstractActivityC5549.isFinishing() && !abstractActivityC5549.isDestroyed();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m36796(C13318 c13318, boolean z) {
        C16156 c16156;
        if (f47583 != c13318 || c13318.f37399 != f47578 || c13318.f37403 || !m36806(c13318) || (c16156 = (C16156) c13318.f37401.get()) == null) {
            return false;
        }
        C9294 c9294 = c16156.f47587;
        if (c9294.f25262 != c13318) {
            return false;
        }
        if (!z) {
            return true;
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = c9294.f25261;
        return dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36781(C13318 c13318, DialogInterfaceC2564 dialogInterfaceC2564, EnumC11977 enumC11977) {
        C16156 c16156;
        return dialogInterfaceC2564 != null && c13318.f37404 == enumC11977 && m36796(c13318, true) && (c16156 = (C16156) c13318.f37401.get()) != null && c16156.f47587.f25261 == dialogInterfaceC2564;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36772(C13318 c13318, EnumC15328 enumC15328, EnumC7953 enumC7953) {
        if (f47583 != c13318) {
            return;
        }
        c13318.f37404 = EnumC11977.FINISHING;
        long j = c13318.f37399;
        m36798(c13318);
        f47583 = null;
        if (enumC7953 != null && j == f47578 && (enumC7953 == EnumC7953.STATE_UNKNOWN || enumC7953 == EnumC7953.ENTRY_MISSING || enumC7953 == EnumC7953.BIND_TIMEOUT || enumC7953 == EnumC7953.UNSUPPORTED_PROFILE)) {
            f47579 = false;
        }
        C13318 c13319 = f47582;
        f47582 = null;
        if (c13319 == null) {
            return;
        }
        long j2 = c13319.f37399;
        if (!(enumC15328 == EnumC15328.HANDLED && j2 == j) && j2 == f47578 && m36806(c13319)) {
            f47583 = c13319;
            if (!m36803(c13319)) {
                f47583 = null;
            } else if (enumC7953 != null) {
                m36773(c13319, false);
            } else {
                m36788(c13319, false);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m36805(C16156 c16156) {
        C13318 c13318 = f47582;
        if (c13318 != null && c13318.f37401.get() == c16156) {
            f47582 = null;
        }
        C13318 c13319 = f47583;
        if (c13319 == null || c13319.f37401.get() != c16156) {
            return;
        }
        c13319.f37403 = true;
        m36798(c13319);
        if (c13319.f37405) {
            return;
        }
        m36772(c13319, EnumC15328.UNHANDLED, (EnumC7953) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC7953 m36764(InterfaceC11953 interfaceC11953, int i, int i2, long j, C3259 c3259, C13988 c13988) {
        if (i2 >= 24) {
            return null;
        }
        C4087 c4087M36761 = m36761(interfaceC11953, i, "accessibility_enabled", j, c3259, c13988);
        if (c4087M36761.f9013) {
            if ("1".equals(((String) c4087M36761.f9012.get(0)).trim())) {
                return null;
            }
            if (m36762(interfaceC11953, i, "accessibility_enabled", "1", j, c3259, c13988).f9013) {
                C4087 c4087M36762 = m36761(interfaceC11953, i, "accessibility_enabled", j, c3259, c13988);
                if (c4087M36762.f9013 && "1".equals(((String) c4087M36762.f9012.get(0)).trim())) {
                    return null;
                }
                if (c13988.f39479) {
                    return EnumC7953.STATE_UNKNOWN;
                }
                return EnumC7953.COMMAND_FAILED;
            }
            if (c13988.f39479) {
                return EnumC7953.STATE_UNKNOWN;
            }
            return EnumC7953.COMMAND_FAILED;
        }
        if (c13988.f39479) {
            return EnumC7953.STATE_UNKNOWN;
        }
        return EnumC7953.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC7953 m36765(InterfaceC11953 interfaceC11953, int i, String str, long j, C7283 c7283, C3259 c3259, C9965 c9965, C13988 c13988) {
        m36779(Math.min(8000L, Math.max(0L, (j - SystemClock.elapsedRealtime()) - 2500)), j, c7283, c3259, c9965);
        C4087 c4087M36761 = m36761(interfaceC11953, i, "enabled_accessibility_services", j, c3259, c13988);
        if (c4087M36761.f9013) {
            if (!m36780((String) c4087M36761.f9012.get(0), str)) {
                return EnumC7953.ENTRY_MISSING;
            }
            if (ActivityRecordService.m47()) {
                return EnumC7953.STARTED;
            }
            return EnumC7953.BIND_TIMEOUT;
        }
        if (c13988.f39479) {
            return EnumC7953.STATE_UNKNOWN;
        }
        return EnumC7953.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36779(long j, long j2, C7283 c7283, C3259 c3259, C9965 c9965) {
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

    /* JADX INFO: renamed from: ֫ */
    public static C4087 m36761(InterfaceC11953 interfaceC11953, int i, String str, long j, C3259 c3259, C13988 c13988) {
        return m36763(interfaceC11953, "settings get --user " + i + " secure " + str, 1, false, j, c3259, c13988);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4087 m36762(InterfaceC11953 interfaceC11953, int i, String str, String str2, long j, C3259 c3259, C13988 c13988) {
        StringBuilder sb = new StringBuilder("settings put --user ");
        sb.append(i);
        sb.append(" secure ");
        sb.append(str);
        sb.append(" ");
        sb.append("'" + str2.replace("'", "'\\''") + "'");
        return m36763(interfaceC11953, sb.toString(), 0, true, j, c3259, c13988);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4087 m36763(InterfaceC11953 interfaceC11953, String str, int i, boolean z, long j, C3259 c3259, C13988 c13988) {
        boolean z2;
        boolean z3;
        synchronized (interfaceC11953) {
            long jElapsedRealtime = j - SystemClock.elapsedRealtime();
            if (jElapsedRealtime <= 0) {
                return new C4087(Collections.EMPTY_LIST, false);
            }
            long jMin = Math.min(2500L, jElapsedRealtime);
            if (z) {
                c13988.f39479 = true;
            }
            String str2 = "MT_AR_DONE:" + Long.toHexString(f47581.incrementAndGet());
            try {
                try {
                    C13964 c13964Mo27361 = interfaceC11953.mo27361(jMin, "{ " + str + "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- '" + str2 + "'");
                    String[] strArrSplit = c13964Mo27361.f39429.split("\\n", -1);
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
                    boolean zMo27364 = interfaceC11953.mo27364();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = c13964Mo27361.f39430;
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
                    if (z2 || !zMo27364 || (!z3 && (interfaceC11953 instanceof C14634))) {
                        try {
                            interfaceC11953.close();
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!c13964Mo27361.m31745() && z3 && arrayList.size() == i) {
                        return new C4087(arrayList, true);
                    }
                    return new C4087(Collections.EMPTY_LIST, false);
                } catch (RuntimeException unused2) {
                    return new C4087(Collections.EMPTY_LIST, false);
                }
            } catch (RuntimeException unused3) {
                interfaceC11953.close();
                return new C4087(Collections.EMPTY_LIST, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36780(String str, String str2) {
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
