package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21126 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public final C3019 f66393;

    /* JADX INFO: renamed from: ۤ */
    public C20455 f66394;

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31385() {
        return true;
    }

    public C21126(Main main, View view, C3019 c3019) {
        super(main, view);
        this.f66393 = c3019;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31386(AbstractC5462 abstractC5462) {
        C3019.m5111(this.f66393, this, (C21126) abstractC5462);
        return true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f66393.f40549.m12191() || this.f66394 == null) {
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
        c1898.m50636(new C5564(1, this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47747(final C21126 c21126, MenuItem menuItem) {
        final C3019 c3019 = c21126.f66393;
        int i = 0;
        AbstractC17043 abstractC17043M42109 = C18524.m42109(c21126.f66394.f63178, new String[0]);
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            AbstractC17043 abstractC17043 = C3019.f5397;
            C6373 c6373 = new C6373(c3019, c3019.f37526, abstractC17043M42109);
            c6373.m33344(R.string.MT_Protector);
            c6373.m33336((CharSequence) abstractC17043M42109.getName());
            c6373.m33330();
            c6373.m33365(6);
            c6373.m33367();
            c6373.m33352(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strMo25505 = abstractC17043M42109.mo25505();
            AbstractC17043 abstractC17044 = C3019.f5397;
            Main main = c3019.f37526;
            main.m125();
            if (main.m130() != null) {
                main.m130().m26079().m41272(strMo25505);
                return;
            }
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c3019.f40549.m12181();
                return;
            }
            return;
        }
        AbstractC17043 abstractC17045 = C3019.f5397;
        C20671 c20671BuildDialog = c3019.f37526.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, c21126.f47809.getText().toString()));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24917(c3019, abstractC17043M42109, c21126, 2));
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11067(i, c3019, c21126));
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ܺ᩸ܳ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                c3019.f40549.notifyItemChanged(c21126.getBindingAdapterPosition());
            }
        });
        c20671BuildDialog.m46732();
    }
}
