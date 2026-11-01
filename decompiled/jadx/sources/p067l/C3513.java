package p067l;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3513 {

    /* JADX INFO: renamed from: ֫ */
    public static final C10748 f7119 = C10748.m24756(1000);

    /* JADX INFO: renamed from: ۧ */
    public static final C7350 f7120 = new C7350();

    /* JADX INFO: renamed from: ֫ */
    public static void m6290(AbstractActivityC5549 abstractActivityC5549) {
        final C6168 c6168 = new C6168(new AtomicReference(), abstractActivityC5549);
        f7120.m4066(abstractActivityC5549, new InterfaceC3326() { // from class: l.֡ܶܿ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C7537 c7537;
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference == null || (c7537 = (C7537) atomicReference.getAndSet(null)) == null) {
                    return;
                }
                String str = c7537.f19779;
                CallableC20949 callableC20949 = c7537.f19780;
                C6168 c6169 = c6168;
                AtomicReference atomicReference2 = (AtomicReference) c6169.f15487;
                AbstractActivityC5549 abstractActivityC55410 = (AbstractActivityC5549) c6169.f15488;
                WeakReference weakReference = (WeakReference) atomicReference2.get();
                DialogInterfaceC2564 dialogInterfaceC2564 = weakReference == null ? null : (DialogInterfaceC2564) weakReference.get();
                if (dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855()) {
                    dialogInterfaceC2564.dismiss();
                }
                C20671 c20671BuildDialog = abstractActivityC55410.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46718(str);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7674(1, callableC20949, abstractActivityC55410));
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                atomicReference2.set(new WeakReference(c20671BuildDialog.m46732()));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.᩵ܶܿ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m6291(final C10890 c10890) {
        if (f7119.m24763()) {
            return;
        }
        String authority = c10890.mo33652().getAuthority();
        if (authority.equals("com.android.externalstorage.documents")) {
            return;
        }
        final PackageManager packageManagerM16217 = C7050.m16217();
        for (ResolveInfo resolveInfo : packageManagerM16217.queryIntentContentProviders(new Intent("android.content.action.DOCUMENTS_PROVIDER"), 0)) {
            if (authority.equals(resolveInfo.providerInfo.authority)) {
                try {
                    final String str = resolveInfo.providerInfo.packageName;
                    f7120.mo4062(new AtomicReference(new C7537(C7050.m16203(R.string.MT_Protector, packageManagerM16217.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManagerM16217).toString()), new Callable() { // from class: l.᩵ܶܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z = c10890 instanceof C14912;
                            String str2 = str;
                            if (z) {
                                Intent intent = new Intent();
                                intent.setClassName(str2, "bin.mt.file.content.MTDataFilesWakeUpActivity");
                                intent.addFlags(268435456);
                                try {
                                    C7050.m16232().startActivity(intent);
                                    return null;
                                } catch (ActivityNotFoundException unused) {
                                }
                            }
                            Intent launchIntentForPackage = packageManagerM16217.getLaunchIntentForPackage(str2);
                            if (launchIntentForPackage == null) {
                                return null;
                            }
                            launchIntentForPackage.addFlags(268435456);
                            C7050.m16232().startActivity(launchIntentForPackage);
                            return null;
                        }
                    })));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
