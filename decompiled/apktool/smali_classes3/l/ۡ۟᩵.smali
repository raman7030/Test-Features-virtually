.class public final Ll/ۡ۟᩵;
.super Ljava/lang/Object;
.source "54F8"


# instance fields
.field public final ֫:Ll/ۖ۟᩵;

.field public volatile ۧ:Ll/ۧܰ᩵;

.field public final ܳ:Ll/ۨܰ᩵;

.field public final ܽ:Ll/ۤܰ᩵;

.field public final ܿ:Ljava/util/Map;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۢ۟᩵;)V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iget-object v0, p1, Ll/ۢ۟᩵;->ܿ:Ll/ۨܰ᩵;

    iput-object v0, p0, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 42
    iget-object v0, p1, Ll/ۢ۟᩵;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۡ۟᩵;->ᩳ:Ljava/lang/String;

    .line 43
    iget-object v0, p1, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    new-instance v1, Ll/ۤܰ᩵;

    invoke-direct {v1, v0}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    .line 43
    iput-object v1, p0, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    .line 44
    iget-object v0, p1, Ll/ۢ۟᩵;->֫:Ll/ۖ۟᩵;

    iput-object v0, p0, Ll/ۡ۟᩵;->֫:Ll/ۖ۟᩵;

    .line 45
    iget-object p1, p1, Ll/ۢ۟᩵;->ᩳ:Ljava/util/Map;

    sget-object v0, Ll/᩶۟᩵;->֫:[B

    .line 234
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_0

    .line 236
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 45
    :goto_0
    iput-object p1, p0, Ll/ۡ۟᩵;->ܿ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Request{method="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡ۟᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۟᩵;->ܿ:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    invoke-virtual {v0, p1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۖ۟᩵;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۡ۟᩵;->֫:Ll/ۖ۟᩵;

    return-object v0
.end method

.method public final ۧ()Ll/ۧܰ᩵;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۡ۟᩵;->ۧ:Ll/ۧܰ᩵;

    if-eqz v0, :cond_0

    return-object v0

    .line 102
    :cond_0
    iget-object v0, p0, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    invoke-static {v0}, Ll/ۧܰ᩵;->֫(Ll/ۤܰ᩵;)Ll/ۧܰ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ۡ۟᩵;->ۧ:Ll/ۧܰ᩵;

    return-object v0
.end method

.method public final ܳ()Ll/ۢ۟᩵;
    .locals 4

    .line 93
    new-instance v0, Ll/ۢ۟᩵;

    .line 133
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 126
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v1, v0, Ll/ۢ۟᩵;->ᩳ:Ljava/util/Map;

    .line 134
    iget-object v2, p0, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    iput-object v2, v0, Ll/ۢ۟᩵;->ܿ:Ll/ۨܰ᩵;

    .line 135
    iget-object v2, p0, Ll/ۡ۟᩵;->ᩳ:Ljava/lang/String;

    iput-object v2, v0, Ll/ۢ۟᩵;->ܽ:Ljava/lang/String;

    .line 136
    iget-object v2, p0, Ll/ۡ۟᩵;->֫:Ll/ۖ۟᩵;

    iput-object v2, v0, Ll/ۢ۟᩵;->֫:Ll/ۖ۟᩵;

    .line 137
    iget-object v2, p0, Ll/ۡ۟᩵;->ܿ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    :goto_0
    iput-object v1, v0, Ll/ۢ۟᩵;->ᩳ:Ljava/util/Map;

    .line 140
    iget-object v1, p0, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    invoke-virtual {v1}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object v1

    iput-object v1, v0, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    return-object v0
.end method

.method public final ܽ()Ll/ۤܰ᩵;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۡ۟᩵;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    invoke-virtual {v0}, Ll/ۨܰ᩵;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/ۨܰ᩵;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    return-object v0
.end method
