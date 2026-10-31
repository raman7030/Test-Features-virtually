.class public final Ll/ܿ᩷ܿ;
.super Ljava/lang/Object;
.source "B4S2"


# instance fields
.field public final ֫:Ljava/util/Map;

.field public final ۜ:Ljava/util/Map;

.field public final ۧ:Ljava/util/Map;

.field public final ܳ:Ll/۟ۜܿ;

.field public final ܽ:Ljava/util/List;

.field public final ܿ:Ljava/util/Map;

.field public final ᩳ:Ljava/util/Map;

.field public final ᩷:Ljava/util/List;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܳ᩷ܿ;)V
    .locals 7

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ᩷ܿ;->ܳ:Ll/۟ۜܿ;

    .line 174
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    sget v1, Ll/ۜ᩷ܿ;->֫:I

    .line 275
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 174
    iput-object v0, p0, Ll/ܿ᩷ܿ;->ۧ:Ljava/util/Map;

    .line 175
    invoke-static {p1}, Ll/ܳ᩷ܿ;->֫(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    .line 275
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 175
    iput-object v0, p0, Ll/ܿ᩷ܿ;->֫:Ljava/util/Map;

    .line 176
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ܿ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    .line 275
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 176
    iput-object v0, p0, Ll/ܿ᩷ܿ;->ۜ:Ljava/util/Map;

    .line 177
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p1

    .line 275
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 177
    iput-object p1, p0, Ll/ܿ᩷ܿ;->ܿ:Ljava/util/Map;

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 180
    new-instance p1, Ll/۫ۜܿ;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ll/۫ۜܿ;-><init>(I)V

    invoke-static {p1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 181
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩷ܿ;->ܽ:Ljava/util/List;

    .line 182
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 183
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶۜܿ;

    .line 184
    invoke-virtual {v3}, Ll/ܶۜܿ;->ܺ()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 280
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 185
    invoke-static {p1, v5, v3}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 275
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 188
    iput-object p1, p0, Ll/ܿ᩷ܿ;->ᩳ:Ljava/util/Map;

    .line 189
    iget-object p1, p0, Ll/ܿ᩷ܿ;->ۧ:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    .line 309
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v4, v3

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 310
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶۜܿ;

    .line 311
    invoke-virtual {v3}, Ll/ܶۜܿ;->ۘ()Z

    move-result v4

    if-nez v4, :cond_2

    .line 312
    invoke-virtual {v3}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 315
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜܿ;

    .line 316
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۘ()Z

    move-result v3

    if-nez v3, :cond_4

    .line 317
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 320
    :cond_5
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const-string p1, "Text"

    .line 321
    invoke-virtual {v2, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 322
    invoke-virtual {v2}, Ljava/util/ArrayList;->trimToSize()V

    .line 323
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 189
    iput-object p1, p0, Ll/ܿ᩷ܿ;->᩷:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->֫:Ljava/util/Map;

    return-object p0
.end method

.method public static ֫(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ܿ᩷ܿ;->ᩳ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜܿ;

    if-eqz v0, :cond_0

    return-object v0

    .line 203
    :cond_0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->֫:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶۜܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܿ᩷ܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܿ᩷ܿ;->᩻:I

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܿ᩷ܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->᩷:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->ۧ:Ljava/util/Map;

    return-object p0
.end method

.method public static ۧ(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ܿ᩷ܿ;->ܿ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜܿ;

    if-eqz v0, :cond_0

    return-object v0

    .line 196
    :cond_0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->ۧ:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶۜܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܿ᩷ܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿ᩷ܿ;->᩻:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܿ᩷ܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->ܽ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܿ᩷ܿ;)Ll/۟ۜܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->ܳ:Ll/۟ۜܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܿ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->ܿ:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܿ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩷ܿ;->ۜ:Ljava/util/Map;

    return-object p0
.end method
