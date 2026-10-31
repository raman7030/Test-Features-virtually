.class public Ll/۫֡ܳ;
.super Ll/ۛܶۢ;
.source "XAJ9"


# instance fields
.field public ۖ֫:Ll/ᩳܰۡ;

.field public ۘ֫:Ll/ᩳܰۡ;

.field public ܺ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 174
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 2

    .line 265
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 266
    iget-object p2, p0, Ll/۫֡ܳ;->ܺ֫:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const p1, 0x7f1206ed

    .line 267
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void

    .line 270
    :cond_0
    iget-object p2, p0, Ll/۫֡ܳ;->ܺ֫:Ljava/lang/String;

    const p3, 0x7f1205ba

    .line 651
    invoke-static {p3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p3

    const-string p4, "saveAsPath"

    .line 270
    invoke-virtual {p0, p4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    sget v0, Ll/ۜ᩷ܿ;->֫:I

    const-string v0, "syntax:INTERNAL:"

    const-string v1, "FolderComparison"

    .line 339
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 270
    invoke-static {p1, p2, p3, p4, v0}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "saveAsPath"

    .line 186
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1205ba

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 186
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2d

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 181
    sget-object v0, Ll/᩻ܶۢ;->ܽ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 11

    const-string v0, "inputPath1"

    .line 203
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "inputPath2"

    .line 204
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "zipPath1"

    .line 205
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "zipPath2"

    .line 206
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 207
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۨ()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "statelessVisitor1"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v4, :cond_0

    .line 208
    invoke-virtual {p0, v5}, Ll/ۘ۠ۢ;->᩷(Ljava/lang/String;)[B

    move-result-object v4

    .line 63
    invoke-static {v4, v7}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object v4

    .line 208
    check-cast v4, Ll/ۗۢ᩻;

    goto :goto_0

    :cond_0
    move-object v4, v6

    .line 209
    :goto_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۨ()Landroid/os/Bundle;

    move-result-object v5

    const-string v8, "statelessVisitor2"

    invoke-virtual {v5, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 210
    invoke-virtual {p0, v8}, Ll/ۘ۠ۢ;->᩷(Ljava/lang/String;)[B

    move-result-object v5

    .line 63
    invoke-static {v5, v7}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object v5

    .line 210
    move-object v6, v5

    check-cast v6, Ll/ۗۢ᩻;

    .line 212
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 213
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const/4 v9, 0x1

    if-eqz v2, :cond_3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v10, 0x1

    :goto_2
    if-nez v2, :cond_4

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    const/4 v9, 0x0

    :goto_3
    if-eqz v2, :cond_5

    .line 221
    new-instance v4, Ll/ᩳܰۡ;

    invoke-direct {v4, v2}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Ll/۫֡ܳ;->ۖ֫:Ll/ᩳܰۡ;

    .line 222
    invoke-static {v5, v4, v0, v10}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ᩳܰۡ;Ljava/lang/String;Z)V

    .line 223
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    if-eqz v4, :cond_6

    .line 225
    invoke-static {v5, v4, v0, v9, p0}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ۗۢ᩻;Ljava/lang/String;ZLl/۫֡ܳ;)V

    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/ۗۢ᩻;->֡()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_6
    new-array v2, v7, [Ljava/lang/String;

    .line 228
    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v5, v2, v9, p0}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ܶ᩵ܿ;ZLl/۫֡ܳ;)V

    .line 231
    :goto_4
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 232
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_7
    if-eqz v3, :cond_8

    .line 235
    new-instance v2, Ll/ᩳܰۡ;

    invoke-direct {v2, v3}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Ll/۫֡ܳ;->ۘ֫:Ll/ᩳܰۡ;

    .line 236
    invoke-static {v8, v2, v1, v10}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ᩳܰۡ;Ljava/lang/String;Z)V

    .line 237
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_8
    if-eqz v6, :cond_9

    .line 239
    invoke-static {v8, v6, v1, v9, p0}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ۗۢ᩻;Ljava/lang/String;ZLl/۫֡ܳ;)V

    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ll/ۗۢ᩻;->֡()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_9
    new-array v2, v7, [Ljava/lang/String;

    .line 242
    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v8, v2, v9, p0}, Ll/ۤ֡ܳ;->֫(Ljava/util/HashMap;Ll/ܶ᩵ܿ;ZLl/۫֡ܳ;)V

    .line 245
    :goto_5
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 246
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 248
    :cond_a
    new-instance v2, Ll/۬֡ܳ;

    invoke-direct {v2, p0}, Ll/۬֡ܳ;-><init>(Ll/۫֡ܳ;)V

    invoke-static {v0, v1, v5, v8, v2}, Ll/۠۬ܿ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Ll/ۡۛۡ;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۫֡ܳ;->ܺ֫:Ljava/lang/String;

    .line 259
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 276
    iget-object p1, p0, Ll/۫֡ܳ;->ۖ֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 277
    iget-object p1, p0, Ll/۫֡ܳ;->ۘ֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 278
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f1205ba

    .line 196
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const v0, 0x7f1207a7

    .line 197
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    return-void
.end method
