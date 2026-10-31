.class public final Ll/᩹᩶ܿ;
.super Ljava/lang/Object;
.source "N17O"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[B

.field public static ܳ:Ljava/util/function/Function;

.field public static ܽ:Ljava/util/Set;

.field public static ܿ:Ll/֡᩶ܿ;

.field public static final ᩳ:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩹᩶ܿ;->ܽ:Ljava/util/Set;

    .line 61
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sput-object v0, Ll/᩹᩶ܿ;->ᩳ:Ljava/nio/charset/Charset;

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 62
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹᩶ܿ;->ۧ:[B

    return-void

    :array_0
    .array-data 1
        0x4dt
        0x54t
        0x49t
        0x4ft
    .end array-data
.end method

.method public static ֫(Ljava/lang/Throwable;)V
    .locals 2

    .line 103
    instance-of v0, p0, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p0, v0

    .line 109
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Ljava/util/function/Function;)V
    .locals 0

    .line 1838
    sput-object p0, Ll/᩹᩶ܿ;->ܳ:Ljava/util/function/Function;

    return-void
.end method

.method public static ֫(Ll/֡᩶ܿ;)V
    .locals 0

    .line 124
    sput-object p0, Ll/᩹᩶ܿ;->ܿ:Ll/֡᩶ܿ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 4

    .line 1850
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "rwt"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "wt"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "wa"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "rw"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "w"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "r"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_6
    const-string v0, "a"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 1864
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Mode: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    return v2

    :pswitch_1
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x61 -> :sswitch_6
        0x72 -> :sswitch_5
        0x77 -> :sswitch_4
        0xe45 -> :sswitch_3
        0xeca -> :sswitch_2
        0xedd -> :sswitch_1
        0x1bacf -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static bridge synthetic ֫()[B
    .locals 1

    .line 0
    sget-object v0, Ll/᩹᩶ܿ;->ۧ:[B

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)B
    .locals 7

    .line 1850
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "rwt"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "wt"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "wa"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "rw"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "w"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "r"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_6
    const-string v0, "a"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v6, 0x0

    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 1864
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Mode: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    return v1

    :pswitch_1
    return v2

    :pswitch_2
    return v4

    :pswitch_3
    return v5

    :pswitch_4
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x61 -> :sswitch_6
        0x72 -> :sswitch_5
        0x77 -> :sswitch_4
        0xe45 -> :sswitch_3
        0xeca -> :sswitch_2
        0xedd -> :sswitch_1
        0x1bacf -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ۧ()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹᩶ܿ;->ܽ:Ljava/util/Set;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1842
    sget-object v0, Ll/᩹᩶ܿ;->ܳ:Ljava/util/function/Function;

    if-eqz v0, :cond_0

    .line 1844
    invoke-interface {v0, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method public static bridge synthetic ܽ()Ljava/nio/charset/Charset;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹᩶ܿ;->ᩳ:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static ܿ()Z
    .locals 1

    .line 120
    sget-object v0, Ll/᩹᩶ܿ;->ܿ:Ll/֡᩶ܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩳ()Ll/֡᩶ܿ;
    .locals 1

    .line 113
    sget-object v0, Ll/᩹᩶ܿ;->ܿ:Ll/֡᩶ܿ;

    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    sget-object v0, Ll/᩹᩶ܿ;->ܿ:Ll/֡᩶ܿ;

    return-object v0
.end method
