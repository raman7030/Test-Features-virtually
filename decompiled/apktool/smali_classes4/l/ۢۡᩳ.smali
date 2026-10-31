.class public final Ll/ۢۡᩳ;
.super Ll/ܽۡᩳ;
.source "41WV"


# instance fields
.field public ۖ:Ll/۬ᩳۚ;

.field public ۡ:Ll/ۙܺᩳ;

.field public ܺ:Ll/ۧۤ֡;


# direct methods
.method public constructor <init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V
    .locals 4

    .line 43
    invoke-direct {p0, p1, p2}, Ll/ܽۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    .line 39
    new-instance p2, Ll/۬ᩳۚ;

    const-string v0, "[B"

    .line 40
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "V"

    const-string v2, "Ljava/lang/String;"

    const-string v3, "<init>"

    invoke-direct {p2, v2, v3, v1, v0}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object p2, p0, Ll/ۢۡᩳ;->ۖ:Ll/۬ᩳۚ;

    .line 58
    new-instance p2, Ll/ۙܺᩳ;

    invoke-direct {p2, p1}, Ll/ۙܺᩳ;-><init>(Ll/ܿۡᩳ;)V

    iput-object p2, p0, Ll/ۢۡᩳ;->ۡ:Ll/ۙܺᩳ;

    .line 44
    sget-object p1, Ll/ۨܺᩳ;->ۙ:Ll/ۨܺᩳ;

    iput-object p1, p0, Ll/ܽۡᩳ;->᩻:Ll/ۨܺᩳ;

    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, Ll/ܽۡᩳ;->ۜ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰܺᩳ;)I
    .locals 0

    .line 86
    iget-object p1, p0, Ll/ۢۡᩳ;->ܺ:Ll/ۧۤ֡;

    invoke-virtual {p1}, Ll/ۧۤ֡;->֫()I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "NewStringBytes"

    return-object v0
.end method

.method public final ֫(Ll/֨ۢۚ;Ll/ܶۢᩳ;Ll/᩺ܺᩳ;I)Ljava/lang/String;
    .locals 5

    .line 69
    invoke-virtual {p3}, Ll/᩺ܺᩳ;->ᩳ()I

    move-result v0

    .line 70
    invoke-virtual {p3}, Ll/᩺ܺᩳ;->ܿ()I

    move-result p3

    .line 71
    iget-object v1, p0, Ll/ۢۡᩳ;->ۡ:Ll/ۙܺᩳ;

    invoke-virtual {v1, p2, p4, p3}, Ll/ۙܺᩳ;->֫(Ll/ܶۢᩳ;II)Z

    move-result p3

    const/4 v2, 0x0

    if-eqz p3, :cond_9

    .line 72
    iget-object p2, p2, Ll/ܶۢᩳ;->ۧ:Ljava/util/List;

    .line 98
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ltz p4, :cond_7

    .line 101
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟۬֡;

    .line 102
    invoke-static {v0}, Ll/ۙۢᩳ;->֫(Ll/۟۬֡;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    .line 104
    :cond_0
    invoke-virtual {v0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v3

    sget-object v4, Ll/֨ۗ֡;->ܺܳ:Ll/֨ۗ֡;

    if-ne v3, v4, :cond_3

    .line 182
    move-object v3, v0

    check-cast v3, Ll/֫ۧۚ;

    invoke-interface {v3}, Ll/֫ۧۚ;->֫()I

    move-result v3

    .line 106
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    .line 164
    :cond_1
    move-object v3, v0

    check-cast v3, Ll/ۧۧۚ;

    invoke-interface {v3}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v3

    .line 108
    check-cast v3, Ll/᩸ܽۚ;

    .line 109
    invoke-interface {v3}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Ljava/lang/String;"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 111
    :cond_2
    check-cast v0, Ll/ۧۤ֡;

    goto :goto_4

    .line 112
    :cond_3
    invoke-static {v0}, Ll/ۙۢᩳ;->ܽ(Ll/۟۬֡;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 182
    move-object v3, v0

    check-cast v3, Ll/֫ۧۚ;

    invoke-interface {v3}, Ll/֫ۧۚ;->֫()I

    move-result v3

    .line 114
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 186
    move-object v3, v0

    check-cast v3, Ll/᩻ۧۚ;

    invoke-interface {v3}, Ll/᩻ۧۚ;->ܶ()I

    move-result v3

    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 117
    :cond_4
    new-instance v3, Ll/᩷ۡᩳ;

    invoke-direct {v3, p3}, Ll/᩷ۡᩳ;-><init>(Ljava/util/HashSet;)V

    const/4 v4, 0x0

    .line 16
    invoke-static {v0, v4, v3}, Ll/۬ۗ֡;->֫(Ll/᩺֫ۚ;ZLl/ۗۗ֡;)V

    .line 129
    :cond_5
    :goto_1
    invoke-virtual {p3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v0}, Ll/۟۬֡;->ۤ()Ll/ܺ۫֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ۫֡;->ܿ()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/AbstractCollection;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    add-int/lit8 p4, p4, -0x1

    goto/16 :goto_0

    :cond_7
    :goto_3
    move-object v0, v2

    .line 72
    :goto_4
    iput-object v0, p0, Ll/ۢۡᩳ;->ܺ:Ll/ۧۤ֡;

    if-nez v0, :cond_8

    .line 74
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-object v2

    .line 77
    :cond_8
    new-instance p1, Ljava/lang/String;

    invoke-virtual {v1}, Ll/ۙܺᩳ;->֫()[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    return-object p1

    .line 79
    :cond_9
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-object v2
.end method

.method public final ֫(Ll/ܿۡᩳ;)Ljava/util/List;
    .locals 0

    .line 55
    iget-object p1, p0, Ll/ۢۡᩳ;->ۖ:Ll/۬ᩳۚ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܶۢᩳ;Ll/֡ۢᩳ;Ll/᩺ܺᩳ;Ll/ܰܺᩳ;)V
    .locals 1

    .line 91
    iget-object p4, p0, Ll/ۢۡᩳ;->ܺ:Ll/ۧۤ֡;

    invoke-virtual {p4}, Ll/۟۬֡;->ۤ()Ll/ܺ۫֡;

    move-result-object p4

    invoke-virtual {p4}, Ll/ܺ۫֡;->ܽ()I

    move-result p4

    .line 92
    iget-object v0, p1, Ll/ܶۢᩳ;->֫:Ll/֨۫֡;

    invoke-virtual {v0, p4, p2}, Ll/֨۫֡;->ۧ(ILl/۟۬֡;)V

    .line 93
    invoke-virtual {p3}, Ll/᩺ܺᩳ;->֫()Ll/۟۬֡;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/֨۫֡;->ۧ(Ll/۟۬֡;)V

    .line 94
    iget-object p2, p0, Ll/ۢۡᩳ;->ۡ:Ll/ۙܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۙܺᩳ;->֫(Ll/ܶۢᩳ;)V

    return-void
.end method
