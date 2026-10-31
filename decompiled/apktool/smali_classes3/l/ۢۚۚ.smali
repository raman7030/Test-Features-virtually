.class public final enum Ll/ۢۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InRow"

    const/16 v1, 0xd

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۢۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1283
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z
    .locals 1

    const-string v0, "tr"

    .line 1338
    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1340
    invoke-virtual {p2, p1}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 1

    .line 1334
    sget-object v0, Ll/᩺ۚۚ;->᩻֫:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 4

    .line 1285
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v1, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1289
    sget-object v2, Ll/ۨۚۚ;->ۚ:[Ljava/lang/String;

    invoke-static {v1, v2}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1290
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩻()V

    .line 1291
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 1292
    sget-object p1, Ll/᩺ۚۚ;->ܰ:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1293
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۖ()V

    goto :goto_0

    .line 1294
    :cond_0
    sget-object v0, Ll/ۨۚۚ;->ۗ:[Ljava/lang/String;

    invoke-static {v1, v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1295
    invoke-direct {p0, p1, p2}, Ll/ۢۚۚ;->֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z

    move-result p1

    return p1

    .line 1297
    :cond_1
    invoke-direct {p0, p1, p2}, Ll/ۢۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1299
    :cond_2
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 466
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v1, "tr"

    .line 1303
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    .line 1304
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 1305
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 1308
    :cond_3
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩻()V

    .line 1309
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 1310
    sget-object p1, Ll/᩺ۚۚ;->ۜ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    goto :goto_0

    :cond_4
    const-string v2, "table"

    .line 1311
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1312
    invoke-direct {p0, p1, p2}, Ll/ۢۚۚ;->֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z

    move-result p1

    return p1

    .line 1313
    :cond_5
    sget-object v2, Ll/ۨۚۚ;->֫֫:[Ljava/lang/String;

    invoke-static {v0, v2}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 1314
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p2, v1}, Ll/ܿۚۚ;->ܺ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    .line 1318
    :cond_6
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩻()V

    .line 1319
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 1320
    sget-object p1, Ll/᩺ۚۚ;->ۜ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 1315
    :cond_7
    :goto_1
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 1321
    :cond_8
    sget-object v1, Ll/ۨۚۚ;->ۙ:[Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1322
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 1325
    :cond_9
    invoke-direct {p0, p1, p2}, Ll/ۢۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1328
    :cond_a
    invoke-direct {p0, p1, p2}, Ll/ۢۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1
.end method
