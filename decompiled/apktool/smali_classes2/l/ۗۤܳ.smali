.class public final Ll/ۗۤܳ;
.super Ljava/lang/Object;
.source "T7U3"


# static fields
.field public static final ֫:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/ۗۤܳ;->֫:Ll/ۧۤᩴ;

    return-void
.end method

.method public static ֫(Ll/۬ᩴܺ;)Ljava/lang/String;
    .locals 6

    .line 17
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 18
    sget-object v1, Ll/ۗۤܳ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0, p0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p0

    new-instance v1, Ll/ۗ᩸ۢ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/ۗ᩸ۢ;-><init>(ILjava/lang/Object;)V

    const/16 v2, 0xa

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object v0
.end method

.method public static synthetic ֫(Ljava/lang/String;)V
    .locals 1

    .line 19
    sget-object v0, Ll/ۗۤܳ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 31
    sget-object v0, Ll/ۗۤܳ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 33
    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method
