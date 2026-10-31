.class public Ll/ܳۘ֫;
.super Ljava/lang/Object;
.source "X6AW"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public ۧ:I

.field public ܽ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 785
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 786
    iput-object p1, p0, Ll/ܳۘ֫;->֫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 860
    iget v0, p0, Ll/ܳۘ֫;->ۧ:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 856
    iput p1, p0, Ll/ܳۘ֫;->ۧ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 852
    iget-boolean v0, p0, Ll/ܳۘ֫;->ᩳ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ܳۘ֫;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ()V
    .locals 3

    .line 793
    iget-boolean v0, p0, Ll/ܳۘ֫;->ᩳ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ܳۘ֫;->ܽ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 797
    iput-boolean v0, p0, Ll/ܳۘ֫;->ᩳ:Z

    .line 798
    invoke-virtual {p0}, Ll/ܳۘ֫;->ᩳ()V

    return-void

    .line 794
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "sendResult() called when either sendResult() or sendError() had already been called for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܳۘ֫;->֫:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ܽ()V
    .locals 3

    .line 883
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "It is not supported to send an error for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܳۘ֫;->֫:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()V
    .locals 3

    .line 823
    iget-boolean v0, p0, Ll/ܳۘ֫;->ᩳ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ܳۘ֫;->ܽ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 827
    iput-boolean v0, p0, Ll/ܳۘ֫;->ܽ:Z

    .line 828
    invoke-virtual {p0}, Ll/ܳۘ֫;->ܽ()V

    return-void

    .line 824
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "sendError() called when either sendResult() or sendError() had already been called for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܳۘ֫;->֫:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ᩳ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
