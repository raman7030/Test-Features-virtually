.class public Ll/ۖۜۡ;
.super Ljava/lang/Object;
.source "R8WS"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 4

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۜۡ;->ܽ:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ۖۜۡ;->֫:Ljava/util/ArrayList;

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ۖۜۡ;->ۧ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 19
    iget-object v2, p0, Ll/ۖۜۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    iget-object v2, p0, Ll/ۖۜۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ܺۜۡ;->֫(Ll/۬ۜܽ;)Ll/ܺۜۡ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۖۜۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/ܺۜۡ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۖۜۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۜۡ;

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۖۜۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ۖۜۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
