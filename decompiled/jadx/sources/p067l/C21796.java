package p067l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;

/* JADX INFO: renamed from: l.᩶᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21796 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public C23807 f68614;

    /* JADX INFO: renamed from: ۤ */
    public final C4674 f68615;

    /* JADX INFO: renamed from: ۨ */
    public final C7043 f68616;

    public C21796(Main main, View view, C7043 c7043) {
        super(main, view);
        C4674 c4674 = (C4674) view.findViewById(R.id.MT_Protector);
        this.f68615 = c4674;
        c4674.m9910(C23223.f72969);
        c4674.m9909(C23223.f72969);
        this.f68616 = c7043;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final void mo34117(Resources.Theme theme) {
        super.mo34117(theme);
        int i = C23223.f72969;
        C4674 c4674 = this.f68615;
        c4674.m9910(i);
        c4674.m9909(C23223.f72969);
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31385() {
        C23807 c23807 = this.f68614;
        return (c23807 == null || c23807.f75678 == null) ? false : true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31386(AbstractC5462 abstractC5462) {
        C21796 c21796 = (C21796) abstractC5462;
        if (!mo31385() || !c21796.mo31385()) {
            return false;
        }
        C7043.m16189(this.f68616, this, c21796);
        return true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C23807 c23807;
        if (this.f68616.f40549.m12191() || (c23807 = this.f68614) == null || c23807.f75678 == null) {
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
        c1898.m50636(new H5PayActivity$$ExternalSyntheticLambda0(this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49160(final C21796 c21796, MenuItem menuItem) {
        TextView textView = c21796.f47809;
        final C7043 c7043 = c21796.f68616;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C6196 c6196 = c21796.f68614.f75678;
            int i = C7043.f18343;
            C23137 c23137 = new C23137(c7043.f37526, c6196);
            c23137.m33344(R.string.MT_Protector);
            c23137.m33336((CharSequence) c6196.f15596);
            c23137.m33359(c6196.f15594.toString());
            c23137.m33334(C23223.f72984);
            c23137.m33343();
            c23137.m33365(6);
            c23137.m33367();
            c23137.m33352(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i2 = C7043.f18343;
            C20671 c20671BuildDialog = c7043.f37526.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, textView.getText().toString()));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩸ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C7043.m16191(c7043, c21796);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c7043.f40549.m12181();
                return;
            }
            return;
        }
        int i3 = C7043.f18343;
        C20671 c20671BuildDialog2 = c7043.f37526.buildDialog();
        c20671BuildDialog2.m46727(R.string.MT_Protector);
        c20671BuildDialog2.m46718(C7050.m16203(R.string.MT_Protector, textView.getText().toString()));
        c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23629(3, c7043, c21796));
        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46732();
    }
}
