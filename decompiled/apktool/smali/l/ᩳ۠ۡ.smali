.class public final Ll/ᩳ۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Landroid/app/Activity;

.field public final synthetic ᩹:Ll/ܽ֡ۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x89

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/app/Activity;Ll/ܽ֡ۡ;)V
    .locals 3

    const v0, -0x1e5624d5

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    .line 706
    iput-object p1, p0, Ll/ᩳ۠ۡ;->ۙ:Ljava/lang/String;

    iput p2, p0, Ll/ᩳ۠ۡ;->᩶:I

    iput-object p3, p0, Ll/ᩳ۠ۡ;->᩸:Landroid/app/Activity;

    iput-object p4, p0, Ll/ᩳ۠ۡ;->᩹:Ll/ܽ֡ۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e1\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x3b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6bf3

    const p3, 0x6d6907b6

    xor-int/2addr p2, p3

    const p3, -0x6826e579    # -1.4029993E-24f

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x593b

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 168
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto :goto_2

    .line 268
    :sswitch_0
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06da\u1a76"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2b71

    const p3, 0x7163a71f

    xor-int/2addr p2, p3

    const p3, -0x79a35d6c

    goto :goto_0

    :sswitch_1
    sget p1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06d9\u1a73"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x39

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x71cb

    const p3, 0x1f96f8df

    xor-int/2addr p2, p3

    const p3, 0xb38b1ba

    goto :goto_0

    :sswitch_2
    sget p1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a7a\u06da"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x9

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x3d27

    const p3, -0x112f6b0c

    xor-int/2addr p2, p3

    const p3, -0x2f5dfbfa

    goto :goto_0

    :goto_2
    const-string p1, "\u06d9\u1a7a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2e3f

    const p3, -0x2f6ff8b6

    xor-int/2addr p2, p3

    const p3, -0x1a8a4920

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 670
    :sswitch_5
    sget p1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz p1, :cond_3

    const-string p1, "\u06e8\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1fd1

    const p3, 0x1a98e4e0

    xor-int/2addr p2, p3

    const p3, 0x73b2d02b

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a7b\u1a74"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x67

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4c93

    const p3, 0xe4d21cc

    xor-int/2addr p2, p3

    const p3, -0xd901c02

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x796f29bb -> :sswitch_0
        -0x79213be5 -> :sswitch_2
        -0x66c38504 -> :sswitch_1
        -0x4ec7e9f3 -> :sswitch_4
        -0x330502cb -> :sswitch_5
        -0xc05f916 -> :sswitch_2
        -0x762727d -> :sswitch_3
        0x87773a8 -> :sswitch_0
        0xe287b9c -> :sswitch_5
        0x11f299cc -> :sswitch_3
        0x6ddee60c -> :sswitch_4
        0x72db8da5 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
