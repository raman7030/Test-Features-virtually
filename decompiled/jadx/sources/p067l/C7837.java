package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes2.dex */
public final class C7837 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC23930 f20561;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C7837(AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930) {
        this.f20561 = abstractDialogInterfaceOnClickListenerC23930;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f20561.f76035.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C13202 c13202;
        AbstractDialogInterfaceOnClickListenerC23930 abstractDialogInterfaceOnClickListenerC23930 = this.f20561;
        if (view == null) {
            view = abstractDialogInterfaceOnClickListenerC23930.f76038.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c13202 = new C13202(view);
            view.setTag(c13202);
        } else {
            c13202 = (C13202) view.getTag();
        }
        c13202.f37096.setText(((C21249) abstractDialogInterfaceOnClickListenerC23930.f76035.get(i)).m48007());
        c13202.f37096.setChecked(abstractDialogInterfaceOnClickListenerC23930.f76033 == i);
        return view;
    }
}
