.class public final Ll/᩺ܿܳ;
.super Ljava/lang/Object;
.source "A6LD"

# interfaces
.implements Ll/ۚ֨֡;


# instance fields
.field public final synthetic ֫:Ll/᩶֨֡;

.field public final synthetic ۧ:Ljava/lang/StringBuilder;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩶֨֡;Ljava/util/TreeMap;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܿܳ;->ܽ:Ljava/lang/String;

    iput-object p2, p0, Ll/᩺ܿܳ;->֫:Ll/᩶֨֡;

    iput-object p3, p0, Ll/᩺ܿܳ;->ᩳ:Ljava/util/TreeMap;

    iput-object p4, p0, Ll/᩺ܿܳ;->ۧ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;)V
    .locals 7

    .line 174
    instance-of v0, p1, Ll/᩶ܿܳ;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/᩺ܿܳ;->֫:Ll/᩶֨֡;

    if-nez v0, :cond_3

    instance-of v3, p1, Ll/᩹ܿܳ;

    if-eqz v3, :cond_0

    goto :goto_2

    .line 188
    :cond_0
    invoke-interface {v2}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ֨֡;->֫()V

    .line 189
    move-object v0, p1

    check-cast v0, Ll/᩷ۚ֡;

    invoke-virtual {v0}, Ll/᩷ۚ֡;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 190
    invoke-virtual {p1}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object p1

    const/4 v3, 0x0

    .line 191
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    iget-object v5, p0, Ll/᩺ܿܳ;->ۧ:Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/᩺ܿܳ;->ᩳ:Ljava/util/TreeMap;

    if-ge v1, v4, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 192
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    add-int/2addr v4, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶ۚ֡;

    invoke-virtual {v5}, Ll/᩶ۚ֡;->ᩳ()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0xa

    .line 193
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    if-gez v3, :cond_1

    .line 194
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 196
    :cond_2
    invoke-interface {v2}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ۨ֨֡;->ۧ(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    invoke-interface {v2}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨ֨֡;->֫()V

    return-void

    :cond_3
    :goto_2
    if-eqz v0, :cond_5

    .line 176
    move-object v3, p1

    check-cast v3, Ll/᩶ܿܳ;

    iget-boolean v3, v3, Ll/᩶ܿܳ;->᩻:Z

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v3, 0x1

    :goto_4
    if-eqz v0, :cond_6

    .line 177
    move-object v4, p1

    check-cast v4, Ll/᩶ܿܳ;

    iget-object v4, v4, Ll/᩶ܿܳ;->ۜ:Ljava/lang/String;

    goto :goto_5

    .line 178
    :cond_6
    move-object v4, p1

    check-cast v4, Ll/᩹ܿܳ;

    iget-object v4, v4, Ll/᩹ܿܳ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_5
    if-eqz v0, :cond_7

    const-string v0, "span"

    goto :goto_6

    :cond_7
    const-string v0, "div"

    .line 180
    :goto_6
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    if-eqz v3, :cond_8

    const-string v3, "math"

    goto :goto_7

    :cond_8
    const-string v3, "inline-math"

    .line 181
    :goto_7
    iget-object v6, p0, Ll/᩺ܿܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    invoke-interface {v2}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object v3

    invoke-interface {v2, p1, v0, v5}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 33
    invoke-virtual {v3, v0, p1, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 183
    invoke-interface {v2}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object p1

    invoke-virtual {p1, v4}, Ll/ۨ֨֡;->ᩳ(Ljava/lang/String;)V

    .line 184
    invoke-interface {v2}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object p1

    const-string v1, "/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 6

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 0
    const-class v3, Ll/᩷ۚ֡;

    aput-object v3, v1, v2

    const-class v3, Ll/᩶ܿܳ;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-class v3, Ll/᩹ܿܳ;

    const/4 v4, 0x2

    aput-object v3, v1, v4

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, v1, v2

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v4, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
