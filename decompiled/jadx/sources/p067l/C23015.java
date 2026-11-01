package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.᩸ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes.dex */
public final class C23015 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public String f72391;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ViewOnClickListenerC21674 f72392;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C23015(ViewOnClickListenerC21674 viewOnClickListenerC21674) {
        this.f72392 = viewOnClickListenerC21674;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51400(String str) {
        this.f72391 = str;
        m51399();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51399() {
        String str = this.f72391;
        ViewOnClickListenerC21674 viewOnClickListenerC21674 = this.f72392;
        if (str == null || str.isEmpty()) {
            ((ArrayList) viewOnClickListenerC21674.f68279).clear();
            ((ArrayList) viewOnClickListenerC21674.f68279).addAll(viewOnClickListenerC21674.f68269);
            ((ArrayList) viewOnClickListenerC21674.f68272).clear();
            ((ArrayList) viewOnClickListenerC21674.f68272).addAll(viewOnClickListenerC21674.f68261);
            notifyDataSetChanged();
            return;
        }
        ((ArrayList) viewOnClickListenerC21674.f68272).clear();
        ((ArrayList) viewOnClickListenerC21674.f68279).clear();
        try {
            String str2 = this.f72391;
            for (Object obj : viewOnClickListenerC21674.f68261) {
                if (ViewOnClickListenerC21674.m48890(viewOnClickListenerC21674, obj, str2)) {
                    ((ArrayList) viewOnClickListenerC21674.f68272).add(obj);
                }
            }
            for (C11440 c11440 : viewOnClickListenerC21674.f68269) {
                if (C11567.m26630((CharSequence) c11440.m26428(), (CharSequence) str2)) {
                    ((ArrayList) viewOnClickListenerC21674.f68279).add(c11440);
                }
            }
        } catch (ConcurrentModificationException unused) {
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ViewOnClickListenerC21674 viewOnClickListenerC21674 = this.f72392;
        return ((ArrayList) (viewOnClickListenerC21674.f68271 ? viewOnClickListenerC21674.f68279 : viewOnClickListenerC21674.f68272)).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ViewOnClickListenerC21674 viewOnClickListenerC21674 = this.f72392;
        return ((ArrayList) (viewOnClickListenerC21674.f68271 ? viewOnClickListenerC21674.f68279 : viewOnClickListenerC21674.f68272)).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C23685 c23685;
        if (view != null) {
            c23685 = (C23685) view.getTag();
        } else {
            view = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c23685 = new C23685();
            c23685.f75402 = (TextView) view.findViewById(R.id.textView);
            c23685.f75400 = (TextView) view.findViewById(R.id.textView2);
            c23685.f75401 = (ImageView) view.findViewById(R.id.icon);
            view.setTag(c23685);
        }
        ViewOnClickListenerC21674 viewOnClickListenerC21674 = this.f72392;
        if (viewOnClickListenerC21674.f68271) {
            C11440 c11440 = (C11440) ((ArrayList) viewOnClickListenerC21674.f68279).get(i);
            if (c11440 == viewOnClickListenerC21674.f68265) {
                view.setBackgroundColor(C23223.f72997);
            } else {
                view.setBackgroundColor(0);
            }
            c23685.f75401.setImageBitmap(viewOnClickListenerC21674.f68259);
            c23685.f75402.setText(C8597.m20011(200, c11440.m26428().replace('\n', ' ').replace('\r', ' ')));
            c23685.f75402.setSingleLine(false);
            c23685.f75400.setVisibility(8);
        } else {
            Object obj = ((ArrayList) viewOnClickListenerC21674.f68272).get(i);
            if (obj == viewOnClickListenerC21674.f68273.mo10027()) {
                view.setBackgroundColor(C23223.f72997);
            } else {
                view.setBackgroundColor(0);
            }
            c23685.f75402.setSingleLine(true);
            c23685.f75400.setVisibility(0);
            if (obj instanceof C10769) {
                C10769 c10769 = (C10769) obj;
                c23685.f75401.setImageBitmap(viewOnClickListenerC21674.f68266);
                c23685.f75402.setText(C8597.m20011(100, c10769.m24803()));
                c23685.f75400.setText(C8597.m20011(200, c10769.m24805()));
            } else if (obj instanceof C16132) {
                C16132 c16132 = (C16132) obj;
                c23685.f75401.setImageBitmap(viewOnClickListenerC21674.f68270);
                c23685.f75402.setText(C8597.m20011(100, c16132.m36722()));
                c23685.f75400.setText(C8597.m20011(200, c16132.m36717()));
            } else {
                C24850 c24850 = (C24850) obj;
                c23685.f75401.setImageBitmap(viewOnClickListenerC21674.f68264);
                c23685.f75402.setText(C8597.m20011(100, c24850.m54584()));
                c23685.f75400.setText(C8597.m20011(200, c24850.m54581()));
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = viewOnClickListenerC21674.f68274.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
