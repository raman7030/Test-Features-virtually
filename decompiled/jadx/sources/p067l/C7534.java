package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67CI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7534 extends AbstractC18933 {

    /* JADX INFO: renamed from: ۨ */
    public final C15579 f19776;

    public C7534(Main main, C5522 c5522, C15579 c15579) {
        super(main, c15579.f44505, "drawer_expand_network_group_" + c15579.f44504, c5522, c15579.f44504);
        this.f19776 = c15579;
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ֫ */
    public final void mo17438(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250) {
        super.mo17438(abstractViewOnLongClickListenerC16250);
        if (this.f40549.m12191()) {
            ((C14909) abstractViewOnLongClickListenerC16250).f47809.setText(this.f40546 + " (" + C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ܽ */
    public final int mo17439() {
        if (this.f40545) {
            return this.f40548.size() + 1;
        }
        return 1;
    }

    @Override // p067l.AbstractViewOnClickListenerC14239, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f40549.m12191()) {
            return false;
        }
        C1898 c1898 = new C1898(this.f37526, view, 8388693);
        C9702.m22649(view);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new C7638(this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17437(final C7534 c7534, MenuItem menuItem) {
        C15579 c15579 = c7534.f19776;
        Main main = c7534.f37526;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C9350 c9350 = new C9350(main, c15579);
            c9350.m33344(R.string.MT_Protector);
            c9350.m33336((CharSequence) c15579.f44505);
            c9350.m33330();
            c9350.m33367();
            c9350.m33352(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C20671 c20671BuildDialog = main.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(main.getString(R.string.MT_Protector, c15579.f44505));
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܶܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C4361.m9072(this.f4896.f19776.f44504);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                AbstractC18933.m43026(main);
                return;
            }
            return;
        }
        C14849 c14849 = (C14849) main.m12252(R.layout.MT_Protector);
        final ArrayList arrayListM9091 = C4361.m9091();
        C19784 c19784 = new C19784(main, arrayListM9091);
        C11755.m26982(c14849, -1, C13076.m29939(6.0f), -1, -1);
        c14849.setAdapter(c19784);
        C3847 c3847 = new C3847(new C18442(arrayListM9091, c19784));
        c3847.m7551(c14849);
        c19784.m44966(c3847);
        C20671 c20671BuildDialog2 = main.buildDialog();
        c20671BuildDialog2.m46727(R.string.MT_Protector);
        c20671BuildDialog2.m46715(c14849);
        c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ᩸ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArrayList arrayList = arrayListM9091;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C15579) it.next()).f44504));
                }
                C4361.m9078(arrayList2);
            }
        });
        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46732();
    }
}
