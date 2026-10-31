.class public final Ll/ۨ᩹ۡ;
.super Ll/ۧ᩶ۡ;
.source "UBKE"


# instance fields
.field public final ۢ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Ll/ۧ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 45
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic ֫(Ljava/util/EnumMap;Ll/ܳ᩶ۡ;)Ll/ܿ᩶ۡ;
    .locals 3

    .line 139
    instance-of v0, p1, Ll/ܽ᩶ۡ;

    if-eqz v0, :cond_1

    .line 140
    move-object v0, p1

    check-cast v0, Ll/ܽ᩶ۡ;

    invoke-virtual {v0}, Ll/ܽ᩶ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 141
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 143
    iget-object p1, p1, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    const-string v1, "clip-rule"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "evenOdd"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    sget-object p1, Ll/ᩳ᩶ۡ;->᩹:Ll/ᩳ᩶ۡ;

    goto :goto_0

    .line 145
    :cond_0
    sget-object p1, Ll/ᩳ᩶ۡ;->᩶:Ll/ᩳ᩶ۡ;

    .line 146
    :goto_0
    new-instance v1, Ll/᩺ᩳ֨;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/᩺ᩳ֨;-><init>(I)V

    .line 147
    invoke-static {p0, p1, v1}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 148
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    :cond_1
    sget-object p0, Ll/ܿ᩶ۡ;->᩶:Ll/ܿ᩶ۡ;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic ֫()Ll/ۧ᩶ۡ;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ۨ᩹ۡ;->֫()Ll/ۨ᩹ۡ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۨ᩹ۡ;
    .locals 4

    .line 54
    new-instance v0, Ll/ۨ᩹ۡ;

    iget-object v1, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܽ:Ljava/lang/String;

    iget-object v3, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    invoke-direct {v0, v3, v1, v2}, Ll/ۨ᩹ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v0, p0}, Ll/ۧ᩶ۡ;->֫(Ll/ۧ᩶ۡ;)V

    .line 61
    iget-object v1, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩶ۡ;

    .line 62
    invoke-virtual {v0, v2}, Ll/ۨ᩹ۡ;->ܽ(Ll/ܳ᩶ۡ;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/ܳ᩶ۡ;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ۨ᩹ۡ;->֫()Ll/ۨ᩹ۡ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V
    .locals 9

    .line 132
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "<group>"

    .line 133
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "\n"

    .line 134
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 137
    new-instance v3, Ljava/util/EnumMap;

    const-class v4, Ll/ᩳ᩶ۡ;

    invoke-direct {v3, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 138
    new-instance v4, Ll/ۖ֡ᩳ;

    const/4 v5, 0x7

    invoke-direct {v4, v5, v3}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    .line 153
    iget-object v5, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳ᩶ۡ;

    .line 154
    invoke-virtual {v6, v4}, Ll/ܳ᩶ۡ;->֫(Ll/ۖ֡ᩳ;)Ll/ܿ᩶ۡ;

    goto :goto_0

    .line 157
    :cond_0
    invoke-virtual {v3}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 158
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳ᩶ۡ;

    .line 159
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 160
    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v6, 0x3c

    .line 161
    invoke-virtual {p1, v6}, Ljava/io/OutputStreamWriter;->write(I)V

    const-string v6, "clip-path"

    .line 162
    invoke-virtual {p1, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 163
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 164
    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v6, "android:pathData=\""

    .line 167
    invoke-virtual {p1, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 168
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_2

    .line 169
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-lez v6, :cond_1

    const-string v8, "M"

    .line 170
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "M 0,0"

    .line 172
    invoke-virtual {p1, v8}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 174
    :cond_1
    invoke-virtual {p1, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    const/16 v4, 0x22

    .line 176
    invoke-virtual {p1, v4}, Ljava/io/OutputStreamWriter;->write(I)V

    .line 177
    sget-object v4, Ll/ᩳ᩶ۡ;->᩹:Ll/ᩳ᩶ۡ;

    if-ne v5, v4, :cond_3

    .line 178
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 179
    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 180
    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 181
    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v4, "android:fillType=\"evenOdd\""

    .line 182
    invoke-virtual {p1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_3
    const-string v4, "/>"

    .line 184
    invoke-virtual {p1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 185
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 188
    :cond_4
    iget-object v2, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩶ۡ;

    .line 189
    invoke-virtual {v3, p1, v1}, Ll/ܳ᩶ۡ;->֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V

    goto :goto_3

    .line 191
    :cond_5
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string p2, "</group>"

    .line 192
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 193
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/֡᩶ۡ;)V
    .locals 4

    .line 82
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ܳ᩶ۡ;->ᩳ:Ll/֡᩶ۡ;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 83
    invoke-virtual {v2, p1}, Ll/֡᩶ۡ;->ܽ(Ll/֡᩶ۡ;)V

    .line 84
    iget-object v3, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v2, v3}, Ll/֡᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    .line 85
    invoke-virtual {v1, v2}, Ll/ܳ᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v2, p1}, Ll/֡᩶ۡ;->ܽ(Ll/֡᩶ۡ;)V

    .line 89
    iget-object p1, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۡ;

    .line 90
    invoke-virtual {v0, v2}, Ll/ܳ᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    goto :goto_1

    .line 92
    :cond_1
    iget-object p1, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v2, p1}, Ll/֡᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    .line 94
    iget-object p1, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    const-string v0, "stroke-width"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 95
    invoke-virtual {v2}, Ll/֡᩶ۡ;->ܽ()I

    move-result p1

    and-int/lit8 p1, p1, 0x6

    if-eqz p1, :cond_2

    const-string p1, "Scaling of the stroke width is ignored"

    .line 96
    invoke-virtual {p0, p1}, Ll/ܳ᩶ۡ;->ܽ(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ܳ᩶ۡ;)V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ll/ܳ᩶ۡ;->֫(Ljava/util/HashMap;)V

    return-void
.end method

.method public final ۧ(Ll/֡᩶ۡ;)V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 125
    invoke-virtual {v1, p1}, Ll/ܳ᩶ۡ;->ۧ(Ll/֡᩶ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 102
    invoke-super {p0}, Ll/ۧ᩶ۡ;->ܽ()V

    .line 103
    iget-object v0, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mask"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 111
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    const-string v1, "fill"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "#000"

    .line 115
    invoke-virtual {p0, v0, v1}, Ll/ܳ᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 119
    :cond_1
    invoke-static {v0}, Ll/ᩴ᩶ۡ;->֫(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const-string v0, "Semitransparent mask cannot be represented by a vector drawable"

    .line 106
    invoke-virtual {p0, v0}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ܽ(Ll/ܳ᩶ۡ;)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ll/ܳ᩶ۡ;->֫(Ljava/util/HashMap;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 201
    iget-object v0, p0, Ll/ۨ᩹ۡ;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 202
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    iget-object v1, v1, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v2, v1}, Ll/֡᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method
