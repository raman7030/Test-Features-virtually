.class public final Ll/ۤ۠ۘ;
.super Ll/ۖ᩹ۘ;
.source "51RR"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final synthetic ۧ:Lcom/tencent/connect/auth/a;

.field public ܽ:Ll/ۘ᩹ۘ;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/a;Ljava/lang/String;Ll/ۘ᩹ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Ll/ۤ۠ۘ;->ۧ:Lcom/tencent/connect/auth/a;

    .line 199
    iput-object p2, p0, Ll/ۤ۠ۘ;->֫:Ljava/lang/String;

    .line 201
    iput-object p3, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_0

    .line 241
    invoke-interface {v0}, Ll/ۘ᩹ۘ;->֫()V

    const/4 v0, 0x0

    .line 242
    iput-object v0, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩵᩹ۘ;)V
    .locals 11

    .line 228
    iget-object v0, p1, Ll/᩵᩹ۘ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۤ۠ۘ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 229
    :cond_0
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget v9, p1, Ll/᩵᩹ۘ;->֫:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "action_login_H5"

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v10, v1

    invoke-static/range {v2 .. v10}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJILjava/lang/String;)V

    .line 231
    iget-object v0, p0, Ll/ۤ۠ۘ;->ۧ:Lcom/tencent/connect/auth/a;

    invoke-static {v0, v1}, Lcom/tencent/connect/auth/a;->֫(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_1

    .line 233
    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    const/4 p1, 0x0

    .line 234
    iput-object p1, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    :cond_1
    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;)V
    .locals 10

    .line 218
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v1, "ret"

    const/4 v4, -0x6

    .line 219
    invoke-virtual {p1, v1, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "action_login_H5"

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    iget-object v9, p0, Ll/ۤ۠ۘ;->֫:Ljava/lang/String;

    invoke-static/range {v1 .. v9}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJILjava/lang/String;)V

    .line 220
    iget-object v0, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_0

    .line 221
    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    const/4 p1, 0x0

    .line 222
    iput-object p1, p0, Ll/ۤ۠ۘ;->ܽ:Ll/ۘ᩹ۘ;

    :cond_0
    return-void
.end method
