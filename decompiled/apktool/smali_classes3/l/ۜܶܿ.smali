.class public final Ll/ۜܶܿ;
.super Ll/ۡ᩸ܿ;
.source "116O"


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/net/Uri;)V
    .locals 2

    .line 16
    invoke-direct {p0, p1, p2}, Ll/ۡ᩸ܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    const-string p1, "com.android.externalstorage.documents"

    .line 17
    invoke-virtual {p2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported uri authority: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֨()Z
    .locals 1

    .line 43
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡ᩸ܿ;
    .locals 1

    .line 24
    new-instance v0, Ll/ۜܶܿ;

    invoke-direct {v0, p1, p2}, Ll/ۜܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    return-object v0
.end method

.method public final ֫(J)Z
    .locals 4

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_0

    return v2

    .line 66
    :cond_0
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0, p1, p2}, Ljava/io/File;->setLastModified(J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_1

    .line 68
    iput-wide p1, v0, Ll/ۢ᩸ܿ;->᩹:J

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method public final ۗۧ()Ll/ۡ᩸ܿ;
    .locals 3

    .line 33
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 34
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Ll/ܳܶܿ;->ᩳ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    new-instance v2, Ll/ۜܶܿ;

    invoke-direct {v2, v0, v1}, Ll/ۜܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;)V

    return-object v2

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۛۧ()Ljava/lang/String;
    .locals 1

    .line 77
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ܳܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 48
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    return v0
.end method
