package l;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 15V0 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC14762 {
    boolean collapseItemActionView(C3060 c3060, C5882 c5882);

    boolean expandItemActionView(C3060 c3060, C5882 c5882);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C3060 c3060);

    void onCloseMenu(C3060 c3060, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC19703 subMenuC19703);

    void setCallback(InterfaceC17585 interfaceC17585);

    void updateMenuView(boolean z);
}
