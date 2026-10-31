.class public final Ll/᩷ۛܽ;
.super Ljava/lang/Object;
.source "Q9SO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ֨ۚۤ:[S


# instance fields
.field public final synthetic ᩸:Ll/ܽۢܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ۛܽ;->֨ۚۤ:[S

    return-void

    :array_0
    .array-data 2
        0x4c7s
        0x5d11s
        0x5d0ds
        0x5d0ds
        0x5d09s
        0x5d0as
        0x5d43s
        0x5d56s
        0x5d56s
        0x5d1es
        0x5d10s
        0x5d0ds
        0x5d11s
        0x5d0cs
        0x5d1bs
        0x5d57s
        0x5d1as
        0x5d16s
        0x5d14s
        0x5d56s
        0x5d35s
        0x5d54s
        0x5d33s
        0x5d30s
        0x5d37s
        0x5d3bs
        0x5d30s
        0x5d37s
        0x5d56s
        0x5d34s
        0x5d2ds
        0x5d3ds
        0x5d18s
        0x5d0ds
        0x5d18s
        0x5d3fs
        0x5d10s
        0x5d15s
        0x5d1cs
        0x5d0as
        0x5d29s
        0x5d0bs
        0x5d16s
        0x5d0fs
        0x5d10s
        0x5d1ds
        0x5d1cs
        0x5d0bs
    .end array-data
.end method

.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۛܽ;->᩸:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 17
    sget p1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Ll/᩷ۛܽ;->֨ۚۤ:[S

    .line 13
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_2

    goto :goto_3

    :cond_2
    aget-short p1, p1, v0

    .line 45
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit16 v0, p1, 0x255a

    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_4

    goto :goto_0

    :cond_4
    mul-int v0, v0, v0

    mul-int p1, p1, p1

    .line 12
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    const v1, 0x57323a4

    .line 13
    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_7

    :goto_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget p1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez p1, :cond_6

    goto :goto_5

    .line 16
    :cond_6
    :goto_1
    sget p1, Ll/֡۬;->۠֡᩶:I

    if-gtz p1, :cond_9

    goto :goto_5

    :cond_7
    add-int/2addr p1, v1

    add-int/2addr p1, p1

    sub-int/2addr p1, v0

    if-ltz p1, :cond_8

    const/16 p1, 0x5d79

    goto :goto_2

    :cond_8
    const p1, 0x917c

    .line 51
    :goto_2
    iget-object v0, p0, Ll/᩷ۛܽ;->᩸:Ll/ܽۢܳ;

    invoke-static {v0}, Ll/᩹;->ܳ֨ۛ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_a

    .line 14
    :cond_9
    :goto_3
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_5

    .line 51
    :cond_a
    sget-object v1, Ll/᩷ۛܽ;->֨ۚۤ:[S

    .line 41
    sget v2, Ll/֡۬;->۠֡᩶:I

    if-gtz v2, :cond_b

    goto :goto_4

    :cond_b
    const/4 v2, 0x1

    .line 31
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_d

    .line 33
    :cond_c
    :goto_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    :goto_5
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    return-void

    :cond_d
    const/16 v3, 0x2f

    .line 51
    invoke-static {v1, v2, v3, p1}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩹;->ۤܳ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
