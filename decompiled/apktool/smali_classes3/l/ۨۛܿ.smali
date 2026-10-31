.class public final Ll/ۨۛܿ;
.super Ljava/lang/Object;
.source "C4QU"


# instance fields
.field public final ֫:J

.field public ۧ:J

.field public final ܳ:Ljava/lang/ref/WeakReference;

.field public final ܽ:Ljava/lang/ref/WeakReference;

.field public ܿ:Z

.field public ᩳ:Ll/ۤۛܿ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܳۨܿ;)V
    .locals 2

    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 278
    sget-object v0, Ll/ۤۛܿ;->᩶:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 284
    invoke-static {}, Ll/ܳۨܿ;->ܽ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨۛܿ;->֫:J

    .line 285
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    .line 286
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Ll/ܳۨܿ;->ܿ(Ll/ܳۨܿ;)Ll/֡ۚۢ;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۨۛܿ;->ܽ:Ljava/lang/ref/WeakReference;

    return-void
.end method
