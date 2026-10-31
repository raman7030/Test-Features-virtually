.class public final Ll/ᩴ᩵ۧ;
.super Ljava/lang/Object;
.source "E8QY"

# interfaces
.implements Ll/ۢᩴۧ;


# static fields
.field public static final ۜ:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/regex/Pattern;

.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ᩳ:Ll/ۖ᩵ۧ;

.field public static final ᩷:Ljava/util/regex/Pattern;

.field public static final ᩻:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"

    .line 100
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->ܽ:Ljava/util/regex/Pattern;

    const-string v0, "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"

    .line 104
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->ܳ:Ljava/util/regex/Pattern;

    const-string v0, "^(([0-9]*.)?[0-9]+)(px|em|%)$"

    .line 105
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->ܿ:Ljava/util/regex/Pattern;

    const-string v0, "^([-+]?\\d+\\.?\\d*?)%$"

    .line 106
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->᩷:Ljava/util/regex/Pattern;

    const-string v0, "^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$"

    .line 108
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->᩻:Ljava/util/regex/Pattern;

    const-string v0, "^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$"

    .line 110
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->ۜ:Ljava/util/regex/Pattern;

    const-string v0, "^(\\d+) (\\d+)$"

    .line 111
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩵ۧ;->ۧ:Ljava/util/regex/Pattern;

    .line 115
    new-instance v0, Ll/ۖ᩵ۧ;

    const/high16 v1, 0x41f00000    # 30.0f

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, v2}, Ll/ۖ᩵ۧ;-><init>(IFI)V

    sput-object v0, Ll/ᩴ᩵ۧ;->ᩳ:Ll/ۖ᩵ۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩵ۧ;->֫:Lorg/xmlpull/v1/XmlPullParserFactory;

    const/4 v1, 0x1

    .line 124
    invoke-virtual {v0, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 126
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 7

    const-string v0, "Invalid cell resolution "

    const-string v1, "http://www.w3.org/ns/ttml#parameter"

    const-string v2, "cellResolution"

    .line 251
    invoke-interface {p0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0xf

    if-nez p0, :cond_0

    return v1

    .line 256
    :cond_0
    sget-object v2, Ll/ᩴ᩵ۧ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 257
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const-string v4, "Ignoring malformed cell resolution: "

    if-nez v3, :cond_1

    .line 258
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 v3, 0x1

    .line 262
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x2

    .line 263
    invoke-virtual {v2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-eqz v5, :cond_2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 264
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    .line 267
    :catch_0
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return v1
.end method

.method public static ֫(Ljava/lang/String;Ll/ۖ᩵ۧ;)J
    .locals 13

    .line 846
    sget-object v0, Ll/ᩴ᩵ۧ;->ܽ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 847
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const-wide v4, 0x412e848000000000L    # 1000000.0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v1, :cond_3

    .line 848
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    const-wide/16 v9, 0xe10

    mul-long v7, v7, v9

    long-to-double v7, v7

    .line 850
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    const-wide/16 v11, 0x3c

    mul-long v9, v9, v11

    long-to-double v9, v9

    add-double/2addr v7, v9

    .line 852
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    long-to-double v9, v9

    add-double/2addr v7, v9

    .line 854
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-wide/16 v1, 0x0

    if-eqz p0, :cond_0

    .line 855
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    goto :goto_0

    :cond_0
    move-wide v9, v1

    :goto_0
    add-double/2addr v7, v9

    const/4 p0, 0x5

    .line 856
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 858
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    long-to-float p0, v9

    iget v3, p1, Ll/ۖ᩵ۧ;->֫:F

    div-float/2addr p0, v3

    float-to-double v9, p0

    goto :goto_1

    :cond_1
    move-wide v9, v1

    :goto_1
    add-double/2addr v7, v9

    const/4 p0, 0x6

    .line 859
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 862
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-double v0, v0

    iget p0, p1, Ll/ۖ᩵ۧ;->ۧ:I

    int-to-double v2, p0

    div-double/2addr v0, v2

    iget p0, p1, Ll/ۖ᩵ۧ;->֫:F

    float-to-double p0, p0

    div-double v1, v0, p0

    :cond_2
    add-double/2addr v7, v1

    :goto_2
    mul-double v7, v7, v4

    double-to-long p0, v7

    return-wide p0

    .line 868
    :cond_3
    sget-object v0, Ll/ᩴ᩵ۧ;->ܳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 869
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 870
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 872
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v0, "ms"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_3

    :sswitch_1
    const-string v0, "t"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x3

    goto :goto_4

    :sswitch_2
    const-string v0, "m"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x2

    goto :goto_4

    :sswitch_3
    const-string v0, "h"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_3

    :cond_6
    const/4 v2, 0x1

    goto :goto_4

    :sswitch_4
    const-string v0, "f"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    goto :goto_4

    :goto_3
    const/4 v2, -0x1

    :cond_8
    :goto_4
    packed-switch v2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-wide p0, 0x408f400000000000L    # 1000.0

    goto :goto_6

    .line 890
    :pswitch_1
    iget p0, p1, Ll/ۖ᩵ۧ;->ܽ:I

    int-to-double p0, p0

    goto :goto_6

    :pswitch_2
    const-wide/high16 p0, 0x404e000000000000L    # 60.0

    goto :goto_5

    :pswitch_3
    const-wide p0, 0x40ac200000000000L    # 3600.0

    :goto_5
    mul-double v7, v7, p0

    goto :goto_2

    .line 887
    :pswitch_4
    iget p0, p1, Ll/ۖ᩵ۧ;->֫:F

    float-to-double p0, p0

    :goto_6
    div-double/2addr v7, p0

    goto :goto_2

    .line 895
    :cond_9
    new-instance p1, Ll/֫ᩴۧ;

    const-string v0, "Malformed time expression: "

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 31
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 895
    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x66 -> :sswitch_4
        0x68 -> :sswitch_3
        0x6d -> :sswitch_2
        0x74 -> :sswitch_1
        0xda6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;
    .locals 0

    if-nez p0, :cond_0

    .line 658
    new-instance p0, Ll/ۚ᩵ۧ;

    invoke-direct {p0}, Ll/ۚ᩵ۧ;-><init>()V

    :cond_0
    return-object p0
.end method

.method public static ֫(Lorg/xmlpull/v1/XmlPullParser;Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;
    .locals 17

    move-object/from16 v1, p0

    .line 526
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v0, 0x0

    move-object/from16 v0, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2b

    .line 528
    invoke-interface {v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v5

    .line 529
    invoke-interface {v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v7, "multiRowAlign"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v6, 0x10

    goto/16 :goto_2

    :sswitch_1
    const-string v7, "backgroundColor"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v6, 0xf

    goto/16 :goto_2

    :sswitch_2
    const-string v7, "rubyPosition"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v6, 0xe

    goto/16 :goto_2

    :sswitch_3
    const-string v7, "textEmphasis"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v6, 0xd

    goto/16 :goto_2

    :sswitch_4
    const-string v7, "fontSize"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v6, 0xc

    goto/16 :goto_2

    :sswitch_5
    const-string v7, "textCombine"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v6, 0xb

    goto/16 :goto_2

    :sswitch_6
    const-string v7, "shear"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v6, 0xa

    goto/16 :goto_2

    :sswitch_7
    const-string v7, "color"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v6, 0x9

    goto/16 :goto_2

    :sswitch_8
    const-string v7, "ruby"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v6, 0x8

    goto/16 :goto_2

    :sswitch_9
    const-string v7, "id"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_1

    :cond_9
    const/4 v6, 0x7

    goto :goto_2

    :sswitch_a
    const-string v7, "fontWeight"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_1

    :cond_a
    const/4 v6, 0x6

    goto :goto_2

    :sswitch_b
    const-string v7, "textDecoration"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_1

    :cond_b
    const/4 v6, 0x5

    goto :goto_2

    :sswitch_c
    const-string v7, "origin"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_1

    :cond_c
    const/4 v6, 0x4

    goto :goto_2

    :sswitch_d
    const-string v7, "textAlign"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    goto :goto_1

    :cond_d
    const/4 v6, 0x3

    goto :goto_2

    :sswitch_e
    const-string v7, "fontFamily"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_1

    :cond_e
    const/4 v6, 0x2

    goto :goto_2

    :sswitch_f
    const-string v7, "extent"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    goto :goto_1

    :cond_f
    const/4 v6, 0x1

    goto :goto_2

    :sswitch_10
    const-string v7, "fontStyle"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_1

    :cond_10
    const/4 v6, 0x0

    goto :goto_2

    :goto_1
    const/4 v6, -0x1

    :goto_2
    const-string v7, "start"

    const-string v12, "right"

    const-string v13, "left"

    const-string v14, "end"

    const-string v15, "center"

    const/16 v16, 0x0

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_11

    .line 572
    :pswitch_0
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    .line 663
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_1

    goto :goto_3

    :sswitch_11
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_3

    :sswitch_12
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_3

    :cond_11
    const/4 v8, 0x3

    goto :goto_4

    :sswitch_13
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_3

    :cond_12
    const/4 v8, 0x2

    goto :goto_4

    :sswitch_14
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_3

    :cond_13
    const/4 v8, 0x1

    goto :goto_4

    :sswitch_15
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_3

    :cond_14
    const/4 v8, 0x0

    goto :goto_4

    :goto_3
    const/4 v8, -0x1

    :cond_15
    :goto_4
    packed-switch v8, :pswitch_data_1

    :goto_5
    move-object/from16 v5, v16

    goto :goto_6

    .line 666
    :pswitch_1
    sget-object v16, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_5

    .line 669
    :pswitch_2
    sget-object v16, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_5

    .line 671
    :pswitch_3
    sget-object v16, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_5

    .line 572
    :goto_6
    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->֫(Landroid/text/Layout$Alignment;)V

    goto/16 :goto_11

    .line 536
    :pswitch_4
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    .line 538
    :try_start_0
    invoke-static {v5}, Ll/ܿۚ֫;->ۧ(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v6}, Ll/ۚ᩵ۧ;->֫(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_11

    :catch_0
    const-string v6, "Failed parsing background value: "

    goto :goto_7

    .line 609
    :pswitch_5
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "before"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    const-string v6, "after"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    goto/16 :goto_11

    .line 614
    :cond_16
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v10}, Ll/ۚ᩵ۧ;->ᩳ(I)V

    goto/16 :goto_11

    .line 611
    :cond_17
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۚ᩵ۧ;->ᩳ(I)V

    goto/16 :goto_11

    .line 638
    :pswitch_6
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-static {v5}, Ll/ۡ᩵ۧ;->֫(Ljava/lang/String;)Ll/ۡ᩵ۧ;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->֫(Ll/ۡ᩵ۧ;)V

    goto/16 :goto_11

    .line 556
    :pswitch_7
    :try_start_1
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    .line 557
    invoke-static {v5, v0}, Ll/ᩴ᩵ۧ;->֫(Ljava/lang/String;Ll/ۚ᩵ۧ;)V
    :try_end_1
    .catch Ll/֫ᩴۧ; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_11

    :catch_1
    const-string v6, "Failed parsing fontSize value: "

    .line 0
    :goto_7
    invoke-static {v6, v5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 575
    :pswitch_8
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "all"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    const-string v6, "none"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    goto/16 :goto_11

    .line 577
    :cond_18
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۚ᩵ۧ;->ᩳ(Z)V

    goto/16 :goto_11

    .line 580
    :cond_19
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۚ᩵ۧ;->ᩳ(Z)V

    goto/16 :goto_11

    .line 641
    :pswitch_9
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v6

    .line 813
    sget-object v0, Ll/ᩴ᩵ۧ;->᩷:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 814
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    if-nez v7, :cond_1a

    const-string v0, "Invalid value for shear: "

    .line 0
    invoke-static {v0, v5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 819
    :cond_1a
    :try_start_2
    invoke-virtual {v0, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v7, -0x3d380000    # -100.0f

    .line 824
    invoke-static {v7, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v7, 0x42c80000    # 100.0f

    .line 825
    invoke-static {v7, v0}, Ljava/lang/Math;->min(FF)F

    move-result v8
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    .line 828
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "Failed to parse shear: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 641
    :goto_8
    invoke-virtual {v6, v8}, Ll/ۚ᩵ۧ;->ۧ(F)V

    move-object v0, v6

    goto/16 :goto_11

    .line 544
    :pswitch_a
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    .line 546
    :try_start_3
    invoke-static {v5}, Ll/ܿۚ֫;->ۧ(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v6}, Ll/ۚ᩵ۧ;->ۧ(I)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_11

    :catch_3
    const-string v6, "Failed parsing color value: "

    goto/16 :goto_7

    .line 588
    :pswitch_b
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_2

    goto :goto_9

    :sswitch_16
    const-string v6, "text"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1b

    goto :goto_9

    :cond_1b
    const/4 v5, 0x5

    goto :goto_a

    :sswitch_17
    const-string v6, "base"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    goto :goto_9

    :cond_1c
    const/4 v5, 0x4

    goto :goto_a

    :sswitch_18
    const-string v6, "textContainer"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    goto :goto_9

    :cond_1d
    const/4 v5, 0x3

    goto :goto_a

    :sswitch_19
    const-string v6, "delimiter"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    goto :goto_9

    :cond_1e
    const/4 v5, 0x2

    goto :goto_a

    :sswitch_1a
    const-string v6, "container"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    goto :goto_9

    :cond_1f
    const/4 v5, 0x1

    goto :goto_a

    :sswitch_1b
    const-string v6, "baseContainer"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    goto :goto_9

    :cond_20
    const/4 v5, 0x0

    goto :goto_a

    :goto_9
    const/4 v5, -0x1

    :goto_a
    packed-switch v5, :pswitch_data_2

    goto/16 :goto_11

    .line 598
    :pswitch_c
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v9}, Ll/ۚ᩵ۧ;->ܿ(I)V

    goto/16 :goto_11

    .line 601
    :pswitch_d
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v8}, Ll/ۚ᩵ۧ;->ܿ(I)V

    goto/16 :goto_11

    .line 590
    :pswitch_e
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۚ᩵ۧ;->ܿ(I)V

    goto/16 :goto_11

    .line 594
    :pswitch_f
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v10}, Ll/ۚ᩵ۧ;->ܿ(I)V

    goto/16 :goto_11

    :pswitch_10
    const-string v6, "style"

    .line 531
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    .line 532
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->ܽ(Ljava/lang/String;)V

    goto/16 :goto_11

    .line 563
    :pswitch_11
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    const-string v6, "bold"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->֫(Z)V

    goto/16 :goto_11

    .line 622
    :pswitch_12
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_3

    goto :goto_b

    :sswitch_1c
    const-string v6, "linethrough"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    goto :goto_b

    :cond_21
    const/4 v5, 0x3

    goto :goto_c

    :sswitch_1d
    const-string v6, "nolinethrough"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    goto :goto_b

    :cond_22
    const/4 v5, 0x2

    goto :goto_c

    :sswitch_1e
    const-string v6, "underline"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    goto :goto_b

    :cond_23
    const/4 v5, 0x1

    goto :goto_c

    :sswitch_1f
    const-string v6, "nounderline"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_24

    goto :goto_b

    :cond_24
    const/4 v5, 0x0

    goto :goto_c

    :goto_b
    const/4 v5, -0x1

    :goto_c
    packed-switch v5, :pswitch_data_3

    goto/16 :goto_11

    .line 624
    :pswitch_13
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۚ᩵ۧ;->ܽ(Z)V

    goto/16 :goto_11

    .line 627
    :pswitch_14
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۚ᩵ۧ;->ܽ(Z)V

    goto/16 :goto_11

    .line 630
    :pswitch_15
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۚ᩵ۧ;->ܿ(Z)V

    goto/16 :goto_11

    .line 633
    :pswitch_16
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۚ᩵ۧ;->ܿ(Z)V

    goto/16 :goto_11

    .line 644
    :pswitch_17
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_11

    .line 569
    :pswitch_18
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    .line 663
    invoke-static {v5}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_4

    goto :goto_d

    :sswitch_20
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_29

    goto :goto_d

    :sswitch_21
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    goto :goto_d

    :cond_25
    const/4 v8, 0x3

    goto :goto_e

    :sswitch_22
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_26

    goto :goto_d

    :cond_26
    const/4 v8, 0x2

    goto :goto_e

    :sswitch_23
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_27

    goto :goto_d

    :cond_27
    const/4 v8, 0x1

    goto :goto_e

    :sswitch_24
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_28

    goto :goto_d

    :cond_28
    const/4 v8, 0x0

    goto :goto_e

    :goto_d
    const/4 v8, -0x1

    :cond_29
    :goto_e
    packed-switch v8, :pswitch_data_4

    :goto_f
    move-object/from16 v5, v16

    goto :goto_10

    .line 666
    :pswitch_19
    sget-object v16, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_f

    .line 669
    :pswitch_1a
    sget-object v16, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_f

    .line 671
    :pswitch_1b
    sget-object v16, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_f

    .line 569
    :goto_10
    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->ۧ(Landroid/text/Layout$Alignment;)V

    goto :goto_11

    .line 552
    :pswitch_1c
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->ۧ(Ljava/lang/String;)V

    goto :goto_11

    .line 647
    :pswitch_1d
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->֫(Ljava/lang/String;)V

    goto :goto_11

    .line 566
    :pswitch_1e
    invoke-static {v0}, Ll/ᩴ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v0

    const-string v6, "italic"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v0, v5}, Ll/ۚ᩵ۧ;->ۧ(Z)V

    :cond_2a
    :goto_11
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_2b
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x5c71855e -> :sswitch_10
        -0x4cd540d6 -> :sswitch_f
        -0x48ff636d -> :sswitch_e
        -0x3f826a28 -> :sswitch_d
        -0x3c1e50da -> :sswitch_c
        -0x3468fa43 -> :sswitch_b
        -0x2bc67c59 -> :sswitch_a
        0xd1b -> :sswitch_9
        0x3595da -> :sswitch_8
        0x5a72f63 -> :sswitch_7
        0x6855ce1 -> :sswitch_6
        0x6909352 -> :sswitch_5
        0x15caa0f0 -> :sswitch_4
        0x36e741c9 -> :sswitch_3
        0x42841923 -> :sswitch_2
        0x4cb7f6d5 -> :sswitch_1
        0x6899f5a4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_18
        :pswitch_17
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x514d33ab -> :sswitch_15
        0x188db -> :sswitch_14
        0x32a007 -> :sswitch_13
        0x677c21c -> :sswitch_12
        0x68ac462 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x24de7f50 -> :sswitch_1b
        -0x187eb37f -> :sswitch_1a
        -0xeee99f9 -> :sswitch_19
        -0x81c562c -> :sswitch_18
        0x2e06d1 -> :sswitch_17
        0x36452d -> :sswitch_16
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_f
        :pswitch_c
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x57195dd5 -> :sswitch_1f
        -0x3d363934 -> :sswitch_1e
        0x36723ff0 -> :sswitch_1d
        0x641ec051 -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x514d33ab -> :sswitch_24
        0x188db -> :sswitch_23
        0x32a007 -> :sswitch_22
        0x677c21c -> :sswitch_21
        0x68ac462 -> :sswitch_20
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1a
        :pswitch_19
    .end packed-switch
.end method

.method public static ֫(Lorg/xmlpull/v1/XmlPullParser;Ll/ܺ᩵ۧ;Ljava/util/HashMap;Ll/ۖ᩵ۧ;)Ll/ܺ᩵ۧ;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v1, p3

    .line 689
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v2

    const/4 v3, 0x0

    .line 690
    invoke-static {v0, v3}, Ll/ᩴ᩵ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v5

    const-string v4, ""

    const/4 v8, 0x0

    move-object v8, v3

    move-object v11, v8

    move-object v10, v4

    const/4 v3, 0x0

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    if-ge v3, v2, :cond_9

    .line 692
    invoke-interface {v0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v4

    .line 693
    invoke-interface {v0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v6

    .line 694
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v7, "backgroundImage"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x5

    goto :goto_2

    :sswitch_1
    const-string v7, "style"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x4

    goto :goto_2

    :sswitch_2
    const-string v7, "begin"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x3

    goto :goto_2

    :sswitch_3
    const-string v7, "end"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    goto :goto_2

    :sswitch_4
    const-string v7, "dur"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    goto :goto_2

    :sswitch_5
    const-string v7, "region"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    goto :goto_2

    :goto_1
    const/4 v4, -0x1

    :goto_2
    packed-switch v4, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    const-string v4, "#"

    .line 721
    invoke-virtual {v6, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    .line 722
    invoke-virtual {v6, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    move-object v11, v4

    :cond_6
    :goto_3
    move-object/from16 v4, p2

    goto :goto_5

    .line 520
    :pswitch_1
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 521
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    new-array v4, v7, [Ljava/lang/String;

    goto :goto_4

    :cond_7
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v6, "\\s+"

    const/4 v7, -0x1

    .line 1090
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 707
    :goto_4
    array-length v6, v4

    if-lez v6, :cond_6

    move-object v8, v4

    goto :goto_3

    .line 696
    :pswitch_2
    invoke-static {v6, v1}, Ll/ᩴ᩵ۧ;->֫(Ljava/lang/String;Ll/ۖ᩵ۧ;)J

    move-result-wide v6

    move-object/from16 v4, p2

    move-wide v12, v6

    goto :goto_5

    .line 699
    :pswitch_3
    invoke-static {v6, v1}, Ll/ᩴ᩵ۧ;->֫(Ljava/lang/String;Ll/ۖ᩵ۧ;)J

    move-result-wide v6

    move-object/from16 v4, p2

    move-wide v14, v6

    goto :goto_5

    .line 702
    :pswitch_4
    invoke-static {v6, v1}, Ll/ᩴ᩵ۧ;->֫(Ljava/lang/String;Ll/ۖ᩵ۧ;)J

    move-result-wide v6

    move-object/from16 v4, p2

    move-wide/from16 v16, v6

    goto :goto_5

    :pswitch_5
    move-object/from16 v4, p2

    .line 712
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    move-object v10, v6

    :cond_8
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_9
    if-eqz v9, :cond_b

    .line 730
    iget-wide v1, v9, Ll/ܺ᩵ۧ;->᩷:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v1, v3

    if-eqz v6, :cond_c

    cmp-long v6, v12, v3

    if-eqz v6, :cond_a

    add-long/2addr v12, v1

    :cond_a
    cmp-long v6, v14, v3

    if-eqz v6, :cond_c

    add-long/2addr v14, v1

    goto :goto_6

    :cond_b
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    :cond_c
    :goto_6
    move-wide v1, v12

    cmp-long v6, v14, v3

    if-nez v6, :cond_e

    cmp-long v6, v16, v3

    if-eqz v6, :cond_d

    add-long v16, v1, v16

    move-wide/from16 v3, v16

    goto :goto_7

    :cond_d
    if-eqz v9, :cond_e

    .line 742
    iget-wide v6, v9, Ll/ܺ᩵ۧ;->ۧ:J

    cmp-long v12, v6, v3

    if-eqz v12, :cond_e

    move-wide v3, v6

    goto :goto_7

    :cond_e
    move-wide v3, v14

    .line 749
    :goto_7
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    move-object v6, v8

    move-object v7, v10

    move-object v8, v11

    move-object/from16 v9, p1

    .line 748
    invoke-static/range {v0 .. v9}, Ll/ܺ᩵ۧ;->֫(Ljava/lang/String;JJLl/ۚ᩵ۧ;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܺ᩵ۧ;)Ll/ܺ᩵ۧ;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x37b7d90c -> :sswitch_5
        0x18601 -> :sswitch_4
        0x188db -> :sswitch_3
        0x59478a9 -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x4d0b70cd -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;Ll/ۚ᩵ۧ;)V
    .locals 7

    .line 772
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v0, "\\s+"

    const/4 v1, -0x1

    .line 1090
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 774
    array-length v2, v0

    const/4 v3, 0x2

    sget-object v4, Ll/ᩴ᩵ۧ;->ܿ:Ljava/util/regex/Pattern;

    const/4 v5, 0x1

    if-ne v2, v5, :cond_0

    .line 775
    invoke-virtual {v4, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    goto :goto_0

    .line 776
    :cond_0
    array-length v2, v0

    if-ne v2, v3, :cond_5

    .line 777
    aget-object v0, v0, v5

    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v2, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."

    .line 778
    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 787
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    const-string v4, "\'."

    if-eqz v2, :cond_4

    const/4 p0, 0x3

    .line 788
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v6, "px"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_1
    const-string v6, "em"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_2
    const-string v6, "%"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 800
    new-instance p0, Ll/֫ᩴۧ;

    const-string p1, "Invalid unit for fontSize: \'"

    .line 0
    invoke-static {p1, v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 800
    throw p0

    .line 791
    :pswitch_0
    invoke-virtual {p1, v5}, Ll/ۚ᩵ۧ;->ܽ(I)V

    goto :goto_2

    .line 794
    :pswitch_1
    invoke-virtual {p1, v3}, Ll/ۚ᩵ۧ;->ܽ(I)V

    goto :goto_2

    .line 797
    :pswitch_2
    invoke-virtual {p1, p0}, Ll/ۚ᩵ۧ;->ܽ(I)V

    .line 802
    :goto_2
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-virtual {p1, p0}, Ll/ۚ᩵ۧ;->֫(F)V

    return-void

    .line 804
    :cond_4
    new-instance p1, Ll/֫ᩴۧ;

    const-string v0, "Invalid expression for fontSize: \'"

    .line 0
    invoke-static {v0, p0, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 31
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 804
    throw p1

    .line 783
    :cond_5
    new-instance p0, Ll/֫ᩴۧ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Invalid number of entries for fontSize: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    const-string v1, "."

    .line 0
    invoke-static {v0, v1, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 783
    throw p0

    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;ILl/ۘ᩵ۧ;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 304
    :cond_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v3, "style"

    .line 305
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    .line 306
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 307
    new-instance v4, Ll/ۚ᩵ۧ;

    invoke-direct {v4}, Ll/ۚ᩵ۧ;-><init>()V

    invoke-static {v0, v4}, Ll/ᩴ᩵ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ll/ۚ᩵ۧ;)Ll/ۚ᩵ۧ;

    move-result-object v4

    if-eqz v3, :cond_2

    .line 520
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 521
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    new-array v3, v6, [Ljava/lang/String;

    goto :goto_0

    :cond_1
    sget-object v7, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v7, "\\s+"

    .line 1090
    invoke-virtual {v3, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 309
    :goto_0
    array-length v5, v3

    :goto_1
    if-ge v6, v5, :cond_2

    aget-object v7, v3, v6

    .line 310
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚ᩵ۧ;

    invoke-virtual {v4, v7}, Ll/ۚ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 313
    :cond_2
    invoke-virtual {v4}, Ll/ۚ᩵ۧ;->᩻()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 315
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    move-object/from16 v6, p4

    goto/16 :goto_e

    :cond_4
    const-string v4, "region"

    .line 317
    invoke-static {v0, v4}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    const-string v5, "id"

    if-eqz v4, :cond_17

    .line 358
    invoke-static {v0, v5}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "origin"

    .line 367
    invoke-static {v0, v4}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    .line 369
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 371
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚ᩵ۧ;

    if-eqz v5, :cond_6

    .line 373
    invoke-virtual {v5}, Ll/ۚ᩵ۧ;->᩷()Ljava/lang/String;

    move-result-object v4

    :cond_6
    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v8, "Ignoring region with missing tts:extent: "

    .line 377
    sget-object v9, Ll/ᩴ᩵ۧ;->ۜ:Ljava/util/regex/Pattern;

    sget-object v10, Ll/ᩴ᩵ۧ;->᩻:Ljava/util/regex/Pattern;

    const/high16 v11, 0x42c80000    # 100.0f

    if-eqz v4, :cond_a

    .line 378
    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    .line 379
    invoke-virtual {v9, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    .line 380
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    const-string v15, "Ignoring region with malformed origin: "

    if-eqz v14, :cond_7

    .line 383
    :try_start_0
    invoke-virtual {v12, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v13

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v13

    div-float/2addr v13, v11

    .line 384
    invoke-virtual {v12, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    invoke-static {v12}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v12
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    div-float/2addr v12, v11

    move/from16 v18, v13

    move v13, v12

    move/from16 v12, v18

    goto :goto_2

    .line 386
    :catch_0
    invoke-virtual {v15, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 389
    :cond_7
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->matches()Z

    move-result v12

    if-eqz v12, :cond_9

    if-nez v2, :cond_8

    .line 391
    invoke-virtual {v8, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 395
    :cond_8
    :try_start_1
    invoke-virtual {v13, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    .line 396
    invoke-virtual {v13, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v13

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    int-to-float v12, v12

    .line 398
    iget v14, v2, Ll/ۘ᩵ۧ;->ۧ:I

    int-to-float v14, v14

    div-float/2addr v12, v14

    int-to-float v13, v13

    .line 399
    iget v14, v2, Ll/ۘ᩵ۧ;->֫:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    int-to-float v14, v14

    div-float/2addr v13, v14

    goto :goto_2

    .line 401
    :catch_1
    invoke-virtual {v15, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_9
    const-string v3, "Ignoring region with unsupported origin: "

    .line 405
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_a
    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_2
    const-string v14, "extent"

    .line 417
    invoke-static {v0, v14}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_b

    .line 419
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 421
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ᩵ۧ;

    if-eqz v3, :cond_b

    .line 423
    invoke-virtual {v3}, Ll/ۚ᩵ۧ;->ۧ()Ljava/lang/String;

    move-result-object v14

    :cond_b
    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v14, :cond_f

    .line 428
    invoke-virtual {v10, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    .line 429
    invoke-virtual {v9, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 430
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    const-string v15, "Ignoring region with malformed extent: "

    if-eqz v14, :cond_c

    .line 433
    :try_start_2
    invoke-virtual {v10, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    div-float/2addr v6, v11

    .line 435
    invoke-virtual {v10, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    div-float/2addr v4, v11

    goto :goto_3

    .line 0
    :catch_2
    invoke-static {v15, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 440
    :cond_c
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-eqz v10, :cond_e

    if-nez v2, :cond_d

    .line 0
    invoke-static {v8, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 446
    :cond_d
    :try_start_3
    invoke-virtual {v9, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 447
    invoke-virtual {v9, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    int-to-float v6, v6

    .line 449
    iget v8, v2, Ll/ۘ᩵ۧ;->ۧ:I

    int-to-float v8, v8

    div-float/2addr v6, v8

    int-to-float v5, v5

    .line 450
    iget v4, v2, Ll/ۘ᩵ۧ;->֫:I
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    int-to-float v4, v4

    div-float v4, v5, v4

    :goto_3
    move v5, v4

    move v4, v6

    goto :goto_5

    :cond_e
    const-string v3, "Ignoring region with unsupported extent: "

    .line 0
    invoke-static {v3, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    const/4 v3, 0x0

    goto/16 :goto_c

    :cond_f
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    :goto_5
    const-string v6, "displayAlign"

    .line 468
    invoke-static {v0, v6}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_12

    .line 470
    invoke-static {v6}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "center"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    const-string v8, "after"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_6

    :cond_10
    add-float/2addr v13, v5

    const/4 v6, 0x2

    move v9, v13

    const/4 v11, 0x2

    goto :goto_7

    :cond_11
    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v5, v6

    add-float/2addr v13, v6

    const/4 v6, 0x1

    move v9, v13

    const/4 v11, 0x1

    goto :goto_7

    :cond_12
    :goto_6
    const/4 v6, 0x0

    move v9, v13

    const/4 v11, 0x0

    :goto_7
    move/from16 v15, p2

    int-to-float v6, v15

    div-float/2addr v3, v6

    const-string v6, "writingMode"

    .line 490
    invoke-static {v0, v6}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_16

    .line 492
    invoke-static {v6}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_8

    :sswitch_0
    const-string v8, "tbrl"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    goto :goto_8

    :cond_13
    const/4 v6, 0x2

    goto :goto_9

    :sswitch_1
    const-string v8, "tblr"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    goto :goto_8

    :cond_14
    const/4 v6, 0x1

    goto :goto_9

    :sswitch_2
    const-string v8, "tb"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    goto :goto_8

    :cond_15
    const/4 v6, 0x0

    goto :goto_9

    :goto_8
    const/4 v6, -0x1

    :goto_9
    packed-switch v6, :pswitch_data_0

    goto :goto_a

    :pswitch_0
    const/4 v6, 0x1

    const/16 v16, 0x1

    goto :goto_b

    :pswitch_1
    const/4 v6, 0x2

    const/16 v16, 0x2

    goto :goto_b

    :cond_16
    :goto_a
    const/high16 v6, -0x80000000

    const/high16 v16, -0x80000000

    .line 506
    :goto_b
    new-instance v17, Ll/᩵᩵ۧ;

    const/4 v10, 0x0

    const/4 v14, 0x1

    move-object/from16 v6, v17

    move v8, v12

    move v12, v4

    move v13, v5

    move v15, v3

    invoke-direct/range {v6 .. v16}, Ll/᩵᩵ۧ;-><init>(Ljava/lang/String;FFIIFFIFI)V

    move-object/from16 v3, v17

    :goto_c
    if-eqz v3, :cond_3

    .line 321
    iget-object v4, v3, Ll/᩵᩵ۧ;->ۧ:Ljava/lang/String;

    move-object/from16 v6, p4

    invoke-virtual {v6, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_17
    move-object/from16 v6, p4

    const-string v3, "metadata"

    .line 323
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 333
    :cond_18
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const-string v4, "image"

    .line 334
    invoke-static {v0, v4}, Ll/ᩴ֨֫;->ܽ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 335
    invoke-static {v0, v5}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_19

    .line 337
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, p5

    .line 338
    invoke-virtual {v8, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_19
    move-object/from16 v8, p5

    .line 341
    :goto_d
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->ۧ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_f

    :cond_1a
    :goto_e
    move-object/from16 v8, p5

    :goto_f
    const-string v3, "head"

    .line 326
    invoke-static {v0, v3}, Ll/ᩴ֨֫;->ۧ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe6e -> :sswitch_2
        0x363874 -> :sswitch_1
        0x363928 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "tt"

    .line 753
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "head"

    .line 754
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "body"

    .line 755
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "div"

    .line 756
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "p"

    .line 757
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "span"

    .line 758
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "br"

    .line 759
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "style"

    .line 760
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "styling"

    .line 761
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "layout"

    .line 762
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "region"

    .line 763
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "metadata"

    .line 764
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image"

    .line 765
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "data"

    .line 766
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "information"

    .line 767
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Lorg/xmlpull/v1/XmlPullParser;)Ll/ۖ᩵ۧ;
    .locals 7

    const-string v0, "frameRate"

    const-string v1, "http://www.w3.org/ns/ttml#parameter"

    .line 221
    invoke-interface {p0, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 223
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1e

    :goto_0
    const-string v2, "frameRateMultiplier"

    .line 227
    invoke-interface {p0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 229
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v3, -0x1

    const-string v4, " "

    .line 1090
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    .line 230
    array-length v3, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v4, "frameRateMultiplier doesn\'t have 2 parts"

    invoke-static {v4, v3}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 231
    aget-object v3, v2, v5

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    .line 232
    aget-object v2, v2, v6

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v3, v2

    goto :goto_2

    :cond_2
    const/high16 v3, 0x3f800000    # 1.0f

    .line 236
    :goto_2
    sget-object v2, Ll/ᩴ᩵ۧ;->ᩳ:Ll/ۖ᩵ۧ;

    iget v4, v2, Ll/ۖ᩵ۧ;->ۧ:I

    const-string v5, "subFrameRate"

    .line 237
    invoke-interface {p0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 239
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 242
    :cond_3
    iget v2, v2, Ll/ۖ᩵ۧ;->ܽ:I

    const-string v5, "tickRate"

    .line 243
    invoke-interface {p0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 245
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 247
    :cond_4
    new-instance p0, Ll/ۖ᩵ۧ;

    int-to-float v0, v0

    mul-float v0, v0, v3

    invoke-direct {p0, v4, v0, v2}, Ll/ۖ᩵ۧ;-><init>(IFI)V

    return-object p0
.end method

.method public static ܽ(Lorg/xmlpull/v1/XmlPullParser;)Ll/ۘ᩵ۧ;
    .locals 4

    const-string v0, "extent"

    .line 275
    invoke-static {p0, v0}, Ll/ᩴ֨֫;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 280
    :cond_0
    sget-object v1, Ll/ᩴ᩵ۧ;->ۜ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 281
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v1, "Ignoring non-pixel tts extent: "

    .line 282
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v0

    :cond_1
    const/4 v2, 0x1

    .line 286
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    .line 287
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 288
    new-instance v3, Ll/ۘ᩵ۧ;

    invoke-direct {v3, v2, v1}, Ll/ۘ᩵ۧ;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    const-string v1, "Ignoring malformed tts extent: "

    .line 290
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic reset()V
    .locals 0

    return-void
.end method

.method public final ֫(II[B)Ll/ܰۘۧ;
    .locals 23

    move-object/from16 v1, p0

    .line 149
    :try_start_0
    iget-object v0, v1, Ll/ᩴ᩵ۧ;->֫:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v8

    .line 150
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 151
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 152
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    const-string v0, ""

    .line 153
    new-instance v2, Ll/᩵᩵ۧ;

    const-string v13, ""

    const v21, -0x800001

    const/high16 v22, -0x80000000

    const v14, -0x800001

    const v15, -0x800001

    const/high16 v16, -0x80000000

    const/high16 v17, -0x80000000

    const v18, -0x800001

    const v19, -0x800001

    const/high16 v20, -0x80000000

    move-object v12, v2

    .line 35
    invoke-direct/range {v12 .. v22}, Ll/᩵᩵ۧ;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 153
    invoke-virtual {v10, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    new-instance v0, Ljava/io/ByteArrayInputStream;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct {v0, v4, v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    const/4 v2, 0x0

    .line 155
    invoke-interface {v8, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 157
    new-instance v12, Ljava/util/ArrayDeque;

    invoke-direct {v12}, Ljava/util/ArrayDeque;-><init>()V

    .line 159
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    .line 160
    sget-object v3, Ll/ᩴ᩵ۧ;->ᩳ:Ll/ۖ᩵ۧ;

    const/16 v4, 0xf

    const/4 v5, 0x0

    move-object v13, v2

    const/4 v14, 0x0

    :goto_0
    const/4 v5, 0x1

    if-eq v0, v5, :cond_a

    .line 164
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺ᩵ۧ;

    const/4 v6, 0x2

    if-nez v14, :cond_7

    .line 166
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v15, "tt"

    if-ne v0, v6, :cond_4

    .line 168
    :try_start_1
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    invoke-static {v8}, Ll/ᩴ᩵ۧ;->ۧ(Lorg/xmlpull/v1/XmlPullParser;)Ll/ۖ᩵ۧ;

    move-result-object v3

    .line 170
    invoke-static {v8}, Ll/ᩴ᩵ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v4

    .line 171
    invoke-static {v8}, Ll/ᩴ᩵ۧ;->ܽ(Lorg/xmlpull/v1/XmlPullParser;)Ll/ۘ᩵ۧ;

    move-result-object v2

    :cond_0
    move-object v15, v2

    move-object v6, v3

    move/from16 v16, v4

    .line 173
    invoke-static {v7}, Ll/ᩴ᩵ۧ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring unsupported tag: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    move-object v1, v6

    goto :goto_1

    :cond_1
    const-string v0, "head"

    .line 176
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v2, v8

    move-object v3, v9

    move/from16 v4, v16

    move-object v5, v15

    move-object v7, v6

    move-object v6, v10

    move-object v1, v7

    move-object v7, v11

    .line 177
    invoke-static/range {v2 .. v7}, Ll/ᩴ᩵ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;ILl/ۘ᩵ۧ;Ljava/util/HashMap;Ljava/util/HashMap;)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :cond_2
    move-object v1, v6

    .line 180
    :try_start_2
    invoke-static {v8, v5, v10, v1}, Ll/ᩴ᩵ۧ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ll/ܺ᩵ۧ;Ljava/util/HashMap;Ll/ۖ᩵ۧ;)Ll/ܺ᩵ۧ;

    move-result-object v0

    .line 181
    invoke-virtual {v12, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    if-eqz v5, :cond_3

    .line 183
    invoke-virtual {v5, v0}, Ll/ܺ᩵ۧ;->֫(Ll/ܺ᩵ۧ;)V
    :try_end_2
    .catch Ll/֫ᩴۧ; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Suppressing parser error"

    .line 186
    invoke-static {v2, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v14, v14, 0x1

    :cond_3
    :goto_2
    move-object v3, v1

    move-object v2, v15

    move/from16 v4, v16

    goto :goto_3

    :cond_4
    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩵ۧ;->֫(Ljava/lang/String;)Ll/ܺ᩵ۧ;

    move-result-object v0

    invoke-virtual {v5, v0}, Ll/ܺ᩵ۧ;->֫(Ll/ܺ᩵ۧ;)V

    goto :goto_3

    :cond_5
    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    .line 194
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 195
    new-instance v13, Ll/֨᩵ۧ;

    .line 197
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ᩵ۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    invoke-direct {v13, v0, v9, v10, v11}, Ll/֨᩵ۧ;-><init>(Ll/ܺ᩵ۧ;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 199
    :cond_6
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_3

    :cond_7
    if-ne v0, v6, :cond_8

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    add-int/lit8 v14, v14, -0x1

    .line 208
    :cond_9
    :goto_3
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 209
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    move-object/from16 v1, p0

    goto/16 :goto_0

    .line 155
    :cond_a
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    return-object v13

    :catch_1
    move-exception v0

    .line 215
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected error when reading input."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    .line 213
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to decode source"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 0

    .line 142
    invoke-virtual {p0, p2, p3, p1}, Ll/ᩴ᩵ۧ;->֫(II[B)Ll/ܰۘۧ;

    move-result-object p1

    .line 143
    invoke-static {p1, p4, p5}, Ll/ۛۘۧ;->֫(Ll/ܰۘۧ;Ll/᩷ᩴۧ;Ll/᩻ۚ֫;)V

    return-void
.end method
