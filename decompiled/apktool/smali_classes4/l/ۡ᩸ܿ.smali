.class public abstract Ll/ۡ᩸ܿ;
.super Ll/ܳ᩸ܿ;
.source "O9SL"


# instance fields
.field public ۛ:[Ljava/lang/String;

.field public final ۤ:Ljava/io/File;

.field public ۫:Ll/ۢ᩸ܿ;


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/net/Uri;)V
    .locals 0

    .line 38
    invoke-direct {p0, p2}, Ll/ܳ᩸ܿ;-><init>(Landroid/net/Uri;)V

    .line 39
    iput-object p1, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    return-void
.end method

.method public static synthetic ֫(Ll/ۡ᩸ܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۡ᩸ܿ;->֫ܽ()Z

    move-result p0

    return p0
.end method

.method private ֫ܽ()Z
    .locals 5

    .line 115
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->֨֫()Z

    move-result v0

    return v0

    .line 119
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 120
    instance-of v1, v0, Ll/ۡ᩸ܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Ll/ۡ᩸ܿ;

    .line 121
    invoke-direct {v0}, Ll/ۡ᩸ܿ;->֫ܽ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 124
    :cond_1
    invoke-virtual {v0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    .line 125
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 126
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ܳܶܿ;->ᩳ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    .line 146
    :goto_0
    iget-object v1, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "vnd.android.document/directory"

    .line 163
    invoke-static {v0, v4, v3}, Ll/᩻ܶܿ;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 132
    invoke-static {v0}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    .line 146
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 132
    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    return v4

    .line 135
    :cond_3
    invoke-static {v0}, Ll/᩻ܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    .line 146
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 135
    invoke-static {v3, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 136
    invoke-virtual {p0, v0, v4}, Ll/ܳ᩸ܿ;->֫(Landroid/net/Uri;Z)V

    return v4

    .line 139
    :cond_4
    invoke-static {v0}, Ll/᩻ܶܿ;->ܽ(Landroid/net/Uri;)Z

    :cond_5
    :goto_1
    return v2
.end method

.method public static synthetic ۧ(Ll/ۡ᩸ܿ;)Ljava/lang/Boolean;
    .locals 1

    .line 59
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/ۡ᩸ܿ;->ܳܽ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private ܳܽ()Z
    .locals 5

    .line 66
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 67
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    const-string v2, "*/*"

    .line 146
    iget-object v3, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 69
    invoke-static {v0, v2, v4}, Ll/᩻ܶܿ;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 71
    invoke-static {v0}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 146
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 71
    invoke-static {v2, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    return v4

    .line 74
    :cond_1
    invoke-static {v0}, Ll/᩻ܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 146
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 75
    invoke-virtual {p0, v0, v1}, Ll/ܳ᩸ܿ;->֫(Landroid/net/Uri;Z)V

    return v4

    .line 78
    :cond_2
    invoke-static {v0}, Ll/᩻ܶܿ;->ܽ(Landroid/net/Uri;)Z

    :cond_3
    :goto_0
    return v1
.end method

.method private ᩻ܽ()Z
    .locals 3

    .line 229
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->֨֫()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 413
    invoke-virtual {p0, v1}, Ll/ۡ᩸ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 230
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 231
    check-cast v2, Ll/ۡ᩸ܿ;

    invoke-direct {v2}, Ll/ۡ᩸ܿ;->᩻ܽ()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 236
    :cond_1
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ܽ(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 237
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getParent()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֨֫()Z
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_0

    .line 181
    iget-boolean v0, v0, Ll/ۢ᩸ܿ;->᩸:Z

    return v0

    .line 183
    :cond_0
    invoke-super {p0}, Ll/ܳ᩸ܿ;->֨֫()Z

    move-result v0

    return v0
.end method

.method public abstract ֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡ᩸ܿ;
.end method

.method public ֫(Landroid/database/Cursor;)Ll/۫᩵ܿ;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 422
    invoke-virtual {p0, p1, v2, v0, v1}, Ll/ۡ᩸ܿ;->֫(Landroid/database/Cursor;III)Ll/۫᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/database/Cursor;III)Ll/۫᩵ܿ;
    .locals 8

    .line 435
    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string v0, "vnd.android.document/directory"

    .line 437
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 438
    sget-object p2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    :goto_1
    move-object v2, p2

    goto :goto_3

    :cond_1
    if-eqz p2, :cond_3

    .line 439
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    .line 442
    :cond_2
    sget-object p2, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    goto :goto_1

    .line 440
    :cond_3
    :goto_2
    sget-object p2, Ll/ۗ᩵ܿ;->ۗ:Ll/ۗ᩵ܿ;

    goto :goto_1

    .line 444
    :goto_3
    sget-object p2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    const-wide/16 v0, -0x1

    if-eq v2, p2, :cond_5

    invoke-interface {p1, p3}, Landroid/database/Cursor;->isNull(I)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_4

    .line 445
    :cond_4
    invoke-interface {p1, p3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p2

    move-wide v3, p2

    goto :goto_5

    :cond_5
    :goto_4
    move-wide v3, v0

    .line 446
    :goto_5
    invoke-interface {p1, p4}, Landroid/database/Cursor;->isNull(I)Z

    move-result p2

    if-eqz p2, :cond_6

    move-wide v5, v0

    goto :goto_6

    :cond_6
    invoke-interface {p1, p4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1

    move-wide v5, p1

    .line 447
    :goto_6
    new-instance p1, Ll/۫᩵ܿ;

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/۫᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;JJLjava/lang/String;)V

    return-object p1
.end method

.method public ֫(Ljava/io/File;Landroid/net/Uri;Landroid/database/Cursor;)Ll/ܶ᩵ܿ;
    .locals 4

    .line 451
    invoke-virtual {p0, p1, p2}, Ll/ۡ᩸ܿ;->֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡ᩸ܿ;

    move-result-object p1

    .line 452
    new-instance p2, Ll/ۢ᩸ܿ;

    .line 507
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 453
    invoke-interface {p3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "vnd.android.document/directory"

    .line 454
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p2, Ll/ۢ᩸ܿ;->᩸:Z

    const/4 v0, 0x3

    .line 455
    invoke-interface {p3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    move-wide v0, v2

    goto :goto_1

    :cond_1
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    :goto_1
    iput-wide v0, p2, Ll/ۢ᩸ܿ;->᩶:J

    const/4 v0, 0x4

    .line 456
    invoke-interface {p3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    :goto_2
    iput-wide v2, p2, Ll/ۢ᩸ܿ;->᩹:J

    .line 457
    iput-object p2, p1, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    return-object p1
.end method

.method public ֫(Ljava/io/File;Landroid/net/Uri;Z)V
    .locals 0

    return-void
.end method

.method public final ֫֫()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()Z
    .locals 3

    .line 58
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    new-instance v0, Ll/᩷᩸ܿ;

    invoke-direct {v0, p0}, Ll/᩷᩸ܿ;-><init>(Ll/ۡ᩸ܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 61
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/ۡ᩸ܿ;->ܳܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public ۗۧ()Ll/ۡ᩸ܿ;
    .locals 2

    .line 110
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 111
    instance-of v1, v0, Ll/ۡ᩸ܿ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۡ᩸ܿ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۙ()Z
    .locals 3

    .line 85
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    new-instance v0, Ll/᩻᩸ܿ;

    invoke-direct {v0, p0}, Ll/᩻᩸ܿ;-><init>(Ll/ۡ᩸ܿ;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v2, 0x1f4

    .line 317
    invoke-static {v0, v1, v2}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 88
    :cond_0
    invoke-direct {p0}, Ll/ۡ᩸ܿ;->֫ܽ()Z

    move-result v0

    return v0
.end method

.method public ۛ֫()J
    .locals 2

    .line 197
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_0

    .line 199
    iget-wide v0, v0, Ll/ۢ᩸ܿ;->᩹:J

    return-wide v0

    .line 201
    :cond_0
    invoke-super {p0}, Ll/ܳ᩸ܿ;->ۛ֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public ۛۧ()Ljava/lang/String;
    .locals 3

    .line 348
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    .line 349
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v2, "content"

    .line 350
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 351
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "tree"

    .line 352
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 353
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 354
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۟ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۠֫()Z
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_0

    .line 172
    iget-boolean v0, v0, Ll/ۢ᩸ܿ;->᩸:Z

    xor-int/lit8 v0, v0, 0x1

    return v0

    .line 174
    :cond_0
    invoke-super {p0}, Ll/ܳ᩸ܿ;->۠֫()Z

    move-result v0

    return v0
.end method

.method public ۤ()Z
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 165
    :cond_0
    invoke-super {p0}, Ll/ܳ᩸ܿ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ۤ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۤۧ()[Ljava/lang/String;
    .locals 5

    const-string v0, "_size"

    const-string v1, "last_modified"

    const-string v2, "document_id"

    const-string v3, "_display_name"

    const-string v4, "mime_type"

    .line 398
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Z)Ljava/util/List;
    .locals 7

    .line 359
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 360
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v1

    .line 361
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Ll/ܳܶܿ;->֫(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    .line 362
    iget-object v3, p0, Ll/ۡ᩸ܿ;->ۛ:[Ljava/lang/String;

    if-nez v3, :cond_0

    .line 364
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۤۧ()[Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ۡ᩸ܿ;->ۛ:[Ljava/lang/String;

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 366
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_1

    .line 368
    :try_start_1
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩺ۧ()V

    if-eqz v1, :cond_8

    goto :goto_1

    .line 371
    :cond_1
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۨۧ()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 372
    :cond_3
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x0

    .line 373
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 374
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-nez p1, :cond_4

    const-string v5, "."

    .line 375
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_4
    if-eqz v2, :cond_5

    .line 376
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 377
    :cond_5
    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 378
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v4

    invoke-static {v4, v3}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 379
    invoke-virtual {p0, v5, v3, v1}, Ll/ۡ᩸ܿ;->֫(Ljava/io/File;Landroid/net/Uri;Landroid/database/Cursor;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 380
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v6

    invoke-virtual {p0, v5, v3, v6}, Ll/ۡ᩸ܿ;->֫(Ljava/io/File;Landroid/net/Uri;Z)V

    .line 381
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 385
    :cond_6
    :goto_1
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_7

    .line 366
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_8
    return-object v0
.end method

.method public ۧ(Landroid/database/Cursor;)Ll/۫᩵ܿ;
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x2

    .line 429
    invoke-virtual {p0, p1, v2, v0, v1}, Ll/ۡ᩸ܿ;->֫(Landroid/database/Cursor;III)Ll/۫᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 2

    .line 280
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    new-instance v0, Ll/ۜ᩸ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۜ᩸ܿ;-><init>(Ll/ۡ᩸ܿ;Ll/ܶ᩵ܿ;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v1, 0x1388

    invoke-static {v0, p1, v1}, Ll/ܳ᩸ܿ;->֫(Ljava/util/concurrent/Callable;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 283
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۡ᩸ܿ;->ܽ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    return p1
.end method

.method public ۨۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۬()Z
    .locals 3

    .line 206
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ܽ(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 207
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v1

    .line 214
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 413
    invoke-virtual {p0, v1}, Ll/ۡ᩸ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 215
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 216
    check-cast v2, Ll/ۡ᩸ܿ;

    invoke-direct {v2}, Ll/ۡ᩸ܿ;->᩻ܽ()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 220
    :cond_2
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܶܿ;->ܽ(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 221
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v1

    :cond_3
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۬ۧ()[Ljava/lang/String;
    .locals 3

    const-string v0, "_size"

    const-string v1, "last_modified"

    const-string v2, "mime_type"

    .line 411
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ֫()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Z)Ljava/io/OutputStream;
    .locals 2

    .line 476
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/ۡ᩸ܿ;->ܳܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 477
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 479
    :cond_1
    :goto_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v1

    if-eqz p1, :cond_2

    const-string p1, "wa"

    goto :goto_1

    :cond_2
    const-string p1, "wt"

    :goto_1
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ܶ᩵ܿ;)Z
    .locals 8

    .line 288
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 291
    :cond_0
    check-cast p1, Ll/ۡ᩸ܿ;

    iget-object v0, p1, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    .line 292
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۛۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۡ᩸ܿ;->ۛۧ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    .line 295
    :cond_1
    invoke-virtual {p1}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ll/ۡ᩸ܿ;->۬()Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    .line 157
    :cond_2
    iget-object v2, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v4

    .line 298
    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    .line 146
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    .line 328
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0, v3, p1}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 330
    invoke-static {v0}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 331
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v4

    .line 333
    :cond_3
    invoke-static {v0}, Ll/᩻ܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 334
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v4

    .line 338
    :cond_4
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object p1

    .line 146
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    .line 338
    invoke-static {p1, v0, v2}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    .line 303
    :cond_5
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 304
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    if-eqz v2, :cond_8

    if-eqz p1, :cond_8

    .line 307
    :try_start_1
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v7

    invoke-static {v3, v5, v6, v7}, Landroid/provider/DocumentsContract;->moveDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 309
    invoke-static {v3}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 146
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    .line 309
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 310
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v4

    .line 312
    :cond_6
    invoke-static {v3}, Ll/᩻ܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 146
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 312
    invoke-static {v5, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 313
    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->᩶ۧ()V

    return v4

    .line 317
    :cond_7
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v0, v3, p1, v2}, Landroid/provider/DocumentsContract;->moveDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_8
    :goto_0
    return v1
.end method

.method public ᩶ۧ()V
    .locals 1

    .line 493
    invoke-super {p0}, Ll/ܳ᩸ܿ;->᩶ۧ()V

    const/4 v0, 0x0

    .line 494
    iput-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ۖۖܽ;
    .locals 1

    const-string v0, "r"

    .line 485
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۡ᩸ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/ۡ᩸ܿ;->ܳܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 486
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 488
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, p1}, Ll/֡ۖܽ;->֫(Landroid/net/Uri;Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩹()Ll/ۤ᩵ܿ;
    .locals 1

    .line 97
    new-instance v0, Ll/ۖ᩸ܿ;

    invoke-direct {v0, p0}, Ll/ۖ᩸ܿ;-><init>(Ll/ۡ᩸ܿ;)V

    return-object v0
.end method

.method public final ᩺()Ll/ܶ᩵ܿ;
    .locals 2

    .line 47
    iget-object v0, p0, Ll/ۡ᩸ܿ;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/ۡ᩸ܿ;->֫(Ljava/io/File;Landroid/net/Uri;)Ll/ۡ᩸ܿ;

    move-result-object v0

    return-object v0
.end method

.method public ᩺֫()J
    .locals 2

    .line 188
    iget-object v0, p0, Ll/ۡ᩸ܿ;->۫:Ll/ۢ᩸ܿ;

    if-eqz v0, :cond_0

    .line 190
    iget-wide v0, v0, Ll/ۢ᩸ܿ;->᩶:J

    return-wide v0

    .line 192
    :cond_0
    invoke-super {p0}, Ll/ܳ᩸ܿ;->᩺֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public ᩺ۧ()V
    .locals 0

    return-void
.end method
