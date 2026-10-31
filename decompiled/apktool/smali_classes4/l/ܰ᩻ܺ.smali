.class public final Ll/ܰ᩻ܺ;
.super Ll/ۗۜܺ;
.source "F5QL"


# instance fields
.field public final ۗ:Ll/᩶ܿܺ;

.field public final ۤ:Ll/᩹ܺܺ;

.field public final ۫:Z

.field public ۬:[B


# direct methods
.method public constructor <init>(Ll/᩶ܿܺ;ZLl/᩹ܺܺ;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 49
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p1, :cond_0

    .line 55
    iput-object p1, p0, Ll/ܰ᩻ܺ;->ۗ:Ll/᩶ܿܺ;

    .line 56
    iput-boolean p2, p0, Ll/ܰ᩻ܺ;->۫:Z

    .line 57
    iput-object p3, p0, Ll/ܰ᩻ܺ;->ۤ:Ll/᩹ܺܺ;

    return-void

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "code == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/֫ۜܺ;Ljava/lang/String;Ll/ᩳᩴܺ;Z)[B
    .locals 9

    .line 187
    iget-object v0, p0, Ll/ܰ᩻ܺ;->ۗ:Ll/᩶ܿܺ;

    invoke-virtual {v0}, Ll/᩶ܿܺ;->ܳ()Ll/᩷ܳܺ;

    move-result-object v2

    .line 188
    invoke-virtual {v0}, Ll/᩶ܿܺ;->ܿ()Ll/֫ܳܺ;

    move-result-object v3

    .line 189
    invoke-virtual {v0}, Ll/᩶ܿܺ;->ᩳ()Ll/ۗܿܺ;

    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ll/ۗܿܺ;->֨()I

    move-result v5

    .line 191
    invoke-virtual {v0}, Ll/ۗܿܺ;->ܶ()I

    move-result v6

    .line 193
    new-instance v0, Ll/᩺᩻ܺ;

    iget-boolean v7, p0, Ll/ܰ᩻ܺ;->۫:Z

    iget-object v8, p0, Ll/ܰ᩻ܺ;->ۤ:Ll/᩹ܺܺ;

    move-object v1, v0

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Ll/᩺᩻ܺ;-><init>(Ll/᩷ܳܺ;Ll/֫ܳܺ;Ll/֫ۜܺ;IIZLl/᩹ܺܺ;)V

    if-nez p3, :cond_0

    .line 200
    invoke-virtual {v0}, Ll/᩺᩻ܺ;->֫()[B

    move-result-object p1

    return-object p1

    .line 202
    :cond_0
    invoke-virtual {v0, p2, p3, p4}, Ll/᩺᩻ܺ;->֫(Ljava/lang/String;Ll/ۛۘܺ;Z)[B

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 65
    sget-object v0, Ll/ۘۜܺ;->֫֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 0

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 2

    .line 97
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 2

    .line 129
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " debug info"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 136
    invoke-direct {p0, p1, v0, p2, v1}, Ll/ܰ᩻ܺ;->֫(Ll/֫ۜܺ;Ljava/lang/String;Ll/ᩳᩴܺ;Z)[B

    .line 139
    :cond_0
    iget-object p1, p0, Ll/ܰ᩻ܺ;->۬:[B

    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->֫([B)V

    return-void
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 1

    .line 84
    :try_start_0
    invoke-virtual {p1}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0, p2}, Ll/ܰ᩻ܺ;->֫(Ll/֫ۜܺ;Ljava/lang/String;Ll/ᩳᩴܺ;Z)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܰ᩻ܺ;->۬:[B

    .line 85
    array-length p1, p1

    invoke-virtual {p0, p1}, Ll/ۗۜܺ;->֫(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 87
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "...while placing debug info for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ܰ᩻ܺ;->ۤ:Ll/᩹ܺܺ;

    .line 88
    invoke-virtual {v0}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 87
    invoke-static {p2, p1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object p1

    throw p1
.end method

.method public final ܽ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 2

    const-string v0, "    "

    const/4 v1, 0x0

    .line 111
    invoke-direct {p0, p1, v0, p2, v1}, Ll/ܰ᩻ܺ;->֫(Ll/֫ۜܺ;Ljava/lang/String;Ll/ᩳᩴܺ;Z)[B

    return-void
.end method
