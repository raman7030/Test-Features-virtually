.class public final Ll/ܰ᩵ۚ;
.super Ljava/lang/Object;
.source "74MB"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 120
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 121
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v0, v2}, Ll/ܰ᩵ۚ;->֫(Ljava/lang/StringBuilder;C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/Writer;C)V
    .locals 2

    const/16 v0, 0x20

    const/16 v1, 0x7f

    if-lt p1, v0, :cond_2

    if-ge p1, v1, :cond_2

    const/16 v0, 0x27

    const/16 v1, 0x5c

    if-eq p1, v0, :cond_0

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    if-ne p1, v1, :cond_1

    .line 78
    :cond_0
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 80
    :cond_1
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    return-void

    :cond_2
    if-gt p1, v1, :cond_3

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    const-string p1, "\\r"

    .line 94
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_2
    const-string p1, "\\f"

    .line 91
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_3
    const-string p1, "\\n"

    .line 85
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_4
    const-string p1, "\\t"

    .line 97
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_5
    const-string p1, "\\b"

    .line 88
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 101
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/ܰ᩵ۚ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 102
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    return-void

    :cond_4
    const-string v0, "\\u"

    .line 104
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    shr-int/lit8 v0, p1, 0xc

    const/16 v1, 0x10

    .line 105
    invoke-static {v0, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/lit8 v0, v0, 0xf

    .line 106
    invoke-static {v0, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    .line 107
    invoke-static {v0, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    and-int/lit8 p1, p1, 0xf

    .line 108
    invoke-static {p1, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 113
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {p0, v1}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;C)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;C)V
    .locals 2

    const/16 v0, 0x20

    const/16 v1, 0x7f

    if-lt p1, v0, :cond_2

    if-ge p1, v1, :cond_2

    const/16 v0, 0x27

    const/16 v1, 0x5c

    if-eq p1, v0, :cond_0

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    if-ne p1, v1, :cond_1

    .line 41
    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    if-gt p1, v1, :cond_3

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    const-string p1, "\\r"

    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_2
    const-string p1, "\\f"

    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_3
    const-string p1, "\\n"

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_4
    const-string p1, "\\t"

    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_5
    const-string p1, "\\b"

    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 64
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/ܰ᩵ۚ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_4
    const-string v0, "\\u"

    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 v0, p1, 0xc

    const/16 v1, 0x10

    .line 68
    invoke-static {v0, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v0, p1, 0x8

    and-int/lit8 v0, v0, 0xf

    .line 69
    invoke-static {v0, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    .line 70
    invoke-static {v0, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 p1, p1, 0xf

    .line 71
    invoke-static {p1, v1}, Ljava/lang/Character;->forDigit(II)C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(C)Z
    .locals 3

    const/16 v0, 0x20

    const/4 v1, 0x0

    if-ge p0, v0, :cond_0

    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x7f

    if-lt p0, v0, :cond_1

    const/16 v2, 0xa0

    if-le p0, v2, :cond_9

    :cond_1
    const/16 v2, 0xad

    if-eq p0, v2, :cond_9

    const v2, 0xfeff

    if-ne p0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/16 v2, 0x2000

    if-lt p0, v2, :cond_3

    const/16 v2, 0x200f

    if-gt p0, v2, :cond_3

    return v1

    :cond_3
    const/16 v2, 0x2028

    if-lt p0, v2, :cond_4

    const/16 v2, 0x202f

    if-gt p0, v2, :cond_4

    return v1

    :cond_4
    const/16 v2, 0x205f

    if-lt p0, v2, :cond_5

    const/16 v2, 0x206f

    if-gt p0, v2, :cond_5

    return v1

    :cond_5
    const/4 v2, 0x1

    if-le p0, v0, :cond_8

    .line 138
    invoke-static {p0}, Ljava/lang/Character;->isValidCodePoint(I)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    .line 141
    :cond_6
    invoke-static {p0}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object p0

    .line 142
    sget-object v0, Ljava/lang/Character$UnicodeBlock;->PRIVATE_USE_AREA:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->SPECIALS:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->SUPPLEMENTARY_PRIVATE_USE_AREA_A:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->SUPPLEMENTARY_PRIVATE_USE_AREA_B:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->LOW_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->HIGH_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->HIGH_PRIVATE_USE_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    if-eq p0, v0, :cond_7

    return v2

    :cond_7
    return v1

    :cond_8
    return v2

    :cond_9
    :goto_0
    return v1
.end method
