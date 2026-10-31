.class public final Ll/۬۬ܳ;
.super Ljava/lang/Object;
.source "M2AR"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final ᩸:Ljava/util/HashMap;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Z)V
    .locals 0

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    iput-object p1, p0, Ll/۬۬ܳ;->᩸:Ljava/util/HashMap;

    .line 280
    iput-boolean p2, p0, Ll/۬۬ܳ;->᩹:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 7

    const-string v0, "AndroidManifest.xml"

    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_9

    const-string v0, "resources.arsc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "classes"

    .line 326
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    const-string v0, ".dex"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x7

    const/4 v3, 0x4

    .line 0
    invoke-static {v3, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 328
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_7

    .line 329
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x39

    if-nez v3, :cond_4

    if-ne v0, v1, :cond_2

    const/16 v6, 0x32

    if-lt v4, v6, :cond_1

    if-le v4, v5, :cond_5

    :cond_1
    return v2

    :cond_2
    const/16 v6, 0x31

    if-lt v4, v6, :cond_3

    if-le v4, v5, :cond_5

    :cond_3
    return v2

    :cond_4
    const/16 v6, 0x30

    if-lt v4, v6, :cond_6

    if-le v4, v5, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v2

    :cond_7
    return v1

    :cond_8
    return v2

    :cond_9
    :goto_2
    return v1
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 274
    check-cast p1, Ll/ᩳۜܳ;

    check-cast p2, Ll/ᩳۜܳ;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 287
    :cond_0
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    const v1, -0x3b9aca00

    if-eqz v0, :cond_1

    goto :goto_0

    .line 289
    :cond_1
    invoke-interface {p2}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    const v2, 0x3b9aca00

    if-eqz v0, :cond_2

    goto :goto_1

    .line 291
    :cond_2
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 293
    :cond_3
    invoke-interface {p2}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 296
    :cond_4
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 297
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_6

    :goto_0
    return v1

    .line 300
    :cond_5
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_1
    return v2

    .line 304
    :cond_6
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    iget-object v2, p0, Ll/۬۬ܳ;->᩸:Ljava/util/HashMap;

    if-nez v0, :cond_9

    .line 305
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۬۬ܳ;->֫(Ljava/lang/String;)Z

    move-result v0

    .line 306
    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/۬۬ܳ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-eqz v0, :cond_7

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    if-nez v0, :cond_8

    if-eqz v3, :cond_8

    const v1, 0x3b9aca00

    goto :goto_2

    .line 313
    :cond_8
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ۬ܳ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۤ۬ܳ;

    invoke-virtual {p1, p2}, Ll/ۤ۬ܳ;->֫(Ll/ۤ۬ܳ;)I

    move-result v1

    goto :goto_2

    .line 317
    :cond_9
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ۬ܳ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۤ۬ܳ;

    invoke-virtual {p1, p2}, Ll/ۤ۬ܳ;->֫(Ll/ۤ۬ܳ;)I

    move-result v1

    .line 319
    :goto_2
    iget-boolean p1, p0, Ll/۬۬ܳ;->᩹:Z

    if-eqz p1, :cond_a

    neg-int p1, v1

    return p1

    :cond_a
    return v1
.end method
