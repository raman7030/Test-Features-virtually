.class public final Ll/ۜ۫֡;
.super Ljava/util/AbstractSet;
.source "02RL"


# instance fields
.field public final synthetic ᩸:Ll/᩷۫֡;

.field public final synthetic ᩹:Ll/ܺ۫֡;


# direct methods
.method public constructor <init>(Ll/᩷۫֡;Ll/ܺ۫֡;)V
    .locals 0

    .line 30
    iput-object p1, p0, Ll/ۜ۫֡;->᩸:Ll/᩷۫֡;

    iput-object p2, p0, Ll/ۜ۫֡;->᩹:Ll/ܺ۫֡;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 30
    check-cast p1, Ll/ᩳ۫֡;

    .line 68
    invoke-virtual {p1}, Ll/ᩳ۫֡;->ܿ()Z

    move-result v0

    iget-object v1, p0, Ll/ۜ۫֡;->᩸:Ll/᩷۫֡;

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Ll/ۜ۫֡;->᩹:Ll/ܺ۫֡;

    .line 14
    iput-object v0, p1, Ll/ᩳ۫֡;->᩸:Ll/ܺ۫֡;

    .line 72
    invoke-static {v1, p1}, Ll/᩷۫֡;->֫(Ll/᩷۫֡;Ll/ᩳ۫֡;)V

    const/4 p1, 0x1

    return p1

    .line 69
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ll/᩷۫֡;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 34
    iget-object v0, p0, Ll/ۜ۫֡;->᩸:Ll/᩷۫֡;

    invoke-static {v0}, Ll/᩷۫֡;->֫(Ll/᩷۫֡;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 36
    new-instance v1, Ll/᩻۫֡;

    invoke-direct {v1, v0}, Ll/᩻۫֡;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۜ۫֡;->᩸:Ll/᩷۫֡;

    invoke-static {v0}, Ll/᩷۫֡;->֫(Ll/᩷۫֡;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
