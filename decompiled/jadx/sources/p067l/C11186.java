package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۢ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C11186 implements TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۗ */
    public final CheckBox f31052;

    /* JADX INFO: renamed from: ۙ */
    public boolean f31053;

    /* JADX INFO: renamed from: ۛ */
    public final Spinner f31054;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f31055;

    /* JADX INFO: renamed from: ۫ */
    public String f31056;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f31057;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f31058 = true;

    /* JADX INFO: renamed from: ᩸ */
    public final C7179 f31059;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f31060;

    /* JADX INFO: renamed from: ۨ */
    public static Charset f31048 = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: ܽ֫ */
    public static Charset f31050 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ۧ֫ */
    public static Charset f31047 = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: ᩺ */
    public static Charset f31051 = Charset.forName("GBK");

    /* JADX INFO: renamed from: ܰ */
    public static final BigInteger f31049 = BigInteger.valueOf(C14849.FOREVER_NS);

    /* JADX INFO: renamed from: ֫֫ */
    public static final BigInteger f31045 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۟ */
    public static final BigInteger f31046 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C11186(boolean z, C7179 c7179, TextView textView, Spinner spinner, CheckBox checkBox) {
        this.f31055 = z;
        this.f31059 = c7179;
        this.f31057 = textView;
        this.f31054 = spinner;
        this.f31052 = checkBox;
        spinner.setSelection(ApplicationC21448.f67649.getInt(z ? "hex_search_type" : "hex_replace_type", 0));
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean(z ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", false));
        m25813();
        c7179.m16507(this);
        spinner.setOnItemSelectedListener(this);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setEnabled(false);
        ViewOnClickListenerC16447.m37363(textView);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25810() {
        C7179 c7179 = this.f31059;
        String string = c7179.m16518().toString();
        if (string.equals(this.f31056)) {
            return;
        }
        this.f31056 = string;
        c7179.m16517();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m25813() {
        String string = this.f31059.m16518().toString();
        boolean zIsEmpty = string.isEmpty();
        byte[] bArr = null;
        int i = 0;
        TextView textView = this.f31057;
        if (zIsEmpty) {
            this.f31060 = null;
            this.f31053 = false;
            this.f31058 = true;
            textView.setTextColor(C23223.f72984);
            textView.setText(this.f31055 ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        this.f31058 = false;
        this.f31053 = false;
        switch (this.f31054.getSelectedItemPosition()) {
            case 0:
                String strReplaceAll = string.replaceAll("\\s+", "");
                int length = strReplaceAll.length();
                if (length % 2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strReplaceAll.substring(0, strReplaceAll.length() - 1));
                    sb.append("0");
                    strReplaceAll = C21459.m48621(strReplaceAll.length() - 1, strReplaceAll, sb);
                    length++;
                }
                byte[] bArr2 = new byte[length / 2];
                while (i < length) {
                    int i2 = i + 2;
                    try {
                        bArr2[i / 2] = (byte) Integer.parseInt(strReplaceAll.substring(i, i2), 16);
                        i = i2;
                    } catch (NumberFormatException unused) {
                    }
                }
                bArr = bArr2;
                if (bArr != null) {
                    this.f31060 = bArr;
                    m25812();
                    return;
                } else {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 1:
                this.f31060 = string.getBytes(f31048);
                break;
            case 2:
                this.f31060 = string.getBytes(f31047);
                break;
            case 3:
                this.f31060 = string.getBytes(f31050);
                break;
            case 4:
                this.f31060 = string.getBytes(f31051);
                break;
            case 5:
                try {
                    long j = Long.parseLong(string);
                    if (j < -128 || j > 127) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f31060 = new byte[]{(byte) (j & 255)};
                        m25812();
                    }
                    return;
                } catch (NumberFormatException unused2) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 6:
                try {
                    long j2 = Long.parseLong(string);
                    if (j2 < 0 || j2 > 255) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f31060 = new byte[]{(byte) (j2 & 255)};
                        m25812();
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 7:
                try {
                    long j3 = Long.parseLong(string);
                    if (j3 < -32768 || j3 > 32767) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m25811(2, j3);
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 8:
                try {
                    long j4 = Long.parseLong(string);
                    if (j4 < 0 || j4 > 65535) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m25811(2, j4);
                    }
                    return;
                } catch (NumberFormatException unused5) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 9:
                try {
                    long j5 = Long.parseLong(string);
                    if (j5 < -2147483648L || j5 > 2147483647L) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m25811(4, j5);
                    }
                    return;
                } catch (NumberFormatException unused6) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 10:
                try {
                    long j6 = Long.parseLong(string);
                    if (j6 < 0 || j6 > 4294967295L) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m25811(4, j6);
                    }
                    return;
                } catch (NumberFormatException unused7) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 11:
                try {
                    BigInteger bigInteger = new BigInteger(string);
                    if (bigInteger.compareTo(f31045) < 0 || bigInteger.compareTo(f31049) > 0) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m25811(8, bigInteger.longValue());
                    }
                    return;
                } catch (NumberFormatException unused8) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 12:
                try {
                    BigInteger bigInteger2 = new BigInteger(string);
                    if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f31046) > 0) {
                        this.f31053 = true;
                        textView.setTextColor(C23223.f73004);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m25811(8, bigInteger2.longValue());
                    }
                    return;
                } catch (NumberFormatException unused9) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 13:
                try {
                    m25811(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                    return;
                } catch (NumberFormatException unused10) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 14:
                try {
                    m25811(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
                    return;
                } catch (NumberFormatException unused11) {
                    this.f31053 = true;
                    textView.setTextColor(C23223.f73004);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            default:
                return;
        }
        m25812();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25812() {
        int iMin = Math.min(this.f31060.length, 50);
        StringBuilder sb = new StringBuilder(iMin * 2);
        for (int i = 0; i < iMin; i++) {
            byte b = this.f31060[i];
            if (i != 0) {
                sb.append(' ');
            }
            sb.append("0123456789ABCDEF".charAt((b >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        if (iMin < this.f31060.length) {
            sb.append("…");
        }
        int i2 = C23223.f73002;
        TextView textView = this.f31057;
        textView.setTextColor(i2);
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25811(int i, long j) {
        this.f31060 = new byte[i];
        if (this.f31052.isChecked()) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f31060[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f31060[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m25812();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m25813();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ApplicationC21448.f67649.edit().mo27875(i, this.f31055 ? "hex_search_type" : "hex_replace_type").apply();
        this.f31052.setEnabled(i > 4);
        m25813();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ApplicationC21448.f67649.edit().putBoolean(this.f31055 ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", z);
        m25813();
    }
}
