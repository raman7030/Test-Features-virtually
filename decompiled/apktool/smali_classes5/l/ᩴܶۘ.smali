.class public final Ll/ᩴܶۘ;
.super Ll/ۖ᩹ۘ;
.source "51RR"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ll/ۘ᩹ۘ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ll/ۘ᩹ۘ;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const-string p1, ""

    .line 148
    iput-object p1, p0, Ll/ᩴܶۘ;->ۧ:Ljava/lang/String;

    .line 149
    iput-object p2, p0, Ll/ᩴܶۘ;->֫:Ljava/lang/String;

    .line 151
    iput-object p3, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_0

    .line 189
    invoke-interface {v0}, Ll/ۘ᩹ۘ;->֫()V

    const/4 v0, 0x0

    .line 190
    iput-object v0, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩵᩹ۘ;)V
    .locals 11

    .line 177
    iget-object v0, p1, Ll/᩵᩹ۘ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ᩴܶۘ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    move-object v10, v1

    .line 178
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩴܶۘ;->ۧ:Ljava/lang/String;

    const-string v3, "_H5"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 178
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget v9, p1, Ll/᩵᩹ۘ;->֫:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v2 .. v10}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJILjava/lang/String;)V

    .line 180
    iget-object v0, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_1

    .line 181
    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    const/4 p1, 0x0

    .line 182
    iput-object p1, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    :cond_1
    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;)V
    .locals 13

    .line 167
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩴܶۘ;->ۧ:Ljava/lang/String;

    const-string v3, "_H5"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 167
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    const-string v1, "ret"

    const/4 v2, -0x6

    .line 168
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    iget-object v12, p0, Ll/ᩴܶۘ;->֫:Ljava/lang/String;

    invoke-static/range {v4 .. v12}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJILjava/lang/String;)V

    .line 169
    iget-object v0, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_0

    .line 170
    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    const/4 p1, 0x0

    .line 171
    iput-object p1, p0, Ll/ᩴܶۘ;->ܽ:Ll/ۘ᩹ۘ;

    :cond_0
    return-void
.end method
