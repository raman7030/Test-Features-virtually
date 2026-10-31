.class public final Ll/ۗܶ֫;
.super Ljava/lang/Object;
.source "V742"

# interfaces
.implements Ll/ܶ۠֫;


# instance fields
.field public ۗ:Ll/֨۠֫;

.field public ۙ:Ll/֫ܶ֫;

.field public ۤ:Ll/ܶ۠֫;

.field public ۫:Z

.field public ۬:I

.field public ᩶:Ll/ۨܶ֫;

.field public ᩸:Ll/᩸ܶ֫;

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance v0, Ll/֫ܶ֫;

    .line 73
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object v0, p0, Ll/ۗܶ֫;->ۙ:Ll/֫ܶ֫;

    .line 82
    sget-object v0, Ll/ۨܶ֫;->֫:Ll/ۘ᩵ܿ;

    iput-object v0, p0, Ll/ۗܶ֫;->᩶:Ll/ۨܶ֫;

    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Ll/ۗܶ֫;->۫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۬ܶ֫;
    .locals 10

    .line 271
    iget-object v0, p0, Ll/ۗܶ֫;->ۤ:Ll/ܶ۠֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    iget v8, p0, Ll/ۗܶ֫;->۬:I

    .line 317
    iget-object v3, p0, Ll/ۗܶ֫;->᩸:Ll/᩸ܶ֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    iget-boolean v0, p0, Ll/ۗܶ֫;->᩹:Z

    if-nez v0, :cond_3

    if-nez v4, :cond_1

    goto :goto_1

    .line 321
    :cond_1
    iget-object v0, p0, Ll/ۗܶ֫;->ۗ:Ll/֨۠֫;

    if-eqz v0, :cond_2

    .line 322
    check-cast v0, Ll/᩶ܶ֫;

    invoke-virtual {v0}, Ll/᩶ܶ֫;->֫()Ll/ۙܶ֫;

    move-result-object v1

    goto :goto_1

    .line 324
    :cond_2
    new-instance v0, Ll/᩶ܶ֫;

    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 324
    invoke-virtual {v0, v3}, Ll/᩶ܶ֫;->֫(Ll/᩸ܶ֫;)V

    invoke-virtual {v0}, Ll/᩶ܶ֫;->֫()Ll/ۙܶ֫;

    move-result-object v1

    :cond_3
    :goto_1
    move-object v6, v1

    .line 326
    new-instance v0, Ll/۬ܶ֫;

    iget-object v1, p0, Ll/ۗܶ֫;->ۙ:Ll/֫ܶ֫;

    .line 329
    invoke-virtual {v1}, Ll/֫ܶ֫;->֫()Ll/᩸۠֫;

    move-result-object v5

    iget-object v7, p0, Ll/ۗܶ֫;->᩶:Ll/ۨܶ֫;

    iget-boolean v9, p0, Ll/ۗܶ֫;->۫:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Ll/۬ܶ֫;-><init>(Ll/᩸ܶ֫;Ll/᩸۠֫;Ll/᩸۠֫;Ll/ۙܶ֫;Ll/ۨܶ֫;IZ)V

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/᩸۠֫;
    .locals 1

    .line 66
    invoke-virtual {p0}, Ll/ۗܶ֫;->֫()Ll/۬ܶ֫;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 239
    iput p1, p0, Ll/ۗܶ֫;->۬:I

    return-void
.end method

.method public final ֫(Ll/ۨܶ֫;)V
    .locals 0

    .line 152
    iput-object p1, p0, Ll/ۗܶ֫;->᩶:Ll/ۨܶ֫;

    return-void
.end method

.method public final ֫(Ll/ܶ۠֫;)V
    .locals 0

    .line 175
    iput-object p1, p0, Ll/ۗܶ֫;->ۤ:Ll/ܶ۠֫;

    return-void
.end method

.method public final ֫(Ll/ܺ᩸֫;)V
    .locals 0

    .line 96
    iput-object p1, p0, Ll/ۗܶ֫;->᩸:Ll/᩸ܶ֫;

    return-void
.end method

.method public final ֫(Ll/᩶ܶ֫;)V
    .locals 0

    .line 137
    iput-object p1, p0, Ll/ۗܶ֫;->ۗ:Ll/֨۠֫;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 138
    :goto_0
    iput-boolean p1, p0, Ll/ۗܶ֫;->᩹:Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 250
    iput-boolean v0, p0, Ll/ۗܶ֫;->۫:Z

    return-void
.end method
