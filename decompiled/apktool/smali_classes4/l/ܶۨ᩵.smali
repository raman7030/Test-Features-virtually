.class public final Ll/ܶۨ᩵;
.super Ljava/lang/Object;
.source "A8DI"


# instance fields
.field public final ֫:Ll/֡ۨ᩵;

.field public ۧ:Z

.field public final ܽ:Ll/۠ۨ᩵;

.field public final ᩳ:Ll/᩺ۨ᩵;


# direct methods
.method public constructor <init>(Ll/۠ۨ᩵;Ll/֡ۨ᩵;)V
    .locals 1

    .line 421
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 419
    iput-boolean v0, p0, Ll/ܶۨ᩵;->ۧ:Z

    .line 422
    iput-object p1, p0, Ll/ܶۨ᩵;->ܽ:Ll/۠ۨ᩵;

    .line 423
    iput-object p2, p0, Ll/ܶۨ᩵;->֫:Ll/֡ۨ᩵;

    .line 424
    sget-object p2, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    invoke-virtual {p1, p2}, Ll/۠ۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ll/ܽ᩺᩵;->֫()Ll/ܽ᩺᩵;

    invoke-static {}, Ll/ܽ᩺᩵;->ܽ()Ll/᩺ۨ᩵;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ܶۨ᩵;->ᩳ:Ll/᩺ۨ᩵;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 444
    iget-object v0, p0, Ll/ܶۨ᩵;->ᩳ:Ll/᩺ۨ᩵;

    invoke-virtual {v0}, Ll/᩺ۨ᩵;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(I[B)V
    .locals 1

    .line 440
    iget-object v0, p0, Ll/ܶۨ᩵;->ᩳ:Ll/᩺ۨ᩵;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۨ᩵;->֫(I[B)V

    return-void
.end method

.method public final ֫(Ll/֨ۨ᩵;)Z
    .locals 1

    .line 428
    iget-object v0, p0, Ll/ܶۨ᩵;->ܽ:Ll/۠ۨ᩵;

    invoke-virtual {v0, p1}, Ll/۠ۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 448
    iput-boolean v0, p0, Ll/ܶۨ᩵;->ۧ:Z

    return-void
.end method

.method public final ܽ()Ll/֡ۨ᩵;
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ܶۨ᩵;->֫:Ll/֡ۨ᩵;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 452
    iget-boolean v0, p0, Ll/ܶۨ᩵;->ۧ:Z

    return v0
.end method

.method public final ᩳ()Ll/۠ۨ᩵;
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ܶۨ᩵;->ܽ:Ll/۠ۨ᩵;

    return-object v0
.end method
