.class public final Ll/ܳ۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/۟֡ۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6f

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(ILl/ۛۚۡ;Ll/۟֡ۡ;)V
    .locals 3

    const v0, 0x242d846b

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    .line 939
    iput p1, p0, Ll/ܳ۠ۡ;->᩶:I

    iput-object p2, p0, Ll/ܳ۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p3, p0, Ll/ܳ۠ۡ;->᩹:Ll/۟֡ۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06df\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x2f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3a89

    const p3, 0x5d99d891

    xor-int/2addr p2, p3

    const p3, -0x16a59782

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x25db

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 698
    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-ltz p1, :cond_3

    const-string p1, "\u1a78\u073a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x45

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x571

    const p3, -0x712fedda

    xor-int/2addr p2, p3

    const p3, 0x58cbecbc

    goto :goto_0

    :sswitch_0
    sget p1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06d8\u1a74"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4413

    const p3, -0x7913aa17

    xor-int/2addr p2, p3

    const p3, -0x8e56ee7

    goto :goto_0

    .line 645
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-ltz p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u073a\u1a76"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x23

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7e61

    const p3, 0x4d8f2e68

    xor-int/2addr p2, p3

    const p3, -0x6662321c

    goto :goto_0

    .line 679
    :sswitch_2
    sget p1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e2\u0733"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x3f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5363

    const p3, -0x7f701f52

    xor-int/2addr p2, p3

    const p3, -0x415dd8bb

    goto :goto_0

    .line 769
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    :goto_2
    const-string p1, "\u06d7\u06e1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3d71

    const p3, 0x581e5876

    xor-int/2addr p2, p3

    const p3, 0x64315106

    goto/16 :goto_0

    .line 176
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u073f\u0730"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0xc6f

    const p3, 0x2093e82c

    xor-int/2addr p2, p3

    const p3, -0x3d859fcc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ba5ad45 -> :sswitch_3
        -0x6c95d67b -> :sswitch_2
        -0x38df5932 -> :sswitch_4
        -0x16b6717b -> :sswitch_4
        -0x555aa83 -> :sswitch_0
        0x12a5b55a -> :sswitch_1
        0x1a91aec0 -> :sswitch_2
        0x20040201 -> :sswitch_5
        0x2fdb0e15 -> :sswitch_5
        0x55a2a446 -> :sswitch_0
        0x6ef12a6d -> :sswitch_3
        0x7a627aec -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
