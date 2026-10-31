.class public final Ll/ܽܳۘ;
.super Ljava/lang/Object;
.source "01M8"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ll/ۜܳۘ;

.field public final ۙ:Ljava/util/Iterator;

.field public final ᩶:Ljava/util/Iterator;

.field public ᩸:Ll/᩹ܳۘ;

.field public ᩹:Ll/᩹ܳۘ;


# direct methods
.method public constructor <init>(Ll/ۜܳۘ;)V
    .locals 3

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܳۘ;->ۗ:Ll/ۜܳۘ;

    .line 134
    invoke-interface {p1}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܳۘ;->᩶:Ljava/util/Iterator;

    .line 136
    invoke-interface {p1}, Ll/֫ܳۘ;->ܽ()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܳۘ;->ۙ:Ljava/util/Iterator;

    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳۘ;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iput-object v0, p0, Ll/ܽܳۘ;->᩸:Ll/᩹ܳۘ;

    .line 141
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ll/᩹ܳۘ;

    :cond_1
    iput-object v2, p0, Ll/ܽܳۘ;->᩹:Ll/᩹ܳۘ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ܽܳۘ;->᩸:Ll/᩹ܳۘ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܽܳۘ;->᩹:Ll/᩹ܳۘ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 151
    iget-object v0, p0, Ll/ܽܳۘ;->᩸:Ll/᩹ܳۘ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 153
    :cond_0
    iget-object v2, p0, Ll/ܽܳۘ;->᩹:Ll/᩹ܳۘ;

    if-nez v2, :cond_1

    goto :goto_0

    .line 156
    :cond_1
    iget v3, v2, Ll/᩹ܳۘ;->ܽ:I

    iget v4, v0, Ll/᩹ܳۘ;->ܽ:I

    if-lt v3, v4, :cond_4

    iget v2, v2, Ll/᩹ܳۘ;->ᩳ:I

    iget v3, v0, Ll/᩹ܳۘ;->ᩳ:I

    if-ge v2, v3, :cond_2

    goto :goto_1

    .line 165
    :cond_2
    :goto_0
    iget-object v2, p0, Ll/ܽܳۘ;->᩶:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    :cond_3
    iput-object v1, p0, Ll/ܽܳۘ;->᩸:Ll/᩹ܳۘ;

    .line 166
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    new-instance v2, Ll/۬ܳۘ;

    invoke-direct {v2, v0, v1}, Ll/۬ܳۘ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    .line 160
    :cond_4
    :goto_1
    iget-object v0, p0, Ll/ܽܳۘ;->᩹:Ll/᩹ܳۘ;

    .line 161
    iget-object v2, p0, Ll/ܽܳۘ;->ۙ:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    :cond_5
    iput-object v1, p0, Ll/ܽܳۘ;->᩹:Ll/᩹ܳۘ;

    .line 162
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    new-instance v2, Ll/۬ܳۘ;

    invoke-direct {v2, v0, v1}, Ll/۬ܳۘ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public final remove()V
    .locals 1

    .line 172
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
