package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C18841 extends AbstractViewOnLongClickListenerC14606 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4024 f59428;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19547 f59429;

    public C18841(Main main, View view, C19547 c19547) {
        super(main, view);
        this.f59429 = c19547;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C5242 c5242 = C19547.f63205;
        C19547 c19547 = this.f59429;
        c19547.getClass();
        int bindingAdapterPosition = getBindingAdapterPosition();
        int bindingAdapterPosition2 = ((C18841) abstractC3255).getBindingAdapterPosition();
        C3318 c3318 = c19547.f37526;
        int iM10143 = (bindingAdapterPosition - c3318.m10143(c19547)) - 1;
        int iM10144 = (bindingAdapterPosition2 - c3318.m10143(c19547)) - 1;
        C9068.m23422().m18783(iM10143, iM10144);
        C6055.m16890(iM10143, iM10144, c19547.f37525);
        c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C19547.f63205.mo1664(Object.class);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f59429.f37526.m10155() || this.f59428 == null) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f44705;
        View view2 = this.f44702;
        C21282 c21282 = new C21282(abstractActivityC3346, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48302((InterfaceC14930) new C6001(3, this));
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43528(C18841 c18841, MenuItem menuItem) {
        final C19547 c19547 = c18841.f59429;
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.string.MT_Protector) {
            C5242 c5242 = C19547.f63205;
            c19547.getClass();
            final int bindingAdapterPosition = c18841.getBindingAdapterPosition();
            C9068.m23422().m18789((bindingAdapterPosition - c19547.f37526.m10143(c19547)) - 1).m39580(c19547.f34527, new Runnable() { // from class: l.ۡܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    c19547.f37526.notifyItemChanged(bindingAdapterPosition, 1);
                    C19547.f63205.mo1664(Object.class);
                }
            });
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C5242 c5243 = C19547.f63205;
            C19258 c19258BuildDialog = c19547.f34527.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44424(C4925.m14306(R.string.MT_Protector, c18841.f44703.getText().toString()));
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7388(i, c19547, c18841));
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c19547.f37526.m10145();
        } else if (itemId == R.string.MT_Protector) {
            C5242 c5244 = C19547.f63205;
            c19547.getClass();
            C9068.m23422().m18789((c18841.getBindingAdapterPosition() - c19547.f37526.m10143(c19547)) - 1).m39579(c19547.f34527);
        }
    }
}
