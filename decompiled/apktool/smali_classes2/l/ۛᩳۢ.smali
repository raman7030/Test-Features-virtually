.class public final Ll/ۛᩳۢ;
.super Ljava/lang/Object;
.source "U8G3"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Z

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Ll/ۛᩳۢ;->ᩳ:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 99
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5b

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 102
    :cond_0
    iput v1, p0, Ll/ۛᩳۢ;->֫:I

    .line 103
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "Z"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v2, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "V"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x7

    goto :goto_1

    :sswitch_2
    const-string v1, "S"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x6

    goto :goto_1

    :sswitch_3
    const-string v1, "J"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x5

    goto :goto_1

    :sswitch_4
    const-string v1, "I"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x4

    goto :goto_1

    :sswitch_5
    const-string v1, "F"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_6
    const-string v1, "D"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_7
    const-string v1, "C"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_8
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_8
    const-string v1, "B"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_1

    :cond_9
    const/4 v2, 0x0

    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 116
    invoke-static {p1}, Ll/ۨᩳۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :pswitch_0
    const-string p1, "boolean"

    goto :goto_3

    :pswitch_1
    const-string p1, "void"

    goto :goto_3

    :pswitch_2
    const-string p1, "short"

    goto :goto_3

    :pswitch_3
    const-string p1, "long"

    goto :goto_3

    :pswitch_4
    const-string p1, "int"

    goto :goto_3

    :pswitch_5
    const-string p1, "float"

    goto :goto_3

    :pswitch_6
    const-string p1, "double"

    goto :goto_3

    :pswitch_7
    const-string p1, "char"

    goto :goto_3

    :pswitch_8
    const-string p1, "byte"

    goto :goto_3

    .line 118
    :goto_2
    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    const/4 v0, 0x1

    .line 124
    :catch_0
    iput-object p1, p0, Ll/ۛᩳۢ;->ۧ:Ljava/lang/String;

    .line 125
    iput-boolean v0, p0, Ll/ۛᩳۢ;->ܽ:Z

    return-void

    :sswitch_data_0
    .sparse-switch
        0x42 -> :sswitch_8
        0x43 -> :sswitch_7
        0x44 -> :sswitch_6
        0x46 -> :sswitch_5
        0x49 -> :sswitch_4
        0x4a -> :sswitch_3
        0x53 -> :sswitch_2
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
