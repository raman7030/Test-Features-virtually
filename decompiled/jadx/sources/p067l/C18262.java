package p067l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18262 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public final TextView f54537;

    /* JADX INFO: renamed from: ۤ */
    public C4181 f54538;

    /* JADX INFO: renamed from: ۨ */
    public AbstractC18933 f54539;

    public C18262(AbstractActivityC5549 abstractActivityC5549, View view) {
        super(abstractActivityC5549, view);
        this.f54537 = (TextView) view.findViewById(R.id.MT_Protector);
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final void mo34117(Resources.Theme theme) {
        super.mo34117(theme);
        this.f54537.setTextColor(C23223.f72980);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41597(AbstractC18933 abstractC18933, C4181 c4181) {
        this.f54539 = abstractC18933;
        this.f54538 = c4181;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31385() {
        C4181 c4181 = this.f54538;
        return (c4181 == null || c4181.m8462()) ? false : true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31386(AbstractC5462 abstractC5462) {
        C4181 c4181;
        AbstractC18933 abstractC18933M12180;
        C4181 c4182;
        if (this.f54539 == null || (c4181 = this.f54538) == null || c4181.m8462()) {
            return false;
        }
        C5522 c5522 = this.f54539.f40549;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        AbstractC18933 abstractC18933 = this.f54539;
        Integer numValueOf = null;
        if (abstractC5462 instanceof C18262) {
            C18262 c18262 = (C18262) abstractC5462;
            int bindingAdapterPosition2 = c18262.getBindingAdapterPosition();
            if (bindingAdapterPosition2 == -1 || (abstractC18933M12180 = c18262.f54539) == null || (c4182 = c18262.f54538) == null) {
                return false;
            }
            if (abstractC18933 == abstractC18933M12180) {
                C4361.m9073(this.f54538.f9209.f14161, c18262.f54539.f56474, c4182.m8462() ? null : Integer.valueOf(c18262.f54538.f9209.f14161));
                abstractC18933.m43027();
                ArrayList arrayList = abstractC18933.f40548;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C4181 c4183 = (C4181) arrayList.get(i);
                    if (!c4183.m8462() && c4183.f9209.f14161 == this.f54538.f9209.f14161) {
                        this.f54538 = c4183;
                        break;
                    }
                }
                c5522.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }
            if (!c4182.m8462()) {
                numValueOf = Integer.valueOf(c18262.f54538.f9209.f14161);
            }
        } else {
            if (!(abstractC5462 instanceof C14909)) {
                return false;
            }
            C14909 c14909 = (C14909) abstractC5462;
            AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC14239 = c14909.f42521;
            if (!(abstractViewOnClickListenerC14239 instanceof C7534)) {
                return false;
            }
            C7534 c7534 = (C7534) abstractViewOnClickListenerC14239;
            if (c14909.getBindingAdapterPosition() == -1) {
                return false;
            }
            C12899 c12899M29554 = C12899.m29554(c7534.f56474, C4361.m9091(), (this.itemView.getHeight() / 2.0f) + this.itemView.getY(), (c14909.itemView.getHeight() / 2.0f) + c14909.itemView.getY());
            abstractC18933M12180 = c5522.m12180(c12899M29554.f36270);
            if (abstractC18933M12180 == null || abstractC18933M12180 == abstractC18933) {
                return false;
            }
            if (c12899M29554.f36269) {
                Iterator it = abstractC18933M12180.f40548.iterator();
                while (it.hasNext()) {
                    C4181 c4184 = (C4181) ((AbstractViewOnClickListenerC3510) it.next());
                    if (!c4184.m8462()) {
                        numValueOf = Integer.valueOf(c4184.f9209.f14161);
                        break;
                    }
                }
            }
        }
        boolean z = abstractC18933M12180.f40545;
        C5522 c5523 = abstractC18933M12180.f40549;
        ArrayList arrayList2 = abstractC18933M12180.f40548;
        if (!z) {
            return false;
        }
        int iM12179 = (arrayList2.size() == 1 && ((C4181) arrayList2.get(0)).m8462()) ? c5523.m12179(abstractC18933M12180) + 1 : -1;
        C4361.m9073(this.f54538.f9209.f14161, abstractC18933M12180.f56474, numValueOf);
        abstractC18933.m43027();
        ArrayList arrayList3 = abstractC18933.f40548;
        abstractC18933M12180.m43027();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            }
            C4181 c4185 = (C4181) arrayList2.get(i2);
            if (!c4185.m8462() && c4185.f9209.f14161 == this.f54538.f9209.f14161) {
                this.f54539 = abstractC18933M12180;
                this.f54538 = c4185;
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            c5522.m12192();
            return true;
        }
        C19604 c19604M44511 = C19604.m44511(bindingAdapterPosition, iM12179, c5523.m12179(abstractC18933M12180) + i2 + 1, (arrayList3.size() == 1 && ((C4181) arrayList3.get(0)).m8462()) ? abstractC18933.f40549.m12179(abstractC18933) + 1 : -1);
        boolean z2 = c19604M44511.f59633;
        if (z2) {
            c5522.m12185(this);
        }
        int i3 = c19604M44511.f59635;
        if (i3 != -1) {
            c5522.notifyItemRemoved(i3);
        }
        int i4 = c19604M44511.f59634;
        int i5 = c19604M44511.f59636;
        if (i4 != i5) {
            c5522.notifyItemMoved(i4, i5);
        } else {
            int i6 = c19604M44511.f59631;
            if (i6 != -1) {
                c5522.notifyItemChanged(i6);
            }
        }
        int i7 = c19604M44511.f59632;
        if (i7 != -1) {
            c5522.notifyItemInserted(i7);
        }
        if (z2) {
            c5522.m12189(this);
        }
        return true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C4181 c4181;
        AbstractC18933 abstractC18933 = this.f54539;
        if (abstractC18933 == null || abstractC18933.f40549.m12191() || (c4181 = this.f54538) == null || c4181.m8462()) {
            return false;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f47811;
        View view2 = this.f47808;
        C1898 c1898 = new C1898(abstractActivityC5549, view2, 8388611);
        C9702.m22649(view2);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new C15646(this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41596(C18262 c18262, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            c18262.f54538.f9209.mo8540(c18262.f54539.f37526);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final AbstractC18933 abstractC18933 = c18262.f54539;
            abstractC18933.getClass();
            final C4181 c4181 = c18262.f54538;
            if (c4181 == null || c4181.m8462()) {
                return;
            }
            C20671 c20671BuildDialog = abstractC18933.f37526.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, c18262.f47809.getText().toString()));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺۠ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    AbstractC18933 abstractC18934 = abstractC18933;
                    C4181 c4182 = c4181;
                    abstractC18934.getClass();
                    int i3 = c4182.f9209.f14161;
                    synchronized (C14486.class) {
                        Iterator it = C14486.m33130().iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (((AbstractC5769) it.next()).f14161 == i3) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 == -1) {
                        abstractC18934.f40549.m12192();
                        return;
                    }
                    C14486.m33117(i2);
                    C4361.m9095();
                    abstractC18934.m43027();
                    abstractC18934.f40549.m12192();
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c18262.f54539.f40549.m12181();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            AbstractC18933 abstractC18934 = c18262.f54539;
            C4181 c4182 = c18262.f54538;
            abstractC18934.getClass();
            AbstractC5769 abstractC5769 = c4182.f9209;
            C5729 c5729 = new C5729(abstractC18934.f37526);
            c5729.m12729(abstractC5769.getName());
            C21265 icon = abstractC5769.getIcon();
            AbstractC22606 abstractC22606 = C21265.f66820;
            c5729.m12730(new C13776(icon, 0));
            c5729.m12734("open-ns");
            c5729.m12727();
            c5729.m12728(abstractC5769.f14161);
            c5729.m12733();
        }
    }
}
