.class public final Ll/ۡ۫֫;
.super Ljava/lang/Object;
.source "X8TF"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Z


# direct methods
.method public static bridge synthetic ֫(Ll/ۡ۫֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡ۫֫;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡ۫֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡ۫֫;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۡ۫֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡ۫֫;->ܽ:Z

    return p0
.end method


# virtual methods
.method public final ֫()Ll/ܺ۫֫;
    .locals 2

    .line 89
    iget-boolean v0, p0, Ll/ۡ۫֫;->֫:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۡ۫֫;->ۧ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ۫֫;->ܽ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Secondary offload attribute fields are true but primary isFormatSupported is false"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_1
    :goto_0
    new-instance v0, Ll/ܺ۫֫;

    invoke-direct {v0, p0}, Ll/ܺ۫֫;-><init>(Ll/ۡ۫֫;)V

    return-object v0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 67
    iput-boolean p1, p0, Ll/ۡ۫֫;->ۧ:Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, Ll/ۡ۫֫;->֫:Z

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 78
    iput-boolean p1, p0, Ll/ۡ۫֫;->ܽ:Z

    return-void
.end method
