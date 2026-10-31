.class public final Ll/ܽ֫᩷;
.super Ljava/lang/Object;
.source "U75B"


# instance fields
.field public final ֫:Ll/ۙ۟ۜ;

.field public final ۧ:Ll/ۙ۟ۜ;

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ll/ۙ۟ۜ;

.field public final ܿ:Ljava/util/ArrayList;

.field public final ᩳ:Ll/ۙ۟ۜ;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;II)V
    .locals 0

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 317
    invoke-static {p1}, Ll/ᩳ֫᩷;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ֫᩷;->ܿ:Ljava/util/ArrayList;

    .line 318
    invoke-static {p2}, Ll/ᩳ֫᩷;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ֫᩷;->ܳ:Ljava/util/ArrayList;

    .line 319
    invoke-static {p3}, Ll/ᩳ֫᩷;->֫(Ll/ۙ۟ۜ;)Ll/ۙ۟ۜ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ֫᩷;->֫:Ll/ۙ۟ۜ;

    .line 320
    invoke-static {p4}, Ll/ᩳ֫᩷;->֫(Ll/ۙ۟ۜ;)Ll/ۙ۟ۜ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ֫᩷;->ۧ:Ll/ۙ۟ۜ;

    const/4 p1, 0x0

    if-nez p5, :cond_0

    .line 321
    new-instance p2, Ll/ۙ۟ۜ;

    invoke-direct {p2, p1, p7}, Ll/ۙ۟ۜ;-><init>(II)V

    goto :goto_0

    :cond_0
    invoke-static {p5}, Ll/ᩳ֫᩷;->֫(Ll/ۙ۟ۜ;)Ll/ۙ۟ۜ;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Ll/ܽ֫᩷;->ܽ:Ll/ۙ۟ۜ;

    if-nez p6, :cond_1

    .line 322
    new-instance p2, Ll/ۙ۟ۜ;

    invoke-direct {p2, p1, p8}, Ll/ۙ۟ۜ;-><init>(II)V

    goto :goto_1

    :cond_1
    invoke-static {p6}, Ll/ᩳ֫᩷;->֫(Ll/ۙ۟ۜ;)Ll/ۙ۟ۜ;

    move-result-object p2

    :goto_1
    iput-object p2, p0, Ll/ܽ֫᩷;->ᩳ:Ll/ۙ۟ۜ;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 4

    .line 341
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 344
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 345
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ۟ۜ;

    invoke-static {v1, v3}, Ll/ܽ֫᩷;->֫(Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 359
    :cond_0
    iget v2, p0, Ll/ۙ۟ۜ;->᩹:I

    iget v3, p1, Ll/ۙ۟ۜ;->᩹:I

    if-ne v2, v3, :cond_1

    iget p0, p0, Ll/ۙ۟ۜ;->᩸:I

    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    return v0

    :cond_2
    :goto_0
    if-ne p0, p1, :cond_3

    return v1

    :cond_3
    return v0
.end method


# virtual methods
.method public final ֫(Ll/ܽ֫᩷;)Z
    .locals 2

    .line 329
    iget-object v0, p0, Ll/ܽ֫᩷;->ܿ:Ljava/util/ArrayList;

    iget-object v1, p1, Ll/ܽ֫᩷;->ܿ:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/ܽ֫᩷;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫᩷;->ܳ:Ljava/util/ArrayList;

    iget-object v1, p1, Ll/ܽ֫᩷;->ܳ:Ljava/util/ArrayList;

    .line 330
    invoke-static {v0, v1}, Ll/ܽ֫᩷;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫᩷;->֫:Ll/ۙ۟ۜ;

    iget-object v1, p1, Ll/ܽ֫᩷;->֫:Ll/ۙ۟ۜ;

    .line 331
    invoke-static {v0, v1}, Ll/ܽ֫᩷;->֫(Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫᩷;->ۧ:Ll/ۙ۟ۜ;

    iget-object v1, p1, Ll/ܽ֫᩷;->ۧ:Ll/ۙ۟ۜ;

    .line 332
    invoke-static {v0, v1}, Ll/ܽ֫᩷;->֫(Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫᩷;->ܽ:Ll/ۙ۟ۜ;

    iget-object v1, p1, Ll/ܽ֫᩷;->ܽ:Ll/ۙ۟ۜ;

    .line 333
    invoke-static {v0, v1}, Ll/ܽ֫᩷;->֫(Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ֫᩷;->ᩳ:Ll/ۙ۟ۜ;

    iget-object p1, p1, Ll/ܽ֫᩷;->ᩳ:Ll/ۙ۟ۜ;

    .line 334
    invoke-static {v0, p1}, Ll/ܽ֫᩷;->֫(Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
