.class public final Ll/۫᩺֫;
.super Ll/ۤ᩺֫;
.source "D7NJ"


# static fields
.field public static final ۘ:Ll/۫᩺֫;


# instance fields
.field public final ۖ:Ljava/util/List;

.field public final ۜ:Ljava/util/List;

.field public final ۡ:Ljava/util/Map;

.field public final ۢ:Ljava/util/List;

.field public final ܳ:Ljava/util/List;

.field public final ܺ:Ljava/util/List;

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Ljava/util/List;

.field public final ᩷:Ljava/util/List;

.field public final ᩻:Ll/۠ᩴ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 35
    new-instance v13, Ll/۫᩺֫;

    .line 38
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v10, 0x0

    .line 47
    sget-object v11, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v1, ""

    const/4 v8, 0x0

    move-object v0, v13

    move-object v2, v12

    move-object v3, v12

    move-object v4, v12

    move-object v5, v12

    move-object v6, v12

    move-object v7, v12

    move-object v9, v12

    .line 48
    invoke-direct/range {v0 .. v12}, Ll/۫᩺֫;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll/۠ᩴ֫;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    sput-object v13, Ll/۫᩺֫;->ۘ:Ll/۫᩺֫;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll/۠ᩴ֫;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V
    .locals 1

    .line 216
    invoke-direct {p0, p1, p2, p10}, Ll/ۤ᩺֫;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 281
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    .line 282
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p10

    if-ge p2, p10, :cond_1

    .line 283
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p10

    check-cast p10, Ll/۬᩺֫;

    iget-object p10, p10, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    .line 284
    invoke-virtual {p1, p10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 285
    invoke-virtual {p1, p10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 288
    :cond_1
    invoke-static {p4, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 289
    invoke-static {p5, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 290
    invoke-static {p6, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 291
    invoke-static {p7, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 218
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ܳ:Ljava/util/List;

    .line 220
    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    .line 221
    invoke-static {p4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ۖ:Ljava/util/List;

    .line 222
    invoke-static {p5}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ᩳ:Ljava/util/List;

    .line 223
    invoke-static {p6}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ۢ:Ljava/util/List;

    .line 224
    invoke-static {p7}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ܿ:Ljava/util/List;

    .line 225
    iput-object p8, p0, Ll/۫᩺֫;->᩻:Ll/۠ᩴ֫;

    if-eqz p9, :cond_2

    .line 227
    invoke-static {p9}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Ll/۫᩺֫;->ۜ:Ljava/util/List;

    .line 228
    invoke-static {p11}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->ۡ:Ljava/util/Map;

    .line 229
    invoke-static {p12}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩺֫;->᩷:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/util/List;ILjava/util/List;)Ljava/util/ArrayList;
    .locals 6

    .line 306
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 317
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 318
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    .line 319
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 320
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵֫;

    .line 321
    iget v5, v4, Ll/ܶ᩵֫;->᩸:I

    if-ne v5, p1, :cond_0

    iget v4, v4, Ll/ܶ᩵֫;->᩶:I

    if-ne v4, v1, :cond_0

    .line 322
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 3

    const/4 v0, 0x0

    .line 296
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 297
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺֫;

    iget-object v1, v1, Ll/ۗ᩺֫;->ܽ:Landroid/net/Uri;

    .line 298
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 299
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)Ljava/lang/Object;
    .locals 14

    .line 234
    new-instance v13, Ll/۫᩺֫;

    iget-object v0, p0, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    const/4 v1, 0x0

    .line 237
    invoke-static {v0, v1, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;ILjava/util/List;)Ljava/util/ArrayList;

    move-result-object v3

    .line 239
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iget-object v0, p0, Ll/۫᩺֫;->ᩳ:Ljava/util/List;

    const/4 v1, 0x1

    .line 240
    invoke-static {v0, v1, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;ILjava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v0, p0, Ll/۫᩺֫;->ۢ:Ljava/util/List;

    const/4 v1, 0x2

    .line 241
    invoke-static {v0, v1, p1}, Ll/۫᩺֫;->֫(Ljava/util/List;ILjava/util/List;)Ljava/util/ArrayList;

    move-result-object v6

    .line 243
    iget-object v11, p0, Ll/۫᩺֫;->ۡ:Ljava/util/Map;

    iget-object v12, p0, Ll/۫᩺֫;->᩷:Ljava/util/List;

    iget-object v1, p0, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/ۤ᩺֫;->ܽ:Ljava/util/List;

    iget-object v8, p0, Ll/۫᩺֫;->᩻:Ll/۠ᩴ֫;

    iget-object v9, p0, Ll/۫᩺֫;->ۜ:Ljava/util/List;

    iget-boolean v10, p0, Ll/ۤ᩺֫;->ۧ:Z

    move-object v0, v13

    move-object v4, v7

    invoke-direct/range {v0 .. v12}, Ll/۫᩺֫;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll/۠ᩴ֫;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    return-object v13
.end method
