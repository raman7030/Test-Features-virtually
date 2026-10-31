.class public final Ll/᩹ۗۡ;
.super Ljava/lang/Object;
.source "V3XC"


# instance fields
.field public final ֫:Ljava/util/TreeMap;

.field public final ۧ:Ll/ۧۤᩴ;

.field public ܽ:Ll/ۨۡᩴ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/᩹ۗۡ;->֫:Ljava/util/TreeMap;

    .line 368
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    .line 18
    iput-object v0, p0, Ll/᩹ۗۡ;->ۧ:Ll/ۧۤᩴ;

    .line 93
    sget-object v0, Ll/۟ۡᩴ;->֫:Ll/᩺ۡᩴ;

    .line 19
    iput-object v0, p0, Ll/᩹ۗۡ;->ܽ:Ll/ۨۡᩴ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۨۡᩴ;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/᩹ۗۡ;->ܽ:Ll/ۨۡᩴ;

    return-object v0
.end method

.method public final ֫(Ll/ۗۗۡ;)V
    .locals 2

    .line 26
    iget-object v0, p0, Ll/᩹ۗۡ;->֫:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۛۡᩴ;)V
    .locals 0

    .line 72
    iput-object p1, p0, Ll/᩹ۗۡ;->ܽ:Ll/ۨۡᩴ;

    return-void
.end method

.method public final ֫(Ll/ۡ۬ۡ;)V
    .locals 2

    .line 58
    iget-object v0, p0, Ll/᩹ۗۡ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 59
    check-cast v1, Ll/᩶ۗۡ;

    .line 60
    invoke-virtual {v1, p1}, Ll/᩶ۗۡ;->֫(Ll/ۡ۬ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩹ۗۡ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/᩶ۗۡ;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩹ۗۡ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ۗۡ;

    return-object p1
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 83
    :cond_0
    iget-object v0, p0, Ll/᩹ۗۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    return-object v1

    .line 87
    :cond_1
    invoke-virtual {v0, p1, p1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method
