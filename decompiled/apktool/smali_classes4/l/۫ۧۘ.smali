.class public final Ll/۫ۧۘ;
.super Ll/᩺ۧۘ;
.source "X9HO"


# static fields
.field public static final ܽ:Ll/֫᩻֨;


# instance fields
.field public ۧ:Ll/ۢۧۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 39
    const-class v0, Ll/۫ۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۫ۧۘ;->ܽ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۢۧۘ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/۫ۧۘ;->ۧ:Ll/ۢۧۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۨۖ;)V
    .locals 5

    .line 48
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۧۘ;->ۧ:Ll/ۢۧۘ;

    invoke-virtual {v1, v0}, Ll/ۢۧۘ;->֫(Ljava/lang/Long;)Ll/ᩴۧۘ;

    move-result-object v0

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/ᩴۧۘ;->ܳ()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Ll/۫ۧۘ;->ܽ:Ll/֫᩻֨;

    const-string v3, "Send/Recv of packet {} took << {} ms >>"

    invoke-interface {v2, v3, p1, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    invoke-virtual {p1}, Ll/ᩳۨۖ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 53
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ܽ()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v3, "Received ASYNC packet {} with AsyncId << {} >>"

    invoke-interface {v2, v3, p1, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1}, Ll/᩻ۨۖ;->ܽ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ᩴۧۘ;->֫(J)V

    return-void

    .line 59
    :cond_0
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    invoke-virtual {v0, p1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void
.end method
