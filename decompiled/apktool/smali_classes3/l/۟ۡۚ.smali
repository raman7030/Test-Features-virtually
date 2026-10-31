.class public final Ll/۟ۡۚ;
.super Ljava/lang/Object;
.source "Y5SH"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ll/ۧܺۚ;

.field public final synthetic ᩹:Ll/ᩳܺۚ;


# direct methods
.method public constructor <init>(Ll/ᩳܺۚ;)V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۡۚ;->᩹:Ll/ᩳܺۚ;

    .line 210
    invoke-static {p1}, Ll/ᩳܺۚ;->ۧ(Ll/ᩳܺۚ;)Ll/ۧܺۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۡۚ;->᩸:Ll/ۧܺۚ;

    .line 211
    invoke-virtual {p0}, Ll/۟ۡۚ;->֫()Ll/ۧܺۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۡۚ;->᩸:Ll/ۧܺۚ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 240
    iget-object v0, p0, Ll/۟ۡۚ;->᩸:Ll/ۧܺۚ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 246
    invoke-virtual {p0}, Ll/۟ۡۚ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    iget-object v0, p0, Ll/۟ۡۚ;->᩸:Ll/ۧܺۚ;

    .line 250
    invoke-virtual {p0}, Ll/۟ۡۚ;->֫()Ll/ۧܺۚ;

    move-result-object v1

    iput-object v1, p0, Ll/۟ۡۚ;->᩸:Ll/ۧܺۚ;

    return-object v0

    .line 247
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 257
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ֫()Ll/ۧܺۚ;
    .locals 5

    .line 221
    iget-object v0, p0, Ll/۟ۡۚ;->᩸:Ll/ۧܺۚ;

    iget-object v0, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    .line 223
    iget-object v1, p0, Ll/۟ۡۚ;->᩹:Ll/ᩳܺۚ;

    invoke-static {v1}, Ll/ᩳܺۚ;->֫(Ll/ᩳܺۚ;)Ll/ۧܺۚ;

    move-result-object v2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_0
    :goto_0
    iget-object v2, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    invoke-static {v1}, Ll/ᩳܺۚ;->֫(Ll/ᩳܺۚ;)Ll/ۧܺۚ;

    move-result-object v3

    if-eq v2, v3, :cond_1

    .line 228
    iget v2, v0, Ll/ۧܺۚ;->֫:I

    iget-object v3, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    iget v4, v3, Ll/ۧܺۚ;->ܿ:I

    if-ne v2, v4, :cond_1

    .line 322
    iget-object v2, v0, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    iget-object v3, v3, Ll/ۧܺۚ;->ۧ:Ljava/util/ArrayList;

    .line 229
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 340
    iget-object v2, v0, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    iget v3, v2, Ll/ۧܺۚ;->֫:I

    iput v3, v0, Ll/ۧܺۚ;->֫:I

    .line 334
    iget-object v3, v2, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    iget-object v4, v2, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    iput-object v4, v3, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    .line 335
    iget-object v2, v2, Ll/ۧܺۚ;->ᩳ:Ll/ۧܺۚ;

    iput-object v3, v2, Ll/ۧܺۚ;->ܽ:Ll/ۧܺۚ;

    goto :goto_0

    :cond_1
    return-object v0
.end method
