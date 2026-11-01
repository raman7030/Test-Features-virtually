package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: BAH0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3007 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f5358;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC5375 f5359;

    /* JADX INFO: renamed from: ۧ */
    public boolean f5360;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC18707 f5361 = null;

    /* JADX INFO: renamed from: ܽ */
    public boolean f5362;

    /* JADX INFO: renamed from: ܿ */
    public TextView[] f5363;

    /* JADX INFO: renamed from: ᩳ */
    public final C16055 f5364;

    /* JADX INFO: renamed from: ᩷ */
    public C18107 f5365;

    /* JADX INFO: renamed from: ᩻ */
    public final List f5366;

    /* JADX INFO: renamed from: ֫ */
    public static void m5062(C3007 c3007, MenuItem menuItem) {
        List list = c3007.f5366;
        C18107 c18107 = c3007.f5365;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            new C9990(c18107, list).m23306(new RunnableC22455(c3007));
        } else if (itemId == R.string.MT_Protector) {
            new C13067(c18107, list).m29919(new RunnableC22455(c3007));
        } else {
            if (itemId != R.string.MT_Protector) {
                throw new RuntimeException();
            }
            new C5296(c18107, list).m11455(new RunnableC22455(c3007));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5063(C3007 c3007, String str, String str2, TextView textView, TextView textView2, Button button) {
        c3007.getClass();
        ViewOnClickListenerC16447.m37364(textView, str);
        ViewOnClickListenerC16447.m37364(textView2, str2);
        if (c3007.f5358) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5065(C3007 c3007, C18028 c18028, TextView textView, Button button) {
        c3007.getClass();
        textView.setText(c18028.m41067());
        if (c3007.f5360) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m5068(C3007 c3007, String str, String str2, TextView textView, TextView textView2, Button button) {
        c3007.getClass();
        ViewOnClickListenerC16447.m37364(textView, str);
        ViewOnClickListenerC16447.m37364(textView2, str2);
        if (c3007.f5358) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m5069(C3007 c3007, C18028 c18028, TextView textView, Button button) {
        c3007.getClass();
        textView.setText(c18028.m41067());
        if (c3007.f5360) {
            return;
        }
        button.setVisibility(4);
    }

    public C3007(C18107 c18107, List list) {
        this.f5365 = c18107;
        this.f5366 = list;
        AbstractC5375 abstractC5375 = (AbstractC5375) c18107.m41270().mo8217();
        this.f5359 = abstractC5375;
        this.f5360 = abstractC5375.mo11752();
        this.f5358 = abstractC5375.mo11750();
        this.f5362 = abstractC5375.mo11731();
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        c16055.m36547();
        this.f5364 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5072() {
        this.f5364.m36552();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5076(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.isDirectory() || !(interfaceC19370 instanceof AbstractC18707)) {
            throw new IllegalArgumentException();
        }
        AbstractC18707 abstractC18707 = (AbstractC18707) interfaceC19370;
        this.f5361 = abstractC18707;
        C16055 c16055 = this.f5364;
        c16055.m36541(abstractC18707);
        c16055.m36535(abstractC18707.mo39144() ? R.string.MT_Protector : R.string.MT_Protector);
        c16055.m36549(abstractC18707.getSize());
        if (abstractC18707.getTime() != -1) {
            c16055.m36545(abstractC18707.getTime());
        }
        if (abstractC18707.mo39144()) {
            this.f5360 = false;
            this.f5358 = false;
            this.f5362 = false;
        }
        final C18028 c18028Mo26440 = abstractC18707.mo26440();
        if (c18028Mo26440 != null) {
            c16055.m36533(new InterfaceC18738() { // from class: l.ۡ᩷᩻
                @Override // p067l.InterfaceC18738
                /* JADX INFO: renamed from: ֫ */
                public final void mo9170(TextView textView, Button button) {
                    C3007.m5069(this.f30609, c18028Mo26440, textView, button);
                }
            }).m44187(8);
            final String strM41063 = c18028Mo26440.m41063();
            final String strM41059 = c18028Mo26440.m41059();
            if (!TextUtils.isEmpty(strM41063) || !TextUtils.isEmpty(strM41059)) {
                c16055.m36532(new InterfaceC18067() { // from class: l.ܺ᩷᩻
                    @Override // p067l.InterfaceC18067
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo14537(TextView textView, TextView textView2, Button button) {
                        C3007.m5063(this.f53033, strM41063, strM41059, textView, textView2, button);
                    }
                }).m29220();
            }
        } else {
            this.f5360 = false;
            this.f5358 = false;
        }
        if (abstractC18707.mo39144()) {
            c16055.m36531(abstractC18707.mo39143(), (View.OnClickListener) null).m21096(6);
        }
        c16055.m36551();
        c16055.m36542();
        C8126.m18836(c16055.m36543(), this.f5365, this.f5361);
        m5077(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5078(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135() || !(interfaceC19370 instanceof AbstractC18707)) {
            throw new IllegalArgumentException();
        }
        AbstractC18707 abstractC18707 = (AbstractC18707) interfaceC19370;
        this.f5361 = abstractC18707;
        C16055 c16055 = this.f5364;
        c16055.m36541(abstractC18707);
        c16055.m36535(abstractC18707.mo39144() ? R.string.MT_Protector : R.string.MT_Protector);
        c16055.m36549(0L);
        if (abstractC18707.getTime() != -1) {
            c16055.m36545(abstractC18707.getTime());
        }
        if (abstractC18707.mo39144()) {
            this.f5360 = false;
            this.f5358 = false;
            this.f5362 = false;
        }
        final C18028 c18028Mo26440 = abstractC18707.mo26440();
        if (c18028Mo26440 != null) {
            c16055.m36533(new InterfaceC18738() { // from class: l.ۖ᩷᩻
                @Override // p067l.InterfaceC18738
                /* JADX INFO: renamed from: ֫ */
                public final void mo9170(TextView textView, Button button) {
                    C3007.m5065(this.f11483, c18028Mo26440, textView, button);
                }
            }).m44187(8);
            final String strM41063 = c18028Mo26440.m41063();
            final String strM41059 = c18028Mo26440.m41059();
            if (!TextUtils.isEmpty(strM41063) || !TextUtils.isEmpty(strM41059)) {
                c16055.m36532(new InterfaceC18067() { // from class: l.ۘ᩷᩻
                    @Override // p067l.InterfaceC18067
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo14537(TextView textView, TextView textView2, Button button) {
                        C3007.m5068(this.f16477, strM41063, strM41059, textView, textView2, button);
                    }
                }).m29220();
            }
        } else {
            this.f5360 = false;
            this.f5358 = false;
        }
        c16055.m36529(R.string.MT_Protector, new C20458(4)).m21096(8);
        c16055.m36529(R.string.MT_Protector, new C1514());
        if (abstractC18707.mo39144()) {
            c16055.m36531(abstractC18707.mo39143(), (View.OnClickListener) null).m21096(6);
        }
        c16055.m36553();
        c16055.m36542();
        m5077(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5075(String str) {
        List list = this.f5366;
        C16055 c16055 = this.f5364;
        c16055.m36539(list);
        c16055.m36537(str, (View.OnLongClickListener) null);
        c16055.m36549(0L);
        c16055.m36529(R.string.MT_Protector, new C20013(7)).m21096(8);
        c16055.m36529(R.string.MT_Protector, new C20778());
        c16055.m36553();
        c16055.m36542();
        m5077(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5077(final boolean z) {
        boolean z2 = this.f5362;
        C16055 c16055 = this.f5364;
        if (z2) {
            c16055.m36540(new InterfaceC1489() { // from class: l.ᩴ᩷᩻
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    C9154 c9154 = (C9154) obj;
                    ViewOnClickListenerC16447.m37365(c9154.m21097());
                    TextView textViewM21097 = c9154.m21097();
                    final C3007 c3007 = this.f63143;
                    textViewM21097.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩷᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3007.m5061(c3007);
                        }
                    });
                }
            });
        }
        if (this.f5360) {
            c16055.m36550(new InterfaceC1489() { // from class: l.᩵᩷᩻
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    C19409 c19409 = (C19409) obj;
                    C21272.m48052(c19409.m44189());
                    final C3007 c3007 = this.f66375;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܳ᩷᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3007.m5071(c3007);
                        }
                    };
                    c19409.m44189().setOnClickListener(onClickListener);
                    c19409.m44188().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f5358) {
            c16055.m36546(new InterfaceC1489() { // from class: l.ܽ᩷᩻
                @Override // p067l.InterfaceC1489
                public final void accept(Object obj) {
                    C12704 c12704 = (C12704) obj;
                    C21272.m48052(c12704.m29217());
                    C21272.m48052(c12704.m29219());
                    final C3007 c3007 = this.f55064;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۜ᩷᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3007.m5070(c3007);
                        }
                    };
                    c12704.m29217().setOnClickListener(onClickListener);
                    c12704.m29219().setOnClickListener(onClickListener);
                    c12704.m29218().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f5362 || (z && (this.f5360 || this.f5358))) {
            c16055.m36548().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ᩷᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3007.m5066(this.f60146, z, view);
                }
            });
        } else {
            c16055.m36548().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5066(final C3007 c3007, boolean z, View view) {
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        C0994 c0994M50638 = c1898.m50638();
        if (c3007.f5362) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c3007.f5360) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c3007.f5358) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50636(new InterfaceC1583() { // from class: l.᩻᩷᩻
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C3007.m5062(this.f80424, menuItem);
                return true;
            }
        });
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5061(C3007 c3007) {
        new C9990(c3007.f5365, c3007.f5366).m23306(new RunnableC22455(c3007));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m5071(C3007 c3007) {
        new C13067(c3007.f5365, c3007.f5366).m29919(new RunnableC22455(c3007));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m5070(C3007 c3007) {
        new C5296(c3007.f5365, c3007.f5366).m11455(new RunnableC22455(c3007));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m5067(final C3007 c3007) {
        C18028 c18028Mo26440;
        C18028 c18028Mo26441;
        C16055 c16055 = c3007.f5364;
        if (c3007.f5361 != null) {
            if (c3007.f5362) {
                c16055.m36540(new InterfaceC1489() { // from class: l.ۢ᩷᩻
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        ((C9154) obj).m21097().setText(C18794.m42827(this.f32697.f5361.getTime()));
                    }
                });
            }
            if (c3007.f5360 && (c18028Mo26441 = c3007.f5361.mo26440()) != null) {
                c16055.m36550(new C8434(1, c18028Mo26441));
            }
            if (c3007.f5358 && (c18028Mo26440 = c3007.f5361.mo26440()) != null) {
                c16055.m36546(new C13799(1, c18028Mo26440));
            }
        }
        C14084.m31971(1000);
        C17127.m38755(c3007.f5359.mo11732());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5074(DialogInterface.OnDismissListener onDismissListener) {
        this.f5364.m36536(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5073(int i, int i2, long j) {
        if (this.f5363 == null) {
            C16055 c16055 = this.f5364;
            this.f5363 = new TextView[]{c16055.m36544(R.string.MT_Protector).m21097(), c16055.m36544(R.string.MT_Protector).m21097(), c16055.m36544(R.string.MT_Protector).m21097()};
        }
        C17513.m39889(this.f5363[0], j);
        this.f5363[1].setText(String.valueOf(i));
        this.f5363[2].setText(String.valueOf(i2));
    }
}
