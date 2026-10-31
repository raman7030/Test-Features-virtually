.class public final Ll/ۜ۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/ۙ᩸ۢ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x46

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ll/ۛۚۡ;Ll/ۙ᩸ۢ;)V
    .locals 3

    const v0, -0x3882d271

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    .line 995
    iput p1, p0, Ll/ۜ۠ۡ;->᩶:I

    iput-object p2, p0, Ll/ۜ۠ۡ;->ۙ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۜ۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p4, p0, Ll/ۜ۠ۡ;->᩹:Ll/ۙ᩸ۢ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u1a7b\u06e7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7c7

    const p3, 0x5c20a5b7

    xor-int/2addr p2, p3

    const p3, -0x4478ef44

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x551f

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 907
    :sswitch_0
    sget p1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u0736\u073a"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x233

    const p3, 0x29f3361b

    xor-int/2addr p2, p3

    const p3, 0x31379393

    goto :goto_0

    .line 552
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u073a\u1a73"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3d79

    const p3, 0x3e278971

    xor-int/2addr p2, p3

    const p3, -0x33ed02d6    # -3.8532264E7f

    goto :goto_0

    .line 286
    :sswitch_2
    sget p1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e1\u1a73"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0xb9b

    const p3, -0x3e8ec696

    xor-int/2addr p2, p3

    const p3, 0x289eb5fa

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    :goto_2
    const-string p1, "\u0736\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x45

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2a91

    const p3, 0x2c4191c

    xor-int/2addr p2, p3

    const p3, -0x3f43ddbf

    goto :goto_0

    :sswitch_4
    return-void

    .line 68
    :sswitch_5
    sget p1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz p1, :cond_3

    const-string p1, "\u0730\u0736"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x510b

    const p3, -0x32ef12be

    xor-int/2addr p2, p3

    const p3, -0x789fe6ab

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u05ab\u06d9"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5243

    const p3, 0x4d54fe3e    # 2.23339488E8f

    xor-int/2addr p2, p3

    const p3, -0x345c100c    # -2.1487592E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a7a4df5 -> :sswitch_2
        -0x74a101ea -> :sswitch_5
        -0x3b9650c8 -> :sswitch_3
        -0x282bacbe -> :sswitch_1
        -0x2397a81 -> :sswitch_3
        0x2af12146 -> :sswitch_2
        0x2ba96bb4 -> :sswitch_1
        0x2d407f6f -> :sswitch_4
        0x4bef73d0 -> :sswitch_4
        0x5773de00 -> :sswitch_5
        0x6b970a23 -> :sswitch_0
        0x75457920 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
