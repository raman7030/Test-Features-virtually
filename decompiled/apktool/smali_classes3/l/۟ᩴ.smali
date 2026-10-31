.class public abstract Ll/۟ᩴ;
.super Ll/֫᩵;
.source "N5Q6"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ll/᩺ᩴ;

.field public ᩹:Ll/᩺ᩴ;


# direct methods
.method public constructor <init>(Ll/᩺ᩴ;Ll/᩺ᩴ;)V
    .locals 0

    .line 240
    invoke-direct {p0}, Ll/֫᩵;-><init>()V

    .line 241
    iput-object p2, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    .line 242
    iput-object p1, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 247
    iget-object v0, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 277
    iget-object v0, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    .line 269
    iget-object v1, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 272
    :cond_0
    invoke-virtual {p0, v0}, Ll/۟ᩴ;->ܽ(Ll/᩺ᩴ;)Ll/᩺ᩴ;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 278
    :goto_1
    iput-object v1, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    return-object v0
.end method

.method public final ֫(Ll/᩺ᩴ;)V
    .locals 2

    .line 253
    iget-object v0, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    if-ne p1, v0, :cond_0

    .line 254
    iput-object v1, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    .line 255
    iput-object v1, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    .line 258
    :cond_0
    iget-object v0, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    if-ne v0, p1, :cond_1

    .line 259
    invoke-virtual {p0, v0}, Ll/۟ᩴ;->ۧ(Ll/᩺ᩴ;)Ll/᩺ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    .line 262
    :cond_1
    iget-object v0, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    if-ne v0, p1, :cond_4

    .line 269
    iget-object p1, p0, Ll/۟ᩴ;->᩸:Ll/᩺ᩴ;

    if-eq v0, p1, :cond_3

    if-nez p1, :cond_2

    goto :goto_0

    .line 272
    :cond_2
    invoke-virtual {p0, v0}, Ll/۟ᩴ;->ܽ(Ll/᩺ᩴ;)Ll/᩺ᩴ;

    move-result-object v1

    .line 263
    :cond_3
    :goto_0
    iput-object v1, p0, Ll/۟ᩴ;->᩹:Ll/᩺ᩴ;

    :cond_4
    return-void
.end method

.method public abstract ۧ(Ll/᩺ᩴ;)Ll/᩺ᩴ;
.end method

.method public abstract ܽ(Ll/᩺ᩴ;)Ll/᩺ᩴ;
.end method
