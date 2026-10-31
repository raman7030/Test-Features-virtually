.class public final Ll/ۤᩴ;
.super Ll/ۧ᩵;
.source "659W"


# instance fields
.field public final ۗ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ll/ۧ᩵;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۤᩴ;->ۗ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ll/᩺ᩴ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۤᩴ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ᩴ;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 59
    invoke-super {p0, p1}, Ll/ۧ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 60
    iget-object v1, p0, Ll/ۤᩴ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫(Ll/ܳۡ֫;)Ljava/util/Map$Entry;
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۤᩴ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ᩴ;

    iget-object p1, p1, Ll/᩺ᩴ;->᩶:Ll/᩺ᩴ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 49
    invoke-virtual {p0, p1}, Ll/ۤᩴ;->get(Ljava/lang/Object;)Ll/᩺ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    iget-object p1, v0, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    return-object p1

    .line 53
    :cond_0
    iget-object v0, p0, Ll/ۤᩴ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {p0, p1, p2}, Ll/ۧ᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩺ᩴ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ܳۡ֫;)Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۤᩴ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
