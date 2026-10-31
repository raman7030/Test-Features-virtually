.class public final Ll/ܽܳۖ;
.super Ll/۠ᩳۖ;
.source "Q886"


# instance fields
.field public final ֫:Ll/᩷ܿۖ;

.field public final ۧ:Ll/۠ᩳۖ;

.field public final ܽ:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ll/ᩳܳۖ;Ll/۠ᩳۖ;Ll/۠ᩳۖ;Ll/᩷ܿۖ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 170
    iput-object p2, p0, Ll/ܽܳۖ;->ۧ:Ll/۠ᩳۖ;

    .line 171
    iput-object p3, p0, Ll/ܽܳۖ;->ܽ:Ll/۠ᩳۖ;

    .line 172
    iput-object p4, p0, Ll/ܽܳۖ;->֫:Ll/᩷ܿۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 4

    .line 177
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 178
    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 179
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 183
    :cond_0
    iget-object v1, p0, Ll/ܽܳۖ;->֫:Ll/᩷ܿۖ;

    invoke-interface {v1}, Ll/᩷ܿۖ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 185
    sget-object v2, Ll/ܳۜۖ;->᩹:Ll/ܳۜۖ;

    const-string v3, "duplicate key: "

    if-ne v0, v2, :cond_3

    .line 186
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 187
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 189
    iget-object v0, p0, Ll/ܽܳۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v0

    .line 190
    iget-object v2, p0, Ll/ܽܳۖ;->ܽ:Ll/۠ᩳۖ;

    invoke-virtual {v2, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v2

    .line 191
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 195
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    goto :goto_0

    .line 193
    :cond_1
    new-instance p1, Ll/ܳᩳۖ;

    .line 0
    invoke-static {v0, v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 193
    throw p1

    .line 197
    :cond_2
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    return-object v1

    .line 199
    :cond_3
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܽ()V

    .line 200
    :goto_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 201
    sget-object v0, Ll/᩺ᩳۖ;->֫:Ll/᩺ᩳۖ;

    invoke-virtual {v0, p1}, Ll/᩺ᩳۖ;->֫(Ll/ܿۜۖ;)V

    .line 202
    iget-object v0, p0, Ll/ܽܳۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v0

    .line 203
    iget-object v2, p0, Ll/ܽܳۖ;->ܽ:Ll/۠ᩳۖ;

    invoke-virtual {v2, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v2

    .line 204
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    .line 206
    :cond_4
    new-instance p1, Ll/ܳᩳۖ;

    .line 0
    invoke-static {v0, v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 206
    throw p1

    .line 209
    :cond_5
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩻()V

    return-object v1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 161
    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_0

    .line 217
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 222
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܽ()V

    .line 223
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 224
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    .line 225
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/ܽܳۖ;->ܽ:Ll/۠ᩳۖ;

    invoke-virtual {v1, p1, v0}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    goto :goto_0

    .line 227
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܳ()V

    return-void
.end method
