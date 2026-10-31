.class public final synthetic Ll/ܶܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Z

.field public final synthetic ۬:Z

.field public final synthetic ᩶:Ll/ܶۛ᩷;

.field public final synthetic ᩸:Ll/ۙܽۢ;

.field public final synthetic ᩹:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ll/ۙܽۢ;Ljava/util/Map;Ll/ܶۛ᩷;ZZZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܽۢ;->᩸:Ll/ۙܽۢ;

    iput-object p2, p0, Ll/ܶܽۢ;->᩹:Ljava/util/Map;

    iput-object p3, p0, Ll/ܶܽۢ;->᩶:Ll/ܶۛ᩷;

    iput-boolean p4, p0, Ll/ܶܽۢ;->ۙ:Z

    iput-boolean p5, p0, Ll/ܶܽۢ;->ۗ:Z

    iput-boolean p6, p0, Ll/ܶܽۢ;->۬:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 7

    .line 2
    iget-object v0, p0, Ll/ܶܽۢ;->᩸:Ll/ۙܽۢ;

    .line 4
    iget-object v1, p0, Ll/ܶܽۢ;->᩹:Ljava/util/Map;

    .line 6
    iget-object v2, p0, Ll/ܶܽۢ;->᩶:Ll/ܶۛ᩷;

    .line 8
    iget-boolean v3, p0, Ll/ܶܽۢ;->ۙ:Z

    .line 10
    iget-boolean v4, p0, Ll/ܶܽۢ;->ۗ:Z

    .line 12
    iget-boolean v5, p0, Ll/ܶܽۢ;->۬:Z

    .line 14
    check-cast p1, Ll/ܰ֫ۢ;

    .line 683
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘܺܽ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1303
    invoke-interface {p1}, Ll/ܰ֫ۢ;->ۧ()Ljava/lang/String;

    move-result-object v6

    .line 1304
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_0

    .line 1306
    invoke-virtual {v0, v6}, Ll/ۘܺܽ;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v6, ""

    .line 1309
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 1310
    invoke-virtual {v0, v1}, Ll/ۘܺܽ;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 1313
    :cond_1
    invoke-interface {p1}, Ll/ܰ֫ۢ;->ܿ()Ll/۠ۛ֡;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1314
    invoke-virtual {p1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘܺܽ;->ܿ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 687
    :goto_0
    invoke-virtual {v2}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object p1

    invoke-static {v0, p1, v3, v4, v5}, Ll/ۛܽۢ;->֫(Ll/ۘܺܽ;Ll/۫ۘܽ;ZZZ)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 689
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
