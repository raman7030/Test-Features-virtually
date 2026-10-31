.class public final enum Ll/᩷ۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InTableBody"

    const/16 v1, 0xc

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩷ۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1223
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 1

    .line 1280
    sget-object v0, Ll/᩺ۚۚ;->᩻֫:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1
.end method

.method private ܽ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 1

    const-string v0, "tbody"

    .line 1269
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "thead"

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "tfoot"

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۢ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1271
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    const/4 p1, 0x0

    return p1

    .line 1274
    :cond_0
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܿ()V

    .line 1275
    invoke-virtual {p2}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 1276
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 4

    .line 1225
    sget-object v0, Ll/᩸ۚۚ;->֫:[I

    iget-object v1, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 1263
    invoke-direct {p0, p1, p2}, Ll/᩷ۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 466
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1245
    sget-object v1, Ll/ۨۚۚ;->ܰ:[Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1246
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1247
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1250
    :cond_1
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܿ()V

    .line 1251
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 1252
    sget-object p1, Ll/᩺ۚۚ;->᩻֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    goto :goto_0

    :cond_2
    const-string v1, "table"

    .line 1254
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1255
    invoke-direct {p0, p1, p2}, Ll/᩷ۚۚ;->ܽ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1256
    :cond_3
    sget-object v1, Ll/ۨۚۚ;->ۛ:[Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1257
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1260
    :cond_4
    invoke-direct {p0, p1, p2}, Ll/᩷ۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 458
    :cond_5
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v1, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v2, "tr"

    .line 1229
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 1230
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܿ()V

    .line 1231
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 1232
    sget-object p1, Ll/᩺ۚۚ;->ᩳ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 1233
    :cond_6
    sget-object v3, Ll/ۨۚۚ;->ۚ:[Ljava/lang/String;

    invoke-static {v1, v3}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1234
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1235
    invoke-virtual {p2, v2}, Ll/֡ܶۚ;->ᩳ(Ljava/lang/String;)V

    .line 1236
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 1237
    :cond_7
    sget-object v0, Ll/ۨۚۚ;->ۨ:[Ljava/lang/String;

    invoke-static {v1, v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1238
    invoke-direct {p0, p1, p2}, Ll/᩷ۚۚ;->ܽ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1240
    :cond_8
    invoke-direct {p0, p1, p2}, Ll/᩷ۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1
.end method
