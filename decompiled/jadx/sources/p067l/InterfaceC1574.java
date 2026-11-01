package p067l;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳ᩷ */
/* JADX INFO: compiled from: 15V0 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC1574 {
    boolean collapseItemActionView(C0994 c0994, C1134 c1134);

    boolean expandItemActionView(C0994 c0994, C1134 c1134);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C0994 c0994);

    void onCloseMenu(C0994 c0994, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC1819 subMenuC1819);

    void setCallback(InterfaceC1714 interfaceC1714);

    void updateMenuView(boolean z);
}
