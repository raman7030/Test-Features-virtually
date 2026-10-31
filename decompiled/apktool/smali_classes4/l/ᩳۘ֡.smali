.class public final Ll/ᩳۘ֡;
.super Ljava/lang/Object;
.source "3AID"


# static fields
.field public static final ᩳ:Ll/ۖ᩹ᩴ;


# instance fields
.field public final ֫:Ll/ۖ᩹ᩴ;

.field public final ۧ:Ll/ۖ᩹ᩴ;

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 33
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofMillis(J)Ll/ۖ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/ᩳۘ֡;->ᩳ:Ll/ۖ᩹ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۖ᩹ᩴ;Ll/ۖ᩹ᩴ;I)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-static {p1}, Ll/۬ۘ֡;->֫(Ll/ۖ᩹ᩴ;)Z

    move-result v0

    sget-object v1, Ll/ᩳۘ֡;->ᩳ:Ll/ۖ᩹ᩴ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iput-object p1, p0, Ll/ᩳۘ֡;->֫:Ll/ۖ᩹ᩴ;

    .line 53
    invoke-static {p2}, Ll/۬ۘ֡;->֫(Ll/ۖ᩹ᩴ;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    iput-object p2, p0, Ll/ᩳۘ֡;->ۧ:Ll/ۖ᩹ᩴ;

    .line 54
    iput p3, p0, Ll/ᩳۘ֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EvictionConfig [idleEvictDuration="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    iget-object v1, p0, Ll/ᩳۘ֡;->֫:Ll/ۖ᩹ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", idleSoftEvictDuration="

    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    iget-object v1, p0, Ll/ᩳۘ֡;->ۧ:Ll/ۖ᩹ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", minIdle="

    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    iget v1, p0, Ll/ᩳۘ֡;->ܽ:I

    const-string v2, "]"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ᩳۘ֡;->֫:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ۧ()Ll/ۖ᩹ᩴ;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ᩳۘ֡;->ۧ:Ll/ۖ᩹ᩴ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 180
    iget v0, p0, Ll/ᩳۘ֡;->ܽ:I

    return v0
.end method
