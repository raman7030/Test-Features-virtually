.class public final Ll/ܰ᩸ܿ;
.super Ll/ۧ᩹ܿ;
.source "P17O"


# instance fields
.field public ۤ:Ll/ܿ᩹ܿ;


# direct methods
.method public constructor <init>(Ljava/io/File;ZLl/ܿ᩹ܿ;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Ll/ۧ᩹ܿ;-><init>(Ljava/io/File;Z)V

    .line 16
    iput-object p3, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 0

    return-object p0
.end method

.method public final ֫֫()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۧ᩹ܿ;->۬:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۛۧ()Ll/ܿ᩹ܿ;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    return-object v0
.end method

.method public final ۤۧ()Ll/ܿ᩹ܿ;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    if-nez v0, :cond_0

    .line 73
    invoke-super {p0}, Ll/ۧ᩹ܿ;->ۤۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    :cond_0
    return-object v0
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 0

    .line 57
    invoke-super {p0, p1}, Ll/ۧ᩹ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۫()Z
    .locals 1

    .line 48
    invoke-super {p0}, Ll/ۧ᩹ܿ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۬()Z
    .locals 1

    .line 33
    invoke-super {p0}, Ll/ۧ᩹ܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۬ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    return-void
.end method

.method public final ᩺()Ll/ܶ᩵ܿ;
    .locals 4

    .line 22
    new-instance v0, Ll/ܰ᩸ܿ;

    iget-object v1, p0, Ll/ۧ᩹ܿ;->۬:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    iget-boolean v2, p0, Ll/ۧ᩹ܿ;->۫:Z

    iget-object v3, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    invoke-direct {v0, v1, v2, v3}, Ll/ܰ᩸ܿ;-><init>(Ljava/io/File;ZLl/ܿ᩹ܿ;)V

    return-object v0
.end method

.method public final ᩺ۧ()Z
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܰ᩸ܿ;->ۤ:Ll/ܿ᩹ܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
