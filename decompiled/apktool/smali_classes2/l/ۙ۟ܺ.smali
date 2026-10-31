.class public final Ll/ۙ۟ܺ;
.super Ljava/lang/Object;
.source "17NL"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public ᩸:I

.field public final ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p1, p0, Ll/ۙ۟ܺ;->᩶:Ljava/lang/String;

    .line 112
    new-instance v0, Ll/ۗ۟ܺ;

    invoke-direct {v0, p1}, Ll/ۗ۟ܺ;-><init>(Ljava/lang/String;)V

    .line 183
    iput-object v0, p0, Ll/ۙ۟ܺ;->᩹:Ljava/util/Iterator;

    .line 184
    invoke-virtual {v0}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ۙ۟ܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 202
    iget v0, p0, Ll/ۙ۟ܺ;->᩸:I

    iget-object v1, p0, Ll/ۙ۟ܺ;->᩶:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 188
    iget v0, p0, Ll/ۙ۟ܺ;->᩸:I

    .line 189
    iget-object v1, p0, Ll/ۙ۟ܺ;->᩹:Ljava/util/Iterator;

    check-cast v1, Ll/ۗ۟ܺ;

    invoke-virtual {v1}, Ll/ۗ۟ܺ;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/ۙ۟ܺ;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 190
    invoke-virtual {v1}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Ll/ۙ۟ܺ;->᩸:I

    goto :goto_0

    .line 191
    :cond_0
    invoke-virtual {p0}, Ll/ۙ۟ܺ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 193
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, p0, Ll/ۙ۟ܺ;->᩸:I

    .line 197
    :goto_0
    iget v1, p0, Ll/ۙ۟ܺ;->᩸:I

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 195
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 213
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
