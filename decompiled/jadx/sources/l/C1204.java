package l;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1204 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8817 f4350 = C8817.m22786(1000);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5242 f4351 = new C5242();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4047(AbstractActivityC3346 abstractActivityC3346) {
        final C3998 c3998 = new C3998(new AtomicReference(), abstractActivityC3346);
        f4351.m1668(abstractActivityC3346, new InterfaceC1008() { // from class: l.֡ܶܿ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C5438 c5438;
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference == null || (c5438 = (C5438) atomicReference.getAndSet(null)) == null) {
                    return;
                }
                String str = c5438.f16939;
                CallableC19550 callableC19550 = c5438.f16940;
                C3998 c3999 = c3998;
                AtomicReference atomicReference2 = (AtomicReference) c3999.f12671;
                AbstractActivityC3346 abstractActivityC3347 = (AbstractActivityC3346) c3999.f12672;
                WeakReference weakReference = (WeakReference) atomicReference2.get();
                DialogInterfaceC0206 dialogInterfaceC0206 = weakReference == null ? null : (DialogInterfaceC0206) weakReference.get();
                if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
                    dialogInterfaceC0206.dismiss();
                }
                C19258 c19258BuildDialog = abstractActivityC3347.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44424(str);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5582(1, callableC19550, abstractActivityC3347));
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                atomicReference2.set(new WeakReference(c19258BuildDialog.m44438()));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.᩵ܶܿ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4048(final C8966 c8966) {
        if (f4350.m22793()) {
            return;
        }
        String authority = c8966.mo31567().getAuthority();
        if (authority.equals("com.android.externalstorage.documents")) {
            return;
        }
        final PackageManager packageManagerM14320 = C4925.m14320();
        for (ResolveInfo resolveInfo : packageManagerM14320.queryIntentContentProviders(new Intent("android.content.action.DOCUMENTS_PROVIDER"), 0)) {
            if (authority.equals(resolveInfo.providerInfo.authority)) {
                try {
                    final String str = resolveInfo.providerInfo.packageName;
                    f4351.mo1664(new AtomicReference(new C5438(C4925.m14306(R.string.MT_Protector, packageManagerM14320.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManagerM14320).toString()), new Callable() { // from class: l.᩵ܶܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z = c8966 instanceof C13198;
                            String str2 = str;
                            if (z) {
                                Intent intent = new Intent();
                                intent.setClassName(str2, "bin.mt.file.content.MTDataFilesWakeUpActivity");
                                intent.addFlags(268435456);
                                try {
                                    C4925.m14335().startActivity(intent);
                                    return null;
                                } catch (ActivityNotFoundException unused) {
                                }
                            }
                            Intent launchIntentForPackage = packageManagerM14320.getLaunchIntentForPackage(str2);
                            if (launchIntentForPackage == null) {
                                return null;
                            }
                            launchIntentForPackage.addFlags(268435456);
                            C4925.m14335().startActivity(launchIntentForPackage);
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
