.class public final Ll/ۨۘܿ;
.super Ljava/lang/Object;
.source "470D"


# instance fields
.field public final ֫:Ll/۫ۘܿ;

.field public final ۧ:Ll/۬ۘܿ;


# direct methods
.method public constructor <init>(Ll/۫ۘܿ;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨۘܿ;->֫:Ll/۫ۘܿ;

    .line 130
    new-instance v0, Ll/۬ۘܿ;

    invoke-direct {v0, p1}, Ll/۬ۘܿ;-><init>(Ll/۫ۘܿ;)V

    .line 30
    iput-object v0, p0, Ll/ۨۘܿ;->ۧ:Ll/۬ۘܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶۘܿ;)Ll/ۤۘܿ;
    .locals 8

    .line 35
    iget-object v0, p0, Ll/ۨۘܿ;->ۧ:Ll/۬ۘܿ;

    invoke-virtual {v0, p1}, Ll/۬ۘܿ;->֫(Ll/ܶۘܿ;)Ll/ۙۘܿ;

    move-result-object v7

    .line 36
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ll/ۤۘܿ;

    const/4 v5, -0x1

    sget-object v6, Ll/ۛۘܿ;->ۙ:Ll/ۛۘܿ;

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Ll/ۤۘܿ;-><init>(IIIILl/ۛۘܿ;Ll/ۙۘܿ;)V

    return-object p1

    .line 37
    :cond_0
    invoke-virtual {v7}, Ll/ۙۘܿ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    new-instance p1, Ll/ۤۘܿ;

    const/4 v5, -0x1

    sget-object v6, Ll/ۛۘܿ;->ۗ:Ll/ۛۘܿ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Ll/ۤۘܿ;-><init>(IIIILl/ۛۘܿ;Ll/ۙۘܿ;)V

    return-object p1

    .line 42
    :cond_1
    invoke-virtual {p1}, Ll/ܶۘܿ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ۨۘܿ;->֫:Ll/۫ۘܿ;

    invoke-virtual {v1, v0}, Ll/۫ۘܿ;->ܽ(I)I

    move-result v0

    const/4 v2, 0x0

    .line 43
    :goto_0
    invoke-virtual {v7}, Ll/ۙۘܿ;->ܽ()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 44
    invoke-virtual {v7, v2}, Ll/ۙۘܿ;->֫(I)I

    move-result v3

    invoke-virtual {v1, v3}, Ll/۫ۘܿ;->ᩳ(I)I

    move-result v3

    .line 45
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v7}, Ll/ۙۘܿ;->֫()I

    move-result v2

    .line 50
    invoke-virtual {v1}, Ll/۫ۘܿ;->ۧ()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 53
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p1, v3}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 54
    invoke-virtual {v1, v2}, Ll/۫ۘܿ;->֫(I)I

    move-result v2

    if-ltz v2, :cond_3

    .line 55
    invoke-virtual {v1}, Ll/۫ۘܿ;->ۧ()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 57
    sget-object v3, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {p1, v2, v3}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v3

    if-ltz v3, :cond_3

    .line 58
    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 59
    invoke-virtual {v1}, Ll/۫ۘܿ;->ۧ()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v4

    sub-int/2addr v4, v3

    if-ne v1, v4, :cond_3

    move v4, v2

    move v5, v3

    goto :goto_1

    :cond_3
    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    .line 66
    :goto_1
    sget-object v1, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    invoke-virtual {p1, v0, v1}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v3

    .line 67
    invoke-virtual {v7}, Ll/ۙۘܿ;->ܽ()I

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Ll/ۛۘܿ;->᩶:Ll/ۛۘܿ;

    goto :goto_2

    :cond_4
    sget-object p1, Ll/ۛۘܿ;->᩹:Ll/ۛۘܿ;

    :goto_2
    move-object v6, p1

    .line 68
    new-instance p1, Ll/ۤۘܿ;

    move-object v1, p1

    move v2, v0

    invoke-direct/range {v1 .. v7}, Ll/ۤۘܿ;-><init>(IIIILl/ۛۘܿ;Ll/ۙۘܿ;)V

    return-object p1
.end method
