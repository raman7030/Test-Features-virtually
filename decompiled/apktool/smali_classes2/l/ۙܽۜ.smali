.class public final Ll/ۙܽۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1352
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1353
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ۙܽۜ;->֫:Ljava/util/IdentityHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡᩻ܽ;)Ljava/util/ArrayList;
    .locals 2

    .line 1359
    iget-object v0, p0, Ll/ۙܽۜ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 1361
    invoke-interface {p1}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Ll/ۡᩳۜ;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 1362
    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method
