package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20313 implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Bitmap f65584;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f65585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f65586;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f65587;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C3764 f65588;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Bitmap f65589;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9545 f65590;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f65591;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12392 f65592;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f65593;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f65594;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bitmap f65595;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f65596;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65597;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public AbstractC2489 f65598;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public ListView f65599;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f65600;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ActivityC17169 f65601;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21724 f65602;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f65603;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65604;

    public ViewOnClickListenerC20313(AbstractC14346 abstractC14346, C12392 c12392, AbstractC2489 abstractC2489) {
        List list = Collections.EMPTY_LIST;
        this.f65593 = list;
        this.f65600 = list;
        this.f65585 = list;
        this.f65586 = list;
        this.f65594 = list;
        this.f65597 = new ArrayList();
        this.f65604 = new ArrayList();
        this.f65596 = false;
        ActivityC17169 activityC17169 = (ActivityC17169) abstractC14346.requireActivity();
        this.f65601 = activityC17169;
        this.f65603 = abstractC14346;
        this.f65592 = c12392;
        this.f65598 = abstractC2489;
        this.f65588 = (C3764) new C4741(activityC17169).m13885(C3764.class);
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C21943.f70270) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C11266.m27880(13.0f));
        int iM27878 = C11266.m27878(25.0f);
        int iM27879 = C11266.m27878(12.5f);
        int iM278710 = C11266.m27878(11.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM27879;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f65591 = Bitmap.createBitmap(iM27878, iM27878, config);
        Canvas canvas = new Canvas(this.f65591);
        AbstractC21294 abstractC21294 = C19883.f64226;
        paint.setColor(abstractC21294.mo7429());
        paint2.setColor(abstractC21294.mo7430());
        float f5 = iM278710;
        canvas.drawCircle(f3, f3, f5, paint);
        canvas.drawText("C", f3, f4, paint2);
        this.f65589 = Bitmap.createBitmap(iM27878, iM27878, config);
        Canvas canvas2 = new Canvas(this.f65589);
        AbstractC21294 abstractC21295 = C19883.f64218;
        paint.setColor(abstractC21295.mo7429());
        paint2.setColor(abstractC21295.mo7430());
        canvas2.drawCircle(f3, f3, f5, paint);
        canvas2.drawText("M", f3, f4, paint2);
        this.f65595 = Bitmap.createBitmap(iM27878, iM27878, config);
        Canvas canvas3 = new Canvas(this.f65595);
        AbstractC21294 abstractC21296 = C19883.f64230;
        paint.setColor(abstractC21296.mo7429());
        paint2.setColor(abstractC21296.mo7430());
        canvas3.drawCircle(f3, f3, f5, paint);
        canvas3.drawText("F", f3, f4, paint2);
        this.f65584 = Bitmap.createBitmap(iM27878, iM27878, config);
        Canvas canvas4 = new Canvas(this.f65584);
        AbstractC21294 abstractC21297 = C19883.f64244;
        paint.setColor(abstractC21297.mo7429());
        paint2.setColor(abstractC21297.mo7430());
        canvas4.drawCircle(f3, f3, f5, paint);
        canvas4.drawText("S", f3, f4, paint2);
        View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        C23592 c23592 = (C23592) viewM10216.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        this.f65599 = listView;
        C21724 c21724 = new C21724(this);
        this.f65602 = c21724;
        listView.setAdapter((ListAdapter) c21724);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        listView.setFastScrollEnabled(true);
        C4915.m14284(listView);
        textView.setText(R.string.MT_Protector);
        c23592.m52055(new C15372(this, textView));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44421(viewM10216);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44442(R.string.MT_Protector, null);
        this.f65587 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46590(List list, List list2, List list3, List list4) {
        this.f65593 = list;
        this.f65600 = list2;
        this.f65585 = list3;
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        C6083.sort(arrayList, new Comparator() { // from class: l.ۡܿۢ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iM34580;
                int iM34581;
                int i;
                int iM34577;
                int iM34578;
                this.f27390.getClass();
                boolean z = obj instanceof C8839;
                if (z) {
                    iM34580 = ((C8839) obj).m22834();
                } else {
                    iM34580 = obj instanceof C14482 ? ((C14482) obj).m34580() : ((C23655) obj).m52184();
                }
                boolean z2 = obj2 instanceof C8839;
                if (z2) {
                    iM34581 = ((C8839) obj2).m22834();
                } else {
                    iM34581 = obj2 instanceof C14482 ? ((C14482) obj2).m34580() : ((C23655) obj2).m52184();
                }
                int iCompare = Integer.compare(iM34580, iM34581);
                if (iCompare != 0) {
                    return iCompare;
                }
                int i2 = 2;
                if (z) {
                    i = 0;
                } else {
                    i = obj instanceof C14482 ? 1 : 2;
                }
                if (z2) {
                    i2 = 0;
                } else if (obj2 instanceof C14482) {
                    i2 = 1;
                }
                int iCompare2 = Integer.compare(i, i2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                if (z2) {
                    iM34577 = ((C8839) obj2).m22832();
                } else {
                    iM34577 = obj2 instanceof C14482 ? ((C14482) obj2).m34577() : ((C23655) obj2).m52180();
                }
                if (z) {
                    iM34578 = ((C8839) obj).m22832();
                } else {
                    iM34578 = obj instanceof C14482 ? ((C14482) obj).m34577() : ((C23655) obj).m52180();
                }
                return Integer.compare(iM34577, iM34578);
            }
        });
        this.f65586 = arrayList;
        this.f65594 = list4;
        this.f65602.m49050();
        if (this.f65587.m1442()) {
            if (this.f65596) {
                m46580();
            } else {
                m46584();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46567(ViewOnClickListenerC20313 viewOnClickListenerC20313, Object obj, String str) {
        if (obj instanceof C8839) {
            C8839 c8839 = (C8839) obj;
            return C9679.m24616((CharSequence) c8839.m22833(), (CharSequence) str) || C9679.m24616((CharSequence) c8839.m22835(), (CharSequence) str);
        }
        if (obj instanceof C14482) {
            C14482 c14482 = (C14482) obj;
            return C9679.m24616((CharSequence) c14482.m34581(), (CharSequence) str) || C9679.m24616((CharSequence) c14482.m34576(), (CharSequence) str);
        }
        C23655 c23655 = (C23655) obj;
        return C9679.m24616((CharSequence) c23655.m52181(), (CharSequence) str) || C9679.m24616((CharSequence) c23655.m52178(), (CharSequence) str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46591() {
        this.f65602.notifyDataSetChanged();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f65587;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1448().setOnClickListener(this);
        dialogInterfaceC0206.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ۖܿۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC20313.m46581(this.f8376);
            }
        });
        if (this.f65596) {
            m46580();
        } else {
            m46584();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m46584() {
        Object objMo7979 = this.f65598.mo7979();
        if (objMo7979 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f65597;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == objMo7979) {
                this.f65599.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m46580() {
        this.f65590 = null;
        C12392 c12392 = this.f65592;
        int iM30444 = c12392.m30444();
        int iM30448 = c12392.m30448();
        if (iM30444 <= iM30448) {
            iM30444 = iM30448;
            iM30448 = iM30444;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f65604;
            if (i >= arrayList.size()) {
                return;
            }
            C9545 c9545 = (C9545) arrayList.get(i);
            int iM24416 = c9545.m24416();
            int iM24415 = c9545.m24415();
            if (iM24416 > iM30444) {
                return;
            }
            if (iM30448 >= iM24416 && iM30444 <= iM24415) {
                this.f65590 = c9545;
                this.f65599.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46581(ViewOnClickListenerC20313 viewOnClickListenerC20313) {
        ActivityC17169 activityC17169 = viewOnClickListenerC20313.f65601;
        final View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        final int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        int i = ApplicationC20075.f65008.getInt("dnm", 0);
        for (int i2 = 0; i2 < 21; i2++) {
            C2978 c2978 = (C2978) viewM10216.findViewById(iArr[i2]);
            boolean z = true;
            if (((1 << i2) & i) != 0) {
                z = false;
            }
            c2978.setChecked(z);
        }
        C19258 c19258BuildDialog = activityC17169.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ܿۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = 0;
                for (int i5 = 0; i5 < 21; i5++) {
                    if (!((C2978) viewM10216.findViewById(iArr[i5])).isChecked()) {
                        i4 |= 1 << i5;
                    }
                }
                ApplicationC20075.f65008.edit().mo25853(i4, "dnm").apply();
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = this.f65596;
        C12392 c12392 = this.f65592;
        if (z) {
            C9545 c9545 = (C9545) this.f65604.get(i);
            c12392.mo25922(c9545.m24416(), c9545.m24415());
        } else {
            Object obj = this.f65597.get(i);
            if (obj instanceof C8839) {
                c12392.mo25919(((C8839) obj).m22834());
            } else if (obj instanceof C14482) {
                c12392.mo25919(((C14482) obj).m34580());
            } else {
                c12392.mo25919(((C23655) obj).m52184());
            }
        }
        c12392.m30430(false);
        this.f65587.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        if (this.f65596) {
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c21282.m48302(new InterfaceC14930() { // from class: l.ۜܿۢ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C4925.m14314((CharSequence) ((C9545) this.f21315.f65604.get(i)).m24417());
                    return true;
                }
            });
        } else {
            Object obj = this.f65597.get(i);
            final C8839 c8839 = obj instanceof C8839 ? (C8839) obj : null;
            final C14482 c14482 = obj instanceof C14482 ? (C14482) obj : null;
            final C23655 c23655 = obj instanceof C23655 ? (C23655) obj : null;
            int i2 = ApplicationC20075.f65008.getInt("dnm", 0);
            if (c8839 != null) {
                if ((i2 & 1) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 16) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
            } else if (c14482 != null) {
                if ((i2 & 32) == 0) {
                    SubMenu subMenuAddSubMenu = c21282.m48304().addSubMenu(R.string.MT_Protector);
                    String[] stringArray = this.f65601.getResources().getStringArray(R.array.MT_Protector);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 0, 0, stringArray[0]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 1, 0, stringArray[1]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 2, 0, stringArray[2]);
                }
                if ((i2 & 64) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 128) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 256) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 512) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f65593.isEmpty());
                }
                if ((i2 & 1024) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f65593.isEmpty());
                }
            } else if (c23655 != null) {
                if ((i2 & 2048) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4096) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8192) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                int i3 = i2 & 16384;
                AbstractC14346 abstractC14346 = this.f65603;
                if (i3 == 0 && (abstractC14346 instanceof C6306)) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((32768 & i2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((65536 & i2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f65593.isEmpty());
                }
                if ((131072 & i2) == 0) {
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled((this.f65593.isEmpty() || c23655.m52181().equals("<clinit>")) ? false : true);
                }
                if (abstractC14346 instanceof C6306) {
                    if ((262144 & i2) == 0) {
                        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((524288 & i2) == 0) {
                        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((i2 & 1048576) == 0) {
                        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                }
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.ܺܿۢ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return ViewOnClickListenerC20313.m46568(this.f49557, c8839, c14482, c23655, menuItem);
                }
            });
        }
        c21282.m48305();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:233:0x040a  */
    /* JADX WARN: Code duplicated, block: B:301:0x051f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46568(final ViewOnClickListenerC20313 viewOnClickListenerC20313, final C8839 c8839, final C14482 c14482, final C23655 c23655, MenuItem menuItem) {
        String strM28975;
        String strM33379;
        AbstractC14346 abstractC14346 = viewOnClickListenerC20313.f65603;
        DialogInterfaceC0206 dialogInterfaceC0206 = viewOnClickListenerC20313.f65587;
        C12392 c12392 = viewOnClickListenerC20313.f65592;
        ActivityC17169 activityC17169 = viewOnClickListenerC20313.f65601;
        final int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        if (itemId == R.string.MT_Protector) {
            if (c8839 != null) {
                strM33379 = C13940.m33377(c8839);
            } else if (c14482 != null) {
                C8839 c8839M46560 = viewOnClickListenerC20313.m46560(c14482.m34580(), c14482.m34577(), c14482.m34579());
                if (c8839M46560 != null) {
                    strM33379 = C13940.m33378(c8839M46560, c14482, viewOnClickListenerC20313.m46558(c8839M46560.m22835()));
                }
            } else if (c23655 != null) {
                C8839 c8839M46561 = viewOnClickListenerC20313.m46560(c23655.m52184(), c23655.m52180(), c23655.m52182());
                if (c8839M46561 != null) {
                    strM33379 = C13940.m33379(c8839M46561, c23655, viewOnClickListenerC20313.m46558(c8839M46561.m22835()));
                }
            }
            C4925.m14314((CharSequence) strM33379);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (c8839 != null) {
                strM28975 = C11867.m28973(c8839);
            } else if (c14482 != null) {
                C8839 c8839M46562 = viewOnClickListenerC20313.m46560(c14482.m34580(), c14482.m34577(), c14482.m34579());
                if (c8839M46562 != null) {
                    strM28975 = C11867.m28974(c8839M46562, c14482);
                }
            } else if (c23655 != null) {
                C8839 c8839M46563 = viewOnClickListenerC20313.m46560(c23655.m52184(), c23655.m52180(), c23655.m52182());
                if (c8839M46563 != null) {
                    strM28975 = C11867.m28975(c8839M46563, c23655);
                }
            }
            C4925.m14314((CharSequence) strM28975);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC17169.m40341(((C6306) abstractC14346).m17420(), c23655.m52183());
            dialogInterfaceC0206.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC17169.m40342(((C6306) abstractC14346).m17420(), c23655.m52183(), (ArrayList) null, false);
            dialogInterfaceC0206.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C4925.m14314((CharSequence) c8839.m22835());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM46557 = viewOnClickListenerC20313.m46557(c23655);
            StringBuilder sbM19190 = C7166.m19190(strM46557 != null ? strM46557 : "???", "->");
            sbM19190.append(c23655.m52183());
            C4925.m14314((CharSequence) sbM19190.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM46556 = viewOnClickListenerC20313.m46556(c14482);
            StringBuilder sbM19191 = C7166.m19190(strM46556 != null ? strM46556 : "???", "->");
            sbM19191.append(c14482.m34582());
            C4925.m14314((CharSequence) sbM19191.toString());
            return true;
        }
        String str = "???";
        if (itemId == R.string.MT_Protector) {
            String strM46558 = viewOnClickListenerC20313.m46556(c14482);
            if (strM46558 == null) {
                strM46558 = str;
            }
            CharSequence charSequenceM46574 = viewOnClickListenerC20313.m46574(viewOnClickListenerC20313.m46556(c14482));
            boolean zContains = (charSequenceM46574 != null ? C4811.m14020(charSequenceM46574, c14482) : "").contains("static");
            StringBuilder sb = new StringBuilder(zContains ? "sget" : "iget");
            if (c14482.m34578().length() <= 1) {
                String strM34578 = c14482.m34578();
                strM34578.getClass();
                switch (strM34578) {
                    case "B":
                        sb.append("-byte");
                        break;
                    case "C":
                        sb.append("-char");
                        break;
                    case "D":
                    case "J":
                        sb.append("-wide");
                        break;
                    case "S":
                        sb.append("-short");
                        break;
                    case "Z":
                        sb.append("-boolean");
                        break;
                }
            } else {
                sb.append("-object");
            }
            sb.append(" v0, ");
            if (!zContains) {
                sb.append("v1, ");
            }
            sb.append(strM46558);
            sb.append("->");
            sb.append(c14482.m34582());
            sb.append("\n");
            C4925.m14314((CharSequence) sb.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM46559 = viewOnClickListenerC20313.m46556(c14482);
            str = strM46559 != null ? strM46559 : "???";
            CharSequence charSequenceM46575 = viewOnClickListenerC20313.m46574(viewOnClickListenerC20313.m46556(c14482));
            boolean zContains2 = (charSequenceM46575 != null ? C4811.m14020(charSequenceM46575, c14482) : "").contains("static");
            StringBuilder sb2 = new StringBuilder(zContains2 ? "sput" : "iput");
            if (c14482.m34578().length() <= 1) {
                String strM34579 = c14482.m34578();
                strM34579.getClass();
                switch (strM34579) {
                    case "B":
                        sb2.append("-byte");
                        break;
                    case "C":
                        sb2.append("-char");
                        break;
                    case "D":
                    case "J":
                        sb2.append("-wide");
                        break;
                    case "S":
                        sb2.append("-short");
                        break;
                    case "Z":
                        sb2.append("-boolean");
                        break;
                }
            } else {
                sb2.append("-object");
            }
            sb2.append(" v0, ");
            if (!zContains2) {
                sb2.append("v1, ");
            }
            sb2.append(str);
            sb2.append("->");
            sb2.append(c14482.m34582());
            sb2.append("\n");
            C4925.m14314((CharSequence) sb2.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM465510 = viewOnClickListenerC20313.m46557(c23655);
            if (strM465510 == null) {
                strM465510 = str;
            }
            CharSequence charSequenceM46576 = viewOnClickListenerC20313.m46574(viewOnClickListenerC20313.m46557(c23655));
            String[] strArr = charSequenceM46576 != null ? new String[]{C4811.m14025(charSequenceM46576), C4811.m14021(charSequenceM46576, c23655)} : new String[]{"", ""};
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb3 = new StringBuilder("invoke");
            if (str3.contains("static")) {
                sb3.append("-static");
            } else if (str3.contains("private") || str3.contains("constructor")) {
                sb3.append("-direct");
            } else if (str2.contains("interface")) {
                sb3.append("-interface");
            } else {
                sb3.append("-virtual");
            }
            String strM52176 = c23655.m52176();
            int i = !str3.contains("static") ? 1 : 0;
            C13277 c13277 = new C13277(strM52176);
            while (true) {
                String strM32240 = c13277.m32240();
                if (strM32240 == null) {
                    break;
                }
                i = (strM32240.equals("D") || strM32240.equals("J")) ? i + 2 : i + 1;
            }
            if (i > 5) {
                sb3.append("/range {v0 .. v");
                sb3.append(i - 1);
                sb3.append("}, ");
            } else {
                sb3.append(" {");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append('v');
                    sb3.append(i2);
                }
                sb3.append("}, ");
            }
            sb3.append(strM465510);
            sb3.append("->");
            sb3.append(c23655.m52183());
            sb3.append("\n");
            String strM52179 = c23655.m52179();
            if (strM52179.length() <= 1) {
                switch (strM52179) {
                    case "D":
                    case "J":
                        sb3.append("move-result-wide v0\n");
                        break;
                    case "V":
                        break;
                    default:
                        sb3.append("move-result v0\n");
                        break;
                }
            } else {
                sb3.append("move-result-object v0\n");
            }
            C4925.m14314((CharSequence) sb3.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C4925.m14314((CharSequence) c12392.m30436().mo26557(c23655.m52184(), c23655.m52180()));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                activityC17169.m40363(new Runnable() { // from class: l.ᩴܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46577(this.f59570, c23655);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                activityC17169.m40363(new Runnable() { // from class: l.᩵ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46563(this.f63323, c8839);
                    }
                });
                return true;
            }
            if (groupId == R.string.MT_Protector) {
                activityC17169.m40363(new Runnable() { // from class: l.֡ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46565(this.f2237, c14482, itemId);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                if (c8839 != null) {
                    activityC17169.m40363(new Runnable() { // from class: l.ۚܿۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC20313.m46576(this.f17048, c8839);
                        }
                    });
                    return true;
                }
                activityC17169.m40363(new Runnable() { // from class: l.֨ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20313.m46566(this.f4472, c23655);
                    }
                });
            }
            return true;
        }
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', c23655.m52184() + 1);
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', c23655.m52180() - 1);
        String strM14022 = C4811.m14022(interfaceC7785M30436.mo26557(c23655.m52184(), iIndexOf).trim());
        boolean zContains3 = strM14022.contains("static");
        boolean z = strM14022.contains(UMConfigure.WRAPER_TYPE_NATIVE) || strM14022.contains("abstract");
        String strM24607 = C9679.m24607(' ', c12392.m30361());
        StringBuilder sb4 = new StringBuilder();
        if (!z) {
            String strM52177 = c23655.m52176();
            int i3 = !zContains3 ? 1 : 0;
            C13277 c13278 = new C13277(strM52177);
            while (true) {
                String strM32241 = c13278.m32240();
                if (strM32241 == null) {
                    break;
                }
                i3 = (strM32241.equals("D") || strM32241.equals("J")) ? i3 + 2 : i3 + 1;
            }
            String strM521710 = c23655.m52179();
            strM521710.getClass();
            switch (strM521710) {
                case "B":
                case "C":
                case "F":
                case "I":
                case "S":
                case "Z":
                    sb4.append(strM24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", strM24607, "const/4 v0, 0x0\n\n", strM24607);
                    sb4.append("return v0\n");
                    break;
                case "D":
                case "J":
                    sb4.append(strM24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 2));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", strM24607, "const-wide/16 v0, 0x0\n\n", strM24607);
                    sb4.append("return-wide v0\n");
                    break;
                case "V":
                    sb4.append(strM24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C20177.m46410(sb4, "\n\n", strM24607, "return-void\n");
                    break;
                default:
                    sb4.append(strM24607);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, "\n\n", strM24607, "const/4 v0, 0x0\n\n", strM24607);
                    sb4.append("return-object v0\n");
                    break;
            }
        }
        if (iIndexOf != -1 && iLastIndexOf != -1) {
            interfaceC7785M30436.replace(iIndexOf + 1, iLastIndexOf + 1, sb4);
            c12392.mo25922(c23655.m52184(), sb4.length() + (c23655.m52180() - (iLastIndexOf - iIndexOf)));
            c12392.m30430(false);
        }
        dialogInterfaceC0206.dismiss();
        return true;
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46577(ViewOnClickListenerC20313 viewOnClickListenerC20313, C23655 c23655) {
        C11825 c11825 = new C11825();
        c11825.f35279 = 1;
        c11825.f35280 = c23655.m52183();
        String strM46557 = viewOnClickListenerC20313.m46557(c23655);
        if (strM46557 == null) {
            C21374.m48459((CharSequence) "Can not detect the class name.");
            return;
        }
        viewOnClickListenerC20313.f65587.dismiss();
        c11825.f35277 = strM46557;
        viewOnClickListenerC20313.f65588.m11387(c11825);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46563(ViewOnClickListenerC20313 viewOnClickListenerC20313, C8839 c8839) {
        C11825 c11825 = new C11825();
        c11825.f35279 = 0;
        c11825.f35277 = c8839.m22835();
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11407(c11825);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46565(ViewOnClickListenerC20313 viewOnClickListenerC20313, C14482 c14482, int i) {
        C11825 c11825 = new C11825();
        String strM46556 = viewOnClickListenerC20313.m46556(c14482);
        if (strM46556 == null) {
            C21374.m48459((CharSequence) "Can not detect the class name.");
            return;
        }
        c11825.f35279 = 2;
        c11825.f35280 = c14482.m34582();
        c11825.f35276 = i;
        c11825.f35277 = strM46556;
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11414(c11825);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46576(ViewOnClickListenerC20313 viewOnClickListenerC20313, C8839 c8839) {
        C11825 c11825 = new C11825();
        c11825.f35279 = 0;
        c11825.f35277 = c8839.m22835();
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11414(c11825);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46566(ViewOnClickListenerC20313 viewOnClickListenerC20313, C23655 c23655) {
        final C11825 c11825 = new C11825();
        String strM46557 = viewOnClickListenerC20313.m46557(c23655);
        if (strM46557 == null) {
            C21374.m48459((CharSequence) "Can not detect the class name.");
            return;
        }
        c11825.f35279 = 1;
        c11825.f35277 = strM46557;
        c11825.f35280 = c23655.m52183();
        final RunnableC21019 runnableC21019 = new RunnableC21019(viewOnClickListenerC20313, c11825);
        if (!c23655.m52177()) {
            runnableC21019.run();
            return;
        }
        C19258 c19258BuildDialog = viewOnClickListenerC20313.f65601.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19257(1, runnableC21019));
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܿۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c11825.f35278 = true;
                runnableC21019.run();
            }
        });
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC21640(1, viewOnClickListenerC20313));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46564(ViewOnClickListenerC20313 viewOnClickListenerC20313, C11825 c11825) {
        viewOnClickListenerC20313.f65587.dismiss();
        viewOnClickListenerC20313.f65588.m11414(c11825);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private CharSequence m46574(String str) {
        AbstractC14346 abstractC14346 = this.f65603;
        if (abstractC14346 instanceof C6306) {
            return this.f65592.m30436();
        }
        if (!(abstractC14346 instanceof C16475)) {
            return null;
        }
        try {
            String strM38819 = ((C16475) abstractC14346).m38819();
            if (!TextUtils.isEmpty(str) && str.startsWith("L") && str.endsWith(l.b)) {
                strM38819 = str.substring(1, str.length() - 1);
            }
            return this.f65601.m40362(strM38819);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m46589() {
        if (this.f65593.isEmpty()) {
            CharSequence charSequenceM46574 = m46574((String) null);
            if (charSequenceM46574 != null) {
                return AbstractC2489.m7978(charSequenceM46574);
            }
            return null;
        }
        return ((C8839) this.f65593.get(0)).m22835();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m46556(C14482 c14482) {
        String strM34579 = c14482.m34579();
        int iM34580 = c14482.m34580();
        int iM34577 = c14482.m34577();
        if (!TextUtils.isEmpty(strM34579)) {
            return strM34579;
        }
        C8839 c8839M46559 = m46559(iM34580, iM34577);
        if (c8839M46559 != null) {
            return c8839M46559.m22835();
        }
        return m46589();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m46557(C23655 c23655) {
        String strM52182 = c23655.m52182();
        int iM52184 = c23655.m52184();
        int iM52180 = c23655.m52180();
        if (!TextUtils.isEmpty(strM52182)) {
            return strM52182;
        }
        C8839 c8839M46559 = m46559(iM52184, iM52180);
        if (c8839M46559 != null) {
            return c8839M46559.m22835();
        }
        return m46589();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m46558(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f65585;
        }
        ArrayList arrayList = new ArrayList();
        for (C23655 c23655 : this.f65585) {
            if (str.equals(c23655.m52182())) {
                arrayList.add(c23655);
            }
        }
        return arrayList.isEmpty() ? this.f65585 : arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8839 m46560(int i, int i2, String str) {
        C8839 c8839;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = this.f65593.iterator();
            do {
                if (!it.hasNext()) {
                    c8839 = null;
                    break;
                }
                c8839 = (C8839) it.next();
            } while (!str.equals(c8839.m22835()));
        } else {
            c8839 = null;
            break;
        }
        if (c8839 != null) {
            return c8839;
        }
        C8839 c8839M46559 = m46559(i, i2);
        if (c8839M46559 != null) {
            return c8839M46559;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("L") || !str.endsWith(l.b)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47) + 1;
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return new C8839(str, C15472.m36561(1, iLastIndexOf, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8839 m46559(int i, int i2) {
        int iM22832;
        C8839 c8839 = null;
        int i3 = Integer.MAX_VALUE;
        for (C8839 c88310 : this.f65593) {
            if (i >= c88310.m22834() && i2 <= c88310.m22832() && (iM22832 = c88310.m22832() - c88310.m22834()) < i3) {
                c8839 = c88310;
                i3 = iM22832;
            }
        }
        return c8839;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f65596 && this.f65604.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = this.f65596;
        this.f65596 = !z;
        if (!z) {
            m46580();
        }
        this.f65592.postDelayed(new Runnable() { // from class: l.ۘܿۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20313.m46575(this.f13014);
            }
        }, 100L);
        this.f65602.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46575(ViewOnClickListenerC20313 viewOnClickListenerC20313) {
        if (viewOnClickListenerC20313.f65596) {
            viewOnClickListenerC20313.m46580();
        } else {
            viewOnClickListenerC20313.m46584();
        }
    }
}
