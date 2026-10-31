.class public final synthetic Ll/ܺۨۜ;
.super Ljava/lang/Object;
.source "46LQ"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/᩺ۨۜ;

.field public final synthetic ۧ:Ll/ۨۨۜ;

.field public final synthetic ܳ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final synthetic ܽ:Ll/᩶ۛۜ;

.field public final synthetic ܿ:Ll/ۡ᩺ۜ;

.field public final synthetic ᩳ:J


# direct methods
.method public synthetic constructor <init>(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۨۜ;->֫:Ll/᩺ۨۜ;

    iput-object p2, p0, Ll/ܺۨۜ;->ۧ:Ll/ۨۨۜ;

    iput-object p3, p0, Ll/ܺۨۜ;->ܽ:Ll/᩶ۛۜ;

    iput-wide p4, p0, Ll/ܺۨۜ;->ᩳ:J

    iput-object p6, p0, Ll/ܺۨۜ;->ܿ:Ll/ۡ᩺ۜ;

    iput-object p7, p0, Ll/ܺۨۜ;->ܳ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v5, p0, Ll/ܺۨۜ;->ܿ:Ll/ۡ᩺ۜ;

    iget-object v6, p0, Ll/ܺۨۜ;->ܳ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v0, p0, Ll/ܺۨۜ;->֫:Ll/᩺ۨۜ;

    iget-object v1, p0, Ll/ܺۨۜ;->ۧ:Ll/ۨۨۜ;

    iget-object v2, p0, Ll/ܺۨۜ;->ܽ:Ll/᩶ۛۜ;

    iget-wide v3, p0, Ll/ܺۨۜ;->ᩳ:J

    invoke-static/range {v0 .. v6}, Ll/ۚۨۜ;->֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Ll/ۚۨۜ;

    move-result-object v0

    return-object v0
.end method
