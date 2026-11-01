package p067l;

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
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class ViewOnClickListenerC21674 implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֫֫ */
    public Bitmap f68259;

    /* JADX INFO: renamed from: ۗ */
    public List f68260;

    /* JADX INFO: renamed from: ۙ */
    public List f68261;

    /* JADX INFO: renamed from: ۛ */
    public DialogInterfaceC2564 f68262;

    /* JADX INFO: renamed from: ۜ֫ */
    public C5946 f68263;

    /* JADX INFO: renamed from: ۟ */
    public Bitmap f68264;

    /* JADX INFO: renamed from: ۤ */
    public C11440 f68265;

    /* JADX INFO: renamed from: ۧ֫ */
    public Bitmap f68266;

    /* JADX INFO: renamed from: ۨ */
    public C14146 f68267;

    /* JADX INFO: renamed from: ۫ */
    public List f68268;

    /* JADX INFO: renamed from: ۬ */
    public List f68269;

    /* JADX INFO: renamed from: ܰ */
    public Bitmap f68270;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f68271;

    /* JADX INFO: renamed from: ܽ֫ */
    public final ArrayList f68272;

    /* JADX INFO: renamed from: ܿ֫ */
    public AbstractC4734 f68273;

    /* JADX INFO: renamed from: ᩳ֫ */
    public ListView f68274;

    /* JADX INFO: renamed from: ᩶ */
    public List f68275;

    /* JADX INFO: renamed from: ᩸ */
    public ActivityC18686 f68276;

    /* JADX INFO: renamed from: ᩹ */
    public C23015 f68277;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC16003 f68278;

    /* JADX INFO: renamed from: ᩻֫ */
    public final ArrayList f68279;

    public ViewOnClickListenerC21674(AbstractC16003 abstractC16003, C14146 c14146, AbstractC4734 abstractC4734) {
        List list = Collections.EMPTY_LIST;
        this.f68268 = list;
        this.f68275 = list;
        this.f68260 = list;
        this.f68261 = list;
        this.f68269 = list;
        this.f68272 = new ArrayList();
        this.f68279 = new ArrayList();
        this.f68271 = false;
        ActivityC18686 activityC18686 = (ActivityC18686) abstractC16003.requireActivity();
        this.f68276 = activityC18686;
        this.f68278 = abstractC16003;
        this.f68267 = c14146;
        this.f68273 = abstractC4734;
        this.f68263 = (C5946) new C6874(activityC18686).m15765(C5946.class);
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C23223.f72981) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C13076.m29941(13.0f));
        int iM29939 = C13076.m29939(25.0f);
        int iM299310 = C13076.m29939(12.5f);
        int iM299311 = C13076.m29939(11.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM299310;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f68266 = Bitmap.createBitmap(iM29939, iM29939, config);
        Canvas canvas = new Canvas(this.f68266);
        AbstractC22606 abstractC22606 = C21265.f66862;
        paint.setColor(abstractC22606.mo9511());
        paint2.setColor(abstractC22606.mo9512());
        float f5 = iM299311;
        canvas.drawCircle(f3, f3, f5, paint);
        canvas.drawText("C", f3, f4, paint2);
        this.f68264 = Bitmap.createBitmap(iM29939, iM29939, config);
        Canvas canvas2 = new Canvas(this.f68264);
        AbstractC22606 abstractC22607 = C21265.f66854;
        paint.setColor(abstractC22607.mo9511());
        paint2.setColor(abstractC22607.mo9512());
        canvas2.drawCircle(f3, f3, f5, paint);
        canvas2.drawText("M", f3, f4, paint2);
        this.f68270 = Bitmap.createBitmap(iM29939, iM29939, config);
        Canvas canvas3 = new Canvas(this.f68270);
        AbstractC22606 abstractC22608 = C21265.f66866;
        paint.setColor(abstractC22608.mo9511());
        paint2.setColor(abstractC22608.mo9512());
        canvas3.drawCircle(f3, f3, f5, paint);
        canvas3.drawText("F", f3, f4, paint2);
        this.f68259 = Bitmap.createBitmap(iM29939, iM29939, config);
        Canvas canvas4 = new Canvas(this.f68259);
        AbstractC22606 abstractC22609 = C21265.f66880;
        paint.setColor(abstractC22609.mo9511());
        paint2.setColor(abstractC22609.mo9512());
        canvas4.drawCircle(f3, f3, f5, paint);
        canvas4.drawText("S", f3, f4, paint2);
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        C24790 c24790 = (C24790) viewM12252.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        this.f68274 = listView;
        C23015 c23015 = new C23015(this);
        this.f68277 = c23015;
        listView.setAdapter((ListAdapter) c23015);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        listView.setFastScrollEnabled(true);
        C7040.m16181(listView);
        textView.setText(R.string.MT_Protector);
        c24790.m54458(new C16978(this, textView));
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC18686);
        c20671.m46715(viewM12252);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46736(R.string.MT_Protector, null);
        this.f68262 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48913(List list, List list2, List list3, List list4) {
        this.f68268 = list;
        this.f68275 = list2;
        this.f68260 = list3;
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        C8150.sort(arrayList, new Comparator() { // from class: l.ۡܿۢ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iM36721;
                int iM36722;
                int i;
                int iM36718;
                int iM36719;
                this.f30326.getClass();
                boolean z = obj instanceof C10769;
                if (z) {
                    iM36721 = ((C10769) obj).m24804();
                } else {
                    iM36721 = obj instanceof C16132 ? ((C16132) obj).m36721() : ((C24850) obj).m54587();
                }
                boolean z2 = obj2 instanceof C10769;
                if (z2) {
                    iM36722 = ((C10769) obj2).m24804();
                } else {
                    iM36722 = obj2 instanceof C16132 ? ((C16132) obj2).m36721() : ((C24850) obj2).m54587();
                }
                int iCompare = Integer.compare(iM36721, iM36722);
                if (iCompare != 0) {
                    return iCompare;
                }
                int i2 = 2;
                if (z) {
                    i = 0;
                } else {
                    i = obj instanceof C16132 ? 1 : 2;
                }
                if (z2) {
                    i2 = 0;
                } else if (obj2 instanceof C16132) {
                    i2 = 1;
                }
                int iCompare2 = Integer.compare(i, i2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                if (z2) {
                    iM36718 = ((C10769) obj2).m24802();
                } else {
                    iM36718 = obj2 instanceof C16132 ? ((C16132) obj2).m36718() : ((C24850) obj2).m54583();
                }
                if (z) {
                    iM36719 = ((C10769) obj).m24802();
                } else {
                    iM36719 = obj instanceof C16132 ? ((C16132) obj).m36718() : ((C24850) obj).m54583();
                }
                return Integer.compare(iM36718, iM36719);
            }
        });
        this.f68261 = arrayList;
        this.f68269 = list4;
        this.f68277.m51399();
        if (this.f68262.m3855()) {
            if (this.f68271) {
                m48903();
            } else {
                m48907();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48890(ViewOnClickListenerC21674 viewOnClickListenerC21674, Object obj, String str) {
        if (obj instanceof C10769) {
            C10769 c10769 = (C10769) obj;
            return C11567.m26630((CharSequence) c10769.m24803(), (CharSequence) str) || C11567.m26630((CharSequence) c10769.m24805(), (CharSequence) str);
        }
        if (obj instanceof C16132) {
            C16132 c16132 = (C16132) obj;
            return C11567.m26630((CharSequence) c16132.m36722(), (CharSequence) str) || C11567.m26630((CharSequence) c16132.m36717(), (CharSequence) str);
        }
        C24850 c24850 = (C24850) obj;
        return C11567.m26630((CharSequence) c24850.m54584(), (CharSequence) str) || C11567.m26630((CharSequence) c24850.m54581(), (CharSequence) str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48914() {
        this.f68277.notifyDataSetChanged();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f68262;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3861().setOnClickListener(this);
        dialogInterfaceC2564.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.ۖܿۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC21674.m48904(this.f11171);
            }
        });
        if (this.f68271) {
            m48903();
        } else {
            m48907();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48907() {
        Object objMo10027 = this.f68273.mo10027();
        if (objMo10027 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f68272;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == objMo10027) {
                this.f68274.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48903() {
        this.f68265 = null;
        C14146 c14146 = this.f68267;
        int iM32508 = c14146.m32508();
        int iM32512 = c14146.m32512();
        if (iM32508 <= iM32512) {
            iM32508 = iM32512;
            iM32512 = iM32508;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f68279;
            if (i >= arrayList.size()) {
                return;
            }
            C11440 c11440 = (C11440) arrayList.get(i);
            int iM26427 = c11440.m26427();
            int iM26426 = c11440.m26426();
            if (iM26427 > iM32508) {
                return;
            }
            if (iM32512 >= iM26427 && iM32508 <= iM26426) {
                this.f68265 = c11440;
                this.f68274.setSelection(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m48904(ViewOnClickListenerC21674 viewOnClickListenerC21674) {
        ActivityC18686 activityC18686 = viewOnClickListenerC21674.f68276;
        final View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        final int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        int i = ApplicationC21448.f67649.getInt("dnm", 0);
        for (int i2 = 0; i2 < 21; i2++) {
            C0990 c0990 = (C0990) viewM12252.findViewById(iArr[i2]);
            boolean z = true;
            if (((1 << i2) & i) != 0) {
                z = false;
            }
            c0990.setChecked(z);
        }
        C20671 c20671BuildDialog = activityC18686.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ܿۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = 0;
                for (int i5 = 0; i5 < 21; i5++) {
                    if (!((C0990) viewM12252.findViewById(iArr[i5])).isChecked()) {
                        i4 |= 1 << i5;
                    }
                }
                ApplicationC21448.f67649.edit().mo27875(i4, "dnm").apply();
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = this.f68271;
        C14146 c14146 = this.f68267;
        if (z) {
            C11440 c11440 = (C11440) this.f68279.get(i);
            c14146.mo27944(c11440.m26427(), c11440.m26426());
        } else {
            Object obj = this.f68272.get(i);
            if (obj instanceof C10769) {
                c14146.mo27941(((C10769) obj).m24804());
            } else if (obj instanceof C16132) {
                c14146.mo27941(((C16132) obj).m36721());
            } else {
                c14146.mo27941(((C24850) obj).m54587());
            }
        }
        c14146.m32494(false);
        this.f68262.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        if (this.f68271) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c1898.m50636(new InterfaceC1583() { // from class: l.ۜܿۢ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C7050.m16211((CharSequence) ((C11440) this.f24194.f68279.get(i)).m26428());
                    return true;
                }
            });
        } else {
            Object obj = this.f68272.get(i);
            final C10769 c10769 = obj instanceof C10769 ? (C10769) obj : null;
            final C16132 c16132 = obj instanceof C16132 ? (C16132) obj : null;
            final C24850 c24850 = obj instanceof C24850 ? (C24850) obj : null;
            int i2 = ApplicationC21448.f67649.getInt("dnm", 0);
            if (c10769 != null) {
                if ((i2 & 1) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 2) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 16) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
            } else if (c16132 != null) {
                if ((i2 & 32) == 0) {
                    SubMenu subMenuAddSubMenu = c1898.m50638().addSubMenu(R.string.MT_Protector);
                    String[] stringArray = this.f68276.getResources().getStringArray(R.array.MT_Protector);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 0, 0, stringArray[0]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 1, 0, stringArray[1]);
                    subMenuAddSubMenu.add(R.string.MT_Protector, 2, 0, stringArray[2]);
                }
                if ((i2 & 64) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 128) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 256) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 512) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f68268.isEmpty());
                }
                if ((i2 & 1024) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f68268.isEmpty());
                }
            } else if (c24850 != null) {
                if ((i2 & 2048) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 4096) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((i2 & 8192) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                int i3 = i2 & 16384;
                AbstractC16003 abstractC16003 = this.f68278;
                if (i3 == 0 && (abstractC16003 instanceof C8362)) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((32768 & i2) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                if ((65536 & i2) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!this.f68268.isEmpty());
                }
                if ((131072 & i2) == 0) {
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled((this.f68268.isEmpty() || c24850.m54584().equals("<clinit>")) ? false : true);
                }
                if (abstractC16003 instanceof C8362) {
                    if ((262144 & i2) == 0) {
                        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((524288 & i2) == 0) {
                        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                    if ((i2 & 1048576) == 0) {
                        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    }
                }
            }
            c1898.m50636(new InterfaceC1583() { // from class: l.ܺܿۢ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return ViewOnClickListenerC21674.m48891(this.f52720, c10769, c16132, c24850, menuItem);
                }
            });
        }
        c1898.m50639();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:233:0x040a  */
    /* JADX WARN: Code duplicated, block: B:301:0x051f  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m48891(final ViewOnClickListenerC21674 viewOnClickListenerC21674, final C10769 c10769, final C16132 c16132, final C24850 c24850, MenuItem menuItem) {
        String strM31026;
        String strM35498;
        AbstractC16003 abstractC16003 = viewOnClickListenerC21674.f68278;
        DialogInterfaceC2564 dialogInterfaceC2564 = viewOnClickListenerC21674.f68262;
        C14146 c14146 = viewOnClickListenerC21674.f68267;
        ActivityC18686 activityC18686 = viewOnClickListenerC21674.f68276;
        final int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        if (itemId == R.string.MT_Protector) {
            if (c10769 != null) {
                strM35498 = C15617.m35496(c10769);
            } else if (c16132 != null) {
                C10769 c10769M48883 = viewOnClickListenerC21674.m48883(c16132.m36721(), c16132.m36718(), c16132.m36720());
                if (c10769M48883 != null) {
                    strM35498 = C15617.m35497(c10769M48883, c16132, viewOnClickListenerC21674.m48881(c10769M48883.m24805()));
                }
            } else if (c24850 != null) {
                C10769 c10769M48884 = viewOnClickListenerC21674.m48883(c24850.m54587(), c24850.m54583(), c24850.m54585());
                if (c10769M48884 != null) {
                    strM35498 = C15617.m35498(c10769M48884, c24850, viewOnClickListenerC21674.m48881(c10769M48884.m24805()));
                }
            }
            C7050.m16211((CharSequence) strM35498);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (c10769 != null) {
                strM31026 = C13647.m31024(c10769);
            } else if (c16132 != null) {
                C10769 c10769M48885 = viewOnClickListenerC21674.m48883(c16132.m36721(), c16132.m36718(), c16132.m36720());
                if (c10769M48885 != null) {
                    strM31026 = C13647.m31025(c10769M48885, c16132);
                }
            } else if (c24850 != null) {
                C10769 c10769M48886 = viewOnClickListenerC21674.m48883(c24850.m54587(), c24850.m54583(), c24850.m54585());
                if (c10769M48886 != null) {
                    strM31026 = C13647.m31026(c10769M48886, c24850);
                }
            }
            C7050.m16211((CharSequence) strM31026);
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC18686.m42586(((C8362) abstractC16003).m19360(), c24850.m54586());
            dialogInterfaceC2564.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            activityC18686.m42587(((C8362) abstractC16003).m19360(), c24850.m54586(), (ArrayList) null, false);
            dialogInterfaceC2564.dismiss();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C7050.m16211((CharSequence) c10769.m24805());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM48880 = viewOnClickListenerC21674.m48880(c24850);
            StringBuilder sbM21133 = C9179.m21133(strM48880 != null ? strM48880 : "???", "->");
            sbM21133.append(c24850.m54586());
            C7050.m16211((CharSequence) sbM21133.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM48879 = viewOnClickListenerC21674.m48879(c16132);
            StringBuilder sbM21134 = C9179.m21133(strM48879 != null ? strM48879 : "???", "->");
            sbM21134.append(c16132.m36723());
            C7050.m16211((CharSequence) sbM21134.toString());
            return true;
        }
        String str = "???";
        if (itemId == R.string.MT_Protector) {
            String strM488710 = viewOnClickListenerC21674.m48879(c16132);
            if (strM488710 == null) {
                strM488710 = str;
            }
            CharSequence charSequenceM48897 = viewOnClickListenerC21674.m48897(viewOnClickListenerC21674.m48879(c16132));
            boolean zContains = (charSequenceM48897 != null ? C6941.m15900(charSequenceM48897, c16132) : "").contains("static");
            StringBuilder sb = new StringBuilder(zContains ? "sget" : "iget");
            if (c16132.m36719().length() <= 1) {
                String strM36719 = c16132.m36719();
                strM36719.getClass();
                switch (strM36719) {
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
            sb.append(strM488710);
            sb.append("->");
            sb.append(c16132.m36723());
            sb.append("\n");
            C7050.m16211((CharSequence) sb.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM488711 = viewOnClickListenerC21674.m48879(c16132);
            str = strM488711 != null ? strM488711 : "???";
            CharSequence charSequenceM48898 = viewOnClickListenerC21674.m48897(viewOnClickListenerC21674.m48879(c16132));
            boolean zContains2 = (charSequenceM48898 != null ? C6941.m15900(charSequenceM48898, c16132) : "").contains("static");
            StringBuilder sb2 = new StringBuilder(zContains2 ? "sput" : "iput");
            if (c16132.m36719().length() <= 1) {
                String strM367110 = c16132.m36719();
                strM367110.getClass();
                switch (strM367110) {
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
            sb2.append(c16132.m36723());
            sb2.append("\n");
            C7050.m16211((CharSequence) sb2.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            String strM48881 = viewOnClickListenerC21674.m48880(c24850);
            if (strM48881 == null) {
                strM48881 = str;
            }
            CharSequence charSequenceM48899 = viewOnClickListenerC21674.m48897(viewOnClickListenerC21674.m48880(c24850));
            String[] strArr = charSequenceM48899 != null ? new String[]{C6941.m15905(charSequenceM48899), C6941.m15901(charSequenceM48899, c24850)} : new String[]{"", ""};
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
            String strM54579 = c24850.m54579();
            int i = !str3.contains("static") ? 1 : 0;
            C14987 c14987 = new C14987(strM54579);
            while (true) {
                String strM34339 = c14987.m34339();
                if (strM34339 == null) {
                    break;
                }
                i = (strM34339.equals("D") || strM34339.equals("J")) ? i + 2 : i + 1;
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
            sb3.append(strM48881);
            sb3.append("->");
            sb3.append(c24850.m54586());
            sb3.append("\n");
            String strM54582 = c24850.m54582();
            if (strM54582.length() <= 1) {
                switch (strM54582) {
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
            C7050.m16211((CharSequence) sb3.toString());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            C7050.m16211((CharSequence) c14146.m32500().mo28590(c24850.m54587(), c24850.m54583()));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                activityC18686.m42608(new Runnable() { // from class: l.ᩴܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC21674.m48900(this.f62800, c24850);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                activityC18686.m42608(new Runnable() { // from class: l.᩵ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC21674.m48886(this.f65941, c10769);
                    }
                });
                return true;
            }
            if (groupId == R.string.MT_Protector) {
                activityC18686.m42608(new Runnable() { // from class: l.֡ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC21674.m48888(this.f5011, c16132, itemId);
                    }
                });
                return true;
            }
            if (itemId == R.string.MT_Protector) {
                if (c10769 != null) {
                    activityC18686.m42608(new Runnable() { // from class: l.ۚܿۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC21674.m48899(this.f19887, c10769);
                        }
                    });
                    return true;
                }
                activityC18686.m42608(new Runnable() { // from class: l.֨ܿۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC21674.m48889(this.f7242, c24850);
                    }
                });
            }
            return true;
        }
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', c24850.m54587() + 1);
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', c24850.m54583() - 1);
        String strM15902 = C6941.m15902(interfaceC9768M32500.mo28590(c24850.m54587(), iIndexOf).trim());
        boolean zContains3 = strM15902.contains("static");
        boolean z = strM15902.contains(UMConfigure.WRAPER_TYPE_NATIVE) || strM15902.contains("abstract");
        String strM26621 = C11567.m26621(' ', c14146.m32425());
        StringBuilder sb4 = new StringBuilder();
        if (!z) {
            String strM545710 = c24850.m54579();
            int i3 = !zContains3 ? 1 : 0;
            C14987 c14988 = new C14987(strM545710);
            while (true) {
                String strM343310 = c14988.m34339();
                if (strM343310 == null) {
                    break;
                }
                i3 = (strM343310.equals("D") || strM343310.equals("J")) ? i3 + 2 : i3 + 1;
            }
            String strM54583 = c24850.m54582();
            strM54583.getClass();
            switch (strM54583) {
                case "B":
                case "C":
                case "F":
                case "I":
                case "S":
                case "Z":
                    sb4.append(strM26621);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb4, "\n\n", strM26621, "const/4 v0, 0x0\n\n", strM26621);
                    sb4.append("return v0\n");
                    break;
                case "D":
                case "J":
                    sb4.append(strM26621);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 2));
                    ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb4, "\n\n", strM26621, "const-wide/16 v0, 0x0\n\n", strM26621);
                    sb4.append("return-wide v0\n");
                    break;
                case "V":
                    sb4.append(strM26621);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    C21545.m48729(sb4, "\n\n", strM26621, "return-void\n");
                    break;
                default:
                    sb4.append(strM26621);
                    sb4.append(".registers ");
                    sb4.append(Math.max(i3, 1));
                    ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb4, "\n\n", strM26621, "const/4 v0, 0x0\n\n", strM26621);
                    sb4.append("return-object v0\n");
                    break;
            }
        }
        if (iIndexOf != -1 && iLastIndexOf != -1) {
            interfaceC9768M32500.replace(iIndexOf + 1, iLastIndexOf + 1, sb4);
            c14146.mo27944(c24850.m54587(), sb4.length() + (c24850.m54583() - (iLastIndexOf - iIndexOf)));
            c14146.m32494(false);
        }
        dialogInterfaceC2564.dismiss();
        return true;
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m48900(ViewOnClickListenerC21674 viewOnClickListenerC21674, C24850 c24850) {
        C13607 c13607 = new C13607();
        c13607.f38281 = 1;
        c13607.f38282 = c24850.m54586();
        String strM48880 = viewOnClickListenerC21674.m48880(c24850);
        if (strM48880 == null) {
            C22682.m50795((CharSequence) "Can not detect the class name.");
            return;
        }
        viewOnClickListenerC21674.f68262.dismiss();
        c13607.f38279 = strM48880;
        viewOnClickListenerC21674.f68263.m13323(c13607);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48886(ViewOnClickListenerC21674 viewOnClickListenerC21674, C10769 c10769) {
        C13607 c13607 = new C13607();
        c13607.f38281 = 0;
        c13607.f38279 = c10769.m24805();
        viewOnClickListenerC21674.f68262.dismiss();
        viewOnClickListenerC21674.f68263.m13343(c13607);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48888(ViewOnClickListenerC21674 viewOnClickListenerC21674, C16132 c16132, int i) {
        C13607 c13607 = new C13607();
        String strM48879 = viewOnClickListenerC21674.m48879(c16132);
        if (strM48879 == null) {
            C22682.m50795((CharSequence) "Can not detect the class name.");
            return;
        }
        c13607.f38281 = 2;
        c13607.f38282 = c16132.m36723();
        c13607.f38278 = i;
        c13607.f38279 = strM48879;
        viewOnClickListenerC21674.f68262.dismiss();
        viewOnClickListenerC21674.f68263.m13350(c13607);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m48899(ViewOnClickListenerC21674 viewOnClickListenerC21674, C10769 c10769) {
        C13607 c13607 = new C13607();
        c13607.f38281 = 0;
        c13607.f38279 = c10769.m24805();
        viewOnClickListenerC21674.f68262.dismiss();
        viewOnClickListenerC21674.f68263.m13350(c13607);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48889(ViewOnClickListenerC21674 viewOnClickListenerC21674, C24850 c24850) {
        final C13607 c13607 = new C13607();
        String strM48880 = viewOnClickListenerC21674.m48880(c24850);
        if (strM48880 == null) {
            C22682.m50795((CharSequence) "Can not detect the class name.");
            return;
        }
        c13607.f38281 = 1;
        c13607.f38279 = strM48880;
        c13607.f38282 = c24850.m54586();
        final RunnableC22345 runnableC22345 = new RunnableC22345(viewOnClickListenerC21674, c13607);
        if (!c24850.m54580()) {
            runnableC22345.run();
            return;
        }
        C20671 c20671BuildDialog = viewOnClickListenerC21674.f68276.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20670(1, runnableC22345));
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܿۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c13607.f38280 = true;
                runnableC22345.run();
            }
        });
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732().m3861().setOnClickListener(new ViewOnClickListenerC22935(1, viewOnClickListenerC21674));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48887(ViewOnClickListenerC21674 viewOnClickListenerC21674, C13607 c13607) {
        viewOnClickListenerC21674.f68262.dismiss();
        viewOnClickListenerC21674.f68263.m13350(c13607);
    }

    /* JADX INFO: renamed from: ۧ */
    private CharSequence m48897(String str) {
        AbstractC16003 abstractC16003 = this.f68278;
        if (abstractC16003 instanceof C8362) {
            return this.f68267.m32500();
        }
        if (!(abstractC16003 instanceof C18026)) {
            return null;
        }
        try {
            String strM41045 = ((C18026) abstractC16003).m41045();
            if (!TextUtils.isEmpty(str) && str.startsWith("L") && str.endsWith(C0249l.f1196b)) {
                strM41045 = str.substring(1, str.length() - 1);
            }
            return this.f68276.m42607(strM41045);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m48912() {
        if (this.f68268.isEmpty()) {
            CharSequence charSequenceM48897 = m48897((String) null);
            if (charSequenceM48897 != null) {
                return AbstractC4734.m10026(charSequenceM48897);
            }
            return null;
        }
        return ((C10769) this.f68268.get(0)).m24805();
    }

    /* JADX INFO: renamed from: ֫ */
    private String m48879(C16132 c16132) {
        String strM36720 = c16132.m36720();
        int iM36721 = c16132.m36721();
        int iM36718 = c16132.m36718();
        if (!TextUtils.isEmpty(strM36720)) {
            return strM36720;
        }
        C10769 c10769M48882 = m48882(iM36721, iM36718);
        if (c10769M48882 != null) {
            return c10769M48882.m24805();
        }
        return m48912();
    }

    /* JADX INFO: renamed from: ֫ */
    private String m48880(C24850 c24850) {
        String strM54585 = c24850.m54585();
        int iM54587 = c24850.m54587();
        int iM54583 = c24850.m54583();
        if (!TextUtils.isEmpty(strM54585)) {
            return strM54585;
        }
        C10769 c10769M48882 = m48882(iM54587, iM54583);
        if (c10769M48882 != null) {
            return c10769M48882.m24805();
        }
        return m48912();
    }

    /* JADX INFO: renamed from: ֫ */
    private List m48881(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f68260;
        }
        ArrayList arrayList = new ArrayList();
        for (C24850 c24850 : this.f68260) {
            if (str.equals(c24850.m54585())) {
                arrayList.add(c24850);
            }
        }
        return arrayList.isEmpty() ? this.f68260 : arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private C10769 m48883(int i, int i2, String str) {
        C10769 c10769;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = this.f68268.iterator();
            do {
                if (!it.hasNext()) {
                    c10769 = null;
                    break;
                }
                c10769 = (C10769) it.next();
            } while (!str.equals(c10769.m24805()));
        } else {
            c10769 = null;
            break;
        }
        if (c10769 != null) {
            return c10769;
        }
        C10769 c10769M48882 = m48882(i, i2);
        if (c10769M48882 != null) {
            return c10769M48882;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("L") || !str.endsWith(C0249l.f1196b)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47) + 1;
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return new C10769(str, C17073.m38720(1, iLastIndexOf, str));
    }

    /* JADX INFO: renamed from: ֫ */
    private C10769 m48882(int i, int i2) {
        int iM24802;
        C10769 c10769 = null;
        int i3 = Integer.MAX_VALUE;
        for (C10769 c107610 : this.f68268) {
            if (i >= c107610.m24804() && i2 <= c107610.m24802() && (iM24802 = c107610.m24802() - c107610.m24804()) < i3) {
                c10769 = c107610;
                i3 = iM24802;
            }
        }
        return c10769;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f68271 && this.f68279.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = this.f68271;
        this.f68271 = !z;
        if (!z) {
            m48903();
        }
        this.f68267.postDelayed(new Runnable() { // from class: l.ۘܿۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC21674.m48898(this.f15829);
            }
        }, 100L);
        this.f68277.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m48898(ViewOnClickListenerC21674 viewOnClickListenerC21674) {
        if (viewOnClickListenerC21674.f68271) {
            viewOnClickListenerC21674.m48903();
        } else {
            viewOnClickListenerC21674.m48907();
        }
    }
}
