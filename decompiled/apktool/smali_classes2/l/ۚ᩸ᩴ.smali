.class public final synthetic Ll/ۚ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/DirectoryStream;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/ۚ᩸ᩴ;->a:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩸ᩴ;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܳ᩸ᩴ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/ۚ᩸ᩴ;->a:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩸ᩴ;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Ll/ۚ᩸ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    iget-object v0, p0, Ll/ۚ᩸ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/ܳ᩸ᩴ;

    invoke-virtual {v0}, Ll/ܳ᩸ᩴ;->close()V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۚ᩸ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/file/DirectoryStream;

    sget-object v1, Ll/ܿ۠ᩴ;->a:Ljava/util/Set;

    .line 109
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 111
    new-instance v1, Ljava/io/UncheckedIOException;

    invoke-direct {v1, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
