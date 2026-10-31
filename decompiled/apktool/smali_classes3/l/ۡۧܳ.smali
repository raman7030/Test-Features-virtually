.class public final Ll/ۡۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/ܺܽܳ;

.field public final ۙ:J

.field public final synthetic ۬:Ll/ᩳܽܳ;

.field public final ᩶:Z

.field public final ᩸:Ll/ᩴܽܳ;

.field public final ᩹:Ll/ᩴܽܳ;


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;Ll/ᩴܽܳ;Ll/ᩴܽܳ;Ll/ܺܽܳ;ZJ)V
    .locals 0

    .line 5071
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۧܳ;->۬:Ll/ᩳܽܳ;

    .line 5072
    iput-object p2, p0, Ll/ۡۧܳ;->᩹:Ll/ᩴܽܳ;

    .line 5073
    iput-object p3, p0, Ll/ۡۧܳ;->᩸:Ll/ᩴܽܳ;

    .line 5074
    iput-object p4, p0, Ll/ۡۧܳ;->ۗ:Ll/ܺܽܳ;

    .line 5075
    iput-boolean p5, p0, Ll/ۡۧܳ;->᩶:Z

    .line 5076
    iput-wide p6, p0, Ll/ۡۧܳ;->ۙ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡۧܳ;)Ll/ᩴܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۧܳ;->᩹:Ll/ᩴܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡۧܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡۧܳ;->ۙ:J

    return-wide v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 5102
    :try_start_0
    iget-object v0, p0, Ll/ۡۧܳ;->ۗ:Ll/ܺܽܳ;

    invoke-virtual {v0}, Ll/ܺܽܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5107
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/ۡۧܳ;->᩸:Ll/ᩴܽܳ;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_1

    .line 5112
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    if-nez v0, :cond_1

    return-void

    .line 5116
    :cond_1
    throw v0
.end method

.method public final ֫()J
    .locals 2

    .line 5081
    iget-object v0, p0, Ll/ۡۧܳ;->ۗ:Ll/ܺܽܳ;

    invoke-virtual {v0}, Ll/ܺܽܳ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Ljava/io/DataOutputStream;)V
    .locals 3

    .line 5089
    iget-object v0, p0, Ll/ۡۧܳ;->ۗ:Ll/ܺܽܳ;

    invoke-virtual {v0}, Ll/ܺܽܳ;->ᩳ()V

    .line 5090
    iget-object v1, p0, Ll/ۡۧܳ;->᩹:Ll/ᩴܽܳ;

    iget-boolean v2, p0, Ll/ۡۧܳ;->᩶:Z

    invoke-static {p1, v1, v0, v2}, Ll/ᩳܽܳ;->֫(Ljava/io/DataOutputStream;Ll/ᩴܽܳ;Ll/ܺܽܳ;Z)V

    .line 5091
    invoke-virtual {v0}, Ll/ܺܽܳ;->ᩳ()V

    .line 5092
    iget-object p1, p0, Ll/ۡۧܳ;->۬:Ll/ᩳܽܳ;

    invoke-static {p1, p0}, Ll/ᩳܽܳ;->֫(Ll/ᩳܽܳ;Ll/ۡۧܳ;)V

    return-void
.end method
