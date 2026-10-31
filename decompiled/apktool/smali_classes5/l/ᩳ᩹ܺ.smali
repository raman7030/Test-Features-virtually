.class public final Ll/ᩳ᩹ܺ;
.super Ll/۠᩸ܺ;
.source "E3QI"


# instance fields
.field public final synthetic ᩹:Ll/ܳ᩶ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ᩶ܺ;)V
    .locals 0

    .line 4408
    iput-object p1, p0, Ll/ᩳ᩹ܺ;->᩹:Ll/ܳ᩶ܺ;

    invoke-direct {p0, p1}, Ll/۠᩸ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 4417
    iget-object v0, p0, Ll/ᩳ᩹ܺ;->᩹:Ll/ܳ᩶ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ᩶ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 4412
    new-instance v0, Ll/ܽ᩹ܺ;

    iget-object v1, p0, Ll/ᩳ᩹ܺ;->᩹:Ll/ܳ᩶ܺ;

    .line 4315
    invoke-direct {v0, v1}, Ll/ۧ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 4422
    iget-object v0, p0, Ll/ᩳ᩹ܺ;->᩹:Ll/ܳ᩶ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ᩶ܺ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
