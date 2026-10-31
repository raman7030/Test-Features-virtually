.class public final Ll/۠᩵ۧ;
.super Ljava/lang/Object;
.source "78HI"

# interfaces
.implements Ll/ۢᩴۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:Z

.field public final ܳ:F

.field public final ܽ:I

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I

.field public final ᩻:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 7

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/۠᩵ۧ;->᩻:Ll/ᩳ֨֫;

    .line 101
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const v1, 0x3f59999a    # 0.85f

    const-string v2, "sans-serif"

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_4

    .line 102
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    const/16 v4, 0x30

    if-eq v0, v4, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    const/16 v4, 0x35

    if-ne v0, v4, :cond_4

    .line 103
    :cond_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    const/16 v0, 0x18

    .line 104
    aget-byte v0, p1, v0

    iput v0, p0, Ll/۠᩵ۧ;->ᩳ:I

    const/16 v0, 0x1a

    .line 105
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/16 v4, 0x1b

    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v0, v4

    const/16 v4, 0x1c

    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v0, v4

    const/16 v4, 0x1d

    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    or-int/2addr v0, v4

    iput v0, p0, Ll/۠᩵ۧ;->ܽ:I

    .line 110
    array-length v0, p1

    const/16 v4, 0x2b

    sub-int/2addr v0, v4

    .line 111
    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1065
    new-instance v5, Ljava/lang/String;

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v5, p1, v4, v0, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v0, "Serif"

    .line 112
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v2, "serif"

    :cond_1
    iput-object v2, p0, Ll/۠᩵ۧ;->ܿ:Ljava/lang/String;

    const/16 v0, 0x19

    .line 114
    aget-byte v0, p1, v0

    mul-int/lit8 v0, v0, 0x14

    iput v0, p0, Ll/۠᩵ۧ;->֫:I

    .line 115
    aget-byte v2, p1, v3

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    :cond_2
    iput-boolean v3, p0, Ll/۠᩵ۧ;->ۧ:Z

    if-eqz v3, :cond_3

    const/16 v1, 0xa

    .line 117
    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    const/16 v2, 0xb

    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/4 v0, 0x0

    const v1, 0x3f733333    # 0.95f

    .line 120
    invoke-static {p1, v0, v1}, Ll/ۘ֨֫;->֫(FFF)F

    move-result p1

    iput p1, p0, Ll/۠᩵ۧ;->ܳ:F

    return-void

    .line 123
    :cond_3
    iput v1, p0, Ll/۠᩵ۧ;->ܳ:F

    return-void

    .line 126
    :cond_4
    iput v3, p0, Ll/۠᩵ۧ;->ᩳ:I

    const/4 p1, -0x1

    .line 127
    iput p1, p0, Ll/۠᩵ۧ;->ܽ:I

    .line 128
    iput-object v2, p0, Ll/۠᩵ۧ;->ܿ:Ljava/lang/String;

    .line 129
    iput-boolean v3, p0, Ll/۠᩵ۧ;->ۧ:Z

    .line 130
    iput v1, p0, Ll/۠᩵ۧ;->ܳ:F

    .line 131
    iput p1, p0, Ll/۠᩵ۧ;->֫:I

    return-void
.end method

.method public static ֫(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 0

    if-eq p1, p2, :cond_0

    and-int/lit16 p2, p1, 0xff

    shl-int/lit8 p2, p2, 0x18

    ushr-int/lit8 p1, p1, 0x8

    or-int/2addr p1, p2

    .line 272
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {p2, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    or-int/lit8 p1, p5, 0x21

    invoke-virtual {p0, p2, p3, p4, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    return-void
.end method

.method public static ۧ(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 5

    if-eq p1, p2, :cond_7

    or-int/lit8 p2, p5, 0x21

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p5, :cond_0

    const/4 p5, 0x1

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz p5, :cond_3

    if-eqz v2, :cond_2

    .line 246
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_2

    .line 248
    :cond_2
    new-instance v3, Landroid/text/style/StyleSpan;

    invoke-direct {v3, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_2

    :cond_3
    if-eqz v2, :cond_4

    .line 251
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_4
    :goto_2
    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_6

    .line 255
    new-instance p1, Landroid/text/style/UnderlineSpan;

    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_6
    if-nez v1, :cond_7

    if-nez p5, :cond_7

    if-nez v2, :cond_7

    .line 258
    new-instance p1, Landroid/text/style/StyleSpan;

    invoke-direct {p1, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_7
    return-void
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
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p5

    add-int v3, v1, p3

    .line 147
    iget-object v4, v0, Ll/۠᩵ۧ;->᩻:Ll/ᩳ֨֫;

    move-object/from16 v5, p1

    invoke-virtual {v4, v3, v5}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 148
    invoke-virtual {v4, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 198
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-lt v1, v6, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 199
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    if-nez v1, :cond_1

    const-string v1, ""

    goto :goto_2

    .line 203
    :cond_1
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v7

    .line 204
    invoke-virtual {v4}, Ll/ᩳ֨֫;->۫()Ljava/nio/charset/Charset;

    move-result-object v8

    .line 205
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    sub-int/2addr v9, v7

    sub-int/2addr v1, v9

    if-eqz v8, :cond_2

    goto :goto_1

    .line 207
    :cond_2
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 206
    :goto_1
    invoke-virtual {v4, v1, v8}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    .line 150
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 151
    new-instance v1, Ll/۬ۘۧ;

    .line 153
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v13

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    .line 151
    invoke-interface {v2, v1}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    return-void

    .line 159
    :cond_3
    new-instance v7, Landroid/text/SpannableStringBuilder;

    invoke-direct {v7, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 161
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v18

    const/high16 v1, 0xff0000

    .line 160
    iget v15, v0, Ll/۠᩵ۧ;->ᩳ:I

    const/16 v16, 0x0

    const/4 v8, 0x0

    move-object v14, v7

    move/from16 v17, v8

    move/from16 v19, v1

    invoke-static/range {v14 .. v19}, Ll/۠᩵ۧ;->ۧ(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 162
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v18

    iget v15, v0, Ll/۠᩵ۧ;->ܽ:I

    const/16 v16, -0x1

    invoke-static/range {v14 .. v19}, Ll/۠᩵ۧ;->֫(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 163
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const-string v8, "sans-serif"

    .line 283
    iget-object v9, v0, Ll/۠᩵ۧ;->ܿ:Ljava/lang/String;

    if-eq v9, v8, :cond_4

    .line 284
    new-instance v8, Landroid/text/style/TypefaceSpan;

    invoke-direct {v8, v9}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    const v9, 0xff0021

    invoke-virtual {v7, v8, v5, v1, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 164
    :cond_4
    iget v1, v0, Ll/۠᩵ۧ;->ܳ:F

    .line 166
    :goto_3
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    const/16 v8, 0x8

    if-lt v5, v8, :cond_c

    .line 167
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v5

    .line 168
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    .line 169
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    const v10, 0x7374796c

    if-ne v9, v10, :cond_9

    .line 171
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v9

    if-lt v9, v6, :cond_5

    const/4 v9, 0x1

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    invoke-static {v9}, Ll/᩺֡֫;->֫(Z)V

    .line 172
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v9

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v9, :cond_b

    .line 212
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v11

    const/16 v12, 0xc

    if-lt v11, v12, :cond_6

    const/4 v11, 0x1

    goto :goto_6

    :cond_6
    const/4 v11, 0x0

    :goto_6
    invoke-static {v11}, Ll/᩺֡֫;->֫(Z)V

    .line 213
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v11

    .line 214
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v12

    .line 215
    invoke-virtual {v4, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 216
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result v15

    .line 217
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 218
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    .line 220
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v13

    const-string v14, ")."

    if-le v12, v13, :cond_7

    const-string v13, "Truncating styl end ("

    const-string v6, ") to cueText.length() ("

    .line 0
    invoke-static {v12, v13, v6}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 222
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v12

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 221
    invoke-static {v6}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 223
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    move v12, v6

    :cond_7
    if-lt v11, v12, :cond_8

    .line 226
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Ignoring styl with start ("

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ") >= end ("

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_7

    .line 229
    :cond_8
    iget v6, v0, Ll/۠᩵ۧ;->ᩳ:I

    const/4 v13, 0x0

    move-object v14, v7

    move/from16 v16, v6

    move/from16 v17, v11

    move/from16 v18, v12

    move/from16 v19, v13

    invoke-static/range {v14 .. v19}, Ll/۠᩵ۧ;->ۧ(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 230
    iget v6, v0, Ll/۠᩵ۧ;->ܽ:I

    move v15, v3

    move/from16 v16, v6

    invoke-static/range {v14 .. v19}, Ll/۠᩵ۧ;->֫(Landroid/text/SpannableStringBuilder;IIIII)V

    :goto_7
    add-int/lit8 v10, v10, 0x1

    const/4 v3, 0x1

    const/4 v6, 0x2

    goto/16 :goto_5

    :cond_9
    const v3, 0x74626f78

    if-ne v9, v3, :cond_b

    .line 176
    iget-boolean v3, v0, Ll/۠᩵ۧ;->ۧ:Z

    if-eqz v3, :cond_b

    .line 177
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    const/4 v3, 0x2

    if-lt v1, v3, :cond_a

    const/4 v1, 0x1

    goto :goto_8

    :cond_a
    const/4 v1, 0x0

    :goto_8
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 178
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    int-to-float v1, v1

    .line 179
    iget v6, v0, Ll/۠᩵ۧ;->֫:I

    int-to-float v6, v6

    div-float/2addr v1, v6

    const/4 v6, 0x0

    const v9, 0x3f733333    # 0.95f

    .line 180
    invoke-static {v1, v6, v9}, Ll/ۘ֨֫;->֫(FFF)F

    move-result v1

    goto :goto_9

    :cond_b
    const/4 v3, 0x2

    :goto_9
    add-int/2addr v5, v8

    .line 182
    invoke-virtual {v4, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v5, 0x1

    const/4 v3, 0x1

    const/4 v6, 0x2

    goto/16 :goto_3

    .line 184
    :cond_c
    new-instance v3, Ll/᩹֡֫;

    invoke-direct {v3}, Ll/᩹֡֫;-><init>()V

    .line 186
    invoke-virtual {v3, v7}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    const/4 v4, 0x0

    .line 187
    invoke-virtual {v3, v1, v4}, Ll/᩹֡֫;->֫(FI)V

    .line 188
    invoke-virtual {v3, v4}, Ll/᩹֡֫;->֫(I)V

    .line 189
    invoke-virtual {v3}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v1

    .line 190
    new-instance v9, Ll/۬ۘۧ;

    .line 192
    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v8

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    .line 190
    invoke-interface {v2, v9}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    return-void
.end method
