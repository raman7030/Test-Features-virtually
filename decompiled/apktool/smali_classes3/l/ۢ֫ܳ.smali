.class public final Ll/ۢ֫ܳ;
.super Ljava/lang/Object;
.source "J57U"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# static fields
.field public static final ֫֫:Ljava/math/BigInteger;

.field public static final ۟:Ljava/math/BigInteger;

.field public static ۧ֫:Ljava/nio/charset/Charset;

.field public static ۨ:Ljava/nio/charset/Charset;

.field public static final ܰ:Ljava/math/BigInteger;

.field public static ܽ֫:Ljava/nio/charset/Charset;

.field public static ᩺:Ljava/nio/charset/Charset;


# instance fields
.field public final ۗ:Landroid/widget/CheckBox;

.field public ۙ:Z

.field public final ۛ:Landroid/widget/Spinner;

.field public final ۤ:Z

.field public ۫:Ljava/lang/String;

.field public final ۬:Landroid/widget/TextView;

.field public ᩶:Z

.field public final ᩸:Ll/ۚۖۡ;

.field public ᩹:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 887
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    sput-object v0, Ll/ۢ֫ܳ;->ۨ:Ljava/nio/charset/Charset;

    .line 888
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sput-object v0, Ll/ۢ֫ܳ;->ܽ֫:Ljava/nio/charset/Charset;

    .line 889
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    sput-object v0, Ll/ۢ֫ܳ;->ۧ֫:Ljava/nio/charset/Charset;

    const-string v0, "GBK"

    .line 890
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ۢ֫ܳ;->᩺:Ljava/nio/charset/Charset;

    const-wide v0, 0x7fffffffffffffffL

    .line 1148
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/ۢ֫ܳ;->ܰ:Ljava/math/BigInteger;

    const-wide/high16 v0, -0x8000000000000000L

    .line 1149
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/ۢ֫ܳ;->֫֫:Ljava/math/BigInteger;

    .line 1150
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "FFFFFFFFFFFFFFFF"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۢ֫ܳ;->۟:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(ZLl/ۚۖۡ;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V
    .locals 3

    .line 906
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 902
    iput-boolean v0, p0, Ll/ۢ֫ܳ;->᩶:Z

    .line 907
    iput-boolean p1, p0, Ll/ۢ֫ܳ;->ۤ:Z

    .line 908
    iput-object p2, p0, Ll/ۢ֫ܳ;->᩸:Ll/ۚۖۡ;

    .line 909
    iput-object p3, p0, Ll/ۢ֫ܳ;->۬:Landroid/widget/TextView;

    .line 910
    iput-object p4, p0, Ll/ۢ֫ܳ;->ۛ:Landroid/widget/Spinner;

    .line 911
    iput-object p5, p0, Ll/ۢ֫ܳ;->ۗ:Landroid/widget/CheckBox;

    .line 912
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    if-eqz p1, :cond_0

    const-string v1, "hex_search_type"

    goto :goto_0

    :cond_0
    const-string v1, "hex_replace_type"

    :goto_0
    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p4, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 913
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    if-eqz p1, :cond_1

    const-string p1, "hex_search_high_byte_first"

    goto :goto_1

    :cond_1
    const-string p1, "hex_replace_high_byte_first"

    :goto_1
    invoke-interface {v0, p1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p5, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 915
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ܽ()V

    .line 916
    invoke-virtual {p2, p0}, Ll/ۚۖۡ;->֫(Landroid/text/TextWatcher;)V

    .line 917
    invoke-virtual {p4, p0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 918
    invoke-virtual {p5, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 919
    invoke-virtual {p5, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 920
    invoke-static {p3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 1220
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ܽ()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1237
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-boolean v0, p0, Ll/ۢ֫ܳ;->ۤ:Z

    if-eqz v0, :cond_0

    const-string v0, "hex_search_high_byte_first"

    goto :goto_0

    :cond_0
    const-string v0, "hex_replace_high_byte_first"

    :goto_0
    invoke-interface {p1, v0, p2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    .line 1238
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ܽ()V

    return-void
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1225
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-boolean p2, p0, Ll/ۢ֫ܳ;->ۤ:Z

    if-eqz p2, :cond_0

    const-string p2, "hex_search_type"

    goto :goto_0

    :cond_0
    const-string p2, "hex_replace_type"

    :goto_0
    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    const/4 p1, 0x4

    if-le p3, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 1226
    :goto_1
    iget-object p2, p0, Ll/ۢ֫ܳ;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 1227
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ܽ()V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 924
    iget-object v0, p0, Ll/ۢ֫ܳ;->᩸:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 925
    iget-object v2, p0, Ll/ۢ֫ܳ;->۫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 926
    iput-object v1, p0, Ll/ۢ֫ܳ;->۫:Ljava/lang/String;

    .line 927
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ֫(IJ)V
    .locals 7

    .line 1065
    new-array v0, p1, [B

    iput-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    .line 1066
    iget-object v0, p0, Ll/ۢ֫ܳ;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    const/16 v1, 0x8

    const-wide/16 v2, 0xff

    if-eqz v0, :cond_0

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 1068
    iget-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    and-long v4, p2, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v0, p1

    ushr-long/2addr p2, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_1

    .line 1073
    iget-object v4, p0, Ll/ۢ֫ܳ;->᩹:[B

    and-long v5, p2, v2

    long-to-int v6, v5

    int-to-byte v5, v6

    aput-byte v5, v4, v0

    ushr-long/2addr p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1077
    :cond_1
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ۧ()V

    return-void
.end method

.method public final ۧ()V
    .locals 6

    .line 993
    iget-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    array-length v0, v0

    const/16 v1, 0x32

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 994
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 997
    iget-object v3, p0, Ll/ۢ֫ܳ;->᩹:[B

    aget-byte v3, v3, v2

    if-eqz v2, :cond_0

    const/16 v4, 0x20

    .line 999
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    ushr-int/lit8 v4, v3, 0x4

    and-int/lit8 v4, v4, 0xf

    const-string v5, "0123456789ABCDEF"

    .line 1001
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    .line 1002
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1004
    :cond_1
    iget-object v2, p0, Ll/ۢ֫ܳ;->᩹:[B

    array-length v2, v2

    if-ge v0, v2, :cond_2

    const-string v0, "\u2026"

    .line 1005
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    :cond_2
    sget v0, Ll/᩹֡᩷;->ܿ֫:I

    iget-object v2, p0, Ll/ۢ֫ܳ;->۬:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1008
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܽ()V
    .locals 15

    .line 932
    iget-object v0, p0, Ll/ۢ֫ܳ;->᩸:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 933
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/ۢ֫ܳ;->۬:Landroid/widget/TextView;

    if-eqz v1, :cond_1

    .line 934
    iput-object v2, p0, Ll/ۢ֫ܳ;->᩹:[B

    .line 935
    iput-boolean v3, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 936
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->᩶:Z

    .line 937
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 938
    iget-boolean v0, p0, Ll/ۢ֫ܳ;->ۤ:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120304

    goto :goto_0

    :cond_0
    const v0, 0x7f1202ea

    :goto_0
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    .line 941
    :cond_1
    iput-boolean v3, p0, Ll/ۢ֫ܳ;->᩶:Z

    .line 942
    iput-boolean v3, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 943
    iget-object v1, p0, Ll/ۢ֫ܳ;->ۛ:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    const-wide/16 v6, 0xff

    const/4 v8, 0x2

    const-wide/16 v9, 0x0

    const/4 v11, 0x4

    const/16 v12, 0x8

    const v13, 0x7f12030d

    const v14, 0x7f120b48

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_c

    .line 1199
    :pswitch_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 1200
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v12, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_c

    .line 1202
    :catch_0
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1203
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1204
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1188
    :pswitch_1
    :try_start_1
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    .line 1189
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v11, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_c

    .line 1191
    :catch_1
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1192
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1193
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1171
    :pswitch_2
    :try_start_2
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 1172
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_3

    sget-object v0, Ll/ۢ֫ܳ;->۟:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_1

    .line 1178
    :cond_2
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v12, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V

    goto/16 :goto_c

    .line 1173
    :cond_3
    :goto_1
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1174
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1175
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_c

    .line 1180
    :catch_2
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1181
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1182
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1154
    :pswitch_3
    :try_start_3
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 1155
    sget-object v0, Ll/ۢ֫ܳ;->֫֫:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_5

    sget-object v0, Ll/ۢ֫ܳ;->ܰ:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_2

    .line 1161
    :cond_4
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v12, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V

    goto/16 :goto_c

    .line 1156
    :cond_5
    :goto_2
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1157
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1158
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_c

    .line 1163
    :catch_3
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1164
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1165
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1133
    :pswitch_4
    :try_start_4
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v2, v0, v9

    if-ltz v2, :cond_7

    const-wide v2, 0xffffffffL

    cmp-long v6, v0, v2

    if-lez v6, :cond_6

    goto :goto_3

    .line 1140
    :cond_6
    invoke-virtual {p0, v11, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V

    goto/16 :goto_c

    .line 1135
    :cond_7
    :goto_3
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1136
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1137
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_c

    .line 1142
    :catch_4
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1143
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1144
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1116
    :pswitch_5
    :try_start_5
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v6, v0, v2

    if-ltz v6, :cond_9

    const-wide/32 v2, 0x7fffffff

    cmp-long v6, v0, v2

    if-lez v6, :cond_8

    goto :goto_4

    .line 1123
    :cond_8
    invoke-virtual {p0, v11, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V

    goto/16 :goto_c

    .line 1118
    :cond_9
    :goto_4
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1119
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1120
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    goto/16 :goto_c

    .line 1125
    :catch_5
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1126
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1127
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1099
    :pswitch_6
    :try_start_6
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v2, v0, v9

    if-ltz v2, :cond_b

    const-wide/32 v2, 0xffff

    cmp-long v6, v0, v2

    if-lez v6, :cond_a

    goto :goto_5

    .line 1106
    :cond_a
    invoke-virtual {p0, v8, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V

    goto/16 :goto_c

    .line 1101
    :cond_b
    :goto_5
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1102
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1103
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    goto/16 :goto_c

    .line 1108
    :catch_6
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1109
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1110
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1082
    :pswitch_7
    :try_start_7
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, -0x8000

    cmp-long v6, v0, v2

    if-ltz v6, :cond_d

    const-wide/16 v2, 0x7fff

    cmp-long v6, v0, v2

    if-lez v6, :cond_c

    goto :goto_6

    .line 1089
    :cond_c
    invoke-virtual {p0, v8, v0, v1}, Ll/ۢ֫ܳ;->֫(IJ)V

    goto/16 :goto_c

    .line 1084
    :cond_d
    :goto_6
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1085
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1086
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    goto/16 :goto_c

    .line 1091
    :catch_7
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1092
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1093
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1048
    :pswitch_8
    :try_start_8
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v2, v0, v9

    if-ltz v2, :cond_f

    cmp-long v2, v0, v6

    if-lez v2, :cond_e

    goto :goto_7

    :cond_e
    and-long/2addr v0, v6

    long-to-int v1, v0

    int-to-byte v0, v1

    new-array v1, v4, [B

    aput-byte v0, v1, v3

    .line 1055
    iput-object v1, p0, Ll/ۢ֫ܳ;->᩹:[B

    .line 1056
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ۧ()V

    goto/16 :goto_c

    .line 1050
    :cond_f
    :goto_7
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1051
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1052
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    goto/16 :goto_c

    .line 1058
    :catch_8
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1059
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1060
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 1030
    :pswitch_9
    :try_start_9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v8, -0x80

    cmp-long v2, v0, v8

    if-ltz v2, :cond_11

    const-wide/16 v8, 0x7f

    cmp-long v2, v0, v8

    if-lez v2, :cond_10

    goto :goto_8

    :cond_10
    and-long/2addr v0, v6

    long-to-int v1, v0

    int-to-byte v0, v1

    new-array v1, v4, [B

    aput-byte v0, v1, v3

    .line 1037
    iput-object v1, p0, Ll/ۢ֫ܳ;->᩹:[B

    .line 1038
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ۧ()V

    goto/16 :goto_c

    .line 1032
    :cond_11
    :goto_8
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1033
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1034
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(I)V
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_9

    goto/16 :goto_c

    .line 1040
    :catch_9
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1041
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1042
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_c

    .line 957
    :pswitch_a
    sget-object v1, Ll/ۢ֫ܳ;->᩺:Ljava/nio/charset/Charset;

    .line 1024
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    .line 1025
    :goto_9
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ۧ()V

    return-void

    .line 954
    :pswitch_b
    sget-object v1, Ll/ۢ֫ܳ;->ܽ֫:Ljava/nio/charset/Charset;

    .line 1024
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    goto :goto_9

    .line 951
    :pswitch_c
    sget-object v1, Ll/ۢ֫ܳ;->ۧ֫:Ljava/nio/charset/Charset;

    .line 1024
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    goto :goto_9

    .line 948
    :pswitch_d
    sget-object v1, Ll/ۢ֫ܳ;->ۨ:Ljava/nio/charset/Charset;

    .line 1024
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۢ֫ܳ;->᩹:[B

    goto :goto_9

    :pswitch_e
    const-string v1, "\\s+"

    const-string v6, ""

    .line 1242
    invoke-virtual {v0, v1, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1243
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 1244
    rem-int/lit8 v6, v1, 0x2

    if-eqz v6, :cond_12

    .line 1245
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v4

    invoke-virtual {v0, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "0"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v4

    .line 0
    invoke-static {v7, v0, v6}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    .line 1248
    :cond_12
    div-int/lit8 v6, v1, 0x2

    new-array v6, v6, [B

    :goto_a
    if-ge v3, v1, :cond_13

    add-int/lit8 v7, v3, 0x2

    .line 1251
    :try_start_a
    invoke-virtual {v0, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x10

    invoke-static {v8, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 1252
    div-int/lit8 v3, v3, 0x2

    int-to-byte v8, v8

    aput-byte v8, v6, v3
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_a

    move v3, v7

    goto :goto_a

    :catch_a
    nop

    goto :goto_b

    :cond_13
    move-object v2, v6

    :goto_b
    if-nez v2, :cond_14

    .line 1014
    iput-boolean v4, p0, Ll/ۢ֫ܳ;->ۙ:Z

    .line 1015
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1016
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setText(I)V

    goto :goto_c

    .line 1018
    :cond_14
    iput-object v2, p0, Ll/ۢ֫ܳ;->᩹:[B

    .line 1019
    invoke-virtual {p0}, Ll/ۢ֫ܳ;->ۧ()V

    :goto_c
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
