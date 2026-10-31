.class public final Ll/᩹۫ܺ;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ll/ۛۤܺ;


# instance fields
.field public ᩶:Ljava/lang/Object;

.field public ᩸:Z

.field public final ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 1187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    iput-object p1, p0, Ll/᩹۫ܺ;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1193
    iget-boolean v0, p0, Ll/᩹۫ܺ;->᩸:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩹۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

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
    .locals 2

    .line 1199
    iget-boolean v0, p0, Ll/᩹۫ܺ;->᩸:Z

    if-nez v0, :cond_0

    .line 1200
    iget-object v0, p0, Ll/᩹۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1203
    :cond_0
    iget-object v0, p0, Ll/᩹۫ܺ;->᩶:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1204
    iput-boolean v1, p0, Ll/᩹۫ܺ;->᩸:Z

    const/4 v1, 0x0

    .line 1205
    iput-object v1, p0, Ll/᩹۫ܺ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final peek()Ljava/lang/Object;
    .locals 1

    .line 1218
    iget-boolean v0, p0, Ll/᩹۫ܺ;->᩸:Z

    if-nez v0, :cond_0

    .line 1219
    iget-object v0, p0, Ll/᩹۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۫ܺ;->᩶:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 1220
    iput-boolean v0, p0, Ll/᩹۫ܺ;->᩸:Z

    .line 1223
    :cond_0
    iget-object v0, p0, Ll/᩹۫ܺ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 1211
    iget-boolean v0, p0, Ll/᩹۫ܺ;->᩸:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Can\'t remove after you\'ve peeked at next"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 1212
    iget-object v0, p0, Ll/᩹۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
