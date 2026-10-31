.class public final Ll/۠֫ܽ;
.super Ll/᩹֫ܽ;
.source "XAPG"


# instance fields
.field public final ֫:Ll/۫֫ܽ;

.field public final ۧ:Ll/֡֫ܽ;

.field public final ܳ:Ll/᩸֫ܽ;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ll/֡֫ܽ;Ll/᩸֫ܽ;)V
    .locals 2

    const-string v0, "value"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    .line 12
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    .line 17
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verificationMode"

    .line 23
    invoke-static {p5, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-direct {p0}, Ll/᩹֫ܽ;-><init>()V

    .line 145
    iput-object p1, p0, Ll/۠֫ܽ;->ܿ:Ljava/lang/Object;

    .line 146
    iput-object p2, p0, Ll/۠֫ܽ;->ᩳ:Ljava/lang/String;

    .line 147
    iput-object p3, p0, Ll/۠֫ܽ;->ܽ:Ljava/lang/String;

    .line 148
    iput-object p4, p0, Ll/۠֫ܽ;->ۧ:Ll/֡֫ܽ;

    .line 149
    iput-object p5, p0, Ll/۠֫ܽ;->ܳ:Ll/᩸֫ܽ;

    .line 153
    new-instance p2, Ll/۫֫ܽ;

    invoke-static {p1, p3}, Ll/᩹֫ܽ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "message"

    .line 0
    invoke-static {p1, p3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    const-string p3, "stackTrace"

    invoke-static {p1, p3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3437
    array-length p3, p1

    add-int/lit8 p3, p3, -0x2

    const/4 p4, 0x0

    if-gez p3, :cond_0

    const/4 p3, 0x0

    :cond_0
    if-ltz p3, :cond_6

    if-nez p3, :cond_1

    .line 154
    sget-object p1, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    goto :goto_1

    .line 5143
    :cond_1
    array-length p5, p1

    if-lt p3, p5, :cond_2

    .line 5144
    invoke-static {p1}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    sub-int/2addr p5, v0

    .line 5145
    aget-object p1, p1, p5

    invoke-static {p1}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 5146
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(I)V

    sub-int p3, p5, p3

    :goto_0
    if-ge p3, p5, :cond_4

    .line 5148
    aget-object v1, p1, p3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_4
    move-object p1, v0

    :goto_1
    new-array p3, p4, [Ljava/lang/StackTraceElement;

    .line 38
    invoke-interface {p1, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, [Ljava/lang/StackTraceElement;

    .line 154
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 153
    iput-object p2, p0, Ll/۠֫ܽ;->֫:Ll/۫֫ܽ;

    return-void

    .line 38
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const-string p1, "Requested element count "

    const-string p2, " is less than zero."

    .line 0
    invoke-static {p3, p1, p2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5141
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 4

    .line 162
    sget-object v0, Ll/֨֫ܽ;->֫:[I

    iget-object v1, p0, Ll/۠֫ܽ;->ܳ:Ll/᩸֫ܽ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    return-object v2

    .line 168
    :cond_0
    new-instance v0, Ll/ۡ۠᩵;

    .line 9
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 168
    throw v0

    .line 165
    :cond_1
    iget-object v0, p0, Ll/۠֫ܽ;->ܿ:Ljava/lang/Object;

    iget-object v1, p0, Ll/۠֫ܽ;->ܽ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩹֫ܽ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۠֫ܽ;->ۧ:Ll/֡֫ܽ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "tag"

    .line 0
    iget-object v3, p0, Ll/۠֫ܽ;->ᩳ:Ljava/lang/String;

    invoke-static {v3, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "message"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    .line 163
    :cond_2
    iget-object v0, p0, Ll/۠֫ܽ;->֫:Ll/۫֫ܽ;

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ܺ᩹᩵;)Ll/᩹֫ܽ;
    .locals 0

    return-object p0
.end method
