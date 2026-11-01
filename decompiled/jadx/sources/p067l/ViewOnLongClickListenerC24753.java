package p067l;

import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩻۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC24753 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC14580 f78358;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String strM16227 = C7050.m16227();
        if (!TextUtils.isEmpty(strM16227)) {
            InterfaceC9768 interfaceC9768M33353 = this.f78358.m33353();
            interfaceC9768M33353.replace(0, interfaceC9768M33353.length(), strM16227);
            Selection.setSelection(interfaceC9768M33353, strM16227.length());
            return true;
        }
        C22682.m50793(R.string.MT_Protector);
        return false;
    }
}
