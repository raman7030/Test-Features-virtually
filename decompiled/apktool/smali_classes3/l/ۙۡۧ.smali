.class public final Ll/ۙۡۧ;
.super Ll/ܶۡۧ;
.source "N8QS"


# direct methods
.method public static ֫(Ll/ᩳ֨֫;)Ll/᩶ۡۧ;
    .locals 8

    .line 38
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v3

    .line 41
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v5

    .line 43
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v7

    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܿ()I

    move-result p0

    invoke-static {v0, v7, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    .line 44
    new-instance p0, Ll/᩶ۡۧ;

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Ll/᩶ۡۧ;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۠ۡۧ;Ljava/nio/ByteBuffer;)Ll/᩻᩵֫;
    .locals 2

    .line 34
    new-instance p1, Ll/᩻᩵֫;

    new-instance v0, Ll/ᩳ֨֫;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    invoke-direct {v0, v1, p2}, Ll/ᩳ֨֫;-><init>([BI)V

    invoke-static {v0}, Ll/ۙۡۧ;->֫(Ll/ᩳ֨֫;)Ll/᩶ۡۧ;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܳ᩵֫;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-direct {p1, v0}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    return-object p1
.end method
