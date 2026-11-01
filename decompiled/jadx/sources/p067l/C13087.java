package p067l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13087 {

    /* JADX INFO: renamed from: ֫ */
    public final C16055 f36785;

    /* JADX INFO: renamed from: ۧ */
    public final List f36786;

    /* JADX INFO: renamed from: ܽ */
    public C13577 f36787;

    /* JADX INFO: renamed from: ᩳ */
    public C18107 f36788;

    public C13087(C18107 c18107, List list) {
        this.f36788 = c18107;
        this.f36786 = list;
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        this.f36785 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29951(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.isDirectory() || !(interfaceC19370 instanceof C13577)) {
            throw new IllegalArgumentException();
        }
        C13577 c13577 = (C13577) interfaceC19370;
        this.f36787 = c13577;
        C16055 c16055 = this.f36785;
        c16055.m36541(c13577);
        c16055.m36535(c13577.mo39144() ? R.string.MT_Protector : R.string.MT_Protector);
        c16055.m36549(c13577.getSize());
        c16055.m36545(c13577.getTime());
        C18028 c18028Mo26440 = c13577.mo26440();
        if (c18028Mo26440 != null) {
            c16055.m36533(new C4407(c18028Mo26440)).m44187(6);
            String strM41063 = c18028Mo26440.m41063();
            String strM41059 = c18028Mo26440.m41059();
            if (!TextUtils.isEmpty(strM41063) || !TextUtils.isEmpty(strM41059)) {
                c16055.m36532(new C7149(strM41063, strM41059)).m29220();
            }
        }
        if (c13577.mo39144()) {
            c16055.m36531(c13577.mo39143(), (View.OnClickListener) null).m21096(6);
        }
        c16055.m36551();
        c16055.m36542();
        C8126.m18836(c16055.m36543(), this.f36788, c13577);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29952(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135() || !(interfaceC19370 instanceof C13577)) {
            throw new IllegalArgumentException();
        }
        C13577 c13577 = (C13577) interfaceC19370;
        this.f36787 = c13577;
        C16055 c16055 = this.f36785;
        c16055.m36541(c13577);
        c16055.m36535(c13577.mo39144() ? R.string.MT_Protector : R.string.MT_Protector);
        c16055.m36549(c13577.getSize());
        c16055.m36545(c13577.getTime());
        C18028 c18028Mo26440 = c13577.mo26440();
        if (c18028Mo26440 != null) {
            c16055.m36533(new C24793(c18028Mo26440)).m44187(6);
            String strM41063 = c18028Mo26440.m41063();
            String strM41059 = c18028Mo26440.m41059();
            if (!TextUtils.isEmpty(strM41063) || !TextUtils.isEmpty(strM41059)) {
                c16055.m36532(new C13178(strM41063, strM41059)).m29220();
            }
        }
        if (c13577.mo39144()) {
            c16055.m36531(c13577.mo39143(), (View.OnClickListener) null).m21096(6);
        }
        c16055.m36529(R.string.MT_Protector, new C10145(this)).m21096(8);
        c16055.m36542();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29950(String str) {
        C16055 c16055 = this.f36785;
        List list = this.f36786;
        c16055.m36539(list);
        c16055.m36537(str, new View.OnLongClickListener() { // from class: l.᩺ܶ᩻
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C13087.m29945(this.f76974);
                return true;
            }
        });
        Iterator it = list.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC19370) it.next()).getSize();
        }
        c16055.m36549(size);
        c16055.m36529(R.string.MT_Protector, new C4444(5, this)).m21096(8);
        c16055.m36542();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29944(final TextView textView, final TextView textView2, final AbstractC15599 abstractC15599, final List list) {
        textView.setText("...");
        textView2.setText("...");
        C4081.f8987.submit(new Runnable() { // from class: l.֫᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC15599 abstractC155910 = abstractC15599;
                C10748 c10748M24756 = C10748.m24756(300);
                LinkedList linkedList = new LinkedList(list);
                final int i = 0;
                final int i2 = 0;
                int i3 = 0;
                while (true) {
                    boolean zIsEmpty = linkedList.isEmpty();
                    final TextView textView3 = textView;
                    final TextView textView4 = textView2;
                    if (zIsEmpty) {
                        C7050.m16212(new Runnable() { // from class: l.۟ܶ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView3.setText(String.valueOf(i));
                                textView4.setText(String.valueOf(i2));
                            }
                        });
                        return;
                    }
                    i3++;
                    if ((i3 & 255) == 0 && c10748M24756.m24761()) {
                        C7050.m16212(new Runnable() { // from class: l.ܰܶ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView3.setText(String.valueOf(i));
                                textView4.setText(String.valueOf(i2));
                            }
                        });
                    }
                    InterfaceC19370 interfaceC19370 = (InterfaceC19370) linkedList.removeFirst();
                    if (interfaceC19370.mo39135()) {
                        i++;
                    } else {
                        i2++;
                        try {
                            linkedList.addAll(abstractC155910.mo9708(interfaceC19370.getPath(), true));
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29945(C13087 c13087) {
        C13577 c13577 = c13087.f36787;
        if (c13577 != null) {
            C7050.m16205(R.string.MT_Protector, c13577.getPath());
        }
    }
}
