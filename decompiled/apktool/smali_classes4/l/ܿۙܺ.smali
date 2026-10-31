.class public final Ll/ܿۙܺ;
.super Ljava/util/AbstractCollection;
.source "M3XQ"


# instance fields
.field public final synthetic ᩸:Ll/ܽۙܺ;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;)V
    .locals 0

    .line 179
    iput-object p1, p0, Ll/ܿۙܺ;->᩸:Ll/ܽۙܺ;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 197
    iget-object v0, p0, Ll/ܿۙܺ;->᩸:Ll/ܽۙܺ;

    invoke-interface {v0}, Ll/֡ۤܺ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 192
    iget-object v0, p0, Ll/ܿۙܺ;->᩸:Ll/ܽۙܺ;

    invoke-virtual {v0, p1}, Ll/ܳۙܺ;->֫(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1213
    new-instance v0, Ll/ܶ᩶ܺ;

    iget-object v1, p0, Ll/ܿۙܺ;->᩸:Ll/ܽۙܺ;

    invoke-direct {v0, v1}, Ll/ۙ᩶ܺ;-><init>(Ll/ܽۙܺ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ܿۙܺ;->᩸:Ll/ܽۙܺ;

    invoke-interface {v0}, Ll/֡ۤܺ;->size()I

    move-result v0

    return v0
.end method
