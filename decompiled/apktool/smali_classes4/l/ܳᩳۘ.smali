.class public final Ll/ܳᩳۘ;
.super Ljava/lang/Object;
.source "H9F9"

# interfaces
.implements Ll/ܰܰۖ;


# instance fields
.field public final synthetic ֫:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ܳᩳۘ;->֫:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 6

    .line 142
    check-cast p1, Ll/ᩴ᩺ۖ;

    .line 145
    invoke-virtual {p1}, Ll/ᩴ᩺ۖ;->ۜ()I

    move-result p1

    int-to-long v0, p1

    .line 146
    iget-wide v2, p0, Ll/ܳᩳۘ;->֫:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    .line 147
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 149
    :cond_0
    new-instance p1, Ll/ۧۧۘ;

    const-string v4, "Possible remote file corruption detected, server wrote less bytes ("

    const-string v5, ") in async mode than we sent ("

    .line 0
    invoke-static {v4, v5, v0, v1}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")."

    invoke-static {v0, v2, v3, v1}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 149
    throw p1
.end method
