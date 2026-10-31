.class public final enum Ll/֨۟᩵;
.super Ljava/lang/Enum;
.source "94CO"


# static fields
.field public static final enum ۗ:Ll/֨۟᩵;

.field public static final enum ۙ:Ll/֨۟᩵;

.field public static final enum ۫:Ll/֨۟᩵;

.field public static final enum ۬:Ll/֨۟᩵;

.field public static final enum ᩶:Ll/֨۟᩵;

.field public static final synthetic ᩹:[Ll/֨۟᩵;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    .line 27
    new-instance v0, Ll/֨۟᩵;

    const-string v1, "TLSv1.3"

    const-string v2, "TLS_1_3"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ll/֨۟᩵;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/֨۟᩵;->۫:Ll/֨۟᩵;

    .line 28
    new-instance v1, Ll/֨۟᩵;

    const-string v2, "TLSv1.2"

    const-string v4, "TLS_1_2"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Ll/֨۟᩵;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ll/֨۟᩵;->۬:Ll/֨۟᩵;

    .line 29
    new-instance v2, Ll/֨۟᩵;

    const-string v4, "TLSv1.1"

    const-string v6, "TLS_1_1"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Ll/֨۟᩵;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ll/֨۟᩵;->ۗ:Ll/֨۟᩵;

    .line 30
    new-instance v4, Ll/֨۟᩵;

    const-string v6, "TLSv1"

    const-string v8, "TLS_1_0"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Ll/֨۟᩵;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Ll/֨۟᩵;->ۙ:Ll/֨۟᩵;

    .line 31
    new-instance v6, Ll/֨۟᩵;

    const-string v8, "SSLv3"

    const-string v10, "SSL_3_0"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Ll/֨۟᩵;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Ll/֨۟᩵;->᩶:Ll/֨۟᩵;

    const/4 v8, 0x5

    new-array v8, v8, [Ll/֨۟᩵;

    aput-object v0, v8, v3

    aput-object v1, v8, v5

    aput-object v2, v8, v7

    aput-object v4, v8, v9

    aput-object v6, v8, v11

    .line 26
    sput-object v8, Ll/֨۟᩵;->᩹:[Ll/֨۟᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput-object p3, p0, Ll/֨۟᩵;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/֨۟᩵;
    .locals 1

    .line 26
    const-class v0, Ll/֨۟᩵;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/֨۟᩵;

    return-object p0
.end method

.method public static values()[Ll/֨۟᩵;
    .locals 1

    .line 26
    sget-object v0, Ll/֨۟᩵;->᩹:[Ll/֨۟᩵;

    invoke-virtual {v0}, [Ll/֨۟᩵;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֨۟᩵;

    return-object v0
.end method

.method public static varargs ֫([Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 59
    invoke-static {v3}, Ll/֨۟᩵;->֫(Ljava/lang/String;)Ll/֨۟᩵;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 61
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/֨۟᩵;
    .locals 2

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "TLSv1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "SSLv3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "TLSv1.3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "TLSv1.2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "TLSv1.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected TLS version: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :pswitch_0
    sget-object p0, Ll/֨۟᩵;->ۙ:Ll/֨۟᩵;

    return-object p0

    .line 51
    :pswitch_1
    sget-object p0, Ll/֨۟᩵;->᩶:Ll/֨۟᩵;

    return-object p0

    .line 43
    :pswitch_2
    sget-object p0, Ll/֨۟᩵;->۫:Ll/֨۟᩵;

    return-object p0

    .line 45
    :pswitch_3
    sget-object p0, Ll/֨۟᩵;->۬:Ll/֨۟᩵;

    return-object p0

    .line 47
    :pswitch_4
    sget-object p0, Ll/֨۟᩵;->ۗ:Ll/֨۟᩵;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x1dfc3f27 -> :sswitch_4
        -0x1dfc3f26 -> :sswitch_3
        -0x1dfc3f25 -> :sswitch_2
        0x4b88569 -> :sswitch_1
        0x4c38896 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/֨۟᩵;->᩸:Ljava/lang/String;

    return-object v0
.end method
