.class public final Ll/ۨ۠ۖ;
.super Ljava/lang/Object;
.source "461A"


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 26
    iput v0, p0, Ll/ۨ۠ۖ;->֫:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p1, p0, Ll/ۨ۠ۖ;->֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 47
    iget v2, p0, Ll/ۨ۠ۖ;->֫:I

    if-ltz v2, :cond_0

    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v0

    const-string v0, "L%04x"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v0

    const-string v0, "L%08x"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
