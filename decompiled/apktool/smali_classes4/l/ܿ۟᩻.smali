.class public final Ll/ܿ۟᩻;
.super Ljava/io/IOException;
.source "P77N"


# instance fields
.field public final ᩸:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1

    .line 5709
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5710
    iput-object p1, p0, Ll/ܿ۟᩻;->᩸:Ljava/io/IOException;

    return-void
.end method
