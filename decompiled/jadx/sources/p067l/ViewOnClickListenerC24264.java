package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC24264 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, InterfaceC1583 {

    /* JADX INFO: renamed from: ۙ */
    public TextView f76879;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C15546 f76880;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f76881;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f76882;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC24264(C15546 c15546, View view) {
        super(view);
        this.f76880 = c15546;
        this.f76879 = (TextView) view.findViewById(R.id.textView);
        this.f76882 = (TextView) view.findViewById(R.id.textView2);
        C21272.m48055(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c15546.f44423.f44452);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53600(String str) {
        int i;
        int i2;
        String strM20011 = C8597.m20011(50, C15993.m36343(str));
        TextView textView = this.f76879;
        textView.setText(strM20011);
        String strM20012 = C8597.m20011(200, str);
        TextView textView2 = this.f76882;
        textView2.setText(strM20012);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C15546 c15546 = this.f76880;
        if (c15546.f44424 == null || c15546.f44424.m47134(str)) {
            this.f76881 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C23223.f72986);
            textView2.setTextColor(C23223.f72986);
        } else {
            this.f76881 = false;
            i = flags | 16;
            i2 = flags2 | 16;
            textView.setTextColor(C23223.f72984);
            textView2.setTextColor(C23223.f72984);
        }
        paint.setFlags(i);
        paint2.setFlags(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C15556.f44442.m24763()) {
            return;
        }
        final String string = this.f76882.getText().toString();
        C15546 c15546 = this.f76880;
        if (c15546.f44424 != null && !c15546.f44424.m47134(string)) {
            m53599(string);
        } else {
            C7050.m16213(new Runnable() { // from class: l.ۛܰ᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C15546 c15547 = this.f21576.f76880;
                    if (c15547.f44424 != null) {
                        c15547.f44424.m47114(string);
                    }
                }
            }, 500L);
            ((ActivityC18686) c15546.requireActivity()).m42599(string, (C20699) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1898 c1898 = new C1898(this.f76880.requireContext(), view, 0);
        if (this.f76881) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(this);
        c1898.m50639();
        return true;
    }

    @Override // p067l.InterfaceC1583
    public final boolean onMenuItemClick(MenuItem menuItem) {
        String string = this.f76882.getText().toString();
        int itemId = menuItem.getItemId();
        C15546 c15546 = this.f76880;
        if (itemId == R.string.MT_Protector) {
            c15546.f44420.m13341(string);
            return true;
        }
        if (c15546.f44424 == null) {
            return true;
        }
        m53599(string);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53599(final String str) {
        C15546 c15546 = this.f76880;
        Context contextRequireContext = c15546.requireContext();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextRequireContext);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(c15546.getString(R.string.MT_Protector, this.f76879.getText()));
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨܰ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f38074.f76880.f44424.m47136(str);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }
}
