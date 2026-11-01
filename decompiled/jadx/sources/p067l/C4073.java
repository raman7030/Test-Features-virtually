package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 65FC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4073 {

    /* JADX INFO: renamed from: ܳ */
    public final List f8969;

    /* JADX INFO: renamed from: ܽ */
    public final C16055 f8970;

    /* JADX INFO: renamed from: ܿ */
    public C11450 f8971;

    /* JADX INFO: renamed from: ᩳ */
    public TextView[] f8972;

    /* JADX INFO: renamed from: ᩻ */
    public C18107 f8973;

    /* JADX INFO: renamed from: ۧ */
    public boolean f8968 = true;

    /* JADX INFO: renamed from: ֫ */
    public boolean f8967 = true;

    /* JADX INFO: renamed from: ֫ */
    public static void m8164(C4073 c4073, MenuItem menuItem) {
        List list = c4073.f8969;
        C18107 c18107 = c4073.f8973;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C24604(c18107, list).m54242(new RunnableC3319(1, c4073));
        } else if (menuItem.getItemId() == R.string.MT_Protector) {
            new C16557(c18107, list).m37530(new RunnableC3319(1, c4073));
        } else {
            new C10523(c18107, list).m24263(new RunnableC3319(1, c4073));
        }
    }

    public C4073(C18107 c18107, List list) {
        this.f8973 = c18107;
        this.f8969 = list;
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        c16055.m36547();
        this.f8970 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8172() {
        this.f8970.m36552();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8176(InterfaceC19370 interfaceC19370) {
        boolean z;
        String path;
        if (interfaceC19370.isDirectory() || !(interfaceC19370 instanceof C11450)) {
            throw new IllegalArgumentException();
        }
        C11450 c11450 = (C11450) interfaceC19370;
        this.f8971 = c11450;
        AbstractC17043 abstractC17043Mo26445 = c11450.mo26445();
        C16055 c16055 = this.f8970;
        c16055.m36541(c11450);
        c16055.m36535(c11450.mo39144() ? R.string.MT_Protector : R.string.MT_Protector);
        long size = c11450.getSize();
        final long jMo39145 = c11450.mo39145();
        if (jMo39145 != -1 && size != jMo39145) {
            c16055.m36529(R.string.MT_Protector, new C7813(1, size)).m21096(8);
            c16055.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.۬֫᩻
                @Override // p067l.InterfaceC3986
                /* JADX INFO: renamed from: ֫ */
                public final void mo7947(TextView textView) {
                    C17513.m39888(textView, jMo39145);
                }
            });
            c16055.m36545(c11450.getTime()).m21096(8);
        } else {
            c16055.m36549(size);
            c16055.m36545(c11450.getTime());
        }
        final ArrayList arrayList = new ArrayList(2);
        if (C11450.m26439(c11450.mo26440())) {
            if (abstractC17043Mo26445.mo37343()) {
                this.f8967 = false;
            } else {
                try {
                    if (abstractC17043Mo26445 instanceof C13672) {
                        path = ((C13672) abstractC17043Mo26445).m31070();
                    } else {
                        path = c11450.getPath();
                    }
                    c11450.m26441(new C18028(C21759.m49047(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f8967 = false;
                    z = false;
                }
                this.f8968 = abstractC17043Mo26445.mo29973();
            }
            z = false;
            this.f8968 = abstractC17043Mo26445.mo29973();
        } else {
            z = true;
        }
        if (z) {
            final C18028 c18028Mo26440 = c11450.mo26440();
            c16055.m36533(new InterfaceC18738() { // from class: l.ۨ֫᩻
                @Override // p067l.InterfaceC18738
                /* JADX INFO: renamed from: ֫ */
                public final void mo9170(TextView textView, Button button) {
                    textView.setText(c18028Mo26440.m41067());
                    arrayList.add(button);
                }
            }).m44187(6);
            c16055.m36532(new InterfaceC18067() { // from class: l.᩺֫᩻
                @Override // p067l.InterfaceC18067
                /* JADX INFO: renamed from: ֫ */
                public final void mo14537(TextView textView, TextView textView2, Button button) {
                    C18028 c18028 = c18028Mo26440;
                    textView.setText(c18028.m41063());
                    textView2.setText(c18028.m41059());
                    arrayList.add(button);
                }
            }).m29220();
        }
        if (c11450.mo39144()) {
            c16055.m36531(c11450.mo39143(), new ViewOnClickListenerC6045(2, this)).m21096(6);
            this.f8968 = false;
            this.f8967 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        if (c11450.m26442()) {
            c16055.m36551();
            c16055.m36542();
            C8126.m18836(c16055.m36543(), this.f8973, c11450);
        } else {
            c16055.m36542();
        }
        if (this.f8967 && abstractC17043Mo26445.mo38688()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m8167(true);
            return;
        }
        m8167(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8177(InterfaceC19370 interfaceC19370) {
        boolean z;
        String path;
        if (interfaceC19370.mo39135() || !(interfaceC19370 instanceof C11450)) {
            throw new IllegalArgumentException();
        }
        C11450 c11450 = (C11450) interfaceC19370;
        this.f8971 = c11450;
        AbstractC17043 abstractC17043Mo26445 = c11450.mo26445();
        C16055 c16055 = this.f8970;
        c16055.m36541(c11450);
        c16055.m36535(c11450.mo39144() ? R.string.MT_Protector : R.string.MT_Protector);
        c16055.m36549(0L);
        c16055.m36545(c11450.getTime());
        final ArrayList arrayList = new ArrayList(2);
        if (c11450.m26447()) {
            this.f8967 = false;
            this.f8968 = false;
            z = false;
        } else if (C11450.m26439(c11450.mo26440())) {
            if (abstractC17043Mo26445.mo37343()) {
                this.f8967 = false;
            } else {
                try {
                    if (abstractC17043Mo26445 instanceof C13672) {
                        path = ((C13672) abstractC17043Mo26445).m31070();
                    } else {
                        path = c11450.getPath();
                    }
                    c11450.m26441(new C18028(C21759.m49047(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f8967 = false;
                    z = false;
                }
                this.f8968 = abstractC17043Mo26445.mo29973();
            }
            z = false;
            this.f8968 = abstractC17043Mo26445.mo29973();
        } else {
            z = true;
        }
        if (z) {
            final C18028 c18028Mo26440 = c11450.mo26440();
            c16055.m36533(new InterfaceC18738() { // from class: l.ܰ֫᩻
                @Override // p067l.InterfaceC18738
                /* JADX INFO: renamed from: ֫ */
                public final void mo9170(TextView textView, Button button) {
                    textView.setText(c18028Mo26440.m41067());
                    arrayList.add(button);
                }
            }).m44187(6);
            c16055.m36532(new InterfaceC18067() { // from class: l.۟֫᩻
                @Override // p067l.InterfaceC18067
                /* JADX INFO: renamed from: ֫ */
                public final void mo14537(TextView textView, TextView textView2, Button button) {
                    C18028 c18028 = c18028Mo26440;
                    textView.setText(c18028.m41063());
                    textView2.setText(c18028.m41059());
                    arrayList.add(button);
                }
            }).m29220();
        }
        if (c11450.mo39144()) {
            c16055.m36531(c11450.mo39143(), new ViewOnClickListenerC6045(2, this)).m21096(6);
            this.f8968 = false;
            this.f8967 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        c16055.m36529(R.string.MT_Protector, new C12832(4)).m21096(8);
        c16055.m36529(R.string.MT_Protector, new C14403(3));
        c16055.m36553();
        c16055.m36542();
        if (this.f8967 && abstractC17043Mo26445.mo38688()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m8167(true);
            return;
        }
        m8167(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8175(String str) {
        List list = this.f8969;
        C16055 c16055 = this.f8970;
        c16055.m36539(list);
        c16055.m36537(str, (View.OnLongClickListener) null);
        c16055.m36549(0L);
        c16055.m36529(R.string.MT_Protector, new C5410(8)).m21096(8);
        c16055.m36529(R.string.MT_Protector, new C19768());
        c16055.m36553();
        c16055.m36542();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        if (abstractC17043M42109.mo25100() && !(abstractC17043M42109 instanceof C14912)) {
            this.f8967 = false;
            this.f8968 = false;
        }
        m8167(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8167(final boolean z) {
        boolean z2 = this.f8968;
        C16055 c16055 = this.f8970;
        if (z2) {
            c16055.m36540(new InterfaceC1489() { // from class: l.᩸֫᩻
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    C9154 c9154 = (C9154) obj;
                    ViewOnClickListenerC16447.m37365(c9154.m21097());
                    c9154.m21097().setOnClickListener(new ViewOnClickListenerC11051(2, this.f71323));
                }
            });
        }
        if (this.f8967) {
            c16055.m36550(new InterfaceC1489() { // from class: l.᩹֫᩻
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    C19409 c19409 = (C19409) obj;
                    C21272.m48052(c19409.m44189());
                    ViewOnClickListenerC5054 viewOnClickListenerC5054 = new ViewOnClickListenerC5054(1, this.f73107);
                    c19409.m44189().setOnClickListener(viewOnClickListenerC5054);
                    c19409.m44188().setOnClickListener(viewOnClickListenerC5054);
                }
            });
            c16055.m36546(new InterfaceC1489() { // from class: l.᩶֫᩻
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    C12704 c12704 = (C12704) obj;
                    final C4073 c4073 = this.f66796;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۗ֫᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C4073.m8169(c4073);
                        }
                    };
                    C21272.m48052(c12704.m29217());
                    C21272.m48052(c12704.m29219());
                    c12704.m29217().setOnClickListener(onClickListener);
                    c12704.m29219().setOnClickListener(onClickListener);
                    c12704.m29218().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f8968 || (z && this.f8967)) {
            c16055.m36548().setOnClickListener(new View.OnClickListener() { // from class: l.ۙ֫᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4073.m8166(this.f16802, z, view);
                }
            });
        } else {
            c16055.m36548().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8166(C4073 c4073, boolean z, View view) {
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        C0994 c0994M50638 = c1898.m50638();
        if (c4073.f8968) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c4073.f8967) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50636((InterfaceC1583) new C23132(c4073));
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8163(C4073 c4073) {
        new C24604(c4073.f8973, c4073.f8969).m54242(new RunnableC3319(1, c4073));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m8171(C4073 c4073) {
        new C16557(c4073.f8973, c4073.f8969).m37530(new RunnableC3319(1, c4073));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m8169(C4073 c4073) {
        new C10523(c4073.f8973, c4073.f8969).m24263(new RunnableC3319(1, c4073));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m8168(final C4073 c4073) {
        C16055 c16055 = c4073.f8970;
        if (c4073.f8971 != null) {
            if (c4073.f8968) {
                c16055.m36540(new InterfaceC1489() { // from class: l.۫֫᩻
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        ((C9154) obj).m21097().setText(C18794.m42827(this.f39193.f8971.getTime()));
                    }
                });
            }
            if (c4073.f8967) {
                final C18028 c18028Mo26440 = c4073.f8971.mo26440();
                c16055.m36550(new InterfaceC1489() { // from class: l.ۤ֫᩻
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        ((C19409) obj).m44189().setText(c18028Mo26440.m41067());
                    }
                });
                c16055.m36546(new InterfaceC1489() { // from class: l.ۛ֫᩻
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        C12704 c12704 = (C12704) obj;
                        TextView textViewM29217 = c12704.m29217();
                        C18028 c18028 = c18028Mo26440;
                        textViewM29217.setText(c18028.m41063());
                        c12704.m29219().setText(c18028.m41059());
                    }
                });
            }
        }
        C14084.m31971(1000);
        C17127.m38756();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8174(DialogInterface.OnDismissListener onDismissListener) {
        this.f8970.m36536(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8173(int i, int i2, long j) {
        if (this.f8972 == null) {
            C16055 c16055 = this.f8970;
            this.f8972 = new TextView[]{c16055.m36544(R.string.MT_Protector).m21097(), c16055.m36544(R.string.MT_Protector).m21097(), c16055.m36544(R.string.MT_Protector).m21097()};
        }
        C17513.m39889(this.f8972[0], j);
        this.f8972[1].setText(String.valueOf(i));
        this.f8972[2].setText(String.valueOf(i2));
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m8170(C4073 c4073) {
        C18107 c18107 = c4073.f8973;
        AbstractC17043 abstractC17043Mo26445 = c4073.f8971.mo26445();
        String strMo29996 = abstractC17043Mo26445.mo29996();
        if (strMo29996 != null) {
            if (!strMo29996.startsWith("/")) {
                AbstractC17043 abstractC17043M38672 = abstractC17043Mo26445.m38672();
                while (true) {
                    if (abstractC17043M38672 != null) {
                        if (strMo29996.isEmpty() || strMo29996.equals(".")) {
                            strMo29996 = abstractC17043M38672.mo25505();
                            break;
                        }
                        if (strMo29996.equals("..")) {
                            strMo29996 = abstractC17043M38672.getParent();
                            break;
                        } else if (strMo29996.startsWith("./")) {
                            strMo29996 = strMo29996.substring(2);
                        } else if (strMo29996.startsWith("../")) {
                            strMo29996 = strMo29996.substring(3);
                            abstractC17043M38672 = abstractC17043M38672.m38694();
                        } else {
                            strMo29996 = abstractC17043M38672.m38684(strMo29996).mo25505();
                            break;
                        }
                    } else {
                        strMo29996 = abstractC17043Mo26445.mo25505();
                        break;
                    }
                }
            }
        } else {
            strMo29996 = null;
        }
        AbstractC17043 abstractC17043M42109 = strMo29996 != null ? C18524.m42109(strMo29996, new String[0]) : null;
        if (abstractC17043M42109 == null) {
            return;
        }
        c4073.f8970.m36534();
        if (abstractC17043M42109.mo25087()) {
            c18107.m41259(abstractC17043M42109.mo25505(), true);
            return;
        }
        String parent = abstractC17043M42109.getParent();
        if (parent != null) {
            c18107.m41279(abstractC17043M42109.getName());
            c18107.m41259(parent, true);
        } else {
            c18107.m41259(abstractC17043M42109.mo25505(), true);
        }
    }
}
