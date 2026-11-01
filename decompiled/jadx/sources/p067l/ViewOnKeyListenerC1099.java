package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۜ */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnKeyListenerC1099 extends AbstractC1399 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f19024;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f19025;

    /* JADX INFO: renamed from: ۙ */
    public final Context f19027;

    /* JADX INFO: renamed from: ۛ */
    public boolean f19028;

    /* JADX INFO: renamed from: ۟ */
    public PopupWindow.OnDismissListener f19030;

    /* JADX INFO: renamed from: ۡ֫ */
    public ViewTreeObserver f19031;

    /* JADX INFO: renamed from: ۢ֫ */
    public final Handler f19032;

    /* JADX INFO: renamed from: ۤ */
    public boolean f19033;

    /* JADX INFO: renamed from: ۨ */
    public int f19035;

    /* JADX INFO: renamed from: ܰ */
    public final int f19038;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f19039;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f19040;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f19041;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC1714 f19043;

    /* JADX INFO: renamed from: ᩷֫ */
    public View f19045;

    /* JADX INFO: renamed from: ᩹ */
    public View f19046;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f19048;

    /* JADX INFO: renamed from: ۧ֫ */
    public final ArrayList f19034 = new ArrayList();

    /* JADX INFO: renamed from: ۜ֫ */
    public final ArrayList f19029 = new ArrayList();

    /* JADX INFO: renamed from: ۫ */
    public final ViewTreeObserver.OnGlobalLayoutListener f19036 = new ViewTreeObserverOnGlobalLayoutListenerC0959(this);

    /* JADX INFO: renamed from: ᩶ */
    public final View.OnAttachStateChangeListener f19044 = new ViewOnAttachStateChangeListenerC1029(this);

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC0953 f19047 = new C1799(this);

    /* JADX INFO: renamed from: ܿ֫ */
    public int f19042 = 0;

    /* JADX INFO: renamed from: ۗ */
    public int f19026 = 0;

    /* JADX INFO: renamed from: ۬ */
    public boolean f19037 = false;

    @Override // p067l.InterfaceC1574
    public final boolean flagActionItems() {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // p067l.InterfaceC1574
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public ViewOnKeyListenerC1099(Context context, View view, int i, boolean z) {
        this.f19027 = context;
        this.f19046 = view;
        this.f19041 = i;
        this.f19024 = z;
        this.f19035 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f19038 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f19032 = new Handler();
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10599(boolean z) {
        this.f19037 = z;
    }

    @Override // p067l.InterfaceC1329
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f19034;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m16741((C0994) it.next());
        }
        arrayList.clear();
        View view = this.f19046;
        this.f19045 = view;
        if (view != null) {
            boolean z = this.f19031 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f19031 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f19036);
            }
            this.f19045.addOnAttachStateChangeListener(this.f19044);
        }
    }

    @Override // p067l.InterfaceC1329
    public final void dismiss() {
        ArrayList arrayList = this.f19029;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C0854[] c0854Arr = (C0854[]) arrayList.toArray(new C0854[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0854 c0854 = c0854Arr[size];
            if (c0854.f4288.isShowing()) {
                c0854.f4288.dismiss();
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10598(C0994 c0994) {
        c0994.addMenuPresenter(this, this.f19027);
        if (isShowing()) {
            m16741(c0994);
        } else {
            this.f19034.add(c0994);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196 A[PHI: r5
      0x0196: PHI (r5v17 int) = (r5v16 int), (r5v8 int) binds: [B:80:0x0192, B:76:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0198 A[PHI: r5
      0x0198: PHI (r5v18 int) = (r5v8 int), (r5v19 int) binds: [B:79:0x0190, B:78:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX INFO: renamed from: ۧ */
    private void m16741(C0994 c0994) {
        boolean z;
        C0854 c0854;
        char c;
        View childAt;
        ListView listViewMo10603;
        int[] iArr;
        Rect rect;
        int i;
        boolean z2;
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        int i4;
        MenuItem item;
        C1939 c1939;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f19027;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1939 c19310 = new C1939(c0994, layoutInflaterFrom, this.f19024, R.layout.MT_Protector);
        if (!isShowing() && this.f19037) {
            c19310.m52026(true);
        } else if (isShowing()) {
            int size = c0994.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = c0994.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            c19310.m52026(z);
        }
        int iM29869 = AbstractC1399.m29869(c19310, context, this.f19038);
        C0848 c0848 = new C0848(context, null, this.f19041, 0);
        c0848.m3514(this.f19047);
        c0848.m25841((AdapterView.OnItemClickListener) this);
        c0848.m25843((PopupWindow.OnDismissListener) this);
        c0848.m25840(this.f19046);
        c0848.m25854(this.f19026);
        c0848.m25844();
        c0848.m25851();
        c0848.mo4052(c19310);
        c0848.m25855(iM29869);
        c0848.m25854(this.f19026);
        ArrayList arrayList = this.f19029;
        if (arrayList.size() > 0) {
            c0854 = (C0854) C20013.m45383(arrayList, 1);
            C0994 c0995 = c0854.f4286;
            int size2 = c0995.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    item = null;
                    break;
                }
                item = c0995.getItem(i6);
                if (item.hasSubMenu() && c0994 == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                ListView listViewMo10604 = c0854.f4288.mo10603();
                ListAdapter adapter = listViewMo10604.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1939 = (C1939) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1939 = (C1939) adapter;
                    headersCount = 0;
                }
                int count = c1939.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c1939.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewMo10604.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewMo10604.getChildCount()) ? listViewMo10604.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    c0848.m3512();
                    c0848.m3517();
                    listViewMo10603 = ((C0854) arrayList.get(arrayList.size() - 1)).f4288.mo10603();
                    iArr = new int[2];
                    listViewMo10603.getLocationOnScreen(iArr);
                    rect = new Rect();
                    this.f19045.getWindowVisibleDisplayFrame(rect);
                    if (this.f19035 == 1) {
                        if (listViewMo10603.getWidth() + iArr[c] + iM29869 > rect.right) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                    } else if (iArr[c] - iM29869 < 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f19035 = i;
                    if (Build.VERSION.SDK_INT >= 26) {
                        c0848.m25840(childAt);
                        i3 = 0;
                        i2 = 0;
                    } else {
                        iArr2 = new int[2];
                        this.f19046.getLocationOnScreen(iArr2);
                        iArr3 = new int[2];
                        childAt.getLocationOnScreen(iArr3);
                        if ((this.f19026 & 7) == 5) {
                            iArr2[c] = this.f19046.getWidth() + iArr2[c];
                            iArr3[c] = childAt.getWidth() + iArr3[c];
                        }
                        i2 = iArr3[c] - iArr2[c];
                        i3 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f19026 & 5) == 5) {
                        if (z2) {
                            i4 = i2 + iM29869;
                        } else {
                            iM29869 = childAt.getWidth();
                            i4 = i2 - iM29869;
                        }
                    } else if (z2) {
                        iM29869 = childAt.getWidth();
                        i4 = i2 + iM29869;
                    } else {
                        i4 = i2 - iM29869;
                    }
                    c0848.m25838(i4);
                    c0848.m25845();
                    c0848.m25849(i3);
                } else {
                    if (this.f19033) {
                        c0848.m25838(this.f19040);
                    }
                    if (this.f19028) {
                        c0848.m25849(this.f19025);
                    }
                    c0848.m25839(m29870());
                }
                arrayList.add(new C0854(c0848, c0994, this.f19035));
                c0848.show();
                ListView listViewMo10605 = c0848.mo10603();
                listViewMo10605.setOnKeyListener(this);
                if (c0854 == null || !this.f19048 || c0994.getHeaderTitle() == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) listViewMo10605, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(c0994.getHeaderTitle());
                listViewMo10605.addHeaderView(frameLayout, null, false);
                c0848.show();
                return;
            }
            c = 0;
            if (childAt != null) {
                c0848.m3512();
                c0848.m3517();
                listViewMo10603 = ((C0854) arrayList.get(arrayList.size() - 1)).f4288.mo10603();
                iArr = new int[2];
                listViewMo10603.getLocationOnScreen(iArr);
                rect = new Rect();
                this.f19045.getWindowVisibleDisplayFrame(rect);
                if (this.f19035 == 1) {
                    if (listViewMo10603.getWidth() + iArr[c] + iM29869 > rect.right) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else if (iArr[c] - iM29869 < 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f19035 = i;
                if (Build.VERSION.SDK_INT >= 26) {
                    c0848.m25840(childAt);
                    i3 = 0;
                    i2 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f19046.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f19026 & 7) == 5) {
                        iArr2[c] = this.f19046.getWidth() + iArr2[c];
                        iArr3[c] = childAt.getWidth() + iArr3[c];
                    }
                    i2 = iArr3[c] - iArr2[c];
                    i3 = iArr3[1] - iArr2[1];
                }
                if ((this.f19026 & 5) == 5) {
                    if (z2) {
                        i4 = i2 + iM29869;
                    } else {
                        iM29869 = childAt.getWidth();
                        i4 = i2 - iM29869;
                    }
                } else if (z2) {
                    iM29869 = childAt.getWidth();
                    i4 = i2 + iM29869;
                } else {
                    i4 = i2 - iM29869;
                }
                c0848.m25838(i4);
                c0848.m25845();
                c0848.m25849(i3);
            } else {
                if (this.f19033) {
                    c0848.m25838(this.f19040);
                }
                if (this.f19028) {
                    c0848.m25849(this.f19025);
                }
                c0848.m25839(m29870());
            }
            arrayList.add(new C0854(c0848, c0994, this.f19035));
            c0848.show();
            ListView listViewMo10606 = c0848.mo10603();
            listViewMo10606.setOnKeyListener(this);
            if (c0854 == null) {
            }
        }
        c0854 = null;
        c = 0;
        childAt = null;
        if (childAt != null) {
            c0848.m3512();
            c0848.m3517();
            listViewMo10603 = ((C0854) arrayList.get(arrayList.size() - 1)).f4288.mo10603();
            iArr = new int[2];
            listViewMo10603.getLocationOnScreen(iArr);
            rect = new Rect();
            this.f19045.getWindowVisibleDisplayFrame(rect);
            if (this.f19035 == 1) {
                if (listViewMo10603.getWidth() + iArr[c] + iM29869 > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[c] - iM29869 < 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f19035 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                c0848.m25840(childAt);
                i3 = 0;
                i2 = 0;
            } else {
                iArr2 = new int[2];
                this.f19046.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f19026 & 7) == 5) {
                    iArr2[c] = this.f19046.getWidth() + iArr2[c];
                    iArr3[c] = childAt.getWidth() + iArr3[c];
                }
                i2 = iArr3[c] - iArr2[c];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.f19026 & 5) == 5) {
                if (z2) {
                    i4 = i2 + iM29869;
                } else {
                    iM29869 = childAt.getWidth();
                    i4 = i2 - iM29869;
                }
            } else if (z2) {
                iM29869 = childAt.getWidth();
                i4 = i2 + iM29869;
            } else {
                i4 = i2 - iM29869;
            }
            c0848.m25838(i4);
            c0848.m25845();
            c0848.m25849(i3);
        } else {
            if (this.f19033) {
                c0848.m25838(this.f19040);
            }
            if (this.f19028) {
                c0848.m25849(this.f19025);
            }
            c0848.m25839(m29870());
        }
        arrayList.add(new C0854(c0848, c0994, this.f19035));
        c0848.show();
        ListView listViewMo10607 = c0848.mo10603();
        listViewMo10607.setOnKeyListener(this);
        if (c0854 == null) {
        }
    }

    @Override // p067l.InterfaceC1329
    public final boolean isShowing() {
        ArrayList arrayList = this.f19029;
        return arrayList.size() > 0 && ((C0854) arrayList.get(0)).f4288.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0854 c0854;
        ArrayList arrayList = this.f19029;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0854 = null;
                break;
            }
            c0854 = (C0854) arrayList.get(i);
            if (!c0854.f4288.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0854 != null) {
            c0854.f4286.close(false);
        }
    }

    @Override // p067l.InterfaceC1574
    public final void updateMenuView(boolean z) {
        Iterator it = this.f19029.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0854) it.next()).f4288.mo10603().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1939) adapter).notifyDataSetChanged();
        }
    }

    @Override // p067l.InterfaceC1574
    public final void setCallback(InterfaceC1714 interfaceC1714) {
        this.f19043 = interfaceC1714;
    }

    @Override // p067l.InterfaceC1574
    public final boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        for (C0854 c0854 : this.f19029) {
            if (subMenuC1819 == c0854.f4286) {
                c0854.f4288.mo10603().requestFocus();
                return true;
            }
        }
        if (!subMenuC1819.hasVisibleItems()) {
            return false;
        }
        mo10598(subMenuC1819);
        InterfaceC1714 interfaceC1714 = this.f19043;
        if (interfaceC1714 != null) {
            interfaceC1714.mo4428(subMenuC1819);
        }
        return true;
    }

    @Override // p067l.InterfaceC1574
    public final void onCloseMenu(C0994 c0994, boolean z) {
        ArrayList arrayList = this.f19029;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0994 == ((C0854) arrayList.get(i)).f4286) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0854) arrayList.get(i2)).f4286.close(false);
        }
        C0854 c0854 = (C0854) arrayList.remove(i);
        C0994 c0995 = c0854.f4286;
        C0848 c0848 = c0854.f4288;
        c0995.removeMenuPresenter(this);
        if (this.f19039) {
            c0848.m3518();
            c0848.m25847();
        }
        c0848.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f19035 = ((C0854) arrayList.get(size2 - 1)).f4287;
        } else {
            this.f19035 = this.f19046.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0854) arrayList.get(0)).f4286.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1714 interfaceC1714 = this.f19043;
        if (interfaceC1714 != null) {
            interfaceC1714.onCloseMenu(c0994, true);
        }
        ViewTreeObserver viewTreeObserver = this.f19031;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f19031.removeGlobalOnLayoutListener(this.f19036);
            }
            this.f19031 = null;
        }
        this.f19045.removeOnAttachStateChangeListener(this.f19044);
        this.f19030.onDismiss();
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10595(int i) {
        if (this.f19042 != i) {
            this.f19042 = i;
            this.f19026 = Gravity.getAbsoluteGravity(i, this.f19046.getLayoutDirection());
        }
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10596(View view) {
        if (this.f19046 != view) {
            this.f19046 = view;
            this.f19026 = Gravity.getAbsoluteGravity(this.f19042, view.getLayoutDirection());
        }
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10597(PopupWindow.OnDismissListener onDismissListener) {
        this.f19030 = onDismissListener;
    }

    @Override // p067l.InterfaceC1329
    /* JADX INFO: renamed from: ᩳ */
    public final ListView mo10603() {
        ArrayList arrayList = this.f19029;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0854) C20013.m45383(arrayList, 1)).f4288.mo10603();
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ۧ */
    public final void mo10600(int i) {
        this.f19033 = true;
        this.f19040 = i;
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ܽ */
    public final void mo10602(int i) {
        this.f19028 = true;
        this.f19025 = i;
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ۧ */
    public final void mo10601(boolean z) {
        this.f19048 = z;
    }
}
