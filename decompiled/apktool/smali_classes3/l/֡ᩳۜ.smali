.class public final Ll/֡ᩳۜ;
.super Ll/ۜᩳܽ;
.source "W6LU"


# instance fields
.field public ۗ:I

.field public final ۙ:Ll/ۜ᩻ܽ;

.field public final ۬:Ljava/util/HashMap;

.field public final ᩶:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/֡᩻ܽ;Ll/ۜ᩻ܽ;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4

    .line 187
    move-object v0, p1

    check-cast v0, Ll/ۤᩳܽ;

    invoke-direct {p0, v0}, Ll/ۜᩳܽ;-><init>(Ll/ۤᩳܽ;)V

    .line 181
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡ᩳۜ;->᩶:Ljava/util/HashMap;

    .line 182
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡ᩳۜ;->۬:Ljava/util/HashMap;

    .line 188
    iput-object p2, p0, Ll/֡ᩳۜ;->ۙ:Ll/ۜ᩻ܽ;

    const-string v0, "RESOURCE_PATCH_CORRUPT"

    if-nez p2, :cond_1

    :try_start_0
    const-string v1, "default"

    .line 190
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p3

    :goto_0
    check-cast p1, Ll/ۤᩳܽ;

    invoke-virtual {p1}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object p1

    check-cast p1, Ll/۠ᩳܽ;

    invoke-virtual {p1}, Ll/۠ᩳܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object p1

    goto :goto_1

    .line 191
    :cond_1
    invoke-interface {p2}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Ll/ۜᩳܽ;->᩹:Ll/᩸ܽܽ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    invoke-static {p0}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-nez p2, :cond_2

    const/4 p1, -0x1

    goto :goto_2

    .line 198
    :cond_2
    invoke-interface {p2}, Ll/ۜ᩻ܽ;->֨()I

    move-result p1

    :goto_2
    iput p1, p0, Ll/֡ᩳۜ;->ۗ:I

    .line 199
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۘᩳۜ;

    .line 200
    iget p4, p3, Ll/ۘᩳۜ;->ܳ:I

    const v1, 0xffff

    and-int/2addr p4, v1

    if-eqz p2, :cond_3

    .line 201
    invoke-interface {p2, p4}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    iget-object v1, p0, Ll/֡ᩳۜ;->۬:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p3, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    .line 204
    iget v1, p0, Ll/֡ᩳۜ;->ۗ:I

    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/֡ᩳۜ;->ۗ:I

    .line 205
    iget-object v1, p0, Ll/֡ᩳۜ;->᩶:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object p3, p3, Ll/ۘᩳۜ;->ܽ:[B

    invoke-static {p0, p4, p3}, Ll/᩻ܽۜ;->֫(Ll/ۜ᩻ܽ;I[B)Ll/ᩳܽۜ;

    move-result-object p3

    invoke-virtual {v1, v2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    const-string p1, "Added resource variant already exists."

    .line 219
    invoke-static {v0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 202
    throw p1

    :cond_5
    return-void

    :cond_6
    const-string p1, "Resource patch variant is not canonical."

    .line 219
    invoke-static {v0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 196
    throw p1

    :catch_0
    const-string p1, "Resource patch variant is invalid."

    .line 219
    invoke-static {v0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 193
    throw p1
.end method


# virtual methods
.method public final ֨()I
    .locals 1

    .line 209
    iget v0, p0, Ll/֡ᩳۜ;->ۗ:I

    return v0
.end method

.method public final ۚ֫()Z
    .locals 1

    .line 211
    iget-object v0, p0, Ll/֡ᩳۜ;->ۙ:Ll/ۜ᩻ܽ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۜ᩻ܽ;->ۚ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I)Ll/᩷᩻ܽ;
    .locals 2

    .line 214
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/֡ᩳۜ;->᩶:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷᩻ܽ;

    return-object p1

    :cond_0
    iget-object v0, p0, Ll/֡ᩳۜ;->ۙ:Ll/ۜ᩻ܽ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {v0, p1}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ܺ(I)Z
    .locals 2

    .line 210
    iget-object v0, p0, Ll/֡ᩳۜ;->᩶:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֡ᩳۜ;->ۙ:Ll/ۜ᩻ܽ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll/ۜ᩻ܽ;->ܺ(I)Z

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

.method public final ܽ(I)Ljava/lang/String;
    .locals 2

    .line 213
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/֡ᩳۜ;->۬:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    iget-object v0, p0, Ll/֡ᩳۜ;->ۙ:Ll/ۜ᩻ܽ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {v0, p1}, Ll/ۜ᩻ܽ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷ۧ()Z
    .locals 1

    .line 212
    iget-object v0, p0, Ll/֡ᩳۜ;->ۙ:Ll/ۜ᩻ܽ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۜ᩻ܽ;->᩷ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
