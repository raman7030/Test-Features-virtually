package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB6H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9409 {

    /* JADX INFO: renamed from: ֫ */
    public final C16055 f25698;

    /* JADX INFO: renamed from: ۧ */
    public final C18107 f25699;

    public C9409(C18107 c18107) {
        this.f25699 = c18107;
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        this.f25698 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21908(C12092 c12092) {
        C16055 c16055 = this.f25698;
        c16055.m36541(c12092);
        c16055.m36535(R.string.MT_Protector);
        if (c12092.getSize() == -1) {
            c16055.m36530(Math.max(c12092.m27881().m13992(), 0L)).m21096(8);
        } else {
            c16055.m36549(c12092.getSize()).m21096(8);
            c16055.m36530(Math.max(c12092.m27881().m13992(), 0L));
        }
        if (c12092.getTime() != -1) {
            c16055.m36545(c12092.getTime()).m21096(8);
        }
        Integer numM13997 = c12092.m27881().m13997();
        if (numM13997 != null) {
            c16055.m36528(R.string.MT_Protector, String.format("%08X", Long.valueOf(((long) numM13997.intValue()) & 4294967295L)));
        }
        c16055.m36551();
        c16055.m36542();
        C8126.m18836(c16055.m36543(), this.f25699, c12092);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21909(final C12092 c12092) {
        C16055 c16055 = this.f25698;
        c16055.m36541(c12092);
        c16055.m36535(R.string.MT_Protector);
        if (c12092.getSize() == -1) {
            c16055.m36530(Math.max(c12092.m27881().m13992(), 0L)).m21096(8);
        } else {
            c16055.m36549(c12092.getSize()).m21096(8);
            c16055.m36530(Math.max(c12092.m27881().m13992(), 0L));
        }
        if (c12092.getTime() != -1) {
            c16055.m36545(c12092.getTime()).m21096(8);
        }
        c16055.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.ۨۤܳ
            @Override // p067l.InterfaceC3986
            /* JADX INFO: renamed from: ֫ */
            public final void mo7947(TextView textView) {
                C9409 c9409 = this.f37727;
                c9409.f25698.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.ܰۤܳ
                    @Override // p067l.InterfaceC3986
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo7947(TextView textView2) {
                        C13087.m29944(textView, textView2, c9409.f25699.m41270().mo8217(), Collections.singletonList(c12092));
                    }
                });
            }
        }).m21096(8);
        c16055.m36542();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21907(final List list) {
        C7280 c7280 = (C7280) this.f25699.m41270();
        C16055 c16055 = this.f25698;
        c16055.m36539(list);
        c16055.m36537(c7280.m41982(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long j = -1;
        long j2 = 0;
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            long size = interfaceC19370.getSize();
            if (size != -1) {
                if (j == -1) {
                    j = 0;
                }
                j += size;
            }
            long jM13992 = ((C12092) interfaceC19370).m27881().m13992();
            if (jM13992 != -1) {
                j2 += jM13992;
            }
        }
        if (j == -1) {
            c16055.m36530(j2).m21096(8);
        } else {
            c16055.m36549(j).m21096(8);
            c16055.m36530(j2);
        }
        c16055.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.ۛۤܳ
            @Override // p067l.InterfaceC3986
            /* JADX INFO: renamed from: ֫ */
            public final void mo7947(TextView textView) {
                C9409 c9409 = this.f21286;
                c9409.f25698.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.᩺ۤܳ
                    @Override // p067l.InterfaceC3986
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo7947(TextView textView2) {
                        C13087.m29944(textView, textView2, c9409.f25699.m41270().mo8217(), list);
                    }
                }).m21096(8);
            }
        });
        c16055.m36542();
    }
}
