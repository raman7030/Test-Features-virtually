.class public final Ll/ܰ۠֡;
.super Ljava/lang/Object;
.source "P5UK"


# direct methods
.method public static ֫(Ll/᩹ܶ֡;Ll/ۗ᩵ۚ;Ll/ۘ֫ۚ;Ll/ۤܽۚ;Z)V
    .locals 6

    .line 49
    invoke-interface {p2}, Ll/ۘ֫ۚ;->ܽ()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    .line 51
    sget-object p4, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    .line 52
    invoke-virtual {p4, v0}, Ll/ܺۗ֡;->֫(I)Z

    move-result p4

    if-eqz p4, :cond_1

    sget-object p4, Ll/ܺۗ֡;->۟:Ll/ܺۗ֡;

    .line 53
    invoke-virtual {p4, v0}, Ll/ܺۗ֡;->֫(I)Z

    move-result p4

    if-eqz p4, :cond_1

    if-eqz p3, :cond_1

    .line 55
    invoke-static {p3}, Ll/ۛ᩻ۚ;->֫(Ll/ۤܽۚ;)Z

    move-result p4

    if-nez p4, :cond_0

    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p4, 0x4e

    const-string v0, "# The value of this static final field might be set in the static constructor\n"

    .line 116
    invoke-virtual {p1, v0, v1, p4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 64
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p4, 0x7

    const-string v0, ".field "

    .line 116
    invoke-virtual {p1, v0, v1, p4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 65
    invoke-interface {p2}, Ll/ۘ֫ۚ;->ܽ()I

    move-result p4

    invoke-interface {p2}, Ll/ۘ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v0

    .line 101
    invoke-static {p4}, Ll/ܺۗ֡;->᩻(I)[Ll/ܺۗ֡;

    move-result-object p4

    array-length v2, p4

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x20

    if-ge v3, v2, :cond_2

    aget-object v5, p4, v3

    .line 102
    invoke-virtual {v5}, Ll/ܺۗ֡;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 105
    :cond_2
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۗ֡;

    .line 106
    invoke-virtual {v0}, Ll/ᩴۗ֡;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 107
    invoke-virtual {p1, v4}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_2

    :cond_3
    const/4 p4, 0x1

    .line 66
    invoke-static {p1, p2, p4}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V

    if-eqz p3, :cond_4

    const-string p4, " = "

    const/4 v0, 0x3

    .line 116
    invoke-virtual {p1, p4, v1, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-static {p1, p3}, Ll/ۨ۠֡;->֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V

    :cond_4
    const/16 p3, 0xa

    .line 81
    invoke-virtual {p1, p3}, Ll/ۗ᩵ۚ;->write(I)V

    .line 83
    invoke-interface {p2}, Ll/ۘ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object p2

    .line 84
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p3

    if-lez p3, :cond_5

    .line 85
    invoke-virtual {p1}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    invoke-static {p1, p2}, Ll/ᩴ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    .line 93
    invoke-virtual {p1}, Ll/ۗ᩵ۚ;->֫()V

    const-string p0, ".end field\n"

    const/16 p2, 0xb

    .line 116
    invoke-virtual {p1, p0, v1, p2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    :cond_5
    return-void
.end method
