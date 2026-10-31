.class public final synthetic Ll/ܰ᩵ܿ;
.super Ljava/lang/Object;
.source "D18B"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܰ᩵ܿ;->֫:I

    iput-object p2, p0, Ll/ܰ᩵ܿ;->ۧ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ܰ᩵ܿ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܰ᩵ܿ;->ۧ:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܰܳᩳ;

    .line 663
    invoke-static {v0}, Ll/ᩳ᩻ᩳ;->֫(Ll/ܰܳᩳ;)V

    const/4 v0, 0x0

    return-object v0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܰ᩵ܿ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/᩵᩶ܿ;

    invoke-static {v0}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll/ܰ᩵ܿ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/۬۠ܿ;

    .line 245
    :try_start_0
    invoke-virtual {v0}, Ll/۬۠ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    :try_start_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 245
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 248
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
