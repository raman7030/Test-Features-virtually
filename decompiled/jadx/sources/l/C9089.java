package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9089 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f27548;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f27549;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5561 f27550;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f27551;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27552 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27553;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27554;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f27555;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23178 f27556;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1556 f27557;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C16828 c16828M51415;
        ViewOnClickListenerC19673 viewOnClickListenerC19673 = (ViewOnClickListenerC19673) abstractC3255;
        try {
            boolean zM23460 = m23460();
            C23178 c23178 = this.f27556;
            if (zM23460) {
                c16828M51415 = ((C10479) this.f27552.get(i)).f31446;
            } else {
                c16828M51415 = c23178.m51415(i);
            }
            viewOnClickListenerC19673.f63546 = c16828M51415;
            C21335.m48368(viewOnClickListenerC19673.f63538, c16828M51415);
            viewOnClickListenerC19673.f63542.setText(c16828M51415.m39592());
            C17534 c17534M39598 = c16828M51415.m39598();
            if (c17534M39598 == null) {
                viewOnClickListenerC19673.f63543.setText(c16828M51415.m39588());
            } else {
                AbstractC3577 abstractC3577M31047 = C12749.m31047(c17534M39598.m40974());
                if (abstractC3577M31047 == null) {
                    viewOnClickListenerC19673.f63543.setText("error " + c16828M51415.m39588());
                } else {
                    viewOnClickListenerC19673.f63543.setText(abstractC3577M31047.mo6371() + c16828M51415.m39588());
                }
            }
            viewOnClickListenerC19673.f63539.setColorFilter(this.f27550.f17222);
            viewOnClickListenerC19673.m45226();
            if (this.f27548) {
                if (c23178.m51419()) {
                    viewOnClickListenerC19673.f63544.setVisibility(8);
                } else {
                    viewOnClickListenerC19673.f63544.setVisibility(0);
                    if (SystemClock.uptimeMillis() - this.f27551 < 100) {
                        viewOnClickListenerC19673.f63544.setAlpha(0.0f);
                        ObjectAnimator.ofFloat(viewOnClickListenerC19673.f63544, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                    }
                }
                viewOnClickListenerC19673.itemView.setBackgroundColor(c16828M51415.m39587() ? C21943.f70286 : 0);
                return;
            }
            if (!c23178.m51419() && SystemClock.uptimeMillis() - this.f27551 < 100) {
                viewOnClickListenerC19673.f63544.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(viewOnClickListenerC19673.f63544, "alpha", 1.0f, 0.0f).setDuration(200L);
                duration.addListener(new C9795(viewOnClickListenerC19673));
                duration.start();
            } else {
                viewOnClickListenerC19673.f63544.setVisibility(8);
            }
            if (viewOnClickListenerC19673.itemView.getBackground() instanceof ColorDrawable) {
                C19890.m45741(viewOnClickListenerC19673.itemView);
            }
        } catch (RuntimeException unused) {
        }
    }

    public C9089(C5561 c5561, C13132 c13132, C23178 c23178) {
        this.f27550 = c5561;
        this.f27556 = c23178;
        C1556 c1556 = new C1556(new C21084(this, c23178));
        this.f27557 = c1556;
        c1556.m5322(c13132);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23465() {
        m23457();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23466() {
        m23457();
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m23460() {
        return !this.f27550.f17237.isEmpty();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m23457() {
        ArrayList arrayList = this.f27552;
        arrayList.clear();
        if (!m23460()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (true) {
            C23178 c23178 = this.f27556;
            if (i < c23178.m51410()) {
                C16828 c16828M51415 = c23178.m51415(i);
                String strM39592 = c16828M51415.m39592();
                C5561 c5561 = this.f27550;
                int iM24606 = C9679.m24606(c5561.f17237, strM39592, 0);
                if (iM24606 >= 0) {
                    arrayList2.add(new C10479(c16828M51415, i, iM24606));
                } else {
                    int iM24607 = C9679.m24606(c5561.f17237, c16828M51415.m39588(), 0);
                    if (iM24607 >= 0) {
                        arrayList3.add(new C10479(c16828M51415, i, iM24607));
                    }
                }
                i++;
            } else {
                C6083.sort(arrayList2, C10479.f31445);
                C6083.sort(arrayList3, C10479.f31445);
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23446(C9089 c9089, C16828 c16828) {
        ArrayList arrayList = c9089.f27552;
        if (!c9089.m23460()) {
            return c9089.f27556.m51411(c16828);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C10479) arrayList.get(i)).f31446 == c16828) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23449(C9089 c9089, C16828 c16828, int i) {
        ArrayList arrayList = c9089.f27552;
        if (i == -1) {
            c9089.notifyDataSetChanged();
            return;
        }
        if (c9089.m23460() && i < arrayList.size() && ((C10479) arrayList.get(i)).f31446 == c16828) {
            arrayList.remove(i);
        }
        c9089.notifyItemRemoved(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23454(final C9089 c9089, C16828 c16828) {
        C23178 c23178 = c9089.f27556;
        int iM51411 = c23178.m51411(c16828);
        if (iM51411 == -1) {
            c9089.m23466();
            return;
        }
        if (iM51411 == 0) {
            c23178.f74506.scrollToPosition(0);
        } else {
            if (!c23178.m51417(iM51411)) {
                c9089.m23466();
                return;
            }
            c9089.notifyItemMoved(iM51411, 0);
            c23178.f74506.post(new Runnable() { // from class: l.ۜ᩵ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21498.f27556.f74506.scrollToPosition(0);
                }
            });
            C19547.f63204.mo1664(Object.class);
        }
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C5561 c5561 = this.f27550;
        return new ViewOnClickListenerC19673(c5561, this, LayoutInflater.from(c5561.f17216).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        if (m23460()) {
            return this.f27552.size();
        }
        return this.f27556.m51410();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23464(int i) {
        if (this.f27548) {
            return;
        }
        C5561 c5561 = this.f27550;
        if (C5561.m15787(c5561)) {
            return;
        }
        c5561.m15795();
        this.f27548 = true;
        this.f27551 = SystemClock.uptimeMillis();
        this.f27555 = i;
        this.f27549 = -2;
        C23178 c23178 = this.f27556;
        c23178.m51418();
        if (i != -1) {
            c23178.m51415(i).m39586(true);
            this.f27553 = 1;
        } else {
            this.f27553 = 0;
        }
        notifyDataSetChanged();
        c5561.f17218.m2043(c23178.f74505);
        c5561.f17218.m18195(false);
        C0621 c0621 = new C0621(c5561.f17233, c5561.f17231, c5561.f17235);
        C0621 c0621M15799 = C5561.m15799(c5561);
        c0621.setAlpha(0.0f);
        c0621.m2553(0);
        c0621M15799.f2381 = true;
        ObjectAnimator.ofFloat(c0621, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c0621M15799, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        c5561.f17231.setOnClickListener(new View.OnClickListener() { // from class: l.۟ᩴܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23642.m23463();
            }
        });
        c5561.f17224.setVisibility(c23178.m51419() ? 8 : 0);
        c5561.f17224.setOnClickListener(new View.OnClickListener() { // from class: l.֫᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9089.m23456(this.f6782);
            }
        });
        c5561.f17219.setVisibility(c23178.m51419() ? 8 : 0);
        c5561.f17219.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9089.m23459(this.f33634);
            }
        });
        c5561.f17229.setOnClickListener(new View.OnClickListener() { // from class: l.ܽ᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9089.m23452(this.f51715);
            }
        });
        C5561.m15772(c5561, this.f27553 > 0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23456(final C9089 c9089) {
        C23178 c23178 = c9089.f27556;
        final C6951 c6951M51408 = C23178.m51408(c23178);
        if (c9089.f27553 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14005 = new DialogInterfaceOnClickListenerC14005(c23178.f74505);
        C19258 c19258BuildDialog = c9089.f27550.f17216.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44429(dialogInterfaceOnClickListenerC14005.f42365, dialogInterfaceOnClickListenerC14005.f42366, dialogInterfaceOnClickListenerC14005);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9089 c90810 = this.f44995;
                c90810.getClass();
                DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14006 = dialogInterfaceOnClickListenerC14005;
                int i2 = dialogInterfaceOnClickListenerC14006.f42367;
                int i3 = dialogInterfaceOnClickListenerC14006.f42366;
                if (i2 != i3) {
                    c6951M51408.m18786(C9068.m23415(dialogInterfaceOnClickListenerC14006.f42365[i3].m47909()));
                    c90810.m23463();
                }
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23459(final C9089 c9089) {
        C23178 c23178 = c9089.f27556;
        final C6951 c6951M51408 = C23178.m51408(c23178);
        if (c9089.f27553 == 0) {
            return;
        }
        final DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14005 = new DialogInterfaceOnClickListenerC14005(c23178.f74505);
        C19258 c19258BuildDialog = c9089.f27550.f17216.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44429(dialogInterfaceOnClickListenerC14005.f42365, dialogInterfaceOnClickListenerC14005.f42366, dialogInterfaceOnClickListenerC14005);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9089 c90810 = this.f77293;
                c90810.getClass();
                DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14006 = dialogInterfaceOnClickListenerC14005;
                int i2 = dialogInterfaceOnClickListenerC14006.f42367;
                int i3 = dialogInterfaceOnClickListenerC14006.f42366;
                if (i2 != i3) {
                    c6951M51408.m18791(C9068.m23415(dialogInterfaceOnClickListenerC14006.f42365[i3].m47909()));
                    c90810.m23463();
                }
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23452(final C9089 c9089) {
        C5561 c5561 = c9089.f27550;
        final C6951 c6951M51408 = C23178.m51408(c9089.f27556);
        int i = c9089.f27553;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C16828 c16828M18788 = c6951M51408.m18788();
            int i2 = c6951M51408.m18787() ? R.string.MT_Protector : R.string.MT_Protector;
            String strM39592 = c16828M18788 == null ? "null" : c16828M18788.m39592();
            C19258 c19258BuildDialog = c5561.f17216.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44424(C4925.m14306(i2, strM39592));
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C9089 c90810 = this.f56789;
                    c90810.getClass();
                    c6951M51408.m18781();
                    c90810.m23463();
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        int i3 = c6951M51408.m18787() ? R.string.MT_Protector : R.string.MT_Protector;
        C19258 c19258BuildDialog2 = c5561.f17216.buildDialog();
        c19258BuildDialog2.m44433(R.string.MT_Protector);
        c19258BuildDialog2.m44424(C4925.m14306(i3, Integer.valueOf(c9089.f27553)));
        c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C9089 c90810 = this.f53662;
                c90810.getClass();
                c6951M51408.m18781();
                c90810.m23463();
            }
        });
        c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog2.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23463() {
        if (this.f27548) {
            this.f27548 = false;
            this.f27551 = SystemClock.uptimeMillis();
            notifyDataSetChanged();
            C5561 c5561 = this.f27550;
            c5561.f17218.m18195(true);
            C0621 c0621M15799 = C5561.m15799(c5561);
            C0621 c0621 = new C0621(c5561.f17233, c5561.f17231, c5561.f17235);
            c0621M15799.setAlpha(0.0f);
            c0621M15799.m2553(0);
            c0621.f2380 = true;
            ObjectAnimator.ofFloat(c0621M15799, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c0621, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            c5561.f17234.setVisibility(C5561.m15777(c5561));
            c5561.f17231.setOnClickListener(null);
            c5561.f17224.setOnClickListener(null);
            c5561.f17219.setOnClickListener(null);
            c5561.f17229.setOnClickListener(null);
        }
    }
}
