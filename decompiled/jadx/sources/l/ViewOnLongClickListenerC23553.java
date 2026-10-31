package l;

import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC23553 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC12849 f75612;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String strM14330 = C4925.m14330();
        if (!TextUtils.isEmpty(strM14330)) {
            InterfaceC7785 interfaceC7785M31267 = this.f75612.m31267();
            interfaceC7785M31267.replace(0, interfaceC7785M31267.length(), strM14330);
            Selection.setSelection(interfaceC7785M31267, strM14330.length());
            return true;
        }
        C21374.m48457(R.string.MT_Protector);
        return false;
    }
}
