package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩹ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes.dex */
public final class C22329 implements TextWatcher {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f72371;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72372;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f72373;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f72374;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72375 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EditText f72376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f72377;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f72369 = BigInteger.valueOf(C13132.FOREVER_NS);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f72370 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f72368 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C22329(EditText editText, TextView textView, int i, boolean z) {
        this.f72376 = editText;
        this.f72373 = textView;
        this.f72374 = i;
        this.f72371 = z;
        m50064();
        editText.addTextChangedListener(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50064() {
        String string = this.f72376.getText().toString();
        boolean zIsEmpty = string.isEmpty();
        TextView textView = this.f72373;
        if (zIsEmpty) {
            this.f72377 = null;
            this.f72372 = false;
            this.f72375 = true;
            textView.setText(R.string.MT_Protector);
            return;
        }
        this.f72375 = false;
        this.f72372 = false;
        int i = this.f72374;
        if (i == R.id.MT_Protector) {
            try {
                long j = Long.parseLong(string);
                if (j < -128 || j > 127) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f72377 = new byte[]{(byte) (j & 255)};
                    m50062();
                }
                return;
            } catch (NumberFormatException unused) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j2 = Long.parseLong(string);
                if (j2 < 0 || j2 > 255) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f72377 = new byte[]{(byte) (j2 & 255)};
                    m50062();
                }
                return;
            } catch (NumberFormatException unused2) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j3 = Long.parseLong(string);
                if (j3 < -32768 || j3 > 32767) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m50063(2, j3);
                }
                return;
            } catch (NumberFormatException unused3) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j4 = Long.parseLong(string);
                if (j4 < 0 || j4 > 65535) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m50063(2, j4);
                }
                return;
            } catch (NumberFormatException unused4) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j5 = Long.parseLong(string);
                if (j5 < -2147483648L || j5 > 2147483647L) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m50063(4, j5);
                }
                return;
            } catch (NumberFormatException unused5) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j6 = Long.parseLong(string);
                if (j6 < 0 || j6 > 4294967295L) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m50063(4, j6);
                }
                return;
            } catch (NumberFormatException unused6) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger = new BigInteger(string);
                if (bigInteger.compareTo(f72370) < 0 || bigInteger.compareTo(f72369) > 0) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m50063(8, bigInteger.longValue());
                }
                return;
            } catch (NumberFormatException unused7) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger2 = new BigInteger(string);
                if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f72368) > 0) {
                    this.f72372 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m50063(8, bigInteger2.longValue());
                }
                return;
            } catch (NumberFormatException unused8) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                m50063(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                return;
            } catch (NumberFormatException unused9) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i != R.id.MT_Protector) {
            throw new IllegalStateException();
        }
        try {
            m50063(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
        } catch (NumberFormatException unused10) {
            this.f72372 = true;
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50062() {
        StringBuilder sb = new StringBuilder(this.f72377.length * 3);
        for (byte b : this.f72377) {
            sb.append(String.format("%02X ", Integer.valueOf(b & 255)));
        }
        this.f72373.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50063(int i, long j) {
        this.f72377 = new byte[i];
        if (this.f72371) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f72377[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f72377[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m50062();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m50064();
    }
}
