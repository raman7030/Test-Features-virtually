.class public final Ll/᩶ۢۜ;
.super Ljava/lang/Object;
.source "K6XC"

# interfaces
.implements Ll/ᩴ᩻ۜ;


# instance fields
.field public final synthetic ֫:Ll/ۙۢۜ;

.field public final synthetic ۧ:Ll/᩸ۖۜ;


# direct methods
.method public constructor <init>(Ll/᩸ۖۜ;Ll/ۙۢۜ;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۢۜ;->ۧ:Ll/᩸ۖۜ;

    iput-object p2, p0, Ll/᩶ۢۜ;->֫:Ll/ۙۢۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)J
    .locals 6

    .line 143
    iget-object v0, p0, Ll/᩶ۢۜ;->֫:Ll/ۙۢۜ;

    new-instance v1, Ll/ۗۢۜ;

    check-cast p1, Ljava/io/FilterOutputStream;

    invoke-direct {v1, p1}, Ll/ۗۢۜ;-><init>(Ljava/io/FilterOutputStream;)V

    .line 146
    :try_start_0
    iget-object p1, p0, Ll/᩶ۢۜ;->ۧ:Ll/᩸ۖۜ;

    invoke-virtual {p1, v1}, Ll/᩸ۖۜ;->֫(Ljava/io/OutputStream;)J

    move-result-wide v2

    .line 147
    invoke-static {v1}, Ll/ۗۢۜ;->֫(Ll/ۗۢۜ;)J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    .line 153
    invoke-static {v0, v1}, Ll/ۙۢۜ;->֫(Ll/ۙۢۜ;Ll/ۗۢۜ;)V

    return-wide v2

    .line 148
    :cond_0
    :try_start_1
    invoke-static {}, Ll/۫ۢۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 153
    invoke-static {v0, v1}, Ll/ۙۢۜ;->֫(Ll/ۙۢۜ;Ll/ۗۢۜ;)V

    .line 154
    throw p1
.end method

.method public final ֫(J)V
    .locals 1

    .line 160
    iget-object v0, p0, Ll/᩶ۢۜ;->ۧ:Ll/᩸ۖۜ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۖۜ;->֫(J)V

    return-void
.end method
