.class public Ll/֡᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 186
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 4

    .line 189
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 190
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 196
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩹()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v1, 0xff

    if-gt v0, v1, :cond_1

    const/16 v1, -0x80

    if-lt v0, v1, :cond_1

    int-to-byte p1, v0

    .line 205
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    .line 202
    :cond_1
    new-instance v1, Ll/ܳᩳۖ;

    const-string v2, "Lossy conversion from "

    const-string v3, " to byte; at path "

    .line 0
    invoke-static {v0, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 203
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 203
    throw v1

    :catch_0
    move-exception p1

    .line 198
    new-instance v0, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 198
    throw v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 186
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_0

    .line 211
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 213
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    return-void
.end method
