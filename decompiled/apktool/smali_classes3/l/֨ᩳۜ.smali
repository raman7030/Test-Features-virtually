.class public final Ll/֨ᩳۜ;
.super Ll/ۤᩳܽ;
.source "W6LU"


# instance fields
.field public final ۗ:Ll/֡᩻ܽ;

.field public ۫:I

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۘ᩻ܽ;Ll/֡᩻ܽ;ILjava/util/ArrayList;)V
    .locals 6

    .line 121
    check-cast p1, Ll/۠ᩳܽ;

    invoke-direct {p0, p1, p3}, Ll/ۤᩳܽ;-><init>(Ll/۠ᩳܽ;I)V

    .line 116
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֨ᩳۜ;->۬:Ljava/util/ArrayList;

    .line 122
    iput-object p2, p0, Ll/֨ᩳۜ;->ۗ:Ll/֡᩻ܽ;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 123
    :cond_0
    invoke-interface {p2}, Ll/֡᩻ܽ;->᩷()I

    move-result p1

    :goto_0
    iput p1, p0, Ll/֨ᩳۜ;->۫:I

    .line 124
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 125
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘᩳۜ;

    .line 126
    invoke-virtual {p0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    iget-object v3, v0, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "RESOURCE_PATCH_CORRUPT"

    if-eqz v1, :cond_6

    .line 127
    iget v0, v0, Ll/ۘᩳۜ;->ܳ:I

    const v1, 0xffff

    and-int/2addr v0, v1

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 129
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "Resource patch entry names differ."

    .line 219
    invoke-static {v2, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 130
    throw p1

    :cond_2
    :goto_2
    if-eqz p2, :cond_5

    .line 133
    invoke-interface {p2}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜ᩻ܽ;

    .line 134
    invoke-interface {v4, v0}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4, v0}, Ll/ۜ᩻ܽ;->ܽ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string p1, "Resource patch entry name differs from existing variants."

    .line 219
    invoke-static {v2, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 135
    throw p1

    .line 139
    :cond_5
    iget v1, p0, Ll/֨ᩳۜ;->۫:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/֨ᩳۜ;->۫:I

    goto :goto_1

    :cond_6
    const-string p1, "Resource patch type name differs."

    .line 219
    invoke-static {v2, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 126
    throw p1

    .line 141
    :cond_7
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    if-eqz p2, :cond_a

    .line 143
    invoke-interface {p2}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۜ᩻ܽ;

    .line 144
    invoke-static {p3}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v0

    .line 145
    invoke-static {v0, p4}, Ll/֨ᩳۜ;->֫(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    .line 146
    iget-object v2, p0, Ll/֨ᩳۜ;->۬:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_5

    .line 147
    :cond_8
    new-instance v3, Ll/֡ᩳۜ;

    invoke-direct {v3, p0, p3, v0, v1}, Ll/֡ᩳۜ;-><init>(Ll/֡᩻ܽ;Ll/ۜ᩻ܽ;Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object p3, v3

    .line 146
    :cond_9
    :goto_5
    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 150
    :cond_a
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_b
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۘᩳۜ;

    .line 151
    iget-object v0, p3, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 152
    iget-object v0, p0, Ll/֨ᩳۜ;->۬:Ljava/util/ArrayList;

    new-instance v1, Ll/֡ᩳۜ;

    iget-object p3, p3, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    invoke-static {p3, p4}, Ll/֨ᩳۜ;->֫(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, p3, v2}, Ll/֡ᩳۜ;-><init>(Ll/֡᩻ܽ;Ll/ۜ᩻ܽ;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 167
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘᩳۜ;

    iget-object v2, v1, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final ۜ֫()I
    .locals 1

    .line 172
    iget-object v0, p0, Ll/֨ᩳۜ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۢ()Ljava/lang/Iterable;
    .locals 1

    .line 174
    iget-object v0, p0, Ll/֨ᩳۜ;->۬:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۢ֫()V
    .locals 0

    return-void
.end method

.method public final ܳ(I)Z
    .locals 1

    .line 158
    iget-object v0, p0, Ll/֨ᩳۜ;->ۗ:Ll/֡᩻ܽ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll/֡᩻ܽ;->ܳ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I)Ll/ۜ᩻ܽ;
    .locals 1

    .line 173
    iget-object v0, p0, Ll/֨ᩳۜ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜ᩻ܽ;

    return-object p1
.end method

.method public final ᩷()I
    .locals 1

    .line 171
    iget v0, p0, Ll/֨ᩳۜ;->۫:I

    return v0
.end method

.method public final ᩷(I)I
    .locals 1

    .line 162
    iget-object v0, p0, Ll/֨ᩳۜ;->ۗ:Ll/֡᩻ܽ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {v0, p1}, Ll/֡᩻ܽ;->᩷(I)I

    move-result p1

    return p1
.end method
