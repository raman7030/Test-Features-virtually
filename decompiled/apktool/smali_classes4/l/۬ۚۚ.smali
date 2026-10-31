.class public final enum Ll/۬ۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterHead"

    const/4 v1, 0x5

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۬ۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 224
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 1

    const-string v0, "body"

    .line 274
    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->ᩳ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 275
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Z)V

    .line 276
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 4

    .line 226
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 227
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    goto/16 :goto_0

    .line 228
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 229
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    goto/16 :goto_0

    .line 230
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 231
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    goto/16 :goto_0

    .line 232
    :cond_2
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v2, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v3, "html"

    .line 235
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 236
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    :cond_3
    const-string v3, "body"

    .line 237
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 238
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 239
    invoke-virtual {p2, v1}, Ll/ܿۚۚ;->֫(Z)V

    .line 240
    sget-object p1, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    goto :goto_0

    :cond_4
    const-string v3, "frameset"

    .line 241
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 242
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 243
    sget-object p1, Ll/᩺ۚۚ;->֫֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    goto :goto_0

    .line 244
    :cond_5
    sget-object v0, Ll/ۨۚۚ;->ۘ:[Ljava/lang/String;

    invoke-static {v2, v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 245
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 246
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۡ()Ll/᩶֡ۚ;

    move-result-object v0

    .line 343
    iget-object v1, p2, Ll/֡ܶۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    sget-object v1, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    .line 249
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۢ(Ll/᩶֡ۚ;)V

    goto :goto_0

    :cond_6
    const-string v0, "head"

    .line 250
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 251
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 254
    :cond_7
    invoke-direct {p0, p1, p2}, Ll/۬ۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    goto :goto_0

    .line 256
    :cond_8
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 466
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 258
    sget-object v2, Ll/ۨۚۚ;->֫:[Ljava/lang/String;

    invoke-static {v0, v2}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 259
    invoke-direct {p0, p1, p2}, Ll/۬ۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    goto :goto_0

    :cond_9
    const-string v2, "template"

    .line 260
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 261
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    goto :goto_0

    .line 264
    :cond_a
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 268
    :cond_b
    invoke-direct {p0, p1, p2}, Ll/۬ۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
