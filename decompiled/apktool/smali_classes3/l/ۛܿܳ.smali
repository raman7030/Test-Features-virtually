.class public final synthetic Ll/ۛܿܳ;
.super Ljava/lang/Object;
.source "A6LD"

# interfaces
.implements Ll/֨֨֡;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛܿܳ;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/ۛܿܳ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۛܿܳ;->ܽ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 6

    .line 154
    instance-of v0, p1, Ll/ܳۚ֡;

    const/4 v1, 0x0

    const-string v2, "pre"

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll/ܳۚ֡;

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 155
    invoke-virtual {v0}, Ll/ܳۚ֡;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v3, "\\s+"

    const/4 v4, 0x2

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v1

    const-string v3, "math"

    .line 156
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "mermaid"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Ll/ۛܿܳ;->֫:Ljava/lang/String;

    invoke-interface {p3, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_1
    instance-of v0, p1, Ll/ۨ֡֡;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/ۧۚ֡;

    if-eqz v0, :cond_6

    :cond_2
    instance-of v0, p1, Ll/᩶ܿܳ;

    if-eqz v0, :cond_3

    return-void

    .line 161
    :cond_3
    invoke-virtual {p1}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 162
    :cond_4
    invoke-virtual {p1}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v0

    .line 163
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۚ֡;

    invoke-virtual {v1}, Ll/᩶ۚ֡;->ᩳ()I

    move-result v1

    const/4 v3, 0x1

    .line 0
    invoke-static {v3, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 164
    check-cast v0, Ll/᩶ۚ֡;

    invoke-virtual {v0}, Ll/᩶ۚ֡;->ᩳ()I

    move-result v0

    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Ll/ۛܿܳ;->ۧ:Ljava/lang/String;

    invoke-interface {p3, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    instance-of p2, p1, Ll/ܳۚ֡;

    if-nez p2, :cond_5

    instance-of p1, p1, Ll/ܺۚ֡;

    if-eqz p1, :cond_6

    .line 168
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/2addr v1, p2

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Ll/ۛܿܳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_0
    return-void
.end method
