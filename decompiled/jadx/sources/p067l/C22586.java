package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22586 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f71302 = true;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f71303 = true;

    /* JADX INFO: renamed from: ֫ */
    public static void m50624(final C8838 c8838) {
        Context context = c8838.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewInflate.findViewById(R.id.editText2);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.textView);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.checkBox2);
        checkBox.setChecked(f71303);
        checkBox2.setChecked(f71302);
        C12862 c12862 = c8838.f23986;
        int iM29480 = c12862.m29480();
        m50619(editText, iM29480);
        int i = 1;
        if (c12862.m29468()) {
            int iM29466 = c12862.m29466();
            if (f71303) {
                m50619(editText2, (iM29466 - iM29480) + 1);
            } else {
                textView.setText(R.string.MT_Protector);
                m50619(editText2, iM29466);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֡֫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C22586.m50623(textView, editText, editText2, c8838, z);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۚ֫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C22586.m50622(editText, editText2, c8838, z);
            }
        });
        editText.addTextChangedListener(new C16549(editText, editText2, c8838));
        m50626(editText, editText2, c12862.m29477());
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(context);
        c20671.m46715(viewInflate);
        c20671.m46736(R.string.MT_Protector, null);
        final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M18268.m3861().setOnClickListener(new ViewOnClickListenerC23557(c8838, editText, editText2, i));
        dialogInterfaceC2564M18268.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֨֫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22586.m50621(editText, editText2, c8838, dialogInterfaceC2564M18268);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50623(TextView textView, EditText editText, EditText editText2, C8838 c8838, boolean z) {
        f71303 = z;
        int i = 16;
        try {
            if (z) {
                textView.setText(R.string.MT_Protector);
                int i2 = Integer.parseInt(editText.getText().toString(), f71302 ? 16 : 10);
                String string = editText2.getText().toString();
                if (!f71302) {
                    i = 10;
                }
                int i3 = Integer.parseInt(string, i);
                if (i3 < i2) {
                    m50619(editText, i3);
                    m50619(editText2, (i2 - i3) + 1);
                } else {
                    m50619(editText2, (i3 - i2) + 1);
                }
            } else {
                textView.setText(R.string.MT_Protector);
                int i4 = Integer.parseInt(editText.getText().toString(), f71302 ? 16 : 10);
                String string2 = editText2.getText().toString();
                if (!f71302) {
                    i = 10;
                }
                long j = (((long) i4) + ((long) Integer.parseInt(string2, i))) - 1;
                if (j < -2147483648L || j > 2147483647L) {
                    throw new NumberFormatException();
                }
                m50619(editText2, (int) j);
            }
        } catch (NumberFormatException unused) {
        }
        m50626(editText, editText2, c8838.f23986.m29477());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50622(EditText editText, EditText editText2, C8838 c8838, boolean z) {
        f71302 = z;
        try {
            m50619(editText, Integer.parseInt(editText.getText().toString(), f71302 ? 10 : 16));
        } catch (NumberFormatException unused) {
        }
        try {
            m50619(editText2, Integer.parseInt(editText2.getText().toString(), f71302 ? 10 : 16));
        } catch (NumberFormatException unused2) {
        }
        m50626(editText, editText2, c8838.f23986.m29477());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50625(C8838 c8838, EditText editText, EditText editText2, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C12862 c12862 = c8838.f23986;
        int iM29477 = c12862.m29477();
        if (itemId == 17039373) {
            if (f71303) {
                m50619(editText, 0);
                m50619(editText2, iM29477);
                return;
            } else {
                m50619(editText, 0);
                m50619(editText2, Math.max(iM29477 - 1, 0));
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f71303) {
                m50619(editText, 0);
                m50619(editText2, iM29477 != 0 ? c12862.m29466() + 1 : 0);
                return;
            } else {
                m50619(editText, 0);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            if (f71303) {
                m50619(editText2, iM29477 - c12862.m29480());
            } else {
                m50619(editText2, Math.max(iM29477 - 1, 0));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50621(EditText editText, EditText editText2, C8838 c8838, DialogInterfaceC2564 dialogInterfaceC2564) {
        int i;
        C12862 c12862 = c8838.f23986;
        try {
            int i2 = Integer.parseInt(editText.getText().toString(), f71302 ? 16 : 10);
            try {
                int i3 = Integer.parseInt(editText2.getText().toString(), f71302 ? 16 : 10);
                int iM29477 = c12862.m29477();
                if (f71303) {
                    try {
                        if (iM29477 < 0 || i2 < 0 || i2 > iM29477 || i3 < 0) {
                            throw new IllegalArgumentException("Selection range is out of bounds");
                        }
                        if (i3 == 0) {
                            i = i2;
                        } else {
                            long j = (((long) i2) + ((long) i3)) - 1;
                            if (i2 == iM29477 || j >= iM29477) {
                                throw new IllegalArgumentException("Selection range is out of bounds");
                            }
                            i = (int) j;
                        }
                        if (i3 == 0) {
                            c12862.m29454(i2, true);
                            c8838.invalidate();
                            c8838.m20432(c12862.m29480());
                            dialogInterfaceC2564.dismiss();
                            return;
                        }
                        i3 = i;
                    } catch (IllegalArgumentException unused) {
                        C22682.m50798(R.string.MT_Protector, 0).m50804();
                        return;
                    }
                } else {
                    if (iM29477 == 0 && i2 == 0 && i3 == 0) {
                        c12862.m29454(0, true);
                        c8838.invalidate();
                        c8838.m20432(c12862.m29480());
                        dialogInterfaceC2564.dismiss();
                        return;
                    }
                    if (i2 > i3) {
                        i3 = i2;
                        i2 = i3;
                    }
                }
                if (i2 < 0 || i3 >= iM29477) {
                    C22682.m50798(R.string.MT_Protector, 0).m50804();
                } else {
                    c8838.m20425(i2, i3);
                    dialogInterfaceC2564.dismiss();
                }
            } catch (NumberFormatException unused2) {
                editText2.requestFocus();
                C22682.m50798(R.string.MT_Protector, 0).m50804();
            }
        } catch (NumberFormatException unused3) {
            editText.requestFocus();
            C22682.m50798(R.string.MT_Protector, 0).m50804();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50626(EditText editText, EditText editText2, int i) {
        try {
            int i2 = Integer.parseInt(editText.getText().toString(), f71302 ? 16 : 10);
            if (i2 >= i) {
                throw new NumberFormatException();
            }
            if (f71303) {
                int i3 = i - i2;
                if (f71302) {
                    editText2.setHint("1…" + Integer.toHexString(i3).toUpperCase());
                    return;
                } else {
                    editText2.setHint("1…" + i3);
                    return;
                }
            }
            int i4 = i - 1;
            if (f71302) {
                editText2.setHint(Integer.toHexString(i2).toUpperCase() + "…" + Integer.toHexString(i4).toUpperCase());
                return;
            }
            editText2.setHint(i2 + "…" + i4);
        } catch (NumberFormatException unused) {
            editText2.setHint((CharSequence) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50619(EditText editText, int i) {
        editText.setText(Integer.toString(i, f71302 ? 16 : 10).toUpperCase());
        editText.setSelection(editText.length());
    }
}
