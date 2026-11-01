package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩹ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes.dex */
public final class C23590 implements TextWatcher {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f75097;

    /* JADX INFO: renamed from: ۙ */
    public boolean f75098;

    /* JADX INFO: renamed from: ۫ */
    public final TextView f75099;

    /* JADX INFO: renamed from: ۬ */
    public final int f75100;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f75101 = true;

    /* JADX INFO: renamed from: ᩸ */
    public final EditText f75102;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f75103;

    /* JADX INFO: renamed from: ۤ */
    public static final BigInteger f75095 = BigInteger.valueOf(C14849.FOREVER_NS);

    /* JADX INFO: renamed from: ۨ */
    public static final BigInteger f75096 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۛ */
    public static final BigInteger f75094 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C23590(EditText editText, TextView textView, int i, boolean z) {
        this.f75102 = editText;
        this.f75099 = textView;
        this.f75100 = i;
        this.f75097 = z;
        m52395();
        editText.addTextChangedListener(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52395() {
        String string = this.f75102.getText().toString();
        boolean zIsEmpty = string.isEmpty();
        TextView textView = this.f75099;
        if (zIsEmpty) {
            this.f75103 = null;
            this.f75098 = false;
            this.f75101 = true;
            textView.setText(R.string.MT_Protector);
            return;
        }
        this.f75101 = false;
        this.f75098 = false;
        int i = this.f75100;
        if (i == R.id.MT_Protector) {
            try {
                long j = Long.parseLong(string);
                if (j < -128 || j > 127) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f75103 = new byte[]{(byte) (j & 255)};
                    m52393();
                }
                return;
            } catch (NumberFormatException unused) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j2 = Long.parseLong(string);
                if (j2 < 0 || j2 > 255) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f75103 = new byte[]{(byte) (j2 & 255)};
                    m52393();
                }
                return;
            } catch (NumberFormatException unused2) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j3 = Long.parseLong(string);
                if (j3 < -32768 || j3 > 32767) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m52394(2, j3);
                }
                return;
            } catch (NumberFormatException unused3) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j4 = Long.parseLong(string);
                if (j4 < 0 || j4 > 65535) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m52394(2, j4);
                }
                return;
            } catch (NumberFormatException unused4) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j5 = Long.parseLong(string);
                if (j5 < -2147483648L || j5 > 2147483647L) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m52394(4, j5);
                }
                return;
            } catch (NumberFormatException unused5) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j6 = Long.parseLong(string);
                if (j6 < 0 || j6 > 4294967295L) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m52394(4, j6);
                }
                return;
            } catch (NumberFormatException unused6) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger = new BigInteger(string);
                if (bigInteger.compareTo(f75096) < 0 || bigInteger.compareTo(f75095) > 0) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m52394(8, bigInteger.longValue());
                }
                return;
            } catch (NumberFormatException unused7) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger2 = new BigInteger(string);
                if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f75094) > 0) {
                    this.f75098 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m52394(8, bigInteger2.longValue());
                }
                return;
            } catch (NumberFormatException unused8) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                m52394(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                return;
            } catch (NumberFormatException unused9) {
                this.f75098 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i != R.id.MT_Protector) {
            throw new IllegalStateException();
        }
        try {
            m52394(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
        } catch (NumberFormatException unused10) {
            this.f75098 = true;
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52393() {
        StringBuilder sb = new StringBuilder(this.f75103.length * 3);
        for (byte b : this.f75103) {
            sb.append(String.format("%02X ", Integer.valueOf(b & 255)));
        }
        this.f75099.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52394(int i, long j) {
        this.f75103 = new byte[i];
        if (this.f75097) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f75103[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f75103[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m52393();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m52395();
    }
}
