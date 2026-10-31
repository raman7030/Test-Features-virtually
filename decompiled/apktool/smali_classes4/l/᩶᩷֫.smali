.class public final enum Ll/᩶᩷֫;
.super Ljava/lang/Enum;
.source "VB94"


# static fields
.field public static final enum ۗ:Ll/᩶᩷֫;

.field public static final enum ۙ:Ll/᩶᩷֫;

.field public static final enum ᩶:Ll/᩶᩷֫;

.field public static final synthetic ᩸:[Ll/᩶᩷֫;

.field public static final enum ᩹:Ll/᩶᩷֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 407
    new-instance v0, Ll/᩶᩷֫;

    const-string v1, "REMOVED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩶᩷֫;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩶᩷֫;->ۙ:Ll/᩶᩷֫;

    .line 411
    new-instance v1, Ll/᩶᩷֫;

    const-string v3, "VISIBLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll/᩶᩷֫;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    .line 415
    new-instance v3, Ll/᩶᩷֫;

    const-string v5, "GONE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll/᩶᩷֫;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll/᩶᩷֫;->᩹:Ll/᩶᩷֫;

    .line 419
    new-instance v5, Ll/᩶᩷֫;

    const-string v7, "INVISIBLE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ll/᩶᩷֫;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ll/᩶᩷֫;->᩶:Ll/᩶᩷֫;

    const/4 v7, 0x4

    new-array v7, v7, [Ll/᩶᩷֫;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 403
    sput-object v7, Ll/᩶᩷֫;->᩸:[Ll/᩶᩷֫;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 403
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶᩷֫;
    .locals 1

    .line 403
    const-class v0, Ll/᩶᩷֫;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶᩷֫;

    return-object p0
.end method

.method public static values()[Ll/᩶᩷֫;
    .locals 1

    .line 403
    sget-object v0, Ll/᩶᩷֫;->᩸:[Ll/᩶᩷֫;

    invoke-virtual {v0}, [Ll/᩶᩷֫;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶᩷֫;

    return-object v0
.end method

.method public static ֫(I)Ll/᩶᩷֫;
    .locals 2

    if-eqz p0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-ne p0, v0, :cond_0

    .line 450
    sget-object p0, Ll/᩶᩷֫;->᩹:Ll/᩶᩷֫;

    return-object p0

    .line 452
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown visibility "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 452
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 448
    :cond_1
    sget-object p0, Ll/᩶᩷֫;->᩶:Ll/᩶᩷֫;

    return-object p0

    .line 446
    :cond_2
    sget-object p0, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    return-object p0
.end method

.method public static ۧ(Landroid/view/View;)Ll/᩶᩷֫;
    .locals 2

    .line 430
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 431
    sget-object p0, Ll/᩶᩷֫;->᩶:Ll/᩶᩷֫;

    return-object p0

    .line 433
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    invoke-static {p0}, Ll/᩶᩷֫;->֫(I)Ll/᩶᩷֫;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Landroid/view/View;)V
    .locals 3

    .line 462
    sget-object v0, Ll/۠᩷֫;->ۧ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_6

    if-eq v0, v2, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 488
    :cond_0
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 489
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 493
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 481
    :cond_2
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 482
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_3
    const/16 v0, 0x8

    .line 485
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 474
    :cond_4
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 475
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    const/4 v0, 0x0

    .line 478
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 464
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    .line 466
    invoke-static {v2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 467
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 470
    :cond_7
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_8
    :goto_0
    return-void
.end method
