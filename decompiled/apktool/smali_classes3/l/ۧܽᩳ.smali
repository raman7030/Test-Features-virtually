.class public final Ll/ۧܽᩳ;
.super Ljava/lang/Object;
.source "U19E"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;II)V
    .locals 1

    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 302
    iput p2, p0, Ll/ۧܽᩳ;->ᩳ:I

    .line 303
    iput p3, p0, Ll/ۧܽᩳ;->ܽ:I

    .line 305
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 306
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֫ܽᩳ;

    const-string p3, "Name"

    .line 307
    invoke-virtual {p2}, Ll/֫ܽᩳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 308
    invoke-virtual {p2}, Ll/֫ܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 311
    :goto_0
    iput-object p2, p0, Ll/ۧܽᩳ;->ۧ:Ljava/lang/String;

    .line 312
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۧܽᩳ;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 355
    iget-object v0, p0, Ll/ۧܽᩳ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ܽᩳ;

    .line 356
    invoke-virtual {v1}, Ll/֫ܽᩳ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 357
    invoke-virtual {v1}, Ll/֫ܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 337
    iget-object v0, p0, Ll/ۧܽᩳ;->֫:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 316
    iget-object v0, p0, Ll/ۧܽᩳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 330
    iget v0, p0, Ll/ۧܽᩳ;->ܽ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 323
    iget v0, p0, Ll/ۧܽᩳ;->ᩳ:I

    return v0
.end method
