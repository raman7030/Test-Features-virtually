package l;

import android.content.DialogInterface;
import android.widget.Button;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.۫᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes4.dex */
public final class C12720 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8487 f38272;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f38273;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16609 f38274;

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        final DialogInterfaceC0206 dialogInterfaceC0206M44438;
        c2450.m7907("local");
        ArrayList arrayList = this.f38273;
        int i = 3;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C4027 c4027 = (C4027) arrayList.get(0);
                C19258 c19258BuildDialog = c2450.m7917().buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44424(C4925.m14306(R.string.MT_Protector, c4027.f12781));
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10944(2, c4027));
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            } else {
                C19258 c19258BuildDialog2 = c2450.m7917().buildDialog();
                c19258BuildDialog2.m44433(R.string.MT_Protector);
                c19258BuildDialog2.m44424(C4925.m14306(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
                c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22555(i, this));
                c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC0206M44438 = c19258BuildDialog2.m44438();
            }
        } else {
            final C16609 c16609 = new C16609(c2450.m7917());
            this.f38274 = c16609;
            AbstractC15440 abstractC15440M39866 = C16999.m39866(c2450.m7923() ? c2450.m7922().mo39508() : c2450.m7926(), new String[0]);
            c16609.f51028.setText(R.string.MT_Protector);
            int iM7918 = c2450.m7918();
            if (iM7918 <= 500 && C21939.m49417() && abstractC15440M39866.mo29016()) {
                this.f38272 = new C8487(c16609);
                c16609.m39119(AbstractC1661.m5601(c2450), iM7918 == 1 ? C4925.m14306(R.string.MT_Protector, c2450.m7913().mo36985()) : C4925.m14306(R.string.MT_Protector, Integer.valueOf(iM7918)));
            } else {
                c16609.f51021.setText(AbstractC1661.m5601(c2450));
            }
            C19258 c19258BuildDialog3 = c2450.m7917().buildDialog();
            c19258BuildDialog3.m44421(c16609.f51029);
            c19258BuildDialog3.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩺ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f47900.mo2321(c2450);
                }
            });
            c19258BuildDialog3.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            dialogInterfaceC0206M44438 = c19258BuildDialog3.m44438();
            final LinkedList linkedList = new LinkedList();
            for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
                if (interfaceC17889.isDirectory()) {
                    c16609.f51026++;
                    if (!interfaceC17889.mo36978()) {
                        linkedList.add(interfaceC17889.mo24433());
                    }
                } else {
                    c16609.f51027++;
                    if (!interfaceC17889.mo36978()) {
                        c16609.f51023 = interfaceC17889.getSize() + c16609.f51023;
                    }
                }
            }
            C4925.m14315(new RunnableC3861(3, c16609));
            if (linkedList.isEmpty()) {
                c16609.f51031.setVisibility(8);
            } else {
                C1802.f6208.execute(new Runnable() { // from class: l.᩸᩺ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16609 c166010;
                        String strM39859;
                        C2450 c2451 = c2450;
                        boolean z = C16999.m39866(c2451.m7926(), new String[0]).mo36530() && ((strM39859 = C16999.m39859(c2451.m7926())) == null || !C16999.m39872(strM39859, "Android/data"));
                        int i2 = 0;
                        while (true) {
                            LinkedList linkedList2 = linkedList;
                            if (linkedList2.isEmpty() || !dialogInterfaceC0206M44438.m1442()) {
                                return;
                            }
                            Iterator it = ((AbstractC15440) linkedList2.removeFirst()).mo23549(true).iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                c166010 = c16609;
                                if (zHasNext) {
                                    AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
                                    if (abstractC15440.mo23113()) {
                                        c166010.f51026++;
                                        if (!abstractC15440.m36533()) {
                                            linkedList2.addLast(abstractC15440);
                                        }
                                    } else {
                                        c166010.f51027++;
                                        if (!abstractC15440.m36533()) {
                                            c166010.f51023 = abstractC15440.mo23127() + c166010.f51023;
                                        }
                                    }
                                    if (z && (i2 = i2 + 1) > 1000) {
                                        c166010.m39118();
                                        z = false;
                                    }
                                }
                            }
                            C4925.m14315(new RunnableC3861(3, c166010));
                        }
                    }
                });
            }
        }
        Button buttonM1447 = dialogInterfaceC0206M44438.m1447();
        buttonM1447.setClickable(false);
        C4925.m14309(300L, new RunnableC20760(5, buttonM1447));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31001(C12720 c12720) {
        C18844.m43538((Set) C5378.stream(c12720.f38273).map(new C4563(2)).collect(C22976.toSet()));
        C15528.m36596();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        ArrayList arrayList = this.f38273;
        arrayList.clear();
        int i = 0;
        for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
            if (interfaceC17889 instanceof C9555) {
                C9555 c9555 = (C9555) interfaceC17889;
                if (c9555.m24435()) {
                    arrayList.add(c9555.m24434());
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return !false;
        }
        return i == 0;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C13425.class);
        c0994.m3478(c2450.m7909());
        c0994.m3486(c2450);
        c0994.m3474("deleteFrom", c2450.m7910());
        C8487 c8487 = this.f38272;
        c0994.m3475("recycle", c8487 != null && c8487.f25944.m39120());
        c0994.m3475("speedMode", this.f38274.m39121());
        C16609 c16609 = this.f38274;
        c0994.m3470(c16609.f51027 + c16609.f51026, "minTotal");
        c0994.m3469();
    }
}
