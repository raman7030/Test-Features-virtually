package p067l;

import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20946 extends AbstractViewOnClickListenerC14239 {

    /* JADX INFO: renamed from: ۤ */
    public final Set f65826;

    /* JADX INFO: renamed from: ۨ */
    public static final C7350 f65825 = new C7350();

    /* JADX INFO: renamed from: ۛ */
    public static final C7350 f65824 = new C7350();

    /* JADX WARN: Illegal instructions before constructor call */
    public C20946(Main main, C5522 c5522) {
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        super(main, strM16224, strM16224, c5522);
        this.f65826 = C21562.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
        if (C21272.f66914) {
            m47263();
        }
        C10987.m25352(main, new C11558(0, this, c5522));
        f65824.m4066(main, new C24817(1, this, c5522));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47262(C20946 c20946, C5522 c5522) {
        if (C21272.f66914) {
            c20946.m47263();
            c5522.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47261(C20946 c20946, C5522 c5522) {
        if (C21272.f66914) {
            c20946.m47263();
            c5522.notifyDataSetChanged();
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ܽ */
    public final int mo17439() {
        if (C21272.f66914) {
            return super.mo17439();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m47263() {
        ArrayList arrayList = this.f40548;
        arrayList.clear();
        C8975 c8975M25368 = C10987.m25368();
        int iM20747 = c8975M25368.m20747();
        for (int i = 0; i < iM20747; i++) {
            arrayList.add(new C6193(this, this.f37526, c8975M25368.m20743(i)));
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ֫ */
    public final void mo5113(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250, int i) {
        C20275 c20275 = (C20275) abstractViewOnLongClickListenerC16250;
        C6193 c6193 = (C6193) this.f40548.get(i);
        c20275.f62656 = c6193;
        C12255 c12255 = c20275.f47810;
        TextView textView = c20275.f47806;
        c20275.f47809.setText(c6193.f15586.m41828());
        C19033 c19033M41834 = c6193.f15586.m41834();
        if (c19033M41834 == null) {
            textView.setText(c6193.f15586.m41824());
        } else {
            AbstractC5769 abstractC5769M33131 = C14486.m33131(c19033M41834.m43234());
            if (abstractC5769M33131 == null) {
                textView.setText("error " + c6193.f15586.m41824());
            } else {
                textView.setText(abstractC5769M33131.mo8544() + c6193.f15586.m41824());
            }
        }
        c12255.setTag(c6193.f15586);
        c12255.m28261(c6193.m14021());
        if (c6193.f15586.m41834() == null && c6193.f15586.m41833() == null) {
            C18362 c18362 = c6193.f15586;
            if (this.f65826.add(c18362)) {
                C4081.f8987.execute(new RunnableC17591(this, c18362.m41824(), c20275, c18362, 0));
            }
        }
        c20275.itemView.setOnClickListener(c6193);
        this.f40549.m12184((AbstractViewOnLongClickListenerC16250) c20275);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47260(final C20946 c20946, final String str, final C20275 c20275, final C18362 c18362) {
        C21265 c21265M9396;
        Set set = c20946.f65826;
        try {
            try {
                AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
                if (!abstractC17043M42109.mo25094()) {
                    c21265M9396 = C4463.m9371(str, true).m9396();
                } else {
                    c21265M9396 = C22179.f70167.mo13204(new C11450(abstractC17043M42109));
                }
            } catch (RuntimeException unused) {
                c21265M9396 = C4463.m9371(str, true).m9396();
            }
            final C21265 c21265 = c21265M9396;
            C7050.m16212(new Runnable() { // from class: l.ۖܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11041.getClass();
                    C18362 c18363 = c18362;
                    if (str.equals(c18363.m41824())) {
                        C21265 c21266 = c21265;
                        c18363.m41820(c21266);
                        C20275 c20276 = c20275;
                        C6193 c6193 = c20276.f62656;
                        C12255 c12255 = c20276.f47810;
                        if (c6193 != null && c20276.f62656.f15586 == c18363 && c12255.getTag() == c18363) {
                            c12255.m28261(c21266.f66884);
                        }
                    }
                }
            });
        } finally {
            set.remove(c18362);
        }
    }
}
