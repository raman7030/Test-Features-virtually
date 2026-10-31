.class public final Ll/֫᩵ܺ;
.super Ljava/lang/Object;
.source "2B8B"


# instance fields
.field public final ֫:Ll/ۢ۬ܺ;

.field public final ۧ:Ljava/util/Map;

.field public final ܽ:Ll/ۢ۬ܺ;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/Map;)V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    iput-object p1, p0, Ll/֫᩵ܺ;->ܿ:Ljava/lang/String;

    .line 208
    iput-object p2, p0, Ll/֫᩵ܺ;->ᩳ:Ljava/lang/String;

    .line 209
    invoke-static {p3}, Ll/ۢ۬ܺ;->copyOf(Ljava/util/Map;)Ll/ۢ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩵ܺ;->ܽ:Ll/ۢ۬ܺ;

    .line 210
    invoke-static {p4}, Ll/ۢ۬ܺ;->copyOf(Ljava/util/Map;)Ll/ۢ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩵ܺ;->֫:Ll/ۢ۬ܺ;

    .line 211
    iput-object p5, p0, Ll/֫᩵ܺ;->ۧ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 326
    :cond_0
    instance-of v1, p1, Ll/֫᩵ܺ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 330
    :cond_1
    check-cast p1, Ll/֫᩵ܺ;

    .line 332
    iget-object v1, p0, Ll/֫᩵ܺ;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫᩵ܺ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵ܺ;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫᩵ܺ;->ܿ:Ljava/lang/String;

    .line 333
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵ܺ;->ܽ:Ll/ۢ۬ܺ;

    iget-object v3, p1, Ll/֫᩵ܺ;->ܽ:Ll/ۢ۬ܺ;

    .line 334
    invoke-virtual {v1, v3}, Ll/ۢ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵ܺ;->֫:Ll/ۢ۬ܺ;

    iget-object v3, p1, Ll/֫᩵ܺ;->֫:Ll/ۢ۬ܺ;

    .line 335
    invoke-virtual {v1, v3}, Ll/ۢ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵ܺ;->ۧ:Ljava/util/Map;

    iget-object p1, p1, Ll/֫᩵ܺ;->ۧ:Ljava/util/Map;

    .line 336
    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 341
    iget-object v0, p0, Ll/֫᩵ܺ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 342
    iget-object v2, p0, Ll/֫᩵ܺ;->ܿ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 343
    iget-object v1, p0, Ll/֫᩵ܺ;->ܽ:Ll/ۢ۬ܺ;

    invoke-virtual {v1}, Ll/ۢ۬ܺ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 344
    iget-object v0, p0, Ll/֫᩵ܺ;->֫:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 345
    iget-object v1, p0, Ll/֫᩵ܺ;->ۧ:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 313
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 314
    invoke-virtual {p0, v0}, Ll/֫᩵ܺ;->֫(Ljava/io/StringWriter;)V

    .line 315
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 317
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/io/StringWriter;)V
    .locals 5

    .line 285
    iget-object v0, p0, Ll/֫᩵ܺ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    const-string v0, " -> "

    .line 286
    invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 287
    iget-object v0, p0, Ll/֫᩵ܺ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    const-string v0, ":\n"

    .line 288
    invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 271
    iget-object v0, p0, Ll/֫᩵ܺ;->֫:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v2, 0xa

    const-string v3, "    "

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩵ܺ;

    .line 293
    invoke-virtual {v1}, Ll/ܳ᩵ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_0

    .line 294
    invoke-virtual {p1, v3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܳ᩵ܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    goto :goto_0

    .line 279
    :cond_1
    iget-object v0, p0, Ll/֫᩵ܺ;->ܽ:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩵ܺ;

    .line 293
    invoke-virtual {v1}, Ll/ܳ᩵ܺ;->֫()Z

    move-result v4

    if-nez v4, :cond_2

    .line 294
    invoke-virtual {p1, v3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v4

    invoke-virtual {v1}, Ll/ܳ᩵ܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    goto :goto_1

    .line 300
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 301
    iget-object v1, p0, Ll/֫᩵ܺ;->ۧ:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ᩴܺ;

    .line 302
    invoke-static {v4}, Ll/۟ᩴܺ;->֫(Ll/۟ᩴܺ;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 304
    :cond_4
    new-instance v1, Ll/ۨᩴܺ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 305
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰᩴܺ;

    .line 306
    invoke-virtual {p1, v3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v4

    invoke-virtual {v1}, Ll/ܰᩴܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    goto :goto_3

    :cond_5
    return-void
.end method
