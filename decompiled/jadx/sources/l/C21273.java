package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21273 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f68619 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f68620 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48293(final C6807 c6807) {
        Context context = c6807.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewInflate.findViewById(R.id.editText2);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.textView);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.checkBox2);
        checkBox.setChecked(f68620);
        checkBox2.setChecked(f68619);
        C11041 c11041 = c6807.f21109;
        int iM27418 = c11041.m27418();
        m48288(editText, iM27418);
        int i = 1;
        if (c11041.m27406()) {
            int iM27404 = c11041.m27404();
            if (f68620) {
                m48288(editText2, (iM27404 - iM27418) + 1);
            } else {
                textView.setText(R.string.MT_Protector);
                m48288(editText2, iM27404);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֡֫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C21273.m48292(textView, editText, editText2, c6807, z);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۚ֫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C21273.m48291(editText, editText2, c6807, z);
            }
        });
        editText.addTextChangedListener(new C14921(editText, editText2, c6807));
        m48295(editText, editText2, c11041.m27415());
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44421(viewInflate);
        c19258.m44442(R.string.MT_Protector, null);
        final DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M16343.m1448().setOnClickListener(new ViewOnClickListenerC22294(c6807, editText, editText2, i));
        dialogInterfaceC0206M16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨֫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21273.m48290(editText, editText2, c6807, dialogInterfaceC0206M16343);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48292(TextView textView, EditText editText, EditText editText2, C6807 c6807, boolean z) {
        f68620 = z;
        int i = 16;
        try {
            if (z) {
                textView.setText(R.string.MT_Protector);
                int i2 = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
                String string = editText2.getText().toString();
                if (!f68619) {
                    i = 10;
                }
                int i3 = Integer.parseInt(string, i);
                if (i3 < i2) {
                    m48288(editText, i3);
                    m48288(editText2, (i2 - i3) + 1);
                } else {
                    m48288(editText2, (i3 - i2) + 1);
                }
            } else {
                textView.setText(R.string.MT_Protector);
                int i4 = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
                String string2 = editText2.getText().toString();
                if (!f68619) {
                    i = 10;
                }
                long j = (((long) i4) + ((long) Integer.parseInt(string2, i))) - 1;
                if (j < -2147483648L || j > 2147483647L) {
                    throw new NumberFormatException();
                }
                m48288(editText2, (int) j);
            }
        } catch (NumberFormatException unused) {
        }
        m48295(editText, editText2, c6807.f21109.m27415());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48291(EditText editText, EditText editText2, C6807 c6807, boolean z) {
        f68619 = z;
        try {
            m48288(editText, Integer.parseInt(editText.getText().toString(), f68619 ? 10 : 16));
        } catch (NumberFormatException unused) {
        }
        try {
            m48288(editText2, Integer.parseInt(editText2.getText().toString(), f68619 ? 10 : 16));
        } catch (NumberFormatException unused2) {
        }
        m48295(editText, editText2, c6807.f21109.m27415());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48294(C6807 c6807, EditText editText, EditText editText2, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C11041 c11041 = c6807.f21109;
        int iM27415 = c11041.m27415();
        if (itemId == 17039373) {
            if (f68620) {
                m48288(editText, 0);
                m48288(editText2, iM27415);
                return;
            } else {
                m48288(editText, 0);
                m48288(editText2, Math.max(iM27415 - 1, 0));
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f68620) {
                m48288(editText, 0);
                m48288(editText2, iM27415 != 0 ? c11041.m27404() + 1 : 0);
                return;
            } else {
                m48288(editText, 0);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f68620) {
                m48288(editText2, iM27415 - c11041.m27418());
            } else {
                m48288(editText2, Math.max(iM27415 - 1, 0));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48290(EditText editText, EditText editText2, C6807 c6807, DialogInterfaceC0206 dialogInterfaceC0206) {
        int i;
        C11041 c11041 = c6807.f21109;
        try {
            int i2 = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
            try {
                int i3 = Integer.parseInt(editText2.getText().toString(), f68619 ? 16 : 10);
                int iM27415 = c11041.m27415();
                if (f68620) {
                    try {
                        if (iM27415 < 0 || i2 < 0 || i2 > iM27415 || i3 < 0) {
                            throw new IllegalArgumentException("Selection range is out of bounds");
                        }
                        if (i3 == 0) {
                            i = i2;
                        } else {
                            long j = (((long) i2) + ((long) i3)) - 1;
                            if (i2 == iM27415 || j >= iM27415) {
                                throw new IllegalArgumentException("Selection range is out of bounds");
                            }
                            i = (int) j;
                        }
                        if (i3 == 0) {
                            c11041.m27392(i2, true);
                            c6807.invalidate();
                            c6807.m18483(c11041.m27418());
                            dialogInterfaceC0206.dismiss();
                            return;
                        }
                        i3 = i;
                    } catch (IllegalArgumentException unused) {
                        C21374.m48462(R.string.MT_Protector, 0).m48468();
                        return;
                    }
                } else {
                    if (iM27415 == 0 && i2 == 0 && i3 == 0) {
                        c11041.m27392(0, true);
                        c6807.invalidate();
                        c6807.m18483(c11041.m27418());
                        dialogInterfaceC0206.dismiss();
                        return;
                    }
                    if (i2 > i3) {
                        i3 = i2;
                        i2 = i3;
                    }
                }
                if (i2 < 0 || i3 >= iM27415) {
                    C21374.m48462(R.string.MT_Protector, 0).m48468();
                } else {
                    c6807.m18476(i2, i3);
                    dialogInterfaceC0206.dismiss();
                }
            } catch (NumberFormatException unused2) {
                editText2.requestFocus();
                C21374.m48462(R.string.MT_Protector, 0).m48468();
            }
        } catch (NumberFormatException unused3) {
            editText.requestFocus();
            C21374.m48462(R.string.MT_Protector, 0).m48468();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48295(EditText editText, EditText editText2, int i) {
        try {
            int i2 = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
            if (i2 >= i) {
                throw new NumberFormatException();
            }
            if (f68620) {
                int i3 = i - i2;
                if (f68619) {
                    editText2.setHint("1…" + Integer.toHexString(i3).toUpperCase());
                    return;
                } else {
                    editText2.setHint("1…" + i3);
                    return;
                }
            }
            int i4 = i - 1;
            if (f68619) {
                editText2.setHint(Integer.toHexString(i2).toUpperCase() + "…" + Integer.toHexString(i4).toUpperCase());
                return;
            }
            editText2.setHint(i2 + "…" + i4);
        } catch (NumberFormatException unused) {
            editText2.setHint((CharSequence) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48288(EditText editText, int i) {
        editText.setText(Integer.toString(i, f68619 ? 16 : 10).toUpperCase());
        editText.setSelection(editText.length());
    }
}
