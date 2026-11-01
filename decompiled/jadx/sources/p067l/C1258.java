package p067l;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.۠᩶ */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258 implements InterfaceC1713 {

    /* JADX INFO: renamed from: ֫ */
    public final Notification.Builder f28645;

    /* JADX INFO: renamed from: ۧ */
    public final C1888 f28646;

    /* JADX INFO: renamed from: ܽ */
    public final Bundle f28647;

    /* JADX INFO: renamed from: ᩳ */
    public int f28648;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.net.Uri, java.lang.CharSequence, long[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public C1258(C1888 c1888) {
        ArrayList<C1538> arrayList;
        String str;
        Notification notification;
        ?? r4;
        ?? r5;
        Bundle bundle;
        String str2;
        Bundle[] bundleArr;
        C1258 c1258 = this;
        new ArrayList();
        c1258.f28647 = new Bundle();
        c1258.f28646 = c1888;
        Context context = c1888.f70717;
        ArrayList arrayList2 = c1888.f70710;
        ArrayList<C1538> arrayList3 = c1888.f70702;
        String str3 = c1888.f70711;
        ArrayList arrayList4 = c1888.f70716;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            c1258.f28645 = C1818.m47558(context, str3);
        } else {
            c1258.f28645 = new Notification.Builder(context);
        }
        Notification notification2 = c1888.f70706;
        ArrayList arrayList5 = null;
        c1258.f28645.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c1888.f70709).setContentText(c1888.f70712).setContentInfo(null).setContentIntent(c1888.f70713).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i < 23) {
            Notification.Builder builder = c1258.f28645;
            C1073 c1073 = c1888.f70707;
            builder.setLargeIcon(c1073 == null ? null : c1073.m15504());
        } else {
            Notification.Builder builder2 = c1258.f28645;
            C1073 c1074 = c1888.f70707;
            C1048.m14451(builder2, c1074 == null ? null : c1074.m15508(context));
        }
        c1258.f28645.setSubText(null).setUsesChronometer(false).setPriority(c1888.f70703);
        AbstractC1293 abstractC1293 = c1888.f70700;
        if (abstractC1293 instanceof C1328) {
            C1328 c1328 = (C1328) abstractC1293;
            int iM5542 = C0886.m5542(c1328.f30509.f70717, R.color.MT_Protector);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c1328.f30509.f70717.getResources().getString(R.string.MT_Protector));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iM5542), 0, spannableStringBuilder.length(), 18);
            Context context2 = c1328.f30509.f70717;
            int i2 = C1073.f17597;
            context2.getClass();
            C2028 c2028M37191 = new C1573(C1073.m15500(context2.getResources(), context2.getPackageName(), R.drawable.MT_Protector), spannableStringBuilder).m37191();
            c2028M37191.f80077.putBoolean("key_action_priority", true);
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(c2028M37191);
            ArrayList<C2028> arrayList7 = c1328.f30509.f70701;
            if (arrayList7 != null) {
                int i3 = 2;
                for (C2028 c2028 : arrayList7) {
                    c2028.getClass();
                    if (!c2028.f80077.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList6.add(c2028);
                        i3--;
                    }
                }
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                c1258.m23964((C2028) it.next());
            }
        } else {
            Iterator it2 = c1888.f70701.iterator();
            while (it2.hasNext()) {
                c1258.m23964((C2028) it2.next());
            }
        }
        Bundle bundle2 = c1888.f70705;
        if (bundle2 != null) {
            c1258.f28647.putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        c1258.f28645.setShowWhen(c1888.f70714);
        C1643.m40269(c1258.f28645, false);
        C1643.m40265(c1258.f28645, (String) null);
        C1643.m40268(c1258.f28645, (String) null);
        C1643.m40266(c1258.f28645, false);
        c1258.f28648 = 0;
        C0978.m10545(c1258.f28645, (String) null);
        C0978.m10540(c1258.f28645, 0);
        C0978.m10544(c1258.f28645, c1888.f70704);
        C0978.m10541(c1258.f28645, (Notification) null);
        C0978.m10542(c1258.f28645, notification2.sound, notification2.audioAttributes);
        if (i4 < 28) {
            if (arrayList3 != null) {
                arrayList5 = new ArrayList(arrayList3.size());
                for (C1538 c1538 : arrayList3) {
                    CharSequence charSequence = c1538.f45517;
                    String str4 = c1538.f45515;
                    if (str4 == null) {
                        str4 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList5.add(str4);
                }
            }
            if (arrayList5 != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList5;
                } else {
                    C1782 c1782 = new C1782(arrayList2.size() + arrayList5.size());
                    c1782.addAll(arrayList5);
                    c1782.addAll(arrayList2);
                    arrayList2 = new ArrayList(c1782);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C0978.m10543(c1258.f28645, (String) it3.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (c1888.f70705 == null) {
                c1888.f70705 = new Bundle();
            }
            Bundle bundle3 = c1888.f70705.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList4.size()) {
                String string = Integer.toString(i5);
                C2028 c2029 = (C2028) arrayList4.get(i5);
                Bundle bundle6 = new Bundle();
                C1073 c1073M55078 = c2029.m55078();
                Bundle bundle7 = c2029.f80077;
                ArrayList arrayList8 = arrayList4;
                bundle6.putInt("icon", c1073M55078 != null ? c1073M55078.m15507() : 0);
                bundle6.putCharSequence("title", c2029.f80072);
                bundle6.putParcelable("actionIntent", c2029.f80071);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c2029.m55077());
                bundle6.putBundle("extras", bundle);
                C1726[] c1726ArrM55079 = c2029.m55079();
                if (c1726ArrM55079 == null) {
                    bundleArr = null;
                    str2 = str3;
                } else {
                    Bundle[] bundleArr2 = new Bundle[c1726ArrM55079.length];
                    int i6 = 0;
                    while (i6 < c1726ArrM55079.length) {
                        C1726 c1726 = c1726ArrM55079[i6];
                        C1726[] c1726Arr = c1726ArrM55079;
                        Bundle bundle8 = new Bundle();
                        c1726.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence(AnnotatedPrivateKey.LABEL, null);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr2[i6] = bundle8;
                        i6++;
                        c1726ArrM55079 = c1726Arr;
                        str3 = str3;
                    }
                    str2 = str3;
                    bundleArr = bundleArr2;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c2029.f80078);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i5++;
                arrayList4 = arrayList8;
                arrayList3 = arrayList3;
                notification2 = notification2;
                str3 = str2;
            }
            arrayList = arrayList3;
            str = str3;
            notification = notification2;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c1888.f70705 == null) {
                c1888.f70705 = new Bundle();
            }
            c1888.f70705.putBundle("android.car.EXTENSIONS", bundle3);
            c1258 = this;
            c1258.f28647.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList3;
            str = str3;
            notification = notification2;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            c1258.f28645.setExtras(c1888.f70705);
            r4 = 0;
            C1783.m46072(c1258.f28645, (CharSequence[]) null);
        } else {
            r4 = 0;
        }
        if (i7 >= 26) {
            C1818.m47553(c1258.f28645, 0);
            C1818.m47555(c1258.f28645, (CharSequence) r4);
            C1818.m47556(c1258.f28645, (String) r4);
            C1818.m47554(c1258.f28645, 0L);
            C1818.m47559(c1258.f28645, 0);
            if (!TextUtils.isEmpty(str)) {
                c1258.f28645.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i7 >= 28) {
            for (C1538 c1539 : arrayList) {
                Notification.Builder builder3 = c1258.f28645;
                c1539.getClass();
                C0873.m4917(builder3, C1993.m53898(c1539));
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            C1118.m17728(c1258.f28645, c1888.f70708);
            r5 = 0;
            C1118.m17726(c1258.f28645, (Notification.BubbleMetadata) null);
        } else {
            r5 = 0;
        }
        if (c1888.f70715) {
            c1258.f28646.getClass();
            c1258.f28648 = 1;
            c1258.f28645.setVibrate(r5);
            c1258.f28645.setSound(r5);
            Notification notification3 = notification;
            int i9 = notification3.defaults & (-4);
            notification3.defaults = i9;
            c1258.f28645.setDefaults(i9);
            if (i8 >= 26) {
                c1258.f28646.getClass();
                if (TextUtils.isEmpty(r5)) {
                    C1643.m40265(c1258.f28645, "silent");
                }
                C1818.m47559(c1258.f28645, 1);
            }
        }
    }

    @Override // p067l.InterfaceC1713
    /* JADX INFO: renamed from: ֫ */
    public final Notification.Builder mo23965() {
        return this.f28645;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Notification m23966() {
        Notification notificationBuild;
        Bundle bundle;
        String strMo20824;
        C1888 c1888 = this.f28646;
        AbstractC1293 abstractC1293 = c1888.f70700;
        if (abstractC1293 != null) {
            abstractC1293.mo20826(this);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f28645;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            int i2 = this.f28648;
            if (i >= 24) {
                notificationBuild = builder.build();
                if (i2 != 0) {
                    if (C1643.m40267(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i2 == 2) {
                        m23963(notificationBuild);
                    }
                    if (C1643.m40267(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i2 == 1) {
                        m23963(notificationBuild);
                    }
                }
            } else {
                builder.setExtras(this.f28647);
                notificationBuild = builder.build();
                if (i2 != 0) {
                    if (C1643.m40267(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i2 == 2) {
                        m23963(notificationBuild);
                    }
                    if (C1643.m40267(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i2 == 1) {
                        m23963(notificationBuild);
                    }
                }
            }
        }
        if (abstractC1293 != null) {
            c1888.f70700.getClass();
        }
        if (abstractC1293 != null && (bundle = notificationBuild.extras) != null && (strMo20824 = abstractC1293.mo20824()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo20824);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23964(C2028 c2028) {
        Notification.Action.Builder builderM40260;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        C1073 c1073M55078 = c2028.m55078();
        Bundle bundle2 = c2028.f80077;
        PendingIntent pendingIntent = c2028.f80071;
        CharSequence charSequence = c2028.f80072;
        RemoteInput[] remoteInputArr = null;
        if (i >= 23) {
            builderM40260 = C1048.m14450(c1073M55078 != null ? c1073M55078.m15508((Context) null) : null, charSequence, pendingIntent);
        } else {
            builderM40260 = C1643.m40260(c1073M55078 != null ? c1073M55078.m15507() : 0, charSequence, pendingIntent);
        }
        if (c2028.m55079() != null) {
            C1726[] c1726ArrM55079 = c2028.m55079();
            if (c1726ArrM55079 != null) {
                remoteInputArr = new RemoteInput[c1726ArrM55079.length];
                for (int i2 = 0; i2 < c1726ArrM55079.length; i2++) {
                    c1726ArrM55079[i2].getClass();
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        C1656.m40872(builderAddExtras, 0);
                    }
                    remoteInputArr[i2] = builderAddExtras.build();
                }
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                C1643.m40261(builderM40260, remoteInput);
            }
        }
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c2028.m55077());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            C1783.m46070(builderM40260, c2028.m55077());
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            C0873.m4916(builderM40260, 0);
        }
        if (i3 >= 29) {
            C1118.m17725(builderM40260, false);
        }
        if (i3 >= 31) {
            C0908.m6903(builderM40260, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c2028.f80078);
        C1643.m40262(builderM40260, bundle);
        C1643.m40264(this.f28645, C1643.m40263(builderM40260));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23963(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
