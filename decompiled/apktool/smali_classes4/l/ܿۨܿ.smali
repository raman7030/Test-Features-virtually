.class public final Ll/ܿۨܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ll/ۨۛܿ;


# direct methods
.method public constructor <init>(Ll/ۨۛܿ;Ll/᩶۫᩷;)V
    .locals 0

    .line 307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 308
    iput-object p1, p0, Ll/ܿۨܿ;->᩸:Ll/ۨۛܿ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܿۨܿ;)V
    .locals 0

    .line 322
    iget-object p0, p0, Ll/ܿۨܿ;->᩸:Ll/ۨۛܿ;

    invoke-static {p0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 316
    :try_start_0
    invoke-static {}, Ll/ۢ֨ۢ;->ۘ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x1

    .line 322
    :goto_0
    new-instance v1, Ll/ᩳۨܿ;

    invoke-direct {v1, p0, v0}, Ll/ᩳۨܿ;-><init>(Ll/ܿۨܿ;Z)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
