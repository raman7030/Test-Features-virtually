.class public final Ll/᩺ܿۡ;
.super Ll/֫ܳۡ;
.source "TBJG"


# instance fields
.field public ܽ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    const/4 p1, 0x0

    .line 184
    invoke-direct {p0, p1}, Ll/֫ܳۡ;-><init>(I)V

    .line 186
    iput-boolean p1, p0, Ll/᩺ܿۡ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 190
    iput-boolean v0, p0, Ll/᩺ܿۡ;->ܽ:Z

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    :cond_0
    :goto_0
    iget-boolean v1, p0, Ll/᩺ܿۡ;->ܽ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/֫ܳۡ;->֫:Ljava/io/StringReader;

    invoke-virtual {v1}, Ljava/io/Reader;->read()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    int-to-char v1, v1

    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x3e

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 210
    iput-boolean v1, p0, Ll/᩺ܿۡ;->ܽ:Z

    goto :goto_0

    .line 213
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
