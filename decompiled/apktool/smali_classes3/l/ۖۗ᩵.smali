.class public final Ll/ۖۗ᩵;
.super Ll/ۨ۬᩵;
.source "HAYQ"

# interfaces
.implements Ll/ܺۗ᩵;


# instance fields
.field public final ۗ:Ll/ᩳ۫᩵;


# direct methods
.method public constructor <init>(Ll/ᩳ۫᩵;)V
    .locals 0

    .line 1464
    invoke-direct {p0}, Ll/ۨ۬᩵;-><init>()V

    .line 1463
    iput-object p1, p0, Ll/ۖۗ᩵;->ۗ:Ll/ᩳ۫᩵;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1462
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ll/ۖۗ᩵;->ۧ(Ljava/lang/Throwable;)V

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method

.method public final ֫(Ljava/lang/Throwable;)Z
    .locals 3

    .line 1467
    invoke-virtual {p0}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v0

    .line 650
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 651
    :cond_0
    invoke-virtual {v0, p1}, Ll/ᩳ۫᩵;->ܿ(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ll/ᩳ۫᩵;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/Throwable;)V
    .locals 1

    .line 1466
    iget-object p1, p0, Ll/ۖۗ᩵;->ۗ:Ll/ᩳ۫᩵;

    invoke-virtual {p0}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v0

    .line 637
    invoke-virtual {p1, v0}, Ll/ᩳ۫᩵;->ܿ(Ljava/lang/Object;)Z

    return-void
.end method
