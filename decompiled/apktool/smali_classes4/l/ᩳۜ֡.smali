.class public Ll/ᩳۜ֡;
.super Ljava/lang/Object;
.source "TAQV"


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩳۜ֡;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ᩳۜ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ᩳۜ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۜ֡;

    return-object p1
.end method
