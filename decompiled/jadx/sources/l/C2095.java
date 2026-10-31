package l;

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
import bin.mt.plus.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5LX */
/* JADX INFO: loaded from: classes2.dex */
public class C2095 implements Comparable {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f6980;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f6981;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f6982;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ViewOnCreateContextMenuListenerC13899 f6983;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Context f6984;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f6985;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f6986;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f6987;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f6988;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public C17638 f6989;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f6990;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f6991;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f6992;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f6993;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C7705 f6994;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11784 f6995;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f6996;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f6997;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f6998;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f6999;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f7000;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f7001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f7002;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public long f7003;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f7004;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23072 f7005;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public Drawable f7006;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f7007;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f7008;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f7009;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AbstractC3506 f7010;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7011;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7550 f7012;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f7013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f7014;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f7015;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f7016;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public CharSequence f7017;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f7018;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public Intent f7019;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo6887(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6895(Object obj) {
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public void mo6908() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2095 c2095 = (C2095) obj;
        int i = this.f6986;
        int i2 = c2095.f6986;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f6988;
        CharSequence charSequence2 = c2095.f6988;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(c2095.f6988.toString());
    }

    public C2095(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f6986 = Integer.MAX_VALUE;
        this.f7018 = true;
        this.f6993 = true;
        this.f6980 = true;
        this.f6990 = true;
        this.f7009 = true;
        this.f6985 = true;
        this.f7014 = true;
        this.f7016 = true;
        this.f7015 = true;
        this.f7004 = true;
        this.f7013 = R.layout.MT_Protector;
        this.f6987 = new ViewOnClickListenerC12489(this);
        this.f6984 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29912, i, i2);
        this.f7008 = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f6991 = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f6988 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f7017 = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f6986 = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f6992 = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f7013 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.MT_Protector));
        this.f7001 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f7018 = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f6993 = z;
        this.f6980 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f6996 = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f7014 = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.f7016 = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f6999 = mo6887(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f6999 = mo6887(typedArrayObtainStyledAttributes, 11);
        }
        this.f7004 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f6997 = zHasValue;
        if (zHasValue) {
            this.f7015 = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f7007 = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f6985 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f7000 = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C2095(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C2095(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.preferenceStyle));
    }

    public C2095(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6890(Intent intent) {
        this.f7019 = intent;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Intent m6937() {
        return this.f7019;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m6929() {
        return this.f6992;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle m6913() {
        if (this.f7002 == null) {
            this.f7002 = new Bundle();
        }
        return this.f7002;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m6919() {
        this.f7013 = R.layout.MT_Protector;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m6910() {
        return this.f7013;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m6925() {
        return this.f7001;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo2792(C21167 c21167) {
        Integer numValueOf;
        View view = c21167.itemView;
        view.setOnClickListener(this.f6987);
        view.setId(0);
        TextView textView = (TextView) c21167.m48107(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo6907 = mo6907();
            if (!TextUtils.isEmpty(charSequenceMo6907)) {
                textView.setText(charSequenceMo6907);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c21167.m48107(android.R.id.title);
        boolean z = this.f6993;
        if (textView2 != null) {
            CharSequence charSequence = this.f6988;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f6997) {
                    textView2.setSingleLine(this.f7015);
                }
                if (!z && mo6936() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) c21167.m48107(android.R.id.icon);
        boolean z2 = this.f7007;
        if (imageView != null) {
            int i = this.f7008;
            if (i != 0 || this.f7006 != null) {
                if (this.f7006 == null) {
                    this.f7006 = C21311.m48345(this.f6984, i);
                }
                Drawable drawable = this.f7006;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f7006 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewM48107 = c21167.m48107(R.id.MT_Protector);
        if (viewM48107 == null) {
            viewM48107 = c21167.m48107(android.R.id.icon_frame);
        }
        if (viewM48107 != null) {
            if (this.f7006 != null) {
                viewM48107.setVisibility(0);
            } else {
                viewM48107.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.f7004) {
            m6882(view, mo6936());
        } else {
            m6882(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        c21167.m48105(this.f7014);
        c21167.m48108(this.f7016);
        boolean z3 = this.f7000;
        if (z3 && this.f6983 == null) {
            this.f6983 = new ViewOnCreateContextMenuListenerC13899(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.f6983 : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        int i2 = C17648.f53953;
        view.setBackground(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6882(View view, boolean z) {
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
                m6882(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6933(int i) {
        if (i != this.f6986) {
            this.f6986 = i;
            m6921();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m6926() {
        return this.f6986;
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final void m6928() {
        String string = this.f6984.getString(R.string.MT_Protector);
        if (TextUtils.equals(string, this.f6988)) {
            return;
        }
        this.f6988 = string;
        mo6922();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final CharSequence m6909() {
        return this.f6988;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6923() {
        Drawable drawableM48345 = C21311.m48345(this.f6984, R.drawable.MT_Protector);
        if (this.f7006 != drawableM48345) {
            this.f7006 = drawableM48345;
            this.f7008 = 0;
            mo6922();
        }
        this.f7008 = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6930(int i) {
        mo6894((CharSequence) this.f6984.getString(i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6931(boolean z) {
        if (this.f7018 != z) {
            this.f7018 = z;
            mo6918(mo6932());
            mo6922();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean mo6936() {
        return this.f7018 && this.f6990 && this.f7009;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6924(boolean z) {
        if (this.f6985 != z) {
            this.f6985 = z;
            InterfaceC11784 interfaceC11784 = this.f6995;
            if (interfaceC11784 != null) {
                ((C6328) interfaceC11784).m17608();
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m6905() {
        return this.f6985;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long mo6941() {
        return this.f7003;
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m6904() {
        this.f6991 = "ssvc";
        if (!this.f6981 || m6938()) {
            return;
        }
        if (TextUtils.isEmpty(this.f6991)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f6981 = true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m6911() {
        return this.f6991;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m6938() {
        return !TextUtils.isEmpty(this.f6991);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6906() {
        return this.f6980;
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m6942() {
        return this.f6989 != null && this.f6980 && m6938();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m6939() {
        return this.f7000;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6898(InterfaceC7550 interfaceC7550) {
        this.f7012 = interfaceC7550;
        mo6922();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC7550 m6884() {
        return this.f7012;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6894(CharSequence charSequence) {
        if (this.f7012 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f7017, charSequence)) {
            return;
        }
        this.f7017 = charSequence;
        mo6922();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence mo6907() {
        InterfaceC7550 interfaceC7550 = this.f7012;
        if (interfaceC7550 != null) {
            return interfaceC7550.mo7073(this);
        }
        return this.f7017;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6893(Serializable serializable) {
        C7705 c7705 = this.f6994;
        if (c7705 != null) {
            c7705.m20621(this, serializable);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6899(C7705 c7705) {
        this.f6994 = c7705;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6902(InterfaceC23072 interfaceC23072) {
        this.f7005 = interfaceC23072;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo2791(View view) {
        Intent intent;
        InterfaceC18344 interfaceC18344M41279;
        if (mo6936() && this.f6993) {
            mo6908();
            InterfaceC23072 interfaceC23072 = this.f7005;
            if (interfaceC23072 != null) {
                C12678 c12678 = (C12678) interfaceC23072;
                c12678.f38195.m10702(Integer.MAX_VALUE);
                c12678.f38194.m17608();
                return;
            }
            C17638 c17638 = this.f6989;
            if ((c17638 == null || (interfaceC18344M41279 = c17638.m41279()) == null || !interfaceC18344M41279.mo8649(this)) && (intent = this.f7019) != null) {
                this.f6984.startActivity(intent);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context m6886() {
        return this.f6984;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m6883() {
        C17638 c17638 = this.f6989;
        if (c17638 != null) {
            return c17638.m41276();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6897(C6328 c6328) {
        this.f6995 = c6328;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void mo6922() {
        InterfaceC11784 interfaceC11784 = this.f6995;
        if (interfaceC11784 != null) {
            ((C6328) interfaceC11784).m17609(this);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m6921() {
        InterfaceC11784 interfaceC11784 = this.f6995;
        if (interfaceC11784 != null) {
            ((C6328) interfaceC11784).m17608();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17638 m6935() {
        return this.f6989;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6900(C17638 c17638) {
        this.f6989 = c17638;
        if (!this.f6982) {
            this.f7003 = c17638.m41275();
        }
        if (!m6942() || !m6883().contains(this.f6991)) {
            Object obj = this.f6999;
            if (obj != null) {
                mo6895(obj);
                return;
            }
            return;
        }
        mo6895((Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6901(C17638 c17638, long j) {
        this.f7003 = j;
        this.f6982 = true;
        try {
            m6900(c17638);
        } finally {
            this.f6982 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6896(AbstractC3506 abstractC3506) {
        if (abstractC3506 != null && this.f7010 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f7010 = abstractC3506;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo6912() {
        String str = this.f6996;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C17638 c17638 = this.f6989;
        C2095 c2095M41267 = c17638 == null ? null : c17638.m41267((CharSequence) str);
        if (c2095M41267 == null) {
            StringBuilder sbM9834 = C3200.m9834("Dependency \"", str, "\" not found for preference \"");
            sbM9834.append(this.f6991);
            sbM9834.append("\" (title: \"");
            sbM9834.append((Object) this.f6988);
            sbM9834.append("\"");
            throw new IllegalStateException(sbM9834.toString());
        }
        if (c2095M41267.f6998 == null) {
            c2095M41267.f6998 = new ArrayList();
        }
        c2095M41267.f6998.add(this);
        boolean zMo6932 = c2095M41267.mo6932();
        if (this.f6990 == zMo6932) {
            this.f6990 = !zMo6932;
            mo6918(mo6932());
            mo6922();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo6920() {
        ArrayList arrayList;
        String str = this.f6996;
        if (str != null) {
            C17638 c17638 = this.f6989;
            C2095 c2095M41267 = c17638 == null ? null : c17638.m41267((CharSequence) str);
            if (c2095M41267 == null || (arrayList = c2095M41267.f6998) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo6918(boolean z) {
        ArrayList arrayList = this.f6998;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2095 c2095 = (C2095) arrayList.get(i);
            if (c2095.f6990 == z) {
                c2095.f6990 = !z;
                c2095.mo6918(c2095.mo6932());
                c2095.mo6922();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6927(boolean z) {
        if (this.f7009 == z) {
            this.f7009 = !z;
            mo6918(mo6932());
            mo6922();
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean mo6932() {
        return !mo6936();
    }

    public final AbstractC3506 getParent() {
        return this.f7010;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6916(String str) {
        if (m6942() && !TextUtils.equals(str, m6888((String) null))) {
            SharedPreferences.Editor editorM41266 = this.f6989.m41266();
            editorM41266.putString(this.f6991, str);
            if (this.f6989.m41280()) {
                editorM41266.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m6888(String str) {
        return !m6942() ? str : this.f6989.m41276().getString(this.f6991, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6917(Set set) {
        if (m6942() && !set.equals(m6889((Set) null))) {
            SharedPreferences.Editor editorM41266 = this.f6989.m41266();
            editorM41266.putStringSet(this.f6991, set);
            if (this.f6989.m41280()) {
                editorM41266.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m6889(Set set) {
        return !m6942() ? set : this.f6989.m41276().getStringSet(this.f6991, set);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6914(int i) {
        if (m6942() && i != m6885(~i)) {
            SharedPreferences.Editor editorM41266 = this.f6989.m41266();
            editorM41266.putInt(this.f6991, i);
            if (this.f6989.m41280()) {
                editorM41266.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6885(int i) {
        return !m6942() ? i : this.f6989.m41276().getInt(this.f6991, i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6934(boolean z) {
        if (m6942() && z != m6903(!z)) {
            SharedPreferences.Editor editorM41266 = this.f6989.m41266();
            editorM41266.putBoolean(this.f6991, z);
            if (this.f6989.m41280()) {
                editorM41266.apply();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6903(boolean z) {
        return !m6942() ? z : this.f6989.m41276().getBoolean(this.f6991, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f6988;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo6907 = mo6907();
        if (!TextUtils.isEmpty(charSequenceMo6907)) {
            sb.append(charSequenceMo6907);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo6915(Bundle bundle) {
        if (m6938()) {
            this.f7011 = false;
            Parcelable parcelableMo6940 = mo6940();
            if (!this.f7011) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo6940 != null) {
                bundle.putParcelable(this.f6991, parcelableMo6940);
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Parcelable mo6940() {
        this.f7011 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6891(Bundle bundle) {
        Parcelable parcelable;
        if (!m6938() || (parcelable = bundle.getParcelable(this.f6991)) == null) {
            return;
        }
        this.f7011 = false;
        mo6892(parcelable);
        if (!this.f7011) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6892(Parcelable parcelable) {
        this.f7011 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
}
