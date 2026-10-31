.class public final Ll/ۗۜ᩻;
.super Ljava/lang/Object;
.source "B7T7"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۛۜ᩻;

.field public ܽ:Ljava/util/List;

.field public ᩳ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/ۗۜ᩻;->ᩳ:Ll/ܽۢܳ;

    .line 21
    iput-object p2, p0, Ll/ۗۜ᩻;->ܽ:Ljava/util/List;

    .line 23
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۜܳ;

    .line 24
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ll/ᩳۜܳ;->۬()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-boolean p1, p0, Ll/ۗۜ᩻;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۜ᩻;)Ll/ۛۜ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    return-object p0
.end method

.method public static ֫(Ll/ۗۜ᩻;Ll/ۗۢ᩻;Ll/᩷᩷᩻;)V
    .locals 7

    .line 39
    iget-object v0, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ۛۜ᩻;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ۛۜ᩻;->ܳ()Z

    move-result v5

    .line 54
    iget-object v0, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ۛۜ᩻;->ܿ()Z

    move-result v4

    .line 55
    new-instance v0, Ll/ۙۜ᩻;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ll/ۙۜ᩻;-><init>(Ll/ۗۜ᩻;Ll/ۗۢ᩻;ZZLl/᩷᩷᩻;)V

    .line 124
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗۜ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۜ᩻;->ܽ:Ljava/util/List;

    return-object p0
.end method

.method public static ۧ(Ll/ۗۜ᩻;Ll/ۗۢ᩻;Ll/᩷᩷᩻;)V
    .locals 7

    .line 53
    iget-object v0, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ۛۜ᩻;->ܳ()Z

    move-result v5

    .line 54
    iget-object v0, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ۛۜ᩻;->ܿ()Z

    move-result v4

    .line 55
    new-instance v0, Ll/ۙۜ᩻;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ll/ۙۜ᩻;-><init>(Ll/ۗۜ᩻;Ll/ۗۢ᩻;ZZLl/᩷᩷᩻;)V

    .line 124
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۗۜ᩻;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۜ᩻;->ᩳ:Ll/ܽۢܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/᩷᩷᩻;)V
    .locals 12

    .line 33
    iget-object v0, p0, Ll/ۗۜ᩻;->ᩳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/ۗۢ᩻;

    .line 34
    iget-object v1, p0, Ll/ۗۜ᩻;->ܽ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v2, v10, :cond_0

    .line 36
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۜ᩻;

    .line 37
    invoke-virtual {v1}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v2

    .line 38
    new-instance v9, Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v3

    invoke-virtual {v2}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ll/ܶۜ᩻;

    invoke-direct {v8, p0, v4, p1}, Ll/ܶۜ᩻;-><init>(Ll/ۗۜ᩻;Ll/ۗۢ᩻;Ll/᩷᩷᩻;)V

    iget-boolean v7, p0, Ll/ۗۜ᩻;->֫:Z

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ll/ۛۜ᩻;-><init>(Lbin/mt/plus/Main;Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 42
    invoke-virtual {v1}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v9, p1}, Ll/ۛۜ᩻;->֫(Ljava/lang/String;)V

    iput-object v9, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    return-void

    .line 46
    :cond_0
    new-instance v11, Ll/ۛۜ᩻;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v3

    new-instance v8, Ll/᩸ۜ᩻;

    invoke-direct {v8, p0, v4, p1}, Ll/᩸ۜ᩻;-><init>(Ll/ۗۜ᩻;Ll/ۗۢ᩻;Ll/᩷᩷᩻;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 30
    iget-boolean v7, p0, Ll/ۗۜ᩻;->֫:Z

    move-object v2, v11

    invoke-direct/range {v2 .. v8}, Ll/ۛۜ᩻;-><init>(Lbin/mt/plus/Main;Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 48
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v10, [Ljava/lang/Object;

    aput-object p1, v0, v9

    const p1, 0x7f120b86

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v11, p1}, Ll/ۛۜ᩻;->֫(Ljava/lang/String;)V

    iput-object v11, p0, Ll/ۗۜ᩻;->ۧ:Ll/ۛۜ᩻;

    return-void
.end method
