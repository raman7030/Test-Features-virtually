.class public final Ll/᩺۠᩵;
.super Ll/۟۠᩵;


# direct methods
.method public static ֫([Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 10277
    array-length v0, p0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 10376
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    new-instance v1, Ll/ۛ۠᩵;

    invoke-direct {v1, p0}, Ll/ۛ۠᩵;-><init>([Ljava/lang/Object;)V

    .line 10376
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 10279
    aget-object p0, p0, v0

    invoke-static {p0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 10278
    :cond_1
    sget-object p0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    return-object p0
.end method

.method public static ֫([Ljava/lang/Object;Ll/ܶۛ᩵;II)V
    .locals 1

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1555
    invoke-static {p0, p2, p3, p1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic ֫([Ljava/lang/Object;[Ljava/lang/Object;IIII)V
    .locals 1

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 924
    array-length p4, p0

    :cond_2
    invoke-static {p2, p3, p4, p0, p1}, Ll/ܰ۠᩵;->֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method
