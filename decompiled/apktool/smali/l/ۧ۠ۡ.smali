.class public final Ll/ۧ۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Landroid/app/Activity;

.field public final synthetic ᩹:Ll/۟ܶ᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x57

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ll/۟ܶ᩷;Ljava/lang/String;)V
    .locals 3

    const v0, -0x2efc2d2

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    .line 606
    iput-object p3, p0, Ll/ۧ۠ۡ;->᩶:Ljava/lang/String;

    iput-object p1, p0, Ll/ۧ۠ۡ;->᩸:Landroid/app/Activity;

    iput-object p2, p0, Ll/ۧ۠ۡ;->᩹:Ll/۟ܶ᩷;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e0\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3599

    const p3, 0x45c91ab2

    xor-int/2addr p2, p3

    const p3, -0x2a112cea

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x1267

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 101
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto :goto_2

    .line 83
    :sswitch_0
    sget-boolean p1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a74\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x313d

    const p3, 0x4d9b4c8d    # 3.25685664E8f

    xor-int/2addr p2, p3

    const p3, -0x6fc5646b

    goto :goto_0

    .line 271
    :sswitch_1
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget p1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u1a74\u06e0"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6a7b

    const p3, 0x604b3c86

    xor-int/2addr p2, p3

    const p3, 0x14b3075c

    goto :goto_0

    .line 2
    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget p1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a75\u1a74"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x71

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6a8d

    const p3, -0x3f88e33

    xor-int/2addr p2, p3

    const p3, 0x37b0c54d

    goto :goto_0

    :goto_2
    const-string p1, "\u0736\u0736"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x1d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x176d

    const p3, 0x150056c3

    xor-int/2addr p2, p3

    const p3, 0x248f4569

    goto :goto_0

    .line 594
    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 490
    :sswitch_5
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u1a7a\u1a73"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x67f5

    const p3, -0x65f9de15

    xor-int/2addr p2, p3

    const p3, 0x57193478

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a79\u1a73"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x25ad

    const p3, 0x375d7235

    xor-int/2addr p2, p3

    const p3, 0x444353dc

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7da5fc99 -> :sswitch_0
        -0x6500d853 -> :sswitch_2
        -0x61bd24f9 -> :sswitch_4
        -0x54ff094b -> :sswitch_1
        -0x35f0f925 -> :sswitch_4
        -0x29f89c21 -> :sswitch_5
        -0x26aa9ea4 -> :sswitch_0
        -0xf743965 -> :sswitch_3
        0xae9fc55 -> :sswitch_3
        0x1b9d692c -> :sswitch_1
        0x4277fd92 -> :sswitch_2
        0x5e4ac0be -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
