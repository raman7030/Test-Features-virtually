package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۢ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9278 implements TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f28104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28105;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Spinner f28106;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f28107;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f28108;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f28109;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28110 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5062 f28111;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f28112;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Charset f28100 = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static Charset f28102 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static Charset f28099 = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Charset f28103 = Charset.forName("GBK");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f28101 = BigInteger.valueOf(C13132.FOREVER_NS);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final BigInteger f28097 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final BigInteger f28098 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9278(boolean z, C5062 c5062, TextView textView, Spinner spinner, CheckBox checkBox) {
        this.f28107 = z;
        this.f28111 = c5062;
        this.f28109 = textView;
        this.f28106 = spinner;
        this.f28104 = checkBox;
        spinner.setSelection(ApplicationC20075.f65008.getInt(z ? "hex_search_type" : "hex_replace_type", 0));
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean(z ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", false));
        m23804();
        c5062.m14600(this);
        spinner.setOnItemSelectedListener(this);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setEnabled(false);
        ViewOnClickListenerC14813.m35215(textView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23801() {
        C5062 c5062 = this.f28111;
        String string = c5062.m14611().toString();
        if (string.equals(this.f28108)) {
            return;
        }
        this.f28108 = string;
        c5062.m14610();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23804() {
        String string = this.f28111.m14611().toString();
        boolean zIsEmpty = string.isEmpty();
        byte[] bArr = null;
        int i = 0;
        TextView textView = this.f28109;
        if (zIsEmpty) {
            this.f28112 = null;
            this.f28105 = false;
            this.f28110 = true;
            textView.setTextColor(C21943.f70273);
            textView.setText(this.f28107 ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        this.f28110 = false;
        this.f28105 = false;
        switch (this.f28106.getSelectedItemPosition()) {
            case 0:
                String strReplaceAll = string.replaceAll("\\s+", "");
                int length = strReplaceAll.length();
                if (length % 2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strReplaceAll.substring(0, strReplaceAll.length() - 1));
                    sb.append("0");
                    strReplaceAll = C20087.m46305(strReplaceAll.length() - 1, strReplaceAll, sb);
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
                    this.f28112 = bArr;
                    m23803();
                    return;
                } else {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 1:
                this.f28112 = string.getBytes(f28100);
                break;
            case 2:
                this.f28112 = string.getBytes(f28099);
                break;
            case 3:
                this.f28112 = string.getBytes(f28102);
                break;
            case 4:
                this.f28112 = string.getBytes(f28103);
                break;
            case 5:
                try {
                    long j = Long.parseLong(string);
                    if (j < -128 || j > 127) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f28112 = new byte[]{(byte) (j & 255)};
                        m23803();
                    }
                    return;
                } catch (NumberFormatException unused2) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 6:
                try {
                    long j2 = Long.parseLong(string);
                    if (j2 < 0 || j2 > 255) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f28112 = new byte[]{(byte) (j2 & 255)};
                        m23803();
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 7:
                try {
                    long j3 = Long.parseLong(string);
                    if (j3 < -32768 || j3 > 32767) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m23802(2, j3);
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 8:
                try {
                    long j4 = Long.parseLong(string);
                    if (j4 < 0 || j4 > 65535) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m23802(2, j4);
                    }
                    return;
                } catch (NumberFormatException unused5) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 9:
                try {
                    long j5 = Long.parseLong(string);
                    if (j5 < -2147483648L || j5 > 2147483647L) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m23802(4, j5);
                    }
                    return;
                } catch (NumberFormatException unused6) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 10:
                try {
                    long j6 = Long.parseLong(string);
                    if (j6 < 0 || j6 > 4294967295L) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m23802(4, j6);
                    }
                    return;
                } catch (NumberFormatException unused7) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 11:
                try {
                    BigInteger bigInteger = new BigInteger(string);
                    if (bigInteger.compareTo(f28097) < 0 || bigInteger.compareTo(f28101) > 0) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m23802(8, bigInteger.longValue());
                    }
                    return;
                } catch (NumberFormatException unused8) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 12:
                try {
                    BigInteger bigInteger2 = new BigInteger(string);
                    if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f28098) > 0) {
                        this.f28105 = true;
                        textView.setTextColor(C21943.f70293);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m23802(8, bigInteger2.longValue());
                    }
                    return;
                } catch (NumberFormatException unused9) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 13:
                try {
                    m23802(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                    return;
                } catch (NumberFormatException unused10) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 14:
                try {
                    m23802(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
                    return;
                } catch (NumberFormatException unused11) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            default:
                return;
        }
        m23803();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23803() {
        int iMin = Math.min(this.f28112.length, 50);
        StringBuilder sb = new StringBuilder(iMin * 2);
        for (int i = 0; i < iMin; i++) {
            byte b = this.f28112[i];
            if (i != 0) {
                sb.append(' ');
            }
            sb.append("0123456789ABCDEF".charAt((b >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        if (iMin < this.f28112.length) {
            sb.append("…");
        }
        int i2 = C21943.f70291;
        TextView textView = this.f28109;
        textView.setTextColor(i2);
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23802(int i, long j) {
        this.f28112 = new byte[i];
        if (this.f28104.isChecked()) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f28112[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f28112[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m23803();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m23804();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ApplicationC20075.f65008.edit().mo25853(i, this.f28107 ? "hex_search_type" : "hex_replace_type").apply();
        this.f28104.setEnabled(i > 4);
        m23804();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ApplicationC20075.f65008.edit().putBoolean(this.f28107 ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", z);
        m23804();
    }
}
