.class public final Ll/ۧۙ᩵;
.super Ljava/lang/Object;
.source "NAWS"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/ܽۙ᩵;

.field public ᩶:I

.field public final ᩸:Ljava/util/Iterator;

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ܽۙ᩵;)V
    .locals 1

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ۧۙ᩵;->ۙ:Ll/ܽۙ᩵;

    .line 197
    invoke-static {p1}, Ll/ܽۙ᩵;->ۧ(Ll/ܽۙ᩵;)Ll/ܳۙ᩵;

    move-result-object p1

    check-cast p1, Ll/ۚۙ᩵;

    .line 240
    new-instance v0, Ll/֡ۙ᩵;

    invoke-direct {v0, p1}, Ll/֡ۙ᩵;-><init>(Ll/ۚۙ᩵;)V

    .line 197
    iput-object v0, p0, Ll/ۧۙ᩵;->᩸:Ljava/util/Iterator;

    const/4 p1, -0x1

    .line 198
    iput p1, p0, Ll/ۧۙ᩵;->᩶:I

    return-void
.end method

.method private final ֫()V
    .locals 2

    .line 202
    :cond_0
    iget-object v0, p0, Ll/ۧۙ᩵;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 204
    iget-object v1, p0, Ll/ۧۙ᩵;->ۙ:Ll/ܽۙ᩵;

    invoke-static {v1}, Ll/ܽۙ᩵;->֫(Ll/ܽۙ᩵;)Ll/ܺ᩹᩵;

    move-result-object v1

    check-cast v1, Ll/ᩴۙ᩵;

    invoke-virtual {v1, v0}, Ll/ᩴۙ᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    .line 205
    iput-object v0, p0, Ll/ۧۙ᩵;->᩹:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 206
    iput v0, p0, Ll/ۧۙ᩵;->᩶:I

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 210
    iput v0, p0, Ll/ۧۙ᩵;->᩶:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 226
    iget v0, p0, Ll/ۧۙ᩵;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 227
    invoke-direct {p0}, Ll/ۧۙ᩵;->֫()V

    .line 228
    :cond_0
    iget v0, p0, Ll/ۧۙ᩵;->᩶:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 214
    iget v0, p0, Ll/ۧۙ᩵;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 215
    invoke-direct {p0}, Ll/ۧۙ᩵;->֫()V

    .line 216
    :cond_0
    iget v0, p0, Ll/ۧۙ᩵;->᩶:I

    if-eqz v0, :cond_1

    .line 218
    iget-object v0, p0, Ll/ۧۙ᩵;->᩹:Ljava/lang/Object;

    const/4 v2, 0x0

    .line 219
    iput-object v2, p0, Ll/ۧۙ᩵;->᩹:Ljava/lang/Object;

    .line 220
    iput v1, p0, Ll/ۧۙ᩵;->᩶:I

    return-object v0

    .line 217
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
