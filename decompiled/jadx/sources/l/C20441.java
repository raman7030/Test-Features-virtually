package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;

/* JADX INFO: renamed from: l.᩶᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20441 extends AbstractViewOnLongClickListenerC14606 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22557 f65939;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2426 f65940;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4918 f65941;

    public C20441(Main main, View view, C4918 c4918) {
        super(main, view);
        C2426 c2426 = (C2426) view.findViewById(R.id.MT_Protector);
        this.f65940 = c2426;
        c2426.m7862(C21943.f70257);
        c2426.m7861(C21943.f70257);
        this.f65941 = c4918;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final void mo32019(Resources.Theme theme) {
        super.mo32019(theme);
        int i = C21943.f70257;
        C2426 c2426 = this.f65940;
        c2426.m7862(i);
        c2426.m7861(C21943.f70257);
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29330() {
        C22557 c22557 = this.f65939;
        return (c22557 == null || c22557.f72951 == null) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C20441 c20441 = (C20441) abstractC3255;
        if (!mo29330() || !c20441.mo29330()) {
            return false;
        }
        C4918.m14292(this.f65941, this, c20441);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C22557 c22557;
        if (this.f65941.f37526.m10155() || (c22557 = this.f65939) == null || c22557.f72951 == null) {
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
        c21282.m48302(new H5PayActivity$$ExternalSyntheticLambda0(this));
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46837(final C20441 c20441, MenuItem menuItem) {
        TextView textView = c20441.f44703;
        final C4918 c4918 = c20441.f65941;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C4027 c4027 = c20441.f65939.f72951;
            int i = C4918.f15510;
            C21852 c21852 = new C21852(c4918.f34527, c4027);
            c21852.m31258(R.string.MT_Protector);
            c21852.m31250((CharSequence) c4027.f12781);
            c21852.m31273(c4027.f12779.toString());
            c21852.m31248(C21943.f70273);
            c21852.m31257();
            c21852.m31279(6);
            c21852.m31281();
            c21852.m31266(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i2 = C4918.f15510;
            C19258 c19258BuildDialog = c4918.f34527.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44424(C4925.m14306(R.string.MT_Protector, textView.getText().toString()));
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩸ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C4918.m14294(c4918, c20441);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                c4918.f37526.m10145();
                return;
            }
            return;
        }
        int i3 = C4918.f15510;
        C19258 c19258BuildDialog2 = c4918.f34527.buildDialog();
        c19258BuildDialog2.m44433(R.string.MT_Protector);
        c19258BuildDialog2.m44424(C4925.m14306(R.string.MT_Protector, textView.getText().toString()));
        c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22370(3, c4918, c20441));
        c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog2.m44438();
    }
}
