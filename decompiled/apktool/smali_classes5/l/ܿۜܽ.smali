.class public final Ll/ܿۜܽ;
.super Ll/᩸ᩳܽ;
.source "X9RH"


# instance fields
.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۛۜܽ;)V
    .locals 6

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ܿۜܽ;->᩸:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    iget-object v2, p0, Ll/ܿۜܽ;->᩸:Ljava/util/ArrayList;

    new-instance v3, Ll/ܳۜܽ;

    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v4

    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v5

    .line 8
    invoke-direct {v3, v4, v5}, Ll/᩹ᩳܽ;-><init>(II)V

    .line 17
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۧ(I)Ll/᩵᩻ܽ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ܿۜܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵᩻ܽ;

    return-object p1
.end method

.method public final ᩷()I
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ܿۜܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
