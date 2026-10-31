.class public final synthetic Ll/᩸᩺ܳ;
.super Ljava/lang/Object;
.source "Q28R"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ܽۧ᩻;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۖۢܳ;

.field public final synthetic ᩹:Ljava/util/LinkedList;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۢܳ;Ljava/util/LinkedList;Ll/֡ۚۢ;Ll/ܽۧ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩺ܳ;->᩸:Ll/ۖۢܳ;

    iput-object p2, p0, Ll/᩸᩺ܳ;->᩹:Ljava/util/LinkedList;

    iput-object p3, p0, Ll/᩸᩺ܳ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/᩸᩺ܳ;->ۙ:Ll/ܽۧ᩻;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 134
    iget-object v0, p0, Ll/᩸᩺ܳ;->᩸:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 135
    invoke-virtual {v0}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v0

    .line 201
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "Android/data"

    .line 202
    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x0

    .line 138
    :goto_2
    iget-object v3, p0, Ll/᩸᩺ܳ;->᩹:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    .line 139
    iget-object v4, p0, Ll/᩸᩺ܳ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v4}, Ll/֡ۚۢ;->ۜ()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_5

    .line 142
    :cond_2
    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵ܿ;

    .line 413
    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v4

    .line 143
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    iget-object v6, p0, Ll/᩸᩺ܳ;->ۙ:Ll/ܽۧ᩻;

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 144
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 145
    iget v7, v6, Ll/ܽۧ᩻;->ܿ:I

    add-int/2addr v7, v2

    iput v7, v6, Ll/ܽۧ᩻;->ܿ:I

    .line 146
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v7

    if-nez v7, :cond_5

    .line 147
    invoke-virtual {v3, v5}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_4

    .line 150
    :cond_4
    iget v7, v6, Ll/ܽۧ᩻;->ᩳ:I

    add-int/2addr v7, v2

    iput v7, v6, Ll/ܽۧ᩻;->ᩳ:I

    .line 151
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v7

    if-nez v7, :cond_5

    .line 152
    iget-wide v7, v6, Ll/ܽۧ᩻;->ܳ:J

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v9

    add-long/2addr v9, v7

    iput-wide v9, v6, Ll/ܽۧ᩻;->ܳ:J

    :cond_5
    :goto_4
    if-eqz v0, :cond_3

    add-int/lit8 v1, v1, 0x1

    const/16 v5, 0x3e8

    if-le v1, v5, :cond_3

    .line 156
    invoke-virtual {v6}, Ll/ܽۧ᩻;->֫()V

    const/4 v0, 0x0

    goto :goto_3

    .line 103
    :cond_6
    new-instance v3, Ll/ۘۢܳ;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v6}, Ll/ۘۢܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_7
    :goto_5
    return-void
.end method
