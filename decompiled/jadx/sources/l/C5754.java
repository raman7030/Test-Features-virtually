package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes2.dex */
public final class C5754 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC22687 f17716;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C5754(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687) {
        this.f17716 = abstractDialogInterfaceOnClickListenerC22687;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f17716.f73310.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C11399 c11399;
        AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687 = this.f17716;
        if (view == null) {
            view = abstractDialogInterfaceOnClickListenerC22687.f73313.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c11399 = new C11399(view);
            view.setTag(c11399);
        } else {
            c11399 = (C11399) view.getTag();
        }
        c11399.f34098.setText(((C19866) abstractDialogInterfaceOnClickListenerC22687.f73310.get(i)).m45696());
        c11399.f34098.setChecked(abstractDialogInterfaceOnClickListenerC22687.f73308 == i);
        return view;
    }
}
