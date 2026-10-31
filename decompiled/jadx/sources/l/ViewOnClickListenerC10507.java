package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10507 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f31511;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f31512;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f31513;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f31514;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f31515;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f31516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f31517;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10507(ViewOnClickListenerC19121 viewOnClickListenerC19121, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewOnClickListenerC19121).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f31513 = viewOnClickListenerC19121;
        View viewFindViewById = this.itemView.findViewById(R.id.MT_Protector);
        C11233.m27803(viewFindViewById, "findViewById(...)");
        this.f31511 = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.MT_Protector);
        C11233.m27803(viewFindViewById2, "findViewById(...)");
        this.f31516 = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.icon);
        C11233.m27803(viewFindViewById3, "findViewById(...)");
        this.f31515 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.MT_Protector);
        C11233.m27803(viewFindViewById4, "findViewById(...)");
        this.f31514 = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.MT_Protector);
        C11233.m27803(viewFindViewById5, "findViewById(...)");
        this.f31512 = (TextView) viewFindViewById5;
        this.itemView.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m26406() {
        InterfaceC17889 interfaceC17889 = this.f31517;
        if (interfaceC17889 != null) {
            return interfaceC17889;
        }
        C11233.m27804("fileItem");
        throw null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View m26409() {
        return this.f31511;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m26405() {
        return this.f31516;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ImageView m26408() {
        return this.f31515;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView m26407() {
        return this.f31514;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView m26410() {
        return this.f31512;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16773 c16773;
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f31513;
        C12346 c12346 = viewOnClickListenerC19121.f60243;
        if (c12346 == null) {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        if (c12346.m29962() || (c16773 = viewOnClickListenerC19121.f60252) == null) {
            return;
        }
        if (m26406().mo36982()) {
            viewOnClickListenerC19121.m44143();
            return;
        }
        if (m26406().isDirectory()) {
            C2727 c2727 = c16773.f51868.f33716;
            C11233.m27803(c2727, "backPositionMap");
            c2727.put(c16773.m39741(), Integer.valueOf(viewOnClickListenerC19121.f60264.m41436()));
            viewOnClickListenerC19121.m44083(C16014.m37867(m26406().getPath(), "/"), (InterfaceC2123) null);
            return;
        }
        int i = viewOnClickListenerC19121.f60249;
        if (i == 1) {
            String path = m26406().getPath();
            C11233.m27803(path, "getPath(...)");
            C9068.m23402(path, (C17534) null);
            String path2 = m26406().getPath();
            C11233.m27803(path2, "getPath(...)");
            viewOnClickListenerC19121.m44126(path2);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new RuntimeException();
            }
            if (m26406().mo36969()) {
                m26406().setChecked(!m26406().isChecked());
                ViewOnClickListenerC19121.m44096(viewOnClickListenerC19121, this);
                viewOnClickListenerC19121.m44123();
                return;
            }
            return;
        }
        String name = m26406().getName();
        EditText editText = viewOnClickListenerC19121.f60255;
        if (editText == null) {
            C11233.m27804("filenameEditText");
            throw null;
        }
        editText.setText(name);
        C11233.m27799((Object) name);
        int iM9241 = C3016.m9241(name);
        if (iM9241 == -1) {
            iM9241 = name.length();
        }
        EditText editText2 = viewOnClickListenerC19121.f60255;
        if (editText2 == null) {
            C11233.m27804("filenameEditText");
            throw null;
        }
        editText2.setSelection(0, iM9241);
        EditText editText3 = viewOnClickListenerC19121.f60255;
        if (editText3 == null) {
            C11233.m27804("filenameEditText");
            throw null;
        }
        C4925.m14334(editText3);
        viewOnClickListenerC19121.f60236 = getBindingAdapterPosition();
        viewOnClickListenerC19121.f60242 = System.currentTimeMillis() + ((long) 500);
    }
}
