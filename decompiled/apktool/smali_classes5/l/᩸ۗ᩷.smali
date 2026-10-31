.class public final Ll/᩸ۗ᩷;
.super Ll/۟ܶۡ;
.source "Z3WS"


# instance fields
.field public final synthetic ۜ:Ljava/util/ArrayList;

.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩻:Ll/۟᩵ۡ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;Ll/۟᩵ۡ;)V
    .locals 0

    .line 272
    iput-object p1, p0, Ll/᩸ۗ᩷;->ܳ:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/᩸ۗ᩷;->ۜ:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/᩸ۗ᩷;->᩻:Ll/۟᩵ۡ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const v0, 0x7f120190

    .line 296
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 297
    iget-object v0, p0, Ll/᩸ۗ᩷;->ۜ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۗ᩷;

    iget-boolean v0, v0, Ll/᩹ۗ᩷;->᩹:Z

    if-eqz v0, :cond_0

    .line 298
    iget-object v0, p0, Ll/᩸ۗ᩷;->ܳ:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 304
    iget-object v0, p0, Ll/᩸ۗ᩷;->ܳ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 276
    iget-object v0, p0, Ll/᩸ۗ᩷;->ܳ:Ll/ۗܺ᩷;

    const v1, 0x7f120192

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 11

    .line 281
    iget-object v0, p0, Ll/᩸ۗ᩷;->ۜ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۗ᩷;

    iget-boolean v5, v2, Ll/᩹ۗ᩷;->᩹:Z

    const/4 v2, 0x1

    .line 282
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ۗ᩷;

    iget-boolean v6, v3, Ll/᩹ۗ᩷;->᩹:Z

    const/4 v3, 0x2

    .line 283
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۗ᩷;

    iget-boolean v7, v4, Ll/᩹ۗ᩷;->᩹:Z

    const/4 v4, 0x3

    .line 284
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ۗ᩷;

    iget-boolean v8, v8, Ll/᩹ۗ᩷;->᩹:Z

    const/4 v9, 0x4

    .line 285
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩹ۗ᩷;

    iget-boolean v9, v9, Ll/᩹ۗ᩷;->᩹:Z

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 286
    check-cast v0, Ll/᩹ۗ᩷;

    iget-boolean v10, v0, Ll/᩹ۗ᩷;->᩹:Z

    .line 287
    iget-object v0, p0, Ll/᩸ۗ᩷;->᩻:Ll/۟᩵ۡ;

    if-nez v0, :cond_a

    const/16 v0, 0x1024

    const v9, 0x7f120520

    if-eqz v5, :cond_1

    .line 1051
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v5

    .line 1052
    invoke-virtual {v5, v3}, Ll/ᩳᩴۡ;->֫(I)V

    .line 1053
    invoke-virtual {v5}, Ll/ᩳᩴۡ;->ܿ()Ll/᩻ᩴۡ;

    move-result-object v3

    .line 242
    invoke-virtual {v3}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 243
    invoke-virtual {v3}, Ll/᩻ᩴۡ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 244
    new-instance v5, Lbin/mt/json/JSONObject;

    invoke-virtual {v3}, Ll/᩻ᩴۡ;->ۖ()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 245
    invoke-static {v5}, Ll/۟ۖۡ;->֫(Lbin/mt/json/JSONObject;)V

    goto :goto_0

    .line 242
    :cond_0
    new-instance v0, Ll/֫ۛۡ;

    .line 232
    invoke-static {v3, v9}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 242
    throw v0

    :cond_1
    :goto_0
    if-eqz v6, :cond_3

    .line 1051
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v3

    .line 1052
    invoke-virtual {v3, v1}, Ll/ᩳᩴۡ;->֫(I)V

    .line 1053
    invoke-virtual {v3}, Ll/ᩳᩴۡ;->ܿ()Ll/᩻ᩴۡ;

    move-result-object v3

    .line 251
    invoke-virtual {v3}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 252
    invoke-virtual {v3}, Ll/᩻ᩴۡ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 253
    new-instance v5, Lbin/mt/json/JSONArray;

    invoke-virtual {v3}, Ll/᩻ᩴۡ;->ۖ()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 254
    invoke-static {v5, v10}, Ll/۟ۖۡ;->֫(Lbin/mt/json/JSONArray;Z)V

    goto :goto_1

    .line 251
    :cond_2
    new-instance v0, Ll/֫ۛۡ;

    .line 232
    invoke-static {v3, v9}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 251
    throw v0

    :cond_3
    :goto_1
    if-eqz v7, :cond_5

    .line 1051
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v3

    .line 1052
    invoke-virtual {v3, v2}, Ll/ᩳᩴۡ;->֫(I)V

    .line 1053
    invoke-virtual {v3}, Ll/ᩳᩴۡ;->ܿ()Ll/᩻ᩴۡ;

    move-result-object v2

    .line 260
    invoke-virtual {v2}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 261
    invoke-virtual {v2}, Ll/᩻ᩴۡ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 262
    new-instance v3, Lbin/mt/json/JSONArray;

    invoke-virtual {v2}, Ll/᩻ᩴۡ;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 263
    invoke-static {v3, v10}, Ll/۟ۖۡ;->ۧ(Lbin/mt/json/JSONArray;Z)V

    goto :goto_2

    .line 260
    :cond_4
    new-instance v0, Ll/֫ۛۡ;

    .line 232
    invoke-static {v2, v9}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 260
    throw v0

    :cond_5
    :goto_2
    if-eqz v8, :cond_9

    .line 1051
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v0

    .line 1052
    invoke-virtual {v0, v4}, Ll/ᩳᩴۡ;->֫(I)V

    .line 1053
    invoke-virtual {v0}, Ll/ᩳᩴۡ;->ܿ()Ll/᩻ᩴۡ;

    move-result-object v0

    .line 269
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 270
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 271
    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 401
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 402
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    :goto_3
    if-ge v1, v3, :cond_6

    .line 403
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 404
    invoke-static {v4}, Ll/ۖ֨ܿ;->֫(Lbin/mt/json/JSONObject;)Ll/ۖ֨ܿ;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    if-eqz v10, :cond_7

    .line 407
    invoke-static {v0}, Ll/ۖ֨ܿ;->֫(Ljava/util/ArrayList;)V

    return-void

    .line 409
    :cond_7
    invoke-static {v0}, Ll/ۖ֨ܿ;->ۧ(Ljava/util/ArrayList;)V

    return-void

    .line 269
    :cond_8
    new-instance v1, Ll/֫ۛۡ;

    .line 232
    invoke-static {v0, v9}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 269
    throw v1

    :cond_9
    return-void

    .line 290
    :cond_a
    invoke-virtual {v0}, Ll/۟᩵ۡ;->ᩳ()J

    move-result-wide v3

    invoke-static/range {v3 .. v10}, Ll/ۨۖۡ;->֫(JZZZZZZ)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 309
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
