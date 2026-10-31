.class public Ll/᩹ۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳۙᩴ;


# static fields
.field public static volatile c:Ljava/util/Map$Entry;

.field public static volatile d:Ljava/util/Map$Entry;


# instance fields
.field public final a:Ll/ۡ֨ᩴ;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۡ֨ᩴ;Ljava/lang/String;)V
    .locals 0

    .line 4201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4202
    iput-object p1, p0, Ll/᩹ۙᩴ;->a:Ll/ۡ֨ᩴ;

    .line 4203
    iput-object p2, p0, Ll/᩹ۙᩴ;->b:Ljava/lang/String;

    return-void
.end method

.method public static b(Ll/ۗۙᩴ;Ljava/lang/CharSequence;IILl/ۘۙᩴ;)I
    .locals 4

    .line 4308
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    .line 4309
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    if-lt p3, v1, :cond_0

    .line 357
    invoke-static {v0, v2}, Ll/ۚ᩹ᩴ;->X(Ljava/lang/String;Z)Ll/ۚ᩹ᩴ;

    move-result-object p1

    .line 4310
    invoke-virtual {p0, p1}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V

    return p3

    .line 4315
    :cond_0
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x30

    if-eq v1, v3, :cond_4

    .line 4316
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x5a

    invoke-virtual {p0, v1, v3}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 131
    :cond_1
    new-instance v1, Ll/ۗۙᩴ;

    iget-object v3, p0, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    invoke-direct {v1, v3}, Ll/ۗۙᩴ;-><init>(Ll/ۛ᩶ᩴ;)V

    .line 132
    iget-boolean v3, p0, Ll/ۗۙᩴ;->b:Z

    iput-boolean v3, v1, Ll/ۗۙᩴ;->b:Z

    .line 133
    iget-boolean v3, p0, Ll/ۗۙᩴ;->c:Z

    iput-boolean v3, v1, Ll/ۗۙᩴ;->c:Z

    .line 4322
    invoke-virtual {p4, v1, p1, p3}, Ll/ۘۙᩴ;->m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I

    move-result p1

    if-gez p1, :cond_3

    .line 4325
    :try_start_0
    sget-object p1, Ll/ۘۙᩴ;->e:Ll/ۘۙᩴ;

    if-ne p4, p1, :cond_2

    not-int p0, p2

    return p0

    .line 357
    :cond_2
    invoke-static {v0, v2}, Ll/ۚ᩹ᩴ;->X(Ljava/lang/String;Z)Ll/ۚ᩹ᩴ;

    move-result-object p1

    .line 4328
    invoke-virtual {p0, p1}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V

    return p3

    .line 4331
    :cond_3
    sget-object p3, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    invoke-virtual {v1, p3}, Ll/ۗۙᩴ;->d(Ll/ᩴۗᩴ;)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    long-to-int p4, p3

    .line 4332
    invoke-static {p4}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object p3

    .line 4333
    invoke-static {v0, p3}, Ll/ۚ᩹ᩴ;->Y(Ljava/lang/String;Ll/ᩳ۬ᩴ;)Ll/ۚ᩹ᩴ;

    move-result-object p3

    invoke-virtual {p0, p3}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    not-int p0, p2

    return p0

    .line 357
    :cond_4
    :goto_0
    invoke-static {v0, v2}, Ll/ۚ᩹ᩴ;->X(Ljava/lang/String;Z)Ll/ۚ᩹ᩴ;

    move-result-object p1

    .line 4317
    invoke-virtual {p0, p1}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V

    return p3
.end method


# virtual methods
.method public a(Ll/ۗۙᩴ;)Ll/֡ۙᩴ;
    .locals 7

    .line 213
    sget-object v1, Ll/ۘ۬ᩴ;->d:Ljava/util/Set;

    .line 4225
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    .line 184
    iget-boolean v0, p1, Ll/ۗۙᩴ;->b:Z

    if-eqz v0, :cond_0

    .line 4227
    sget-object v0, Ll/᩹ۙᩴ;->c:Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    sget-object v0, Ll/᩹ۙᩴ;->d:Ljava/util/Map$Entry;

    :goto_0
    if-eqz v0, :cond_1

    .line 4228
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v2, :cond_8

    :cond_1
    move-object v0, p0

    .line 4229
    monitor-enter v0

    .line 184
    :try_start_0
    iget-boolean v3, p1, Ll/ۗۙᩴ;->b:Z

    if-eqz v3, :cond_2

    .line 4230
    sget-object v3, Ll/᩹ۙᩴ;->c:Ljava/util/Map$Entry;

    goto :goto_1

    :cond_2
    sget-object v3, Ll/᩹ۙᩴ;->d:Ljava/util/Map$Entry;

    :goto_1
    if-eqz v3, :cond_3

    .line 4231
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v2, :cond_7

    .line 4232
    :cond_3
    new-instance v3, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, ""

    .line 184
    iget-boolean v5, p1, Ll/ۗۙᩴ;->b:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    .line 4380
    new-instance v5, Ll/֡ۙᩴ;

    invoke-direct {v5, v4, v6, v6}, Ll/֡ۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֡ۙᩴ;)V

    goto :goto_2

    .line 4382
    :cond_4
    new-instance v5, Ll/᩵ۙᩴ;

    .line 0
    invoke-direct {v5, v4, v6, v6}, Ll/֡ۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֡ۙᩴ;)V

    .line 4394
    :goto_2
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 4395
    invoke-virtual {v5, v4, v4}, Ll/֡ۙᩴ;->a(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_3

    .line 4232
    :cond_5
    invoke-direct {v3, v2, v5}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 184
    iget-boolean p1, p1, Ll/ۗۙᩴ;->b:Z

    if-eqz p1, :cond_6

    .line 4234
    sput-object v3, Ll/᩹ۙᩴ;->c:Ljava/util/Map$Entry;

    goto :goto_4

    .line 4236
    :cond_6
    sput-object v3, Ll/᩹ۙᩴ;->d:Ljava/util/Map$Entry;

    .line 4239
    :cond_7
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v3

    .line 4241
    :cond_8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۙᩴ;

    return-object p1

    :catchall_0
    move-exception p1

    .line 4239
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    .locals 1

    .line 4208
    iget-object v0, p0, Ll/᩹ۙᩴ;->a:Ll/ۡ֨ᩴ;

    invoke-virtual {p1, v0}, Ll/ۤۙᩴ;->b(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩹ᩴ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4212
    :cond_0
    invoke-virtual {p1}, Ll/ۚ᩹ᩴ;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method

.method public final m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I
    .locals 8

    .line 4251
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_9

    if-ne p3, v0, :cond_0

    not-int p1, p3

    return p1

    .line 4260
    :cond_0
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_8

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_1

    goto/16 :goto_0

    :cond_1
    add-int/lit8 v2, p3, 0x2

    const/4 v3, 0x1

    if-lt v0, v2, :cond_5

    add-int/lit8 v4, p3, 0x1

    .line 4264
    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x55

    .line 4265
    invoke-virtual {p1, v1, v5}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v5

    const/16 v6, 0x54

    if-eqz v5, :cond_3

    invoke-virtual {p1, v4, v6}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v5

    if-eqz v5, :cond_3

    add-int/lit8 v1, p3, 0x3

    if-lt v0, v1, :cond_2

    .line 4266
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v3, 0x43

    invoke-virtual {p1, v0, v3}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4267
    sget-object v0, Ll/ۘۙᩴ;->f:Ll/ۘۙᩴ;

    invoke-static {p1, p2, p3, v1, v0}, Ll/᩹ۙᩴ;->b(Ll/ۗۙᩴ;Ljava/lang/CharSequence;IILl/ۘۙᩴ;)I

    move-result p1

    return p1

    .line 4269
    :cond_2
    sget-object v0, Ll/ۘۙᩴ;->f:Ll/ۘۙᩴ;

    invoke-static {p1, p2, p3, v2, v0}, Ll/᩹ۙᩴ;->b(Ll/ۗۙᩴ;Ljava/lang/CharSequence;IILl/ۘۙᩴ;)I

    move-result p1

    return p1

    :cond_3
    const/16 v5, 0x47

    .line 4270
    invoke-virtual {p1, v1, v5}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v5

    if-eqz v5, :cond_5

    add-int/lit8 v5, p3, 0x3

    if-lt v0, v5, :cond_5

    const/16 v7, 0x4d

    .line 4271
    invoke-virtual {p1, v4, v7}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p1, v2, v6}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v2

    if-eqz v2, :cond_5

    add-int/lit8 v1, p3, 0x4

    if-lt v0, v1, :cond_4

    .line 4272
    invoke-interface {p2, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x30

    invoke-virtual {p1, v0, v2}, Ll/ۗۙᩴ;->a(CC)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p2, "GMT0"

    .line 357
    invoke-static {p2, v3}, Ll/ۚ᩹ᩴ;->X(Ljava/lang/String;Z)Ll/ۚ᩹ᩴ;

    move-result-object p2

    .line 4273
    invoke-virtual {p1, p2}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V

    return v1

    .line 4276
    :cond_4
    sget-object v0, Ll/ۘۙᩴ;->f:Ll/ۘۙᩴ;

    invoke-static {p1, p2, p3, v5, v0}, Ll/᩹ۙᩴ;->b(Ll/ۗۙᩴ;Ljava/lang/CharSequence;IILl/ۘۙᩴ;)I

    move-result p1

    return p1

    .line 4281
    :cond_5
    invoke-virtual {p0, p1}, Ll/᩹ۙᩴ;->a(Ll/ۗۙᩴ;)Ll/֡ۙᩴ;

    move-result-object v0

    .line 4282
    new-instance v2, Ljava/text/ParsePosition;

    invoke-direct {v2, p3}, Ljava/text/ParsePosition;-><init>(I)V

    .line 4283
    invoke-virtual {v0, p2, v2}, Ll/֡ۙᩴ;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_7

    const/16 p2, 0x5a

    .line 4285
    invoke-virtual {p1, v1, p2}, Ll/ۗۙᩴ;->a(CC)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 4286
    sget-object p2, Ll/ᩳ۬ᩴ;->f:Ll/ᩳ۬ᩴ;

    invoke-virtual {p1, p2}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V

    add-int/2addr p3, v3

    return p3

    :cond_6
    not-int p1, p3

    return p1

    .line 357
    :cond_7
    invoke-static {p2, v3}, Ll/ۚ᩹ᩴ;->X(Ljava/lang/String;Z)Ll/ۚ᩹ᩴ;

    move-result-object p2

    .line 4291
    invoke-virtual {p1, p2}, Ll/ۗۙᩴ;->e(Ll/ۚ᩹ᩴ;)V

    .line 4292
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result p1

    return p1

    .line 4262
    :cond_8
    :goto_0
    sget-object v0, Ll/ۘۙᩴ;->e:Ll/ۘۙᩴ;

    invoke-static {p1, p2, p3, p3, v0}, Ll/᩹ۙᩴ;->b(Ll/ۗۙᩴ;Ljava/lang/CharSequence;IILl/ۘۙᩴ;)I

    move-result p1

    return p1

    .line 4253
    :cond_9
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 4342
    iget-object v0, p0, Ll/᩹ۙᩴ;->b:Ljava/lang/String;

    return-object v0
.end method
