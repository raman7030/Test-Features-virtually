package p067l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11007 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f30485;

    /* JADX INFO: renamed from: ۜ */
    public int f30486;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C7654 f30487;

    /* JADX INFO: renamed from: ۧ */
    public long f30488;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f30489 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public int f30490;

    /* JADX INFO: renamed from: ܿ */
    public int f30491;

    /* JADX INFO: renamed from: ᩳ */
    public int f30492;

    /* JADX INFO: renamed from: ᩷ */
    public final C24397 f30493;

    /* JADX INFO: renamed from: ᩻ */
    public final C3847 f30494;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C18362 c18362M53811;
        ViewOnClickListenerC21066 viewOnClickListenerC21066 = (ViewOnClickListenerC21066) abstractC5462;
        try {
            boolean zM25407 = m25407();
            C24397 c24397 = this.f30493;
            if (zM25407) {
                c18362M53811 = ((C12328) this.f30489.get(i)).f34410;
            } else {
                c18362M53811 = c24397.m53811(i);
            }
            viewOnClickListenerC21066.f66167 = c18362M53811;
            C22645.m50703(viewOnClickListenerC21066.f66159, c18362M53811);
            viewOnClickListenerC21066.f66163.setText(c18362M53811.m41828());
            C19033 c19033M41834 = c18362M53811.m41834();
            if (c19033M41834 == null) {
                viewOnClickListenerC21066.f66164.setText(c18362M53811.m41824());
            } else {
                AbstractC5769 abstractC5769M33131 = C14486.m33131(c19033M41834.m43234());
                if (abstractC5769M33131 == null) {
                    viewOnClickListenerC21066.f66164.setText("error " + c18362M53811.m41824());
                } else {
                    viewOnClickListenerC21066.f66164.setText(abstractC5769M33131.mo8544() + c18362M53811.m41824());
                }
            }
            viewOnClickListenerC21066.f66160.setColorFilter(this.f30487.f20062);
            viewOnClickListenerC21066.m47523();
            if (this.f30485) {
                if (c24397.m53815()) {
                    viewOnClickListenerC21066.f66165.setVisibility(8);
                } else {
                    viewOnClickListenerC21066.f66165.setVisibility(0);
                    if (SystemClock.uptimeMillis() - this.f30488 < 100) {
                        viewOnClickListenerC21066.f66165.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(viewOnClickListenerC21066.f66165, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                    }
                }
                viewOnClickListenerC21066.itemView.setBackgroundColor(c18362M53811.m41823() ? C23223.f72997 : 0);
                return;
            }
            if (!c24397.m53815() && SystemClock.uptimeMillis() - this.f30488 < 100) {
                viewOnClickListenerC21066.f66165.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(viewOnClickListenerC21066.f66165, "alpha", 1.0f, 0.0f).setDuration(200L);
                duration.addListener(new C11678(viewOnClickListenerC21066));
                duration.start();
            } else {
                viewOnClickListenerC21066.f66165.setVisibility(8);
            }
            if (viewOnClickListenerC21066.itemView.getBackground() instanceof ColorDrawable) {
                C21272.m48052(viewOnClickListenerC21066.itemView);
            }
        } catch (RuntimeException unused) {
        }
    }

    public C11007(C7654 c7654, C14849 c14849, C24397 c24397) {
        this.f30487 = c7654;
        this.f30493 = c24397;
        C3847 c3847 = new C3847(new C22407(this, c24397));
        this.f30494 = c3847;
        c3847.m7551(c14849);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25412() {
        m25404();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m25413() {
        m25404();
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m25407() {
        return !this.f30487.f20077.isEmpty();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m25404() {
        ArrayList arrayList = this.f30489;
        arrayList.clear();
        if (!m25407()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (true) {
            C24397 c24397 = this.f30493;
            if (i < c24397.m53806()) {
                C18362 c18362M53811 = c24397.m53811(i);
                String strM41828 = c18362M53811.m41828();
                C7654 c7654 = this.f30487;
                int iM26620 = C11567.m26620(c7654.f20077, strM41828, 0);
                if (iM26620 >= 0) {
                    arrayList2.add(new C12328(c18362M53811, i, iM26620));
                } else {
                    int iM26621 = C11567.m26620(c7654.f20077, c18362M53811.m41824(), 0);
                    if (iM26621 >= 0) {
                        arrayList3.add(new C12328(c18362M53811, i, iM26621));
                    }
                }
                i++;
            } else {
                C8150.sort(arrayList2, C12328.f34409);
                C8150.sort(arrayList3, C12328.f34409);
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25393(C11007 c11007, C18362 c18362) {
        ArrayList arrayList = c11007.f30489;
        if (!c11007.m25407()) {
            return c11007.f30493.m53807(c18362);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C12328) arrayList.get(i)).f34410 == c18362) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25396(C11007 c11007, C18362 c18362, int i) {
        ArrayList arrayList = c11007.f30489;
        if (i == -1) {
            c11007.notifyDataSetChanged();
            return;
        }
        if (c11007.m25407() && i < arrayList.size() && ((C12328) arrayList.get(i)).f34410 == c18362) {
            arrayList.remove(i);
        }
        c11007.notifyItemRemoved(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25401(final C11007 c11007, C18362 c18362) {
        C24397 c24397 = c11007.f30493;
        int iM53807 = c24397.m53807(c18362);
        if (iM53807 == -1) {
            c11007.m25413();
            return;
        }
        if (iM53807 == 0) {
            c24397.f77250.scrollToPosition(0);
        } else {
            if (!c24397.m53813(iM53807)) {
                c11007.m25413();
                return;
            }
            c11007.notifyItemMoved(iM53807, 0);
            c24397.f77250.post(new Runnable() { // from class: l.ۜ᩵ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24378.f30493.f77250.scrollToPosition(0);
                }
            });
            C20946.f65824.mo4062(Object.class);
        }
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7654 c7654 = this.f30487;
        return new ViewOnClickListenerC21066(c7654, this, LayoutInflater.from(c7654.f20056).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        if (m25407()) {
            return this.f30489.size();
        }
        return this.f30493.m53806();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25411(int i) {
        if (this.f30485) {
            return;
        }
        C7654 c7654 = this.f30487;
        if (C7654.m17702(c7654)) {
            return;
        }
        c7654.m17710();
        this.f30485 = true;
        this.f30488 = SystemClock.uptimeMillis();
        this.f30492 = i;
        this.f30486 = -2;
        C24397 c24397 = this.f30493;
        c24397.m53814();
        if (i != -1) {
            c24397.m53811(i).m41822(true);
            this.f30490 = 1;
        } else {
            this.f30490 = 0;
        }
        notifyDataSetChanged();
        c7654.f20058.m4420(c24397.f77249);
        c7654.f20058.m20143(false);
        C2959 c2959 = new C2959(c7654.f20073, c7654.f20071, c7654.f20075);
        C2959 c2959M17714 = C7654.m17714(c7654);
        c2959.setAlpha(0.0f);
        c2959.m4909(0);
        c2959M17714.f5154 = true;
        ObjectAnimator.ofFloat(c2959, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c2959M17714, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        c7654.f20071.setOnClickListener(new View.OnClickListener() { // from class: l.۟ᩴܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26556.m25410();
            }
        });
        c7654.f20064.setVisibility(c24397.m53815() ? 8 : 0);
        c7654.f20064.setOnClickListener(new View.OnClickListener() { // from class: l.֫᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11007.m25403(this.f9566);
            }
        });
        c7654.f20059.setVisibility(c24397.m53815() ? 8 : 0);
        c7654.f20059.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11007.m25406(this.f36633);
            }
        });
        c7654.f20069.setOnClickListener(new View.OnClickListener() { // from class: l.ܽ᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11007.m25399(this.f54895);
            }
        });
        C7654.m17687(c7654, this.f30490 > 0);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m25403(final C11007 c11007) {
        C24397 c24397 = c11007.f30493;
        final C8975 c8975M53804 = C24397.m53804(c24397);
        if (c11007.f30490 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC15679 dialogInterfaceOnClickListenerC15679 = new DialogInterfaceOnClickListenerC15679(c24397.f77249);
        C20671 c20671BuildDialog = c11007.f30487.f20056.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(dialogInterfaceOnClickListenerC15679.f45448, dialogInterfaceOnClickListenerC15679.f45449, dialogInterfaceOnClickListenerC15679);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C11007 c11008 = this.f48108;
                c11008.getClass();
                DialogInterfaceOnClickListenerC15679 dialogInterfaceOnClickListenerC156710 = dialogInterfaceOnClickListenerC15679;
                int i2 = dialogInterfaceOnClickListenerC156710.f45450;
                int i3 = dialogInterfaceOnClickListenerC156710.f45449;
                if (i2 != i3) {
                    c8975M53804.m20740(C10987.m25361(dialogInterfaceOnClickListenerC156710.f45448[i3].m50239()));
                    c11008.m25410();
                }
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m25406(final C11007 c11007) {
        C24397 c24397 = c11007.f30493;
        final C8975 c8975M53804 = C24397.m53804(c24397);
        if (c11007.f30490 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC15679 dialogInterfaceOnClickListenerC15679 = new DialogInterfaceOnClickListenerC15679(c24397.f77249);
        C20671 c20671BuildDialog = c11007.f30487.f20056.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(dialogInterfaceOnClickListenerC15679.f45448, dialogInterfaceOnClickListenerC15679.f45449, dialogInterfaceOnClickListenerC15679);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C11007 c11008 = this.f80044;
                c11008.getClass();
                DialogInterfaceOnClickListenerC15679 dialogInterfaceOnClickListenerC156710 = dialogInterfaceOnClickListenerC15679;
                int i2 = dialogInterfaceOnClickListenerC156710.f45450;
                int i3 = dialogInterfaceOnClickListenerC156710.f45449;
                if (i2 != i3) {
                    c8975M53804.m20745(C10987.m25361(dialogInterfaceOnClickListenerC156710.f45448[i3].m50239()));
                    c11008.m25410();
                }
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m25399(final C11007 c11007) {
        C7654 c7654 = c11007.f30487;
        final C8975 c8975M53804 = C24397.m53804(c11007.f30493);
        int i = c11007.f30490;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C18362 c18362M20742 = c8975M53804.m20742();
            int i2 = c8975M53804.m20741() ? R.string.MT_Protector : R.string.MT_Protector;
            String strM41828 = c18362M20742 == null ? "null" : c18362M20742.m41828();
            C20671 c20671BuildDialog = c7654.f20056.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(C7050.m16203(i2, strM41828));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C11007 c11008 = this.f60006;
                    c11008.getClass();
                    c8975M53804.m20735();
                    c11008.m25410();
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        int i3 = c8975M53804.m20741() ? R.string.MT_Protector : R.string.MT_Protector;
        C20671 c20671BuildDialog2 = c7654.f20056.buildDialog();
        c20671BuildDialog2.m46727(R.string.MT_Protector);
        c20671BuildDialog2.m46718(C7050.m16203(i3, Integer.valueOf(c11007.f30490)));
        c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C11007 c11008 = this.f56852;
                c11008.getClass();
                c8975M53804.m20735();
                c11008.m25410();
            }
        });
        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25410() {
        if (this.f30485) {
            this.f30485 = false;
            this.f30488 = SystemClock.uptimeMillis();
            notifyDataSetChanged();
            C7654 c7654 = this.f30487;
            c7654.f20058.m20143(true);
            C2959 c2959M17714 = C7654.m17714(c7654);
            C2959 c2959 = new C2959(c7654.f20073, c7654.f20071, c7654.f20075);
            c2959M17714.setAlpha(0.0f);
            c2959M17714.m4909(0);
            c2959.f5153 = true;
            ObjectAnimator.ofFloat(c2959M17714, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c2959, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            c7654.f20074.setVisibility(C7654.m17692(c7654));
            c7654.f20071.setOnClickListener(null);
            c7654.f20064.setOnClickListener(null);
            c7654.f20059.setOnClickListener(null);
            c7654.f20069.setOnClickListener(null);
        }
    }
}
