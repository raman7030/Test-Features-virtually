package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC17157 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, InterfaceC1583 {

    /* JADX INFO: renamed from: ۗ */
    public TextView f51095;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23194 f51096;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f51097;

    /* JADX INFO: renamed from: ᩸ */
    public C24375 f51098;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f51099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC17157(C23194 c23194, View view) {
        super(view);
        this.f51096 = c23194;
        this.f51095 = (TextView) view.findViewById(R.id.textView);
        this.f51097 = (TextView) view.findViewById(R.id.textView2);
        C21272.m48055(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c23194.f72874.f44452);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38867(String str) {
        int i;
        int i2;
        String strM20011 = C8597.m20011(50, C15993.m36343(str));
        TextView textView = this.f51095;
        textView.setText(strM20011);
        String strM20012 = C8597.m20011(200, str);
        TextView textView2 = this.f51097;
        textView2.setText(strM20012);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C23194 c23194 = this.f51096;
        if (c23194.f72875 == null || c23194.f72875.m32119(str)) {
            this.f51099 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C23223.f72986);
            textView2.setTextColor(C23223.f72986);
        } else {
            this.f51099 = false;
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
        final String string = this.f51097.getText().toString();
        C23194 c23194 = this.f51096;
        if (c23194.f72875 != null && !c23194.f72875.m32119(string)) {
            m38866(string);
        } else {
            C7050.m16213(new Runnable() { // from class: l.֨᩻ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C23194 c23195 = this.f7938.f51096;
                    if (c23195.f72875 != null) {
                        c23195.f72875.m32087(string);
                    }
                }
            }, 500L);
            ((ActivityC18686) c23194.requireActivity()).m42588(string, (C20699) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1898 c1898 = new C1898(this.f51096.requireContext(), view, 0);
        this.f51098 = new C24375(c1898, this.f51097.getText().toString(), true);
        if (this.f51099) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(this);
        c1898.m50639();
        return true;
    }

    @Override // p067l.InterfaceC1583
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.f51098.m53728(menuItem)) {
            String string = this.f51097.getText().toString();
            int itemId = menuItem.getItemId();
            C23194 c23194 = this.f51096;
            if (itemId == R.string.MT_Protector) {
                c23194.f72871.m13319(string);
                return true;
            }
            if (c23194.f72875 != null) {
                m38866(string);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m38866(final String str) {
        C23194 c23194 = this.f51096;
        Context contextRequireContext = c23194.requireContext();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(contextRequireContext);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(c23194.getString(R.string.MT_Protector, this.f51095.getText()));
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠᩻ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f28918.f51096.f72875.m32131(str);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }
}
