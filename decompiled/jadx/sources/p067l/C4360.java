package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes2.dex */
public class C4360 implements Comparable {

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f9764;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f9765;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f9766;

    /* JADX INFO: renamed from: ۖ֫ */
    public ViewOnCreateContextMenuListenerC15578 f9767;

    /* JADX INFO: renamed from: ۗ */
    public final Context f9768;

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f9769;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f9770;

    /* JADX INFO: renamed from: ۙ */
    public final View.OnClickListener f9771;

    /* JADX INFO: renamed from: ۙ֫ */
    public CharSequence f9772;

    /* JADX INFO: renamed from: ۚ֫ */
    public C19132 f9773;

    /* JADX INFO: renamed from: ۛ */
    public boolean f9774;

    /* JADX INFO: renamed from: ۜ֫ */
    public String f9775;

    /* JADX INFO: renamed from: ۟ */
    public String f9776;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f9777;

    /* JADX INFO: renamed from: ۡ֫ */
    public C9692 f9778;

    /* JADX INFO: renamed from: ۢ֫ */
    public InterfaceC13568 f9779;

    /* JADX INFO: renamed from: ۤ */
    public String f9780;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f9781;

    /* JADX INFO: renamed from: ۨ */
    public ArrayList f9782;

    /* JADX INFO: renamed from: ۫ */
    public Object f9783;

    /* JADX INFO: renamed from: ۬ */
    public boolean f9784;

    /* JADX INFO: renamed from: ۬֫ */
    public int f9785;

    /* JADX INFO: renamed from: ܰ */
    public Bundle f9786;

    /* JADX INFO: renamed from: ܳ֫ */
    public long f9787;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f9788;

    /* JADX INFO: renamed from: ܺ֫ */
    public InterfaceC24296 f9789;

    /* JADX INFO: renamed from: ܽ֫ */
    public Drawable f9790;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f9791;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f9792;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f9793;

    /* JADX INFO: renamed from: ᩵֫ */
    public AbstractC5701 f9794;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f9795;

    /* JADX INFO: renamed from: ᩶֫ */
    public InterfaceC9544 f9796;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f9797;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f9798;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f9799;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f9800;

    /* JADX INFO: renamed from: ᩹֫ */
    public CharSequence f9801;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f9802;

    /* JADX INFO: renamed from: ᩻֫ */
    public Intent f9803;

    /* JADX INFO: renamed from: ֫ */
    public Object mo9013(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9021(Object obj) {
    }

    /* JADX INFO: renamed from: ۛ */
    public void mo9034() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4360 c4360 = (C4360) obj;
        int i = this.f9770;
        int i2 = c4360.f9770;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f9772;
        CharSequence charSequence2 = c4360.f9772;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(c4360.f9772.toString());
    }

    public C4360(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f9770 = Integer.MAX_VALUE;
        this.f9802 = true;
        this.f9777 = true;
        this.f9764 = true;
        this.f9774 = true;
        this.f9793 = true;
        this.f9769 = true;
        this.f9798 = true;
        this.f9800 = true;
        this.f9799 = true;
        this.f9788 = true;
        this.f9797 = R.layout.MT_Protector;
        this.f9771 = new ViewOnClickListenerC14238(this);
        this.f9768 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32869, i, i2);
        this.f9792 = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f9775 = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f9772 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f9801 = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f9770 = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f9776 = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f9797 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.MT_Protector));
        this.f9785 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f9802 = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f9777 = z;
        this.f9764 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f9780 = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f9798 = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.f9800 = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f9783 = mo9013(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f9783 = mo9013(typedArrayObtainStyledAttributes, 11);
        }
        this.f9788 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f9781 = zHasValue;
        if (zHasValue) {
            this.f9799 = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f9791 = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f9769 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f9784 = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C4360(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C4360(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.preferenceStyle));
    }

    public C4360(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9016(Intent intent) {
        this.f9803 = intent;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Intent m9063() {
        return this.f9803;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m9055() {
        return this.f9776;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Bundle m9039() {
        if (this.f9786 == null) {
            this.f9786 = new Bundle();
        }
        return this.f9786;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final void m9045() {
        this.f9797 = R.layout.MT_Protector;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m9036() {
        return this.f9797;
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m9051() {
        return this.f9785;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5137(C22486 c22486) {
        Integer numValueOf;
        View view = c22486.itemView;
        view.setOnClickListener(this.f9771);
        view.setId(0);
        TextView textView = (TextView) c22486.m50437(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo9033 = mo9033();
            if (!TextUtils.isEmpty(charSequenceMo9033)) {
                textView.setText(charSequenceMo9033);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c22486.m50437(android.R.id.title);
        boolean z = this.f9777;
        if (textView2 != null) {
            CharSequence charSequence = this.f9772;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f9781) {
                    textView2.setSingleLine(this.f9799);
                }
                if (!z && mo9062() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) c22486.m50437(android.R.id.icon);
        boolean z2 = this.f9791;
        if (imageView != null) {
            int i = this.f9792;
            if (i != 0 || this.f9790 != null) {
                if (this.f9790 == null) {
                    this.f9790 = C22622.m50680(this.f9768, i);
                }
                Drawable drawable = this.f9790;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f9790 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewM50437 = c22486.m50437(R.id.MT_Protector);
        if (viewM50437 == null) {
            viewM50437 = c22486.m50437(android.R.id.icon_frame);
        }
        if (viewM50437 != null) {
            if (this.f9790 != null) {
                viewM50437.setVisibility(0);
            } else {
                viewM50437.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.f9788) {
            m9008(view, mo9062());
        } else {
            m9008(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        c22486.m50435(this.f9798);
        c22486.m50438(this.f9800);
        boolean z3 = this.f9784;
        if (z3 && this.f9767 == null) {
            this.f9767 = new ViewOnCreateContextMenuListenerC15578(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.f9767 : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        int i2 = C1717.f57146;
        view.setBackground(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9008(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                m9008(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m9059(int i) {
        if (i != this.f9770) {
            this.f9770 = i;
            m9047();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m9052() {
        return this.f9770;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final void m9054() {
        String string = this.f9768.getString(R.string.MT_Protector);
        if (TextUtils.equals(string, this.f9772)) {
            return;
        }
        this.f9772 = string;
        mo9048();
    }

    /* JADX INFO: renamed from: ۠ */
    public final CharSequence m9035() {
        return this.f9772;
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m9049() {
        Drawable drawableM50680 = C22622.m50680(this.f9768, R.drawable.MT_Protector);
        if (this.f9790 != drawableM50680) {
            this.f9790 = drawableM50680;
            this.f9792 = 0;
            mo9048();
        }
        this.f9792 = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m9056(int i) {
        mo9020((CharSequence) this.f9768.getString(i));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m9057(boolean z) {
        if (this.f9802 != z) {
            this.f9802 = z;
            mo9044(mo9058());
            mo9048();
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public boolean mo9062() {
        return this.f9802 && this.f9774 && this.f9793;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m9050(boolean z) {
        if (this.f9769 != z) {
            this.f9769 = z;
            InterfaceC13568 interfaceC13568 = this.f9779;
            if (interfaceC13568 != null) {
                ((C8383) interfaceC13568).m19548();
            }
        }
    }

    /* JADX INFO: renamed from: ۗ */
    public final boolean m9031() {
        return this.f9769;
    }

    /* JADX INFO: renamed from: ᩻ */
    public long mo9067() {
        return this.f9787;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m9030() {
        this.f9775 = "ssvc";
        if (!this.f9765 || m9064()) {
            return;
        }
        if (TextUtils.isEmpty(this.f9775)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f9765 = true;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m9037() {
        return this.f9775;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m9064() {
        return !TextUtils.isEmpty(this.f9775);
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m9032() {
        return this.f9764;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean m9068() {
        return this.f9773 != null && this.f9764 && m9064();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m9065() {
        return this.f9784;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9024(InterfaceC9544 interfaceC9544) {
        this.f9796 = interfaceC9544;
        mo9048();
    }

    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC9544 m9010() {
        return this.f9796;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9020(CharSequence charSequence) {
        if (this.f9796 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f9801, charSequence)) {
            return;
        }
        this.f9801 = charSequence;
        mo9048();
    }

    /* JADX INFO: renamed from: ۚ */
    public CharSequence mo9033() {
        InterfaceC9544 interfaceC9544 = this.f9796;
        if (interfaceC9544 != null) {
            return interfaceC9544.mo9168(this);
        }
        return this.f9801;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9019(Serializable serializable) {
        C9692 c9692 = this.f9778;
        if (c9692 != null) {
            c9692.m22601(this, serializable);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9025(C9692 c9692) {
        this.f9778 = c9692;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9028(InterfaceC24296 interfaceC24296) {
        this.f9789 = interfaceC24296;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5136(View view) {
        Intent intent;
        InterfaceC19803 interfaceC19803M43525;
        if (mo9062() && this.f9777) {
            mo9034();
            InterfaceC24296 interfaceC24296 = this.f9789;
            if (interfaceC24296 != null) {
                C14418 c14418 = (C14418) interfaceC24296;
                c14418.f41222.m12697(Integer.MAX_VALUE);
                c14418.f41221.m19548();
                return;
            }
            C19132 c19132 = this.f9773;
            if ((c19132 == null || (interfaceC19803M43525 = c19132.m43525()) == null || !interfaceC19803M43525.mo10709(this)) && (intent = this.f9803) != null) {
                this.f9768.startActivity(intent);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Context m9012() {
        return this.f9768;
    }

    /* JADX INFO: renamed from: ֡ */
    public final SharedPreferences m9009() {
        C19132 c19132 = this.f9773;
        if (c19132 != null) {
            return c19132.m43522();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9023(C8383 c8383) {
        this.f9779 = c8383;
    }

    /* JADX INFO: renamed from: ۬ */
    public void mo9048() {
        InterfaceC13568 interfaceC13568 = this.f9779;
        if (interfaceC13568 != null) {
            ((C8383) interfaceC13568).m19549(this);
        }
    }

    /* JADX INFO: renamed from: ۫ */
    public final void m9047() {
        InterfaceC13568 interfaceC13568 = this.f9779;
        if (interfaceC13568 != null) {
            ((C8383) interfaceC13568).m19548();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C19132 m9061() {
        return this.f9773;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9026(C19132 c19132) {
        this.f9773 = c19132;
        if (!this.f9766) {
            this.f9787 = c19132.m43521();
        }
        if (!m9068() || !m9009().contains(this.f9775)) {
            Object obj = this.f9783;
            if (obj != null) {
                mo9021(obj);
                return;
            }
            return;
        }
        mo9021((Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9027(C19132 c19132, long j) {
        this.f9787 = j;
        this.f9766 = true;
        try {
            m9026(c19132);
        } finally {
            this.f9766 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9022(AbstractC5701 abstractC5701) {
        if (abstractC5701 != null && this.f9794 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f9794 = abstractC5701;
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo9038() {
        String str = this.f9780;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C19132 c19132 = this.f9773;
        C4360 c4360M43513 = c19132 == null ? null : c19132.m43513((CharSequence) str);
        if (c4360M43513 == null) {
            StringBuilder sbM11879 = C5410.m11879("Dependency \"", str, "\" not found for preference \"");
            sbM11879.append(this.f9775);
            sbM11879.append("\" (title: \"");
            sbM11879.append((Object) this.f9772);
            sbM11879.append("\"");
            throw new IllegalStateException(sbM11879.toString());
        }
        if (c4360M43513.f9782 == null) {
            c4360M43513.f9782 = new ArrayList();
        }
        c4360M43513.f9782.add(this);
        boolean zMo9058 = c4360M43513.mo9058();
        if (this.f9774 == zMo9058) {
            this.f9774 = !zMo9058;
            mo9044(mo9058());
            mo9048();
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo9046() {
        ArrayList arrayList;
        String str = this.f9780;
        if (str != null) {
            C19132 c19132 = this.f9773;
            C4360 c4360M43513 = c19132 == null ? null : c19132.m43513((CharSequence) str);
            if (c4360M43513 == null || (arrayList = c4360M43513.f9782) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo9044(boolean z) {
        ArrayList arrayList = this.f9782;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4360 c4360 = (C4360) arrayList.get(i);
            if (c4360.f9774 == z) {
                c4360.f9774 = !z;
                c4360.mo9044(c4360.mo9058());
                c4360.mo9048();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9053(boolean z) {
        if (this.f9793 == z) {
            this.f9793 = !z;
            mo9044(mo9058());
            mo9048();
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean mo9058() {
        return !mo9062();
    }

    public final AbstractC5701 getParent() {
        return this.f9794;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9042(String str) {
        if (m9068() && !TextUtils.equals(str, m9014((String) null))) {
            SharedPreferences.Editor editorM43512 = this.f9773.m43512();
            editorM43512.putString(this.f9775, str);
            if (this.f9773.m43526()) {
                editorM43512.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m9014(String str) {
        return !m9068() ? str : this.f9773.m43522().getString(this.f9775, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9043(Set set) {
        if (m9068() && !set.equals(m9015((Set) null))) {
            SharedPreferences.Editor editorM43512 = this.f9773.m43512();
            editorM43512.putStringSet(this.f9775, set);
            if (this.f9773.m43526()) {
                editorM43512.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m9015(Set set) {
        return !m9068() ? set : this.f9773.m43522().getStringSet(this.f9775, set);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9040(int i) {
        if (m9068() && i != m9011(~i)) {
            SharedPreferences.Editor editorM43512 = this.f9773.m43512();
            editorM43512.putInt(this.f9775, i);
            if (this.f9773.m43526()) {
                editorM43512.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m9011(int i) {
        return !m9068() ? i : this.f9773.m43522().getInt(this.f9775, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m9060(boolean z) {
        if (m9068() && z != m9029(!z)) {
            SharedPreferences.Editor editorM43512 = this.f9773.m43512();
            editorM43512.putBoolean(this.f9775, z);
            if (this.f9773.m43526()) {
                editorM43512.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9029(boolean z) {
        return !m9068() ? z : this.f9773.m43522().getBoolean(this.f9775, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f9772;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo9033 = mo9033();
        if (!TextUtils.isEmpty(charSequenceMo9033)) {
            sb.append(charSequenceMo9033);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo9041(Bundle bundle) {
        if (m9064()) {
            this.f9795 = false;
            Parcelable parcelableMo9066 = mo9066();
            if (!this.f9795) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo9066 != null) {
                bundle.putParcelable(this.f9775, parcelableMo9066);
            }
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public Parcelable mo9066() {
        this.f9795 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9017(Bundle bundle) {
        Parcelable parcelable;
        if (!m9064() || (parcelable = bundle.getParcelable(this.f9775)) == null) {
            return;
        }
        this.f9795 = false;
        mo9018(parcelable);
        if (!this.f9795) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9018(Parcelable parcelable) {
        this.f9795 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
