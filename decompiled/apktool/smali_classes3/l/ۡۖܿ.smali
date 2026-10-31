.class public final Ll/ۡۖܿ;
.super Ljava/lang/Object;
.source "N70B"


# instance fields
.field public final ֫:Ll/ܺۖܿ;

.field public final ۧ:Ll/ܶۘܿ;

.field public final ܳ:Ll/᩺ܺܿ;

.field public ܽ:Z

.field public final ܿ:Ll/ᩴۖܿ;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ᩴۖܿ;JLl/᩺ܺܿ;Ll/ܺۖܿ;Ll/ܶۘܿ;)V
    .locals 0

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Ll/ۡۖܿ;->ܿ:Ll/ᩴۖܿ;

    .line 185
    iput-wide p2, p0, Ll/ۡۖܿ;->ᩳ:J

    .line 186
    iput-object p4, p0, Ll/ۡۖܿ;->ܳ:Ll/᩺ܺܿ;

    .line 187
    iput-object p5, p0, Ll/ۡۖܿ;->֫:Ll/ܺۖܿ;

    .line 188
    iput-object p6, p0, Ll/ۡۖܿ;->ۧ:Ll/ܶۘܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡۖܿ;)Ll/ܺۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۖܿ;->֫:Ll/ܺۖܿ;

    return-object p0
.end method

.method public static ֫(Ll/ۡۖܿ;Ll/ᩴۖܿ;Z)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 193
    :try_start_0
    iget-object v1, p0, Ll/ۡۖܿ;->ܿ:Ll/ᩴۖܿ;

    if-ne v1, p1, :cond_3

    .line 196
    iget-object p1, p0, Ll/ۡۖܿ;->֫:Ll/ܺۖܿ;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p2, p1, :cond_2

    .line 199
    iget-boolean p1, p0, Ll/ۡۖܿ;->ܽ:Z

    if-nez p1, :cond_1

    .line 202
    iput-boolean v1, p0, Ll/ۡۖܿ;->ܽ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit v0

    return-void

    .line 200
    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Syntax request was already constructed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 197
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax request type does not match construction"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 194
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax request belongs to another session"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 203
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡۖܿ;)Ll/ܶۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۖܿ;->ۧ:Ll/ܶۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۡۖܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡۖܿ;->ᩳ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ۡۖܿ;)Ll/᩺ܺܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۖܿ;->ܳ:Ll/᩺ܺܿ;

    return-object p0
.end method
