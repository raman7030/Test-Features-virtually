.class public final Ll/ۡۤܽ;
.super Ljava/lang/Object;
.source "SAJE"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۘ۫ۘ:[S


# instance fields
.field public final synthetic ᩸:Ll/ܽۢܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡۤܽ;->ۘ۫ۘ:[S

    return-void

    :array_0
    .array-data 2
        0xd62s
        0x5f05s
        0x5f19s
        0x5f19s
        0x5f1ds
        0x5f1es
        0x5f57s
        0x5f42s
        0x5f42s
        0x5f0as
        0x5f04s
        0x5f19s
        0x5f05s
        0x5f18s
        0x5f0fs
        0x5f43s
        0x5f0es
        0x5f02s
        0x5f00s
        0x5f42s
        0x5f21s
        0x5f40s
        0x5f27s
        0x5f24s
        0x5f23s
        0x5f2fs
        0x5f24s
        0x5f23s
        0x5f42s
        0x5f2cs
        0x5f1ds
        0x5f06s
        0x5f29s
        0x5f0cs
        0x5f19s
        0x5f0cs
        0x5f20s
        0x5f18s
        0x5f01s
        0x5f19s
        0x5f04s
        0x5f1ds
        0x5f01s
        0x5f08s
        0x5f15s
        0x5f04s
        0x5f03s
        0x5f0as
    .end array-data
.end method

.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۤܽ;->᩸:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 20
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result p1

    if-ltz p1, :cond_0

    goto/16 :goto_3

    .line 19
    :cond_0
    sget p1, Ll/᩺;->ۙۛܶ:I

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll/ۡۤܽ;->ۘ۫ۘ:[S

    .line 7
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_3

    goto :goto_5

    :cond_3
    aget-short p1, p1, v0

    const v0, 0x96fa

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_4

    goto :goto_1

    :cond_4
    mul-int v0, v0, p1

    mul-int p1, p1, p1

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_5

    goto :goto_1

    :cond_5
    const v1, 0x16427b09

    .line 47
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    add-int/2addr p1, v1

    sub-int/2addr v0, p1

    if-gtz v0, :cond_7

    const/16 p1, 0x5f6d

    goto :goto_0

    :cond_7
    const p1, 0xe740

    .line 57
    :goto_0
    iget-object v0, p0, Ll/ۡۤܽ;->᩸:Ll/ܽۢܳ;

    invoke-static {v0}, Ll/᩺;->ܳᩳۙ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v1, :cond_8

    goto :goto_4

    :cond_8
    sget-object v1, Ll/ۡۤܽ;->ۘ۫ۘ:[S

    .line 45
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v2

    if-gtz v2, :cond_a

    .line 17
    :goto_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result p1

    if-gtz p1, :cond_9

    goto :goto_4

    .line 1
    :cond_9
    :goto_2
    sget p1, Ll/֡᩶;->ܳܶ۠:I

    if-lez p1, :cond_b

    goto :goto_5

    :cond_a
    const/4 v2, 0x1

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v3

    if-gtz v3, :cond_d

    .line 12
    :cond_b
    :goto_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget p1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz p1, :cond_c

    goto :goto_5

    :cond_c
    :goto_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    .line 51
    :goto_5
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    return-void

    :cond_d
    const/16 v3, 0x2f

    .line 57
    invoke-static {v1, v2, v3, p1}, Ll/֡۬;->ۢܳ᩸([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩹;->ۤܳ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
