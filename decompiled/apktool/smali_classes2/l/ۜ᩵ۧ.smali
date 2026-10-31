.class public final Ll/ۜ᩵ۧ;
.super Ljava/lang/Object;
.source "C8PP"


# instance fields
.field public final ֫:I

.field public final ۜ:Ljava/lang/Integer;

.field public final ۢ:Z

.field public final ۧ:Z

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:I

.field public final ܿ:Z

.field public final ᩳ:F

.field public final ᩷:Z

.field public final ᩻:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    iput-object p1, p0, Ll/ۜ᩵ۧ;->ܳ:Ljava/lang/String;

    .line 144
    iput p2, p0, Ll/ۜ᩵ۧ;->֫:I

    .line 145
    iput-object p3, p0, Ll/ۜ᩵ۧ;->ۜ:Ljava/lang/Integer;

    .line 146
    iput-object p4, p0, Ll/ۜ᩵ۧ;->᩻:Ljava/lang/Integer;

    .line 147
    iput p5, p0, Ll/ۜ᩵ۧ;->ᩳ:F

    .line 148
    iput-boolean p6, p0, Ll/ۜ᩵ۧ;->ۧ:Z

    .line 149
    iput-boolean p7, p0, Ll/ۜ᩵ۧ;->ܿ:Z

    .line 150
    iput-boolean p8, p0, Ll/ۜ᩵ۧ;->ۢ:Z

    .line 151
    iput-boolean p9, p0, Ll/ۜ᩵ۧ;->᩷:Z

    .line 152
    iput p10, p0, Ll/ۜ᩵ۧ;->ܽ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۜ᩵ۧ;->ۧ(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ll/ܳ᩵ۧ;)Ll/ۜ᩵ۧ;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "Style:"

    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const/4 v0, 0x6

    .line 158
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, ","

    invoke-static {v0, v3}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 159
    array-length v0, v3

    iget v4, v2, Ll/ܳ᩵ۧ;->ܳ:I

    const-string v5, "\'"

    const/4 v6, 0x0

    if-eq v0, v4, :cond_0

    .line 164
    array-length v0, v3

    .line 162
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, " values, found "

    const-string v3, "): \'"

    const-string v7, "Skipping malformed \'Style:\' line (expected "

    .line 0
    invoke-static {v7, v4, v2, v3, v0}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v6

    .line 168
    :cond_0
    :try_start_0
    new-instance v4, Ll/ۜ᩵ۧ;

    iget v0, v2, Ll/ܳ᩵ۧ;->᩻:I

    aget-object v0, v3, v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 170
    iget v0, v2, Ll/ܳ᩵ۧ;->֫:I

    const/4 v7, -0x1

    if-eq v0, v7, :cond_1

    .line 171
    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۧ;->ۧ(Ljava/lang/String;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    const/4 v9, -0x1

    .line 173
    :goto_0
    iget v0, v2, Ll/ܳ᩵ۧ;->᩷:I

    if-eq v0, v7, :cond_2

    .line 174
    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۧ;->ᩳ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object v10, v0

    goto :goto_1

    :cond_2
    move-object v10, v6

    .line 176
    :goto_1
    iget v0, v2, Ll/ܳ᩵ۧ;->ۜ:I

    if-eq v0, v7, :cond_3

    .line 177
    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۧ;->ᩳ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object v11, v0

    goto :goto_2

    :cond_3
    move-object v11, v6

    .line 179
    :goto_2
    iget v0, v2, Ll/ܳ᩵ۧ;->ᩳ:I

    const v12, -0x800001

    if-eq v0, v7, :cond_4

    .line 180
    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 294
    :try_start_1
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    move v12, v0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v14, v0

    .line 296
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v15, "Failed to parse font size: \'"

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v14}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    :cond_4
    :goto_3
    iget v0, v2, Ll/ܳ᩵ۧ;->ۧ:I

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v0, v7, :cond_5

    aget-object v0, v3, v0

    .line 183
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۧ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    const/4 v13, 0x1

    :cond_5
    iget v0, v2, Ll/ܳ᩵ۧ;->ܿ:I

    if-eq v0, v7, :cond_6

    aget-object v0, v3, v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۧ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    iget v15, v2, Ll/ܳ᩵ۧ;->ۡ:I

    if-eq v15, v7, :cond_7

    aget-object v15, v3, v15

    .line 187
    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ll/ۜ᩵ۧ;->ܽ(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_7

    const/4 v15, 0x1

    goto :goto_5

    :cond_7
    const/4 v15, 0x0

    :goto_5
    iget v6, v2, Ll/ܳ᩵ۧ;->ۢ:I

    if-eq v6, v7, :cond_8

    aget-object v6, v3, v6

    .line 189
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۜ᩵ۧ;->ܽ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, 0x1

    const/16 v16, 0x1

    goto :goto_6

    :cond_8
    const/4 v6, 0x0

    const/16 v16, 0x0

    .line 190
    :goto_6
    iget v2, v2, Ll/ܳ᩵ۧ;->ܽ:I

    if-eq v2, v7, :cond_a

    .line 191
    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 232
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    if-eq v3, v14, :cond_9

    const/4 v6, 0x3

    if-eq v3, v6, :cond_9

    goto :goto_7

    :cond_9
    move v7, v3

    goto :goto_8

    .line 239
    :catch_1
    :goto_7
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Ignoring unknown BorderStyle: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_8
    move/from16 v17, v7

    goto :goto_9

    :cond_a
    const/4 v2, -0x1

    const/16 v17, -0x1

    :goto_9
    move-object v7, v4

    move v14, v0

    .line 192
    invoke-direct/range {v7 .. v17}, Ll/ۜ᩵ۧ;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    return-object v4

    :catch_2
    move-exception v0

    .line 194
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Skipping malformed \'Style:\' line: \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 1

    .line 201
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    return v0

    :catch_0
    :goto_0
    const-string v0, "Ignoring unknown alignment: "

    .line 0
    invoke-static {v0, p0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    .line 303
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v2, -0x1

    if-ne p0, v2, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    return v1

    :catch_0
    move-exception v1

    .line 306
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse boolean value: \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 8

    :try_start_0
    const-string v0, "&H"

    .line 273
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 275
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v2

    goto :goto_0

    .line 277
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    :goto_0
    const-wide v4, 0xffffffffL

    cmp-long v0, v2, v4

    if-gtz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 279
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 p0, 0x18

    shr-long v4, v2, p0

    const-wide/16 v6, 0xff

    and-long/2addr v4, v6

    xor-long/2addr v4, v6

    .line 285
    invoke-static {v4, v5}, Ll/۬᩺ܺ;->֫(J)I

    move-result p0

    shr-long v0, v2, v1

    and-long/2addr v0, v6

    .line 286
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->֫(J)I

    move-result v0

    const/16 v1, 0x8

    shr-long v4, v2, v1

    and-long/2addr v4, v6

    .line 287
    invoke-static {v4, v5}, Ll/۬᩺ܺ;->֫(J)I

    move-result v1

    and-long/2addr v2, v6

    .line 288
    invoke-static {v2, v3}, Ll/۬᩺ܺ;->֫(J)I

    move-result v2

    .line 289
    invoke-static {p0, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception v0

    .line 281
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse color expression: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method
