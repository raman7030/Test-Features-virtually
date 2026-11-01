package p067l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0713i;
import java.util.ArrayList;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9986 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ */
    public EditText f27659;

    /* JADX INFO: renamed from: ۙ */
    public EditText f27660;

    /* JADX INFO: renamed from: ۛ */
    public final C24738 f27661;

    /* JADX INFO: renamed from: ۤ */
    public TextView f27662;

    /* JADX INFO: renamed from: ۫ */
    public View f27663;

    /* JADX INFO: renamed from: ۬ */
    public EditText f27664;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f27665;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC8645 f27666;

    /* JADX INFO: renamed from: ᩹ */
    public DialogInterfaceC2564 f27667;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC9986(ActivityC8645 activityC8645) {
        this.f27666 = activityC8645;
        this.f27661 = activityC8645.f23213;
        View viewM12252 = activityC8645.m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        this.f27660 = editText;
        this.f27659 = (EditText) viewM12252.findViewById(R.id.editText2);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText3);
        this.f27664 = editText2;
        this.f27662 = (TextView) viewM12252.findViewById(R.id.textView3);
        this.f27663 = viewM12252.findViewById(R.id.MT_Protector);
        editText2.addTextChangedListener(this);
        editText.addTextChangedListener(new C3280(this));
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC8645);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f27667 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23300() {
        C21678 c21678 = this.f27661.f78320;
        this.f27665 = c21678.getTypeName().equals("style");
        this.f27660.setText(String.format("%04X", Integer.valueOf(c21678.mo5207())));
        EditText editText = this.f27659;
        editText.requestFocus();
        boolean z = this.f27665;
        View view = this.f27663;
        if (z) {
            view.setVisibility(0);
            this.f27664.setText("00000000");
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f27667;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        ViewOnClickListenerC16447.m37363(this.f27662);
        C7050.m16226(editText);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM27008;
        int iFloatToRawIntBits;
        int i;
        String str;
        C24738 c24738 = this.f27661;
        C21678 c21678 = c24738.f78320;
        ArrayList arrayList = c24738.f78325;
        C4914 c4914 = c24738.f78314;
        EditText editText = this.f27659;
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        EditText editText2 = this.f27660;
        String string2 = editText2.getText().toString();
        if (!C11774.m27005(string2)) {
            editText2.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        int iM27009 = C11774.m27008(string2);
        if (this.f27665) {
            EditText editText3 = this.f27664;
            String string3 = editText3.getText().toString();
            if (!C11774.m27005(string3)) {
                editText3.requestFocus();
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            iM27008 = C11774.m27008(string3);
        } else {
            iM27008 = 0;
        }
        if (c24738.f78314.mo4718(iM27009)) {
            editText2.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        int iMo5207 = c21678.mo5207();
        ActivityC8645 activityC8645 = this.f27666;
        if (iM27009 > iMo5207) {
            editText2.requestFocus();
            C22682.m50795((CharSequence) activityC8645.getString(R.string.MT_Protector, Integer.valueOf(c21678.mo5207())));
            return;
        }
        if (iM27009 == c21678.mo5207()) {
            iM27009 = c21678.m48930(string);
        } else if (c21678.m48945(iM27009) == null) {
            try {
                c21678.m48933(iM27009, string);
            } catch (Exception unused) {
            }
        }
        try {
            C20337 c20337M10438 = c4914.m10438(iM27009);
            c24738.f78312 = c20337M10438;
            if (this.f27665) {
                c20337M10438.m45904(iM27008);
                c20337M10438.m45913(true);
            }
            arrayList.add(c20337M10438);
            String typeName = c21678.getTypeName();
            switch (typeName.hashCode()) {
                case -1724158635:
                    if (!typeName.equals("transition")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case -1653751294:
                    if (!typeName.equals("fraction")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = 256;
                        i = 6;
                        c20337M10438.m45905(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case -1109722326:
                    if (!typeName.equals("layout")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case -1073975672:
                    if (!typeName.equals("mipmap")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case -891985903:
                    if (!typeName.equals("string")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = TextBundle.TEXT_ENTRY;
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case -826507106:
                    if (!typeName.equals("drawable")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case -795202841:
                    if (!typeName.equals("animator")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case -475309713:
                    if (!typeName.equals("plurals")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        c20337M10438.m45913(true);
                        c20337M10438.m45906("%d items", (C23198[]) null, 16777220);
                        c20337M10438.m45906("%d item", (C23198[]) null, 16777222);
                    }
                    break;
                case 3355:
                    if (!typeName.equals("id")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        c20337M10438.m45905(0, 18, -1);
                    }
                    break;
                case 112680:
                    if (!typeName.equals("raw")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case 118807:
                    if (!typeName.equals(DocumentReader.RESERVED)) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case 2998801:
                    if (!typeName.equals("anim")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case 3004913:
                    if (!typeName.equals("attr")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        c20337M10438.m45913(true);
                        c20337M10438.m45905(1, 16, 16777216);
                    }
                    break;
                case 3029738:
                    if (!typeName.equals("bool")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        c20337M10438.m45905(0, 18, -1);
                    }
                    break;
                case 3347807:
                    if (!typeName.equals("menu")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                case 93090393:
                    if (!typeName.equals("array")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        c20337M10438.m45913(true);
                        c20337M10438.m45906("Text", (C23198[]) null, 16777216);
                    }
                    break;
                case 94842723:
                    if (!typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = -15641191;
                        i = 28;
                        c20337M10438.m45905(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 95588145:
                    if (!typeName.equals("dimen")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = C0713i.f2746a;
                        i = 5;
                        c20337M10438.m45905(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 97526364:
                    if (!typeName.equals(ClassTransform.FLOAT)) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                        i = 4;
                        c20337M10438.m45905(iFloatToRawIntBits, i, -1);
                    }
                    break;
                case 109780401:
                    if (!typeName.equals("style")) {
                        c20337M10438.m45905(1, 16, -1);
                    }
                    break;
                case 1958052158:
                    typeName.equals("integer");
                    c20337M10438.m45905(1, 16, -1);
                    break;
                case 2096253127:
                    if (!typeName.equals("interpolator")) {
                        c20337M10438.m45905(1, 16, -1);
                    } else {
                        str = "res/xxxx";
                        c20337M10438.m45906(str, (C23198[]) null, -1);
                    }
                    break;
                default:
                    c20337M10438.m45905(1, 16, -1);
                    break;
            }
            this.f27667.dismiss();
            activityC8645.f23216.notifyDataSetChanged();
            activityC8645.f23214.setSelection(arrayList.size() - 1);
            c24738.f78333 = true;
        } catch (Exception e) {
            activityC8645.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM32846;
        String string = editable.toString();
        if (C11774.m27005(string)) {
            strM32846 = this.f27661.f78315.m32846(C11774.m27008(string));
        } else {
            strM32846 = null;
        }
        TextView textView = this.f27662;
        if (strM32846 != null) {
            textView.setText(strM32846);
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
