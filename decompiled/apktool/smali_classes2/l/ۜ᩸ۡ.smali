.class public final Ll/ۜ᩸ۡ;
.super Ljava/lang/Object;
.source "O5NZ"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜ᩸ۡ;->֫:Ljava/util/ArrayList;

    .line 208
    iput-object p1, p0, Ll/ۜ᩸ۡ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 4

    .line 227
    iget-object v0, p0, Ll/ۜ᩸ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩸ۡ;

    .line 228
    iget-object v2, v1, Ll/ۜ᩸ۡ;->ۧ:Ljava/lang/String;

    const-string v3, "name"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "unknown"

    .line 230
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const-string v3, "visibility"

    .line 232
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    const-string v3, "GroundOverlay"

    .line 234
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    const-string v3, "Placemark"

    .line 236
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 237
    invoke-virtual {v1}, Ll/ۜ᩸ۡ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_5
    const-string v3, "Folder"

    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 241
    invoke-virtual {v1}, Ll/ۜ᩸ۡ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_6
    :goto_1
    const/4 v0, 0x0

    return v0

    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public final varargs ֫([Ljava/lang/String;)Z
    .locals 6

    .line 212
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    .line 213
    iget-object v4, p0, Ll/ۜ᩸ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۜ᩸ۡ;

    .line 214
    iget-object v5, v5, Ll/ۜ᩸ۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final ۧ()Z
    .locals 5

    const-string v0, "name"

    .line 223
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۜ᩸ۡ;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۜ᩸ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const-string v0, "MultiGeometry"

    const-string v2, "Polygon"

    const-string v3, "ExtendedData"

    const-string v4, "Point"

    filled-new-array {v3, v4, v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۜ᩸ۡ;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
