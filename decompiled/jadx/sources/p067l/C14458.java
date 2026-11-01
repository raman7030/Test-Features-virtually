package p067l;

import android.content.DialogInterface;
import android.widget.Button;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.۫᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes4.dex */
public final class C14458 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public C10435 f41301;

    /* JADX INFO: renamed from: ۫ */
    public ArrayList f41302;

    /* JADX INFO: renamed from: ۬ */
    public C18154 f41303;

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        final DialogInterfaceC2564 dialogInterfaceC2564M46732;
        c4697.m9955("local");
        ArrayList arrayList = this.f41302;
        int i = 3;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C6196 c6196 = (C6196) arrayList.get(0);
                C20671 c20671BuildDialog = c4697.m9965().buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, c6196.f15596));
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12770(2, c6196));
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            } else {
                C20671 c20671BuildDialog2 = c4697.m9965().buildDialog();
                c20671BuildDialog2.m46727(R.string.MT_Protector);
                c20671BuildDialog2.m46718(C7050.m16203(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
                c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23805(i, this));
                c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC2564M46732 = c20671BuildDialog2.m46732();
            }
        } else {
            final C18154 c18154 = new C18154(c4697.m9965());
            this.f41303 = c18154;
            AbstractC17043 abstractC17043M42109 = C18524.m42109(c4697.m9971() ? c4697.m9970().mo41744() : c4697.m9974(), new String[0]);
            c18154.f54205.setText(R.string.MT_Protector);
            int iM9966 = c4697.m9966();
            if (iM9966 <= 500 && C23219.m51754() && abstractC17043M42109.mo31068()) {
                this.f41301 = new C10435(c18154);
                c18154.m41346(AbstractC3947.m7831(c4697), iM9966 == 1 ? C7050.m16203(R.string.MT_Protector, c4697.m9961().mo39151()) : C7050.m16203(R.string.MT_Protector, Integer.valueOf(iM9966)));
            } else {
                c18154.f54198.setText(AbstractC3947.m7831(c4697));
            }
            C20671 c20671BuildDialog3 = c4697.m9965().buildDialog();
            c20671BuildDialog3.m46715(c18154.f54206);
            c20671BuildDialog3.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩺ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f51032.mo4692(c4697);
                }
            });
            c20671BuildDialog3.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            dialogInterfaceC2564M46732 = c20671BuildDialog3.m46732();
            final LinkedList linkedList = new LinkedList();
            for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
                if (interfaceC19370.isDirectory()) {
                    c18154.f54203++;
                    if (!interfaceC19370.mo39144()) {
                        linkedList.add(interfaceC19370.mo26445());
                    }
                } else {
                    c18154.f54204++;
                    if (!interfaceC19370.mo39144()) {
                        c18154.f54200 = interfaceC19370.getSize() + c18154.f54200;
                    }
                }
            }
            C7050.m16212(new RunnableC6038(3, c18154));
            if (linkedList.isEmpty()) {
                c18154.f54208.setVisibility(8);
            } else {
                C4081.f8987.execute(new Runnable() { // from class: l.᩸᩺ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18154 c18155;
                        String strM42102;
                        C4697 c4698 = c4697;
                        boolean z = C18524.m42109(c4698.m9974(), new String[0]).mo38688() && ((strM42102 = C18524.m42102(c4698.m9974())) == null || !C18524.m42115(strM42102, "Android/data"));
                        int i2 = 0;
                        while (true) {
                            LinkedList linkedList2 = linkedList;
                            if (linkedList2.isEmpty() || !dialogInterfaceC2564M46732.m3855()) {
                                return;
                            }
                            Iterator it = ((AbstractC17043) linkedList2.removeFirst()).mo25500(true).iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                c18155 = c18154;
                                if (zHasNext) {
                                    AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
                                    if (abstractC17043.mo25087()) {
                                        c18155.f54203++;
                                        if (!abstractC17043.m38691()) {
                                            linkedList2.addLast(abstractC17043);
                                        }
                                    } else {
                                        c18155.f54204++;
                                        if (!abstractC17043.m38691()) {
                                            c18155.f54200 = abstractC17043.mo25101() + c18155.f54200;
                                        }
                                    }
                                    if (z && (i2 = i2 + 1) > 1000) {
                                        c18155.m41345();
                                        z = false;
                                    }
                                }
                            }
                            C7050.m16212(new RunnableC6038(3, c18155));
                        }
                    }
                });
            }
        }
        Button buttonM3860 = dialogInterfaceC2564M46732.m3860();
        buttonM3860.setClickable(false);
        C7050.m16206(300L, new RunnableC22099(5, buttonM3860));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m33081(C14458 c14458) {
        C20278.m45804((Set) C7480.stream(c14458.f41302).map(new C6705(2)).collect(C24205.toSet()));
        C17127.m38756();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        ArrayList arrayList = this.f41302;
        arrayList.clear();
        int i = 0;
        for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
            if (interfaceC19370 instanceof C11450) {
                C11450 c11450 = (C11450) interfaceC19370;
                if (c11450.m26447()) {
                    arrayList.add(c11450.m26446());
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return !false;
        }
        return i == 0;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C15128.class);
        c3313.m5781(c4697.m9957());
        c3313.m5789(c4697);
        c3313.m5777("deleteFrom", c4697.m9958());
        C10435 c10435 = this.f41301;
        c3313.m5778("recycle", c10435 != null && c10435.f28859.m41347());
        c3313.m5778("speedMode", this.f41303.m41348());
        C18154 c18154 = this.f41303;
        c3313.m5773(c18154.f54204 + c18154.f54203, "minTotal");
        c3313.m5772();
    }
}
