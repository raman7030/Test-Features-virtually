package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.i;
import java.util.ArrayList;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8015 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EditText f24745;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EditText f24746;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23537 f24747;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f24748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f24749;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EditText f24750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24751;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f24752;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f24753;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC8015(ActivityC6604 activityC6604) {
        this.f24752 = activityC6604;
        this.f24747 = activityC6604.f20336;
        View viewM10216 = activityC6604.m10216(R.layout.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        this.f24746 = editText;
        this.f24745 = (EditText) viewM10216.findViewById(R.id.editText2);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText3);
        this.f24750 = editText2;
        this.f24748 = (TextView) viewM10216.findViewById(R.id.textView3);
        this.f24749 = viewM10216.findViewById(R.id.MT_Protector);
        editText2.addTextChangedListener(this);
        editText.addTextChangedListener(new C0959(this));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f24753 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21334() {
        C20317 c20317 = this.f24747.f75574;
        this.f24751 = c20317.getTypeName().equals("style");
        this.f24746.setText(String.format("%04X", Integer.valueOf(c20317.mo2878())));
        EditText editText = this.f24745;
        editText.requestFocus();
        boolean z = this.f24751;
        View view = this.f24749;
        if (z) {
            view.setVisibility(0);
            this.f24750.setText("00000000");
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f24753;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        ViewOnClickListenerC14813.m35215(this.f24748);
        C4925.m14329(editText);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM24993;
        int iFloatToRawIntBits;
        int i;
        String str;
        C23537 c23537 = this.f24747;
        C20317 c20317 = c23537.f75574;
        ArrayList arrayList = c23537.f75579;
        C2678 c2678 = c23537.f75568;
        EditText editText = this.f24745;
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        EditText editText2 = this.f24746;
        String string2 = editText2.getText().toString();
        if (!C9896.m24990(string2)) {
            editText2.requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        int iM24994 = C9896.m24993(string2);
        if (this.f24751) {
            EditText editText3 = this.f24750;
            String string3 = editText3.getText().toString();
            if (!C9896.m24990(string3)) {
                editText3.requestFocus();
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            iM24993 = C9896.m24993(string3);
        } else {
            iM24993 = 0;
        }
        if (c23537.f75568.mo2347(iM24994)) {
            editText2.requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        int iMo2878 = c20317.mo2878();
        ActivityC6604 activityC6604 = this.f24752;
        if (iM24994 > iMo2878) {
            editText2.requestFocus();
            C21374.m48459((CharSequence) activityC6604.getString(R.string.MT_Protector, Integer.valueOf(c20317.mo2878())));
            return;
        }
        if (iM24994 == c20317.mo2878()) {
            iM24994 = c20317.m46607(string);
        } else if (c20317.m46622(iM24994) == null) {
            try {
                c20317.m46610(iM24994, string);
            } catch (Exception unused) {
            }
        }
        try {
            C18906 c18906M8392 = c2678.m8392(iM24994);
            c23537.f75566 = c18906M8392;
            if (this.f24751) {
                c18906M8392.m43638(iM24993);
                c18906M8392.m43647(true);
            }
            arrayList.add(c18906M8392);
            String typeName = c20317.getTypeName();
            switch (typeName.hashCode()) {
                case -1724158635:
                    if (!typeName.equals("transition")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case -1653751294:
                    if (!typeName.equals("fraction")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = 256;
                        i = 6;
                        c18906M8392.m43639(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case -1109722326:
                    if (!typeName.equals("layout")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case -1073975672:
                    if (!typeName.equals("mipmap")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case -891985903:
                    if (!typeName.equals("string")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = TextBundle.TEXT_ENTRY;
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case -826507106:
                    if (!typeName.equals("drawable")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case -795202841:
                    if (!typeName.equals("animator")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case -475309713:
                    if (!typeName.equals("plurals")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        c18906M8392.m43647(true);
                        c18906M8392.m43640("%d items", (C21916[]) null, 16777220);
                        c18906M8392.m43640("%d item", (C21916[]) null, 16777222);
                    }
                    break;
                case 3355:
                    if (!typeName.equals("id")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        c18906M8392.m43639(0, 18, -1);
                    }
                    break;
                case 112680:
                    if (!typeName.equals("raw")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case 118807:
                    if (!typeName.equals(DocumentReader.RESERVED)) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case 2998801:
                    if (!typeName.equals("anim")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case 3004913:
                    if (!typeName.equals("attr")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        c18906M8392.m43647(true);
                        c18906M8392.m43639(1, 16, 16777216);
                    }
                    break;
                case 3029738:
                    if (!typeName.equals("bool")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        c18906M8392.m43639(0, 18, -1);
                    }
                    break;
                case 3347807:
                    if (!typeName.equals("menu")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                case 93090393:
                    if (!typeName.equals("array")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        c18906M8392.m43647(true);
                        c18906M8392.m43640("Text", (C21916[]) null, 16777216);
                    }
                    break;
                case 94842723:
                    if (!typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = -15641191;
                        i = 28;
                        c18906M8392.m43639(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 95588145:
                    if (!typeName.equals("dimen")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = i.a;
                        i = 5;
                        c18906M8392.m43639(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 97526364:
                    if (!typeName.equals(ClassTransform.FLOAT)) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                        i = 4;
                        c18906M8392.m43639(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 109780401:
                    if (!typeName.equals("style")) {
                        c18906M8392.m43639(1, 16, -1);
                    }
                    break;
                case 1958052158:
                    typeName.equals("integer");
                    c18906M8392.m43639(1, 16, -1);
                    break;
                case 2096253127:
                    if (!typeName.equals("interpolator")) {
                        c18906M8392.m43639(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c18906M8392.m43640(str, (C21916[]) null, -1);
                    }
                    break;
                default:
                    c18906M8392.m43639(1, 16, -1);
                    break;
            }
            this.f24753.dismiss();
            activityC6604.f20339.notifyDataSetChanged();
            activityC6604.f20337.setSelection(arrayList.size() - 1);
            c23537.f75587 = true;
        } catch (Exception e) {
            activityC6604.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM30774;
        String string = editable.toString();
        if (C9896.m24990(string)) {
            strM30774 = this.f24747.f75569.m30774(C9896.m24993(string));
        } else {
            strM30774 = null;
        }
        TextView textView = this.f24748;
        if (strM30774 != null) {
            textView.setText(strM30774);
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }
}
