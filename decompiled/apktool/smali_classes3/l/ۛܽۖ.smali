.class public final Ll/ۛܽۖ;
.super Ll/᩺ܽۖ;
.source "FB0C"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ll/᩺ܽۖ;-><init>()V

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    .line 425
    instance-of v0, p1, Ll/ۛܽۖ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۛܽۖ;

    iget-object p1, p1, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final get(I)Ll/᩺ܽۖ;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܽۖ;

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 434
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 220
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(ILl/ᩳᩳۖ;)V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܽۖ;

    return-void
.end method

.method public final ֫(Ll/᩺ܽۖ;)V
    .locals 1

    if-nez p1, :cond_0

    .line 127
    sget-object p1, Ll/۟ܽۖ;->֫:Ll/۟ܽۖ;

    .line 129
    :cond_0
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 236
    iget-object v0, p0, Ll/ۛܽۖ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 238
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܽۖ;

    .line 266
    invoke-virtual {v0}, Ll/᩺ܽۖ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 240
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Array must have size 1, but has size "

    .line 0
    invoke-static {v1, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 240
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
