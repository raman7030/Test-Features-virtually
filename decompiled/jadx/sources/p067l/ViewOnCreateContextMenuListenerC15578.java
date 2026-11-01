package p067l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnCreateContextMenuListenerC15578 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final C4360 f44503;

    public ViewOnCreateContextMenuListenerC15578(C4360 c4360) {
        this.f44503 = c4360;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C4360 c4360 = this.f44503;
        CharSequence charSequenceMo9033 = c4360.mo9033();
        if (!c4360.m9065() || TextUtils.isEmpty(charSequenceMo9033)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceMo9033);
        contextMenu.add(0, 0, 0, R.string.MT_Protector).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C4360 c4360 = this.f44503;
        ClipboardManager clipboardManager = (ClipboardManager) c4360.m9012().getSystemService("clipboard");
        CharSequence charSequenceMo9033 = c4360.mo9033();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo9033));
        Toast.makeText(c4360.m9012(), c4360.m9012().getString(R.string.MT_Protector, charSequenceMo9033), 0).show();
        return true;
    }
}
