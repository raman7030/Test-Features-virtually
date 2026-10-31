.class public final Ll/ܶܽܳ;
.super Ll/ۧᩳܳ;
.source "970R"


# static fields
.field public static final ֫:Ll/ܶܽܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1277
    new-instance v0, Ll/ܶܽܳ;

    .line 1280
    invoke-direct {v0}, Ll/ۧᩳܳ;-><init>()V

    .line 1277
    sput-object v0, Ll/ܶܽܳ;->֫:Ll/ܶܽܳ;

    return-void
.end method

.method public static bridge synthetic ᩳ()Ll/ܶܽܳ;
    .locals 1

    .line 0
    sget-object v0, Ll/ܶܽܳ;->֫:Ll/ܶܽܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫(II)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ֫(IILl/᩸ܽܳ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/io/DataOutputStream;I)V
    .locals 0

    .line 1316
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Empty start index"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([BIIBI)V
    .locals 0

    return-void
.end method

.method public final ֫(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۧᩳܳ;)Z
    .locals 0

    .line 1296
    invoke-virtual {p1}, Ll/ۧᩳܳ;->ܽ()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 1290
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Empty start index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(I)I
    .locals 1

    .line 1287
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Empty start index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
