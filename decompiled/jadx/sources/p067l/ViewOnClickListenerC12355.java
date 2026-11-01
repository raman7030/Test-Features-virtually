package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC12355 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final View f34473;

    /* JADX INFO: renamed from: ۙ */
    public final TextView f34474;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ViewOnClickListenerC20541 f34475;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f34476;

    /* JADX INFO: renamed from: ᩶ */
    public final ImageView f34477;

    /* JADX INFO: renamed from: ᩸ */
    public final View f34478;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC19370 f34479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12355(ViewOnClickListenerC20541 viewOnClickListenerC20541, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewOnClickListenerC20541).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f34475 = viewOnClickListenerC20541;
        View viewFindViewById = this.itemView.findViewById(R.id.MT_Protector);
        C13045.m29865(viewFindViewById, "findViewById(...)");
        this.f34473 = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.MT_Protector);
        C13045.m29865(viewFindViewById2, "findViewById(...)");
        this.f34478 = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.icon);
        C13045.m29865(viewFindViewById3, "findViewById(...)");
        this.f34477 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.MT_Protector);
        C13045.m29865(viewFindViewById4, "findViewById(...)");
        this.f34476 = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.MT_Protector);
        C13045.m29865(viewFindViewById5, "findViewById(...)");
        this.f34474 = (TextView) viewFindViewById5;
        this.itemView.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19370 m28439() {
        InterfaceC19370 interfaceC19370 = this.f34479;
        if (interfaceC19370 != null) {
            return interfaceC19370;
        }
        C13045.m29866("fileItem");
        throw null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final View m28442() {
        return this.f34473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m28438() {
        return this.f34478;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ImageView m28441() {
        return this.f34477;
    }

    /* JADX INFO: renamed from: ܳ */
    public final TextView m28440() {
        return this.f34476;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final TextView m28443() {
        return this.f34474;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18310 c18310;
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f34475;
        C14102 c14102 = viewOnClickListenerC20541.f63475;
        if (c14102 == null) {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
        if (c14102.m32022() || (c18310 = viewOnClickListenerC20541.f63484) == null) {
            return;
        }
        if (m28439().mo39148()) {
            viewOnClickListenerC20541.m46437();
            return;
        }
        if (m28439().isDirectory()) {
            C0977 c0977 = c18310.f55048.f36716;
            C13045.m29865(c0977, "backPositionMap");
            c0977.put(c18310.m41982(), Integer.valueOf(viewOnClickListenerC20541.f63496.m43682()));
            viewOnClickListenerC20541.m46377(C17588.m40053(m28439().getPath(), "/"), (InterfaceC4387) null);
            return;
        }
        int i = viewOnClickListenerC20541.f63481;
        if (i == 1) {
            String path = m28439().getPath();
            C13045.m29865(path, "getPath(...)");
            C10987.m25348(path, (C19033) null);
            String path2 = m28439().getPath();
            C13045.m29865(path2, "getPath(...)");
            viewOnClickListenerC20541.m46420(path2);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new RuntimeException();
            }
            if (m28439().mo39135()) {
                m28439().setChecked(!m28439().isChecked());
                ViewOnClickListenerC20541.m46390(viewOnClickListenerC20541, this);
                viewOnClickListenerC20541.m46417();
                return;
            }
            return;
        }
        String name = m28439().getName();
        EditText editText = viewOnClickListenerC20541.f63487;
        if (editText == null) {
            C13045.m29866("filenameEditText");
            throw null;
        }
        editText.setText(name);
        C13045.m29861((Object) name);
        int iM11299 = C5235.m11299(name);
        if (iM11299 == -1) {
            iM11299 = name.length();
        }
        EditText editText2 = viewOnClickListenerC20541.f63487;
        if (editText2 == null) {
            C13045.m29866("filenameEditText");
            throw null;
        }
        editText2.setSelection(0, iM11299);
        EditText editText3 = viewOnClickListenerC20541.f63487;
        if (editText3 == null) {
            C13045.m29866("filenameEditText");
            throw null;
        }
        C7050.m16231(editText3);
        viewOnClickListenerC20541.f63468 = getBindingAdapterPosition();
        viewOnClickListenerC20541.f63474 = System.currentTimeMillis() + ((long) 500);
    }
}
