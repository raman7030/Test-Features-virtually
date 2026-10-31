.class public final Ll/۬ܺܺ;
.super Ll/ۛܺܺ;
.source "OBBH"


# instance fields
.field public final ᩸:Ll/ۧᩴܺ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Ll/۬ܺܺ;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 10

    .line 191
    invoke-direct {p0}, Ll/ۛܺܺ;-><init>()V

    if-eqz p1, :cond_3

    .line 196
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    .line 197
    new-instance v0, Ll/ۧᩴܺ;

    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v2, v1, 0x3

    .line 52
    new-array v2, v2, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    .line 56
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x80

    if-eqz v6, :cond_0

    if-ge v6, v7, :cond_0

    int-to-byte v6, v6

    .line 58
    aput-byte v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    const/16 v8, 0x800

    if-ge v6, v8, :cond_1

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x1f

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    .line 61
    aput-byte v8, v2, v5

    add-int/lit8 v8, v5, 0x1

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 62
    aput-byte v6, v2, v8

    add-int/lit8 v5, v5, 0x2

    goto :goto_1

    :cond_1
    shr-int/lit8 v8, v6, 0xc

    and-int/lit8 v8, v8, 0xf

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    .line 65
    aput-byte v8, v2, v5

    add-int/lit8 v8, v5, 0x1

    shr-int/lit8 v9, v6, 0x6

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v7

    int-to-byte v9, v9

    .line 66
    aput-byte v9, v2, v8

    add-int/lit8 v8, v5, 0x2

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v7

    int-to-byte v6, v6

    .line 67
    aput-byte v6, v2, v8

    add-int/lit8 v5, v5, 0x3

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 72
    :cond_2
    new-array p1, v5, [B

    .line 73
    invoke-static {v2, v3, p1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 197
    invoke-direct {v0, p1}, Ll/ۧᩴܺ;-><init>([B)V

    iput-object v0, p0, Ll/۬ܺܺ;->᩸:Ll/ۧᩴܺ;

    return-void

    .line 193
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "string == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ۧᩴܺ;)V
    .locals 12

    .line 205
    invoke-direct {p0}, Ll/ۛܺܺ;-><init>()V

    .line 210
    iput-object p1, p0, Ll/۬ܺܺ;->᩸:Ll/ۧᩴܺ;

    .line 84
    invoke-virtual {p1}, Ll/ۧᩴܺ;->֫()I

    move-result v0

    .line 85
    new-array v1, v0, [C

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-lez v0, :cond_9

    .line 89
    invoke-virtual {p1, v4}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v5

    shr-int/lit8 v6, v5, 0x4

    const/4 v7, 0x0

    const/16 v8, 0x80

    packed-switch v6, :pswitch_data_0

    .line 162
    :pswitch_0
    invoke-static {v5, v4}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    :pswitch_1
    add-int/lit8 v0, v0, -0x3

    if-ltz v0, :cond_3

    add-int/lit8 v6, v4, 0x1

    .line 139
    invoke-virtual {p1, v6}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v9

    and-int/lit16 v10, v9, 0xc0

    if-ne v10, v8, :cond_2

    add-int/lit8 v6, v4, 0x2

    .line 143
    invoke-virtual {p1, v6}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v11

    if-ne v10, v8, :cond_1

    and-int/lit8 v5, v5, 0xf

    shl-int/lit8 v5, v5, 0xc

    and-int/lit8 v8, v9, 0x3f

    shl-int/lit8 v8, v8, 0x6

    or-int/2addr v5, v8

    and-int/lit8 v8, v11, 0x3f

    or-int/2addr v5, v8

    const/16 v8, 0x800

    if-lt v5, v8, :cond_0

    int-to-char v5, v5

    add-int/lit8 v4, v4, 0x3

    goto :goto_2

    .line 154
    :cond_0
    invoke-static {v11, v6}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    .line 145
    :cond_1
    invoke-static {v11, v6}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    .line 141
    :cond_2
    invoke-static {v9, v6}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    .line 137
    :cond_3
    invoke-static {v5, v4}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    :pswitch_2
    add-int/lit8 v0, v0, -0x2

    if-ltz v0, :cond_7

    add-int/lit8 v6, v4, 0x1

    .line 117
    invoke-virtual {p1, v6}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v9

    and-int/lit16 v10, v9, 0xc0

    if-ne v10, v8, :cond_6

    and-int/lit8 v5, v5, 0x1f

    shl-int/lit8 v5, v5, 0x6

    and-int/lit8 v10, v9, 0x3f

    or-int/2addr v5, v10

    if-eqz v5, :cond_5

    if-lt v5, v8, :cond_4

    goto :goto_1

    .line 127
    :cond_4
    invoke-static {v9, v6}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    :cond_5
    :goto_1
    int-to-char v5, v5

    add-int/lit8 v4, v4, 0x2

    goto :goto_2

    .line 119
    :cond_6
    invoke-static {v9, v6}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    .line 115
    :cond_7
    invoke-static {v5, v4}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    :pswitch_3
    add-int/lit8 v0, v0, -0x1

    if-eqz v5, :cond_8

    int-to-char v5, v5

    add-int/lit8 v4, v4, 0x1

    .line 165
    :goto_2
    aput-char v5, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 104
    :cond_8
    invoke-static {v5, v4}, Ll/۬ܺܺ;->ۧ(II)V

    throw v7

    .line 169
    :cond_9
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 211
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ۧ(II)V
    .locals 3

    .line 182
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bad utf-8 byte "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " at offset "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 219
    instance-of v0, p1, Ll/۬ܺܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 223
    :cond_0
    check-cast p1, Ll/۬ܺܺ;

    iget-object p1, p1, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    iget-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getString()Ljava/lang/String;
    .locals 1

    .line 370
    iget-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 406
    sget-object v0, Ll/۟ܺܺ;->۫֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 231
    iget-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "string{\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 389
    iget-object v0, p0, Ll/۬ܺܺ;->᩸:Ll/ۧᩴܺ;

    invoke-virtual {v0}, Ll/ۧᩴܺ;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 9

    .line 271
    iget-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 272
    new-instance v2, Ljava/lang/StringBuilder;

    mul-int/lit8 v3, v1, 0x3

    div-int/lit8 v3, v3, 0x2

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_d

    .line 275
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x20

    const/16 v6, 0x7f

    const/16 v7, 0x5c

    if-lt v4, v5, :cond_2

    if-ge v4, v6, :cond_2

    const/16 v5, 0x27

    if-eq v4, v5, :cond_0

    const/16 v5, 0x22

    if-eq v4, v5, :cond_0

    if-ne v4, v7, :cond_1

    .line 278
    :cond_0
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 280
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :cond_2
    if-gt v4, v6, :cond_b

    const/16 v5, 0x9

    if-eq v4, v5, :cond_a

    const/16 v5, 0xa

    if-eq v4, v5, :cond_9

    const/16 v5, 0xd

    if-eq v4, v5, :cond_8

    add-int/lit8 v5, v1, -0x1

    if-ge v3, v5, :cond_3

    add-int/lit8 v5, v3, 0x1

    .line 300
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    const/16 v6, 0x30

    if-lt v5, v6, :cond_4

    const/16 v8, 0x37

    if-gt v5, v8, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    .line 303
    :goto_2
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v7, 0x6

    :goto_3
    if-ltz v7, :cond_7

    shr-int v8, v4, v7

    and-int/lit8 v8, v8, 0x7

    add-int/2addr v8, v6

    int-to-char v8, v8

    if-ne v8, v6, :cond_5

    if-eqz v5, :cond_6

    .line 307
    :cond_5
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v5, 0x1

    :cond_6
    add-int/lit8 v7, v7, -0x3

    goto :goto_3

    :cond_7
    if-nez v5, :cond_c

    .line 313
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_8
    const-string v4, "\\r"

    .line 287
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_9
    const-string v4, "\\n"

    .line 284
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_a
    const-string v4, "\\t"

    .line 290
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_b
    const-string v5, "\\u"

    .line 319
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 v5, v4, 0xc

    const/16 v6, 0x10

    .line 320
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v5, v4, 0x8

    and-int/lit8 v5, v5, 0xf

    .line 321
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v5, v4, 0x4

    and-int/lit8 v5, v5, 0xf

    .line 322
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v4, v4, 0xf

    .line 323
    invoke-static {v4, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_c
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 327
    :cond_d
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 2

    .line 337
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 1

    .line 239
    check-cast p1, Ll/۬ܺܺ;

    iget-object p1, p1, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    iget-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/ۧᩴܺ;
    .locals 1

    .line 379
    iget-object v0, p0, Ll/۬ܺܺ;->᩸:Ll/ۧᩴܺ;

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 401
    iget-object v0, p0, Ll/۬ܺܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "utf8"

    return-object v0
.end method
