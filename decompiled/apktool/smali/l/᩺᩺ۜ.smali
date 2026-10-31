.class public final Ll/᩺᩺ۜ;
.super Ll/᩺ۨۜ;
.source "K6MS"


# instance fields
.field public final synthetic ֫:Ll/ܶ᩵ܿ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p2, p0, Ll/᩺᩺ۜ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩺᩺ۜ;->ܽ:Ljava/lang/String;

    iput-object p1, p0, Ll/᩺᩺ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-direct {p0}, Ll/᩺ۨۜ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ܽ()Ljava/io/File;
    .locals 2

    .line 65
    iget-object v0, p0, Ll/᩺᩺ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩺᩺ۜ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/io/InputStream;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩺᩺ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ll/ۨۨۜ;
    .locals 8

    .line 59
    iget-object v0, p0, Ll/᩺᩺ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    new-instance v1, Ll/ۨۨۜ;

    const-wide/16 v2, -0x1

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v6

    iget-object v3, p0, Ll/᩺᩺ۜ;->ۧ:Ljava/lang/String;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/ۨۨۜ;-><init>(Ljava/lang/String;JJ)V

    return-object v1

    .line 59
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image source is no longer a regular file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/᩺᩺ۜ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
