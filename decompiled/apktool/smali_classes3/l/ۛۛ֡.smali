.class public final Ll/ۛۛ֡;
.super Ll/֡᩵ۚ;
.source "Z556"


# instance fields
.field public final synthetic ᩸:Ll/ܽۨ֡;

.field public final synthetic ᩹:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ܽۨ֡;Ljava/util/List;)V
    .locals 0

    .line 226
    iput-object p1, p0, Ll/ۛۛ֡;->᩸:Ll/ܽۨ֡;

    iput-object p2, p0, Ll/ۛۛ֡;->᩹:Ljava/util/List;

    .line 42
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 230
    new-instance v0, Ll/֡۟֡;

    .line 231
    iget-object v1, p0, Ll/ۛۛ֡;->᩸:Ll/ܽۨ֡;

    invoke-virtual {v1}, Ll/ܽۨ֡;->֡()Ljava/util/List;

    move-result-object v2

    .line 252
    invoke-virtual {v1}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 254
    invoke-virtual {v1}, Ll/᩷ۨ֡;->ۧ()Ljava/util/Iterator;

    move-result-object v1

    goto :goto_0

    .line 256
    :cond_0
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v1

    .line 232
    :goto_0
    iget-object v3, p0, Ll/ۛۛ֡;->᩹:Ljava/util/List;

    invoke-direct {v0, v3, v2, v1}, Ll/֡۟֡;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 237
    iget-object v0, p0, Ll/ۛۛ֡;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
