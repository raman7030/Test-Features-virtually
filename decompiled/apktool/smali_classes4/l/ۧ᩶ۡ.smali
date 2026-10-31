.class public Ll/ۧ᩶ۡ;
.super Ll/ܳ᩶ۡ;
.source "0BJC"


# static fields
.field public static final ᩷:Ljava/util/logging/Logger;


# instance fields
.field public final ۜ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SvgGroupNode"

    .line 35
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۧ᩶ۡ;->᩷:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Ll/ܳ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 37
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public ֫()Ll/ۧ᩶ۡ;
    .locals 4

    .line 46
    new-instance v0, Ll/ۧ᩶ۡ;

    iget-object v1, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    .line 186
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܽ:Ljava/lang/String;

    .line 46
    iget-object v3, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    invoke-direct {v0, v3, v1, v2}, Ll/ۧ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v0, p0}, Ll/ۧ᩶ۡ;->֫(Ll/ۧ᩶ۡ;)V

    return-object v0
.end method

.method public bridge synthetic ֫()Ll/ܳ᩶ۡ;
    .locals 1

    .line 34
    invoke-virtual {p0}, Ll/ۧ᩶ۡ;->֫()Ll/ۧ᩶ۡ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۖ֡ᩳ;)Ll/ܿ᩶ۡ;
    .locals 4

    .line 152
    iget-object v0, p1, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/util/EnumMap;

    invoke-static {v0, p0}, Ll/ۨ᩹ۡ;->֫(Ljava/util/EnumMap;Ll/ܳ᩶ۡ;)Ll/ܿ᩶ۡ;

    move-result-object v0

    .line 153
    sget-object v1, Ll/ܿ᩶ۡ;->᩶:Ll/ܿ᩶ۡ;

    if-ne v0, v1, :cond_1

    .line 154
    iget-object v1, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩶ۡ;

    .line 155
    invoke-virtual {v2, p1}, Ll/ܳ᩶ۡ;->֫(Ll/ۖ֡ᩳ;)Ll/ܿ᩶ۡ;

    move-result-object v2

    sget-object v3, Ll/ܿ᩶ۡ;->᩹:Ll/ܿ᩶ۡ;

    if-ne v2, v3, :cond_0

    return-object v3

    .line 160
    :cond_1
    sget-object p1, Ll/ܿ᩶ۡ;->ۙ:Ll/ܿ᩶ۡ;

    if-ne v0, p1, :cond_2

    sget-object p1, Ll/ܿ᩶ۡ;->᩶:Ll/ܿ᩶ۡ;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public ֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V
    .locals 2

    .line 145
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 146
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩶ۡ;->֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 85
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v1, "group: "

    .line 0
    invoke-static {p1, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 186
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܽ:Ljava/lang/String;

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۧ᩶ۡ;->᩷:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    const-string v2, "  "

    .line 0
    invoke-static {p1, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, Ll/ܳ᩶ۡ;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ֫(Ll/֡᩶ۡ;)V
    .locals 4

    .line 128
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 129
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ᩳ:Ll/֡᩶ۡ;

    invoke-virtual {v2, p1}, Ll/֡᩶ۡ;->ܽ(Ll/֡᩶ۡ;)V

    .line 130
    iget-object v3, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v2, v3}, Ll/֡᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    .line 131
    invoke-virtual {v1, v2}, Ll/ܳ᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧ᩶ۡ;)V
    .locals 1

    .line 282
    iget-object v0, p1, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Ll/ܳ᩶ۡ;->֫(Ljava/util/HashMap;)V

    .line 283
    iget-object v0, p1, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v0}, Ll/֡᩶ۡ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩶ۡ;

    iput-object v0, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    .line 53
    iget-object p1, p1, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۡ;

    .line 54
    invoke-virtual {v0}, Ll/ܳ᩶ۡ;->֫()Ll/ܳ᩶ۡ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۧ᩶ۡ;->֫(Ll/ܳ᩶ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ֫(Ll/ܳ᩶ۡ;)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ll/ܳ᩶ۡ;->֫(Ljava/util/HashMap;)V

    return-void
.end method

.method public final ۧ(Ll/ܳ᩶ۡ;)Ll/ۧ᩶ۡ;
    .locals 3

    .line 100
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    if-ne v1, p1, :cond_1

    return-object p0

    .line 104
    :cond_1
    invoke-virtual {v1}, Ll/ܳ᩶ۡ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 105
    check-cast v1, Ll/ۧ᩶ۡ;

    invoke-virtual {v1, p1}, Ll/ۧ᩶ۡ;->ۧ(Ll/ܳ᩶ۡ;)Ll/ۧ᩶ۡ;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 166
    invoke-super {p0, p1, p2}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 169
    iget-object v2, v1, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 170
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۧ(Ll/֡᩶ۡ;)V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 122
    invoke-virtual {v1, p1}, Ll/ܳ᩶ۡ;->ۧ(Ll/֡᩶ۡ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ܽ()V
    .locals 2

    .line 137
    iget-object v0, p0, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۡ;

    .line 138
    invoke-virtual {v1}, Ll/ܳ᩶ۡ;->ܽ()V

    goto :goto_0

    :cond_0
    return-void
.end method
