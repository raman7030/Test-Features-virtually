.class public final Ll/ۢۜܿ;
.super Ljava/lang/Error;
.source "096Y"


# instance fields
.field public final ᩸:Ljava/lang/RuntimeException;


# direct methods
.method public constructor <init>(Ljava/lang/RuntimeException;)V
    .locals 1

    const/4 v0, 0x0

    .line 180
    invoke-direct {p0, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    iput-object p1, p0, Ll/ۢۜܿ;->᩸:Ljava/lang/RuntimeException;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۜܿ;)Ljava/lang/RuntimeException;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۜܿ;->᩸:Ljava/lang/RuntimeException;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 187
    monitor-exit v0

    return-object p0
.end method
