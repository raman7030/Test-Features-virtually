.class public final Ll/ܰᩴ;
.super Ll/֫᩵;
.source "N5Q6"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/ۧ᩵;

.field public ᩸:Z

.field public ᩹:Ll/᩺ᩴ;


# direct methods
.method public constructor <init>(Ll/ۧ᩵;)V
    .locals 0

    .line 329
    iput-object p1, p0, Ll/ܰᩴ;->᩶:Ll/ۧ᩵;

    invoke-direct {p0}, Ll/֫᩵;-><init>()V

    const/4 p1, 0x1

    .line 327
    iput-boolean p1, p0, Ll/ܰᩴ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 343
    iget-boolean v0, p0, Ll/ܰᩴ;->᩸:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 344
    iget-object v0, p0, Ll/ܰᩴ;->᩶:Ll/ۧ᩵;

    iget-object v0, v0, Ll/ۧ᩵;->ۙ:Ll/᩺ᩴ;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 346
    :cond_1
    iget-object v0, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ll/᩺ᩴ;->᩹:Ll/᩺ᩴ;

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 351
    iget-boolean v0, p0, Ll/ܰᩴ;->᩸:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 352
    iput-boolean v0, p0, Ll/ܰᩴ;->᩸:Z

    .line 353
    iget-object v0, p0, Ll/ܰᩴ;->᩶:Ll/ۧ᩵;

    iget-object v0, v0, Ll/ۧ᩵;->ۙ:Ll/᩺ᩴ;

    iput-object v0, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    goto :goto_1

    .line 355
    :cond_0
    iget-object v0, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/᩺ᩴ;->᩹:Ll/᩺ᩴ;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    .line 357
    :goto_1
    iget-object v0, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    return-object v0
.end method

.method public final ֫(Ll/᩺ᩴ;)V
    .locals 1

    .line 335
    iget-object v0, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    if-ne p1, v0, :cond_1

    .line 336
    iget-object p1, v0, Ll/᩺ᩴ;->᩶:Ll/᩺ᩴ;

    iput-object p1, p0, Ll/ܰᩴ;->᩹:Ll/᩺ᩴ;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 337
    :goto_0
    iput-boolean p1, p0, Ll/ܰᩴ;->᩸:Z

    :cond_1
    return-void
.end method
