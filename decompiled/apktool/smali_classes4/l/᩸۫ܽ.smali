.class public final Ll/᩸۫ܽ;
.super Ljava/lang/Object;
.source "06A0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۙۘۨ:[S


# instance fields
.field public final synthetic ᩸:Ll/ܽۢܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸۫ܽ;->ۙۘۨ:[S

    return-void

    :array_0
    .array-data 2
        0x1383s
        -0x6c29s
        -0x6c35s
        -0x6c35s
        -0x6c31s
        -0x6c34s
        -0x6c7bs
        -0x6c70s
        -0x6c70s
        -0x6c28s
        -0x6c2as
        -0x6c35s
        -0x6c29s
        -0x6c36s
        -0x6c23s
        -0x6c6fs
        -0x6c24s
        -0x6c30s
        -0x6c2es
        -0x6c70s
        -0x6c0ds
        -0x6c6es
        -0x6c0bs
        -0x6c0as
        -0x6c0fs
        -0x6c03s
        -0x6c0as
        -0x6c0fs
        -0x6c70s
        -0x6c02s
        -0x6c31s
        -0x6c2cs
        -0x6c14s
        -0x6c2as
        -0x6c28s
        -0x6c2fs
        -0x6c22s
        -0x6c35s
        -0x6c36s
        -0x6c33s
        -0x6c26s
        -0x6c0cs
        -0x6c2as
        -0x6c2ds
        -0x6c2ds
        -0x6c26s
        -0x6c33s
        -0x6c06s
        -0x6c39s
    .end array-data
.end method

.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۫ܽ;->᩸:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    sget-boolean p1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez p1, :cond_0

    goto/16 :goto_4

    .line 27
    :cond_0
    sget p1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Ll/᩸۫ܽ;->ۙۘۨ:[S

    .line 48
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v0

    if-gtz v0, :cond_2

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    .line 37
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    aget-short p1, p1, v0

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v0

    if-gtz v0, :cond_5

    .line 10
    :goto_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget p1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz p1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget p1, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez p1, :cond_9

    goto :goto_3

    :cond_5
    mul-int/lit16 v0, p1, 0x4b8c

    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v1, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit16 p1, p1, 0x12e3

    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    mul-int p1, p1, p1

    sub-int/2addr p1, v0

    if-ltz p1, :cond_8

    const p1, 0x93bf

    goto :goto_2

    :cond_8
    const/16 p1, 0x7589

    .line 89
    :goto_2
    iget-object v0, p0, Ll/᩸۫ܽ;->᩸:Ll/ܽۢܳ;

    invoke-static {v0}, Ll/᩺;->ܳᩳۙ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    .line 26
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget p1, Ll/ۘۛ;->ۖۚ֡:I

    if-lez p1, :cond_c

    goto :goto_4

    .line 89
    :cond_a
    sget-object v1, Ll/᩸۫ܽ;->ۙۘۨ:[S

    .line 39
    sget-boolean v2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v2, :cond_b

    goto :goto_4

    :cond_b
    const/4 v2, 0x1

    .line 30
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_d

    .line 9
    :cond_c
    :goto_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    .line 1
    :goto_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    return-void

    :cond_d
    const/16 v3, 0x30

    .line 89
    invoke-static {v1, v2, v3, p1}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩺;->۟᩷۠(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
