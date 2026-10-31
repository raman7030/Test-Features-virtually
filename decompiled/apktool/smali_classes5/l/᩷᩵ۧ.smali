.class public final Ll/᩷᩵ۧ;
.super Ljava/lang/Object;
.source "T8TO"

# interfaces
.implements Ll/ۢᩴۧ;


# static fields
.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ᩳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/StringBuilder;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*"

    .line 65
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷᩵ۧ;->ܿ:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\\\.*?\\}"

    .line 68
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩷᩵ۧ;->ܽ:Ljava/lang/StringBuilder;

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷᩵ۧ;->ۧ:Ljava/util/ArrayList;

    .line 89
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/᩷᩵ۧ;->֫:Ll/ᩳ֨֫;

    return-void
.end method

.method public static ֫(Ljava/util/regex/Matcher;I)J
    .locals 6

    add-int/lit8 v0, p1, 0x1

    .line 283
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 284
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v2, 0x36ee80

    mul-long v0, v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    add-int/lit8 v2, p1, 0x2

    .line 286
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/32 v4, 0xea60

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    add-int/lit8 v0, p1, 0x3

    .line 287
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    add-long/2addr v0, v2

    add-int/lit8 p1, p1, 0x4

    .line 288
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 290
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    add-long/2addr v0, p0

    :cond_1
    mul-long v0, v0, v4

    return-wide v0
.end method

.method public static ֫(Landroid/text/Spanned;Ljava/lang/String;)Ll/᩶֡֫;
    .locals 13

    .line 232
    new-instance v0, Ll/᩹֡֫;

    invoke-direct {v0}, Ll/᩹֡֫;-><init>()V

    invoke-virtual {v0, p0}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    if-nez p1, :cond_0

    .line 234
    invoke-virtual {v0}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p0

    return-object p0

    .line 238
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-string v3, "{\\an1}"

    const-string v4, "{\\an2}"

    const-string v5, "{\\an3}"

    const-string v6, "{\\an4}"

    const-string v7, "{\\an5}"

    const-string v8, "{\\an6}"

    const-string v9, "{\\an7}"

    const-string v10, "{\\an8}"

    const-string v11, "{\\an9}"

    const/4 v12, 0x0

    sparse-switch p0, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    invoke-virtual {p1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_2
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_5
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :sswitch_6
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 247
    :goto_0
    invoke-virtual {v0, v1}, Ll/᩹֡֫;->ۧ(I)V

    goto :goto_3

    .line 238
    :sswitch_7
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :sswitch_8
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 242
    :goto_1
    invoke-virtual {v0, v12}, Ll/᩹֡֫;->ۧ(I)V

    goto :goto_3

    .line 253
    :cond_1
    :goto_2
    invoke-virtual {v0, v2}, Ll/᩹֡֫;->ۧ(I)V

    .line 258
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p0

    sparse-switch p0, :sswitch_data_1

    goto :goto_6

    :sswitch_9
    invoke-virtual {p1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_4

    :sswitch_a
    invoke-virtual {p1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_4

    :sswitch_b
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 267
    :goto_4
    invoke-virtual {v0, v12}, Ll/᩹֡֫;->֫(I)V

    goto :goto_7

    .line 258
    :sswitch_c
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_6

    :sswitch_d
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_6

    :sswitch_e
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_6

    :sswitch_f
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_5

    :sswitch_10
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_5

    :sswitch_11
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 262
    :goto_5
    invoke-virtual {v0, v1}, Ll/᩹֡֫;->֫(I)V

    goto :goto_7

    .line 273
    :cond_2
    :goto_6
    invoke-virtual {v0, v2}, Ll/᩹֡֫;->֫(I)V

    .line 277
    :goto_7
    invoke-virtual {v0}, Ll/᩹֡֫;->ᩳ()I

    move-result p0

    const p1, 0x3da3d70a    # 0.08f

    if-eqz p0, :cond_5

    if-eq p0, v2, :cond_4

    if-ne p0, v1, :cond_3

    const p0, 0x3f6b851f    # 0.92f

    goto :goto_8

    .line 309
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_4
    const/high16 p0, 0x3f000000    # 0.5f

    goto :goto_8

    :cond_5
    const p0, 0x3da3d70a    # 0.08f

    .line 277
    :goto_8
    invoke-virtual {v0, p0}, Ll/᩹֡֫;->ۧ(F)V

    .line 278
    invoke-virtual {v0}, Ll/᩹֡֫;->ܽ()I

    move-result p0

    if-eqz p0, :cond_8

    if-eq p0, v2, :cond_7

    if-ne p0, v1, :cond_6

    const p1, 0x3f6b851f    # 0.92f

    goto :goto_9

    .line 309
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_7
    const/high16 p1, 0x3f000000    # 0.5f

    .line 278
    :cond_8
    :goto_9
    invoke-virtual {v0, p1, v12}, Ll/᩹֡֫;->֫(FI)V

    .line 279
    invoke-virtual {v0}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x28ddbde6 -> :sswitch_8
        -0x28ddbdc7 -> :sswitch_7
        -0x28ddbda8 -> :sswitch_6
        -0x28ddbd89 -> :sswitch_5
        -0x28ddbd6a -> :sswitch_4
        -0x28ddbd4b -> :sswitch_3
        -0x28ddbd2c -> :sswitch_2
        -0x28ddbd0d -> :sswitch_1
        -0x28ddbcee -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x28ddbde6 -> :sswitch_11
        -0x28ddbdc7 -> :sswitch_10
        -0x28ddbda8 -> :sswitch_f
        -0x28ddbd89 -> :sswitch_e
        -0x28ddbd6a -> :sswitch_d
        -0x28ddbd4b -> :sswitch_c
        -0x28ddbd2c -> :sswitch_b
        -0x28ddbd0d -> :sswitch_a
        -0x28ddbcee -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final synthetic reset()V
    .locals 0

    return-void
.end method

.method public final synthetic ֫(II[B)Ll/ܰۘۧ;
    .locals 0

    .line 0
    invoke-static {p0, p3, p2}, Ll/ܳᩴۧ;->֫(Ll/ۢᩴۧ;[BI)Ll/ܰۘۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    .line 104
    iget-wide v4, v2, Ll/᩷ᩴۧ;->ۧ:J

    add-int v6, v1, p3

    iget-object v7, v0, Ll/᩷᩵ۧ;->֫:Ll/ᩳ֨֫;

    move-object/from16 v8, p1

    invoke-virtual {v7, v6, v8}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 105
    invoke-virtual {v7, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 195
    invoke-virtual {v7}, Ll/ᩳ֨֫;->۫()Ljava/nio/charset/Charset;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 196
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    :goto_0
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v4, v8

    if-eqz v6, :cond_1

    .line 110
    iget-boolean v2, v2, Ll/᩷ᩴۧ;->֫:Z

    if-eqz v2, :cond_1

    .line 111
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 114
    :goto_1
    invoke-virtual {v7, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_d

    .line 115
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v0, v3

    goto/16 :goto_7

    .line 122
    :cond_2
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    invoke-virtual {v7, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v1, "Unexpected end"

    .line 131
    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 137
    :cond_3
    sget-object v10, Ll/᩷᩵ۧ;->ܿ:Ljava/util/regex/Pattern;

    invoke-virtual {v10, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    .line 138
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-eqz v11, :cond_c

    const/4 v6, 0x1

    .line 139
    invoke-static {v10, v6}, Ll/᩷᩵ۧ;->֫(Ljava/util/regex/Matcher;I)J

    move-result-wide v12

    const/4 v6, 0x6

    .line 140
    invoke-static {v10, v6}, Ll/᩷᩵ۧ;->֫(Ljava/util/regex/Matcher;I)J

    move-result-wide v10

    .line 147
    iget-object v6, v0, Ll/᩷᩵ۧ;->ܽ:Ljava/lang/StringBuilder;

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 148
    iget-object v14, v0, Ll/᩷᩵ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 149
    invoke-virtual {v7, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v15

    .line 150
    :goto_2
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_6

    .line 151
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v16

    if-lez v16, :cond_4

    const-string v8, "<br>"

    .line 152
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    :cond_4
    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 210
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    sget-object v15, Ll/᩷᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v15, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    const/4 v15, 0x0

    .line 212
    :goto_3
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    move-result v16

    if-eqz v16, :cond_5

    .line 213
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    .line 214
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->start()I

    move-result v16

    move-object/from16 p3, v8

    sub-int v8, v16, v15

    .line 216
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int v3, v8, v0

    move-wide/from16 v16, v12

    const-string v12, ""

    .line 217
    invoke-virtual {v9, v8, v3, v12}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v15, v0

    move-object/from16 v0, p0

    move-object/from16 v8, p3

    move-object/from16 v3, p5

    move-wide/from16 v12, v16

    goto :goto_3

    :cond_5
    move-wide/from16 v16, v12

    .line 221
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 154
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    invoke-virtual {v7, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :cond_6
    move-wide/from16 v16, v12

    .line 158
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    const/4 v3, 0x0

    .line 161
    :goto_4
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_8

    .line 162
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v8, "\\{\\\\an[1-9]\\}"

    .line 163
    invoke-virtual {v6, v8}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_8
    const/4 v6, 0x0

    :goto_5
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v4, v8

    if-eqz v3, :cond_b

    cmp-long v3, v10, v4

    if-ltz v3, :cond_9

    goto :goto_6

    :cond_9
    if-eqz v2, :cond_a

    .line 176
    new-instance v3, Ll/۬ۘۧ;

    .line 178
    invoke-static {v0, v6}, Ll/᩷᩵ۧ;->֫(Landroid/text/Spanned;Ljava/lang/String;)Ll/᩶֡֫;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    sub-long v14, v10, v16

    move-object v11, v3

    move-wide/from16 v12, v16

    move-object/from16 v16, v0

    invoke-direct/range {v11 .. v16}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    .line 176
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    move-object/from16 v0, p5

    goto :goto_7

    .line 170
    :cond_b
    :goto_6
    new-instance v3, Ll/۬ۘۧ;

    .line 172
    invoke-static {v0, v6}, Ll/᩷᩵ۧ;->֫(Landroid/text/Spanned;Ljava/lang/String;)Ll/᩶֡֫;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    sub-long v14, v10, v16

    move-object v11, v3

    move-wide/from16 v12, v16

    move-object/from16 v16, v0

    invoke-direct/range {v11 .. v16}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    move-object/from16 v0, p5

    .line 170
    invoke-interface {v0, v3}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    move-object v0, v3

    const-string v3, "Skipping invalid timing: "

    .line 142
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_7

    :catch_0
    move-object v0, v3

    const-string v3, "Skipping invalid index: "

    .line 124
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_7
    move-object v3, v0

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_d
    :goto_8
    move-object v0, v3

    if-eqz v2, :cond_e

    .line 184
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۘۧ;

    .line 185
    invoke-interface {v0, v2}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    goto :goto_9

    :cond_e
    return-void
.end method
