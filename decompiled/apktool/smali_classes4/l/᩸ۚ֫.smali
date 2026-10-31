.class public final Ll/᩸ۚ֫;
.super Ljava/lang/Object;
.source "L8SE"


# instance fields
.field public ֫:Ll/֡ᩴ֫;

.field public final ۧ:Ljava/lang/Object;

.field public ܽ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 323
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 324
    iput-object p1, p0, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    .line 325
    new-instance p1, Ll/֡ᩴ֫;

    invoke-direct {p1}, Ll/֡ᩴ֫;-><init>()V

    iput-object p1, p0, Ll/᩸ۚ֫;->֫:Ll/֡ᩴ֫;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 362
    const-class v0, Ll/᩸ۚ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 365
    :cond_1
    check-cast p1, Ll/᩸ۚ֫;

    iget-object p1, p1, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    iget-object v0, p0, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 370
    iget-object v0, p0, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(ILl/۠ۚ֫;)V
    .locals 1

    .line 337
    iget-boolean v0, p0, Ll/᩸ۚ֫;->ᩳ:Z

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 339
    iget-object v0, p0, Ll/᩸ۚ֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v0, p1}, Ll/֡ᩴ֫;->֫(I)V

    :cond_0
    const/4 p1, 0x1

    .line 341
    iput-boolean p1, p0, Ll/᩸ۚ֫;->ܽ:Z

    .line 342
    iget-object p1, p0, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    invoke-interface {p2, p1}, Ll/۠ۚ֫;->invoke(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܶۚ֫;)V
    .locals 2

    .line 347
    iget-boolean v0, p0, Ll/᩸ۚ֫;->ᩳ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩸ۚ֫;->ܽ:Z

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Ll/᩸ۚ֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v0}, Ll/֡ᩴ֫;->֫()Ll/ۚᩴ֫;

    move-result-object v0

    .line 351
    new-instance v1, Ll/֡ᩴ֫;

    invoke-direct {v1}, Ll/֡ᩴ֫;-><init>()V

    iput-object v1, p0, Ll/᩸ۚ֫;->֫:Ll/֡ᩴ֫;

    const/4 v1, 0x0

    .line 352
    iput-boolean v1, p0, Ll/᩸ۚ֫;->ܽ:Z

    .line 353
    iget-object v1, p0, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Ll/ܶۚ֫;->֫(Ljava/lang/Object;Ll/ۚᩴ֫;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ܶۚ֫;)V
    .locals 2

    const/4 v0, 0x1

    .line 329
    iput-boolean v0, p0, Ll/᩸ۚ֫;->ᩳ:Z

    .line 330
    iget-boolean v0, p0, Ll/᩸ۚ֫;->ܽ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 331
    iput-boolean v0, p0, Ll/᩸ۚ֫;->ܽ:Z

    .line 332
    iget-object v0, p0, Ll/᩸ۚ֫;->֫:Ll/֡ᩴ֫;

    invoke-virtual {v0}, Ll/֡ᩴ֫;->֫()Ll/ۚᩴ֫;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۚ֫;->ۧ:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Ll/ܶۚ֫;->֫(Ljava/lang/Object;Ll/ۚᩴ֫;)V

    :cond_0
    return-void
.end method
