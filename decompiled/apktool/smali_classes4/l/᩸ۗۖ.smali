.class public final Ll/᩸ۗۖ;
.super Ljava/lang/Object;
.source "K608"


# instance fields
.field public ֫:Ljava/util/Set;

.field public ۜ:Ljava/util/Set;

.field public final ۡ:Ll/۠᩶ۖ;

.field public ۢ:Ljava/util/Set;

.field public ۧ:Ljava/util/Set;

.field public ܳ:Ljava/util/Set;

.field public ܽ:Ll/ۗ᩹ۖ;

.field public ܿ:Ll/᩸ۗۖ;

.field public ᩳ:Ljava/util/Set;

.field public ᩷:Ljava/util/Set;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۠᩶ۖ;)V
    .locals 2

    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Ll/᩸ۗۖ;->᩷:Ljava/util/Set;

    .line 200
    iput-object v0, p0, Ll/᩸ۗۖ;->ᩳ:Ljava/util/Set;

    .line 201
    iput-object v0, p0, Ll/᩸ۗۖ;->ۜ:Ljava/util/Set;

    .line 205
    iput-object v0, p0, Ll/᩸ۗۖ;->֫:Ljava/util/Set;

    .line 207
    iput-object v0, p0, Ll/᩸ۗۖ;->ܳ:Ljava/util/Set;

    .line 208
    iput-object v0, p0, Ll/᩸ۗۖ;->ۧ:Ljava/util/Set;

    .line 210
    sget-object v1, Ll/ۗ᩹ۖ;->ܰ:Ll/ۗ᩹ۖ;

    iput-object v1, p0, Ll/᩸ۗۖ;->ܽ:Ll/ۗ᩹ۖ;

    .line 211
    iput-object v0, p0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    .line 281
    iput-object p1, p0, Ll/᩸ۗۖ;->ۡ:Ll/۠᩶ۖ;

    return-void
.end method

.method public static ֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V
    .locals 2

    .line 251
    invoke-virtual {p2, p1}, Ll/۠ۗۖ;->֫(Ll/᩸ۗۖ;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 253
    invoke-virtual {p2, p0}, Ll/۠ۗۖ;->֫(Ll/᩸ۗۖ;)Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_0

    .line 257
    invoke-virtual {p2, p0, v0}, Ll/۠ۗۖ;->֫(Ll/᩸ۗۖ;Ljava/util/Set;)V

    goto :goto_0

    .line 260
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    .line 262
    :goto_0
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 263
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    .line 264
    invoke-virtual {p2, p1, p0}, Ll/۠ۗۖ;->֫(Ll/᩸ۗۖ;Ljava/util/Set;)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩸ۗۖ;)Ll/᩸ۗۖ;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۗۖ;->ܽ()Ll/᩸ۗۖ;

    move-result-object p0

    return-object p0
.end method

.method private ܽ()Ll/᩸ۗۖ;
    .locals 2

    move-object v0, p0

    .line 270
    :goto_0
    iget-object v1, v0, Ll/᩸ۗۖ;->ܿ:Ll/᩸ۗۖ;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    if-eq v0, p0, :cond_1

    .line 274
    iput-object v0, p0, Ll/᩸ۗۖ;->ܿ:Ll/᩸ۗۖ;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 286
    invoke-direct {p0}, Ll/᩸ۗۖ;->ܽ()Ll/᩸ۗۖ;

    move-result-object v0

    .line 287
    iget-object v1, v0, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    if-nez v1, :cond_0

    const-string v1, "[]"

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 288
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Ll/᩸ۗۖ;->ܽ:Ll/ۗ᩹ۖ;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/᩸ۗۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " > {"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 353
    invoke-direct {p0}, Ll/᩸ۗۖ;->ܽ()Ll/᩸ۗۖ;

    move-result-object v0

    iget-object v0, v0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/᩸ۗۖ;)V
    .locals 3

    .line 219
    invoke-direct {p1}, Ll/᩸ۗۖ;->ܽ()Ll/᩸ۗۖ;

    move-result-object p1

    if-ne p0, p1, :cond_0

    goto :goto_2

    .line 224
    :cond_0
    iput-object p0, p1, Ll/᩸ۗۖ;->ܿ:Ll/᩸ۗۖ;

    .line 226
    sget-object v0, Ll/۠ۗۖ;->۫:Ll/۠ۗۖ;

    invoke-static {p0, p1, v0}, Ll/᩸ۗۖ;->֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V

    .line 227
    sget-object v0, Ll/۠ۗۖ;->ۙ:Ll/۠ۗۖ;

    invoke-static {p0, p1, v0}, Ll/᩸ۗۖ;->֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V

    .line 228
    sget-object v0, Ll/۠ۗۖ;->۬:Ll/۠ۗۖ;

    invoke-static {p0, p1, v0}, Ll/᩸ۗۖ;->֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V

    .line 229
    sget-object v0, Ll/۠ۗۖ;->᩹:Ll/۠ۗۖ;

    invoke-static {p0, p1, v0}, Ll/᩸ۗۖ;->֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V

    .line 230
    sget-object v0, Ll/۠ۗۖ;->ۗ:Ll/۠ۗۖ;

    invoke-static {p0, p1, v0}, Ll/᩸ۗۖ;->֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V

    .line 231
    sget-object v0, Ll/۠ۗۖ;->᩶:Ll/۠ۗۖ;

    invoke-static {p0, p1, v0}, Ll/᩸ۗۖ;->֫(Ll/᩸ۗۖ;Ll/᩸ۗۖ;Ll/۠ۗۖ;)V

    .line 233
    iget-object v0, p0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 234
    iget-object v0, p1, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    iput-object v0, p0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    goto :goto_0

    .line 235
    :cond_1
    iget-object v1, p1, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 236
    invoke-static {v0, v1}, Ll/ܶۗۖ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 238
    iput-object v0, p1, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    .line 239
    iget-object v1, p1, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    if-eqz v1, :cond_4

    .line 240
    iget-object v2, p0, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    if-nez v2, :cond_3

    .line 241
    iput-object v1, p0, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    goto :goto_1

    .line 243
    :cond_3
    invoke-interface {v2, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 245
    :goto_1
    iput-object v0, p1, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    :cond_4
    :goto_2
    return-void
.end method

.method public final ֫(Ll/ۗ᩹ۖ;)Z
    .locals 1

    .line 334
    iget-object v0, p0, Ll/᩸ۗۖ;->ܽ:Ll/ۗ᩹ۖ;

    .line 335
    invoke-static {v0, p1}, Ll/ۗ᩹ۖ;->֫(Ll/ۗ᩹ۖ;Ll/ۗ᩹ۖ;)Ll/ۗ᩹ۖ;

    move-result-object p1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 339
    :cond_0
    iput-object p1, p0, Ll/᩸ۗۖ;->ܽ:Ll/ۗ᩹ۖ;

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 6

    .line 292
    invoke-direct {p0}, Ll/᩸ۗۖ;->ܽ()Ll/᩸ۗۖ;

    move-result-object v0

    .line 293
    iget-object v1, v0, Ll/᩸ۗۖ;->ܽ:Ll/ۗ᩹ۖ;

    .line 294
    sget-object v2, Ll/ۗ᩹ۖ;->᩺:Ll/ۗ᩹ۖ;

    if-ne v1, v2, :cond_1

    .line 295
    iget-object v1, v0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v0, "Ljava/lang/Object;"

    return-object v0

    .line 298
    :cond_0
    iget-object v0, v0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    return-object v0

    .line 301
    :cond_1
    iget-boolean v2, v1, Ll/ۗ᩹ۖ;->᩸:Z

    if-eqz v2, :cond_3

    sget-object v2, Ll/ۗ᩹ۖ;->ۤ:Ll/ۗ᩹ۖ;

    if-eq v1, v2, :cond_3

    .line 302
    iget-object v0, v0, Ll/᩸ۗۖ;->᩻:Ljava/lang/String;

    if-eqz v0, :cond_2

    return-object v0

    .line 303
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 307
    :cond_3
    sget-object v2, Ll/ۗ᩹ۖ;->ۛ:Ll/ۗ᩹ۖ;

    if-ne v1, v2, :cond_4

    const-string v0, "J"

    return-object v0

    .line 310
    :cond_4
    iget-object v2, v0, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    if-eqz v2, :cond_6

    .line 311
    invoke-static {}, Ll/᩹ۗۖ;->֫()[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x4

    if-ge v3, v4, :cond_6

    aget-object v4, v2, v3

    .line 312
    iget-object v5, v0, Ll/᩸ۗۖ;->ۢ:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    return-object v4

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 318
    :cond_6
    sget-object v0, Ll/ۖۗۖ;->ۧ:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 329
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :pswitch_0
    const-string v0, "Z"

    return-object v0

    :pswitch_1
    const-string v0, "I"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
