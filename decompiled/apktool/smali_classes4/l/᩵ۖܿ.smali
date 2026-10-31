.class public final Ll/᩵ۖܿ;
.super Ljava/lang/Object;
.source "U6NV"


# direct methods
.method public static ֫(ILjava/lang/String;)I
    .locals 2

    .line 81
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x39

    if-gt v0, v1, :cond_0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 8

    const-string v0, "//"

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    :goto_0
    if-ltz v1, :cond_11

    add-int/lit8 v2, v1, -0x1

    :goto_1
    if-ltz v2, :cond_1

    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_0

    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_1
    if-ltz v2, :cond_2

    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/᩵ۖܿ;->֫(C)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_8

    :cond_2
    add-int/lit8 v2, v1, 0x2

    .line 22
    invoke-static {v2, p0}, Ll/᩵ۖܿ;->ۧ(ILjava/lang/String;)I

    move-result v2

    const-string v3, "require"

    .line 23
    invoke-static {v2, p0, v3}, Ll/᩵ۖܿ;->֫(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_8

    :cond_3
    add-int/lit8 v2, v2, 0x7

    .line 27
    invoke-static {v2, p0}, Ll/᩵ۖܿ;->ۧ(ILjava/lang/String;)I

    move-result v3

    if-eq v3, v2, :cond_10

    const-string v2, "mt"

    .line 28
    invoke-static {v3, p0, v2}, Ll/᩵ۖܿ;->֫(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_8

    :cond_4
    add-int/lit8 v3, v3, 0x2

    .line 31
    invoke-static {v3, p0}, Ll/᩵ۖܿ;->ۧ(ILjava/lang/String;)I

    move-result v2

    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v2, v3, :cond_10

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3e

    if-eq v3, v4, :cond_5

    goto/16 :goto_8

    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-ge v3, v4, :cond_6

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x3d

    if-ne v4, v6, :cond_6

    const/4 v4, 0x1

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_7

    add-int/lit8 v3, v2, 0x2

    .line 40
    :cond_7
    invoke-static {v3, p0}, Ll/᩵ۖܿ;->ۧ(ILjava/lang/String;)I

    move-result v2

    .line 41
    invoke-static {v2, p0}, Ll/᩵ۖܿ;->ᩳ(ILjava/lang/String;)I

    move-result v3

    if-gez v3, :cond_8

    goto/16 :goto_8

    .line 45
    :cond_8
    invoke-static {v3, p0}, Ll/᩵ۖܿ;->ۧ(ILjava/lang/String;)I

    move-result v6

    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_9

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/᩵ۖܿ;->֫(C)Z

    move-result v6

    if-nez v6, :cond_9

    goto/16 :goto_8

    .line 49
    :cond_9
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_a

    const/4 v5, 0x1

    :cond_a
    if-eqz v5, :cond_b

    const v0, 0x18e4545

    goto :goto_3

    :cond_b
    const-string v0, "2.26.10"

    .line 51
    invoke-static {v0}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;)I

    move-result v0

    :goto_3
    if-eqz v5, :cond_c

    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_4

    :cond_c
    invoke-static {p0}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;)I

    move-result v1

    :goto_4
    if-eqz v4, :cond_d

    if-ge v0, v1, :cond_11

    goto :goto_5

    :cond_d
    if-gt v0, v1, :cond_11

    .line 54
    :goto_5
    new-instance v0, Ll/ۡ᩷ܿ;

    if-eqz v5, :cond_e

    const-string v1, "VersionCode"

    goto :goto_6

    :cond_e
    const-string v1, "VersionName"

    :goto_6
    if-eqz v4, :cond_f

    const-string v2, ">="

    goto :goto_7

    :cond_f
    const-string v2, ">"

    .line 9
    :goto_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f1204b6

    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n(Require "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 55
    throw v0

    :cond_10
    :goto_8
    add-int/lit8 v1, v1, 0x2

    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    goto/16 :goto_0

    :cond_11
    return-void
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0x85

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2028

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2029

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 99
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 102
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    add-int v1, p0, v0

    .line 103
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x41

    if-lt v1, v3, :cond_1

    const/16 v3, 0x5a

    if-gt v1, v3, :cond_1

    add-int/lit8 v1, v1, 0x20

    int-to-char v1, v1

    .line 107
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_2

    :goto_1
    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/16 v0, 0x2e

    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const v3, 0x18e4545

    goto :goto_1

    :cond_1
    const-string v3, "2.26.10"

    .line 157
    invoke-static {v3}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;)I

    move-result v3

    :goto_1
    if-eqz v0, :cond_2

    .line 158
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_2

    :cond_2
    invoke-static {p1}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;)I

    move-result p1

    .line 159
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v0, ">="

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v4, 0x5

    goto :goto_3

    :sswitch_1
    const-string v0, "=="

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    const/4 v4, 0x4

    goto :goto_3

    :sswitch_2
    const-string v0, "<="

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x3

    goto :goto_3

    :sswitch_3
    const-string v0, "!="

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    const/4 v4, 0x2

    goto :goto_3

    :sswitch_4
    const-string v0, ">"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v4, 0x1

    goto :goto_3

    :sswitch_5
    const-string v0, "<"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    const/4 v4, 0x0

    :goto_3
    packed-switch v4, :pswitch_data_0

    .line 173
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unknown operator: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    if-lt v3, p1, :cond_9

    goto :goto_4

    :pswitch_1
    if-ne v3, p1, :cond_9

    goto :goto_4

    :pswitch_2
    if-gt v3, p1, :cond_9

    goto :goto_4

    :pswitch_3
    if-eq v3, p1, :cond_9

    goto :goto_4

    :pswitch_4
    if-le v3, p1, :cond_9

    goto :goto_4

    :pswitch_5
    if-ge v3, p1, :cond_9

    :goto_4
    return v2

    :cond_9
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x3c -> :sswitch_5
        0x3e -> :sswitch_4
        0x43c -> :sswitch_3
        0x781 -> :sswitch_2
        0x7a0 -> :sswitch_1
        0x7bf -> :sswitch_0
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

.method public static ۧ(ILjava/lang/String;)I
    .locals 2

    .line 88
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_2

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    return p0

    :cond_1
    :goto_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    return p0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 5

    const/16 v0, 0x2e

    .line 180
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    .line 181
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/16 v3, 0x2d

    .line 182
    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_0

    .line 184
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    :cond_0
    const/4 v4, 0x0

    .line 186
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const v4, 0xf4240

    mul-int v1, v1, v4

    .line 187
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    add-int/2addr v2, v1

    add-int/lit8 v0, v0, 0x1

    .line 188
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    add-int/2addr p0, v2

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/16 v0, 0x23

    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    :goto_0
    if-ltz v1, :cond_5

    add-int/lit8 v2, v1, -0x1

    :goto_1
    if-ltz v2, :cond_3

    .line 135
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 136
    invoke-static {v3}, Ll/᩵ۖܿ;->֫(C)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_4

    :cond_0
    const/16 v4, 0x20

    if-eq v3, v4, :cond_2

    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    goto :goto_2

    :cond_1
    const/16 v4, 0xb

    if-eq v3, v4, :cond_2

    const/16 v4, 0xc

    if-eq v3, v4, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_3
    :goto_3
    if-gez v2, :cond_4

    .line 155
    :goto_4
    new-instance v0, Ll/֡᩷ܿ;

    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p0, v1}, Ll/֡᩷ܿ;-><init>(Ljava/lang/String;Ll/᩶۫᩷;)V

    .line 175
    invoke-virtual {v0, p1}, Ll/֡᩷ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 132
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    goto :goto_0

    :cond_5
    return-object p1
.end method

.method public static ܽ(ILjava/lang/String;)I
    .locals 2

    .line 120
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_1

    .line 121
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    const/16 v1, 0xd

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static ᩳ(ILjava/lang/String;)I
    .locals 5

    .line 63
    invoke-static {p0, p1}, Ll/᩵ۖܿ;->֫(ILjava/lang/String;)I

    move-result v0

    sub-int p0, v0, p0

    const/16 v1, 0x8

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne p0, v2, :cond_3

    .line 67
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    if-eq v0, p0, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v3, 0x2e

    if-eq p0, v3, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v0, v2

    .line 71
    invoke-static {v0, p1}, Ll/᩵ۖܿ;->֫(ILjava/lang/String;)I

    move-result p0

    sub-int v0, p0, v0

    if-lt v0, v2, :cond_3

    const/4 v4, 0x3

    if-gt v0, v4, :cond_3

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eq p0, v0, :cond_3

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr p0, v2

    .line 76
    invoke-static {p0, p1}, Ll/᩵ۖܿ;->֫(ILjava/lang/String;)I

    move-result p1

    sub-int p0, p1, p0

    if-lt p0, v2, :cond_3

    if-gt p0, v4, :cond_3

    return p1

    :cond_3
    :goto_0
    return v1
.end method
