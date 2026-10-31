.class public final Ll/᩻۫֡;
.super Ljava/lang/Object;
.source "02RL"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ll/ᩳ۫֡;

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻۫֡;->᩹:Ljava/util/Iterator;

    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Ll/᩻۫֡;->᩸:Ll/ᩳ۫֡;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩻۫֡;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩻۫֡;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۫֡;

    iput-object v0, p0, Ll/᩻۫֡;->᩸:Ll/ᩳ۫֡;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 53
    iget-object v0, p0, Ll/᩻۫֡;->᩸:Ll/ᩳ۫֡;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 14
    iput-object v1, v0, Ll/ᩳ۫֡;->᩸:Ll/ܺ۫֡;

    .line 56
    :cond_0
    iget-object v0, p0, Ll/᩻۫֡;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
