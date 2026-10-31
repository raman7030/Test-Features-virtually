.class public final Ll/᩹ۧᩳ;
.super Ljava/lang/Object;
.source "819Z"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/᩶ۧᩳ;

.field public final ܳ:Ll/ܶۧᩳ;

.field public final ܽ:Ll/ܶۧᩳ;

.field public final ܿ:Ll/ܶۧᩳ;

.field public final ᩳ:Ll/ܶۧᩳ;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    new-instance v0, Ll/ܶۧᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܶۧᩳ;-><init>(Z)V

    iput-object v0, p0, Ll/᩹ۧᩳ;->ܽ:Ll/ܶۧᩳ;

    .line 374
    new-instance v0, Ll/ܶۧᩳ;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v0, v3}, Ll/ܶۧᩳ;-><init>(Z)V

    iput-object v0, p0, Ll/᩹ۧᩳ;->ᩳ:Ll/ܶۧᩳ;

    .line 375
    new-instance v0, Ll/ܶۧᩳ;

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-direct {v0, v3}, Ll/ܶۧᩳ;-><init>(Z)V

    iput-object v0, p0, Ll/᩹ۧᩳ;->ܿ:Ll/ܶۧᩳ;

    .line 376
    new-instance v0, Ll/ܶۧᩳ;

    const/16 v3, 0x21

    if-lt v2, v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-direct {v0, v1}, Ll/ܶۧᩳ;-><init>(Z)V

    iput-object v0, p0, Ll/᩹ۧᩳ;->ܳ:Ll/ܶۧᩳ;

    .line 377
    sget-object v0, Ll/᩶ۧᩳ;->ۙ:Ll/᩶ۧᩳ;

    iput-object v0, p0, Ll/᩹ۧᩳ;->ۧ:Ll/᩶ۧᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩶ۧᩳ;
    .locals 1

    .line 385
    iget-object v0, p0, Ll/᩹ۧᩳ;->ۧ:Ll/᩶ۧᩳ;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 381
    iget-object v0, p0, Ll/᩹ۧᩳ;->ܽ:Ll/ܶۧᩳ;

    iget-object v0, v0, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v0}, Ll/᩸ۧᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩹ۧᩳ;->ᩳ:Ll/ܶۧᩳ;

    iget-object v0, v0, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v0}, Ll/᩸ۧᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩹ۧᩳ;->ܿ:Ll/ܶۧᩳ;

    iget-object v0, v0, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v0}, Ll/᩸ۧᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩹ۧᩳ;->ܳ:Ll/ܶۧᩳ;

    iget-object v0, v0, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v0}, Ll/᩸ۧᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 389
    iget-boolean v0, p0, Ll/᩹ۧᩳ;->֫:Z

    return v0
.end method
