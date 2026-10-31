.class public final Ll/ᩳۗۜ;
.super Ljava/lang/Object;
.source "N7FV"


# static fields
.field public static final ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Ll/ᩳۗۜ;->֫:Ljava/util/ArrayList;

    .line 23
    new-instance v1, Ll/ܽۗۜ;

    const-string v2, ".ass"

    const-string v3, "text/x-ssa"

    invoke-direct {v1, v2, v3}, Ll/ܽۗۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v1, Ll/ܽۗۜ;

    const-string v2, ".ssa"

    invoke-direct {v1, v2, v3}, Ll/ܽۗۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    new-instance v1, Ll/ܽۗۜ;

    const-string v2, ".srt"

    const-string v3, "application/x-subrip"

    invoke-direct {v1, v2, v3}, Ll/ܽۗۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v1, Ll/ܽۗۜ;

    const-string v2, ".vtt"

    const-string v3, "text/vtt"

    invoke-direct {v1, v2, v3}, Ll/ܽۗۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v1, Ll/ܽۗۜ;

    const-string v2, ".ttml"

    const-string v3, "application/ttml+xml"

    invoke-direct {v1, v2, v3}, Ll/ܽۗۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 133
    invoke-static {p0}, Ll/ᩳۗۜ;->ۧ(Ljava/lang/String;)Ll/ܽۗۜ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 134
    :cond_0
    invoke-virtual {p0}, Ll/ܽۗۜ;->֫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳۜܳ;Ll/ܰܺܳ;)Ljava/util/ArrayList;
    .locals 8

    .line 38
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۗۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-virtual {p1}, Ll/ܰܺܳ;->ᩳ()Z

    move-result v1

    .line 40
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    invoke-interface {p0}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 42
    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ᩳۗۜ;->ۧ(Ljava/lang/String;)Ll/ܽۗۜ;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 49
    :cond_2
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ᩳۗۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 50
    new-instance v6, Ll/ۧۗۜ;

    .line 52
    invoke-virtual {v4}, Ll/ܽۗۜ;->֫()Ljava/lang/String;

    move-result-object v7

    if-eqz v1, :cond_3

    .line 141
    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    goto :goto_1

    .line 142
    :cond_3
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 54
    :goto_1
    invoke-virtual {v4}, Ll/ܽۗۜ;->ܽ()I

    move-result v4

    invoke-direct {v6, v3, v7, v5, v4}, Ll/ۧۗۜ;-><init>(Ll/ᩳۜܳ;Ljava/lang/String;ZI)V

    .line 50
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 57
    :cond_4
    new-instance p0, Ll/۟ۙۜ;

    invoke-direct {p0, v1}, Ll/۟ۙۜ;-><init>(Z)V

    invoke-static {v2, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 73
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۗۜ;

    .line 75
    new-instance v1, Ll/֫ۗۜ;

    invoke-virtual {v0}, Ll/ۧۗۜ;->֫()Ll/ᩳۜܳ;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۧۗۜ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll/֫ۗۜ;-><init>(Ll/ᩳۜܳ;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    return-object p0
.end method

.method public static ֫(Ljava/util/List;Ll/ᩳۜܳ;Z)Ll/֫ۗۜ;
    .locals 2

    .line 95
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۗۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۗۜ;

    .line 97
    invoke-virtual {v0}, Ll/֫ۗۜ;->֫()Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ᩳۗۜ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_1

    .line 141
    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_0

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ܽۗۜ;
    .locals 5

    .line 118
    invoke-static {p0}, Ll/ܶ᩵ܿ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 119
    sget-object v0, Ll/ᩳۗۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 120
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۗۜ;

    .line 121
    invoke-virtual {v3}, Ll/ܽۗۜ;->ᩳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 122
    invoke-static {v3, v2}, Ll/ܽۗۜ;->֫(Ll/ܽۗۜ;I)Ll/ܽۗۜ;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 109
    invoke-static {p0}, Ll/ܶ᩵ܿ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 113
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
