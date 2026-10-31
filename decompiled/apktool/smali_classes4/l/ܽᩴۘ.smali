.class public final Ll/ܽᩴۘ;
.super Ljava/lang/Object;
.source "Q8E3"


# instance fields
.field public ֫:Ll/֡᩵ۘ;

.field public ۧ:[I

.field public ܽ:[I


# direct methods
.method public constructor <init>(Ll/֡᩵ۘ;)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 25
    iput-object v1, p0, Ll/ܽᩴۘ;->ۧ:[I

    new-array v0, v0, [I

    .line 26
    iput-object v0, p0, Ll/ܽᩴۘ;->ܽ:[I

    .line 46
    iput-object p1, p0, Ll/ܽᩴۘ;->֫:Ll/֡᩵ۘ;

    return-void
.end method

.method private ֫(I)V
    .locals 6

    .line 126
    iget-object v0, p0, Ll/ܽᩴۘ;->ۧ:[I

    aget v0, v0, p1

    and-int/lit16 v1, v0, 0x4000

    .line 127
    iget-object v2, p0, Ll/ܽᩴۘ;->ܽ:[I

    if-nez v1, :cond_1

    .line 128
    aget v1, v2, p1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    shr-int/lit8 v0, v1, 0x7

    and-int/lit8 v1, v1, 0x7f

    int-to-double v2, v0

    int-to-double v0, v1

    const-wide v4, 0x3f847ae147ae147bL    # 0.01

    mul-double v0, v0, v4

    add-double/2addr v0, v2

    .line 78
    iget-object v2, p0, Ll/ܽᩴۘ;->֫:Ll/֡᩵ۘ;

    invoke-virtual {v2, p1, v0, v1}, Ll/֡᩵ۘ;->֫(ID)V

    return-void

    .line 130
    :cond_1
    aget p1, v2, p1

    return-void
.end method

.method public static ֫(II)V
    .locals 4

    if-lt p1, p0, :cond_0

    return-void

    .line 136
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " bytes but got "

    const-string v2, " bytes."

    const-string v3, "Expected message of at least "

    .line 0
    invoke-static {v3, p0, v1, v2, p1}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 136
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 10

    const/4 v0, 0x1

    .line 35
    invoke-static {v0, p2}, Ll/ܽᩴۘ;->֫(II)V

    .line 36
    aget-byte v1, p3, p1

    and-int/lit16 v2, v1, 0xf0

    and-int/lit8 v1, v1, 0xf

    const/16 v3, 0x80

    .line 40
    iget-object v4, p0, Ll/ܽᩴۘ;->֫:Ll/֡᩵ۘ;

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eq v2, v3, :cond_d

    const/16 v3, 0x90

    if-eq v2, v3, :cond_b

    const/16 v3, 0xa0

    if-eq v2, v3, :cond_a

    const/16 v3, 0xb0

    const-wide v7, 0x3f80204081020408L    # 0.007874015748031496

    const/4 v9, 0x7

    if-eq v2, v3, :cond_3

    const/16 v3, 0xc0

    if-eq v2, v3, :cond_2

    const/16 v3, 0xd0

    if-eq v2, v3, :cond_1

    const/16 v3, 0xe0

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {v5, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/lit8 p2, p1, 0x2

    .line 78
    aget-byte p2, p3, p2

    shl-int/2addr p2, v9

    add-int/2addr p1, v0

    aget-byte p1, p3, p1

    add-int/2addr p2, p1

    add-int/lit16 p2, p2, -0x2000

    int-to-double p1, p2

    const-wide/high16 v2, 0x3f20000000000000L    # 1.220703125E-4

    mul-double p1, p1, v2

    .line 110
    invoke-virtual {v4, v1, p1, p2}, Ll/֡᩵ۘ;->ܽ(ID)V

    return-void

    .line 62
    :cond_1
    invoke-static {v6, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/2addr p1, v0

    .line 63
    aget-byte p1, p3, p1

    int-to-double p1, p1

    mul-double p1, p1, v7

    .line 93
    invoke-virtual {v4, v1, p1, p2}, Ll/֡᩵ۘ;->ᩳ(ID)V

    return-void

    .line 72
    :cond_2
    invoke-static {v6, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/2addr p1, v0

    .line 73
    aget-byte p1, p3, p1

    .line 87
    invoke-virtual {v4, v1, p1}, Ll/֡᩵ۘ;->֫(II)V

    return-void

    .line 67
    :cond_3
    invoke-static {v5, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/lit8 p2, p1, 0x1

    .line 68
    aget-byte p2, p3, p2

    add-int/2addr p1, v6

    aget-byte p1, p3, p1

    const/4 p3, 0x6

    .line 90
    iget-object v2, p0, Ll/ܽᩴۘ;->ܽ:[I

    if-eq p2, p3, :cond_9

    const/16 p3, 0x26

    if-eq p2, p3, :cond_8

    iget-object p3, p0, Ll/ܽᩴۘ;->ۧ:[I

    packed-switch p2, :pswitch_data_0

    int-to-double v2, p1

    mul-double v2, v2, v7

    if-eq p2, v0, :cond_7

    if-eq p2, v9, :cond_6

    const/16 p1, 0xa

    if-eq p2, p1, :cond_5

    const/16 p1, 0x4a

    if-eq p2, p1, :cond_4

    goto :goto_0

    :pswitch_0
    shl-int/2addr p1, v9

    .line 115
    aput p1, p3, v1

    return-void

    .line 110
    :pswitch_1
    aget p2, p3, v1

    and-int/lit8 p2, p2, -0x80

    or-int/2addr p1, p2

    .line 112
    aput p1, p3, v1

    return-void

    :pswitch_2
    shl-int/2addr p1, v9

    or-int/lit16 p1, p1, 0x4000

    .line 107
    aput p1, p3, v1

    return-void

    .line 102
    :pswitch_3
    aget p2, p3, v1

    and-int/lit8 p2, p2, -0x80

    or-int/lit16 p1, p1, 0x4000

    or-int/2addr p1, p2

    .line 104
    aput p1, p3, v1

    :goto_0
    return-void

    .line 59
    :cond_4
    invoke-virtual {v4, v1, v2, v3}, Ll/֡᩵ۘ;->ܿ(ID)V

    return-void

    :cond_5
    const-wide/high16 p1, 0x4000000000000000L    # 2.0

    mul-double v2, v2, p1

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v2, p1

    .line 66
    invoke-virtual {v4, v1, v2, v3}, Ll/֡᩵ۘ;->ۧ(ID)V

    return-void

    .line 62
    :cond_6
    invoke-virtual {v4, v1, v2, v3}, Ll/֡᩵ۘ;->᩻(ID)V

    return-void

    :cond_7
    const-wide p1, 0x3fb999999999999aL    # 0.1

    mul-double v2, v2, p1

    .line 56
    invoke-virtual {v4, v1, v2, v3}, Ll/֡᩵ۘ;->ܳ(ID)V

    return-void

    .line 96
    :cond_8
    aget p2, v2, v1

    and-int/lit8 p2, p2, -0x80

    or-int/2addr p1, p2

    .line 98
    aput p1, v2, v1

    .line 99
    invoke-direct {p0, v1}, Ll/ܽᩴۘ;->֫(I)V

    return-void

    :cond_9
    shl-int/2addr p1, v9

    .line 92
    aput p1, v2, v1

    .line 93
    invoke-direct {p0, v1}, Ll/ܽᩴۘ;->֫(I)V

    return-void

    .line 57
    :cond_a
    invoke-static {v5, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/lit8 p2, p1, 0x1

    .line 58
    aget-byte p2, p3, p2

    add-int/2addr p1, v6

    aget-byte p1, p3, p1

    return-void

    .line 42
    :cond_b
    invoke-static {v5, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/lit8 p2, p1, 0x2

    .line 43
    aget-byte p2, p3, p2

    if-nez p2, :cond_c

    add-int/2addr p1, v0

    .line 45
    aget-byte p1, p3, p1

    .line 98
    invoke-virtual {v4, v1, p1, p2}, Ll/֡᩵ۘ;->֫(III)V

    return-void

    :cond_c
    add-int/2addr p1, v0

    .line 47
    aget-byte p1, p3, p1

    .line 103
    invoke-virtual {v4, v1, p1, p2}, Ll/֡᩵ۘ;->ۧ(III)V

    return-void

    .line 52
    :cond_d
    invoke-static {v5, p2}, Ll/ܽᩴۘ;->֫(II)V

    add-int/lit8 p2, p1, 0x1

    .line 53
    aget-byte p2, p3, p2

    add-int/2addr p1, v6

    aget-byte p1, p3, p1

    .line 98
    invoke-virtual {v4, v1, p2, p1}, Ll/֡᩵ۘ;->֫(III)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
