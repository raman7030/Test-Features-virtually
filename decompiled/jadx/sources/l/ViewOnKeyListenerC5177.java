package l;

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
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnKeyListenerC5177 extends AbstractC11236 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f16183;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f16184;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f16186;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f16187;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f16189;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f16190;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final Handler f16191;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f16192;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16194;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f16197;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f16198;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f16199;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f16200;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f16202;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public View f16204;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f16205;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f16207;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16193 = new ArrayList();

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16188 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f16195 = new ViewTreeObserverOnGlobalLayoutListenerC2355(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f16203 = new ViewOnAttachStateChangeListenerC3766(this);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC2231 f16206 = new C19289(this);

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f16201 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f16185 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f16196 = false;

    @Override // l.InterfaceC14762
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC14762
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC14762
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public ViewOnKeyListenerC5177(Context context, View view, int i, boolean z) {
        this.f16186 = context;
        this.f16205 = view;
        this.f16200 = i;
        this.f16183 = z;
        this.f16194 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f16197 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f16191 = new Handler();
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫ */
    public final void mo8536(boolean z) {
        this.f16196 = z;
    }

    @Override // l.InterfaceC9825
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f16193;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m14831((C3060) it.next());
        }
        arrayList.clear();
        View view = this.f16205;
        this.f16204 = view;
        if (view != null) {
            boolean z = this.f16190 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f16190 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f16195);
            }
            this.f16204.addOnAttachStateChangeListener(this.f16203);
        }
    }

    @Override // l.InterfaceC9825
    public final void dismiss() {
        ArrayList arrayList = this.f16188;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C0237[] c0237Arr = (C0237[]) arrayList.toArray(new C0237[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0237 c0237 = c0237Arr[size];
            if (c0237.f1510.isShowing()) {
                c0237.f1510.dismiss();
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

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫ */
    public final void mo8535(C3060 c3060) {
        c3060.addMenuPresenter(this, this.f16186);
        if (isShowing()) {
            m14831(c3060);
        } else {
            this.f16193.add(c3060);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14831(C3060 c3060) {
        boolean z;
        C0237 c0237;
        char c;
        View childAt;
        ListView listViewMo8540;
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
        C22110 c22110;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f16186;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C22110 c22111 = new C22110(c3060, layoutInflaterFrom, this.f16183, R.layout.MT_Protector);
        if (!isShowing() && this.f16196) {
            c22111.m49688(true);
        } else if (isShowing()) {
            int size = c3060.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = c3060.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            c22111.m49688(z);
        }
        int iM27807 = AbstractC11236.m27807(c22111, context, this.f16197);
        C0113 c0113 = new C0113(context, null, this.f16200, 0);
        c0113.m1113(this.f16206);
        c0113.m23832((AdapterView.OnItemClickListener) this);
        c0113.m23834((PopupWindow.OnDismissListener) this);
        c0113.m23831(this.f16205);
        c0113.m23845(this.f16185);
        c0113.m23835();
        c0113.m23842();
        c0113.mo1654(c22111);
        c0113.m23846(iM27807);
        c0113.m23845(this.f16185);
        ArrayList arrayList = this.f16188;
        if (arrayList.size() > 0) {
            c0237 = (C0237) C18566.m43105(arrayList, 1);
            C3060 c3061 = c0237.f1508;
            int size2 = c3061.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    item = null;
                    break;
                }
                item = c3061.getItem(i6);
                if (item.hasSubMenu() && c3060 == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                ListView listViewMo8541 = c0237.f1510.mo8540();
                ListAdapter adapter = listViewMo8541.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c22110 = (C22110) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c22110 = (C22110) adapter;
                    headersCount = 0;
                }
                int count = c22110.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c22110.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewMo8541.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewMo8541.getChildCount()) ? listViewMo8541.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    c0113.m1111();
                    c0113.m1116();
                    listViewMo8540 = ((C0237) arrayList.get(arrayList.size() - 1)).f1510.mo8540();
                    iArr = new int[2];
                    listViewMo8540.getLocationOnScreen(iArr);
                    rect = new Rect();
                    this.f16204.getWindowVisibleDisplayFrame(rect);
                    if (this.f16194 == 1) {
                        if (listViewMo8540.getWidth() + iArr[c] + iM27807 > rect.right) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                    } else if (iArr[c] - iM27807 < 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f16194 = i;
                    if (Build.VERSION.SDK_INT >= 26) {
                        c0113.m23831(childAt);
                        i3 = 0;
                        i2 = 0;
                    } else {
                        iArr2 = new int[2];
                        this.f16205.getLocationOnScreen(iArr2);
                        iArr3 = new int[2];
                        childAt.getLocationOnScreen(iArr3);
                        if ((this.f16185 & 7) == 5) {
                            iArr2[c] = this.f16205.getWidth() + iArr2[c];
                            iArr3[c] = childAt.getWidth() + iArr3[c];
                        }
                        i2 = iArr3[c] - iArr2[c];
                        i3 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f16185 & 5) == 5) {
                        if (z2) {
                            i4 = i2 + iM27807;
                        } else {
                            iM27807 = childAt.getWidth();
                            i4 = i2 - iM27807;
                        }
                    } else if (z2) {
                        iM27807 = childAt.getWidth();
                        i4 = i2 + iM27807;
                    } else {
                        i4 = i2 - iM27807;
                    }
                    c0113.m23829(i4);
                    c0113.m23836();
                    c0113.m23840(i3);
                } else {
                    if (this.f16192) {
                        c0113.m23829(this.f16199);
                    }
                    if (this.f16187) {
                        c0113.m23840(this.f16184);
                    }
                    c0113.m23830(m27808());
                }
                arrayList.add(new C0237(c0113, c3060, this.f16194));
                c0113.show();
                ListView listViewMo8542 = c0113.mo8540();
                listViewMo8542.setOnKeyListener(this);
                if (c0237 == null || !this.f16207 || c3060.getHeaderTitle() == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) listViewMo8542, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(c3060.getHeaderTitle());
                listViewMo8542.addHeaderView(frameLayout, null, false);
                c0113.show();
                return;
            }
            c = 0;
            if (childAt != null) {
                c0113.m1111();
                c0113.m1116();
                listViewMo8540 = ((C0237) arrayList.get(arrayList.size() - 1)).f1510.mo8540();
                iArr = new int[2];
                listViewMo8540.getLocationOnScreen(iArr);
                rect = new Rect();
                this.f16204.getWindowVisibleDisplayFrame(rect);
                if (this.f16194 == 1) {
                    if (listViewMo8540.getWidth() + iArr[c] + iM27807 > rect.right) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else if (iArr[c] - iM27807 < 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f16194 = i;
                if (Build.VERSION.SDK_INT >= 26) {
                    c0113.m23831(childAt);
                    i3 = 0;
                    i2 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f16205.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f16185 & 7) == 5) {
                        iArr2[c] = this.f16205.getWidth() + iArr2[c];
                        iArr3[c] = childAt.getWidth() + iArr3[c];
                    }
                    i2 = iArr3[c] - iArr2[c];
                    i3 = iArr3[1] - iArr2[1];
                }
                if ((this.f16185 & 5) == 5) {
                    if (z2) {
                        i4 = i2 + iM27807;
                    } else {
                        iM27807 = childAt.getWidth();
                        i4 = i2 - iM27807;
                    }
                } else if (z2) {
                    iM27807 = childAt.getWidth();
                    i4 = i2 + iM27807;
                } else {
                    i4 = i2 - iM27807;
                }
                c0113.m23829(i4);
                c0113.m23836();
                c0113.m23840(i3);
            } else {
                if (this.f16192) {
                    c0113.m23829(this.f16199);
                }
                if (this.f16187) {
                    c0113.m23840(this.f16184);
                }
                c0113.m23830(m27808());
            }
            arrayList.add(new C0237(c0113, c3060, this.f16194));
            c0113.show();
            ListView listViewMo8543 = c0113.mo8540();
            listViewMo8543.setOnKeyListener(this);
            if (c0237 == null) {
            }
        }
        c0237 = null;
        c = 0;
        childAt = null;
        if (childAt != null) {
            c0113.m1111();
            c0113.m1116();
            listViewMo8540 = ((C0237) arrayList.get(arrayList.size() - 1)).f1510.mo8540();
            iArr = new int[2];
            listViewMo8540.getLocationOnScreen(iArr);
            rect = new Rect();
            this.f16204.getWindowVisibleDisplayFrame(rect);
            if (this.f16194 == 1) {
                if (listViewMo8540.getWidth() + iArr[c] + iM27807 > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[c] - iM27807 < 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f16194 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                c0113.m23831(childAt);
                i3 = 0;
                i2 = 0;
            } else {
                iArr2 = new int[2];
                this.f16205.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f16185 & 7) == 5) {
                    iArr2[c] = this.f16205.getWidth() + iArr2[c];
                    iArr3[c] = childAt.getWidth() + iArr3[c];
                }
                i2 = iArr3[c] - iArr2[c];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.f16185 & 5) == 5) {
                if (z2) {
                    i4 = i2 + iM27807;
                } else {
                    iM27807 = childAt.getWidth();
                    i4 = i2 - iM27807;
                }
            } else if (z2) {
                iM27807 = childAt.getWidth();
                i4 = i2 + iM27807;
            } else {
                i4 = i2 - iM27807;
            }
            c0113.m23829(i4);
            c0113.m23836();
            c0113.m23840(i3);
        } else {
            if (this.f16192) {
                c0113.m23829(this.f16199);
            }
            if (this.f16187) {
                c0113.m23840(this.f16184);
            }
            c0113.m23830(m27808());
        }
        arrayList.add(new C0237(c0113, c3060, this.f16194));
        c0113.show();
        ListView listViewMo8544 = c0113.mo8540();
        listViewMo8544.setOnKeyListener(this);
        if (c0237 == null) {
        }
    }

    @Override // l.InterfaceC9825
    public final boolean isShowing() {
        ArrayList arrayList = this.f16188;
        return arrayList.size() > 0 && ((C0237) arrayList.get(0)).f1510.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0237 c0237;
        ArrayList arrayList = this.f16188;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0237 = null;
                break;
            }
            c0237 = (C0237) arrayList.get(i);
            if (!c0237.f1510.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0237 != null) {
            c0237.f1508.close(false);
        }
    }

    @Override // l.InterfaceC14762
    public final void updateMenuView(boolean z) {
        Iterator it = this.f16188.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0237) it.next()).f1510.mo8540().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C22110) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC14762
    public final void setCallback(InterfaceC17585 interfaceC17585) {
        this.f16202 = interfaceC17585;
    }

    @Override // l.InterfaceC14762
    public final boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        for (C0237 c0237 : this.f16188) {
            if (subMenuC19703 == c0237.f1508) {
                c0237.f1510.mo8540().requestFocus();
                return true;
            }
        }
        if (!subMenuC19703.hasVisibleItems()) {
            return false;
        }
        mo8535(subMenuC19703);
        InterfaceC17585 interfaceC17585 = this.f16202;
        if (interfaceC17585 != null) {
            interfaceC17585.mo2048(subMenuC19703);
        }
        return true;
    }

    @Override // l.InterfaceC14762
    public final void onCloseMenu(C3060 c3060, boolean z) {
        ArrayList arrayList = this.f16188;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c3060 == ((C0237) arrayList.get(i)).f1508) {
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
            ((C0237) arrayList.get(i2)).f1508.close(false);
        }
        C0237 c0237 = (C0237) arrayList.remove(i);
        C3060 c3061 = c0237.f1508;
        C0113 c0113 = c0237.f1510;
        c3061.removeMenuPresenter(this);
        if (this.f16198) {
            c0113.m1117();
            c0113.m23838();
        }
        c0113.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f16194 = ((C0237) arrayList.get(size2 - 1)).f1509;
        } else {
            this.f16194 = this.f16205.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0237) arrayList.get(0)).f1508.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC17585 interfaceC17585 = this.f16202;
        if (interfaceC17585 != null) {
            interfaceC17585.onCloseMenu(c3060, true);
        }
        ViewTreeObserver viewTreeObserver = this.f16190;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f16190.removeGlobalOnLayoutListener(this.f16195);
            }
            this.f16190 = null;
        }
        this.f16204.removeOnAttachStateChangeListener(this.f16203);
        this.f16189.onDismiss();
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫ */
    public final void mo8532(int i) {
        if (this.f16201 != i) {
            this.f16201 = i;
            this.f16185 = Gravity.getAbsoluteGravity(i, this.f16205.getLayoutDirection());
        }
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫ */
    public final void mo8533(View view) {
        if (this.f16205 != view) {
            this.f16205 = view;
            this.f16185 = Gravity.getAbsoluteGravity(this.f16201, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫ */
    public final void mo8534(PopupWindow.OnDismissListener onDismissListener) {
        this.f16189 = onDismissListener;
    }

    @Override // l.InterfaceC9825
    /* JADX INFO: renamed from: ᩳ */
    public final ListView mo8540() {
        ArrayList arrayList = this.f16188;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0237) C18566.m43105(arrayList, 1)).f1510.mo8540();
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ۧ */
    public final void mo8537(int i) {
        this.f16192 = true;
        this.f16199 = i;
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ܽ */
    public final void mo8539(int i) {
        this.f16187 = true;
        this.f16184 = i;
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ۧ */
    public final void mo8538(boolean z) {
        this.f16207 = z;
    }
}
