.class public final Ll/ܿۘܿ;
.super Ljava/lang/Object;
.source "470W"


# instance fields
.field public final ֫:Ll/ۨۖܿ;

.field public final ۖ:Ljava/lang/Object;

.field public final ۘ:J

.field public final ۜ:Ll/ᩳۘܿ;

.field public final ۡ:I

.field public final ۢ:Ll/ܶۘܿ;

.field public final ۧ:Ll/ۤ᩷ܿ;

.field public final ܳ:J

.field public final ܺ:I

.field public final ܽ:Ll/ܽۘܿ;

.field public final ܿ:I

.field public ᩳ:Z

.field public final ᩷:Ll/᩺ܺܿ;

.field public final ᩻:Ll/᩷ۘܿ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܿ;JLl/᩺ܺܿ;Ljava/lang/Object;JIIILl/ܽۘܿ;Ll/ۨۖܿ;Ll/ۤ᩷ܿ;Ll/ܶۘܿ;Ll/ᩳۘܿ;)V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    iput-object p1, p0, Ll/ܿۘܿ;->᩻:Ll/᩷ۘܿ;

    .line 211
    iput-wide p2, p0, Ll/ܿۘܿ;->ܳ:J

    .line 212
    iput-object p4, p0, Ll/ܿۘܿ;->᩷:Ll/᩺ܺܿ;

    .line 213
    iput-object p5, p0, Ll/ܿۘܿ;->ۖ:Ljava/lang/Object;

    .line 214
    iput-wide p6, p0, Ll/ܿۘܿ;->ۘ:J

    .line 215
    iput p8, p0, Ll/ܿۘܿ;->ܺ:I

    .line 216
    iput p9, p0, Ll/ܿۘܿ;->ۡ:I

    .line 217
    iput p10, p0, Ll/ܿۘܿ;->ܿ:I

    .line 218
    iput-object p11, p0, Ll/ܿۘܿ;->ܽ:Ll/ܽۘܿ;

    .line 219
    iput-object p12, p0, Ll/ܿۘܿ;->֫:Ll/ۨۖܿ;

    .line 220
    iput-object p13, p0, Ll/ܿۘܿ;->ۧ:Ll/ۤ᩷ܿ;

    .line 221
    iput-object p14, p0, Ll/ܿۘܿ;->ۢ:Ll/ܶۘܿ;

    .line 222
    iput-object p15, p0, Ll/ܿۘܿ;->ۜ:Ll/ᩳۘܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۘܿ;)Ll/ۨۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->֫:Ll/ۨۖܿ;

    return-object p0
.end method

.method public static ֫(Ll/ܿۘܿ;Ll/᩷ۘܿ;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 227
    :try_start_0
    iget-object v1, p0, Ll/ܿۘܿ;->᩻:Ll/᩷ۘܿ;

    if-ne v1, p1, :cond_1

    .line 230
    iget-boolean p1, p0, Ll/ܿۘܿ;->ᩳ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 233
    iput-boolean p1, p0, Ll/ܿۘܿ;->ᩳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    monitor-exit v0

    return-void

    .line 231
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Syntax window request was already constructed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 228
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax window request belongs to another session"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 234
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ۜ(Ll/ܿۘܿ;)Ll/ܶۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->ۢ:Ll/ܶۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ܿۘܿ;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->ۖ:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ܿۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۘܿ;->ܺ:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿۘܿ;)Ll/ۤ᩷ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->ۧ:Ll/ۤ᩷ܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܿۘܿ;)Ll/ᩳۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->ۜ:Ll/ᩳۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ܿۘܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ܿۘܿ;->ۘ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ܿۘܿ;)Ll/ܽۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->ܽ:Ll/ܽۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܿۘܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ܿۘܿ;->ܳ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ܿۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۘܿ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ܿۘܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۘܿ;->ۡ:I

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ܿۘܿ;)Ll/᩺ܺܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۘܿ;->᩷:Ll/᩺ܺܿ;

    return-object p0
.end method
