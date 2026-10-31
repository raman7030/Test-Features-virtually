.class public Ll/֫ۘۖ;
.super Ll/ᩳۘۖ;
.source "B9Q3"


# static fields
.field public static final ۜ:Ll/֫ۘۖ;


# instance fields
.field public final ܳ:Ljava/util/Map;

.field public final ܿ:Ljava/util/Map;

.field public final ᩳ:Ljava/util/Map;

.field public final ᩻:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 275
    new-instance v0, Ll/֫ۘۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/֫ۘۖ;-><init>(I)V

    sput-object v0, Ll/֫ۘۖ;->ۜ:Ll/֫ۘۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 246
    invoke-direct {p0}, Ll/ᩳۘۖ;-><init>()V

    .line 247
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֫ۘۖ;->ᩳ:Ljava/util/Map;

    .line 248
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֫ۘۖ;->ܳ:Ljava/util/Map;

    .line 249
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֫ۘۖ;->ܿ:Ljava/util/Map;

    .line 250
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֫ۘۖ;->᩻:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 268
    sget-object p1, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    invoke-direct {p0, p1}, Ll/ᩳۘۖ;-><init>(Ll/ᩳۘۖ;)V

    .line 269
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/֫ۘۖ;->ᩳ:Ljava/util/Map;

    .line 270
    iput-object p1, p0, Ll/֫ۘۖ;->ܳ:Ljava/util/Map;

    .line 271
    iput-object p1, p0, Ll/֫ۘۖ;->ܿ:Ljava/util/Map;

    .line 272
    iput-object p1, p0, Ll/֫ۘۖ;->᩻:Ljava/util/Map;

    return-void
.end method

.method public static ۧ()Ll/֫ۘۖ;
    .locals 1

    .line 71
    new-instance v0, Ll/֫ۘۖ;

    invoke-direct {v0}, Ll/֫ۘۖ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ᩳۖۖ;I)Ll/۟ۖۖ;
    .locals 1

    .line 147
    new-instance v0, Ll/ܰۖۖ;

    invoke-direct {v0, p1, p2}, Ll/ܰۖۖ;-><init>(Ll/ᩳۖۖ;I)V

    iget-object p1, p0, Ll/֫ۘۖ;->ܿ:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۖۖ;

    return-object p1
.end method

.method public final ֫(Ll/ܺᩴۖ;)V
    .locals 6

    .line 195
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ᩳ()Ll/ۤۖۖ;

    move-result-object v0

    sget-object v1, Ll/ۤۖۖ;->᩹:Ll/ۤۖۖ;

    if-eq v0, v1, :cond_0

    .line 196
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ᩳ()Ll/ۤۖۖ;

    move-result-object v0

    sget-object v1, Ll/ۤۖۖ;->᩶:Ll/ۤۖۖ;

    if-eq v0, v1, :cond_0

    goto/16 :goto_2

    .line 209
    :cond_0
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_2

    .line 210
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ܽ()Ll/᩻֡ۖ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 215
    new-instance v0, Ll/۟ۖۖ;

    .line 216
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܺᩴۖ;->ܽ()Ll/᩻֡ۖ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/۟ۖۖ;-><init>(Ll/֡ۖۖ;Ll/᩻֡ۖ;)V

    goto :goto_0

    .line 211
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Registered message-type extension had null default instance: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_2
    new-instance v0, Ll/۟ۖۖ;

    invoke-virtual {p1}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۟ۖۖ;-><init>(Ll/֡ۖۖ;Ll/᩻֡ۖ;)V

    .line 200
    :goto_0
    invoke-virtual {p1}, Ll/ܺᩴۖ;->ᩳ()Ll/ۤۖۖ;

    move-result-object p1

    .line 278
    iget-object v1, v0, Ll/۟ۖۖ;->ۧ:Ll/֡ۖۖ;

    invoke-virtual {v1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 286
    sget-object v2, Ll/᩺ۖۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    goto :goto_2

    .line 294
    :cond_3
    iget-object p1, p0, Ll/֫ۘۖ;->ܳ:Ljava/util/Map;

    iget-object v2, p0, Ll/֫ۘۖ;->᩻:Ljava/util/Map;

    goto :goto_1

    .line 290
    :cond_4
    iget-object p1, p0, Ll/֫ۘۖ;->ᩳ:Ljava/util/Map;

    iget-object v2, p0, Ll/֫ۘۖ;->ܿ:Ljava/util/Map;

    .line 300
    :goto_1
    invoke-virtual {v1}, Ll/֡ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    new-instance v3, Ll/ܰۖۖ;

    .line 303
    invoke-virtual {v1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v4

    invoke-virtual {v1}, Ll/֡ۖۖ;->getNumber()I

    move-result v5

    invoke-direct {v3, v4, v5}, Ll/ܰۖۖ;-><init>(Ll/ᩳۖۖ;I)V

    .line 301
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    invoke-virtual {v1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 308
    invoke-virtual {v1}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v2

    sget-object v3, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v2, v3, :cond_5

    .line 309
    invoke-virtual {v1}, Ll/֡ۖۖ;->۫()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 310
    invoke-virtual {v1}, Ll/֡ۖۖ;->֨()Ll/ᩳۖۖ;

    move-result-object v2

    invoke-virtual {v1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v3

    if-ne v2, v3, :cond_5

    .line 314
    invoke-virtual {v1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_2
    return-void

    .line 279
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
