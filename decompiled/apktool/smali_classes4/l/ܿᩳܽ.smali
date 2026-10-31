.class public final Ll/ܿᩳܽ;
.super Ljava/lang/Object;
.source "3BJB"


# static fields
.field public static final ۧ:Ll/ܿᩳܽ;


# instance fields
.field public ֫:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 18
    new-instance v0, Ll/ܿᩳܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܿᩳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    sput-object v0, Ll/ܿᩳܽ;->ۧ:Ll/ܿᩳܽ;

    return-void
.end method

.method public constructor <init>(Ll/ۢ᩻ܽ;)V
    .locals 3

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 23
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    return-void

    .line 25
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ll/ۢ᩻ܽ;->ۚ()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ܽ;

    .line 27
    new-instance v2, Ll/ᩳᩳܽ;

    invoke-direct {v2, v1}, Ll/ᩳᩳܽ;-><init>(Ll/ۘ᩻ܽ;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 29
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ܽᩳܽ;
    .locals 2

    .line 45
    iget-object v0, p0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳᩳܽ;

    .line 46
    invoke-virtual {v1, p1}, Ll/ᩳᩳܽ;->֫(I)Ll/ܽᩳܽ;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܽᩳܽ;
    .locals 2

    .line 35
    iget-object v0, p0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳᩳܽ;

    .line 36
    invoke-virtual {v1, p1}, Ll/ᩳᩳܽ;->֫(Ljava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll/ܽᩳܽ;
    .locals 4

    const-string v0, "http://schemas.android.com/apk/res/android"

    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 103
    invoke-virtual {p0, p2, v0}, Ll/ܿᩳܽ;->֫(Ljava/lang/String;Z)Ll/ܽᩳܽ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 105
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    const-string v2, "id"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    .line 106
    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 107
    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 108
    invoke-static {v2}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ܿᩳܽ;->ۧ(I)Ll/ܽᩳܽ;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    if-eqz p3, :cond_1

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ll/ܽᩳܽ;

    :cond_1
    if-nez v1, :cond_2

    if-nez v0, :cond_2

    .line 118
    invoke-static {}, Ll/ۧᩳܽ;->ܽ()Ll/ܿᩳܽ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ܿᩳܽ;->֫(Ljava/lang/String;)Ll/ܽᩳܽ;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/ܽᩳܽ;
    .locals 3

    if-eqz p2, :cond_2

    .line 57
    iget-object p2, p0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳᩳܽ;

    .line 58
    invoke-virtual {v0}, Ll/ᩳᩳܽ;->ܽ()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 59
    invoke-virtual {v0, p1}, Ll/ᩳᩳܽ;->֫(Ljava/lang/String;)Ll/ܽᩳܽ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 64
    :cond_1
    invoke-static {}, Ll/ۧᩳܽ;->ܽ()Ll/ܿᩳܽ;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ܿᩳܽ;->֫(Ljava/lang/String;)Ll/ܽᩳܽ;

    move-result-object p1

    return-object p1

    .line 88
    :cond_2
    invoke-virtual {p0, p1}, Ll/ܿᩳܽ;->֫(Ljava/lang/String;)Ll/ܽᩳܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(I)Ll/ܽᩳܽ;
    .locals 4

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    if-ne v0, v1, :cond_2

    .line 74
    iget-object v0, p0, Ll/ܿᩳܽ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳᩳܽ;

    .line 75
    invoke-virtual {v2}, Ll/ᩳᩳܽ;->ܽ()I

    move-result v3

    if-ne v3, v1, :cond_0

    .line 76
    invoke-virtual {v2, p1}, Ll/ᩳᩳܽ;->֫(I)Ll/ܽᩳܽ;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    .line 81
    :cond_1
    invoke-static {}, Ll/ۧᩳܽ;->ܽ()Ll/ܿᩳܽ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܿᩳܽ;->֫(I)Ll/ܽᩳܽ;

    move-result-object p1

    return-object p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 96
    :cond_3
    invoke-virtual {p0, p1}, Ll/ܿᩳܽ;->֫(I)Ll/ܽᩳܽ;

    move-result-object p1

    return-object p1
.end method
