.class public final Ll/ۛ᩺ۜ;
.super Ll/᩺ۨۜ;
.source "S6MO"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final synthetic ۤ:Ll/ۨ᩺ۜ;

.field public ۫:Z

.field public final ۬:Ll/᩺ۨۜ;

.field public final ᩶:Ljava/io/File;

.field public final ᩸:Ll/ۨۨۜ;

.field public final ᩹:Ll/ۤ᩺ۜ;


# direct methods
.method public constructor <init>(Ll/ۨ᩺ۜ;Ll/᩺ۨۜ;Ll/ۨۨۜ;Ljava/io/File;Ll/ۤ᩺ۜ;)V
    .locals 0

    .line 151
    iput-object p1, p0, Ll/ۛ᩺ۜ;->ۤ:Ll/ۨ᩺ۜ;

    invoke-direct {p0}, Ll/᩺ۨۜ;-><init>()V

    .line 152
    iput-object p2, p0, Ll/ۛ᩺ۜ;->۬:Ll/᩺ۨۜ;

    .line 153
    iput-object p3, p0, Ll/ۛ᩺ۜ;->᩸:Ll/ۨۨۜ;

    .line 154
    iput-object p4, p0, Ll/ۛ᩺ۜ;->᩶:Ljava/io/File;

    .line 155
    iput-object p5, p0, Ll/ۛ᩺ۜ;->᩹:Ll/ۤ᩺ۜ;

    .line 156
    invoke-virtual {p2}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ᩺ۜ;->ۙ:Ljava/lang/String;

    .line 157
    invoke-virtual {p2}, Ll/᩺ۨۜ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ᩺ۜ;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 191
    iget-object v0, p0, Ll/ۛ᩺ۜ;->ۤ:Ll/ۨ᩺ۜ;

    invoke-static {v0}, Ll/ۨ᩺ۜ;->ܽ(Ll/ۨ᩺ۜ;)V

    .line 192
    iget-boolean v1, p0, Ll/ۛ᩺ۜ;->۫:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 193
    iput-boolean v1, p0, Ll/ۛ᩺ۜ;->۫:Z

    .line 194
    iget-object v2, p0, Ll/ۛ᩺ۜ;->᩹:Ll/ۤ᩺ۜ;

    if-eqz v2, :cond_1

    .line 195
    iput-boolean v1, v2, Ll/ۤ᩺ۜ;->ܽ:Z

    .line 196
    invoke-static {v0}, Ll/ۨ᩺ۜ;->ۧ(Ll/ۨ᩺ۜ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۜ()Ljava/io/File;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۛ᩺ۜ;->᩶:Ljava/io/File;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۛ᩺ۜ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/io/InputStream;
    .locals 2

    .line 185
    iget-object v0, p0, Ll/ۛ᩺ۜ;->ۤ:Ll/ۨ᩺ۜ;

    invoke-static {v0}, Ll/ۨ᩺ۜ;->ܽ(Ll/ۨ᩺ۜ;)V

    .line 186
    iget-boolean v1, p0, Ll/ۛ᩺ۜ;->۫:Z

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۨ᩺ۜ;->֫(Ll/ۨ᩺ۜ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 167
    iget-object v0, p0, Ll/ۛ᩺ۜ;->᩶:Ljava/io/File;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ۜ;->۬:Ll/᩺ۨۜ;

    invoke-virtual {v0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v1

    .line 186
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Prepared image source is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩵()Ll/ۨۨۜ;
    .locals 2

    .line 185
    iget-object v0, p0, Ll/ۛ᩺ۜ;->ۤ:Ll/ۨ᩺ۜ;

    invoke-static {v0}, Ll/ۨ᩺ۜ;->ܽ(Ll/ۨ᩺ۜ;)V

    .line 186
    iget-boolean v1, p0, Ll/ۛ᩺ۜ;->۫:Z

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۨ᩺ۜ;->֫(Ll/ۨ᩺ۜ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    iget-object v0, p0, Ll/ۛ᩺ۜ;->᩹:Ll/ۤ᩺ۜ;

    iget-object v1, p0, Ll/ۛ᩺ۜ;->᩸:Ll/ۨۨۜ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۛ᩺ۜ;->۬:Ll/᩺ۨۜ;

    invoke-virtual {v0, v1}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    :cond_0
    return-object v1

    .line 186
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Prepared image source is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۛ᩺ۜ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
