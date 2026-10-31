.class public final Ll/ᩳ᩸۠;
.super Ljava/lang/Object;
.source "B3ZP"


# instance fields
.field public final ֫:Ll/ܽܶ۠;


# direct methods
.method public constructor <init>(Ll/ܽܶ۠;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/ᩳ᩸۠;->֫:Ll/ܽܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫᩵۠;)Ljava/lang/String;
    .locals 6

    .line 76
    iget-object v0, p0, Ll/ᩳ᩸۠;->֫:Ll/ܽܶ۠;

    invoke-virtual {v0}, Ll/ܽܶ۠;->ܿ()Ll/ܳ۠۠;

    move-result-object v1

    .line 77
    invoke-virtual {v0}, Ll/ܽܶ۠;->getLineNumber()J

    move-result-wide v2

    .line 78
    iget v0, p1, Ll/ۚۚ۠;->᩸:I

    invoke-virtual {v1, v0}, Ll/ܳ۠۠;->ۧ(I)I

    move-result v0

    int-to-long v4, v0

    .line 79
    iget p1, p1, Ll/ۚۚ۠;->᩸:I

    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0}, Ll/ܳ۠۠;->֫(IZ)I

    move-result p1

    int-to-long v0, p1

    cmp-long p1, v4, v2

    if-nez p1, :cond_0

    .line 81
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
