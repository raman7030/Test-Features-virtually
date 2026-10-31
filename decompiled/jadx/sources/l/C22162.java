package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8G2 */
/* JADX INFO: loaded from: classes.dex */
public class C22162 extends LinearLayout {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f71924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71925;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f71926;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f71927;

    public C22162(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C22162(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ViewOnClickListenerC15105 viewOnClickListenerC15105 = new ViewOnClickListenerC15105(this);
        new C21507(getResources());
        new ArrayList();
        this.f71924 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f71927 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(bin.mt.plus.R.string.MT_Protector);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC15105);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f71926 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(bin.mt.plus.R.string.MT_Protector);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC15105);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49799(C22162 c22162, View view) {
        CheckedTextView checkedTextView = c22162.f71926;
        HashMap map = c22162.f71924;
        CheckedTextView checkedTextView2 = c22162.f71927;
        if (view == checkedTextView2) {
            c22162.f71925 = true;
            map.clear();
        } else if (view == checkedTextView) {
            c22162.f71925 = false;
            map.clear();
        } else {
            c22162.f71925 = false;
            Object tag = view.getTag();
            tag.getClass();
            throw null;
        }
        checkedTextView2.setChecked(c22162.f71925);
        checkedTextView.setChecked(!c22162.f71925 && map.isEmpty());
        throw null;
    }
}
