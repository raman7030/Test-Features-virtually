.class public abstract Ll/᩺ۘۧ;
.super Ll/ۗ᩸֫;
.source "E8J1"

# interfaces
.implements Ll/۟ۘۧ;


# instance fields
.field public final ᩴ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Ll/ᩳᩴۧ;

    new-array v0, v0, [Ll/ܿᩴۧ;

    .line 37
    invoke-direct {p0, v1, v0}, Ll/ۗ᩸֫;-><init>([Ll/᩸᩸֫;[Ll/᩶᩸֫;)V

    .line 38
    iput-object p1, p0, Ll/᩺ۘۧ;->ᩴ:Ljava/lang/String;

    const/16 p1, 0x400

    .line 39
    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩺ۘۧ;Ll/᩶᩸֫;)V
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(Ll/᩶᩸֫;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/᩺ۘۧ;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)Ll/۠᩸֫;
    .locals 2

    .line 69
    new-instance v0, Ll/֫ᩴۧ;

    const-string v1, "Unexpected decode error"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final ֫(Ll/᩸᩸֫;Ll/᩶᩸֫;Z)Ll/۠᩸֫;
    .locals 6

    .line 25
    check-cast p1, Ll/ᩳᩴۧ;

    check-cast p2, Ll/ܿᩴۧ;

    .line 78
    :try_start_0
    iget-object v0, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Ll/᩺ۘۧ;->֫([BIZ)Ll/ܰۘۧ;

    move-result-object v3

    .line 80
    iget-wide v1, p1, Ll/᩸᩸֫;->ۤ:J

    iget-wide v4, p1, Ll/ᩳᩴۧ;->ۨ:J

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Ll/ܿᩴۧ;->֫(JLl/ܰۘۧ;J)V

    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p2, Ll/᩶᩸֫;->᩹:Z
    :try_end_0
    .catch Ll/֫ᩴۧ; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public abstract ֫([BIZ)Ll/ܰۘۧ;
.end method

.method public final ֫(J)V
    .locals 0

    return-void
.end method

.method public final ܿ()Ll/᩶᩸֫;
    .locals 1

    .line 59
    new-instance v0, Ll/ۨۘۧ;

    invoke-direct {v0, p0}, Ll/ۨۘۧ;-><init>(Ll/᩺ۘۧ;)V

    return-object v0
.end method

.method public final ᩳ()Ll/᩸᩸֫;
    .locals 1

    .line 54
    new-instance v0, Ll/ᩳᩴۧ;

    invoke-direct {v0}, Ll/ᩳᩴۧ;-><init>()V

    return-object v0
.end method
