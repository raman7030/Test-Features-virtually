.class public final synthetic Ll/ܳ۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤۜ;

.field public final synthetic ᩹:Ll/ۘۤۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤۜ;Ll/ۘۤۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ۫ۜ;->᩸:Ll/ۤۤۜ;

    iput-object p2, p0, Ll/ܳ۫ۜ;->᩹:Ll/ۘۤۜ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 2
    iget-object v0, p0, Ll/ܳ۫ۜ;->᩹:Ll/ۘۤۜ;

    .line 4
    sget v1, Ll/ۤۤۜ;->᩻ܿ:I

    .line 1608
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۘۤۜ;->֫(Ll/ۘۤۜ;Ljava/lang/Thread;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1609
    invoke-static {v0}, Ll/ۘۤۜ;->ܽ(Ll/ۘۤۜ;)Ll/ۖۤۜ;

    move-result-object v1

    .line 1611
    invoke-virtual {v1}, Ll/ۖۤۜ;->֫()Ll/ۖ֨ۜ;

    move-result-object v2

    .line 1612
    invoke-virtual {v1}, Ll/ۖۤۜ;->ᩴ()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    .line 1613
    invoke-virtual {v1}, Ll/ۖۤۜ;->ᩳ()Ll/ܶ۠֫;

    move-result-object v5

    .line 1614
    invoke-virtual {v1}, Ll/ۖۤۜ;->ۖ()Ll/ܶ۠֫;

    move-result-object v6

    .line 1615
    invoke-virtual {v1}, Ll/ۖۤۜ;->ܽ()Ll/᩻۬ۜ;

    move-result-object v7

    .line 1616
    invoke-virtual {v1}, Ll/ۖۤۜ;->᩵()Ll/֨۠ۜ;

    move-result-object v8

    .line 1617
    invoke-virtual {v1}, Ll/ۖۤۜ;->ܳ()Ll/ܽۚۜ;

    move-result-object v9

    .line 1610
    invoke-static/range {v2 .. v9}, Ll/ܺ֨ۜ;->֫(Ll/ۖ֨ۜ;JLl/ܶ۠֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;Ll/֨۠ۜ;Ll/ܽۚۜ;)Ll/ܺ֨ۜ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1620
    :goto_0
    invoke-static {v0}, Ll/ۘۤۜ;->ۧ(Ll/ۘۤۜ;)V

    .line 1623
    new-instance v2, Ll/ܺ۫ۜ;

    iget-object v3, p0, Ll/ܳ۫ۜ;->᩸:Ll/ۤۤۜ;

    invoke-direct {v2, v3, v0, v1}, Ll/ܺ۫ۜ;-><init>(Ll/ۤۤۜ;Ll/ۘۤۜ;Ll/ܺ֨ۜ;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v1

    .line 1620
    invoke-static {v0}, Ll/ۘۤۜ;->ۧ(Ll/ۘۤۜ;)V

    .line 1621
    throw v1
.end method
