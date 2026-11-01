package p067l;

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
public class C23431 extends LinearLayout {

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f74646;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f74647;

    /* JADX INFO: renamed from: ᩸ */
    public final CheckedTextView f74648;

    /* JADX INFO: renamed from: ᩹ */
    public final CheckedTextView f74649;

    public C23431(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C23431(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ViewOnClickListenerC16724 viewOnClickListenerC16724 = new ViewOnClickListenerC16724(this);
        new C22809(getResources());
        new ArrayList();
        this.f74646 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f74649 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(bin.p000mt.plus.R.string.MT_Protector);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC16724);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f74648 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(bin.p000mt.plus.R.string.MT_Protector);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC16724);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52137(C23431 c23431, View view) {
        CheckedTextView checkedTextView = c23431.f74648;
        HashMap map = c23431.f74646;
        CheckedTextView checkedTextView2 = c23431.f74649;
        if (view == checkedTextView2) {
            c23431.f74647 = true;
            map.clear();
        } else if (view == checkedTextView) {
            c23431.f74647 = false;
            map.clear();
        } else {
            c23431.f74647 = false;
            Object tag = view.getTag();
            tag.getClass();
            throw null;
        }
        checkedTextView2.setChecked(c23431.f74647);
        checkedTextView.setChecked(!c23431.f74647 && map.isEmpty());
        throw null;
    }
}
