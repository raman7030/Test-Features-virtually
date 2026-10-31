.class public final Ll/᩻ۖۜ;
.super Ljava/lang/Object;
.source "D6X3"

# interfaces
.implements Ll/ۗۖۜ;


# instance fields
.field public final synthetic ֫:Ll/۬ۖۜ;

.field public final synthetic ۧ:Ll/۟ۢۜ;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:Ll/᩵ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;Ll/᩵ۖۜ;Ljava/lang/String;Ll/۟ۢۜ;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۖۜ;->֫:Ll/۬ۖۜ;

    iput-object p2, p0, Ll/᩻ۖۜ;->ᩳ:Ll/᩵ۖۜ;

    iput-object p3, p0, Ll/᩻ۖۜ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/᩻ۖۜ;->ۧ:Ll/۟ۢۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)Ll/ۚۖۜ;
    .locals 7

    .line 137
    iget-object v0, p0, Ll/᩻ۖۜ;->ᩳ:Ll/᩵ۖۜ;

    invoke-interface {v0, p1}, Ll/᩵ۖۜ;->֫(Ll/ܶ᩵ܿ;)V

    .line 138
    iget-object v0, p0, Ll/᩻ۖۜ;->֫:Ll/۬ۖۜ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object p1

    .line 139
    iget-object v0, p0, Ll/᩻ۖۜ;->ۧ:Ll/۟ۢۜ;

    iget-object v0, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    iget-object v2, p0, Ll/᩻ۖۜ;->ܽ:Ljava/lang/String;

    invoke-static {v2, p1, v0, v1}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    .line 140
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-ltz v1, :cond_0

    .line 141
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v3

    const-wide v5, 0x1fffffffffffffL

    cmp-long v1, v3, v5

    if-gtz v1, :cond_0

    .line 147
    new-instance v0, Ll/ۚۖۜ;

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Ll/ۚۖۜ;-><init>(JLjava/lang/Object;)V

    return-object v0

    :cond_0
    const-string p1, "produce_temp"

    .line 145
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v3, "The prepared file size exceeds the supported JSON integer range."

    .line 142
    invoke-static {v1, v3, v2, v0, p1}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ll/۟ۢۜ;)V
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩻ۖۜ;->ᩳ:Ll/᩵ۖۜ;

    invoke-interface {v0, p1}, Ll/᩵ۖۜ;->֫(Ll/۟ۢۜ;)V

    return-void
.end method
