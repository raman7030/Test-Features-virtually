package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20275 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public C6193 f62656;

    /* JADX INFO: renamed from: ۤ */
    public final C20946 f62657;

    public C20275(Main main, View view, C20946 c20946) {
        super(main, view);
        this.f62657 = c20946;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31386(AbstractC5462 abstractC5462) {
        C7350 c7350 = C20946.f65825;
        C20946 c20946 = this.f62657;
        c20946.getClass();
        int bindingAdapterPosition = getBindingAdapterPosition();
        int bindingAdapterPosition2 = ((C20275) abstractC5462).getBindingAdapterPosition();
        C5522 c5522 = c20946.f40549;
        int iM12179 = (bindingAdapterPosition - c5522.m12179(c20946)) - 1;
        int iM121710 = (bindingAdapterPosition2 - c5522.m12179(c20946)) - 1;
        C10987.m25368().m20737(iM12179, iM121710);
        C8123.m18819(iM12179, iM121710, c20946.f40548);
        c5522.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C20946.f65825.mo4062(Object.class);
        return true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f62657.f40549.m12191() || this.f62656 == null) {
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
        c1898.m50636((InterfaceC1583) new C8072(3, this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45794(C20275 c20275, MenuItem menuItem) {
        final C20946 c20946 = c20275.f62657;
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.string.MT_Protector) {
            C7350 c7350 = C20946.f65825;
            c20946.getClass();
            final int bindingAdapterPosition = c20275.getBindingAdapterPosition();
            C10987.m25368().m20743((bindingAdapterPosition - c20946.f40549.m12179(c20946)) - 1).m41816(c20946.f37526, new Runnable() { // from class: l.ۡܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    c20946.f40549.notifyItemChanged(bindingAdapterPosition, 1);
                    C20946.f65825.mo4062(Object.class);
                }
            });
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C7350 c7351 = C20946.f65825;
            C20671 c20671BuildDialog = c20946.f37526.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, c20275.f47809.getText().toString()));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9390(i, c20946, c20275));
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c20946.f40549.m12181();
        } else if (itemId == R.string.MT_Protector) {
            C7350 c7352 = C20946.f65825;
            c20946.getClass();
            C10987.m25368().m20743((c20275.getBindingAdapterPosition() - c20946.f40549.m12179(c20946)) - 1).m41815(c20946.f37526);
        }
    }
}
