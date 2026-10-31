.class public final Ll/ۧܿۖ;
.super Ljava/util/AbstractSet;
.source "1AZL"


# instance fields
.field public final synthetic ᩸:Ll/᩻ܿۖ;


# direct methods
.method public constructor <init>(Ll/᩻ܿۖ;)V
    .locals 0

    .line 600
    iput-object p1, p0, Ll/ۧܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 637
    iget-object v0, p0, Ll/ۧܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-virtual {v0}, Ll/᩻ܿۖ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 618
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧܿۖ;->᩸:Ll/᩻ܿۖ;

    check-cast p1, Ljava/util/Map$Entry;

    .line 231
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 216
    :try_start_0
    invoke-virtual {v0, v2, v1}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    .line 232
    iget-object v2, v0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 237
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move-object v3, v0

    :cond_1
    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 608
    new-instance v0, Ll/֫ܿۖ;

    iget-object v1, p0, Ll/ۧܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-direct {v0, v1}, Ll/ܿܿۖ;-><init>(Ll/᩻ܿۖ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 623
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 627
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 231
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 216
    iget-object v2, p0, Ll/ۧܿۖ;->᩸:Ll/᩻ܿۖ;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v2, v0, v1}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    .line 232
    iget-object v4, v0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 237
    invoke-static {v4, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    move-object v3, v0

    :cond_2
    if-nez v3, :cond_3

    :goto_1
    return v1

    :cond_3
    const/4 p1, 0x1

    .line 631
    invoke-virtual {v2, v3, p1}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Z)V

    return p1
.end method

.method public final size()I
    .locals 1

    .line 603
    iget-object v0, p0, Ll/ۧܿۖ;->᩸:Ll/᩻ܿۖ;

    iget v0, v0, Ll/᩻ܿۖ;->ۤ:I

    return v0
.end method
