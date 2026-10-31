.class public final Ll/ۖ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:J

.field public ܿ:Ljava/lang/String;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 502
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 488
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, "x86"

    const-string v5, "x86_64"

    const/4 v6, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "arm64-v8a"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x3

    goto :goto_0

    :sswitch_1
    const-string v3, "armeabi-v7a"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 498
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported architecture: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v0, v0, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    const-string v4, "arm64"

    goto :goto_1

    :pswitch_1
    const-string v4, "arm"

    goto :goto_1

    :pswitch_2
    move-object v4, v5

    .line 507
    :goto_1
    :pswitch_3
    iput-object v4, p0, Ll/ۖ᩸ۢ;->֫:Ljava/lang/String;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x300b59d9 -> :sswitch_3
        0x1c976 -> :sswitch_2
        0x8ab4d72 -> :sswitch_1
        0x5553f3ec -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
