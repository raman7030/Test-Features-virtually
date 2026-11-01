package p067l;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ܰܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public class C15556 extends AbstractC21283 {

    /* JADX INFO: renamed from: ۢ֫ */
    public static final C10748 f44442 = C10748.m24759();

    /* JADX INFO: renamed from: ֫֫ */
    public int f44443;

    /* JADX INFO: renamed from: ۗ */
    public boolean f44444;

    /* JADX INFO: renamed from: ۙ */
    public boolean f44445;

    /* JADX INFO: renamed from: ۛ */
    public boolean f44446;

    /* JADX INFO: renamed from: ۜ֫ */
    public long f44447;

    /* JADX INFO: renamed from: ۟ */
    public int f44448;

    /* JADX INFO: renamed from: ۤ */
    public final Drawable f44449;

    /* JADX INFO: renamed from: ۧ֫ */
    public long f44450;

    /* JADX INFO: renamed from: ۨ */
    public int f44451;

    /* JADX INFO: renamed from: ۫ */
    public final Drawable f44452;

    /* JADX INFO: renamed from: ۬ */
    public String f44453;

    /* JADX INFO: renamed from: ܰ */
    public ArrayList f44454;

    /* JADX INFO: renamed from: ܳ֫ */
    public C14849 f44455;

    /* JADX INFO: renamed from: ܽ֫ */
    public HashSet f44456;

    /* JADX INFO: renamed from: ܿ֫ */
    public InterfaceC16897 f44457;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC10193 f44458;

    /* JADX INFO: renamed from: ᩶ */
    public C9522 f44459;

    /* JADX INFO: renamed from: ᩷֫ */
    public InterfaceC19840 f44460;

    /* JADX INFO: renamed from: ᩸ */
    public Set f44461;

    /* JADX INFO: renamed from: ᩹ */
    public int f44462;

    /* JADX INFO: renamed from: ᩺ */
    public ArrayList f44463;

    /* JADX INFO: renamed from: ᩻֫ */
    public C13135 f44464;

    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo35368(String str, String str2, boolean z) {
        return str2;
    }

    /* JADX INFO: renamed from: ۘ */
    public boolean mo27516() {
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public int mo17934() {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo35396(String str) {
        return true;
    }

    public C15556() {
        this(m35366("C"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Drawable[] m35366(String str) {
        AbstractC22606 abstractC22606 = C21265.f66862;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C23223.f72981) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C13076.m29941(14 - str.length()));
        int iM29939 = C13076.m29939(25.0f);
        int iM299310 = C13076.m29939(12.5f);
        int iM299311 = C13076.m29939(11.0f);
        int iM299312 = C13076.m29939(5.0f);
        int iM299313 = C13076.m29939(2.0f);
        paint2.setColor(abstractC22606.mo9512());
        paint2.setAlpha(C23223.m51761(200, 255));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = iM299310;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM29939, iM29939, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        paint.setColor(abstractC22606.mo9511());
        canvas.drawCircle(f3, f3, iM299311, paint);
        canvas.drawText(str, f3, f4, paint2);
        C14081 c14081 = new C14081();
        c14081.f39901 = iM29939;
        c14081.f39904 = iM299310;
        c14081.f39903 = iM299313;
        c14081.f39902 = iM299312;
        c14081.f39900 = null;
        return new Drawable[]{new BitmapDrawable(bitmapCreateBitmap), new BitmapDrawable(RunnableC8046.m18672(c14081, C21265.f66820, R.drawable.MT_Protector))};
    }

    public C15556(Drawable[] drawableArr) {
        this.f44451 = C13076.m29939(25.0f);
        this.f44443 = C13076.m29939(17.0f);
        this.f44445 = false;
        this.f44446 = false;
        this.f44463 = new ArrayList();
        C13135 c13135 = new C13135();
        c13135.f36900 = new ArrayList();
        this.f44464 = c13135;
        this.f44456 = new HashSet();
        this.f44454 = new ArrayList();
        this.f44461 = Collections.newSetFromMap(new WeakHashMap());
        this.f44452 = drawableArr[0];
        this.f44449 = drawableArr[1];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35371(int i, Collection collection) {
        C15993 c15993M36344 = C15993.m36344(collection);
        c15993M36344.m36349(i);
        m35379(c15993M36344.m36348());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35379(C18676 c18676) {
        C13135 c13135 = this.f44464;
        ArrayList arrayList = c13135.f36900;
        ArrayList arrayList2 = c13135.f36900;
        arrayList.clear();
        for (C18676 c18677 : c18676.m42496()) {
            C9522 c9522 = new C9522(c18677, (C9522) null);
            arrayList2.add(c9522);
            m35362(c18677, c9522);
        }
        Iterator it = c18676.m42499().iterator();
        while (it.hasNext()) {
            arrayList2.add(new C9522((C12642) it.next(), (C9522) null));
        }
        ArrayList arrayList3 = this.f44463;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35362(C18676 c18676, C9522 c9522) {
        ArrayList arrayList = c9522.f26067;
        for (C18676 c18677 : c18676.m42496()) {
            C9522 c9523 = new C9522(c18677, c9522);
            arrayList.add(c9523);
            m35362(c18677, c9523);
        }
        Iterator it = c18676.m42499().iterator();
        while (it.hasNext()) {
            arrayList.add(new C9522((C12642) it.next(), c9522));
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C13135 m35402() {
        return this.f44464;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35394() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f44463;
            if (i < arrayList.size()) {
                C9522 c9522 = (C9522) arrayList.get(i);
                if (c9522.m22157()) {
                    int i2 = i + 1;
                    int iM35365 = m35365(c9522);
                    if (iM35365 > 0) {
                        arrayList.subList(i2, iM35365 + i2).clear();
                    }
                }
                i++;
            } else {
                this.f44454.clear();
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35383(boolean z) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f44463;
            if (i >= arrayList.size()) {
                break;
            }
            C9522 c9522 = (C9522) arrayList.get(i);
            if (!c9522.m22165() && !c9522.m22157()) {
                m35359(c9522, false, z);
            }
            i++;
        }
        if (z && mo27516()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C9522 c9523 = (C9522) arrayList.get(i2);
                if (c9523.m22165() && !c9523.m22164() && !c9523.m22157()) {
                    m35359(c9523, false, z);
                }
            }
        }
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35397() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f44463;
            if (i >= arrayList.size()) {
                break;
            }
            C9522 c9522 = (C9522) arrayList.get(i);
            if (!c9522.m22165() && !c9522.m22157()) {
                m35359(c9522, false, true);
                if (arrayList.size() >= 200) {
                    break;
                }
            }
            i++;
        }
        if (mo27516()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C9522 c9523 = (C9522) arrayList.get(i2);
                if (c9523.m22165() && !c9523.m22164() && !c9523.m22157()) {
                    m35359(c9523, false, true);
                    if (arrayList.size() >= 200) {
                        break;
                    }
                }
            }
        }
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܳ */
    public final HashSet m35392() {
        HashSet hashSet = new HashSet();
        for (C9522 c9522 : this.f44463) {
            boolean zM22157 = c9522.m22157();
            String str = c9522.f26070;
            if (zM22157) {
                if (c9522.m22165()) {
                    hashSet.add(str);
                } else {
                    hashSet.add(str + "/");
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35374(HashSet hashSet) {
        this.f44463.clear();
        m35357(hashSet, (C9522) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35357(HashSet hashSet, C9522 c9522) {
        for (C9522 c9523 : c9522 == null ? this.f44464.f36900 : c9522.f26067) {
            ArrayList arrayList = this.f44463;
            arrayList.add(c9523);
            boolean zM22165 = c9523.m22165();
            String str = c9523.f26070;
            if (!zM22165) {
                boolean zContains = hashSet.contains(str + "/");
                c9523.m22159(zContains);
                if (zContains) {
                    m35357(hashSet, c9523);
                }
            } else if (mo27516()) {
                boolean zContains2 = hashSet.contains(str);
                c9523.m22159(zContains2);
                if (zContains2) {
                    int iMo27518 = mo27518(str);
                    c9523.m22148(iMo27518);
                    for (int i = 0; i < iMo27518; i++) {
                        arrayList.add(new C9522(i, c9523));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35395(C9522 c9522) {
        ArrayList arrayList = this.f44463;
        int iIndexOf = arrayList.indexOf(c9522);
        if (iIndexOf == -1) {
            return;
        }
        int i = iIndexOf + 1;
        int iM35365 = m35365(c9522);
        if (iM35365 > 0) {
            arrayList.subList(i, i + iM35365).clear();
            notifyItemRangeRemoved(mo17934() + i, iM35365);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private int m35365(C9522 c9522) {
        int iM22162;
        if (!c9522.m22157()) {
            return 0;
        }
        if (c9522.m22165()) {
            if (!mo27516() || c9522.m22164()) {
                throw new RuntimeException();
            }
            iM22162 = c9522.m22162();
        } else {
            Iterator it = c9522.f26067.iterator();
            int iM35365 = 0;
            while (it.hasNext()) {
                iM35365 += m35365((C9522) it.next()) + 1;
            }
            iM22162 = iM35365;
        }
        c9522.m22159(false);
        return iM22162;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35376(C9522 c9522) {
        m35359(c9522, true, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35359(C9522 c9522, boolean z, boolean z2) {
        int i;
        ArrayList arrayList = this.f44463;
        int iIndexOf = arrayList.indexOf(c9522);
        if (iIndexOf == -1) {
            return;
        }
        int i2 = iIndexOf + 1;
        c9522.m22159(true);
        ArrayList<C9522> arrayList2 = c9522.f26067;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9522 c9523 = (C9522) it.next();
            c9523.m22159(false);
            c9523.m22161(false);
        }
        if (z2 && mo27516()) {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            if (c9522.m22165()) {
                if (c9522.m22164()) {
                    throw new RuntimeException();
                }
                int iMo27518 = mo27518(c9522.f26070);
                c9522.m22148(iMo27518);
                for (i = 0; i < iMo27518; i++) {
                    arrayList3.add(new C9522(i, c9522));
                }
            } else {
                for (C9522 c9524 : arrayList2) {
                    arrayList3.add(c9524);
                    if (c9524.m22165()) {
                        c9524.m22159(true);
                        int iMo27519 = mo27518(c9524.f26070);
                        c9524.m22148(iMo27519);
                        for (int i3 = 0; i3 < iMo27519; i3++) {
                            arrayList3.add(new C9522(i3, c9524));
                        }
                    }
                }
            }
            arrayList2 = arrayList3;
        } else if (c9522.m22165()) {
            throw new RuntimeException();
        }
        arrayList.addAll(i2, arrayList2);
        if (z) {
            notifyItemRangeInserted(mo17934() + i2, arrayList2.size());
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList m35403() {
        return this.f44463;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35377(InterfaceC10193 interfaceC10193) {
        this.f44458 = interfaceC10193;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35378(InterfaceC16897 interfaceC16897) {
        this.f44457 = interfaceC16897;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35381(InterfaceC19840 interfaceC19840) {
        this.f44460 = interfaceC19840;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35385(View view, C9522 c9522, AbstractViewOnClickListenerC19169 abstractViewOnClickListenerC19169) {
        InterfaceC10193 interfaceC10193 = this.f44458;
        if (c9522 == null || interfaceC10193 == null) {
            return false;
        }
        return interfaceC10193.mo18531(new C18498(this, abstractViewOnClickListenerC19169, view));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35372(View view, C9522 c9522, C7511 c7511) {
        if (mo27516() && mo27518(c9522.f26070) > 0) {
            if (!c9522.m22157()) {
                m35359(c9522, true, true);
                return;
            } else {
                m35395(c9522);
                return;
            }
        }
        InterfaceC16897 interfaceC16897 = this.f44457;
        if (c9522 == null || interfaceC16897 == null) {
            return;
        }
        if (!c9522.m22165()) {
            throw new RuntimeException();
        }
        interfaceC16897.mo18532(new C18498(this, c7511, view));
    }

    @Override // p067l.AbstractC21283
    public final void onAttachedToRecyclerView(C14849 c14849) {
        super.onAttachedToRecyclerView(c14849);
        C14849 c148410 = this.f44455;
        if (c148410 != null && c148410 != c14849) {
            throw new RuntimeException("RecyclerTreeAdaptor can not attach to multi RecyclerView.");
        }
        this.f44455 = c14849;
    }

    @Override // p067l.AbstractC21283
    public final void onDetachedFromRecyclerView(C14849 c14849) {
        super.onDetachedFromRecyclerView(c14849);
        this.f44455 = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae A[EDGE_INSN: B:66:0x00ae->B:31:0x00ae BREAK  A[LOOP:2: B:12:0x0046->B:30:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0066 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m35373(Collection collection) {
        ArrayList<C9522> arrayList;
        boolean z;
        C9522 c9522;
        boolean zM22165;
        String str;
        m35363();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int iLastIndexOf = str2.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                hashSet.add(str2.substring(0, iLastIndexOf + 1));
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = this.f44463;
            z = true;
            if (!zHasNext) {
                break;
            }
            String str3 = (String) it2.next();
            C9522 c9523 = null;
            while (true) {
                if (c9523 != null) {
                    if (str3.equals(c9523.f26070 + "/")) {
                        break;
                    }
                    c9522 = null;
                    for (C9522 c9524 : arrayList) {
                        zM22165 = c9524.m22165();
                        str = c9524.f26070;
                        if (!zM22165) {
                            if (!str3.startsWith(str + '/') && (c9522 == null || c9522.f26070.length() < str.length())) {
                                c9522 = c9524;
                            }
                        }
                    }
                    if (c9522 != null) {
                        break;
                    }
                    if (!c9522.m22157()) {
                        m35359(c9522, false, true);
                    }
                    arrayList = c9522.f26067;
                    c9523 = c9522;
                } else {
                    c9522 = null;
                    while (r3.hasNext()) {
                        zM22165 = c9524.m22165();
                        str = c9524.f26070;
                        if (!zM22165) {
                            if (!str3.startsWith(str + '/')) {
                            }
                        }
                    }
                    if (c9522 != null) {
                        break;
                        break;
                    }
                    if (!c9522.m22157()) {
                        m35359(c9522, false, true);
                    }
                    arrayList = c9522.f26067;
                    c9523 = c9522;
                }
            }
            if (c9523 != null) {
                arrayList2.add(c9523);
            }
        }
        HashSet hashSet2 = this.f44456;
        hashSet2.clear();
        int size = arrayList.size();
        for (final int i = 0; i < size; i++) {
            C9522 c9525 = (C9522) arrayList.get(i);
            boolean zM22166 = c9525.m22165();
            String str4 = c9525.f26070;
            if (zM22166 && collection.contains(str4)) {
                if (z) {
                    final C14849 c14849 = this.f44455;
                    if (c14849 != null) {
                        c14849.post(new Runnable() { // from class: l.᩹ܳۡ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c14849.scrollToPosition(i);
                            }
                        });
                    }
                    z = false;
                }
                hashSet2.add(str4);
            }
        }
        ArrayList arrayList3 = this.f44454;
        if (z) {
            C7480.stream(arrayList2).mapToInt(new ToIntFunction() { // from class: l.᩶ܳۡ
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return this.f68081.f44463.indexOf((C9522) obj);
                }
            }).filter(new C6840()).min().ifPresent(new C5499(0, this));
        } else {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C9522) it3.next()).m22161(false);
            }
        }
        this.f44450 = SystemClock.uptimeMillis();
        arrayList3.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35361(C15556 c15556, final int i) {
        final C14849 c14849 = c15556.f44455;
        if (c14849 != null) {
            c14849.post(new Runnable() { // from class: l.۬ܳۡ
                @Override // java.lang.Runnable
                public final void run() {
                    c14849.scrollToPosition(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m35399() {
        m35363();
        if (!this.f44446) {
            return null;
        }
        C11996 c11996 = new C11996();
        if (this.f44444) {
            c11996.writeByte(81);
            c11996.m27459(this.f44453);
        } else {
            c11996.writeByte(82);
        }
        c11996.writeInt(m35388().size());
        Iterator it = m35388().iterator();
        while (it.hasNext()) {
            c11996.m27459((String) it.next());
        }
        return c11996.m27447();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35384(byte[] bArr) {
        m35363();
        if (bArr == null) {
            if (this.f44446) {
                mo35370();
                return;
            }
            return;
        }
        C14677 c14677M33572 = C14677.m33572(bArr);
        byte b = c14677M33572.readByte();
        if (b == 81) {
            this.f44446 = true;
            this.f44444 = true;
            this.f44453 = c14677M33572.m33593();
        } else if (b == 82) {
            this.f44446 = true;
        } else {
            throw new RuntimeException();
        }
        int i = c14677M33572.readInt();
        HashSet hashSet = new HashSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(c14677M33572.m33593());
        }
        this.f44447 = 0L;
        this.f44459 = null;
        this.f44448 = -2;
        m35382(new C23509(4, hashSet));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35390(boolean z) {
        this.f44444 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo35370() {
        if (!this.f44446) {
            throw new IllegalStateException();
        }
        this.f44447 = System.currentTimeMillis();
        m35358((List) this.f44464.f36900);
        this.f44446 = false;
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35382(InterfaceC24274 interfaceC24274) {
        if (!this.f44446) {
            throw new IllegalStateException();
        }
        LinkedList linkedList = new LinkedList();
        this.f44464.m30047(new C14216(this, interfaceC24274, linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C9522) it.next()).m22150(false);
        }
        m35389();
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m35386() {
        return this.f44446;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m35387() {
        if (!this.f44446) {
            throw new IllegalStateException();
        }
        return this.f44464.m30045();
    }

    /* JADX INFO: renamed from: ۢ */
    public final HashSet m35388() {
        if (!this.f44446) {
            throw new IllegalStateException();
        }
        HashSet hashSet = new HashSet();
        this.f44464.m30046(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m35400() {
        if (!this.f44446) {
            throw new IllegalStateException();
        }
        this.f44447 = System.currentTimeMillis();
        C13135 c13135 = this.f44464;
        c13135.m30049();
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f44463.iterator();
        int i = 0;
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            if (c9522.m22165()) {
                if (c9522.m22151()) {
                    it.remove();
                    linkedList.addFirst(Integer.valueOf(i));
                }
            } else if (c9522.f26067.isEmpty()) {
                it.remove();
                linkedList.addFirst(Integer.valueOf(i));
            }
            i++;
        }
        m35358((List) c13135.f36900);
        int iMo17934 = mo17934();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            notifyItemRemoved(((Integer) it2.next()).intValue() + iMo17934);
        }
        C14849 c14849 = this.f44455;
        if (c14849 != null) {
            c14849.postDelayed(new RunnableC6357(6, this), 300L);
        } else {
            this.f44446 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35391(C9522 c9522) {
        if (!mo35396(c9522.f26070)) {
            return false;
        }
        if (!this.f44444) {
            return true;
        }
        C9522 c9523 = c9522.f26071;
        return c9523 != null && C12826.equals(c9523.f26070, this.f44453) && c9522.m22165() && !c9522.m22164();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m35401() {
        m35363();
        if (this.f44446 || this.f44444) {
            throw new IllegalStateException();
        }
        this.f44445 = true;
        this.f44446 = true;
        this.f44459 = null;
        this.f44448 = -2;
        m35382(new C5410(12));
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m35367() {
        m35363();
        if (this.f44446 || this.f44444) {
            throw new IllegalStateException();
        }
        this.f44447 = System.currentTimeMillis();
        this.f44446 = true;
        this.f44459 = null;
        this.f44448 = -2;
        m35382(new C21466(5));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35398(C9522 c9522) {
        m35363();
        if (this.f44446) {
            throw new IllegalStateException();
        }
        if (!mo35396(c9522.f26070)) {
            throw new IllegalStateException();
        }
        this.f44447 = System.currentTimeMillis();
        this.f44446 = true;
        this.f44459 = null;
        this.f44448 = -2;
        if (this.f44444) {
            this.f44453 = c9522.f26071.f26070;
        }
        if (c9522.m22165()) {
            c9522.m22156(true);
        } else {
            c9522.m22154();
            C3487.m6229(c9522.f26067);
            c9522.m22150(true);
        }
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35389() {
        if (this.f44445) {
            return;
        }
        Iterator it = this.f44464.f36900.iterator();
        while (it.hasNext()) {
            if (((C9522) it.next()).m22158() != 0) {
                return;
            }
        }
        mo35370();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35375(C7511 c7511) {
        C9522 c9522 = c7511.f57270;
        if (!m35391(c9522)) {
            throw new IllegalArgumentException();
        }
        this.f44459 = null;
        c9522.m22156(!c9522.m22151());
        if (c9522.m22151()) {
            int iIndexOf = this.f44463.indexOf(c9522);
            int iAbs = Math.abs(iIndexOf - this.f44448);
            this.f44448 = iIndexOf;
            if (iAbs == 1) {
                this.f44462++;
            } else {
                this.f44462 = 1;
            }
            if (this.f44462 == 5) {
                C22682.m50799(R.string.MT_Protector);
                this.f44462 = 0;
            }
        } else {
            m35389();
            this.f44448 = -2;
        }
        C8026 c8026 = c7511.f57272;
        boolean zM22151 = c9522.m22151();
        c8026.getClass();
        c8026.m18605(zM22151 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35380(AbstractViewOnClickListenerC19169 abstractViewOnClickListenerC19169) {
        C9522 c9522 = abstractViewOnClickListenerC19169.f57270;
        if (!this.f44446) {
            throw new IllegalStateException();
        }
        if (!m35391(c9522)) {
            throw new IllegalArgumentException();
        }
        C9522 c9523 = this.f44459;
        if (c9523 == null) {
            this.f44459 = c9522;
            if (c9522.m22165()) {
                this.f44459.m22156(true);
                C8026 c8026 = abstractViewOnClickListenerC19169.f57272;
                c8026.getClass();
                c8026.m18605(2);
                return;
            }
            ((C3487) abstractViewOnClickListenerC19169).mo6230(2);
            this.f44459 = c9522;
            return;
        }
        this.f44459 = null;
        if (c9523.equals(c9522)) {
            return;
        }
        C12205 c12205 = new C12205(c9523, c9522);
        C13135 c13135 = this.f44464;
        c13135.m30047(c12205);
        LinkedList linkedList = new LinkedList();
        c13135.m30047(new C8181(linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C9522) it.next()).m22150(false);
        }
        m35389();
        this.f44454.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35358(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            c9522.m22147();
            if (!c9522.m22165()) {
                m35358((List) c9522.f26067);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35360(C15556 c15556) {
        c15556.f44446 = false;
        for (C8026 c8026 : c15556.f44461) {
            c8026.getClass();
            c8026.m18605(0);
            int i = C1717.f57146;
            if (c8026.isAttachedToWindow()) {
                ObjectAnimator.ofFloat(c8026, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
            } else {
                c8026.setScaleX(0.0f);
            }
        }
    }

    @Override // p067l.AbstractC21283
    public int getItemViewType(int i) {
        C9522 c9522 = (C9522) this.f44463.get(i);
        if (c9522.m22165()) {
            return (mo27516() && c9522.m22164()) ? 10002 : 10000;
        }
        return IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation;
    }

    @Override // p067l.AbstractC21283
    public AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Set set = this.f44461;
        switch (i) {
            case 10000:
                C7511 c7511 = new C7511(this, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
                c7511.f19729 = (ImageView) c7511.itemView.findViewById(R.id.icon);
                c7511.f19731 = (TextView) c7511.itemView.findViewById(R.id.textView);
                c7511.f19730 = c7511.itemView.findViewById(R.id.MT_Protector);
                C8026 c8026 = (C8026) c7511.itemView.findViewById(R.id.MT_Protector);
                c7511.f57272 = c8026;
                c8026.setClickable(false);
                set.add(c7511.f57272);
                return c7511;
            case IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation /* 10001 */:
                C3487 c3487 = new C3487(this, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
                c3487.f6997 = (ImageView) c3487.itemView.findViewById(R.id.icon);
                c3487.f6999 = (TextView) c3487.itemView.findViewById(R.id.textView);
                ImageView imageView = (ImageView) c3487.itemView.findViewById(R.id.MT_Protector);
                c3487.f6998 = imageView;
                imageView.setImageResource(R.drawable.MT_Protector);
                C8026 c8027 = (C8026) c3487.itemView.findViewById(R.id.MT_Protector);
                c3487.f57272 = c8027;
                c8027.m18606(c3487);
                set.add(c3487.f57272);
                return c3487;
            case 10002:
                return mo27513(viewGroup);
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo27512(int i) {
        return (this.f44451 * i) + this.f44443;
    }

    @Override // p067l.AbstractC21283
    public void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C9522 c9522 = (C9522) this.f44463.get(i);
        boolean zM22164 = c9522.m22164();
        String str = c9522.f26068;
        String str2 = c9522.f26070;
        if (zM22164) {
            mo27515(abstractC5462, c9522.f26071.f26070, c9522.m22162());
            return;
        }
        AbstractViewOnClickListenerC19169 abstractViewOnClickListenerC19169 = (AbstractViewOnClickListenerC19169) abstractC5462;
        abstractViewOnClickListenerC19169.f57270 = c9522;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractViewOnClickListenerC19169.itemView.getLayoutParams();
        if (c9522.m22165()) {
            marginLayoutParams.leftMargin = mo27512(c9522.m22160());
            C7511 c7511 = (C7511) abstractViewOnClickListenerC19169;
            ImageView imageView = c7511.f19729;
            TextView textView = c7511.f19731;
            textView.setText(mo35368(str2, C8597.m20011(200, str), true));
            imageView.setImageDrawable(this.f44452);
            if (this.f44456.remove(str2)) {
                this.f44454.add(c9522);
                c9522.m22161(true);
                if (SystemClock.uptimeMillis() - this.f44450 < 2000) {
                    C2816 c2816 = new C2816(C23223.f72997);
                    c2816.m4455(1200);
                    View view = c7511.f19730;
                    int i2 = C1717.f57146;
                    view.setBackground(c2816);
                }
            }
            if (c9522.m22153()) {
                textView.setTextColor(C23223.f73002);
            } else {
                textView.setTextColor(C23223.f72986);
            }
            InterfaceC19840 interfaceC19840 = this.f44460;
            if (interfaceC19840 != null) {
                interfaceC19840.mo27514(str2, imageView, textView);
            }
        } else {
            marginLayoutParams.leftMargin = this.f44451 * c9522.m22160();
            C3487 c3487 = (C3487) abstractViewOnClickListenerC19169;
            c3487.f6999.setText(mo35368(str2, C8597.m20011(200, str), false));
            c3487.f6997.setImageDrawable(this.f44449);
            c3487.f6998.setRotation(c9522.m22157() ? 135.0f : 90.0f);
        }
        c9522.m22149(abstractViewOnClickListenerC19169.f57272);
        if (System.currentTimeMillis() - this.f44447 < 100) {
            if (!m35391(c9522)) {
                C8026 c8026 = abstractViewOnClickListenerC19169.f57272;
                c8026.getClass();
                c8026.setVisibility(8);
            } else {
                C8026 c8027 = abstractViewOnClickListenerC19169.f57272;
                c8027.getClass();
                c8027.setVisibility(0);
                if (this.f44446) {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC19169.f57272, "scaleX", 0.01f, 1.0f).setDuration(200L).start();
                } else {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC19169.f57272, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
                }
            }
        } else {
            abstractViewOnClickListenerC19169.f57272.setScaleX(1.0f);
            C8026 c8028 = abstractViewOnClickListenerC19169.f57272;
            boolean z = this.f44446 && m35391(c9522);
            c8028.getClass();
            c8028.setVisibility(z ? 0 : 8);
        }
        abstractViewOnClickListenerC19169.itemView.setLayoutParams(marginLayoutParams);
    }

    @Override // p067l.AbstractC21283
    public int getItemCount() {
        return this.f44463.size();
    }

    /* JADX INFO: renamed from: ۚ */
    private void m35363() {
        if (mo27516()) {
            throw new RuntimeException("Unsupported in left extra mode.");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo27518(String str) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC5462 mo27513(ViewGroup viewGroup) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo27515(AbstractC5462 abstractC5462, String str, int i) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m35393() {
        C9522 c9522;
        C8541 c8541 = (C8541) this.f44455.getLayoutManager();
        C12826.requireNonNull(c8541);
        int iFindFirstVisibleItemPosition = c8541.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || (c9522 = ((C9522) this.f44463.get(iFindFirstVisibleItemPosition)).f26071) == null) {
            return null;
        }
        return m35364(c9522);
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m35364(C9522 c9522) {
        C9522 c9523 = c9522.f26071;
        String str = c9522.f26068;
        if (c9523 == null) {
            return str;
        }
        return m35364(c9522.f26071) + "/" + str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11498 m35369(C3488 c3488) {
        return new C13546(this, c3488);
    }
}
