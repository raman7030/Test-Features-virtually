.class public final Ll/ۨۧۘ;
.super Ll/᩺ۧۘ;
.source "A9E0"


# static fields
.field public static final ܽ:Ll/֫᩻֨;


# instance fields
.field public ۧ:Ll/ۢۧۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    const-class v0, Ll/ۨۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۨۧۘ;->ܽ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۢۧۘ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۨۧۘ;->ۧ:Ll/ۢۧۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۨۖ;)V
    .locals 4

    .line 43
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v0

    .line 51
    iget-object v2, p0, Ll/ۨۧۘ;->ۧ:Ll/ۢۧۘ;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۢۧۘ;->֫(Ljava/lang/Long;)Ll/ᩴۧۘ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 53
    invoke-virtual {p1}, Ll/ᩳۨۖ;->ᩳ()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "Received response with unknown sequence number << {} >>"

    .line 54
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ll/ۨۧۘ;->ܽ:Ll/֫᩻֨;

    invoke-interface {v1, v0, v2}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    new-instance v1, Ll/֡ۛۖ;

    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/֡ۛۖ;-><init>(Ll/ۚ֫ۘ;)V

    invoke-virtual {v0, v1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void

    .line 61
    :cond_0
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    invoke-virtual {v0, p1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void
.end method
