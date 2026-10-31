.class public Ll/ۡ֡;
.super Ljava/lang/Object;
.source "21AZ"


# static fields
.field public static ۧ:[Ljava/lang/String;

.field public static ܽ:Ll/ۡ֡;


# instance fields
.field public ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 29
    new-instance v0, Ll/ۡ֡;

    invoke-direct {v0}, Ll/ۡ֡;-><init>()V

    sput-object v0, Ll/ۡ֡;->ܽ:Ll/ۡ֡;

    const-string v0, "decelerate"

    const-string v1, "linear"

    const-string v2, "standard"

    const-string v3, "accelerate"

    .line 40
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۡ֡;->ۧ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "identity"

    .line 30
    iput-object v0, p0, Ll/ۡ֡;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۡ֡;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "cubic"

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    new-instance v0, Ll/ۢ֡;

    invoke-direct {v0, p0}, Ll/ۢ֡;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 49
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "standard"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "linear"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "decelerate"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "accelerate"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 59
    sget-object p0, Ll/ۡ֡;->ۧ:[Ljava/lang/String;

    .line 61
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    sget-object p0, Ll/ۡ֡;->ܽ:Ll/ۡ֡;

    return-object p0

    .line 51
    :pswitch_0
    new-instance p0, Ll/ۢ֡;

    const-string v0, "cubic(0.4, 0.0, 0.2, 1)"

    invoke-direct {p0, v0}, Ll/ۢ֡;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 57
    :pswitch_1
    new-instance p0, Ll/ۢ֡;

    const-string v0, "cubic(1, 1, 0, 0)"

    invoke-direct {p0, v0}, Ll/ۢ֡;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 55
    :pswitch_2
    new-instance p0, Ll/ۢ֡;

    const-string v0, "cubic(0.0, 0.0, 0.2, 0.95)"

    invoke-direct {p0, v0}, Ll/ۢ֡;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 53
    :pswitch_3
    new-instance p0, Ll/ۢ֡;

    const-string v0, "cubic(0.4, 0.05, 0.8, 0.7)"

    invoke-direct {p0, v0}, Ll/ۢ֡;-><init>(Ljava/lang/String;)V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x50bb8523 -> :sswitch_3
        -0x4b5653c4 -> :sswitch_2
        -0x41b970db -> :sswitch_1
        0x4e3d1ebd -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۡ֡;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public ֫(D)D
    .locals 0

    return-wide p1
.end method

.method public ۧ(D)D
    .locals 0

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    return-wide p1
.end method
