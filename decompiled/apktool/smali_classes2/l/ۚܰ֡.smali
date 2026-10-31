.class public final Ll/ۚܰ֡;
.super Ljava/lang/Object;
.source "U4WH"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 75
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚܰ֡;->֫:[B

    return-void

    :array_0
    .array-data 1
        0x64t
        0x65t
        0x78t
        0xat
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static ֫(Ll/ۘۨ֡;)I
    .locals 2

    .line 215
    invoke-static {p0}, Ll/ۚܰ֡;->ۧ(Ll/ۘۨ֡;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 v0, 0x4

    .line 223
    invoke-virtual {p0, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v0

    add-int/lit8 v0, v0, -0x30

    mul-int/lit8 v0, v0, 0x64

    const/4 v1, 0x5

    .line 224
    invoke-virtual {p0, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    add-int/lit8 v1, v1, -0x30

    mul-int/lit8 v1, v1, 0xa

    add-int/2addr v1, v0

    const/4 v0, 0x6

    .line 225
    invoke-virtual {p0, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result p0

    add-int/lit8 p0, p0, -0x30

    add-int/2addr p0, v1

    return p0
.end method

.method public static ֫(I)[B
    .locals 3

    const/16 v0, 0x17

    if-gt p0, v0, :cond_0

    const/16 p0, 0x23

    goto :goto_0

    :cond_0
    packed-switch p0, :pswitch_data_0

    const/4 p0, -0x1

    goto :goto_0

    :pswitch_0
    const/16 p0, 0x29

    goto :goto_0

    :pswitch_1
    const/16 p0, 0x28

    goto :goto_0

    :pswitch_2
    const/16 p0, 0x27

    goto :goto_0

    :pswitch_3
    const/16 p0, 0x26

    goto :goto_0

    :pswitch_4
    const/16 p0, 0x25

    .line 166
    :goto_0
    sget-object v0, Ll/ۚܰ֡;->֫:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-ltz p0, :cond_2

    const/4 v1, 0x6

    :goto_1
    const/4 v2, 0x4

    if-lt v1, v2, :cond_1

    .line 173
    rem-int/lit8 v2, p0, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-byte v2, v2

    .line 174
    aput-byte v2, v0, v1

    .line 175
    div-int/lit8 p0, p0, 0xa

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    return-object v0

    .line 169
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "dexVersion must be within [0, 999]"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ(Ll/ۘۨ֡;)Z
    .locals 5

    .line 187
    invoke-virtual {p0}, Ll/ۘۨ֡;->length()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    .line 191
    :goto_0
    sget-object v1, Ll/ۚܰ֡;->֫:[B

    const/4 v3, 0x4

    if-ge v0, v3, :cond_2

    .line 192
    invoke-virtual {p0, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    aget-byte v1, v1, v0

    if-eq v3, v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, 0x7

    if-ge v3, v0, :cond_5

    .line 197
    invoke-virtual {p0, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v0

    const/16 v4, 0x30

    if-lt v0, v4, :cond_4

    .line 198
    invoke-virtual {p0, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v0

    const/16 v4, 0x39

    if-le v0, v4, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return v2

    .line 202
    :cond_5
    invoke-virtual {p0, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result p0

    aget-byte v0, v1, v0

    if-eq p0, v0, :cond_6

    return v2

    :cond_6
    const/4 p0, 0x1

    return p0
.end method
