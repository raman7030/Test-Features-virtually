.class public Ll/᩶ۖ۠;
.super Ll/ۗۘ۠;
.source "Q7RX"

# interfaces
.implements Ll/ۚۘ۠;


# instance fields
.field public ۖ:Z

.field public ۘ:Z

.field public ܺ:Ll/֡ۘ۠;


# direct methods
.method public constructor <init>(Ll/֡ۘ۠;Ll/ۘۘ۠;[CI)V
    .locals 0

    .line 1235
    invoke-direct {p0, p2, p3, p4}, Ll/ۗۘ۠;-><init>(Ll/ۘۘ۠;[CI)V

    const/4 p2, 0x0

    .line 1219
    iput-boolean p2, p0, Ll/᩶ۖ۠;->ۖ:Z

    .line 1224
    iput-boolean p2, p0, Ll/᩶ۖ۠;->ۘ:Z

    .line 1236
    iput-object p1, p0, Ll/᩶ۖ۠;->ܺ:Ll/֡ۘ۠;

    return-void
.end method


# virtual methods
.method public final getStyle()Ll/֡ۘ۠;
    .locals 1

    .line 1268
    iget-object v0, p0, Ll/᩶ۖ۠;->ܺ:Ll/֡ۘ۠;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isDeprecated()Z
    .locals 2

    .line 1277
    iget-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩶ۖ۠;->ܺ:Ll/֡ۘ۠;

    sget-object v1, Ll/֡ۘ۠;->᩶:Ll/֡ۘ۠;

    if-ne v0, v1, :cond_0

    .line 1278
    invoke-virtual {p0}, Ll/᩶ۖ۠;->ܺ()V

    .line 1281
    :cond_0
    iget-boolean v0, p0, Ll/᩶ۖ۠;->ۖ:Z

    return v0
.end method

.method public ܺ()V
    .locals 6

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "/**"

    .line 1290
    invoke-virtual {p0, v1}, Ll/۫ۘ۠;->֫(Ljava/lang/String;)Z

    .line 1293
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/۫ۘ۠;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1295
    invoke-virtual {p0}, Ll/۫ۘ۠;->ۢ()V

    :cond_1
    const/16 v1, 0x2a

    .line 1298
    invoke-virtual {p0, v1}, Ll/۫ۘ۠;->֫(C)Z

    move-result v2

    const/16 v3, 0x2f

    if-eqz v2, :cond_2

    .line 1299
    invoke-virtual {p0, v3}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 1346
    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    return-void

    .line 1305
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Ll/۫ۘ۠;->ۢ()V

    .line 1308
    iget-boolean v2, p0, Ll/᩶ۖ۠;->ۖ:Z

    if-nez v2, :cond_3

    const-string v2, "@deprecated"

    invoke-virtual {p0, v2}, Ll/۫ۘ۠;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1310
    :cond_3
    invoke-virtual {p0}, Ll/۫ۘ۠;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1311
    invoke-virtual {p0}, Ll/۫ۘ۠;->֫()C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1312
    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۖ:Z

    goto :goto_1

    .line 1313
    :cond_4
    invoke-virtual {p0, v1}, Ll/۫ۘ۠;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1314
    invoke-virtual {p0, v3}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1315
    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۖ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1346
    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    return-void

    .line 1322
    :cond_5
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ll/۫ۘ۠;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1323
    invoke-virtual {p0}, Ll/۫ۘ۠;->֫()C

    move-result v2

    const/16 v4, 0xd

    const/16 v5, 0xa

    if-eq v2, v5, :cond_7

    if-eq v2, v4, :cond_7

    if-eq v2, v1, :cond_6

    .line 1339
    invoke-virtual {p0}, Ll/ۗۘ۠;->ۜ()C

    goto :goto_1

    .line 1325
    :cond_6
    invoke-virtual {p0}, Ll/ۗۘ۠;->ۜ()C

    .line 1327
    invoke-virtual {p0, v3}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_5

    .line 1346
    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    return-void

    .line 1334
    :cond_7
    :try_start_3
    invoke-virtual {p0, v4}, Ll/۫ۘ۠;->֫(C)Z

    .line 1335
    invoke-virtual {p0, v5}, Ll/۫ۘ۠;->֫(C)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 1346
    :cond_8
    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Ll/᩶ۖ۠;->ۘ:Z

    .line 1347
    throw v1
.end method
