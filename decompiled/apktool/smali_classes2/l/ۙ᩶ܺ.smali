.class public abstract Ll/ۙ᩶ܺ;
.super Ljava/lang/Object;
.source "O3K3"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ۗ:Ljava/util/Iterator;

.field public final synthetic ۙ:Ll/ܽۙܺ;

.field public final ᩶:Ljava/util/Iterator;

.field public ᩸:Ljava/util/Collection;

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;)V
    .locals 0

    .line 1151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    .line 1152
    invoke-static {p1}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩶ܺ;->᩶:Ljava/util/Iterator;

    const/4 p1, 0x0

    .line 1153
    iput-object p1, p0, Ll/ۙ᩶ܺ;->᩹:Ljava/lang/Object;

    .line 1154
    iput-object p1, p0, Ll/ۙ᩶ܺ;->᩸:Ljava/util/Collection;

    .line 125
    sget-object p1, Ll/֨۫ܺ;->᩹:Ll/֨۫ܺ;

    .line 1155
    iput-object p1, p0, Ll/ۙ᩶ܺ;->ۗ:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1162
    iget-object v0, p0, Ll/ۙ᩶ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۙ᩶ܺ;->ۗ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1168
    iget-object v0, p0, Ll/ۙ᩶ܺ;->ۗ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1169
    iget-object v0, p0, Ll/ۙ᩶ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1170
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll/ۙ᩶ܺ;->᩹:Ljava/lang/Object;

    .line 1171
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, Ll/ۙ᩶ܺ;->᩸:Ljava/util/Collection;

    .line 1172
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/ۙ᩶ܺ;->ۗ:Ljava/util/Iterator;

    .line 1178
    :cond_0
    iget-object v0, p0, Ll/ۙ᩶ܺ;->ۗ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 1183
    iget-object v0, p0, Ll/ۙ᩶ܺ;->ۗ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1188
    iget-object v0, p0, Ll/ۙ᩶ܺ;->᩸:Ljava/util/Collection;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1189
    iget-object v0, p0, Ll/ۙ᩶ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1191
    :cond_0
    iget-object v0, p0, Ll/ۙ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->ܽ(Ll/ܽۙܺ;)V

    return-void
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
