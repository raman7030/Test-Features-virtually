package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.io.IOException;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2907 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public C18154 f5022;

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        ((C7367) c4697.m9970()).m17076();
        return true;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        c4697.m9955(C0168b.f616k);
        C18154 c18154 = new C18154(c4697.m9965());
        this.f5022 = c18154;
        c18154.f54205.setText(R.string.MT_Protector);
        this.f5022.f54198.setText(AbstractC3947.m7831(c4697));
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46715(this.f5022.f54206);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺܿ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f52738.mo4692(c4697);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        final LinkedList linkedList = new LinkedList();
        for (InterfaceC19370 interfaceC19370 : c4697.m9957()) {
            if (interfaceC19370.isDirectory()) {
                this.f5022.f54203++;
                if (!interfaceC19370.mo39144()) {
                    linkedList.add(interfaceC19370.getPath());
                }
            } else {
                this.f5022.f54204++;
                if (!interfaceC19370.mo39144()) {
                    C18154 c18155 = this.f5022;
                    c18155.f54200 = interfaceC19370.getSize() + c18155.f54200;
                }
            }
        }
        C18154 c18156 = this.f5022;
        c18156.getClass();
        C7050.m16212(new RunnableC6038(3, c18156));
        if (linkedList.isEmpty()) {
            this.f5022.f54208.setVisibility(8);
        } else {
            C4081.f8987.execute(new Runnable() { // from class: l.ۖܿ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C2907.m4691(this.f11201, c4697, linkedList, dialogInterfaceC2564M46732);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4691(C2907 c2907, C4697 c4697, LinkedList linkedList, DialogInterfaceC2564 dialogInterfaceC2564) {
        AbstractC5375 abstractC5375 = (AbstractC5375) c4697.m9970().mo8217();
        while (!linkedList.isEmpty() && dialogInterfaceC2564.m3855()) {
            try {
                for (InterfaceC19370 interfaceC19370 : abstractC5375.mo9708((String) linkedList.removeFirst(), true)) {
                    if (interfaceC19370.isDirectory()) {
                        c2907.f5022.f54203++;
                        if (!interfaceC19370.mo39144()) {
                            linkedList.addLast(interfaceC19370.getPath());
                        }
                    } else {
                        c2907.f5022.f54204++;
                        if (!interfaceC19370.mo39144()) {
                            C18154 c18154 = c2907.f5022;
                            c18154.f54200 = interfaceC19370.getSize() + c18154.f54200;
                        }
                    }
                }
                C18154 c18155 = c2907.f5022;
                c18155.getClass();
                C7050.m16212(new RunnableC6038(3, c18155));
            } catch (IOException e) {
                c4697.m9965().m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C21014.class);
        c3313.m5781(c4697.m9957());
        c3313.m5789(c4697);
        c3313.m5784(c4697.m9970());
        c3313.m5777("deleteFrom", c4697.m9958());
        C18154 c18154 = this.f5022;
        c3313.m5773(c18154.f54204 + c18154.f54203, "minTotal");
        c3313.m5772();
    }
}
