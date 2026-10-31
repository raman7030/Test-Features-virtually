package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15560 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, InterfaceC14930 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f47963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21912 f47964;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f47965;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23155 f47966;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f47967;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC15560(C21912 c21912, View view) {
        super(view);
        this.f47964 = c21912;
        this.f47963 = (TextView) view.findViewById(R.id.textView);
        this.f47965 = (TextView) view.findViewById(R.id.textView2);
        C19890.m45744(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(c21912.f70160.f41371);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36706(String str) {
        int i;
        int i2;
        String strM18061 = C6554.m18061(50, C14336.m34210(str));
        TextView textView = this.f47963;
        textView.setText(strM18061);
        String strM18062 = C6554.m18061(200, str);
        TextView textView2 = this.f47965;
        textView2.setText(strM18062);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C21912 c21912 = this.f47964;
        if (c21912.f70161 == null || c21912.f70161.m30058(str)) {
            this.f47967 = true;
            i = flags & (-17);
            i2 = flags2 & (-17);
            textView.setTextColor(C21943.f70275);
            textView2.setTextColor(C21943.f70275);
        } else {
            this.f47967 = false;
            i = flags | 16;
            i2 = flags2 | 16;
            textView.setTextColor(C21943.f70273);
            textView2.setTextColor(C21943.f70273);
        }
        paint.setFlags(i);
        paint2.setFlags(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C13876.f41361.m22793()) {
            return;
        }
        final String string = this.f47965.getText().toString();
        C21912 c21912 = this.f47964;
        if (c21912.f70161 != null && !c21912.f70161.m30058(string)) {
            m36705(string);
        } else {
            C4925.m14316(new Runnable() { // from class: l.֨᩻ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C21912 c21913 = this.f5165.f47964;
                    if (c21913.f70161 != null) {
                        c21913.f70161.m30026(string);
                    }
                }
            }, 500L);
            ((ActivityC17169) c21912.requireActivity()).m40343(string, (C19287) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C21282 c21282 = new C21282(this.f47964.requireContext(), view, 0);
        this.f47966 = new C23155(c21282, this.f47965.getText().toString(), true);
        if (this.f47967) {
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(this);
        c21282.m48305();
        return true;
    }

    @Override // l.InterfaceC14930
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.f47966.m51333(menuItem)) {
            String string = this.f47965.getText().toString();
            int itemId = menuItem.getItemId();
            C21912 c21912 = this.f47964;
            if (itemId == R.string.MT_Protector) {
                c21912.f70157.m11383(string);
                return true;
            }
            if (c21912.f70161 != null) {
                m36705(string);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36705(final String str) {
        C21912 c21912 = this.f47964;
        Context contextRequireContext = c21912.requireContext();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(contextRequireContext);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44424(c21912.getString(R.string.MT_Protector, this.f47963.getText()));
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠᩻ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f26003.f47964.f70161.m30070(str);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }
}
